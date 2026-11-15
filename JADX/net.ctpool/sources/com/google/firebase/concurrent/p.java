package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class p extends androidx.concurrent.futures.a implements ScheduledFuture {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ScheduledFuture f17417t;

    class a implements b {
        a() {
        }

        @Override // com.google.firebase.concurrent.p.b
        public void a(Throwable th) {
            p.this.w(th);
        }

        @Override // com.google.firebase.concurrent.p.b
        public void set(Object obj) {
            p.this.v(obj);
        }
    }

    interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    interface c {
        ScheduledFuture a(b bVar);
    }

    p(c cVar) {
        this.f17417t = cVar.a(new a());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f17417t.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f17417t.getDelay(timeUnit);
    }

    @Override // androidx.concurrent.futures.a
    protected void j() {
        this.f17417t.cancel(y());
    }
}
