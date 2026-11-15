package d4;

import D4.a;
import Z3.a;
import android.os.Bundle;
import e4.C1629g;
import f4.C1652c;
import f4.C1653d;
import f4.InterfaceC1650a;
import g4.C1696c;
import g4.InterfaceC1694a;
import g4.InterfaceC1695b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D4.a f18675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile InterfaceC1650a f18676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile InterfaceC1695b f18677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f18678d;

    public d(D4.a aVar) {
        this(aVar, new C1696c(), new f4.f());
    }

    private void f() {
        this.f18675a.a(new a.InterfaceC0014a() { // from class: d4.c
            @Override // D4.a.InterfaceC0014a
            public final void a(D4.b bVar) {
                this.f18674a.i(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f18676b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(InterfaceC1694a interfaceC1694a) {
        synchronized (this) {
            try {
                if (this.f18677c instanceof C1696c) {
                    this.f18678d.add(interfaceC1694a);
                }
                this.f18677c.a(interfaceC1694a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(D4.b bVar) {
        C1629g.f().b("AnalyticsConnector now available.");
        Z3.a aVar = (Z3.a) bVar.get();
        f4.e eVar = new f4.e(aVar);
        e eVar2 = new e();
        if (j(aVar, eVar2) == null) {
            C1629g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        C1629g.f().b("Registered Firebase Analytics listener.");
        C1653d c1653d = new C1653d();
        C1652c c1652c = new C1652c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            try {
                Iterator it = this.f18678d.iterator();
                while (it.hasNext()) {
                    c1653d.a((InterfaceC1694a) it.next());
                }
                eVar2.d(c1653d);
                eVar2.e(c1652c);
                this.f18677c = c1653d;
                this.f18676b = c1652c;
            } finally {
            }
        }
    }

    private static a.InterfaceC0109a j(Z3.a aVar, e eVar) {
        a.InterfaceC0109a interfaceC0109aA = aVar.a("clx", eVar);
        if (interfaceC0109aA == null) {
            C1629g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            interfaceC0109aA = aVar.a("crash", eVar);
            if (interfaceC0109aA != null) {
                C1629g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return interfaceC0109aA;
    }

    public InterfaceC1650a d() {
        return new InterfaceC1650a() { // from class: d4.b
            @Override // f4.InterfaceC1650a
            public final void a(String str, Bundle bundle) {
                this.f18673a.g(str, bundle);
            }
        };
    }

    public InterfaceC1695b e() {
        return new InterfaceC1695b() { // from class: d4.a
            @Override // g4.InterfaceC1695b
            public final void a(InterfaceC1694a interfaceC1694a) {
                this.f18672a.h(interfaceC1694a);
            }
        };
    }

    public d(D4.a aVar, InterfaceC1695b interfaceC1695b, InterfaceC1650a interfaceC1650a) {
        this.f18675a = aVar;
        this.f18677c = interfaceC1695b;
        this.f18678d = new ArrayList();
        this.f18676b = interfaceC1650a;
        f();
    }
}
