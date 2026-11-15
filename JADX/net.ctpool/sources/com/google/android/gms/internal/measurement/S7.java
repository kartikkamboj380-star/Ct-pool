package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class S7 extends AbstractC1152n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Callable f14336o;

    public S7(String str, Callable callable) {
        super(str);
        this.f14336o = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1152n
    public final InterfaceC1196s a(C1093g3 c1093g3, List list) {
        try {
            return AbstractC1103h4.b(this.f14336o.call());
        } catch (Exception unused) {
            return InterfaceC1196s.f14815d;
        }
    }
}
