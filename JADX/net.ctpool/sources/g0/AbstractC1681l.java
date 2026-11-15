package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n.C1890a;

/* JADX INFO: renamed from: g0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1681l implements Cloneable {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final int[] f19398S = {2, 1, 3, 4};

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final AbstractC1676g f19399T = new a();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static ThreadLocal f19400U = new ThreadLocal();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private ArrayList f19406F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private ArrayList f19407G;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private e f19416P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private C1890a f19417Q;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f19419m = getClass().getName();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f19420n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f19421o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TimeInterpolator f19422p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList f19423q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList f19424r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ArrayList f19425s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList f19426t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList f19427u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList f19428v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ArrayList f19429w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private ArrayList f19430x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ArrayList f19431y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ArrayList f19432z = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ArrayList f19401A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private t f19402B = new t();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private t f19403C = new t();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    C1685p f19404D = null;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int[] f19405E = f19398S;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private ViewGroup f19408H = null;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f19409I = false;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    ArrayList f19410J = new ArrayList();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f19411K = 0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f19412L = false;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f19413M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private ArrayList f19414N = null;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ArrayList f19415O = new ArrayList();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private AbstractC1676g f19418R = f19399T;

    /* JADX INFO: renamed from: g0.l$a */
    static class a extends AbstractC1676g {
        a() {
        }

        @Override // g0.AbstractC1676g
        public Path a(float f7, float f8, float f9, float f10) {
            Path path = new Path();
            path.moveTo(f7, f8);
            path.lineTo(f9, f10);
            return path;
        }
    }

    /* JADX INFO: renamed from: g0.l$b */
    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1890a f19433a;

        b(C1890a c1890a) {
            this.f19433a = c1890a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f19433a.remove(animator);
            AbstractC1681l.this.f19410J.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC1681l.this.f19410J.add(animator);
        }
    }

    /* JADX INFO: renamed from: g0.l$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC1681l.this.r();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: g0.l$d */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f19436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f19437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        s f19438c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        P f19439d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        AbstractC1681l f19440e;

        d(View view, String str, AbstractC1681l abstractC1681l, P p6, s sVar) {
            this.f19436a = view;
            this.f19437b = str;
            this.f19438c = sVar;
            this.f19439d = p6;
            this.f19440e = abstractC1681l;
        }
    }

    /* JADX INFO: renamed from: g0.l$e */
    public static abstract class e {
    }

    /* JADX INFO: renamed from: g0.l$f */
    public interface f {
        void a(AbstractC1681l abstractC1681l);

        void b(AbstractC1681l abstractC1681l);

        void c(AbstractC1681l abstractC1681l);

        void d(AbstractC1681l abstractC1681l);

        void e(AbstractC1681l abstractC1681l);
    }

    private static C1890a A() {
        C1890a c1890a = (C1890a) f19400U.get();
        if (c1890a != null) {
            return c1890a;
        }
        C1890a c1890a2 = new C1890a();
        f19400U.set(c1890a2);
        return c1890a2;
    }

    private static boolean K(s sVar, s sVar2, String str) {
        Object obj = sVar.f19459a.get(str);
        Object obj2 = sVar2.f19459a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void L(C1890a c1890a, C1890a c1890a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) sparseArray.valueAt(i7);
            if (view2 != null && J(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i7))) != null && J(view)) {
                s sVar = (s) c1890a.get(view2);
                s sVar2 = (s) c1890a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f19406F.add(sVar);
                    this.f19407G.add(sVar2);
                    c1890a.remove(view2);
                    c1890a2.remove(view);
                }
            }
        }
    }

    private void M(C1890a c1890a, C1890a c1890a2) {
        s sVar;
        for (int size = c1890a.size() - 1; size >= 0; size--) {
            View view = (View) c1890a.j(size);
            if (view != null && J(view) && (sVar = (s) c1890a2.remove(view)) != null && J(sVar.f19460b)) {
                this.f19406F.add((s) c1890a.l(size));
                this.f19407G.add(sVar);
            }
        }
    }

    private void N(C1890a c1890a, C1890a c1890a2, n.d dVar, n.d dVar2) {
        View view;
        int iL = dVar.l();
        for (int i7 = 0; i7 < iL; i7++) {
            View view2 = (View) dVar.m(i7);
            if (view2 != null && J(view2) && (view = (View) dVar2.d(dVar.h(i7))) != null && J(view)) {
                s sVar = (s) c1890a.get(view2);
                s sVar2 = (s) c1890a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f19406F.add(sVar);
                    this.f19407G.add(sVar2);
                    c1890a.remove(view2);
                    c1890a2.remove(view);
                }
            }
        }
    }

    private void O(C1890a c1890a, C1890a c1890a2, C1890a c1890a3, C1890a c1890a4) {
        View view;
        int size = c1890a3.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) c1890a3.n(i7);
            if (view2 != null && J(view2) && (view = (View) c1890a4.get(c1890a3.j(i7))) != null && J(view)) {
                s sVar = (s) c1890a.get(view2);
                s sVar2 = (s) c1890a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f19406F.add(sVar);
                    this.f19407G.add(sVar2);
                    c1890a.remove(view2);
                    c1890a2.remove(view);
                }
            }
        }
    }

    private void P(t tVar, t tVar2) {
        C1890a c1890a = new C1890a(tVar.f19462a);
        C1890a c1890a2 = new C1890a(tVar2.f19462a);
        int i7 = 0;
        while (true) {
            int[] iArr = this.f19405E;
            if (i7 >= iArr.length) {
                c(c1890a, c1890a2);
                return;
            }
            int i8 = iArr[i7];
            if (i8 == 1) {
                M(c1890a, c1890a2);
            } else if (i8 == 2) {
                O(c1890a, c1890a2, tVar.f19465d, tVar2.f19465d);
            } else if (i8 == 3) {
                L(c1890a, c1890a2, tVar.f19463b, tVar2.f19463b);
            } else if (i8 == 4) {
                N(c1890a, c1890a2, tVar.f19464c, tVar2.f19464c);
            }
            i7++;
        }
    }

    private void V(Animator animator, C1890a c1890a) {
        if (animator != null) {
            animator.addListener(new b(c1890a));
            e(animator);
        }
    }

    private void c(C1890a c1890a, C1890a c1890a2) {
        for (int i7 = 0; i7 < c1890a.size(); i7++) {
            s sVar = (s) c1890a.n(i7);
            if (J(sVar.f19460b)) {
                this.f19406F.add(sVar);
                this.f19407G.add(null);
            }
        }
        for (int i8 = 0; i8 < c1890a2.size(); i8++) {
            s sVar2 = (s) c1890a2.n(i8);
            if (J(sVar2.f19460b)) {
                this.f19407G.add(sVar2);
                this.f19406F.add(null);
            }
        }
    }

    private static void d(t tVar, View view, s sVar) {
        tVar.f19462a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f19463b.indexOfKey(id) >= 0) {
                tVar.f19463b.put(id, null);
            } else {
                tVar.f19463b.put(id, view);
            }
        }
        String strK = androidx.core.view.H.K(view);
        if (strK != null) {
            if (tVar.f19465d.containsKey(strK)) {
                tVar.f19465d.put(strK, null);
            } else {
                tVar.f19465d.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f19464c.g(itemIdAtPosition) < 0) {
                    androidx.core.view.H.y0(view, true);
                    tVar.f19464c.i(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) tVar.f19464c.d(itemIdAtPosition);
                if (view2 != null) {
                    androidx.core.view.H.y0(view2, false);
                    tVar.f19464c.i(itemIdAtPosition, null);
                }
            }
        }
    }

    private void h(View view, boolean z6) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f19427u;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f19428v;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f19429w;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (((Class) this.f19429w.get(i7)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z6) {
                        j(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f19461c.add(this);
                    i(sVar);
                    d(z6 ? this.f19402B : this.f19403C, view, sVar);
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f19431y;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f19432z;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f19401A;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    if (((Class) this.f19401A.get(i8)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                                h(viewGroup.getChildAt(i9), z6);
                            }
                        }
                    }
                }
            }
        }
    }

    public long B() {
        return this.f19420n;
    }

    public List C() {
        return this.f19423q;
    }

    public List D() {
        return this.f19425s;
    }

    public List E() {
        return this.f19426t;
    }

    public List F() {
        return this.f19424r;
    }

    public String[] G() {
        return null;
    }

    public s H(View view, boolean z6) {
        C1685p c1685p = this.f19404D;
        if (c1685p != null) {
            return c1685p.H(view, z6);
        }
        return (s) (z6 ? this.f19402B : this.f19403C).f19462a.get(view);
    }

    public boolean I(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] strArrG = G();
        if (strArrG == null) {
            Iterator it = sVar.f19459a.keySet().iterator();
            while (it.hasNext()) {
                if (K(sVar, sVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrG) {
            if (!K(sVar, sVar2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean J(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f19427u;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f19428v;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f19429w;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((Class) this.f19429w.get(i7)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f19430x != null && androidx.core.view.H.K(view) != null && this.f19430x.contains(androidx.core.view.H.K(view))) {
            return false;
        }
        if ((this.f19423q.size() == 0 && this.f19424r.size() == 0 && (((arrayList = this.f19426t) == null || arrayList.isEmpty()) && ((arrayList2 = this.f19425s) == null || arrayList2.isEmpty()))) || this.f19423q.contains(Integer.valueOf(id)) || this.f19424r.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f19425s;
        if (arrayList6 != null && arrayList6.contains(androidx.core.view.H.K(view))) {
            return true;
        }
        if (this.f19426t != null) {
            for (int i8 = 0; i8 < this.f19426t.size(); i8++) {
                if (((Class) this.f19426t.get(i8)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void Q(View view) {
        if (this.f19413M) {
            return;
        }
        C1890a c1890aA = A();
        int size = c1890aA.size();
        P pD = AbstractC1666A.d(view);
        for (int i7 = size - 1; i7 >= 0; i7--) {
            d dVar = (d) c1890aA.n(i7);
            if (dVar.f19436a != null && pD.equals(dVar.f19439d)) {
                AbstractC1670a.b((Animator) c1890aA.j(i7));
            }
        }
        ArrayList arrayList = this.f19414N;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f19414N.clone();
            int size2 = arrayList2.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ((f) arrayList2.get(i8)).e(this);
            }
        }
        this.f19412L = true;
    }

    void R(ViewGroup viewGroup) {
        d dVar;
        this.f19406F = new ArrayList();
        this.f19407G = new ArrayList();
        P(this.f19402B, this.f19403C);
        C1890a c1890aA = A();
        int size = c1890aA.size();
        P pD = AbstractC1666A.d(viewGroup);
        for (int i7 = size - 1; i7 >= 0; i7--) {
            Animator animator = (Animator) c1890aA.j(i7);
            if (animator != null && (dVar = (d) c1890aA.get(animator)) != null && dVar.f19436a != null && pD.equals(dVar.f19439d)) {
                s sVar = dVar.f19438c;
                View view = dVar.f19436a;
                s sVarH = H(view, true);
                s sVarV = v(view, true);
                if (sVarH == null && sVarV == null) {
                    sVarV = (s) this.f19403C.f19462a.get(view);
                }
                if ((sVarH != null || sVarV != null) && dVar.f19440e.I(sVar, sVarV)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        c1890aA.remove(animator);
                    }
                }
            }
        }
        q(viewGroup, this.f19402B, this.f19403C, this.f19406F, this.f19407G);
        W();
    }

    public AbstractC1681l S(f fVar) {
        ArrayList arrayList = this.f19414N;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f19414N.size() == 0) {
            this.f19414N = null;
        }
        return this;
    }

    public AbstractC1681l T(View view) {
        this.f19424r.remove(view);
        return this;
    }

    public void U(View view) {
        if (this.f19412L) {
            if (!this.f19413M) {
                C1890a c1890aA = A();
                int size = c1890aA.size();
                P pD = AbstractC1666A.d(view);
                for (int i7 = size - 1; i7 >= 0; i7--) {
                    d dVar = (d) c1890aA.n(i7);
                    if (dVar.f19436a != null && pD.equals(dVar.f19439d)) {
                        AbstractC1670a.c((Animator) c1890aA.j(i7));
                    }
                }
                ArrayList arrayList = this.f19414N;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f19414N.clone();
                    int size2 = arrayList2.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        ((f) arrayList2.get(i8)).b(this);
                    }
                }
            }
            this.f19412L = false;
        }
    }

    protected void W() {
        e0();
        C1890a c1890aA = A();
        for (Animator animator : this.f19415O) {
            if (c1890aA.containsKey(animator)) {
                e0();
                V(animator, c1890aA);
            }
        }
        this.f19415O.clear();
        r();
    }

    public AbstractC1681l X(long j7) {
        this.f19421o = j7;
        return this;
    }

    public void Y(e eVar) {
        this.f19416P = eVar;
    }

    public AbstractC1681l Z(TimeInterpolator timeInterpolator) {
        this.f19422p = timeInterpolator;
        return this;
    }

    public AbstractC1681l a(f fVar) {
        if (this.f19414N == null) {
            this.f19414N = new ArrayList();
        }
        this.f19414N.add(fVar);
        return this;
    }

    public AbstractC1681l b(View view) {
        this.f19424r.add(view);
        return this;
    }

    public void b0(AbstractC1676g abstractC1676g) {
        if (abstractC1676g == null) {
            abstractC1676g = f19399T;
        }
        this.f19418R = abstractC1676g;
    }

    protected void cancel() {
        for (int size = this.f19410J.size() - 1; size >= 0; size--) {
            ((Animator) this.f19410J.get(size)).cancel();
        }
        ArrayList arrayList = this.f19414N;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f19414N.clone();
        int size2 = arrayList2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((f) arrayList2.get(i7)).c(this);
        }
    }

    public AbstractC1681l d0(long j7) {
        this.f19420n = j7;
        return this;
    }

    protected void e(Animator animator) {
        if (animator == null) {
            r();
            return;
        }
        if (s() >= 0) {
            animator.setDuration(s());
        }
        if (B() >= 0) {
            animator.setStartDelay(B() + animator.getStartDelay());
        }
        if (u() != null) {
            animator.setInterpolator(u());
        }
        animator.addListener(new c());
        animator.start();
    }

    protected void e0() {
        if (this.f19411K == 0) {
            ArrayList arrayList = this.f19414N;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f19414N.clone();
                int size = arrayList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((f) arrayList2.get(i7)).a(this);
                }
            }
            this.f19413M = false;
        }
        this.f19411K++;
    }

    String f0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f19421o != -1) {
            str2 = str2 + "dur(" + this.f19421o + ") ";
        }
        if (this.f19420n != -1) {
            str2 = str2 + "dly(" + this.f19420n + ") ";
        }
        if (this.f19422p != null) {
            str2 = str2 + "interp(" + this.f19422p + ") ";
        }
        if (this.f19423q.size() <= 0 && this.f19424r.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f19423q.size() > 0) {
            for (int i7 = 0; i7 < this.f19423q.size(); i7++) {
                if (i7 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f19423q.get(i7);
            }
        }
        if (this.f19424r.size() > 0) {
            for (int i8 = 0; i8 < this.f19424r.size(); i8++) {
                if (i8 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f19424r.get(i8);
            }
        }
        return str3 + ")";
    }

    public abstract void g(s sVar);

    public abstract void j(s sVar);

    void k(ViewGroup viewGroup, boolean z6) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C1890a c1890a;
        l(z6);
        if ((this.f19423q.size() > 0 || this.f19424r.size() > 0) && (((arrayList = this.f19425s) == null || arrayList.isEmpty()) && ((arrayList2 = this.f19426t) == null || arrayList2.isEmpty()))) {
            for (int i7 = 0; i7 < this.f19423q.size(); i7++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f19423q.get(i7)).intValue());
                if (viewFindViewById != null) {
                    s sVar = new s(viewFindViewById);
                    if (z6) {
                        j(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f19461c.add(this);
                    i(sVar);
                    d(z6 ? this.f19402B : this.f19403C, viewFindViewById, sVar);
                }
            }
            for (int i8 = 0; i8 < this.f19424r.size(); i8++) {
                View view = (View) this.f19424r.get(i8);
                s sVar2 = new s(view);
                if (z6) {
                    j(sVar2);
                } else {
                    g(sVar2);
                }
                sVar2.f19461c.add(this);
                i(sVar2);
                d(z6 ? this.f19402B : this.f19403C, view, sVar2);
            }
        } else {
            h(viewGroup, z6);
        }
        if (z6 || (c1890a = this.f19417Q) == null) {
            return;
        }
        int size = c1890a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            arrayList3.add(this.f19402B.f19465d.remove((String) this.f19417Q.j(i9)));
        }
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) arrayList3.get(i10);
            if (view2 != null) {
                this.f19402B.f19465d.put((String) this.f19417Q.n(i10), view2);
            }
        }
    }

    void l(boolean z6) {
        t tVar;
        if (z6) {
            this.f19402B.f19462a.clear();
            this.f19402B.f19463b.clear();
            tVar = this.f19402B;
        } else {
            this.f19403C.f19462a.clear();
            this.f19403C.f19463b.clear();
            tVar = this.f19403C;
        }
        tVar.f19464c.a();
    }

    @Override // 
    /* JADX INFO: renamed from: m */
    public AbstractC1681l clone() {
        try {
            AbstractC1681l abstractC1681l = (AbstractC1681l) super.clone();
            abstractC1681l.f19415O = new ArrayList();
            abstractC1681l.f19402B = new t();
            abstractC1681l.f19403C = new t();
            abstractC1681l.f19406F = null;
            abstractC1681l.f19407G = null;
            return abstractC1681l;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    protected void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        s sVar;
        int i7;
        Animator animator2;
        s sVar2;
        C1890a c1890aA = A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            s sVar3 = (s) arrayList.get(i8);
            s sVar4 = (s) arrayList2.get(i8);
            if (sVar3 != null && !sVar3.f19461c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f19461c.contains(this)) {
                sVar4 = null;
            }
            if ((sVar3 != null || sVar4 != null) && (sVar3 == null || sVar4 == null || I(sVar3, sVar4))) {
                Animator animatorP = p(viewGroup, sVar3, sVar4);
                if (animatorP != null) {
                    if (sVar4 != null) {
                        View view2 = sVar4.f19460b;
                        String[] strArrG = G();
                        if (strArrG != null && strArrG.length > 0) {
                            sVar2 = new s(view2);
                            s sVar5 = (s) tVar2.f19462a.get(view2);
                            if (sVar5 != null) {
                                int i9 = 0;
                                while (i9 < strArrG.length) {
                                    Map map = sVar2.f19459a;
                                    Animator animator3 = animatorP;
                                    String str = strArrG[i9];
                                    map.put(str, sVar5.f19459a.get(str));
                                    i9++;
                                    animatorP = animator3;
                                    strArrG = strArrG;
                                }
                            }
                            Animator animator4 = animatorP;
                            int size2 = c1890aA.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                d dVar = (d) c1890aA.get((Animator) c1890aA.j(i10));
                                if (dVar.f19438c != null && dVar.f19436a == view2 && dVar.f19437b.equals(x()) && dVar.f19438c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i10++;
                            }
                        } else {
                            animator2 = animatorP;
                            sVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        view = sVar3.f19460b;
                        animator = animatorP;
                        sVar = null;
                    }
                    if (animator != null) {
                        i7 = size;
                        c1890aA.put(animator, new d(view, x(), this, AbstractC1666A.d(viewGroup), sVar));
                        this.f19415O.add(animator);
                    }
                    i8++;
                    size = i7;
                }
                i7 = size;
                i8++;
                size = i7;
            }
            i7 = size;
            i8++;
            size = i7;
        }
        if (sparseIntArray.size() != 0) {
            for (int i11 = 0; i11 < sparseIntArray.size(); i11++) {
                Animator animator5 = (Animator) this.f19415O.get(sparseIntArray.keyAt(i11));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i11)) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    protected void r() {
        int i7 = this.f19411K - 1;
        this.f19411K = i7;
        if (i7 == 0) {
            ArrayList arrayList = this.f19414N;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f19414N.clone();
                int size = arrayList2.size();
                for (int i8 = 0; i8 < size; i8++) {
                    ((f) arrayList2.get(i8)).d(this);
                }
            }
            for (int i9 = 0; i9 < this.f19402B.f19464c.l(); i9++) {
                View view = (View) this.f19402B.f19464c.m(i9);
                if (view != null) {
                    androidx.core.view.H.y0(view, false);
                }
            }
            for (int i10 = 0; i10 < this.f19403C.f19464c.l(); i10++) {
                View view2 = (View) this.f19403C.f19464c.m(i10);
                if (view2 != null) {
                    androidx.core.view.H.y0(view2, false);
                }
            }
            this.f19413M = true;
        }
    }

    public long s() {
        return this.f19421o;
    }

    public e t() {
        return this.f19416P;
    }

    public String toString() {
        return f0("");
    }

    public TimeInterpolator u() {
        return this.f19422p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f19407G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f19406F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (g0.s) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    s v(View view, boolean z6) {
        C1685p c1685p = this.f19404D;
        if (c1685p != null) {
            return c1685p.v(view, z6);
        }
        ArrayList arrayList = z6 ? this.f19406F : this.f19407G;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            }
            s sVar = (s) arrayList.get(i7);
            if (sVar == null) {
                return null;
            }
            if (sVar.f19460b == view) {
                break;
            }
            i7++;
        }
    }

    public String x() {
        return this.f19419m;
    }

    public AbstractC1676g y() {
        return this.f19418R;
    }

    public AbstractC1684o z() {
        return null;
    }

    public void c0(AbstractC1684o abstractC1684o) {
    }

    void i(s sVar) {
    }
}
