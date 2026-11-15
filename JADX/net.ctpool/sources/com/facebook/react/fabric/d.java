package com.facebook.react.fabric;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f11727a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f11728b;

    private d() {
    }

    public static final void a() {
        if (f11728b) {
            return;
        }
        P2.a.c(0L, "FabricSoLoader.staticInit::load:fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
        SoLoader.t("fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
        P2.a.g(0L);
        f11728b = true;
    }
}
