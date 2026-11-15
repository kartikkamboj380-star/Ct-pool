package com.dooboolab.rniap;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10435b;

    public a(String str, String str2) {
        w5.k.f(str, "code");
        w5.k.f(str2, "message");
        this.f10434a = str;
        this.f10435b = str2;
    }

    public final String a() {
        return this.f10434a;
    }

    public final String b() {
        return this.f10435b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return w5.k.b(this.f10434a, aVar.f10434a) && w5.k.b(this.f10435b, aVar.f10435b);
    }

    public int hashCode() {
        return (this.f10434a.hashCode() * 31) + this.f10435b.hashCode();
    }

    public String toString() {
        return "BillingResponse(code=" + this.f10434a + ", message=" + this.f10435b + ")";
    }
}
