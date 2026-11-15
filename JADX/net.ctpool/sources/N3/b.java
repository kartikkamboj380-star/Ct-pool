package N3;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f2145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2146b;

    public b(float f7, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f2145a;
            f7 += ((b) cVar).f2146b;
        }
        this.f2145a = cVar;
        this.f2146b = f7;
    }

    @Override // N3.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f2145a.a(rectF) + this.f2146b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2145a.equals(bVar.f2145a) && this.f2146b == bVar.f2146b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2145a, Float.valueOf(this.f2146b)});
    }
}
