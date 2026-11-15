package g0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import n.C1890a;

/* JADX INFO: renamed from: g0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1683n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AbstractC1681l f19441a = new C1671b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal f19442b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static ArrayList f19443c = new ArrayList();

    public static void a(ViewGroup viewGroup, AbstractC1681l abstractC1681l) {
        if (f19443c.contains(viewGroup) || !androidx.core.view.H.T(viewGroup)) {
            return;
        }
        f19443c.add(viewGroup);
        if (abstractC1681l == null) {
            abstractC1681l = f19441a;
        }
        AbstractC1681l abstractC1681lClone = abstractC1681l.clone();
        d(viewGroup, abstractC1681lClone);
        AbstractC1680k.b(viewGroup, null);
        c(viewGroup, abstractC1681lClone);
    }

    static C1890a b() {
        C1890a c1890a;
        WeakReference weakReference = (WeakReference) f19442b.get();
        if (weakReference != null && (c1890a = (C1890a) weakReference.get()) != null) {
            return c1890a;
        }
        C1890a c1890a2 = new C1890a();
        f19442b.set(new WeakReference(c1890a2));
        return c1890a2;
    }

    private static void c(ViewGroup viewGroup, AbstractC1681l abstractC1681l) {
        if (abstractC1681l == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC1681l, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, AbstractC1681l abstractC1681l) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC1681l) it.next()).Q(viewGroup);
            }
        }
        if (abstractC1681l != null) {
            abstractC1681l.k(viewGroup, true);
        }
        AbstractC1680k.a(viewGroup);
    }

    /* JADX INFO: renamed from: g0.n$a */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        AbstractC1681l f19444m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        ViewGroup f19445n;

        /* JADX INFO: renamed from: g0.n$a$a, reason: collision with other inner class name */
        class C0258a extends AbstractC1682m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C1890a f19446a;

            C0258a(C1890a c1890a) {
                this.f19446a = c1890a;
            }

            @Override // g0.AbstractC1681l.f
            public void d(AbstractC1681l abstractC1681l) {
                ((ArrayList) this.f19446a.get(a.this.f19445n)).remove(abstractC1681l);
                abstractC1681l.S(this);
            }
        }

        a(AbstractC1681l abstractC1681l, ViewGroup viewGroup) {
            this.f19444m = abstractC1681l;
            this.f19445n = viewGroup;
        }

        private void a() {
            this.f19445n.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f19445n.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!AbstractC1683n.f19443c.remove(this.f19445n)) {
                return true;
            }
            C1890a c1890aB = AbstractC1683n.b();
            ArrayList arrayList = (ArrayList) c1890aB.get(this.f19445n);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c1890aB.put(this.f19445n, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f19444m);
            this.f19444m.a(new C0258a(c1890aB));
            this.f19444m.k(this.f19445n, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC1681l) it.next()).U(this.f19445n);
                }
            }
            this.f19444m.R(this.f19445n);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            AbstractC1683n.f19443c.remove(this.f19445n);
            ArrayList arrayList = (ArrayList) AbstractC1683n.b().get(this.f19445n);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC1681l) it.next()).U(this.f19445n);
                }
            }
            this.f19444m.l(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
