package androidx.appcompat.app;

import Y.c;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.q0;
import androidx.core.app.AbstractC0550b;
import androidx.core.app.AbstractC0557i;
import androidx.core.app.a0;
import androidx.fragment.app.AbstractActivityC0640j;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import c.InterfaceC0706b;

/* JADX INFO: renamed from: androidx.appcompat.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0523c extends AbstractActivityC0640j implements d, a0.a {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private f f5081J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private Resources f5082K;

    /* JADX INFO: renamed from: androidx.appcompat.app.c$a */
    class a implements c.InterfaceC0101c {
        a() {
        }

        @Override // Y.c.InterfaceC0101c
        public Bundle a() {
            Bundle bundle = new Bundle();
            AbstractActivityC0523c.this.Z().D(bundle);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.c$b */
    class b implements InterfaceC0706b {
        b() {
        }

        @Override // c.InterfaceC0706b
        public void a(Context context) {
            f fVarZ = AbstractActivityC0523c.this.Z();
            fVarZ.u();
            fVarZ.z(AbstractActivityC0523c.this.getSavedStateRegistry().b("androidx:appcompat"));
        }
    }

    public AbstractActivityC0523c() {
        b0();
    }

    private void C() {
        J.a(getWindow().getDecorView(), this);
        K.a(getWindow().getDecorView(), this);
        Y.f.a(getWindow().getDecorView(), this);
        androidx.activity.n.a(getWindow().getDecorView(), this);
    }

    private void b0() {
        getSavedStateRegistry().h("androidx:appcompat", new a());
        z(new b());
    }

    private boolean i0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public f Z() {
        if (this.f5081J == null) {
            this.f5081J = f.j(this, this);
        }
        return this.f5081J;
    }

    public AbstractC0521a a0() {
        return Z().t();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C();
        Z().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(Z().i(context));
    }

    public void c0(a0 a0Var) {
        a0Var.f(this);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0521a abstractC0521aA0 = a0();
        if (getWindow().hasFeature(0)) {
            if (abstractC0521aA0 == null || !abstractC0521aA0.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    protected void d0(androidx.core.os.i iVar) {
    }

    @Override // androidx.core.app.AbstractActivityC0555g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0521a abstractC0521aA0 = a0();
        if (keyCode == 82 && abstractC0521aA0 != null && abstractC0521aA0.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    protected void e0(int i7) {
    }

    @Override // androidx.appcompat.app.d
    public void f(androidx.appcompat.view.b bVar) {
    }

    public void f0(a0 a0Var) {
    }

    @Override // android.app.Activity
    public View findViewById(int i7) {
        return Z().l(i7);
    }

    @Override // androidx.appcompat.app.d
    public void g(androidx.appcompat.view.b bVar) {
    }

    public void g0() {
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return Z().r();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f5082K == null && q0.c()) {
            this.f5082K = new q0(this, super.getResources());
        }
        Resources resources = this.f5082K;
        return resources == null ? super.getResources() : resources;
    }

    public boolean h0() {
        Intent intentM = m();
        if (intentM == null) {
            return false;
        }
        if (!l0(intentM)) {
            k0(intentM);
            return true;
        }
        a0 a0VarI = a0.i(this);
        c0(a0VarI);
        f0(a0VarI);
        a0VarI.k();
        try {
            AbstractC0550b.p(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        Z().v();
    }

    public void j0(Toolbar toolbar) {
        Z().O(toolbar);
    }

    public void k0(Intent intent) {
        AbstractC0557i.e(this, intent);
    }

    public boolean l0(Intent intent) {
        return AbstractC0557i.f(this, intent);
    }

    @Override // androidx.core.app.a0.a
    public Intent m() {
        return AbstractC0557i.a(this);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b n(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Z().y(configuration);
        if (this.f5082K != null) {
            this.f5082K.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        g0();
    }

    @Override // androidx.fragment.app.AbstractActivityC0640j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Z().A();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC0640j, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        AbstractC0521a abstractC0521aA0 = a0();
        if (menuItem.getItemId() != 16908332 || abstractC0521aA0 == null || (abstractC0521aA0.j() & 4) == 0) {
            return false;
        }
        return h0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i7, Menu menu) {
        return super.onMenuOpened(i7, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        Z().B(bundle);
    }

    @Override // androidx.fragment.app.AbstractActivityC0640j, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        Z().C();
    }

    @Override // androidx.fragment.app.AbstractActivityC0640j, android.app.Activity
    protected void onStart() {
        super.onStart();
        Z().E();
    }

    @Override // androidx.fragment.app.AbstractActivityC0640j, android.app.Activity
    protected void onStop() {
        super.onStop();
        Z().F();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i7) {
        super.onTitleChanged(charSequence, i7);
        Z().Q(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0521a abstractC0521aA0 = a0();
        if (getWindow().hasFeature(0)) {
            if (abstractC0521aA0 == null || !abstractC0521aA0.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i7) {
        C();
        Z().J(i7);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i7) {
        super.setTheme(i7);
        Z().P(i7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        C();
        Z().K(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C();
        Z().L(view, layoutParams);
    }
}
