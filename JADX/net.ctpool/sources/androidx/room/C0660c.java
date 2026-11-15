package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: androidx.room.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0660c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f8905m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Z.h f8906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f8907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f8908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f8911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f8913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Z.g f8914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f8915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f8916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f8917l;

    /* JADX INFO: renamed from: androidx.room.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0660c(long j7, TimeUnit timeUnit, Executor executor) {
        w5.k.f(timeUnit, "autoCloseTimeUnit");
        w5.k.f(executor, "autoCloseExecutor");
        this.f8907b = new Handler(Looper.getMainLooper());
        this.f8909d = new Object();
        this.f8910e = timeUnit.toMillis(j7);
        this.f8911f = executor;
        this.f8913h = SystemClock.uptimeMillis();
        this.f8916k = new Runnable() { // from class: androidx.room.a
            @Override // java.lang.Runnable
            public final void run() {
                C0660c.f(this.f8903m);
            }
        };
        this.f8917l = new Runnable() { // from class: androidx.room.b
            @Override // java.lang.Runnable
            public final void run() {
                C0660c.c(this.f8904m);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C0660c c0660c) {
        i5.u uVar;
        w5.k.f(c0660c, "this$0");
        synchronized (c0660c.f8909d) {
            try {
                if (SystemClock.uptimeMillis() - c0660c.f8913h < c0660c.f8910e) {
                    return;
                }
                if (c0660c.f8912g != 0) {
                    return;
                }
                Runnable runnable = c0660c.f8908c;
                if (runnable != null) {
                    runnable.run();
                    uVar = i5.u.f19985a;
                } else {
                    uVar = null;
                }
                if (uVar == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
                }
                Z.g gVar = c0660c.f8914i;
                if (gVar != null && gVar.isOpen()) {
                    gVar.close();
                }
                c0660c.f8914i = null;
                i5.u uVar2 = i5.u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(C0660c c0660c) {
        w5.k.f(c0660c, "this$0");
        c0660c.f8911f.execute(c0660c.f8917l);
    }

    public final void d() {
        synchronized (this.f8909d) {
            try {
                this.f8915j = true;
                Z.g gVar = this.f8914i;
                if (gVar != null) {
                    gVar.close();
                }
                this.f8914i = null;
                i5.u uVar = i5.u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f8909d) {
            try {
                int i7 = this.f8912g;
                if (i7 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
                }
                int i8 = i7 - 1;
                this.f8912g = i8;
                if (i8 == 0) {
                    if (this.f8914i == null) {
                        return;
                    } else {
                        this.f8907b.postDelayed(this.f8916k, this.f8910e);
                    }
                }
                i5.u uVar = i5.u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object g(v5.l lVar) {
        w5.k.f(lVar, "block");
        try {
            return lVar.i(j());
        } finally {
            e();
        }
    }

    public final Z.g h() {
        return this.f8914i;
    }

    public final Z.h i() {
        Z.h hVar = this.f8906a;
        if (hVar != null) {
            return hVar;
        }
        w5.k.t("delegateOpenHelper");
        return null;
    }

    public final Z.g j() {
        synchronized (this.f8909d) {
            this.f8907b.removeCallbacks(this.f8916k);
            this.f8912g++;
            if (!(!this.f8915j)) {
                throw new IllegalStateException("Attempting to open already closed database.".toString());
            }
            Z.g gVar = this.f8914i;
            if (gVar != null && gVar.isOpen()) {
                return gVar;
            }
            Z.g gVarL0 = i().l0();
            this.f8914i = gVarL0;
            return gVarL0;
        }
    }

    public final void k(Z.h hVar) {
        w5.k.f(hVar, "delegateOpenHelper");
        n(hVar);
    }

    public final boolean l() {
        return !this.f8915j;
    }

    public final void m(Runnable runnable) {
        w5.k.f(runnable, "onAutoClose");
        this.f8908c = runnable;
    }

    public final void n(Z.h hVar) {
        w5.k.f(hVar, "<set-?>");
        this.f8906a = hVar;
    }
}
