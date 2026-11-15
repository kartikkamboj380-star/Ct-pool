package com.google.firebase.messaging;

import com.google.android.gms.common.api.Api;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: renamed from: com.google.firebase.messaging.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1537b {

    /* JADX INFO: renamed from: com.google.firebase.messaging.b$a */
    private static final class a extends FilterInputStream {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f17610m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f17611n;

        a(InputStream inputStream, long j7) {
            super(inputStream);
            this.f17611n = -1L;
            this.f17610m = j7;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f17610m);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i7) {
            ((FilterInputStream) this).in.mark(i7);
            this.f17611n = this.f17610m;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f17610m == 0) {
                return -1;
            }
            int i7 = ((FilterInputStream) this).in.read();
            if (i7 != -1) {
                this.f17610m--;
            }
            return i7;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f17611n == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f17610m = this.f17611n;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j7) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(Math.min(j7, this.f17610m));
            this.f17610m -= jSkip;
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i7, int i8) throws IOException {
            long j7 = this.f17610m;
            if (j7 == 0) {
                return -1;
            }
            int i9 = ((FilterInputStream) this).in.read(bArr, i7, (int) Math.min(i8, j7));
            if (i9 != -1) {
                this.f17610m -= (long) i9;
            }
            return i9;
        }
    }

    private static byte[] a(Queue queue, int i7) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i7) {
            return bArr;
        }
        int length = i7 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i7);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i7 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static InputStream b(InputStream inputStream, long j7) {
        return new a(inputStream, j7);
    }

    private static int c(long j7) {
        if (j7 > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j7 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j7;
    }

    public static byte[] d(InputStream inputStream) {
        return e(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] e(InputStream inputStream, Queue queue, int i7) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i7) * 2));
        while (i7 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i7);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i8 = 0;
            while (i8 < iMin2) {
                int i9 = inputStream.read(bArr, i8, iMin2 - i8);
                if (i9 == -1) {
                    return a(queue, i7);
                }
                i8 += i9;
                i7 += i9;
            }
            iMin = c(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
