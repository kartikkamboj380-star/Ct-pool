package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a0 f7568c = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f7570b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f7569a = new G();

    private a0() {
    }

    public static a0 a() {
        return f7568c;
    }

    public e0 b(Class cls, e0 e0Var) {
        AbstractC0629y.b(cls, "messageType");
        AbstractC0629y.b(e0Var, "schema");
        return (e0) this.f7570b.putIfAbsent(cls, e0Var);
    }

    public e0 c(Class cls) {
        AbstractC0629y.b(cls, "messageType");
        e0 e0Var = (e0) this.f7570b.get(cls);
        if (e0Var != null) {
            return e0Var;
        }
        e0 e0VarA = this.f7569a.a(cls);
        e0 e0VarB = b(cls, e0VarA);
        return e0VarB != null ? e0VarB : e0VarA;
    }

    public e0 d(Object obj) {
        return c(obj.getClass());
    }
}
