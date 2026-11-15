package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzz;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
abstract class k extends zzz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13717a;

    protected k(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 25);
        this.f13717a = Arrays.hashCode(bArr);
    }

    protected static byte[] i0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.dynamic.a aVarZzd;
        if (obj != null && (obj instanceof com.google.android.gms.common.internal.zzaa)) {
            try {
                com.google.android.gms.common.internal.zzaa zzaaVar = (com.google.android.gms.common.internal.zzaa) obj;
                if (zzaaVar.zzc() == this.f13717a && (aVarZzd = zzaaVar.zzd()) != null) {
                    return Arrays.equals(j0(), (byte[]) com.google.android.gms.dynamic.b.j0(aVarZzd));
                }
                return false;
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13717a;
    }

    abstract byte[] j0();

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
        return this.f13717a;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final com.google.android.gms.dynamic.a zzd() {
        return com.google.android.gms.dynamic.b.k0(j0());
    }
}
