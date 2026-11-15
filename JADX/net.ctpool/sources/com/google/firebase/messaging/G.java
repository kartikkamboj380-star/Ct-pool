package com.google.firebase.messaging;

import B4.j;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import app.notifee.core.event.LogEvent;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import n3.C1910c;
import z3.AbstractC2272l;
import z3.AbstractC2275o;
import z3.InterfaceC2263c;

/* JADX INFO: loaded from: classes.dex */
class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y3.f f17525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f17526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1910c f17527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final D4.b f17528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final D4.b f17529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final E4.e f17530f;

    G(Y3.f fVar, L l7, D4.b bVar, D4.b bVar2, E4.e eVar) {
        this(fVar, l7, new C1910c(fVar.m()), bVar, bVar2, eVar);
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private AbstractC2272l d(AbstractC2272l abstractC2272l) {
        return abstractC2272l.h(new U.m(), new InterfaceC2263c() { // from class: com.google.firebase.messaging.F
            @Override // z3.InterfaceC2263c
            public final Object a(AbstractC2272l abstractC2272l2) {
                return this.f17502a.j(abstractC2272l2);
            }
        });
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f17525a.q().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String h(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString(LogEvent.LEVEL_ERROR);
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static boolean i(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String j(AbstractC2272l abstractC2272l) {
        return h((Bundle) abstractC2272l.m(IOException.class));
    }

    private void k(String str, String str2, Bundle bundle) {
        j.a aVarB;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f17525a.r().c());
        bundle.putString("gmsv", Integer.toString(this.f17526b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f17526b.a());
        bundle.putString("app_ver_name", this.f17526b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String strB = ((com.google.firebase.installations.g) AbstractC2275o.a(this.f17530f.a(false))).b();
            if (TextUtils.isEmpty(strB)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException e7) {
            e = e7;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e8) {
            e = e8;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) AbstractC2275o.a(this.f17530f.getId()));
        bundle.putString("cliv", "fcm-24.0.3");
        B4.j jVar = (B4.j) this.f17529e.get();
        L4.i iVar = (L4.i) this.f17528d.get();
        if (jVar == null || iVar == null || (aVarB = jVar.b("fire-iid")) == j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarB.h()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    private AbstractC2272l m(String str, String str2, Bundle bundle) {
        try {
            k(str, str2, bundle);
            return this.f17527c.c(bundle);
        } catch (InterruptedException | ExecutionException e7) {
            return AbstractC2275o.e(e7);
        }
    }

    AbstractC2272l c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(m(L.c(this.f17525a), "*", bundle));
    }

    AbstractC2272l f() {
        return this.f17527c.a();
    }

    AbstractC2272l g() {
        return d(m(L.c(this.f17525a), "*", new Bundle()));
    }

    AbstractC2272l l(boolean z6) {
        return this.f17527c.d(z6);
    }

    AbstractC2272l n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(m(str, "/topics/" + str2, bundle));
    }

    AbstractC2272l o(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(m(str, "/topics/" + str2, bundle));
    }

    G(Y3.f fVar, L l7, C1910c c1910c, D4.b bVar, D4.b bVar2, E4.e eVar) {
        this.f17525a = fVar;
        this.f17526b = l7;
        this.f17527c = c1910c;
        this.f17528d = bVar;
        this.f17529e = bVar2;
        this.f17530f = eVar;
    }
}
