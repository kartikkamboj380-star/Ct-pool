package com.google.android.gms.internal.common;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.common.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1028e extends AbstractC1025b {
    C1028e(int i7) {
        super(4);
    }

    public final C1028e b(Object obj) {
        super.a(obj);
        return this;
    }

    public final C1028e c(Iterator it) {
        while (it.hasNext()) {
            super.a(it.next());
        }
        return this;
    }
}
