package i5;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes.dex */
final class o implements Lazy, Serializable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f19975p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f19976q = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "n");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile InterfaceC2171a f19977m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile Object f19978n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f19979o;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public o(InterfaceC2171a interfaceC2171a) {
        w5.k.f(interfaceC2171a, "initializer");
        this.f19977m = interfaceC2171a;
        r rVar = r.f19983a;
        this.f19978n = rVar;
        this.f19979o = rVar;
    }

    @Override // kotlin.Lazy
    public boolean a() {
        return this.f19978n != r.f19983a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object obj = this.f19978n;
        r rVar = r.f19983a;
        if (obj != rVar) {
            return obj;
        }
        InterfaceC2171a interfaceC2171a = this.f19977m;
        if (interfaceC2171a != null) {
            Object objInvoke = interfaceC2171a.invoke();
            if (androidx.concurrent.futures.b.a(f19976q, this, rVar, objInvoke)) {
                this.f19977m = null;
                return objInvoke;
            }
        }
        return this.f19978n;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
