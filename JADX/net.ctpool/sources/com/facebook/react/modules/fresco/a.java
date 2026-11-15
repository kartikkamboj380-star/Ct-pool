package com.facebook.react.modules.fresco;

import T5.B;
import T5.C0458d;
import T5.t;
import T5.z;
import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.X;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p2.C1962a;
import u1.b;

/* JADX INFO: loaded from: classes.dex */
class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f11897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f11898f;

    public a(z zVar) {
        super(zVar);
        this.f11897e = zVar;
        this.f11898f = zVar.q().c();
    }

    private Map n(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        HashMap map = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            map.put(strNextKey, readableMap.getString(strNextKey));
        }
        return map;
    }

    @Override // u1.b, com.facebook.imagepipeline.producers.X
    /* JADX INFO: renamed from: i */
    public void d(b.C0320b c0320b, X.a aVar) {
        c0320b.f22487f = SystemClock.elapsedRealtime();
        Uri uriG = c0320b.g();
        Map mapN = c0320b.b().d() instanceof C1962a ? n(((C1962a) c0320b.b().d()).A()) : null;
        if (mapN == null) {
            mapN = Collections.emptyMap();
        }
        j(c0320b, aVar, new B.a().c(new C0458d.a().e().a()).m(uriG.toString()).f(t.k(mapN)).d().b());
    }
}
