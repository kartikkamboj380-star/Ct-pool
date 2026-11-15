package n;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: n.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1890a extends g implements Map {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    f f21272t;

    /* JADX INFO: renamed from: n.a$a, reason: collision with other inner class name */
    class C0304a extends f {
        C0304a() {
        }

        @Override // n.f
        protected void a() {
            C1890a.this.clear();
        }

        @Override // n.f
        protected Object b(int i7, int i8) {
            return C1890a.this.f21321n[(i7 << 1) + i8];
        }

        @Override // n.f
        protected Map c() {
            return C1890a.this;
        }

        @Override // n.f
        protected int d() {
            return C1890a.this.f21322o;
        }

        @Override // n.f
        protected int e(Object obj) {
            return C1890a.this.g(obj);
        }

        @Override // n.f
        protected int f(Object obj) {
            return C1890a.this.i(obj);
        }

        @Override // n.f
        protected void g(Object obj, Object obj2) {
            C1890a.this.put(obj, obj2);
        }

        @Override // n.f
        protected void h(int i7) {
            C1890a.this.l(i7);
        }

        @Override // n.f
        protected Object i(int i7, Object obj) {
            return C1890a.this.m(i7, obj);
        }
    }

    public C1890a() {
    }

    private f o() {
        if (this.f21272t == null) {
            this.f21272t = new C0304a();
        }
        return this.f21272t;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return o().l();
    }

    @Override // java.util.Map
    public Set keySet() {
        return o().m();
    }

    public boolean p(Collection collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        d(this.f21322o + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        return o().n();
    }

    public C1890a(int i7) {
        super(i7);
    }

    public C1890a(g gVar) {
        super(gVar);
    }
}
