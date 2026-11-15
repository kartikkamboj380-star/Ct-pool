package B2;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
class m extends Animation implements j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View f729m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f730n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f731o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f732p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f733q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f734r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f735s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f736t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f737u;

    public m(View view, int i7, int i8, int i9, int i10) {
        this.f729m = view;
        b(i7, i8, i9, i10);
    }

    private void b(int i7, int i8, int i9, int i10) {
        this.f730n = this.f729m.getX() - this.f729m.getTranslationX();
        this.f731o = this.f729m.getY() - this.f729m.getTranslationY();
        this.f734r = this.f729m.getWidth();
        int height = this.f729m.getHeight();
        this.f735s = height;
        this.f732p = i7 - this.f730n;
        this.f733q = i8 - this.f731o;
        this.f736t = i9 - this.f734r;
        this.f737u = i10 - height;
    }

    @Override // B2.j
    public void a(int i7, int i8, int i9, int i10) {
        b(i7, i8, i9, i10);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f7, Transformation transformation) {
        float f8 = this.f730n + (this.f732p * f7);
        float f9 = this.f731o + (this.f733q * f7);
        this.f729m.layout(Math.round(f8), Math.round(f9), Math.round(f8 + this.f734r + (this.f736t * f7)), Math.round(f9 + this.f735s + (this.f737u * f7)));
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
