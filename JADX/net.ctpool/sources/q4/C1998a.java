package q4;

/* JADX INFO: renamed from: q4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1998a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d[] f21882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1999b f21883c;

    public C1998a(int i7, d... dVarArr) {
        this.f21881a = i7;
        this.f21882b = dVarArr;
        this.f21883c = new C1999b(i7);
    }

    @Override // q4.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f21881a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f21882b) {
            if (stackTraceElementArrA.length <= this.f21881a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f21881a ? this.f21883c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
