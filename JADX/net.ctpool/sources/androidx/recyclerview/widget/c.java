package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.H;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends n {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f8741s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f8742h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f8743i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f8744j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList f8745k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ArrayList f8746l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList f8747m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList f8748n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList f8749o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList f8750p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList f8751q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList f8752r = new ArrayList();

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ArrayList f8753m;

        a(ArrayList arrayList) {
            this.f8753m = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f8753m) {
                c.this.S(jVar.f8787a, jVar.f8788b, jVar.f8789c, jVar.f8790d, jVar.f8791e);
            }
            this.f8753m.clear();
            c.this.f8747m.remove(this.f8753m);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ArrayList f8755m;

        b(ArrayList arrayList) {
            this.f8755m = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f8755m.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f8755m.clear();
            c.this.f8748n.remove(this.f8755m);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    class RunnableC0168c implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ ArrayList f8757m;

        RunnableC0168c(ArrayList arrayList) {
            this.f8757m = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f8757m.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.C) it.next());
            }
            this.f8757m.clear();
            c.this.f8746l.remove(this.f8757m);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.C f8759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f8760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f8761c;

        d(RecyclerView.C c7, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f8759a = c7;
            this.f8760b = viewPropertyAnimator;
            this.f8761c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8760b.setListener(null);
            this.f8761c.setAlpha(1.0f);
            c.this.G(this.f8759a);
            c.this.f8751q.remove(this.f8759a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f8759a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.C f8763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f8764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f8765c;

        e(RecyclerView.C c7, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f8763a = c7;
            this.f8764b = view;
            this.f8765c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8764b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8765c.setListener(null);
            c.this.A(this.f8763a);
            c.this.f8749o.remove(this.f8763a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f8763a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.C f8767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f8769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f8770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f8771e;

        f(RecyclerView.C c7, int i7, View view, int i8, ViewPropertyAnimator viewPropertyAnimator) {
            this.f8767a = c7;
            this.f8768b = i7;
            this.f8769c = view;
            this.f8770d = i8;
            this.f8771e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f8768b != 0) {
                this.f8769c.setTranslationX(0.0f);
            }
            if (this.f8770d != 0) {
                this.f8769c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8771e.setListener(null);
            c.this.E(this.f8767a);
            c.this.f8750p.remove(this.f8767a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f8767a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f8773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f8774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f8775c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f8773a = iVar;
            this.f8774b = viewPropertyAnimator;
            this.f8775c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8774b.setListener(null);
            this.f8775c.setAlpha(1.0f);
            this.f8775c.setTranslationX(0.0f);
            this.f8775c.setTranslationY(0.0f);
            c.this.C(this.f8773a.f8781a, true);
            c.this.f8752r.remove(this.f8773a.f8781a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f8773a.f8781a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f8777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f8778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f8779c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f8777a = iVar;
            this.f8778b = viewPropertyAnimator;
            this.f8779c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f8778b.setListener(null);
            this.f8779c.setAlpha(1.0f);
            this.f8779c.setTranslationX(0.0f);
            this.f8779c.setTranslationY(0.0f);
            c.this.C(this.f8777a.f8782b, false);
            c.this.f8752r.remove(this.f8777a.f8782b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f8777a.f8782b, false);
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.C f8781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.C f8782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8786f;

        private i(RecyclerView.C c7, RecyclerView.C c8) {
            this.f8781a = c7;
            this.f8782b = c8;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f8781a + ", newHolder=" + this.f8782b + ", fromX=" + this.f8783c + ", fromY=" + this.f8784d + ", toX=" + this.f8785e + ", toY=" + this.f8786f + '}';
        }

        i(RecyclerView.C c7, RecyclerView.C c8, int i7, int i8, int i9, int i10) {
            this(c7, c8);
            this.f8783c = i7;
            this.f8784d = i8;
            this.f8785e = i9;
            this.f8786f = i10;
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.C f8787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8791e;

        j(RecyclerView.C c7, int i7, int i8, int i9, int i10) {
            this.f8787a = c7;
            this.f8788b = i7;
            this.f8789c = i8;
            this.f8790d = i9;
            this.f8791e = i10;
        }
    }

    private void T(RecyclerView.C c7) {
        View view = c7.f8556a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f8751q.add(c7);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(c7, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List list, RecyclerView.C c7) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, c7) && iVar.f8781a == null && iVar.f8782b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.C c7 = iVar.f8781a;
        if (c7 != null) {
            Y(iVar, c7);
        }
        RecyclerView.C c8 = iVar.f8782b;
        if (c8 != null) {
            Y(iVar, c8);
        }
    }

    private boolean Y(i iVar, RecyclerView.C c7) {
        boolean z6 = false;
        if (iVar.f8782b == c7) {
            iVar.f8782b = null;
        } else {
            if (iVar.f8781a != c7) {
                return false;
            }
            iVar.f8781a = null;
            z6 = true;
        }
        c7.f8556a.setAlpha(1.0f);
        c7.f8556a.setTranslationX(0.0f);
        c7.f8556a.setTranslationY(0.0f);
        C(c7, z6);
        return true;
    }

    private void Z(RecyclerView.C c7) {
        if (f8741s == null) {
            f8741s = new ValueAnimator().getInterpolator();
        }
        c7.f8556a.animate().setInterpolator(f8741s);
        j(c7);
    }

    void Q(RecyclerView.C c7) {
        View view = c7.f8556a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f8749o.add(c7);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(c7, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(i iVar) {
        RecyclerView.C c7 = iVar.f8781a;
        View view = c7 == null ? null : c7.f8556a;
        RecyclerView.C c8 = iVar.f8782b;
        View view2 = c8 != null ? c8.f8556a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f8752r.add(iVar.f8781a);
            duration.translationX(iVar.f8785e - iVar.f8783c);
            duration.translationY(iVar.f8786f - iVar.f8784d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f8752r.add(iVar.f8782b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.C c7, int i7, int i8, int i9, int i10) {
        View view = c7.f8556a;
        int i11 = i9 - i7;
        int i12 = i10 - i8;
        if (i11 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i12 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f8750p.add(c7);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(c7, i11, view, i12, viewPropertyAnimatorAnimate)).start();
    }

    void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.C) list.get(size)).f8556a.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.C c7, List list) {
        return !list.isEmpty() || super.g(c7, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.C c7) {
        View view = c7.f8556a;
        view.animate().cancel();
        int size = this.f8744j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f8744j.get(size)).f8787a == c7) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(c7);
                this.f8744j.remove(size);
            }
        }
        W(this.f8745k, c7);
        if (this.f8742h.remove(c7)) {
            view.setAlpha(1.0f);
            G(c7);
        }
        if (this.f8743i.remove(c7)) {
            view.setAlpha(1.0f);
            A(c7);
        }
        for (int size2 = this.f8748n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f8748n.get(size2);
            W(arrayList, c7);
            if (arrayList.isEmpty()) {
                this.f8748n.remove(size2);
            }
        }
        for (int size3 = this.f8747m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f8747m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f8787a == c7) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(c7);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f8747m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f8746l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f8746l.get(size5);
            if (arrayList3.remove(c7)) {
                view.setAlpha(1.0f);
                A(c7);
                if (arrayList3.isEmpty()) {
                    this.f8746l.remove(size5);
                }
            }
        }
        this.f8751q.remove(c7);
        this.f8749o.remove(c7);
        this.f8752r.remove(c7);
        this.f8750p.remove(c7);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        int size = this.f8744j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f8744j.get(size);
            View view = jVar.f8787a.f8556a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f8787a);
            this.f8744j.remove(size);
        }
        for (int size2 = this.f8742h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.C) this.f8742h.get(size2));
            this.f8742h.remove(size2);
        }
        int size3 = this.f8743i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C c7 = (RecyclerView.C) this.f8743i.get(size3);
            c7.f8556a.setAlpha(1.0f);
            A(c7);
            this.f8743i.remove(size3);
        }
        for (int size4 = this.f8745k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f8745k.get(size4));
        }
        this.f8745k.clear();
        if (p()) {
            for (int size5 = this.f8747m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f8747m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f8787a.f8556a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f8787a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f8747m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f8746l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f8746l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C c8 = (RecyclerView.C) arrayList2.get(size8);
                    c8.f8556a.setAlpha(1.0f);
                    A(c8);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f8746l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f8748n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f8748n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f8748n.remove(arrayList3);
                    }
                }
            }
            U(this.f8751q);
            U(this.f8750p);
            U(this.f8749o);
            U(this.f8752r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return (this.f8743i.isEmpty() && this.f8745k.isEmpty() && this.f8744j.isEmpty() && this.f8742h.isEmpty() && this.f8750p.isEmpty() && this.f8751q.isEmpty() && this.f8749o.isEmpty() && this.f8752r.isEmpty() && this.f8747m.isEmpty() && this.f8746l.isEmpty() && this.f8748n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void u() {
        boolean z6 = !this.f8742h.isEmpty();
        boolean z7 = !this.f8744j.isEmpty();
        boolean z8 = !this.f8745k.isEmpty();
        boolean z9 = !this.f8743i.isEmpty();
        if (z6 || z7 || z9 || z8) {
            Iterator it = this.f8742h.iterator();
            while (it.hasNext()) {
                T((RecyclerView.C) it.next());
            }
            this.f8742h.clear();
            if (z7) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f8744j);
                this.f8747m.add(arrayList);
                this.f8744j.clear();
                a aVar = new a(arrayList);
                if (z6) {
                    H.i0(((j) arrayList.get(0)).f8787a.f8556a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z8) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f8745k);
                this.f8748n.add(arrayList2);
                this.f8745k.clear();
                b bVar = new b(arrayList2);
                if (z6) {
                    H.i0(((i) arrayList2.get(0)).f8781a.f8556a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z9) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f8743i);
                this.f8746l.add(arrayList3);
                this.f8743i.clear();
                RunnableC0168c runnableC0168c = new RunnableC0168c(arrayList3);
                if (z6 || z7 || z8) {
                    H.i0(((RecyclerView.C) arrayList3.get(0)).f8556a, runnableC0168c, (z6 ? o() : 0L) + Math.max(z7 ? n() : 0L, z8 ? m() : 0L));
                } else {
                    runnableC0168c.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.n
    public boolean w(RecyclerView.C c7) {
        Z(c7);
        c7.f8556a.setAlpha(0.0f);
        this.f8743i.add(c7);
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean x(RecyclerView.C c7, RecyclerView.C c8, int i7, int i8, int i9, int i10) {
        if (c7 == c8) {
            return y(c7, i7, i8, i9, i10);
        }
        float translationX = c7.f8556a.getTranslationX();
        float translationY = c7.f8556a.getTranslationY();
        float alpha = c7.f8556a.getAlpha();
        Z(c7);
        int i11 = (int) ((i9 - i7) - translationX);
        int i12 = (int) ((i10 - i8) - translationY);
        c7.f8556a.setTranslationX(translationX);
        c7.f8556a.setTranslationY(translationY);
        c7.f8556a.setAlpha(alpha);
        if (c8 != null) {
            Z(c8);
            c8.f8556a.setTranslationX(-i11);
            c8.f8556a.setTranslationY(-i12);
            c8.f8556a.setAlpha(0.0f);
        }
        this.f8745k.add(new i(c7, c8, i7, i8, i9, i10));
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean y(RecyclerView.C c7, int i7, int i8, int i9, int i10) {
        View view = c7.f8556a;
        int translationX = i7 + ((int) view.getTranslationX());
        int translationY = i8 + ((int) c7.f8556a.getTranslationY());
        Z(c7);
        int i11 = i9 - translationX;
        int i12 = i10 - translationY;
        if (i11 == 0 && i12 == 0) {
            E(c7);
            return false;
        }
        if (i11 != 0) {
            view.setTranslationX(-i11);
        }
        if (i12 != 0) {
            view.setTranslationY(-i12);
        }
        this.f8744j.add(new j(c7, translationX, translationY, i9, i10));
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean z(RecyclerView.C c7) {
        Z(c7);
        this.f8742h.add(c7);
        return true;
    }
}
