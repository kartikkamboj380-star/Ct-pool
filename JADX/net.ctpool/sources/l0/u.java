package l0;

import j5.AbstractC1794M;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f21071d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f21072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q0.u f21073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f21074c;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f21075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f21076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private UUID f21077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private q0.u f21078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Set f21079e;

        public a(Class cls) {
            w5.k.f(cls, "workerClass");
            this.f21075a = cls;
            UUID uuidRandomUUID = UUID.randomUUID();
            w5.k.e(uuidRandomUUID, "randomUUID()");
            this.f21077c = uuidRandomUUID;
            String string = this.f21077c.toString();
            w5.k.e(string, "id.toString()");
            String name = cls.getName();
            w5.k.e(name, "workerClass.name");
            this.f21078d = new q0.u(string, name);
            String name2 = cls.getName();
            w5.k.e(name2, "workerClass.name");
            this.f21079e = AbstractC1794M.e(name2);
        }

        public final a a(String str) {
            w5.k.f(str, "tag");
            this.f21079e.add(str);
            return g();
        }

        public final u b() {
            u uVarC = c();
            C1844b c1844b = this.f21078d.f21804j;
            boolean z6 = c1844b.e() || c1844b.f() || c1844b.g() || c1844b.h();
            q0.u uVar = this.f21078d;
            if (uVar.f21811q) {
                if (!(!z6)) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
                if (uVar.f21801g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                }
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            w5.k.e(uuidRandomUUID, "randomUUID()");
            i(uuidRandomUUID);
            return uVarC;
        }

        public abstract u c();

        public final boolean d() {
            return this.f21076b;
        }

        public final UUID e() {
            return this.f21077c;
        }

        public final Set f() {
            return this.f21079e;
        }

        public abstract a g();

        public final q0.u h() {
            return this.f21078d;
        }

        public final a i(UUID uuid) {
            w5.k.f(uuid, "id");
            this.f21077c = uuid;
            String string = uuid.toString();
            w5.k.e(string, "id.toString()");
            this.f21078d = new q0.u(string, this.f21078d);
            return g();
        }

        public a j(long j7, TimeUnit timeUnit) {
            w5.k.f(timeUnit, "timeUnit");
            this.f21078d.f21801g = timeUnit.toMillis(j7);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f21078d.f21801g) {
                return g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        public final a k(androidx.work.b bVar) {
            w5.k.f(bVar, "inputData");
            this.f21078d.f21799e = bVar;
            return g();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public u(UUID uuid, q0.u uVar, Set set) {
        w5.k.f(uuid, "id");
        w5.k.f(uVar, "workSpec");
        w5.k.f(set, "tags");
        this.f21072a = uuid;
        this.f21073b = uVar;
        this.f21074c = set;
    }

    public UUID a() {
        return this.f21072a;
    }

    public final String b() {
        String string = a().toString();
        w5.k.e(string, "id.toString()");
        return string;
    }

    public final Set c() {
        return this.f21074c;
    }

    public final q0.u d() {
        return this.f21073b;
    }
}
