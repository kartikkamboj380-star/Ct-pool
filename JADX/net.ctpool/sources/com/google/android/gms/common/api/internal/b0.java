package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
final class b0 implements zabz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0923b f13612a;

    /* synthetic */ b0(C0923b c0923b, zaw zawVar) {
        this.f13612a = c0923b;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        this.f13612a.f13610m.lock();
        try {
            this.f13612a.f13607j = connectionResult;
            C0923b.p(this.f13612a);
        } finally {
            this.f13612a.f13610m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        this.f13612a.f13610m.lock();
        try {
            C0923b.o(this.f13612a, bundle);
            this.f13612a.f13607j = ConnectionResult.RESULT_SUCCESS;
            C0923b.p(this.f13612a);
        } finally {
            this.f13612a.f13610m.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i7, boolean z6) {
        this.f13612a.f13610m.lock();
        try {
            C0923b c0923b = this.f13612a;
            if (c0923b.f13609l || c0923b.f13608k == null || !c0923b.f13608k.isSuccess()) {
                this.f13612a.f13609l = false;
                C0923b.n(this.f13612a, i7, z6);
            } else {
                this.f13612a.f13609l = true;
                this.f13612a.f13602e.onConnectionSuspended(i7);
            }
            this.f13612a.f13610m.unlock();
        } catch (Throwable th) {
            this.f13612a.f13610m.unlock();
            throw th;
        }
    }
}
