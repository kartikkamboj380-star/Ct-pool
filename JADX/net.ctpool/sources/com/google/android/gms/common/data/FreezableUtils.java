package com.google.android.gms.common.data;

import O0.f;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        f fVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            fVar.add(arrayList.get(i7).freeze());
        }
        return fVar;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        f fVar = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            fVar.add(it.next().freeze());
        }
        return fVar;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        f fVar = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e7 : eArr) {
            fVar.add(e7.freeze());
        }
        return fVar;
    }
}
