package a2;

import a2.c;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.fabric.i;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.C0892s;
import com.facebook.react.uimanager.G0;
import com.facebook.react.uimanager.InterfaceC0870d0;
import com.facebook.react.uimanager.InterfaceC0891q;
import com.facebook.react.uimanager.P;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.S;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.W;
import com.facebook.react.uimanager.Z;
import e2.C1619a;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import w2.C2184a;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f4732o = "f";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0872e0 f4735c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C2184a f4738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private G0 f4739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private RootViewManager f4740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c.a f4741i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private c f4744l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private n.h f4745m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f4746n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f4733a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f4734b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap f4736d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Queue f4737e = new ArrayDeque();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Stack f4742j = new Stack();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set f4743k = new HashSet();

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ d f4747m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ b f4748n;

        a(d dVar, b bVar) {
            this.f4747m = dVar;
            this.f4748n = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = this.f4747m;
            EventEmitterWrapper eventEmitterWrapper = dVar.f4762h;
            if (eventEmitterWrapper != null) {
                this.f4748n.a(eventEmitterWrapper);
                return;
            }
            if (dVar.f4763i == null) {
                dVar.f4763i = new LinkedList();
            }
            this.f4747m.f4763i.add(this.f4748n);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f4751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f4752c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final WritableMap f4753d;

        public b(String str, WritableMap writableMap, int i7, boolean z6) {
            this.f4750a = str;
            this.f4753d = writableMap;
            this.f4752c = i7;
            this.f4751b = z6;
        }

        public void a(EventEmitterWrapper eventEmitterWrapper) {
            if (this.f4751b) {
                eventEmitterWrapper.d(this.f4750a, this.f4753d);
            } else {
                eventEmitterWrapper.b(this.f4750a, this.f4753d, this.f4752c);
            }
        }
    }

    private class c extends i {
        private c(ReactContext reactContext) {
            super(reactContext);
        }

        private boolean b(long j7) {
            return 16 - ((System.nanoTime() - j7) / 1000000) < 9;
        }

        @Override // com.facebook.react.fabric.i
        public void a(long j7) {
            Stack stack = new Stack();
            int i7 = 0;
            while (!f.this.f4742j.empty()) {
                try {
                    Integer num = (Integer) f.this.f4742j.pop();
                    int iIntValue = num.intValue();
                    i7++;
                    if (f.this.f4743k.contains(num)) {
                        ReactSoftExceptionLogger.logSoftException(f.f4732o, new C0892s("RemoveDeleteTree recursively tried to remove a React View that was actually reused. This indicates a bug in the Differ. [" + iIntValue + "]"));
                    } else {
                        stack.clear();
                        d dVarR = f.this.r(iIntValue);
                        if (dVarR != null) {
                            View view = dVarR.f4755a;
                            NativeModule nativeModule = dVarR.f4758d;
                            if (nativeModule instanceof InterfaceC0891q) {
                                InterfaceC0891q interfaceC0891q = (InterfaceC0891q) nativeModule;
                                int i8 = 0;
                                boolean z6 = false;
                                while (true) {
                                    View childAt = interfaceC0891q.getChildAt(view, i8);
                                    if (childAt == null) {
                                        break;
                                    }
                                    z6 = z6 || f.this.r(childAt.getId()) != null;
                                    stack.push(Integer.valueOf(childAt.getId()));
                                    i8++;
                                }
                                if (z6) {
                                    try {
                                        interfaceC0891q.removeAllViews(view);
                                    } catch (RuntimeException e7) {
                                        ReactSoftExceptionLogger.logSoftException(f.f4732o, e7);
                                        z6 = false;
                                    }
                                }
                                if (z6) {
                                    f.this.f4742j.addAll(stack);
                                }
                            }
                            f.this.f4736d.remove(num);
                            f.this.C(dVarR);
                            if (i7 % 20 == 0 && b(j7)) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                } catch (Throwable th) {
                    if (f.this.f4742j.empty()) {
                        f.this.f4743k.clear();
                        f.this.f4742j.clear();
                    } else {
                        com.facebook.react.modules.core.a.h().m(a.b.IDLE_EVENT, this);
                    }
                    throw th;
                }
            }
            if (!f.this.f4742j.empty()) {
                com.facebook.react.modules.core.a.h().m(a.b.IDLE_EVENT, this);
            } else {
                f.this.f4743k.clear();
                f.this.f4742j.clear();
            }
        }
    }

    public f(int i7, C2184a c2184a, G0 g02, RootViewManager rootViewManager, c.a aVar, C0872e0 c0872e0) {
        this.f4746n = i7;
        this.f4738f = c2184a;
        this.f4739g = g02;
        this.f4740h = rootViewManager;
        this.f4741i = aVar;
        this.f4735c = c0872e0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A() {
        this.f4745m = new n.h();
        for (Map.Entry entry : this.f4736d.entrySet()) {
            this.f4745m.l(((Integer) entry.getKey()).intValue(), this);
            C((d) entry.getValue());
        }
        this.f4736d = null;
        this.f4738f = null;
        this.f4740h = null;
        this.f4741i = null;
        this.f4735c = null;
        if (C1619a.a()) {
            this.f4744l = null;
        }
        this.f4737e.clear();
        if (ReactFeatureFlags.enableViewRecycling) {
            this.f4739g.i(this.f4746n);
        }
        P0.a.j(f4732o, "Surface [" + this.f4746n + "] was stopped on SurfaceMountingManager.");
    }

    private static void B(ViewGroup viewGroup, boolean z6) {
        int id = viewGroup.getId();
        P0.a.j(f4732o, "  <ViewGroup tag=" + id + " class=" + viewGroup.getClass().toString() + ">");
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            P0.a.j(f4732o, "     <View idx=" + i7 + " tag=" + viewGroup.getChildAt(i7).getId() + " class=" + viewGroup.getChildAt(i7).getClass().toString() + ">");
        }
        String str = f4732o;
        P0.a.j(str, "  </ViewGroup tag=" + id + ">");
        if (z6) {
            P0.a.j(str, "Displaying Ancestors:");
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                int id2 = viewGroup2 == null ? -1 : viewGroup2.getId();
                P0.a.j(f4732o, "<ViewParent tag=" + id2 + " class=" + parent.getClass().toString() + ">");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(d dVar) {
        InterfaceC0870d0 interfaceC0870d0 = dVar.f4761g;
        if (interfaceC0870d0 != null) {
            interfaceC0870d0.d();
            dVar.f4761g = null;
        }
        EventEmitterWrapper eventEmitterWrapper = dVar.f4762h;
        if (eventEmitterWrapper != null) {
            eventEmitterWrapper.a();
            dVar.f4762h = null;
        }
        ViewManager viewManager = dVar.f4758d;
        if (dVar.f4757c || viewManager == null) {
            return;
        }
        viewManager.onDropViewInstance(dVar.f4755a);
    }

    private void h(final View view) {
        if (y()) {
            return;
        }
        this.f4736d.put(Integer.valueOf(this.f4746n), new d(this.f4746n, view, this.f4740h, true));
        Runnable runnable = new Runnable() { // from class: a2.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f4729m.z(view);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    private void o() {
        this.f4741i.a(this.f4737e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d r(int i7) {
        ConcurrentHashMap concurrentHashMap = this.f4736d;
        if (concurrentHashMap == null) {
            return null;
        }
        return (d) concurrentHashMap.get(Integer.valueOf(i7));
    }

    private static InterfaceC0891q v(d dVar) {
        NativeModule nativeModule = dVar.f4758d;
        if (nativeModule != null) {
            return (InterfaceC0891q) nativeModule;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + dVar);
    }

    private d w(int i7) {
        d dVar = (d) this.f4736d.get(Integer.valueOf(i7));
        if (dVar != null) {
            return dVar;
        }
        throw new RetryableMountingLayerException("Unable to find viewState for tag " + i7 + ". Surface stopped: " + y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void z(View view) {
        if (y()) {
            return;
        }
        if (view.getId() == this.f4746n) {
            ReactSoftExceptionLogger.logSoftException(f4732o, new C0892s("Race condition in addRootView detected. Trying to set an id of [" + this.f4746n + "] on the RootView, but that id has already been set. "));
        } else if (view.getId() != -1) {
            P0.a.l(f4732o, "Trying to add RootTag to RootView that already has a tag: existing tag: [%d] new tag: [%d]", Integer.valueOf(view.getId()), Integer.valueOf(this.f4746n));
            throw new C0892s("Trying to add a root view with an explicit id already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
        }
        view.setId(this.f4746n);
        if (view instanceof S) {
            ((S) view).setRootViewTag(this.f4746n);
        }
        if (!C1619a.b()) {
            this.f4734b = true;
        }
        o();
        if (C1619a.b()) {
            this.f4734b = true;
        }
    }

    public void D(String str, int i7, ReadableMap readableMap, InterfaceC0870d0 interfaceC0870d0, EventEmitterWrapper eventEmitterWrapper, boolean z6) {
        UiThreadUtil.assertOnUiThread();
        if (!y() && r(i7) == null) {
            l(str, i7, readableMap, interfaceC0870d0, eventEmitterWrapper, z6);
        }
    }

    public void E() {
        P0.a.l(f4732o, "Views created for surface {%d}:", Integer.valueOf(s()));
        for (d dVar : this.f4736d.values()) {
            ViewManager viewManager = dVar.f4758d;
            Integer numValueOf = null;
            String name = viewManager != null ? viewManager.getName() : null;
            View view = dVar.f4755a;
            View view2 = view != null ? (View) view.getParent() : null;
            if (view2 != null) {
                numValueOf = Integer.valueOf(view2.getId());
            }
            P0.a.l(f4732o, "<%s id=%d parentTag=%s isRoot=%b />", name, Integer.valueOf(dVar.f4756b), numValueOf, Boolean.valueOf(dVar.f4757c));
        }
    }

    public void F(int i7, int i8, ReadableArray readableArray) {
        if (y()) {
            return;
        }
        d dVarR = r(i7);
        if (dVarR == null) {
            throw new RetryableMountingLayerException("Unable to find viewState for tag: [" + i7 + "] for commandId: " + i8);
        }
        ViewManager viewManager = dVarR.f4758d;
        if (viewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewManager for tag " + i7);
        }
        View view = dVarR.f4755a;
        if (view != null) {
            viewManager.receiveCommand(view, i8, readableArray);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i7);
    }

    public void G(int i7, String str, ReadableArray readableArray) {
        if (y()) {
            return;
        }
        d dVarR = r(i7);
        if (dVarR == null) {
            throw new RetryableMountingLayerException("Unable to find viewState for tag: " + i7 + " for commandId: " + str);
        }
        ViewManager viewManager = dVarR.f4758d;
        if (viewManager == null) {
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i7);
        }
        View view = dVarR.f4755a;
        if (view != null) {
            viewManager.receiveCommand(view, str, readableArray);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i7);
    }

    public void H(int i7, int i8, int i9) {
        if (y()) {
            return;
        }
        UiThreadUtil.assertOnUiThread();
        d dVarR = r(i8);
        if (dVarR == null) {
            ReactSoftExceptionLogger.logSoftException(a2.c.f4720i, new IllegalStateException("Unable to find viewState for tag: [" + i8 + "] for removeDeleteTreeAt"));
            return;
        }
        View view = dVarR.f4755a;
        if (!(view instanceof ViewGroup)) {
            String str = "Unable to remove+delete a view from a view that is not a ViewGroup. ParentTag: " + i8 + " - Tag: " + i7 + " - Index: " + i9;
            P0.a.j(f4732o, str);
            throw new IllegalStateException(str);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            throw new IllegalStateException("Unable to find view for tag [" + i8 + "]");
        }
        InterfaceC0891q interfaceC0891qV = v(dVarR);
        View childAt = interfaceC0891qV.getChildAt(viewGroup, i9);
        int id = childAt != null ? childAt.getId() : -1;
        if (id != i7) {
            int childCount = viewGroup.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                } else if (viewGroup.getChildAt(i10).getId() == i7) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                P0.a.j(f4732o, "removeDeleteTreeAt: [" + i7 + "] -> [" + i8 + "] @" + i9 + ": view already removed from parent! Children in parent: " + childCount);
                return;
            }
            B(viewGroup, true);
            ReactSoftExceptionLogger.logSoftException(f4732o, new IllegalStateException("Tried to remove+delete view [" + i7 + "] of parent [" + i8 + "] at index " + i9 + ", but got view tag " + id + " - actual index of view: " + i10));
            i9 = i10;
        }
        try {
            interfaceC0891qV.removeViewAt(viewGroup, i9);
            if (this.f4742j.empty()) {
                if (this.f4744l == null) {
                    this.f4744l = new c(this.f4735c);
                }
                com.facebook.react.modules.core.a.h().m(a.b.IDLE_EVENT, this.f4744l);
            }
            this.f4742j.push(Integer.valueOf(i7));
        } catch (RuntimeException e7) {
            int childCount2 = interfaceC0891qV.getChildCount(viewGroup);
            B(viewGroup, true);
            throw new IllegalStateException("Cannot remove child at index " + i9 + " from parent ViewGroup [" + viewGroup.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e7);
        }
    }

    public void I(int i7, int i8, int i9) {
        if (y()) {
            return;
        }
        if (this.f4743k.contains(Integer.valueOf(i7))) {
            ReactSoftExceptionLogger.logSoftException(f4732o, new C0892s("removeViewAt tried to remove a React View that was actually reused. This indicates a bug in the Differ (specifically instruction ordering). [" + i7 + "]"));
            return;
        }
        UiThreadUtil.assertOnUiThread();
        d dVarR = r(i8);
        if (dVarR == null) {
            ReactSoftExceptionLogger.logSoftException(a2.c.f4720i, new IllegalStateException("Unable to find viewState for tag: [" + i8 + "] for removeViewAt"));
            return;
        }
        View view = dVarR.f4755a;
        if (!(view instanceof ViewGroup)) {
            String str = "Unable to remove a view from a view that is not a ViewGroup. ParentTag: " + i8 + " - Tag: " + i7 + " - Index: " + i9;
            P0.a.j(f4732o, str);
            throw new IllegalStateException(str);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup == null) {
            throw new IllegalStateException("Unable to find view for tag [" + i8 + "]");
        }
        InterfaceC0891q interfaceC0891qV = v(dVarR);
        View childAt = interfaceC0891qV.getChildAt(viewGroup, i9);
        int id = childAt != null ? childAt.getId() : -1;
        if (id != i7) {
            int childCount = viewGroup.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                } else if (viewGroup.getChildAt(i10).getId() == i7) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                P0.a.j(f4732o, "removeViewAt: [" + i7 + "] -> [" + i8 + "] @" + i9 + ": view already removed from parent! Children in parent: " + childCount);
                return;
            }
            B(viewGroup, true);
            ReactSoftExceptionLogger.logSoftException(f4732o, new IllegalStateException("Tried to remove view [" + i7 + "] of parent [" + i8 + "] at index " + i9 + ", but got view tag " + id + " - actual index of view: " + i10));
            i9 = i10;
        }
        try {
            interfaceC0891qV.removeViewAt(viewGroup, i9);
        } catch (RuntimeException e7) {
            int childCount2 = interfaceC0891qV.getChildCount(viewGroup);
            B(viewGroup, true);
            throw new IllegalStateException("Cannot remove child at index " + i9 + " from parent ViewGroup [" + viewGroup.getId() + "], only " + childCount2 + " children in parent. Warning: childCount may be incorrect!", e7);
        }
    }

    public void J(MountItem mountItem) {
        this.f4737e.add(mountItem);
    }

    public void K(int i7, int i8) {
        if (y()) {
            return;
        }
        d dVarW = w(i7);
        if (dVarW.f4758d == null) {
            throw new RetryableMountingLayerException("Unable to find viewState manager for tag " + i7);
        }
        View view = dVarW.f4755a;
        if (view != null) {
            view.sendAccessibilityEvent(i8);
            return;
        }
        throw new RetryableMountingLayerException("Unable to find viewState view for tag " + i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void L(int i7, int i8, boolean z6) {
        UiThreadUtil.assertOnUiThread();
        if (y()) {
            return;
        }
        if (!z6) {
            this.f4738f.d(i8, null);
            return;
        }
        d dVarW = w(i7);
        View view = dVarW.f4755a;
        if (i8 != i7 && (view instanceof ViewParent)) {
            this.f4738f.d(i8, (ViewParent) view);
            return;
        }
        if (view == 0) {
            SoftAssertions.assertUnreachable("Cannot find view for tag [" + i7 + "].");
            return;
        }
        if (dVarW.f4757c) {
            SoftAssertions.assertUnreachable("Cannot block native responder on [" + i7 + "] that is a root view");
        }
        this.f4738f.d(i8, view.getParent());
    }

    public void M() {
        P0.a.j(f4732o, "Stopping surface [" + this.f4746n + "]");
        if (y()) {
            return;
        }
        this.f4733a = true;
        for (d dVar : this.f4736d.values()) {
            InterfaceC0870d0 interfaceC0870d0 = dVar.f4761g;
            if (interfaceC0870d0 != null) {
                interfaceC0870d0.d();
                dVar.f4761g = null;
            }
            EventEmitterWrapper eventEmitterWrapper = dVar.f4762h;
            if (eventEmitterWrapper != null) {
                eventEmitterWrapper.a();
                dVar.f4762h = null;
            }
        }
        Runnable runnable = new Runnable() { // from class: a2.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f4731m.A();
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void N(int i7, EventEmitterWrapper eventEmitterWrapper) {
        UiThreadUtil.assertOnUiThread();
        if (y()) {
            return;
        }
        d dVar = (d) this.f4736d.get(Integer.valueOf(i7));
        View view = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (dVar == null) {
            dVar = new d(i7, view, (ViewManager) (objArr2 == true ? 1 : 0));
            this.f4736d.put(Integer.valueOf(i7), dVar);
        }
        EventEmitterWrapper eventEmitterWrapper2 = dVar.f4762h;
        dVar.f4762h = eventEmitterWrapper;
        if (eventEmitterWrapper2 != eventEmitterWrapper && eventEmitterWrapper2 != null) {
            eventEmitterWrapper2.a();
        }
        Queue queue = dVar.f4763i;
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(eventEmitterWrapper);
            }
            dVar.f4763i = null;
        }
    }

    public void O(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        if (y()) {
            return;
        }
        d dVarW = w(i7);
        if (dVarW.f4757c) {
            return;
        }
        View view = dVarW.f4755a;
        if (view == null) {
            throw new IllegalStateException("Unable to find View for tag: " + i7);
        }
        if (C1619a.d()) {
            int i15 = 1;
            if (i14 == 1) {
                i15 = 0;
            } else if (i14 != 2) {
                i15 = 2;
            }
            view.setLayoutDirection(i15);
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
        ViewParent parent = view.getParent();
        if (parent instanceof Z) {
            parent.requestLayout();
        }
        NativeModule nativeModule = w(i8).f4758d;
        InterfaceC0891q interfaceC0891q = nativeModule != null ? (InterfaceC0891q) nativeModule : null;
        if (interfaceC0891q == null || !interfaceC0891q.needsCustomLayoutForChildren()) {
            view.layout(i9, i10, i11 + i9, i12 + i10);
        }
        int i16 = i13 == 0 ? 4 : 0;
        if (view.getVisibility() != i16) {
            view.setVisibility(i16);
        }
    }

    public void P(int i7, int i8, int i9, int i10, int i11) {
        if (y()) {
            return;
        }
        d dVarW = w(i7);
        if (dVarW.f4757c) {
            return;
        }
        KeyEvent.Callback callback = dVarW.f4755a;
        if (callback != null) {
            if (callback instanceof P) {
                ((P) callback).setOverflowInset(i8, i9, i10, i11);
            }
        } else {
            throw new IllegalStateException("Unable to find View for tag: " + i7);
        }
    }

    public void Q(int i7, int i8, int i9, int i10, int i11) {
        UiThreadUtil.assertOnUiThread();
        if (y()) {
            return;
        }
        d dVarW = w(i7);
        if (dVarW.f4757c) {
            return;
        }
        View view = dVarW.f4755a;
        if (view == null) {
            throw new IllegalStateException("Unable to find View for tag: " + i7);
        }
        ViewManager viewManager = dVarW.f4758d;
        if (viewManager != null) {
            viewManager.setPadding(view, i8, i9, i10, i11);
            return;
        }
        throw new IllegalStateException("Unable to find ViewManager for view: " + dVarW);
    }

    public void R(int i7, ReadableMap readableMap) {
        if (y()) {
            return;
        }
        d dVarW = w(i7);
        dVarW.f4759e = new W(readableMap);
        View view = dVarW.f4755a;
        if (view != null) {
            ((ViewManager) O1.a.c(dVarW.f4758d)).updateProperties(view, dVarW.f4759e);
            return;
        }
        throw new IllegalStateException("Unable to find view for tag [" + i7 + "]");
    }

    public void S(int i7, InterfaceC0870d0 interfaceC0870d0) {
        UiThreadUtil.assertOnUiThread();
        if (y()) {
            return;
        }
        d dVarW = w(i7);
        InterfaceC0870d0 interfaceC0870d02 = dVarW.f4761g;
        dVarW.f4761g = interfaceC0870d0;
        ViewManager viewManager = dVarW.f4758d;
        if (viewManager == null) {
            throw new IllegalStateException("Unable to find ViewManager for tag: " + i7);
        }
        Object objUpdateState = viewManager.updateState(dVarW.f4755a, dVarW.f4759e, interfaceC0870d0);
        if (objUpdateState != null) {
            viewManager.updateExtraData(dVarW.f4755a, objUpdateState);
        }
        if (interfaceC0870d02 != null) {
            interfaceC0870d02.d();
        }
    }

    public void i(int i7, int i8, int i9) {
        UiThreadUtil.assertOnUiThread();
        if (y()) {
            return;
        }
        d dVarW = w(i7);
        View view = dVarW.f4755a;
        if (!(view instanceof ViewGroup)) {
            String str = "Unable to add a view into a view that is not a ViewGroup. ParentTag: " + i7 + " - Tag: " + i8 + " - Index: " + i9;
            P0.a.j(f4732o, str);
            throw new IllegalStateException(str);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        d dVarW2 = w(i8);
        View view2 = dVarW2.f4755a;
        if (view2 == null) {
            throw new IllegalStateException("Unable to find view for viewState " + dVarW2 + " and tag " + i8);
        }
        ViewParent parent = view2.getParent();
        if (parent != null) {
            boolean z6 = parent instanceof ViewGroup;
            int id = z6 ? ((ViewGroup) parent).getId() : -1;
            ReactSoftExceptionLogger.logSoftException(f4732o, new IllegalStateException("addViewAt: cannot insert view [" + i8 + "] into parent [" + i7 + "]: View already has a parent: [" + id + "]  Parent: " + parent.getClass().getSimpleName() + " View: " + view2.getClass().getSimpleName()));
            if (z6) {
                ((ViewGroup) parent).removeView(view2);
            }
            this.f4743k.add(Integer.valueOf(i8));
        }
        try {
            v(dVarW).addView(viewGroup, view2, i9);
        } catch (IllegalStateException e7) {
            throw new IllegalStateException("addViewAt: failed to insert view [" + i8 + "] into parent [" + i7 + "] at index " + i9, e7);
        }
    }

    public void j(View view, C0872e0 c0872e0) {
        this.f4735c = c0872e0;
        h(view);
    }

    public void k(String str, int i7, ReadableMap readableMap, InterfaceC0870d0 interfaceC0870d0, EventEmitterWrapper eventEmitterWrapper, boolean z6) {
        if (y()) {
            return;
        }
        d dVarR = r(i7);
        if (dVarR == null || dVarR.f4755a == null) {
            l(str, i7, readableMap, interfaceC0870d0, eventEmitterWrapper, z6);
        }
    }

    public void l(String str, int i7, ReadableMap readableMap, InterfaceC0870d0 interfaceC0870d0, EventEmitterWrapper eventEmitterWrapper, boolean z6) {
        ViewManager viewManagerC;
        View viewCreateView;
        W w6 = new W(readableMap);
        if (z6) {
            viewManagerC = this.f4739g.c(str);
            viewCreateView = viewManagerC.createView(i7, this.f4735c, w6, interfaceC0870d0, this.f4738f);
        } else {
            viewManagerC = null;
            viewCreateView = null;
        }
        d dVar = new d(i7, viewCreateView, viewManagerC);
        dVar.f4759e = w6;
        dVar.f4761g = interfaceC0870d0;
        dVar.f4762h = eventEmitterWrapper;
        this.f4736d.put(Integer.valueOf(i7), dVar);
    }

    public void m(int i7) {
        UiThreadUtil.assertOnUiThread();
        if (y()) {
            return;
        }
        d dVarR = r(i7);
        if (dVarR != null) {
            this.f4736d.remove(Integer.valueOf(i7));
            C(dVarR);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(a2.c.f4720i, new IllegalStateException("Unable to find viewState for tag: " + i7 + " for deleteView"));
    }

    public void n(int i7, String str, boolean z6, WritableMap writableMap, int i8) {
        d dVar;
        ConcurrentHashMap concurrentHashMap = this.f4736d;
        if (concurrentHashMap == null || (dVar = (d) concurrentHashMap.get(Integer.valueOf(i7))) == null) {
            return;
        }
        UiThreadUtil.runOnUiThread(new a(dVar, new b(str, writableMap, i8, z6)));
    }

    public C0872e0 p() {
        return this.f4735c;
    }

    public EventEmitterWrapper q(int i7) {
        d dVarR = r(i7);
        if (dVarR == null) {
            return null;
        }
        return dVarR.f4762h;
    }

    public int s() {
        return this.f4746n;
    }

    public View t(int i7) {
        d dVarR = r(i7);
        View view = dVarR == null ? null : dVarR.f4755a;
        if (view != null) {
            return view;
        }
        throw new C0892s("Trying to resolve view with tag " + i7 + " which doesn't exist");
    }

    public boolean u(int i7) {
        n.h hVar = this.f4745m;
        if (hVar != null && hVar.d(i7)) {
            return true;
        }
        ConcurrentHashMap concurrentHashMap = this.f4736d;
        if (concurrentHashMap == null) {
            return false;
        }
        return concurrentHashMap.containsKey(Integer.valueOf(i7));
    }

    public boolean x() {
        return this.f4734b;
    }

    public boolean y() {
        return this.f4733a;
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f4755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f4756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f4757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ViewManager f4758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public W f4759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ReadableMap f4760f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InterfaceC0870d0 f4761g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public EventEmitterWrapper f4762h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Queue f4763i;

        private d(int i7, View view, ViewManager viewManager) {
            this(i7, view, viewManager, false);
        }

        public String toString() {
            return "ViewState [" + this.f4756b + "] - isRoot: " + this.f4757c + " - props: " + this.f4759e + " - localData: " + this.f4760f + " - viewManager: " + this.f4758d + " - isLayoutOnly: " + (this.f4758d == null);
        }

        private d(int i7, View view, ViewManager viewManager, boolean z6) {
            this.f4759e = null;
            this.f4760f = null;
            this.f4761g = null;
            this.f4762h = null;
            this.f4763i = null;
            this.f4756b = i7;
            this.f4755a = view;
            this.f4757c = z6;
            this.f4758d = viewManager;
        }
    }
}
