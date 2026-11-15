package s1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: renamed from: s1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2038c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22250c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2038c f22251d = new C2038c("UNKNOWN", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22253b;

    /* JADX INFO: renamed from: s1.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: s1.c$b */
    public interface b {
        int a();

        C2038c b(byte[] bArr, int i7);
    }

    public C2038c(String str, String str2) {
        k.f(str, "name");
        this.f22252a = str;
        this.f22253b = str2;
    }

    public final String a() {
        return this.f22252a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2038c)) {
            return false;
        }
        C2038c c2038c = (C2038c) obj;
        return k.b(this.f22252a, c2038c.f22252a) && k.b(this.f22253b, c2038c.f22253b);
    }

    public int hashCode() {
        int iHashCode = this.f22252a.hashCode() * 31;
        String str = this.f22253b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return this.f22252a;
    }
}
