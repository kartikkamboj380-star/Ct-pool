package com.RNAppleAuthentication;

import com.google.android.gms.common.Scopes;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p5.AbstractC1978a;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f10129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f10130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f10131f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f10132g;

    /* JADX INFO: renamed from: com.RNAppleAuthentication.a$a, reason: collision with other inner class name */
    public static final class C0194a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f10133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f10137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f10138f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f10139g;

        public final a a() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8 = this.f10133a;
            if (str8 == null) {
                k.t("clientId");
                str = null;
            } else {
                str = str8;
            }
            String str9 = this.f10134b;
            if (str9 == null) {
                k.t("redirectUri");
                str2 = null;
            } else {
                str2 = str9;
            }
            String str10 = this.f10135c;
            if (str10 == null) {
                k.t("scope");
                str3 = null;
            } else {
                str3 = str10;
            }
            String str11 = this.f10136d;
            if (str11 == null) {
                k.t("responseType");
                str4 = null;
            } else {
                str4 = str11;
            }
            String str12 = this.f10137e;
            if (str12 == null) {
                k.t("state");
                str5 = null;
            } else {
                str5 = str12;
            }
            String str13 = this.f10138f;
            if (str13 == null) {
                k.t("rawNonce");
                str6 = null;
            } else {
                str6 = str13;
            }
            String str14 = this.f10139g;
            if (str14 == null) {
                k.t("nonce");
                str7 = null;
            } else {
                str7 = str14;
            }
            return new a(str, str2, str3, str4, str5, str6, str7, null);
        }

        public final C0194a b(String str) {
            k.f(str, "clientId");
            this.f10133a = str;
            return this;
        }

        public final C0194a c(String str) {
            k.f(str, "nonce");
            this.f10139g = str;
            return this;
        }

        public final C0194a d(String str) {
            k.f(str, "rawNonce");
            this.f10138f = str;
            return this;
        }

        public final C0194a e(String str) {
            k.f(str, "redirectUri");
            this.f10134b = str;
            return this;
        }

        public final C0194a f(b bVar) {
            k.f(bVar, "type");
            this.f10136d = bVar.h();
            return this;
        }

        public final C0194a g(c cVar) {
            k.f(cVar, "scope");
            this.f10135c = cVar.h();
            return this;
        }

        public final C0194a h(String str) {
            k.f(str, "state");
            this.f10137e = str;
            return this;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final b f10140m = new C0196b("CODE", 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f10141n = new c("ID_TOKEN", 1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final b f10142o = new C0195a("ALL", 2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ b[] f10143p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f10144q;

        /* JADX INFO: renamed from: com.RNAppleAuthentication.a$b$a, reason: collision with other inner class name */
        static final class C0195a extends b {
            C0195a(String str, int i7) {
                super(str, i7, null);
            }

            @Override // com.RNAppleAuthentication.a.b
            public String h() {
                return "code id_token";
            }
        }

        /* JADX INFO: renamed from: com.RNAppleAuthentication.a$b$b, reason: collision with other inner class name */
        static final class C0196b extends b {
            C0196b(String str, int i7) {
                super(str, i7, null);
            }

            @Override // com.RNAppleAuthentication.a.b
            public String h() {
                return "code";
            }
        }

        static final class c extends b {
            c(String str, int i7) {
                super(str, i7, null);
            }

            @Override // com.RNAppleAuthentication.a.b
            public String h() {
                return "id_token";
            }
        }

        static {
            b[] bVarArrE = e();
            f10143p = bVarArrE;
            f10144q = AbstractC1978a.a(bVarArrE);
        }

        private b(String str, int i7) {
        }

        private static final /* synthetic */ b[] e() {
            return new b[]{f10140m, f10141n, f10142o};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f10143p.clone();
        }

        public abstract String h();

        public /* synthetic */ b(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i7);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final c f10145m = new C0198c("NAME", 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final c f10146n = new b("EMAIL", 1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final c f10147o = new C0197a("ALL", 2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ c[] f10148p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f10149q;

        /* JADX INFO: renamed from: com.RNAppleAuthentication.a$c$a, reason: collision with other inner class name */
        static final class C0197a extends c {
            C0197a(String str, int i7) {
                super(str, i7, null);
            }

            @Override // com.RNAppleAuthentication.a.c
            public String h() {
                return "name email";
            }
        }

        static final class b extends c {
            b(String str, int i7) {
                super(str, i7, null);
            }

            @Override // com.RNAppleAuthentication.a.c
            public String h() {
                return Scopes.EMAIL;
            }
        }

        /* JADX INFO: renamed from: com.RNAppleAuthentication.a$c$c, reason: collision with other inner class name */
        static final class C0198c extends c {
            C0198c(String str, int i7) {
                super(str, i7, null);
            }

            @Override // com.RNAppleAuthentication.a.c
            public String h() {
                return "name";
            }
        }

        static {
            c[] cVarArrE = e();
            f10148p = cVarArrE;
            f10149q = AbstractC1978a.a(cVarArrE);
        }

        private c(String str, int i7) {
        }

        private static final /* synthetic */ c[] e() {
            return new c[]{f10145m, f10146n, f10147o};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f10148p.clone();
        }

        public abstract String h();

        public /* synthetic */ c(String str, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i7);
        }
    }

    private a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f10126a = str;
        this.f10127b = str2;
        this.f10128c = str3;
        this.f10129d = str4;
        this.f10130e = str5;
        this.f10131f = str6;
        this.f10132g = str7;
    }

    public final String a() {
        return this.f10126a;
    }

    public final String b() {
        return this.f10132g;
    }

    public final String c() {
        return this.f10131f;
    }

    public final String d() {
        return this.f10127b;
    }

    public final String e() {
        return this.f10129d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.f10126a, aVar.f10126a) && k.b(this.f10127b, aVar.f10127b) && k.b(this.f10128c, aVar.f10128c) && k.b(this.f10129d, aVar.f10129d) && k.b(this.f10130e, aVar.f10130e) && k.b(this.f10131f, aVar.f10131f) && k.b(this.f10132g, aVar.f10132g);
    }

    public final String f() {
        return this.f10128c;
    }

    public final String g() {
        return this.f10130e;
    }

    public int hashCode() {
        return (((((((((((this.f10126a.hashCode() * 31) + this.f10127b.hashCode()) * 31) + this.f10128c.hashCode()) * 31) + this.f10129d.hashCode()) * 31) + this.f10130e.hashCode()) * 31) + this.f10131f.hashCode()) * 31) + this.f10132g.hashCode();
    }

    public String toString() {
        return "SignInWithAppleConfiguration(clientId=" + this.f10126a + ", redirectUri=" + this.f10127b + ", scope=" + this.f10128c + ", responseType=" + this.f10129d + ", state=" + this.f10130e + ", rawNonce=" + this.f10131f + ", nonce=" + this.f10132g + ")";
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7);
    }
}
