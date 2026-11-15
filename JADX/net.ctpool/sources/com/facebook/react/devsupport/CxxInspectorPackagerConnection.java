package com.facebook.react.devsupport;

import T5.B;
import T5.z;
import android.os.Handler;
import android.os.Looper;
import com.facebook.jni.HybridData;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class CxxInspectorPackagerConnection implements K {

    @R1.a
    private final HybridData mHybridData;

    private static class DelegateImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T5.z f11507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f11508b;

        class a extends T5.I {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebSocketDelegate f11509a;

            a(WebSocketDelegate webSocketDelegate) {
                this.f11509a = webSocketDelegate;
            }

            @Override // T5.I
            public void a(T5.H h7, int i7, String str) {
                this.f11509a.didClose();
                this.f11509a.close();
            }

            @Override // T5.I
            public void c(T5.H h7, Throwable th, T5.D d7) {
                String message = th.getMessage();
                WebSocketDelegate webSocketDelegate = this.f11509a;
                if (message == null) {
                    message = "<Unknown error>";
                }
                webSocketDelegate.didFailWithError(null, message);
                this.f11509a.close();
            }

            @Override // T5.I
            public void e(T5.H h7, String str) {
                this.f11509a.didReceiveMessage(str);
            }
        }

        class b implements a {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ T5.H f11511m;

            b(T5.H h7) {
                this.f11511m = h7;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f11511m.f(1000, "End of session");
            }
        }

        private DelegateImpl() {
            z.a aVar = new z.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.f11507a = aVar.e(10L, timeUnit).N(10L, timeUnit).M(0L, TimeUnit.MINUTES).b();
            this.f11508b = new Handler(Looper.getMainLooper());
        }

        @R1.a
        public a connectWebSocket(String str, WebSocketDelegate webSocketDelegate) {
            return new b(this.f11507a.C(new B.a().m(str).b(), new a(webSocketDelegate)));
        }

        @R1.a
        public void scheduleCallback(Runnable runnable, long j7) {
            this.f11508b.postDelayed(runnable, j7);
        }
    }

    @R1.a
    private static class WebSocketDelegate implements Closeable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final HybridData f11513m;

        @R1.a
        private WebSocketDelegate(HybridData hybridData) {
            this.f11513m = hybridData;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f11513m.resetNative();
        }

        public native void didClose();

        public native void didFailWithError(Integer num, String str);

        public native void didReceiveMessage(String str);
    }

    private interface a extends Closeable {
    }

    static {
        G.a();
    }

    public CxxInspectorPackagerConnection(String str, String str2) {
        this.mHybridData = initHybrid(str, str2, new DelegateImpl());
    }

    private static native HybridData initHybrid(String str, String str2, DelegateImpl delegateImpl);

    @Override // com.facebook.react.devsupport.K
    public native void closeQuietly();

    @Override // com.facebook.react.devsupport.K
    public native void connect();

    @Override // com.facebook.react.devsupport.K
    public native void sendEventToAllConnections(String str);
}
