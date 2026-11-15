package q;

import java.util.Arrays;
import java.util.Comparator;
import q.C1980b;

/* JADX INFO: loaded from: classes.dex */
public class h extends C1980b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i[] f21704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i[] f21705i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21706j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b f21707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    C1981c f21708l;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f21716c - iVar2.f21716c;
        }
    }

    class b implements Comparable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        i f21710m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        h f21711n;

        public b(h hVar) {
            this.f21711n = hVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f21710m.f21716c - ((i) obj).f21716c;
        }

        public boolean e(i iVar, float f7) {
            boolean z6 = true;
            if (!this.f21710m.f21714a) {
                for (int i7 = 0; i7 < 9; i7++) {
                    float f8 = iVar.f21722i[i7];
                    if (f8 != 0.0f) {
                        float f9 = f8 * f7;
                        if (Math.abs(f9) < 1.0E-4f) {
                            f9 = 0.0f;
                        }
                        this.f21710m.f21722i[i7] = f9;
                    } else {
                        this.f21710m.f21722i[i7] = 0.0f;
                    }
                }
                return true;
            }
            for (int i8 = 0; i8 < 9; i8++) {
                float[] fArr = this.f21710m.f21722i;
                float f10 = fArr[i8] + (iVar.f21722i[i8] * f7);
                fArr[i8] = f10;
                if (Math.abs(f10) < 1.0E-4f) {
                    this.f21710m.f21722i[i8] = 0.0f;
                } else {
                    z6 = false;
                }
            }
            if (z6) {
                h.this.G(this.f21710m);
            }
            return false;
        }

        public void h(i iVar) {
            this.f21710m = iVar;
        }

        public final boolean j() {
            for (int i7 = 8; i7 >= 0; i7--) {
                float f7 = this.f21710m.f21722i[i7];
                if (f7 > 0.0f) {
                    return false;
                }
                if (f7 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean k(i iVar) {
            int i7 = 8;
            while (true) {
                if (i7 < 0) {
                    break;
                }
                float f7 = iVar.f21722i[i7];
                float f8 = this.f21710m.f21722i[i7];
                if (f8 == f7) {
                    i7--;
                } else if (f8 < f7) {
                    return true;
                }
            }
            return false;
        }

        public void l() {
            Arrays.fill(this.f21710m.f21722i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f21710m != null) {
                for (int i7 = 0; i7 < 9; i7++) {
                    str = str + this.f21710m.f21722i[i7] + " ";
                }
            }
            return str + "] " + this.f21710m;
        }
    }

    public h(C1981c c1981c) {
        super(c1981c);
        this.f21703g = 128;
        this.f21704h = new i[128];
        this.f21705i = new i[128];
        this.f21706j = 0;
        this.f21707k = new b(this);
        this.f21708l = c1981c;
    }

    private final void F(i iVar) {
        int i7;
        int i8 = this.f21706j + 1;
        i[] iVarArr = this.f21704h;
        if (i8 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f21704h = iVarArr2;
            this.f21705i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f21704h;
        int i9 = this.f21706j;
        iVarArr3[i9] = iVar;
        int i10 = i9 + 1;
        this.f21706j = i10;
        if (i10 > 1 && iVarArr3[i9].f21716c > iVar.f21716c) {
            int i11 = 0;
            while (true) {
                i7 = this.f21706j;
                if (i11 >= i7) {
                    break;
                }
                this.f21705i[i11] = this.f21704h[i11];
                i11++;
            }
            Arrays.sort(this.f21705i, 0, i7, new a());
            for (int i12 = 0; i12 < this.f21706j; i12++) {
                this.f21704h[i12] = this.f21705i[i12];
            }
        }
        iVar.f21714a = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i7 = 0;
        while (i7 < this.f21706j) {
            if (this.f21704h[i7] == iVar) {
                while (true) {
                    int i8 = this.f21706j;
                    if (i7 >= i8 - 1) {
                        this.f21706j = i8 - 1;
                        iVar.f21714a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f21704h;
                        int i9 = i7 + 1;
                        iVarArr[i7] = iVarArr[i9];
                        i7 = i9;
                    }
                }
            } else {
                i7++;
            }
        }
    }

    @Override // q.C1980b
    public void C(C1980b c1980b, boolean z6) {
        i iVar = c1980b.f21670a;
        if (iVar == null) {
            return;
        }
        C1980b.a aVar = c1980b.f21674e;
        int iB = aVar.b();
        for (int i7 = 0; i7 < iB; i7++) {
            i iVarC = aVar.c(i7);
            float fG = aVar.g(i7);
            this.f21707k.h(iVarC);
            if (this.f21707k.e(iVar, fG)) {
                F(iVarC);
            }
            this.f21671b += c1980b.f21671b * fG;
        }
        G(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // q.C1980b, q.C1982d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i a(C1982d c1982d, boolean[] zArr) {
        int i7 = -1;
        for (int i8 = 0; i8 < this.f21706j; i8++) {
            i iVar = this.f21704h[i8];
            if (!zArr[iVar.f21716c]) {
                this.f21707k.h(iVar);
                b bVar = this.f21707k;
                if (i7 == -1) {
                    if (bVar.j()) {
                        i7 = i8;
                    }
                } else if (bVar.k(this.f21704h[i7])) {
                }
            }
        }
        if (i7 == -1) {
            return null;
        }
        return this.f21704h[i7];
    }

    @Override // q.C1980b, q.C1982d.a
    public void c(i iVar) {
        this.f21707k.h(iVar);
        this.f21707k.l();
        iVar.f21722i[iVar.f21718e] = 1.0f;
        F(iVar);
    }

    @Override // q.C1980b, q.C1982d.a
    public void clear() {
        this.f21706j = 0;
        this.f21671b = 0.0f;
    }

    @Override // q.C1980b
    public String toString() {
        String str = " goal -> (" + this.f21671b + ") : ";
        for (int i7 = 0; i7 < this.f21706j; i7++) {
            this.f21707k.h(this.f21704h[i7]);
            str = str + this.f21707k + " ";
        }
        return str;
    }
}
