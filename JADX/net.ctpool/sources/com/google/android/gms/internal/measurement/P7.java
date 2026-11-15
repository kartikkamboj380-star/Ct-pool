package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class P7 extends AbstractC1152n {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f14310o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f14311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ M7 f14312q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P7(M7 m7, boolean z6, boolean z7) {
        super("log");
        this.f14312q = m7;
        this.f14310o = z6;
        this.f14311p = z7;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1152n
    public final InterfaceC1196s a(C1093g3 c1093g3, List list) {
        List arrayList;
        Q7 q7;
        D2.k("log", 1, list);
        if (list.size() == 1) {
            this.f14312q.f14283o.a(N7.INFO, c1093g3.b((InterfaceC1196s) list.get(0)).c(), Collections.emptyList(), this.f14310o, this.f14311p);
        } else {
            N7 n7E = N7.e(D2.i(c1093g3.b((InterfaceC1196s) list.get(0)).b().doubleValue()));
            String strC = c1093g3.b((InterfaceC1196s) list.get(1)).c();
            if (list.size() == 2) {
                q7 = this.f14312q.f14283o;
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList();
                for (int i7 = 2; i7 < Math.min(list.size(), 5); i7++) {
                    arrayList.add(c1093g3.b((InterfaceC1196s) list.get(i7)).c());
                }
                q7 = this.f14312q.f14283o;
            }
            q7.a(n7E, strC, arrayList, this.f14310o, this.f14311p);
        }
        return InterfaceC1196s.f14815d;
    }
}
