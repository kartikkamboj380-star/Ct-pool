package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1071e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final V3.r f14554d = V3.r.u("_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f14556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f14557c;

    public C1071e(String str, long j7, Map map) {
        this.f14555a = str;
        this.f14556b = j7;
        HashMap map2 = new HashMap();
        this.f14557c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        if (!f14554d.contains(str) || !(obj2 instanceof Double)) {
            if (str.startsWith("_")) {
                return ((obj instanceof String) || obj == null) ? obj2 : obj;
            }
            if (obj instanceof Double) {
                return obj2;
            }
            if (!(obj instanceof Long)) {
                return obj instanceof String ? obj2.toString() : obj2;
            }
        }
        return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
    }

    public final long a() {
        return this.f14556b;
    }

    public final Object b(String str) {
        if (this.f14557c.containsKey(str)) {
            return this.f14557c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() {
        return new C1071e(this.f14555a, this.f14556b, new HashMap(this.f14557c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f14557c.remove(str);
        } else {
            this.f14557c.put(str, c(str, this.f14557c.get(str), obj));
        }
    }

    public final String e() {
        return this.f14555a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1071e)) {
            return false;
        }
        C1071e c1071e = (C1071e) obj;
        if (this.f14556b == c1071e.f14556b && this.f14555a.equals(c1071e.f14555a)) {
            return this.f14557c.equals(c1071e.f14557c);
        }
        return false;
    }

    public final void f(String str) {
        this.f14555a = str;
    }

    public final Map g() {
        return this.f14557c;
    }

    public final int hashCode() {
        int iHashCode = this.f14555a.hashCode() * 31;
        long j7 = this.f14556b;
        return ((iHashCode + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f14557c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f14555a + "', timestamp=" + this.f14556b + ", params=" + String.valueOf(this.f14557c) + "}";
    }
}
