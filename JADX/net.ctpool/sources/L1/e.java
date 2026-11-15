package L1;

import android.graphics.Matrix;
import w5.k;
import x1.C2215f;
import x1.C2216g;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f1958a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O0.f f1959b;

    static {
        O0.f fVarC = O0.f.c(2, 7, 4, 5);
        k.e(fVarC, "of(\n          ExifInterf…ce.ORIENTATION_TRANSPOSE)");
        f1959b = fVarC;
    }

    private e() {
    }

    public static final int a(int i7) {
        return Math.max(1, 8 / i7);
    }

    public static final float b(C2215f c2215f, int i7, int i8) {
        if (c2215f == null) {
            return 1.0f;
        }
        float f7 = i7;
        float f8 = i8;
        float fMax = Math.max(c2215f.f22824a / f7, c2215f.f22825b / f8);
        float f9 = f7 * fMax;
        float f10 = c2215f.f22826c;
        if (f9 > f10) {
            fMax = f10 / f7;
        }
        return f8 * fMax > f10 ? f10 / f8 : fMax;
    }

    private final int c(D1.g gVar) {
        int iT = gVar.T();
        if (iT == 90 || iT == 180 || iT == 270) {
            return gVar.T();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int d(C2216g c2216g, D1.g gVar) {
        k.f(c2216g, "rotationOptions");
        k.f(gVar, "encodedImage");
        int iG1 = gVar.g1();
        O0.f fVar = f1959b;
        int iIndexOf = fVar.indexOf(Integer.valueOf(iG1));
        if (iIndexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations".toString());
        }
        E e7 = fVar.get((iIndexOf + ((!c2216g.h() ? c2216g.f() : 0) / 90)) % fVar.size());
        k.e(e7, "INVERTED_EXIF_ORIENTATIO…D_EXIF_ORIENTATIONS.size]");
        return ((Number) e7).intValue();
    }

    public static final int e(C2216g c2216g, D1.g gVar) {
        k.f(c2216g, "rotationOptions");
        k.f(gVar, "encodedImage");
        if (!c2216g.g()) {
            return 0;
        }
        int iC = f1958a.c(gVar);
        return c2216g.h() ? iC : (iC + c2216g.f()) % 360;
    }

    public static final int f(C2216g c2216g, C2215f c2215f, D1.g gVar, boolean z6) {
        k.f(c2216g, "rotationOptions");
        k.f(gVar, "encodedImage");
        if (!z6 || c2215f == null) {
            return 8;
        }
        int iE = e(c2216g, gVar);
        int iD = f1959b.contains(Integer.valueOf(gVar.g1())) ? d(c2216g, gVar) : 0;
        boolean z7 = iE == 90 || iE == 270 || iD == 5 || iD == 7;
        int iK = k(b(c2215f, z7 ? gVar.getHeight() : gVar.getWidth(), z7 ? gVar.getWidth() : gVar.getHeight()), c2215f.f22827d);
        if (iK > 8) {
            return 8;
        }
        if (iK < 1) {
            return 1;
        }
        return iK;
    }

    public static final Matrix g(D1.g gVar, C2216g c2216g) {
        k.f(gVar, "encodedImage");
        k.f(c2216g, "rotationOptions");
        if (f1959b.contains(Integer.valueOf(gVar.g1()))) {
            return f1958a.h(d(c2216g, gVar));
        }
        int iE = e(c2216g, gVar);
        if (iE == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(iE);
        return matrix;
    }

    private final Matrix h(int i7) {
        float f7;
        Matrix matrix = new Matrix();
        if (i7 != 2) {
            if (i7 == 7) {
                f7 = -90.0f;
            } else if (i7 == 4) {
                f7 = 180.0f;
            } else {
                if (i7 != 5) {
                    return null;
                }
                f7 = 90.0f;
            }
            matrix.setRotate(f7);
            matrix.postScale(-1.0f, 1.0f);
        } else {
            matrix.setScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    public static final boolean i(int i7) {
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static final boolean j(int i7) {
        return i7 >= 0 && i7 <= 270 && i7 % 90 == 0;
    }

    public static final int k(float f7, float f8) {
        return (int) (f8 + (f7 * 8));
    }
}
