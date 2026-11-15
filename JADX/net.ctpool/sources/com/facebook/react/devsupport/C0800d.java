package com.facebook.react.devsupport;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.react.AbstractC0833p;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.react.devsupport.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0800d implements X1.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f11604d = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f11605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f11606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PopupWindow f11607c;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.d$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f11608m;

        a(String str) {
            this.f11608m = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0800d.this.h(this.f11608m);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.d$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f11610m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Integer f11611n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Integer f11612o;

        b(String str, Integer num, Integer num2) {
            this.f11610m = str;
            this.f11611n = num;
            this.f11612o = num2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Integer num;
            StringBuilder sb = new StringBuilder();
            String str = this.f11610m;
            if (str == null) {
                str = "Loading";
            }
            sb.append(str);
            if (this.f11611n != null && (num = this.f11612o) != null && num.intValue() > 0) {
                sb.append(String.format(Locale.getDefault(), " %.1f%%", Float.valueOf((this.f11611n.intValue() / this.f11612o.intValue()) * 100.0f)));
            }
            sb.append("…");
            if (C0800d.this.f11606b != null) {
                C0800d.this.f11606b.setText(sb);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.d$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0800d.this.g();
        }
    }

    public C0800d(a0 a0Var) {
        this.f11605a = a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        PopupWindow popupWindow = this.f11607c;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.f11607c.dismiss();
        this.f11607c = null;
        this.f11606b = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        PopupWindow popupWindow = this.f11607c;
        if (popupWindow == null || !popupWindow.isShowing()) {
            Activity activityJ = this.f11605a.j();
            if (activityJ == null) {
                P0.a.j("ReactNative", "Unable to display loading message because react activity isn't available");
                return;
            }
            try {
                Rect rect = new Rect();
                activityJ.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int i7 = rect.top;
                TextView textView = (TextView) ((LayoutInflater) activityJ.getSystemService("layout_inflater")).inflate(AbstractC0833p.f11998a, (ViewGroup) null);
                this.f11606b = textView;
                textView.setText(str);
                PopupWindow popupWindow2 = new PopupWindow(this.f11606b, -1, -2);
                this.f11607c = popupWindow2;
                popupWindow2.setTouchable(false);
                this.f11607c.showAtLocation(activityJ.getWindow().getDecorView(), 0, 0, i7);
            } catch (WindowManager.BadTokenException unused) {
                P0.a.j("ReactNative", "Unable to display loading message because react activity isn't active, message: " + str);
            }
        }
    }

    @Override // X1.c
    public void a(String str) {
        if (f11604d) {
            UiThreadUtil.runOnUiThread(new a(str));
        }
    }

    @Override // X1.c
    public void b(String str, Integer num, Integer num2) {
        if (f11604d) {
            UiThreadUtil.runOnUiThread(new b(str, num, num2));
        }
    }

    @Override // X1.c
    public void c() {
        if (f11604d) {
            UiThreadUtil.runOnUiThread(new c());
        }
    }
}
