package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
abstract class A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Unsafe f13779a;

    A1(Unsafe unsafe) {
        this.f13779a = unsafe;
    }

    public abstract double a(Object obj, long j7);

    public abstract float b(Object obj, long j7);

    public abstract void c(Object obj, long j7, boolean z6);

    public abstract void d(Object obj, long j7, double d7);

    public abstract void e(Object obj, long j7, float f7);

    public abstract boolean f(Object obj, long j7);
}
