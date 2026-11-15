package C2;

import android.content.Context;
import com.facebook.react.uimanager.C0897x;
import com.google.android.gms.common.ConnectionResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C0897x f929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0897x f930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C0897x f931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C0897x f932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C0897x f933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C0897x f934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0897x f935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C0897x f936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C0897x f937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private C0897x f938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C0897x f939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C0897x f940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C0897x f941m;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f942a;

        static {
            int[] iArr = new int[C2.a.values().length];
            try {
                iArr[C2.a.f915m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C2.a.f916n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C2.a.f917o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C2.a.f919q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C2.a.f918p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C2.a.f920r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C2.a.f921s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C2.a.f922t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C2.a.f923u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[C2.a.f927y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[C2.a.f926x.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[C2.a.f925w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[C2.a.f924v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f942a = iArr;
        }
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final C0897x a(C2.a aVar) {
        k.f(aVar, "property");
        switch (a.f942a[aVar.ordinal()]) {
            case 1:
                return this.f929a;
            case 2:
                return this.f930b;
            case 3:
                return this.f931c;
            case 4:
                return this.f932d;
            case 5:
                return this.f933e;
            case 6:
                return this.f934f;
            case 7:
                return this.f935g;
            case 8:
                return this.f936h;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return this.f937i;
            case 10:
                return this.f938j;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                return this.f939k;
            case 12:
                return this.f940l;
            case 13:
                return this.f941m;
            default:
                throw new i5.k();
        }
    }

    public final boolean b() {
        return (this.f929a == null && this.f930b == null && this.f931c == null && this.f932d == null && this.f933e == null && this.f934f == null && this.f935g == null && this.f936h == null && this.f937i == null && this.f938j == null && this.f939k == null && this.f940l == null && this.f941m == null) ? false : true;
    }

    public final c c(int i7, Context context, float f7, float f8) {
        c cVar;
        k.f(context, "context");
        if (i7 == 0) {
            C0897x c0897x = this.f938j;
            if (c0897x == null && (c0897x = this.f934f) == null && (c0897x = this.f930b) == null) {
                c0897x = this.f929a;
            }
            float fB = c0897x != null ? c0897x.b(f7, f8) : 0.0f;
            C0897x c0897x2 = this.f940l;
            if (c0897x2 == null && (c0897x2 = this.f935g) == null && (c0897x2 = this.f931c) == null) {
                c0897x2 = this.f929a;
            }
            float fB2 = c0897x2 != null ? c0897x2.b(f7, f8) : 0.0f;
            C0897x c0897x3 = this.f939k;
            if (c0897x3 == null && (c0897x3 = this.f936h) == null && (c0897x3 = this.f932d) == null) {
                c0897x3 = this.f929a;
            }
            float fB3 = c0897x3 != null ? c0897x3.b(f7, f8) : 0.0f;
            C0897x c0897x4 = this.f941m;
            if (c0897x4 == null && (c0897x4 = this.f937i) == null && (c0897x4 = this.f933e) == null) {
                c0897x4 = this.f929a;
            }
            cVar = new c(fB, fB2, fB3, c0897x4 != null ? c0897x4.b(f7, f8) : 0.0f);
        } else {
            if (i7 != 1) {
                throw new IllegalArgumentException("Expected?.resolved layout direction");
            }
            if (com.facebook.react.modules.i18nmanager.a.f11899a.a().d(context)) {
                C0897x c0897x5 = this.f940l;
                if (c0897x5 == null && (c0897x5 = this.f935g) == null && (c0897x5 = this.f931c) == null) {
                    c0897x5 = this.f929a;
                }
                float fB4 = c0897x5 != null ? c0897x5.b(f7, f8) : 0.0f;
                C0897x c0897x6 = this.f938j;
                if (c0897x6 == null && (c0897x6 = this.f934f) == null && (c0897x6 = this.f930b) == null) {
                    c0897x6 = this.f929a;
                }
                float fB5 = c0897x6 != null ? c0897x6.b(f7, f8) : 0.0f;
                C0897x c0897x7 = this.f941m;
                if (c0897x7 == null && (c0897x7 = this.f936h) == null && (c0897x7 = this.f933e) == null) {
                    c0897x7 = this.f929a;
                }
                float fB6 = c0897x7 != null ? c0897x7.b(f7, f8) : 0.0f;
                C0897x c0897x8 = this.f939k;
                if (c0897x8 == null && (c0897x8 = this.f937i) == null && (c0897x8 = this.f932d) == null) {
                    c0897x8 = this.f929a;
                }
                cVar = new c(fB4, fB5, fB6, c0897x8 != null ? c0897x8.b(f7, f8) : 0.0f);
            } else {
                C0897x c0897x9 = this.f940l;
                if (c0897x9 == null && (c0897x9 = this.f935g) == null && (c0897x9 = this.f930b) == null) {
                    c0897x9 = this.f929a;
                }
                float fB7 = c0897x9 != null ? c0897x9.b(f7, f8) : 0.0f;
                C0897x c0897x10 = this.f938j;
                if (c0897x10 == null && (c0897x10 = this.f934f) == null && (c0897x10 = this.f931c) == null) {
                    c0897x10 = this.f929a;
                }
                float fB8 = c0897x10 != null ? c0897x10.b(f7, f8) : 0.0f;
                C0897x c0897x11 = this.f941m;
                if (c0897x11 == null && (c0897x11 = this.f936h) == null && (c0897x11 = this.f932d) == null) {
                    c0897x11 = this.f929a;
                }
                float fB9 = c0897x11 != null ? c0897x11.b(f7, f8) : 0.0f;
                C0897x c0897x12 = this.f939k;
                if (c0897x12 == null && (c0897x12 = this.f937i) == null && (c0897x12 = this.f933e) == null) {
                    c0897x12 = this.f929a;
                }
                cVar = new c(fB7, fB8, fB9, c0897x12 != null ? c0897x12.b(f7, f8) : 0.0f);
            }
        }
        return cVar;
    }

    public final void d(C2.a aVar, C0897x c0897x) {
        k.f(aVar, "property");
        switch (a.f942a[aVar.ordinal()]) {
            case 1:
                this.f929a = c0897x;
                break;
            case 2:
                this.f930b = c0897x;
                break;
            case 3:
                this.f931c = c0897x;
                break;
            case 4:
                this.f932d = c0897x;
                break;
            case 5:
                this.f933e = c0897x;
                break;
            case 6:
                this.f934f = c0897x;
                break;
            case 7:
                this.f935g = c0897x;
                break;
            case 8:
                this.f936h = c0897x;
                break;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                this.f937i = c0897x;
                break;
            case 10:
                this.f938j = c0897x;
                break;
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                this.f939k = c0897x;
                break;
            case 12:
                this.f940l = c0897x;
                break;
            case 13:
                this.f941m = c0897x;
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.f929a, bVar.f929a) && k.b(this.f930b, bVar.f930b) && k.b(this.f931c, bVar.f931c) && k.b(this.f932d, bVar.f932d) && k.b(this.f933e, bVar.f933e) && k.b(this.f934f, bVar.f934f) && k.b(this.f935g, bVar.f935g) && k.b(this.f936h, bVar.f936h) && k.b(this.f937i, bVar.f937i) && k.b(this.f938j, bVar.f938j) && k.b(this.f939k, bVar.f939k) && k.b(this.f940l, bVar.f940l) && k.b(this.f941m, bVar.f941m);
    }

    public int hashCode() {
        C0897x c0897x = this.f929a;
        int iHashCode = (c0897x == null ? 0 : c0897x.hashCode()) * 31;
        C0897x c0897x2 = this.f930b;
        int iHashCode2 = (iHashCode + (c0897x2 == null ? 0 : c0897x2.hashCode())) * 31;
        C0897x c0897x3 = this.f931c;
        int iHashCode3 = (iHashCode2 + (c0897x3 == null ? 0 : c0897x3.hashCode())) * 31;
        C0897x c0897x4 = this.f932d;
        int iHashCode4 = (iHashCode3 + (c0897x4 == null ? 0 : c0897x4.hashCode())) * 31;
        C0897x c0897x5 = this.f933e;
        int iHashCode5 = (iHashCode4 + (c0897x5 == null ? 0 : c0897x5.hashCode())) * 31;
        C0897x c0897x6 = this.f934f;
        int iHashCode6 = (iHashCode5 + (c0897x6 == null ? 0 : c0897x6.hashCode())) * 31;
        C0897x c0897x7 = this.f935g;
        int iHashCode7 = (iHashCode6 + (c0897x7 == null ? 0 : c0897x7.hashCode())) * 31;
        C0897x c0897x8 = this.f936h;
        int iHashCode8 = (iHashCode7 + (c0897x8 == null ? 0 : c0897x8.hashCode())) * 31;
        C0897x c0897x9 = this.f937i;
        int iHashCode9 = (iHashCode8 + (c0897x9 == null ? 0 : c0897x9.hashCode())) * 31;
        C0897x c0897x10 = this.f938j;
        int iHashCode10 = (iHashCode9 + (c0897x10 == null ? 0 : c0897x10.hashCode())) * 31;
        C0897x c0897x11 = this.f939k;
        int iHashCode11 = (iHashCode10 + (c0897x11 == null ? 0 : c0897x11.hashCode())) * 31;
        C0897x c0897x12 = this.f940l;
        int iHashCode12 = (iHashCode11 + (c0897x12 == null ? 0 : c0897x12.hashCode())) * 31;
        C0897x c0897x13 = this.f941m;
        return iHashCode12 + (c0897x13 != null ? c0897x13.hashCode() : 0);
    }

    public String toString() {
        return "BorderRadiusStyle(uniform=" + this.f929a + ", topLeft=" + this.f930b + ", topRight=" + this.f931c + ", bottomLeft=" + this.f932d + ", bottomRight=" + this.f933e + ", topStart=" + this.f934f + ", topEnd=" + this.f935g + ", bottomStart=" + this.f936h + ", bottomEnd=" + this.f937i + ", startStart=" + this.f938j + ", startEnd=" + this.f939k + ", endStart=" + this.f940l + ", endEnd=" + this.f941m + ")";
    }

    public b(C0897x c0897x, C0897x c0897x2, C0897x c0897x3, C0897x c0897x4, C0897x c0897x5, C0897x c0897x6, C0897x c0897x7, C0897x c0897x8, C0897x c0897x9, C0897x c0897x10, C0897x c0897x11, C0897x c0897x12, C0897x c0897x13) {
        this.f929a = c0897x;
        this.f930b = c0897x2;
        this.f931c = c0897x3;
        this.f932d = c0897x4;
        this.f933e = c0897x5;
        this.f934f = c0897x6;
        this.f935g = c0897x7;
        this.f936h = c0897x8;
        this.f937i = c0897x9;
        this.f938j = c0897x10;
        this.f939k = c0897x11;
        this.f940l = c0897x12;
        this.f941m = c0897x13;
    }

    public /* synthetic */ b(C0897x c0897x, C0897x c0897x2, C0897x c0897x3, C0897x c0897x4, C0897x c0897x5, C0897x c0897x6, C0897x c0897x7, C0897x c0897x8, C0897x c0897x9, C0897x c0897x10, C0897x c0897x11, C0897x c0897x12, C0897x c0897x13, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : c0897x, (i7 & 2) != 0 ? null : c0897x2, (i7 & 4) != 0 ? null : c0897x3, (i7 & 8) != 0 ? null : c0897x4, (i7 & 16) != 0 ? null : c0897x5, (i7 & 32) != 0 ? null : c0897x6, (i7 & 64) != 0 ? null : c0897x7, (i7 & 128) != 0 ? null : c0897x8, (i7 & 256) != 0 ? null : c0897x9, (i7 & 512) != 0 ? null : c0897x10, (i7 & 1024) != 0 ? null : c0897x11, (i7 & 2048) != 0 ? null : c0897x12, (i7 & 4096) == 0 ? c0897x13 : null);
    }
}
