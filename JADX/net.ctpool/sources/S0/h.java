package S0;

import O0.l;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f2918d = new IdentityHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f2919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2920b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f2921c;

    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }

    public h(Object obj, g gVar, boolean z6) {
        this.f2919a = l.g(obj);
        this.f2921c = gVar;
        if (z6) {
            a(obj);
        }
    }

    private static void a(Object obj) {
        Map map = f2918d;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                map.put(obj, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized int c() {
        int i7;
        e();
        l.b(Boolean.valueOf(this.f2920b > 0));
        i7 = this.f2920b - 1;
        this.f2920b = i7;
        return i7;
    }

    private void e() {
        if (!h(this)) {
            throw new a();
        }
    }

    public static boolean h(h hVar) {
        return hVar != null && hVar.g();
    }

    private static void i(Object obj) {
        Map map = f2918d;
        synchronized (map) {
            try {
                Integer num = (Integer) map.get(obj);
                if (num == null) {
                    P0.a.M("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(obj);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void b() {
        e();
        this.f2920b++;
    }

    public void d() {
        Object obj;
        if (c() == 0) {
            synchronized (this) {
                obj = this.f2919a;
                this.f2919a = null;
            }
            if (obj != null) {
                g gVar = this.f2921c;
                if (gVar != null) {
                    gVar.a(obj);
                }
                i(obj);
            }
        }
    }

    public synchronized Object f() {
        return this.f2919a;
    }

    public synchronized boolean g() {
        return this.f2920b > 0;
    }
}
