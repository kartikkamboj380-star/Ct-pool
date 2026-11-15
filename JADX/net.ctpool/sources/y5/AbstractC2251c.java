package y5;

import com.google.android.gms.common.api.Api;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: y5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2251c extends AbstractC2250b {
    public static int a(double d7) {
        if (Double.isNaN(d7)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d7 > 2.147483647E9d) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (d7 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d7);
    }
}
