package O5;

import H5.AbstractC0395g0;
import m5.InterfaceC1888g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends AbstractC0395g0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f2526p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f2527q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f2528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f2529s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a f2530t = S0();

    public f(int i7, int i8, long j7, String str) {
        this.f2526p = i7;
        this.f2527q = i8;
        this.f2528r = j7;
        this.f2529s = str;
    }

    private final a S0() {
        return new a(this.f2526p, this.f2527q, this.f2528r, this.f2529s);
    }

    @Override // H5.F
    public void a(InterfaceC1888g interfaceC1888g, Runnable runnable) {
        a.j(this.f2530t, runnable, null, false, 6, null);
    }

    public final void b1(Runnable runnable, i iVar, boolean z6) {
        this.f2530t.g(runnable, iVar, z6);
    }
}
