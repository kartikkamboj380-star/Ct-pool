package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class L0 extends P0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class f13812c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ L0(K0 k02) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.P0
    final void a(Object obj, long j7) {
        Object objUnmodifiableList;
        List list = (List) B1.f(obj, j7);
        if (list instanceof J0) {
            objUnmodifiableList = ((J0) list).b();
        } else {
            if (f13812c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC0971h1) && (list instanceof E0)) {
                E0 e02 = (E0) list;
                if (e02.zzc()) {
                    e02.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        B1.p(obj, j7, objUnmodifiableList);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    @Override // com.google.android.gms.internal.auth.P0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void b(Object obj, Object obj2, long j7) {
        List list;
        List list2;
        int size;
        List listG;
        List list3 = (List) B1.f(obj2, j7);
        int size2 = list3.size();
        List list4 = (List) B1.f(obj, j7);
        if (!list4.isEmpty()) {
            if (f13812c.isAssignableFrom(list4.getClass())) {
                ArrayList arrayList = new ArrayList(list4.size() + size2);
                arrayList.addAll(list4);
                list = arrayList;
            } else {
                if (!(list4 instanceof C1015w1)) {
                    boolean z6 = list4 instanceof InterfaceC0971h1;
                    list2 = list4;
                    if (z6) {
                        boolean z7 = list4 instanceof E0;
                        list2 = list4;
                        if (z7) {
                            E0 e02 = (E0) list4;
                            list2 = list4;
                            if (!e02.zzc()) {
                                listG = e02.g(list4.size() + size2);
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
                    B1.p(obj, j7, list3);
                }
                I0 i02 = new I0(list4.size() + size2);
                i02.addAll(i02.size(), (C1015w1) list4);
                list = i02;
            }
            B1.p(obj, j7, list);
            list2 = list;
            size = list2.size();
            int size32 = list3.size();
            if (size > 0) {
                list2.addAll(list3);
            }
            if (size > 0) {
            }
            B1.p(obj, j7, list3);
        }
        listG = list4 instanceof J0 ? new I0(size2) : ((list4 instanceof InterfaceC0971h1) && (list4 instanceof E0)) ? ((E0) list4).g(size2) : new ArrayList(size2);
        B1.p(obj, j7, listG);
        list2 = listG;
        size = list2.size();
        int size322 = list3.size();
        if (size > 0) {
        }
        if (size > 0) {
        }
        B1.p(obj, j7, list3);
    }
}
