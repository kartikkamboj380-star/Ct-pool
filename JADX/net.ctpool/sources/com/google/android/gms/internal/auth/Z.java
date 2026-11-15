package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {
    public static U a(U u6) {
        return ((u6 instanceof X) || (u6 instanceof V)) ? u6 : u6 instanceof Serializable ? new V(u6) : new X(u6);
    }

    public static U b(Object obj) {
        return new Y(obj);
    }
}
