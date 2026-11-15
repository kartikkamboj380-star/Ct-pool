package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import java.util.concurrent.atomic.AtomicReference;
import z3.C2273m;

/* JADX INFO: loaded from: classes.dex */
final class g extends zaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f13726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2273m f13727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ InstallStatusListener f13728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ zay f13729d;

    g(zay zayVar, AtomicReference atomicReference, C2273m c2273m, InstallStatusListener installStatusListener) {
        this.f13729d = zayVar;
        this.f13726a = atomicReference;
        this.f13727b = c2273m;
        this.f13728c = installStatusListener;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.f13726a.set(moduleInstallResponse);
        }
        TaskUtil.trySetResultOrApiException(status, null, this.f13727b);
        if (!status.isSuccess() || (moduleInstallResponse != null && moduleInstallResponse.zaa())) {
            this.f13729d.doUnregisterEventListener(ListenerHolders.createListenerKey(this.f13728c, InstallStatusListener.class.getSimpleName()), 27306);
        }
    }
}
