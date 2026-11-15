package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractActivityC0640j;
import androidx.fragment.app.Fragment;
import c5.C0739b;
import c5.C0742e;
import c5.C0743f;
import c5.C0744g;
import c5.C0745h;
import c5.C0746i;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.AbstractC0884k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p5.AbstractC1978a;

/* JADX INFO: loaded from: classes.dex */
public class q extends Fragment implements r {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f18485t = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C1599l f18486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f18487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f18488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f18489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f18491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f18492s;

    public static final class a {
        private a() {
        }

        public final short a(float f7) {
            return (short) (f7 == 0.0f ? 1 : f7 == 1.0f ? 2 : 3);
        }

        protected final View b(View view) {
            w5.k.f(view, "view");
            ViewParent parent = view.getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.endViewTransition(view);
                viewGroup.removeView(view);
            }
            view.setVisibility(0);
            return view;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f18493m = new b("DID_APPEAR", 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f18494n = new b("WILL_APPEAR", 1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f18495o = new b("DID_DISAPPEAR", 2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final b f18496p = new b("WILL_DISAPPEAR", 3);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ b[] f18497q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f18498r;

        static {
            b[] bVarArrE = e();
            f18497q = bVarArrE;
            f18498r = AbstractC1978a.a(bVarArrE);
        }

        private b(String str, int i7) {
        }

        private static final /* synthetic */ b[] e() {
            return new b[]{f18493m, f18494n, f18495o, f18496p};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f18497q.clone();
        }
    }

    private static final class c extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(context);
            w5.k.f(context, "context");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18499a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f18494n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f18493m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f18496p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f18495o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f18499a = iArr;
        }
    }

