package o0;

import p0.C1960c;
import q0.u;
import w5.k;

/* JADX INFO: renamed from: o0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1933b extends AbstractC1934c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1933b(C1960c c1960c) {
        super(c1960c);
        k.f(c1960c, "tracker");
    }

    @Override // o0.AbstractC1934c
    public boolean b(u uVar) {
        k.f(uVar, "workSpec");
        return uVar.f21804j.f();
    }

    @Override // o0.AbstractC1934c
    public /* bridge */ /* synthetic */ boolean c(Object obj) {
        return i(((Boolean) obj).booleanValue());
    }

    public boolean i(boolean z6) {
        return !z6;
    }
}
