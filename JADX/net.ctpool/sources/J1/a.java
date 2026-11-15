package J1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y1.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config f1652a = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f1653b;

    private static void c(Bitmap bitmap, Bitmap bitmap2) {
        if (!p.a() || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            return;
        }
        try {
            if (f1653b == null) {
                int i7 = Bitmaps.f10696a;
                f1653b = Bitmaps.class.getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
            }
            f1653b.invoke(null, bitmap, bitmap2);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e10);
        }
    }

    @Override // J1.d
    public S0.a a(Bitmap bitmap, v1.b bVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = f1652a;
        }
        S0.a aVarD = bVar.d(width, height, config);
        try {
            e((Bitmap) aVarD.j(), bitmap);
            return aVarD.clone();
        } finally {
            S0.a.g(aVarD);
        }
    }

    @Override // J1.d
    public I0.d b() {
        return null;
    }

    public void e(Bitmap bitmap, Bitmap bitmap2) {
        c(bitmap, bitmap2);
        d(bitmap);
    }

    @Override // J1.d
    public String getName() {
        return "Unknown postprocessor";
    }

    public void d(Bitmap bitmap) {
    }
}
