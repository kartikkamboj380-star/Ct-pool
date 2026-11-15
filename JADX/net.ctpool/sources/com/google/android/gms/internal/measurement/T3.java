package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class T3 implements Comparator {
    T3() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        R3 r32 = (R3) obj;
        R3 r33 = (R3) obj2;
        X3 x32 = (X3) r32.iterator();
        X3 x33 = (X3) r33.iterator();
        while (x32.hasNext() && x33.hasNext()) {
            int iCompare = Integer.compare(R3.h(x32.a()), R3.h(x33.a()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(r32.r(), r33.r());
    }
}
