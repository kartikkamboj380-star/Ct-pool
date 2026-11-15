package U2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S2.c f3815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f3816b;

    public h(S2.c cVar, byte[] bArr) {
        if (cVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f3815a = cVar;
        this.f3816b = bArr;
    }

    public byte[] a() {
        return this.f3816b;
    }

    public S2.c b() {
        return this.f3815a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f3815a.equals(hVar.f3815a)) {
            return Arrays.equals(this.f3816b, hVar.f3816b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f3815a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3816b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f3815a + ", bytes=[...]}";
    }
}