    public q() {
        this.f18487n = new ArrayList();
        this.f18489p = -1.0f;
        this.f18490q = true;
        this.f18491r = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    private final void B(final boolean z6) {
        this.f18492s = !z6;
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || ((parentFragment instanceof q) && !((q) parentFragment).f18492s)) {
            if (isResumed()) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.C(z6, this);
                    }
                });
            } else if (z6) {
                x();
            } else {
                z();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(boolean z6, q qVar) {
        w5.k.f(qVar, "this$0");
        if (z6) {
            qVar.w();
        } else {
            qVar.y();
        }
    }

    protected static final View F(View view) {
        return f18485t.b(view);
    }

    private final void H() {
        AbstractActivityC0640j activity = getActivity();
        if (activity == null) {
            this.f18488o = true;
        } else {
            C.f18332a.w(g(), activity, f());
        }
    }

    private final void w() {
        v(b.f18493m, this);
        A(1.0f, false);
    }

    private final void x() {
        v(b.f18495o, this);
        A(1.0f, true);
    }

    private final void y() {
        v(b.f18494n, this);
        A(0.0f, false);
    }

    private final void z() {
        v(b.f18496p, this);
        A(0.0f, true);
    }

    public void A(float f7, boolean z6) {
        if (!(this instanceof u) || this.f18489p == f7) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, f7));
        this.f18489p = fMax;
        short sA = f18485t.a(fMax);
        n container = g().getContainer();
        boolean goingForward = container instanceof t ? ((t) container).getGoingForward() : false;
        Context context = g().getContext();
        w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c(reactContext, g().getId());
        if (eVarC != null) {
            eVarC.c(new C0745h(AbstractC0884k0.e(reactContext), g().getId(), this.f18489p, z6, goingForward, sA));
        }
    }

    public void D() {
        B(true);
    }

    public void E() {
        B(false);
    }

    public void G(C1599l c1599l) {
        w5.k.f(c1599l, "<set-?>");
        this.f18486m = c1599l;
    }

    @Override // com.swmansion.rnscreens.r
    public void a(n nVar) {
        w5.k.f(nVar, "container");
        i().remove(nVar);
    }

    @Override // com.swmansion.rnscreens.o
    public void c(b bVar) {
        w5.k.f(bVar, "event");
        int i7 = d.f18499a[bVar.ordinal()];
        if (i7 == 1) {
            this.f18490q = false;
            return;
        }
        if (i7 == 2) {
            this.f18491r = false;
        } else if (i7 == 3) {
            this.f18490q = true;
        } else {
            if (i7 != 4) {
                return;
            }
            this.f18491r = true;
        }
    }

    @Override // com.swmansion.rnscreens.r
    public Activity d() {
        Fragment fragment;
        AbstractActivityC0640j activity;
        AbstractActivityC0640j activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = g().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = g().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof C1599l) && (fragment = ((C1599l) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.InterfaceC1594g
    public Fragment e() {
        return this;
    }

    @Override // com.swmansion.rnscreens.r
    public ReactContext f() {
        Context context;
        if (getContext() instanceof ReactContext) {
            context = getContext();
        } else {
            if (!(g().getContext() instanceof ReactContext)) {
                for (ViewParent container = g().getContainer(); container != null; container = container.getParent()) {
                    if (container instanceof C1599l) {
                        C1599l c1599l = (C1599l) container;
                        if (c1599l.getContext() instanceof ReactContext) {
                            context = c1599l.getContext();
                        }
                    }
                }
                return null;
            }
            context = g().getContext();
        }
        w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        return (ReactContext) context;
    }

    @Override // com.swmansion.rnscreens.r
    public C1599l g() {
        C1599l c1599l = this.f18486m;
        if (c1599l != null) {
            return c1599l;
        }
        w5.k.t("screen");
        return null;
    }

    @Override // com.swmansion.rnscreens.o
    public void h(b bVar) {
        r fragmentWrapper;
        w5.k.f(bVar, "event");
        List listI = i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            if (((n) obj).getScreenCount() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1599l topScreen = ((n) it.next()).getTopScreen();
            if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
                v(bVar, fragmentWrapper);
            }
        }
    }

    @Override // com.swmansion.rnscreens.r
    public List i() {
        return this.f18487n;
    }

    @Override // com.swmansion.rnscreens.r
    public void j(n nVar) {
        w5.k.f(nVar, "container");
        i().add(nVar);
    }

    @Override // com.swmansion.rnscreens.r
    public void k() {
        H();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        w5.k.f(layoutInflater, "inflater");
        g().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        c cVar = new c(context);
        cVar.addView(F(g()));
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        n container = g().getContainer();
        if (container == null || !container.n(this)) {
            Context context = g().getContext();
            if (context instanceof ReactContext) {
                int iE = AbstractC0884k0.e(context);
                com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c((ReactContext) context, g().getId());
                if (eVarC != null) {
                    eVarC.c(new C0744g(iE, g().getId()));
                }
            }
        }
        i().clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f18488o) {
            this.f18488o = false;
            C.f18332a.w(g(), d(), f());
        }
    }

    public boolean t(b bVar) {
        w5.k.f(bVar, "event");
        int i7 = d.f18499a[bVar.ordinal()];
        if (i7 == 1) {
            return this.f18490q;
        }
        if (i7 == 2) {
            return this.f18491r;
        }
        if (i7 != 3) {
            if (i7 != 4) {
                throw new i5.k();
            }
            if (!this.f18491r) {
                return true;
            }
        } else if (!this.f18490q) {
            return true;
        }
        return false;
    }

    public void u() {
        Context context = g().getContext();
        w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int iE = AbstractC0884k0.e(reactContext);
        com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c(reactContext, g().getId());
        if (eVarC != null) {
            eVarC.c(new C0739b(iE, g().getId()));
        }
    }

    public void v(b bVar, r rVar) {
        com.facebook.react.uimanager.events.d c0746i;
        w5.k.f(bVar, "event");
        w5.k.f(rVar, "fragmentWrapper");
        Fragment fragmentE = rVar.e();
        if (fragmentE instanceof u) {
            u uVar = (u) fragmentE;
            if (uVar.t(bVar)) {
                C1599l c1599lG = uVar.g();
                rVar.c(bVar);
                int iF = AbstractC0884k0.f(c1599lG);
                int i7 = d.f18499a[bVar.ordinal()];
                if (i7 == 1) {
                    c0746i = new C0746i(iF, c1599lG.getId());
                } else if (i7 == 2) {
                    c0746i = new C0742e(iF, c1599lG.getId());
                } else if (i7 == 3) {
                    c0746i = new c5.j(iF, c1599lG.getId());
                } else {
                    if (i7 != 4) {
                        throw new i5.k();
                    }
                    c0746i = new C0743f(iF, c1599lG.getId());
                }
                Context context = g().getContext();
                w5.k.d(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c((ReactContext) context, g().getId());
                if (eVarC != null) {
                    eVarC.c(c0746i);
                }
                rVar.h(bVar);
            }
        }
    }

    public q(C1599l c1599l) {
        w5.k.f(c1599l, "screenView");
        this.f18487n = new ArrayList();
        this.f18489p = -1.0f;
        this.f18490q = true;
        this.f18491r = true;
        G(c1599l);
    }
}
