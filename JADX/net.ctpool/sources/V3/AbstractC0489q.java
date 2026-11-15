package V3;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: V3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0489q extends AbstractC0477e implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final transient AbstractC0488p f4138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final transient int f4139n;

    /* JADX INFO: renamed from: V3.q$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f4140a = H.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Comparator f4141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Comparator f4142c;
    }

    AbstractC0489q(AbstractC0488p abstractC0488p, int i7) {
        this.f4138m = abstractC0488p;
        this.f4139n = i7;
    }

    @Override // V3.AbstractC0476d
    public boolean a(Object obj) {
        return obj != null && super.a(obj);
    }

    @Override // V3.AbstractC0476d, V3.A
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC0488p asMap() {
        return this.f4138m;
    }

    @Override // V3.AbstractC0476d
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // V3.AbstractC0476d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // V3.AbstractC0476d
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
