package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1205t extends AbstractC1152n implements InterfaceC1143m {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f14839o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List f14840p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C1093g3 f14841q;

    private C1205t(C1205t c1205t) {
        super(c1205t.f14745m);
        ArrayList arrayList = new ArrayList(c1205t.f14839o.size());
        this.f14839o = arrayList;
        arrayList.addAll(c1205t.f14839o);
        ArrayList arrayList2 = new ArrayList(c1205t.f14840p.size());
        this.f14840p = arrayList2;
        arrayList2.addAll(c1205t.f14840p);
        this.f14841q = c1205t.f14841q;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1152n
    public final InterfaceC1196s a(C1093g3 c1093g3, List list) {
        String str;
        InterfaceC1196s interfaceC1196sB;
        C1093g3 c1093g3D = this.f14841q.d();
        for (int i7 = 0; i7 < this.f14839o.size(); i7++) {
            if (i7 < list.size()) {
                str = (String) this.f14839o.get(i7);
                interfaceC1196sB = c1093g3.b((InterfaceC1196s) list.get(i7));
            } else {
                str = (String) this.f14839o.get(i7);
                interfaceC1196sB = InterfaceC1196s.f14815d;
            }
            c1093g3D.e(str, interfaceC1196sB);
        }
        for (InterfaceC1196s interfaceC1196s : this.f14840p) {
            InterfaceC1196s interfaceC1196sB2 = c1093g3D.b(interfaceC1196s);
            if (interfaceC1196sB2 instanceof C1223v) {
                interfaceC1196sB2 = c1093g3D.b(interfaceC1196s);
            }
            if (interfaceC1196sB2 instanceof C1134l) {
                return ((C1134l) interfaceC1196sB2).a();
            }
        }
        return InterfaceC1196s.f14815d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1152n, com.google.android.gms.internal.measurement.InterfaceC1196s
    public final InterfaceC1196s zzc() {
        return new C1205t(this);
    }

    public C1205t(String str, List list, List list2, C1093g3 c1093g3) {
        super(str);
        this.f14839o = new ArrayList();
        this.f14841q = c1093g3;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f14839o.add(((InterfaceC1196s) it.next()).c());
            }
        }
        this.f14840p = new ArrayList(list2);
    }
}
