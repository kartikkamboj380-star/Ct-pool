package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f14117a = new ArrayList();

    protected A() {
    }

    final InterfaceC1196s a(String str) {
        if (!this.f14117a.contains(D2.c(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: " + str);
    }

    public abstract InterfaceC1196s b(String str, C1093g3 c1093g3, List list);
}
