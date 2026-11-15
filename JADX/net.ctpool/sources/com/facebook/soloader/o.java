package com.facebook.soloader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    protected static class a extends UnsatisfiedLinkError {
        a(String str) {
            super(str);
        }
    }

    public static String[] a(g gVar) {
        return gVar instanceof h ? c((h) gVar) : b(gVar);
    }

    private static String[] b(g gVar) {
        long jG;
        long jG2;
        String str;
        long j7;
        long j8;
        long jG3;
        String str2;
        long j9;
        long jD;
        long jD2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jG4 = g(gVar, byteBufferAllocate, 0L);
        if (jG4 != 1179403647) {
            throw new a("file is not ELF: magic is 0x" + Long.toHexString(jG4) + ", it should be " + Long.toHexString(1179403647L));
        }
        boolean z6 = h(gVar, byteBufferAllocate, 4L) == 1;
        if (h(gVar, byteBufferAllocate, 5L) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        long jG5 = z6 ? g(gVar, byteBufferAllocate, 28L) : d(gVar, byteBufferAllocate, 32L);
        long jF = z6 ? f(gVar, byteBufferAllocate, 44L) : f(gVar, byteBufferAllocate, 56L);
        int iF = f(gVar, byteBufferAllocate, z6 ? 42L : 54L);
        if (jF == 65535) {
            long jG6 = z6 ? g(gVar, byteBufferAllocate, 32L) : d(gVar, byteBufferAllocate, 40L);
            jF = g(gVar, byteBufferAllocate, z6 ? jG6 + 28 : jG6 + 44);
        }
        long j10 = jG5;
        long j11 = 0;
        while (true) {
            if (j11 >= jF) {
                jG = 0;
                break;
            }
            if (g(gVar, byteBufferAllocate, j10) == 2) {
                jG = z6 ? g(gVar, byteBufferAllocate, j10 + 4) : d(gVar, byteBufferAllocate, j10 + 8);
            } else {
                j10 += (long) iF;
                j11++;
            }
        }
        if (jG == 0) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        long j12 = jG;
        int i7 = 0;
        long jG7 = 0;
        do {
            jG2 = z6 ? g(gVar, byteBufferAllocate, j12) : d(gVar, byteBufferAllocate, j12);
            if (jG2 == 1) {
                if (i7 == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                }
                i7++;
                str = "malformed DT_NEEDED section";
            } else if (jG2 == 5) {
                str = "malformed DT_NEEDED section";
                jG7 = z6 ? g(gVar, byteBufferAllocate, j12 + 4) : d(gVar, byteBufferAllocate, j12 + 8);
            } else {
                str = "malformed DT_NEEDED section";
            }
            j12 += z6 ? 8L : 16L;
        } while (jG2 != 0);
        if (jG7 == 0) {
            throw new a("Dynamic section string-table not found");
        }
        long j13 = jG5;
        int i8 = 0;
        while (true) {
            if (i8 >= jF) {
                j7 = jG;
                j8 = 0;
                jG3 = 0;
                break;
            }
            if (g(gVar, byteBufferAllocate, j13) == 1) {
                if (z6) {
                    j9 = jF;
                    jD = g(gVar, byteBufferAllocate, j13 + 8);
                } else {
                    j9 = jF;
                    jD = d(gVar, byteBufferAllocate, j13 + 16);
                }
                if (z6) {
                    j7 = jG;
                    jD2 = g(gVar, byteBufferAllocate, j13 + 20);
                } else {
                    j7 = jG;
                    jD2 = d(gVar, byteBufferAllocate, j13 + 40);
                }
                if (jD <= jG7 && jG7 < jD2 + jD) {
                    jG3 = (z6 ? g(gVar, byteBufferAllocate, j13 + 4) : d(gVar, byteBufferAllocate, j13 + 8)) + (jG7 - jD);
                    j8 = 0;
                }
            } else {
                j9 = jF;
                j7 = jG;
            }
            j13 += (long) iF;
            i8++;
            jF = j9;
            jG = j7;
        }
        if (jG3 == j8) {
            throw new a("did not find file offset of DT_STRTAB table");
        }
        String[] strArr = new String[i7];
        long j14 = j7;
        int i9 = 0;
        while (true) {
            long jG8 = z6 ? g(gVar, byteBufferAllocate, j14) : d(gVar, byteBufferAllocate, j14);
            if (jG8 == 1) {
                strArr[i9] = e(gVar, byteBufferAllocate, (z6 ? g(gVar, byteBufferAllocate, j14 + 4) : d(gVar, byteBufferAllocate, j14 + 8)) + jG3);
                if (i9 == Integer.MAX_VALUE) {
                    throw new a(str);
                }
                i9++;
                str2 = str;
            } else {
                str2 = str;
            }
            j14 += z6 ? 8L : 16L;
            if (jG8 == 0) {
                if (i9 == i7) {
                    return strArr;
                }
                throw new a(str2);
            }
            str = str2;
        }
    }

    private static String[] c(h hVar) throws ClosedByInterruptException {
        int i7 = 0;
        while (true) {
            try {
                return b(hVar);
            } catch (ClosedByInterruptException e7) {
                i7++;
                if (i7 > 4) {
                    throw e7;
                }
                Thread.interrupted();
                m.c("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e7);
                hVar.a();
            }
        }
    }

    private static long d(g gVar, ByteBuffer byteBuffer, long j7) {
        i(gVar, byteBuffer, 8, j7);
        return byteBuffer.getLong();
    }

    private static String e(g gVar, ByteBuffer byteBuffer, long j7) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j8 = 1 + j7;
            short sH = h(gVar, byteBuffer, j7);
            if (sH == 0) {
                return sb.toString();
            }
            sb.append((char) sH);
            j7 = j8;
        }
    }

    private static int f(g gVar, ByteBuffer byteBuffer, long j7) {
        i(gVar, byteBuffer, 2, j7);
        return byteBuffer.getShort() & 65535;
    }

    private static long g(g gVar, ByteBuffer byteBuffer, long j7) {
        i(gVar, byteBuffer, 4, j7);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    private static short h(g gVar, ByteBuffer byteBuffer, long j7) {
        i(gVar, byteBuffer, 1, j7);
        return (short) (byteBuffer.get() & 255);
    }

    private static void i(g gVar, ByteBuffer byteBuffer, int i7, long j7) {
        int iC0;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        while (byteBuffer.remaining() > 0 && (iC0 = gVar.c0(byteBuffer, j7)) != -1) {
            j7 += (long) iC0;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
