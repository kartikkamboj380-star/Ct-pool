package com.google.firebase.installations;

import G4.d;
import G4.f;
import android.text.TextUtils;
import androidx.appcompat.app.y;
import b4.w;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.installations.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
public class c implements E4.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f17464m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f17465n = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y3.f f17466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G4.c f17467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F4.c f17468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f17469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f17470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final E4.g f17471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f17472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f17473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f17474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f17475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Set f17476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f17477l;

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f17478a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f17478a.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f17480b;

        static {
            int[] iArr = new int[f.b.values().length];
            f17480b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17480b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17480b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f17479a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17479a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    c(final Y3.f fVar, D4.b bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, fVar, new G4.c(fVar.m(), bVar), new F4.c(fVar), i.c(), new w(new D4.b() { // from class: E4.a
            @Override // D4.b
            public final Object get() {
                return com.google.firebase.installations.c.y(fVar);
            }
        }), new E4.g());
    }

    private String A(F4.d dVar) {
        if ((!this.f17466a.q().equals("CHIME_ANDROID_SDK") && !this.f17466a.y()) || !dVar.m()) {
            return this.f17471f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f17471f.a() : strF;
    }

    private F4.d B(F4.d dVar) throws d {
        G4.d dVarD = this.f17467b.d(l(), dVar.d(), t(), m(), (dVar.d() == null || dVar.d().length() != 11) ? null : o().i());
        int i7 = b.f17479a[dVarD.e().ordinal()];
        if (i7 == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f17469d.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i7 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
    }

    private void C(Exception exc) {
        synchronized (this.f17472g) {
            try {
                Iterator it = this.f17477l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void D(F4.d dVar) {
        synchronized (this.f17472g) {
            try {
                Iterator it = this.f17477l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void E(String str) {
        this.f17475j = str;
    }

    private synchronized void F(F4.d dVar, F4.d dVar2) {
        if (this.f17476k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f17476k.iterator();
            if (it.hasNext()) {
                y.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    private AbstractC2272l f() {
        C2273m c2273m = new C2273m();
        h(new e(this.f17469d, c2273m));
        return c2273m.a();
    }

    private AbstractC2272l g() {
        C2273m c2273m = new C2273m();
        h(new f(c2273m));
        return c2273m.a();
    }

    private void h(h hVar) {
        synchronized (this.f17472g) {
            this.f17477l.add(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void v(boolean z6) {
        F4.d dVarB;
        Exception iOException;
        F4.d dVarR = r();
        try {
            if (dVarR.i() || dVarR.l()) {
                dVarB = B(dVarR);
            } else {
                if (!z6 && !this.f17469d.f(dVarR)) {
                    return;
                }
                dVarB = k(dVarR);
            }
            u(dVarB);
            F(dVarR, dVarB);
            if (dVarB.k()) {
                E(dVarB.d());
            }
            if (dVarB.i()) {
                iOException = new d(d.a.BAD_CONFIG);
            } else {
                if (!dVarB.j()) {
                    D(dVarB);
                    return;
                }
                iOException = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
            }
            C(iOException);
        } catch (d e7) {
            C(e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void x(final boolean z6) {
        F4.d dVarS = s();
        if (z6) {
            dVarS = dVarS.p();
        }
        D(dVarS);
        this.f17474i.execute(new Runnable() { // from class: E4.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f1038m.v(z6);
            }
        });
    }

    private F4.d k(F4.d dVar) throws d {
        G4.f fVarE = this.f17467b.e(l(), dVar.d(), t(), dVar.f());
        int i7 = b.f17480b[fVarE.b().ordinal()];
        if (i7 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f17469d.b());
        }
        if (i7 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i7 != 3) {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
        E(null);
        return dVar.r();
    }

    private synchronized String n() {
        return this.f17475j;
    }

    private F4.b o() {
        return (F4.b) this.f17470e.get();
    }

    public static c p() {
        return q(Y3.f.o());
    }

    public static c q(Y3.f fVar) {
        Preconditions.checkArgument(fVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) fVar.k(E4.e.class);
    }

    /* JADX WARN: Finally extract failed */
    private F4.d r() {
        F4.d dVarD;
        synchronized (f17464m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f17466a.m(), "generatefid.lock");
                try {
                    dVarD = this.f17468c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarD;
    }

    /* JADX WARN: Finally extract failed */
    private F4.d s() {
        F4.d dVarD;
        synchronized (f17464m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f17466a.m(), "generatefid.lock");
                try {
                    dVarD = this.f17468c.d();
                    if (dVarD.j()) {
                        dVarD = this.f17468c.b(dVarD.t(A(dVarD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarD;
    }

    /* JADX WARN: Finally extract failed */
    private void u(F4.d dVar) {
        synchronized (f17464m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f17466a.m(), "generatefid.lock");
                try {
                    this.f17468c.b(dVar);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        x(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ F4.b y(Y3.f fVar) {
        return new F4.b(fVar);
    }

    private void z() {
        Preconditions.checkNotEmpty(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(i.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(i.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // E4.e
    public AbstractC2272l a(final boolean z6) {
        z();
        AbstractC2272l abstractC2272lF = f();
        this.f17473h.execute(new Runnable() { // from class: E4.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f1036m.x(z6);
            }
        });
        return abstractC2272lF;
    }

    @Override // E4.e
    public AbstractC2272l getId() {
        z();
        String strN = n();
        if (strN != null) {
            return AbstractC2275o.f(strN);
        }
        AbstractC2272l abstractC2272lG = g();
        this.f17473h.execute(new Runnable() { // from class: E4.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f1035m.w();
            }
        });
        return abstractC2272lG;
    }

    String l() {
        return this.f17466a.r().b();
    }

    String m() {
        return this.f17466a.r().c();
    }

    String t() {
        return this.f17466a.r().g();
    }

    c(ExecutorService executorService, Executor executor, Y3.f fVar, G4.c cVar, F4.c cVar2, i iVar, w wVar, E4.g gVar) {
        this.f17472g = new Object();
        this.f17476k = new HashSet();
        this.f17477l = new ArrayList();
        this.f17466a = fVar;
        this.f17467b = cVar;
        this.f17468c = cVar2;
        this.f17469d = iVar;
        this.f17470e = wVar;
        this.f17471f = gVar;
        this.f17473h = executorService;
        this.f17474i = executor;
    }
}
