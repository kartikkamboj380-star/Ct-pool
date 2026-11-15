package q4;

/* JADX INFO: renamed from: q4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1999b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21884a;

    public C1999b(int i7) {
        this.f21884a = i7;
    }

    @Override // q4.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i7 = this.f21884a;
        if (length <= i7) {
            return stackTraceElementArr;
        }
        int i8 = i7 / 2;
        int i9 = i7 - i8;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i7];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i9);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i8, stackTraceElementArr2, i9, i8);
        return stackTraceElementArr2;
    }
}
