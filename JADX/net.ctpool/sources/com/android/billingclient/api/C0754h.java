package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC1299j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.android.billingclient.api.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0754h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC1299j f10306a;

    /* JADX INFO: renamed from: com.android.billingclient.api.h$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AbstractC1299j f10307a;

        /* synthetic */ a(C0.E e7) {
        }

        public C0754h a() {
            return new C0754h(this, null);
        }

        public a b(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!"play_pass_subs".equals(bVar.c())) {
                    hashSet.add(bVar.c());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f10307a = AbstractC1299j.p(list);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.h$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10309b;

        /* JADX INFO: renamed from: com.android.billingclient.api.h$b$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f10310a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f10311b;

            /* synthetic */ a(C0.F f7) {
            }

            public b a() {
                if ("first_party".equals(this.f10311b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f10310a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f10311b != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public a b(String str) {
                this.f10310a = str;
                return this;
            }

            public a c(String str) {
                this.f10311b = str;
                return this;
            }
        }

        /* synthetic */ b(a aVar, C0.G g7) {
            this.f10308a = aVar.f10310a;
            this.f10309b = aVar.f10311b;
        }

        public static a a() {
            return new a(null);
        }

        public final String b() {
            return this.f10308a;
        }

        public final String c() {
            return this.f10309b;
        }
    }

    /* synthetic */ C0754h(a aVar, C0.H h7) {
        this.f10306a = aVar.f10307a;
    }

    public static a a() {
        return new a(null);
    }

    public final AbstractC1299j b() {
        return this.f10306a;
    }

    public final String c() {
        return ((b) this.f10306a.get(0)).c();
    }
}
