package N3;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2198a;

    public i(float f7) {
        this.f2198a = f7;
    }

    @Override // N3.c
    public float a(RectF rectF) {
        return this.f2198a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f2198a == ((i) obj).f2198a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2198a)});
    }
}
