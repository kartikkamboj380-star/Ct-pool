package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.core.view.AbstractC0596p;
import e.AbstractC1609a;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends androidx.activity.g implements d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private f f5197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AbstractC0596p.a f5198p;

    public q(Context context, int i7) {
        super(context, i(context, i7));
        this.f5198p = new AbstractC0596p.a() { // from class: androidx.appcompat.app.p
            @Override // androidx.core.view.AbstractC0596p.a
            public final boolean q(KeyEvent keyEvent) {
                return this.f5196m.j(keyEvent);
            }
        };
        f fVarH = h();
        fVarH.P(i(context, i7));
        fVarH.z(null);
    }

    private static int i(Context context, int i7) {
        if (i7 != 0) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC1609a.f18750w, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.g, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        h().A();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0596p.e(this.f5198p, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // androidx.appcompat.app.d
    public void f(androidx.appcompat.view.b bVar) {
    }

    @Override // android.app.Dialog
    public View findViewById(int i7) {
        return h().l(i7);
    }

    @Override // androidx.appcompat.app.d
    public void g(androidx.appcompat.view.b bVar) {
    }

    public f h() {
        if (this.f5197o == null) {
            this.f5197o = f.k(this, this);
        }
        return this.f5197o;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        h().v();
    }

    boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean k(int i7) {
        return h().I(i7);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b n(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.g, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        h().u();
        super.onCreate(bundle);
        h().z(bundle);
    }

    @Override // androidx.activity.g, android.app.Dialog
    protected void onStop() {
        super.onStop();
        h().F();
    }

    @Override // androidx.activity.g, android.app.Dialog
    public void setContentView(int i7) {
        h().J(i7);
    }

    @Override // android.app.Dialog
    public void setTitle(int i7) {
        super.setTitle(i7);
        h().Q(getContext().getString(i7));
    }

    @Override // androidx.activity.g, android.app.Dialog
    public void setContentView(View view) {
        h().K(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        h().Q(charSequence);
    }

    @Override // androidx.activity.g, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h().L(view, layoutParams);
    }
}
