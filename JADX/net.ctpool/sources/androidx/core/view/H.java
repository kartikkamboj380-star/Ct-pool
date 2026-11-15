package androidx.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.C0574a;
import androidx.core.view.U;
import androidx.core.view.accessibility.C;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import u.AbstractC2078c;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Field f7271c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f7269a = new AtomicInteger(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static WeakHashMap f7270b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f7272d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f7273e = {AbstractC2078c.f22362b, AbstractC2078c.f22363c, AbstractC2078c.f22374n, AbstractC2078c.f22385y, AbstractC2078c.f22343B, AbstractC2078c.f22344C, AbstractC2078c.f22345D, AbstractC2078c.f22346E, AbstractC2078c.f22347F, AbstractC2078c.f22348G, AbstractC2078c.f22364d, AbstractC2078c.f22365e, AbstractC2078c.f22366f, AbstractC2078c.f22367g, AbstractC2078c.f22368h, AbstractC2078c.f22369i, AbstractC2078c.f22370j, AbstractC2078c.f22371k, AbstractC2078c.f22372l, AbstractC2078c.f22373m, AbstractC2078c.f22375o, AbstractC2078c.f22376p, AbstractC2078c.f22377q, AbstractC2078c.f22378r, AbstractC2078c.f22379s, AbstractC2078c.f22380t, AbstractC2078c.f22381u, AbstractC2078c.f22382v, AbstractC2078c.f22383w, AbstractC2078c.f22384x, AbstractC2078c.f22386z, AbstractC2078c.f22342A};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final E f7274f = new E() { // from class: androidx.core.view.G
        @Override // androidx.core.view.E
        public final C0584d a(C0584d c0584d) {
            return H.X(c0584d);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final e f7275g = new e();

    class a extends f {
        a(int i7, Class cls, int i8) {
            super(i7, cls, i8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(p.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            p.i(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f {
        b(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return p.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            p.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f {
        c(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public CharSequence d(View view) {
            return r.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, CharSequence charSequence) {
            r.b(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f {
        d(int i7, Class cls, int i8) {
            super(i7, cls, i8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean d(View view) {
            return Boolean.valueOf(p.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void e(View view, Boolean bool) {
            p.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.H.f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final WeakHashMap f7276m = new WeakHashMap();

        e() {
        }

        private void b(View view, boolean z6) {
            boolean z7 = view.isShown() && view.getWindowVisibility() == 0;
            if (z6 != z7) {
                H.Y(view, z7 ? 16 : 32);
                this.f7276m.put(view, Boolean.valueOf(z7));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        void a(View view) {
            this.f7276m.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        void d(View view) {
            this.f7276m.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.f7276m.entrySet()) {
                    b((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f7278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f7280d;

        f(int i7, Class cls, int i8) {
            this(i7, cls, 0, i8);
        }

        private boolean b() {
            return true;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f7279c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object d(View view);

        abstract void e(View view, Object obj);

        Object f(View view) {
            if (c()) {
                return d(view);
            }
            if (!b()) {
                return null;
            }
            Object tag = view.getTag(this.f7277a);
            if (this.f7278b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void g(View view, Object obj) {
            if (c()) {
                e(view, obj);
            } else if (b() && h(f(view), obj)) {
                H.j(view);
                view.setTag(this.f7277a, obj);
                H.Y(view, this.f7280d);
            }
        }

        abstract boolean h(Object obj, Object obj2);

        f(int i7, Class cls, int i8, int i9) {
            this.f7277a = i7;
            this.f7278b = cls;
            this.f7280d = i8;
            this.f7279c = i9;
        }
    }

    static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i7, Bundle bundle) {
            return view.performAccessibilityAction(i7, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i7, int i8, int i9, int i10) {
            view.postInvalidateOnAnimation(i7, i8, i9, i10);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j7) {
            view.postOnAnimationDelayed(runnable, j7);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z6) {
            view.setHasTransientState(z6);
        }

        static void s(View view, int i7) {
            view.setImportantForAccessibility(i7);
        }
    }

    static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i7) {
            view.setLabelFor(i7);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i7) {
            view.setLayoutDirection(i7);
        }

        static void k(View view, int i7, int i8, int i9, int i10) {
            view.setPaddingRelative(i7, i8, i9, i10);
        }
    }

    static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i7) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i7);
        }

        static void f(View view, int i7) {
            view.setAccessibilityLiveRegion(i7);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i7) {
            accessibilityEvent.setContentChangeTypes(i7);
        }
    }

    static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class m {

        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            U f7281a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f7282b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ C f7283c;

            a(View view, C c7) {
                this.f7282b = view;
                this.f7283c = c7;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                U uW = U.w(windowInsets, view);
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 30) {
                    m.a(windowInsets, this.f7282b);
                    if (uW.equals(this.f7281a)) {
                        return this.f7283c.a(view, uW).u();
                    }
                }
                this.f7281a = uW;
                U uA = this.f7283c.a(view, uW);
                if (i7 >= 30) {
                    return uA.u();
                }
                H.m0(view);
                return uA.u();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC2078c.f22360S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static U b(View view, U u6, Rect rect) {
            WindowInsets windowInsetsU = u6.u();
            if (windowInsetsU != null) {
                return U.w(view.computeSystemWindowInsets(windowInsetsU, rect), view);
            }
            rect.setEmpty();
            return u6;
        }

        static boolean c(View view, float f7, float f8, boolean z6) {
            return view.dispatchNestedFling(f7, f8, z6);
        }

        static boolean d(View view, float f7, float f8) {
            return view.dispatchNestedPreFling(f7, f8);
        }

        static boolean e(View view, int i7, int i8, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i7, i8, iArr, iArr2);
        }

        static boolean f(View view, int i7, int i8, int i9, int i10, int[] iArr) {
            return view.dispatchNestedScroll(i7, i8, i9, i10, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static U j(View view) {
            return U.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f7) {
            view.setElevation(f7);
        }

        static void t(View view, boolean z6) {
            view.setNestedScrollingEnabled(z6);
        }

        static void u(View view, C c7) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC2078c.f22353L, c7);
            }
            if (c7 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC2078c.f22360S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, c7));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f7) {
            view.setTranslationZ(f7);
        }

        static void x(View view, float f7) {
            view.setZ(f7);
        }

        static boolean y(View view, int i7) {
            return view.startNestedScroll(i7);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    private static class n {
        public static U a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            U uV = U.v(rootWindowInsets);
            uV.s(uV);
            uV.d(view.getRootView());
            return uV;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i7) {
            view.setScrollIndicators(i7);
        }

        static void d(View view, int i7, int i8) {
            view.setScrollIndicators(i7, i8);
        }
    }

    static class o {
        static void a(View view, Collection<View> collection, int i7) {
            view.addKeyboardNavigationClusters(collection, i7);
        }

        static int b(View view) {
            return view.getImportantForAutofill();
        }

        static int c(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View h(View view, View view2, int i7) {
            return view.keyboardNavigationClusterSearch(view2, i7);
        }

        static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void k(View view, boolean z6) {
            view.setFocusedByDefault(z6);
        }

        static void l(View view, int i7) {
            view.setImportantForAutofill(i7);
        }

        static void m(View view, boolean z6) {
            view.setKeyboardNavigationCluster(z6);
        }

        static void n(View view, int i7) {
            view.setNextClusterForwardId(i7);
        }

        static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    static class p {
        static void a(View view, final u uVar) {
            n.g gVar = (n.g) view.getTag(AbstractC2078c.f22359R);
            if (gVar == null) {
                gVar = new n.g();
                view.setTag(AbstractC2078c.f22359R, gVar);
            }
            Objects.requireNonNull(uVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(uVar) { // from class: androidx.core.view.I
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            gVar.put(uVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            n.g gVar = (n.g) view.getTag(AbstractC2078c.f22359R);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(uVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i7) {
            return (T) view.requireViewById(i7);
        }

        static void g(View view, boolean z6) {
            view.setAccessibilityHeading(z6);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z6) {
            view.setScreenReaderFocusable(z6);
        }
    }

    private static class q {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i8) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i7, i8);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    private static class r {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class s {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C0584d b(View view, C0584d c0584d) {
            ContentInfo contentInfoF = c0584d.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? c0584d : C0584d.g(contentInfoPerformReceiveContent);
        }

        public static void c(View view, String[] strArr, D d7) {
            if (d7 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(d7));
            }
        }
    }

    private static final class t implements OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final D f7284a;

        t(D d7) {
            this.f7284a = d7;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C0584d c0584dG = C0584d.g(contentInfo);
            C0584d c0584dA = this.f7284a.a(view, c0584dG);
            if (c0584dA == null) {
                return null;
            }
            return c0584dA == c0584dG ? contentInfo : c0584dA.f();
        }
    }

    public interface u {
    }

    static class v {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList f7285d = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakHashMap f7286a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray f7287b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference f7288c = null;

        v() {
        }

        static v a(View view) {
            v vVar = (v) view.getTag(AbstractC2078c.f22358Q);
            if (vVar != null) {
                return vVar;
            }
            v vVar2 = new v();
            view.setTag(AbstractC2078c.f22358Q, vVar2);
            return vVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f7286a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f7287b == null) {
                this.f7287b = new SparseArray();
            }
            return this.f7287b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC2078c.f22359R);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            androidx.appcompat.app.y.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f7286a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f7285d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f7286a == null) {
                        this.f7286a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f7285d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f7286a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f7286a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f7288c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f7288c = new WeakReference(keyEvent);
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && H.S(view)) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.b(view);
        }
        return 0;
    }

    public static void A0(View view, int i7) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.l(view, i7);
        }
    }

    public static int B(View view) {
        return i.d(view);
    }

    public static void B0(View view, boolean z6) {
        m.t(view, z6);
    }

    public static int C(View view) {
        return h.d(view);
    }

    public static void C0(View view, C c7) {
        m.u(view, c7);
    }

    public static int D(View view) {
        return h.e(view);
    }

    public static void D0(View view, int i7, int i8, int i9, int i10) {
        i.k(view, i7, i8, i9, i10);
    }

    public static String[] E(View view) {
        return Build.VERSION.SDK_INT >= 31 ? s.a(view) : (String[]) view.getTag(AbstractC2078c.f22355N);
    }

    public static void E0(View view, boolean z6) {
        o0().g(view, Boolean.valueOf(z6));
    }

    public static int F(View view) {
        return i.e(view);
    }

    public static void F0(View view, int i7, int i8) {
        n.d(view, i7, i8);
    }

    public static int G(View view) {
        return i.f(view);
    }

    public static void G0(View view, CharSequence charSequence) {
        J0().g(view, charSequence);
    }

    public static ViewParent H(View view) {
        return h.f(view);
    }

    public static void H0(View view, String str) {
        m.v(view, str);
    }

    public static U I(View view) {
        return n.a(view);
    }

    private static void I0(View view) {
        if (z(view) == 0) {
            z0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (z((View) parent) == 4) {
                z0(view, 2);
                return;
            }
        }
    }

    public static CharSequence J(View view) {
        return (CharSequence) J0().f(view);
    }

    private static f J0() {
        return new c(AbstractC2078c.f22357P, CharSequence.class, 64, 30);
    }

    public static String K(View view) {
        return m.k(view);
    }

    public static void K0(View view) {
        m.z(view);
    }

    public static int L(View view) {
        return h.g(view);
    }

    public static float M(View view) {
        return m.m(view);
    }

    public static boolean N(View view) {
        return m(view) != null;
    }

    public static boolean O(View view) {
        return g.a(view);
    }

    public static boolean P(View view) {
        return h.h(view);
    }

    public static boolean Q(View view) {
        return h.i(view);
    }

    public static boolean R(View view) {
        Boolean bool = (Boolean) b().f(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean S(View view) {
        return k.b(view);
    }

    public static boolean T(View view) {
        return k.c(view);
    }

    public static boolean U(View view) {
        return m.p(view);
    }

    public static boolean V(View view) {
        return i.g(view);
    }

    public static boolean W(View view) {
        Boolean bool = (Boolean) o0().f(view);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C0584d X(C0584d c0584d) {
        return c0584d;
    }

    static void Y(View view, int i7) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z6 = p(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (o(view) != 0 || z6) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z6 ? 32 : 2048);
                k.g(accessibilityEventObtain, i7);
                if (z6) {
                    accessibilityEventObtain.getText().add(p(view));
                    I0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i7 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                k.g(accessibilityEventObtain2, i7);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(p(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i7);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e7);
                }
            }
        }
    }

    public static void Z(View view, int i7) {
        view.offsetLeftAndRight(i7);
    }

    public static void a0(View view, int i7) {
        view.offsetTopAndBottom(i7);
    }

    private static f b() {
        return new d(AbstractC2078c.f22351J, Boolean.class, 28);
    }

    public static U b0(View view, U u6) {
        WindowInsets windowInsetsU = u6.u();
        if (windowInsetsU != null) {
            WindowInsets windowInsetsB = l.b(view, windowInsetsU);
            if (!windowInsetsB.equals(windowInsetsU)) {
                return U.w(windowInsetsB, view);
            }
        }
        return u6;
    }

    public static int c(View view, CharSequence charSequence, androidx.core.view.accessibility.F f7) {
        int iR = r(view, charSequence);
        if (iR != -1) {
            d(view, new C.a(iR, charSequence, f7));
        }
        return iR;
    }

    public static void c0(View view, androidx.core.view.accessibility.C c7) {
        view.onInitializeAccessibilityNodeInfo(c7.M0());
    }

    private static void d(View view, C.a aVar) {
        j(view);
        k0(aVar.b(), view);
        q(view).add(aVar);
        Y(view, 0);
    }

    private static f d0() {
        return new b(AbstractC2078c.f22352K, CharSequence.class, 8, 28);
    }

    public static O e(View view) {
        if (f7270b == null) {
            f7270b = new WeakHashMap();
        }
        O o6 = (O) f7270b.get(view);
        if (o6 != null) {
            return o6;
        }
        O o7 = new O(view);
        f7270b.put(view, o7);
        return o7;
    }

    public static boolean e0(View view, int i7, Bundle bundle) {
        return h.j(view, i7, bundle);
    }

    public static U f(View view, U u6, Rect rect) {
        return m.b(view, u6, rect);
    }

    public static C0584d f0(View view, C0584d c0584d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0584d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return s.b(view, c0584d);
        }
        D d7 = (D) view.getTag(AbstractC2078c.f22354M);
        if (d7 == null) {
            return x(view).a(c0584d);
        }
        C0584d c0584dA = d7.a(view, c0584d);
        if (c0584dA == null) {
            return null;
        }
        return x(view).a(c0584dA);
    }

    public static U g(View view, U u6) {
        WindowInsets windowInsetsU = u6.u();
        if (windowInsetsU != null) {
            WindowInsets windowInsetsA = l.a(view, windowInsetsU);
            if (!windowInsetsA.equals(windowInsetsU)) {
                return U.w(windowInsetsA, view);
            }
        }
        return u6;
    }

    public static void g0(View view) {
        h.k(view);
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).b(view, keyEvent);
    }

    public static void h0(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).f(keyEvent);
    }

    public static void i0(View view, Runnable runnable, long j7) {
        h.n(view, runnable, j7);
    }

    static void j(View view) {
        C0574a c0574aL = l(view);
        if (c0574aL == null) {
            c0574aL = new C0574a();
        }
        p0(view, c0574aL);
    }

    public static void j0(View view, int i7) {
        k0(i7, view);
        Y(view, 0);
    }

    public static int k() {
        return i.a();
    }

    private static void k0(int i7, View view) {
        List listQ = q(view);
        for (int i8 = 0; i8 < listQ.size(); i8++) {
            if (((C.a) listQ.get(i8)).b() == i7) {
                listQ.remove(i8);
                return;
            }
        }
    }

    public static C0574a l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM = m(view);
        if (accessibilityDelegateM == null) {
            return null;
        }
        return accessibilityDelegateM instanceof C0574a.C0145a ? ((C0574a.C0145a) accessibilityDelegateM).f7338a : new C0574a(accessibilityDelegateM);
    }

    public static void l0(View view, C.a aVar, CharSequence charSequence, androidx.core.view.accessibility.F f7) {
        if (f7 == null && charSequence == null) {
            j0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, f7));
        }
    }

    private static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? q.a(view) : n(view);
    }

    public static void m0(View view) {
        l.c(view);
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f7272d) {
            return null;
        }
        if (f7271c == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f7271c = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f7272d = true;
                return null;
            }
        }
        try {
            Object obj = f7271c.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f7272d = true;
            return null;
        }
    }

    public static void n0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.c(view, context, iArr, attributeSet, typedArray, i7, i8);
        }
    }

    public static int o(View view) {
        return k.a(view);
    }

    private static f o0() {
        return new a(AbstractC2078c.f22356O, Boolean.class, 28);
    }

    public static CharSequence p(View view) {
        return (CharSequence) d0().f(view);
    }

    public static void p0(View view, C0574a c0574a) {
        if (c0574a == null && (m(view) instanceof C0574a.C0145a)) {
            c0574a = new C0574a();
        }
        view.setAccessibilityDelegate(c0574a == null ? null : c0574a.d());
    }

    private static List q(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(AbstractC2078c.f22349H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(AbstractC2078c.f22349H, arrayList2);
        return arrayList2;
    }

    public static void q0(View view, boolean z6) {
        b().g(view, Boolean.valueOf(z6));
    }

    private static int r(View view, CharSequence charSequence) {
        List listQ = q(view);
        for (int i7 = 0; i7 < listQ.size(); i7++) {
            if (TextUtils.equals(charSequence, ((C.a) listQ.get(i7)).c())) {
                return ((C.a) listQ.get(i7)).b();
            }
        }
        int i8 = -1;
        int i9 = 0;
        while (true) {
            int[] iArr = f7273e;
            if (i9 >= iArr.length || i8 != -1) {
                break;
            }
            int i10 = iArr[i9];
            boolean z6 = true;
            for (int i11 = 0; i11 < listQ.size(); i11++) {
                z6 &= ((C.a) listQ.get(i11)).b() != i10;
            }
            if (z6) {
                i8 = i10;
            }
            i9++;
        }
        return i8;
    }

    public static void r0(View view, int i7) {
        k.f(view, i7);
    }

    public static ColorStateList s(View view) {
        return m.g(view);
    }

    public static void s0(View view, CharSequence charSequence) {
        d0().g(view, charSequence);
        if (charSequence != null) {
            f7275g.a(view);
        } else {
            f7275g.d(view);
        }
    }

    public static PorterDuff.Mode t(View view) {
        return m.h(view);
    }

    public static void t0(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static Rect u(View view) {
        return j.a(view);
    }

    public static void u0(View view, ColorStateList colorStateList) {
        m.q(view, colorStateList);
    }

    public static Display v(View view) {
        return i.b(view);
    }

    public static void v0(View view, PorterDuff.Mode mode) {
        m.r(view, mode);
    }

    public static float w(View view) {
        return m.i(view);
    }

    public static void w0(View view, Rect rect) {
        j.c(view, rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static E x(View view) {
        return view instanceof E ? (E) view : f7274f;
    }

    public static void x0(View view, float f7) {
        m.s(view, f7);
    }

    public static boolean y(View view) {
        return h.b(view);
    }

    public static void y0(View view, boolean z6) {
        h.r(view, z6);
    }

    public static int z(View view) {
        return h.c(view);
    }

    public static void z0(View view, int i7) {
        h.s(view, i7);
    }
}
