package q;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21713o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f21714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f21715b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f21719f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f21723j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21716c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f21717d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21718e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21720g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float[] f21721h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float[] f21722i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    C1980b[] f21724k = new C1980b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f21725l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21726m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    HashSet f21727n = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f21723j = aVar;
    }

    static void b() {
        f21713o++;
    }

    public final void a(C1980b c1980b) {
        int i7 = 0;
        while (true) {
            int i8 = this.f21725l;
            if (i7 >= i8) {
                C1980b[] c1980bArr = this.f21724k;
                if (i8 >= c1980bArr.length) {
                    this.f21724k = (C1980b[]) Arrays.copyOf(c1980bArr, c1980bArr.length * 2);
                }
                C1980b[] c1980bArr2 = this.f21724k;
                int i9 = this.f21725l;
                c1980bArr2[i9] = c1980b;
                this.f21725l = i9 + 1;
                return;
            }
            if (this.f21724k[i7] == c1980b) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void c(C1980b c1980b) {
        int i7 = this.f21725l;
        int i8 = 0;
        while (i8 < i7) {
            if (this.f21724k[i8] == c1980b) {
                while (i8 < i7 - 1) {
                    C1980b[] c1980bArr = this.f21724k;
                    int i9 = i8 + 1;
                    c1980bArr[i8] = c1980bArr[i9];
                    i8 = i9;
                }
                this.f21725l--;
                return;
            }
            i8++;
        }
    }

    public void d() {
        this.f21715b = null;
        this.f21723j = a.UNKNOWN;
        this.f21718e = 0;
        this.f21716c = -1;
        this.f21717d = -1;
        this.f21719f = 0.0f;
        this.f21720g = false;
        int i7 = this.f21725l;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f21724k[i8] = null;
        }
        this.f21725l = 0;
        this.f21726m = 0;
        this.f21714a = false;
        Arrays.fill(this.f21722i, 0.0f);
    }

    public void e(C1982d c1982d, float f7) {
        this.f21719f = f7;
        this.f21720g = true;
        int i7 = this.f21725l;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f21724k[i8].B(c1982d, this, false);
        }
        this.f21725l = 0;
    }

    public void f(a aVar, String str) {
        this.f21723j = aVar;
    }

    public final void g(C1980b c1980b) {
        int i7 = this.f21725l;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f21724k[i8].C(c1980b, false);
        }
        this.f21725l = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f21715b != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f21715b);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f21716c);
        }
        return sb.toString();
    }
}
