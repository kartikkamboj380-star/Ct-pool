package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Unsafe f15047a;

    G1(Unsafe unsafe) {
        this.f15047a = unsafe;
    }

    public abstract double a(Object obj, long j7);

    public abstract float b(Object obj, long j7);

    public abstract void c(Object obj, long j7, boolean z6);

    public abstract void d(Object obj, long j7, byte b7);

    public abstract void e(Object obj, long j7, double d7);

    public abstract void f(Object obj, long j7, float f7);

    public abstract boolean g(Object obj, long j7);
}
