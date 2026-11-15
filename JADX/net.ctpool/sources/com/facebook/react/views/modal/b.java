package com.facebook.react.views.modal;

import android.graphics.Point;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.C0895v;
import com.facebook.react.uimanager.V;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends C0895v {
    @Override // com.facebook.react.uimanager.V, com.facebook.react.uimanager.U
    /* JADX INFO: renamed from: e0 */
    public void J(V v6, int i7) {
        k.f(v6, "child");
        super.J(v6, i7);
        C0872e0 c0872e0G = G();
        k.e(c0872e0G, "getThemedContext(...)");
        Point pointA = a.a(c0872e0G);
        v6.B(pointA.x);
        v6.g(pointA.y);
    }
}
