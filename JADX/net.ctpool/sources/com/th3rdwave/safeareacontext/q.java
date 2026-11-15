package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import j5.AbstractC1787F;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final Map a(a aVar) {
        w5.k.f(aVar, "insets");
        return AbstractC1787F.i(i5.q.a("top", Float.valueOf(G.b(aVar.d()))), i5.q.a("right", Float.valueOf(G.b(aVar.c()))), i5.q.a("bottom", Float.valueOf(G.b(aVar.a()))), i5.q.a("left", Float.valueOf(G.b(aVar.b()))));
    }

    public static final WritableMap b(a aVar) {
        w5.k.f(aVar, "insets");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("top", G.b(aVar.d()));
        writableMapCreateMap.putDouble("right", G.b(aVar.c()));
        writableMapCreateMap.putDouble("bottom", G.b(aVar.a()));
        writableMapCreateMap.putDouble("left", G.b(aVar.b()));
        w5.k.c(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public static final Map c(c cVar) {
        w5.k.f(cVar, "rect");
        return AbstractC1787F.i(i5.q.a("x", Float.valueOf(G.b(cVar.c()))), i5.q.a("y", Float.valueOf(G.b(cVar.d()))), i5.q.a("width", Float.valueOf(G.b(cVar.b()))), i5.q.a("height", Float.valueOf(G.b(cVar.a()))));
    }

    public static final WritableMap d(c cVar) {
        w5.k.f(cVar, "rect");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", G.b(cVar.c()));
        writableMapCreateMap.putDouble("y", G.b(cVar.d()));
        writableMapCreateMap.putDouble("width", G.b(cVar.b()));
        writableMapCreateMap.putDouble("height", G.b(cVar.a()));
        w5.k.c(writableMapCreateMap);
        return writableMapCreateMap;
    }
}
