package U;

import H5.C0406m;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import i5.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m5.InterfaceC1885d;
import n5.AbstractC1930b;
import o5.AbstractC1953h;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f3733a = new b(null);

    private static final class a extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MeasurementManager f3734b;

        public a(MeasurementManager measurementManager) {
            w5.k.f(measurementManager, "mMeasurementManager");
            this.f3734b = measurementManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeletionRequest k(U.a aVar) {
            k.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(o oVar) {
            l.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(p pVar) {
            c.a();
            throw null;
        }

        @Override // U.n
        public Object a(U.a aVar, InterfaceC1885d interfaceC1885d) {
            C0406m c0406m = new C0406m(AbstractC1930b.b(interfaceC1885d), 1);
            c0406m.C();
            this.f3734b.deleteRegistrations(k(aVar), new m(), androidx.core.os.n.a(c0406m));
            Object objZ = c0406m.z();
            if (objZ == AbstractC1930b.c()) {
                AbstractC1953h.c(interfaceC1885d);
            }
            return objZ == AbstractC1930b.c() ? objZ : u.f19985a;
        }

        @Override // U.n
        public Object b(InterfaceC1885d interfaceC1885d) {
            C0406m c0406m = new C0406m(AbstractC1930b.b(interfaceC1885d), 1);
            c0406m.C();
            this.f3734b.getMeasurementApiStatus(new m(), androidx.core.os.n.a(c0406m));
            Object objZ = c0406m.z();
            if (objZ == AbstractC1930b.c()) {
                AbstractC1953h.c(interfaceC1885d);
            }
            return objZ;
        }

        @Override // U.n
        public Object c(Uri uri, InputEvent inputEvent, InterfaceC1885d interfaceC1885d) {
            C0406m c0406m = new C0406m(AbstractC1930b.b(interfaceC1885d), 1);
            c0406m.C();
            this.f3734b.registerSource(uri, inputEvent, new m(), androidx.core.os.n.a(c0406m));
            Object objZ = c0406m.z();
            if (objZ == AbstractC1930b.c()) {
                AbstractC1953h.c(interfaceC1885d);
            }
            return objZ == AbstractC1930b.c() ? objZ : u.f19985a;
        }

        @Override // U.n
        public Object d(Uri uri, InterfaceC1885d interfaceC1885d) {
            C0406m c0406m = new C0406m(AbstractC1930b.b(interfaceC1885d), 1);
            c0406m.C();
            this.f3734b.registerTrigger(uri, new m(), androidx.core.os.n.a(c0406m));
            Object objZ = c0406m.z();
            if (objZ == AbstractC1930b.c()) {
                AbstractC1953h.c(interfaceC1885d);
            }
            return objZ == AbstractC1930b.c() ? objZ : u.f19985a;
        }

        @Override // U.n
        public Object e(o oVar, InterfaceC1885d interfaceC1885d) {
            C0406m c0406m = new C0406m(AbstractC1930b.b(interfaceC1885d), 1);
            c0406m.C();
            this.f3734b.registerWebSource(l(oVar), new m(), androidx.core.os.n.a(c0406m));
            Object objZ = c0406m.z();
            if (objZ == AbstractC1930b.c()) {
                AbstractC1953h.c(interfaceC1885d);
            }
            return objZ == AbstractC1930b.c() ? objZ : u.f19985a;
        }

        @Override // U.n
        public Object f(p pVar, InterfaceC1885d interfaceC1885d) {
            C0406m c0406m = new C0406m(AbstractC1930b.b(interfaceC1885d), 1);
            c0406m.C();
            this.f3734b.registerWebTrigger(m(pVar), new m(), androidx.core.os.n.a(c0406m));
            Object objZ = c0406m.z();
            if (objZ == AbstractC1930b.c()) {
                AbstractC1953h.c(interfaceC1885d);
            }
            return objZ == AbstractC1930b.c() ? objZ : u.f19985a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Context context) {
            w5.k.f(context, "context");
            Object systemService = context.getSystemService((Class<Object>) f.a());
            w5.k.e(systemService, "context.getSystemService…:class.java\n            )");
            this(g.a(systemService));
        }
    }

    public static final class b {
        private b() {
        }

        public final n a(Context context) {
            w5.k.f(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            R.b bVar = R.b.f2823a;
            sb.append(bVar.a());
            Log.d("MeasurementManager", sb.toString());
            if (bVar.a() >= 5) {
                return new a(context);
            }
            return null;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract Object a(U.a aVar, InterfaceC1885d interfaceC1885d);

    public abstract Object b(InterfaceC1885d interfaceC1885d);

    public abstract Object c(Uri uri, InputEvent inputEvent, InterfaceC1885d interfaceC1885d);

    public abstract Object d(Uri uri, InterfaceC1885d interfaceC1885d);

    public abstract Object e(o oVar, InterfaceC1885d interfaceC1885d);

    public abstract Object f(p pVar, InterfaceC1885d interfaceC1885d);
}
