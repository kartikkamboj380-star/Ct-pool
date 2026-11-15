package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class c0 implements zabz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0923b f13615a;

    /* synthetic */ c0(C0923b c0923b, zay zayVar) {
        this.f13615a = c0923b;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        this.f13615a.f13610m.lock();
        try {
            this.f13615a.f13608k = connectionResult;
            C0923b.p(this.f13615a);
        } finally {
            this.f13615a.f13610m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        this.f13615a.f13610m.lock();
        try {
            this.f13615a.f13608k = ConnectionResult.RESULT_SUCCESS;
            C0923b.p(this.f13615a);
        } finally {
            this.f13615a.f13610m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i7, boolean z6) {
        this.f13615a.f13610m.lock();
        try {
            C0923b c0923b = this.f13615a;
            if (c0923b.f13609l) {
                c0923b.f13609l = false;
                C0923b.n(this.f13615a, i7, z6);
            } else {
                c0923b.f13609l = true;
                this.f13615a.f13601d.onConnectionSuspended(i7);
            }
            this.f13615a.f13610m.unlock();
        } catch (Throwable th) {
            this.f13615a.f13610m.unlock();
            throw th;
        }
    }
}
