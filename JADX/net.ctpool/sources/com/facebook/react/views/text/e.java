package com.facebook.react.views.text;

import com.facebook.react.uimanager.V;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
public class e extends V {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f13048y = null;

    @InterfaceC2218a(name = "text")
    public void setText(String str) {
        this.f13048y = str;
        y0();
    }

    @Override // com.facebook.react.uimanager.V
    public String toString() {
        return N() + " [text: " + this.f13048y + "]";
    }

    @Override // com.facebook.react.uimanager.V, com.facebook.react.uimanager.U
    public boolean u() {
        return true;
    }

    public String w1() {
        return this.f13048y;
    }
}
