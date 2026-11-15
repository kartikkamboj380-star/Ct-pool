package U1;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3740a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f3741b;

    private a() {
    }

    public static final void a() {
        if (f3741b) {
            return;
        }
        f3741b = true;
        P2.a.c(0L, "ReadableMapBufferSoLoader.staticInit::load:mapbufferjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_START);
        SoLoader.t("mapbufferjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_MAPBUFFER_SO_FILE_END);
        P2.a.g(0L);
    }
}
