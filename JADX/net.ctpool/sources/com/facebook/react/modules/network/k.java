package com.facebook.react.modules.network;

import T5.E;
import T5.x;
import i6.C;
import i6.q;

/* JADX INFO: loaded from: classes.dex */
public class k extends E {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final E f11940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final i f11941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private i6.h f11942p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f11943q = 0;

    class a extends i6.l {
        a(C c7) {
            super(c7);
        }

        @Override // i6.l, i6.C
        public long L0(i6.f fVar, long j7) {
            long jL0 = super.L0(fVar, j7);
            k.this.f11943q += jL0 != -1 ? jL0 : 0L;
            k.this.f11941o.a(k.this.f11943q, k.this.f11940n.e(), jL0 == -1);
            return jL0;
        }
    }

    public k(E e7, i iVar) {
        this.f11940n = e7;
        this.f11941o = iVar;
    }

    private C B(C c7) {
        return new a(c7);
    }

    public long J() {
        return this.f11943q;
    }

    @Override // T5.E
    public long e() {
        return this.f11940n.e();
    }

    @Override // T5.E
    public x f() {
        return this.f11940n.f();
    }

    @Override // T5.E
    public i6.h j() {
        if (this.f11942p == null) {
            this.f11942p = q.d(B(this.f11940n.j()));
        }
        return this.f11942p;
    }
}
