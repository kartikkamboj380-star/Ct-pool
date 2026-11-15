package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class H0 extends L0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class f15051c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ H0(G0 g02) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.L0
    final void a(Object obj, long j7) {
        Object objUnmodifiableList;
        List list = (List) H1.k(obj, j7);
        if (list instanceof F0) {
            objUnmodifiableList = ((F0) list).b();
        } else {
            if (f15051c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC1277d1) && (list instanceof InterfaceC1350y0)) {
                InterfaceC1350y0 interfaceC1350y0 = (InterfaceC1350y0) list;
                if (interfaceC1350y0.zzc()) {
                    interfaceC1350y0.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        H1.x(obj, j7, objUnmodifiableList);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    @Override // com.google.android.gms.internal.play_billing.L0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void b(Object obj, Object obj2, long j7) {
        List list;
        List list2;
        int size;
        List listG;
        List list3 = (List) H1.k(obj2, j7);
        int size2 = list3.size();
        List list4 = (List) H1.k(obj, j7);
        if (!list4.isEmpty()) {
            if (f15051c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size2);
                arrayList.addAll(list4);
                list = arrayList;
            } else {
                if (!(list4 instanceof C1)) {
                    boolean z6 = list4 instanceof InterfaceC1277d1;
                    list2 = list4;
                    if (z6) {
                        boolean z7 = list4 instanceof InterfaceC1350y0;
                        list2 = list4;
                        if (z7) {
                            InterfaceC1350y0 interfaceC1350y0 = (InterfaceC1350y0) list4;
                            list2 = list4;
                            if (!interfaceC1350y0.zzc()) {
                                listG = interfaceC1350y0.g(list4.size() + size2);
                            }
                        }
                    }
                    size = list2.size();
                    int size3 = list3.size();
                    if (size > 0 && size3 > 0) {
                        list2.addAll(list3);
                    }
                    if (size > 0) {
                        list3 = list2;
                    }
                    H1.x(obj, j7, list3);
                }
                E0 e02 = new E0(list4.size() + size2);
                e02.addAll(e02.size(), (C1) list4);
                list = e02;
            }
            H1.x(obj, j7, list);
            list2 = list;
            size = list2.size();
            int size32 = list3.size();
            if (size > 0) {
                list2.addAll(list3);
            }
            if (size > 0) {
            }
            H1.x(obj, j7, list3);
        }
        listG = list4 instanceof F0 ? new E0(size2) : ((list4 instanceof InterfaceC1277d1) && (list4 instanceof InterfaceC1350y0)) ? ((InterfaceC1350y0) list4).g(size2) : new ArrayList(size2);
        H1.x(obj, j7, listG);
        list2 = listG;
        size = list2.size();
        int size322 = list3.size();
        if (size > 0) {
        }
        if (size > 0) {
        }
        H1.x(obj, j7, list3);
    }
}
