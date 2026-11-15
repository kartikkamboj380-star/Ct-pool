package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class g0 extends Y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f6115b;

    public g0(Context context, Resources resources) {
        super(resources);
        this.f6115b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i7) {
        Drawable drawableA = a(i7);
        Context context = (Context) this.f6115b.get();
        if (drawableA != null && context != null) {
            X.g().w(context, i7, drawableA);
        }
        return drawableA;
    }
}
