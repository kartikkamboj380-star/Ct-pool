package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import w2.C2184a;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f12249l = "C";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f12250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f12251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f12252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f12253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final G0 f12254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2184a f12255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RootViewManager f12256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final B2.e f12257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f12258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f12259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HashMap f12260k;

    class a implements B2.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroupManager f12261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f12262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f12263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set f12264d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f12265e;

        a(ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i7) {
            this.f12261a = viewGroupManager;
            this.f12262b = viewGroup;
            this.f12263c = view;
            this.f12264d = set;
            this.f12265e = i7;
        }

        @Override // B2.f
        public void a() {
            UiThreadUtil.assertOnUiThread();
            this.f12261a.removeView(this.f12262b, this.f12263c);
            C.this.m(this.f12263c);
            this.f12264d.remove(Integer.valueOf(this.f12263c.getId()));
            if (this.f12264d.isEmpty()) {
                C.this.f12260k.remove(Integer.valueOf(this.f12265e));
            }
        }
    }

    public C(G0 g02) {
        this(g02, new RootViewManager());
    }

    private void B(View view, int i7, int i8, int i9, int i10) {
        if (this.f12259j && this.f12257h.h(view)) {
            this.f12257h.b(view, i7, i8, i9, i10);
        } else {
            view.layout(i7, i8, i9 + i7, i10 + i8);
        }
    }

    private boolean d(int[] iArr, int i7) {
        if (iArr == null) {
            return false;
        }
        for (int i8 : iArr) {
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    private void g(View view, int[] iArr) {
        this.f12258i.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        r(view, this.f12258i);
        iArr[0] = Math.round(this.f12258i.left);
        iArr[1] = Math.round(this.f12258i.top);
        RectF rectF = this.f12258i;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.f12258i;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    private static String i(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, y0[] y0VarArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + "\n");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  children(");
            sb2.append(viewGroupManager.getChildCount(viewGroup));
            sb2.append("): [\n");
            sb.append(sb2.toString());
            for (int i7 = 0; viewGroupManager.getChildAt(viewGroup, i7) != null; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (viewGroupManager.getChildAt(viewGroup, i9) == null || i8 >= 16) {
                        break;
                    }
                    sb.append(viewGroupManager.getChildAt(viewGroup, i9).getId() + ",");
                    i8++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            sb.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i10 = 0; i10 < iArr.length; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 >= iArr.length || i11 >= 16) {
                        break;
                    }
                    sb.append(iArr[i12] + ",");
                    i11++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (y0VarArr != null) {
            sb.append("  viewsToAdd(" + y0VarArr.length + "): [\n");
            for (int i13 = 0; i13 < y0VarArr.length; i13 += 16) {
                int i14 = 0;
                while (true) {
                    int i15 = i13 + i14;
                    if (i15 >= y0VarArr.length || i14 >= 16) {
                        break;
                    }
                    sb.append("[" + y0VarArr[i15].f12746b + "," + y0VarArr[i15].f12745a + "],");
                    i14++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            sb.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i16 = 0; i16 < iArr2.length; i16 += 16) {
                int i17 = 0;
                while (true) {
                    int i18 = i16 + i17;
                    if (i18 >= iArr2.length || i17 >= 16) {
                        break;
                    }
                    sb.append(iArr2[i18] + ",");
                    i17++;
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    private Set o(int i7) {
        if (this.f12260k == null) {
            this.f12260k = new HashMap();
        }
        if (!this.f12260k.containsKey(Integer.valueOf(i7))) {
            this.f12260k.put(Integer.valueOf(i7), new HashSet());
        }
        return (Set) this.f12260k.get(Integer.valueOf(i7));
    }

    private void r(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        while (true) {
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return;
            }
            view = (View) parent;
            rectF.offset(-view.getScrollX(), -view.getScrollY());
            Matrix matrix2 = view.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:4:0x001b, B:6:0x0034, B:9:0x003a, B:11:0x0042, B:13:0x004e, B:15:0x0052, B:18:0x0061, B:19:0x007c, B:17:0x0058), top: B:30:0x001b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void A(int i7, int i8, int i9, int i10, int i11, int i12) {
        UiThreadUtil.assertOnUiThread();
        P2.b.a(0L, "NativeViewHierarchyManager_updateLayout").a("parentTag", i7).a("tag", i8).c();
        try {
            View viewV = v(i8);
            viewV.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
            ViewParent parent = viewV.getParent();
            if (parent instanceof Z) {
                parent.requestLayout();
            }
            if (!this.f12253d.get(i7)) {
                NativeModule nativeModule = (ViewManager) this.f12252c.get(i7);
                if (!(nativeModule instanceof r)) {
                    throw new C0892s("Trying to use view with tag " + i7 + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
                }
                r rVar = (r) nativeModule;
                if (rVar != null && !rVar.needsCustomLayoutForChildren()) {
                    B(viewV, i9, i10, i11, i12);
                }
            }
            P2.a.g(0L);
        } catch (Throwable th) {
            P2.a.g(0L);
            throw th;
        }
    }

    public synchronized void C(int i7, W w6) {
        UiThreadUtil.assertOnUiThread();
        try {
            ViewManager viewManagerW = w(i7);
            View viewV = v(i7);
            if (w6 != null) {
                viewManagerW.updateProperties(viewV, w6);
            }
        } catch (C0892s e7) {
            P0.a.k(f12249l, "Unable to update properties for view tag " + i7, e7);
        }
    }

    public synchronized void D(int i7, Object obj) {
        UiThreadUtil.assertOnUiThread();
        w(i7).updateExtraData(v(i7), obj);
    }

    public synchronized void b(int i7, View view) {
        c(i7, view);
    }

    protected final synchronized void c(int i7, View view) {
        try {
            if (view.getId() != -1) {
                P0.a.j(f12249l, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
            }
            this.f12251b.put(i7, view);
            this.f12252c.put(i7, this.f12256g);
            this.f12253d.put(i7, true);
            view.setId(i7);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void e() {
        this.f12255f.b();
    }

    void f() {
        this.f12257h.f();
    }

    void h(ReadableMap readableMap, Callback callback) {
        this.f12257h.e(readableMap, callback);
    }

    public synchronized void j(C0872e0 c0872e0, int i7, String str, W w6) {
        UiThreadUtil.assertOnUiThread();
        P2.b.a(0L, "NativeViewHierarchyManager_createView").a("tag", i7).b("className", str).c();
        try {
            ViewManager viewManagerC = this.f12254e.c(str);
            this.f12251b.put(i7, viewManagerC.createView(i7, c0872e0, w6, null, this.f12255f));
            this.f12252c.put(i7, viewManagerC);
        } finally {
            P2.a.g(0L);
        }
    }

    public synchronized void k(int i7, int i8, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.f12251b.get(i7);
        if (view == null) {
            throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i7 + "] and command " + i8);
        }
        w(i7).receiveCommand(view, i8, readableArray);
    }

    public synchronized void l(int i7, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.f12251b.get(i7);
        if (view == null) {
            throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i7 + "] and command " + str);
        }
        w(i7).receiveCommand(view, str, readableArray);
    }

    protected synchronized void m(View view) {
        try {
            UiThreadUtil.assertOnUiThread();
            if (view == null) {
                return;
            }
            if (this.f12252c.get(view.getId()) == null) {
                return;
            }
            if (!this.f12253d.get(view.getId())) {
                w(view.getId()).onDropViewInstance(view);
            }
            ViewManager viewManager = (ViewManager) this.f12252c.get(view.getId());
            if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                    if (childAt == null) {
                        P0.a.j(f12249l, "Unable to drop null child view");
                    } else if (this.f12251b.get(childAt.getId()) != null) {
                        m(childAt);
                    }
                }
                viewGroupManager.removeAllViews(viewGroup);
            }
            this.f12251b.remove(view.getId());
            this.f12252c.remove(view.getId());
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int n(int i7, float f7, float f8) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = (View) this.f12251b.get(i7);
        if (view == null) {
            throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i7);
        }
        return AbstractC0874f0.d(f7, f8, (ViewGroup) view);
    }

    public synchronized int p() {
        return this.f12253d.size();
    }

    public synchronized void q(int i7, int[] iArr, y0[] y0VarArr, int[] iArr2) {
        int i8;
        int[] iArr3 = iArr;
        synchronized (this) {
            UiThreadUtil.assertOnUiThread();
            Set setO = o(i7);
            ViewGroup viewGroup = (ViewGroup) this.f12251b.get(i7);
            ViewGroupManager viewGroupManager = (ViewGroupManager) w(i7);
            if (viewGroup == null) {
                throw new C0892s("Trying to manageChildren view with tag " + i7 + " which doesn't exist\n detail: " + i(viewGroup, viewGroupManager, iArr3, y0VarArr, iArr2));
            }
            int childCount = viewGroupManager.getChildCount(viewGroup);
            if (iArr3 != null) {
                int length = iArr3.length - 1;
                while (length >= 0) {
                    int i9 = iArr3[length];
                    if (i9 < 0) {
                        throw new C0892s("Trying to remove a negative view index:" + i9 + " view tag: " + i7 + "\n detail: " + i(viewGroup, viewGroupManager, iArr3, y0VarArr, iArr2));
                    }
                    if (viewGroupManager.getChildAt(viewGroup, i9) == null) {
                        if (this.f12253d.get(i7) && viewGroupManager.getChildCount(viewGroup) == 0) {
                            return;
                        }
                        throw new C0892s("Trying to remove a view index above child count " + i9 + " view tag: " + i7 + "\n detail: " + i(viewGroup, viewGroupManager, iArr3, y0VarArr, iArr2));
                    }
                    if (i9 >= childCount) {
                        throw new C0892s("Trying to remove an out of order view index:" + i9 + " view tag: " + i7 + "\n detail: " + i(viewGroup, viewGroupManager, iArr3, y0VarArr, iArr2));
                    }
                    View childAt = viewGroupManager.getChildAt(viewGroup, i9);
                    if (!this.f12259j || !this.f12257h.h(childAt) || !d(iArr2, childAt.getId())) {
                        viewGroupManager.removeViewAt(viewGroup, i9);
                    }
                    length--;
                    childCount = i9;
                }
            }
            if (iArr2 != null) {
                int i10 = 0;
                while (i10 < iArr2.length) {
                    int i11 = iArr2[i10];
                    View view = (View) this.f12251b.get(i11);
                    if (view == null) {
                        throw new C0892s("Trying to destroy unknown view tag: " + i11 + "\n detail: " + i(viewGroup, viewGroupManager, iArr, y0VarArr, iArr2));
                    }
                    if (this.f12259j && this.f12257h.h(view)) {
                        setO.add(Integer.valueOf(i11));
                        i8 = i10;
                        this.f12257h.c(view, new a(viewGroupManager, viewGroup, view, setO, i7));
                    } else {
                        i8 = i10;
                        m(view);
                    }
                    i10 = i8 + 1;
                    iArr3 = iArr;
                }
            }
            int[] iArr4 = iArr3;
            if (y0VarArr != null) {
                for (y0 y0Var : y0VarArr) {
                    View view2 = (View) this.f12251b.get(y0Var.f12745a);
                    if (view2 == null) {
                        throw new C0892s("Trying to add unknown view tag: " + y0Var.f12745a + "\n detail: " + i(viewGroup, viewGroupManager, iArr4, y0VarArr, iArr2));
                    }
                    int i12 = y0Var.f12746b;
                    if (!setO.isEmpty()) {
                        i12 = 0;
                        int i13 = 0;
                        while (i12 < viewGroup.getChildCount() && i13 != y0Var.f12746b) {
                            if (!setO.contains(Integer.valueOf(viewGroup.getChildAt(i12).getId()))) {
                                i13++;
                            }
                            i12++;
                        }
                    }
                    viewGroupManager.addView(viewGroup, view2, i12);
                }
            }
            if (setO.isEmpty()) {
                this.f12260k.remove(Integer.valueOf(i7));
            }
        }
    }

    public synchronized void s(int i7, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.f12251b.get(i7);
        if (view == null) {
            throw new E("No native view for " + i7 + " currently exists");
        }
        View view2 = (View) C0864a0.a(view);
        if (view2 == null) {
            throw new E("Native view " + i7 + " is no longer on screen");
        }
        g(view2, iArr);
        int i8 = iArr[0];
        int i9 = iArr[1];
        g(view, iArr);
        iArr[0] = iArr[0] - i8;
        iArr[1] = iArr[1] - i9;
    }

    public synchronized void t(int i7, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = (View) this.f12251b.get(i7);
        if (view == null) {
            throw new E("No native view for " + i7 + " currently exists");
        }
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        iArr[2] = view.getWidth();
        iArr[3] = view.getHeight();
    }

    public synchronized void u(int i7) {
        try {
            UiThreadUtil.assertOnUiThread();
            if (!this.f12253d.get(i7)) {
                SoftAssertions.assertUnreachable("View with tag " + i7 + " is not registered as a root view");
            }
            m((View) this.f12251b.get(i7));
            this.f12253d.delete(i7);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized View v(int i7) {
        View view;
        view = (View) this.f12251b.get(i7);
        if (view == null) {
            throw new C0892s("Trying to resolve view with tag " + i7 + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager w(int i7) {
        ViewManager viewManager;
        viewManager = (ViewManager) this.f12252c.get(i7);
        if (viewManager == null) {
            throw new C0892s("ViewManager for tag " + i7 + " could not be found.\n");
        }
        return viewManager;
    }

    public void x(int i7, int i8) {
        View view = (View) this.f12251b.get(i7);
        if (view != null) {
            view.sendAccessibilityEvent(i8);
            return;
        }
        throw new RetryableMountingLayerException("Could not find view with tag " + i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void y(int i7, int i8, boolean z6) {
        if (!z6) {
            this.f12255f.d(i8, null);
            return;
        }
        View view = (View) this.f12251b.get(i7);
        if (i8 != i7 && (view instanceof ViewParent)) {
            this.f12255f.d(i8, (ViewParent) view);
            return;
        }
        if (this.f12253d.get(i7)) {
            SoftAssertions.assertUnreachable("Cannot block native responder on " + i7 + " that is a root view");
        }
        this.f12255f.d(i8, view.getParent());
    }

    public void z(boolean z6) {
        this.f12259j = z6;
    }

    public C(G0 g02, RootViewManager rootViewManager) {
        this.f12250a = false;
        this.f12255f = new C2184a();
        this.f12257h = new B2.e();
        this.f12258i = new RectF();
        this.f12254e = g02;
        this.f12251b = new SparseArray();
        this.f12252c = new SparseArray();
        this.f12253d = new SparseBooleanArray();
        this.f12256g = rootViewManager;
    }
}
