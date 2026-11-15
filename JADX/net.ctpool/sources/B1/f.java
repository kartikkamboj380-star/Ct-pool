package B1;

import O0.l;
import O0.q;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final R0.a f680h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f675c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f674b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f676d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f678f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f677e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f673a = 0;

    public f(R0.a aVar) {
        this.f680h = (R0.a) l.g(aVar);
    }

    private boolean a(InputStream inputStream) throws Throwable {
        int i7;
        int i8 = this.f677e;
        while (this.f673a != 6 && (i7 = inputStream.read()) != -1) {
            try {
                int i9 = this.f675c;
                this.f675c = i9 + 1;
                if (this.f679g) {
                    this.f673a = 6;
                    this.f679g = false;
                    return false;
                }
                int i10 = this.f673a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        if (i7 == 216) {
                        }
                        this.f673a = 6;
                    } else if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                this.f673a = 5;
                            } else if (i10 != 5) {
                                l.i(false);
                            } else {
                                int i11 = ((this.f674b << 8) + i7) - 2;
                                W0.d.a(inputStream, i11);
                                this.f675c += i11;
                            }
                        } else if (i7 == 255) {
                            this.f673a = 3;
                        } else if (i7 != 0) {
                            if (i7 == 217) {
                                this.f679g = true;
                                f(i9 - 1);
                            } else {
                                if (i7 == 218) {
                                    f(i9 - 1);
                                }
                                if (b(i7)) {
                                    this.f673a = 4;
                                }
                            }
                        }
                    } else if (i7 == 255) {
                        this.f673a = 3;
                    }
                    this.f673a = 2;
                } else if (i7 == 255) {
                    this.f673a = 1;
                } else {
                    this.f673a = 6;
                }
                this.f674b = i7;
            } catch (IOException e7) {
                q.a(e7);
            }
            return (this.f673a == 6 || this.f677e == i8) ? false : true;
        }
        if (this.f673a == 6) {
            return false;
        }
    }

    private static boolean b(int i7) {
        if (i7 == 1) {
            return false;
        }
        return ((i7 >= 208 && i7 <= 215) || i7 == 217 || i7 == 216) ? false : true;
    }

    private void f(int i7) {
        int i8 = this.f676d;
        if (i8 > 0) {
            this.f678f = i7;
        }
        this.f676d = i8 + 1;
        this.f677e = i8;
    }

    public int c() {
        return this.f678f;
    }

    public int d() {
        return this.f677e;
    }

    public boolean e() {
        return this.f679g;
    }

    public boolean g(D1.g gVar) {
        if (this.f673a == 6 || gVar.B() <= this.f675c) {
            return false;
        }
        R0.g gVar2 = new R0.g(gVar.w(), (byte[]) this.f680h.get(16384), this.f680h);
        try {
            W0.d.a(gVar2, this.f675c);
            return a(gVar2);
        } catch (IOException e7) {
            q.a(e7);
            return false;
        } finally {
            O0.b.b(gVar2);
        }
    }
}
