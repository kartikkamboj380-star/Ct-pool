package j1;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: j1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1774a extends Drawable implements Drawable.Callback, r, q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private r f20198m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Drawable[] f20200o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC1776c[] f20201p;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1777d f20199n = new C1777d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f20202q = new Rect();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f20203r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f20204s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f20205t = false;

    /* JADX INFO: renamed from: j1.a$a, reason: collision with other inner class name */
    class C0271a implements InterfaceC1776c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f20206m;

        C0271a(int i7) {
            this.f20206m = i7;
        }

        @Override // j1.InterfaceC1776c
        public Drawable l(Drawable drawable) {
            return AbstractC1774a.this.e(this.f20206m, drawable);
        }

        @Override // j1.InterfaceC1776c
        public Drawable s() {
            return AbstractC1774a.this.b(this.f20206m);
        }
    }

    public AbstractC1774a(Drawable[] drawableArr) {
        int i7 = 0;
        O0.l.g(drawableArr);
        this.f20200o = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f20200o;
            if (i7 >= drawableArr2.length) {
                this.f20201p = new InterfaceC1776c[drawableArr2.length];
                return;
            } else {
                e.d(drawableArr2[i7], this, this);
                i7++;
            }
        }
    }

    private InterfaceC1776c a(int i7) {
        return new C0271a(i7);
    }

    public Drawable b(int i7) {
        O0.l.b(Boolean.valueOf(i7 >= 0));
        O0.l.b(Boolean.valueOf(i7 < this.f20200o.length));
        return this.f20200o[i7];
    }

    public InterfaceC1776c c(int i7) {
        O0.l.b(Boolean.valueOf(i7 >= 0));
        O0.l.b(Boolean.valueOf(i7 < this.f20201p.length));
        InterfaceC1776c[] interfaceC1776cArr = this.f20201p;
        if (interfaceC1776cArr[i7] == null) {
            interfaceC1776cArr[i7] = a(i7);
        }
        return this.f20201p[i7];
    }

    public int d() {
        return this.f20200o.length;
    }

    public Drawable e(int i7, Drawable drawable) {
        O0.l.b(Boolean.valueOf(i7 >= 0));
        O0.l.b(Boolean.valueOf(i7 < this.f20200o.length));
        Drawable drawable2 = this.f20200o[i7];
        if (drawable != drawable2) {
            if (drawable != null && this.f20205t) {
                drawable.mutate();
            }
            e.d(this.f20200o[i7], null, null);
            e.d(drawable, null, null);
            e.e(drawable, this.f20199n);
            e.a(drawable, this);
            e.d(drawable, this, this);
            this.f20204s = false;
            this.f20200o[i7] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // j1.r
    public void f(Matrix matrix) {
        r rVar = this.f20198m;
        if (rVar != null) {
            rVar.f(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i7 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f20200o;
            if (i7 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i7++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i7 = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f20200o;
            if (i7 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i7++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f20200o.length == 0) {
            return -2;
        }
        int i7 = 1;
        int iResolveOpacity = -1;
        while (true) {
            Drawable[] drawableArr = this.f20200o;
            if (i7 >= drawableArr.length) {
                return iResolveOpacity;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i7 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f20202q;
        while (true) {
            Drawable[] drawableArr = this.f20200o;
            if (i7 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f20204s) {
            this.f20203r = false;
            int i7 = 0;
            while (true) {
                Drawable[] drawableArr = this.f20200o;
                boolean z6 = true;
                if (i7 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i7];
                boolean z7 = this.f20203r;
                if (drawable == null || !drawable.isStateful()) {
                    z6 = false;
                }
                this.f20203r = z7 | z6;
                i7++;
            }
            this.f20204s = true;
        }
        return this.f20203r;
    }

    @Override // j1.q
    public void m(r rVar) {
        this.f20198m = rVar;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f20200o;
            if (i7 >= drawableArr.length) {
                this.f20205t = true;
                return this;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.mutate();
            }
            i7++;
        }
    }

    @Override // j1.r
    public void n(RectF rectF) {
        r rVar = this.f20198m;
        if (rVar != null) {
            rVar.n(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f20200o;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i7) {
        int i8 = 0;
        boolean z6 = false;
        while (true) {
            Drawable[] drawableArr = this.f20200o;
            if (i8 >= drawableArr.length) {
                return z6;
            }
            Drawable drawable = drawableArr[i8];
            if (drawable != null && drawable.setLevel(i7)) {
                z6 = true;
            }
            i8++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i7 = 0;
        boolean z6 = false;
        while (true) {
            Drawable[] drawableArr = this.f20200o;
            if (i7 >= drawableArr.length) {
                return z6;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null && drawable.setState(iArr)) {
                z6 = true;
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        scheduleSelf(runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20199n.c(colorFilter);
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f20200o;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z6) {
        this.f20199n.d(z6);
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f20200o;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setDither(z6);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z6) {
        this.f20199n.e(z6);
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f20200o;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setFilterBitmap(z6);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f7, float f8) {
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f20200o;
            if (i7 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setHotspot(f7, f8);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        boolean visible = super.setVisible(z6, z7);
        int i7 = 0;
        while (true) {
            Drawable[] drawableArr = this.f20200o;
            if (i7 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                drawable.setVisible(z6, z7);
            }
            i7++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
