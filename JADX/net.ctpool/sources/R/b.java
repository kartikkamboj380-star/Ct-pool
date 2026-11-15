package R;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2823a = new b();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2824a = new a();

        private a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private b() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.f2824a.a();
        }
        return 0;
    }
}
