package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SearchView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.swmansion.rnscreens.y;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p5.AbstractC1978a;

/* JADX INFO: loaded from: classes.dex */
public final class K extends com.facebook.react.views.view.i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b f18349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f18350n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f18351o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Integer f18352p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Integer f18353q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f18354r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f18355s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f18356t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f18357u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f18358v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private L f18359w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f18360x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f18361y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f18362m = new a("NONE", 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f18363n = new a("WORDS", 1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f18364o = new a("SENTENCES", 2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f18365p = new a("CHARACTERS", 3);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ a[] f18366q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f18367r;

        static {
            a[] aVarArrE = e();
            f18366q = aVarArrE;
            f18367r = AbstractC1978a.a(aVarArrE);
        }

        private a(String str, int i7) {
        }

        private static final /* synthetic */ a[] e() {
            return new a[]{f18362m, f18363n, f18364o, f18365p};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f18366q.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f18368m = new d("TEXT", 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f18369n = new c("PHONE", 1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f18370o = new C0244b("NUMBER", 2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f18371p = new a("EMAIL", 3);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ b[] f18372q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f18373r;

        static final class a extends b {
            a(String str, int i7) {
                super(str, i7, null);
            }

            @Override // com.swmansion.rnscreens.K.b
            public int h(a aVar) {
                w5.k.f(aVar, "capitalize");
                return 32;
            }
        }

        /* JADX INFO: renamed from: com.swmansion.rnscreens.K$b$b, reason: collision with other inner class name */
        static final class C0244b extends b {
            C0244b(String str, int i7) {
                super(str, i7, null);
            }

            @Override // com.swmansion.rnscreens.K.b
            public int h(a aVar) {
                w5.k.f(aVar, "capitalize");
                return 2;
            }
        }

        static final class c extends b {
            c(String str, int i7) {
                super(str, i7, null);
            }

            @Override // com.swmansion.rnscreens.K.b
            public int h(a aVar) {
                w5.k.f(aVar, "capitalize");
                return 3;
            }
        }

        static final class d extends b {

            public /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f18374a;

                static {
                    int[] iArr = new int[a.values().length];
                    try {
                        iArr[a.f18362m.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a.f18363n.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[a.f18364o.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[a.f18365p.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f18374a = iArr;
                }
            }

            d(String str, int i7) {
                super(str, i7, null);
            }

            @Override // com.swmansion.rnscreens.K.b
            public int h(a aVar) {
                w5.k.f(aVar, "capitalize");
                int i7 = a.f18374a[aVar.ordinal()];
                if (i7 == 1) {
                    return 1;
                }
                if (i7 == 2) {
                    return 8192;
                }
                if (i7 == 3) {
                    return 16384;
                }
                if (i7 == 4) {
                    return 4096;
                }
                throw new i5.k();
            }
        }

        static {
            b[] bVarArrE = e();
            f18372q = bVarArrE;
            f18373r = AbstractC1978a.a(bVarArrE);
        }

        private b(String str, int i7) {
        }

        private static final /* synthetic */ b[] e() {
            return new b[]{f18368m, f18369n, f18370o, f18371p};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f18372q.clone();
        }

        public abstract int h(a aVar);

        public /* synthetic */ b(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i7);
        }
    }

    static final class c extends w5.l implements v5.l {
        c() {
            super(1);
        }

        public final void a(C1590c c1590c) {
            u screenStackFragment;
            C1590c c1590cK;
            w5.k.f(c1590c, "newSearchView");
            if (K.this.f18359w == null) {
                K.this.f18359w = new L(c1590c);
            }
            K.this.O();
            if (!K.this.getAutoFocus() || (screenStackFragment = K.this.getScreenStackFragment()) == null || (c1590cK = screenStackFragment.K()) == null) {
                return;
            }
            c1590cK.r0();
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((C1590c) obj);
            return i5.u.f19985a;
        }
    }

    public static final class d implements SearchView.m {
        d() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean a(String str) {
            K.this.G(str);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean b(String str) {
            K.this.H(str);
            return true;
        }
    }

    public K(ReactContext reactContext) {
        super(reactContext);
        this.f18349m = b.f18368m;
        this.f18350n = a.f18362m;
        this.f18355s = "";
        this.f18356t = true;
        this.f18358v = true;
        this.f18361y = AbstractC0884k0.f(this);
    }

    private final void B() {
        K(new c5.m(this.f18361y, getId()));
        setToolbarElementsVisibility(0);
    }

    private final void C(boolean z6) {
        K(z6 ? new c5.n(this.f18361y, getId()) : new c5.k(this.f18361y, getId()));
    }

    private final void E() {
        K(new c5.o(this.f18361y, getId()));
        setToolbarElementsVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(String str) {
        K(new c5.l(this.f18361y, getId(), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(String str) {
        K(new c5.p(this.f18361y, getId(), str));
    }

    private final void K(com.facebook.react.uimanager.events.d dVar) {
        Context context = getContext();
        w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c((ReactContext) context, getId());
        if (eVarC != null) {
            eVarC.c(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(K k7, View view, boolean z6) {
        w5.k.f(k7, "this$0");
        k7.C(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M(K k7) {
        w5.k.f(k7, "this$0");
        k7.B();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(K k7, View view) {
        w5.k.f(k7, "this$0");
        k7.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        u screenStackFragment = getScreenStackFragment();
        C1590c c1590cK = screenStackFragment != null ? screenStackFragment.K() : null;
        if (c1590cK != null) {
            if (!this.f18360x) {
                setSearchViewListeners(c1590cK);
                this.f18360x = true;
            }
            c1590cK.setInputType(this.f18349m.h(this.f18350n));
            L l7 = this.f18359w;
            if (l7 != null) {
                l7.h(this.f18351o);
            }
            L l8 = this.f18359w;
            if (l8 != null) {
                l8.i(this.f18352p);
            }
            L l9 = this.f18359w;
            if (l9 != null) {
                l9.e(this.f18353q);
            }
            L l10 = this.f18359w;
            if (l10 != null) {
                l10.f(this.f18354r);
            }
            L l11 = this.f18359w;
            if (l11 != null) {
                l11.g(this.f18355s, this.f18358v);
            }
            c1590cK.setOverrideBackAction(this.f18356t);
        }
    }

    private final x getHeaderConfig() {
        ViewParent parent = getParent();
        if (parent instanceof y) {
            return ((y) parent).getConfig();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u getScreenStackFragment() {
        x headerConfig = getHeaderConfig();
        if (headerConfig != null) {
            return headerConfig.getScreenFragment();
        }
        return null;
    }

    private final void setSearchViewListeners(SearchView searchView) {
        searchView.setOnQueryTextListener(new d());
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.swmansion.rnscreens.H
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                K.L(this.f18346a, view, z6);
            }
        });
        searchView.setOnCloseListener(new SearchView.l() { // from class: com.swmansion.rnscreens.I
            @Override // androidx.appcompat.widget.SearchView.l
            public final boolean a() {
                return K.M(this.f18347a);
            }
        });
        searchView.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.J
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                K.N(this.f18348m, view);
            }
        });
    }

    private final void setToolbarElementsVisibility(int i7) {
        int i8 = 0;
        int configSubviewsCount = getHeaderConfig() != null ? r0.getConfigSubviewsCount() - 1 : 0;
        if (configSubviewsCount < 0) {
            return;
        }
        while (true) {
            x headerConfig = getHeaderConfig();
            y yVarE = headerConfig != null ? headerConfig.e(i8) : null;
            if ((yVarE != null ? yVarE.getType() : null) != y.a.f18560q && yVarE != null) {
                yVarE.setVisibility(i7);
            }
            if (i8 == configSubviewsCount) {
                return;
            } else {
                i8++;
            }
        }
    }

    public final void A() {
        C1590c c1590cK;
        u screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (c1590cK = screenStackFragment.K()) == null) {
            return;
        }
        c1590cK.q0();
    }

    public final void D() {
        C1590c c1590cK;
        u screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (c1590cK = screenStackFragment.K()) == null) {
            return;
        }
        c1590cK.r0();
    }

    public final void F(String str) {
        u screenStackFragment;
        C1590c c1590cK;
        if (str == null || (screenStackFragment = getScreenStackFragment()) == null || (c1590cK = screenStackFragment.K()) == null) {
            return;
        }
        c1590cK.setText(str);
    }

    public final void I(boolean z6) {
    }

    public final void J() {
        O();
    }

    public final a getAutoCapitalize() {
        return this.f18350n;
    }

    public final boolean getAutoFocus() {
        return this.f18357u;
    }

    public final Integer getHeaderIconColor() {
        return this.f18353q;
    }

    public final Integer getHintTextColor() {
        return this.f18354r;
    }

    public final b getInputType() {
        return this.f18349m;
    }

    public final String getPlaceholder() {
        return this.f18355s;
    }

    public final boolean getShouldOverrideBackButton() {
        return this.f18356t;
    }

    public final boolean getShouldShowHintSearchIcon() {
        return this.f18358v;
    }

    public final Integer getTextColor() {
        return this.f18351o;
    }

    public final Integer getTintColor() {
        return this.f18352p;
    }

    @Override // com.facebook.react.views.view.i, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        u screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null) {
            return;
        }
        screenStackFragment.N(new c());
    }

    public final void setAutoCapitalize(a aVar) {
        w5.k.f(aVar, "<set-?>");
        this.f18350n = aVar;
    }

    public final void setAutoFocus(boolean z6) {
        this.f18357u = z6;
    }

    public final void setHeaderIconColor(Integer num) {
        this.f18353q = num;
    }

    public final void setHintTextColor(Integer num) {
        this.f18354r = num;
    }

    public final void setInputType(b bVar) {
        w5.k.f(bVar, "<set-?>");
        this.f18349m = bVar;
    }

    public final void setPlaceholder(String str) {
        w5.k.f(str, "<set-?>");
        this.f18355s = str;
    }

    public final void setShouldOverrideBackButton(boolean z6) {
        this.f18356t = z6;
    }

    public final void setShouldShowHintSearchIcon(boolean z6) {
        this.f18358v = z6;
    }

    public final void setTextColor(Integer num) {
        this.f18351o = num;
    }

    public final void setTintColor(Integer num) {
        this.f18352p = num;
    }

    public final void z() {
        C1590c c1590cK;
        u screenStackFragment = getScreenStackFragment();
        if (screenStackFragment == null || (c1590cK = screenStackFragment.K()) == null) {
            return;
        }
        c1590cK.clearFocus();
    }
}
