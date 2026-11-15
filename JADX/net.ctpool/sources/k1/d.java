package k1;

import O0.l;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f20535a = a.BITMAP_ONLY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20536b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f20537c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20538d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f20539e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20540f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f20541g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20542h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20543i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20544j = false;

    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static d a(float f7) {
        return new d().o(f7);
    }

    private float[] e() {
        if (this.f20537c == null) {
            this.f20537c = new float[8];
        }
        return this.f20537c;
    }

    public int b() {
        return this.f20540f;
    }

    public float c() {
        return this.f20539e;
    }

    public float[] d() {
        return this.f20537c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f20536b == dVar.f20536b && this.f20538d == dVar.f20538d && Float.compare(dVar.f20539e, this.f20539e) == 0 && this.f20540f == dVar.f20540f && Float.compare(dVar.f20541g, this.f20541g) == 0 && this.f20535a == dVar.f20535a && this.f20542h == dVar.f20542h && this.f20543i == dVar.f20543i) {
            return Arrays.equals(this.f20537c, dVar.f20537c);
        }
        return false;
    }

    public int f() {
        return this.f20538d;
    }

    public float g() {
        return this.f20541g;
    }

    public boolean h() {
        return this.f20543i;
    }

    public int hashCode() {
        a aVar = this.f20535a;
        int iHashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f20536b ? 1 : 0)) * 31;
        float[] fArr = this.f20537c;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f20538d) * 31;
        float f7 = this.f20539e;
        int iFloatToIntBits = (((iHashCode2 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31) + this.f20540f) * 31;
        float f8 = this.f20541g;
        return ((((iFloatToIntBits + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31) + (this.f20542h ? 1 : 0)) * 31) + (this.f20543i ? 1 : 0);
    }

    public boolean i() {
        return this.f20544j;
    }

    public boolean j() {
        return this.f20536b;
    }

    public a k() {
        return this.f20535a;
    }

    public boolean l() {
        return this.f20542h;
    }

    public d m(int i7, float f7) {
        l.c(f7 >= 0.0f, "the border width cannot be < 0");
        this.f20539e = f7;
        this.f20540f = i7;
        return this;
    }

    public d n(float f7, float f8, float f9, float f10) {
        float[] fArrE = e();
        fArrE[1] = f7;
        fArrE[0] = f7;
        fArrE[3] = f8;
        fArrE[2] = f8;
        fArrE[5] = f9;
        fArrE[4] = f9;
        fArrE[7] = f10;
        fArrE[6] = f10;
        return this;
    }

    public d o(float f7) {
        Arrays.fill(e(), f7);
        return this;
    }

    public d p(int i7) {
        this.f20538d = i7;
        this.f20535a = a.OVERLAY_COLOR;
        return this;
    }

    public d q(boolean z6) {
        this.f20543i = z6;
        return this;
    }

    public d r(a aVar) {
        this.f20535a = aVar;
        return this;
    }
}
