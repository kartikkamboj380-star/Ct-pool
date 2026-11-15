package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;

/* JADX INFO: renamed from: com.facebook.react.devsupport.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0799c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowManager f11599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReactContext f11600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f11601c;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.c$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f11602m;

        a(boolean z6) {
            this.f11602m = z6;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f11602m || C0799c.this.f11601c != null) {
                if (this.f11602m || C0799c.this.f11601c == null) {
                    return;
                }
                C0799c.this.f11601c.removeAllViews();
                C0799c.this.f11599a.removeView(C0799c.this.f11601c);
                C0799c.this.f11601c = null;
                return;
            }
            if (!C0799c.g(C0799c.this.f11600b)) {
                P0.a.b("ReactNative", "Wait for overlay permission to be set");
                return;
            }
            C0799c.this.f11601c = new J(C0799c.this.f11600b);
            C0799c.this.f11599a.addView(C0799c.this.f11601c, new WindowManager.LayoutParams(-1, -1, i0.f11665b, 24, -3));
        }
    }

    public C0799c(ReactContext reactContext) {
        this.f11600b = reactContext;
        this.f11599a = (WindowManager) reactContext.getSystemService("window");
    }

    private static boolean f(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean g(Context context) {
        return Settings.canDrawOverlays(context);
    }

    public static void h(Context context) {
        if (Settings.canDrawOverlays(context)) {
            return;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
        intent.setFlags(268435456);
        P0.a.G("ReactNative", "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
        if (f(context, intent)) {
            context.startActivity(intent);
        }
    }

    public void i(boolean z6) {
        UiThreadUtil.runOnUiThread(new a(z6));
    }
}
