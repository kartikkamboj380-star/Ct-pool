package androidx.work;

import androidx.work.impl.C0664d;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l0.h;
import l0.q;
import l0.v;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Executor f9225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f9226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final v f9227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final h f9228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final q f9229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.core.util.a f9230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final androidx.core.util.a f9231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f9232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f9233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f9234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f9235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f9236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f9237m;

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0178a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f9238a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f9239b;

        ThreadFactoryC0178a(boolean z6) {
            this.f9239b = z6;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f9239b ? "WM.task-" : "androidx.work-") + this.f9238a.incrementAndGet());
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Executor f9241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        v f9242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        h f9243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Executor f9244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        q f9245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.core.util.a f9246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        androidx.core.util.a f9247g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f9248h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f9249i = 4;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f9250j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f9251k = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f9252l = 20;

        public a a() {
            return new a(this);
        }
    }

    a(b bVar) {
        Executor executor = bVar.f9241a;
        this.f9225a = executor == null ? a(false) : executor;
        Executor executorA = bVar.f9244d;
        if (executorA == null) {
            this.f9237m = true;
            executorA = a(true);
        } else {
            this.f9237m = false;
        }
        this.f9226b = executorA;
        v vVar = bVar.f9242b;
        this.f9227c = vVar == null ? v.c() : vVar;
        h hVar = bVar.f9243c;
        this.f9228d = hVar == null ? h.c() : hVar;
        q qVar = bVar.f9245e;
        this.f9229e = qVar == null ? new C0664d() : qVar;
        this.f9233i = bVar.f9249i;
        this.f9234j = bVar.f9250j;
        this.f9235k = bVar.f9251k;
        this.f9236l = bVar.f9252l;
        this.f9230f = bVar.f9246f;
        this.f9231g = bVar.f9247g;
        this.f9232h = bVar.f9248h;
    }

    private Executor a(boolean z6) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z6));
    }

    private ThreadFactory b(boolean z6) {
        return new ThreadFactoryC0178a(z6);
    }

    public String c() {
        return this.f9232h;
    }

    public Executor d() {
        return this.f9225a;
    }

    public androidx.core.util.a e() {
        return this.f9230f;
    }

    public h f() {
        return this.f9228d;
    }

    public int g() {
        return this.f9235k;
    }

    public int h() {
        return this.f9236l;
    }

    public int i() {
        return this.f9234j;
    }

    public int j() {
        return this.f9233i;
    }

    public q k() {
        return this.f9229e;
    }

    public androidx.core.util.a l() {
        return this.f9231g;
    }

    public Executor m() {
        return this.f9226b;
    }

    public v n() {
        return this.f9227c;
    }
}
