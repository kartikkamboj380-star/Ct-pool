package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
abstract class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile zzag f13738e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Context f13740g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final m f13734a = new g(k.i0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final m f13735b = new h(k.i0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final m f13736c = new i(k.i0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final m f13737d = new j(k.i0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f13739f = new Object();

    static q a(String str, k kVar, boolean z6, boolean z7) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return h(str, kVar, z6, z7);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    static q b(String str, boolean z6, boolean z7, boolean z8) {
        return i(str, z6, false, false, true);
    }

    static q c(String str, boolean z6, boolean z7, boolean z8) {
        return i(str, z6, false, false, false);
    }

    static /* synthetic */ String d(boolean z6, String str, k kVar) {
        String str2 = (z6 || !h(str, kVar, true, false).f13743a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestZza = AndroidUtilsLight.zza("SHA-256");
        Preconditions.checkNotNull(messageDigestZza);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, Hex.bytesToStringLowercase(messageDigestZza.digest(kVar.j0())), Boolean.valueOf(z6), "12451000.false");
    }

    static synchronized void e(Context context) {
        if (f13740g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f13740g = context.getApplicationContext();
        }
    }

    static boolean f() {
        boolean zZzg;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                j();
                zZzg = f13738e.zzg();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.a e7) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            zZzg = false;
        }
        return zZzg;
    }

    static boolean g() {
        boolean zZzi;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                j();
                zZzi = f13738e.zzi();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.a e7) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            zZzi = false;
        }
        return zZzi;
    }

    private static q h(final String str, final k kVar, final boolean z6, boolean z7) {
        try {
            j();
            Preconditions.checkNotNull(f13740g);
            try {
                return f13738e.zzh(new zzs(str, kVar, z6, z7), com.google.android.gms.dynamic.b.k0(f13740g.getPackageManager())) ? q.b() : new p(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return o.d(z6, str, kVar);
                    }
                }, null);
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                return q.d("module call", e7);
            }
        } catch (DynamiteModule.a e8) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            return q.d("module init: ".concat(String.valueOf(e8.getMessage())), e8);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, com.google.android.gms.dynamic.a] */
    private static q i(String str, boolean z6, boolean z7, boolean z8, boolean z9) {
        String strConcat;
        q qVarD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(f13740g);
            try {
                j();
                zzo zzoVar = new zzo(str, z6, false, com.google.android.gms.dynamic.b.k0(f13740g), false, true);
                try {
                    zzq zzqVarZze = z9 ? f13738e.zze(zzoVar) : f13738e.zzf(zzoVar);
                    if (zzqVarZze.zzb()) {
                        qVarD = q.f(zzqVarZze.zzc());
                    } else {
                        String strZza = zzqVarZze.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = zzqVarZze.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZza == null) {
                            strZza = "error checking package certificate";
                        }
                        qVarD = q.g(zzqVarZze.zzc(), zzqVarZze.zzd(), strZza, nameNotFoundException);
                    }
                } catch (RemoteException e7) {
                    e = e7;
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    strConcat = "module call";
                    qVarD = q.d(strConcat, e);
                }
            } catch (DynamiteModule.a e8) {
                e = e8;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                strConcat = "module init: ".concat(String.valueOf(e.getMessage()));
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return qVarD;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    private static void j() {
        if (f13738e != null) {
            return;
        }
        Preconditions.checkNotNull(f13740g);
        synchronized (f13739f) {
            try {
                if (f13738e == null) {
                    f13738e = zzaf.zzb(DynamiteModule.d(f13740g, DynamiteModule.f13758f, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
