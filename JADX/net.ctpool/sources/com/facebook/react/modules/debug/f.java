package com.facebook.react.modules.debug;

import android.view.Choreographer;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a f11865n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f11866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Choreographer f11867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UIManagerModule f11868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f11869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f11870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f11871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f11876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f11877l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TreeMap f11878m;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f11881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f11882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final double f11883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final double f11884f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f11885g;

        public b(int i7, int i8, int i9, int i10, double d7, double d8, int i11) {
            this.f11879a = i7;
            this.f11880b = i8;
            this.f11881c = i9;
            this.f11882d = i10;
            this.f11883e = d7;
            this.f11884f = d8;
            this.f11885g = i11;
        }
    }

    public f(ReactContext reactContext) {
        k.f(reactContext, "reactContext");
        this.f11866a = reactContext;
        this.f11868c = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.f11869d = new c();
        this.f11870e = -1L;
        this.f11871f = -1L;
        this.f11877l = 60.0d;
    }

    public static /* synthetic */ void l(f fVar, double d7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            d7 = fVar.f11877l;
        }
        fVar.k(d7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(f fVar) {
        k.f(fVar, "this$0");
        Choreographer choreographer = Choreographer.getInstance();
        fVar.f11867b = choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(f fVar) {
        k.f(fVar, "this$0");
        Choreographer choreographer = Choreographer.getInstance();
        fVar.f11867b = choreographer;
        if (choreographer != null) {
            choreographer.removeFrameCallback(fVar);
        }
    }

    public final int c() {
        return this.f11874i;
    }

    public final int d() {
        return (int) (((this.f11877l * ((double) i())) / ((double) 1000)) + ((double) 1));
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j7) {
        if (this.f11870e == -1) {
            this.f11870e = j7;
        }
        long j8 = this.f11871f;
        this.f11871f = j7;
        if (this.f11869d.d(j8, j7)) {
            this.f11875j++;
        }
        this.f11872g++;
        int iD = d();
        if ((iD - this.f11873h) - 1 >= 4) {
            this.f11874i++;
        }
        if (this.f11876k) {
            O1.a.c(this.f11878m);
            b bVar = new b(g(), h(), iD, this.f11874i, e(), f(), i());
            TreeMap treeMap = this.f11878m;
            if (treeMap != null) {
            }
        }
        this.f11873h = iD;
        Choreographer choreographer = this.f11867b;
        if (choreographer != null) {
            choreographer.postFrameCallback(this);
        }
    }

    public final double e() {
        if (this.f11871f == this.f11870e) {
            return 0.0d;
        }
        return (((double) g()) * 1.0E9d) / (this.f11871f - this.f11870e);
    }

    public final double f() {
        if (this.f11871f == this.f11870e) {
            return 0.0d;
        }
        return (((double) h()) * 1.0E9d) / (this.f11871f - this.f11870e);
    }

    public final int g() {
        return this.f11872g - 1;
    }

    public final int h() {
        return this.f11875j - 1;
    }

    public final int i() {
        return ((int) (this.f11871f - this.f11870e)) / 1000000;
    }

    public final void j() {
        this.f11870e = -1L;
        this.f11871f = -1L;
        this.f11872g = 0;
        this.f11874i = 0;
        this.f11875j = 0;
        this.f11876k = false;
        this.f11878m = null;
    }

    public final void k(double d7) {
        if (!this.f11866a.isBridgeless()) {
            this.f11866a.getCatalystInstance().addBridgeIdleDebugListener(this.f11869d);
        }
        UIManagerModule uIManagerModule = this.f11868c;
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(this.f11869d);
        }
        this.f11877l = d7;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.d
            @Override // java.lang.Runnable
            public final void run() {
                f.m(this.f11863m);
            }
        });
    }

    public final void n() {
        if (!this.f11866a.isBridgeless()) {
            this.f11866a.getCatalystInstance().removeBridgeIdleDebugListener(this.f11869d);
        }
        UIManagerModule uIManagerModule = this.f11868c;
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(null);
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.e
            @Override // java.lang.Runnable
            public final void run() {
                f.o(this.f11864m);
            }
        });
    }
}
