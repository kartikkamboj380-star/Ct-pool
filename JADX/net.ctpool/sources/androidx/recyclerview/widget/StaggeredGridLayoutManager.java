package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.C;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private BitSet f8669B;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f8674G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f8675H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private e f8676I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f8677J;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int[] f8682O;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    f[] f8685t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    i f8686u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    i f8687v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f8688w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f8689x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final androidx.recyclerview.widget.f f8690y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f8684s = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f8691z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f8668A = false;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f8670C = -1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f8671D = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    d f8672E = new d();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f8673F = 2;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Rect f8678K = new Rect();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final b f8679L = new b();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f8680M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f8681N = true;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final Runnable f8683P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.S1();
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f8695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f8696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f8697e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int[] f8698f;

        b() {
            c();
        }

        void a() {
            this.f8694b = this.f8695c ? StaggeredGridLayoutManager.this.f8686u.i() : StaggeredGridLayoutManager.this.f8686u.m();
        }

        void b(int i7) {
            this.f8694b = this.f8695c ? StaggeredGridLayoutManager.this.f8686u.i() - i7 : StaggeredGridLayoutManager.this.f8686u.m() + i7;
        }

        void c() {
            this.f8693a = -1;
            this.f8694b = Integer.MIN_VALUE;
            this.f8695c = false;
            this.f8696d = false;
            this.f8697e = false;
            int[] iArr = this.f8698f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f8698f;
            if (iArr == null || iArr.length < length) {
                this.f8698f = new int[StaggeredGridLayoutManager.this.f8685t.length];
            }
            for (int i7 = 0; i7 < length; i7++) {
                this.f8698f[i7] = fVarArr[i7].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        f f8700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f8701f;

        public c(int i7, int i8) {
            super(i7, i8);
        }

        public final int e() {
            f fVar = this.f8700e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f8722e;
        }

        public boolean f() {
            return this.f8701f;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f8702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        List f8703b;

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0165a();

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f8704m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f8705n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            int[] f8706o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            boolean f8707p;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            static class C0165a implements Parcelable.Creator {
                C0165a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i7) {
                    return new a[i7];
                }
            }

            a() {
            }

            int a(int i7) {
                int[] iArr = this.f8706o;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i7];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f8704m + ", mGapDir=" + this.f8705n + ", mHasUnwantedGapAfter=" + this.f8707p + ", mGapPerSpan=" + Arrays.toString(this.f8706o) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i7) {
                parcel.writeInt(this.f8704m);
                parcel.writeInt(this.f8705n);
                parcel.writeInt(this.f8707p ? 1 : 0);
                int[] iArr = this.f8706o;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f8706o);
                }
            }

            a(Parcel parcel) {
                this.f8704m = parcel.readInt();
                this.f8705n = parcel.readInt();
                this.f8707p = parcel.readInt() == 1;
                int i7 = parcel.readInt();
                if (i7 > 0) {
                    int[] iArr = new int[i7];
                    this.f8706o = iArr;
                    parcel.readIntArray(iArr);
                }
            }
        }

        d() {
        }

        private int i(int i7) {
            if (this.f8703b == null) {
                return -1;
            }
            a aVarF = f(i7);
            if (aVarF != null) {
                this.f8703b.remove(aVarF);
            }
            int size = this.f8703b.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    i8 = -1;
                    break;
                }
                if (((a) this.f8703b.get(i8)).f8704m >= i7) {
                    break;
                }
                i8++;
            }
            if (i8 == -1) {
                return -1;
            }
            a aVar = (a) this.f8703b.get(i8);
            this.f8703b.remove(i8);
            return aVar.f8704m;
        }

        private void l(int i7, int i8) {
            List list = this.f8703b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f8703b.get(size);
                int i9 = aVar.f8704m;
                if (i9 >= i7) {
                    aVar.f8704m = i9 + i8;
                }
            }
        }

        private void m(int i7, int i8) {
            List list = this.f8703b;
            if (list == null) {
                return;
            }
            int i9 = i7 + i8;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f8703b.get(size);
                int i10 = aVar.f8704m;
                if (i10 >= i7) {
                    if (i10 < i9) {
                        this.f8703b.remove(size);
                    } else {
                        aVar.f8704m = i10 - i8;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f8703b == null) {
                this.f8703b = new ArrayList();
            }
            int size = this.f8703b.size();
            for (int i7 = 0; i7 < size; i7++) {
                a aVar2 = (a) this.f8703b.get(i7);
                if (aVar2.f8704m == aVar.f8704m) {
                    this.f8703b.remove(i7);
                }
                if (aVar2.f8704m >= aVar.f8704m) {
                    this.f8703b.add(i7, aVar);
                    return;
                }
            }
            this.f8703b.add(aVar);
        }

        void b() {
            int[] iArr = this.f8702a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f8703b = null;
        }

        void c(int i7) {
            int[] iArr = this.f8702a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i7, 10) + 1];
                this.f8702a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i7 >= iArr.length) {
                int[] iArr3 = new int[o(i7)];
                this.f8702a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f8702a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i7) {
            List list = this.f8703b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f8703b.get(size)).f8704m >= i7) {
                        this.f8703b.remove(size);
                    }
                }
            }
            return h(i7);
        }

        public a e(int i7, int i8, int i9, boolean z6) {
            List list = this.f8703b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = (a) this.f8703b.get(i10);
                int i11 = aVar.f8704m;
                if (i11 >= i8) {
                    return null;
                }
                if (i11 >= i7 && (i9 == 0 || aVar.f8705n == i9 || (z6 && aVar.f8707p))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i7) {
            List list = this.f8703b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f8703b.get(size);
                if (aVar.f8704m == i7) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i7) {
            int[] iArr = this.f8702a;
            if (iArr == null || i7 >= iArr.length) {
                return -1;
            }
            return iArr[i7];
        }

        int h(int i7) {
            int[] iArr = this.f8702a;
            if (iArr == null || i7 >= iArr.length) {
                return -1;
            }
            int i8 = i(i7);
            if (i8 == -1) {
                int[] iArr2 = this.f8702a;
                Arrays.fill(iArr2, i7, iArr2.length, -1);
                return this.f8702a.length;
            }
            int i9 = i8 + 1;
            Arrays.fill(this.f8702a, i7, i9, -1);
            return i9;
        }

        void j(int i7, int i8) {
            int[] iArr = this.f8702a;
            if (iArr == null || i7 >= iArr.length) {
                return;
            }
            int i9 = i7 + i8;
            c(i9);
            int[] iArr2 = this.f8702a;
            System.arraycopy(iArr2, i7, iArr2, i9, (iArr2.length - i7) - i8);
            Arrays.fill(this.f8702a, i7, i9, -1);
            l(i7, i8);
        }

        void k(int i7, int i8) {
            int[] iArr = this.f8702a;
            if (iArr == null || i7 >= iArr.length) {
                return;
            }
            int i9 = i7 + i8;
            c(i9);
            int[] iArr2 = this.f8702a;
            System.arraycopy(iArr2, i9, iArr2, i7, (iArr2.length - i7) - i8);
            int[] iArr3 = this.f8702a;
            Arrays.fill(iArr3, iArr3.length - i8, iArr3.length, -1);
            m(i7, i8);
        }

        void n(int i7, f fVar) {
            c(i7);
            this.f8702a[i7] = fVar.f8722e;
        }

        int o(int i7) {
            int length = this.f8702a.length;
            while (length <= i7) {
                length *= 2;
            }
            return length;
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f8708m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8709n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f8710o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int[] f8711p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f8712q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int[] f8713r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        List f8714s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f8715t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f8716u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f8717v;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i7) {
                return new e[i7];
            }
        }

        public e() {
        }

        void a() {
            this.f8711p = null;
            this.f8710o = 0;
            this.f8708m = -1;
            this.f8709n = -1;
        }

        void b() {
            this.f8711p = null;
            this.f8710o = 0;
            this.f8712q = 0;
            this.f8713r = null;
            this.f8714s = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f8708m);
            parcel.writeInt(this.f8709n);
            parcel.writeInt(this.f8710o);
            if (this.f8710o > 0) {
                parcel.writeIntArray(this.f8711p);
            }
            parcel.writeInt(this.f8712q);
            if (this.f8712q > 0) {
                parcel.writeIntArray(this.f8713r);
            }
            parcel.writeInt(this.f8715t ? 1 : 0);
            parcel.writeInt(this.f8716u ? 1 : 0);
            parcel.writeInt(this.f8717v ? 1 : 0);
            parcel.writeList(this.f8714s);
        }

        e(Parcel parcel) {
            this.f8708m = parcel.readInt();
            this.f8709n = parcel.readInt();
            int i7 = parcel.readInt();
            this.f8710o = i7;
            if (i7 > 0) {
                int[] iArr = new int[i7];
                this.f8711p = iArr;
                parcel.readIntArray(iArr);
            }
            int i8 = parcel.readInt();
            this.f8712q = i8;
            if (i8 > 0) {
                int[] iArr2 = new int[i8];
                this.f8713r = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f8715t = parcel.readInt() == 1;
            this.f8716u = parcel.readInt() == 1;
            this.f8717v = parcel.readInt() == 1;
            this.f8714s = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f8710o = eVar.f8710o;
            this.f8708m = eVar.f8708m;
            this.f8709n = eVar.f8709n;
            this.f8711p = eVar.f8711p;
            this.f8712q = eVar.f8712q;
            this.f8713r = eVar.f8713r;
            this.f8715t = eVar.f8715t;
            this.f8716u = eVar.f8716u;
            this.f8717v = eVar.f8717v;
            this.f8714s = eVar.f8714s;
        }
    }

    class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ArrayList f8718a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8719b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8720c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f8721d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f8722e;

        f(int i7) {
            this.f8722e = i7;
        }

        void a(View view) {
            c cVarN = n(view);
            cVarN.f8700e = this;
            this.f8718a.add(view);
            this.f8720c = Integer.MIN_VALUE;
            if (this.f8718a.size() == 1) {
                this.f8719b = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f8721d += StaggeredGridLayoutManager.this.f8686u.e(view);
            }
        }

        void b(boolean z6, int i7) {
            int iL = z6 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (iL == Integer.MIN_VALUE) {
                return;
            }
            if (!z6 || iL >= StaggeredGridLayoutManager.this.f8686u.i()) {
                if (z6 || iL <= StaggeredGridLayoutManager.this.f8686u.m()) {
                    if (i7 != Integer.MIN_VALUE) {
                        iL += i7;
                    }
                    this.f8720c = iL;
                    this.f8719b = iL;
                }
            }
        }

        void c() {
            d.a aVarF;
            ArrayList arrayList = this.f8718a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c cVarN = n(view);
            this.f8720c = StaggeredGridLayoutManager.this.f8686u.d(view);
            if (cVarN.f8701f && (aVarF = StaggeredGridLayoutManager.this.f8672E.f(cVarN.a())) != null && aVarF.f8705n == 1) {
                this.f8720c += aVarF.a(this.f8722e);
            }
        }

        void d() {
            d.a aVarF;
            View view = (View) this.f8718a.get(0);
            c cVarN = n(view);
            this.f8719b = StaggeredGridLayoutManager.this.f8686u.g(view);
            if (cVarN.f8701f && (aVarF = StaggeredGridLayoutManager.this.f8672E.f(cVarN.a())) != null && aVarF.f8705n == -1) {
                this.f8719b -= aVarF.a(this.f8722e);
            }
        }

        void e() {
            this.f8718a.clear();
            q();
            this.f8721d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f8691z ? i(this.f8718a.size() - 1, -1, true) : i(0, this.f8718a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f8691z ? i(0, this.f8718a.size(), true) : i(this.f8718a.size() - 1, -1, true);
        }

        int h(int i7, int i8, boolean z6, boolean z7, boolean z8) {
            int iM = StaggeredGridLayoutManager.this.f8686u.m();
            int i9 = StaggeredGridLayoutManager.this.f8686u.i();
            int i10 = i8 > i7 ? 1 : -1;
            while (i7 != i8) {
                View view = (View) this.f8718a.get(i7);
                int iG = StaggeredGridLayoutManager.this.f8686u.g(view);
                int iD = StaggeredGridLayoutManager.this.f8686u.d(view);
                boolean z9 = false;
                boolean z10 = !z8 ? iG >= i9 : iG > i9;
                if (!z8 ? iD > iM : iD >= iM) {
                    z9 = true;
                }
                if (z10 && z9) {
                    if (z6 && z7) {
                        if (iG >= iM && iD <= i9) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                    } else if (z7 || iG < iM || iD > i9) {
                        return StaggeredGridLayoutManager.this.h0(view);
                    }
                }
                i7 += i10;
            }
            return -1;
        }

        int i(int i7, int i8, boolean z6) {
            return h(i7, i8, false, false, z6);
        }

        public int j() {
            return this.f8721d;
        }

        int k() {
            int i7 = this.f8720c;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            c();
            return this.f8720c;
        }

        int l(int i7) {
            int i8 = this.f8720c;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            if (this.f8718a.size() == 0) {
                return i7;
            }
            c();
            return this.f8720c;
        }

        public View m(int i7, int i8) {
            View view = null;
            if (i8 != -1) {
                int size = this.f8718a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f8718a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f8691z && staggeredGridLayoutManager.h0(view2) >= i7) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f8691z && staggeredGridLayoutManager2.h0(view2) <= i7) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f8718a.size();
                int i9 = 0;
                while (i9 < size2) {
                    View view3 = (View) this.f8718a.get(i9);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f8691z && staggeredGridLayoutManager3.h0(view3) <= i7) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f8691z && staggeredGridLayoutManager4.h0(view3) >= i7) || !view3.hasFocusable()) {
                        break;
                    }
                    i9++;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i7 = this.f8719b;
            if (i7 != Integer.MIN_VALUE) {
                return i7;
            }
            d();
            return this.f8719b;
        }

        int p(int i7) {
            int i8 = this.f8719b;
            if (i8 != Integer.MIN_VALUE) {
                return i8;
            }
            if (this.f8718a.size() == 0) {
                return i7;
            }
            d();
            return this.f8719b;
        }

        void q() {
            this.f8719b = Integer.MIN_VALUE;
            this.f8720c = Integer.MIN_VALUE;
        }

        void r(int i7) {
            int i8 = this.f8719b;
            if (i8 != Integer.MIN_VALUE) {
                this.f8719b = i8 + i7;
            }
            int i9 = this.f8720c;
            if (i9 != Integer.MIN_VALUE) {
                this.f8720c = i9 + i7;
            }
        }

        void s() {
            int size = this.f8718a.size();
            View view = (View) this.f8718a.remove(size - 1);
            c cVarN = n(view);
            cVarN.f8700e = null;
            if (cVarN.c() || cVarN.b()) {
                this.f8721d -= StaggeredGridLayoutManager.this.f8686u.e(view);
            }
            if (size == 1) {
                this.f8719b = Integer.MIN_VALUE;
            }
            this.f8720c = Integer.MIN_VALUE;
        }

        void t() {
            View view = (View) this.f8718a.remove(0);
            c cVarN = n(view);
            cVarN.f8700e = null;
            if (this.f8718a.size() == 0) {
                this.f8720c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f8721d -= StaggeredGridLayoutManager.this.f8686u.e(view);
            }
            this.f8719b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c cVarN = n(view);
            cVarN.f8700e = this;
            this.f8718a.add(0, view);
            this.f8719b = Integer.MIN_VALUE;
            if (this.f8718a.size() == 1) {
                this.f8720c = Integer.MIN_VALUE;
            }
            if (cVarN.c() || cVarN.b()) {
                this.f8721d += StaggeredGridLayoutManager.this.f8686u.e(view);
            }
        }

        void v(int i7) {
            this.f8719b = i7;
            this.f8720c = i7;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        RecyclerView.o.d dVarI0 = RecyclerView.o.i0(context, attributeSet, i7, i8);
        H2(dVarI0.f8612a);
        J2(dVarI0.f8613b);
        I2(dVarI0.f8614c);
        this.f8690y = new androidx.recyclerview.widget.f();
        a2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
    
        if (r4.f8847e == (-1)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A2(RecyclerView.u uVar, androidx.recyclerview.widget.f fVar) {
        if (!fVar.f8843a || fVar.f8851i) {
            return;
        }
        if (fVar.f8844b != 0) {
            if (fVar.f8847e != -1) {
                int iN2 = n2(fVar.f8849g) - fVar.f8849g;
                int iMin = iN2 < 0 ? fVar.f8848f : Math.min(iN2, fVar.f8844b) + fVar.f8848f;
                C2(uVar, iMin);
            } else {
                int i7 = fVar.f8848f;
                int iM2 = i7 - m2(i7);
                int iMin2 = iM2 < 0 ? fVar.f8849g : fVar.f8849g - Math.min(iM2, fVar.f8844b);
                B2(uVar, iMin2);
            }
        }
    }

    private void B2(RecyclerView.u uVar, int i7) {
        for (int iJ = J() - 1; iJ >= 0; iJ--) {
            View viewI = I(iJ);
            if (this.f8686u.g(viewI) < i7 || this.f8686u.q(viewI) < i7) {
                return;
            }
            c cVar = (c) viewI.getLayoutParams();
            if (cVar.f8701f) {
                for (int i8 = 0; i8 < this.f8684s; i8++) {
                    if (this.f8685t[i8].f8718a.size() == 1) {
                        return;
                    }
                }
                for (int i9 = 0; i9 < this.f8684s; i9++) {
                    this.f8685t[i9].s();
                }
            } else if (cVar.f8700e.f8718a.size() == 1) {
                return;
            } else {
                cVar.f8700e.s();
            }
            m1(viewI, uVar);
        }
    }

    private void C2(RecyclerView.u uVar, int i7) {
        while (J() > 0) {
            View viewI = I(0);
            if (this.f8686u.d(viewI) > i7 || this.f8686u.p(viewI) > i7) {
                return;
            }
            c cVar = (c) viewI.getLayoutParams();
            if (cVar.f8701f) {
                for (int i8 = 0; i8 < this.f8684s; i8++) {
                    if (this.f8685t[i8].f8718a.size() == 1) {
                        return;
                    }
                }
                for (int i9 = 0; i9 < this.f8684s; i9++) {
                    this.f8685t[i9].t();
                }
            } else if (cVar.f8700e.f8718a.size() == 1) {
                return;
            } else {
                cVar.f8700e.t();
            }
            m1(viewI, uVar);
        }
    }

    private void D2() {
        if (this.f8687v.k() == 1073741824) {
            return;
        }
        int iJ = J();
        float fMax = 0.0f;
        for (int i7 = 0; i7 < iJ; i7++) {
            View viewI = I(i7);
            float fE = this.f8687v.e(viewI);
            if (fE >= fMax) {
                if (((c) viewI.getLayoutParams()).f()) {
                    fE = (fE * 1.0f) / this.f8684s;
                }
                fMax = Math.max(fMax, fE);
            }
        }
        int i8 = this.f8689x;
        int iRound = Math.round(fMax * this.f8684s);
        if (this.f8687v.k() == Integer.MIN_VALUE) {
            iRound = Math.min(iRound, this.f8687v.n());
        }
        P2(iRound);
        if (this.f8689x == i8) {
            return;
        }
        for (int i9 = 0; i9 < iJ; i9++) {
            View viewI2 = I(i9);
            c cVar = (c) viewI2.getLayoutParams();
            if (!cVar.f8701f) {
                if (t2() && this.f8688w == 1) {
                    int i10 = this.f8684s;
                    int i11 = cVar.f8700e.f8722e;
                    viewI2.offsetLeftAndRight(((-((i10 - 1) - i11)) * this.f8689x) - ((-((i10 - 1) - i11)) * i8));
                } else {
                    int i12 = cVar.f8700e.f8722e;
                    int i13 = this.f8688w;
                    int i14 = (this.f8689x * i12) - (i12 * i8);
                    if (i13 == 1) {
                        viewI2.offsetLeftAndRight(i14);
                    } else {
                        viewI2.offsetTopAndBottom(i14);
                    }
                }
            }
        }
    }

    private void E2() {
        this.f8668A = (this.f8688w == 1 || !t2()) ? this.f8691z : !this.f8691z;
    }

    private void G2(int i7) {
        androidx.recyclerview.widget.f fVar = this.f8690y;
        fVar.f8847e = i7;
        fVar.f8846d = this.f8668A != (i7 == -1) ? -1 : 1;
    }

    private void K2(int i7, int i8) {
        for (int i9 = 0; i9 < this.f8684s; i9++) {
            if (!this.f8685t[i9].f8718a.isEmpty()) {
                Q2(this.f8685t[i9], i7, i8);
            }
        }
    }

    private boolean L2(RecyclerView.z zVar, b bVar) {
        boolean z6 = this.f8674G;
        int iB = zVar.b();
        bVar.f8693a = z6 ? g2(iB) : c2(iB);
        bVar.f8694b = Integer.MIN_VALUE;
        return true;
    }

    private void M1(View view) {
        for (int i7 = this.f8684s - 1; i7 >= 0; i7--) {
            this.f8685t[i7].a(view);
        }
    }

    private void N1(b bVar) {
        boolean z6;
        e eVar = this.f8676I;
        int i7 = eVar.f8710o;
        if (i7 > 0) {
            if (i7 == this.f8684s) {
                for (int i8 = 0; i8 < this.f8684s; i8++) {
                    this.f8685t[i8].e();
                    e eVar2 = this.f8676I;
                    int i9 = eVar2.f8711p[i8];
                    if (i9 != Integer.MIN_VALUE) {
                        i9 += eVar2.f8716u ? this.f8686u.i() : this.f8686u.m();
                    }
                    this.f8685t[i8].v(i9);
                }
            } else {
                eVar.b();
                e eVar3 = this.f8676I;
                eVar3.f8708m = eVar3.f8709n;
            }
        }
        e eVar4 = this.f8676I;
        this.f8675H = eVar4.f8717v;
        I2(eVar4.f8715t);
        E2();
        e eVar5 = this.f8676I;
        int i10 = eVar5.f8708m;
        if (i10 != -1) {
            this.f8670C = i10;
            z6 = eVar5.f8716u;
        } else {
            z6 = this.f8668A;
        }
        bVar.f8695c = z6;
        if (eVar5.f8712q > 1) {
            d dVar = this.f8672E;
            dVar.f8702a = eVar5.f8713r;
            dVar.f8703b = eVar5.f8714s;
        }
    }

    private void O2(int i7, RecyclerView.z zVar) {
        int iN;
        int iN2;
        int iC;
        androidx.recyclerview.widget.f fVar = this.f8690y;
        boolean z6 = false;
        fVar.f8844b = 0;
        fVar.f8845c = i7;
        if (!x0() || (iC = zVar.c()) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.f8668A == (iC < i7)) {
                iN = this.f8686u.n();
                iN2 = 0;
            } else {
                iN2 = this.f8686u.n();
                iN = 0;
            }
        }
        if (M()) {
            this.f8690y.f8848f = this.f8686u.m() - iN2;
            this.f8690y.f8849g = this.f8686u.i() + iN;
        } else {
            this.f8690y.f8849g = this.f8686u.h() + iN;
            this.f8690y.f8848f = -iN2;
        }
        androidx.recyclerview.widget.f fVar2 = this.f8690y;
        fVar2.f8850h = false;
        fVar2.f8843a = true;
        if (this.f8686u.k() == 0 && this.f8686u.h() == 0) {
            z6 = true;
        }
        fVar2.f8851i = z6;
    }

    private void Q1(View view, c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.f8847e == 1) {
            if (cVar.f8701f) {
                M1(view);
                return;
            } else {
                cVar.f8700e.a(view);
                return;
            }
        }
        if (cVar.f8701f) {
            z2(view);
        } else {
            cVar.f8700e.u(view);
        }
    }

    private void Q2(f fVar, int i7, int i8) {
        int iJ = fVar.j();
        if (i7 == -1) {
            if (fVar.o() + iJ > i8) {
                return;
            }
        } else if (fVar.k() - iJ < i8) {
            return;
        }
        this.f8669B.set(fVar.f8722e, false);
    }

    private int R1(int i7) {
        if (J() == 0) {
            return this.f8668A ? 1 : -1;
        }
        return (i7 < j2()) != this.f8668A ? -1 : 1;
    }

    private int R2(int i7, int i8, int i9) {
        if (i8 == 0 && i9 == 0) {
            return i7;
        }
        int mode = View.MeasureSpec.getMode(i7);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - i8) - i9), mode) : i7;
    }

    private boolean T1(f fVar) {
        if (this.f8668A) {
            if (fVar.k() < this.f8686u.i()) {
                ArrayList arrayList = fVar.f8718a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f8701f;
            }
        } else if (fVar.o() > this.f8686u.m()) {
            return !fVar.n((View) fVar.f8718a.get(0)).f8701f;
        }
        return false;
    }

    private int U1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return m.a(zVar, this.f8686u, e2(!this.f8681N), d2(!this.f8681N), this, this.f8681N);
    }

    private int V1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return m.b(zVar, this.f8686u, e2(!this.f8681N), d2(!this.f8681N), this, this.f8681N, this.f8668A);
    }

    private int W1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return m.c(zVar, this.f8686u, e2(!this.f8681N), d2(!this.f8681N), this, this.f8681N);
    }

    private int X1(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 17 ? i7 != 33 ? i7 != 66 ? (i7 == 130 && this.f8688w == 1) ? 1 : Integer.MIN_VALUE : this.f8688w == 0 ? 1 : Integer.MIN_VALUE : this.f8688w == 1 ? -1 : Integer.MIN_VALUE : this.f8688w == 0 ? -1 : Integer.MIN_VALUE : (this.f8688w != 1 && t2()) ? -1 : 1 : (this.f8688w != 1 && t2()) ? 1 : -1;
    }

    private d.a Y1(int i7) {
        d.a aVar = new d.a();
        aVar.f8706o = new int[this.f8684s];
        for (int i8 = 0; i8 < this.f8684s; i8++) {
            aVar.f8706o[i8] = i7 - this.f8685t[i8].l(i7);
        }
        return aVar;
    }

    private d.a Z1(int i7) {
        d.a aVar = new d.a();
        aVar.f8706o = new int[this.f8684s];
        for (int i8 = 0; i8 < this.f8684s; i8++) {
            aVar.f8706o[i8] = this.f8685t[i8].p(i7) - i7;
        }
        return aVar;
    }

    private void a2() {
        this.f8686u = i.b(this, this.f8688w);
        this.f8687v = i.b(this, 1 - this.f8688w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [androidx.recyclerview.widget.RecyclerView$o] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r16v0, types: [androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.StaggeredGridLayoutManager] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int b2(RecyclerView.u uVar, androidx.recyclerview.widget.f fVar, RecyclerView.z zVar) {
        f fVarP2;
        int iE;
        int i7;
        int iE2;
        int iE3;
        ?? r02;
        View view;
        int i8;
        int i9;
        boolean z6;
        ?? r9 = 0;
        this.f8669B.set(0, this.f8684s, true);
        int i10 = this.f8690y.f8851i ? fVar.f8847e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : Integer.MIN_VALUE : fVar.f8847e == 1 ? fVar.f8849g + fVar.f8844b : fVar.f8848f - fVar.f8844b;
        K2(fVar.f8847e, i10);
        int i11 = this.f8668A ? this.f8686u.i() : this.f8686u.m();
        ?? r03 = false;
        while (fVar.a(zVar) && (this.f8690y.f8851i || !this.f8669B.isEmpty())) {
            View viewB = fVar.b(uVar);
            c cVar = (c) viewB.getLayoutParams();
            int iA = cVar.a();
            int iG = this.f8672E.g(iA);
            ?? r32 = iG == -1 ? 1 : r9;
            if (r32 != 0) {
                fVarP2 = cVar.f8701f ? this.f8685t[r9] : p2(fVar);
                this.f8672E.n(iA, fVarP2);
            } else {
                fVarP2 = this.f8685t[iG];
            }
            f fVar2 = fVarP2;
            cVar.f8700e = fVar2;
            if (fVar.f8847e == 1) {
                d(viewB);
            } else {
                e(viewB, r9);
            }
            v2(viewB, cVar, r9);
            if (fVar.f8847e == 1) {
                int iL2 = cVar.f8701f ? l2(i11) : fVar2.l(i11);
                int iE4 = this.f8686u.e(viewB) + iL2;
                if (r32 != 0 && cVar.f8701f) {
                    d.a aVarY1 = Y1(iL2);
                    aVarY1.f8705n = -1;
                    aVarY1.f8704m = iA;
                    this.f8672E.a(aVarY1);
                }
                i7 = iE4;
                iE = iL2;
            } else {
                int iO2 = cVar.f8701f ? o2(i11) : fVar2.p(i11);
                iE = iO2 - this.f8686u.e(viewB);
                if (r32 != 0 && cVar.f8701f) {
                    d.a aVarZ1 = Z1(iO2);
                    aVarZ1.f8705n = 1;
                    aVarZ1.f8704m = iA;
                    this.f8672E.a(aVarZ1);
                }
                i7 = iO2;
            }
            if (cVar.f8701f && fVar.f8846d == -1) {
                if (r32 == 0) {
                    if (!(fVar.f8847e == 1 ? O1() : P1())) {
                        d.a aVarF = this.f8672E.f(iA);
                        if (aVarF != null) {
                            aVarF.f8707p = true;
                        }
                        this.f8680M = true;
                    }
                } else {
                    this.f8680M = true;
                }
            }
            Q1(viewB, cVar, fVar);
            if (t2() && this.f8688w == 1) {
                int i12 = cVar.f8701f ? this.f8687v.i() : this.f8687v.i() - (((this.f8684s - 1) - fVar2.f8722e) * this.f8689x);
                iE3 = i12;
                iE2 = i12 - this.f8687v.e(viewB);
            } else {
                int iM = cVar.f8701f ? this.f8687v.m() : (fVar2.f8722e * this.f8689x) + this.f8687v.m();
                iE2 = iM;
                iE3 = this.f8687v.e(viewB) + iM;
            }
            if (this.f8688w == 1) {
                r02 = this;
                view = viewB;
                i8 = iE2;
                iE2 = iE;
                i9 = iE3;
            } else {
                r02 = this;
                view = viewB;
                i8 = iE;
                i9 = i7;
                i7 = iE3;
            }
            r02.z0(view, i8, iE2, i9, i7);
            if (cVar.f8701f) {
                K2(this.f8690y.f8847e, i10);
            } else {
                Q2(fVar2, this.f8690y.f8847e, i10);
            }
            A2(uVar, this.f8690y);
            if (!this.f8690y.f8850h || !viewB.hasFocusable()) {
                z6 = false;
            } else if (cVar.f8701f) {
                this.f8669B.clear();
                z6 = false;
            } else {
                z6 = false;
                this.f8669B.set(fVar2.f8722e, false);
            }
            r9 = z6;
            r03 = true;
        }
        ?? r33 = r9;
        if (r03 == false) {
            A2(uVar, this.f8690y);
        }
        int iM2 = this.f8690y.f8847e == -1 ? this.f8686u.m() - o2(this.f8686u.m()) : l2(this.f8686u.i()) - this.f8686u.i();
        return iM2 > 0 ? Math.min(fVar.f8844b, iM2) : r33 == true ? 1 : 0;
    }

    private int c2(int i7) {
        int iJ = J();
        for (int i8 = 0; i8 < iJ; i8++) {
            int iH0 = h0(I(i8));
            if (iH0 >= 0 && iH0 < i7) {
                return iH0;
            }
        }
        return 0;
    }

    private int g2(int i7) {
        for (int iJ = J() - 1; iJ >= 0; iJ--) {
            int iH0 = h0(I(iJ));
            if (iH0 >= 0 && iH0 < i7) {
                return iH0;
            }
        }
        return 0;
    }

    private void h2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z6) {
        int i7;
        int iL2 = l2(Integer.MIN_VALUE);
        if (iL2 != Integer.MIN_VALUE && (i7 = this.f8686u.i() - iL2) > 0) {
            int i8 = i7 - (-F2(-i7, uVar, zVar));
            if (!z6 || i8 <= 0) {
                return;
            }
            this.f8686u.r(i8);
        }
    }

    private void i2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z6) {
        int iM;
        int iO2 = o2(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (iO2 != Integer.MAX_VALUE && (iM = iO2 - this.f8686u.m()) > 0) {
            int iF2 = iM - F2(iM, uVar, zVar);
            if (!z6 || iF2 <= 0) {
                return;
            }
            this.f8686u.r(-iF2);
        }
    }

    private int l2(int i7) {
        int iL = this.f8685t[0].l(i7);
        for (int i8 = 1; i8 < this.f8684s; i8++) {
            int iL2 = this.f8685t[i8].l(i7);
            if (iL2 > iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int m2(int i7) {
        int iP = this.f8685t[0].p(i7);
        for (int i8 = 1; i8 < this.f8684s; i8++) {
            int iP2 = this.f8685t[i8].p(i7);
            if (iP2 > iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private int n2(int i7) {
        int iL = this.f8685t[0].l(i7);
        for (int i8 = 1; i8 < this.f8684s; i8++) {
            int iL2 = this.f8685t[i8].l(i7);
            if (iL2 < iL) {
                iL = iL2;
            }
        }
        return iL;
    }

    private int o2(int i7) {
        int iP = this.f8685t[0].p(i7);
        for (int i8 = 1; i8 < this.f8684s; i8++) {
            int iP2 = this.f8685t[i8].p(i7);
            if (iP2 < iP) {
                iP = iP2;
            }
        }
        return iP;
    }

    private f p2(androidx.recyclerview.widget.f fVar) {
        int i7;
        int i8;
        int i9;
        if (x2(fVar.f8847e)) {
            i8 = this.f8684s - 1;
            i7 = -1;
            i9 = -1;
        } else {
            i7 = this.f8684s;
            i8 = 0;
            i9 = 1;
        }
        f fVar2 = null;
        if (fVar.f8847e == 1) {
            int iM = this.f8686u.m();
            int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            while (i8 != i7) {
                f fVar3 = this.f8685t[i8];
                int iL = fVar3.l(iM);
                if (iL < i10) {
                    fVar2 = fVar3;
                    i10 = iL;
                }
                i8 += i9;
            }
            return fVar2;
        }
        int i11 = this.f8686u.i();
        int i12 = Integer.MIN_VALUE;
        while (i8 != i7) {
            f fVar4 = this.f8685t[i8];
            int iP = fVar4.p(i11);
            if (iP > i12) {
                fVar2 = fVar4;
                i12 = iP;
            }
            i8 += i9;
        }
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void q2(int i7, int i8, int i9) {
        int i10;
        int i11;
        int iK2 = this.f8668A ? k2() : j2();
        if (i9 != 8) {
            i10 = i7 + i8;
        } else {
            if (i7 >= i8) {
                i10 = i7 + 1;
                i11 = i8;
                this.f8672E.h(i11);
                if (i9 != 1) {
                    this.f8672E.j(i7, i8);
                } else if (i9 == 2) {
                    this.f8672E.k(i7, i8);
                } else if (i9 == 8) {
                    this.f8672E.k(i7, 1);
                    this.f8672E.j(i8, 1);
                }
                if (i10 > iK2) {
                    return;
                }
                if (i11 <= (this.f8668A ? j2() : k2())) {
                    t1();
                    return;
                }
                return;
            }
            i10 = i8 + 1;
        }
        i11 = i7;
        this.f8672E.h(i11);
        if (i9 != 1) {
        }
        if (i10 > iK2) {
        }
    }

    private void u2(View view, int i7, int i8, boolean z6) {
        j(view, this.f8678K);
        c cVar = (c) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f8678K;
        int iR2 = R2(i7, i9 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i10 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f8678K;
        int iR22 = R2(i8, i10 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z6 ? H1(view, iR2, iR22, cVar) : F1(view, iR2, iR22, cVar)) {
            view.measure(iR2, iR22);
        }
    }

    private void v2(View view, c cVar, boolean z6) {
        int iK;
        int iK2;
        if (cVar.f8701f) {
            if (this.f8688w != 1) {
                u2(view, RecyclerView.o.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f8677J, z6);
                return;
            }
            iK = this.f8677J;
        } else {
            if (this.f8688w != 1) {
                iK = RecyclerView.o.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
                iK2 = RecyclerView.o.K(this.f8689x, X(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
                u2(view, iK, iK2, z6);
            }
            iK = RecyclerView.o.K(this.f8689x, p0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        }
        iK2 = RecyclerView.o.K(W(), X(), g0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        u2(view, iK, iK2, z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void w2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z6) {
        e eVar;
        b bVar = this.f8679L;
        if (!(this.f8676I == null && this.f8670C == -1) && zVar.b() == 0) {
            k1(uVar);
            bVar.c();
            return;
        }
        boolean z7 = true;
        boolean z8 = (bVar.f8697e && this.f8670C == -1 && this.f8676I == null) ? false : true;
        if (z8) {
            bVar.c();
            if (this.f8676I != null) {
                N1(bVar);
            } else {
                E2();
                bVar.f8695c = this.f8668A;
            }
            N2(zVar, bVar);
            bVar.f8697e = true;
        }
        if (this.f8676I == null && this.f8670C == -1 && (bVar.f8695c != this.f8674G || t2() != this.f8675H)) {
            this.f8672E.b();
            bVar.f8696d = true;
        }
        if (J() > 0 && ((eVar = this.f8676I) == null || eVar.f8710o < 1)) {
            if (bVar.f8696d) {
                for (int i7 = 0; i7 < this.f8684s; i7++) {
                    this.f8685t[i7].e();
                    int i8 = bVar.f8694b;
                    if (i8 != Integer.MIN_VALUE) {
                        this.f8685t[i7].v(i8);
                    }
                }
            } else if (z8 || this.f8679L.f8698f == null) {
                for (int i9 = 0; i9 < this.f8684s; i9++) {
                    this.f8685t[i9].b(this.f8668A, bVar.f8694b);
                }
                this.f8679L.d(this.f8685t);
            } else {
                for (int i10 = 0; i10 < this.f8684s; i10++) {
                    f fVar = this.f8685t[i10];
                    fVar.e();
                    fVar.v(this.f8679L.f8698f[i10]);
                }
            }
        }
        w(uVar);
        this.f8690y.f8843a = false;
        this.f8680M = false;
        P2(this.f8687v.n());
        O2(bVar.f8693a, zVar);
        if (bVar.f8695c) {
            G2(-1);
            b2(uVar, this.f8690y, zVar);
            G2(1);
        } else {
            G2(1);
            b2(uVar, this.f8690y, zVar);
            G2(-1);
        }
        androidx.recyclerview.widget.f fVar2 = this.f8690y;
        fVar2.f8845c = bVar.f8693a + fVar2.f8846d;
        b2(uVar, fVar2, zVar);
        D2();
        if (J() > 0) {
            if (this.f8668A) {
                h2(uVar, zVar, true);
                i2(uVar, zVar, false);
            } else {
                i2(uVar, zVar, true);
                h2(uVar, zVar, false);
            }
        }
        if (!z6 || zVar.e() || this.f8673F == 0 || J() <= 0 || (!this.f8680M && r2() == null)) {
            z7 = false;
        } else {
            o1(this.f8683P);
            if (!S1()) {
            }
        }
        if (zVar.e()) {
            this.f8679L.c();
        }
        this.f8674G = bVar.f8695c;
        this.f8675H = t2();
        if (z7) {
            this.f8679L.c();
            w2(uVar, zVar, false);
        }
    }

    private boolean x2(int i7) {
        if (this.f8688w == 0) {
            return (i7 == -1) != this.f8668A;
        }
        return ((i7 == -1) == this.f8668A) == t2();
    }

    private void z2(View view) {
        for (int i7 = this.f8684s - 1; i7 >= 0; i7--) {
            this.f8685t[i7].u(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C0(int i7) {
        super.C0(i7);
        for (int i8 = 0; i8 < this.f8684s; i8++) {
            this.f8685t[i8].r(i7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(Rect rect, int i7, int i8) {
        int iN;
        int iN2;
        int iE0 = e0() + f0();
        int iG0 = g0() + d0();
        if (this.f8688w == 1) {
            iN2 = RecyclerView.o.n(i8, rect.height() + iG0, b0());
            iN = RecyclerView.o.n(i7, (this.f8689x * this.f8684s) + iE0, c0());
        } else {
            iN = RecyclerView.o.n(i7, rect.width() + iE0, c0());
            iN2 = RecyclerView.o.n(i8, (this.f8689x * this.f8684s) + iG0, b0());
        }
        B1(iN, iN2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return this.f8688w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void D0(int i7) {
        super.D0(i7);
        for (int i8 = 0; i8 < this.f8684s; i8++) {
            this.f8685t[i8].r(i7);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    int F2(int i7, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (J() == 0 || i7 == 0) {
            return 0;
        }
        y2(i7, zVar);
        int iB2 = b2(uVar, this.f8690y, zVar);
        if (this.f8690y.f8844b >= iB2) {
            i7 = i7 < 0 ? -iB2 : iB2;
        }
        this.f8686u.r(-i7);
        this.f8674G = this.f8668A;
        androidx.recyclerview.widget.f fVar = this.f8690y;
        fVar.f8844b = 0;
        A2(uVar, fVar);
        return i7;
    }

    public void H2(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        g(null);
        if (i7 == this.f8688w) {
            return;
        }
        this.f8688w = i7;
        i iVar = this.f8686u;
        this.f8686u = this.f8687v;
        this.f8687v = iVar;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.I0(recyclerView, uVar);
        o1(this.f8683P);
        for (int i7 = 0; i7 < this.f8684s; i7++) {
            this.f8685t[i7].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I1(RecyclerView recyclerView, RecyclerView.z zVar, int i7) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i7);
        J1(gVar);
    }

    public void I2(boolean z6) {
        g(null);
        e eVar = this.f8676I;
        if (eVar != null && eVar.f8715t != z6) {
            eVar.f8715t = z6;
        }
        this.f8691z = z6;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J0(View view, int i7, RecyclerView.u uVar, RecyclerView.z zVar) {
        View viewB;
        View viewM;
        if (J() == 0 || (viewB = B(view)) == null) {
            return null;
        }
        E2();
        int iX1 = X1(i7);
        if (iX1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) viewB.getLayoutParams();
        boolean z6 = cVar.f8701f;
        f fVar = cVar.f8700e;
        int iK2 = iX1 == 1 ? k2() : j2();
        O2(iK2, zVar);
        G2(iX1);
        androidx.recyclerview.widget.f fVar2 = this.f8690y;
        fVar2.f8845c = fVar2.f8846d + iK2;
        fVar2.f8844b = (int) (this.f8686u.n() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.f8690y;
        fVar3.f8850h = true;
        fVar3.f8843a = false;
        b2(uVar, fVar3, zVar);
        this.f8674G = this.f8668A;
        if (!z6 && (viewM = fVar.m(iK2, iX1)) != null && viewM != viewB) {
            return viewM;
        }
        if (x2(iX1)) {
            for (int i8 = this.f8684s - 1; i8 >= 0; i8--) {
                View viewM2 = this.f8685t[i8].m(iK2, iX1);
                if (viewM2 != null && viewM2 != viewB) {
                    return viewM2;
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f8684s; i9++) {
                View viewM3 = this.f8685t[i9].m(iK2, iX1);
                if (viewM3 != null && viewM3 != viewB) {
                    return viewM3;
                }
            }
        }
        boolean z7 = (this.f8691z ^ true) == (iX1 == -1);
        if (!z6) {
            View viewC = C(z7 ? fVar.f() : fVar.g());
            if (viewC != null && viewC != viewB) {
                return viewC;
            }
        }
        if (x2(iX1)) {
            for (int i10 = this.f8684s - 1; i10 >= 0; i10--) {
                if (i10 != fVar.f8722e) {
                    f[] fVarArr = this.f8685t;
                    View viewC2 = C(z7 ? fVarArr[i10].f() : fVarArr[i10].g());
                    if (viewC2 != null && viewC2 != viewB) {
                        return viewC2;
                    }
                }
            }
        } else {
            for (int i11 = 0; i11 < this.f8684s; i11++) {
                f[] fVarArr2 = this.f8685t;
                View viewC3 = C(z7 ? fVarArr2[i11].f() : fVarArr2[i11].g());
                if (viewC3 != null && viewC3 != viewB) {
                    return viewC3;
                }
            }
        }
        return null;
    }

    public void J2(int i7) {
        g(null);
        if (i7 != this.f8684s) {
            s2();
            this.f8684s = i7;
            this.f8669B = new BitSet(this.f8684s);
            this.f8685t = new f[this.f8684s];
            for (int i8 = 0; i8 < this.f8684s; i8++) {
                this.f8685t[i8] = new f(i8);
            }
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            View viewE2 = e2(false);
            View viewD2 = d2(false);
            if (viewE2 == null || viewD2 == null) {
                return;
            }
            int iH0 = h0(viewE2);
            int iH02 = h0(viewD2);
            if (iH0 < iH02) {
                accessibilityEvent.setFromIndex(iH0);
                accessibilityEvent.setToIndex(iH02);
            } else {
                accessibilityEvent.setFromIndex(iH02);
                accessibilityEvent.setToIndex(iH0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.f8676I == null;
    }

    boolean M2(RecyclerView.z zVar, b bVar) {
        int i7;
        int iM;
        int iG;
        if (!zVar.e() && (i7 = this.f8670C) != -1) {
            if (i7 >= 0 && i7 < zVar.b()) {
                e eVar = this.f8676I;
                if (eVar == null || eVar.f8708m == -1 || eVar.f8710o < 1) {
                    View viewC = C(this.f8670C);
                    if (viewC != null) {
                        bVar.f8693a = this.f8668A ? k2() : j2();
                        if (this.f8671D != Integer.MIN_VALUE) {
                            if (bVar.f8695c) {
                                iM = this.f8686u.i() - this.f8671D;
                                iG = this.f8686u.d(viewC);
                            } else {
                                iM = this.f8686u.m() + this.f8671D;
                                iG = this.f8686u.g(viewC);
                            }
                            bVar.f8694b = iM - iG;
                            return true;
                        }
                        if (this.f8686u.e(viewC) > this.f8686u.n()) {
                            bVar.f8694b = bVar.f8695c ? this.f8686u.i() : this.f8686u.m();
                            return true;
                        }
                        int iG2 = this.f8686u.g(viewC) - this.f8686u.m();
                        if (iG2 < 0) {
                            bVar.f8694b = -iG2;
                            return true;
                        }
                        int i8 = this.f8686u.i() - this.f8686u.d(viewC);
                        if (i8 < 0) {
                            bVar.f8694b = i8;
                            return true;
                        }
                        bVar.f8694b = Integer.MIN_VALUE;
                    } else {
                        int i9 = this.f8670C;
                        bVar.f8693a = i9;
                        int i10 = this.f8671D;
                        if (i10 == Integer.MIN_VALUE) {
                            bVar.f8695c = R1(i9) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i10);
                        }
                        bVar.f8696d = true;
                    }
                } else {
                    bVar.f8694b = Integer.MIN_VALUE;
                    bVar.f8693a = this.f8670C;
                }
                return true;
            }
            this.f8670C = -1;
            this.f8671D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int N(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f8688w == 1 ? this.f8684s : super.N(uVar, zVar);
    }

    void N2(RecyclerView.z zVar, b bVar) {
        if (M2(zVar, bVar) || L2(zVar, bVar)) {
            return;
        }
        bVar.a();
        bVar.f8693a = 0;
    }

    boolean O1() {
        int iL = this.f8685t[0].l(Integer.MIN_VALUE);
        for (int i7 = 1; i7 < this.f8684s; i7++) {
            if (this.f8685t[i7].l(Integer.MIN_VALUE) != iL) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView.u uVar, RecyclerView.z zVar, View view, C c7) {
        int iE;
        int i7;
        boolean z6;
        boolean z7;
        int iE2;
        int i8;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.O0(view, c7);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f8688w == 0) {
            iE2 = cVar.e();
            i8 = cVar.f8701f ? this.f8684s : 1;
            z6 = false;
            z7 = false;
            iE = -1;
            i7 = -1;
        } else {
            iE = cVar.e();
            i7 = cVar.f8701f ? this.f8684s : 1;
            z6 = false;
            z7 = false;
            iE2 = -1;
            i8 = -1;
        }
        c7.j0(C.c.b(iE2, i8, iE, i7, z6, z7));
    }

    boolean P1() {
        int iP = this.f8685t[0].p(Integer.MIN_VALUE);
        for (int i7 = 1; i7 < this.f8684s; i7++) {
            if (this.f8685t[i7].p(Integer.MIN_VALUE) != iP) {
                return false;
            }
        }
        return true;
    }

    void P2(int i7) {
        this.f8689x = i7 / this.f8684s;
        this.f8677J = View.MeasureSpec.makeMeasureSpec(i7, this.f8687v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int i7, int i8) {
        q2(i7, i8, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView) {
        this.f8672E.b();
        t1();
    }

    boolean S1() {
        int iJ2;
        int iK2;
        if (J() == 0 || this.f8673F == 0 || !r0()) {
            return false;
        }
        if (this.f8668A) {
            iJ2 = k2();
            iK2 = j2();
        } else {
            iJ2 = j2();
            iK2 = k2();
        }
        if (iJ2 == 0 && r2() != null) {
            this.f8672E.b();
        } else {
            if (!this.f8680M) {
                return false;
            }
            int i7 = this.f8668A ? -1 : 1;
            int i8 = iK2 + 1;
            d.a aVarE = this.f8672E.e(iJ2, i8, i7, true);
            if (aVarE == null) {
                this.f8680M = false;
                this.f8672E.d(i8);
                return false;
            }
            d.a aVarE2 = this.f8672E.e(iJ2, aVarE.f8704m, i7 * (-1), true);
            if (aVarE2 == null) {
                this.f8672E.d(aVarE.f8704m);
            } else {
                this.f8672E.d(aVarE2.f8704m + 1);
            }
        }
        u1();
        t1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView recyclerView, int i7, int i8, int i9) {
        q2(i7, i8, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i7, int i8) {
        q2(i7, i8, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView, int i7, int i8, Object obj) {
        q2(i7, i8, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.u uVar, RecyclerView.z zVar) {
        w2(uVar, zVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.f8670C = -1;
        this.f8671D = Integer.MIN_VALUE;
        this.f8676I = null;
        this.f8679L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF a(int i7) {
        int iR1 = R1(i7);
        PointF pointF = new PointF();
        if (iR1 == 0) {
            return null;
        }
        if (this.f8688w == 0) {
            pointF.x = iR1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iR1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.f8676I = (e) parcelable;
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable d1() {
        int iP;
        int iM;
        int[] iArr;
        if (this.f8676I != null) {
            return new e(this.f8676I);
        }
        e eVar = new e();
        eVar.f8715t = this.f8691z;
        eVar.f8716u = this.f8674G;
        eVar.f8717v = this.f8675H;
        d dVar = this.f8672E;
        if (dVar == null || (iArr = dVar.f8702a) == null) {
            eVar.f8712q = 0;
        } else {
            eVar.f8713r = iArr;
            eVar.f8712q = iArr.length;
            eVar.f8714s = dVar.f8703b;
        }
        if (J() > 0) {
            eVar.f8708m = this.f8674G ? k2() : j2();
            eVar.f8709n = f2();
            int i7 = this.f8684s;
            eVar.f8710o = i7;
            eVar.f8711p = new int[i7];
            for (int i8 = 0; i8 < this.f8684s; i8++) {
                if (this.f8674G) {
                    iP = this.f8685t[i8].l(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f8686u.i();
                        iP -= iM;
                    }
                } else {
                    iP = this.f8685t[i8].p(Integer.MIN_VALUE);
                    if (iP != Integer.MIN_VALUE) {
                        iM = this.f8686u.m();
                        iP -= iM;
                    }
                }
                eVar.f8711p[i8] = iP;
            }
        } else {
            eVar.f8708m = -1;
            eVar.f8709n = -1;
            eVar.f8710o = 0;
        }
        return eVar;
    }

    View d2(boolean z6) {
        int iM = this.f8686u.m();
        int i7 = this.f8686u.i();
        View view = null;
        for (int iJ = J() - 1; iJ >= 0; iJ--) {
            View viewI = I(iJ);
            int iG = this.f8686u.g(viewI);
            int iD = this.f8686u.d(viewI);
            if (iD > iM && iG < i7) {
                if (iD <= i7 || !z6) {
                    return viewI;
                }
                if (view == null) {
                    view = viewI;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e1(int i7) {
        if (i7 == 0) {
            S1();
        }
    }

    View e2(boolean z6) {
        int iM = this.f8686u.m();
        int i7 = this.f8686u.i();
        int iJ = J();
        View view = null;
        for (int i8 = 0; i8 < iJ; i8++) {
            View viewI = I(i8);
            int iG = this.f8686u.g(viewI);
            if (this.f8686u.d(viewI) > iM && iG < i7) {
                if (iG >= iM || !z6) {
                    return viewI;
                }
                if (view == null) {
                    view = viewI;
                }
            }
        }
        return view;
    }

    int f2() {
        View viewD2 = this.f8668A ? d2(true) : e2(true);
        if (viewD2 == null) {
            return -1;
        }
        return h0(viewD2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(String str) {
        if (this.f8676I == null) {
            super.g(str);
        }
    }

    int j2() {
        if (J() == 0) {
            return 0;
        }
        return h0(I(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.f8688w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int k0(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f8688w == 0 ? this.f8684s : super.k0(uVar, zVar);
    }

    int k2() {
        int iJ = J();
        if (iJ == 0) {
            return 0;
        }
        return h0(I(iJ - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l() {
        return this.f8688w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o(int i7, int i8, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        int iL;
        int iP;
        if (this.f8688w != 0) {
            i7 = i8;
        }
        if (J() == 0 || i7 == 0) {
            return;
        }
        y2(i7, zVar);
        int[] iArr = this.f8682O;
        if (iArr == null || iArr.length < this.f8684s) {
            this.f8682O = new int[this.f8684s];
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f8684s; i10++) {
            androidx.recyclerview.widget.f fVar = this.f8690y;
            if (fVar.f8846d == -1) {
                iL = fVar.f8848f;
                iP = this.f8685t[i10].p(iL);
            } else {
                iL = this.f8685t[i10].l(fVar.f8849g);
                iP = this.f8690y.f8849g;
            }
            int i11 = iL - iP;
            if (i11 >= 0) {
                this.f8682O[i9] = i11;
                i9++;
            }
        }
        Arrays.sort(this.f8682O, 0, i9);
        for (int i12 = 0; i12 < i9 && this.f8690y.a(zVar); i12++) {
            cVar.a(this.f8690y.f8845c, this.f8682O[i12]);
            androidx.recyclerview.widget.f fVar2 = this.f8690y;
            fVar2.f8845c += fVar2.f8846d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.z zVar) {
        return U1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.z zVar) {
        return V1(zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    View r2() {
        int i7;
        int iJ = J();
        int i8 = iJ - 1;
        BitSet bitSet = new BitSet(this.f8684s);
        bitSet.set(0, this.f8684s, true);
        byte b7 = (this.f8688w == 1 && t2()) ? (byte) 1 : (byte) -1;
        if (this.f8668A) {
            iJ = -1;
        } else {
            i8 = 0;
        }
        int i9 = i8 < iJ ? 1 : -1;
        while (i8 != iJ) {
            View viewI = I(i8);
            c cVar = (c) viewI.getLayoutParams();
            if (bitSet.get(cVar.f8700e.f8722e)) {
                if (T1(cVar.f8700e)) {
                    return viewI;
                }
                bitSet.clear(cVar.f8700e.f8722e);
            }
            if (!cVar.f8701f && (i7 = i8 + i9) != iJ) {
                View viewI2 = I(i7);
                if (this.f8668A) {
                    int iD = this.f8686u.d(viewI);
                    int iD2 = this.f8686u.d(viewI2);
                    if (iD < iD2) {
                        return viewI;
                    }
                    if (iD == iD2) {
                        if ((cVar.f8700e.f8722e - ((c) viewI2.getLayoutParams()).f8700e.f8722e < 0) != (b7 < 0)) {
                            return viewI;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iG = this.f8686u.g(viewI);
                    int iG2 = this.f8686u.g(viewI2);
                    if (iG > iG2) {
                        return viewI;
                    }
                    if (iG != iG2) {
                        continue;
                    }
                }
            }
            i8 += i9;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.z zVar) {
        return W1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean s0() {
        return this.f8673F != 0;
    }

    public void s2() {
        this.f8672E.b();
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.z zVar) {
        return U1(zVar);
    }

    boolean t2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.z zVar) {
        return V1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return W1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i7, RecyclerView.u uVar, RecyclerView.z zVar) {
        return F2(i7, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void x1(int i7) {
        e eVar = this.f8676I;
        if (eVar != null && eVar.f8708m != i7) {
            eVar.a();
        }
        this.f8670C = i7;
        this.f8671D = Integer.MIN_VALUE;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i7, RecyclerView.u uVar, RecyclerView.z zVar) {
        return F2(i7, uVar, zVar);
    }

    void y2(int i7, RecyclerView.z zVar) {
        int iJ2;
        int i8;
        if (i7 > 0) {
            iJ2 = k2();
            i8 = 1;
        } else {
            iJ2 = j2();
            i8 = -1;
        }
        this.f8690y.f8843a = true;
        O2(iJ2, zVar);
        G2(i8);
        androidx.recyclerview.widget.f fVar = this.f8690y;
        fVar.f8845c = iJ2 + fVar.f8846d;
        fVar.f8844b = Math.abs(i7);
    }
}
