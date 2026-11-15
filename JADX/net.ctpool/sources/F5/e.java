package F5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import x5.InterfaceC2227a;

/* JADX INFO: loaded from: classes2.dex */
final class e implements E5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f1112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v5.p f1115d;

    public static final class a implements Iterator, InterfaceC2227a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f1116m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f1117n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f1118o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private C5.c f1119p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f1120q;

        a() {
            int iH = C5.g.h(e.this.f1113b, 0, e.this.f1112a.length());
            this.f1117n = iH;
            this.f1118o = iH;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void d() {
            i5.l lVar;
            C5.c cVar;
            if (this.f1118o < 0) {
                this.f1116m = 0;
                this.f1119p = null;
                return;
            }
            int i7 = -1;
            if (e.this.f1114c > 0) {
                int i8 = this.f1120q + 1;
                this.f1120q = i8;
                if (i8 >= e.this.f1114c) {
                    cVar = new C5.c(this.f1117n, q.L(e.this.f1112a));
                    this.f1119p = cVar;
                } else if (this.f1118o <= e.this.f1112a.length() && (lVar = (i5.l) e.this.f1115d.m(e.this.f1112a, Integer.valueOf(this.f1118o))) != null) {
                    int iIntValue = ((Number) lVar.a()).intValue();
                    int iIntValue2 = ((Number) lVar.b()).intValue();
                    this.f1119p = C5.g.l(this.f1117n, iIntValue);
                    int i9 = iIntValue + iIntValue2;
                    this.f1117n = i9;
                    i7 = i9 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    cVar = new C5.c(this.f1117n, q.L(e.this.f1112a));
                    this.f1119p = cVar;
                }
            }
            this.f1118o = i7;
            this.f1116m = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C5.c next() {
            if (this.f1116m == -1) {
                d();
            }
            if (this.f1116m == 0) {
                throw new NoSuchElementException();
            }
            C5.c cVar = this.f1119p;
            w5.k.d(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f1119p = null;
            this.f1116m = -1;
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1116m == -1) {
                d();
            }
            return this.f1116m == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(CharSequence charSequence, int i7, int i8, v5.p pVar) {
        w5.k.f(charSequence, "input");
        w5.k.f(pVar, "getNextMatch");
        this.f1112a = charSequence;
        this.f1113b = i7;
        this.f1114c = i8;
        this.f1115d = pVar;
    }

    @Override // E5.d
    public Iterator iterator() {
        return new a();
    }
}
