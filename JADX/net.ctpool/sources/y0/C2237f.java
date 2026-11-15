package y0;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: y0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2237f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactApplicationContext f22895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f22896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList f22897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f22898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f22899e;

    public C2237f(ReadableArray readableArray, ArrayList arrayList, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f22896b = new ArrayList();
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            String string = readableArray.getString(i7);
            if (string != null) {
                this.f22896b.add(Uri.parse(string));
            }
        }
        this.f22897c = arrayList;
        this.f22899e = bool;
        this.f22895a = reactApplicationContext;
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String b(Uri uri) {
        return AbstractC2235d.d(this.f22895a, uri, this.f22899e);
    }

    private boolean e(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals("data")) {
            return false;
        }
        String strSubstring = uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";"));
        String str = this.f22898d;
        if (str != null) {
            if (!str.equalsIgnoreCase(strSubstring) && this.f22898d.split("/")[0].equalsIgnoreCase(strSubstring.split("/")[0])) {
                strSubstring = this.f22898d.split("/")[0].concat("/*");
            } else {
                if (this.f22898d.equalsIgnoreCase(strSubstring)) {
                    return true;
                }
                strSubstring = "*/*";
            }
        }
        this.f22898d = strSubstring;
        return true;
    }

    private boolean g(Uri uri) {
        if ((uri.getScheme() == null || !uri.getScheme().equals("content")) && !"file".equals(uri.getScheme())) {
            return false;
        }
        String strA = a(uri.toString());
        if (strA == null) {
            strA = a(b(uri));
        }
        String strConcat = "*/*";
        if (strA == null) {
            strA = "*/*";
        }
        String str = this.f22898d;
        if (str == null) {
            this.f22898d = strA;
            return true;
        }
        if (!str.equalsIgnoreCase(strA) && this.f22898d.split("/")[0].equalsIgnoreCase(strA.split("/")[0])) {
            strConcat = this.f22898d.split("/")[0].concat("/*");
        } else if (this.f22898d.equalsIgnoreCase(strA)) {
            return true;
        }
        this.f22898d = strConcat;
        return true;
    }

    public String c() {
        String str = this.f22898d;
        return str == null ? "*/*" : str;
    }

    public ArrayList d() {
        ReactApplicationContext reactApplicationContext;
        File file;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < this.f22896b.size(); i7++) {
            Uri uri = (Uri) this.f22896b.get(i7);
            if (e(uri)) {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";")));
                String strSubstring = uri.getSchemeSpecificPart().substring(uri.getSchemeSpecificPart().indexOf(";base64,") + 8);
                String str = this.f22897c.size() >= i7 + 1 ? (String) this.f22897c.get(i7) : System.currentTimeMillis() + "." + extensionFromMimeType;
                try {
                    File file2 = new File(this.f22899e.booleanValue() ? this.f22895a.getCacheDir() : this.f22895a.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                    if (!file2.exists() && !file2.mkdirs()) {
                        throw new IOException("mkdirs failed on " + file2.getAbsolutePath());
                    }
                    File file3 = new File(file2, str);
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    fileOutputStream.write(Base64.decode(strSubstring, 0));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    arrayList.add(AbstractC2235d.a(this.f22895a, file3));
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            } else if (g(uri) && uri.getPath() != null) {
                if (this.f22897c.size() >= i7 + 1) {
                    reactApplicationContext = this.f22895a;
                    file = new File(uri.getPath(), (String) this.f22897c.get(i7));
                } else {
                    reactApplicationContext = this.f22895a;
                    file = new File(uri.getPath());
                }
                arrayList.add(AbstractC2235d.a(reactApplicationContext, file));
            }
        }
        return arrayList;
    }

    public boolean f() {
        boolean z6 = true;
        for (Uri uri : this.f22896b) {
            z6 = e(uri) || g(uri);
            if (!z6) {
                break;
            }
        }
        return z6;
    }

    public C2237f(ReadableArray readableArray, ArrayList arrayList, String str, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(readableArray, arrayList, bool, reactApplicationContext);
        this.f22898d = str;
    }
}
