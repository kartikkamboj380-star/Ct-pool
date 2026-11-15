package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f14061A;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14062m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f14063n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f14064o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f14065p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f14066q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f14067r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f14068s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f14069t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private j f14070u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f14071v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Drawable f14072w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f14073x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f14074y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f14075z;

    public k(Drawable drawable, Drawable drawable2) {
        this(null);
        drawable = drawable == null ? i.f14057a : drawable;
        this.f14071v = drawable;
        drawable.setCallback(this);
        j jVar = this.f14070u;
        jVar.f14060b = drawable.getChangingConfigurations() | jVar.f14060b;
        drawable2 = drawable2 == null ? i.f14057a : drawable2;
        this.f14072w = drawable2;
        drawable2.setCallback(this);
        j jVar2 = this.f14070u;
        jVar2.f14060b = drawable2.getChangingConfigurations() | jVar2.f14060b;
    }

    public final Drawable a() {
        return this.f14072w;
    }

    public final void b(int i7) {
        this.f14064o = this.f14065p;
        this.f14067r = 0;
        this.f14066q = 250;
        this.f14062m = 1;
        invalidateSelf();
    }

    public final boolean c() {
        if (!this.f14073x) {
            boolean z6 = false;
            if (this.f14071v.getConstantState() != null && this.f14072w.getConstantState() != null) {
                z6 = true;
            }
            this.f14074y = z6;
            this.f14073x = true;
        }
        return this.f14074y;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        boolean z6;
        int i7;
        int i8 = this.f14062m;
        int i9 = 0;
        if (i8 == 1) {
            this.f14063n = SystemClock.uptimeMillis();
            this.f14062m = 2;
            z6 = false;
        } else if (i8 == 2 && this.f14063n >= 0) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f14063n) / this.f14066q;
            z6 = fUptimeMillis >= 1.0f;
            if (z6) {
                this.f14062m = 0;
            }
            this.f14067r = (int) ((this.f14064o * Math.min(fUptimeMillis, 1.0f)) + 0.0f);
        } else {
            z6 = true;
        }
        int i10 = this.f14067r;
        boolean z7 = this.f14068s;
        Drawable drawable = this.f14071v;
        Drawable drawable2 = this.f14072w;
        if (!z6) {
            if (z7) {
                drawable.setAlpha(this.f14065p - i10);
                i9 = 1;
            }
            drawable.draw(canvas);
            if (i9 != 0) {
                drawable.setAlpha(this.f14065p);
            }
            if (i10 > 0) {
                drawable2.setAlpha(i10);
                drawable2.draw(canvas);
                drawable2.setAlpha(this.f14065p);
            }
            invalidateSelf();
            return;
        }
        if (z7) {
            if (i10 == 0) {
            }
            i7 = this.f14065p;
            if (i10 != i7) {
                drawable2.setAlpha(i7);
                drawable2.draw(canvas);
                return;
            }
            return;
        }
        i9 = i10;
        drawable.draw(canvas);
        i10 = i9;
        i7 = this.f14065p;
        if (i10 != i7) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        j jVar = this.f14070u;
        return changingConfigurations | jVar.f14059a | jVar.f14060b;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!c()) {
            return null;
        }
        this.f14070u.f14059a = getChangingConfigurations();
        return this.f14070u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f14071v.getIntrinsicHeight(), this.f14072w.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f14071v.getIntrinsicWidth(), this.f14072w.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f14075z) {
            this.f14061A = Drawable.resolveOpacity(this.f14071v.getOpacity(), this.f14072w.getOpacity());
            this.f14075z = true;
        }
        return this.f14061A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f14069t && super.mutate() == this) {
            if (!c()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.f14071v.mutate();
            this.f14072w.mutate();
            this.f14069t = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.f14071v.setBounds(rect);
        this.f14072w.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (this.f14067r == this.f14065p) {
            this.f14067r = i7;
        }
        this.f14065p = i7;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f14071v.setColorFilter(colorFilter);
        this.f14072w.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    k(j jVar) {
        this.f14062m = 0;
        this.f14065p = 255;
        this.f14067r = 0;
        this.f14068s = true;
        this.f14070u = new j(jVar);
    }
}
