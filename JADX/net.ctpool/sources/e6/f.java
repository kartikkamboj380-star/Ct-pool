package e6;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f19230a = new f();

    private f() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        w5.k.f(logRecord, "record");
        e eVar = e.f19229c;
        String loggerName = logRecord.getLoggerName();
        w5.k.e(loggerName, "record.loggerName");
        int iB = g.b(logRecord);
        String message = logRecord.getMessage();
        w5.k.e(message, "record.message");
        eVar.a(loggerName, iB, message, logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
