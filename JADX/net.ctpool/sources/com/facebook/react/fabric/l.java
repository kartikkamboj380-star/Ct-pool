package com.facebook.react.fabric;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f11733a = new PriorityQueue(11, Comparator.comparingLong(new ToLongFunction() { // from class: com.facebook.react.fabric.j
        @Override // java.util.function.ToLongFunction
        public final long applyAsLong(Object obj) {
            return ((Long) obj).longValue();
        }
    }));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f11734b = new PriorityQueue(11, new Comparator() { // from class: com.facebook.react.fabric.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return l.h((Long) obj, (Long) obj2);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f11735c = 0.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11736d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f11737e = 0;

    l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int h(Long l7, Long l8) {
        return Long.compare(l8.longValue(), l7.longValue());
    }

    public void c(long j7) {
        Queue queue;
        Queue queue2;
        if (j7 != 0) {
            if (this.f11733a.size() == this.f11734b.size()) {
                this.f11734b.offer(Long.valueOf(j7));
                queue = this.f11733a;
                queue2 = this.f11734b;
            } else {
                this.f11733a.offer(Long.valueOf(j7));
                queue = this.f11734b;
                queue2 = this.f11733a;
            }
            queue.offer((Long) queue2.poll());
        }
        int i7 = this.f11736d;
        int i8 = i7 + 1;
        this.f11736d = i8;
        if (i8 == 1) {
            this.f11735c = j7;
        } else {
            this.f11735c = (this.f11735c / ((double) (i8 / i7))) + (j7 / ((long) i8));
        }
        long j8 = this.f11737e;
        if (j7 <= j8) {
            j7 = j8;
        }
        this.f11737e = j7;
    }

    public double d() {
        return this.f11735c;
    }

    public long e() {
        return this.f11737e;
    }

    public double f() {
        if (this.f11733a.size() == 0 && this.f11734b.size() == 0) {
            return 0.0d;
        }
        return this.f11733a.size() > this.f11734b.size() ? ((Long) this.f11733a.peek()).longValue() : (((Long) this.f11733a.peek()).longValue() + ((Long) this.f11734b.peek()).longValue()) / 2;
    }
}
