package N4;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: N4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0445g implements InterfaceC0446h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2378b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D4.b f2379a;

    /* JADX INFO: renamed from: N4.g$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0445g(D4.b bVar) {
        w5.k.f(bVar, "transportFactoryProvider");
        this.f2379a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(z zVar) {
        String strB = A.f2270a.c().b(zVar);
        w5.k.e(strB, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + strB);
        byte[] bytes = strB.getBytes(F5.d.f1104b);
        w5.k.e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // N4.InterfaceC0446h
    public void a(z zVar) {
        w5.k.f(zVar, "sessionEvent");
        ((S2.j) this.f2379a.get()).a("FIREBASE_APPQUALITY_SESSION", z.class, S2.c.b("json"), new S2.h() { // from class: N4.f
            @Override // S2.h
            public final Object apply(Object obj) {
                return this.f2377a.c((z) obj);
            }
        }).a(S2.d.f(zVar));
    }
}
