package q4;

import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f21888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f21889d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f21886a = str;
        this.f21887b = str2;
        this.f21888c = stackTraceElementArr;
        this.f21889d = eVar;
    }

    public static e a(Throwable th, d dVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            eVar = new e(th2.getLocalizedMessage(), th2.getClass().getName(), dVar.a(th2.getStackTrace()), eVar);
        }
        return eVar;
    }
}
