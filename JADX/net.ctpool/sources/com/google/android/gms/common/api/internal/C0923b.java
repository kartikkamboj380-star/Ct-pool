package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import n.C1890a;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0923b implements zaca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zabe f13599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Looper f13600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zabi f13601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zabi f13602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f13603f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Api.Client f13605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bundle f13606i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Lock f13610m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f13604g = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ConnectionResult f13607j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ConnectionResult f13608k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f13609l = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f13611n = 0;

    private C0923b(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, Map map2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, Api.Client client, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f13598a = context;
        this.f13599b = zabeVar;
        this.f13610m = lock;
        this.f13600c = looper;
        this.f13605h = client;
        this.f13601d = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new b0(this, null));
        this.f13602e = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new c0(this, null));
        C1890a c1890a = new C1890a();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            c1890a.put((Api.AnyClientKey) it.next(), this.f13601d);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            c1890a.put((Api.AnyClientKey) it2.next(), this.f13602e);
        }
        this.f13603f = Collections.unmodifiableMap(c1890a);
    }

    private final void a(ConnectionResult connectionResult) {
        int i7 = this.f13611n;
        if (i7 == 1) {
            b();
        } else if (i7 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f13599b.zaa(connectionResult);
            b();
        }
        this.f13611n = 0;
    }

    private final void b() {
        Iterator it = this.f13604g.iterator();
        while (it.hasNext()) {
            ((SignInConnectionListener) it.next()).onComplete();
        }
        this.f13604g.clear();
    }

    private final boolean c() {
        ConnectionResult connectionResult = this.f13608k;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final boolean d(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabi zabiVar = (zabi) this.f13603f.get(apiMethodImpl.getClientKey());
        Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zabiVar.equals(this.f13602e);
    }

    private static boolean e(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    public static C0923b g(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList) {
        C1890a c1890a = new C1890a();
        C1890a c1890a2 = new C1890a();
        Api.Client client = null;
        for (Map.Entry entry : map.entrySet()) {
            Api.Client client2 = (Api.Client) entry.getValue();
            if (true == client2.providesSignIn()) {
                client = client2;
            }
            boolean zRequiresSignIn = client2.requiresSignIn();
            Api.AnyClientKey anyClientKey = (Api.AnyClientKey) entry.getKey();
            if (zRequiresSignIn) {
                c1890a.put(anyClientKey, client2);
            } else {
                c1890a2.put(anyClientKey, client2);
            }
        }
        Preconditions.checkState(!c1890a.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C1890a c1890a3 = new C1890a();
        C1890a c1890a4 = new C1890a();
        for (Api api : map2.keySet()) {
            Api.AnyClientKey anyClientKeyZab = api.zab();
            if (c1890a.containsKey(anyClientKeyZab)) {
                c1890a3.put(api, (Boolean) map2.get(api));
            } else {
                if (!c1890a2.containsKey(anyClientKeyZab)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                c1890a4.put(api, (Boolean) map2.get(api));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            zat zatVar = (zat) arrayList.get(i7);
            if (c1890a3.containsKey(zatVar.zaa)) {
                arrayList2.add(zatVar);
            } else {
                if (!c1890a4.containsKey(zatVar.zaa)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(zatVar);
            }
        }
        return new C0923b(context, zabeVar, lock, looper, googleApiAvailabilityLight, c1890a, c1890a2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, c1890a3, c1890a4);
    }

    static /* bridge */ /* synthetic */ void n(C0923b c0923b, int i7, boolean z6) {
        c0923b.f13599b.zac(i7, z6);
        c0923b.f13608k = null;
        c0923b.f13607j = null;
    }

    static /* bridge */ /* synthetic */ void o(C0923b c0923b, Bundle bundle) {
        Bundle bundle2 = c0923b.f13606i;
        if (bundle2 == null) {
            c0923b.f13606i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    static /* bridge */ /* synthetic */ void p(C0923b c0923b) {
        ConnectionResult connectionResult;
        if (!e(c0923b.f13607j)) {
            if (c0923b.f13607j != null && e(c0923b.f13608k)) {
                c0923b.f13602e.zar();
                c0923b.a((ConnectionResult) Preconditions.checkNotNull(c0923b.f13607j));
                return;
            }
            ConnectionResult connectionResult2 = c0923b.f13607j;
            if (connectionResult2 == null || (connectionResult = c0923b.f13608k) == null) {
                return;
            }
            if (c0923b.f13602e.zaf < c0923b.f13601d.zaf) {
                connectionResult2 = connectionResult;
            }
            c0923b.a(connectionResult2);
            return;
        }
        if (e(c0923b.f13608k) || c0923b.c()) {
            int i7 = c0923b.f13611n;
            if (i7 == 1) {
                c0923b.b();
            } else if (i7 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            } else {
                ((zabe) Preconditions.checkNotNull(c0923b.f13599b)).zab(c0923b.f13606i);
                c0923b.b();
            }
            c0923b.f13611n = 0;
            return;
        }
        ConnectionResult connectionResult3 = c0923b.f13608k;
        if (connectionResult3 != null) {
            if (c0923b.f13611n == 1) {
                c0923b.b();
            } else {
                c0923b.a(connectionResult3);
                c0923b.f13601d.zar();
            }
        }
    }

    private final PendingIntent r() {
        Api.Client client = this.f13605h;
        if (client == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f13598a, System.identityHashCode(this.f13599b), client.getSignInIntent(), com.google.android.gms.internal.base.o.f14076a | 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zab() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zac(long j7, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zad(Api api) {
        return Objects.equal(this.f13603f.get(api.zab()), this.f13602e) ? c() ? new ConnectionResult(4, r()) : this.f13602e.zad(api) : this.f13601d.zad(api);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zae(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!d(apiMethodImpl)) {
            this.f13601d.zae(apiMethodImpl);
            return apiMethodImpl;
        }
        if (c()) {
            apiMethodImpl.setFailedResult(new Status(4, (String) null, r()));
            return apiMethodImpl;
        }
        this.f13602e.zae(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final BaseImplementation.ApiMethodImpl zaf(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!d(apiMethodImpl)) {
            return this.f13601d.zaf(apiMethodImpl);
        }
        if (!c()) {
            return this.f13602e.zaf(apiMethodImpl);
        }
        apiMethodImpl.setFailedResult(new Status(4, (String) null, r()));
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
        this.f13611n = 2;
        this.f13609l = false;
        this.f13608k = null;
        this.f13607j = null;
        this.f13601d.zaq();
        this.f13602e.zaq();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
        this.f13608k = null;
        this.f13607j = null;
        this.f13611n = 0;
        this.f13601d.zar();
        this.f13602e.zar();
        b();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f13602e.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f13601d.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
        this.f13601d.zat();
        this.f13602e.zat();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        this.f13610m.lock();
        try {
            boolean zZax = zax();
            this.f13602e.zar();
            this.f13608k = new ConnectionResult(4);
            if (zZax) {
                new com.google.android.gms.internal.base.t(this.f13600c).post(new a0(this));
            } else {
                b();
            }
            this.f13610m.unlock();
        } catch (Throwable th) {
            this.f13610m.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // com.google.android.gms.common.api.internal.zaca
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zaw() {
        this.f13610m.lock();
        try {
            boolean z6 = false;
            if (this.f13601d.zaw()) {
                if (this.f13602e.zaw() || c()) {
                    z6 = true;
                } else if (this.f13611n == 1) {
                }
            }
            return z6;
        } finally {
            this.f13610m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        this.f13610m.lock();
        try {
            return this.f13611n == 2;
        } finally {
            this.f13610m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        this.f13610m.lock();
        try {
            boolean z6 = false;
            if (zax() || zaw()) {
                if (!this.f13602e.zaw()) {
                    this.f13604g.add(signInConnectionListener);
                    z6 = true;
                    if (this.f13611n == 0) {
                        this.f13611n = 1;
                    }
                    this.f13608k = null;
                    this.f13602e.zaq();
                }
            }
            this.f13610m.unlock();
            return z6;
        } catch (Throwable th) {
            this.f13610m.unlock();
            throw th;
        }
    }
}
