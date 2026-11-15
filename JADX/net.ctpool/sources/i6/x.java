package i6;

import com.tenjin.android.utils.adnetwork.TradPlusHelper;
import j5.AbstractC1803h;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f20054h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f20055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x f20060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x f20061g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public x() {
        this.f20055a = new byte[8192];
        this.f20059e = true;
        this.f20058d = false;
    }

    public final void a() {
        x xVar = this.f20061g;
        int i7 = 0;
        if (!(xVar != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        w5.k.c(xVar);
        if (xVar.f20059e) {
            int i8 = this.f20057c - this.f20056b;
            x xVar2 = this.f20061g;
            w5.k.c(xVar2);
            int i9 = 8192 - xVar2.f20057c;
            x xVar3 = this.f20061g;
            w5.k.c(xVar3);
            if (!xVar3.f20058d) {
                x xVar4 = this.f20061g;
                w5.k.c(xVar4);
                i7 = xVar4.f20056b;
            }
            if (i8 > i9 + i7) {
                return;
            }
            x xVar5 = this.f20061g;
            w5.k.c(xVar5);
            g(xVar5, i8);
            b();
            y.b(this);
        }
    }

    public final x b() {
        x xVar = this.f20060f;
        if (xVar == this) {
            xVar = null;
        }
        x xVar2 = this.f20061g;
        w5.k.c(xVar2);
        xVar2.f20060f = this.f20060f;
        x xVar3 = this.f20060f;
        w5.k.c(xVar3);
        xVar3.f20061g = this.f20061g;
        this.f20060f = null;
        this.f20061g = null;
        return xVar;
    }

    public final x c(x xVar) {
        w5.k.f(xVar, TradPlusHelper.KEY_SEGMENT);
        xVar.f20061g = this;
        xVar.f20060f = this.f20060f;
        x xVar2 = this.f20060f;
        w5.k.c(xVar2);
        xVar2.f20061g = xVar;
        this.f20060f = xVar;
        return xVar;
    }

    public final x d() {
        this.f20058d = true;
        return new x(this.f20055a, this.f20056b, this.f20057c, true, false);
    }

    public final x e(int i7) {
        x xVarC;
        if (!(i7 > 0 && i7 <= this.f20057c - this.f20056b)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i7 >= 1024) {
            xVarC = d();
        } else {
            xVarC = y.c();
            byte[] bArr = this.f20055a;
            byte[] bArr2 = xVarC.f20055a;
            int i8 = this.f20056b;
            AbstractC1803h.f(bArr, bArr2, 0, i8, i8 + i7, 2, null);
        }
        xVarC.f20057c = xVarC.f20056b + i7;
        this.f20056b += i7;
        x xVar = this.f20061g;
        w5.k.c(xVar);
        xVar.c(xVarC);
        return xVarC;
    }

    public final x f() {
        byte[] bArr = this.f20055a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        w5.k.e(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return new x(bArrCopyOf, this.f20056b, this.f20057c, false, true);
    }

    public final void g(x xVar, int i7) {
        w5.k.f(xVar, "sink");
        if (!xVar.f20059e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i8 = xVar.f20057c;
        if (i8 + i7 > 8192) {
            if (xVar.f20058d) {
                throw new IllegalArgumentException();
            }
            int i9 = xVar.f20056b;
            if ((i8 + i7) - i9 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = xVar.f20055a;
            AbstractC1803h.f(bArr, bArr, 0, i9, i8, 2, null);
            xVar.f20057c -= xVar.f20056b;
            xVar.f20056b = 0;
        }
        byte[] bArr2 = this.f20055a;
        byte[] bArr3 = xVar.f20055a;
        int i10 = xVar.f20057c;
        int i11 = this.f20056b;
        AbstractC1803h.d(bArr2, bArr3, i10, i11, i11 + i7);
        xVar.f20057c += i7;
        this.f20056b += i7;
    }

    public x(byte[] bArr, int i7, int i8, boolean z6, boolean z7) {
        w5.k.f(bArr, "data");
        this.f20055a = bArr;
        this.f20056b = i7;
        this.f20057c = i8;
        this.f20058d = z6;
        this.f20059e = z7;
    }
}
