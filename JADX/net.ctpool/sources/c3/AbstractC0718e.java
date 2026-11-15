package c3;

import c3.C0714a;

/* JADX INFO: renamed from: c3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0718e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final AbstractC0718e f10052a = a().f(10485760).d(200).b(10000).c(604800000).e(81920).a();

    /* JADX INFO: renamed from: c3.e$a */
    static abstract class a {
        a() {
        }

        abstract AbstractC0718e a();

        abstract a b(int i7);

        abstract a c(long j7);

        abstract a d(int i7);

        abstract a e(int i7);

        abstract a f(long j7);
    }

    AbstractC0718e() {
    }

    static a a() {
        return new C0714a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}
