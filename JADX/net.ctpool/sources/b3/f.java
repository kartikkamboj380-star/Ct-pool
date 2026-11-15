package b3;

import android.app.job.JobInfo;
import b3.C0678c;
import e3.InterfaceC1622a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC1622a f9592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map f9593b = new HashMap();

        public a a(S2.f fVar, b bVar) {
            this.f9593b.put(fVar, bVar);
            return this;
        }

        public f b() {
            if (this.f9592a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f9593b.keySet().size() < S2.f.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f9593b;
            this.f9593b = new HashMap();
            return f.d(this.f9592a, map);
        }

        public a c(InterfaceC1622a interfaceC1622a) {
            this.f9592a = interfaceC1622a;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j7);

            public abstract a c(Set set);

            public abstract a d(long j7);
        }

        public static a a() {
            return new C0678c.b().c(Collections.emptySet());
        }

        abstract long b();

        abstract Set c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i7, long j7) {
        return (long) (Math.pow(3.0d, i7 - 1) * j7 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j7 > 1 ? j7 : 2L) * ((long) r7))));
    }

    public static a b() {
        return new a();
    }

    static f d(InterfaceC1622a interfaceC1622a, Map map) {
        return new C0677b(interfaceC1622a, map);
    }

    public static f f(InterfaceC1622a interfaceC1622a) {
        return b().a(S2.f.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(S2.f.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(S2.f.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(interfaceC1622a).b();
    }

    private static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, S2.f fVar, long j7, int i7) {
        builder.setMinimumLatency(g(fVar, j7, i7));
        j(builder, ((b) h().get(fVar)).c());
        return builder;
    }

    abstract InterfaceC1622a e();

    public long g(S2.f fVar, long j7, int i7) {
        long jA = j7 - e().a();
        b bVar = (b) h().get(fVar);
        return Math.min(Math.max(a(i7, bVar.b()), jA), bVar.d());
    }

    abstract Map h();
}
