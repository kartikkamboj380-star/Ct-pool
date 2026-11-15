package com.facebook.imagepipeline.producers;

import android.net.Uri;
import x1.C2210a;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0777n f10723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f10724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f10725c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C2210a f10727e;

    public C(InterfaceC0777n interfaceC0777n, e0 e0Var) {
        this.f10723a = interfaceC0777n;
        this.f10724b = e0Var;
    }

    public InterfaceC0777n a() {
        return this.f10723a;
    }

    public e0 b() {
        return this.f10724b;
    }

    public long c() {
        return this.f10725c;
    }

    public g0 d() {
        return this.f10724b.B();
    }

    public int e() {
        return this.f10726d;
    }

    public C2210a f() {
        return this.f10727e;
    }

    public Uri g() {
        return this.f10724b.d().u();
    }

    public void h(long j7) {
        this.f10725c = j7;
    }

    public void i(int i7) {
        this.f10726d = i7;
    }

    public void j(C2210a c2210a) {
        this.f10727e = c2210a;
    }
}
