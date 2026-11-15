package com.google.firebase.ktx;

import H5.AbstractC0399i0;
import H5.F;
import a4.InterfaceC0514a;
import a4.InterfaceC0515b;
import a4.InterfaceC0516c;
import a4.InterfaceC0517d;
import androidx.annotation.Keep;
import b4.C0684E;
import b4.C0688c;
import b4.C0702q;
import b4.InterfaceC0689d;
import b4.InterfaceC0692g;
import com.google.firebase.components.ComponentRegistrar;
import j5.AbstractC1809n;
import java.util.List;
import java.util.concurrent.Executor;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements InterfaceC0692g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17493a = new a();

        @Override // b4.InterfaceC0692g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F a(InterfaceC0689d interfaceC0689d) {
            Object objE = interfaceC0689d.e(C0684E.a(InterfaceC0514a.class, Executor.class));
            k.e(objE, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC0399i0.a((Executor) objE);
        }
    }

    public static final class b implements InterfaceC0692g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f17494a = new b();

        @Override // b4.InterfaceC0692g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F a(InterfaceC0689d interfaceC0689d) {
            Object objE = interfaceC0689d.e(C0684E.a(InterfaceC0516c.class, Executor.class));
            k.e(objE, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC0399i0.a((Executor) objE);
        }
    }

    public static final class c implements InterfaceC0692g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f17495a = new c();

        @Override // b4.InterfaceC0692g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F a(InterfaceC0689d interfaceC0689d) {
            Object objE = interfaceC0689d.e(C0684E.a(InterfaceC0515b.class, Executor.class));
            k.e(objE, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC0399i0.a((Executor) objE);
        }
    }

    public static final class d implements InterfaceC0692g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f17496a = new d();

        @Override // b4.InterfaceC0692g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F a(InterfaceC0689d interfaceC0689d) {
            Object objE = interfaceC0689d.e(C0684E.a(InterfaceC0517d.class, Executor.class));
            k.e(objE, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC0399i0.a((Executor) objE);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0688c> getComponents() {
        C0688c c0688cD = C0688c.c(C0684E.a(InterfaceC0514a.class, F.class)).b(C0702q.k(C0684E.a(InterfaceC0514a.class, Executor.class))).f(a.f17493a).d();
        k.e(c0688cD, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C0688c c0688cD2 = C0688c.c(C0684E.a(InterfaceC0516c.class, F.class)).b(C0702q.k(C0684E.a(InterfaceC0516c.class, Executor.class))).f(b.f17494a).d();
        k.e(c0688cD2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C0688c c0688cD3 = C0688c.c(C0684E.a(InterfaceC0515b.class, F.class)).b(C0702q.k(C0684E.a(InterfaceC0515b.class, Executor.class))).f(c.f17495a).d();
        k.e(c0688cD3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C0688c c0688cD4 = C0688c.c(C0684E.a(InterfaceC0517d.class, F.class)).b(C0702q.k(C0684E.a(InterfaceC0517d.class, Executor.class))).f(d.f17496a).d();
        k.e(c0688cD4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return AbstractC1809n.k(c0688cD, c0688cD2, c0688cD3, c0688cD4);
    }
}
