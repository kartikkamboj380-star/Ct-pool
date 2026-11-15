package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class C extends RenderableView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Path f17757m;

    public C(ReactContext reactContext) {
        super(reactContext);
        B.f17744a = this.mScale;
        this.f17757m = new Path();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        return this.f17757m;
    }

    public void q(String str) {
        this.f17757m = B.o(str);
        ArrayList<A> arrayList = B.f17749f;
        this.elements = arrayList;
        Iterator<A> it = arrayList.iterator();
        while (it.hasNext()) {
            for (E e7 : it.next().f17743b) {
                double d7 = e7.f17772a;
                float f7 = this.mScale;
                e7.f17772a = d7 * ((double) f7);
                e7.f17773b *= (double) f7;
            }
        }
        invalidate();
    }
}
