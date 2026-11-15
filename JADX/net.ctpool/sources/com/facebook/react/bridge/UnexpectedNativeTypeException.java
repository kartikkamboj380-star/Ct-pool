package com.facebook.react.bridge;

/* JADX INFO: loaded from: classes.dex */
@R1.a
public final class UnexpectedNativeTypeException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnexpectedNativeTypeException(String str) {
        super(str);
        w5.k.f(str, "msg");
    }
}
