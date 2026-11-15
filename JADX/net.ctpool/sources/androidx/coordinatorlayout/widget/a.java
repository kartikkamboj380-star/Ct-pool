package androidx.coordinatorlayout.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.core.util.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import n.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f6866a = new Pools$SimplePool(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f6867b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f6868c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f6869d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f6867b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                e(arrayList2.get(i7), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f6866a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void l(ArrayList arrayList) {
        arrayList.clear();
        this.f6866a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f6867b.containsKey(obj) || !this.f6867b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListF = (ArrayList) this.f6867b.get(obj);
        if (arrayListF == null) {
            arrayListF = f();
            this.f6867b.put(obj, arrayListF);
        }
        arrayListF.add(obj2);
    }

    public void b(Object obj) {
        if (this.f6867b.containsKey(obj)) {
            return;
        }
        this.f6867b.put(obj, null);
    }

    public void c() {
        int size = this.f6867b.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList = (ArrayList) this.f6867b.n(i7);
            if (arrayList != null) {
                l(arrayList);
            }
        }
        this.f6867b.clear();
    }

    public boolean d(Object obj) {
        return this.f6867b.containsKey(obj);
    }

    public List g(Object obj) {
        ArrayList arrayListH = h(obj);
        if (arrayListH == null) {
            return null;
        }
        return new ArrayList(arrayListH);
    }

    ArrayList h(Object obj) {
        return (ArrayList) this.f6867b.get(obj);
    }

    public List i(Object obj) {
        int size = this.f6867b.size();
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList2 = (ArrayList) this.f6867b.n(i7);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f6867b.j(i7));
            }
        }
        return arrayList;
    }

    public ArrayList j() {
        this.f6868c.clear();
        this.f6869d.clear();
        int size = this.f6867b.size();
        for (int i7 = 0; i7 < size; i7++) {
            e(this.f6867b.j(i7), this.f6868c, this.f6869d);
        }
        return this.f6868c;
    }

    public boolean k(Object obj) {
        int size = this.f6867b.size();
        for (int i7 = 0; i7 < size; i7++) {
            ArrayList arrayList = (ArrayList) this.f6867b.n(i7);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
