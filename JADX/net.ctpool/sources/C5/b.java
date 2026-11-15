package C5;

import j5.AbstractC1784C;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC1784C {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f951m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f952n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f953o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f954p;

    public b(int i7, int i8, int i9) {
        this.f951m = i9;
        this.f952n = i8;
        boolean z6 = false;
        if (i9 <= 0 ? i7 >= i8 : i7 <= i8) {
            z6 = true;
        }
        this.f953o = z6;
        this.f954p = z6 ? i7 : i8;
    }

    @Override // j5.AbstractC1784C
    public int d() {
        int i7 = this.f954p;
        if (i7 != this.f952n) {
            this.f954p = this.f951m + i7;
        } else {
            if (!this.f953o) {
                throw new NoSuchElementException();
            }
            this.f953o = false;
        }
        return i7;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f953o;
    }
}
