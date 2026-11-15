package s;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    m f22167d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f22169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22170g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f22164a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22165b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f22166c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f22168e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f22171h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f22172i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22173j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List f22174k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List f22175l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(m mVar) {
        this.f22167d = mVar;
    }

    @Override // s.d
    public void a(d dVar) {
        Iterator it = this.f22175l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f22173j) {
                return;
            }
        }
        this.f22166c = true;
        d dVar2 = this.f22164a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f22165b) {
            this.f22167d.a(this);
            return;
        }
        f fVar = null;
        int i7 = 0;
        for (f fVar2 : this.f22175l) {
            if (!(fVar2 instanceof g)) {
                i7++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i7 == 1 && fVar.f22173j) {
            g gVar = this.f22172i;
            if (gVar != null) {
                if (!gVar.f22173j) {
                    return;
                } else {
                    this.f22169f = this.f22171h * gVar.f22170g;
                }
            }
            d(fVar.f22170g + this.f22169f);
        }
        d dVar3 = this.f22164a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f22174k.add(dVar);
        if (this.f22173j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f22175l.clear();
        this.f22174k.clear();
        this.f22173j = false;
        this.f22170g = 0;
        this.f22166c = false;
        this.f22165b = false;
    }

    public void d(int i7) {
        if (this.f22173j) {
            return;
        }
        this.f22173j = true;
        this.f22170g = i7;
        for (d dVar : this.f22174k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22167d.f22200b.p());
        sb.append(":");
        sb.append(this.f22168e);
        sb.append("(");
        sb.append(this.f22173j ? Integer.valueOf(this.f22170g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f22175l.size());
        sb.append(":d=");
        sb.append(this.f22174k.size());
        sb.append(">");
        return sb.toString();
    }
}
