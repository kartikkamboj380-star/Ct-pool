package O4;

import O4.b;
import Q5.a;
import Q5.c;
import android.util.Log;
import i5.n;
import j5.AbstractC1787F;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1949d;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2476a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f2477b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: renamed from: O4.a$a, reason: collision with other inner class name */
    private static final class C0049a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Q5.a f2478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private O4.b f2479b;

        public C0049a(Q5.a aVar, O4.b bVar) {
            k.f(aVar, "mutex");
            this.f2478a = aVar;
            this.f2479b = bVar;
        }

        public final Q5.a a() {
            return this.f2478a;
        }

        public final O4.b b() {
            return this.f2479b;
        }

        public final void c(O4.b bVar) {
            this.f2479b = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0049a)) {
                return false;
            }
            C0049a c0049a = (C0049a) obj;
            return k.b(this.f2478a, c0049a.f2478a) && k.b(this.f2479b, c0049a.f2479b);
        }

        public int hashCode() {
            int iHashCode = this.f2478a.hashCode() * 31;
            O4.b bVar = this.f2479b;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.f2478a + ", subscriber=" + this.f2479b + ')';
        }

        public /* synthetic */ C0049a(Q5.a aVar, O4.b bVar, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i7 & 2) != 0 ? null : bVar);
        }
    }

    static final class b extends AbstractC1949d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f2480p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f2481q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f2482r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f2483s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f2484t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f2485u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f2486v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f2488x;

        b(InterfaceC1885d interfaceC1885d) {
            super(interfaceC1885d);
        }

        @Override // o5.AbstractC1946a
        public final Object s(Object obj) {
            this.f2486v = obj;
            this.f2488x |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(b.a aVar) {
        StringBuilder sb;
        String str;
        k.f(aVar, "subscriberName");
        if (aVar == b.a.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map map = f2477b;
        if (map.containsKey(aVar)) {
            sb = new StringBuilder();
            sb.append("Dependency ");
            sb.append(aVar);
            str = " already added.";
        } else {
            k.e(map, "dependencies");
            map.put(aVar, new C0049a(c.a(true), null, 2, 0 == true ? 1 : 0));
            sb = new StringBuilder();
            sb.append("Dependency to ");
            sb.append(aVar);
            str = " added.";
        }
        sb.append(str);
        Log.d("SessionsDependencies", sb.toString());
    }

    private final C0049a b(b.a aVar) {
        Map map = f2477b;
        k.e(map, "dependencies");
        Object obj = map.get(aVar);
        if (obj != null) {
            k.e(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (C0049a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    public static final void e(O4.b bVar) {
        k.f(bVar, "subscriber");
        b.a aVarC = bVar.c();
        C0049a c0049aB = f2476a.b(aVarC);
        if (c0049aB.b() != null) {
            Log.d("SessionsDependencies", "Subscriber " + aVarC + " already registered.");
            return;
        }
        c0049aB.c(bVar);
        Log.d("SessionsDependencies", "Subscriber " + aVarC + " registered.");
        a.C0058a.a(c0049aB.a(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009f -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(InterfaceC1885d interfaceC1885d) {
        b bVar;
        Iterator it;
        Map map;
        if (interfaceC1885d instanceof b) {
            bVar = (b) interfaceC1885d;
            int i7 = bVar.f2488x;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f2488x = i7 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC1885d);
            }
        }
        Object obj = bVar.f2486v;
        Object objC = AbstractC1930b.c();
        int i8 = bVar.f2488x;
        if (i8 == 0) {
            n.b(obj);
            Map map2 = f2477b;
            k.e(map2, "dependencies");
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1787F.d(map2.size()));
            it = map2.entrySet().iterator();
            map = linkedHashMap;
            if (it.hasNext()) {
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object key = bVar.f2485u;
            map = (Map) bVar.f2484t;
            Q5.a aVarA = (Q5.a) bVar.f2483s;
            b.a aVar = (b.a) bVar.f2482r;
            it = (Iterator) bVar.f2481q;
            Map map3 = (Map) bVar.f2480p;
            n.b(obj);
            try {
                O4.b bVarD = f2476a.d(aVar);
                aVarA.c(null);
                map.put(key, bVarD);
                map = map3;
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    key = entry.getKey();
                    aVar = (b.a) entry.getKey();
                    aVarA = ((C0049a) entry.getValue()).a();
                    bVar.f2480p = map;
                    bVar.f2481q = it;
                    bVar.f2482r = aVar;
                    bVar.f2483s = aVarA;
                    bVar.f2484t = map;
                    bVar.f2485u = key;
                    bVar.f2488x = 1;
                    if (aVarA.a(null, bVar) == objC) {
                        return objC;
                    }
                    map3 = map;
                    O4.b bVarD2 = f2476a.d(aVar);
                    aVarA.c(null);
                    map.put(key, bVarD2);
                    map = map3;
                    if (it.hasNext()) {
                        return map;
                    }
                }
            } catch (Throwable th) {
                aVarA.c(null);
                throw th;
            }
        }
    }

    public final O4.b d(b.a aVar) {
        k.f(aVar, "subscriberName");
        O4.b bVarB = b(aVar).b();
        if (bVarB != null) {
            return bVarB;
        }
        throw new IllegalStateException("Subscriber " + aVar + " has not been registered.");
    }
}
