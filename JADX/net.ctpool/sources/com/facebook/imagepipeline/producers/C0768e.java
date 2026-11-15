package com.facebook.imagepipeline.producers;

import J1.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x1.EnumC2214e;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0768e implements e0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final J1.b f10878m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f10879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f10880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final g0 f10881p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object f10882q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b.c f10883r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Map f10884s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10885t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private EnumC2214e f10886u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10887v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10888w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List f10889x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final y1.m f10890y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Set f10877z = O0.h.c("id", "uri_source");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final Object f10876A = new Object();

    public C0768e(J1.b bVar, String str, g0 g0Var, Object obj, b.c cVar, boolean z6, boolean z7, EnumC2214e enumC2214e, y1.m mVar) {
        this(bVar, str, null, null, g0Var, obj, cVar, z6, z7, enumC2214e, mVar);
    }

    public static void c(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).a();
        }
    }

    public static void h(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).b();
        }
    }

    public static void i(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).d();
        }
    }

    public static void k(List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).c();
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public g0 B() {
        return this.f10881p;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized boolean J() {
        return this.f10887v;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public b.c U() {
        return this.f10883r;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public Object a() {
        return this.f10882q;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized EnumC2214e b() {
        return this.f10886u;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public J1.b d() {
        return this.f10878m;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void e(f0 f0Var) {
        boolean z6;
        synchronized (this) {
            this.f10889x.add(f0Var);
            z6 = this.f10888w;
        }
        if (z6) {
            f0Var.a();
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public y1.m f() {
        return this.f10890y;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void g(String str, String str2) {
        this.f10884s.put("origin", str);
        this.f10884s.put("origin_sub", str2);
    }

    @Override // o1.InterfaceC1940a
    public Map getExtras() {
        return this.f10884s;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public String getId() {
        return this.f10879n;
    }

    @Override // o1.InterfaceC1940a
    public void j(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            w((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public synchronized boolean l() {
        return this.f10885t;
    }

    public void m() {
        c(p());
    }

    @Override // o1.InterfaceC1940a
    public Object n(String str) {
        return this.f10884s.get(str);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public String o() {
        return this.f10880o;
    }

    public synchronized List p() {
        if (this.f10888w) {
            return null;
        }
        this.f10888w = true;
        return new ArrayList(this.f10889x);
    }

    public synchronized List q(boolean z6) {
        if (z6 == this.f10887v) {
            return null;
        }
        this.f10887v = z6;
        return new ArrayList(this.f10889x);
    }

    public synchronized List r(boolean z6) {
        if (z6 == this.f10885t) {
            return null;
        }
        this.f10885t = z6;
        return new ArrayList(this.f10889x);
    }

    public synchronized List s(EnumC2214e enumC2214e) {
        if (enumC2214e == this.f10886u) {
            return null;
        }
        this.f10886u = enumC2214e;
        return new ArrayList(this.f10889x);
    }

    @Override // o1.InterfaceC1940a
    public void w(String str, Object obj) {
        if (f10877z.contains(str)) {
            return;
        }
        this.f10884s.put(str, obj);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    public void z(String str) {
        g(str, "default");
    }

    public C0768e(J1.b bVar, String str, String str2, Map map, g0 g0Var, Object obj, b.c cVar, boolean z6, boolean z7, EnumC2214e enumC2214e, y1.m mVar) {
        this.f10878m = bVar;
        this.f10879n = str;
        HashMap map2 = new HashMap();
        this.f10884s = map2;
        map2.put("id", str);
        map2.put("uri_source", bVar == null ? "null-request" : bVar.u());
        j(map);
        this.f10880o = str2;
        this.f10881p = g0Var;
        this.f10882q = obj == null ? f10876A : obj;
        this.f10883r = cVar;
        this.f10885t = z6;
        this.f10886u = enumC2214e;
        this.f10887v = z7;
        this.f10888w = false;
        this.f10889x = new ArrayList();
        this.f10890y = mVar;
    }
}
