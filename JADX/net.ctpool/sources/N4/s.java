package N4;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1949d;
import z3.AbstractC2272l;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f2392c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2394b;

    public static final class a {

        /* JADX INFO: renamed from: N4.s$a$a, reason: collision with other inner class name */
        static final class C0045a extends AbstractC1949d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            Object f2395p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f2396q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f2398s;

            C0045a(InterfaceC1885d interfaceC1885d) {
                super(interfaceC1885d);
            }

            @Override // o5.AbstractC1946a
            public final Object s(Object obj) {
                this.f2396q = obj;
                this.f2398s |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [E4.e] */
        /* JADX WARN: Type inference failed for: r9v0, types: [E4.e, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object a(E4.e eVar, InterfaceC1885d interfaceC1885d) {
            C0045a c0045a;
            ?? r10;
            String str;
            ?? r9;
            if (interfaceC1885d instanceof C0045a) {
                c0045a = (C0045a) interfaceC1885d;
                int i7 = c0045a.f2398s;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    c0045a.f2398s = i7 - Integer.MIN_VALUE;
                } else {
                    c0045a = new C0045a(interfaceC1885d);
                }
            }
            Object objA = c0045a.f2396q;
            Object objC = AbstractC1930b.c();
            int i8 = c0045a.f2398s;
            String str2 = "";
            try {
                try {
                } catch (Exception e7) {
                    Log.w("InstallationId", "Error getting authentication token.", e7);
                    r10 = eVar;
                    str = "";
                }
            } catch (Exception e8) {
                Log.w("InstallationId", "Error getting Firebase installation id .", e8);
                r9 = eVar;
            }
            if (i8 == 0) {
                i5.n.b(objA);
                AbstractC2272l abstractC2272lA = eVar.a(false);
                w5.k.e(abstractC2272lA, "firebaseInstallations.getToken(false)");
                c0045a.f2395p = eVar;
                c0045a.f2398s = 1;
                objA = R5.b.a(abstractC2272lA, c0045a);
                eVar = eVar;
                if (objA == objC) {
                    return objC;
                }
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = (String) c0045a.f2395p;
                    i5.n.b(objA);
                    eVar = str3;
                    w5.k.e(objA, "{\n          firebaseInst…ions.id.await()\n        }");
                    str2 = (String) objA;
                    r9 = eVar;
                    return new s(str2, r9, null);
                }
                E4.e eVar2 = (E4.e) c0045a.f2395p;
                i5.n.b(objA);
                eVar = eVar2;
            }
            String strB = ((com.google.firebase.installations.g) objA).b();
            w5.k.e(strB, "{\n          firebaseInst…).await().token\n        }");
            r10 = eVar;
            str = strB;
            AbstractC2272l id = r10.getId();
            w5.k.e(id, "firebaseInstallations.id");
            c0045a.f2395p = str;
            c0045a.f2398s = 2;
            objA = R5.b.a(id, c0045a);
            eVar = str;
            if (objA == objC) {
                return objC;
            }
            w5.k.e(objA, "{\n          firebaseInst…ions.id.await()\n        }");
            str2 = (String) objA;
            r9 = eVar;
            return new s(str2, r9, null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private s(String str, String str2) {
        this.f2393a = str;
        this.f2394b = str2;
    }

    public final String a() {
        return this.f2394b;
    }

    public final String b() {
        return this.f2393a;
    }

    public /* synthetic */ s(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
