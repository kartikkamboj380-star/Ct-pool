package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0751e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10257b;

    /* JADX INFO: renamed from: com.android.billingclient.api.e$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10259b = "";

        /* synthetic */ a(C0.w wVar) {
        }

        public C0751e a() {
            C0751e c0751e = new C0751e();
            c0751e.f10256a = this.f10258a;
            c0751e.f10257b = this.f10259b;
            return c0751e;
        }

        public a b(String str) {
            this.f10259b = str;
            return this;
        }

        public a c(int i7) {
            this.f10258a = i7;
            return this;
        }
    }

    public static a c() {
        return new a(null);
    }

    public String a() {
        return this.f10257b;
    }

    public int b() {
        return this.f10256a;
    }

    public String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.A.f(this.f10256a) + ", Debug Message: " + this.f10257b;
    }
}
