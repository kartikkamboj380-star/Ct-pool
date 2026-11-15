package q;

import java.util.Arrays;
import q.C1980b;

/* JADX INFO: renamed from: q.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1979a implements C1980b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f21658l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1980b f21660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final C1981c f21661c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f21659a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21662d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f21663e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f21664f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f21665g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f21666h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21667i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21668j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f21669k = false;

    C1979a(C1980b c1980b, C1981c c1981c) {
        this.f21660b = c1980b;
        this.f21661c = c1981c;
    }

    @Override // q.C1980b.a
    public final void a(i iVar, float f7) {
        if (f7 == 0.0f) {
            d(iVar, true);
            return;
        }
        int i7 = this.f21667i;
        if (i7 == -1) {
            this.f21667i = 0;
            this.f21666h[0] = f7;
            this.f21664f[0] = iVar.f21716c;
            this.f21665g[0] = -1;
            iVar.f21726m++;
            iVar.a(this.f21660b);
            this.f21659a++;
            if (this.f21669k) {
                return;
            }
            int i8 = this.f21668j + 1;
            this.f21668j = i8;
            int[] iArr = this.f21664f;
            if (i8 >= iArr.length) {
                this.f21669k = true;
                this.f21668j = iArr.length - 1;
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i7 != -1 && i10 < this.f21659a; i10++) {
            int i11 = this.f21664f[i7];
            int i12 = iVar.f21716c;
            if (i11 == i12) {
                this.f21666h[i7] = f7;
                return;
            }
            if (i11 < i12) {
                i9 = i7;
            }
            i7 = this.f21665g[i7];
        }
        int length = this.f21668j;
        int i13 = length + 1;
        if (this.f21669k) {
            int[] iArr2 = this.f21664f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i13;
        }
        int[] iArr3 = this.f21664f;
        if (length >= iArr3.length && this.f21659a < iArr3.length) {
            int i14 = 0;
            while (true) {
                int[] iArr4 = this.f21664f;
                if (i14 >= iArr4.length) {
                    break;
                }
                if (iArr4[i14] == -1) {
                    length = i14;
                    break;
                }
                i14++;
            }
        }
        int[] iArr5 = this.f21664f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i15 = this.f21662d * 2;
            this.f21662d = i15;
            this.f21669k = false;
            this.f21668j = length - 1;
            this.f21666h = Arrays.copyOf(this.f21666h, i15);
            this.f21664f = Arrays.copyOf(this.f21664f, this.f21662d);
            this.f21665g = Arrays.copyOf(this.f21665g, this.f21662d);
        }
        this.f21664f[length] = iVar.f21716c;
        this.f21666h[length] = f7;
        int[] iArr6 = this.f21665g;
        if (i9 != -1) {
            iArr6[length] = iArr6[i9];
            iArr6[i9] = length;
        } else {
            iArr6[length] = this.f21667i;
            this.f21667i = length;
        }
        iVar.f21726m++;
        iVar.a(this.f21660b);
        int i16 = this.f21659a + 1;
        this.f21659a = i16;
        if (!this.f21669k) {
            this.f21668j++;
        }
        int[] iArr7 = this.f21664f;
        if (i16 >= iArr7.length) {
            this.f21669k = true;
        }
        if (this.f21668j >= iArr7.length) {
            this.f21669k = true;
            this.f21668j = iArr7.length - 1;
        }
    }

    @Override // q.C1980b.a
    public int b() {
        return this.f21659a;
    }

    @Override // q.C1980b.a
    public i c(int i7) {
        int i8 = this.f21667i;
        for (int i9 = 0; i8 != -1 && i9 < this.f21659a; i9++) {
            if (i9 == i7) {
                return this.f21661c.f21679d[this.f21664f[i8]];
            }
            i8 = this.f21665g[i8];
        }
        return null;
    }

    @Override // q.C1980b.a
    public final void clear() {
        int i7 = this.f21667i;
        for (int i8 = 0; i7 != -1 && i8 < this.f21659a; i8++) {
            i iVar = this.f21661c.f21679d[this.f21664f[i7]];
            if (iVar != null) {
                iVar.c(this.f21660b);
            }
            i7 = this.f21665g[i7];
        }
        this.f21667i = -1;
        this.f21668j = -1;
        this.f21669k = false;
        this.f21659a = 0;
    }

    @Override // q.C1980b.a
    public final float d(i iVar, boolean z6) {
        if (this.f21663e == iVar) {
            this.f21663e = null;
        }
        int i7 = this.f21667i;
        if (i7 == -1) {
            return 0.0f;
        }
        int i8 = 0;
        int i9 = -1;
        while (i7 != -1 && i8 < this.f21659a) {
            if (this.f21664f[i7] == iVar.f21716c) {
                if (i7 == this.f21667i) {
                    this.f21667i = this.f21665g[i7];
                } else {
                    int[] iArr = this.f21665g;
                    iArr[i9] = iArr[i7];
                }
                if (z6) {
                    iVar.c(this.f21660b);
                }
                iVar.f21726m--;
                this.f21659a--;
                this.f21664f[i7] = -1;
                if (this.f21669k) {
                    this.f21668j = i7;
                }
                return this.f21666h[i7];
            }
            i8++;
            i9 = i7;
            i7 = this.f21665g[i7];
        }
        return 0.0f;
    }

    @Override // q.C1980b.a
    public boolean e(i iVar) {
        int i7 = this.f21667i;
        if (i7 == -1) {
            return false;
        }
        for (int i8 = 0; i7 != -1 && i8 < this.f21659a; i8++) {
            if (this.f21664f[i7] == iVar.f21716c) {
                return true;
            }
            i7 = this.f21665g[i7];
        }
        return false;
    }

    @Override // q.C1980b.a
    public void f() {
        int i7 = this.f21667i;
        for (int i8 = 0; i7 != -1 && i8 < this.f21659a; i8++) {
            float[] fArr = this.f21666h;
            fArr[i7] = fArr[i7] * (-1.0f);
            i7 = this.f21665g[i7];
        }
    }

    @Override // q.C1980b.a
    public float g(int i7) {
        int i8 = this.f21667i;
        for (int i9 = 0; i8 != -1 && i9 < this.f21659a; i9++) {
            if (i9 == i7) {
                return this.f21666h[i8];
            }
            i8 = this.f21665g[i8];
        }
        return 0.0f;
    }

    @Override // q.C1980b.a
    public void h(i iVar, float f7, boolean z6) {
        float f8 = f21658l;
        if (f7 <= (-f8) || f7 >= f8) {
            int i7 = this.f21667i;
            if (i7 == -1) {
                this.f21667i = 0;
                this.f21666h[0] = f7;
                this.f21664f[0] = iVar.f21716c;
                this.f21665g[0] = -1;
                iVar.f21726m++;
                iVar.a(this.f21660b);
                this.f21659a++;
                if (this.f21669k) {
                    return;
                }
                int i8 = this.f21668j + 1;
                this.f21668j = i8;
                int[] iArr = this.f21664f;
                if (i8 >= iArr.length) {
                    this.f21669k = true;
                    this.f21668j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i9 = -1;
            for (int i10 = 0; i7 != -1 && i10 < this.f21659a; i10++) {
                int i11 = this.f21664f[i7];
                int i12 = iVar.f21716c;
                if (i11 == i12) {
                    float[] fArr = this.f21666h;
                    float f9 = fArr[i7] + f7;
                    float f10 = f21658l;
                    if (f9 > (-f10) && f9 < f10) {
                        f9 = 0.0f;
                    }
                    fArr[i7] = f9;
                    if (f9 == 0.0f) {
                        if (i7 == this.f21667i) {
                            this.f21667i = this.f21665g[i7];
                        } else {
                            int[] iArr2 = this.f21665g;
                            iArr2[i9] = iArr2[i7];
                        }
                        if (z6) {
                            iVar.c(this.f21660b);
                        }
                        if (this.f21669k) {
                            this.f21668j = i7;
                        }
                        iVar.f21726m--;
                        this.f21659a--;
                        return;
                    }
                    return;
                }
                if (i11 < i12) {
                    i9 = i7;
                }
                i7 = this.f21665g[i7];
            }
            int length = this.f21668j;
            int i13 = length + 1;
            if (this.f21669k) {
                int[] iArr3 = this.f21664f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i13;
            }
            int[] iArr4 = this.f21664f;
            if (length >= iArr4.length && this.f21659a < iArr4.length) {
                int i14 = 0;
                while (true) {
                    int[] iArr5 = this.f21664f;
                    if (i14 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i14] == -1) {
                        length = i14;
                        break;
                    }
                    i14++;
                }
            }
            int[] iArr6 = this.f21664f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i15 = this.f21662d * 2;
                this.f21662d = i15;
                this.f21669k = false;
                this.f21668j = length - 1;
                this.f21666h = Arrays.copyOf(this.f21666h, i15);
                this.f21664f = Arrays.copyOf(this.f21664f, this.f21662d);
                this.f21665g = Arrays.copyOf(this.f21665g, this.f21662d);
            }
            this.f21664f[length] = iVar.f21716c;
            this.f21666h[length] = f7;
            int[] iArr7 = this.f21665g;
            if (i9 != -1) {
                iArr7[length] = iArr7[i9];
                iArr7[i9] = length;
            } else {
                iArr7[length] = this.f21667i;
                this.f21667i = length;
            }
            iVar.f21726m++;
            iVar.a(this.f21660b);
            this.f21659a++;
            if (!this.f21669k) {
                this.f21668j++;
            }
            int i16 = this.f21668j;
            int[] iArr8 = this.f21664f;
            if (i16 >= iArr8.length) {
                this.f21669k = true;
                this.f21668j = iArr8.length - 1;
            }
        }
    }

    @Override // q.C1980b.a
    public final float i(i iVar) {
        int i7 = this.f21667i;
        for (int i8 = 0; i7 != -1 && i8 < this.f21659a; i8++) {
            if (this.f21664f[i7] == iVar.f21716c) {
                return this.f21666h[i7];
            }
            i7 = this.f21665g[i7];
        }
        return 0.0f;
    }

    @Override // q.C1980b.a
    public float j(C1980b c1980b, boolean z6) {
        float fI = i(c1980b.f21670a);
        d(c1980b.f21670a, z6);
        C1980b.a aVar = c1980b.f21674e;
        int iB = aVar.b();
        for (int i7 = 0; i7 < iB; i7++) {
            i iVarC = aVar.c(i7);
            h(iVarC, aVar.i(iVarC) * fI, z6);
        }
        return fI;
    }

    @Override // q.C1980b.a
    public void k(float f7) {
        int i7 = this.f21667i;
        for (int i8 = 0; i7 != -1 && i8 < this.f21659a; i8++) {
            float[] fArr = this.f21666h;
            fArr[i7] = fArr[i7] / f7;
            i7 = this.f21665g[i7];
        }
    }

    public String toString() {
        int i7 = this.f21667i;
        String str = "";
        for (int i8 = 0; i7 != -1 && i8 < this.f21659a; i8++) {
            str = ((str + " -> ") + this.f21666h[i7] + " : ") + this.f21661c.f21679d[this.f21664f[i7]];
            i7 = this.f21665g[i7];
        }
        return str;
    }
}
