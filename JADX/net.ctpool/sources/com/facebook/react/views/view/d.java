package com.facebook.react.views.view;

import y5.AbstractC2249a;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f13248a = new d();

    private d() {
    }

    private final int a(double d7) {
        return Math.max(0, Math.min(255, AbstractC2249a.a(d7)));
    }

    public static final int b(double d7, double d8, double d9, double d10) {
        d dVar = f13248a;
        return (dVar.a(d7) << 16) | (dVar.a(d10 * ((double) 255)) << 24) | (dVar.a(d8) << 8) | dVar.a(d9);
    }
}
