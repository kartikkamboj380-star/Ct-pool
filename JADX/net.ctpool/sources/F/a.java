package F;

import F.d;
import j5.AbstractC1809n;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;
import w5.l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f1053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f1054b;

    /* JADX INFO: renamed from: F.a$a, reason: collision with other inner class name */
    static final class C0016a extends l implements v5.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final C0016a f1055m = new C0016a();

        C0016a() {
            super(1);
        }

        @Override // v5.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence i(Map.Entry entry) {
            k.f(entry, "entry");
            return "  " + ((d.a) entry.getKey()).a() + " = " + entry.getValue();
        }
    }

    public a(Map map, boolean z6) {
        k.f(map, "preferencesMap");
        this.f1053a = map;
        this.f1054b = new AtomicBoolean(z6);
    }

    @Override // F.d
    public Map a() {
        Map mapUnmodifiableMap = Collections.unmodifiableMap(this.f1053a);
        k.e(mapUnmodifiableMap, "unmodifiableMap(preferencesMap)");
        return mapUnmodifiableMap;
    }

    @Override // F.d
    public Object b(d.a aVar) {
        k.f(aVar, "key");
        return this.f1053a.get(aVar);
    }

    public final void e() {
        if (!(!this.f1054b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return k.b(this.f1053a, ((a) obj).f1053a);
        }
        return false;
    }

    public final void f() {
        this.f1054b.set(true);
    }

    public final void g(d.b... bVarArr) {
        k.f(bVarArr, "pairs");
        e();
        if (bVarArr.length <= 0) {
            return;
        }
        d.b bVar = bVarArr[0];
        throw null;
    }

    public final Object h(d.a aVar) {
        k.f(aVar, "key");
        e();
        return this.f1053a.remove(aVar);
    }

    public int hashCode() {
        return this.f1053a.hashCode();
    }

    public final void i(d.a aVar, Object obj) {
        k.f(aVar, "key");
        j(aVar, obj);
    }

    public final void j(d.a aVar, Object obj) {
        Map map;
        k.f(aVar, "key");
        e();
        if (obj == null) {
            h(aVar);
            return;
        }
        if (obj instanceof Set) {
            map = this.f1053a;
            obj = Collections.unmodifiableSet(AbstractC1809n.e0((Iterable) obj));
            k.e(obj, "unmodifiableSet(value.toSet())");
        } else {
            map = this.f1053a;
        }
        map.put(aVar, obj);
    }

    public String toString() {
        return AbstractC1809n.O(this.f1053a.entrySet(), ",\n", "{\n", "\n}", 0, null, C0016a.f1055m, 24, null);
    }

    public /* synthetic */ a(Map map, boolean z6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? new LinkedHashMap() : map, (i7 & 2) != 0 ? true : z6);
    }
}
