package a6;

import T5.t;
import i6.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0115a f4807c = new C0115a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f4808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f4809b;

    /* JADX INFO: renamed from: a6.a$a, reason: collision with other inner class name */
    public static final class C0115a {
        private C0115a() {
        }

        public /* synthetic */ C0115a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(h hVar) {
        k.f(hVar, "source");
        this.f4809b = hVar;
        this.f4808a = 262144;
    }

    public final t a() {
        t.a aVar = new t.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.e();
            }
            aVar.b(strB);
        }
    }

    public final String b() {
        String strZ = this.f4809b.Z(this.f4808a);
        this.f4808a -= (long) strZ.length();
        return strZ;
    }
}
