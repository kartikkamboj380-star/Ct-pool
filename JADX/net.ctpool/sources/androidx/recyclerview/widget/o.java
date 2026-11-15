package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends RecyclerView.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RecyclerView f8872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Scroller f8873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RecyclerView.s f8874c = new a();

    class a extends RecyclerView.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f8875a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(RecyclerView recyclerView, int i7) {
            super.a(recyclerView, i7);
            if (i7 == 0 && this.f8875a) {
                this.f8875a = false;
                o.this.k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i7, int i8) {
            if (i7 == 0 && i8 == 0) {
                return;
            }
            this.f8875a = true;
        }
    }

    private void f() {
        this.f8872a.X0(this.f8874c);
        this.f8872a.setOnFlingListener(null);
    }

    private void i() {
        if (this.f8872a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f8872a.k(this.f8874c);
        this.f8872a.setOnFlingListener(this);
    }

    private boolean j(RecyclerView.o oVar, int i7, int i8) {
        RecyclerView.y yVarD;
        int iH;
        if (!(oVar instanceof RecyclerView.y.b) || (yVarD = d(oVar)) == null || (iH = h(oVar, i7, i8)) == -1) {
            return false;
        }
        yVarD.p(iH);
        oVar.J1(yVarD);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean a(int i7, int i8) {
        RecyclerView.o layoutManager = this.f8872a.getLayoutManager();
        if (layoutManager == null || this.f8872a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f8872a.getMinFlingVelocity();
        return (Math.abs(i8) > minFlingVelocity || Math.abs(i7) > minFlingVelocity) && j(layoutManager, i7, i8);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f8872a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.f8872a = recyclerView;
        if (recyclerView != null) {
            i();
            this.f8873b = new Scroller(this.f8872a.getContext(), new DecelerateInterpolator());
            k();
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    protected RecyclerView.y d(RecyclerView.o oVar) {
        return e(oVar);
    }

    protected abstract g e(RecyclerView.o oVar);

    public abstract View g(RecyclerView.o oVar);

    public abstract int h(RecyclerView.o oVar, int i7, int i8);

    void k() {
        RecyclerView.o layoutManager;
        View viewG;
        RecyclerView recyclerView = this.f8872a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewG = g(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewG);
        int i7 = iArrC[0];
        if (i7 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f8872a.k1(i7, iArrC[1]);
    }
}
