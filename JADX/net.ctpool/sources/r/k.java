package r;

import java.util.ArrayList;
import q.C1981c;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList f22051w0 = new ArrayList();

    public abstract void G0();

    public void H0(e eVar) {
        this.f22051w0.remove(eVar);
        eVar.s0(null);
    }

    public void I0() {
        this.f22051w0.clear();
    }

    @Override // r.e
    public void W() {
        this.f22051w0.clear();
        super.W();
    }

    @Override // r.e
    public void X(C1981c c1981c) {
        super.X(c1981c);
        int size = this.f22051w0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((e) this.f22051w0.get(i7)).X(c1981c);
        }
    }

    public void c(e eVar) {
        this.f22051w0.add(eVar);
        if (eVar.E() != null) {
            ((k) eVar.E()).H0(eVar);
        }
        eVar.s0(this);
    }
}
