package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.core.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import z2.InterfaceC2256a;

/* JADX INFO: loaded from: classes.dex */
public class p0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f12622A = "p0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f12624b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f12627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ReactApplicationContext f12628f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InterfaceC2256a f12633k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f12637o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f12638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f12639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f12640r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f12641s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f12642t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f12643u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f12644v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f12645w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f12646x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f12647y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f12648z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f12623a = new int[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f12625c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f12626d = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f12629g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f12630h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f12631i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayDeque f12632j = new ArrayDeque();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f12634l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f12635m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f12636n = false;

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f12649m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ArrayList f12650n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ ArrayDeque f12651o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ ArrayList f12652p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f12653q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f12654r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ long f12655s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f12656t;

        a(int i7, ArrayList arrayList, ArrayDeque arrayDeque, ArrayList arrayList2, long j7, long j8, long j9, long j10) {
            this.f12649m = i7;
            this.f12650n = arrayList;
            this.f12651o = arrayDeque;
            this.f12652p = arrayList2;
            this.f12653q = j7;
            this.f12654r = j8;
            this.f12655s = j9;
            this.f12656t = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReactNoCrashSoftException reactNoCrashSoftException;
            String str;
            P2.b.a(0L, "DispatchUI").a("BatchId", this.f12649m).c();
            try {
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    ArrayList<g> arrayList = this.f12650n;
                    if (arrayList != null) {
                        for (g gVar : arrayList) {
                            try {
                                gVar.c();
                            } catch (RetryableMountingLayerException e7) {
                                if (gVar.a() == 0) {
                                    gVar.b();
                                    p0.this.f12629g.add(gVar);
                                } else {
                                    str = p0.f12622A;
                                    reactNoCrashSoftException = new ReactNoCrashSoftException(e7);
                                    ReactSoftExceptionLogger.logSoftException(str, reactNoCrashSoftException);
                                }
                            } catch (Throwable th) {
                                reactNoCrashSoftException = th;
                                str = p0.f12622A;
                                ReactSoftExceptionLogger.logSoftException(str, reactNoCrashSoftException);
                            }
                        }
                    }
                    ArrayDeque arrayDeque = this.f12651o;
                    if (arrayDeque != null) {
                        Iterator it = arrayDeque.iterator();
                        while (it.hasNext()) {
                            ((r) it.next()).f();
                        }
                    }
                    ArrayList arrayList2 = this.f12652p;
                    if (arrayList2 != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((r) it2.next()).f();
                        }
                    }
                    if (p0.this.f12636n && p0.this.f12638p == 0) {
                        p0.this.f12638p = this.f12653q;
                        p0.this.f12639q = SystemClock.uptimeMillis();
                        p0.this.f12640r = this.f12654r;
                        p0.this.f12641s = this.f12655s;
                        p0.this.f12642t = jUptimeMillis;
                        p0 p0Var = p0.this;
                        p0Var.f12643u = p0Var.f12639q;
                        p0.this.f12646x = this.f12656t;
                        P2.a.b(0L, "delayBeforeDispatchViewUpdates", 0, p0.this.f12638p * 1000000);
                        P2.a.f(0L, "delayBeforeDispatchViewUpdates", 0, p0.this.f12641s * 1000000);
                        P2.a.b(0L, "delayBeforeBatchRunStart", 0, p0.this.f12641s * 1000000);
                        P2.a.f(0L, "delayBeforeBatchRunStart", 0, p0.this.f12642t * 1000000);
                    }
                    p0.this.f12624b.f();
                    if (p0.this.f12633k != null) {
                        p0.this.f12633k.b();
                    }
                    P2.a.g(0L);
                } catch (Exception e8) {
                    p0.this.f12635m = true;
                    throw e8;
                }
            } catch (Throwable th2) {
                P2.a.g(0L);
                throw th2;
            }
        }
    }

    class b extends GuardedRunnable {
        b(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            p0.this.R();
        }
    }

    private final class c extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f12659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f12660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f12661e;

        public c(int i7, int i8, boolean z6, boolean z7) {
            super(i7);
            this.f12659c = i8;
            this.f12661e = z6;
            this.f12660d = z7;
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            if (this.f12661e) {
                p0.this.f12624b.e();
            } else {
                p0.this.f12624b.y(this.f12712a, this.f12659c, this.f12660d);
            }
        }
    }

    private class d implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReadableMap f12663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callback f12664b;

        private d(ReadableMap readableMap, Callback callback) {
            this.f12663a = readableMap;
            this.f12664b = callback;
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            p0.this.f12624b.h(this.f12663a, this.f12664b);
        }
    }

    private final class e extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C0872e0 f12666c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f12667d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final W f12668e;

        public e(C0872e0 c0872e0, int i7, String str, W w6) {
            super(i7);
            this.f12666c = c0872e0;
            this.f12667d = str;
            this.f12668e = w6;
            P2.a.j(0L, "createView", this.f12712a);
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            P2.a.d(0L, "createView", this.f12712a);
            p0.this.f12624b.j(this.f12666c, this.f12712a, this.f12667d, this.f12668e);
        }
    }

    private final class f extends v implements g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f12670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ReadableArray f12671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f12672e;

        public f(int i7, int i8, ReadableArray readableArray) {
            super(i7);
            this.f12672e = 0;
            this.f12670c = i8;
            this.f12671d = readableArray;
        }

        @Override // com.facebook.react.uimanager.p0.g
        public int a() {
            return this.f12672e;
        }

        @Override // com.facebook.react.uimanager.p0.g
        public void b() {
            this.f12672e++;
        }

        @Override // com.facebook.react.uimanager.p0.g
        public void c() {
            p0.this.f12624b.k(this.f12712a, this.f12670c, this.f12671d);
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            try {
                p0.this.f12624b.k(this.f12712a, this.f12670c, this.f12671d);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(p0.f12622A, new RuntimeException("Error dispatching View Command", th));
            }
        }
    }

    private interface g {
        int a();

        void b();

        void c();
    }

    private final class h extends v implements g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f12674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ReadableArray f12675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f12676e;

        public h(int i7, String str, ReadableArray readableArray) {
            super(i7);
            this.f12676e = 0;
            this.f12674c = str;
            this.f12675d = readableArray;
        }

        @Override // com.facebook.react.uimanager.p0.g
        public int a() {
            return this.f12676e;
        }

        @Override // com.facebook.react.uimanager.p0.g
        public void b() {
            this.f12676e++;
        }

        @Override // com.facebook.react.uimanager.p0.g
        public void c() {
            p0.this.f12624b.l(this.f12712a, this.f12674c, this.f12675d);
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            try {
                p0.this.f12624b.l(this.f12712a, this.f12674c, this.f12675d);
            } catch (Throwable th) {
                ReactSoftExceptionLogger.logSoftException(p0.f12622A, new RuntimeException("Error dispatching View Command", th));
            }
        }
    }

    private class i extends AbstractChoreographerFrameCallbackC0890p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12678b;

        private i(ReactContext reactContext, int i7) {
            super(reactContext);
            this.f12678b = i7;
        }

        private void b(long j7) throws Exception {
            r rVar;
            while (16 - ((System.nanoTime() - j7) / 1000000) >= this.f12678b) {
                synchronized (p0.this.f12626d) {
                    try {
                        if (p0.this.f12632j.isEmpty()) {
                            return;
                        } else {
                            rVar = (r) p0.this.f12632j.pollFirst();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    rVar.f();
                    p0.this.f12637o += SystemClock.uptimeMillis() - jUptimeMillis;
                } catch (Exception e7) {
                    p0.this.f12635m = true;
                    throw e7;
                }
            }
        }

        @Override // com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC0890p
        public void a(long j7) {
            if (p0.this.f12635m) {
                P0.a.G("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            P2.a.c(0L, "dispatchNonBatchedUIOperations");
            try {
                b(j7);
                P2.a.g(0L);
                p0.this.R();
                com.facebook.react.modules.core.a.h().m(a.b.DISPATCH_UI, this);
            } catch (Throwable th) {
                P2.a.g(0L);
                throw th;
            }
        }
    }

    private final class j implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f12681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f12682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Callback f12683d;

        private j(int i7, float f7, float f8, Callback callback) {
            this.f12680a = i7;
            this.f12681b = f7;
            this.f12682c = f8;
            this.f12683d = callback;
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            try {
                p0.this.f12624b.s(this.f12680a, p0.this.f12623a);
                float f7 = p0.this.f12623a[0];
                float f8 = p0.this.f12623a[1];
                int iN = p0.this.f12624b.n(this.f12680a, this.f12681b, this.f12682c);
                try {
                    p0.this.f12624b.s(iN, p0.this.f12623a);
                    this.f12683d.invoke(Integer.valueOf(iN), Float.valueOf(G.b(p0.this.f12623a[0] - f7)), Float.valueOf(G.b(p0.this.f12623a[1] - f8)), Float.valueOf(G.b(p0.this.f12623a[2])), Float.valueOf(G.b(p0.this.f12623a[3])));
                } catch (C0892s unused) {
                    this.f12683d.invoke(new Object[0]);
                }
            } catch (C0892s unused2) {
                this.f12683d.invoke(new Object[0]);
            }
        }
    }

    private final class k extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f12685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final y0[] f12686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f12687e;

        public k(int i7, int[] iArr, y0[] y0VarArr, int[] iArr2) {
            super(i7);
            this.f12685c = iArr;
            this.f12686d = y0VarArr;
            this.f12687e = iArr2;
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            p0.this.f12624b.q(this.f12712a, this.f12685c, this.f12686d, this.f12687e);
        }
    }

    private final class l implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callback f12690b;

        private l(int i7, Callback callback) {
            this.f12689a = i7;
            this.f12690b = callback;
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            try {
                p0.this.f12624b.t(this.f12689a, p0.this.f12623a);
                this.f12690b.invoke(Float.valueOf(G.b(p0.this.f12623a[0])), Float.valueOf(G.b(p0.this.f12623a[1])), Float.valueOf(G.b(p0.this.f12623a[2])), Float.valueOf(G.b(p0.this.f12623a[3])));
            } catch (E unused) {
                this.f12690b.invoke(new Object[0]);
            }
        }
    }

    private final class m implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callback f12693b;

        private m(int i7, Callback callback) {
            this.f12692a = i7;
            this.f12693b = callback;
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            try {
                p0.this.f12624b.s(this.f12692a, p0.this.f12623a);
                this.f12693b.invoke(0, 0, Float.valueOf(G.b(p0.this.f12623a[2])), Float.valueOf(G.b(p0.this.f12623a[3])), Float.valueOf(G.b(p0.this.f12623a[0])), Float.valueOf(G.b(p0.this.f12623a[1])));
            } catch (E unused) {
                this.f12693b.invoke(new Object[0]);
            }
        }
    }

    private final class n extends v {
        public n(int i7) {
            super(i7);
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            p0.this.f12624b.u(this.f12712a);
        }
    }

    private final class o extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f12696c;

        private o(int i7, int i8) {
            super(i7);
            this.f12696c = i8;
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            try {
                p0.this.f12624b.x(this.f12712a, this.f12696c);
            } catch (RetryableMountingLayerException e7) {
                ReactSoftExceptionLogger.logSoftException(p0.f12622A, e7);
            }
        }
    }

    private class p implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f12698a;

        private p(boolean z6) {
            this.f12698a = z6;
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            p0.this.f12624b.z(this.f12698a);
        }
    }

    private class q implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0880i0 f12700a;

        public q(InterfaceC0880i0 interfaceC0880i0) {
            this.f12700a = interfaceC0880i0;
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            this.f12700a.a(p0.this.f12624b);
        }
    }

    public interface r {
        void f();
    }

    private final class s extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f12702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f12703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f12704e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f12705f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f12706g;

        public s(int i7, int i8, int i9, int i10, int i11, int i12) {
            super(i8);
            this.f12702c = i7;
            this.f12703d = i9;
            this.f12704e = i10;
            this.f12705f = i11;
            this.f12706g = i12;
            P2.a.j(0L, "updateLayout", this.f12712a);
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            P2.a.d(0L, "updateLayout", this.f12712a);
            p0.this.f12624b.A(this.f12702c, this.f12712a, this.f12703d, this.f12704e, this.f12705f, this.f12706g);
        }
    }

    private final class t extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final W f12708c;

        private t(int i7, W w6) {
            super(i7);
            this.f12708c = w6;
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            p0.this.f12624b.C(this.f12712a, this.f12708c);
        }
    }

    private final class u extends v {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f12710c;

        public u(int i7, Object obj) {
            super(i7);
            this.f12710c = obj;
        }

        @Override // com.facebook.react.uimanager.p0.r
        public void f() {
            p0.this.f12624b.D(this.f12712a, this.f12710c);
        }
    }

    private abstract class v implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12712a;

        public v(int i7) {
            this.f12712a = i7;
        }
    }

    public p0(ReactApplicationContext reactApplicationContext, C c7, int i7) {
        this.f12624b = c7;
        this.f12627e = new i(reactApplicationContext, i7 == -1 ? 8 : i7);
        this.f12628f = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        if (this.f12635m) {
            P0.a.G("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.f12625c) {
            if (this.f12631i.isEmpty()) {
                return;
            }
            ArrayList arrayList = this.f12631i;
            this.f12631i = new ArrayList();
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (this.f12636n) {
                this.f12644v = SystemClock.uptimeMillis() - jUptimeMillis;
                this.f12645w = this.f12637o;
                this.f12636n = false;
                P2.a.b(0L, "batchedExecutionTime", 0, jUptimeMillis * 1000000);
                P2.a.e(0L, "batchedExecutionTime", 0);
            }
            this.f12637o = 0L;
        }
    }

    public void A() {
        this.f12630h.add(new c(0, 0, true, false));
    }

    public void B(ReadableMap readableMap, Callback callback) {
        this.f12630h.add(new d(readableMap, callback));
    }

    public void C(C0872e0 c0872e0, int i7, String str, W w6) {
        synchronized (this.f12626d) {
            this.f12647y++;
            this.f12632j.addLast(new e(c0872e0, i7, str, w6));
        }
    }

    public void D(int i7, int i8, ReadableArray readableArray) {
        this.f12629g.add(new f(i7, i8, readableArray));
    }

    public void E(int i7, String str, ReadableArray readableArray) {
        this.f12629g.add(new h(i7, str, readableArray));
    }

    public void F(int i7, float f7, float f8, Callback callback) {
        this.f12630h.add(new j(i7, f7, f8, callback));
    }

    public void G(int i7, int[] iArr, y0[] y0VarArr, int[] iArr2) {
        this.f12630h.add(new k(i7, iArr, y0VarArr, iArr2));
    }

    public void H(int i7, Callback callback) {
        this.f12630h.add(new m(i7, callback));
    }

    public void I(int i7, Callback callback) {
        this.f12630h.add(new l(i7, callback));
    }

    public void J(int i7) {
        this.f12630h.add(new n(i7));
    }

    public void K(int i7, int i8) {
        this.f12630h.add(new o(i7, i8));
    }

    public void L(int i7, int i8, boolean z6) {
        this.f12630h.add(new c(i7, i8, false, z6));
    }

    public void M(boolean z6) {
        this.f12630h.add(new p(z6));
    }

    public void N(InterfaceC0880i0 interfaceC0880i0) {
        this.f12630h.add(new q(interfaceC0880i0));
    }

    public void O(int i7, Object obj) {
        this.f12630h.add(new u(i7, obj));
    }

    public void P(int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f12630h.add(new s(i7, i8, i9, i10, i11, i12));
    }

    public void Q(int i7, String str, W w6) {
        this.f12648z++;
        this.f12630h.add(new t(i7, w6));
    }

    C S() {
        return this.f12624b;
    }

    public Map T() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.f12638p));
        map.put("CommitEndTime", Long.valueOf(this.f12639q));
        map.put("LayoutTime", Long.valueOf(this.f12640r));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.f12641s));
        map.put("RunStartTime", Long.valueOf(this.f12642t));
        map.put("RunEndTime", Long.valueOf(this.f12643u));
        map.put("BatchedExecutionTime", Long.valueOf(this.f12644v));
        map.put("NonBatchedExecutionTime", Long.valueOf(this.f12645w));
        map.put("NativeModulesThreadCpuTime", Long.valueOf(this.f12646x));
        map.put("CreateViewCount", Long.valueOf(this.f12647y));
        map.put("UpdatePropsCount", Long.valueOf(this.f12648z));
        return map;
    }

    public boolean U() {
        return this.f12630h.isEmpty() && this.f12629g.isEmpty();
    }

    void V() {
        this.f12634l = false;
        com.facebook.react.modules.core.a.h().o(a.b.DISPATCH_UI, this.f12627e);
        R();
    }

    public void W(InterfaceC0880i0 interfaceC0880i0) {
        this.f12630h.add(0, new q(interfaceC0880i0));
    }

    public void X() {
        this.f12636n = true;
        this.f12638p = 0L;
        this.f12647y = 0L;
        this.f12648z = 0L;
    }

    void Y() {
        this.f12634l = true;
        if (ReactFeatureFlags.enableFabricRendererExclusively) {
            return;
        }
        com.facebook.react.modules.core.a.h().m(a.b.DISPATCH_UI, this.f12627e);
    }

    public void Z(InterfaceC2256a interfaceC2256a) {
        this.f12633k = interfaceC2256a;
    }

    public void y(int i7, View view) {
        this.f12624b.b(i7, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public void z(int i7, long j7, long j8) throws Throwable {
        long j9;
        long jUptimeMillis;
        long jCurrentThreadTimeMillis;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayDeque arrayDeque;
        P2.b.a(0L, "UIViewOperationQueue.dispatchViewUpdates").a("batchId", i7).c();
        try {
            jUptimeMillis = SystemClock.uptimeMillis();
            jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            j9 = 0;
            j9 = 0;
            if (this.f12629g.isEmpty()) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = this.f12629g;
                this.f12629g = new ArrayList();
                arrayList = arrayList3;
            }
            if (this.f12630h.isEmpty()) {
                arrayList2 = null;
            } else {
                ArrayList arrayList4 = this.f12630h;
                this.f12630h = new ArrayList();
                arrayList2 = arrayList4;
            }
            synchronized (this.f12626d) {
                try {
                    try {
                        if (!this.f12632j.isEmpty()) {
                            ArrayDeque arrayDeque2 = this.f12632j;
                            this.f12632j = new ArrayDeque();
                            j9 = arrayDeque2;
                        }
                        arrayDeque = j9;
                    } finally {
                        th = th;
                        while (true) {
                            try {
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            InterfaceC2256a interfaceC2256a = this.f12633k;
            if (interfaceC2256a != null) {
                interfaceC2256a.a();
            }
        } catch (Throwable th3) {
            th = th3;
            j9 = 0;
        }
        try {
            a aVar = new a(i7, arrayList, arrayDeque, arrayList2, j7, j8, jUptimeMillis, jCurrentThreadTimeMillis);
            j9 = 0;
            j9 = 0;
            P2.b.a(0L, "acquiring mDispatchRunnablesLock").a("batchId", i7).c();
            synchronized (this.f12625c) {
                P2.a.g(0L);
                this.f12631i.add(aVar);
            }
            if (!this.f12634l) {
                UiThreadUtil.runOnUiThread(new b(this.f12628f));
            }
            P2.a.g(0L);
        } catch (Throwable th4) {
            th = th4;
            j9 = 0;
            P2.a.g(j9);
            throw th;
        }
    }
}
