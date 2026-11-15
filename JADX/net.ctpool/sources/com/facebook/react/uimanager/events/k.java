package com.facebook.react.uimanager.events;

import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.AbstractC0884k0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class k implements e, LifecycleEventListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ReactEventEmitter f12523m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ReactApplicationContext f12524n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final CopyOnWriteArrayList f12525o = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final CopyOnWriteArrayList f12526p = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final b f12527q = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.p();
        }
    }

    private class b implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f12529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f12530b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.a();
            }
        }

        private b() {
            this.f12529a = false;
            this.f12530b = false;
        }

        private void c() {
            com.facebook.react.modules.core.a.h().m(a.b.TIMERS_EVENTS, k.this.f12527q);
        }

        public void a() {
            if (this.f12529a) {
                return;
            }
            this.f12529a = true;
            c();
        }

        public void b() {
            if (this.f12529a) {
                return;
            }
            if (k.this.f12524n.isOnUiQueueThread()) {
                a();
            } else {
                k.this.f12524n.runOnUiQueueThread(new a());
            }
        }

        public void d() {
            this.f12530b = true;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j7) {
            UiThreadUtil.assertOnUiThread();
            if (this.f12530b) {
                this.f12529a = false;
            } else {
                c();
            }
            P2.a.c(0L, "BatchEventDispatchedListeners");
            try {
                Iterator it = k.this.f12526p.iterator();
                while (it.hasNext()) {
                    ((com.facebook.react.uimanager.events.a) it.next()).a();
                }
            } finally {
                P2.a.g(0L);
            }
        }
    }

    public k(ReactApplicationContext reactApplicationContext) {
        this.f12524n = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f12523m = new ReactEventEmitter(reactApplicationContext);
    }

    private void n(d dVar) {
        P2.a.c(0L, "FabricEventDispatcher.dispatchSynchronous('" + dVar.getEventName() + "')");
        try {
            UIManager uIManagerG = AbstractC0884k0.g(this.f12524n, 2);
            if (uIManagerG instanceof p) {
                ((p) uIManagerG).receiveEvent(dVar.getSurfaceId(), dVar.getViewTag(), dVar.getEventName(), dVar.canCoalesce(), dVar.getEventData(), dVar.getEventCategory(), true);
            } else {
                ReactSoftExceptionLogger.logSoftException("FabricEventDispatcher", new ReactNoCrashSoftException("Fabric UIManager expected to implement SynchronousEventReceiver."));
            }
            P2.a.g(0L);
        } catch (Throwable th) {
            P2.a.g(0L);
            throw th;
        }
    }

    private void o() {
        if (this.f12523m != null) {
            this.f12527q.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        UiThreadUtil.assertOnUiThread();
        this.f12527q.d();
    }

    @Override // com.facebook.react.uimanager.events.e
    public void a(int i7, RCTEventEmitter rCTEventEmitter) {
        this.f12523m.register(i7, rCTEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.e
    public void b(i iVar) {
        this.f12525o.add(iVar);
    }

    @Override // com.facebook.react.uimanager.events.e
    public void c(d dVar) {
        Iterator it = this.f12525o.iterator();
        while (it.hasNext()) {
            ((i) it.next()).a(dVar);
        }
        if (dVar.experimental_isSynchronous()) {
            n(dVar);
        } else {
            dVar.dispatchModern(this.f12523m);
        }
        dVar.dispose();
        o();
    }

    @Override // com.facebook.react.uimanager.events.e
    public void d() {
        o();
    }

    @Override // com.facebook.react.uimanager.events.e
    public void e(com.facebook.react.uimanager.events.a aVar) {
        this.f12526p.remove(aVar);
    }

    @Override // com.facebook.react.uimanager.events.e
    public void f(com.facebook.react.uimanager.events.a aVar) {
        this.f12526p.add(aVar);
    }

    @Override // com.facebook.react.uimanager.events.e
    public void g() {
        UiThreadUtil.runOnUiThread(new a());
    }

    @Override // com.facebook.react.uimanager.events.e
    public void h(int i7, RCTModernEventEmitter rCTModernEventEmitter) {
        this.f12523m.register(i7, rCTModernEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.e
    public void i(int i7) {
        this.f12523m.unregister(i7);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        p();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        p();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        o();
    }
}
