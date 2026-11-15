package o0;

import q0.u;
import w5.k;

/* JADX INFO: renamed from: o0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1939h extends AbstractC1934c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1939h(p0.h hVar) {
        super(hVar);
        k.f(hVar, "tracker");
    }

    @Override // o0.AbstractC1934c
    public boolean b(u uVar) {
        k.f(uVar, "workSpec");
        return uVar.f21804j.i();
    }

    @Override // o0.AbstractC1934c
    public /* bridge */ /* synthetic */ boolean c(Object obj) {
        return i(((Boolean) obj).booleanValue());
    }

    public boolean i(boolean z6) {
        return !z6;
    }
}
