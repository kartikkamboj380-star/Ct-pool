package N3;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2144a;

    public a(float f7) {
        this.f2144a = f7;
    }

    @Override // N3.c
    public float a(RectF rectF) {
        return this.f2144a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f2144a == ((a) obj).f2144a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2144a)});
    }
}
