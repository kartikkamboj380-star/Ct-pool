package U4;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Y4.c {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final Writer f3867B = new a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final R4.k f3868C = new R4.k("closed");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private R4.f f3869A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f3870y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f3871z;

    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i7, int i8) {
            throw new AssertionError();
        }
    }

    public f() {
        super(f3867B);
        this.f3870y = new ArrayList();
        this.f3869A = R4.h.f2886m;
    }

    private R4.f k1() {
        return (R4.f) this.f3870y.get(r0.size() - 1);
    }

    private void l1(R4.f fVar) {
        if (this.f3871z != null) {
            if (!fVar.k() || l()) {
                ((R4.i) k1()).o(this.f3871z, fVar);
            }
            this.f3871z = null;
            return;
        }
        if (this.f3870y.isEmpty()) {
            this.f3869A = fVar;
            return;
        }
        R4.f fVarK1 = k1();
        if (!(fVarK1 instanceof R4.e)) {
            throw new IllegalStateException();
        }
        ((R4.e) fVarK1).o(fVar);
    }

    @Override // Y4.c
    public Y4.c J() {
        l1(R4.h.f2886m);
        return this;
    }

    @Override // Y4.c
    public Y4.c M0(double d7) {
        if (o() || !(Double.isNaN(d7) || Double.isInfinite(d7))) {
            l1(new R4.k(Double.valueOf(d7)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d7);
    }

    @Override // Y4.c
    public Y4.c R0(long j7) {
        l1(new R4.k(Long.valueOf(j7)));
        return this;
    }

    @Override // Y4.c
    public Y4.c S0(Boolean bool) {
        if (bool == null) {
            return J();
        }
        l1(new R4.k(bool));
        return this;
    }

    @Override // Y4.c
    public Y4.c b1(Number number) {
        if (number == null) {
            return J();
        }
        if (!o()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        l1(new R4.k(number));
        return this;
    }

    @Override // Y4.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f3870y.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f3870y.add(f3868C);
    }

    @Override // Y4.c
    public Y4.c d() {
        R4.e eVar = new R4.e();
        l1(eVar);
        this.f3870y.add(eVar);
        return this;
    }

    @Override // Y4.c
    public Y4.c e() {
        R4.i iVar = new R4.i();
        l1(iVar);
        this.f3870y.add(iVar);
        return this;
    }

    @Override // Y4.c
    public Y4.c f1(String str) {
        if (str == null) {
            return J();
        }
        l1(new R4.k(str));
        return this;
    }

    @Override // Y4.c
    public Y4.c g() {
        if (this.f3870y.isEmpty() || this.f3871z != null) {
            throw new IllegalStateException();
        }
        if (!(k1() instanceof R4.e)) {
            throw new IllegalStateException();
        }
        this.f3870y.remove(r0.size() - 1);
        return this;
    }

    @Override // Y4.c
    public Y4.c h1(boolean z6) {
        l1(new R4.k(Boolean.valueOf(z6)));
        return this;
    }

    @Override // Y4.c
    public Y4.c j() {
        if (this.f3870y.isEmpty() || this.f3871z != null) {
            throw new IllegalStateException();
        }
        if (!(k1() instanceof R4.i)) {
            throw new IllegalStateException();
        }
        this.f3870y.remove(r0.size() - 1);
        return this;
    }

    public R4.f j1() {
        if (this.f3870y.isEmpty()) {
            return this.f3869A;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f3870y);
    }

    @Override // Y4.c
    public Y4.c z(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f3870y.isEmpty() || this.f3871z != null) {
            throw new IllegalStateException();
        }
        if (!(k1() instanceof R4.i)) {
            throw new IllegalStateException();
        }
        this.f3871z = str;
        return this;
    }

    @Override // Y4.c, java.io.Flushable
    public void flush() {
    }
}
