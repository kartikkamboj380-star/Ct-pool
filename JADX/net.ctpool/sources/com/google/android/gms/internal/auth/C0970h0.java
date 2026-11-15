package com.google.android.gms.internal.auth;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0970h0 implements Comparator {
    C0970h0() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        AbstractC0997q0 abstractC0997q0 = (AbstractC0997q0) obj;
        AbstractC0997q0 abstractC0997q02 = (AbstractC0997q0) obj2;
        C0967g0 c0967g0 = new C0967g0(abstractC0997q0);
        C0967g0 c0967g02 = new C0967g0(abstractC0997q02);
        while (c0967g0.hasNext() && c0967g02.hasNext()) {
            int iCompareTo = Integer.valueOf(c0967g0.a() & 255).compareTo(Integer.valueOf(c0967g02.a() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(abstractC0997q0.h()).compareTo(Integer.valueOf(abstractC0997q02.h()));
    }
}
