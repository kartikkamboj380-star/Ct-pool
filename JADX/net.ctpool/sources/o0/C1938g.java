package o0;

import android.os.Build;
import l0.j;
import n0.C1892b;
import q0.u;
import w5.k;

/* JADX INFO: renamed from: o0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1938g extends AbstractC1934c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1938g(p0.h hVar) {
        super(hVar);
        k.f(hVar, "tracker");
    }

    @Override // o0.AbstractC1934c
    public boolean b(u uVar) {
        k.f(uVar, "workSpec");
        j jVarD = uVar.f21804j.d();
        return jVarD == j.UNMETERED || (Build.VERSION.SDK_INT >= 30 && jVarD == j.TEMPORARILY_UNMETERED);
    }

    @Override // o0.AbstractC1934c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(C1892b c1892b) {
        k.f(c1892b, "value");
        return !c1892b.a() || c1892b.b();
    }
}
