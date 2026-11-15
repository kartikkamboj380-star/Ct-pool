package I;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f1478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ByteBuffer f1479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f1482e = d.a();

    protected int a(int i7) {
        return i7 + this.f1479b.getInt(i7);
    }

    protected int b(int i7) {
        if (i7 < this.f1481d) {
            return this.f1479b.getShort(this.f1480c + i7);
        }
        return 0;
    }

    protected void c(int i7, ByteBuffer byteBuffer) {
        short s6;
        this.f1479b = byteBuffer;
        if (byteBuffer != null) {
            this.f1478a = i7;
            int i8 = i7 - byteBuffer.getInt(i7);
            this.f1480c = i8;
            s6 = this.f1479b.getShort(i8);
        } else {
            s6 = 0;
            this.f1478a = 0;
            this.f1480c = 0;
        }
        this.f1481d = s6;
    }

    protected int d(int i7) {
        int i8 = i7 + this.f1478a;
        return i8 + this.f1479b.getInt(i8) + 4;
    }

    protected int e(int i7) {
        int i8 = i7 + this.f1478a;
        return this.f1479b.getInt(i8 + this.f1479b.getInt(i8));
    }
}
