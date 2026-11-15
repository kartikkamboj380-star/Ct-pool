package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
final class X implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final V f13593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ zap f13594n;

    X(zap zapVar, V v6) {
        this.f13594n = zapVar;
        this.f13593m = v6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13594n.zaa) {
            ConnectionResult connectionResultB = this.f13593m.b();
            if (connectionResultB.hasResolution()) {
                zap zapVar = this.f13594n;
                zapVar.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(connectionResultB.getResolution()), this.f13593m.a(), false), 1);
                return;
            }
            zap zapVar2 = this.f13594n;
            if (zapVar2.zac.getErrorResolutionIntent(zapVar2.getActivity(), connectionResultB.getErrorCode(), null) != null) {
                zap zapVar3 = this.f13594n;
                zapVar3.zac.zag(zapVar3.getActivity(), zapVar3.mLifecycleFragment, connectionResultB.getErrorCode(), 2, this.f13594n);
                return;
            }
            if (connectionResultB.getErrorCode() != 18) {
                this.f13594n.zaa(connectionResultB, this.f13593m.a());
                return;
            }
            zap zapVar4 = this.f13594n;
            Dialog dialogZab = zapVar4.zac.zab(zapVar4.getActivity(), zapVar4);
            zap zapVar5 = this.f13594n;
            zapVar5.zac.zac(zapVar5.getActivity().getApplicationContext(), new W(this, dialogZab));
        }
    }
}
