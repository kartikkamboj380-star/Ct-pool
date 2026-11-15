package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ReadableMap f12479a;

    public W(ReadableMap readableMap) {
        this.f12479a = readableMap;
    }

    public boolean a(String str, boolean z6) {
        return this.f12479a.isNull(str) ? z6 : this.f12479a.getBoolean(str);
    }

    public String b(String str) {
        return this.f12479a.getString(str);
    }

    public boolean c(String str) {
        return this.f12479a.hasKey(str);
    }

    public String toString() {
        return "{ " + getClass().getSimpleName() + ": " + this.f12479a.toString() + " }";
    }
}
