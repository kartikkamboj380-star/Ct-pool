package com.swmansion.rnscreens;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import c5.C0741d;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;

/* JADX INFO: renamed from: com.swmansion.rnscreens.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1599l extends AbstractC1592e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Integer f18416A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Integer f18417B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Boolean f18418C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private Boolean f18419D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f18420E;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private r f18421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private n f18422n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f18423o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f18424p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private d f18425q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f18426r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f18427s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f18428t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Integer f18429u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Boolean f18430v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f18431w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f18432x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Boolean f18433y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Boolean f18434z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.swmansion.rnscreens.l$a */
    public static final class a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f18435m = new a("INACTIVE", 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f18436n = new a("TRANSITIONING_OR_BELOW_TOP", 1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f18437o = new a("ON_TOP", 2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ a[] f18438p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f18439q;

        static {
            a[] aVarArrE = e();
            f18438p = aVarArrE;
            f18439q = AbstractC1978a.a(aVarArrE);
        }

        private a(String str, int i7) {
        }

        private static final /* synthetic */ a[] e() {
            return new a[]{f18435m, f18436n, f18437o};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f18438p.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.swmansion.rnscreens.l$b */
    public static final class b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f18440m = new b("PUSH", 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f18441n = new b("POP", 1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ b[] f18442o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f18443p;

        static {
            b[] bVarArrE = e();
            f18442o = bVarArrE;
            f18443p = AbstractC1978a.a(bVarArrE);
        }

        private b(String str, int i7) {
        }

        private static final /* synthetic */ b[] e() {
            return new b[]{f18440m, f18441n};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f18442o.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.swmansion.rnscreens.l$c */
    public static final class c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final c f18444m = new c("DEFAULT", 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final c f18445n = new c("NONE", 1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final c f18446o = new c("FADE", 2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final c f18447p = new c("SLIDE_FROM_BOTTOM", 3);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final c f18448q = new c("SLIDE_FROM_RIGHT", 4);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final c f18449r = new c("SLIDE_FROM_LEFT", 5);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final c f18450s = new c("FADE_FROM_BOTTOM", 6);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final c f18451t = new c("IOS", 7);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ c[] f18452u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f18453v;

        static {
            c[] cVarArrE = e();
            f18452u = cVarArrE;
            f18453v = AbstractC1978a.a(cVarArrE);
        }

        private c(String str, int i7) {
        }

        private static final /* synthetic */ c[] e() {
            return new c[]{f18444m, f18445n, f18446o, f18447p, f18448q, f18449r, f18450s, f18451t};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f18452u.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.swmansion.rnscreens.l$d */
    public static final class d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final d f18454m = new d("PUSH", 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final d f18455n = new d("MODAL", 1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final d f18456o = new d("TRANSPARENT_MODAL", 2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ d[] f18457p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f18458q;

        static {
            d[] dVarArrE = e();
            f18457p = dVarArrE;
            f18458q = AbstractC1978a.a(dVarArrE);
        }

        private d(String str, int i7) {
        }

        private static final /* synthetic */ d[] e() {
            return new d[]{f18454m, f18455n, f18456o};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f18457p.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.swmansion.rnscreens.l$e */
    public static final class e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final e f18459m = new e("ORIENTATION", 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final e f18460n = new e("COLOR", 1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final e f18461o = new e("STYLE", 2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final e f18462p = new e("TRANSLUCENT", 3);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final e f18463q = new e("HIDDEN", 4);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final e f18464r = new e("ANIMATED", 5);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final e f18465s = new e("NAVIGATION_BAR_COLOR", 6);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final e f18466t = new e("NAVIGATION_BAR_TRANSLUCENT", 7);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final e f18467u = new e("NAVIGATION_BAR_HIDDEN", 8);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ e[] f18468v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f18469w;

        static {
            e[] eVarArrE = e();
            f18468v = eVarArrE;
            f18469w = AbstractC1978a.a(eVarArrE);
        }

        private e(String str, int i7) {
        }

        private static final /* synthetic */ e[] e() {
            return new e[]{f18459m, f18460n, f18461o, f18462p, f18463q, f18464r, f18465s, f18466t, f18467u};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f18468v.clone();
        }
    }

    /* JADX INFO: renamed from: com.swmansion.rnscreens.l$f */
    public static final class f extends GuardedRunnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ReactContext f18470m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ C1599l f18471n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f18472o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f18473p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ReactContext reactContext, C1599l c1599l, int i7, int i8, JSExceptionHandler jSExceptionHandler) {
            super(jSExceptionHandler);
            this.f18470m = reactContext;
            this.f18471n = c1599l;
            this.f18472o = i7;
            this.f18473p = i8;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            UIManagerModule uIManagerModule = (UIManagerModule) this.f18470m.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.updateNodeSize(this.f18471n.getId(), this.f18472o, this.f18473p);
            }
        }
    }

    public C1599l(ReactContext reactContext) {
        super(reactContext);
        this.f18425q = d.f18454m;
        this.f18426r = b.f18441n;
        this.f18427s = c.f18444m;
        this.f18428t = true;
        setLayoutParams(new WindowManager.LayoutParams(2));
        this.f18420E = true;
    }

    private final i5.l a() {
        x headerConfig;
        x headerConfig2;
        TypedValue typedValue = new TypedValue();
        boolean zResolveAttribute = getContext().getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
        Integer numValueOf = Integer.valueOf(TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics()));
        Integer num = null;
        if (!zResolveAttribute || (((headerConfig = getHeaderConfig()) != null && headerConfig.f()) || ((headerConfig2 = getHeaderConfig()) != null && headerConfig2.g()))) {
            numValueOf = null;
        }
        double dB = numValueOf != null ? com.facebook.react.uimanager.G.b(numValueOf.intValue()) : 0.0d;
        Integer numValueOf2 = Integer.valueOf(getContext().getResources().getIdentifier("status_bar_height", "dimen", "android"));
        if (numValueOf2.intValue() > 0 && !w5.k.b(this.f18433y, Boolean.TRUE) && dB > 0.0d) {
            num = numValueOf2;
        }
        return i5.q.a(Double.valueOf(dB), Double.valueOf(num != null ? com.facebook.react.uimanager.G.b(getContext().getResources().getDimensionPixelSize(num.intValue())) : 0.0d));
    }

    private final boolean c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof WebView) {
                return true;
            }
            if ((childAt instanceof ViewGroup) && c((ViewGroup) childAt)) {
                return true;
            }
        }
        return false;
    }

    private final void j(double d7) {
        Context context = getContext();
        w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int iE = AbstractC0884k0.e(reactContext);
        com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c(reactContext, getId());
        if (eVarC != null) {
            eVarC.c(new C0741d(iE, getId(), d7));
        }
    }

    private final void l(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt.getClass().getSimpleName().equals("CircleImageView")) {
                    viewGroup.addView(new View(getContext()), i7);
                } else {
                    w5.k.c(childAt);
                    viewGroup.startViewTransition(childAt);
                }
                if (childAt instanceof x) {
                    l(((x) childAt).getToolbar());
                }
                if (childAt instanceof ViewGroup) {
                    l((ViewGroup) childAt);
                }
            }
        }
    }

    private final void m(int i7, int i8) {
        Context context = getContext();
        w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        reactContext.runOnNativeModulesQueueThread(new f(reactContext, this, i7, i8, reactContext.getExceptionHandler()));
    }

    public final void b(int i7) {
        setImportantForAccessibility(i7);
        x headerConfig = getHeaderConfig();
        C1591d toolbar = headerConfig != null ? headerConfig.getToolbar() : null;
        if (toolbar == null) {
            return;
        }
        toolbar.setImportantForAccessibility(i7);
    }

    public final boolean d() {
        return this.f18431w;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        w5.k.f(sparseArray, "container");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        w5.k.f(sparseArray, "container");
    }

    public final Boolean e() {
        return this.f18419D;
    }

    public final Boolean f() {
        return this.f18418C;
    }

    public final Boolean g() {
        return this.f18430v;
    }

    public final a getActivityState() {
        return this.f18423o;
    }

    public final n getContainer() {
        return this.f18422n;
    }

    public final Fragment getFragment() {
        r rVar = this.f18421m;
        if (rVar != null) {
            return rVar.e();
        }
        return null;
    }

    public final r getFragmentWrapper() {
        return this.f18421m;
    }

    public final x getHeaderConfig() {
        Object next;
        Iterator it = androidx.core.view.L.a(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((View) next) instanceof x) {
                break;
            }
        }
        if (next instanceof x) {
            return (x) next;
        }
        return null;
    }

    public final boolean getNativeBackButtonDismissalEnabled() {
        return this.f18420E;
    }

    public final Integer getNavigationBarColor() {
        return this.f18417B;
    }

    public final b getReplaceAnimation() {
        return this.f18426r;
    }

    public final Integer getScreenOrientation() {
        return this.f18429u;
    }

    public final c getStackAnimation() {
        return this.f18427s;
    }

    public final d getStackPresentation() {
        return this.f18425q;
    }

    public final Integer getStatusBarColor() {
        return this.f18416A;
    }

    public final String getStatusBarStyle() {
        return this.f18432x;
    }

    public final Boolean h() {
        return this.f18433y;
    }

    public final Boolean i() {
        return this.f18434z;
    }

    public final void k() {
        if (this.f18431w) {
            return;
        }
        this.f18431w = true;
        l(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        if ((this.f18422n instanceof t) && z6) {
            i5.l lVarA = a();
            double dDoubleValue = ((Number) lVarA.c()).doubleValue() + ((Number) lVarA.d()).doubleValue();
            m(i9 - i7, i10 - i8);
            j(dDoubleValue);
        }
    }

    public final void setActivityState(a aVar) {
        w5.k.f(aVar, "activityState");
        if (aVar == this.f18423o) {
            return;
        }
        this.f18423o = aVar;
        n nVar = this.f18422n;
        if (nVar != null) {
            nVar.o();
        }
    }

    public final void setBeingRemoved(boolean z6) {
        this.f18431w = z6;
    }

    public final void setContainer(n nVar) {
        this.f18422n = nVar;
    }

    public final void setFragmentWrapper(r rVar) {
        this.f18421m = rVar;
    }

    public final void setGestureEnabled(boolean z6) {
        this.f18428t = z6;
    }

    @Override // android.view.View
    public void setLayerType(int i7, Paint paint) {
    }

    public final void setNativeBackButtonDismissalEnabled(boolean z6) {
        this.f18420E = z6;
    }

    public final void setNavigationBarColor(Integer num) {
        if (num != null) {
            C.f18332a.d();
        }
        this.f18417B = num;
        r rVar = this.f18421m;
        if (rVar != null) {
            C.f18332a.p(this, rVar.d());
        }
    }

    public final void setNavigationBarHidden(Boolean bool) {
        if (bool != null) {
            C.f18332a.d();
        }
        this.f18419D = bool;
        r rVar = this.f18421m;
        if (rVar != null) {
            C.f18332a.q(this, rVar.d());
        }
    }

    public final void setNavigationBarTranslucent(Boolean bool) {
        if (bool != null) {
            C.f18332a.d();
        }
        this.f18418C = bool;
        r rVar = this.f18421m;
        if (rVar != null) {
            C.f18332a.r(this, rVar.d());
        }
    }

    public final void setReplaceAnimation(b bVar) {
        w5.k.f(bVar, "<set-?>");
        this.f18426r = bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setScreenOrientation(String str) {
        int i7;
        if (str == null) {
            this.f18429u = null;
            return;
        }
        C c7 = C.f18332a;
        c7.e();
        switch (str.hashCode()) {
            case -1894896954:
                i7 = !str.equals("portrait_down") ? -1 : 9;
                break;
            case 96673:
                if (str.equals("all")) {
                    i7 = 10;
                    break;
                }
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    i7 = 7;
                    break;
                }
                break;
            case 1430647483:
                if (str.equals("landscape")) {
                    i7 = 6;
                    break;
                }
                break;
            case 1651658175:
                if (str.equals("portrait_up")) {
                    i7 = 1;
                    break;
                }
                break;
            case 1730732811:
                if (str.equals("landscape_left")) {
                    i7 = 8;
                    break;
                }
                break;
            case 2118770584:
                if (str.equals("landscape_right")) {
                    i7 = 0;
                    break;
                }
                break;
        }
        this.f18429u = Integer.valueOf(i7);
        r rVar = this.f18421m;
        if (rVar != null) {
            c7.s(this, rVar.d());
        }
    }

    public final void setStackAnimation(c cVar) {
        w5.k.f(cVar, "<set-?>");
        this.f18427s = cVar;
    }

    public final void setStackPresentation(d dVar) {
        w5.k.f(dVar, "<set-?>");
        this.f18425q = dVar;
    }

    public final void setStatusBarAnimated(Boolean bool) {
        this.f18430v = bool;
    }

    public final void setStatusBarColor(Integer num) {
        if (num != null) {
            C.f18332a.f();
        }
        this.f18416A = num;
        r rVar = this.f18421m;
        if (rVar != null) {
            C.f18332a.l(this, rVar.d(), rVar.f());
        }
    }

    public final void setStatusBarHidden(Boolean bool) {
        if (bool != null) {
            C.f18332a.f();
        }
        this.f18433y = bool;
        r rVar = this.f18421m;
        if (rVar != null) {
            C.f18332a.n(this, rVar.d());
        }
    }

    public final void setStatusBarStyle(String str) {
        if (str != null) {
            C.f18332a.f();
        }
        this.f18432x = str;
        r rVar = this.f18421m;
        if (rVar != null) {
            C.f18332a.u(this, rVar.d(), rVar.f());
        }
    }

    public final void setStatusBarTranslucent(Boolean bool) {
        if (bool != null) {
            C.f18332a.f();
        }
        this.f18434z = bool;
        r rVar = this.f18421m;
        if (rVar != null) {
            C.f18332a.v(this, rVar.d(), rVar.f());
        }
    }

    public final void setTransitioning(boolean z6) {
        if (this.f18424p == z6) {
            return;
        }
        this.f18424p = z6;
        boolean zC = c(this);
        if (!zC || getLayerType() == 2) {
            super.setLayerType((!z6 || zC) ? 0 : 2, null);
        }
    }
}
