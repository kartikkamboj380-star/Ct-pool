package e2;

import v5.InterfaceC2171a;
import w5.l;

/* JADX INFO: renamed from: e2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1619a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1619a f19164a = new C1619a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static InterfaceC2171a f19165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static InterfaceC1620b f19166c;

    /* JADX INFO: renamed from: e2.a$a, reason: collision with other inner class name */
    static final class C0254a extends l implements InterfaceC2171a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final C0254a f19167m = new C0254a();

        C0254a() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1621c invoke() {
            return new C1621c();
        }
    }

    static {
        C0254a c0254a = C0254a.f19167m;
        f19165b = c0254a;
        f19166c = (InterfaceC1620b) c0254a.invoke();
    }

    private C1619a() {
    }

    public static final boolean a() {
        return f19166c.fixStoppedSurfaceRemoveDeleteTreeUIFrameCallbackLeak();
    }

    public static final boolean b() {
        return f19166c.forceBatchingMountItemsOnAndroid();
    }

    public static final boolean c() {
        return f19166c.lazyAnimationCallbacks();
    }

    public static final boolean d() {
        return f19166c.setAndroidLayoutDirection();
    }

    public static final boolean e() {
        return f19166c.useImmediateExecutorInAndroidBridgeless();
    }

    public static final boolean f() {
        return f19166c.useNativeViewConfigsInBridgelessMode();
    }
}
