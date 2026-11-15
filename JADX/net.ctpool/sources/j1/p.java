package j1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public static abstract class a implements b {
        @Override // j1.p.b
        public Matrix a(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8) {
            b(matrix, rect, i7, i8, f7, f8, rect.width() / i7, rect.height() / i8);
            return matrix;
        }

        public abstract void b(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8, float f9, float f10);
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f20321a = k.f20340l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f20322b = j.f20339l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f20323c = l.f20341l;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f20324d = i.f20338l;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f20325e = g.f20336l;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f20326f = h.f20337l;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f20327g = c.f20332l;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f20328h = e.f20334l;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f20329i = d.f20333l;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f20330j = m.f20342l;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f20331k = f.f20335l;

        Matrix a(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8);
    }

    private static class c extends a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f20332l = new c();

        private c() {
        }

        @Override // j1.p.a
        public void b(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8, float f9, float f10) {
            matrix.setTranslate((int) (rect.left + ((rect.width() - i7) * 0.5f) + 0.5f), (int) (rect.top + ((rect.height() - i8) * 0.5f) + 0.5f));
        }

        public String toString() {
            return "center";
        }
    }

    private static class d extends a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f20333l = new d();

        private d() {
        }

        @Override // j1.p.a
        public void b(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8, float f9, float f10) {
            float fHeight;
            float fWidth;
            if (f10 > f9) {
                fWidth = rect.left + ((rect.width() - (i7 * f10)) * 0.5f);
                fHeight = rect.top;
                f9 = f10;
            } else {
                float f11 = rect.left;
                fHeight = ((rect.height() - (i8 * f9)) * 0.5f) + rect.top;
                fWidth = f11;
            }
            matrix.setScale(f9, f9);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "center_crop";
        }
    }

    private static class e extends a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f20334l = new e();

        private e() {
        }

        @Override // j1.p.a
        public void b(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8, float f9, float f10) {
            float fMin = Math.min(Math.min(f9, f10), 1.0f);
            float fWidth = rect.left + ((rect.width() - (i7 * fMin)) * 0.5f);
            float fHeight = rect.top + ((rect.height() - (i8 * fMin)) * 0.5f);
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "center_inside";
        }
    }

    private static class f extends a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f20335l = new f();

        private f() {
        }

        @Override // j1.p.a
        public void b(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8, float f9, float f10) {
            float fMin = Math.min(f9, f10);
            float f11 = rect.left;
            float fHeight = rect.top + (rect.height() - (i8 * fMin));
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (f11 + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    private static class g extends a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f20336l = new g();

        private g() {
        }

        @Override // j1.p.a
        public void b(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8, float f9, float f10) {
            float fMin = Math.min(f9, f10);
            float fWidth = rect.left + ((rect.width() - (i7 * fMin)) * 0.5f);
            float fHeight = rect.top + ((rect.height() - (i8 * fMin)) * 0.5f);
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "fit_center";
        }
    }

    private static class h extends a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f20337l = new h();

        private h() {
        }

        @Override // j1.p.a
        public void b(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8, float f9, float f10) {
            float fMin = Math.min(f9, f10);
            float fWidth = rect.left + (rect.width() - (i7 * fMin));
            float fHeight = rect.top + (rect.height() - (i8 * fMin));
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "fit_end";
        }
    }

    private static class i extends a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f20338l = new i();

        private i() {
        }

        @Override // j1.p.a
        public void b(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8, float f9, float f10) {
            float fMin = Math.min(f9, f10);
            float f11 = rect.left;
            float f12 = rect.top;
            matrix.setScale(fMin, fMin);
            matrix.postTranslate((int) (f11 + 0.5f), (int) (f12 + 0.5f));
        }

        public String toString() {
            return "fit_start";
        }
    }

    private static class j extends a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f20339l = new j();

        private j() {
        }

        @Override // j1.p.a
        public void b(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8, float f9, float f10) {
            float f11 = rect.left;
            float fHeight = rect.top + ((rect.height() - (i8 * f9)) * 0.5f);
            matrix.setScale(f9, f9);
            matrix.postTranslate((int) (f11 + 0.5f), (int) (fHeight + 0.5f));
        }

        public String toString() {
            return "fit_x";
        }
    }

    private static class k extends a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f20340l = new k();

        private k() {
        }

        @Override // j1.p.a
        public void b(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8, float f9, float f10) {
            float f11 = rect.left;
            float f12 = rect.top;
            matrix.setScale(f9, f10);
            matrix.postTranslate((int) (f11 + 0.5f), (int) (f12 + 0.5f));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    private static class l extends a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f20341l = new l();

        private l() {
        }

        @Override // j1.p.a
        public void b(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8, float f9, float f10) {
            float fWidth = rect.left + ((rect.width() - (i7 * f10)) * 0.5f);
            float f11 = rect.top;
            matrix.setScale(f10, f10);
            matrix.postTranslate((int) (fWidth + 0.5f), (int) (f11 + 0.5f));
        }

        public String toString() {
            return "fit_y";
        }
    }

    private static class m extends a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final b f20342l = new m();

        private m() {
        }

        @Override // j1.p.a
        public void b(Matrix matrix, Rect rect, int i7, int i8, float f7, float f8, float f9, float f10) {
            float fMax;
            float fMax2;
            if (f10 > f9) {
                float f11 = i7 * f10;
                fMax = rect.left + Math.max(Math.min((rect.width() * 0.5f) - (f7 * f11), 0.0f), rect.width() - f11);
                fMax2 = rect.top;
                f9 = f10;
            } else {
                fMax = rect.left;
                float f12 = i8 * f9;
                fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f8 * f12), 0.0f), rect.height() - f12) + rect.top;
            }
            matrix.setScale(f9, f9);
            matrix.postTranslate((int) (fMax + 0.5f), (int) (fMax2 + 0.5f));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o a(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof o) {
            return (o) drawable;
        }
        if (drawable instanceof InterfaceC1776c) {
            return a(((InterfaceC1776c) drawable).s());
        }
        if (drawable instanceof AbstractC1774a) {
            AbstractC1774a abstractC1774a = (AbstractC1774a) drawable;
            int iD = abstractC1774a.d();
            for (int i7 = 0; i7 < iD; i7++) {
                o oVarA = a(abstractC1774a.b(i7));
                if (oVarA != null) {
                    return oVarA;
                }
            }
        }
        return null;
    }
}
