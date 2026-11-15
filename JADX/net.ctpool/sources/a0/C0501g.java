package a0;

import Z.i;
import android.database.sqlite.SQLiteProgram;
import w5.k;

/* JADX INFO: renamed from: a0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0501g implements i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SQLiteProgram f4704m;

    public C0501g(SQLiteProgram sQLiteProgram) {
        k.f(sQLiteProgram, "delegate");
        this.f4704m = sQLiteProgram;
    }

    @Override // Z.i
    public void A0(int i7) {
        this.f4704m.bindNull(i7);
    }

    @Override // Z.i
    public void L(int i7, double d7) {
        this.f4704m.bindDouble(i7, d7);
    }

    @Override // Z.i
    public void b0(int i7, long j7) {
        this.f4704m.bindLong(i7, j7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f4704m.close();
    }

    @Override // Z.i
    public void i0(int i7, byte[] bArr) {
        k.f(bArr, "value");
        this.f4704m.bindBlob(i7, bArr);
    }

    @Override // Z.i
    public void v(int i7, String str) {
        k.f(str, "value");
        this.f4704m.bindString(i7, str);
    }
}
