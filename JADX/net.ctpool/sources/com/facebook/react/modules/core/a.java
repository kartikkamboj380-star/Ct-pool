package com.facebook.react.modules.core;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import d2.b;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static a f11840f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b.a f11841a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Choreographer.FrameCallback f11843c = new ChoreographerFrameCallbackC0214a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11844d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11845e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque[] f11842b = new ArrayDeque[b.values().length];

    /* JADX INFO: renamed from: com.facebook.react.modules.core.a$a, reason: collision with other inner class name */
    class ChoreographerFrameCallbackC0214a implements Choreographer.FrameCallback {
        ChoreographerFrameCallbackC0214a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j7) {
            synchronized (a.this.f11842b) {
                try {
                    a.this.f11845e = false;
                    for (int i7 = 0; i7 < a.this.f11842b.length; i7++) {
                        ArrayDeque arrayDeque = a.this.f11842b[i7];
                        int size = arrayDeque.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) arrayDeque.pollFirst();
                            if (frameCallback != null) {
                                frameCallback.doFrame(j7);
                                a aVar = a.this;
                                aVar.f11844d--;
                            } else {
                                P0.a.j("ReactNative", "Tried to execute non-existent frame callback");
                            }
                        }
                    }
                    a.this.l();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public enum b {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f11853m;

        b(int i7) {
            this.f11853m = i7;
        }

        int h() {
            return this.f11853m;
        }
    }

    private a(final d2.b bVar) {
        int i7 = 0;
        while (true) {
            ArrayDeque[] arrayDequeArr = this.f11842b;
            if (i7 >= arrayDequeArr.length) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: m2.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21222m.j(bVar);
                    }
                });
                return;
            } else {
                arrayDequeArr[i7] = new ArrayDeque();
                i7++;
            }
        }
    }

    public static a h() {
        O1.a.d(f11840f, "ReactChoreographer needs to be initialized.");
        return f11840f;
    }

    public static void i(d2.b bVar) {
        if (f11840f == null) {
            f11840f = new a(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(d2.b bVar) {
        this.f11841a = bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        synchronized (this.f11842b) {
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        O1.a.a(this.f11844d >= 0);
        if (this.f11844d == 0 && this.f11845e) {
            b.a aVar = this.f11841a;
            if (aVar != null) {
                aVar.b(this.f11843c);
            }
            this.f11845e = false;
        }
    }

    private void n() {
        this.f11841a.a(this.f11843c);
        this.f11845e = true;
    }

    public void m(b bVar, Choreographer.FrameCallback frameCallback) {
        synchronized (this.f11842b) {
            try {
                this.f11842b[bVar.h()].addLast(frameCallback);
                boolean z6 = true;
                int i7 = this.f11844d + 1;
                this.f11844d = i7;
                if (i7 <= 0) {
                    z6 = false;
                }
                O1.a.a(z6);
                if (!this.f11845e) {
                    if (this.f11841a == null) {
                        UiThreadUtil.runOnUiThread(new Runnable() { // from class: m2.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f21221m.k();
                            }
                        });
                    } else {
                        n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(b bVar, Choreographer.FrameCallback frameCallback) {
        synchronized (this.f11842b) {
            try {
                if (this.f11842b[bVar.h()].removeFirstOccurrence(frameCallback)) {
                    this.f11844d--;
                    l();
                } else {
                    P0.a.j("ReactNative", "Tried to remove non-existent frame callback");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
