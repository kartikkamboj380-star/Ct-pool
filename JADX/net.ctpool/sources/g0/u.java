package g0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: loaded from: classes.dex */
class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f19466a;

    u(ViewGroup viewGroup) {
        this.f19466a = viewGroup.getOverlay();
    }

    @Override // g0.z
    public void a(Drawable drawable) {
        this.f19466a.add(drawable);
    }

    @Override // g0.z
    public void b(Drawable drawable) {
        this.f19466a.remove(drawable);
    }

    @Override // g0.v
    public void c(View view) {
        this.f19466a.add(view);
    }

    @Override // g0.v
    public void d(View view) {
        this.f19466a.remove(view);
    }
}
