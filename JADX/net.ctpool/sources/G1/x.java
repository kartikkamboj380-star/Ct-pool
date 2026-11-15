package G1;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f1229a = new x();

    private x() {
    }

    public static final int a(int i7, int i8, int i9) {
        return Math.min(Math.max(0, i9 - i7), i8);
    }

    public static final void b(int i7, int i8, int i9, int i10, int i11) {
        O0.l.d(i10 >= 0, "count (%d) ! >= 0", Integer.valueOf(i10));
        O0.l.d(i7 >= 0, "offset (%d) ! >= 0", Integer.valueOf(i7));
        O0.l.d(i9 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i9));
        O0.l.d(i7 + i10 <= i11, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11));
        O0.l.d(i9 + i10 <= i8, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i8));
    }
}
