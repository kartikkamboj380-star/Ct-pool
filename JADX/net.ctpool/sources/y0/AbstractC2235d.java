package y0;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: y0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2235d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayList f22888a = new ArrayList();

    public static Uri a(ReactContext reactContext, File file) {
        b(reactContext);
        String authority = Uri.fromFile(file).getAuthority();
        if (!TextUtils.isEmpty(authority) && f22888a.contains(authority)) {
            return Uri.fromFile(file);
        }
        if (file.getAbsolutePath().startsWith("content://")) {
            return Uri.fromFile(file);
        }
        Uri uriF = null;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = f22888a;
            if (i7 >= arrayList.size()) {
                break;
            }
            try {
                uriF = androidx.core.content.c.f(reactContext, (String) arrayList.get(i7), file);
            } catch (Exception e7) {
                System.out.println("RNSharePathUtil::compatUriFromFile ERROR " + e7.getMessage());
            }
            if (uriF != null) {
                break;
            }
            i7++;
        }
        return uriF;
    }

    public static void b(ReactContext reactContext) {
        ArrayList arrayList = f22888a;
        if (arrayList.size() == 0) {
            arrayList.add(reactContext.getPackageName() + ".rnshare.fileprovider");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Cursor cursorG;
        Cursor cursor = null;
        try {
            cursorG = new Q.b(context, uri, new String[]{"_data"}, str, strArr, null).G();
            if (cursorG != null) {
                try {
                    try {
                        if (cursorG.moveToFirst()) {
                            String string = cursorG.getString(cursorG.getColumnIndexOrThrow("_data"));
                            cursorG.close();
                            return string;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        e.printStackTrace();
                        if (cursorG != null) {
                            cursorG.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorG;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorG != null) {
                cursorG.close();
            }
            return null;
        } catch (Exception e8) {
            e = e8;
            cursorG = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    public static String d(Context context, Uri uri, Boolean bool) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (f(uri)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                String str = strArrSplit[0];
                if ("primary".equalsIgnoreCase(str) || "0".equalsIgnoreCase(str)) {
                    return "" + (bool.booleanValue() ? context.getCacheDir() : context.getExternalCacheDir()) + "/" + strArrSplit[1];
                }
                if ("raw".equalsIgnoreCase(str)) {
                    return "" + strArrSplit[1];
                }
                if (!TextUtils.isEmpty(str)) {
                    return "/storage/" + str + "/" + strArrSplit[1];
                }
            } else {
                if (e(uri)) {
                    String documentId = DocumentsContract.getDocumentId(uri);
                    if (documentId.startsWith("raw:")) {
                        return "" + documentId.replaceFirst("raw:", "");
                    }
                    return "" + c(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                }
                if (h(uri)) {
                    String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                    String str2 = strArrSplit2[0];
                    if ("image".equals(str2)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str2)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str2)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    } else if ("raw".equalsIgnoreCase(str2)) {
                        return "" + strArrSplit2[1];
                    }
                    return "" + c(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (g(uri)) {
                    return uri.getLastPathSegment();
                }
                return "" + c(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static boolean e(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean f(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean g(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean h(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }
}
