package io.invertase.notifee;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import androidx.lifecycle.AbstractC0651h;
import app.notifee.core.EventSubscriber;
import com.facebook.react.InterfaceC0915w;
import com.facebook.react.InterfaceC0918z;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import h2.C1706a;
import h2.C1708c;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseArray f20157a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h2.d f20158b = new a();

    class a implements h2.d {
        a() {
        }

        @Override // h2.d
        public void a(int i7) {
            synchronized (L.f20157a) {
                try {
                    c cVar = (c) L.f20157a.get(i7);
                    if (cVar != null) {
                        L.f20157a.remove(i7);
                        cVar.call();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // h2.d
        public void b(int i7) {
        }
    }

    class b implements InterfaceC0918z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.H f20159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f20160b;

        b(com.facebook.react.H h7, c cVar) {
            this.f20159a = h7;
            this.f20160b = cVar;
        }

        @Override // com.facebook.react.InterfaceC0918z
        public void a(ReactContext reactContext) {
            this.f20159a.p0(this);
            Handler handler = new Handler(Looper.getMainLooper());
            final c cVar = this.f20160b;
            Objects.requireNonNull(cVar);
            handler.postDelayed(new Runnable() { // from class: io.invertase.notifee.M
                @Override // java.lang.Runnable
                public final void run() {
                    cVar.call();
                }
            }, 100L);
        }
    }

    interface c {
        void call();
    }

    static void d() {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = f20157a;
            if (i7 >= sparseArray.size()) {
                return;
            }
            ((c) sparseArray.valueAt(i7)).call();
            sparseArray.remove(i7);
            i7++;
        }
    }

    private static ReactContext e() {
        return ((InterfaceC0915w) EventSubscriber.getContext()).a().o().C();
    }

    static void f() {
        try {
            Object systemService = EventSubscriber.getContext().getSystemService("statusbar");
            Method method = Class.forName("android.app.StatusBarManager").getMethod("collapsePanels", null);
            method.setAccessible(true);
            method.invoke(systemService, null);
        } catch (Exception e7) {
            Log.e("HIDE_NOTIF_DRAWER", "", e7);
        }
    }

    private static void g(c cVar) {
        com.facebook.react.H hO = ((InterfaceC0915w) EventSubscriber.getContext()).a().o();
        hO.q(new b(hO, cVar));
        if (hO.J()) {
            return;
        }
        hO.x();
    }

    static boolean h() {
        return androidx.lifecycle.t.i().getLifecycle().b().e(AbstractC0651h.c.RESUMED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(C1708c c1708c, c cVar) {
        SparseArray sparseArray = f20157a;
        synchronized (sparseArray) {
            try {
                if (sparseArray.size() == 0) {
                    c1708c.j(f20158b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            cVar.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(String str, WritableMap writableMap, long j7, final c cVar) {
        final C1708c c1708cF = C1708c.f(e());
        C1706a c1706a = new C1706a(str, writableMap, j7, true);
        SparseArray sparseArray = f20157a;
        synchronized (sparseArray) {
            try {
                if (sparseArray.size() == 0) {
                    c1708cF.d(f20158b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        sparseArray.put(c1708cF.n(c1706a), new c() { // from class: io.invertase.notifee.K
            @Override // io.invertase.notifee.L.c
            public final void call() {
                L.i(c1708cF, cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(Promise promise, Exception exc, Boolean bool) {
        if (exc != null) {
            promise.reject(exc);
        } else {
            promise.resolve(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(Promise promise, Exception exc) {
        if (exc != null) {
            promise.reject(exc);
        } else {
            promise.resolve(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(Promise promise, Exception exc, Bundle bundle) {
        if (exc != null) {
            promise.reject(exc);
        } else {
            promise.resolve(bundle != null ? Arguments.fromBundle(bundle) : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(Promise promise, Exception exc, List list) {
        if (exc != null) {
            promise.reject(exc);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushMap(Arguments.fromBundle((Bundle) it.next()));
        }
        promise.resolve(writableArrayCreateArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(Promise promise, Exception exc, List list) {
        if (exc != null) {
            promise.reject(exc);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString((String) it.next());
        }
        promise.resolve(writableArrayCreateArray);
    }

    static void p(String str, WritableMap writableMap) {
        try {
            ReactContext reactContextE = e();
            if (reactContextE != null && reactContextE.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContextE.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
            }
        } catch (Exception e7) {
            Log.e("SEND_EVENT", "", e7);
        }
    }

    static void q(final String str, final WritableMap writableMap, final long j7, final c cVar) {
        c cVar2 = new c() { // from class: io.invertase.notifee.J
            @Override // io.invertase.notifee.L.c
            public final void call() {
                L.j(str, writableMap, j7, cVar);
            }
        };
        if (e() == null) {
            g(cVar2);
        } else {
            cVar2.call();
        }
    }
}
