package B1;

import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final D1.g f665m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, D1.g gVar) {
        super(str);
        k.f(gVar, "encodedImage");
        this.f665m = gVar;
    }

    public final D1.g a() {
        return this.f665m;
    }
}
