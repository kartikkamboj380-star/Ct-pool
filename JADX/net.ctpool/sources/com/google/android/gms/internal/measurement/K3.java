package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class K3 implements InterfaceC1086f5 {
    protected static void h(Iterable iterable, List list) {
        R3 r3N;
        B4.e(iterable);
        if (iterable instanceof N4) {
            List listA = ((N4) iterable).a();
            N4 n42 = (N4) list;
            int size = list.size();
            for (Object obj : listA) {
                if (obj == null) {
                    String str = "Element at index " + (n42.size() - size) + " is null.";
                    for (int size2 = n42.size() - 1; size2 >= size; size2--) {
                        n42.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof R3) {
                    r3N = (R3) obj;
                } else if (obj instanceof byte[]) {
                    r3N = R3.n((byte[]) obj);
                } else {
                    n42.add((String) obj);
                }
                n42.f1(r3N);
            }
            return;
        }
        if (iterable instanceof InterfaceC1185q5) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            }
            if (list instanceof C1193r5) {
                ((C1193r5) list).f(list.size() + size3);
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    i(list, size4);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i7 = 0; i7 < size5; i7++) {
            Object obj3 = list2.get(i7);
            if (obj3 == null) {
                i(list, size4);
            }
            list.add(obj3);
        }
    }

    private static void i(List list, int i7) {
        String str = "Element at index " + (list.size() - i7) + " is null.";
        for (int size = list.size() - 1; size >= i7; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1086f5
    public final /* synthetic */ InterfaceC1086f5 H0(byte[] bArr, C1148m4 c1148m4) {
        return g(bArr, 0, bArr.length, c1148m4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1086f5
    public final /* synthetic */ InterfaceC1086f5 a0(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public abstract /* synthetic */ Object clone();

    public abstract K3 e(byte[] bArr, int i7, int i8);

    public abstract K3 g(byte[] bArr, int i7, int i8, C1148m4 c1148m4);
}
