package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import e.AbstractC1610b;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f5241a;

    private a(Context context) {
        this.f5241a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f5241a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f5241a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f5241a.getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i7 > 600) {
            return 5;
        }
        if (i7 > 960 && i8 > 720) {
            return 5;
        }
        if (i7 > 720 && i8 > 960) {
            return 5;
        }
        if (i7 >= 500) {
            return 4;
        }
        if (i7 > 640 && i8 > 480) {
            return 4;
        }
        if (i7 <= 480 || i8 <= 640) {
            return i7 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean e() {
        return this.f5241a.getResources().getBoolean(AbstractC1610b.f18754a);
    }

    public boolean f() {
        return true;
    }
}
