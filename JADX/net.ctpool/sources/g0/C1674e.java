package g0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import g0.AbstractC1681l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: g0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1674e extends androidx.fragment.app.H {

    /* JADX INFO: renamed from: g0.e$a */
    class a extends AbstractC1681l.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f19381a;

        a(Rect rect) {
            this.f19381a = rect;
        }
    }

    /* JADX INFO: renamed from: g0.e$c */
    class c extends AbstractC1682m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f19387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f19388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f19389d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f19390e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f19391f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f19386a = obj;
            this.f19387b = arrayList;
            this.f19388c = obj2;
            this.f19389d = arrayList2;
            this.f19390e = obj3;
            this.f19391f = arrayList3;
        }

        @Override // g0.AbstractC1682m, g0.AbstractC1681l.f
        public void a(AbstractC1681l abstractC1681l) {
            Object obj = this.f19386a;
            if (obj != null) {
                C1674e.this.w(obj, this.f19387b, null);
            }
            Object obj2 = this.f19388c;
            if (obj2 != null) {
                C1674e.this.w(obj2, this.f19389d, null);
            }
            Object obj3 = this.f19390e;
            if (obj3 != null) {
                C1674e.this.w(obj3, this.f19391f, null);
            }
        }

        @Override // g0.AbstractC1681l.f
        public void d(AbstractC1681l abstractC1681l) {
            abstractC1681l.S(this);
        }
    }

    /* JADX INFO: renamed from: g0.e$d */
    class d extends AbstractC1681l.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f19393a;

        d(Rect rect) {
            this.f19393a = rect;
        }
    }

    private static boolean v(AbstractC1681l abstractC1681l) {
        return (androidx.fragment.app.H.i(abstractC1681l.C()) && androidx.fragment.app.H.i(abstractC1681l.D()) && androidx.fragment.app.H.i(abstractC1681l.E())) ? false : true;
    }

    @Override // androidx.fragment.app.H
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1681l) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.H
    public void b(Object obj, ArrayList arrayList) {
        AbstractC1681l abstractC1681l = (AbstractC1681l) obj;
        if (abstractC1681l == null) {
            return;
        }
        int i7 = 0;
        if (abstractC1681l instanceof C1685p) {
            C1685p c1685p = (C1685p) abstractC1681l;
            int iL0 = c1685p.l0();
            while (i7 < iL0) {
                b(c1685p.k0(i7), arrayList);
                i7++;
            }
            return;
        }
        if (v(abstractC1681l) || !androidx.fragment.app.H.i(abstractC1681l.F())) {
            return;
        }
        int size = arrayList.size();
        while (i7 < size) {
            abstractC1681l.b((View) arrayList.get(i7));
            i7++;
        }
    }

    @Override // androidx.fragment.app.H
    public void c(ViewGroup viewGroup, Object obj) {
        AbstractC1683n.a(viewGroup, (AbstractC1681l) obj);
    }

    @Override // androidx.fragment.app.H
    public boolean e(Object obj) {
        return obj instanceof AbstractC1681l;
    }

    @Override // androidx.fragment.app.H
    public Object f(Object obj) {
        if (obj != null) {
            return ((AbstractC1681l) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.H
    public Object j(Object obj, Object obj2, Object obj3) {
        AbstractC1681l abstractC1681lR0 = (AbstractC1681l) obj;
        AbstractC1681l abstractC1681l = (AbstractC1681l) obj2;
        AbstractC1681l abstractC1681l2 = (AbstractC1681l) obj3;
        if (abstractC1681lR0 != null && abstractC1681l != null) {
            abstractC1681lR0 = new C1685p().i0(abstractC1681lR0).i0(abstractC1681l).r0(1);
        } else if (abstractC1681lR0 == null) {
            abstractC1681lR0 = abstractC1681l != null ? abstractC1681l : null;
        }
        if (abstractC1681l2 == null) {
            return abstractC1681lR0;
        }
        C1685p c1685p = new C1685p();
        if (abstractC1681lR0 != null) {
            c1685p.i0(abstractC1681lR0);
        }
        c1685p.i0(abstractC1681l2);
        return c1685p;
    }

    @Override // androidx.fragment.app.H
    public Object k(Object obj, Object obj2, Object obj3) {
        C1685p c1685p = new C1685p();
        if (obj != null) {
            c1685p.i0((AbstractC1681l) obj);
        }
        if (obj2 != null) {
            c1685p.i0((AbstractC1681l) obj2);
        }
        if (obj3 != null) {
            c1685p.i0((AbstractC1681l) obj3);
        }
        return c1685p;
    }

    @Override // androidx.fragment.app.H
    public void m(Object obj, View view, ArrayList arrayList) {
        ((AbstractC1681l) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.H
    public void n(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC1681l) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.H
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC1681l) obj).Y(new d(rect));
        }
    }

    @Override // androidx.fragment.app.H
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((AbstractC1681l) obj).Y(new a(rect));
        }
    }

    @Override // androidx.fragment.app.H
    public void s(Object obj, View view, ArrayList arrayList) {
        C1685p c1685p = (C1685p) obj;
        List listF = c1685p.F();
        listF.clear();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            androidx.fragment.app.H.d(listF, (View) arrayList.get(i7));
        }
        listF.add(view);
        arrayList.add(view);
        b(c1685p, arrayList);
    }

    @Override // androidx.fragment.app.H
    public void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C1685p c1685p = (C1685p) obj;
        if (c1685p != null) {
            c1685p.F().clear();
            c1685p.F().addAll(arrayList2);
            w(c1685p, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.H
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        C1685p c1685p = new C1685p();
        c1685p.i0((AbstractC1681l) obj);
        return c1685p;
    }

    public void w(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC1681l abstractC1681l = (AbstractC1681l) obj;
        int i7 = 0;
        if (abstractC1681l instanceof C1685p) {
            C1685p c1685p = (C1685p) abstractC1681l;
            int iL0 = c1685p.l0();
            while (i7 < iL0) {
                w(c1685p.k0(i7), arrayList, arrayList2);
                i7++;
            }
            return;
        }
        if (v(abstractC1681l)) {
            return;
        }
        List listF = abstractC1681l.F();
        if (listF.size() == arrayList.size() && listF.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i7 < size) {
                abstractC1681l.b((View) arrayList2.get(i7));
                i7++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC1681l.T((View) arrayList.get(size2));
            }
        }
    }

    /* JADX INFO: renamed from: g0.e$b */
    class b implements AbstractC1681l.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f19383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f19384b;

        b(View view, ArrayList arrayList) {
            this.f19383a = view;
            this.f19384b = arrayList;
        }

        @Override // g0.AbstractC1681l.f
        public void d(AbstractC1681l abstractC1681l) {
            abstractC1681l.S(this);
            this.f19383a.setVisibility(8);
            int size = this.f19384b.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((View) this.f19384b.get(i7)).setVisibility(0);
            }
        }

        @Override // g0.AbstractC1681l.f
        public void a(AbstractC1681l abstractC1681l) {
        }

        @Override // g0.AbstractC1681l.f
        public void b(AbstractC1681l abstractC1681l) {
        }

        @Override // g0.AbstractC1681l.f
        public void c(AbstractC1681l abstractC1681l) {
        }

        @Override // g0.AbstractC1681l.f
        public void e(AbstractC1681l abstractC1681l) {
        }
    }
}
