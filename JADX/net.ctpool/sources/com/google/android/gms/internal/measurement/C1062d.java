package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1062d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1071e f14541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1071e f14542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f14543c;

    public C1062d() {
        this.f14541a = new C1071e("", 0L, null);
        this.f14542b = new C1071e("", 0L, null);
        this.f14543c = new ArrayList();
    }

    public final C1071e a() {
        return this.f14541a;
    }

    public final void b(C1071e c1071e) {
        this.f14541a = c1071e;
        this.f14542b = (C1071e) c1071e.clone();
        this.f14543c.clear();
    }

    public final void c(String str, long j7, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, C1071e.c(str2, this.f14541a.b(str2), map.get(str2)));
        }
        this.f14543c.add(new C1071e(str, j7, map2));
    }

    public final /* synthetic */ Object clone() {
        C1062d c1062d = new C1062d((C1071e) this.f14541a.clone());
        Iterator it = this.f14543c.iterator();
        while (it.hasNext()) {
            c1062d.f14543c.add((C1071e) ((C1071e) it.next()).clone());
        }
        return c1062d;
    }

    public final C1071e d() {
        return this.f14542b;
    }

    public final void e(C1071e c1071e) {
        this.f14542b = c1071e;
    }

    public final List f() {
        return this.f14543c;
    }

    private C1062d(C1071e c1071e) {
        this.f14541a = c1071e;
        this.f14542b = (C1071e) c1071e.clone();
        this.f14543c = new ArrayList();
    }
}
