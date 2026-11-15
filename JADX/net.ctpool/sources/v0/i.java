package v0;

import S5.p;
import S5.r;
import android.content.Context;
import app.notifee.core.database.NotifeeCoreDatabase;
import java.util.List;
import java.util.concurrent.Callable;
import z3.AbstractC2272l;
import z3.AbstractC2275o;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static i f22575b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f22576a;

    public i(Context context) {
        this.f22576a = NotifeeCoreDatabase.e(context).d();
    }

    public static i i(Context context) {
        i iVar;
        synchronized (i.class) {
            try {
                if (f22575b == null) {
                    f22575b = new i(context);
                }
                iVar = f22575b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List o(Boolean bool) {
        return this.f22576a.h(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(r rVar) {
        this.f22576a.e(rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(List list) {
        this.f22576a.b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        this.f22576a.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(r rVar) {
        this.f22576a.c(rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(String str) {
        this.f22576a.g(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ r w(String str) {
        return this.f22576a.f(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List x() {
        return this.f22576a.a();
    }

    public AbstractC2272l j(final Boolean bool) {
        return AbstractC2275o.d(NotifeeCoreDatabase.f9540b, new Callable() { // from class: v0.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f22561a.o(bool);
            }
        });
    }

    public void k() {
        NotifeeCoreDatabase.f9540b.execute(new Runnable() { // from class: v0.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f22574m.t();
            }
        });
    }

    public void l(final r rVar) {
        NotifeeCoreDatabase.f9540b.execute(new Runnable() { // from class: v0.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f22568m.r(rVar);
            }
        });
    }

    public void m(final String str) {
        NotifeeCoreDatabase.f9540b.execute(new Runnable() { // from class: v0.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f22572m.v(str);
            }
        });
    }

    public void n(final List list) {
        NotifeeCoreDatabase.f9540b.execute(new Runnable() { // from class: v0.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f22566m.s(list);
            }
        });
    }

    public AbstractC2272l p() {
        return AbstractC2275o.d(NotifeeCoreDatabase.f9540b, new Callable() { // from class: v0.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f22563a.x();
            }
        });
    }

    public AbstractC2272l q(final String str) {
        return AbstractC2275o.d(NotifeeCoreDatabase.f9540b, new Callable() { // from class: v0.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f22564a.w(str);
            }
        });
    }

    public void y(final r rVar) {
        NotifeeCoreDatabase.f9540b.execute(new Runnable() { // from class: v0.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f22570m.u(rVar);
            }
        });
    }
}
