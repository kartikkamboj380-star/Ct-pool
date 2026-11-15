package com.facebook.react.fabric;

import a2.InterfaceC0504a;
import a2.b;
import a2.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import b1.AbstractC0674a;
import c2.InterfaceC0712b;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.b;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.events.FabricEventEmitter;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.internal.interop.InteropEventEmitter;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.C0;
import com.facebook.react.uimanager.C0864a0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.C0892s;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.G0;
import com.facebook.react.uimanager.InterfaceC0870d0;
import com.facebook.react.uimanager.S;
import com.facebook.react.uimanager.T;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.p;
import com.facebook.react.views.text.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"MissingNativeLoadLibrary"})
public class FabricUIManager implements UIManager, LifecycleEventListener, Z1.b, p {
    public static final boolean ENABLE_FABRIC_LOGS;
    public static final boolean ENABLE_FABRIC_PERF_LOGS;
    private static final b.a FABRIC_PERF_LOGGER;
    public static final boolean IS_DEVELOPMENT_ENVIRONMENT = false;
    public static final String TAG = "FabricUIManager";
    private final com.facebook.react.uimanager.events.a mBatchEventDispatchedListener;
    private com.facebook.react.fabric.a mBinding;
    public com.facebook.react.fabric.b mDevToolsReactPerfLogger;
    private final f mDispatchUIFrameCallback;
    private final com.facebook.react.uimanager.events.e mEventDispatcher;
    private Y1.a mInteropUIBlockListener;
    private final a2.b mMountItemDispatcher;
    private final c.a mMountItemExecutor;
    private final a2.c mMountingManager;
    private final ReactApplicationContext mReactApplicationContext;
    private final G0 mViewManagerRegistry;
    private final CopyOnWriteArrayList<UIManagerListener> mListeners = new CopyOnWriteArrayList<>();
    private boolean mMountNotificationScheduled = false;
    private final List<Integer> mMountedSurfaceIds = new ArrayList();
    private final Set<m> mSynchronousEvents = new HashSet();
    private volatile boolean mDestroyed = false;
    private boolean mDriveCxxAnimations = false;
    private long mDispatchViewUpdatesTime = 0;
    private long mCommitStartTime = 0;
    private long mLayoutTime = 0;
    private long mFinishTransactionTime = 0;
    private long mFinishTransactionCPPTime = 0;
    private int mCurrentSynchronousCommitNumber = 10000;

    class a implements c.a {
        a() {
        }

        @Override // a2.c.a
        public void a(Queue queue) {
            FabricUIManager.this.mMountItemDispatcher.d(queue);
        }
    }

    class b implements MountItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableMap f11699b;

