package j4;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
class g implements Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Logger f20364s = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RandomAccessFile f20365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f20366n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f20367o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f20368p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b f20369q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final byte[] f20370r = new byte[16];

    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f20371a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f20372b;

        a(StringBuilder sb) {
            this.f20372b = sb;
        }

        @Override // j4.g.d
        public void a(InputStream inputStream, int i7) {
            if (this.f20371a) {
                this.f20371a = false;
            } else {
                this.f20372b.append(", ");
            }
            this.f20372b.append(i7);
        }
    }

    static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final b f20374c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f20375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f20376b;

        b(int i7, int i8) {
            this.f20375a = i7;
            this.f20376b = i8;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f20375a + ", length = " + this.f20376b + "]";
        }
    }

    private final class c extends InputStream {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f20377m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f20378n;

        private c(b bVar) {
            this.f20377m = g.this.H0(bVar.f20375a + 4);
            this.f20378n = bVar.f20376b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f20378n == 0) {
                return -1;
            }
            g.this.f20365m.seek(this.f20377m);
            int i7 = g.this.f20365m.read();
            this.f20377m = g.this.H0(this.f20377m + 1);
            this.f20378n--;
            return i7;
        }

        /* synthetic */ c(g gVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) throws IOException {
            g.z(bArr, "buffer");
            if ((i7 | i8) < 0 || i8 > bArr.length - i7) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i9 = this.f20378n;
            if (i9 <= 0) {
                return -1;
            }
            if (i8 > i9) {
                i8 = i9;
            }
            g.this.j0(this.f20377m, bArr, i7, i8);
            this.f20377m = g.this.H0(this.f20377m + i8);
            this.f20378n -= i8;
            return i8;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i7);
    }

    public g(File file) throws IOException {
        if (!file.exists()) {
            o(file);
        }
        this.f20365m = B(file);
        U();
    }

    private static RandomAccessFile B(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private void B0(int i7) throws IOException {
        this.f20365m.setLength(i7);
        this.f20365m.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H0(int i7) {
        int i8 = this.f20366n;
        return i7 < i8 ? i7 : (i7 + 16) - i8;
    }

    private b J(int i7) throws IOException {
        if (i7 == 0) {
            return b.f20374c;
        }
        this.f20365m.seek(i7);
        return new b(i7, this.f20365m.readInt());
    }

    private void M0(int i7, int i8, int i9, int i10) throws IOException {
        S0(this.f20370r, i7, i8, i9, i10);
        this.f20365m.seek(0L);
        this.f20365m.write(this.f20370r);
    }

    private static void R0(byte[] bArr, int i7, int i8) {
        bArr[i7] = (byte) (i8 >> 24);
        bArr[i7 + 1] = (byte) (i8 >> 16);
        bArr[i7 + 2] = (byte) (i8 >> 8);
        bArr[i7 + 3] = (byte) i8;
    }

    private static void S0(byte[] bArr, int... iArr) {
        int i7 = 0;
        for (int i8 : iArr) {
            R0(bArr, i7, i8);
            i7 += 4;
        }
    }

    private void U() throws IOException {
        this.f20365m.seek(0L);
        this.f20365m.readFully(this.f20370r);
        int iW = W(this.f20370r, 0);
        this.f20366n = iW;
        if (iW <= this.f20365m.length()) {
            this.f20367o = W(this.f20370r, 4);
            int iW2 = W(this.f20370r, 8);
            int iW3 = W(this.f20370r, 12);
            this.f20368p = J(iW2);
            this.f20369q = J(iW3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f20366n + ", Actual length: " + this.f20365m.length());
    }

    private static int W(byte[] bArr, int i7) {
        return ((bArr[i7] & 255) << 24) + ((bArr[i7 + 1] & 255) << 16) + ((bArr[i7 + 2] & 255) << 8) + (bArr[i7 + 3] & 255);
    }

    private int a0() {
        return this.f20366n - D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(int i7, byte[] bArr, int i8, int i9) throws IOException {
        RandomAccessFile randomAccessFile;
        int iH0 = H0(i7);
        int i10 = iH0 + i9;
        int i11 = this.f20366n;
        if (i10 <= i11) {
            this.f20365m.seek(iH0);
            randomAccessFile = this.f20365m;
        } else {
            int i12 = i11 - iH0;
            this.f20365m.seek(iH0);
            this.f20365m.readFully(bArr, i8, i12);
            this.f20365m.seek(16L);
            randomAccessFile = this.f20365m;
            i8 += i12;
            i9 -= i12;
        }
        randomAccessFile.readFully(bArr, i8, i9);
    }

    private void l(int i7) throws IOException {
        int i8 = i7 + 4;
        int iA0 = a0();
        if (iA0 >= i8) {
            return;
        }
        int i9 = this.f20366n;
        do {
            iA0 += i9;
            i9 <<= 1;
        } while (iA0 < i8);
        B0(i9);
        b bVar = this.f20369q;
        int iH0 = H0(bVar.f20375a + 4 + bVar.f20376b);
        if (iH0 < this.f20368p.f20375a) {
            FileChannel channel = this.f20365m.getChannel();
            channel.position(this.f20366n);
            long j7 = iH0 - 4;
            if (channel.transferTo(16L, j7, channel) != j7) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i10 = this.f20369q.f20375a;
        int i11 = this.f20368p.f20375a;
        if (i10 < i11) {
            int i12 = (this.f20366n + i10) - 16;
            M0(i9, this.f20367o, i11, i12);
            this.f20369q = new b(i12, this.f20369q.f20376b);
        } else {
            M0(i9, this.f20367o, i11, i10);
        }
        this.f20366n = i9;
    }

    private void n0(int i7, byte[] bArr, int i8, int i9) throws IOException {
        RandomAccessFile randomAccessFile;
        int iH0 = H0(i7);
        int i10 = iH0 + i9;
        int i11 = this.f20366n;
        if (i10 <= i11) {
            this.f20365m.seek(iH0);
            randomAccessFile = this.f20365m;
        } else {
            int i12 = i11 - iH0;
            this.f20365m.seek(iH0);
            this.f20365m.write(bArr, i8, i12);
            this.f20365m.seek(16L);
            randomAccessFile = this.f20365m;
            i8 += i12;
            i9 -= i12;
        }
        randomAccessFile.write(bArr, i8, i9);
    }

    private static void o(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileB = B(file2);
        try {
            randomAccessFileB.setLength(4096L);
            randomAccessFileB.seek(0L);
            byte[] bArr = new byte[16];
            S0(bArr, 4096, 0, 0, 0);
            randomAccessFileB.write(bArr);
            randomAccessFileB.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileB.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object z(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public int D0() {
        if (this.f20367o == 0) {
            return 16;
        }
        b bVar = this.f20369q;
        int i7 = bVar.f20375a;
        int i8 = this.f20368p.f20375a;
        return i7 >= i8 ? (i7 - i8) + 4 + bVar.f20376b + 16 : (((i7 + 4) + bVar.f20376b) + this.f20366n) - i8;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f20365m.close();
    }

    public void f(byte[] bArr) {
        g(bArr, 0, bArr.length);
    }

    public synchronized void g(byte[] bArr, int i7, int i8) {
        int iH0;
        try {
            z(bArr, "buffer");
            if ((i7 | i8) < 0 || i8 > bArr.length - i7) {
                throw new IndexOutOfBoundsException();
            }
            l(i8);
            boolean zW = w();
            if (zW) {
                iH0 = 16;
            } else {
                b bVar = this.f20369q;
                iH0 = H0(bVar.f20375a + 4 + bVar.f20376b);
            }
            b bVar2 = new b(iH0, i8);
            R0(this.f20370r, 0, i8);
            n0(bVar2.f20375a, this.f20370r, 0, 4);
            n0(bVar2.f20375a + 4, bArr, i7, i8);
            M0(this.f20366n, this.f20367o + 1, zW ? bVar2.f20375a : this.f20368p.f20375a, bVar2.f20375a);
            this.f20369q = bVar2;
            this.f20367o++;
            if (zW) {
                this.f20368p = bVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void h0() {
        try {
            if (w()) {
                throw new NoSuchElementException();
            }
            if (this.f20367o == 1) {
                j();
            } else {
                b bVar = this.f20368p;
                int iH0 = H0(bVar.f20375a + 4 + bVar.f20376b);
                j0(iH0, this.f20370r, 0, 4);
                int iW = W(this.f20370r, 0);
                M0(this.f20366n, this.f20367o - 1, iH0, this.f20369q.f20375a);
                this.f20367o--;
                this.f20368p = new b(iH0, iW);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void j() {
        try {
            M0(4096, 0, 0, 0);
            this.f20367o = 0;
            b bVar = b.f20374c;
            this.f20368p = bVar;
            this.f20369q = bVar;
            if (this.f20366n > 4096) {
                B0(4096);
            }
            this.f20366n = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void n(d dVar) {
        int iH0 = this.f20368p.f20375a;
        for (int i7 = 0; i7 < this.f20367o; i7++) {
            b bVarJ = J(iH0);
            dVar.a(new c(this, bVarJ, null), bVarJ.f20376b);
            iH0 = H0(bVarJ.f20375a + 4 + bVarJ.f20376b);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f20366n);
        sb.append(", size=");
        sb.append(this.f20367o);
        sb.append(", first=");
        sb.append(this.f20368p);
        sb.append(", last=");
        sb.append(this.f20369q);
        sb.append(", element lengths=[");
        try {
            n(new a(sb));
        } catch (IOException e7) {
            f20364s.log(Level.WARNING, "read error", (Throwable) e7);
        }
        sb.append("]]");
        return sb.toString();
    }

    public synchronized boolean w() {
        return this.f20367o == 0;
    }
}
