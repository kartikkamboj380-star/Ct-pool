package com.facebook.react.common;

import R1.a;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@a
public class JavascriptException extends RuntimeException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f11398m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavascriptException(String str) {
        super(str);
        k.f(str, "jsStackTrace");
    }

    public final JavascriptException a(String str) {
        this.f11398m = str;
        return this;
    }
}
