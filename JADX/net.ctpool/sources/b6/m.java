package b6;

import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9955c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f9957b = new int[10];

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int a(int i7) {
        return this.f9957b[i7];
    }

    public final int b() {
        if ((this.f9956a & 2) != 0) {
            return this.f9957b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f9956a & 128) != 0) {
            return this.f9957b[7];
        }
        return 65535;
    }

    public final int d() {
        return (this.f9956a & 16) != 0 ? this.f9957b[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final int e(int i7) {
        return (this.f9956a & 32) != 0 ? this.f9957b[5] : i7;
    }

    public final boolean f(int i7) {
        return ((1 << i7) & this.f9956a) != 0;
    }

    public final void g(m mVar) {
        w5.k.f(mVar, "other");
        for (int i7 = 0; i7 < 10; i7++) {
            if (mVar.f(i7)) {
                h(i7, mVar.a(i7));
            }
        }
    }

    public final m h(int i7, int i8) {
        if (i7 >= 0) {
            int[] iArr = this.f9957b;
            if (i7 < iArr.length) {
                this.f9956a = (1 << i7) | this.f9956a;
                iArr[i7] = i8;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f9956a);
    }
}
