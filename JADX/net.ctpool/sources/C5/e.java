package C5;

import j5.AbstractC1785D;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends AbstractC1785D {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f962n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f963o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f964p;

    public e(long j7, long j8, long j9) {
        this.f961m = j9;
        this.f962n = j8;
        boolean z6 = false;
        if (j9 <= 0 ? j7 >= j8 : j7 <= j8) {
            z6 = true;
        }
        this.f963o = z6;
        this.f964p = z6 ? j7 : j8;
    }

    @Override // j5.AbstractC1785D
    public long d() {
        long j7 = this.f964p;
        if (j7 != this.f962n) {
            this.f964p = this.f961m + j7;
        } else {
            if (!this.f963o) {
                throw new NoSuchElementException();
            }
            this.f963o = false;
        }
        return j7;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f963o;
    }
}
