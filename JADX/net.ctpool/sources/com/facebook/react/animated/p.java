package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.events.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import y2.C2239a;

/* JADX INFO: loaded from: classes.dex */
public class p implements com.facebook.react.uimanager.events.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ReactApplicationContext f11331e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f11327a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f11328b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f11329c = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f11330d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11332f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f11333g = new LinkedList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11334h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f11335i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11336j = false;

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f11337m;

        a(com.facebook.react.uimanager.events.d dVar) {
            this.f11337m = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.n(this.f11337m);
        }
    }

    public p(ReactApplicationContext reactApplicationContext) {
        this.f11331e = reactApplicationContext;
    }

    private void C(List list) {
        int i7 = this.f11332f;
        int i8 = i7 + 1;
        this.f11332f = i8;
        if (i8 == 0) {
            this.f11332f = i7 + 2;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = list.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            AbstractC0793b abstractC0793b = (AbstractC0793b) it.next();
            int i10 = abstractC0793b.f11273c;
            int i11 = this.f11332f;
            if (i10 != i11) {
                abstractC0793b.f11273c = i11;
                i9++;
                arrayDeque.add(abstractC0793b);
            }
        }
        while (!arrayDeque.isEmpty()) {
            AbstractC0793b abstractC0793b2 = (AbstractC0793b) arrayDeque.poll();
            if (abstractC0793b2.f11271a != null) {
                for (int i12 = 0; i12 < abstractC0793b2.f11271a.size(); i12++) {
                    AbstractC0793b abstractC0793b3 = (AbstractC0793b) abstractC0793b2.f11271a.get(i12);
                    abstractC0793b3.f11272b++;
                    int i13 = abstractC0793b3.f11273c;
                    int i14 = this.f11332f;
                    if (i13 != i14) {
                        abstractC0793b3.f11273c = i14;
                        i9++;
                        arrayDeque.add(abstractC0793b3);
                    }
                }
            }
        }
        int i15 = this.f11332f;
        int i16 = i15 + 1;
        this.f11332f = i16;
        if (i16 == 0) {
            this.f11332f = i15 + 2;
        }
        Iterator it2 = list.iterator();
        int i17 = 0;
        while (it2.hasNext()) {
            AbstractC0793b abstractC0793b4 = (AbstractC0793b) it2.next();
            if (abstractC0793b4.f11272b == 0) {
                int i18 = abstractC0793b4.f11273c;
                int i19 = this.f11332f;
                if (i18 != i19) {
                    abstractC0793b4.f11273c = i19;
                    i17++;
                    arrayDeque.add(abstractC0793b4);
                }
            }
        }
        int i20 = 0;
        while (!arrayDeque.isEmpty()) {
            AbstractC0793b abstractC0793b5 = (AbstractC0793b) arrayDeque.poll();
            try {
                abstractC0793b5.h();
                if (abstractC0793b5 instanceof r) {
                    ((r) abstractC0793b5).m();
                }
            } catch (JSApplicationCausedNativeException e7) {
                P0.a.k("NativeAnimatedNodesManager", "Native animation workaround, frame lost as result of race condition", e7);
            }
            if (abstractC0793b5 instanceof B) {
                ((B) abstractC0793b5).m();
            }
            if (abstractC0793b5.f11271a != null) {
                for (int i21 = 0; i21 < abstractC0793b5.f11271a.size(); i21++) {
                    AbstractC0793b abstractC0793b6 = (AbstractC0793b) abstractC0793b5.f11271a.get(i21);
                    int i22 = abstractC0793b6.f11272b - 1;
                    abstractC0793b6.f11272b = i22;
                    int i23 = abstractC0793b6.f11273c;
                    int i24 = this.f11332f;
                    if (i23 != i24 && i22 == 0) {
                        abstractC0793b6.f11273c = i24;
                        i17++;
                        arrayDeque.add(abstractC0793b6);
                    } else if (i23 == i24) {
                        i20++;
                    }
                }
            }
        }
        if (i9 == i17) {
            this.f11336j = false;
            return;
        }
        if (this.f11336j) {
            return;
        }
        this.f11336j = true;
        P0.a.j("NativeAnimatedNodesManager", "Detected animation cycle or disconnected graph. ");
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            P0.a.j("NativeAnimatedNodesManager", ((AbstractC0793b) it3.next()).f());
        }
        IllegalStateException illegalStateException = new IllegalStateException("Looks like animated nodes graph has " + (i20 > 0 ? "cycles (" + i20 + ")" : "disconnected regions") + ", there are " + i9 + " but toposort visited only " + i17);
        boolean z6 = this.f11334h;
        if ((!z6 || i20 != 0) && !z6) {
            throw illegalStateException;
        }
        ReactNoCrashSoftException reactNoCrashSoftException = new ReactNoCrashSoftException(illegalStateException);
        ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", reactNoCrashSoftException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(com.facebook.react.uimanager.events.d dVar) {
        ReactApplicationContext reactApplicationContext;
        if (this.f11330d.isEmpty() || (reactApplicationContext = this.f11331e) == null || AbstractC0884k0.g(reactApplicationContext, C2239a.b(dVar.getViewTag(), dVar.getSurfaceId())) == null) {
            return;
        }
        d.b eventAnimationDriverMatchSpec = dVar.getEventAnimationDriverMatchSpec();
        boolean z6 = false;
        for (EventAnimationDriver eventAnimationDriver : this.f11330d) {
            if (eventAnimationDriverMatchSpec.a(eventAnimationDriver.mViewTag, eventAnimationDriver.mEventName)) {
                z(eventAnimationDriver.mValueNode);
                dVar.dispatchModern(eventAnimationDriver);
                this.f11333g.add(eventAnimationDriver.mValueNode);
                z6 = true;
            }
        }
        if (z6) {
            C(this.f11333g);
            this.f11333g.clear();
        }
    }

    private String q(String str) {
        if (!str.startsWith("on")) {
            return str;
        }
        return "top" + str.substring(2);
    }

    private void z(AbstractC0793b abstractC0793b) {
        WritableArray writableArrayCreateArray = null;
        int i7 = 0;
        while (i7 < this.f11328b.size()) {
            e eVar = (e) this.f11328b.valueAt(i7);
            if (abstractC0793b.equals(eVar.f11276b)) {
                if (eVar.f11277c != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("finished", false);
                    writableMapCreateMap.putDouble("value", eVar.f11276b.f11169e);
                    eVar.f11277c.invoke(writableMapCreateMap);
                } else if (this.f11331e != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putInt("animationId", eVar.f11278d);
                    writableMapCreateMap2.putBoolean("finished", false);
                    writableMapCreateMap2.putDouble("value", eVar.f11276b.f11169e);
                    if (writableArrayCreateArray == null) {
                        writableArrayCreateArray = Arguments.createArray();
                    }
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                this.f11328b.removeAt(i7);
                i7--;
            }
            i7++;
        }
        if (writableArrayCreateArray != null) {
            this.f11331e.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
        }
    }

    public void A(int i7) {
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i7);
        if (abstractC0793b != null && (abstractC0793b instanceof B)) {
            ((B) abstractC0793b).n(null);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i7 + "] does not exist, or is not a 'value' node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void B(int i7, ReadableMap readableMap) {
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i7);
        if (abstractC0793b == 0) {
            throw new JSApplicationIllegalArgumentException("updateAnimatedNode: Animated node [" + i7 + "] does not exist");
        }
        if (abstractC0793b instanceof d) {
            z(abstractC0793b);
            ((d) abstractC0793b).a(readableMap);
            this.f11329c.put(i7, abstractC0793b);
        }
    }

    @Override // com.facebook.react.uimanager.events.i
    public void a(com.facebook.react.uimanager.events.d dVar) {
        if (UiThreadUtil.isOnUiThread()) {
            n(dVar);
        } else {
            UiThreadUtil.runOnUiThread(new a(dVar));
        }
    }

    public void c(int i7, String str, ReadableMap readableMap) {
        int i8 = readableMap.getInt("animatedValueTag");
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i8);
        if (abstractC0793b == null) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node with tag [" + i8 + "] does not exist");
        }
        if (!(abstractC0793b instanceof B)) {
            throw new JSApplicationIllegalArgumentException("addAnimatedEventToView: Animated node on view [" + i7 + "] connected to event handler (" + str + ") should be of type " + B.class.getName());
        }
        ReadableArray array = readableMap.getArray("nativeEventPath");
        ArrayList arrayList = new ArrayList(array.size());
        for (int i9 = 0; i9 < array.size(); i9++) {
            arrayList.add(array.getString(i9));
        }
        this.f11330d.add(new EventAnimationDriver(q(str), i7, arrayList, (B) abstractC0793b));
    }

    public void d(int i7, int i8) {
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i7);
        if (abstractC0793b == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node with tag [" + i7 + "] does not exist");
        }
        if (!(abstractC0793b instanceof r)) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodeToView: Animated node connected to view [" + i8 + "] should be of type " + r.class.getName());
        }
        ReactApplicationContext reactApplicationContext = this.f11331e;
        if (reactApplicationContext == null) {
            throw new IllegalStateException("connectAnimatedNodeToView: Animated node could not be connected, no ReactApplicationContext: " + i8);
        }
        UIManager uIManagerI = AbstractC0884k0.i(reactApplicationContext, i8);
        if (uIManagerI != null) {
            ((r) abstractC0793b).i(i8, uIManagerI);
            this.f11329c.put(i7, abstractC0793b);
        } else {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new ReactNoCrashSoftException("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: " + i8));
        }
    }

    public void e(int i7, int i8) {
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i7);
        if (abstractC0793b == null) {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (parent) [" + i7 + "] does not exist");
        }
        AbstractC0793b abstractC0793b2 = (AbstractC0793b) this.f11327a.get(i8);
        if (abstractC0793b2 != null) {
            abstractC0793b.b(abstractC0793b2);
            this.f11329c.put(i8, abstractC0793b2);
        } else {
            throw new JSApplicationIllegalArgumentException("connectAnimatedNodes: Animated node with tag (child) [" + i8 + "] does not exist");
        }
    }

    public void f(int i7, ReadableMap readableMap) {
        AbstractC0793b qVar;
        if (this.f11327a.get(i7) != null) {
            throw new JSApplicationIllegalArgumentException("createAnimatedNode: Animated node [" + i7 + "] already exists");
        }
        String string = readableMap.getString("type");
        if ("style".equals(string)) {
            qVar = new u(readableMap, this);
        } else if ("value".equals(string)) {
            qVar = new B(readableMap);
        } else if ("color".equals(string)) {
            qVar = new f(readableMap, this, this.f11331e);
        } else if ("props".equals(string)) {
            qVar = new r(readableMap, this);
        } else if ("interpolation".equals(string)) {
            qVar = new k(readableMap);
        } else if ("addition".equals(string)) {
            qVar = new C0792a(readableMap, this);
        } else if ("subtraction".equals(string)) {
            qVar = new v(readableMap, this);
        } else if ("division".equals(string)) {
            qVar = new i(readableMap, this);
        } else if ("multiplication".equals(string)) {
            qVar = new m(readableMap, this);
        } else if ("modulus".equals(string)) {
            qVar = new l(readableMap, this);
        } else if ("diffclamp".equals(string)) {
            qVar = new h(readableMap, this);
        } else if ("transform".equals(string)) {
            qVar = new y(readableMap, this);
        } else if ("tracking".equals(string)) {
            qVar = new w(readableMap, this);
        } else {
            if (!"object".equals(string)) {
                throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
            }
            qVar = new q(readableMap, this);
        }
        qVar.f11274d = i7;
        this.f11327a.put(i7, qVar);
        this.f11329c.put(i7, qVar);
    }

    public void g(int i7, int i8) {
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i7);
        if (abstractC0793b == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node with tag [" + i7 + "] does not exist");
        }
        if (abstractC0793b instanceof r) {
            ((r) abstractC0793b).j(i8);
            return;
        }
        throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodeFromView: Animated node connected to view [" + i8 + "] should be of type " + r.class.getName());
    }

    public void h(int i7, int i8) {
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i7);
        if (abstractC0793b == null) {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (parent) [" + i7 + "] does not exist");
        }
        AbstractC0793b abstractC0793b2 = (AbstractC0793b) this.f11327a.get(i8);
        if (abstractC0793b2 != null) {
            abstractC0793b.g(abstractC0793b2);
            this.f11329c.put(i8, abstractC0793b2);
        } else {
            throw new JSApplicationIllegalArgumentException("disconnectAnimatedNodes: Animated node with tag (child) [" + i8 + "] does not exist");
        }
    }

    public void i(int i7) {
        this.f11327a.remove(i7);
        this.f11329c.remove(i7);
    }

    public void j(int i7) {
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i7);
        if (abstractC0793b != null && (abstractC0793b instanceof B)) {
            ((B) abstractC0793b).i();
            return;
        }
        throw new JSApplicationIllegalArgumentException("extractAnimatedNodeOffset: Animated node [" + i7 + "] does not exist, or is not a 'value' node");
    }

    public void k(int i7) {
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i7);
        if (abstractC0793b != null && (abstractC0793b instanceof B)) {
            ((B) abstractC0793b).j();
            return;
        }
        throw new JSApplicationIllegalArgumentException("flattenAnimatedNodeOffset: Animated node [" + i7 + "] does not exist, or is not a 'value' node");
    }

    public AbstractC0793b l(int i7) {
        return (AbstractC0793b) this.f11327a.get(i7);
    }

    public void m(int i7, Callback callback) {
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i7);
        if (abstractC0793b == null || !(abstractC0793b instanceof B)) {
            throw new JSApplicationIllegalArgumentException("getValue: Animated node with tag [" + i7 + "] does not exist or is not a 'value' node");
        }
        double dL = ((B) abstractC0793b).l();
        if (callback != null) {
            callback.invoke(Double.valueOf(dL));
        } else {
            if (this.f11331e == null) {
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("tag", i7);
            writableMapCreateMap.putDouble("value", dL);
            this.f11331e.emitDeviceEvent("onNativeAnimatedModuleGetValue", writableMapCreateMap);
        }
    }

    public boolean o() {
        return this.f11328b.size() > 0 || this.f11329c.size() > 0;
    }

    public void p(int i7) {
        if (i7 == 2) {
            if (this.f11334h) {
                return;
            }
        } else if (this.f11335i) {
            return;
        }
        UIManager uIManagerG = AbstractC0884k0.g(this.f11331e, i7);
        if (uIManagerG != null) {
            ((com.facebook.react.uimanager.events.e) uIManagerG.getEventDispatcher()).b(this);
            if (i7 == 2) {
                this.f11334h = true;
            } else {
                this.f11335i = true;
            }
        }
    }

    public void r(int i7, String str, int i8) {
        String strQ = q(str);
        ListIterator listIterator = this.f11330d.listIterator();
        while (listIterator.hasNext()) {
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) listIterator.next();
            if (strQ.equals(eventAnimationDriver.mEventName) && i7 == eventAnimationDriver.mViewTag && i8 == eventAnimationDriver.mValueNode.f11274d) {
                listIterator.remove();
                return;
            }
        }
    }

    public void s(int i7) {
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i7);
        if (abstractC0793b == null) {
            return;
        }
        if (abstractC0793b instanceof r) {
            ((r) abstractC0793b).l();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view [?] should be of type " + r.class.getName());
    }

    public void t(long j7) {
        UiThreadUtil.assertOnUiThread();
        for (int i7 = 0; i7 < this.f11329c.size(); i7++) {
            this.f11333g.add((AbstractC0793b) this.f11329c.valueAt(i7));
        }
        this.f11329c.clear();
        boolean z6 = false;
        for (int i8 = 0; i8 < this.f11328b.size(); i8++) {
            e eVar = (e) this.f11328b.valueAt(i8);
            eVar.b(j7);
            this.f11333g.add(eVar.f11276b);
            if (eVar.f11275a) {
                z6 = true;
            }
        }
        C(this.f11333g);
        this.f11333g.clear();
        if (z6) {
            WritableArray writableArrayCreateArray = null;
            for (int size = this.f11328b.size() - 1; size >= 0; size--) {
                e eVar2 = (e) this.f11328b.valueAt(size);
                if (eVar2.f11275a) {
                    if (eVar2.f11277c != null) {
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putBoolean("finished", true);
                        writableMapCreateMap.putDouble("value", eVar2.f11276b.f11169e);
                        eVar2.f11277c.invoke(writableMapCreateMap);
                    } else if (this.f11331e != null) {
                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                        writableMapCreateMap2.putInt("animationId", eVar2.f11278d);
                        writableMapCreateMap2.putBoolean("finished", true);
                        writableMapCreateMap2.putDouble("value", eVar2.f11276b.f11169e);
                        if (writableArrayCreateArray == null) {
                            writableArrayCreateArray = Arguments.createArray();
                        }
                        writableArrayCreateArray.pushMap(writableMapCreateMap2);
                    }
                    this.f11328b.removeAt(size);
                }
            }
            if (writableArrayCreateArray != null) {
                this.f11331e.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
            }
        }
    }

    public void u(int i7, double d7) {
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i7);
        if (abstractC0793b != null && (abstractC0793b instanceof B)) {
            ((B) abstractC0793b).f11170f = d7;
            this.f11329c.put(i7, abstractC0793b);
        } else {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeOffset: Animated node [" + i7 + "] does not exist, or is not a 'value' node");
        }
    }

    public void v(int i7, double d7) {
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i7);
        if (abstractC0793b != null && (abstractC0793b instanceof B)) {
            z(abstractC0793b);
            ((B) abstractC0793b).f11169e = d7;
            this.f11329c.put(i7, abstractC0793b);
        } else {
            throw new JSApplicationIllegalArgumentException("setAnimatedNodeValue: Animated node [" + i7 + "] does not exist, or is not a 'value' node");
        }
    }

    public void w(int i7, int i8, ReadableMap readableMap, Callback callback) {
        e gVar;
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i8);
        if (abstractC0793b == null) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i8 + "] does not exist");
        }
        if (!(abstractC0793b instanceof B)) {
            throw new JSApplicationIllegalArgumentException("startAnimatingNode: Animated node [" + i8 + "] should be of type " + B.class.getName());
        }
        e eVar = (e) this.f11328b.get(i7);
        if (eVar != null) {
            eVar.a(readableMap);
            return;
        }
        String string = readableMap.getString("type");
        if ("frames".equals(string)) {
            gVar = new j(readableMap);
        } else if ("spring".equals(string)) {
            gVar = new t(readableMap);
        } else {
            if (!"decay".equals(string)) {
                throw new JSApplicationIllegalArgumentException("startAnimatingNode: Unsupported animation type [" + i8 + "]: " + string);
            }
            gVar = new g(readableMap);
        }
        gVar.f11278d = i7;
        gVar.f11277c = callback;
        gVar.f11276b = (B) abstractC0793b;
        this.f11328b.put(i7, gVar);
    }

    public void x(int i7, c cVar) {
        AbstractC0793b abstractC0793b = (AbstractC0793b) this.f11327a.get(i7);
        if (abstractC0793b != null && (abstractC0793b instanceof B)) {
            ((B) abstractC0793b).n(cVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("startListeningToAnimatedNodeValue: Animated node [" + i7 + "] does not exist, or is not a 'value' node");
    }

    public void y(int i7) {
        WritableArray writableArrayCreateArray;
        int i8 = 0;
        while (true) {
            writableArrayCreateArray = null;
            if (i8 >= this.f11328b.size()) {
                break;
            }
            e eVar = (e) this.f11328b.valueAt(i8);
            if (eVar.f11278d == i7) {
                if (eVar.f11277c != null) {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("finished", false);
                    writableMapCreateMap.putDouble("value", eVar.f11276b.f11169e);
                    eVar.f11277c.invoke(writableMapCreateMap);
                } else if (this.f11331e != null) {
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putInt("animationId", eVar.f11278d);
                    writableMapCreateMap2.putBoolean("finished", false);
                    writableMapCreateMap2.putDouble("value", eVar.f11276b.f11169e);
                    writableArrayCreateArray = Arguments.createArray();
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                }
                this.f11328b.removeAt(i8);
            } else {
                i8++;
            }
        }
        if (writableArrayCreateArray != null) {
            this.f11331e.emitDeviceEvent("onNativeAnimatedModuleAnimationFinished", writableArrayCreateArray);
        }
    }
}
