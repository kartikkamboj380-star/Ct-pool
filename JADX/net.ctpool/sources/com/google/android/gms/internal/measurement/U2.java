package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class U2 implements R2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f14371a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap f14372b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f14373c = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f14374d = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f14375e = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f14376f = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f14377g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f14378h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f14379i = new String[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final X2 f14380j = new V2();

    @Override // com.google.android.gms.internal.measurement.R2
    public final String a(ContentResolver contentResolver, String str, String str2) {
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                if (this.f14372b == null) {
                    this.f14371a.set(false);
                    this.f14372b = new HashMap(16, 1.0f);
                    this.f14377g = new Object();
                    contentResolver.registerContentObserver(P2.f14305a, true, new W2(this, null));
                } else if (this.f14371a.getAndSet(false)) {
                    this.f14372b.clear();
                    this.f14373c.clear();
                    this.f14374d.clear();
                    this.f14375e.clear();
                    this.f14376f.clear();
                    this.f14377g = new Object();
                    this.f14378h = false;
                }
                Object obj = this.f14377g;
                if (this.f14372b.containsKey(str)) {
                    String str3 = (String) this.f14372b.get(str);
                    return str3 != null ? str3 : null;
                }
                for (String str4 : this.f14379i) {
                    if (str.startsWith(str4)) {
                        if (!this.f14378h) {
                            try {
                                HashMap map = (HashMap) this.f14380j.b(contentResolver, this.f14379i, new Y2() { // from class: com.google.android.gms.internal.measurement.T2
                                    @Override // com.google.android.gms.internal.measurement.Y2
                                    public final Map d(int i7) {
                                        return new HashMap(i7, 1.0f);
                                    }
                                });
                                if (!map.isEmpty()) {
                                    Set setKeySet = map.keySet();
                                    setKeySet.removeAll(this.f14373c.keySet());
                                    setKeySet.removeAll(this.f14374d.keySet());
                                    setKeySet.removeAll(this.f14375e.keySet());
                                    setKeySet.removeAll(this.f14376f.keySet());
                                }
                                if (!map.isEmpty()) {
                                    if (this.f14372b.isEmpty()) {
                                        this.f14372b = map;
                                    } else {
                                        this.f14372b.putAll(map);
                                    }
                                }
                                this.f14378h = true;
                            } catch (C1039a3 unused) {
                            }
                            if (this.f14372b.containsKey(str)) {
                                String str5 = (String) this.f14372b.get(str);
                                return str5 != null ? str5 : null;
                            }
                        }
                        return null;
                    }
                }
                try {
                    String strA = this.f14380j.a(contentResolver, str);
                    if (strA != null && strA.equals(null)) {
                        strA = null;
                    }
                    synchronized (this) {
                        try {
                            if (obj == this.f14377g) {
                                this.f14372b.put(str, strA);
                            }
                        } finally {
                        }
                    }
                    if (strA != null) {
                        return strA;
                    }
                    return null;
                } catch (C1039a3 unused2) {
                    return null;
                }
            } finally {
            }
        }
    }
}
