package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;

/* JADX INFO: renamed from: com.facebook.react.uimanager.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0892s extends JSApplicationCausedNativeException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f12714m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0892s(String str) {
        super(str);
        w5.k.f(str, "msg");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0892s(String str, View view, Throwable th) {
        super(str, th);
        w5.k.f(str, "msg");
        w5.k.f(th, "cause");
        this.f12714m = view;
    }
}
