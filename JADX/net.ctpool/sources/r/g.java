package r;

import com.google.android.gms.common.ConnectionResult;
import q.C1982d;
import r.d;
import r.e;

/* JADX INFO: loaded from: classes.dex */
public class g extends e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    protected float f22043w0 = -1.0f;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    protected int f22044x0 = -1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    protected int f22045y0 = -1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private d f22046z0 = this.f21940C;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f22041A0 = 0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private int f22042B0 = 0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22047a;

        static {
            int[] iArr = new int[d.b.values().length];
            f22047a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22047a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22047a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22047a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22047a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22047a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22047a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22047a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22047a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.f21948K.clear();
        this.f21948K.add(this.f22046z0);
        int length = this.f21947J.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f21947J[i7] = this.f22046z0;
        }
    }

    @Override // r.e
    public void F0(C1982d c1982d) {
        if (E() == null) {
            return;
        }
        int iX = c1982d.x(this.f22046z0);
        if (this.f22041A0 == 1) {
            B0(iX);
            C0(0);
            e0(E().t());
            A0(0);
            return;
        }
        B0(0);
        C0(iX);
        A0(E().N());
        e0(0);
    }

    public int G0() {
        return this.f22041A0;
    }

    public int H0() {
        return this.f22044x0;
    }

    public int I0() {
        return this.f22045y0;
    }

    public float J0() {
        return this.f22043w0;
    }

    public void K0(int i7) {
        if (i7 > -1) {
            this.f22043w0 = -1.0f;
            this.f22044x0 = i7;
            this.f22045y0 = -1;
        }
    }

    public void L0(int i7) {
        if (i7 > -1) {
            this.f22043w0 = -1.0f;
            this.f22044x0 = -1;
            this.f22045y0 = i7;
        }
    }

    public void M0(float f7) {
        if (f7 > -1.0f) {
            this.f22043w0 = f7;
            this.f22044x0 = -1;
            this.f22045y0 = -1;
        }
    }

    public void N0(int i7) {
        if (this.f22041A0 == i7) {
            return;
        }
        this.f22041A0 = i7;
        this.f21948K.clear();
        this.f22046z0 = this.f22041A0 == 1 ? this.f21939B : this.f21940C;
        this.f21948K.add(this.f22046z0);
        int length = this.f21947J.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.f21947J[i8] = this.f22046z0;
        }
    }

    @Override // r.e
    public void f(C1982d c1982d) {
        f fVar = (f) E();
        if (fVar == null) {
            return;
        }
        d dVarK = fVar.k(d.b.LEFT);
        d dVarK2 = fVar.k(d.b.RIGHT);
        e eVar = this.f21951N;
        boolean z6 = eVar != null && eVar.f21950M[0] == e.b.WRAP_CONTENT;
        if (this.f22041A0 == 0) {
            dVarK = fVar.k(d.b.TOP);
            dVarK2 = fVar.k(d.b.BOTTOM);
            e eVar2 = this.f21951N;
            z6 = eVar2 != null && eVar2.f21950M[1] == e.b.WRAP_CONTENT;
        }
        if (this.f22044x0 != -1) {
            q.i iVarQ = c1982d.q(this.f22046z0);
            c1982d.e(iVarQ, c1982d.q(dVarK), this.f22044x0, 8);
            if (z6) {
                c1982d.h(c1982d.q(dVarK2), iVarQ, 0, 5);
                return;
            }
            return;
        }
        if (this.f22045y0 == -1) {
            if (this.f22043w0 != -1.0f) {
                c1982d.d(C1982d.s(c1982d, c1982d.q(this.f22046z0), c1982d.q(dVarK2), this.f22043w0));
                return;
            }
            return;
        }
        q.i iVarQ2 = c1982d.q(this.f22046z0);
        q.i iVarQ3 = c1982d.q(dVarK2);
        c1982d.e(iVarQ2, iVarQ3, -this.f22045y0, 8);
        if (z6) {
            c1982d.h(iVarQ2, c1982d.q(dVarK), 0, 5);
            c1982d.h(iVarQ3, iVarQ2, 0, 5);
        }
    }

    @Override // r.e
    public boolean g() {
        return true;
    }

    @Override // r.e
    public d k(d.b bVar) {
        switch (a.f22047a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f22041A0 == 1) {
                    return this.f22046z0;
                }
                break;
            case 3:
            case 4:
                if (this.f22041A0 == 0) {
                    return this.f22046z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
