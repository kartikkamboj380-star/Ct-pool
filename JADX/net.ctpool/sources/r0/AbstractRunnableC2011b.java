package r0;

import androidx.work.impl.E;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import l0.l;
import q0.InterfaceC1986b;

/* JADX INFO: renamed from: r0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractRunnableC2011b implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final androidx.work.impl.o f22081m = new androidx.work.impl.o();

    /* JADX INFO: renamed from: r0.b$a */
    class a extends AbstractRunnableC2011b {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ E f22082n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ UUID f22083o;

        a(E e7, UUID uuid) {
            this.f22082n = e7;
            this.f22083o = uuid;
        }

        @Override // r0.AbstractRunnableC2011b
        void h() {
            WorkDatabase workDatabaseV = this.f22082n.v();
            workDatabaseV.beginTransaction();
            try {
                a(this.f22082n, this.f22083o.toString());
                workDatabaseV.setTransactionSuccessful();
                workDatabaseV.endTransaction();
                g(this.f22082n);
            } catch (Throwable th) {
                workDatabaseV.endTransaction();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r0.b$b, reason: collision with other inner class name */
    class C0307b extends AbstractRunnableC2011b {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ E f22084n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f22085o;

        C0307b(E e7, String str) {
            this.f22084n = e7;
            this.f22085o = str;
        }

        @Override // r0.AbstractRunnableC2011b
        void h() {
            WorkDatabase workDatabaseV = this.f22084n.v();
            workDatabaseV.beginTransaction();
            try {
                Iterator it = workDatabaseV.j().t(this.f22085o).iterator();
                while (it.hasNext()) {
                    a(this.f22084n, (String) it.next());
                }
                workDatabaseV.setTransactionSuccessful();
                workDatabaseV.endTransaction();
                g(this.f22084n);
            } catch (Throwable th) {
                workDatabaseV.endTransaction();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r0.b$c */
    class c extends AbstractRunnableC2011b {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ E f22086n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f22087o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f22088p;

        c(E e7, String str, boolean z6) {
            this.f22086n = e7;
            this.f22087o = str;
            this.f22088p = z6;
        }

        @Override // r0.AbstractRunnableC2011b
        void h() {
            WorkDatabase workDatabaseV = this.f22086n.v();
            workDatabaseV.beginTransaction();
            try {
                Iterator it = workDatabaseV.j().o(this.f22087o).iterator();
                while (it.hasNext()) {
                    a(this.f22086n, (String) it.next());
                }
                workDatabaseV.setTransactionSuccessful();
                workDatabaseV.endTransaction();
                if (this.f22088p) {
                    g(this.f22086n);
                }
            } catch (Throwable th) {
                workDatabaseV.endTransaction();
                throw th;
            }
        }
    }

    public static AbstractRunnableC2011b b(UUID uuid, E e7) {
        return new a(e7, uuid);
    }

    public static AbstractRunnableC2011b c(String str, E e7, boolean z6) {
        return new c(e7, str, z6);
    }

    public static AbstractRunnableC2011b d(String str, E e7) {
        return new C0307b(e7, str);
    }

    private void f(WorkDatabase workDatabase, String str) {
        q0.v vVarJ = workDatabase.j();
        InterfaceC1986b interfaceC1986bE = workDatabase.e();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            l0.s sVarP = vVarJ.p(str2);
            if (sVarP != l0.s.SUCCEEDED && sVarP != l0.s.FAILED) {
                vVarJ.l(l0.s.CANCELLED, str2);
            }
            linkedList.addAll(interfaceC1986bE.b(str2));
        }
    }

    void a(E e7, String str) {
        f(e7.v(), str);
        e7.s().r(str);
        Iterator it = e7.t().iterator();
        while (it.hasNext()) {
            ((androidx.work.impl.t) it.next()).d(str);
        }
    }

    public l0.l e() {
        return this.f22081m;
    }

    void g(E e7) {
        androidx.work.impl.u.b(e7.o(), e7.v(), e7.t());
    }

    abstract void h();

    @Override // java.lang.Runnable
    public void run() {
        try {
            h();
            this.f22081m.a(l0.l.f21052a);
        } catch (Throwable th) {
            this.f22081m.a(new l.b.a(th));
        }
    }
}
