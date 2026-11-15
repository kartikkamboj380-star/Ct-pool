package b4;

import android.util.Log;
import b4.C0699n;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import v4.InterfaceC2170a;

/* JADX INFO: renamed from: b4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0699n implements InterfaceC0689d, InterfaceC2170a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final D4.b f9695i = new D4.b() { // from class: b4.j
        @Override // D4.b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f9696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f9698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f9699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set f9700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f9701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f9702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC0694i f9703h;

    private C0699n(Executor executor, Iterable iterable, Collection collection, InterfaceC0694i interfaceC0694i) {
        this.f9696a = new HashMap();
        this.f9697b = new HashMap();
        this.f9698c = new HashMap();
        this.f9700e = new HashSet();
        this.f9702g = new AtomicReference();
        u uVar = new u(executor);
        this.f9701f = uVar;
        this.f9703h = interfaceC0694i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0688c.s(uVar, u.class, A4.d.class, A4.c.class));
        arrayList.add(C0688c.s(this, InterfaceC2170a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C0688c c0688c = (C0688c) it.next();
            if (c0688c != null) {
                arrayList.add(c0688c);
            }
        }
        this.f9699d = q(iterable);
        n(arrayList);
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f9699d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((D4.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f9703h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e7) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e7);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C0688c) it2.next()).j().toArray();
                int length = array.length;
                int i7 = 0;
                while (true) {
                    if (i7 < length) {
                        Object obj = array[i7];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f9700e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f9700e.add(obj.toString());
                        }
                        i7++;
                    }
                }
            }
            if (this.f9696a.isEmpty()) {
                AbstractC0701p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f9696a.keySet());
                arrayList2.addAll(list);
                AbstractC0701p.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C0688c c0688c = (C0688c) it3.next();
                this.f9696a.put(c0688c, new w(new D4.b() { // from class: b4.k
                    @Override // D4.b
                    public final Object get() {
                        return this.f9689a.r(c0688c);
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        u();
    }

    private void o(Map map, boolean z6) {
        for (Map.Entry entry : map.entrySet()) {
            C0688c c0688c = (C0688c) entry.getKey();
            D4.b bVar = (D4.b) entry.getValue();
            if (c0688c.n() || (c0688c.o() && z6)) {
                bVar.get();
            }
        }
        this.f9701f.f();
    }

    private static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(C0688c c0688c) {
        return c0688c.h().a(new C0685F(c0688c, this));
    }

    private void u() {
        Boolean bool = (Boolean) this.f9702g.get();
        if (bool != null) {
            o(this.f9696a, bool.booleanValue());
        }
    }

    private void v() {
        Map map;
        C0684E c0684eC;
        Object objE;
        for (C0688c c0688c : this.f9696a.keySet()) {
            for (C0702q c0702q : c0688c.g()) {
                if (c0702q.g() && !this.f9698c.containsKey(c0702q.c())) {
                    map = this.f9698c;
                    c0684eC = c0702q.c();
                    objE = x.b(Collections.emptySet());
                } else if (this.f9697b.containsKey(c0702q.c())) {
                    continue;
                } else {
                    if (c0702q.f()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", c0688c, c0702q.c()));
                    }
                    if (!c0702q.g()) {
                        map = this.f9697b;
                        c0684eC = c0702q.c();
                        objE = C0682C.e();
                    }
                }
                map.put(c0684eC, objE);
            }
        }
    }

    private List w(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0688c c0688c = (C0688c) it.next();
            if (c0688c.p()) {
                final D4.b bVar = (D4.b) this.f9696a.get(c0688c);
                for (C0684E c0684e : c0688c.j()) {
                    if (this.f9697b.containsKey(c0684e)) {
                        final C0682C c0682c = (C0682C) ((D4.b) this.f9697b.get(c0684e));
                        arrayList.add(new Runnable() { // from class: b4.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                c0682c.j(bVar);
                            }
                        });
                    } else {
                        this.f9697b.put(c0684e, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List x() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f9696a.entrySet()) {
            C0688c c0688c = (C0688c) entry.getKey();
            if (!c0688c.p()) {
                D4.b bVar = (D4.b) entry.getValue();
                for (C0684E c0684e : c0688c.j()) {
                    if (!map.containsKey(c0684e)) {
                        map.put(c0684e, new HashSet());
                    }
                    ((Set) map.get(c0684e)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f9698c.containsKey(entry2.getKey())) {
                final x xVar = (x) this.f9698c.get(entry2.getKey());
                for (final D4.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: b4.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            xVar.a(bVar2);
                        }
                    });
                }
            } else {
                this.f9698c.put((C0684E) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // b4.InterfaceC0689d
    public synchronized D4.b c(C0684E c0684e) {
        x xVar = (x) this.f9698c.get(c0684e);
        if (xVar != null) {
            return xVar;
        }
        return f9695i;
    }

    @Override // b4.InterfaceC0689d
    public synchronized D4.b f(C0684E c0684e) {
        AbstractC0683D.c(c0684e, "Null interface requested.");
        return (D4.b) this.f9697b.get(c0684e);
    }

    @Override // b4.InterfaceC0689d
    public D4.a h(C0684E c0684e) {
        D4.b bVarF = f(c0684e);
        return bVarF == null ? C0682C.e() : bVarF instanceof C0682C ? (C0682C) bVarF : C0682C.i(bVarF);
    }

    public void p(boolean z6) {
        HashMap map;
        if (com.facebook.jni.a.a(this.f9702g, null, Boolean.valueOf(z6))) {
            synchronized (this) {
                map = new HashMap(this.f9696a);
            }
            o(map, z6);
        }
    }

    /* JADX INFO: renamed from: b4.n$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f9704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f9705b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f9706c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private InterfaceC0694i f9707d = InterfaceC0694i.f9688a;

        b(Executor executor) {
            this.f9704a = executor;
        }

        public b b(C0688c c0688c) {
            this.f9706c.add(c0688c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f9705b.add(new D4.b() { // from class: b4.o
                @Override // D4.b
                public final Object get() {
                    return C0699n.b.f(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f9705b.addAll(collection);
            return this;
        }

        public C0699n e() {
            return new C0699n(this.f9704a, this.f9705b, this.f9706c, this.f9707d);
        }

        public b g(InterfaceC0694i interfaceC0694i) {
            this.f9707d = interfaceC0694i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
