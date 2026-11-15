package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: renamed from: com.horcrux.svg.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1566e extends AbstractC1565d {
    public C1566e(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC1565d, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f7) {
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}
