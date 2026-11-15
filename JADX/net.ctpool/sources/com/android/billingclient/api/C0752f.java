package com.android.billingclient.api;

/* JADX INFO: renamed from: com.android.billingclient.api.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0752f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f10260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f10261b;

    /* JADX INFO: renamed from: com.android.billingclient.api.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f10262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f10263b;

        private a() {
        }

        public C0752f a() {
            if (!this.f10262a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new C0752f(true, this.f10263b);
        }

        public a b() {
            this.f10262a = true;
            return this;
        }
    }

    private C0752f(boolean z6, boolean z7) {
        this.f10260a = z6;
        this.f10261b = z7;
    }

    public static a c() {
        return new a();
    }

    boolean a() {
        return this.f10260a;
    }

    boolean b() {
        return this.f10261b;
    }
}
