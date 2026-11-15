package t1;

import M0.d;
import androidx.appcompat.app.y;
import java.util.concurrent.ExecutorService;
import w1.n;
import w5.k;
import y1.g;

/* JADX INFO: renamed from: t1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2056b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2056b f22285a = new C2056b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f22286b;

    private C2056b() {
    }

    public static final InterfaceC2055a a(v1.b bVar, g gVar, n nVar, boolean z6, boolean z7, int i7, ExecutorService executorService) {
        if (f22286b) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl");
            Class cls2 = Boolean.TYPE;
            Object objNewInstance = cls.getConstructor(v1.b.class, g.class, n.class, cls2, cls2, Integer.TYPE, d.class).newInstance(bVar, gVar, nVar, Boolean.valueOf(z6), Boolean.valueOf(z7), Integer.valueOf(i7), executorService);
            k.d(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.animated.factory.AnimatedFactory");
            y.a(objNewInstance);
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
