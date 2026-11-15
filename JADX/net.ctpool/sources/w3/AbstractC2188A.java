package w3;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: w3.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2188A {
    public static String a(String str, String[] strArr, String[] strArr2) {
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i7 = 0; i7 < iMin; i7++) {
            String str2 = strArr[i7];
            if ((str == null && str2 == null) ? true : str == null ? false : str.equals(str2)) {
                return strArr2[i7];
            }
        }
        return null;
    }
}
