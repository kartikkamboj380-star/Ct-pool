package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
abstract class H extends u {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final CharSequence f14085o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final z f14086p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final boolean f14087q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f14088r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f14089s = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    protected H(I i7, CharSequence charSequence) {
        this.f14086p = i7.f14090a;
        this.f14087q = i7.f14091b;
        this.f14085o = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r0 >= r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r5.f14085o.charAt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r0 >= r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        r5.f14085o.charAt(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r5.f14087q == false) goto L31;
     */
    @Override // com.google.android.gms.internal.common.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final /* bridge */ /* synthetic */ Object c() {
        int i7;
        int iF;
        int iE;
        do {
            i7 = this.f14088r;
            while (true) {
                int i8 = this.f14088r;
                if (i8 == -1) {
                    d();
                    return null;
                }
                iF = f(i8);
                if (iF == -1) {
                    iF = this.f14085o.length();
                    this.f14088r = -1;
                    iE = -1;
                } else {
                    iE = e(iF);
                    this.f14088r = iE;
                }
                if (iE != i7) {
                    break;
                }
                int i9 = iE + 1;
                this.f14088r = i9;
                if (i9 > this.f14085o.length()) {
                    this.f14088r = -1;
                }
            }
        } while (i7 == iF);
        int i10 = this.f14089s;
        if (i10 == 1) {
            iF = this.f14085o.length();
            this.f14088r = -1;
            if (iF > i7) {
                this.f14085o.charAt(iF - 1);
            }
        } else {
            this.f14089s = i10 - 1;
        }
        return this.f14085o.subSequence(i7, iF).toString();
    }

    abstract int e(int i7);

    abstract int f(int i7);
}
