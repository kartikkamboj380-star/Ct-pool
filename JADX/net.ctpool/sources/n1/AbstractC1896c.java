package n1;

import O0.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import m1.InterfaceC1868a;
import m1.InterfaceC1869b;
import n1.AbstractC1894a;

/* JADX INFO: renamed from: n1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1896c extends ImageView {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static boolean f21344s = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AbstractC1894a.C0305a f21345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f21346n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C1895b f21347o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f21348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f21349q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Object f21350r;

    public AbstractC1896c(Context context) {
        super(context);
        this.f21345m = new AbstractC1894a.C0305a();
        this.f21346n = 0.0f;
        this.f21348p = false;
        this.f21349q = false;
        this.f21350r = null;
        c(context);
    }

    private void c(Context context) {
        try {
            if (K1.b.d()) {
                K1.b.a("DraweeView#init");
            }
            if (this.f21348p) {
                if (K1.b.d()) {
                    K1.b.b();
                    return;
                }
                return;
            }
            boolean z6 = true;
            this.f21348p = true;
            this.f21347o = C1895b.e(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (K1.b.d()) {
                    K1.b.b();
                    return;
                }
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f21344s || context.getApplicationInfo().targetSdkVersion < 24) {
                z6 = false;
            }
            this.f21349q = z6;
            if (K1.b.d()) {
                K1.b.b();
            }
        } catch (Throwable th) {
            if (K1.b.d()) {
                K1.b.b();
            }
            throw th;
        }
    }

    private void d() {
        Drawable drawable;
        if (!this.f21349q || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z6) {
        f21344s = z6;
    }

    protected void a() {
        this.f21347o.k();
    }

    protected void b() {
        this.f21347o.l();
    }

    protected void e() {
        a();
    }

    protected void f() {
        b();
    }

    public float getAspectRatio() {
        return this.f21346n;
    }

    public InterfaceC1868a getController() {
        return this.f21347o.g();
    }

    public Object getExtraData() {
        return this.f21350r;
    }

    public InterfaceC1869b getHierarchy() {
        return this.f21347o.h();
    }

    public Drawable getTopLevelDrawable() {
        return this.f21347o.i();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i7, int i8) {
        AbstractC1894a.C0305a c0305a = this.f21345m;
        c0305a.f21336a = i7;
        c0305a.f21337b = i8;
        AbstractC1894a.b(c0305a, this.f21346n, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        AbstractC1894a.C0305a c0305a2 = this.f21345m;
        super.onMeasure(c0305a2.f21336a, c0305a2.f21337b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
        f();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f21347o.m(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        d();
    }

    public void setAspectRatio(float f7) {
        if (f7 == this.f21346n) {
            return;
        }
        this.f21346n = f7;
        requestLayout();
    }

    public void setController(InterfaceC1868a interfaceC1868a) {
        this.f21347o.p(interfaceC1868a);
        super.setImageDrawable(this.f21347o.i());
    }

    public void setExtraData(Object obj) {
        this.f21350r = obj;
    }

    public void setHierarchy(InterfaceC1869b interfaceC1869b) {
        this.f21347o.q(interfaceC1869b);
        super.setImageDrawable(this.f21347o.i());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        c(getContext());
        this.f21347o.o();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        c(getContext());
        this.f21347o.o();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i7) {
        c(getContext());
        this.f21347o.o();
        super.setImageResource(i7);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        c(getContext());
        this.f21347o.o();
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z6) {
        this.f21349q = z6;
    }

    @Override // android.view.View
    public String toString() {
        j.a aVarC = j.c(this);
        C1895b c1895b = this.f21347o;
        return aVarC.b("holder", c1895b != null ? c1895b.toString() : "<no holder set>").toString();
    }
}
