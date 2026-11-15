package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.j;
import androidx.room.k;
import androidx.room.o;
import androidx.room.r;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f9005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f9006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f9007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o.c f9009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private k f9010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f9011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f9012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ServiceConnection f9013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f9014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f9015l;

    public static final class a extends o.c {
        a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.o.c
        public boolean b() {
            return true;
        }

        @Override // androidx.room.o.c
        public void c(Set set) {
            w5.k.f(set, "tables");
            if (r.this.j().get()) {
                return;
            }
            try {
                k kVarH = r.this.h();
                if (kVarH != null) {
                    int iC = r.this.c();
                    Object[] array = set.toArray(new String[0]);
                    w5.k.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    kVarH.a0(iC, (String[]) array);
                }
            } catch (RemoteException e7) {
                Log.w("ROOM", "Cannot broadcast invalidation", e7);
            }
        }
    }

    public static final class b extends j.a {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k0(r rVar, String[] strArr) {
            w5.k.f(rVar, "this$0");
            w5.k.f(strArr, "$tables");
            rVar.e().k((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Override // androidx.room.j
        public void m(final String[] strArr) {
            w5.k.f(strArr, "tables");
            Executor executorD = r.this.d();
            final r rVar = r.this;
            executorD.execute(new Runnable() { // from class: androidx.room.s
                @Override // java.lang.Runnable
                public final void run() {
                    r.b.k0(rVar, strArr);
                }
            });
        }
    }

    public static final class c implements ServiceConnection {
        c() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            w5.k.f(componentName, "name");
            w5.k.f(iBinder, "service");
            r.this.m(k.a.i0(iBinder));
            r.this.d().execute(r.this.i());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            w5.k.f(componentName, "name");
            r.this.d().execute(r.this.g());
            r.this.m(null);
        }
    }

    public r(Context context, String str, Intent intent, o oVar, Executor executor) {
        w5.k.f(context, "context");
        w5.k.f(str, "name");
        w5.k.f(intent, "serviceIntent");
        w5.k.f(oVar, "invalidationTracker");
        w5.k.f(executor, "executor");
        this.f9004a = str;
        this.f9005b = oVar;
        this.f9006c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f9007d = applicationContext;
        this.f9011h = new b();
        this.f9012i = new AtomicBoolean(false);
        c cVar = new c();
        this.f9013j = cVar;
        this.f9014k = new Runnable() { // from class: androidx.room.p
            @Override // java.lang.Runnable
            public final void run() {
                r.n(this.f9002m);
            }
        };
        this.f9015l = new Runnable() { // from class: androidx.room.q
            @Override // java.lang.Runnable
            public final void run() {
                r.k(this.f9003m);
            }
        };
        Object[] array = oVar.i().keySet().toArray(new String[0]);
        w5.k.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        l(new a((String[]) array));
        applicationContext.bindService(intent, cVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(r rVar) {
        w5.k.f(rVar, "this$0");
        rVar.f9005b.n(rVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(r rVar) {
        w5.k.f(rVar, "this$0");
        try {
            k kVar = rVar.f9010g;
            if (kVar != null) {
                rVar.f9008e = kVar.v(rVar.f9011h, rVar.f9004a);
                rVar.f9005b.c(rVar.f());
            }
        } catch (RemoteException e7) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e7);
        }
    }

    public final int c() {
        return this.f9008e;
    }

    public final Executor d() {
        return this.f9006c;
    }

    public final o e() {
        return this.f9005b;
    }

    public final o.c f() {
        o.c cVar = this.f9009f;
        if (cVar != null) {
            return cVar;
        }
        w5.k.t("observer");
        return null;
    }

    public final Runnable g() {
        return this.f9015l;
    }

    public final k h() {
        return this.f9010g;
    }

    public final Runnable i() {
        return this.f9014k;
    }

    public final AtomicBoolean j() {
        return this.f9012i;
    }

    public final void l(o.c cVar) {
        w5.k.f(cVar, "<set-?>");
        this.f9009f = cVar;
    }

    public final void m(k kVar) {
        this.f9010g = kVar;
    }

    public final void o() {
        if (this.f9012i.compareAndSet(false, true)) {
            this.f9005b.n(f());
            try {
                k kVar = this.f9010g;
                if (kVar != null) {
                    kVar.e0(this.f9011h, this.f9008e);
                }
            } catch (RemoteException e7) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e7);
            }
            this.f9007d.unbindService(this.f9013j);
        }
    }
}
