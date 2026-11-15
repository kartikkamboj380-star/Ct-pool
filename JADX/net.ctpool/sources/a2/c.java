package a2;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.G0;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.yoga.p;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import w2.C2184a;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f4720i = "c";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f4723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f4724d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final G0 f4726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f4727g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f4721a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f4722b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2184a f4725e = new C2184a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final RootViewManager f4728h = new RootViewManager();

    public interface a {
        void a(Queue queue);
    }

    public c(G0 g02, a aVar) {
        this.f4726f = g02;
        this.f4727g = aVar;
    }

    public void a(int i7, View view, C0872e0 c0872e0) {
        f fVarF = f(i7, "attachView");
        if (fVarF.y()) {
            ReactSoftExceptionLogger.logSoftException(f4720i, new IllegalStateException("Trying to attach a view to a stopped surface"));
        } else {
            fVarF.j(view, c0872e0);
        }
    }

    public void b() {
        this.f4725e.b();
    }

    public void c(int i7, int i8, String str, boolean z6, WritableMap writableMap, int i9) {
        f fVarE = e(i7);
        if (fVarE == null) {
            return;
        }
        fVarE.n(i8, str, z6, writableMap, i9);
    }

    public EventEmitterWrapper d(int i7, int i8) {
        f fVarG = i7 == -1 ? g(i8) : e(i7);
        if (fVarG == null) {
            return null;
        }
        return fVarG.q(i8);
    }

    public f e(int i7) {
        f fVar = this.f4724d;
        if (fVar != null && fVar.s() == i7) {
            return this.f4724d;
        }
        f fVar2 = this.f4723c;
        if (fVar2 != null && fVar2.s() == i7) {
            return this.f4723c;
        }
        f fVar3 = (f) this.f4721a.get(Integer.valueOf(i7));
        this.f4724d = fVar3;
        return fVar3;
    }

    public f f(int i7, String str) {
        f fVarE = e(i7);
        if (fVarE != null) {
            return fVarE;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for surfaceId: [" + i7 + "]. Context: " + str);
    }

    public f g(int i7) {
        f fVar = this.f4723c;
        if (fVar != null && fVar.u(i7)) {
            return this.f4723c;
        }
        Iterator it = this.f4721a.entrySet().iterator();
        while (it.hasNext()) {
            f fVar2 = (f) ((Map.Entry) it.next()).getValue();
            if (fVar2 != this.f4723c && fVar2.u(i7)) {
                if (this.f4723c == null) {
                    this.f4723c = fVar2;
                }
                return fVar2;
            }
        }
        return null;
    }

    public f h(int i7) {
        f fVarG = g(i7);
        if (fVarG != null) {
            return fVarG;
        }
        throw new RetryableMountingLayerException("Unable to find SurfaceMountingManager for tag: [" + i7 + "]");
    }

    public boolean i(int i7) {
        return g(i7) != null;
    }

    public boolean j(int i7) {
        f fVarE = e(i7);
        if (fVarE == null || fVarE.y()) {
            return false;
        }
        return !fVarE.x();
    }

    public long k(ReactContext reactContext, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f7, p pVar, float f8, p pVar2, float[] fArr) {
        return this.f4726f.c(str).measure(reactContext, readableMap, readableMap2, readableMap3, f7, pVar, f8, pVar2, fArr);
    }

    public long l(ReactContext reactContext, String str, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, com.facebook.react.common.mapbuffer.a aVar3, float f7, p pVar, float f8, p pVar2, float[] fArr) {
        return this.f4726f.c(str).measure(reactContext, aVar, aVar2, aVar3, f7, pVar, f8, pVar2, fArr);
    }

    public void m(int i7, int i8, int i9, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        f(i7, "receiveCommand:int").F(i8, i9, readableArray);
    }

    public void n(int i7, int i8, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        f(i7, "receiveCommand:string").G(i8, str, readableArray);
    }

    public void o(int i7, int i8, int i9) {
        UiThreadUtil.assertOnUiThread();
        (i7 == -1 ? h(i8) : f(i7, "sendAccessibilityEvent")).K(i8, i9);
    }

    public f p(int i7, C0872e0 c0872e0, View view) {
        f fVar = new f(i7, this.f4725e, this.f4726f, this.f4728h, this.f4727g, c0872e0);
        this.f4721a.putIfAbsent(Integer.valueOf(i7), fVar);
        if (this.f4721a.get(Integer.valueOf(i7)) != fVar) {
            ReactSoftExceptionLogger.logSoftException(f4720i, new IllegalStateException("Called startSurface more than once for the SurfaceId [" + i7 + "]"));
        }
        this.f4723c = (f) this.f4721a.get(Integer.valueOf(i7));
        if (view != null) {
            fVar.j(view, c0872e0);
        }
        return fVar;
    }

    public void q(int i7) {
        f fVar = (f) this.f4721a.get(Integer.valueOf(i7));
        if (fVar == null) {
            ReactSoftExceptionLogger.logSoftException(f4720i, new IllegalStateException("Cannot call stopSurface on non-existent surface: [" + i7 + "]"));
            return;
        }
        while (this.f4722b.size() >= 15) {
            Integer num = (Integer) this.f4722b.get(0);
            ConcurrentHashMap concurrentHashMap = this.f4721a;
            num.intValue();
            concurrentHashMap.remove(num);
            this.f4722b.remove(num);
            P0.a.c(f4720i, "Removing stale SurfaceMountingManager: [%d]", num);
        }
        this.f4722b.add(Integer.valueOf(i7));
        fVar.M();
        if (this.f4723c == fVar) {
            this.f4723c = null;
        }
        if (this.f4724d == fVar) {
            this.f4724d = null;
        }
    }

    public boolean r(int i7) {
        if (this.f4722b.contains(Integer.valueOf(i7))) {
            return true;
        }
        f fVarE = e(i7);
        return fVarE != null && fVarE.y();
    }

    public void s(int i7, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        if (readableMap == null) {
            return;
        }
        h(i7).R(i7, readableMap);
    }
}
