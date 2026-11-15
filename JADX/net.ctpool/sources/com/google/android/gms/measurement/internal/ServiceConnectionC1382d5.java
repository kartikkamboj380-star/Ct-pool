package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import w3.InterfaceC2195f;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1382d5 implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f15994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile C1421j2 f15995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ F4 f15996c;

    protected ServiceConnectionC1382d5(F4 f42) {
        this.f15996c = f42;
    }

    public final void a() {
        this.f15996c.l();
        Context contextA = this.f15996c.a();
        synchronized (this) {
            try {
                if (this.f15994a) {
                    this.f15996c.d().I().a("Connection attempt already in progress");
                    return;
                }
                if (this.f15995b != null && (this.f15995b.isConnecting() || this.f15995b.isConnected())) {
                    this.f15996c.d().I().a("Already awaiting connection attempt");
                    return;
                }
                this.f15995b = new C1421j2(contextA, Looper.getMainLooper(), this, this);
                this.f15996c.d().I().a("Connecting to remote service");
                this.f15994a = true;
                Preconditions.checkNotNull(this.f15995b);
                this.f15995b.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Intent intent) {
        this.f15996c.l();
        Context contextA = this.f15996c.a();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            try {
                if (this.f15994a) {
                    this.f15996c.d().I().a("Connection attempt already in progress");
                    return;
                }
                this.f15996c.d().I().a("Using local app measurement service");
                this.f15994a = true;
                connectionTracker.bindService(contextA, intent, this.f15996c.f15448c, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f15995b != null && (this.f15995b.isConnected() || this.f15995b.isConnecting())) {
            this.f15995b.disconnect();
        }
        this.f15995b = null;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.f15995b);
                this.f15996c.f().B(new RunnableC1389e5(this, (InterfaceC2195f) this.f15995b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f15995b = null;
                this.f15994a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        C1449n2 c1449n2C = this.f15996c.f16325a.C();
        if (c1449n2C != null) {
            c1449n2C.J().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f15994a = false;
            this.f15995b = null;
        }
        this.f15996c.f().B(new RunnableC1403g5(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i7) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.f15996c.d().D().a("Service connection suspended");
        this.f15996c.f().B(new RunnableC1410h5(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f15994a = false;
                this.f15996c.d().E().a("Service connected with null binder");
                return;
            }
            InterfaceC2195f c1386e2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c1386e2 = iInterfaceQueryLocalInterface instanceof InterfaceC2195f ? (InterfaceC2195f) iInterfaceQueryLocalInterface : new C1386e2(iBinder);
                    this.f15996c.d().I().a("Bound to IMeasurementService interface");
                } else {
                    this.f15996c.d().E().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f15996c.d().E().a("Service connect failed to get IMeasurementService");
            }
            if (c1386e2 == null) {
                this.f15994a = false;
                try {
                    ConnectionTracker.getInstance().unbindService(this.f15996c.a(), this.f15996c.f15448c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f15996c.f().B(new RunnableC1375c5(this, c1386e2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.f15996c.d().D().a("Service disconnected");
        this.f15996c.f().B(new RunnableC1396f5(this, componentName));
    }
}
