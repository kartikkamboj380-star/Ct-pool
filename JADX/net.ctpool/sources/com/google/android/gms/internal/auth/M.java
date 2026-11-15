package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile K f13819g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f13823k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final I f13824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f13825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f13826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f13827d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f13828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f13818f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicReference f13820h = new AtomicReference();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final O f13821i = new O(D.f13791a);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f13822j = new AtomicInteger();

    /* synthetic */ M(I i7, String str, Object obj, boolean z6, L l7) {
        if (i7.f13802a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f13824a = i7;
        this.f13825b = str;
        this.f13826c = obj;
    }

    public static void c() {
        f13822j.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(final Context context) {
        if (f13819g != null || context == null) {
            return;
        }
        Object obj = f13818f;
        synchronized (obj) {
            try {
                if (f13819g == null) {
                    synchronized (obj) {
                        K k7 = f13819g;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (k7 == null || k7.a() != context) {
                            C0996q.d();
                            N.c();
                            C1016x.e();
                            f13819g = new C0987n(context, Z.a(new U() { // from class: com.google.android.gms.internal.auth.C
                                @Override // com.google.android.gms.internal.auth.U
                                public final Object a() {
                                    Context context2 = context;
                                    int i7 = M.f13823k;
                                    return AbstractC1019y.a(context2);
                                }
                            }));
                            f13822j.incrementAndGet();
                        }
                    }
                }
            } finally {
            }
        }
    }

    abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[PHI: r2
      0x003e: PHI (r2v1 com.google.android.gms.internal.auth.S) = (r2v0 com.google.android.gms.internal.auth.S), (r2v5 com.google.android.gms.internal.auth.S) binds: [B:8:0x0016, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b() {
        String strA;
        C0996q c0996qB;
        Object objA;
        Object objA2;
        int i7 = f13822j.get();
        if (this.f13827d < i7) {
            synchronized (this) {
                try {
                    if (this.f13827d < i7) {
                        K k7 = f13819g;
                        S sC = S.c();
                        Object objA3 = null;
                        if (k7 != null) {
                            sC = (S) k7.b().a();
                            if (sC.b()) {
                                r rVar = (r) sC.a();
                                I i8 = this.f13824a;
                                strA = rVar.a(i8.f13802a, null, i8.f13804c, this.f13825b);
                            } else {
                                strA = null;
                            }
                            if (k7 == null) {
                                throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                            }
                            Uri uri = this.f13824a.f13802a;
                            if (uri != null) {
                                if (AbstractC1022z.a(k7.a(), uri)) {
                                    c0996qB = C0996q.b(k7.a().getContentResolver(), this.f13824a.f13802a, new Runnable() { // from class: com.google.android.gms.internal.auth.B
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            M.c();
                                        }
                                    });
                                }
                                objA = (c0996qB != null || (objA2 = c0996qB.a(this.f13825b)) == null) ? null : a(objA2);
                                if (objA == null) {
                                    if (!this.f13824a.f13805d) {
                                        String strC = C1016x.b(k7.a()).a(this.f13824a.f13805d ? null : this.f13825b);
                                        if (strC != null) {
                                            objA3 = a(strC);
                                        }
                                    }
                                    objA = objA3 == null ? this.f13826c : objA3;
                                }
                                if (sC.b()) {
                                    objA = strA == null ? this.f13826c : a(strA);
                                }
                                this.f13828e = objA;
                                this.f13827d = i7;
                            } else {
                                N.b(k7.a(), null, new Runnable() { // from class: com.google.android.gms.internal.auth.B
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        M.c();
                                    }
                                });
                            }
                            c0996qB = null;
                            if (c0996qB != null) {
                                if (objA == null) {
                                }
                                if (sC.b()) {
                                }
                                this.f13828e = objA;
                                this.f13827d = i7;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        return this.f13828e;
    }
}
