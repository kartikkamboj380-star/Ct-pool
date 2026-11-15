package com.facebook.react.animated;

import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC0890p;
import com.facebook.react.uimanager.C;
import com.facebook.react.uimanager.InterfaceC0880i0;
import com.facebook.react.uimanager.UIManagerModule;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import e2.C1619a;
import i2.InterfaceC1741a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import y2.C2239a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativeAnimatedModuleSpec.NAME)
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    private final AbstractChoreographerFrameCallbackC0890p mAnimatedFrameCallback;
    private boolean mBatchingControlledByJS;
    private volatile long mCurrentBatchNumber;
    private volatile long mCurrentFrameNumber;
    private boolean mEnqueuedAnimationOnFrame;
    private boolean mInitializedForFabric;
    private boolean mInitializedForNonFabric;
    private final AtomicReference<com.facebook.react.animated.p> mNodesManager;
    private int mNumFabricAnimations;
    private int mNumNonFabricAnimations;
    private final A mOperations;
    private final A mPreOperations;
    private final com.facebook.react.modules.core.a mReactChoreographer;
    private int mUIManagerType;

    private class A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue f11172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private B f11173b;

        private A() {
            this.f11172a = new ConcurrentLinkedQueue();
            this.f11173b = null;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[EDGE_INSN: B:22:0x0036->B:18:0x0036 BREAK  A[LOOP:0: B:6:0x000d->B:19:0x0037], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private List b(long j7) {
            B b7;
            if (d()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                B b8 = this.f11173b;
                if (b8 == null) {
                    b7 = (B) this.f11172a.poll();
                    if (b7 == null) {
                        break;
                    }
                    if (b7.b() > j7) {
                        this.f11173b = b7;
                        break;
                    }
                    arrayList.add(b7);
                } else {
                    if (b8.b() > j7) {
                        break;
                    }
                    arrayList.add(this.f11173b);
                    this.f11173b = null;
                    b7 = (B) this.f11172a.poll();
                    if (b7 == null) {
                    }
                }
            }
            return arrayList;
        }

        void a(B b7) {
            this.f11172a.add(b7);
        }

        void c(long j7, com.facebook.react.animated.p pVar) {
            List listB = b(j7);
            if (listB != null) {
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    ((B) it.next()).a(pVar);
                }
            }
        }

        boolean d() {
            return this.f11172a.isEmpty() && this.f11173b == null;
        }
    }

    private abstract class B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f11175a;

        private B() {
            this.f11175a = -1L;
        }

        abstract void a(com.facebook.react.animated.p pVar);

        public long b() {
            return this.f11175a;
        }

        public void c(long j7) {
            this.f11175a = j7;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$a, reason: case insensitive filesystem */
    class C0790a extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11177c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f11178d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0790a(int i7, double d7) {
            super();
            this.f11177c = i7;
            this.f11178d = d7;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.v(this.f11177c, this.f11178d);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$b, reason: case insensitive filesystem */
    class C0791b extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f11181d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0791b(int i7, double d7) {
            super();
            this.f11180c = i7;
            this.f11181d = d7;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.u(this.f11180c, this.f11181d);
        }
    }

    class c extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11183c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i7) {
            super();
            this.f11183c = i7;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.k(this.f11183c);
        }
    }

    class d extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11185c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i7) {
            super();
            this.f11185c = i7;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.j(this.f11185c);
        }
    }

    class e extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ReadableMap f11189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Callback f11190f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i7, int i8, ReadableMap readableMap, Callback callback) {
            super();
            this.f11187c = i7;
            this.f11188d = i8;
            this.f11189e = readableMap;
            this.f11190f = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.w(this.f11187c, this.f11188d, this.f11189e, this.f11190f);
        }
    }

    class f extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11192c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i7) {
            super();
            this.f11192c = i7;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.y(this.f11192c);
        }
    }

    class g extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11195d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i7, int i8) {
            super();
            this.f11194c = i7;
            this.f11195d = i8;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.e(this.f11194c, this.f11195d);
        }
    }

    class h extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11198d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i7, int i8) {
            super();
            this.f11197c = i7;
            this.f11198d = i8;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.h(this.f11197c, this.f11198d);
        }
    }

    class i extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11200c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11201d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i7, int i8) {
            super();
            this.f11200c = i7;
            this.f11201d = i8;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.d(this.f11200c, this.f11201d);
        }
    }

    class j extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f11204d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i7, int i8) {
            super();
            this.f11203c = i7;
            this.f11204d = i8;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.g(this.f11203c, this.f11204d);
        }
    }

    class k extends AbstractChoreographerFrameCallbackC0890p {
        k(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC0890p
        protected void a(long j7) {
            try {
                NativeAnimatedModule.this.mEnqueuedAnimationOnFrame = false;
                com.facebook.react.animated.p nodesManager = NativeAnimatedModule.this.getNodesManager();
                if (nodesManager != null && nodesManager.o()) {
                    nodesManager.t(j7);
                }
                if (nodesManager != null && NativeAnimatedModule.this.mReactChoreographer != null) {
                    if (!C1619a.c() || nodesManager.o()) {
                        NativeAnimatedModule.this.enqueueFrameCallback();
                    }
                }
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    class l extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11207c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i7) {
            super();
            this.f11207c = i7;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.s(this.f11207c);
        }
    }

    class m extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f11210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ReadableMap f11211e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i7, String str, ReadableMap readableMap) {
            super();
            this.f11209c = i7;
            this.f11210d = str;
            this.f11211e = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.c(this.f11209c, this.f11210d, this.f11211e);
        }
    }

    class n extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f11214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f11215e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i7, String str, int i8) {
            super();
            this.f11213c = i7;
            this.f11214d = str;
            this.f11215e = i8;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.r(this.f11213c, this.f11214d, this.f11215e);
        }
    }

    class o extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Callback f11218d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i7, Callback callback) {
            super();
            this.f11217c = i7;
            this.f11218d = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.m(this.f11217c, this.f11218d);
        }
    }

    class p extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReadableArray f11221d;

        class a implements com.facebook.react.animated.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f11223a;

            a(int i7) {
                this.f11223a = i7;
            }

            @Override // com.facebook.react.animated.c
            public void a(double d7) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("tag", this.f11223a);
                writableMapCreateMap.putDouble("value", d7);
                ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn != null) {
                    reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(int i7, ReadableArray readableArray) {
            super();
            this.f11220c = i7;
            this.f11221d = readableArray;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            int i7 = 0;
            while (i7 < this.f11220c) {
                int i8 = i7 + 1;
                switch (q.f11225a[z.h(this.f11221d.getInt(i7)).ordinal()]) {
                    case 1:
                        i7 += 2;
                        pVar.m(this.f11221d.getInt(i8), null);
                        break;
                    case 2:
                        i7 += 2;
                        int i9 = this.f11221d.getInt(i8);
                        pVar.x(i9, new a(i9));
                        break;
                    case 3:
                        i7 += 2;
                        pVar.A(this.f11221d.getInt(i8));
                        break;
                    case 4:
                        i7 += 2;
                        pVar.y(this.f11221d.getInt(i8));
                        break;
                    case 5:
                        i7 += 2;
                        pVar.k(this.f11221d.getInt(i8));
                        break;
                    case 6:
                        i7 += 2;
                        pVar.j(this.f11221d.getInt(i8));
                        break;
                    case 7:
                        i7 += 2;
                        pVar.s(this.f11221d.getInt(i8));
                        break;
                    case 8:
                        i7 += 2;
                        pVar.i(this.f11221d.getInt(i8));
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                    case 10:
                        i7 += 2;
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                        int i10 = i7 + 2;
                        i7 += 3;
                        pVar.f(this.f11221d.getInt(i8), this.f11221d.getMap(i10));
                        break;
                    case 12:
                        int i11 = i7 + 2;
                        i7 += 3;
                        pVar.B(this.f11221d.getInt(i8), this.f11221d.getMap(i11));
                        break;
                    case 13:
                        int i12 = i7 + 2;
                        i7 += 3;
                        pVar.e(this.f11221d.getInt(i8), this.f11221d.getInt(i12));
                        break;
                    case 14:
                        int i13 = i7 + 2;
                        i7 += 3;
                        pVar.h(this.f11221d.getInt(i8), this.f11221d.getInt(i13));
                        break;
                    case 15:
                    case 16:
                        int i14 = i7 + 2;
                        i7 += 3;
                        pVar.v(this.f11221d.getInt(i8), this.f11221d.getDouble(i14));
                        break;
                    case 17:
                        int i15 = i7 + 2;
                        int i16 = this.f11221d.getInt(i8);
                        i7 += 3;
                        int i17 = this.f11221d.getInt(i15);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i17);
                        pVar.g(i16, i17);
                        break;
                    case ConnectionResult.SERVICE_UPDATING /* 18 */:
                        if (C1619a.c()) {
                            NativeAnimatedModule.this.enqueueFrameCallback();
                        }
                        int i18 = this.f11221d.getInt(i8);
                        int i19 = i7 + 3;
                        int i20 = this.f11221d.getInt(i7 + 2);
                        i7 += 4;
                        pVar.w(i18, i20, this.f11221d.getMap(i19), null);
                        break;
                    case 19:
                        int i21 = this.f11221d.getInt(i8);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i21);
                        int i22 = i7 + 3;
                        String string = this.f11221d.getString(i7 + 2);
                        i7 += 4;
                        pVar.r(i21, string, this.f11221d.getInt(i22));
                        break;
                    case 20:
                        int i23 = i7 + 2;
                        i7 += 3;
                        pVar.d(this.f11221d.getInt(i8), this.f11221d.getInt(i23));
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        int i24 = this.f11221d.getInt(i8);
                        int i25 = i7 + 3;
                        String string2 = this.f11221d.getString(i7 + 2);
                        i7 += 4;
                        pVar.c(i24, string2, this.f11221d.getMap(i25));
                        break;
                    default:
                        throw new IllegalArgumentException("Batch animation execution op: unknown op code");
                }
            }
        }
    }

    static /* synthetic */ class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11225a;

        static {
            int[] iArr = new int[z.values().length];
            f11225a = iArr;
            try {
                iArr[z.OP_CODE_GET_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11225a[z.OP_START_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11225a[z.OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11225a[z.OP_CODE_STOP_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11225a[z.OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11225a[z.OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11225a[z.OP_CODE_RESTORE_DEFAULT_VALUES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11225a[z.OP_CODE_DROP_ANIMATED_NODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11225a[z.OP_CODE_ADD_LISTENER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11225a[z.OP_CODE_REMOVE_LISTENERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f11225a[z.OP_CODE_CREATE_ANIMATED_NODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11225a[z.OP_CODE_UPDATE_ANIMATED_NODE_CONFIG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11225a[z.OP_CODE_CONNECT_ANIMATED_NODES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11225a[z.OP_CODE_DISCONNECT_ANIMATED_NODES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f11225a[z.OP_CODE_SET_ANIMATED_NODE_VALUE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f11225a[z.OP_CODE_SET_ANIMATED_NODE_OFFSET.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f11225a[z.OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f11225a[z.OP_CODE_START_ANIMATING_NODE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f11225a[z.OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f11225a[z.OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f11225a[z.OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    class r implements InterfaceC0880i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f11226a;

        r(long j7) {
            this.f11226a = j7;
        }

        @Override // com.facebook.react.uimanager.InterfaceC0880i0
        public void a(C c7) {
            NativeAnimatedModule.this.mPreOperations.c(this.f11226a, NativeAnimatedModule.this.getNodesManager());
        }
    }

    class s implements InterfaceC0880i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f11228a;

        s(long j7) {
            this.f11228a = j7;
        }

        @Override // com.facebook.react.uimanager.InterfaceC0880i0
        public void a(C c7) {
            NativeAnimatedModule.this.mOperations.c(this.f11228a, NativeAnimatedModule.this.getNodesManager());
        }
    }

    class t extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11230c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReadableMap f11231d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(int i7, ReadableMap readableMap) {
            super();
            this.f11230c = i7;
            this.f11231d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.f(this.f11230c, this.f11231d);
        }
    }

    class u extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReadableMap f11234d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(int i7, ReadableMap readableMap) {
            super();
            this.f11233c = i7;
            this.f11234d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.B(this.f11233c, this.f11234d);
        }
    }

    class v implements com.facebook.react.animated.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11236a;

        v(int i7) {
            this.f11236a = i7;
        }

        @Override // com.facebook.react.animated.c
        public void a(double d7) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("tag", this.f11236a);
            writableMapCreateMap.putDouble("value", d7);
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
            }
        }
    }

    class w extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.animated.c f11239d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(int i7, com.facebook.react.animated.c cVar) {
            super();
            this.f11238c = i7;
            this.f11239d = cVar;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.x(this.f11238c, this.f11239d);
        }
    }

    class x extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11241c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(int i7) {
            super();
            this.f11241c = i7;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.A(this.f11241c);
        }
    }

    class y extends B {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11243c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(int i7) {
            super();
            this.f11243c = i7;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.B
        public void a(com.facebook.react.animated.p pVar) {
            pVar.i(this.f11243c);
        }
    }

    private enum z {
        OP_CODE_CREATE_ANIMATED_NODE(1),
        OP_CODE_UPDATE_ANIMATED_NODE_CONFIG(2),
        OP_CODE_GET_VALUE(3),
        OP_START_LISTENING_TO_ANIMATED_NODE_VALUE(4),
        OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE(5),
        OP_CODE_CONNECT_ANIMATED_NODES(6),
        OP_CODE_DISCONNECT_ANIMATED_NODES(7),
        OP_CODE_START_ANIMATING_NODE(8),
        OP_CODE_STOP_ANIMATION(9),
        OP_CODE_SET_ANIMATED_NODE_VALUE(10),
        OP_CODE_SET_ANIMATED_NODE_OFFSET(11),
        OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET(12),
        OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET(13),
        OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW(14),
        OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW(15),
        OP_CODE_RESTORE_DEFAULT_VALUES(16),
        OP_CODE_DROP_ANIMATED_NODE(17),
        OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW(18),
        OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW(19),
        OP_CODE_ADD_LISTENER(20),
        OP_CODE_REMOVE_LISTENERS(21);


        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private static z[] f11253I = null;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f11268m;

        z(int i7) {
            this.f11268m = i7;
        }

        public static z h(int i7) {
            if (f11253I == null) {
                f11253I = values();
            }
            return f11253I[i7 - 1];
        }
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new A();
        this.mPreOperations = new A();
        this.mNodesManager = new AtomicReference<>();
        this.mBatchingControlledByJS = false;
        this.mInitializedForFabric = false;
        this.mInitializedForNonFabric = false;
        this.mEnqueuedAnimationOnFrame = false;
        this.mUIManagerType = 1;
        this.mNumFabricAnimations = 0;
        this.mNumNonFabricAnimations = 0;
        this.mReactChoreographer = com.facebook.react.modules.core.a.h();
        this.mAnimatedFrameCallback = new k(reactApplicationContext);
    }

    private void addOperation(B b7) {
        b7.c(this.mCurrentBatchNumber);
        this.mOperations.a(b7);
    }

    private void addPreOperation(B b7) {
        b7.c(this.mCurrentBatchNumber);
        this.mPreOperations.a(b7);
    }

    private void addUnbatchedOperation(B b7) {
        b7.c(-1L);
        this.mOperations.a(b7);
    }

    private void clearFrameCallback() {
        ((com.facebook.react.modules.core.a) O1.a.c(this.mReactChoreographer)).o(a.b.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void decrementInFlightAnimationsForViewTag(int i7) {
        if (C2239a.a(i7) == 2) {
            this.mNumFabricAnimations--;
        } else {
            this.mNumNonFabricAnimations--;
        }
        int i8 = this.mNumNonFabricAnimations;
        if (i8 == 0 && this.mNumFabricAnimations > 0 && this.mUIManagerType != 2) {
            this.mUIManagerType = 2;
        } else {
            if (this.mNumFabricAnimations != 0 || i8 <= 0 || this.mUIManagerType == 1) {
                return;
            }
            this.mUIManagerType = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enqueueFrameCallback() {
        if (this.mEnqueuedAnimationOnFrame) {
            return;
        }
        ((com.facebook.react.modules.core.a) O1.a.c(this.mReactChoreographer)).m(a.b.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = true;
    }

    private void initializeLifecycleEventListenersForViewTag(int i7) {
        UIManager uIManagerG;
        int iA = C2239a.a(i7);
        this.mUIManagerType = iA;
        if (iA == 2) {
            this.mNumFabricAnimations++;
        } else {
            this.mNumNonFabricAnimations++;
        }
        com.facebook.react.animated.p nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.p(this.mUIManagerType);
        } else {
            ReactSoftExceptionLogger.logSoftException(NativeAnimatedModuleSpec.NAME, new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if (this.mUIManagerType == 2) {
            if (this.mInitializedForFabric) {
                return;
            }
        } else if (this.mInitializedForNonFabric) {
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (uIManagerG = AbstractC0884k0.g(reactApplicationContext, this.mUIManagerType)) == null) {
            return;
        }
        uIManagerG.addUIManagerEventListener(this);
        if (this.mUIManagerType == 2) {
            this.mInitializedForFabric = true;
        } else {
            this.mInitializedForNonFabric = true;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double d7, String str, ReadableMap readableMap) {
        int i7 = (int) d7;
        initializeLifecycleEventListenersForViewTag(i7);
        addOperation(new m(i7, str, readableMap));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double d7, double d8) {
        int i7 = (int) d8;
        initializeLifecycleEventListenersForViewTag(i7);
        addOperation(new i((int) d7, i7));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double d7, double d8) {
        addOperation(new g((int) d7, (int) d8));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double d7, ReadableMap readableMap) {
        addOperation(new t((int) d7, readableMap));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
        if (this.mUIManagerType != 2) {
            return;
        }
        long j7 = this.mCurrentBatchNumber - 1;
        if (!this.mBatchingControlledByJS) {
            this.mCurrentFrameNumber++;
            if (this.mCurrentFrameNumber - this.mCurrentBatchNumber > 2) {
                this.mCurrentBatchNumber = this.mCurrentFrameNumber;
                j7 = this.mCurrentBatchNumber;
            }
        }
        this.mPreOperations.c(j7, getNodesManager());
        this.mOperations.c(j7, getNodesManager());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
        this.mCurrentFrameNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double d7, double d8) {
        int i7 = (int) d8;
        decrementInFlightAnimationsForViewTag(i7);
        addOperation(new j((int) d7, i7));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double d7, double d8) {
        addOperation(new h((int) d7, (int) d8));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double d7) {
        addOperation(new y((int) d7));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double d7) {
        addOperation(new d((int) d7));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double d7) {
        addOperation(new c((int) d7));
    }

    public com.facebook.react.animated.p getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            com.facebook.jni.a.a(this.mNodesManager, null, new com.facebook.react.animated.p(reactApplicationContextIfActiveOrWarn));
        }
        return this.mNodesManager.get();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double d7, Callback callback) {
        addOperation(new o((int) d7, callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
        int size = readableArray.size();
        int i7 = 0;
        while (i7 < size) {
            int i8 = i7 + 1;
            switch (q.f11225a[z.h(readableArray.getInt(i7)).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                case 10:
                    i7 += 2;
                    continue;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    i7 += 3;
                    continue;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                case 19:
                    break;
                case 20:
                    int i9 = i7 + 2;
                    i7 += 3;
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i9));
                    continue;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i8));
                    break;
                default:
                    throw new IllegalArgumentException("Batch animation execution op: fetching viewTag: unknown op code");
            }
            i7 += 4;
        }
        startOperationBatch();
        addUnbatchedOperation(new p(size, readableArray));
        finishOperationBatch();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double d7, String str, double d8) {
        int i7 = (int) d7;
        decrementInFlightAnimationsForViewTag(i7);
        addOperation(new n(i7, str, (int) d8));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double d7) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double d7) {
        addPreOperation(new l((int) d7));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double d7, double d8) {
        addOperation(new C0791b((int) d7, d8));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double d7, double d8) {
        addOperation(new C0790a((int) d7, d8));
    }

    public void setNodesManager(com.facebook.react.animated.p pVar) {
        this.mNodesManager.set(pVar);
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double d7, double d8, ReadableMap readableMap, Callback callback) {
        addUnbatchedOperation(new e((int) d7, (int) d8, readableMap, callback));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double d7) {
        int i7 = (int) d7;
        addOperation(new w(i7, new v(i7)));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double d7) {
        addOperation(new f((int) d7));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double d7) {
        addOperation(new x((int) d7));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void updateAnimatedNodeConfig(double d7, ReadableMap readableMap) {
        addOperation(new u((int) d7, readableMap));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        if ((this.mOperations.d() && this.mPreOperations.d()) || this.mUIManagerType == 2) {
            return;
        }
        long j7 = this.mCurrentBatchNumber;
        this.mCurrentBatchNumber = 1 + j7;
        r rVar = new r(j7);
        s sVar = new s(j7);
        UIManagerModule uIManagerModule = (UIManagerModule) uIManager;
        uIManagerModule.prependUIBlock(rVar);
        uIManagerModule.addUIBlock(sVar);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
    }
}
