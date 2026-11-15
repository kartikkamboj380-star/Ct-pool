package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
class d extends N3.g {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final Paint f17174L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final RectF f17175M;

    d(N3.k kVar) {
        super(kVar == null ? new N3.k() : kVar);
        this.f17174L = new Paint(1);
        k0();
        this.f17175M = new RectF();
    }

    private void k0() {
        this.f17174L.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f17174L.setColor(-1);
        this.f17174L.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    boolean g0() {
        return !this.f17175M.isEmpty();
    }

    void h0() {
        i0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void i0(float f7, float f8, float f9, float f10) {
        RectF rectF = this.f17175M;
        if (f7 == rectF.left && f8 == rectF.top && f9 == rectF.right && f10 == rectF.bottom) {
            return;
        }
        rectF.set(f7, f8, f9, f10);
        invalidateSelf();
    }

    void j0(RectF rectF) {
        i0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // N3.g
    protected void r(Canvas canvas) {
        if (this.f17175M.isEmpty()) {
            super.r(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f17175M);
        } else {
            canvas.clipRect(this.f17175M, Region.Op.DIFFERENCE);
        }
        super.r(canvas);
        canvas.restore();
    }
}
