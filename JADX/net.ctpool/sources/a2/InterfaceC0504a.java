package a2;

import android.view.View;
import com.facebook.react.uimanager.G;
import com.facebook.yoga.p;

/* JADX INFO: renamed from: a2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0504a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0113a f4709a = C0113a.f4710a;

    /* JADX INFO: renamed from: a2.a$a, reason: collision with other inner class name */
    public static final class C0113a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0113a f4710a = new C0113a();

        private C0113a() {
        }

        public final float a(int i7) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            if (mode == 0) {
                return Float.POSITIVE_INFINITY;
            }
            return size;
        }

        public final float b(int i7) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            if (mode == 1073741824) {
                return size;
            }
            return 0.0f;
        }

        public final p c(float f7, float f8) {
            return f7 == f8 ? p.EXACTLY : Float.isInfinite(f8) ? p.UNDEFINED : p.AT_MOST;
        }

        public final float d(float f7, float f8) {
            if (f7 != f8 && Float.isInfinite(f8)) {
                return Float.POSITIVE_INFINITY;
            }
            return G.d(f8);
        }
    }

    static float a(int i7) {
        return f4709a.b(i7);
    }

    static float b(int i7) {
        return f4709a.a(i7);
    }

    static p c(float f7, float f8) {
        return f4709a.c(f7, f8);
    }

    static float d(float f7, float f8) {
        return f4709a.d(f7, f8);
    }
}
