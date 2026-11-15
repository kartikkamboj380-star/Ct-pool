package k;

import java.util.HashMap;
import java.util.Map;
import k.C1813b;

/* JADX INFO: renamed from: k.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1812a extends C1813b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private HashMap f20436q = new HashMap();

    public boolean contains(Object obj) {
        return this.f20436q.containsKey(obj);
    }

    @Override // k.C1813b
    protected C1813b.c f(Object obj) {
        return (C1813b.c) this.f20436q.get(obj);
    }

    @Override // k.C1813b
    public Object m(Object obj, Object obj2) {
        C1813b.c cVarF = f(obj);
        if (cVarF != null) {
            return cVarF.f20442n;
        }
        this.f20436q.put(obj, k(obj, obj2));
        return null;
    }

    @Override // k.C1813b
    public Object n(Object obj) {
        Object objN = super.n(obj);
        this.f20436q.remove(obj);
        return objN;
    }

    public Map.Entry o(Object obj) {
        if (contains(obj)) {
            return ((C1813b.c) this.f20436q.get(obj)).f20444p;
        }
        return null;
    }
}
