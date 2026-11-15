package w1;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class q implements O0.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f22653a = TimeUnit.MINUTES.toMillis(5);

    private int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return 1048576;
        }
        return iMin < 33554432 ? 2097152 : 4194304;
    }

    @Override // O0.o
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y get() {
        int iB = b();
        return new y(iB, Api.BaseClientBuilder.API_PRIORITY_OTHER, iB, Api.BaseClientBuilder.API_PRIORITY_OTHER, iB / 8, f22653a);
    }
}
