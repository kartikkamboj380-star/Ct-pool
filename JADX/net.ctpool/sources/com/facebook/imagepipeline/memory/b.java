package com.facebook.imagepipeline.memory;

import O0.l;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Queue f10688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10690e;

    public b(int i7, int i8, int i9, boolean z6) {
        l.i(i7 > 0);
        l.i(i8 >= 0);
        l.i(i9 >= 0);
        this.f10686a = i7;
        this.f10687b = i8;
        this.f10688c = new LinkedList();
        this.f10690e = i9;
        this.f10689d = z6;
    }

    void a(Object obj) {
        this.f10688c.add(obj);
    }

    public void b() {
        l.i(this.f10690e > 0);
        this.f10690e--;
    }

    public Object c() {
        Object objG = g();
        if (objG != null) {
            this.f10690e++;
        }
        return objG;
    }

    int d() {
        return this.f10688c.size();
    }

    public void e() {
        this.f10690e++;
    }

    public boolean f() {
        return this.f10690e + d() > this.f10687b;
    }

    public Object g() {
        return this.f10688c.poll();
    }

    public void h(Object obj) {
        int i7;
        l.g(obj);
        if (this.f10689d) {
            l.i(this.f10690e > 0);
            i7 = this.f10690e;
        } else {
            i7 = this.f10690e;
            if (i7 <= 0) {
                P0.a.l("BUCKET", "Tried to release value %s from an empty bucket!", obj);
                return;
            }
        }
        this.f10690e = i7 - 1;
        a(obj);
    }
}
