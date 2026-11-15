package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator f7181a = new Comparator() { // from class: androidx.core.provider.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.g((byte[]) obj, (byte[]) obj2);
        }
    };

    static class a {
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!Arrays.equals((byte[]) list.get(i7), (byte[]) list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    private static List d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : androidx.core.content.res.d.c(resources, eVar.c());
    }

    static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoF = f(context.getPackageManager(), eVar, context.getResources());
        return providerInfoF == null ? g.a.a(1, null) : g.a.a(0, h(context, eVar, providerInfoF.authority, cancellationSignal));
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) throws PackageManager.NameNotFoundException {
        String strE = eVar.e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(eVar.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + eVar.f());
        }
        List listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listB, f7181a);
        List listD = d(eVar, resources);
        for (int i7 = 0; i7 < listD.size(); i7++) {
            ArrayList arrayList = new ArrayList((Collection) listD.get(i7));
            Collections.sort(arrayList, f7181a);
            if (c(listB, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i7 = 0; i7 < bArr.length; i7++) {
            byte b7 = bArr[i7];
            byte b8 = bArr2[i7];
            if (b7 != b8) {
                return b7 - b8;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static g.b[] h(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        boolean z6;
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursorA = null;
        try {
            cursorA = a.a(context.getContentResolver(), uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
            if (cursorA != null && cursorA.getCount() > 0) {
                int columnIndex = cursorA.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorA.getColumnIndex("_id");
                int columnIndex3 = cursorA.getColumnIndex("file_id");
                int columnIndex4 = cursorA.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorA.getColumnIndex("font_weight");
                int columnIndex6 = cursorA.getColumnIndex("font_italic");
                while (cursorA.moveToNext()) {
                    int i7 = columnIndex != -1 ? cursorA.getInt(columnIndex) : 0;
                    int i8 = columnIndex4 != -1 ? cursorA.getInt(columnIndex4) : 0;
                    Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorA.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorA.getLong(columnIndex3));
                    int i9 = columnIndex5 != -1 ? cursorA.getInt(columnIndex5) : 400;
                    if (columnIndex6 != -1) {
                        z6 = true;
                        if (cursorA.getInt(columnIndex6) != 1) {
                            z6 = false;
                        }
                    }
                    arrayList2.add(g.b.a(uriWithAppendedId, i8, i9, z6, i7));
                }
                arrayList = arrayList2;
            }
            if (cursorA != null) {
                cursorA.close();
            }
            return (g.b[]) arrayList.toArray(new g.b[0]);
        } catch (Throwable th) {
            if (cursorA != null) {
                cursorA.close();
            }
            throw th;
        }
    }
}
