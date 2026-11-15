package k3;

import com.google.android.gms.common.api.CommonStatusCodes;

/* JADX INFO: renamed from: k3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1820c extends CommonStatusCodes {
    public static String getStatusCodeString(int i7) {
        switch (i7) {
            case 12500:
                return "A non-recoverable sign in failure occurred";
            case 12501:
                return "Sign in action cancelled";
            case 12502:
                return "Sign-in in progress";
            default:
                return CommonStatusCodes.getStatusCodeString(i7);
        }
    }
}
