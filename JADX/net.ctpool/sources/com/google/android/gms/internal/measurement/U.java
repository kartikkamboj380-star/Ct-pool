package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class U extends A {
    @Override // com.google.android.gms.internal.measurement.A
    public final InterfaceC1196s b(String str, C1093g3 c1093g3, List list) {
        if (str == null || str.isEmpty() || !c1093g3.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", str));
        }
        InterfaceC1196s interfaceC1196sC = c1093g3.c(str);
        if (interfaceC1196sC instanceof AbstractC1152n) {
            return ((AbstractC1152n) interfaceC1196sC).a(c1093g3, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", str));
    }
}
