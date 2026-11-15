package Q5;

import M5.C;
import java.util.concurrent.atomic.AtomicReferenceArray;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
final class f extends C {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicReferenceArray f2822q;

    public f(long j7, f fVar, int i7) {
        super(j7, fVar, i7);
        this.f2822q = new AtomicReferenceArray(e.f2821f);
    }

    @Override // M5.C
    public int n() {
        return e.f2821f;
    }

    @Override // M5.C
    public void o(int i7, Throwable th, InterfaceC1888g interfaceC1888g) {
        r().set(i7, e.f2820e);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f2822q;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f2062o + ", hashCode=" + hashCode() + ']';
    }
}
