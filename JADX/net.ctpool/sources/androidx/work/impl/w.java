package androidx.work.impl;

import j5.AbstractC1809n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9511a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9512b = new LinkedHashMap();

    public final boolean a(q0.m mVar) {
        boolean zContainsKey;
        w5.k.f(mVar, "id");
        synchronized (this.f9511a) {
            zContainsKey = this.f9512b.containsKey(mVar);
        }
        return zContainsKey;
    }

    public final v b(q0.m mVar) {
        v vVar;
        w5.k.f(mVar, "id");
        synchronized (this.f9511a) {
            vVar = (v) this.f9512b.remove(mVar);
        }
        return vVar;
    }

    public final List c(String str) {
        List listB0;
        w5.k.f(str, "workSpecId");
        synchronized (this.f9511a) {
            try {
                Map map = this.f9512b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (w5.k.b(((q0.m) entry.getKey()).b(), str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    this.f9512b.remove((q0.m) it.next());
                }
                listB0 = AbstractC1809n.b0(linkedHashMap.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listB0;
    }

    public final v d(q0.m mVar) {
        v vVar;
        w5.k.f(mVar, "id");
        synchronized (this.f9511a) {
            try {
                Map map = this.f9512b;
                Object vVar2 = map.get(mVar);
                if (vVar2 == null) {
                    vVar2 = new v(mVar);
                    map.put(mVar, vVar2);
                }
                vVar = (v) vVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public final v e(q0.u uVar) {
        w5.k.f(uVar, "spec");
        return d(q0.x.a(uVar));
    }
}
