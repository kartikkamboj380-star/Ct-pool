package com.google.firebase.crashlytics;

import D4.a;
import E4.e;
import Y3.f;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import d4.d;
import d4.g;
import e4.C1626d;
import e4.C1628f;
import e4.C1629g;
import e4.l;
import h4.AbstractC1721j;
import h4.C1710A;
import h4.C1713b;
import h4.C1718g;
import h4.C1725n;
import h4.G;
import h4.L;
import java.util.List;
import java.util.concurrent.ExecutorService;
import m4.b;
import n4.C1928g;
import p4.C1976g;
import z3.AbstractC2272l;
import z3.InterfaceC2267g;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCrashlytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C1710A f17421a;

    private FirebaseCrashlytics(C1710A c1710a) {
        this.f17421a = c1710a;
    }

    static FirebaseCrashlytics b(f fVar, e eVar, a aVar, a aVar2, a aVar3, ExecutorService executorService, ExecutorService executorService2) {
        Context contextM = fVar.m();
        String packageName = contextM.getPackageName();
        C1629g.f().g("Initializing Firebase Crashlytics " + C1710A.q() + " for " + packageName);
        i4.f fVar2 = new i4.f(executorService, executorService2);
        C1928g c1928g = new C1928g(contextM);
        G g7 = new G(fVar);
        L l7 = new L(contextM, packageName, eVar, g7);
        C1626d c1626d = new C1626d(aVar);
        d dVar = new d(aVar2);
        C1725n c1725n = new C1725n(g7, c1928g);
        O4.a.e(c1725n);
        C1710A c1710a = new C1710A(fVar, l7, c1626d, g7, dVar.e(), dVar.d(), c1928g, c1725n, new l(aVar3), fVar2);
        String strC = fVar.r().c();
        String strM = AbstractC1721j.m(contextM);
        List<C1718g> listJ = AbstractC1721j.j(contextM);
        C1629g.f().b("Mapping file ID is: " + strM);
        for (C1718g c1718g : listJ) {
            C1629g.f().b(String.format("Build id for %s on %s: %s", c1718g.c(), c1718g.a(), c1718g.b()));
        }
        try {
            C1713b c1713bA = C1713b.a(contextM, l7, strC, strM, listJ, new C1628f(contextM));
            C1629g.f().i("Installer package name is: " + c1713bA.f19711d);
            C1976g c1976gL = C1976g.l(contextM, strC, l7, new b(), c1713bA.f19713f, c1713bA.f19714g, c1928g, g7);
            c1976gL.o(fVar2).e(new InterfaceC2267g() { // from class: d4.h
                @Override // z3.InterfaceC2267g
                public final void c(Exception exc) {
                    FirebaseCrashlytics.c(exc);
                }
            });
            if (c1710a.F(c1713bA, c1976gL)) {
                c1710a.o(c1976gL);
            }
            return new FirebaseCrashlytics(c1710a);
        } catch (PackageManager.NameNotFoundException e7) {
            C1629g.f().e("Error retrieving app package info.", e7);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Exception exc) {
        C1629g.f().e("Error fetching settings.", exc);
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) f.o().k(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public AbstractC2272l checkForUnsentReports() {
        return this.f17421a.j();
    }

    public void deleteUnsentReports() {
        this.f17421a.k();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.f17421a.l();
    }

    public boolean isCrashlyticsCollectionEnabled() {
        return this.f17421a.s();
    }

    public void log(String str) {
        this.f17421a.B(str);
    }

    public void recordException(Throwable th) {
        if (th == null) {
            C1629g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f17421a.C(th);
        }
    }

    public void sendUnsentReports() {
        this.f17421a.G();
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.f17421a.H(bool);
    }

    public void setCustomKey(String str, double d7) {
        this.f17421a.I(str, Double.toString(d7));
    }

    public void setCustomKeys(g gVar) {
        throw null;
    }

    public void setUserId(String str) {
        this.f17421a.J(str);
    }

    public void setCrashlyticsCollectionEnabled(boolean z6) {
        this.f17421a.H(Boolean.valueOf(z6));
    }

    public void setCustomKey(String str, float f7) {
        this.f17421a.I(str, Float.toString(f7));
    }

    public void setCustomKey(String str, int i7) {
        this.f17421a.I(str, Integer.toString(i7));
    }

    public void setCustomKey(String str, long j7) {
        this.f17421a.I(str, Long.toString(j7));
    }

    public void setCustomKey(String str, String str2) {
        this.f17421a.I(str, str2);
    }

    public void setCustomKey(String str, boolean z6) {
        this.f17421a.I(str, Boolean.toString(z6));
    }
}
