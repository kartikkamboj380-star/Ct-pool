package d2;

import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import d2.b;
import w5.k;

/* JADX INFO: renamed from: d2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1604a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1604a f18670a = new C1604a();

    /* JADX INFO: renamed from: d2.a$a, reason: collision with other inner class name */
    private static final class C0250a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Choreographer f18671a;

        public C0250a() {
            Choreographer choreographer = Choreographer.getInstance();
            k.e(choreographer, "getInstance(...)");
            this.f18671a = choreographer;
        }

        @Override // d2.b.a
        public void a(Choreographer.FrameCallback frameCallback) {
            k.f(frameCallback, "callback");
            this.f18671a.postFrameCallback(frameCallback);
        }

        @Override // d2.b.a
        public void b(Choreographer.FrameCallback frameCallback) {
            k.f(frameCallback, "callback");
            this.f18671a.removeFrameCallback(frameCallback);
        }
    }

    private C1604a() {
    }

    public static final C1604a b() {
        return f18670a;
    }

    @Override // d2.b
    public b.a a() {
        UiThreadUtil.assertOnUiThread();
        return new C0250a();
    }
}
