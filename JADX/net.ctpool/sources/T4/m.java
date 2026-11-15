package T4;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    private static final class b extends Writer {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final Appendable f3275m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final a f3276n = new a();

        private static class a implements CharSequence {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private char[] f3277m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private String f3278n;

            private a() {
            }

            void a(char[] cArr) {
                this.f3277m = cArr;
                this.f3278n = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i7) {
                return this.f3277m[i7];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f3277m.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i7, int i8) {
                return new String(this.f3277m, i7, i8 - i7);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f3278n == null) {
                    this.f3278n = new String(this.f3277m);
                }
                return this.f3278n;
            }
        }

        b(Appendable appendable) {
            this.f3275m = appendable;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f3275m.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i7) throws IOException {
            this.f3275m.append((char) i7);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i7, int i8) throws IOException {
            this.f3275m.append(charSequence, i7, i8);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i7, int i8) throws IOException {
            Objects.requireNonNull(str);
            this.f3275m.append(str, i7, i8 + i7);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i7, int i8) throws IOException {
            this.f3276n.a(cArr);
            this.f3275m.append(this.f3276n, i7, i8 + i7);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    public static void a(R4.f fVar, Y4.c cVar) {
        U4.m.f3936V.d(cVar, fVar);
    }

    public static Writer b(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }
}
