package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1511w2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H5 f16322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16324c;

    C1511w2(H5 h52) {
        Preconditions.checkNotNull(h52);
        this.f16322a = h52;
    }

    public final void b() {
        this.f16322a.y0();
        this.f16322a.f().l();
        if (this.f16323b) {
            return;
        }
        this.f16322a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f16324c = this.f16322a.n0().A();
        this.f16322a.d().I().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f16324c));
        this.f16323b = true;
    }

    public final void c() {
        this.f16322a.y0();
        this.f16322a.f().l();
        this.f16322a.f().l();
        if (this.f16323b) {
            this.f16322a.d().I().a("Unregistering connectivity change receiver");
            this.f16323b = false;
            this.f16324c = false;
            try {
                this.f16322a.a().unregisterReceiver(this);
            } catch (IllegalArgumentException e7) {
                this.f16322a.d().E().b("Failed to unregister the network broadcast receiver", e7);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f16322a.y0();
        String action = intent.getAction();
        this.f16322a.d().I().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f16322a.d().J().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zA = this.f16322a.n0().A();
        if (this.f16324c != zA) {
            this.f16324c = zA;
            this.f16322a.f().B(new RunnableC1504v2(this, zA));
        }
    }
}
