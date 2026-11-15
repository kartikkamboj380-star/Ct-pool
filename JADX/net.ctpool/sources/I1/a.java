package I1;

import I0.d;
import I0.i;
import O0.l;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;

/* JADX INFO: loaded from: classes.dex */
public class a extends J1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f1515e;

    public a(int i7, int i8) {
        l.b(Boolean.valueOf(i7 > 0));
        l.b(Boolean.valueOf(i8 > 0));
        this.f1513c = i7;
        this.f1514d = i8;
    }

    @Override // J1.a, J1.d
    public d b() {
        if (this.f1515e == null) {
            this.f1515e = new i(String.format(null, "i%dr%d", Integer.valueOf(this.f1513c), Integer.valueOf(this.f1514d)));
        }
        return this.f1515e;
    }

    @Override // J1.a
    public void d(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f1513c, this.f1514d);
    }
}
