package B2;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.facebook.react.uimanager.C0892s;

/* JADX INFO: loaded from: classes.dex */
abstract class c extends B2.a {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f694a;

        static {
            int[] iArr = new int[b.values().length];
            f694a = iArr;
            try {
                iArr[b.f688n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f694a[b.f691q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f694a[b.f689o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f694a[b.f690p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    c() {
    }

    @Override // B2.a
    Animation b(View view, int i7, int i8, int i9, int i10) {
        b bVar = this.f685c;
        if (bVar == null) {
            throw new C0892s("Missing animated property from animation config");
        }
        int i11 = a.f694a[bVar.ordinal()];
        if (i11 == 1) {
            return new l(view, g() ? view.getAlpha() : 0.0f, g() ? 0.0f : view.getAlpha());
        }
        if (i11 == 2) {
            float f7 = g() ? 1.0f : 0.0f;
            float f8 = g() ? 0.0f : 1.0f;
            return new ScaleAnimation(f7, f8, f7, f8, 1, 0.5f, 1, 0.5f);
        }
        if (i11 == 3) {
            return new ScaleAnimation(g() ? 1.0f : 0.0f, g() ? 0.0f : 1.0f, 1.0f, 1.0f, 1, 0.5f, 1, 0.0f);
        }
        if (i11 == 4) {
            return new ScaleAnimation(1.0f, 1.0f, g() ? 1.0f : 0.0f, g() ? 0.0f : 1.0f, 1, 0.0f, 1, 0.5f);
        }
        throw new C0892s("Missing animation for property : " + this.f685c);
    }

    @Override // B2.a
    boolean e() {
        return this.f686d > 0 && this.f685c != null;
    }

    abstract boolean g();
}
