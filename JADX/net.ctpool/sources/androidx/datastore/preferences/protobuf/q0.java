package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f7702a;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) throws C0630z {
            if (m(b8) || (((b7 << 28) + (b8 + 112)) >> 30) != 0 || m(b9) || m(b10)) {
                throw C0630z.c();
            }
            int iR = ((b7 & 7) << 18) | (r(b8) << 12) | (r(b9) << 6) | r(b10);
            cArr[i7] = l(iR);
            cArr[i7 + 1] = q(iR);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b7, char[] cArr, int i7) {
            cArr[i7] = (char) b7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b7, byte b8, byte b9, char[] cArr, int i7) throws C0630z {
            if (m(b8) || ((b7 == -32 && b8 < -96) || ((b7 == -19 && b8 >= -96) || m(b9)))) {
                throw C0630z.c();
            }
            cArr[i7] = (char) (((b7 & 15) << 12) | (r(b8) << 6) | r(b9));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b7, byte b8, char[] cArr, int i7) throws C0630z {
            if (b7 < -62 || m(b8)) {
                throw C0630z.c();
            }
            cArr[i7] = (char) (((b7 & 31) << 6) | r(b8));
        }

        private static char l(int i7) {
            return (char) ((i7 >>> 10) + 55232);
        }

        private static boolean m(byte b7) {
            return b7 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b7) {
            return b7 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b7) {
            return b7 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b7) {
            return b7 < -32;
        }

        private static char q(int i7) {
            return (char) ((i7 & 1023) + 56320);
        }

        private static int r(byte b7) {
            return b7 & 63;
        }
    }

    static abstract class b {
        b() {
        }

        abstract String a(byte[] bArr, int i7, int i8);

        abstract int b(CharSequence charSequence, byte[] bArr, int i7, int i8);

        final boolean c(byte[] bArr, int i7, int i8) {
            return d(0, bArr, i7, i8) == 0;
        }

        abstract int d(int i7, byte[] bArr, int i8, int i9);
    }

    static final class c extends b {
        c() {
        }

        private static int e(byte[] bArr, int i7, int i8) {
            while (i7 < i8 && bArr[i7] >= 0) {
                i7++;
            }
            if (i7 >= i8) {
                return 0;
            }
            return f(bArr, i7, i8);
        }

        private static int f(byte[] bArr, int i7, int i8) {
            while (i7 < i8) {
                int i9 = i7 + 1;
                byte b7 = bArr[i7];
                if (b7 < 0) {
                    if (b7 < -32) {
                        if (i9 >= i8) {
                            return b7;
                        }
                        if (b7 >= -62) {
                            i7 += 2;
                            if (bArr[i9] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b7 >= -16) {
                        if (i9 >= i8 - 2) {
                            return q0.l(bArr, i9, i8);
                        }
                        int i10 = i7 + 2;
                        byte b8 = bArr[i9];
                        if (b8 <= -65 && (((b7 << 28) + (b8 + 112)) >> 30) == 0) {
                            int i11 = i7 + 3;
                            if (bArr[i10] <= -65) {
                                i7 += 4;
                                if (bArr[i11] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i9 >= i8 - 1) {
                        return q0.l(bArr, i9, i8);
                    }
                    int i12 = i7 + 2;
                    byte b9 = bArr[i9];
                    if (b9 <= -65 && ((b7 != -32 || b9 >= -96) && (b7 != -19 || b9 < -96))) {
                        i7 += 3;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                }
                i7 = i9;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        String a(byte[] bArr, int i7, int i8) throws C0630z {
            if ((i7 | i8 | ((bArr.length - i7) - i8)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            int i9 = i7 + i8;
            char[] cArr = new char[i8];
            int i10 = 0;
            while (i7 < i9) {
                byte b7 = bArr[i7];
                if (!a.n(b7)) {
                    break;
                }
                i7++;
                a.i(b7, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i7 < i9) {
                int i12 = i7 + 1;
                byte b8 = bArr[i7];
                if (a.n(b8)) {
                    int i13 = i11 + 1;
                    a.i(b8, cArr, i11);
                    while (i12 < i9) {
                        byte b9 = bArr[i12];
                        if (!a.n(b9)) {
                            break;
                        }
                        i12++;
                        a.i(b9, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i7 = i12;
                } else if (a.p(b8)) {
                    if (i12 >= i9) {
                        throw C0630z.c();
                    }
                    i7 += 2;
                    a.k(b8, bArr[i12], cArr, i11);
                    i11++;
                } else if (a.o(b8)) {
                    if (i12 >= i9 - 1) {
                        throw C0630z.c();
                    }
                    int i14 = i7 + 2;
                    i7 += 3;
                    a.j(b8, bArr[i12], bArr[i14], cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i9 - 2) {
                        throw C0630z.c();
                    }
                    byte b10 = bArr[i12];
                    int i15 = i7 + 3;
                    byte b11 = bArr[i7 + 2];
                    i7 += 4;
                    a.h(b8, b10, b11, bArr[i15], cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        int b(CharSequence charSequence, byte[] bArr, int i7, int i8) {
            int i9;
            int i10;
            char cCharAt;
            int length = charSequence.length();
            int i11 = i8 + i7;
            int i12 = 0;
            while (i12 < length && (i10 = i12 + i7) < i11 && (cCharAt = charSequence.charAt(i12)) < 128) {
                bArr[i10] = (byte) cCharAt;
                i12++;
            }
            if (i12 == length) {
                return i7 + length;
            }
            int i13 = i7 + i12;
            while (i12 < length) {
                char cCharAt2 = charSequence.charAt(i12);
                if (cCharAt2 < 128 && i13 < i11) {
                    bArr[i13] = (byte) cCharAt2;
                    i13++;
                } else if (cCharAt2 < 2048 && i13 <= i11 - 2) {
                    int i14 = i13 + 1;
                    bArr[i13] = (byte) ((cCharAt2 >>> 6) | 960);
                    i13 += 2;
                    bArr[i14] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i13 > i11 - 3) {
                        if (i13 > i11 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i9 = i12 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i9)))) {
                                throw new d(i12, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i13);
                        }
                        int i15 = i12 + 1;
                        if (i15 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i15);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i13] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i16 = i13 + 3;
                                bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i13 += 4;
                                bArr[i16] = (byte) ((codePoint & 63) | 128);
                                i12 = i15;
                            } else {
                                i12 = i15;
                            }
                        }
                        throw new d(i12 - 1, length);
                    }
                    bArr[i13] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i17 = i13 + 2;
                    bArr[i13 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i13 += 3;
                    bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
                }
                i12++;
            }
            return i13;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // androidx.datastore.preferences.protobuf.q0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int d(int i7, byte[] bArr, int i8, int i9) {
            byte b7;
            int i10;
            int i11;
            if (i7 != 0) {
                if (i8 >= i9) {
                    return i7;
                }
                byte b8 = (byte) i7;
                if (b8 < -32) {
                    if (b8 >= -62) {
                        i11 = i8 + 1;
                    }
                    return -1;
                }
                if (b8 < -16) {
                    byte b9 = (byte) (~(i7 >> 8));
                    if (b9 == 0) {
                        int i12 = i8 + 1;
                        byte b10 = bArr[i8];
                        if (i12 >= i9) {
                            return q0.j(b8, b10);
                        }
                        i8 = i12;
                        b9 = b10;
                    }
                    if (b9 <= -65 && ((b8 != -32 || b9 >= -96) && (b8 != -19 || b9 < -96))) {
                        i11 = i8 + 1;
                    }
                    return -1;
                }
                byte b11 = (byte) (~(i7 >> 8));
                if (b11 == 0) {
                    i10 = i8 + 1;
                    b11 = bArr[i8];
                    if (i10 >= i9) {
                        return q0.j(b8, b11);
                    }
                    b7 = 0;
                } else {
                    b7 = (byte) (i7 >> 16);
                    i10 = i8;
                }
                if (b7 == 0) {
                    int i13 = i10 + 1;
                    byte b12 = bArr[i10];
                    if (i13 >= i9) {
                        return q0.k(b8, b11, b12);
                    }
                    b7 = b12;
                    i10 = i13;
                }
                if (b11 <= -65 && (((b8 << 28) + (b11 + 112)) >> 30) == 0 && b7 <= -65) {
                    i8 = i10 + 1;
                }
                return -1;
                i8 = i11;
            }
            return e(bArr, i8, i9);
        }
    }

    static class d extends IllegalArgumentException {
        d(int i7, int i8) {
            super("Unpaired surrogate at index " + i7 + " of " + i8);
        }
    }

    static final class e extends b {
        e() {
        }

        static boolean e() {
            return p0.C() && p0.D();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static int f(byte[] bArr, long j7, int i7) {
            int iG = g(bArr, j7, i7);
            int i8 = i7 - iG;
            long j8 = j7 + ((long) iG);
            while (true) {
                byte bS = 0;
                while (true) {
                    if (i8 <= 0) {
                        break;
                    }
                    long j9 = j8 + 1;
                    bS = p0.s(bArr, j8);
                    if (bS < 0) {
                        j8 = j9;
                        break;
                    }
                    i8--;
                    j8 = j9;
                }
                if (i8 != 0) {
                    int i9 = i8 - 1;
                    if (bS >= -32) {
                        if (bS >= -16) {
                            if (i9 >= 3) {
                                i8 -= 4;
                                long j10 = 1 + j8;
                                byte bS2 = p0.s(bArr, j8);
                                if (bS2 <= -65 && (((bS << 28) + (bS2 + 112)) >> 30) == 0) {
                                    long j11 = 2 + j8;
                                    if (p0.s(bArr, j10) > -65) {
                                        break;
                                    }
                                    j8 += 3;
                                    if (p0.s(bArr, j11) > -65) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                return h(bArr, bS, j8, i9);
                            }
                        } else {
                            if (i9 < 2) {
                                return h(bArr, bS, j8, i9);
                            }
                            i8 -= 3;
                            long j12 = 1 + j8;
                            byte bS3 = p0.s(bArr, j8);
                            if (bS3 > -65 || ((bS == -32 && bS3 < -96) || (bS == -19 && bS3 >= -96))) {
                                break;
                            }
                            j8 += 2;
                            if (p0.s(bArr, j12) > -65) {
                                break;
                            }
                        }
                    } else if (i9 != 0) {
                        i8 -= 2;
                        if (bS < -62) {
                            break;
                        }
                        long j13 = 1 + j8;
                        if (p0.s(bArr, j8) > -65) {
                            break;
                        }
                        j8 = j13;
                    } else {
                        return bS;
                    }
                } else {
                    return 0;
                }
            }
            return -1;
        }

        private static int g(byte[] bArr, long j7, int i7) {
            int i8 = 0;
            if (i7 < 16) {
                return 0;
            }
            while (i8 < i7) {
                long j8 = 1 + j7;
                if (p0.s(bArr, j7) < 0) {
                    return i8;
                }
                i8++;
                j7 = j8;
            }
            return i7;
        }

        private static int h(byte[] bArr, int i7, long j7, int i8) {
            if (i8 == 0) {
                return q0.i(i7);
            }
            if (i8 == 1) {
                return q0.j(i7, p0.s(bArr, j7));
            }
            if (i8 == 2) {
                return q0.k(i7, p0.s(bArr, j7), p0.s(bArr, j7 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        String a(byte[] bArr, int i7, int i8) throws C0630z {
            if ((i7 | i8 | ((bArr.length - i7) - i8)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
            }
            int i9 = i7 + i8;
            char[] cArr = new char[i8];
            int i10 = 0;
            while (i7 < i9) {
                byte bS = p0.s(bArr, i7);
                if (!a.n(bS)) {
                    break;
                }
                i7++;
                a.i(bS, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i7 < i9) {
                int i12 = i7 + 1;
                byte bS2 = p0.s(bArr, i7);
                if (a.n(bS2)) {
                    int i13 = i11 + 1;
                    a.i(bS2, cArr, i11);
                    while (i12 < i9) {
                        byte bS3 = p0.s(bArr, i12);
                        if (!a.n(bS3)) {
                            break;
                        }
                        i12++;
                        a.i(bS3, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i7 = i12;
                } else if (a.p(bS2)) {
                    if (i12 >= i9) {
                        throw C0630z.c();
                    }
                    i7 += 2;
                    a.k(bS2, p0.s(bArr, i12), cArr, i11);
                    i11++;
                } else if (a.o(bS2)) {
                    if (i12 >= i9 - 1) {
                        throw C0630z.c();
                    }
                    int i14 = i7 + 2;
                    i7 += 3;
                    a.j(bS2, p0.s(bArr, i12), p0.s(bArr, i14), cArr, i11);
                    i11++;
                } else {
                    if (i12 >= i9 - 2) {
                        throw C0630z.c();
                    }
                    byte bS4 = p0.s(bArr, i12);
                    int i15 = i7 + 3;
                    byte bS5 = p0.s(bArr, i7 + 2);
                    i7 += 4;
                    a.h(bS2, bS4, bS5, p0.s(bArr, i15), cArr, i11);
                    i11 += 2;
                }
            }
            return new String(cArr, 0, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        int b(CharSequence charSequence, byte[] bArr, int i7, int i8) {
            long j7;
            String str;
            String str2;
            int i9;
            long j8;
            long j9;
            char cCharAt;
            long j10 = i7;
            long j11 = ((long) i8) + j10;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i8 || bArr.length - i8 < i7) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i7 + i8));
            }
            int i10 = 0;
            while (true) {
                j7 = 1;
                if (i10 >= length || (cCharAt = charSequence.charAt(i10)) >= 128) {
                    break;
                }
                p0.H(bArr, j10, (byte) cCharAt);
                i10++;
                j10 = 1 + j10;
            }
            if (i10 == length) {
                return (int) j10;
            }
            while (i10 < length) {
                char cCharAt2 = charSequence.charAt(i10);
                if (cCharAt2 >= 128 || j10 >= j11) {
                    if (cCharAt2 >= 2048 || j10 > j11 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j10 > j11 - 3) {
                            if (j10 > j11 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i9 = i10 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i9)))) {
                                    throw new d(i10, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + cCharAt2 + str + j10);
                            }
                            int i11 = i10 + 1;
                            if (i11 != length) {
                                char cCharAt3 = charSequence.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j8 = 1;
                                    p0.H(bArr, j10, (byte) ((codePoint >>> 18) | 240));
                                    j9 = j11;
                                    p0.H(bArr, j10 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j12 = j10 + 3;
                                    p0.H(bArr, j10 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j10 += 4;
                                    p0.H(bArr, j12, (byte) ((codePoint & 63) | 128));
                                    i10 = i11;
                                } else {
                                    i10 = i11;
                                }
                            }
                            throw new d(i10 - 1, length);
                        }
                        p0.H(bArr, j10, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j13 = j10 + 2;
                        p0.H(bArr, j10 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        j10 += 3;
                        p0.H(bArr, j13, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j14 = j10 + j7;
                        p0.H(bArr, j10, (byte) ((cCharAt2 >>> 6) | 960));
                        j10 += 2;
                        p0.H(bArr, j14, (byte) ((cCharAt2 & '?') | 128));
                    }
                    j9 = j11;
                    j8 = 1;
                } else {
                    p0.H(bArr, j10, (byte) cCharAt2);
                    j9 = j11;
                    str2 = str4;
                    j8 = j7;
                    j10 += j7;
                    str = str3;
                }
                i10++;
                str3 = str;
                str4 = str2;
                j7 = j8;
                j11 = j9;
            }
            return (int) j10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (androidx.datastore.preferences.protobuf.p0.s(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (androidx.datastore.preferences.protobuf.p0.s(r12, r0) > (-65)) goto L59;
         */
        @Override // androidx.datastore.preferences.protobuf.q0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int d(int i7, byte[] bArr, int i8, int i9) {
            byte bS;
            long j7;
            if ((i8 | i9 | (bArr.length - i9)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
            }
            long j8 = i8;
            long j9 = i9;
            if (i7 != 0) {
                if (j8 >= j9) {
                    return i7;
                }
                byte b7 = (byte) i7;
                if (b7 < -32) {
                    if (b7 >= -62) {
                        long j10 = 1 + j8;
                        if (p0.s(bArr, j8) <= -65) {
                            j8 = j10;
                        }
                    }
                    return -1;
                }
                if (b7 < -16) {
                    byte bS2 = (byte) (~(i7 >> 8));
                    if (bS2 == 0) {
                        long j11 = j8 + 1;
                        bS2 = p0.s(bArr, j8);
                        if (j11 >= j9) {
                            return q0.j(b7, bS2);
                        }
                        j8 = j11;
                    }
                    if (bS2 <= -65 && ((b7 != -32 || bS2 >= -96) && (b7 != -19 || bS2 < -96))) {
                        j7 = j8 + 1;
                    }
                    return -1;
                }
                byte bS3 = (byte) (~(i7 >> 8));
                if (bS3 == 0) {
                    long j12 = j8 + 1;
                    bS3 = p0.s(bArr, j8);
                    if (j12 >= j9) {
                        return q0.j(b7, bS3);
                    }
                    bS = 0;
                    j8 = j12;
                } else {
                    bS = (byte) (i7 >> 16);
                }
                if (bS == 0) {
                    long j13 = j8 + 1;
                    bS = p0.s(bArr, j8);
                    if (j13 >= j9) {
                        return q0.k(b7, bS3, bS);
                    }
                    j8 = j13;
                }
                if (bS3 <= -65 && (((b7 << 28) + (bS3 + 112)) >> 30) == 0 && bS <= -65) {
                    j7 = j8 + 1;
                }
                return -1;
                j8 = j7;
            }
            return f(bArr, j8, (int) (j9 - j8));
        }
    }

    static {
        f7702a = (!e.e() || AbstractC0609d.c()) ? new c() : new e();
    }

    static String e(byte[] bArr, int i7, int i8) {
        return f7702a.a(bArr, i7, i8);
    }

    static int f(CharSequence charSequence, byte[] bArr, int i7, int i8) {
        return f7702a.b(charSequence, bArr, i7, i8);
    }

    static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        while (i7 < length && charSequence.charAt(i7) < 128) {
            i7++;
        }
        int iH = length;
        while (true) {
            if (i7 < length) {
                char cCharAt = charSequence.charAt(i7);
                if (cCharAt >= 2048) {
                    iH += h(charSequence, i7);
                    break;
                }
                iH += (127 - cCharAt) >>> 31;
                i7++;
            } else {
                break;
            }
        }
        if (iH >= length) {
            return iH;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iH) + 4294967296L));
    }

    private static int h(CharSequence charSequence, int i7) {
        int length = charSequence.length();
        int i8 = 0;
        while (i7 < length) {
            char cCharAt = charSequence.charAt(i7);
            if (cCharAt < 2048) {
                i8 += (127 - cCharAt) >>> 31;
            } else {
                i8 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i7) < 65536) {
                        throw new d(i7, length);
                    }
                    i7++;
                }
            }
            i7++;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i7) {
        if (i7 > -12) {
            return -1;
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i7, int i8) {
        if (i7 > -12 || i8 > -65) {
            return -1;
        }
        return i7 ^ (i8 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i7, int i8, int i9) {
        if (i7 > -12 || i8 > -65 || i9 > -65) {
            return -1;
        }
        return (i7 ^ (i8 << 8)) ^ (i9 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(byte[] bArr, int i7, int i8) {
        byte b7 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 == 0) {
            return i(b7);
        }
        if (i9 == 1) {
            return j(b7, bArr[i7]);
        }
        if (i9 == 2) {
            return k(b7, bArr[i7], bArr[i7 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean m(byte[] bArr) {
        return f7702a.c(bArr, 0, bArr.length);
    }

    public static boolean n(byte[] bArr, int i7, int i8) {
        return f7702a.c(bArr, i7, i8);
    }
}
