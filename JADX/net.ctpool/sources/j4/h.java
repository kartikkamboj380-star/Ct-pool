package j4;

import e4.C1629g;
import h4.AbstractC1721j;
import j4.g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class h implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f20380d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f20381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f20383c;

    class a implements g.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f20384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f20385b;

        a(byte[] bArr, int[] iArr) {
            this.f20384a = bArr;
            this.f20385b = iArr;
        }

        @Override // j4.g.d
        public void a(InputStream inputStream, int i7) throws IOException {
            try {
                inputStream.read(this.f20384a, this.f20385b[0], i7);
                int[] iArr = this.f20385b;
                iArr[0] = iArr[0] + i7;
            } finally {
                inputStream.close();
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f20387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20388b;

        b(byte[] bArr, int i7) {
            this.f20387a = bArr;
            this.f20388b = i7;
        }
    }

    h(File file, int i7) {
        this.f20381a = file;
        this.f20382b = i7;
    }

    private void f(long j7, String str) {
        if (this.f20383c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i7 = this.f20382b / 4;
            if (str.length() > i7) {
                str = "..." + str.substring(str.length() - i7);
            }
            this.f20383c.f(String.format(Locale.US, "%d %s%n", Long.valueOf(j7), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f20380d));
            while (!this.f20383c.w() && this.f20383c.D0() > this.f20382b) {
                this.f20383c.h0();
            }
        } catch (IOException e7) {
            C1629g.f().e("There was a problem writing to the Crashlytics log.", e7);
        }
    }

    private b g() {
        if (!this.f20381a.exists()) {
            return null;
        }
        h();
        g gVar = this.f20383c;
        if (gVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[gVar.D0()];
        try {
            this.f20383c.n(new a(bArr, iArr));
        } catch (IOException e7) {
            C1629g.f().e("A problem occurred while reading the Crashlytics log file.", e7);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f20383c == null) {
            try {
                this.f20383c = new g(this.f20381a);
            } catch (IOException e7) {
                C1629g.f().e("Could not open log file: " + this.f20381a, e7);
            }
        }
    }

    @Override // j4.c
    public void a() {
        AbstractC1721j.f(this.f20383c, "There was a problem closing the Crashlytics log file.");
        this.f20383c = null;
    }

    @Override // j4.c
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, f20380d);
        }
        return null;
    }

    @Override // j4.c
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i7 = bVarG.f20388b;
        byte[] bArr = new byte[i7];
        System.arraycopy(bVarG.f20387a, 0, bArr, 0, i7);
        return bArr;
    }

    @Override // j4.c
    public void d() {
        a();
        this.f20381a.delete();
    }

    @Override // j4.c
    public void e(long j7, String str) {
        h();
        f(j7, str);
    }
}
