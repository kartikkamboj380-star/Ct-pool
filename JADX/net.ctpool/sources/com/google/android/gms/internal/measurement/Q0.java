package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f14315a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14316b;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object k0(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e7) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e7);
            throw e7;
        }
    }

    @Override // com.google.android.gms.internal.measurement.U0
    public final void b(Bundle bundle) {
        synchronized (this.f14315a) {
            try {
                try {
                    this.f14315a.set(bundle);
                    this.f14316b = true;
                } finally {
                    this.f14315a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bundle j0(long j7) {
        Bundle bundle;
        synchronized (this.f14315a) {
            if (!this.f14316b) {
                try {
                    this.f14315a.wait(j7);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f14315a.get();
        }
        return bundle;
    }

    public final Long l0(long j7) {
        return (Long) k0(j0(j7), Long.class);
    }

    public final String m0(long j7) {
        return (String) k0(j0(j7), String.class);
    }
}
