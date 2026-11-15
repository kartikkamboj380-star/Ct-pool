package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class K implements Comparator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ AbstractC1152n f14230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ C1093g3 f14231n;

    K(AbstractC1152n abstractC1152n, C1093g3 c1093g3) {
        this.f14230m = abstractC1152n;
        this.f14231n = c1093g3;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC1196s interfaceC1196s = (InterfaceC1196s) obj;
        InterfaceC1196s interfaceC1196s2 = (InterfaceC1196s) obj2;
        AbstractC1152n abstractC1152n = this.f14230m;
        C1093g3 c1093g3 = this.f14231n;
        if (interfaceC1196s instanceof C1255z) {
            return !(interfaceC1196s2 instanceof C1255z) ? 1 : 0;
        }
        if (interfaceC1196s2 instanceof C1255z) {
            return -1;
        }
        return abstractC1152n == null ? interfaceC1196s.c().compareTo(interfaceC1196s2.c()) : (int) D2.a(abstractC1152n.a(c1093g3, Arrays.asList(interfaceC1196s, interfaceC1196s2)).b().doubleValue());
    }
}
