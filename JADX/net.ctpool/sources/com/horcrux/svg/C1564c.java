package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: renamed from: com.horcrux.svg.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1564c extends C1582u {
    public C1564c(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.C1582u, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f7) {
        P0.a.G("ReactNative", "RNSVG: ClipPath can't be drawn, it should be defined as a child component for `Defs` ");
    }

    @Override // com.horcrux.svg.C1582u, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        return -1;
    }

    @Override // com.horcrux.svg.VirtualView
    boolean isResponsible() {
        return false;
    }

    @Override // com.horcrux.svg.RenderableView
    void mergeProperties(RenderableView renderableView) {
    }

    @Override // com.horcrux.svg.C1582u, com.horcrux.svg.RenderableView
    void resetProperties() {
    }

    @Override // com.horcrux.svg.C1582u, com.horcrux.svg.VirtualView
    void saveDefinition() {
        getSvgView().defineClipPath(this, this.mName);
    }
}
