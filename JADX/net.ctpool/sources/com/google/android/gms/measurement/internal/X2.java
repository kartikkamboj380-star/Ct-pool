package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.C1071e;
import com.google.android.gms.internal.measurement.C1072e0;
import com.google.android.gms.internal.measurement.C1212t6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import w3.C2191b;

/* JADX INFO: loaded from: classes.dex */
public final class X2 extends w3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H5 f15844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f15845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f15846c;

    public X2(H5 h52) {
        this(h52, null);
    }

    private final void l0(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.f15844a.f().H()) {
            runnable.run();
        } else {
            this.f15844a.f().E(runnable);
        }
    }

    private final void m0(String str, boolean z6) {
        if (TextUtils.isEmpty(str)) {
            this.f15844a.d().E().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z6) {
            try {
                if (this.f15845b == null) {
                    this.f15845b = Boolean.valueOf("com.google.android.gms".equals(this.f15846c) || UidVerifier.isGooglePlayServicesUid(this.f15844a.a(), Binder.getCallingUid()) || GoogleSignatureVerifier.getInstance(this.f15844a.a()).isUidGoogleSigned(Binder.getCallingUid()));
                }
                if (this.f15845b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e7) {
                this.f15844a.d().E().b("Measurement Service called with invalid calling package. appId", C1449n2.t(str));
                throw e7;
            }
        }
        if (this.f15846c == null && GooglePlayServicesUtilLight.uidHasPackageName(this.f15844a.a(), Binder.getCallingUid(), str)) {
            this.f15846c = str;
        }
        if (str.equals(this.f15846c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    private final void p0(M5 m52, boolean z6) {
        Preconditions.checkNotNull(m52);
        Preconditions.checkNotEmpty(m52.f15695m);
        m0(m52.f15695m, false);
        this.f15844a.w0().i0(m52.f15696n, m52.f15679C);
    }

    private final void q0(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.f15844a.f().H()) {
            runnable.run();
        } else {
            this.f15844a.f().B(runnable);
        }
    }

    private final void s0(E e7, M5 m52) {
        this.f15844a.x0();
        this.f15844a.t(e7, m52);
    }

    @Override // w3.InterfaceC2195f
    public final void B(long j7, String str, String str2, String str3) {
        q0(new RunnableC1394f3(this, str2, str3, str, j7));
    }

    @Override // w3.InterfaceC2195f
    public final void C(M5 m52) {
        p0(m52, false);
        q0(new RunnableC1401g3(this, m52));
    }

    @Override // w3.InterfaceC2195f
    public final List D(String str, String str2, String str3) {
        m0(str, true);
        try {
            return (List) this.f15844a.f().u(new CallableC1436l3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e7) {
            this.f15844a.d().E().b("Failed to get conditional user properties as", e7);
            return Collections.emptyList();
        }
    }

    @Override // w3.InterfaceC2195f
    public final void F(C1383e c1383e) {
        Preconditions.checkNotNull(c1383e);
        Preconditions.checkNotNull(c1383e.f16007o);
        Preconditions.checkNotEmpty(c1383e.f16005m);
        m0(c1383e.f16005m, true);
        q0(new RunnableC1408h3(this, new C1383e(c1383e)));
    }

    @Override // w3.InterfaceC2195f
    public final void J(E e7, String str, String str2) {
        Preconditions.checkNotNull(e7);
        Preconditions.checkNotEmpty(str);
        m0(str, true);
        q0(new RunnableC1484s3(this, e7, str));
    }

    @Override // w3.InterfaceC2195f
    public final void M(final M5 m52) {
        Preconditions.checkNotEmpty(m52.f15695m);
        Preconditions.checkNotNull(m52.f15684H);
        l0(new Runnable() { // from class: com.google.android.gms.measurement.internal.a3
            @Override // java.lang.Runnable
            public final void run() {
                this.f15896m.u0(m52);
            }
        });
    }

    @Override // w3.InterfaceC2195f
    public final C2191b P(M5 m52) {
        p0(m52, false);
        Preconditions.checkNotEmpty(m52.f15695m);
        try {
            return (C2191b) this.f15844a.f().z(new CallableC1471q3(this, m52)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e7) {
            this.f15844a.d().E().c("Failed to get consent. appId", C1449n2.t(m52.f15695m), e7);
            return new C2191b(null);
        }
    }

    @Override // w3.InterfaceC2195f
    public final List R(String str, String str2, boolean z6, M5 m52) {
        p0(m52, false);
        String str3 = m52.f15695m;
        Preconditions.checkNotNull(str3);
        try {
            List<a6> list = (List) this.f15844a.f().u(new CallableC1429k3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (a6 a6Var : list) {
                if (z6 || !d6.H0(a6Var.f15908c)) {
                    arrayList.add(new Y5(a6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f15844a.d().E().c("Failed to query user properties. appId", C1449n2.t(m52.f15695m), e);
            return Collections.emptyList();
        } catch (ExecutionException e8) {
            e = e8;
            this.f15844a.d().E().c("Failed to query user properties. appId", C1449n2.t(m52.f15695m), e);
            return Collections.emptyList();
        }
    }

    @Override // w3.InterfaceC2195f
    public final void S(final M5 m52) {
        Preconditions.checkNotEmpty(m52.f15695m);
        Preconditions.checkNotNull(m52.f15684H);
        l0(new Runnable() { // from class: com.google.android.gms.measurement.internal.c3
            @Override // java.lang.Runnable
            public final void run() {
                this.f15979m.t0(m52);
            }
        });
    }

    @Override // w3.InterfaceC2195f
    public final List T(M5 m52, Bundle bundle) {
        p0(m52, false);
        Preconditions.checkNotNull(m52.f15695m);
        try {
            return (List) this.f15844a.f().u(new CallableC1491t3(this, m52, bundle)).get();
        } catch (InterruptedException | ExecutionException e7) {
            this.f15844a.d().E().c("Failed to get trigger URIs. appId", C1449n2.t(m52.f15695m), e7);
            return Collections.emptyList();
        }
    }

    @Override // w3.InterfaceC2195f
    public final byte[] U(E e7, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(e7);
        m0(str, true);
        this.f15844a.d().D().b("Log and bundle. event", this.f15844a.l0().c(e7.f15418m));
        long jNanoTime = this.f15844a.zzb().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f15844a.f().z(new CallableC1477r3(this, e7, str)).get();
            if (bArr == null) {
                this.f15844a.d().E().b("Log and bundle returned null. appId", C1449n2.t(str));
                bArr = new byte[0];
            }
            this.f15844a.d().D().d("Log and bundle processed. event, size, time_ms", this.f15844a.l0().c(e7.f15418m), Integer.valueOf(bArr.length), Long.valueOf((this.f15844a.zzb().nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e8) {
            e = e8;
            this.f15844a.d().E().d("Failed to log and bundle. appId, event, error", C1449n2.t(str), this.f15844a.l0().c(e7.f15418m), e);
            return null;
        } catch (ExecutionException e9) {
            e = e9;
            this.f15844a.d().E().d("Failed to log and bundle. appId, event, error", C1449n2.t(str), this.f15844a.l0().c(e7.f15418m), e);
            return null;
        }
    }

    @Override // w3.InterfaceC2195f
    public final List Y(M5 m52, boolean z6) {
        p0(m52, false);
        String str = m52.f15695m;
        Preconditions.checkNotNull(str);
        try {
            List<a6> list = (List) this.f15844a.f().u(new CallableC1519x3(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (a6 a6Var : list) {
                if (z6 || !d6.H0(a6Var.f15908c)) {
                    arrayList.add(new Y5(a6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f15844a.d().E().c("Failed to get user properties. appId", C1449n2.t(m52.f15695m), e);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            this.f15844a.d().E().c("Failed to get user properties. appId", C1449n2.t(m52.f15695m), e);
            return null;
        }
    }

    @Override // w3.InterfaceC2195f
    public final List c(String str, String str2, M5 m52) {
        p0(m52, false);
        String str3 = m52.f15695m;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.f15844a.f().u(new CallableC1443m3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e7) {
            this.f15844a.d().E().b("Failed to get conditional user properties", e7);
            return Collections.emptyList();
        }
    }

    @Override // w3.InterfaceC2195f
    public final void d(final Bundle bundle, M5 m52) {
        if (C1212t6.a() && this.f15844a.g0().r(G.f15531h1)) {
            p0(m52, false);
            final String str = m52.f15695m;
            Preconditions.checkNotNull(str);
            q0(new Runnable() { // from class: com.google.android.gms.measurement.internal.Z2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15882m.o0(bundle, str);
                }
            });
        }
    }

    @Override // w3.InterfaceC2195f
    public final void d0(M5 m52) {
        p0(m52, false);
        q0(new RunnableC1387e3(this, m52));
    }

    @Override // w3.InterfaceC2195f
    public final void e(M5 m52) {
        p0(m52, false);
        q0(new RunnableC1380d3(this, m52));
    }

    @Override // w3.InterfaceC2195f
    public final void g0(E e7, M5 m52) {
        Preconditions.checkNotNull(e7);
        p0(m52, false);
        q0(new RunnableC1464p3(this, e7, m52));
    }

    final /* synthetic */ void k0(Bundle bundle, String str) {
        boolean zR = this.f15844a.g0().r(G.f15525f1);
        boolean zR2 = this.f15844a.g0().r(G.f15531h1);
        if (bundle.isEmpty() && zR && zR2) {
            this.f15844a.j0().b1(str);
            return;
        }
        this.f15844a.j0().D0(str, bundle);
        if (zR2 && this.f15844a.j0().f1(str)) {
            this.f15844a.j0().V(str, bundle);
        }
    }

    @Override // w3.InterfaceC2195f
    public final List l(String str, String str2, String str3, boolean z6) {
        m0(str, true);
        try {
            List<a6> list = (List) this.f15844a.f().u(new CallableC1422j3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (a6 a6Var : list) {
                if (z6 || !d6.H0(a6Var.f15908c)) {
                    arrayList.add(new Y5(a6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e7) {
            e = e7;
            this.f15844a.d().E().c("Failed to get user properties as. appId", C1449n2.t(str), e);
            return Collections.emptyList();
        } catch (ExecutionException e8) {
            e = e8;
            this.f15844a.d().E().c("Failed to get user properties as. appId", C1449n2.t(str), e);
            return Collections.emptyList();
        }
    }

    final E n0(E e7, M5 m52) {
        D d7;
        if ("_cmp".equals(e7.f15418m) && (d7 = e7.f15419n) != null && d7.zza() != 0) {
            String strS0 = e7.f15419n.S0("_cis");
            if ("referrer broadcast".equals(strS0) || "referrer API".equals(strS0)) {
                this.f15844a.d().H().b("Event has been filtered ", e7.toString());
                return new E("_cmpx", e7.f15419n, e7.f15420o, e7.f15421p);
            }
        }
        return e7;
    }

    final /* synthetic */ void o0(Bundle bundle, String str) {
        if (bundle.isEmpty()) {
            this.f15844a.j0().b1(str);
        } else {
            this.f15844a.j0().D0(str, bundle);
            this.f15844a.j0().V(str, bundle);
        }
    }

    @Override // w3.InterfaceC2195f
    public final void p(M5 m52) {
        Preconditions.checkNotEmpty(m52.f15695m);
        m0(m52.f15695m, false);
        q0(new RunnableC1457o3(this, m52));
    }

    @Override // w3.InterfaceC2195f
    public final void q(final Bundle bundle, M5 m52) {
        p0(m52, false);
        final String str = m52.f15695m;
        Preconditions.checkNotNull(str);
        q0(new Runnable() { // from class: com.google.android.gms.measurement.internal.b3
            @Override // java.lang.Runnable
            public final void run() {
                this.f15924m.k0(bundle, str);
            }
        });
    }

    @Override // w3.InterfaceC2195f
    public final void r(M5 m52) {
        Preconditions.checkNotEmpty(m52.f15695m);
        Preconditions.checkNotNull(m52.f15684H);
        l0(new RunnableC1450n3(this, m52));
    }

    final void r0(E e7, M5 m52) {
        boolean zD;
        if (!this.f15844a.p0().U(m52.f15695m)) {
            s0(e7, m52);
            return;
        }
        this.f15844a.d().I().b("EES config found for", m52.f15695m);
        I2 i2P0 = this.f15844a.p0();
        String str = m52.f15695m;
        com.google.android.gms.internal.measurement.C c7 = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.C) i2P0.f15628j.c(str);
        if (c7 == null) {
            this.f15844a.d().I().b("EES not loaded for", m52.f15695m);
        } else {
            try {
                Map mapO = this.f15844a.v0().O(e7.f15419n.n0(), true);
                String strA = w3.s.a(e7.f15418m);
                if (strA == null) {
                    strA = e7.f15418m;
                }
                zD = c7.d(new C1071e(strA, e7.f15421p, mapO));
            } catch (C1072e0 unused) {
                this.f15844a.d().E().c("EES error. appId, eventName", m52.f15696n, e7.f15418m);
                zD = false;
            }
            if (zD) {
                if (c7.g()) {
                    this.f15844a.d().I().b("EES edited event", e7.f15418m);
                    e7 = this.f15844a.v0().F(c7.a().d());
                }
                s0(e7, m52);
                if (c7.f()) {
                    for (C1071e c1071e : c7.a().f()) {
                        this.f15844a.d().I().b("EES logging created event", c1071e.e());
                        s0(this.f15844a.v0().F(c1071e), m52);
                    }
                    return;
                }
                return;
            }
            this.f15844a.d().I().b("EES was not applied to event", e7.f15418m);
        }
        s0(e7, m52);
    }

    @Override // w3.InterfaceC2195f
    public final void s(Y5 y52, M5 m52) {
        Preconditions.checkNotNull(y52);
        p0(m52, false);
        q0(new RunnableC1498u3(this, y52, m52));
    }

    final /* synthetic */ void t0(M5 m52) {
        this.f15844a.x0();
        this.f15844a.k0(m52);
    }

    final /* synthetic */ void u0(M5 m52) {
        this.f15844a.x0();
        this.f15844a.m0(m52);
    }

    @Override // w3.InterfaceC2195f
    public final String w(M5 m52) {
        p0(m52, false);
        return this.f15844a.T(m52);
    }

    @Override // w3.InterfaceC2195f
    public final void y(C1383e c1383e, M5 m52) {
        Preconditions.checkNotNull(c1383e);
        Preconditions.checkNotNull(c1383e.f16007o);
        p0(m52, false);
        C1383e c1383e2 = new C1383e(c1383e);
        c1383e2.f16005m = m52.f15695m;
        q0(new RunnableC1415i3(this, c1383e2, m52));
    }

    private X2(H5 h52, String str) {
        Preconditions.checkNotNull(h52);
        this.f15844a = h52;
        this.f15846c = null;
    }
}
