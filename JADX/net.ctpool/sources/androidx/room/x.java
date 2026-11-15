package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Z.j, Z.i {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f9059u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final TreeMap f9060v = new TreeMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f9061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile String f9062n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long[] f9063o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final double[] f9064p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String[] f9065q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byte[][] f9066r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int[] f9067s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f9068t;

    public static final class a {
        private a() {
        }

        public final x a(String str, int i7) {
            w5.k.f(str, "query");
            TreeMap treeMap = x.f9060v;
            synchronized (treeMap) {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i7));
                if (entryCeilingEntry == null) {
                    i5.u uVar = i5.u.f19985a;
                    x xVar = new x(i7, null);
                    xVar.f(str, i7);
                    return xVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                x xVar2 = (x) entryCeilingEntry.getValue();
                xVar2.f(str, i7);
                w5.k.e(xVar2, "sqliteQuery");
                return xVar2;
            }
        }

        public final void b() {
            TreeMap treeMap = x.f9060v;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            w5.k.e(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i7 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i7;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private x(int i7) {
        this.f9061m = i7;
        int i8 = i7 + 1;
        this.f9067s = new int[i8];
        this.f9063o = new long[i8];
        this.f9064p = new double[i8];
        this.f9065q = new String[i8];
        this.f9066r = new byte[i8][];
    }

    public static final x d(String str, int i7) {
        return f9059u.a(str, i7);
    }

    @Override // Z.i
    public void A0(int i7) {
        this.f9067s[i7] = 1;
    }

    @Override // Z.i
    public void L(int i7, double d7) {
        this.f9067s[i7] = 3;
        this.f9064p[i7] = d7;
    }

    @Override // Z.j
    public void a(Z.i iVar) {
        w5.k.f(iVar, "statement");
        int iE = e();
        if (1 > iE) {
            return;
        }
        int i7 = 1;
        while (true) {
            int i8 = this.f9067s[i7];
            if (i8 == 1) {
                iVar.A0(i7);
            } else if (i8 == 2) {
                iVar.b0(i7, this.f9063o[i7]);
            } else if (i8 == 3) {
                iVar.L(i7, this.f9064p[i7]);
            } else if (i8 == 4) {
                String str = this.f9065q[i7];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iVar.v(i7, str);
            } else if (i8 == 5) {
                byte[] bArr = this.f9066r[i7];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                iVar.i0(i7, bArr);
            }
            if (i7 == iE) {
                return;
            } else {
                i7++;
            }
        }
    }

    @Override // Z.j
    public String b() {
        String str = this.f9062n;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // Z.i
    public void b0(int i7, long j7) {
        this.f9067s[i7] = 2;
        this.f9063o[i7] = j7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public int e() {
        return this.f9068t;
    }

    public final void f(String str, int i7) {
        w5.k.f(str, "query");
        this.f9062n = str;
        this.f9068t = i7;
    }

    @Override // Z.i
    public void i0(int i7, byte[] bArr) {
        w5.k.f(bArr, "value");
        this.f9067s[i7] = 5;
        this.f9066r[i7] = bArr;
    }

    public final void release() {
        TreeMap treeMap = f9060v;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f9061m), this);
            f9059u.b();
            i5.u uVar = i5.u.f19985a;
        }
    }

    @Override // Z.i
    public void v(int i7, String str) {
        w5.k.f(str, "value");
        this.f9067s[i7] = 4;
        this.f9065q[i7] = str;
    }

    public /* synthetic */ x(int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7);
    }
}
