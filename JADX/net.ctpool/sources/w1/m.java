package w1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f22641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f22642b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22643c = 0;

    public m(D d7) {
        this.f22641a = d7;
    }

    private int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return this.f22641a.a(obj);
    }

    public synchronized Object a(Object obj) {
        return this.f22642b.get(obj);
    }

    public synchronized int b() {
        return this.f22642b.size();
    }

    public synchronized Object c() {
        return this.f22642b.isEmpty() ? null : this.f22642b.keySet().iterator().next();
    }

    public synchronized ArrayList d(O0.m mVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList(this.f22642b.entrySet().size());
            for (Map.Entry entry : this.f22642b.entrySet()) {
                if (mVar == null || mVar.apply(entry.getKey())) {
                    arrayList.add(entry);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized int e() {
        return this.f22643c;
    }

    public synchronized Object g(Object obj, Object obj2) {
        Object objRemove;
        objRemove = this.f22642b.remove(obj);
        this.f22643c -= f(objRemove);
        this.f22642b.put(obj, obj2);
        this.f22643c += f(obj2);
        return objRemove;
    }

    public synchronized Object h(Object obj) {
        Object objRemove;
        objRemove = this.f22642b.remove(obj);
        this.f22643c -= f(objRemove);
        return objRemove;
    }

    public synchronized ArrayList i(O0.m mVar) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f22642b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (mVar == null || mVar.apply(entry.getKey())) {
                    arrayList.add(entry.getValue());
                    this.f22643c -= f(entry.getValue());
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized void j() {
        if (this.f22642b.isEmpty()) {
            this.f22643c = 0;
        }
    }
}
