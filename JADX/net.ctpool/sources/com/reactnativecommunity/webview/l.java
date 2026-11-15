package com.reactnativecommunity.webview;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.Toast;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import m2.InterfaceC1876g;
import m2.InterfaceC1877h;

/* JADX INFO: loaded from: classes.dex */
public class l implements ActivityEventListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final d f18286s = new d();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ReactApplicationContext f18287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private DownloadManager.Request f18288n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ValueCallback f18289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ValueCallback f18290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private File f18291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private File f18292r;

    class a implements InterfaceC1877h {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f18293m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f18294n;

        a(String str, String str2) {
            this.f18293m = str;
            this.f18294n = str2;
        }

        @Override // m2.InterfaceC1877h
        public boolean onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
            if (i7 != 1) {
                return false;
            }
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(l.this.f18287m, this.f18294n, 1).show();
            } else if (l.this.f18288n != null) {
                l.this.h(this.f18293m);
            }
            return true;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f18296a;

        static {
            int[] iArr = new int[c.values().length];
            f18296a = iArr;
            try {
                iArr[c.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18296a[c.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private enum c {
        DEFAULT("*/*"),
        IMAGE("image"),
        VIDEO("video");


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final String f18301m;

        c(String str) {
            this.f18301m = str;
        }
    }

    protected static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private double f18302a = 1.0d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f18303b = new HashMap();

        protected enum a {
            UNDECIDED,
            SHOULD_OVERRIDE,
            DO_NOT_OVERRIDE
        }

        protected d() {
        }

        public synchronized AtomicReference a(Double d7) {
            return (AtomicReference) this.f18303b.get(d7);
        }

        public synchronized androidx.core.util.c b() {
            double d7;
            AtomicReference atomicReference;
            d7 = this.f18302a;
            this.f18302a = 1.0d + d7;
            atomicReference = new AtomicReference(a.UNDECIDED);
            this.f18303b.put(Double.valueOf(d7), atomicReference);
            return new androidx.core.util.c(Double.valueOf(d7), atomicReference);
        }

        public synchronized void c(Double d7) {
            this.f18303b.remove(d7);
        }
    }

    public l(ReactApplicationContext reactApplicationContext) {
        this.f18287m = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    private Boolean c(String str) {
        if (str.matches("\\.\\w+")) {
            str = m(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(c.IMAGE.f18301m));
    }

    private Boolean d(String[] strArr) {
        String[] strArrI = i(strArr);
        return Boolean.valueOf(g(strArrI, c.DEFAULT.f18301m).booleanValue() || g(strArrI, c.IMAGE.f18301m).booleanValue());
    }

    private Boolean e(String str) {
        if (str.matches("\\.\\w+")) {
            str = m(str.replace(".", ""));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(c.VIDEO.f18301m));
    }

    private Boolean f(String[] strArr) {
        String[] strArrI = i(strArr);
        return Boolean.valueOf(g(strArrI, c.DEFAULT.f18301m).booleanValue() || g(strArrI, c.VIDEO.f18301m).booleanValue());
    }

    private Boolean g(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] i(String[] strArr) {
        if (w(strArr).booleanValue()) {
            return new String[]{c.DEFAULT.f18301m};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i7 = 0; i7 < strArr.length; i7++) {
            String str = strArr[i7];
            if (str.matches("\\.\\w+")) {
                String strM = m(str.replace(".", ""));
                if (strM != null) {
                    strArr2[i7] = strM;
                } else {
                    strArr2[i7] = str;
                }
            } else {
                strArr2[i7] = str;
            }
        }
        return strArr2;
    }

    private Intent k(String str) {
        String strM = str.isEmpty() ? c.DEFAULT.f18301m : str;
        if (str.matches("\\.\\w+")) {
            strM = m(str.replace(".", ""));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(strM);
        return intent;
    }

    private Intent l(String[] strArr, boolean z6) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(c.DEFAULT.f18301m);
        intent.putExtra("android.intent.extra.MIME_TYPES", i(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z6);
        return intent;
    }

    private String m(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private InterfaceC1876g o() {
        ComponentCallbacks2 currentActivity = this.f18287m.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof InterfaceC1876g) {
            return (InterfaceC1876g) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    private InterfaceC1877h s(String str, String str2) {
        return new a(str, str2);
    }

    private Boolean w(String[] strArr) {
        String str;
        boolean z6 = true;
        if (strArr.length != 0 && (strArr.length != 1 || (str = strArr[0]) == null || str.length() != 0)) {
            z6 = false;
        }
        return Boolean.valueOf(z6);
    }

    public boolean A(String[] strArr, boolean z6, ValueCallback valueCallback, boolean z7) {
        String str;
        Intent intentR;
        this.f18290p = valueCallback;
        Activity currentActivity = this.f18287m.getCurrentActivity();
        ArrayList arrayList = new ArrayList();
        Intent intentP = null;
        if (!v()) {
            if (d(strArr).booleanValue() && (intentP = p()) != null) {
                arrayList.add(intentP);
            }
            if (f(strArr).booleanValue() && (intentR = r()) != null) {
                arrayList.add(intentR);
            }
        }
        Intent intent = new Intent("android.intent.action.CHOOSER");
        if (!z7) {
            intent.putExtra("android.intent.extra.INTENT", l(strArr, z6));
            intent.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            intentP = intent;
        }
        if (intentP == null) {
            str = "there is no Camera permission";
        } else {
            if (intentP.resolveActivity(currentActivity.getPackageManager()) != null) {
                currentActivity.startActivityForResult(intentP, 1);
                return true;
            }
            str = "there is no Activity to handle this Intent";
        }
        Log.w("RNCWebViewModule", str);
        return true;
    }

    public void h(String str) {
        try {
            ((DownloadManager) this.f18287m.getSystemService("download")).enqueue(this.f18288n);
            Toast.makeText(this.f18287m, str, 1).show();
        } catch (IllegalArgumentException | SecurityException e7) {
            Log.w("RNCWebViewModule", "Unsupported URI, aborting download", e7);
        }
    }

    public File j(c cVar) {
        String str;
        String str2;
        int i7 = b.f18296a[cVar.ordinal()];
        if (i7 == 1) {
            String str3 = Environment.DIRECTORY_PICTURES;
            str = "image-";
            str2 = ".jpg";
        } else if (i7 != 2) {
            str = "";
            str2 = "";
        } else {
            String str4 = Environment.DIRECTORY_MOVIES;
            str = "video-";
            str2 = ".mp4";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(String.valueOf(System.currentTimeMillis()));
        sb.append(str2);
        return File.createTempFile(str, str2, this.f18287m.getExternalFilesDir(null));
    }

    public Uri n(File file) {
        String packageName = this.f18287m.getPackageName();
        return androidx.core.content.c.f(this.f18287m, packageName + ".fileprovider", file);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i7, int i8, Intent intent) {
        ValueCallback valueCallback;
        Uri data;
        File file;
        if (this.f18290p == null && this.f18289o == null) {
            return;
        }
        File file2 = this.f18291q;
        boolean z6 = false;
        boolean z7 = file2 != null && file2.length() > 0;
        File file3 = this.f18292r;
        if (file3 != null && file3.length() > 0) {
            z6 = true;
        }
        if (i7 != 1) {
            if (i7 == 3) {
                if (i8 != -1) {
                    valueCallback = this.f18289o;
                    valueCallback.onReceiveValue(null);
                } else {
                    ValueCallback valueCallback2 = this.f18289o;
                    if (z7) {
                        file = this.f18291q;
                    } else if (z6) {
                        file = this.f18292r;
                    } else {
                        data = intent.getData();
                        valueCallback2.onReceiveValue(data);
                    }
                    data = n(file);
                    valueCallback2.onReceiveValue(data);
                }
            }
        } else if (i8 != -1) {
            valueCallback = this.f18290p;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
        } else {
            ValueCallback valueCallback3 = this.f18290p;
            if (z7) {
                valueCallback3.onReceiveValue(new Uri[]{n(this.f18291q)});
            } else if (z6) {
                valueCallback3.onReceiveValue(new Uri[]{n(this.f18292r)});
            } else {
                valueCallback3.onReceiveValue(q(intent, i8));
            }
        }
        File file4 = this.f18291q;
        if (file4 != null && !z7) {
            file4.delete();
        }
        File file5 = this.f18292r;
        if (file5 != null && !z6) {
            file5.delete();
        }
        this.f18290p = null;
        this.f18289o = null;
        this.f18291q = null;
        this.f18292r = null;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public Intent p() {
        Intent intent;
        Throwable e7;
        Uri uriN;
        try {
            File fileJ = j(c.IMAGE);
            this.f18291q = fileJ;
            uriN = n(fileJ);
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        } catch (IOException | IllegalArgumentException e8) {
            intent = null;
            e7 = e8;
        }
        try {
            intent.putExtra("output", uriN);
        } catch (IOException e9) {
            e7 = e9;
            Log.e("CREATE FILE", "Error occurred while creating the File", e7);
            e7.printStackTrace();
        } catch (IllegalArgumentException e10) {
            e7 = e10;
            Log.e("CREATE FILE", "Error occurred while creating the File", e7);
            e7.printStackTrace();
        }
        return intent;
    }

    public Uri[] q(Intent intent, int i7) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() == null) {
            if (intent.getData() == null || i7 != -1) {
                return null;
            }
            return WebChromeClient.FileChooserParams.parseResult(i7, intent);
        }
        int itemCount = intent.getClipData().getItemCount();
        Uri[] uriArr = new Uri[itemCount];
        for (int i8 = 0; i8 < itemCount; i8++) {
            uriArr[i8] = intent.getClipData().getItemAt(i8).getUri();
        }
        return uriArr;
    }

    public Intent r() {
        Intent intent;
        Throwable e7;
        Uri uriN;
        try {
            File fileJ = j(c.VIDEO);
            this.f18292r = fileJ;
            uriN = n(fileJ);
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } catch (IOException | IllegalArgumentException e8) {
            intent = null;
            e7 = e8;
        }
        try {
            intent.putExtra("output", uriN);
        } catch (IOException e9) {
            e7 = e9;
            Log.e("CREATE FILE", "Error occurred while creating the File", e7);
            e7.printStackTrace();
        } catch (IllegalArgumentException e10) {
            e7 = e10;
            Log.e("CREATE FILE", "Error occurred while creating the File", e7);
            e7.printStackTrace();
        }
        return intent;
    }

    public boolean t(String str, String str2) {
        Activity currentActivity = this.f18287m.getCurrentActivity();
        if (Build.VERSION.SDK_INT > 28) {
            return true;
        }
        boolean z6 = androidx.core.content.b.a(currentActivity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
        if (!z6) {
            o().p(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1, s(str, str2));
        }
        return z6;
    }

    public boolean u() {
        return true;
    }

    protected boolean v() {
        Activity currentActivity = this.f18287m.getCurrentActivity();
        try {
            if (Arrays.asList(currentActivity.getPackageManager().getPackageInfo(currentActivity.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA")) {
                if (androidx.core.content.b.a(currentActivity, "android.permission.CAMERA") != 0) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public void x(DownloadManager.Request request) {
        this.f18288n = request;
    }

    public void y(boolean z6, double d7) {
        AtomicReference atomicReferenceA = f18286s.a(Double.valueOf(d7));
        if (atomicReferenceA != null) {
            synchronized (atomicReferenceA) {
                try {
                    atomicReferenceA.set(z6 ? d.a.DO_NOT_OVERRIDE : d.a.SHOULD_OVERRIDE);
                    atomicReferenceA.notify();
                } finally {
                }
            }
        }
    }

    public void z(String str, ValueCallback valueCallback) {
        Intent intentR;
        Intent intentP;
        this.f18289o = valueCallback;
        Activity currentActivity = this.f18287m.getCurrentActivity();
        Intent intentCreateChooser = Intent.createChooser(k(str), "");
        ArrayList arrayList = new ArrayList();
        if (c(str).booleanValue() && (intentP = p()) != null) {
            arrayList.add(intentP);
        }
        if (e(str).booleanValue() && (intentR = r()) != null) {
            arrayList.add(intentR);
        }
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        if (intentCreateChooser.resolveActivity(currentActivity.getPackageManager()) != null) {
            currentActivity.startActivityForResult(intentCreateChooser, 3);
        } else {
            Log.w("RNCWebViewModule", "there is no Activity to handle this Intent");
        }
    }
}
