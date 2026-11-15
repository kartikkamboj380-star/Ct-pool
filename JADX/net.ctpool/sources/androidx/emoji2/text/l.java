package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
abstract class l {

    private static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f7915a;

        a(ByteBuffer byteBuffer) {
            this.f7915a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.l.c
        public int a() {
            return l.d(this.f7915a.getShort());
        }

        @Override // androidx.emoji2.text.l.c
        public int b() {
            return this.f7915a.getInt();
        }

        @Override // androidx.emoji2.text.l.c
        public void c(int i7) {
            ByteBuffer byteBuffer = this.f7915a;
            byteBuffer.position(byteBuffer.position() + i7);
        }

        @Override // androidx.emoji2.text.l.c
        public long d() {
            return l.c(this.f7915a.getInt());
        }

        @Override // androidx.emoji2.text.l.c
        public long getPosition() {
            return this.f7915a.position();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f7916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f7917b;

        b(long j7, long j8) {
            this.f7916a = j7;
            this.f7917b = j8;
        }

        long a() {
            return this.f7916a;
        }
    }

    private interface c {
        int a();

        int b();

        void c(int i7);

        long d();

        long getPosition();
    }

    private static b a(c cVar) throws IOException {
        long jD;
        cVar.c(4);
        int iA = cVar.a();
        if (iA > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.c(6);
        int i7 = 0;
        while (true) {
            if (i7 >= iA) {
                jD = -1;
                break;
            }
            int iB = cVar.b();
            cVar.c(4);
            jD = cVar.d();
            cVar.c(4);
            if (1835365473 == iB) {
                break;
            }
            i7++;
        }
        if (jD != -1) {
            cVar.c((int) (jD - cVar.getPosition()));
            cVar.c(12);
            long jD2 = cVar.d();
            for (int i8 = 0; i8 < jD2; i8++) {
                int iB2 = cVar.b();
                long jD3 = cVar.d();
                long jD4 = cVar.d();
                if (1164798569 == iB2 || 1701669481 == iB2) {
                    return new b(jD3 + jD, jD4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static I.b b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return I.b.h(byteBufferDuplicate);
    }

    static long c(int i7) {
        return ((long) i7) & 4294967295L;
    }

    static int d(short s6) {
        return s6 & 65535;
    }
}
