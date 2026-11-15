package q0;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.room.u f21785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.room.i f21786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.room.A f21787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.room.A f21788d;

    class a extends androidx.room.i {
        a(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.i
        public /* bridge */ /* synthetic */ void bind(Z.k kVar, Object obj) {
            androidx.appcompat.app.y.a(obj);
            d(kVar, null);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        public void d(Z.k kVar, q qVar) {
            throw null;
        }
    }

    class b extends androidx.room.A {
        b(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    class c extends androidx.room.A {
        c(androidx.room.u uVar) {
            super(uVar);
        }

        @Override // androidx.room.A
        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public s(androidx.room.u uVar) {
        this.f21785a = uVar;
        this.f21786b = new a(uVar);
        this.f21787c = new b(uVar);
        this.f21788d = new c(uVar);
    }

    public static List c() {
        return Collections.emptyList();
    }

    @Override // q0.r
    public void a(String str) {
        this.f21785a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21787c.acquire();
        if (str == null) {
            kVarAcquire.A0(1);
        } else {
            kVarAcquire.v(1, str);
        }
        this.f21785a.beginTransaction();
        try {
            kVarAcquire.D();
            this.f21785a.setTransactionSuccessful();
        } finally {
            this.f21785a.endTransaction();
            this.f21787c.release(kVarAcquire);
        }
    }

    @Override // q0.r
    public void b() {
        this.f21785a.assertNotSuspendingTransaction();
        Z.k kVarAcquire = this.f21788d.acquire();
        this.f21785a.beginTransaction();
        try {
            kVarAcquire.D();
            this.f21785a.setTransactionSuccessful();
        } finally {
            this.f21785a.endTransaction();
            this.f21788d.release(kVarAcquire);
        }
    }
}
