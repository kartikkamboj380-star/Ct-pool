package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    static final CharSequence a(Object obj, String str) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
