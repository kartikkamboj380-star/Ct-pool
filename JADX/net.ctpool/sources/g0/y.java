package g0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: loaded from: classes.dex */
class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewOverlay f19468a;

    y(View view) {
        this.f19468a = view.getOverlay();
    }

    @Override // g0.z
    public void a(Drawable drawable) {
        this.f19468a.add(drawable);
    }

    @Override // g0.z
    public void b(Drawable drawable) {
        this.f19468a.remove(drawable);
    }
}
