package b6;

import i6.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i6.i f9745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i6.i f9746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i6.i f9747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i6.i f9748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i6.i f9749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i6.i f9750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f9751j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i6.i f9753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i6.i f9754c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        i.a aVar = i6.i.f20019q;
        f9745d = aVar.d(":");
        f9746e = aVar.d(":status");
        f9747f = aVar.d(":method");
        f9748g = aVar.d(":path");
        f9749h = aVar.d(":scheme");
        f9750i = aVar.d(":authority");
    }

    public c(i6.i iVar, i6.i iVar2) {
        w5.k.f(iVar, "name");
        w5.k.f(iVar2, "value");
        this.f9753b = iVar;
        this.f9754c = iVar2;
        this.f9752a = iVar.C() + 32 + iVar2.C();
    }

    public final i6.i a() {
        return this.f9753b;
    }

    public final i6.i b() {
        return this.f9754c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return w5.k.b(this.f9753b, cVar.f9753b) && w5.k.b(this.f9754c, cVar.f9754c);
    }

    public int hashCode() {
        i6.i iVar = this.f9753b;
        int iHashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        i6.i iVar2 = this.f9754c;
        return iHashCode + (iVar2 != null ? iVar2.hashCode() : 0);
    }

    public String toString() {
        return this.f9753b.G() + ": " + this.f9754c.G();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(i6.i iVar, String str) {
        this(iVar, i6.i.f20019q.d(str));
        w5.k.f(iVar, "name");
        w5.k.f(str, "value");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(String str, String str2) {
        w5.k.f(str, "name");
        w5.k.f(str2, "value");
        i.a aVar = i6.i.f20019q;
        this(aVar.d(str), aVar.d(str2));
    }
}
