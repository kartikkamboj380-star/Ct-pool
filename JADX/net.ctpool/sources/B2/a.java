package B2;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C0892s;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f682e = S1.f.g(d.f696n, new LinearInterpolator(), d.f697o, new AccelerateInterpolator(), d.f698p, new DecelerateInterpolator(), d.f699q, new AccelerateDecelerateInterpolator());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Interpolator f683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected b f685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f686d;

    a() {
    }

    private static Interpolator c(d dVar, ReadableMap readableMap) {
        Interpolator nVar = dVar.equals(d.f700r) ? new n(n.a(readableMap)) : (Interpolator) f682e.get(dVar);
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalArgumentException("Missing interpolator for type : " + dVar);
    }

    public final Animation a(View view, int i7, int i8, int i9, int i10) {
        if (!e()) {
            return null;
        }
        Animation animationB = b(view, i7, i8, i9, i10);
        if (animationB != null) {
            animationB.setDuration(this.f686d);
            animationB.setStartOffset(this.f684b);
            animationB.setInterpolator(this.f683a);
        }
        return animationB;
    }

    abstract Animation b(View view, int i7, int i8, int i9, int i10);

    public void d(ReadableMap readableMap, int i7) {
        this.f685c = readableMap.hasKey("property") ? b.h(readableMap.getString("property")) : null;
        if (readableMap.hasKey("duration")) {
            i7 = readableMap.getInt("duration");
        }
        this.f686d = i7;
        this.f684b = readableMap.hasKey("delay") ? readableMap.getInt("delay") : 0;
        if (!readableMap.hasKey("type")) {
            throw new IllegalArgumentException("Missing interpolation type.");
        }
        this.f683a = c(d.h(readableMap.getString("type")), readableMap);
        if (e()) {
            return;
        }
        throw new C0892s("Invalid layout animation : " + readableMap);
    }

    abstract boolean e();

    public void f() {
        this.f685c = null;
        this.f686d = 0;
        this.f684b = 0;
        this.f683a = null;
    }
}
