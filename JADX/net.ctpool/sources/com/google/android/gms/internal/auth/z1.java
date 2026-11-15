package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class z1 extends A1 {
    z1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.A1
    public final double a(Object obj, long j7) {
        return Double.longBitsToDouble(this.f13779a.getLong(obj, j7));
    }

    @Override // com.google.android.gms.internal.auth.A1
    public final float b(Object obj, long j7) {
        return Float.intBitsToFloat(this.f13779a.getInt(obj, j7));
    }

    @Override // com.google.android.gms.internal.auth.A1
    public final void c(Object obj, long j7, boolean z6) {
        if (B1.f13789g) {
            B1.i(obj, j7, z6);
        } else {
            B1.j(obj, j7, z6);
        }
    }

    @Override // com.google.android.gms.internal.auth.A1
    public final void d(Object obj, long j7, double d7) {
        this.f13779a.putLong(obj, j7, Double.doubleToLongBits(d7));
    }

    @Override // com.google.android.gms.internal.auth.A1
    public final void e(Object obj, long j7, float f7) {
        this.f13779a.putInt(obj, j7, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.auth.A1
    public final boolean f(Object obj, long j7) {
        return B1.f13789g ? B1.q(obj, j7) : B1.r(obj, j7);
    }
}
