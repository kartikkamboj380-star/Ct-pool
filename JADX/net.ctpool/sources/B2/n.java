package B2;

import android.view.animation.Interpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: loaded from: classes.dex */
class n implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f738a;

    public n(float f7) {
        this.f738a = f7;
    }

    public static float a(ReadableMap readableMap) {
        if (readableMap.getType("springDamping").equals(ReadableType.Number)) {
            return (float) readableMap.getDouble("springDamping");
        }
        return 0.5f;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f7) {
        double dPow = Math.pow(2.0d, (-10.0f) * f7);
        float f8 = this.f738a;
        return (float) ((dPow * Math.sin(((((double) (f7 - (f8 / 4.0f))) * 3.141592653589793d) * 2.0d) / ((double) f8))) + 1.0d);
    }
}
