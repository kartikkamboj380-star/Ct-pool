package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends ContentProvider {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String[] f7060o = {"_display_name", "_size"};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final File f7061p = new File("/");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final HashMap f7062q = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f7063m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7064n = 0;

    static class a {
        static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    interface b {
        File a(Uri uri);

        Uri b(File file);
    }

    /* JADX INFO: renamed from: androidx.core.content.c$c, reason: collision with other inner class name */
    static class C0136c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f7065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f7066b = new HashMap();

        C0136c(String str) {
            this.f7065a = str;
        }

        @Override // androidx.core.content.c.b
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = (File) this.f7066b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // androidx.core.content.c.b
        public Uri b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f7066b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
                }
                String path2 = ((File) entry.getValue()).getPath();
                boolean zEndsWith = path2.endsWith("/");
                int length = path2.length();
                if (!zEndsWith) {
                    length++;
                }
                return new Uri.Builder().scheme("content").authority(this.f7065a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(canonicalPath.substring(length), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        void c(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f7066b.put(str, file.getCanonicalFile());
            } catch (IOException e7) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e7);
            }
        }
    }

    private static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] b(Object[] objArr, int i7) {
        Object[] objArr2 = new Object[i7];
        System.arraycopy(objArr, 0, objArr2, 0, i7);
        return objArr2;
    }

    private static String[] c(String[] strArr, int i7) {
        String[] strArr2 = new String[i7];
        System.arraycopy(strArr, 0, strArr2, 0, i7);
        return strArr2;
    }

    static XmlResourceParser d(Context context, String str, ProviderInfo providerInfo, int i7) {
        if (providerInfo == null) {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
        if (providerInfo.metaData == null && i7 != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt("android.support.FILE_PROVIDER_PATHS", i7);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    private static b e(Context context, String str, int i7) {
        b bVarH;
        HashMap map = f7062q;
        synchronized (map) {
            try {
                bVarH = (b) map.get(str);
                if (bVarH == null) {
                    try {
                        try {
                            bVarH = h(context, str, i7);
                            map.put(str, bVarH);
                        } catch (IOException e7) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e7);
                        }
                    } catch (XmlPullParserException e8) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVarH;
    }

    public static Uri f(Context context, String str, File file) {
        return e(context, str, 0).b(file);
    }

    private static int g(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    private static b h(Context context, String str, int i7) throws XmlPullParserException, IOException {
        C0136c c0136c = new C0136c(str);
        XmlResourceParser xmlResourceParserD = d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i7);
        while (true) {
            int next = xmlResourceParserD.next();
            if (next == 1) {
                return c0136c;
            }
            if (next == 2) {
                String name = xmlResourceParserD.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserD.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserD.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f7061p;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] fileArrG = androidx.core.content.b.g(context, null);
                    if (fileArrG.length > 0) {
                        externalStorageDirectory = fileArrG[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] fileArrF = androidx.core.content.b.f(context);
                    if (fileArrF.length > 0) {
                        externalStorageDirectory = fileArrF[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] fileArrA = a.a(context);
                    if (fileArrA.length > 0) {
                        externalStorageDirectory = fileArrA[0];
                    }
                }
                if (externalStorageDirectory != null) {
                    c0136c.c(attributeValue, a(externalStorageDirectory, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap map = f7062q;
        synchronized (map) {
            map.remove(str);
        }
        this.f7063m = e(context, str, this.f7064n);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f7063m.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File fileA = this.f7063m.a(uri);
        int iLastIndexOf = fileA.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileA.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.f7063m.a(uri), g(str));
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i7;
        File fileA = this.f7063m.a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f7060o;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i8 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i8] = "_display_name";
                i7 = i8 + 1;
                objArr[i8] = queryParameter == null ? fileA.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i8] = "_size";
                i7 = i8 + 1;
                objArr[i8] = Long.valueOf(fileA.length());
            }
            i8 = i7;
        }
        String[] strArrC = c(strArr3, i8);
        Object[] objArrB = b(objArr, i8);
        MatrixCursor matrixCursor = new MatrixCursor(strArrC, 1);
        matrixCursor.addRow(objArrB);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
