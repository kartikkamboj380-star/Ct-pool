package n;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f21293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21300h;

    public e(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f21295c = i7;
        this.f21293a = new LinkedHashMap(0, 0.75f, true);
    }

    private int f(Object obj, Object obj2) {
        int iG = g(obj, obj2);
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }

    protected Object a(Object obj) {
        return null;
    }

    public final Object c(Object obj) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f21293a.get(obj);
                if (obj2 != null) {
                    this.f21299g++;
                    return obj2;
                }
                this.f21300h++;
                Object objA = a(obj);
                if (objA == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.f21297e++;
                        objPut = this.f21293a.put(obj, objA);
                        if (objPut != null) {
                            this.f21293a.put(obj, objPut);
                        } else {
                            this.f21294b += f(obj, objA);
                        }
                    } finally {
                    }
                }
                if (objPut != null) {
                    b(false, obj, objA, objPut);
                    return objPut;
                }
                i(this.f21295c);
                return objA;
            } finally {
            }
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f21296d++;
                this.f21294b += f(obj, obj2);
                objPut = this.f21293a.put(obj, obj2);
                if (objPut != null) {
                    this.f21294b -= f(obj, objPut);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objPut != null) {
            b(false, obj, objPut, obj2);
        }
        i(this.f21295c);
        return objPut;
    }

    public final Object e(Object obj) {
        Object objRemove;
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                objRemove = this.f21293a.remove(obj);
                if (objRemove != null) {
                    this.f21294b -= f(obj, objRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objRemove != null) {
            b(false, obj, objRemove, null);
        }
        return objRemove;
    }

    protected int g(Object obj, Object obj2) {
        return 1;
    }

    public final synchronized Map h() {
        return new LinkedHashMap(this.f21293a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(int i7) {
        Object key;
        Object value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f21294b < 0 || (this.f21293a.isEmpty() && this.f21294b != 0)) {
                        break;
                    }
                    if (this.f21294b <= i7 || this.f21293a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f21293a.entrySet().iterator().next();
                    key = entry.getKey();
                    value = entry.getValue();
                    this.f21293a.remove(key);
                    this.f21294b -= f(key, value);
                    this.f21298f++;
                } finally {
                }
            }
            b(true, key, value, null);
        }
    }

    public final synchronized String toString() {
        int i7;
        int i8;
        try {
            i7 = this.f21299g;
            i8 = this.f21300h + i7;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f21295c), Integer.valueOf(this.f21299g), Integer.valueOf(this.f21300h), Integer.valueOf(i8 != 0 ? (i7 * 100) / i8 : 0));
    }

    protected void b(boolean z6, Object obj, Object obj2, Object obj3) {
    }
}
