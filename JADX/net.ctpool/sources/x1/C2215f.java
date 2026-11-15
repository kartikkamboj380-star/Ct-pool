package x1;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;
import w5.y;

/* JADX INFO: renamed from: x1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2215f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f22823e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22827d;

    /* JADX INFO: renamed from: x1.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C2215f(int i7, int i8) {
        this(i7, i8, 0.0f, 0.0f, 12, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2215f) {
            C2215f c2215f = (C2215f) obj;
            if (this.f22824a == c2215f.f22824a && this.f22825b == c2215f.f22825b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return W0.b.a(this.f22824a, this.f22825b);
    }

    public String toString() {
        y yVar = y.f22743a;
        String str = String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f22824a), Integer.valueOf(this.f22825b)}, 2));
        k.e(str, "format(locale, format, *args)");
        return str;
    }

    public C2215f(int i7, int i8, float f7, float f8) {
        this.f22824a = i7;
        this.f22825b = i8;
        this.f22826c = f7;
        this.f22827d = f8;
        if (i7 <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i8 <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public /* synthetic */ C2215f(int i7, int i8, float f7, float f8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, i8, (i9 & 4) != 0 ? 2048.0f : f7, (i9 & 8) != 0 ? 0.6666667f : f8);
    }
}
