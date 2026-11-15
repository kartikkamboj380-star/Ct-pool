package l6;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final d f21125s = new d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Map f21126t = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f21131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f21132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l6.b f21133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l6.a f21134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p f21135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ExecutorService f21136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f21137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f21138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f21139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f21140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f21141o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f21142p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f21143q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final g f21144r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadLocal f21130d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f21127a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f21128b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f21129c = new ConcurrentHashMap();

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0301c initialValue() {
            return new C0301c();
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21146a;

        static {
            int[] iArr = new int[ThreadMode.values().length];
            f21146a = iArr;
            try {
                iArr[ThreadMode.POSTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21146a[ThreadMode.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21146a[ThreadMode.MAIN_ORDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21146a[ThreadMode.BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21146a[ThreadMode.ASYNC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: l6.c$c, reason: collision with other inner class name */
    static final class C0301c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List f21147a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f21148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f21149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        q f21150d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f21151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f21152f;

        C0301c() {
        }
    }

    c(d dVar) {
        this.f21144r = dVar.b();
        h hVarC = dVar.c();
        this.f21131e = hVarC;
        this.f21132f = hVarC != null ? hVarC.a(this) : null;
        this.f21133g = new l6.b(this);
        this.f21134h = new l6.a(this);
        List list = dVar.f21163j;
        this.f21143q = list != null ? list.size() : 0;
        this.f21135i = new p(dVar.f21163j, dVar.f21161h, dVar.f21160g);
        this.f21138l = dVar.f21154a;
        this.f21139m = dVar.f21155b;
        this.f21140n = dVar.f21156c;
        this.f21141o = dVar.f21157d;
        this.f21137k = dVar.f21158e;
        this.f21142p = dVar.f21159f;
        this.f21136j = dVar.f21162i;
    }

    static void a(List list, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static d b() {
        return new d();
    }

    private void c(q qVar, Object obj) {
        if (obj != null) {
            o(qVar, obj, i());
        }
    }

    private void f(q qVar, Object obj, Throwable th) {
        if (!(obj instanceof n)) {
            if (this.f21137k) {
                throw new e("Invoking subscriber failed", th);
            }
            if (this.f21138l) {
                this.f21144r.b(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + qVar.f21200a.getClass(), th);
            }
            if (this.f21140n) {
                k(new n(this, th, obj, qVar.f21200a));
                return;
            }
            return;
        }
        if (this.f21138l) {
            g gVar = this.f21144r;
            Level level = Level.SEVERE;
            gVar.b(level, "SubscriberExceptionEvent subscriber " + qVar.f21200a.getClass() + " threw an exception", th);
            n nVar = (n) obj;
            this.f21144r.b(level, "Initial event " + nVar.f21180c + " caused exception in " + nVar.f21181d, nVar.f21179b);
        }
    }

    private boolean i() {
        h hVar = this.f21131e;
        return hVar == null || hVar.b();
    }

    private static List j(Class cls) {
        List arrayList;
        Map map = f21126t;
        synchronized (map) {
            try {
                arrayList = (List) map.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
                        arrayList.add(superclass);
                        a(arrayList, superclass.getInterfaces());
                    }
                    f21126t.put(cls, arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    private void l(Object obj, C0301c c0301c) {
        boolean zM;
        Class<?> cls = obj.getClass();
        if (this.f21142p) {
            List listJ = j(cls);
            int size = listJ.size();
            zM = false;
            for (int i7 = 0; i7 < size; i7++) {
                zM |= m(obj, c0301c, (Class) listJ.get(i7));
            }
        } else {
            zM = m(obj, c0301c, cls);
        }
        if (zM) {
            return;
        }
        if (this.f21139m) {
            this.f21144r.a(Level.FINE, "No subscribers registered for event " + cls);
        }
        if (!this.f21141o || cls == i.class || cls == n.class) {
            return;
        }
        k(new i(this, obj));
    }

    private boolean m(Object obj, C0301c c0301c, Class cls) {
        CopyOnWriteArrayList<q> copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f21127a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (q qVar : copyOnWriteArrayList) {
            c0301c.f21151e = obj;
            c0301c.f21150d = qVar;
            try {
                o(qVar, obj, c0301c.f21149c);
                if (c0301c.f21152f) {
                    return true;
                }
            } finally {
                c0301c.f21151e = null;
                c0301c.f21150d = null;
                c0301c.f21152f = false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r5 != null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void o(q qVar, Object obj, boolean z6) {
        l lVar;
        int i7 = b.f21146a[qVar.f21201b.f21183b.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    lVar = this.f21132f;
                } else {
                    if (i7 != 4) {
                        if (i7 == 5) {
                            this.f21134h.a(qVar, obj);
                            return;
                        }
                        throw new IllegalStateException("Unknown thread mode: " + qVar.f21201b.f21183b);
                    }
                    if (z6) {
                        this.f21133g.a(qVar, obj);
                        return;
                    }
                }
            } else if (!z6) {
                lVar = this.f21132f;
                lVar.a(qVar, obj);
                return;
            }
        }
        h(qVar, obj);
    }

    private void r(Object obj, o oVar) {
        Class cls = oVar.f21184c;
        q qVar = new q(obj, oVar);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f21127a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f21127a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(qVar)) {
            throw new e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i7 = 0; i7 <= size; i7++) {
            if (i7 == size || oVar.f21185d > ((q) copyOnWriteArrayList.get(i7)).f21201b.f21185d) {
                copyOnWriteArrayList.add(i7, qVar);
                break;
            }
        }
        List arrayList = (List) this.f21128b.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f21128b.put(obj, arrayList);
        }
        arrayList.add(cls);
        if (oVar.f21186e) {
            if (!this.f21142p) {
                c(qVar, this.f21129c.get(cls));
                return;
            }
            for (Map.Entry entry : this.f21129c.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey())) {
                    c(qVar, entry.getValue());
                }
            }
        }
    }

    ExecutorService d() {
        return this.f21136j;
    }

    public g e() {
        return this.f21144r;
    }

    void g(j jVar) {
        Object obj = jVar.f21173a;
        q qVar = jVar.f21174b;
        j.b(jVar);
        if (qVar.f21202c) {
            h(qVar, obj);
        }
    }

    void h(q qVar, Object obj) {
        try {
            qVar.f21201b.f21182a.invoke(qVar.f21200a, obj);
        } catch (IllegalAccessException e7) {
            throw new IllegalStateException("Unexpected exception", e7);
        } catch (InvocationTargetException e8) {
            f(qVar, obj, e8.getCause());
        }
    }

    public void k(Object obj) {
        C0301c c0301c = (C0301c) this.f21130d.get();
        List list = c0301c.f21147a;
        list.add(obj);
        if (c0301c.f21148b) {
            return;
        }
        c0301c.f21149c = i();
        c0301c.f21148b = true;
        if (c0301c.f21152f) {
            throw new e("Internal error. Abort state was not reset");
        }
        while (true) {
            try {
                if (list.isEmpty()) {
                    return;
                } else {
                    l(list.remove(0), c0301c);
                }
            } finally {
                c0301c.f21148b = false;
                c0301c.f21149c = false;
            }
        }
    }

    public void n(Object obj) {
        synchronized (this.f21129c) {
            this.f21129c.put(obj.getClass(), obj);
        }
        k(obj);
    }

    public void p(Object obj) {
        if (m6.b.c() && !m6.b.a()) {
            throw new RuntimeException("It looks like you are using EventBus on Android, make sure to add the \"eventbus\" Android library to your dependencies.");
        }
        List listA = this.f21135i.a(obj.getClass());
        synchronized (this) {
            try {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    r(obj, (o) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object q(Class cls) {
        Object objCast;
        synchronized (this.f21129c) {
            objCast = cls.cast(this.f21129c.remove(cls));
        }
        return objCast;
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f21143q + ", eventInheritance=" + this.f21142p + "]";
    }
}
