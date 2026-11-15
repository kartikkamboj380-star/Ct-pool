package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0613h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f7596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f7598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    C0614i f7599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7600e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$b */
    private static final class b extends AbstractC0613h {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final byte[] f7601f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f7602g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f7603h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f7604i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f7605j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f7606k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f7607l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f7608m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f7609n;

        private b(byte[] bArr, int i7, int i8, boolean z6) {
            super();
            this.f7609n = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f7601f = bArr;
            this.f7603h = i8 + i7;
            this.f7605j = i7;
            this.f7606k = i7;
            this.f7602g = z6;
        }

        private void M() {
            int i7 = this.f7603h + this.f7604i;
            this.f7603h = i7;
            int i8 = i7 - this.f7606k;
            int i9 = this.f7609n;
            if (i8 <= i9) {
                this.f7604i = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f7604i = i10;
            this.f7603h = i7 - i10;
        }

        private void P() throws C0630z {
            if (this.f7603h - this.f7605j >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() throws C0630z {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.f7601f;
                int i8 = this.f7605j;
                this.f7605j = i8 + 1;
                if (bArr[i8] >= 0) {
                    return;
                }
            }
            throw C0630z.e();
        }

        private void R() throws C0630z {
            for (int i7 = 0; i7 < 10; i7++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw C0630z.e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public String A() throws C0630z {
            int iJ = J();
            if (iJ > 0) {
                int i7 = this.f7603h;
                int i8 = this.f7605j;
                if (iJ <= i7 - i8) {
                    String strE = q0.e(this.f7601f, i8, iJ);
                    this.f7605j += iJ;
                    return strE;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ <= 0) {
                throw C0630z.f();
            }
            throw C0630z.k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int B() throws C0630z {
            if (e()) {
                this.f7607l = 0;
                return 0;
            }
            int iJ = J();
            this.f7607l = iJ;
            if (r0.a(iJ) != 0) {
                return this.f7607l;
            }
            throw C0630z.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int C() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public long D() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public boolean E(int i7) throws C0630z {
            int iB = r0.b(i7);
            if (iB == 0) {
                P();
                return true;
            }
            if (iB == 1) {
                O(8);
                return true;
            }
            if (iB == 2) {
                O(J());
                return true;
            }
            if (iB == 3) {
                N();
                a(r0.c(r0.a(i7), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C0630z.d();
            }
            O(4);
            return true;
        }

        public byte F() throws C0630z {
            int i7 = this.f7605j;
            if (i7 == this.f7603h) {
                throw C0630z.k();
            }
            byte[] bArr = this.f7601f;
            this.f7605j = i7 + 1;
            return bArr[i7];
        }

        public byte[] G(int i7) throws C0630z {
            if (i7 > 0) {
                int i8 = this.f7603h;
                int i9 = this.f7605j;
                if (i7 <= i8 - i9) {
                    int i10 = i7 + i9;
                    this.f7605j = i10;
                    return Arrays.copyOfRange(this.f7601f, i9, i10);
                }
            }
            if (i7 > 0) {
                throw C0630z.k();
            }
            if (i7 == 0) {
                return AbstractC0629y.f7832c;
            }
            throw C0630z.f();
        }

        public int H() throws C0630z {
            int i7 = this.f7605j;
            if (this.f7603h - i7 < 4) {
                throw C0630z.k();
            }
            byte[] bArr = this.f7601f;
            this.f7605j = i7 + 4;
            return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
        }

        public long I() throws C0630z {
            int i7 = this.f7605j;
            if (this.f7603h - i7 < 8) {
                throw C0630z.k();
            }
            byte[] bArr = this.f7601f;
            this.f7605j = i7 + 8;
            return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
        }

        public int J() {
            int i7;
            int i8 = this.f7605j;
            int i9 = this.f7603h;
            if (i9 != i8) {
                byte[] bArr = this.f7601f;
                int i10 = i8 + 1;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    this.f7605j = i10;
                    return b7;
                }
                if (i9 - i10 >= 9) {
                    int i11 = i8 + 2;
                    int i12 = (bArr[i10] << 7) ^ b7;
                    if (i12 < 0) {
                        i7 = i12 ^ (-128);
                    } else {
                        int i13 = i8 + 3;
                        int i14 = (bArr[i11] << 14) ^ i12;
                        if (i14 >= 0) {
                            i7 = i14 ^ 16256;
                        } else {
                            int i15 = i8 + 4;
                            int i16 = i14 ^ (bArr[i13] << 21);
                            if (i16 < 0) {
                                i7 = (-2080896) ^ i16;
                            } else {
                                i13 = i8 + 5;
                                byte b8 = bArr[i15];
                                int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                                if (b8 < 0) {
                                    i15 = i8 + 6;
                                    if (bArr[i13] < 0) {
                                        i13 = i8 + 7;
                                        if (bArr[i15] < 0) {
                                            i15 = i8 + 8;
                                            if (bArr[i13] < 0) {
                                                i13 = i8 + 9;
                                                if (bArr[i15] < 0) {
                                                    int i18 = i8 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i11 = i18;
                                                        i7 = i17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i7 = i17;
                                }
                                i7 = i17;
                            }
                            i11 = i15;
                        }
                        i11 = i13;
                    }
                    this.f7605j = i11;
                    return i7;
                }
            }
            return (int) L();
        }

        public long K() {
            long j7;
            long j8;
            long j9;
            int i7 = this.f7605j;
            int i8 = this.f7603h;
            if (i8 != i7) {
                byte[] bArr = this.f7601f;
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.f7605j = i9;
                    return b7;
                }
                if (i8 - i9 >= 9) {
                    int i10 = i7 + 2;
                    int i11 = (bArr[i9] << 7) ^ b7;
                    if (i11 < 0) {
                        j7 = i11 ^ (-128);
                    } else {
                        int i12 = i7 + 3;
                        int i13 = (bArr[i10] << 14) ^ i11;
                        if (i13 >= 0) {
                            j7 = i13 ^ 16256;
                            i10 = i12;
                        } else {
                            int i14 = i7 + 4;
                            int i15 = i13 ^ (bArr[i12] << 21);
                            if (i15 < 0) {
                                long j10 = (-2080896) ^ i15;
                                i10 = i14;
                                j7 = j10;
                            } else {
                                long j11 = i15;
                                i10 = i7 + 5;
                                long j12 = j11 ^ (((long) bArr[i14]) << 28);
                                if (j12 >= 0) {
                                    j9 = 266354560;
                                } else {
                                    int i16 = i7 + 6;
                                    long j13 = j12 ^ (((long) bArr[i10]) << 35);
                                    if (j13 < 0) {
                                        j8 = -34093383808L;
                                    } else {
                                        i10 = i7 + 7;
                                        j12 = j13 ^ (((long) bArr[i16]) << 42);
                                        if (j12 >= 0) {
                                            j9 = 4363953127296L;
                                        } else {
                                            i16 = i7 + 8;
                                            j13 = j12 ^ (((long) bArr[i10]) << 49);
                                            if (j13 < 0) {
                                                j8 = -558586000294016L;
                                            } else {
                                                i10 = i7 + 9;
                                                long j14 = (j13 ^ (((long) bArr[i16]) << 56)) ^ 71499008037633920L;
                                                if (j14 < 0) {
                                                    int i17 = i7 + 10;
                                                    if (bArr[i10] >= 0) {
                                                        i10 = i17;
                                                    }
                                                }
                                                j7 = j14;
                                            }
                                        }
                                    }
                                    j7 = j13 ^ j8;
                                    i10 = i16;
                                }
                                j7 = j12 ^ j9;
                            }
                        }
                    }
                    this.f7605j = i10;
                    return j7;
                }
            }
            return L();
        }

        long L() throws C0630z {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                byte bF = F();
                j7 |= ((long) (bF & 127)) << i7;
                if ((bF & 128) == 0) {
                    return j7;
                }
            }
            throw C0630z.e();
        }

        public void N() throws C0630z {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void O(int i7) throws C0630z {
            if (i7 >= 0) {
                int i8 = this.f7603h;
                int i9 = this.f7605j;
                if (i7 <= i8 - i9) {
                    this.f7605j = i9 + i7;
                    return;
                }
            }
            if (i7 >= 0) {
                throw C0630z.k();
            }
            throw C0630z.f();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public void a(int i7) throws C0630z {
            if (this.f7607l != i7) {
                throw C0630z.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int d() {
            return this.f7605j - this.f7606k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public boolean e() {
            return this.f7605j == this.f7603h;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public void k(int i7) {
            this.f7609n = i7;
            M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int l(int i7) throws C0630z {
            if (i7 < 0) {
                throw C0630z.f();
            }
            int iD = i7 + d();
            int i8 = this.f7609n;
            if (iD > i8) {
                throw C0630z.k();
            }
            this.f7609n = iD;
            M();
            return i8;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public boolean m() {
            return K() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public AbstractC0612g n() {
            int iJ = J();
            if (iJ > 0) {
                int i7 = this.f7603h;
                int i8 = this.f7605j;
                if (iJ <= i7 - i8) {
                    AbstractC0612g abstractC0612gA = (this.f7602g && this.f7608m) ? AbstractC0612g.A(this.f7601f, i8, iJ) : AbstractC0612g.m(this.f7601f, i8, iJ);
                    this.f7605j += iJ;
                    return abstractC0612gA;
                }
            }
            return iJ == 0 ? AbstractC0612g.f7582n : AbstractC0612g.y(G(iJ));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int p() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int q() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public long r() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int t() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public long u() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int v() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public long w() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int x() {
            return AbstractC0613h.b(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public long y() {
            return AbstractC0613h.c(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public String z() throws C0630z {
            int iJ = J();
            if (iJ > 0) {
                int i7 = this.f7603h;
                int i8 = this.f7605j;
                if (iJ <= i7 - i8) {
                    String str = new String(this.f7601f, i8, iJ, AbstractC0629y.f7830a);
                    this.f7605j += iJ;
                    return str;
                }
            }
            if (iJ == 0) {
                return "";
            }
            if (iJ < 0) {
                throw C0630z.f();
            }
            throw C0630z.k();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$c */
    private static final class c extends AbstractC0613h {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final InputStream f7610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final byte[] f7611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f7612h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f7613i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f7614j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f7615k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f7616l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f7617m;

        private c(InputStream inputStream, int i7) {
            super();
            this.f7617m = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            AbstractC0629y.b(inputStream, "input");
            this.f7610f = inputStream;
            this.f7611g = new byte[i7];
            this.f7612h = 0;
            this.f7614j = 0;
            this.f7616l = 0;
        }

        private AbstractC0612g F(int i7) throws IOException {
            byte[] bArrI = I(i7);
            if (bArrI != null) {
                return AbstractC0612g.k(bArrI);
            }
            int i8 = this.f7614j;
            int i9 = this.f7612h;
            int length = i9 - i8;
            this.f7616l += i9;
            this.f7614j = 0;
            this.f7612h = 0;
            List<byte[]> listJ = J(i7 - length);
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f7611g, i8, bArr, 0, length);
            for (byte[] bArr2 : listJ) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AbstractC0612g.y(bArr);
        }

        private byte[] H(int i7, boolean z6) throws IOException {
            byte[] bArrI = I(i7);
            if (bArrI != null) {
                return z6 ? (byte[]) bArrI.clone() : bArrI;
            }
            int i8 = this.f7614j;
            int i9 = this.f7612h;
            int length = i9 - i8;
            this.f7616l += i9;
            this.f7614j = 0;
            this.f7612h = 0;
            List<byte[]> listJ = J(i7 - length);
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f7611g, i8, bArr, 0, length);
            for (byte[] bArr2 : listJ) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] I(int i7) throws IOException {
            if (i7 == 0) {
                return AbstractC0629y.f7832c;
            }
            if (i7 < 0) {
                throw C0630z.f();
            }
            int i8 = this.f7616l;
            int i9 = this.f7614j;
            int i10 = i8 + i9 + i7;
            if (i10 - this.f7598c > 0) {
                throw C0630z.j();
            }
            int i11 = this.f7617m;
            if (i10 > i11) {
                S((i11 - i8) - i9);
                throw C0630z.k();
            }
            int i12 = this.f7612h - i9;
            int i13 = i7 - i12;
            if (i13 >= 4096 && i13 > this.f7610f.available()) {
                return null;
            }
            byte[] bArr = new byte[i7];
            System.arraycopy(this.f7611g, this.f7614j, bArr, 0, i12);
            this.f7616l += this.f7612h;
            this.f7614j = 0;
            this.f7612h = 0;
            while (i12 < i7) {
                int i14 = this.f7610f.read(bArr, i12, i7 - i12);
                if (i14 == -1) {
                    throw C0630z.k();
                }
                this.f7616l += i14;
                i12 += i14;
            }
            return bArr;
        }

        private List J(int i7) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i7 > 0) {
                int iMin = Math.min(i7, 4096);
                byte[] bArr = new byte[iMin];
                int i8 = 0;
                while (i8 < iMin) {
                    int i9 = this.f7610f.read(bArr, i8, iMin - i8);
                    if (i9 == -1) {
                        throw C0630z.k();
                    }
                    this.f7616l += i9;
                    i8 += i9;
                }
                i7 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void P() {
            int i7 = this.f7612h + this.f7613i;
            this.f7612h = i7;
            int i8 = this.f7616l + i7;
            int i9 = this.f7617m;
            if (i8 <= i9) {
                this.f7613i = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f7613i = i10;
            this.f7612h = i7 - i10;
        }

        private void Q(int i7) throws C0630z {
            if (X(i7)) {
                return;
            }
            if (i7 <= (this.f7598c - this.f7616l) - this.f7614j) {
                throw C0630z.k();
            }
            throw C0630z.j();
        }

        private void T(int i7) throws C0630z {
            if (i7 < 0) {
                throw C0630z.f();
            }
            int i8 = this.f7616l;
            int i9 = this.f7614j;
            int i10 = i8 + i9 + i7;
            int i11 = this.f7617m;
            if (i10 > i11) {
                S((i11 - i8) - i9);
                throw C0630z.k();
            }
            this.f7616l = i8 + i9;
            int i12 = this.f7612h - i9;
            this.f7612h = 0;
            this.f7614j = 0;
            while (i12 < i7) {
                try {
                    long j7 = i7 - i12;
                    long jSkip = this.f7610f.skip(j7);
                    if (jSkip < 0 || jSkip > j7) {
                        throw new IllegalStateException(this.f7610f.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i12 += (int) jSkip;
                    }
                } finally {
                    this.f7616l += i12;
                    P();
                }
            }
            if (i12 >= i7) {
                return;
            }
            int i13 = this.f7612h;
            int i14 = i13 - this.f7614j;
            this.f7614j = i13;
            while (true) {
                Q(1);
                int i15 = i7 - i14;
                int i16 = this.f7612h;
                if (i15 <= i16) {
                    this.f7614j = i15;
                    return;
                } else {
                    i14 += i16;
                    this.f7614j = i16;
                }
            }
        }

        private void U() throws C0630z {
            if (this.f7612h - this.f7614j >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() throws C0630z {
            for (int i7 = 0; i7 < 10; i7++) {
                byte[] bArr = this.f7611g;
                int i8 = this.f7614j;
                this.f7614j = i8 + 1;
                if (bArr[i8] >= 0) {
                    return;
                }
            }
            throw C0630z.e();
        }

        private void W() throws C0630z {
            for (int i7 = 0; i7 < 10; i7++) {
                if (G() >= 0) {
                    return;
                }
            }
            throw C0630z.e();
        }

        private boolean X(int i7) throws IOException {
            int i8 = this.f7614j;
            int i9 = i8 + i7;
            int i10 = this.f7612h;
            if (i9 <= i10) {
                throw new IllegalStateException("refillBuffer() called when " + i7 + " bytes were already available in buffer");
            }
            int i11 = this.f7598c;
            int i12 = this.f7616l;
            if (i7 > (i11 - i12) - i8 || i12 + i8 + i7 > this.f7617m) {
                return false;
            }
            if (i8 > 0) {
                if (i10 > i8) {
                    byte[] bArr = this.f7611g;
                    System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                }
                this.f7616l += i8;
                this.f7612h -= i8;
                this.f7614j = 0;
            }
            InputStream inputStream = this.f7610f;
            byte[] bArr2 = this.f7611g;
            int i13 = this.f7612h;
            int i14 = inputStream.read(bArr2, i13, Math.min(bArr2.length - i13, (this.f7598c - this.f7616l) - i13));
            if (i14 == 0 || i14 < -1 || i14 > this.f7611g.length) {
                throw new IllegalStateException(this.f7610f.getClass() + "#read(byte[]) returned invalid result: " + i14 + "\nThe InputStream implementation is buggy.");
            }
            if (i14 <= 0) {
                return false;
            }
            this.f7612h += i14;
            P();
            if (this.f7612h >= i7) {
                return true;
            }
            return X(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public String A() throws IOException {
            byte[] bArrH;
            int iM = M();
            int i7 = this.f7614j;
            int i8 = this.f7612h;
            if (iM <= i8 - i7 && iM > 0) {
                bArrH = this.f7611g;
                this.f7614j = i7 + iM;
            } else {
                if (iM == 0) {
                    return "";
                }
                i7 = 0;
                if (iM <= i8) {
                    Q(iM);
                    bArrH = this.f7611g;
                    this.f7614j = iM;
                } else {
                    bArrH = H(iM, false);
                }
            }
            return q0.e(bArrH, i7, iM);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int B() throws C0630z {
            if (e()) {
                this.f7615k = 0;
                return 0;
            }
            int iM = M();
            this.f7615k = iM;
            if (r0.a(iM) != 0) {
                return this.f7615k;
            }
            throw C0630z.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int C() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public long D() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public boolean E(int i7) throws C0630z {
            int iB = r0.b(i7);
            if (iB == 0) {
                U();
                return true;
            }
            if (iB == 1) {
                S(8);
                return true;
            }
            if (iB == 2) {
                S(M());
                return true;
            }
            if (iB == 3) {
                R();
                a(r0.c(r0.a(i7), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C0630z.d();
            }
            S(4);
            return true;
        }

        public byte G() throws C0630z {
            if (this.f7614j == this.f7612h) {
                Q(1);
            }
            byte[] bArr = this.f7611g;
            int i7 = this.f7614j;
            this.f7614j = i7 + 1;
            return bArr[i7];
        }

        public int K() throws C0630z {
            int i7 = this.f7614j;
            if (this.f7612h - i7 < 4) {
                Q(4);
                i7 = this.f7614j;
            }
            byte[] bArr = this.f7611g;
            this.f7614j = i7 + 4;
            return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
        }

        public long L() throws C0630z {
            int i7 = this.f7614j;
            if (this.f7612h - i7 < 8) {
                Q(8);
                i7 = this.f7614j;
            }
            byte[] bArr = this.f7611g;
            this.f7614j = i7 + 8;
            return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
        }

        public int M() {
            int i7;
            int i8 = this.f7614j;
            int i9 = this.f7612h;
            if (i9 != i8) {
                byte[] bArr = this.f7611g;
                int i10 = i8 + 1;
                byte b7 = bArr[i8];
                if (b7 >= 0) {
                    this.f7614j = i10;
                    return b7;
                }
                if (i9 - i10 >= 9) {
                    int i11 = i8 + 2;
                    int i12 = (bArr[i10] << 7) ^ b7;
                    if (i12 < 0) {
                        i7 = i12 ^ (-128);
                    } else {
                        int i13 = i8 + 3;
                        int i14 = (bArr[i11] << 14) ^ i12;
                        if (i14 >= 0) {
                            i7 = i14 ^ 16256;
                        } else {
                            int i15 = i8 + 4;
                            int i16 = i14 ^ (bArr[i13] << 21);
                            if (i16 < 0) {
                                i7 = (-2080896) ^ i16;
                            } else {
                                i13 = i8 + 5;
                                byte b8 = bArr[i15];
                                int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                                if (b8 < 0) {
                                    i15 = i8 + 6;
                                    if (bArr[i13] < 0) {
                                        i13 = i8 + 7;
                                        if (bArr[i15] < 0) {
                                            i15 = i8 + 8;
                                            if (bArr[i13] < 0) {
                                                i13 = i8 + 9;
                                                if (bArr[i15] < 0) {
                                                    int i18 = i8 + 10;
                                                    if (bArr[i13] >= 0) {
                                                        i11 = i18;
                                                        i7 = i17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i7 = i17;
                                }
                                i7 = i17;
                            }
                            i11 = i15;
                        }
                        i11 = i13;
                    }
                    this.f7614j = i11;
                    return i7;
                }
            }
            return (int) O();
        }

        public long N() {
            long j7;
            long j8;
            long j9;
            int i7 = this.f7614j;
            int i8 = this.f7612h;
            if (i8 != i7) {
                byte[] bArr = this.f7611g;
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 >= 0) {
                    this.f7614j = i9;
                    return b7;
                }
                if (i8 - i9 >= 9) {
                    int i10 = i7 + 2;
                    int i11 = (bArr[i9] << 7) ^ b7;
                    if (i11 < 0) {
                        j7 = i11 ^ (-128);
                    } else {
                        int i12 = i7 + 3;
                        int i13 = (bArr[i10] << 14) ^ i11;
                        if (i13 >= 0) {
                            j7 = i13 ^ 16256;
                            i10 = i12;
                        } else {
                            int i14 = i7 + 4;
                            int i15 = i13 ^ (bArr[i12] << 21);
                            if (i15 < 0) {
                                long j10 = (-2080896) ^ i15;
                                i10 = i14;
                                j7 = j10;
                            } else {
                                long j11 = i15;
                                i10 = i7 + 5;
                                long j12 = j11 ^ (((long) bArr[i14]) << 28);
                                if (j12 >= 0) {
                                    j9 = 266354560;
                                } else {
                                    int i16 = i7 + 6;
                                    long j13 = j12 ^ (((long) bArr[i10]) << 35);
                                    if (j13 < 0) {
                                        j8 = -34093383808L;
                                    } else {
                                        i10 = i7 + 7;
                                        j12 = j13 ^ (((long) bArr[i16]) << 42);
                                        if (j12 >= 0) {
                                            j9 = 4363953127296L;
                                        } else {
                                            i16 = i7 + 8;
                                            j13 = j12 ^ (((long) bArr[i10]) << 49);
                                            if (j13 < 0) {
                                                j8 = -558586000294016L;
                                            } else {
                                                i10 = i7 + 9;
                                                long j14 = (j13 ^ (((long) bArr[i16]) << 56)) ^ 71499008037633920L;
                                                if (j14 < 0) {
                                                    int i17 = i7 + 10;
                                                    if (bArr[i10] >= 0) {
                                                        i10 = i17;
                                                    }
                                                }
                                                j7 = j14;
                                            }
                                        }
                                    }
                                    j7 = j13 ^ j8;
                                    i10 = i16;
                                }
                                j7 = j12 ^ j9;
                            }
                        }
                    }
                    this.f7614j = i10;
                    return j7;
                }
            }
            return O();
        }

        long O() throws C0630z {
            long j7 = 0;
            for (int i7 = 0; i7 < 64; i7 += 7) {
                byte bG = G();
                j7 |= ((long) (bG & 127)) << i7;
                if ((bG & 128) == 0) {
                    return j7;
                }
            }
            throw C0630z.e();
        }

        public void R() throws C0630z {
            int iB;
            do {
                iB = B();
                if (iB == 0) {
                    return;
                }
            } while (E(iB));
        }

        public void S(int i7) throws C0630z {
            int i8 = this.f7612h;
            int i9 = this.f7614j;
            if (i7 > i8 - i9 || i7 < 0) {
                T(i7);
            } else {
                this.f7614j = i9 + i7;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public void a(int i7) throws C0630z {
            if (this.f7615k != i7) {
                throw C0630z.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int d() {
            return this.f7616l + this.f7614j;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public boolean e() {
            return this.f7614j == this.f7612h && !X(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public void k(int i7) {
            this.f7617m = i7;
            P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int l(int i7) throws C0630z {
            if (i7 < 0) {
                throw C0630z.f();
            }
            int i8 = i7 + this.f7616l + this.f7614j;
            int i9 = this.f7617m;
            if (i8 > i9) {
                throw C0630z.k();
            }
            this.f7617m = i8;
            P();
            return i9;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public boolean m() {
            return N() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public AbstractC0612g n() {
            int iM = M();
            int i7 = this.f7612h;
            int i8 = this.f7614j;
            if (iM > i7 - i8 || iM <= 0) {
                return iM == 0 ? AbstractC0612g.f7582n : F(iM);
            }
            AbstractC0612g abstractC0612gM = AbstractC0612g.m(this.f7611g, i8, iM);
            this.f7614j += iM;
            return abstractC0612gM;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public double o() {
            return Double.longBitsToDouble(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int p() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int q() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public long r() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public float s() {
            return Float.intBitsToFloat(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int t() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public long u() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int v() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public long w() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public int x() {
            return AbstractC0613h.b(M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public long y() {
            return AbstractC0613h.c(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0613h
        public String z() throws C0630z {
            int iM = M();
            if (iM > 0) {
                int i7 = this.f7612h;
                int i8 = this.f7614j;
                if (iM <= i7 - i8) {
                    String str = new String(this.f7611g, i8, iM, AbstractC0629y.f7830a);
                    this.f7614j += iM;
                    return str;
                }
            }
            if (iM == 0) {
                return "";
            }
            if (iM > this.f7612h) {
                return new String(H(iM, false), AbstractC0629y.f7830a);
            }
            Q(iM);
            String str2 = new String(this.f7611g, this.f7614j, iM, AbstractC0629y.f7830a);
            this.f7614j += iM;
            return str2;
        }
    }

    private AbstractC0613h() {
        this.f7597b = 100;
        this.f7598c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f7600e = false;
    }

    public static int b(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long c(long j7) {
        return (-(j7 & 1)) ^ (j7 >>> 1);
    }

    public static AbstractC0613h f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static AbstractC0613h g(InputStream inputStream, int i7) {
        if (i7 > 0) {
            return inputStream == null ? h(AbstractC0629y.f7832c) : new c(inputStream, i7);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC0613h h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC0613h i(byte[] bArr, int i7, int i8) {
        return j(bArr, i7, i8, false);
    }

    static AbstractC0613h j(byte[] bArr, int i7, int i8, boolean z6) {
        b bVar = new b(bArr, i7, i8, z6);
        try {
            bVar.l(i8);
            return bVar;
        } catch (C0630z e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i7);

    public abstract void a(int i7);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i7);

    public abstract int l(int i7);

    public abstract boolean m();

    public abstract AbstractC0612g n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();
}
