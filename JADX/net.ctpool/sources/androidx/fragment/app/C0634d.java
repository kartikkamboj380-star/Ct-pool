package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.e;
import androidx.fragment.app.AbstractC0641k;
import androidx.fragment.app.K;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n.C1890a;

/* JADX INFO: renamed from: androidx.fragment.app.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0634d extends K {

    /* JADX INFO: renamed from: androidx.fragment.app.d$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8110a;

        static {
            int[] iArr = new int[K.e.c.values().length];
            f8110a = iArr;
            try {
                iArr[K.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8110a[K.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8110a[K.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8110a[K.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ List f8111m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ K.e f8112n;

        b(List list, K.e eVar) {
            this.f8111m = list;
            this.f8112n = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f8111m.contains(this.f8112n)) {
                this.f8111m.remove(this.f8112n);
                C0634d.this.s(this.f8112n);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$c */
    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f8114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f8115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f8116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ K.e f8117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f8118e;

        c(ViewGroup viewGroup, View view, boolean z6, K.e eVar, k kVar) {
            this.f8114a = viewGroup;
            this.f8115b = view;
            this.f8116c = z6;
            this.f8117d = eVar;
            this.f8118e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8114a.endViewTransition(this.f8115b);
            if (this.f8116c) {
                this.f8117d.e().e(this.f8115b);
            }
            this.f8118e.a();
            if (w.J0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f8117d + " has ended.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    class C0157d implements e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f8120a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ K.e f8121b;

        C0157d(Animator animator, K.e eVar) {
            this.f8120a = animator;
            this.f8121b = eVar;
        }

        @Override // androidx.core.os.e.b
        public void a() {
            this.f8120a.end();
            if (w.J0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f8121b + " has been canceled.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$e */
    class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ K.e f8123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f8124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f8125c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f8126d;

        /* JADX INFO: renamed from: androidx.fragment.app.d$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f8124b.endViewTransition(eVar.f8125c);
                e.this.f8126d.a();
            }
        }

        e(K.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.f8123a = eVar;
            this.f8124b = viewGroup;
            this.f8125c = view;
            this.f8126d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f8124b.post(new a());
            if (w.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f8123a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f8123a + " has reached onAnimationStart.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$f */
    class f implements e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f8129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f8130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f8131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ K.e f8132d;

        f(View view, ViewGroup viewGroup, k kVar, K.e eVar) {
            this.f8129a = view;
            this.f8130b = viewGroup;
            this.f8131c = kVar;
            this.f8132d = eVar;
        }

        @Override // androidx.core.os.e.b
        public void a() {
            this.f8129a.clearAnimation();
            this.f8130b.endViewTransition(this.f8129a);
            this.f8131c.a();
            if (w.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f8132d + " has been cancelled.");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ K.e f8134m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ K.e f8135n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f8136o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ C1890a f8137p;

        g(K.e eVar, K.e eVar2, boolean z6, C1890a c1890a) {
            this.f8134m = eVar;
            this.f8135n = eVar2;
            this.f8136o = z6;
            this.f8137p = c1890a;
        }

        @Override // java.lang.Runnable
        public void run() {
            F.a(this.f8134m.f(), this.f8135n.f(), this.f8136o, this.f8137p, false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ H f8139m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f8140n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Rect f8141o;

        h(H h7, View view, Rect rect) {
            this.f8139m = h7;
            this.f8140n = view;
            this.f8141o = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8139m.h(this.f8140n, this.f8141o);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$i */
    class i implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ArrayList f8143m;

        i(ArrayList arrayList) {
            this.f8143m = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            F.d(this.f8143m, 4);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$j */
    class j implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ m f8145m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ K.e f8146n;

        j(m mVar, K.e eVar) {
            this.f8145m = mVar;
            this.f8146n = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8145m.a();
            if (w.J0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f8146n + "has completed");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$k */
    private static class k extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f8148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f8149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private AbstractC0641k.a f8150e;

        k(K.e eVar, androidx.core.os.e eVar2, boolean z6) {
            super(eVar, eVar2);
            this.f8149d = false;
            this.f8148c = z6;
        }

        AbstractC0641k.a e(Context context) {
            if (this.f8149d) {
                return this.f8150e;
            }
            AbstractC0641k.a aVarB = AbstractC0641k.b(context, b().f(), b().e() == K.e.c.VISIBLE, this.f8148c);
            this.f8150e = aVarB;
            this.f8149d = true;
            return aVarB;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$l */
    private static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final K.e f8151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.core.os.e f8152b;

        l(K.e eVar, androidx.core.os.e eVar2) {
            this.f8151a = eVar;
            this.f8152b = eVar2;
        }

        void a() {
            this.f8151a.d(this.f8152b);
        }

        K.e b() {
            return this.f8151a;
        }

        androidx.core.os.e c() {
            return this.f8152b;
        }

        boolean d() {
            K.e.c cVar;
            K.e.c cVarJ = K.e.c.j(this.f8151a.f().mView);
            K.e.c cVarE = this.f8151a.e();
            return cVarJ == cVarE || !(cVarJ == (cVar = K.e.c.VISIBLE) || cVarE == cVar);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$m */
    private static class m extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f8153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f8154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Object f8155e;

        m(K.e eVar, androidx.core.os.e eVar2, boolean z6, boolean z7) {
            boolean allowReturnTransitionOverlap;
            Object sharedElementReturnTransition;
            super(eVar, eVar2);
            if (eVar.e() == K.e.c.VISIBLE) {
                Fragment fragmentF = eVar.f();
                this.f8153c = z6 ? fragmentF.getReenterTransition() : fragmentF.getEnterTransition();
                Fragment fragmentF2 = eVar.f();
                allowReturnTransitionOverlap = z6 ? fragmentF2.getAllowReturnTransitionOverlap() : fragmentF2.getAllowEnterTransitionOverlap();
            } else {
                Fragment fragmentF3 = eVar.f();
                this.f8153c = z6 ? fragmentF3.getReturnTransition() : fragmentF3.getExitTransition();
                allowReturnTransitionOverlap = true;
            }
            this.f8154d = allowReturnTransitionOverlap;
            if (z7) {
                Fragment fragmentF4 = eVar.f();
                sharedElementReturnTransition = z6 ? fragmentF4.getSharedElementReturnTransition() : fragmentF4.getSharedElementEnterTransition();
            } else {
                sharedElementReturnTransition = null;
            }
            this.f8155e = sharedElementReturnTransition;
        }

        private H f(Object obj) {
            if (obj == null) {
                return null;
            }
            H h7 = F.f7984a;
            if (h7 != null && h7.e(obj)) {
                return h7;
            }
            H h8 = F.f7985b;
            if (h8 != null && h8.e(obj)) {
                return h8;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        H e() {
            H hF = f(this.f8153c);
            H hF2 = f(this.f8155e);
            if (hF == null || hF2 == null || hF == hF2) {
                return hF != null ? hF : hF2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f8153c + " which uses a different Transition  type than its shared element transition " + this.f8155e);
        }

        public Object g() {
            return this.f8155e;
        }

        Object h() {
            return this.f8153c;
        }

        public boolean i() {
            return this.f8155e != null;
        }

        boolean j() {
            return this.f8154d;
        }
    }

    C0634d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List list, List list2, boolean z6, Map map) {
        int i7;
        StringBuilder sb;
        String str;
        boolean z7;
        Context context;
        View view;
        int i8;
        AbstractC0641k.a aVarE;
        K.e eVar;
        ViewGroup viewGroupM = m();
        Context context2 = viewGroupM.getContext();
        ArrayList<k> arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z8 = false;
        while (true) {
            i7 = 2;
            if (!it.hasNext()) {
                break;
            }
            k kVar = (k) it.next();
            if (kVar.d() || (aVarE = kVar.e(context2)) == null) {
                kVar.a();
            } else {
                Animator animator = aVarE.f8173b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    K.e eVarB = kVar.b();
                    Fragment fragmentF = eVarB.f();
                    if (Boolean.TRUE.equals(map.get(eVarB))) {
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + fragmentF + " as this Fragment was involved in a Transition.");
                        }
                        kVar.a();
                    } else {
                        boolean z9 = eVarB.e() == K.e.c.GONE;
                        if (z9) {
                            list2.remove(eVarB);
                        }
                        View view2 = fragmentF.mView;
                        viewGroupM.startViewTransition(view2);
                        animator.addListener(new c(viewGroupM, view2, z9, eVarB, kVar));
                        animator.setTarget(view2);
                        animator.start();
                        if (w.J0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Animator from operation ");
                            eVar = eVarB;
                            sb2.append(eVar);
                            sb2.append(" has started.");
                            Log.v("FragmentManager", sb2.toString());
                        } else {
                            eVar = eVarB;
                        }
                        kVar.c().c(new C0157d(animator, eVar));
                        z8 = true;
                    }
                }
            }
        }
        for (k kVar2 : arrayList) {
            K.e eVarB2 = kVar2.b();
            Fragment fragmentF2 = eVarB2.f();
            if (z6) {
                if (w.J0(i7)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragmentF2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else if (z8) {
                if (w.J0(i7)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragmentF2);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else {
                View view3 = fragmentF2.mView;
                Animation animation = (Animation) androidx.core.util.f.f(((AbstractC0641k.a) androidx.core.util.f.f(kVar2.e(context2))).f8172a);
                if (eVarB2.e() != K.e.c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar2.a();
                    z7 = z8;
                    context = context2;
                    i8 = i7;
                    view = view3;
                } else {
                    viewGroupM.startViewTransition(view3);
                    AbstractC0641k.b bVar = new AbstractC0641k.b(animation, viewGroupM, view3);
                    z7 = z8;
                    context = context2;
                    view = view3;
                    bVar.setAnimationListener(new e(eVarB2, viewGroupM, view3, kVar2));
                    view.startAnimation(bVar);
                    i8 = 2;
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + eVarB2 + " has started.");
                    }
                }
                kVar2.c().c(new f(view, viewGroupM, kVar2, eVarB2));
                i7 = i8;
                z8 = z7;
                context2 = context;
            }
        }
    }

    private Map x(List list, List list2, boolean z6, K.e eVar, K.e eVar2) {
        String str;
        String str2;
        String str3;
        View view;
        Object obj;
        ArrayList arrayList;
        Object obj2;
        ArrayList arrayList2;
        HashMap map;
        View view2;
        Object objK;
        C1890a c1890a;
        ArrayList arrayList3;
        K.e eVar3;
        ArrayList arrayList4;
        Rect rect;
        H h7;
        HashMap map2;
        K.e eVar4;
        View view3;
        View view4;
        View view5;
        boolean z7 = z6;
        K.e eVar5 = eVar;
        K.e eVar6 = eVar2;
        HashMap map3 = new HashMap();
        Iterator it = list.iterator();
        H h8 = null;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!mVar.d()) {
                H hE = mVar.e();
                if (h8 == null) {
                    h8 = hE;
                } else if (hE != null && h8 != hE) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (h8 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m mVar2 = (m) it2.next();
                map3.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return map3;
        }
        View view6 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C1890a c1890a2 = new C1890a();
        Iterator it3 = list.iterator();
        Object obj3 = null;
        View view7 = null;
        boolean z8 = false;
        while (true) {
            str = "FragmentManager";
            if (!it3.hasNext()) {
                break;
            }
            m mVar3 = (m) it3.next();
            if (!mVar3.i() || eVar5 == null || eVar6 == null) {
                c1890a = c1890a2;
                arrayList3 = arrayList6;
                eVar3 = eVar5;
                arrayList4 = arrayList5;
                rect = rect2;
                h7 = h8;
                map2 = map3;
                View view8 = view6;
                eVar4 = eVar6;
                view3 = view8;
                view7 = view7;
            } else {
                Object objU = h8.u(h8.f(mVar3.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                View view9 = view7;
                int i7 = 0;
                while (i7 < sharedElementTargetNames.size()) {
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i7));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i7));
                    }
                    i7++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                Fragment fragmentF = eVar.f();
                if (z7) {
                    fragmentF.getEnterTransitionCallback();
                    eVar2.f().getExitTransitionCallback();
                } else {
                    fragmentF.getExitTransitionCallback();
                    eVar2.f().getEnterTransitionCallback();
                }
                int i8 = 0;
                for (int size = sharedElementSourceNames.size(); i8 < size; size = size) {
                    c1890a2.put(sharedElementSourceNames.get(i8), sharedElementTargetNames2.get(i8));
                    i8++;
                }
                if (w.J0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator<String> it4 = sharedElementTargetNames2.iterator(); it4.hasNext(); it4 = it4) {
                        Log.v("FragmentManager", "Name: " + it4.next());
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator<String> it5 = sharedElementSourceNames.iterator(); it5.hasNext(); it5 = it5) {
                        Log.v("FragmentManager", "Name: " + it5.next());
                    }
                }
                C1890a c1890a3 = new C1890a();
                u(c1890a3, eVar.f().mView);
                c1890a3.p(sharedElementSourceNames);
                c1890a2.p(c1890a3.keySet());
                C1890a c1890a4 = new C1890a();
                u(c1890a4, eVar2.f().mView);
                c1890a4.p(sharedElementTargetNames2);
                c1890a4.p(c1890a2.values());
                F.c(c1890a2, c1890a4);
                v(c1890a3, c1890a2.keySet());
                v(c1890a4, c1890a2.values());
                if (c1890a2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    c1890a = c1890a2;
                    arrayList3 = arrayList6;
                    eVar3 = eVar5;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view6;
                    h7 = h8;
                    view7 = view9;
                    obj3 = null;
                    eVar4 = eVar2;
                    map2 = map3;
                } else {
                    F.a(eVar2.f(), eVar.f(), z7, c1890a3, true);
                    HashMap map4 = map3;
                    View view10 = view6;
                    c1890a = c1890a2;
                    ArrayList arrayList8 = arrayList6;
                    androidx.core.view.F.a(m(), new g(eVar2, eVar, z6, c1890a4));
                    arrayList5.addAll(c1890a3.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        view7 = view9;
                    } else {
                        view7 = (View) c1890a3.get((String) sharedElementSourceNames.get(0));
                        h8.p(objU, view7);
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(c1890a4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view5 = (View) c1890a4.get((String) sharedElementTargetNames2.get(0))) == null) {
                        view4 = view10;
                    } else {
                        androidx.core.view.F.a(m(), new h(h8, view5, rect2));
                        view4 = view10;
                        z8 = true;
                    }
                    h8.s(objU, view4, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    h7 = h8;
                    h8.n(objU, null, null, null, null, objU, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar3 = eVar;
                    map2 = map4;
                    map2.put(eVar3, bool);
                    eVar4 = eVar2;
                    map2.put(eVar4, bool);
                    obj3 = objU;
                }
            }
            eVar5 = eVar3;
            arrayList5 = arrayList4;
            rect2 = rect;
            map3 = map2;
            c1890a2 = c1890a;
            z7 = z6;
            arrayList6 = arrayList3;
            h8 = h7;
            K.e eVar7 = eVar4;
            view6 = view3;
            eVar6 = eVar7;
        }
        View view11 = view7;
        C1890a c1890a5 = c1890a2;
        ArrayList arrayList9 = arrayList6;
        K.e eVar8 = eVar5;
        ArrayList arrayList10 = arrayList5;
        Rect rect3 = rect2;
        H h9 = h8;
        HashMap map5 = map3;
        View view12 = view6;
        K.e eVar9 = eVar6;
        View view13 = view12;
        ArrayList arrayList11 = new ArrayList();
        Iterator it6 = list.iterator();
        Object obj4 = null;
        Object objK2 = null;
        while (it6.hasNext()) {
            m mVar4 = (m) it6.next();
            if (mVar4.d()) {
                map5.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object objF = h9.f(mVar4.h());
                K.e eVarB = mVar4.b();
                boolean z9 = obj3 != null && (eVarB == eVar8 || eVarB == eVar9);
                if (objF == null) {
                    if (!z9) {
                        map5.put(eVarB, Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = arrayList9;
                    str3 = str;
                    arrayList = arrayList10;
                    view = view13;
                    objK = obj4;
                    map = map5;
                    view2 = view11;
                } else {
                    str3 = str;
                    ArrayList arrayList12 = new ArrayList();
                    Object obj5 = obj4;
                    t(arrayList12, eVarB.f().mView);
                    if (z9) {
                        if (eVarB == eVar8) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        h9.a(objF, view13);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view13;
                        obj2 = objK2;
                        map = map5;
                        obj = obj5;
                    } else {
                        h9.b(objF, arrayList12);
                        view = view13;
                        obj = obj5;
                        arrayList = arrayList10;
                        obj2 = objK2;
                        arrayList2 = arrayList9;
                        map = map5;
                        h9.n(objF, objF, arrayList12, null, null, null, null);
                        if (eVarB.e() == K.e.c.GONE) {
                            list2.remove(eVarB);
                            ArrayList arrayList13 = new ArrayList(arrayList12);
                            arrayList13.remove(eVarB.f().mView);
                            h9.m(objF, eVarB.f().mView, arrayList13);
                            androidx.core.view.F.a(m(), new i(arrayList12));
                        }
                    }
                    if (eVarB.e() == K.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z8) {
                            h9.o(objF, rect3);
                        }
                        view2 = view11;
                    } else {
                        view2 = view11;
                        h9.p(objF, view2);
                    }
                    map.put(eVarB, Boolean.TRUE);
                    if (mVar4.j()) {
                        objK2 = h9.k(obj2, objF, null);
                        objK = obj;
                    } else {
                        objK = h9.k(obj, objF, null);
                        objK2 = obj2;
                    }
                }
                eVar9 = eVar2;
                map5 = map;
                obj4 = objK;
                view11 = view2;
                str = str3;
                view13 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
            }
        }
        ArrayList<View> arrayList14 = arrayList9;
        String str4 = str;
        ArrayList<View> arrayList15 = arrayList10;
        HashMap map6 = map5;
        Object objJ = h9.j(objK2, obj4, obj3);
        if (objJ == null) {
            return map6;
        }
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            m mVar5 = (m) it7.next();
            if (!mVar5.d()) {
                Object objH = mVar5.h();
                K.e eVarB2 = mVar5.b();
                HashMap map7 = map6;
                boolean z10 = obj3 != null && (eVarB2 == eVar8 || eVarB2 == eVar2);
                if (objH == null && !z10) {
                    str2 = str4;
                } else if (androidx.core.view.H.T(m())) {
                    str2 = str4;
                    h9.q(mVar5.b().f(), objJ, mVar5.c(), new j(mVar5, eVarB2));
                } else {
                    if (w.J0(2)) {
                        str2 = str4;
                        Log.v(str2, "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + eVarB2);
                    } else {
                        str2 = str4;
                    }
                    mVar5.a();
                }
                map6 = map7;
                str4 = str2;
            }
        }
        HashMap map8 = map6;
        String str5 = str4;
        if (!androidx.core.view.H.T(m())) {
            return map8;
        }
        F.d(arrayList11, 4);
        ArrayList arrayListL = h9.l(arrayList14);
        if (w.J0(2)) {
            Log.v(str5, ">>>>> Beginning transition <<<<<");
            Log.v(str5, ">>>>> SharedElementFirstOutViews <<<<<");
            for (View view14 : arrayList15) {
                Log.v(str5, "View: " + view14 + " Name: " + androidx.core.view.H.K(view14));
            }
            Log.v(str5, ">>>>> SharedElementLastInViews <<<<<");
            for (View view15 : arrayList14) {
                Log.v(str5, "View: " + view15 + " Name: " + androidx.core.view.H.K(view15));
            }
        }
        h9.c(m(), objJ);
        h9.r(m(), arrayList15, arrayList14, arrayListL, c1890a5);
        F.d(arrayList11, 0);
        h9.t(obj3, arrayList15, arrayList14);
        return map8;
    }

    private void y(List list) {
        Fragment fragmentF = ((K.e) list.get(list.size() - 1)).f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            K.e eVar = (K.e) it.next();
            eVar.f().mAnimationInfo.f8006c = fragmentF.mAnimationInfo.f8006c;
            eVar.f().mAnimationInfo.f8007d = fragmentF.mAnimationInfo.f8007d;
            eVar.f().mAnimationInfo.f8008e = fragmentF.mAnimationInfo.f8008e;
            eVar.f().mAnimationInfo.f8009f = fragmentF.mAnimationInfo.f8009f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    @Override // androidx.fragment.app.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void f(List list, boolean z6) {
        Iterator it = list.iterator();
        K.e eVar = null;
        K.e eVar2 = null;
        while (it.hasNext()) {
            K.e eVar3 = (K.e) it.next();
            K.e.c cVarJ = K.e.c.j(eVar3.f().mView);
            int i7 = a.f8110a[eVar3.e().ordinal()];
            if (i7 == 1 || i7 == 2 || i7 == 3) {
                if (cVarJ == K.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i7 == 4 && cVarJ != K.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        if (w.J0(2)) {
            Log.v("FragmentManager", "Executing operations from " + eVar + " to " + eVar2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        y(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            K.e eVar4 = (K.e) it2.next();
            androidx.core.os.e eVar5 = new androidx.core.os.e();
            eVar4.j(eVar5);
            arrayList.add(new k(eVar4, eVar5, z6));
            androidx.core.os.e eVar6 = new androidx.core.os.e();
            eVar4.j(eVar6);
            boolean z7 = false;
            if (z6) {
                if (eVar4 == eVar) {
                    z7 = true;
                }
            } else if (eVar4 == eVar2) {
            }
            arrayList2.add(new m(eVar4, eVar6, z6, z7));
            eVar4.a(new b(arrayList3, eVar4));
        }
        Map mapX = x(arrayList2, arrayList3, z6, eVar, eVar2);
        w(arrayList, arrayList3, mapX.containsValue(Boolean.TRUE), mapX);
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            s((K.e) it3.next());
        }
        arrayList3.clear();
        if (w.J0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + eVar + " to " + eVar2);
        }
    }

    void s(K.e eVar) {
        eVar.e().e(eVar.f().mView);
    }

    void t(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (androidx.core.view.K.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(Map map, View view) {
        String strK = androidx.core.view.H.K(view);
        if (strK != null) {
            map.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(C1890a c1890a, Collection collection) {
        Iterator it = c1890a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(androidx.core.view.H.K((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }
}
