package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f8061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f8062b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f8063c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f8064d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f8065e = false;

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ d f8066m;

        a(d dVar) {
            this.f8066m = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (K.this.f8062b.contains(this.f8066m)) {
                this.f8066m.e().e(this.f8066m.f().mView);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ d f8068m;

        b(d dVar) {
            this.f8068m = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            K.this.f8062b.remove(this.f8068m);
            K.this.f8063c.remove(this.f8068m);
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8071b;

        static {
            int[] iArr = new int[e.b.values().length];
            f8071b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8071b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8071b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f8070a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8070a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8070a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8070a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final C f8072h;

        d(e.c cVar, e.b bVar, C c7, androidx.core.os.e eVar) {
            super(cVar, bVar, c7.k(), eVar);
            this.f8072h = c7;
        }

        @Override // androidx.fragment.app.K.e
        public void c() {
            super.c();
            this.f8072h.m();
        }

        @Override // androidx.fragment.app.K.e
        void l() {
            if (g() != e.b.ADDING) {
                if (g() == e.b.REMOVING) {
                    Fragment fragmentK = this.f8072h.k();
                    View viewRequireView = fragmentK.requireView();
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView.findFocus() + " on view " + viewRequireView + " for Fragment " + fragmentK);
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentK2 = this.f8072h.k();
            View viewFindFocus = fragmentK2.mView.findFocus();
            if (viewFindFocus != null) {
                fragmentK2.setFocusedView(viewFindFocus);
                if (w.J0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK2);
                }
            }
            View viewRequireView2 = f().requireView();
            if (viewRequireView2.getParent() == null) {
                this.f8072h.b();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragmentK2.getPostOnViewCreatedAlpha());
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f8073a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f8074b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Fragment f8075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f8076d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final HashSet f8077e = new HashSet();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f8078f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f8079g = false;

        class a implements e.b {
            a() {
            }

            @Override // androidx.core.os.e.b
            public void a() {
                e.this.b();
            }
        }

        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c h(int i7) {
                if (i7 == 0) {
                    return VISIBLE;
                }
                if (i7 == 4) {
                    return INVISIBLE;
                }
                if (i7 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i7);
            }

            static c j(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : h(view.getVisibility());
            }

            void e(View view) {
                int i7;
                int i8 = c.f8070a[ordinal()];
                if (i8 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i8 == 2) {
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i7 = 0;
                } else {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            return;
                        }
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i7 = 8;
                }
                view.setVisibility(i7);
            }
        }

        e(c cVar, b bVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f8073a = cVar;
            this.f8074b = bVar;
            this.f8075c = fragment;
            eVar.c(new a());
        }

        final void a(Runnable runnable) {
            this.f8076d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f8078f = true;
            if (this.f8077e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f8077e).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.e) it.next()).a();
            }
        }

        public void c() {
            if (this.f8079g) {
                return;
            }
            if (w.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f8079g = true;
            Iterator it = this.f8076d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void d(androidx.core.os.e eVar) {
            if (this.f8077e.remove(eVar) && this.f8077e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f8073a;
        }

        public final Fragment f() {
            return this.f8075c;
        }

        b g() {
            return this.f8074b;
        }

        final boolean h() {
            return this.f8078f;
        }

        final boolean i() {
            return this.f8079g;
        }

        public final void j(androidx.core.os.e eVar) {
            l();
            this.f8077e.add(eVar);
        }

        final void k(c cVar, b bVar) {
            b bVar2;
            int i7 = c.f8071b[bVar.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3 && this.f8073a != c.REMOVED) {
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f8075c + " mFinalState = " + this.f8073a + " -> " + cVar + ". ");
                        }
                        this.f8073a = cVar;
                        return;
                    }
                    return;
                }
                if (w.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f8075c + " mFinalState = " + this.f8073a + " -> REMOVED. mLifecycleImpact  = " + this.f8074b + " to REMOVING.");
                }
                this.f8073a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else {
                if (this.f8073a != c.REMOVED) {
                    return;
                }
                if (w.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f8075c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f8074b + " to ADDING.");
                }
                this.f8073a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f8074b = bVar2;
        }

        abstract void l();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f8073a + "} {mLifecycleImpact = " + this.f8074b + "} {mFragment = " + this.f8075c + "}";
        }
    }

    K(ViewGroup viewGroup) {
        this.f8061a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, C c7) {
        synchronized (this.f8062b) {
            try {
                androidx.core.os.e eVar = new androidx.core.os.e();
                e eVarH = h(c7.k());
                if (eVarH != null) {
                    eVarH.k(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, c7, eVar);
                this.f8062b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private e h(Fragment fragment) {
        for (e eVar : this.f8062b) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        for (e eVar : this.f8063c) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    static K n(ViewGroup viewGroup, w wVar) {
        return o(viewGroup, wVar.B0());
    }

    static K o(ViewGroup viewGroup, L l7) {
        Object tag = viewGroup.getTag(K.b.f1832b);
        if (tag instanceof K) {
            return (K) tag;
        }
        K kA = l7.a(viewGroup);
        viewGroup.setTag(K.b.f1832b, kA);
        return kA;
    }

    private void q() {
        for (e eVar : this.f8062b) {
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.h(eVar.f().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    void b(e.c cVar, C c7) {
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c7.k());
        }
        a(cVar, e.b.ADDING, c7);
    }

    void c(C c7) {
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c7.k());
        }
        a(e.c.GONE, e.b.NONE, c7);
    }

    void d(C c7) {
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c7.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, c7);
    }

    void e(C c7) {
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c7.k());
        }
        a(e.c.VISIBLE, e.b.NONE, c7);
    }

    abstract void f(List list, boolean z6);

    void g() {
        if (this.f8065e) {
            return;
        }
        if (!androidx.core.view.H.S(this.f8061a)) {
            j();
            this.f8064d = false;
            return;
        }
        synchronized (this.f8062b) {
            try {
                if (!this.f8062b.isEmpty()) {
                    ArrayList<e> arrayList = new ArrayList(this.f8063c);
                    this.f8063c.clear();
                    for (e eVar : arrayList) {
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f8063c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f8062b);
                    this.f8062b.clear();
                    this.f8063c.addAll(arrayList2);
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).l();
                    }
                    f(arrayList2, this.f8064d);
                    this.f8064d = false;
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void j() {
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zS = androidx.core.view.H.S(this.f8061a);
        synchronized (this.f8062b) {
            try {
                q();
                Iterator it = this.f8062b.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).l();
                }
                for (e eVar : new ArrayList(this.f8063c)) {
                    if (w.J0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        sb.append(zS ? "" : "Container " + this.f8061a + " is not attached to window. ");
                        sb.append("Cancelling running operation ");
                        sb.append(eVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    eVar.b();
                }
                for (e eVar2 : new ArrayList(this.f8062b)) {
                    if (w.J0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        sb2.append(zS ? "" : "Container " + this.f8061a + " is not attached to window. ");
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    eVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void k() {
        if (this.f8065e) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f8065e = false;
            g();
        }
    }

    e.b l(C c7) {
        e eVarH = h(c7.k());
        e.b bVarG = eVarH != null ? eVarH.g() : null;
        e eVarI = i(c7.k());
        return (eVarI == null || !(bVarG == null || bVarG == e.b.NONE)) ? bVarG : eVarI.g();
    }

    public ViewGroup m() {
        return this.f8061a;
    }

    void p() {
        synchronized (this.f8062b) {
            try {
                q();
                this.f8065e = false;
                int size = this.f8062b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = (e) this.f8062b.get(size);
                    e.c cVarJ = e.c.j(eVar.f().mView);
                    e.c cVarE = eVar.e();
                    e.c cVar = e.c.VISIBLE;
                    if (cVarE == cVar && cVarJ != cVar) {
                        this.f8065e = eVar.f().isPostponed();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void r(boolean z6) {
        this.f8064d = z6;
    }
}
