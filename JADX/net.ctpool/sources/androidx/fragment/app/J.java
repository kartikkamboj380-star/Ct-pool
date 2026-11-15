package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
final class J extends Writer {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f8059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private StringBuilder f8060n = new StringBuilder(128);

    J(String str) {
        this.f8059m = str;
    }

    private void a() {
        if (this.f8060n.length() > 0) {
            Log.d(this.f8059m, this.f8060n.toString());
            StringBuilder sb = this.f8060n;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c7 = cArr[i7 + i9];
            if (c7 == '\n') {
                a();
            } else {
                this.f8060n.append(c7);
            }
        }
    }
}
