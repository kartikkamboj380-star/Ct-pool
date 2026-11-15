package p5;

import j5.AbstractC1797b;
import j5.AbstractC1803h;
import java.io.Serializable;
import kotlin.enums.EnumEntries;
import w5.k;

/* JADX INFO: loaded from: classes2.dex */
final class b extends AbstractC1797b implements EnumEntries, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Enum[] f21657n;

    public b(Enum[] enumArr) {
        k.f(enumArr, "entries");
        this.f21657n = enumArr;
    }

    @Override // j5.AbstractC1796a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return h((Enum) obj);
        }
        return false;
    }

    @Override // j5.AbstractC1796a
    public int f() {
        return this.f21657n.length;
    }

    public boolean h(Enum r32) {
        k.f(r32, "element");
        return ((Enum) AbstractC1803h.w(this.f21657n, r32.ordinal())) == r32;
    }

    @Override // j5.AbstractC1797b, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Enum get(int i7) {
        AbstractC1797b.f20415m.a(i7, this.f21657n.length);
        return this.f21657n[i7];
    }

    @Override // j5.AbstractC1797b, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return k((Enum) obj);
        }
        return -1;
    }

    public int k(Enum r32) {
        k.f(r32, "element");
        int iOrdinal = r32.ordinal();
        if (((Enum) AbstractC1803h.w(this.f21657n, iOrdinal)) == r32) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // j5.AbstractC1797b, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return m((Enum) obj);
        }
        return -1;
    }

    public int m(Enum r22) {
        k.f(r22, "element");
        return indexOf(r22);
    }
}
