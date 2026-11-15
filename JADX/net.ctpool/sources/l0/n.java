package l0;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.u;

/* JADX INFO: loaded from: classes.dex */
public final class n extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f21058e = new b(null);

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a aVar) {
        super(aVar.e(), aVar.h(), aVar.f());
        w5.k.f(aVar, "builder");
    }

    public static final class a extends u.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, long j7, TimeUnit timeUnit) {
            super(cls);
            w5.k.f(cls, "workerClass");
            w5.k.f(timeUnit, "repeatIntervalTimeUnit");
            h().k(timeUnit.toMillis(j7));
        }

        @Override // l0.u.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public n c() {
            if (d() && h().f21804j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
            }
            if (!h().f21811q) {
                return new n(this);
            }
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited".toString());
        }

        @Override // l0.u.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public a g() {
            return this;
        }
    }
}
