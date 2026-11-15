package com.horcrux.svg;

import android.graphics.Bitmap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1573l extends AbstractC1565d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f18004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final FilterRegion f18005n;

    public AbstractC1573l(ReactContext reactContext) {
        super(reactContext);
        this.f18005n = new FilterRegion();
    }

    protected static Bitmap s(HashMap map, Bitmap bitmap, String str) {
        Bitmap bitmap2 = str != null ? (Bitmap) map.get(str) : null;
        return bitmap2 != null ? bitmap2 : bitmap;
    }

    public abstract Bitmap q(HashMap map, Bitmap bitmap);

    public String r() {
        return this.f18004m;
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
    }

    public void t(Dynamic dynamic) {
        this.f18005n.setHeight(dynamic);
        invalidate();
    }

    public void u(String str) {
        this.f18004m = str;
        invalidate();
    }

    public void v(Dynamic dynamic) {
        this.f18005n.setWidth(dynamic);
        invalidate();
    }

    public void w(Dynamic dynamic) {
        this.f18005n.setX(dynamic);
        invalidate();
    }

    public void x(Dynamic dynamic) {
        this.f18005n.setY(dynamic);
        invalidate();
    }
}
