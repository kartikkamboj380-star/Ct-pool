package g;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: g.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1665a extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f19310m;

    public AbstractC1665a(Drawable drawable) {
        a(drawable);
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f19310m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f19310m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f19310m.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f19310m.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f19310m.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f19310m.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f19310m.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f19310m.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f19310m.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f19310m.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f19310m.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f19310m.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f19310m.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return androidx.core.graphics.drawable.a.c(this.f19310m);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f19310m.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f19310m.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f19310m.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i7) {
        return this.f19310m.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        scheduleSelf(runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f19310m.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z6) {
        androidx.core.graphics.drawable.a.d(this.f19310m, z6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i7) {
        this.f19310m.setChangingConfigurations(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f19310m.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z6) {
        this.f19310m.setDither(z6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z6) {
        this.f19310m.setFilterBitmap(z6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f7, float f8) {
        androidx.core.graphics.drawable.a.e(this.f19310m, f7, f8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i7, int i8, int i9, int i10) {
        androidx.core.graphics.drawable.a.f(this.f19310m, i7, i8, i9, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f19310m.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i7) {
        androidx.core.graphics.drawable.a.h(this.f19310m, i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.i(this.f19310m, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        androidx.core.graphics.drawable.a.j(this.f19310m, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z7) {
        return super.setVisible(z6, z7) || this.f19310m.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
