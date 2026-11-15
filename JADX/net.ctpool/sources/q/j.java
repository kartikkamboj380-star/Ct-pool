package q;

import java.util.Arrays;
import q.C1980b;

/* JADX INFO: loaded from: classes.dex */
public class j implements C1980b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static float f21734n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21735a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21736b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21737c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f21738d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f21739e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f21740f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f21741g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f21742h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f21743i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f21744j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f21745k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C1980b f21746l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final C1981c f21747m;

    j(C1980b c1980b, C1981c c1981c) {
        this.f21746l = c1980b;
        this.f21747m = c1981c;
        clear();
    }

    private void l(i iVar, int i7) {
        int[] iArr;
        int i8 = iVar.f21716c % this.f21737c;
        int[] iArr2 = this.f21738d;
        int i9 = iArr2[i8];
        if (i9 == -1) {
            iArr2[i8] = i7;
        } else {
            while (true) {
                iArr = this.f21739e;
                int i10 = iArr[i9];
                if (i10 == -1) {
                    break;
                } else {
                    i9 = i10;
                }
            }
            iArr[i9] = i7;
        }
        this.f21739e[i7] = -1;
    }

    private void m(int i7, i iVar, float f7) {
        this.f21740f[i7] = iVar.f21716c;
        this.f21741g[i7] = f7;
        this.f21742h[i7] = -1;
        this.f21743i[i7] = -1;
        iVar.a(this.f21746l);
        iVar.f21726m++;
        this.f21744j++;
    }

    private int n() {
        for (int i7 = 0; i7 < this.f21736b; i7++) {
            if (this.f21740f[i7] == -1) {
                return i7;
            }
        }
        return -1;
    }

    private void o() {
        int i7 = this.f21736b * 2;
        this.f21740f = Arrays.copyOf(this.f21740f, i7);
        this.f21741g = Arrays.copyOf(this.f21741g, i7);
        this.f21742h = Arrays.copyOf(this.f21742h, i7);
        this.f21743i = Arrays.copyOf(this.f21743i, i7);
        this.f21739e = Arrays.copyOf(this.f21739e, i7);
        for (int i8 = this.f21736b; i8 < i7; i8++) {
            this.f21740f[i8] = -1;
            this.f21739e[i8] = -1;
        }
        this.f21736b = i7;
    }

    private void q(int i7, i iVar, float f7) {
        int iN = n();
        m(iN, iVar, f7);
        if (i7 != -1) {
            this.f21742h[iN] = i7;
            int[] iArr = this.f21743i;
            iArr[iN] = iArr[i7];
            iArr[i7] = iN;
        } else {
            this.f21742h[iN] = -1;
            if (this.f21744j > 0) {
                this.f21743i[iN] = this.f21745k;
                this.f21745k = iN;
            } else {
                this.f21743i[iN] = -1;
            }
        }
        int i8 = this.f21743i[iN];
        if (i8 != -1) {
            this.f21742h[i8] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i7;
        int i8 = iVar.f21716c;
        int i9 = i8 % this.f21737c;
        int[] iArr2 = this.f21738d;
        int i10 = iArr2[i9];
        if (i10 == -1) {
            return;
        }
        if (this.f21740f[i10] == i8) {
            int[] iArr3 = this.f21739e;
            iArr2[i9] = iArr3[i10];
            iArr3[i10] = -1;
            return;
        }
        while (true) {
            iArr = this.f21739e;
            i7 = iArr[i10];
            if (i7 == -1 || this.f21740f[i7] == i8) {
                break;
            } else {
                i10 = i7;
            }
        }
        if (i7 == -1 || this.f21740f[i7] != i8) {
            return;
        }
        iArr[i10] = iArr[i7];
        iArr[i7] = -1;
    }

    @Override // q.C1980b.a
    public void a(i iVar, float f7) {
        float f8 = f21734n;
        if (f7 > (-f8) && f7 < f8) {
            d(iVar, true);
            return;
        }
        if (this.f21744j == 0) {
            m(0, iVar, f7);
            l(iVar, 0);
            this.f21745k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f21741g[iP] = f7;
            return;
        }
        if (this.f21744j + 1 >= this.f21736b) {
            o();
        }
        int i7 = this.f21744j;
        int i8 = this.f21745k;
        int i9 = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.f21740f[i8];
            int i12 = iVar.f21716c;
            if (i11 == i12) {
                this.f21741g[i8] = f7;
                return;
            }
            if (i11 < i12) {
                i9 = i8;
            }
            i8 = this.f21743i[i8];
            if (i8 == -1) {
                break;
            }
        }
        q(i9, iVar, f7);
    }

    @Override // q.C1980b.a
    public int b() {
        return this.f21744j;
    }

    @Override // q.C1980b.a
    public i c(int i7) {
        int i8 = this.f21744j;
        if (i8 == 0) {
            return null;
        }
        int i9 = this.f21745k;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i7 && i9 != -1) {
                return this.f21747m.f21679d[this.f21740f[i9]];
            }
            i9 = this.f21743i[i9];
            if (i9 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // q.C1980b.a
    public void clear() {
        int i7 = this.f21744j;
        for (int i8 = 0; i8 < i7; i8++) {
            i iVarC = c(i8);
            if (iVarC != null) {
                iVarC.c(this.f21746l);
            }
        }
        for (int i9 = 0; i9 < this.f21736b; i9++) {
            this.f21740f[i9] = -1;
            this.f21739e[i9] = -1;
        }
        for (int i10 = 0; i10 < this.f21737c; i10++) {
            this.f21738d[i10] = -1;
        }
        this.f21744j = 0;
        this.f21745k = -1;
    }

    @Override // q.C1980b.a
    public float d(i iVar, boolean z6) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f7 = this.f21741g[iP];
        if (this.f21745k == iP) {
            this.f21745k = this.f21743i[iP];
        }
        this.f21740f[iP] = -1;
        int[] iArr = this.f21742h;
        int i7 = iArr[iP];
        if (i7 != -1) {
            int[] iArr2 = this.f21743i;
            iArr2[i7] = iArr2[iP];
        }
        int i8 = this.f21743i[iP];
        if (i8 != -1) {
            iArr[i8] = iArr[iP];
        }
        this.f21744j--;
        iVar.f21726m--;
        if (z6) {
            iVar.c(this.f21746l);
        }
        return f7;
    }

    @Override // q.C1980b.a
    public boolean e(i iVar) {
        return p(iVar) != -1;
    }

    @Override // q.C1980b.a
    public void f() {
        int i7 = this.f21744j;
        int i8 = this.f21745k;
        for (int i9 = 0; i9 < i7; i9++) {
            float[] fArr = this.f21741g;
            fArr[i8] = fArr[i8] * (-1.0f);
            i8 = this.f21743i[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    @Override // q.C1980b.a
    public float g(int i7) {
        int i8 = this.f21744j;
        int i9 = this.f21745k;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i7) {
                return this.f21741g[i9];
            }
            i9 = this.f21743i[i9];
            if (i9 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // q.C1980b.a
    public void h(i iVar, float f7, boolean z6) {
        float f8 = f21734n;
        if (f7 <= (-f8) || f7 >= f8) {
            int iP = p(iVar);
            if (iP == -1) {
                a(iVar, f7);
                return;
            }
            float[] fArr = this.f21741g;
            float f9 = fArr[iP] + f7;
            fArr[iP] = f9;
            float f10 = f21734n;
            if (f9 <= (-f10) || f9 >= f10) {
                return;
            }
            fArr[iP] = 0.0f;
            d(iVar, z6);
        }
    }

    @Override // q.C1980b.a
    public float i(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f21741g[iP];
        }
        return 0.0f;
    }

    @Override // q.C1980b.a
    public float j(C1980b c1980b, boolean z6) {
        float fI = i(c1980b.f21670a);
        d(c1980b.f21670a, z6);
        j jVar = (j) c1980b.f21674e;
        int iB = jVar.b();
        int i7 = 0;
        int i8 = 0;
        while (i7 < iB) {
            int i9 = jVar.f21740f[i8];
            if (i9 != -1) {
                h(this.f21747m.f21679d[i9], jVar.f21741g[i8] * fI, z6);
                i7++;
            }
            i8++;
        }
        return fI;
    }

    @Override // q.C1980b.a
    public void k(float f7) {
        int i7 = this.f21744j;
        int i8 = this.f21745k;
        for (int i9 = 0; i9 < i7; i9++) {
            float[] fArr = this.f21741g;
            fArr[i8] = fArr[i8] / f7;
            i8 = this.f21743i[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        if (this.f21744j == 0) {
            return -1;
        }
        int i7 = iVar.f21716c;
        int i8 = this.f21738d[i7 % this.f21737c];
        if (i8 == -1) {
            return -1;
        }
        if (this.f21740f[i8] == i7) {
            return i8;
        }
        do {
            i8 = this.f21739e[i8];
            if (i8 == -1) {
                break;
            }
        } while (this.f21740f[i8] != i7);
        if (i8 != -1 && this.f21740f[i8] == i7) {
            return i8;
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i7 = this.f21744j;
        for (int i8 = 0; i8 < i7; i8++) {
            i iVarC = c(i8);
            if (iVarC != null) {
                String str2 = str + iVarC + " = " + g(i8) + " ";
                int iP = p(iVarC);
                String str3 = str2 + "[p: ";
                if (this.f21742h[iP] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.f21747m.f21679d[this.f21740f[this.f21742h[iP]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f21743i[iP] != -1 ? str4 + this.f21747m.f21679d[this.f21740f[this.f21743i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
