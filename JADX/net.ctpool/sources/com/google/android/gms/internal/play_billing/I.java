package com.google.android.gms.internal.play_billing;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class I implements Comparator {
    I() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        S s6 = (S) obj;
        S s7 = (S) obj2;
        H h7 = new H(s6);
        H h8 = new H(s7);
        while (h7.hasNext() && h8.hasNext()) {
            int iCompareTo = Integer.valueOf(h7.a() & 255).compareTo(Integer.valueOf(h8.a() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(s6.h()).compareTo(Integer.valueOf(s7.h()));
    }
}
