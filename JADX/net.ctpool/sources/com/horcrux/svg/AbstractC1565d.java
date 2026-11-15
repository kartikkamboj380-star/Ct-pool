package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: renamed from: com.horcrux.svg.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1565d extends VirtualView {
    AbstractC1565d(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f7) {
    }

    @Override // com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return null;
    }

    @Override // com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        return -1;
    }

    @Override // com.horcrux.svg.VirtualView
    boolean isResponsible() {
        return false;
    }
}
