package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.J;

/* JADX INFO: loaded from: classes.dex */
public class g extends Dialog implements androidx.lifecycle.l, l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.lifecycle.m f4885m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final OnBackPressedDispatcher f4886n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, int i7) {
        super(context, i7);
        w5.k.f(context, "context");
        this.f4886n = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.f
            @Override // java.lang.Runnable
            public final void run() {
                g.e(this.f4884m);
            }
        });
    }

    private final androidx.lifecycle.m c() {
        androidx.lifecycle.m mVar = this.f4885m;
        if (mVar != null) {
            return mVar;
        }
        androidx.lifecycle.m mVar2 = new androidx.lifecycle.m(this);
        this.f4885m = mVar2;
        return mVar2;
    }

    private final void d() {
        Window window = getWindow();
        w5.k.c(window);
        J.a(window.getDecorView(), this);
        Window window2 = getWindow();
        w5.k.c(window2);
        View decorView = window2.getDecorView();
        w5.k.e(decorView, "window!!.decorView");
        n.a(decorView, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(g gVar) {
        w5.k.f(gVar, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w5.k.f(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.l
    public final OnBackPressedDispatcher b() {
        return this.f4886n;
    }

    @Override // androidx.lifecycle.l
    public final AbstractC0651h getLifecycle() {
        return c();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f4886n.f();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            this.f4886n.g(getOnBackInvokedDispatcher());
        }
        c().h(AbstractC0651h.b.ON_CREATE);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        c().h(AbstractC0651h.b.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        c().h(AbstractC0651h.b.ON_DESTROY);
        this.f4885m = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i7) {
        d();
        super.setContentView(i7);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        w5.k.f(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        w5.k.f(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
