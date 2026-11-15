package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.AbstractBinderC1054c0;
import com.google.android.gms.internal.measurement.InterfaceC1063d0;

/* JADX INFO: loaded from: classes.dex */
public final class G2 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ E2 f15574b;

    G2(E2 e22, String str) {
        this.f15574b = e22;
        this.f15573a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f15574b.f15422a.d().J().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            InterfaceC1063d0 interfaceC1063d0J0 = AbstractBinderC1054c0.j0(iBinder);
            if (interfaceC1063d0J0 == null) {
                this.f15574b.f15422a.d().J().a("Install Referrer Service implementation was not found");
            } else {
                this.f15574b.f15422a.d().I().a("Install Referrer Service connected");
                this.f15574b.f15422a.f().B(new F2(this, interfaceC1063d0J0, this));
            }
        } catch (RuntimeException e7) {
            this.f15574b.f15422a.d().J().b("Exception occurred while calling Install Referrer API", e7);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f15574b.f15422a.d().I().a("Install Referrer Service disconnected");
    }
}
