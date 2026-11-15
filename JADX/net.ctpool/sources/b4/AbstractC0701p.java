package b4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: b4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0701p {

    /* JADX INFO: renamed from: b4.p$b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0688c f9709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f9710b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f9711c = new HashSet();

        b(C0688c c0688c) {
            this.f9709a = c0688c;
        }

        void a(b bVar) {
            this.f9710b.add(bVar);
        }

        void b(b bVar) {
            this.f9711c.add(bVar);
        }

        C0688c c() {
            return this.f9709a;
        }

        Set d() {
            return this.f9710b;
        }

        boolean e() {
            return this.f9710b.isEmpty();
        }

        boolean f() {
            return this.f9711c.isEmpty();
        }

        void g(b bVar) {
            this.f9711c.remove(bVar);
        }
    }

    /* JADX INFO: renamed from: b4.p$c */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0684E f9712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f9713b;

        private c(C0684E c0684e, boolean z6) {
            this.f9712a = c0684e;
            this.f9713b = z6;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f9712a.equals(this.f9712a) && cVar.f9713b == this.f9713b;
        }

        public int hashCode() {
            return ((this.f9712a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f9713b).hashCode();
        }
    }

    static void a(List list) {
        Set<b> setC = c(list);
        Set setB = b(setC);
        int i7 = 0;
        while (!setB.isEmpty()) {
            b bVar = (b) setB.iterator().next();
            setB.remove(bVar);
            i7++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    setB.add(bVar2);
                }
            }
        }
        if (i7 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setC) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new C0703r(arrayList);
    }

    private static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (C0702q c0702q : bVar.c().g()) {
                            if (c0702q.e() && (set = (Set) map.get(new c(c0702q.c(), c0702q.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C0688c c0688c = (C0688c) it.next();
            b bVar3 = new b(c0688c);
            for (C0684E c0684e : c0688c.j()) {
                c cVar = new c(c0684e, !c0688c.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f9713b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", c0684e));
                }
                set2.add(bVar3);
            }
        }
    }
}
