package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1324p0 extends AbstractC1349y {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AbstractC1329r0 f15285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected AbstractC1329r0 f15286n;

    protected AbstractC1324p0(AbstractC1329r0 abstractC1329r0) {
        this.f15285m = abstractC1329r0;
        if (abstractC1329r0.w()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f15286n = abstractC1329r0.l();
    }

    private static void l(Object obj, Object obj2) {
        C1281e1.a().b(obj.getClass()).h(obj, obj2);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final AbstractC1324p0 clone() {
        AbstractC1324p0 abstractC1324p0 = (AbstractC1324p0) this.f15285m.x(5, null, null);
        abstractC1324p0.f15286n = zzg();
        return abstractC1324p0;
    }

    public final AbstractC1324p0 g(AbstractC1329r0 abstractC1329r0) {
        if (!this.f15285m.equals(abstractC1329r0)) {
            if (!this.f15286n.w()) {
                k();
            }
            l(this.f15286n, abstractC1329r0);
        }
        return this;
    }

    public final AbstractC1329r0 h() {
        AbstractC1329r0 abstractC1329r0Zzg = zzg();
        if (abstractC1329r0Zzg.k()) {
            return abstractC1329r0Zzg;
        }
        throw new C1345w1(abstractC1329r0Zzg);
    }

    @Override // com.google.android.gms.internal.play_billing.V0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC1329r0 zzg() {
        if (!this.f15286n.w()) {
            return this.f15286n;
        }
        this.f15286n.r();
        return this.f15286n;
    }

    protected final void j() {
        if (this.f15286n.w()) {
            return;
        }
        k();
    }

    protected void k() {
        AbstractC1329r0 abstractC1329r0L = this.f15285m.l();
        l(abstractC1329r0L, this.f15286n);
        this.f15286n = abstractC1329r0L;
    }
}
