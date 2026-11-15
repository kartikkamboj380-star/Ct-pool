package com.google.firebase.analytics.connector.internal;

import Z3.a;
import java.util.HashSet;
import java.util.Set;
import v3.C2169a;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Set f17357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.b f17358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C2169a f17359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f17360d;

    public d(C2169a c2169a, a.b bVar) {
        this.f17358b = bVar;
        this.f17359c = c2169a;
        c cVar = new c(this);
        this.f17360d = cVar;
        this.f17359c.b(cVar);
        this.f17357a = new HashSet();
    }
}
