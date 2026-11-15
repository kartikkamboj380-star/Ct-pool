package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z2.InterfaceC2256a;

/* JADX INFO: renamed from: com.facebook.react.uimanager.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0882j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object f12606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final com.facebook.react.uimanager.events.e f12607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ReactApplicationContext f12608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final C0866b0 f12609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final G0 f12610e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p0 f12611f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final D f12612g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f12613h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f12614i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f12615j;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.j0$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ U f12616m;

        a(U u6) {
            this.f12616m = u6;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0882j0.this.f12609d.b(this.f12616m);
        }
    }

    protected C0882j0(ReactApplicationContext reactApplicationContext, G0 g02, p0 p0Var, com.facebook.react.uimanager.events.e eVar) {
        this.f12606a = new Object();
        C0866b0 c0866b0 = new C0866b0();
        this.f12609d = c0866b0;
        this.f12613h = new int[4];
        this.f12614i = 0L;
        this.f12615j = true;
        this.f12608c = reactApplicationContext;
        this.f12610e = g02;
        this.f12611f = p0Var;
        this.f12612g = new D(p0Var, c0866b0);
        this.f12607b = eVar;
    }

    private void A(U u6) {
        if (u6.m()) {
            for (int i7 = 0; i7 < u6.b(); i7++) {
                A(u6.a(i7));
            }
            u6.W(this.f12612g);
        }
    }

    private void L(U u6) {
        D.j(u6);
        this.f12609d.g(u6.r());
        for (int iB = u6.b() - 1; iB >= 0; iB--) {
            L(u6.a(iB));
        }
        u6.q();
    }

    private void c(U u6) {
        NativeModule nativeModule = (ViewManager) O1.a.c(this.f12610e.c(u6.N()));
        if (!(nativeModule instanceof r)) {
            throw new C0892s("Trying to use view " + u6.N() + " as a parent, but its Manager doesn't extends ViewGroupManager");
        }
        r rVar = (r) nativeModule;
        if (rVar == null || !rVar.needsCustomLayoutForChildren()) {
            return;
        }
        throw new C0892s("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + u6.N() + "). Use measure instead.");
    }

    private boolean e(int i7, String str) {
        if (this.f12609d.c(i7) != null) {
            return true;
        }
        P0.a.G("ReactNative", "Unable to execute operation " + str + " on view with tag: " + i7 + ", since the view does not exist");
        return false;
    }

    private void n() {
        if (this.f12611f.U()) {
            m(-1);
        }
    }

    private void y(int i7, int i8, int[] iArr) {
        U uC = this.f12609d.c(i7);
        U uC2 = this.f12609d.c(i8);
        if (uC == null || uC2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tag ");
            if (uC != null) {
                i7 = i8;
            }
            sb.append(i7);
            sb.append(" does not exist");
            throw new C0892s(sb.toString());
        }
        if (uC != uC2) {
            for (U parent = uC.getParent(); parent != uC2; parent = parent.getParent()) {
                if (parent == null) {
                    throw new C0892s("Tag " + i8 + " is not an ancestor of tag " + i7);
                }
            }
        }
        z(uC, uC2, iArr);
    }

    private void z(U u6, U u7, int[] iArr) {
        int iRound;
        int iRound2;
        if (u6 == u7 || u6.u()) {
            iRound = 0;
            iRound2 = 0;
        } else {
            iRound = Math.round(u6.U());
            iRound2 = Math.round(u6.Q());
            for (U parent = u6.getParent(); parent != u7; parent = parent.getParent()) {
                O1.a.c(parent);
                c(parent);
                iRound += Math.round(parent.U());
                iRound2 += Math.round(parent.Q());
            }
            c(u7);
        }
        iArr[0] = iRound;
        iArr[1] = iRound2;
        iArr[2] = u6.C();
        iArr[3] = u6.d();
    }

    public void B() {
        this.f12615j = false;
        this.f12610e.f();
    }

    public void C() {
    }

    public void D() {
        this.f12611f.V();
    }

    public void E() {
        this.f12611f.Y();
    }

    public void F(InterfaceC0880i0 interfaceC0880i0) {
        this.f12611f.W(interfaceC0880i0);
    }

    public void G() {
        this.f12611f.X();
    }

    public void H(View view, int i7, C0872e0 c0872e0) {
        synchronized (this.f12606a) {
            U uH = h();
            uH.P(i7);
            uH.A(c0872e0);
            c0872e0.runOnNativeModulesQueueThread(new a(uH));
            this.f12611f.y(i7, view);
        }
    }

    public void I(int i7) {
        synchronized (this.f12606a) {
            this.f12609d.h(i7);
        }
    }

    public void J(int i7) {
        I(i7);
        this.f12611f.J(i7);
    }

    protected final void K(U u6) {
        L(u6);
        u6.c();
    }

    public int M(int i7) {
        if (this.f12609d.f(i7)) {
            return i7;
        }
        U uN = N(i7);
        if (uN != null) {
            return uN.I();
        }
        P0.a.G("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i7);
        return 0;
    }

    public final U N(int i7) {
        return this.f12609d.c(i7);
    }

    protected final ViewManager O(String str) {
        return this.f12610e.e(str);
    }

    public void P(int i7, int i8) {
        this.f12611f.K(i7, i8);
    }

    public void Q(int i7, ReadableArray readableArray) {
        if (this.f12615j) {
            synchronized (this.f12606a) {
                try {
                    U uC = this.f12609d.c(i7);
                    for (int i8 = 0; i8 < readableArray.size(); i8++) {
                        U uC2 = this.f12609d.c(readableArray.getInt(i8));
                        if (uC2 == null) {
                            throw new C0892s("Trying to add unknown view tag: " + readableArray.getInt(i8));
                        }
                        uC.J(uC2, i8);
                    }
                    this.f12612g.k(uC, readableArray);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void R(int i7, boolean z6) {
        U uC = this.f12609d.c(i7);
        if (uC == null) {
            return;
        }
        while (uC.H() == B.f12246o) {
            uC = uC.getParent();
        }
        this.f12611f.L(uC.r(), i7, z6);
    }

    public void S(boolean z6) {
        this.f12611f.M(z6);
    }

    public void T(InterfaceC2256a interfaceC2256a) {
        this.f12611f.Z(interfaceC2256a);
    }

    public void U(int i7, Object obj) {
        U uC = this.f12609d.c(i7);
        if (uC != null) {
            uC.F(obj);
            n();
        } else {
            P0.a.G("ReactNative", "Attempt to set local data for view with unknown tag: " + i7);
        }
    }

    public void V(int i7, W w6) {
        UiThreadUtil.assertOnUiThread();
        this.f12611f.S().C(i7, w6);
    }

    public void W(int i7, int i8, int i9) {
        U uC = this.f12609d.c(i7);
        if (uC != null) {
            uC.B(i8);
            uC.g(i9);
            n();
        } else {
            P0.a.G("ReactNative", "Tried to update size of non-existent tag: " + i7);
        }
    }

    public void X(int i7, int i8, int i9) {
        U uC = this.f12609d.c(i7);
        if (uC != null) {
            Y(uC, i8, i9);
            return;
        }
        P0.a.G("ReactNative", "Tried to update non-existent root tag: " + i7);
    }

    public void Y(U u6, int i7, int i8) {
        u6.h(i7, i8);
    }

    public void Z(int i7, String str, ReadableMap readableMap) {
        if (this.f12615j) {
            if (this.f12610e.c(str) == null) {
                throw new C0892s("Got unknown view type: " + str);
            }
            U uC = this.f12609d.c(i7);
            if (uC == null) {
                throw new C0892s("Trying to update non-existent view with tag " + i7);
            }
            if (readableMap != null) {
                W w6 = new W(readableMap);
                uC.b0(w6);
                t(uC, str, w6);
            }
        }
    }

    public void a(InterfaceC0880i0 interfaceC0880i0) {
        this.f12611f.N(interfaceC0880i0);
    }

    protected void a0() {
        P2.a.c(0L, "UIImplementation.updateViewHierarchy");
        for (int i7 = 0; i7 < this.f12609d.d(); i7++) {
            try {
                U uC = this.f12609d.c(this.f12609d.e(i7));
                if (uC.getWidthMeasureSpec() != null && uC.getHeightMeasureSpec() != null) {
                    P2.b.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive").a("rootTag", uC.r()).c();
                    try {
                        A(uC);
                        P2.a.g(0L);
                        d(uC);
                        P2.b.a(0L, "UIImplementation.applyUpdatesRecursive").a("rootTag", uC.r()).c();
                        try {
                            ArrayList<U> arrayList = new ArrayList();
                            b(uC, 0.0f, 0.0f, arrayList);
                            for (U u6 : arrayList) {
                                this.f12607b.c(F.c(-1, u6.r(), u6.S(), u6.E(), u6.C(), u6.d()));
                            }
                            P2.a.g(0L);
                        } finally {
                        }
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void b(U u6, float f7, float f8, List list) {
        if (u6.m()) {
            if (u6.K(f7, f8) && u6.L() && !this.f12609d.f(u6.r())) {
                list.add(u6);
            }
            Iterable iterableO = u6.o();
            if (iterableO != null) {
                Iterator it = iterableO.iterator();
                while (it.hasNext()) {
                    b((U) it.next(), u6.U() + f7, u6.Q() + f8, list);
                }
            }
            u6.p(f7, f8, this.f12611f, this.f12612g);
            u6.e();
            this.f12612g.p(u6);
        }
    }

    public void b0(int i7, int i8, Callback callback) {
        U uC = this.f12609d.c(i7);
        U uC2 = this.f12609d.c(i8);
        if (uC == null || uC2 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(uC.Y(uC2)));
        }
    }

    protected void d(U u6) {
        P2.b.a(0L, "cssRoot.calculateLayout").a("rootTag", u6.r()).c();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            int iIntValue = u6.getWidthMeasureSpec().intValue();
            int iIntValue2 = u6.getHeightMeasureSpec().intValue();
            float size = Float.NaN;
            float size2 = View.MeasureSpec.getMode(iIntValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(iIntValue);
            if (View.MeasureSpec.getMode(iIntValue2) != 0) {
                size = View.MeasureSpec.getSize(iIntValue2);
            }
            u6.R(size2, size);
        } finally {
            P2.a.g(0L);
            this.f12614i = SystemClock.uptimeMillis() - jUptimeMillis;
        }
    }

    public void f() {
        this.f12611f.A();
    }

    public void g(ReadableMap readableMap, Callback callback) {
        this.f12611f.B(readableMap, callback);
    }

    protected U h() {
        V v6 = new V();
        if (com.facebook.react.modules.i18nmanager.a.f().i(this.f12608c)) {
            v6.k(com.facebook.yoga.h.RTL);
        }
        v6.j("Root");
        return v6;
    }

    protected U i(String str) {
        return this.f12610e.c(str).createShadowNodeInstance(this.f12608c);
    }

    public void j(int i7, String str, int i8, ReadableMap readableMap) {
        W w6;
        if (this.f12615j) {
            synchronized (this.f12606a) {
                try {
                    U uI = i(str);
                    U uC = this.f12609d.c(i8);
                    O1.a.d(uC, "Root node with tag " + i8 + " doesn't exist");
                    uI.P(i7);
                    uI.j(str);
                    uI.z(uC.r());
                    uI.A(uC.G());
                    this.f12609d.a(uI);
                    if (readableMap != null) {
                        w6 = new W(readableMap);
                        uI.b0(w6);
                    } else {
                        w6 = null;
                    }
                    s(uI, i8, w6);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void k(int i7, int i8, ReadableArray readableArray) {
        if (e(i7, "dispatchViewManagerCommand: " + i8)) {
            this.f12611f.D(i7, i8, readableArray);
        }
    }

    public void l(int i7, String str, ReadableArray readableArray) {
        if (e(i7, "dispatchViewManagerCommand: " + str)) {
            this.f12611f.E(i7, str, readableArray);
        }
    }

    public void m(int i7) {
        P2.b.a(0L, "UIImplementation.dispatchViewUpdates").a("batchId", i7).c();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            a0();
            this.f12612g.o();
            this.f12611f.z(i7, jUptimeMillis, this.f12614i);
        } finally {
            P2.a.g(0L);
        }
    }

    public void o(int i7, float f7, float f8, Callback callback) {
        this.f12611f.F(i7, f7, f8, callback);
    }

    public Map p() {
        return this.f12611f.T();
    }

    public int q() {
        return this.f12611f.S().p();
    }

    p0 r() {
        return this.f12611f;
    }

    protected void s(U u6, int i7, W w6) {
        if (u6.u()) {
            return;
        }
        this.f12612g.g(u6, u6.G(), w6);
    }

    protected void t(U u6, String str, W w6) {
        if (u6.u()) {
            return;
        }
        this.f12612g.m(u6, str, w6);
    }

    public void u(int i7, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        ReadableArray readableArray6 = readableArray;
        if (!this.f12615j) {
            return;
        }
        synchronized (this.f12606a) {
            try {
                U uC = this.f12609d.c(i7);
                int size = readableArray6 == null ? 0 : readableArray.size();
                int size2 = readableArray3 == null ? 0 : readableArray3.size();
                int size3 = readableArray5 == null ? 0 : readableArray5.size();
                if (size != 0 && (readableArray2 == null || size != readableArray2.size())) {
                    throw new C0892s("Size of moveFrom != size of moveTo!");
                }
                if (size2 != 0 && (readableArray4 == null || size2 != readableArray4.size())) {
                    throw new C0892s("Size of addChildTags != size of addAtIndices!");
                }
                int i8 = size + size2;
                y0[] y0VarArr = new y0[i8];
                int i9 = size + size3;
                int[] iArr = new int[i9];
                try {
                    int[] iArr2 = new int[i9];
                    int[] iArr3 = new int[size3];
                    if (size > 0) {
                        O1.a.c(readableArray);
                        O1.a.c(readableArray2);
                        int i10 = 0;
                        while (i10 < size) {
                            int i11 = i9;
                            int i12 = readableArray6.getInt(i10);
                            int iR = uC.a(i12).r();
                            y0VarArr[i10] = new y0(iR, readableArray2.getInt(i10));
                            iArr[i10] = i12;
                            iArr2[i10] = iR;
                            i10++;
                            readableArray6 = readableArray;
                            i9 = i11;
                            iArr3 = iArr3;
                            uC = uC;
                        }
                    }
                    U u6 = uC;
                    int[] iArr4 = iArr3;
                    int i13 = i9;
                    if (size2 > 0) {
                        O1.a.c(readableArray3);
                        O1.a.c(readableArray4);
                        for (int i14 = 0; i14 < size2; i14++) {
                            y0VarArr[size + i14] = new y0(readableArray3.getInt(i14), readableArray4.getInt(i14));
                        }
                    }
                    if (size3 > 0) {
                        O1.a.c(readableArray5);
                        int i15 = 0;
                        while (i15 < size3) {
                            int i16 = readableArray5.getInt(i15);
                            U u7 = u6;
                            int iR2 = u7.a(i16).r();
                            int i17 = size + i15;
                            iArr[i17] = i16;
                            iArr2[i17] = iR2;
                            iArr4[i15] = iR2;
                            i15++;
                            u6 = u7;
                        }
                    }
                    U u8 = u6;
                    Arrays.sort(y0VarArr, y0.f12744c);
                    Arrays.sort(iArr);
                    int i18 = -1;
                    for (int i19 = i13 - 1; i19 >= 0; i19--) {
                        int i20 = iArr[i19];
                        if (i20 == i18) {
                            throw new C0892s("Repeated indices in Removal list for view tag: " + i7);
                        }
                        u8.f(i20);
                        i18 = iArr[i19];
                    }
                    int i21 = 0;
                    while (i21 < i8) {
                        y0 y0Var = y0VarArr[i21];
                        int[] iArr5 = iArr2;
                        U uC2 = this.f12609d.c(y0Var.f12745a);
                        if (uC2 == null) {
                            throw new C0892s("Trying to add unknown view tag: " + y0Var.f12745a);
                        }
                        u8.J(uC2, y0Var.f12746b);
                        i21++;
                        iArr2 = iArr5;
                    }
                    this.f12612g.i(u8, iArr, iArr2, y0VarArr, iArr4);
                    for (int i22 = 0; i22 < size3; i22++) {
                        K(this.f12609d.c(iArr4[i22]));
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public void v(int i7, Callback callback) {
        if (this.f12615j) {
            this.f12611f.H(i7, callback);
        }
    }

    public void w(int i7, Callback callback) {
        if (this.f12615j) {
            this.f12611f.I(i7, callback);
        }
    }

    public void x(int i7, int i8, Callback callback, Callback callback2) {
        if (this.f12615j) {
            try {
                y(i7, i8, this.f12613h);
                callback2.invoke(Float.valueOf(G.b(this.f12613h[0])), Float.valueOf(G.b(this.f12613h[1])), Float.valueOf(G.b(this.f12613h[2])), Float.valueOf(G.b(this.f12613h[3])));
            } catch (C0892s e7) {
                callback.invoke(e7.getMessage());
            }
        }
    }

    C0882j0(ReactApplicationContext reactApplicationContext, G0 g02, com.facebook.react.uimanager.events.e eVar, int i7) {
        this(reactApplicationContext, g02, new p0(reactApplicationContext, new C(g02), i7), eVar);
    }
}
