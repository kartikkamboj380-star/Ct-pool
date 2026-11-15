package a;

/* JADX INFO: renamed from: a.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0493b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4667a = "_COROUTINE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f4667a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
