package com.facebook.react.devsupport;

import T5.B;
import T5.InterfaceC0459e;
import T5.InterfaceC0460f;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T5.z f11555a;

    class a implements InterfaceC0460f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ X1.g f11556a;

        a(X1.g gVar) {
            this.f11556a = gVar;
        }

        @Override // T5.InterfaceC0460f
        public void a(InterfaceC0459e interfaceC0459e, T5.D d7) throws IOException {
            if (!d7.z()) {
                P0.a.j("ReactNative", "Got non-success http code from packager when requesting status: " + d7.f());
                this.f11556a.a(false);
                return;
            }
            T5.E eA = d7.a();
            if (eA == null) {
                P0.a.j("ReactNative", "Got null body response from packager when requesting status");
                this.f11556a.a(false);
                return;
            }
            String strL = eA.l();
            if ("packager-status:running".equals(strL)) {
                this.f11556a.a(true);
                return;
            }
            P0.a.j("ReactNative", "Got unexpected response from packager when requesting status: " + strL);
            this.f11556a.a(false);
        }

        @Override // T5.InterfaceC0460f
        public void b(InterfaceC0459e interfaceC0459e, IOException iOException) {
            P0.a.G("ReactNative", "The packager does not seem to be running as we got an IOException requesting its status: " + iOException.getMessage());
            this.f11556a.a(false);
        }
    }

    public U(T5.z zVar) {
        this.f11555a = zVar;
    }

    private static String a(String str) {
        return String.format(Locale.US, "http://%s/status", str);
    }

    public void b(String str, X1.g gVar) {
        this.f11555a.a(new B.a().m(a(str)).b()).S0(new a(gVar));
    }
}
