package L1;

import s1.C2037b;
import w5.k;
import x1.C2215f;
import x1.C2216g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1956a = new a();

    private a() {
    }

    public static final float a(C2216g c2216g, C2215f c2215f, D1.g gVar) {
        k.f(c2216g, "rotationOptions");
        k.f(gVar, "encodedImage");
        if (!D1.g.a0(gVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (c2215f == null || c2215f.f22825b <= 0 || c2215f.f22824a <= 0 || gVar.getWidth() == 0 || gVar.getHeight() == 0) {
            return 1.0f;
        }
        int iD = f1956a.d(c2216g, gVar);
        boolean z6 = iD == 90 || iD == 270;
        int height = z6 ? gVar.getHeight() : gVar.getWidth();
        int width = z6 ? gVar.getWidth() : gVar.getHeight();
        float f7 = c2215f.f22824a / height;
        float f8 = c2215f.f22825b / width;
        float fB = C5.g.b(f7, f8);
        P0.a.B("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(c2215f.f22824a), Integer.valueOf(c2215f.f22825b), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f7), Float.valueOf(f8), Float.valueOf(fB));
        return fB;
    }

    public static final int b(C2216g c2216g, C2215f c2215f, D1.g gVar, int i7) {
        k.f(c2216g, "rotationOptions");
        k.f(gVar, "encodedImage");
        if (!D1.g.a0(gVar)) {
            return 1;
        }
        float fA = a(c2216g, c2215f, gVar);
        int iF = gVar.n() == C2037b.f22237b ? f(fA) : e(fA);
        int iMax = Math.max(gVar.getHeight(), gVar.getWidth());
        float f7 = c2215f != null ? c2215f.f22826c : i7;
        while (iMax / iF > f7) {
            iF = gVar.n() == C2037b.f22237b ? iF * 2 : iF + 1;
        }
        return iF;
    }

    public static final int c(D1.g gVar, int i7, int i8) {
        k.f(gVar, "encodedImage");
        int iZ = gVar.z();
        while ((((gVar.getWidth() * gVar.getHeight()) * i7) / iZ) / iZ > i8) {
            iZ *= 2;
        }
        return iZ;
    }

    private final int d(C2216g c2216g, D1.g gVar) {
        if (!c2216g.h()) {
            return 0;
        }
        int iT = gVar.T();
        if (iT == 0 || iT == 90 || iT == 180 || iT == 270) {
            return iT;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final int e(float f7) {
        if (f7 > 0.6666667f) {
            return 1;
        }
        int i7 = 2;
        while (true) {
            double d7 = i7;
            if ((1.0d / d7) + ((1.0d / (Math.pow(d7, 2.0d) - d7)) * ((double) 0.33333334f)) <= f7) {
                return i7 - 1;
            }
            i7++;
        }
    }

    public static final int f(float f7) {
        if (f7 > 0.6666667f) {
            return 1;
        }
        int i7 = 2;
        while (true) {
            int i8 = i7 * 2;
            double d7 = 1.0d / ((double) i8);
            if (d7 + (((double) 0.33333334f) * d7) <= f7) {
                return i7;
            }
            i7 = i8;
        }
    }
}
