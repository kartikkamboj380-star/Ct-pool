package com.google.android.gms.measurement.internal;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC1442m2 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final /* synthetic */ int f16164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ String f16165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final /* synthetic */ Object f16166o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final /* synthetic */ Object f16167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final /* synthetic */ Object f16168q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final /* synthetic */ C1449n2 f16169r;

    RunnableC1442m2(C1449n2 c1449n2, int i7, String str, Object obj, Object obj2, Object obj3) {
        this.f16164m = i7;
        this.f16165n = str;
        this.f16166o = obj;
        this.f16167p = obj2;
        this.f16168q = obj3;
        this.f16169r = c1449n2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1449n2 c1449n2;
        char c7;
        C1532z2 c1532z2D = this.f16169r.f16325a.D();
        if (!c1532z2D.q()) {
            this.f16169r.w(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (this.f16169r.f16186c == 0) {
            if (this.f16169r.b().W()) {
                c1449n2 = this.f16169r;
                c7 = 'C';
            } else {
                c1449n2 = this.f16169r;
                c7 = 'c';
            }
            c1449n2.f16186c = c7;
        }
        if (this.f16169r.f16187d < 0) {
            this.f16169r.f16187d = 106000L;
        }
        String strSubstring = "2" + "01VDIWEA?".charAt(this.f16164m) + this.f16169r.f16186c + this.f16169r.f16187d + ":" + C1449n2.v(true, this.f16165n, this.f16166o, this.f16167p, this.f16168q);
        if (strSubstring.length() > 1024) {
            strSubstring = this.f16165n.substring(0, 1024);
        }
        D2 d22 = c1532z2D.f16373f;
        if (d22 != null) {
            d22.b(strSubstring, 1L);
        }
    }
}
