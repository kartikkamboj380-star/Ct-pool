package com.facebook.react.runtime;

import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.react.runtime.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0835a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    volatile Object f12150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f12151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile b f12152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile String f12153d;

    /* JADX INFO: renamed from: com.facebook.react.runtime.a$a, reason: collision with other inner class name */
    interface InterfaceC0216a {
        Object get();
    }

    /* JADX INFO: renamed from: com.facebook.react.runtime.a$b */
    enum b {
        Init,
        Creating,
        Success,
        Failure
    }

    public C0835a() {
        this(null);
    }

    public synchronized Object a() {
        return O1.a.c(this.f12150a);
    }

    public synchronized Object b() {
        return this.f12150a;
    }

    public Object c(InterfaceC0216a interfaceC0216a) {
        boolean z6;
        Object objA;
        Object objA2;
        synchronized (this) {
            try {
                b bVar = this.f12152c;
                b bVar2 = b.Success;
                if (bVar == bVar2) {
                    return a();
                }
                if (this.f12152c == b.Failure) {
                    throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.f12153d);
                }
                b bVar3 = this.f12152c;
                b bVar4 = b.Creating;
                boolean z7 = false;
                if (bVar3 != bVar4) {
                    this.f12152c = bVar4;
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    try {
                        this.f12150a = interfaceC0216a.get();
                        synchronized (this) {
                            this.f12152c = bVar2;
                            notifyAll();
                            objA = a();
                        }
                        return objA;
                    } catch (RuntimeException e7) {
                        synchronized (this) {
                            this.f12152c = b.Failure;
                            this.f12153d = Objects.toString(e7.getMessage(), "null");
                            notifyAll();
                            throw new RuntimeException("BridgelessAtomicRef: Failed to create object.", e7);
                        }
                    }
                }
                synchronized (this) {
                    while (this.f12152c == b.Creating) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            z7 = true;
                        }
                    }
                    if (z7) {
                        Thread.currentThread().interrupt();
                    }
                    if (this.f12152c == b.Failure) {
                        throw new RuntimeException("BridgelessAtomicRef: Failed to create object. Reason: " + this.f12153d);
                    }
                    objA2 = a();
                }
                return objA2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void d() {
        this.f12150a = this.f12151b;
        this.f12152c = b.Init;
        this.f12153d = "";
    }

    public C0835a(Object obj) {
        this.f12150a = obj;
        this.f12151b = obj;
        this.f12152c = b.Init;
        this.f12153d = "";
    }
}
