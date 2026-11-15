package l3;

/* JADX INFO: renamed from: l3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1849b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f21095a = 1;

    public C1849b a(Object obj) {
        this.f21095a = (this.f21095a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f21095a;
    }

    public final C1849b c(boolean z6) {
        this.f21095a = (this.f21095a * 31) + (z6 ? 1 : 0);
        return this;
    }
}
