package g0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import g0.AbstractC1681l;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: g0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1685p extends AbstractC1681l {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    int f19450X;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private ArrayList f19448V = new ArrayList();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f19449W = true;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    boolean f19451Y = false;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f19452Z = 0;

    /* JADX INFO: renamed from: g0.p$a */
    class a extends AbstractC1682m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1681l f19453a;

        a(AbstractC1681l abstractC1681l) {
            this.f19453a = abstractC1681l;
        }

        @Override // g0.AbstractC1681l.f
        public void d(AbstractC1681l abstractC1681l) {
            this.f19453a.W();
            abstractC1681l.S(this);
        }
    }

    /* JADX INFO: renamed from: g0.p$b */
    static class b extends AbstractC1682m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        C1685p f19455a;

        b(C1685p c1685p) {
            this.f19455a = c1685p;
        }

        @Override // g0.AbstractC1682m, g0.AbstractC1681l.f
        public void a(AbstractC1681l abstractC1681l) {
            C1685p c1685p = this.f19455a;
            if (c1685p.f19451Y) {
                return;
            }
            c1685p.e0();
            this.f19455a.f19451Y = true;
        }

        @Override // g0.AbstractC1681l.f
        public void d(AbstractC1681l abstractC1681l) {
            C1685p c1685p = this.f19455a;
            int i7 = c1685p.f19450X - 1;
            c1685p.f19450X = i7;
            if (i7 == 0) {
                c1685p.f19451Y = false;
                c1685p.r();
            }
            abstractC1681l.S(this);
        }
    }

    private void j0(AbstractC1681l abstractC1681l) {
        this.f19448V.add(abstractC1681l);
        abstractC1681l.f19404D = this;
    }

    private void t0() {
        b bVar = new b(this);
        Iterator it = this.f19448V.iterator();
        while (it.hasNext()) {
            ((AbstractC1681l) it.next()).a(bVar);
        }
        this.f19450X = this.f19448V.size();
    }

    @Override // g0.AbstractC1681l
    public void Q(View view) {
        super.Q(view);
        int size = this.f19448V.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC1681l) this.f19448V.get(i7)).Q(view);
        }
    }

    @Override // g0.AbstractC1681l
    public void U(View view) {
        super.U(view);
        int size = this.f19448V.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC1681l) this.f19448V.get(i7)).U(view);
        }
    }

    @Override // g0.AbstractC1681l
    protected void W() {
        if (this.f19448V.isEmpty()) {
            e0();
            r();
            return;
        }
        t0();
        if (this.f19449W) {
            Iterator it = this.f19448V.iterator();
            while (it.hasNext()) {
                ((AbstractC1681l) it.next()).W();
            }
            return;
        }
        for (int i7 = 1; i7 < this.f19448V.size(); i7++) {
            ((AbstractC1681l) this.f19448V.get(i7 - 1)).a(new a((AbstractC1681l) this.f19448V.get(i7)));
        }
        AbstractC1681l abstractC1681l = (AbstractC1681l) this.f19448V.get(0);
        if (abstractC1681l != null) {
            abstractC1681l.W();
        }
    }

    @Override // g0.AbstractC1681l
    public void Y(AbstractC1681l.e eVar) {
        super.Y(eVar);
        this.f19452Z |= 8;
        int size = this.f19448V.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC1681l) this.f19448V.get(i7)).Y(eVar);
        }
    }

    @Override // g0.AbstractC1681l
    public void b0(AbstractC1676g abstractC1676g) {
        super.b0(abstractC1676g);
        this.f19452Z |= 4;
        if (this.f19448V != null) {
            for (int i7 = 0; i7 < this.f19448V.size(); i7++) {
                ((AbstractC1681l) this.f19448V.get(i7)).b0(abstractC1676g);
            }
        }
    }

    @Override // g0.AbstractC1681l
    public void c0(AbstractC1684o abstractC1684o) {
        super.c0(abstractC1684o);
        this.f19452Z |= 2;
        int size = this.f19448V.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC1681l) this.f19448V.get(i7)).c0(abstractC1684o);
        }
    }

    @Override // g0.AbstractC1681l
    String f0(String str) {
        String strF0 = super.f0(str);
        for (int i7 = 0; i7 < this.f19448V.size(); i7++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strF0);
            sb.append("\n");
            sb.append(((AbstractC1681l) this.f19448V.get(i7)).f0(str + "  "));
            strF0 = sb.toString();
        }
        return strF0;
    }

    @Override // g0.AbstractC1681l
    public void g(s sVar) {
        if (J(sVar.f19460b)) {
            for (AbstractC1681l abstractC1681l : this.f19448V) {
                if (abstractC1681l.J(sVar.f19460b)) {
                    abstractC1681l.g(sVar);
                    sVar.f19461c.add(abstractC1681l);
                }
            }
        }
    }

    @Override // g0.AbstractC1681l
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public C1685p a(AbstractC1681l.f fVar) {
        return (C1685p) super.a(fVar);
    }

    @Override // g0.AbstractC1681l
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public C1685p b(View view) {
        for (int i7 = 0; i7 < this.f19448V.size(); i7++) {
            ((AbstractC1681l) this.f19448V.get(i7)).b(view);
        }
        return (C1685p) super.b(view);
    }

    @Override // g0.AbstractC1681l
    void i(s sVar) {
        super.i(sVar);
        int size = this.f19448V.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((AbstractC1681l) this.f19448V.get(i7)).i(sVar);
        }
    }

    public C1685p i0(AbstractC1681l abstractC1681l) {
        j0(abstractC1681l);
        long j7 = this.f19421o;
        if (j7 >= 0) {
            abstractC1681l.X(j7);
        }
        if ((this.f19452Z & 1) != 0) {
            abstractC1681l.Z(u());
        }
        if ((this.f19452Z & 2) != 0) {
            z();
            abstractC1681l.c0(null);
        }
        if ((this.f19452Z & 4) != 0) {
            abstractC1681l.b0(y());
        }
        if ((this.f19452Z & 8) != 0) {
            abstractC1681l.Y(t());
        }
        return this;
    }

    @Override // g0.AbstractC1681l
    public void j(s sVar) {
        if (J(sVar.f19460b)) {
            for (AbstractC1681l abstractC1681l : this.f19448V) {
                if (abstractC1681l.J(sVar.f19460b)) {
                    abstractC1681l.j(sVar);
                    sVar.f19461c.add(abstractC1681l);
                }
            }
        }
    }

    public AbstractC1681l k0(int i7) {
        if (i7 < 0 || i7 >= this.f19448V.size()) {
            return null;
        }
        return (AbstractC1681l) this.f19448V.get(i7);
    }

    public int l0() {
        return this.f19448V.size();
    }

    @Override // g0.AbstractC1681l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC1681l clone() {
        C1685p c1685p = (C1685p) super.clone();
        c1685p.f19448V = new ArrayList();
        int size = this.f19448V.size();
        for (int i7 = 0; i7 < size; i7++) {
            c1685p.j0(((AbstractC1681l) this.f19448V.get(i7)).clone());
        }
        return c1685p;
    }

    @Override // g0.AbstractC1681l
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C1685p S(AbstractC1681l.f fVar) {
        return (C1685p) super.S(fVar);
    }

    @Override // g0.AbstractC1681l
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C1685p T(View view) {
        for (int i7 = 0; i7 < this.f19448V.size(); i7++) {
            ((AbstractC1681l) this.f19448V.get(i7)).T(view);
        }
        return (C1685p) super.T(view);
    }

    @Override // g0.AbstractC1681l
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public C1685p X(long j7) {
        ArrayList arrayList;
        super.X(j7);
        if (this.f19421o >= 0 && (arrayList = this.f19448V) != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC1681l) this.f19448V.get(i7)).X(j7);
            }
        }
        return this;
    }

    @Override // g0.AbstractC1681l
    protected void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        long jB = B();
        int size = this.f19448V.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC1681l abstractC1681l = (AbstractC1681l) this.f19448V.get(i7);
            if (jB > 0 && (this.f19449W || i7 == 0)) {
                long jB2 = abstractC1681l.B();
                if (jB2 > 0) {
                    abstractC1681l.d0(jB2 + jB);
                } else {
                    abstractC1681l.d0(jB);
                }
            }
            abstractC1681l.q(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    @Override // g0.AbstractC1681l
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public C1685p Z(TimeInterpolator timeInterpolator) {
        this.f19452Z |= 1;
        ArrayList arrayList = this.f19448V;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((AbstractC1681l) this.f19448V.get(i7)).Z(timeInterpolator);
            }
        }
        return (C1685p) super.Z(timeInterpolator);
    }

    public C1685p r0(int i7) {
        if (i7 == 0) {
            this.f19449W = true;
        } else {
            if (i7 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i7);
            }
            this.f19449W = false;
        }
        return this;
    }

    @Override // g0.AbstractC1681l
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public C1685p d0(long j7) {
        return (C1685p) super.d0(j7);
    }
}
