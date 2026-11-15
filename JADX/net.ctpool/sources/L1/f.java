package L1;

import s1.C2038c;
import w5.k;
import y1.p;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f1962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f1963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1964e;

    public f(int i7, boolean z6, d dVar, Integer num, boolean z7) {
        this.f1960a = i7;
        this.f1961b = z6;
        this.f1962c = dVar;
        this.f1963d = num;
        this.f1964e = z7;
    }

    private final c a(C2038c c2038c, boolean z6) {
        d dVar = this.f1962c;
        if (dVar != null) {
            return dVar.createImageTranscoder(c2038c, z6);
        }
        return null;
    }

    private final c b(C2038c c2038c, boolean z6) {
        Integer num = this.f1963d;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return c(c2038c, z6);
        }
        if (iIntValue == 1) {
            return d(c2038c, z6);
        }
        throw new IllegalArgumentException("Invalid ImageTranscoderType");
    }

    private final c c(C2038c c2038c, boolean z6) {
        return com.facebook.imagepipeline.nativecode.f.a(this.f1960a, this.f1961b, this.f1964e).createImageTranscoder(c2038c, z6);
    }

    private final c d(C2038c c2038c, boolean z6) {
        c cVarCreateImageTranscoder = new h(this.f1960a).createImageTranscoder(c2038c, z6);
        k.e(cVarCreateImageTranscoder, "SimpleImageTranscoderFac…ormat, isResizingEnabled)");
        return cVarCreateImageTranscoder;
    }

    @Override // L1.d
    public c createImageTranscoder(C2038c c2038c, boolean z6) {
        k.f(c2038c, "imageFormat");
        c cVarA = a(c2038c, z6);
        if (cVarA == null) {
            cVarA = b(c2038c, z6);
        }
        if (cVarA == null && p.a()) {
            cVarA = c(c2038c, z6);
        }
        return cVarA == null ? d(c2038c, z6) : cVarA;
    }
}
