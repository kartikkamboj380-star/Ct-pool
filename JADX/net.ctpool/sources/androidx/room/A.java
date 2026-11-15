package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    private final u database;
    private final AtomicBoolean lock;
    private final Lazy stmt$delegate;

    static final class a extends w5.l implements InterfaceC2171a {
        a() {
            super(0);
        }

        @Override // v5.InterfaceC2171a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z.k invoke() {
            return A.this.a();
        }
    }

    public A(u uVar) {
        w5.k.f(uVar, "database");
        this.database = uVar;
        this.lock = new AtomicBoolean(false);
        this.stmt$delegate = i5.g.b(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Z.k a() {
        return this.database.compileStatement(createQuery());
    }

    private final Z.k b() {
        return (Z.k) this.stmt$delegate.getValue();
    }

    private final Z.k c(boolean z6) {
        return z6 ? b() : a();
    }

    public Z.k acquire() {
        assertNotMainThread();
        return c(this.lock.compareAndSet(false, true));
    }

    protected void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    protected abstract String createQuery();

    public void release(Z.k kVar) {
        w5.k.f(kVar, "statement");
        if (kVar == b()) {
            this.lock.set(false);
        }
    }
}
