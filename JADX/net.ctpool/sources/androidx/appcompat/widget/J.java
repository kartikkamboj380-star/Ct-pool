package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;

/* JADX INFO: loaded from: classes.dex */
public interface J {
    Context a();

    void b(Menu menu, m.a aVar);

    boolean c();

    void collapseActionView();

    void d();

    boolean e();

    boolean f();

    boolean g();

    CharSequence getTitle();

    boolean h();

    void i();

    void j(a0 a0Var);

    boolean k();

    void l(int i7);

    Menu m();

    void n(int i7);

    int o();

    androidx.core.view.O p(int i7, long j7);

    void q(m.a aVar, g.a aVar2);

    void r(int i7);

    ViewGroup s();

    void setIcon(int i7);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(boolean z6);

    int u();

    void v();

    void w();

    void x(Drawable drawable);

    void y(boolean z6);
}
