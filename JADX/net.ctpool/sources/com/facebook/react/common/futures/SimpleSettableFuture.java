package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class SimpleSettableFuture implements Future {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final CountDownLatch f11404m = new CountDownLatch(1);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f11405n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Exception f11406o;

    private void a() {
        if (this.f11404m.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    public Object b() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e7) {
            throw new RuntimeException(e7);
        }
    }

    public void c(Object obj) {
        a();
        this.f11405n = obj;
        this.f11404m.countDown();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z6) {
        throw new UnsupportedOperationException();
    }

    public void d(Exception exc) {
        a();
        this.f11406o = exc;
        this.f11404m.countDown();
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        this.f11404m.await();
        if (this.f11406o == null) {
            return this.f11405n;
        }
        throw new ExecutionException(this.f11406o);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f11404m.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j7, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        if (!this.f11404m.await(j7, timeUnit)) {
            throw new TimeoutException("Timed out waiting for result");
        }
        if (this.f11406o == null) {
            return this.f11405n;
        }
        throw new ExecutionException(this.f11406o);
    }
}
