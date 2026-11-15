package Z4;

import android.app.UiModeManager;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4639a;

    public b(Context context) {
        this.f4639a = context;
    }

    private com.learnium.RNDeviceInfo.a b() {
        WindowManager windowManager = (WindowManager) this.f4639a.getSystemService("window");
        if (windowManager == null) {
            return com.learnium.RNDeviceInfo.a.UNKNOWN;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        double dSqrt = Math.sqrt(Math.pow(((double) displayMetrics.widthPixels) / ((double) displayMetrics.xdpi), 2.0d) + Math.pow(((double) displayMetrics.heightPixels) / ((double) displayMetrics.ydpi), 2.0d));
        return (dSqrt < 3.0d || dSqrt > 6.9d) ? (dSqrt <= 6.9d || dSqrt > 18.0d) ? com.learnium.RNDeviceInfo.a.UNKNOWN : com.learnium.RNDeviceInfo.a.TABLET : com.learnium.RNDeviceInfo.a.HANDSET;
    }

    private com.learnium.RNDeviceInfo.a c() {
        int i7 = this.f4639a.getResources().getConfiguration().smallestScreenWidthDp;
        return i7 == 0 ? com.learnium.RNDeviceInfo.a.UNKNOWN : i7 >= 600 ? com.learnium.RNDeviceInfo.a.TABLET : com.learnium.RNDeviceInfo.a.HANDSET;
    }

    public com.learnium.RNDeviceInfo.a a() {
        if (this.f4639a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return com.learnium.RNDeviceInfo.a.TV;
        }
        UiModeManager uiModeManager = (UiModeManager) this.f4639a.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return com.learnium.RNDeviceInfo.a.TV;
        }
        com.learnium.RNDeviceInfo.a aVarC = c();
        return (aVarC == null || aVarC == com.learnium.RNDeviceInfo.a.UNKNOWN) ? b() : aVarC;
    }

    public boolean d() {
        return a() == com.learnium.RNDeviceInfo.a.TABLET;
    }
}
