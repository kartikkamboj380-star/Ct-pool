package com.android.billingclient.api;

import android.text.TextUtils;
import com.android.billingclient.api.C0753g;
import com.google.android.gms.internal.play_billing.AbstractC1267b;
import com.google.android.gms.internal.play_billing.AbstractC1299j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.billingclient.api.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0750d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f10235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC1299j f10236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f10237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10238g;

    /* JADX INFO: renamed from: com.android.billingclient.api.d$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f10241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private ArrayList f10242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f10243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c.a f10244f;

        /* synthetic */ a(C0.p pVar) {
            c.a aVarA = c.a();
            c.a.e(aVarA);
            this.f10244f = aVarA;
        }

        public C0750d a() {
            ArrayList arrayList = this.f10242d;
            boolean z6 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f10241c;
            boolean z7 = (list == null || list.isEmpty()) ? false : true;
            if (!z6 && !z7) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z6 && z7) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            C0.v vVar = null;
            if (!z6) {
                b bVar = (b) this.f10241c.get(0);
                for (int i7 = 0; i7 < this.f10241c.size(); i7++) {
                    b bVar2 = (b) this.f10241c.get(i7);
                    if (bVar2 == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    }
                    if (i7 != 0 && !bVar2.b().e().equals(bVar.b().e()) && !bVar2.b().e().equals("play_pass_subs")) {
                        throw new IllegalArgumentException("All products should have same ProductType.");
                    }
                }
                String strH = bVar.b().h();
                for (b bVar3 : this.f10241c) {
                    if (!bVar.b().e().equals("play_pass_subs") && !bVar3.b().e().equals("play_pass_subs") && !strH.equals(bVar3.b().h())) {
                        throw new IllegalArgumentException("All products must have the same package name.");
                    }
                }
            } else {
                if (this.f10242d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f10242d.size() > 1) {
                    androidx.appcompat.app.y.a(this.f10242d.get(0));
                    throw null;
                }
            }
            C0750d c0750d = new C0750d(vVar);
            if (z6) {
                androidx.appcompat.app.y.a(this.f10242d.get(0));
                throw null;
            }
            c0750d.f10232a = z7 && !((b) this.f10241c.get(0)).b().h().isEmpty();
            c0750d.f10233b = this.f10239a;
            c0750d.f10234c = this.f10240b;
            c0750d.f10235d = this.f10244f.a();
            ArrayList arrayList2 = this.f10242d;
            c0750d.f10237f = arrayList2 != null ? new ArrayList(arrayList2) : new ArrayList();
            c0750d.f10238g = this.f10243e;
            List list2 = this.f10241c;
            c0750d.f10236e = list2 != null ? AbstractC1299j.p(list2) : AbstractC1299j.q();
            return c0750d;
        }

        public a b(boolean z6) {
            this.f10243e = z6;
            return this;
        }

        public a c(String str) {
            this.f10239a = str;
            return this;
        }

        public a d(String str) {
            this.f10240b = str;
            return this;
        }

        public a e(List list) {
            this.f10241c = new ArrayList(list);
            return this;
        }

        public a f(c cVar) {
            this.f10244f = c.c(cVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0753g f10245a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f10246b;

        /* JADX INFO: renamed from: com.android.billingclient.api.d$b$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private C0753g f10247a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f10248b;

            /* synthetic */ a(C0.q qVar) {
            }

            public b a() {
                AbstractC1267b.c(this.f10247a, "ProductDetails is required for constructing ProductDetailsParams.");
                if (this.f10247a.f() != null) {
                    AbstractC1267b.c(this.f10248b, "offerToken is required for constructing ProductDetailsParams for subscriptions.");
                }
                return new b(this, null);
            }

            public a b(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f10248b = str;
                return this;
            }

            public a c(C0753g c0753g) {
                this.f10247a = c0753g;
                if (c0753g.c() != null) {
                    c0753g.c().getClass();
                    C0753g.b bVarC = c0753g.c();
                    if (bVarC.d() != null) {
                        this.f10248b = bVarC.d();
                    }
                }
                return this;
            }
        }

        /* synthetic */ b(a aVar, C0.r rVar) {
            this.f10245a = aVar.f10247a;
            this.f10246b = aVar.f10248b;
        }

        public static a a() {
            return new a(null);
        }

        public final C0753g b() {
            return this.f10245a;
        }

        public final String c() {
            return this.f10246b;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.d$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10251c = 0;

        /* JADX INFO: renamed from: com.android.billingclient.api.d$c$a */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f10252a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f10253b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f10254c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f10255d = 0;

            /* synthetic */ a(C0.s sVar) {
            }

            static /* synthetic */ a e(a aVar) {
                aVar.f10254c = true;
                return aVar;
            }

            public c a() {
                C0.t tVar = null;
                boolean z6 = (TextUtils.isEmpty(this.f10252a) && TextUtils.isEmpty(null)) ? false : true;
                boolean zIsEmpty = true ^ TextUtils.isEmpty(this.f10253b);
                if (z6 && zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f10254c && !z6 && !zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c(tVar);
                cVar.f10249a = this.f10252a;
                cVar.f10251c = this.f10255d;
                cVar.f10250b = this.f10253b;
                return cVar;
            }

            public a b(String str) {
                this.f10252a = str;
                return this;
            }

            public a c(String str) {
                this.f10253b = str;
                return this;
            }

            public a d(int i7) {
                this.f10255d = i7;
                return this;
            }

            public final a f(String str) {
                this.f10252a = str;
                return this;
            }
        }

        /* synthetic */ c(C0.t tVar) {
        }

        public static a a() {
            return new a(null);
        }

        static /* bridge */ /* synthetic */ a c(c cVar) {
            a aVarA = a();
            aVarA.f(cVar.f10249a);
            aVarA.d(cVar.f10251c);
            aVarA.c(cVar.f10250b);
            return aVarA;
        }

        final int b() {
            return this.f10251c;
        }

        final String d() {
            return this.f10249a;
        }

        final String e() {
            return this.f10250b;
        }
    }

    /* synthetic */ C0750d(C0.v vVar) {
    }

    public static a a() {
        return new a(null);
    }

    public final int b() {
        return this.f10235d.b();
    }

    public final String c() {
        return this.f10233b;
    }

    public final String d() {
        return this.f10234c;
    }

    public final String e() {
        return this.f10235d.d();
    }

    public final String f() {
        return this.f10235d.e();
    }

    public final ArrayList g() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f10237f);
        return arrayList;
    }

    public final List h() {
        return this.f10236e;
    }

    public final boolean p() {
        return this.f10238g;
    }

    final boolean q() {
        return (this.f10233b == null && this.f10234c == null && this.f10235d.e() == null && this.f10235d.b() == 0 && !this.f10232a && !this.f10238g) ? false : true;
    }
}
