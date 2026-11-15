package w1;

import android.app.ActivityManager;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class o implements O0.o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f22650b = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ActivityManager f22651a;

    public o(ActivityManager activityManager) {
        this.f22651a = activityManager;
    }

    private int b() {
        int iMin = Math.min(this.f22651a.getMemoryClass() * 1048576, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iMin < 33554432) {
            return 4194304;
        }
        if (iMin < 67108864) {
            return 6291456;
        }
        return iMin / 4;
    }

    @Override // O0.o
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y get() {
        return new y(b(), 256, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, f22650b);
    }
}
