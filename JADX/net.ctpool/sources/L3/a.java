package L3;

import N3.g;
import N3.k;
import N3.n;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class a extends Drawable implements n {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f1970m;

    static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f1971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f1972b;

        public b(b bVar) {
            this.f1971a = (g) bVar.f1971a.getConstantState().newDrawable();
            this.f1972b = bVar.f1972b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(g gVar) {
            this.f1971a = gVar;
            this.f1972b = false;
        }
    }

    private a(b bVar) {
        this.f1970m = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f1970m = new b(this.f1970m);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f1970m;
        if (bVar.f1972b) {
            bVar.f1971a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f1970m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f1970m.f1971a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1970m.f1971a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f1970m.f1971a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zB = L3.b.b(iArr);
        b bVar = this.f1970m;
        if (bVar.f1972b == zB) {
            return zOnStateChange;
        }
        bVar.f1972b = zB;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f1970m.f1971a.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1970m.f1971a.setColorFilter(colorFilter);
    }

    @Override // N3.n
    public void setShapeAppearanceModel(k kVar) {
        this.f1970m.f1971a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i7) {
        this.f1970m.f1971a.setTint(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1970m.f1971a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1970m.f1971a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }
}