        b(int i7, ReadableMap readableMap) {
            this.f11698a = i7;
            this.f11699b = readableMap;
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public void execute(a2.c cVar) {
            try {
                cVar.s(this.f11698a, this.f11699b);
            } catch (Exception unused) {
            }
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public int getSurfaceId() {
            return -1;
        }

        public String toString() {
            return String.format("SYNC UPDATE PROPS [%d]: %s", Integer.valueOf(this.f11698a), "<hidden>");
        }
    }

    class c extends GuardedRunnable {
        c(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            FabricUIManager.this.mMountItemDispatcher.p();
        }
    }

    class d implements MountItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f11704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f11705d;

        d(int i7, int i8, int i9, boolean z6) {
            this.f11702a = i7;
            this.f11703b = i8;
            this.f11704c = i9;
            this.f11705d = z6;
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public void execute(a2.c cVar) {
            a2.f fVarE = cVar.e(this.f11702a);
            if (fVarE != null) {
                fVarE.L(this.f11703b, this.f11704c, this.f11705d);
                return;
            }
            P0.a.j(FabricUIManager.TAG, "setJSResponder skipped, surface no longer available [" + this.f11702a + "]");
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public int getSurfaceId() {
            return this.f11702a;
        }

        public String toString() {
            return String.format("SET_JS_RESPONDER [%d] [surface:%d]", Integer.valueOf(this.f11703b), Integer.valueOf(this.f11702a));
        }
    }

    class e implements MountItem {
        e() {
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public void execute(a2.c cVar) {
            cVar.b();
        }

        @Override // com.facebook.react.fabric.mounting.mountitems.MountItem
        public int getSurfaceId() {
            return -1;
        }

        public String toString() {
            return "CLEAR_JS_RESPONDER";
        }
    }

    private class f extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f11708b;

        private f(ReactContext reactContext) {
            super(reactContext);
            this.f11708b = true;
        }

        @Override // com.facebook.react.fabric.i
        public void a(long j7) {
            if (!this.f11708b || FabricUIManager.this.mDestroyed) {
                P0.a.G(FabricUIManager.TAG, "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            if (FabricUIManager.this.mDriveCxxAnimations && FabricUIManager.this.mBinding != null) {
                FabricUIManager.this.mBinding.driveCxxAnimations();
            }
            try {
                try {
                    FabricUIManager.this.mMountItemDispatcher.f(j7);
                    FabricUIManager.this.mMountItemDispatcher.p();
                    com.facebook.react.modules.core.a.h().m(a.b.DISPATCH_UI, FabricUIManager.this.mDispatchUIFrameCallback);
                    FabricUIManager.this.mSynchronousEvents.clear();
                } catch (Exception e7) {
                    P0.a.k(FabricUIManager.TAG, "Exception thrown when executing UIFrameGuarded", e7);
                    b();
                    throw e7;
                }
            } catch (Throwable th) {
                com.facebook.react.modules.core.a.h().m(a.b.DISPATCH_UI, FabricUIManager.this.mDispatchUIFrameCallback);
                throw th;
            }
        }

        void b() {
            this.f11708b = false;
        }
    }

    private class g implements b.a {

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                FabricUIManager.this.mMountNotificationScheduled = false;
                com.facebook.react.fabric.a aVar = FabricUIManager.this.mBinding;
                if (aVar != null && !FabricUIManager.this.mDestroyed) {
                    Iterator it = FabricUIManager.this.mMountedSurfaceIds.iterator();
                    while (it.hasNext()) {
                        aVar.reportMount(((Integer) it.next()).intValue());
                    }
                }
                FabricUIManager.this.mMountedSurfaceIds.clear();
            }
        }

        private g() {
        }

        @Override // a2.b.a
        public void a(List list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).willMountItems(FabricUIManager.this);
            }
        }

