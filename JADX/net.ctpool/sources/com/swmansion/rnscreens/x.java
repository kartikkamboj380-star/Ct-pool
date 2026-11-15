package com.swmansion.rnscreens;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AbstractActivityC0523c;
import androidx.appcompat.app.AbstractC0521a;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import c5.C0738a;
import c5.C0740c;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.swmansion.rnscreens.y;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class x extends ViewGroup {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final a f18529I = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f18530A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f18531B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f18532C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f18533D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f18534E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f18535F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f18536G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final View.OnClickListener f18537H;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList f18538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C1591d f18539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f18540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f18541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Integer f18542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f18543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f18544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f18545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f18546u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f18547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f18548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Integer f18549x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f18550y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f18551z;

    public static final class a {
        private a() {
        }

        public final TextView a(Toolbar toolbar) {
            w5.k.f(toolbar, "toolbar");
            int childCount = toolbar.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = toolbar.getChildAt(i7);
                if (childAt instanceof TextView) {
                    TextView textView = (TextView) childAt;
                    if (w5.k.b(textView.getText(), toolbar.getTitle())) {
                        return textView;
                    }
                }
            }
            return null;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18552a;

        static {
            int[] iArr = new int[y.a.values().length];
            try {
                iArr[y.a.f18556m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.a.f18558o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.a.f18557n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18552a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context) {
        super(context);
        w5.k.f(context, "context");
        this.f18538m = new ArrayList(3);
        this.f18532C = true;
        this.f18537H = new View.OnClickListener() { // from class: com.swmansion.rnscreens.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.c(this.f18528m, view);
            }
        };
        setVisibility(8);
        C1591d c1591d = new C1591d(context, this);
        this.f18539n = c1591d;
        this.f18535F = c1591d.getContentInsetStart();
        this.f18536G = c1591d.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            c1591d.setBackgroundColor(typedValue.data);
        }
        c1591d.setClipChildren(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(x xVar, View view) {
        w5.k.f(xVar, "this$0");
        u screenFragment = xVar.getScreenFragment();
        if (screenFragment != null) {
            t screenStack = xVar.getScreenStack();
            if (screenStack == null || !w5.k.b(screenStack.getRootScreen(), screenFragment.g())) {
                if (screenFragment.g().getNativeBackButtonDismissalEnabled()) {
                    screenFragment.dismiss();
                    return;
                } else {
                    screenFragment.u();
                    return;
                }
            }
            Fragment parentFragment = screenFragment.getParentFragment();
            if (parentFragment instanceof u) {
                u uVar = (u) parentFragment;
                if (uVar.g().getNativeBackButtonDismissalEnabled()) {
                    uVar.dismiss();
                } else {
                    uVar.u();
                }
            }
        }
    }

    private final C1599l getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof C1599l) {
            return (C1599l) parent;
        }
        return null;
    }

    private final t getScreenStack() {
        C1599l screen = getScreen();
        n container = screen != null ? screen.getContainer() : null;
        if (container instanceof t) {
            return (t) container;
        }
        return null;
    }

    private final void h() {
        C1599l screen;
        if (getParent() == null || this.f18530A || (screen = getScreen()) == null || screen.d()) {
            return;
        }
        i();
    }

    public final void b(y yVar, int i7) {
        w5.k.f(yVar, "child");
        this.f18538m.add(i7, yVar);
        h();
    }

    public final void d() {
        this.f18530A = true;
    }

    public final y e(int i7) {
        Object obj = this.f18538m.get(i7);
        w5.k.e(obj, "get(...)");
        return (y) obj;
    }

    public final boolean f() {
        return this.f18540o;
    }

    public final boolean g() {
        return this.f18541p;
    }

    public final int getConfigSubviewsCount() {
        return this.f18538m.size();
    }

    public final u getScreenFragment() {
        ViewParent parent = getParent();
        if (!(parent instanceof C1599l)) {
            return null;
        }
        Fragment fragment = ((C1599l) parent).getFragment();
        if (fragment instanceof u) {
            return (u) fragment;
        }
        return null;
    }

    public final C1591d getToolbar() {
        return this.f18539n;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        int i7;
        Drawable navigationIcon;
        u screenFragment;
        u screenFragment2;
        ReactContext reactContextF;
        t screenStack = getScreenStack();
        boolean z6 = screenStack == null || w5.k.b(screenStack.getTopScreen(), getParent());
        if (this.f18534E && z6 && !this.f18530A) {
            u screenFragment3 = getScreenFragment();
            AbstractActivityC0523c abstractActivityC0523c = (AbstractActivityC0523c) (screenFragment3 != null ? screenFragment3.getActivity() : null);
            if (abstractActivityC0523c == null) {
                return;
            }
            String str = this.f18546u;
            if (str != null) {
                if (w5.k.b(str, "rtl")) {
                    this.f18539n.setLayoutDirection(1);
                } else if (w5.k.b(this.f18546u, "ltr")) {
                    this.f18539n.setLayoutDirection(0);
                }
            }
            C1599l screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    reactContextF = (ReactContext) context;
                } else {
                    r fragmentWrapper = screen.getFragmentWrapper();
                    reactContextF = fragmentWrapper != null ? fragmentWrapper.f() : null;
                }
                C.f18332a.w(screen, abstractActivityC0523c, reactContextF);
            }
            if (this.f18540o) {
                if (this.f18539n.getParent() == null || (screenFragment2 = getScreenFragment()) == null) {
                    return;
                }
                screenFragment2.M();
                return;
            }
            if (this.f18539n.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                screenFragment.O(this.f18539n);
            }
            if (this.f18532C) {
                Integer num = this.f18542q;
                this.f18539n.setPadding(0, num != null ? num.intValue() : 0, 0, 0);
            } else if (this.f18539n.getPaddingTop() > 0) {
                this.f18539n.setPadding(0, 0, 0, 0);
            }
            abstractActivityC0523c.j0(this.f18539n);
            AbstractC0521a abstractC0521aA0 = abstractActivityC0523c.a0();
            if (abstractC0521aA0 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            w5.k.e(abstractC0521aA0, "requireNotNull(...)");
            this.f18539n.setContentInsetStartWithNavigation(this.f18536G);
            C1591d c1591d = this.f18539n;
            int i8 = this.f18535F;
            c1591d.L(i8, i8);
            u screenFragment4 = getScreenFragment();
            abstractC0521aA0.s((screenFragment4 == null || !screenFragment4.I() || this.f18550y) ? false : true);
            this.f18539n.setNavigationOnClickListener(this.f18537H);
            u screenFragment5 = getScreenFragment();
            if (screenFragment5 != null) {
                screenFragment5.P(this.f18551z);
            }
            u screenFragment6 = getScreenFragment();
            if (screenFragment6 != null) {
                screenFragment6.Q(this.f18541p);
            }
            abstractC0521aA0.v(this.f18543r);
            if (TextUtils.isEmpty(this.f18543r)) {
                this.f18539n.setContentInsetStartWithNavigation(0);
            }
            TextView textViewA = f18529I.a(this.f18539n);
            int i9 = this.f18544s;
            if (i9 != 0) {
                this.f18539n.setTitleTextColor(i9);
            }
            if (textViewA != null) {
                String str2 = this.f18545t;
                if (str2 != null || this.f18548w > 0) {
                    Typeface typefaceA = com.facebook.react.views.text.o.a(null, 0, this.f18548w, str2, getContext().getAssets());
                    w5.k.e(typefaceA, "applyStyles(...)");
                    textViewA.setTypeface(typefaceA);
                }
                float f7 = this.f18547v;
                if (f7 > 0.0f) {
                    textViewA.setTextSize(f7);
                }
            }
            Integer num2 = this.f18549x;
            if (num2 != null) {
                this.f18539n.setBackgroundColor(num2.intValue());
            }
            if (this.f18533D != 0 && (navigationIcon = this.f18539n.getNavigationIcon()) != null) {
                navigationIcon.setColorFilter(new PorterDuffColorFilter(this.f18533D, PorterDuff.Mode.SRC_ATOP));
            }
            for (int childCount = this.f18539n.getChildCount() - 1; -1 < childCount; childCount--) {
                if (this.f18539n.getChildAt(childCount) instanceof y) {
                    this.f18539n.removeViewAt(childCount);
                }
            }
            int size = this.f18538m.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = this.f18538m.get(i10);
                w5.k.e(obj, "get(...)");
                y yVar = (y) obj;
                y.a type = yVar.getType();
                if (type == y.a.f18559p) {
                    View childAt = yVar.getChildAt(0);
                    ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                    if (imageView == null) {
                        throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                    }
                    abstractC0521aA0.t(imageView.getDrawable());
                } else {
                    Toolbar.g gVar = new Toolbar.g(-2, -1);
                    int i11 = b.f18552a[type.ordinal()];
                    if (i11 == 1) {
                        if (!this.f18531B) {
                            this.f18539n.setNavigationIcon((Drawable) null);
                        }
                        this.f18539n.setTitle((CharSequence) null);
                        i7 = 8388611;
                    } else if (i11 != 2) {
                        if (i11 == 3) {
                            ((ViewGroup.MarginLayoutParams) gVar).width = -1;
                            gVar.f5077a = 1;
                            this.f18539n.setTitle((CharSequence) null);
                        }
                        yVar.setLayoutParams(gVar);
                        this.f18539n.addView(yVar);
                    } else {
                        i7 = 8388613;
                    }
                    gVar.f5077a = i7;
                    yVar.setLayoutParams(gVar);
                    this.f18539n.addView(yVar);
                }
            }
        }
    }

    public final void j() {
        this.f18538m.clear();
        h();
    }

    public final void k(int i7) {
        this.f18538m.remove(i7);
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18534E = true;
        int iF = AbstractC0884k0.f(this);
        Context context = getContext();
        w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c((ReactContext) context, getId());
        if (eVarC != null) {
            eVarC.c(new C0738a(iF, getId()));
        }
        if (this.f18542q == null) {
            this.f18542q = Integer.valueOf(Build.VERSION.SDK_INT >= 30 ? getRootWindowInsets().getInsets(WindowInsets.Type.systemBars()).top : getRootWindowInsets().getSystemWindowInsetTop());
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18534E = false;
        int iF = AbstractC0884k0.f(this);
        Context context = getContext();
        w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c((ReactContext) context, getId());
        if (eVarC != null) {
            eVarC.c(new C0740c(iF, getId()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
    }

    public final void setBackButtonInCustomView(boolean z6) {
        this.f18531B = z6;
    }

    public final void setBackgroundColor(Integer num) {
        this.f18549x = num;
    }

    public final void setDirection(String str) {
        this.f18546u = str;
    }

    public final void setHeaderHidden(boolean z6) {
        this.f18540o = z6;
    }

    public final void setHeaderTranslucent(boolean z6) {
        this.f18541p = z6;
    }

    public final void setHidden(boolean z6) {
        this.f18540o = z6;
    }

    public final void setHideBackButton(boolean z6) {
        this.f18550y = z6;
    }

    public final void setHideShadow(boolean z6) {
        this.f18551z = z6;
    }

    public final void setTintColor(int i7) {
        this.f18533D = i7;
    }

    public final void setTitle(String str) {
        this.f18543r = str;
    }

    public final void setTitleColor(int i7) {
        this.f18544s = i7;
    }

    public final void setTitleFontFamily(String str) {
        this.f18545t = str;
    }

    public final void setTitleFontSize(float f7) {
        this.f18547v = f7;
    }

    public final void setTitleFontWeight(String str) {
        this.f18548w = com.facebook.react.views.text.o.d(str);
    }

    public final void setTopInsetEnabled(boolean z6) {
        this.f18532C = z6;
    }

    public final void setTranslucent(boolean z6) {
        this.f18541p = z6;
    }
}
