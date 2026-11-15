package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.core.view.AbstractC0595o;
import androidx.core.view.H;
import e.AbstractC1612d;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f5509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f5512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f5513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f5514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m.a f5516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private k f5517j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PopupWindow.OnDismissListener f5518k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f5519l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.e();
        }
    }

    static class b {
        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public l(Context context, g gVar, View view, boolean z6, int i7) {
        this(context, gVar, view, z6, i7, 0);
    }

    private k a() {
        Display defaultDisplay = ((WindowManager) this.f5508a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        k dVar = Math.min(point.x, point.y) >= this.f5508a.getResources().getDimensionPixelSize(AbstractC1612d.f18763a) ? new d(this.f5508a, this.f5513f, this.f5511d, this.f5512e, this.f5510c) : new q(this.f5508a, this.f5509b, this.f5513f, this.f5511d, this.f5512e, this.f5510c);
        dVar.l(this.f5509b);
        dVar.u(this.f5519l);
        dVar.p(this.f5513f);
        dVar.h(this.f5516i);
        dVar.r(this.f5515h);
        dVar.s(this.f5514g);
        return dVar;
    }

    private void l(int i7, int i8, boolean z6, boolean z7) {
        k kVarC = c();
        kVarC.v(z7);
        if (z6) {
            if ((AbstractC0595o.b(this.f5514g, H.B(this.f5513f)) & 7) == 5) {
                i7 -= this.f5513f.getWidth();
            }
            kVarC.t(i7);
            kVarC.w(i8);
            int i9 = (int) ((this.f5508a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kVarC.q(new Rect(i7 - i9, i8 - i9, i7 + i9, i8 + i9));
        }
        kVarC.b();
    }

    public void b() {
        if (d()) {
            this.f5517j.dismiss();
        }
    }

    public k c() {
        if (this.f5517j == null) {
            this.f5517j = a();
        }
        return this.f5517j;
    }

    public boolean d() {
        k kVar = this.f5517j;
        return kVar != null && kVar.a();
    }

    protected void e() {
        this.f5517j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f5518k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f5513f = view;
    }

    public void g(boolean z6) {
        this.f5515h = z6;
        k kVar = this.f5517j;
        if (kVar != null) {
            kVar.r(z6);
        }
    }

    public void h(int i7) {
        this.f5514g = i7;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f5518k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.f5516i = aVar;
        k kVar = this.f5517j;
        if (kVar != null) {
            kVar.h(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f5513f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i7, int i8) {
        if (d()) {
            return true;
        }
        if (this.f5513f == null) {
            return false;
        }
        l(i7, i8, true, true);
        return true;
    }

    public l(Context context, g gVar, View view, boolean z6, int i7, int i8) {
        this.f5514g = 8388611;
        this.f5519l = new a();
        this.f5508a = context;
        this.f5509b = gVar;
        this.f5513f = view;
        this.f5510c = z6;
        this.f5511d = i7;
        this.f5512e = i8;
    }
}