        @Override // a2.b.a
        public void b() {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didDispatchMountItems(FabricUIManager.this);
            }
        }

        @Override // a2.b.a
        public void c(List list) {
            Iterator it = FabricUIManager.this.mListeners.iterator();
            while (it.hasNext()) {
                ((UIManagerListener) it.next()).didMountItems(FabricUIManager.this);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MountItem mountItem = (MountItem) it2.next();
                if (mountItem != null && !FabricUIManager.this.mMountedSurfaceIds.contains(Integer.valueOf(mountItem.getSurfaceId()))) {
                    FabricUIManager.this.mMountedSurfaceIds.add(Integer.valueOf(mountItem.getSurfaceId()));
                }
            }
            if (FabricUIManager.this.mMountNotificationScheduled || FabricUIManager.this.mMountedSurfaceIds.isEmpty()) {
                return;
            }
            UiThreadUtil.getUiThreadHandler().postAtFrontOfQueue(new a());
        }
    }

    static {
        boolean z6 = ReactFeatureFlags.enableFabricLogs || a1.c.a().c(AbstractC0674a.f9576g);
        ENABLE_FABRIC_LOGS = z6;
        ENABLE_FABRIC_PERF_LOGS = z6;
        FABRIC_PERF_LOGGER = new b.a() { // from class: com.facebook.react.fabric.e
            @Override // com.facebook.react.fabric.b.a
            public final void a(b.C0213b c0213b) {
                FabricUIManager.lambda$static$0(c0213b);
            }
        };
        com.facebook.react.fabric.d.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FabricUIManager(ReactApplicationContext reactApplicationContext, G0 g02, com.facebook.react.uimanager.events.a aVar) {
        a aVar2 = new a();
        this.mMountItemExecutor = aVar2;
        this.mDispatchUIFrameCallback = new f(reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        a2.c cVar = new a2.c(g02, aVar2);
        this.mMountingManager = cVar;
        this.mMountItemDispatcher = new a2.b(cVar, new g());
        this.mEventDispatcher = new com.facebook.react.uimanager.events.k(reactApplicationContext);
        this.mBatchEventDispatchedListener = aVar;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mViewManagerRegistry = g02;
        reactApplicationContext.registerComponentCallbacks(g02);
    }

    private MountItem createIntBufferBatchMountItem(int i7, int[] iArr, Object[] objArr, int i8) {
        if (iArr == null) {
            iArr = new int[0];
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        return com.facebook.react.fabric.mounting.mountitems.f.c(i7, iArr, objArr, i8);
    }

    private Y1.a getInteropUIBlockListener() {
        if (this.mInteropUIBlockListener == null) {
            Y1.a aVar = new Y1.a();
            this.mInteropUIBlockListener = aVar;
            addUIManagerEventListener(aVar);
        }
        return this.mInteropUIBlockListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(b.C0213b c0213b) {
        long jF = c0213b.f();
        long jO = c0213b.o();
        long j7 = c0213b.j();
        long jS = c0213b.s();
        long jC = c0213b.c();
        l lVar = com.facebook.react.fabric.b.f11716c;
        lVar.c(jF);
        l lVar2 = com.facebook.react.fabric.b.f11717d;
        lVar2.c(jO);
        l lVar3 = com.facebook.react.fabric.b.f11718e;
        lVar3.c(j7);
        l lVar4 = com.facebook.react.fabric.b.f11719f;
        lVar4.c(jS);
        l lVar5 = com.facebook.react.fabric.b.f11720g;
        lVar5.c(jC);
        P0.a.t(TAG, "Statistics of Fabric commit #%d:\n - Total commit time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Layout time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Diffing time: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - FinishTransaction (Diffing + JNI serialization): %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n - Mounting: %d ms. Avg: %.2f. Median: %.2f ms. Max: %d ms.\n", Long.valueOf(c0213b.h()), Long.valueOf(jF), Double.valueOf(lVar.d()), Double.valueOf(lVar.f()), Long.valueOf(lVar.e()), Long.valueOf(jO), Double.valueOf(lVar2.d()), Double.valueOf(lVar2.f()), Long.valueOf(lVar2.e()), Long.valueOf(j7), Double.valueOf(lVar3.d()), Double.valueOf(lVar3.f()), Long.valueOf(lVar3.e()), Long.valueOf(jS), Double.valueOf(lVar4.d()), Double.valueOf(lVar4.f()), Long.valueOf(lVar4.e()), Long.valueOf(jC), Double.valueOf(lVar5.d()), Double.valueOf(lVar5.f()), Long.valueOf(lVar5.e()));
    }

    private long measure(int i7, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f7, float f8, float f9, float f10) {
        return measure(i7, str, readableMap, readableMap2, readableMap3, f7, f8, f9, f10, null);
    }

    private NativeArray measureLines(ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, float f7, float f8) {
        return (NativeArray) s.j(this.mReactApplicationContext, readableMapBuffer, readableMapBuffer2, G.d(f7), G.d(f8));
    }

    private long measureMapBuffer(int i7, String str, ReadableMapBuffer readableMapBuffer, ReadableMapBuffer readableMapBuffer2, ReadableMapBuffer readableMapBuffer3, float f7, float f8, float f9, float f10, float[] fArr) {
        ReactContext reactContextP;
        if (i7 > 0) {
            a2.f fVarF = this.mMountingManager.f(i7, "measure");
            if (fVarF.y()) {
                return 0L;
            }
            reactContextP = fVarF.p();
        } else {
            reactContextP = this.mReactApplicationContext;
        }
        return this.mMountingManager.l(reactContextP, str, readableMapBuffer, readableMapBuffer2, readableMapBuffer3, InterfaceC0504a.d(f7, f8), InterfaceC0504a.c(f7, f8), InterfaceC0504a.d(f9, f10), InterfaceC0504a.c(f9, f10), fArr);
    }

    private void preallocateView(int i7, int i8, String str, Object obj, Object obj2, Object obj3, boolean z6) {
        this.mMountItemDispatcher.b(com.facebook.react.fabric.mounting.mountitems.f.d(i7, i8, str, (ReadableMap) obj, (InterfaceC0870d0) obj2, (EventEmitterWrapper) obj3, z6));
    }

    private void scheduleMountItem(MountItem mountItem, int i7, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i8) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z6 = mountItem instanceof com.facebook.react.fabric.mounting.mountitems.a;
        boolean z7 = (z6 && !((com.facebook.react.fabric.mounting.mountitems.a) mountItem).a()) || !(z6 || mountItem == null);
        for (Iterator<UIManagerListener> it = this.mListeners.iterator(); it.hasNext(); it = it) {
            it.next().didScheduleMountItems(this);
        }
        if (z6) {
            this.mCommitStartTime = j7;
            this.mLayoutTime = j11 - j10;
            this.mFinishTransactionCPPTime = j13 - j12;
            this.mFinishTransactionTime = jUptimeMillis - j12;
            this.mDispatchViewUpdatesTime = SystemClock.uptimeMillis();
        }
        if (z7) {
            this.mMountItemDispatcher.a(mountItem);
            c cVar = new c(this.mReactApplicationContext);
            if (UiThreadUtil.isOnUiThread()) {
                cVar.run();
            }
        }
        if (z6) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_START, null, i7, j7);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START, null, i7, j12);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END, null, i7, j13);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_START, null, i7, j8);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_DIFF_END, null, i7, j9);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_START, null, i7, j10);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_END, null, i7, j11);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES, null, i7, j11, i8);
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_COMMIT_END, null, i7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public <T extends View> int addRootView(T t6, WritableMap writableMap) {
        String str = TAG;
        ReactSoftExceptionLogger.logSoftException(str, new C0892s("Do not call addRootView in Fabric; it is unsupported. Call startSurface instead."));
        S s6 = (S) t6;
        int rootViewTag = s6.getRootViewTag();
        this.mMountingManager.p(rootViewTag, new C0872e0(this.mReactApplicationContext, t6.getContext(), s6.getSurfaceID(), rootViewTag), t6);
        String jSModuleName = s6.getJSModuleName();
        if (ENABLE_FABRIC_LOGS) {
            P0.a.d(str, "Starting surface for module: %s and reactTag: %d", jSModuleName, Integer.valueOf(rootViewTag));
        }
        this.mBinding.startSurface(rootViewTag, jSModuleName, (NativeMap) writableMap);
        return rootViewTag;
    }

    public void addUIBlock(Z1.a aVar) {
        if (ReactFeatureFlags.unstable_useFabricInterop) {
            getInteropUIBlockListener().a(aVar);
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.add(uIManagerListener);
    }

    public void attachRootView(InterfaceC0712b interfaceC0712b, View view) {
        this.mMountingManager.a(interfaceC0712b.getSurfaceId(), view, new C0872e0(this.mReactApplicationContext, view.getContext(), interfaceC0712b.d(), interfaceC0712b.getSurfaceId()));
        interfaceC0712b.c(true);
    }

    public void clearJSResponder() {
        this.mMountItemDispatcher.a(new e());
    }

    com.facebook.react.fabric.mounting.mountitems.b createDispatchCommandMountItemForInterop(int i7, int i8, String str, ReadableArray readableArray) {
        try {
            return com.facebook.react.fabric.mounting.mountitems.f.a(i7, i8, Integer.parseInt(str), readableArray);
        } catch (NumberFormatException unused) {
            return com.facebook.react.fabric.mounting.mountitems.f.b(i7, i8, str, readableArray);
        }
    }

    @Deprecated
    public void dispatchCommand(int i7, int i8, int i9, ReadableArray readableArray) {
        this.mMountItemDispatcher.c(com.facebook.react.fabric.mounting.mountitems.f.a(i7, i8, i9, readableArray));
    }

    public int getColor(int i7, String[] strArr) {
        C0872e0 c0872e0P = this.mMountingManager.f(i7, "getColor").p();
        if (c0872e0P == null) {
            return 0;
        }
        for (String str : strArr) {
            Integer numResolveResourcePath = ColorPropConverter.resolveResourcePath(c0872e0P, str);
            if (numResolveResourcePath != null) {
                return numResolveResourcePath.intValue();
            }
        }
        return 0;
    }

    @Override // com.facebook.react.bridge.UIManager
    public com.facebook.react.uimanager.events.e getEventDispatcher() {
        return this.mEventDispatcher;
    }

    public ReadableMap getInspectorDataForInstance(int i7, View view) {
        UiThreadUtil.assertOnUiThread();
        return this.mBinding.getInspectorDataForInstance(this.mMountingManager.d(i7, view.getId()));
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        HashMap map = new HashMap();
        map.put("CommitStartTime", Long.valueOf(this.mCommitStartTime));
        map.put("LayoutTime", Long.valueOf(this.mLayoutTime));
        map.put("DispatchViewUpdatesTime", Long.valueOf(this.mDispatchViewUpdatesTime));
        map.put("RunStartTime", Long.valueOf(this.mMountItemDispatcher.m()));
        map.put("BatchedExecutionTime", Long.valueOf(this.mMountItemDispatcher.l()));
        map.put("FinishFabricTransactionTime", Long.valueOf(this.mFinishTransactionTime));
        map.put("FinishFabricTransactionCPPTime", Long.valueOf(this.mFinishTransactionCPPTime));
        return map;
    }

    public boolean getThemeData(int i7, float[] fArr) {
        C0872e0 c0872e0P = this.mMountingManager.f(i7, "getThemeData").p();
        if (c0872e0P == null) {
            P0.a.G(TAG, "\"themedReactContext\" is null when call \"getThemeData\"");
            return false;
        }
        float[] fArrA = AbstractC0884k0.a(c0872e0P);
        fArr[0] = fArrA[0];
        fArr[1] = fArrA[1];
        fArr[2] = fArrA[2];
        fArr[3] = fArrA[3];
        return true;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void initialize() {
        this.mEventDispatcher.h(2, new FabricEventEmitter(this));
        this.mEventDispatcher.f(this.mBatchEventDispatchedListener);
        if (ENABLE_FABRIC_PERF_LOGS) {
            com.facebook.react.fabric.b bVar = new com.facebook.react.fabric.b();
            this.mDevToolsReactPerfLogger = bVar;
            bVar.a(FABRIC_PERF_LOGGER);
            ReactMarker.addFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (ReactFeatureFlags.unstable_useFabricInterop) {
            this.mReactApplicationContext.internal_registerInteropModule(RCTEventEmitter.class, new InteropEventEmitter(this.mReactApplicationContext));
        }
    }

    @Override // com.facebook.react.bridge.UIManager
    public void invalidate() {
        String str = TAG;
        P0.a.p(str, "FabricUIManager.invalidate");
        com.facebook.react.fabric.b bVar = this.mDevToolsReactPerfLogger;
        if (bVar != null) {
            bVar.d(FABRIC_PERF_LOGGER);
            ReactMarker.removeFabricListener(this.mDevToolsReactPerfLogger);
        }
        if (this.mDestroyed) {
            ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException("Cannot double-destroy FabricUIManager"));
            return;
        }
        this.mDestroyed = true;
        this.mDispatchUIFrameCallback.b();
        this.mEventDispatcher.e(this.mBatchEventDispatchedListener);
        this.mEventDispatcher.i(2);
        this.mReactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        this.mViewManagerRegistry.f();
        this.mReactApplicationContext.removeLifecycleEventListener(this);
        onHostPause();
        this.mBinding.b();
        this.mBinding = null;
        C0.a();
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            return;
        }
        this.mEventDispatcher.g();
    }

    public void onAllAnimationsComplete() {
        this.mDriveCxxAnimations = false;
    }

    public void onAnimationStarted() {
        this.mDriveCxxAnimations = true;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        com.facebook.react.modules.core.a.h().o(a.b.DISPATCH_UI, this.mDispatchUIFrameCallback);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        com.facebook.react.modules.core.a.h().m(a.b.DISPATCH_UI, this.mDispatchUIFrameCallback);
    }

    public void onRequestEventBeat() {
        this.mEventDispatcher.d();
    }

    public void prependUIBlock(Z1.a aVar) {
        if (ReactFeatureFlags.unstable_useFabricInterop) {
            getInteropUIBlockListener().b(aVar);
        }
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i7, int i8, String str, WritableMap writableMap) {
        receiveEvent(i7, i8, str, false, writableMap, 2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mListeners.remove(uIManagerListener);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        if (str == null) {
            return null;
        }
        if (!str.startsWith("top")) {
            return str;
        }
        return "on" + str.substring(3);
    }

    @Override // com.facebook.react.bridge.UIManager
    public View resolveView(int i7) {
        UiThreadUtil.assertOnUiThread();
        a2.f fVarG = this.mMountingManager.g(i7);
        if (fVarG == null) {
            return null;
        }
        return fVarG.t(i7);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void sendAccessibilityEvent(int i7, int i8) {
        this.mMountItemDispatcher.a(com.facebook.react.fabric.mounting.mountitems.f.e(-1, i7, i8));
    }

    public void sendAccessibilityEventFromJS(int i7, int i8, String str) {
        int i9;
        if ("focus".equals(str)) {
            i9 = 8;
        } else if ("windowStateChange".equals(str)) {
            i9 = 32;
        } else if ("click".equals(str)) {
            i9 = 1;
        } else {
            if (!"viewHoverEnter".equals(str)) {
                throw new IllegalArgumentException("sendAccessibilityEventFromJS: invalid eventType " + str);
            }
            i9 = 128;
        }
        this.mMountItemDispatcher.a(com.facebook.react.fabric.mounting.mountitems.f.e(i7, i8, i9));
    }

    public void setBinding(com.facebook.react.fabric.a aVar) {
        this.mBinding = aVar;
    }

    public void setJSResponder(int i7, int i8, int i9, boolean z6) {
        this.mMountItemDispatcher.a(new d(i7, i8, i9, z6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t6, String str, WritableMap writableMap, int i7, int i8) {
        int rootViewTag = ((S) t6).getRootViewTag();
        Context context = t6.getContext();
        C0872e0 c0872e0 = new C0872e0(this.mReactApplicationContext, context, str, rootViewTag);
        if (ENABLE_FABRIC_LOGS) {
            P0.a.d(TAG, "Starting surface for module: %s and reactTag: %d", str, Integer.valueOf(rootViewTag));
        }
        this.mMountingManager.p(rootViewTag, c0872e0, t6);
        Point pointB = UiThreadUtil.isOnUiThread() ? C0864a0.b(t6) : new Point(0, 0);
        this.mBinding.startSurfaceWithConstraints(rootViewTag, str, (NativeMap) writableMap, InterfaceC0504a.a(i7), InterfaceC0504a.b(i7), InterfaceC0504a.a(i8), InterfaceC0504a.b(i8), pointB.x, pointB.y, com.facebook.react.modules.i18nmanager.a.f().i(context), com.facebook.react.modules.i18nmanager.a.f().d(context));
        return rootViewTag;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i7) {
        this.mMountingManager.q(i7);
        this.mBinding.stopSurface(i7);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i7, ReadableMap readableMap) {
        UiThreadUtil.assertOnUiThread();
        int i8 = this.mCurrentSynchronousCommitNumber;
        this.mCurrentSynchronousCommitNumber = i8 + 1;
        b bVar = new b(i7, readableMap);
        if (!this.mMountingManager.i(i7)) {
            this.mMountItemDispatcher.a(bVar);
            return;
        }
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START, null, i8);
        if (ENABLE_FABRIC_LOGS) {
            P0.a.d(TAG, "SynchronouslyUpdateViewOnUIThread for tag %d: %s", Integer.valueOf(i7), "<hidden>");
        }
        bVar.execute(this.mMountingManager);
        ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END, null, i8);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(int i7, int i8, int i9, int i10, int i11) {
        boolean z6;
        boolean zD;
        if (ENABLE_FABRIC_LOGS) {
            P0.a.c(TAG, "Updating Root Layout Specs for [%d]", Integer.valueOf(i7));
        }
        a2.f fVarE = this.mMountingManager.e(i7);
        if (fVarE == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new C0892s("Cannot updateRootLayoutSpecs on surfaceId that does not exist: " + i7));
            return;
        }
        C0872e0 c0872e0P = fVarE.p();
        if (c0872e0P != null) {
            boolean zI = com.facebook.react.modules.i18nmanager.a.f().i(c0872e0P);
            zD = com.facebook.react.modules.i18nmanager.a.f().d(c0872e0P);
            z6 = zI;
        } else {
            z6 = false;
            zD = false;
        }
        this.mBinding.setConstraints(i7, InterfaceC0504a.a(i8), InterfaceC0504a.b(i8), InterfaceC0504a.a(i9), InterfaceC0504a.b(i9), i10, i11, z6, zD);
    }

    private long measure(int i7, String str, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f7, float f8, float f9, float f10, float[] fArr) {
        ReactContext reactContextP;
        if (i7 > 0) {
            a2.f fVarF = this.mMountingManager.f(i7, "measure");
            if (fVarF.y()) {
                return 0L;
            }
            reactContextP = fVarF.p();
        } else {
            reactContextP = this.mReactApplicationContext;
        }
        return this.mMountingManager.k(reactContextP, str, readableMap, readableMap2, readableMap3, InterfaceC0504a.d(f7, f8), InterfaceC0504a.c(f7, f8), InterfaceC0504a.d(f9, f10), InterfaceC0504a.c(f9, f10), fArr);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i7, int i8, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    public void receiveEvent(int i7, int i8, String str, boolean z6, WritableMap writableMap, int i9) {
        receiveEvent(i7, i8, str, z6, writableMap, i9, false);
    }

    public void startSurface(InterfaceC0712b interfaceC0712b, Context context, View view) {
        int iA = T.a();
        this.mMountingManager.p(iA, new C0872e0(this.mReactApplicationContext, context, interfaceC0712b.d(), iA), view);
        interfaceC0712b.a(iA);
        if (interfaceC0712b instanceof SurfaceHandlerBinding) {
            this.mBinding.registerSurface((SurfaceHandlerBinding) interfaceC0712b);
        }
        interfaceC0712b.c(view != null);
        interfaceC0712b.start();
    }

    public void stopSurface(InterfaceC0712b interfaceC0712b) {
        if (!interfaceC0712b.isRunning()) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Trying to stop surface that hasn't started yet"));
            return;
        }
        this.mMountingManager.q(interfaceC0712b.getSurfaceId());
        interfaceC0712b.stop();
        if (interfaceC0712b instanceof SurfaceHandlerBinding) {
            this.mBinding.unregisterSurface((SurfaceHandlerBinding) interfaceC0712b);
        }
    }

    public void dispatchCommand(int i7, int i8, String str, ReadableArray readableArray) {
        a2.b bVar;
        com.facebook.react.fabric.mounting.mountitems.b bVarB;
        if (ReactFeatureFlags.unstable_useFabricInterop) {
            bVar = this.mMountItemDispatcher;
            bVarB = createDispatchCommandMountItemForInterop(i7, i8, str, readableArray);
        } else {
            bVar = this.mMountItemDispatcher;
            bVarB = com.facebook.react.fabric.mounting.mountitems.f.b(i7, i8, str, readableArray);
        }
        bVar.c(bVarB);
    }

    @Override // com.facebook.react.uimanager.events.p
    public void receiveEvent(int i7, int i8, String str, boolean z6, WritableMap writableMap, int i9, boolean z7) {
        if (this.mDestroyed) {
            P0.a.j(TAG, "Attempted to receiveEvent after destruction");
            return;
        }
        EventEmitterWrapper eventEmitterWrapperD = this.mMountingManager.d(i7, i8);
        if (eventEmitterWrapperD != null) {
            if (z7) {
                if (this.mSynchronousEvents.add(new m(i7, i8, str))) {
                    eventEmitterWrapperD.c(str, writableMap);
                    return;
                }
                return;
            } else if (z6) {
                eventEmitterWrapperD.d(str, writableMap);
                return;
            } else {
                eventEmitterWrapperD.b(str, writableMap, i9);
                return;
            }
        }
        if (this.mMountingManager.i(i8)) {
            this.mMountingManager.c(i7, i8, str, z6, writableMap, i9);
            return;
        }
        P0.a.b(TAG, "Unable to invoke event: " + str + " for reactTag: " + i8);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i7, String str, ReadableArray readableArray) {
        throw new UnsupportedOperationException("dispatchCommand called without surfaceId - Fabric dispatchCommand must be called through Fabric JSI API");
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i7, String str, WritableMap writableMap) {
        receiveEvent(-1, i7, str, false, writableMap, 2);
    }
}
