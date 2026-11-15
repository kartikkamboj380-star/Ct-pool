package y0;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: y0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2236e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f22889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f22891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f22892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f22893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f22894f;

    public C2236e(String str, String str2, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f22890b = str;
        this.f22891c = Uri.parse(str);
        this.f22893e = str2;
        this.f22894f = bool;
        this.f22889a = reactApplicationContext;
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String b(Uri uri) {
        return AbstractC2235d.d(this.f22889a, uri, this.f22894f);
    }

    private boolean e() {
        if (this.f22891c.getScheme() == null || !this.f22891c.getScheme().equals("data")) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (char c7 : this.f22891c.toString().substring(5).toCharArray()) {
            if (c7 == ';') {
                break;
            }
            sb.append(c7);
        }
        this.f22892d = sb.toString();
        return true;
    }

    private boolean g() {
        if (this.f22891c.getScheme() == null || !(this.f22891c.getScheme().equals("content") || this.f22891c.getScheme().equals("file"))) {
            return false;
        }
        if (this.f22892d != null) {
            return true;
        }
        String strA = a(this.f22891c.toString());
        this.f22892d = strA;
        if (strA == null) {
            String strB = b(this.f22891c);
            if (strB == null) {
                return false;
            }
            this.f22892d = a(strB);
        }
        if (this.f22892d == null) {
            this.f22892d = "*/*";
        }
        return true;
    }

    public String c() {
        String str = this.f22892d;
        return str == null ? "*/*" : str;
    }

    public Uri d() {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(c());
        if (e()) {
            String strSubstring = this.f22891c.toString().substring(this.f22892d.length() + 13);
            String str = this.f22893e;
            if (str == null) {
                str = System.nanoTime() + "";
            }
            try {
                File file = new File(this.f22894f.booleanValue() ? this.f22889a.getCacheDir() : this.f22889a.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                }
                File file2 = new File(file, str + "." + extensionFromMimeType);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(Base64.decode(strSubstring, 0));
                fileOutputStream.flush();
                fileOutputStream.close();
                return AbstractC2235d.a(this.f22889a, file2);
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        } else if (g()) {
            Uri uri = Uri.parse(this.f22890b);
            if (uri.getPath() == null) {
                return null;
            }
            return AbstractC2235d.a(this.f22889a, new File(uri.getPath()));
        }
        return null;
    }

    public boolean f() {
        return e() || g();
    }

    public C2236e(String str, String str2, String str3, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(str, str3, bool, reactApplicationContext);
        this.f22892d = str2;
    }
}
