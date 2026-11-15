package N4;

import H5.AbstractC0398i;
import N4.k;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1885d;
import m5.InterfaceC1888g;
import n5.AbstractC1930b;
import o5.AbstractC1956k;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f2384c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y3.f f2385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P4.f f2386b;

    static final class a extends AbstractC1956k implements v5.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2387q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC1888g f2389s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ F f2390t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1888g interfaceC1888g, F f7, InterfaceC1885d interfaceC1885d) {
            super(2, interfaceC1885d);
            this.f2389s = interfaceC1888g;
            this.f2390t = f7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(String str, Y3.n nVar) {
            Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            H.f2314m.a(null);
        }

        @Override // o5.AbstractC1946a
        public final InterfaceC1885d d(Object obj, InterfaceC1885d interfaceC1885d) {
            return k.this.new a(this.f2389s, this.f2390t, interfaceC1885d);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
        @Override // o5.AbstractC1946a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object s(Object obj) {
            String str;
            Object objC = AbstractC1930b.c();
            int i7 = this.f2387q;
            if (i7 == 0) {
                i5.n.b(obj);
                O4.a aVar = O4.a.f2476a;
                this.f2387q = 1;
                obj = aVar.c(this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5.n.b(obj);
                    if (k.this.f2386b.d()) {
                        str = "Sessions SDK disabled. Not listening to lifecycle events.";
                        Log.d("FirebaseSessions", str);
                        return i5.u.f19985a;
                    }
                    D d7 = new D(this.f2389s);
                    d7.i(this.f2390t);
                    H.f2314m.a(d7);
                    k.this.f2385a.h(new Y3.g() { // from class: N4.j
                        @Override // Y3.g
                        public final void a(String str2, Y3.n nVar) {
                            k.a.x(str2, nVar);
                        }
                    });
                    return i5.u.f19985a;
                }
                i5.n.b(obj);
            }
            Collection collectionValues = ((Map) obj).values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((O4.b) it.next()).b()) {
                        P4.f fVar = k.this.f2386b;
                        this.f2387q = 2;
                        if (fVar.g(this) == objC) {
                            return objC;
                        }
                        if (k.this.f2386b.d()) {
                        }
                    }
                }
            }
            str = "No Sessions subscribers. Not listening to lifecycle events.";
            Log.d("FirebaseSessions", str);
            return i5.u.f19985a;
        }

        @Override // v5.p
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object m(H5.I i7, InterfaceC1885d interfaceC1885d) {
            return ((a) d(i7, interfaceC1885d)).s(i5.u.f19985a);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public k(Y3.f fVar, P4.f fVar2, InterfaceC1888g interfaceC1888g, F f7) {
        w5.k.f(fVar, "firebaseApp");
        w5.k.f(fVar2, "settings");
        w5.k.f(interfaceC1888g, "backgroundDispatcher");
        w5.k.f(f7, "lifecycleServiceBinder");
        this.f2385a = fVar;
        this.f2386b = fVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = fVar.m().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(H.f2314m);
            AbstractC0398i.d(H5.J.a(interfaceC1888g), null, null, new a(interfaceC1888g, f7, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
