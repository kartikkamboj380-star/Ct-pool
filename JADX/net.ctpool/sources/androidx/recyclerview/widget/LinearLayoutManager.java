package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f8427A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f8428B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f8429C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    d f8430D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final a f8431E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final b f8432F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f8433G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int[] f8434H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f8435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private c f8436t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    i f8437u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f8438v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f8439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f8440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f8441y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f8442z;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f8443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f8446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f8447e;

        a() {
            e();
        }

        void a() {
            this.f8445c = this.f8446d ? this.f8443a.i() : this.f8443a.m();
        }

        public void b(View view, int i7) {
            this.f8445c = this.f8446d ? this.f8443a.d(view) + this.f8443a.o() : this.f8443a.g(view);
            this.f8444b = i7;
        }

        public void c(View view, int i7) {
            int iO = this.f8443a.o();
            if (iO >= 0) {
                b(view, i7);
                return;
            }
            this.f8444b = i7;
            if (this.f8446d) {
                int i8 = (this.f8443a.i() - iO) - this.f8443a.d(view);
                this.f8445c = this.f8443a.i() - i8;
                if (i8 > 0) {
                    int iE = this.f8445c - this.f8443a.e(view);
                    int iM = this.f8443a.m();
                    int iMin = iE - (iM + Math.min(this.f8443a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f8445c += Math.min(i8, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f8443a.g(view);
            int iM2 = iG - this.f8443a.m();
            this.f8445c = iG;
            if (iM2 > 0) {
                int i9 = (this.f8443a.i() - Math.min(0, (this.f8443a.i() - iO) - this.f8443a.d(view))) - (iG + this.f8443a.e(view));
                if (i9 < 0) {
                    this.f8445c -= Math.min(iM2, -i9);
                }
            }
        }

        boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < zVar.b();
        }

        void e() {
            this.f8444b = -1;
            this.f8445c = Integer.MIN_VALUE;
            this.f8446d = false;
            this.f8447e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f8444b + ", mCoordinate=" + this.f8445c + ", mLayoutFromEnd=" + this.f8446d + ", mValid=" + this.f8447e + '}';
        }
    }

    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f8451d;

        protected b() {
        }

        void a() {
            this.f8448a = 0;
            this.f8449b = false;
            this.f8450c = false;
            this.f8451d = false;
        }
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f8453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f8455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f8456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f8457f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f8458g;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f8462k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f8464m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f8452a = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f8459h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f8460i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f8461j = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        List f8463l = null;

        c() {
        }

        private View e() {
            int size = this.f8463l.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = ((RecyclerView.C) this.f8463l.get(i7)).f8556a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.f8455d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            this.f8455d = viewF == null ? -1 : ((RecyclerView.p) viewF.getLayoutParams()).a();
        }

        boolean c(RecyclerView.z zVar) {
            int i7 = this.f8455d;
            return i7 >= 0 && i7 < zVar.b();
        }

        View d(RecyclerView.u uVar) {
            if (this.f8463l != null) {
                return e();
            }
            View viewO = uVar.o(this.f8455d);
            this.f8455d += this.f8456e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.f8463l.size();
            View view2 = null;
            int i7 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i8 = 0; i8 < size; i8++) {
                View view3 = ((RecyclerView.C) this.f8463l.get(i8)).f8556a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (iA = (pVar.a() - this.f8455d) * this.f8456e) >= 0 && iA < i7) {
                    view2 = view3;
                    if (iA == 0) {
                        break;
                    }
                    i7 = iA;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f8465m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8466n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f8467o;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i7) {
                return new d[i7];
            }
        }

        public d() {
        }

        boolean a() {
            return this.f8465m >= 0;
        }

        void b() {
            this.f8465m = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f8465m);
            parcel.writeInt(this.f8466n);
            parcel.writeInt(this.f8467o ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f8465m = parcel.readInt();
            this.f8466n = parcel.readInt();
            this.f8467o = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f8465m = dVar.f8465m;
            this.f8466n = dVar.f8466n;
            this.f8467o = dVar.f8467o;
        }
    }

    public LinearLayoutManager(Context context, int i7, boolean z6) {
        this.f8435s = 1;
        this.f8439w = false;
        this.f8440x = false;
        this.f8441y = false;
        this.f8442z = true;
        this.f8427A = -1;
        this.f8428B = Integer.MIN_VALUE;
        this.f8430D = null;
        this.f8431E = new a();
        this.f8432F = new b();
        this.f8433G = 2;
        this.f8434H = new int[2];
        C2(i7);
        D2(z6);
    }

    private void A2() {
        this.f8440x = (this.f8435s == 1 || !q2()) ? this.f8439w : !this.f8439w;
    }

    private boolean F2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (J() == 0) {
            return false;
        }
        View viewV = V();
        if (viewV != null && aVar.d(viewV, zVar)) {
            aVar.c(viewV, h0(viewV));
            return true;
        }
        if (this.f8438v != this.f8441y) {
            return false;
        }
        View viewI2 = aVar.f8446d ? i2(uVar, zVar) : j2(uVar, zVar);
        if (viewI2 == null) {
            return false;
        }
        aVar.b(viewI2, h0(viewI2));
        if (!zVar.e() && L1() && (this.f8437u.g(viewI2) >= this.f8437u.i() || this.f8437u.d(viewI2) < this.f8437u.m())) {
            aVar.f8445c = aVar.f8446d ? this.f8437u.i() : this.f8437u.m();
        }
        return true;
    }

    private boolean G2(RecyclerView.z zVar, a aVar) {
        int i7;
        if (!zVar.e() && (i7 = this.f8427A) != -1) {
            if (i7 >= 0 && i7 < zVar.b()) {
                aVar.f8444b = this.f8427A;
                d dVar = this.f8430D;
                if (dVar != null && dVar.a()) {
                    boolean z6 = this.f8430D.f8467o;
                    aVar.f8446d = z6;
                    aVar.f8445c = z6 ? this.f8437u.i() - this.f8430D.f8466n : this.f8437u.m() + this.f8430D.f8466n;
                    return true;
                }
                if (this.f8428B != Integer.MIN_VALUE) {
                    boolean z7 = this.f8440x;
                    aVar.f8446d = z7;
                    aVar.f8445c = z7 ? this.f8437u.i() - this.f8428B : this.f8437u.m() + this.f8428B;
                    return true;
                }
                View viewC = C(this.f8427A);
                if (viewC == null) {
                    if (J() > 0) {
                        aVar.f8446d = (this.f8427A < h0(I(0))) == this.f8440x;
                    }
                    aVar.a();
                } else {
                    if (this.f8437u.e(viewC) > this.f8437u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f8437u.g(viewC) - this.f8437u.m() < 0) {
                        aVar.f8445c = this.f8437u.m();
                        aVar.f8446d = false;
                        return true;
                    }
                    if (this.f8437u.i() - this.f8437u.d(viewC) < 0) {
                        aVar.f8445c = this.f8437u.i();
                        aVar.f8446d = true;
                        return true;
                    }
                    aVar.f8445c = aVar.f8446d ? this.f8437u.d(viewC) + this.f8437u.o() : this.f8437u.g(viewC);
                }
                return true;
            }
            this.f8427A = -1;
            this.f8428B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void H2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (G2(zVar, aVar) || F2(uVar, zVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.f8444b = this.f8441y ? zVar.b() - 1 : 0;
    }

    private void I2(int i7, int i8, boolean z6, RecyclerView.z zVar) {
        int iM;
        this.f8436t.f8464m = z2();
        this.f8436t.f8457f = i7;
        int[] iArr = this.f8434H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(zVar, iArr);
        int iMax = Math.max(0, this.f8434H[0]);
        int iMax2 = Math.max(0, this.f8434H[1]);
        boolean z7 = i7 == 1;
        c cVar = this.f8436t;
        int i9 = z7 ? iMax2 : iMax;
        cVar.f8459h = i9;
        if (!z7) {
            iMax = iMax2;
        }
        cVar.f8460i = iMax;
        if (z7) {
            cVar.f8459h = i9 + this.f8437u.j();
            View viewM2 = m2();
            c cVar2 = this.f8436t;
            cVar2.f8456e = this.f8440x ? -1 : 1;
            int iH0 = h0(viewM2);
            c cVar3 = this.f8436t;
            cVar2.f8455d = iH0 + cVar3.f8456e;
            cVar3.f8453b = this.f8437u.d(viewM2);
            iM = this.f8437u.d(viewM2) - this.f8437u.i();
        } else {
            View viewN2 = n2();
            this.f8436t.f8459h += this.f8437u.m();
            c cVar4 = this.f8436t;
            cVar4.f8456e = this.f8440x ? 1 : -1;
            int iH02 = h0(viewN2);
            c cVar5 = this.f8436t;
            cVar4.f8455d = iH02 + cVar5.f8456e;
            cVar5.f8453b = this.f8437u.g(viewN2);
            iM = (-this.f8437u.g(viewN2)) + this.f8437u.m();
        }
        c cVar6 = this.f8436t;
        cVar6.f8454c = i8;
        if (z6) {
            cVar6.f8454c = i8 - iM;
        }
        cVar6.f8458g = iM;
    }

    private void J2(int i7, int i8) {
        this.f8436t.f8454c = this.f8437u.i() - i8;
        c cVar = this.f8436t;
        cVar.f8456e = this.f8440x ? -1 : 1;
        cVar.f8455d = i7;
        cVar.f8457f = 1;
        cVar.f8453b = i8;
        cVar.f8458g = Integer.MIN_VALUE;
    }

    private void K2(a aVar) {
        J2(aVar.f8444b, aVar.f8445c);
    }

    private void L2(int i7, int i8) {
        this.f8436t.f8454c = i8 - this.f8437u.m();
        c cVar = this.f8436t;
        cVar.f8455d = i7;
        cVar.f8456e = this.f8440x ? 1 : -1;
        cVar.f8457f = -1;
        cVar.f8453b = i8;
        cVar.f8458g = Integer.MIN_VALUE;
    }

    private void M2(a aVar) {
        L2(aVar.f8444b, aVar.f8445c);
    }

    private int O1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return m.a(zVar, this.f8437u, Y1(!this.f8442z, true), X1(!this.f8442z, true), this, this.f8442z);
    }

    private int P1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return m.b(zVar, this.f8437u, Y1(!this.f8442z, true), X1(!this.f8442z, true), this, this.f8442z, this.f8440x);
    }

    private int Q1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return m.c(zVar, this.f8437u, Y1(!this.f8442z, true), X1(!this.f8442z, true), this, this.f8442z);
    }

    private View V1() {
        return d2(0, J());
    }

    private View W1(RecyclerView.u uVar, RecyclerView.z zVar) {
        return h2(uVar, zVar, 0, J(), zVar.b());
    }

    private View a2() {
        return d2(J() - 1, -1);
    }

    private View b2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return h2(uVar, zVar, J() - 1, -1, zVar.b());
    }

    private View f2() {
        return this.f8440x ? V1() : a2();
    }

    private View g2() {
        return this.f8440x ? a2() : V1();
    }

    private View i2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f8440x ? W1(uVar, zVar) : b2(uVar, zVar);
    }

    private View j2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f8440x ? b2(uVar, zVar) : W1(uVar, zVar);
    }

    private int k2(int i7, RecyclerView.u uVar, RecyclerView.z zVar, boolean z6) {
        int i8;
        int i9 = this.f8437u.i() - i7;
        if (i9 <= 0) {
            return 0;
        }
        int i10 = -B2(-i9, uVar, zVar);
        int i11 = i7 + i10;
        if (!z6 || (i8 = this.f8437u.i() - i11) <= 0) {
            return i10;
        }
        this.f8437u.r(i8);
        return i8 + i10;
    }

    private int l2(int i7, RecyclerView.u uVar, RecyclerView.z zVar, boolean z6) {
        int iM;
        int iM2 = i7 - this.f8437u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i8 = -B2(iM2, uVar, zVar);
        int i9 = i7 + i8;
        if (!z6 || (iM = i9 - this.f8437u.m()) <= 0) {
            return i8;
        }
        this.f8437u.r(-iM);
        return i8 - iM;
    }

    private View m2() {
        return I(this.f8440x ? 0 : J() - 1);
    }

    private View n2() {
        return I(this.f8440x ? J() - 1 : 0);
    }

    private void t2(RecyclerView.u uVar, RecyclerView.z zVar, int i7, int i8) {
        if (!zVar.g() || J() == 0 || zVar.e() || !L1()) {
            return;
        }
        List listK = uVar.k();
        int size = listK.size();
        int iH0 = h0(I(0));
        int iE = 0;
        int iE2 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView.C c7 = (RecyclerView.C) listK.get(i9);
            if (!c7.v()) {
                if ((c7.m() < iH0) != this.f8440x) {
                    iE += this.f8437u.e(c7.f8556a);
                } else {
                    iE2 += this.f8437u.e(c7.f8556a);
                }
            }
        }
        this.f8436t.f8463l = listK;
        if (iE > 0) {
            L2(h0(n2()), i7);
            c cVar = this.f8436t;
            cVar.f8459h = iE;
            cVar.f8454c = 0;
            cVar.a();
            U1(uVar, this.f8436t, zVar, false);
        }
        if (iE2 > 0) {
            J2(h0(m2()), i8);
            c cVar2 = this.f8436t;
            cVar2.f8459h = iE2;
            cVar2.f8454c = 0;
            cVar2.a();
            U1(uVar, this.f8436t, zVar, false);
        }
        this.f8436t.f8463l = null;
    }

    private void v2(RecyclerView.u uVar, c cVar) {
        if (!cVar.f8452a || cVar.f8464m) {
            return;
        }
        int i7 = cVar.f8458g;
        int i8 = cVar.f8460i;
        if (cVar.f8457f == -1) {
            x2(uVar, i7, i8);
        } else {
            y2(uVar, i7, i8);
        }
    }

    private void w2(RecyclerView.u uVar, int i7, int i8) {
        if (i7 == i8) {
            return;
        }
        if (i8 <= i7) {
            while (i7 > i8) {
                n1(i7, uVar);
                i7--;
            }
        } else {
            for (int i9 = i8 - 1; i9 >= i7; i9--) {
                n1(i9, uVar);
            }
        }
    }

    private void x2(RecyclerView.u uVar, int i7, int i8) {
        int iJ = J();
        if (i7 < 0) {
            return;
        }
        int iH = (this.f8437u.h() - i7) + i8;
        if (this.f8440x) {
            for (int i9 = 0; i9 < iJ; i9++) {
                View viewI = I(i9);
                if (this.f8437u.g(viewI) < iH || this.f8437u.q(viewI) < iH) {
                    w2(uVar, 0, i9);
                    return;
                }
            }
            return;
        }
        int i10 = iJ - 1;
        for (int i11 = i10; i11 >= 0; i11--) {
            View viewI2 = I(i11);
            if (this.f8437u.g(viewI2) < iH || this.f8437u.q(viewI2) < iH) {
                w2(uVar, i10, i11);
                return;
            }
        }
    }

    private void y2(RecyclerView.u uVar, int i7, int i8) {
        if (i7 < 0) {
            return;
        }
        int i9 = i7 - i8;
        int iJ = J();
        if (!this.f8440x) {
            for (int i10 = 0; i10 < iJ; i10++) {
                View viewI = I(i10);
                if (this.f8437u.d(viewI) > i9 || this.f8437u.p(viewI) > i9) {
                    w2(uVar, 0, i10);
                    return;
                }
            }
            return;
        }
        int i11 = iJ - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            View viewI2 = I(i12);
            if (this.f8437u.d(viewI2) > i9 || this.f8437u.p(viewI2) > i9) {
                w2(uVar, i11, i12);
                return;
            }
        }
    }

    int B2(int i7, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (J() == 0 || i7 == 0) {
            return 0;
        }
        T1();
        this.f8436t.f8452a = true;
        int i8 = i7 > 0 ? 1 : -1;
        int iAbs = Math.abs(i7);
        I2(i8, iAbs, true, zVar);
        c cVar = this.f8436t;
        int iU1 = cVar.f8458g + U1(uVar, cVar, zVar, false);
        if (iU1 < 0) {
            return 0;
        }
        if (iAbs > iU1) {
            i7 = i8 * iU1;
        }
        this.f8437u.r(-i7);
        this.f8436t.f8462k = i7;
        return i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View C(int i7) {
        int iJ = J();
        if (iJ == 0) {
            return null;
        }
        int iH0 = i7 - h0(I(0));
        if (iH0 >= 0 && iH0 < iJ) {
            View viewI = I(iH0);
            if (h0(viewI) == i7) {
                return viewI;
            }
        }
        return super.C(i7);
    }

    public void C2(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i7);
        }
        g(null);
        if (i7 != this.f8435s || this.f8437u == null) {
            i iVarB = i.b(this, i7);
            this.f8437u = iVarB;
            this.f8431E.f8443a = iVarB;
            this.f8435s = i7;
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return new RecyclerView.p(-2, -2);
    }

    public void D2(boolean z6) {
        g(null);
        if (z6 == this.f8439w) {
            return;
        }
        this.f8439w = z6;
        t1();
    }

    public void E2(boolean z6) {
        g(null);
        if (this.f8441y == z6) {
            return;
        }
        this.f8441y = z6;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean G1() {
        return (X() == 1073741824 || p0() == 1073741824 || !q0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.I0(recyclerView, uVar);
        if (this.f8429C) {
            k1(uVar);
            uVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I1(RecyclerView recyclerView, RecyclerView.z zVar, int i7) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i7);
        J1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J0(View view, int i7, RecyclerView.u uVar, RecyclerView.z zVar) {
        int iR1;
        A2();
        if (J() == 0 || (iR1 = R1(i7)) == Integer.MIN_VALUE) {
            return null;
        }
        T1();
        I2(iR1, (int) (this.f8437u.n() * 0.33333334f), false, zVar);
        c cVar = this.f8436t;
        cVar.f8458g = Integer.MIN_VALUE;
        cVar.f8452a = false;
        U1(uVar, cVar, zVar, true);
        View viewG2 = iR1 == -1 ? g2() : f2();
        View viewN2 = iR1 == -1 ? n2() : m2();
        if (!viewN2.hasFocusable()) {
            return viewG2;
        }
        if (viewG2 == null) {
            return null;
        }
        return viewN2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(Z1());
            accessibilityEvent.setToIndex(c2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.f8430D == null && this.f8438v == this.f8441y;
    }

    protected void M1(RecyclerView.z zVar, int[] iArr) {
        int i7;
        int iO2 = o2(zVar);
        if (this.f8436t.f8457f == -1) {
            i7 = 0;
        } else {
            i7 = iO2;
            iO2 = 0;
        }
        iArr[0] = iO2;
        iArr[1] = i7;
    }

    void N1(RecyclerView.z zVar, c cVar, RecyclerView.o.c cVar2) {
        int i7 = cVar.f8455d;
        if (i7 < 0 || i7 >= zVar.b()) {
            return;
        }
        cVar2.a(i7, Math.max(0, cVar.f8458g));
    }

    int R1(int i7) {
        return i7 != 1 ? i7 != 2 ? i7 != 17 ? i7 != 33 ? i7 != 66 ? (i7 == 130 && this.f8435s == 1) ? 1 : Integer.MIN_VALUE : this.f8435s == 0 ? 1 : Integer.MIN_VALUE : this.f8435s == 1 ? -1 : Integer.MIN_VALUE : this.f8435s == 0 ? -1 : Integer.MIN_VALUE : (this.f8435s != 1 && q2()) ? -1 : 1 : (this.f8435s != 1 && q2()) ? 1 : -1;
    }

    c S1() {
        return new c();
    }

    void T1() {
        if (this.f8436t == null) {
            this.f8436t = S1();
        }
    }

    int U1(RecyclerView.u uVar, c cVar, RecyclerView.z zVar, boolean z6) {
        int i7 = cVar.f8454c;
        int i8 = cVar.f8458g;
        if (i8 != Integer.MIN_VALUE) {
            if (i7 < 0) {
                cVar.f8458g = i8 + i7;
            }
            v2(uVar, cVar);
        }
        int i9 = cVar.f8454c + cVar.f8459h;
        b bVar = this.f8432F;
        while (true) {
            if ((!cVar.f8464m && i9 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            s2(uVar, zVar, cVar, bVar);
            if (!bVar.f8449b) {
                cVar.f8453b += bVar.f8448a * cVar.f8457f;
                if (!bVar.f8450c || cVar.f8463l != null || !zVar.e()) {
                    int i10 = cVar.f8454c;
                    int i11 = bVar.f8448a;
                    cVar.f8454c = i10 - i11;
                    i9 -= i11;
                }
                int i12 = cVar.f8458g;
                if (i12 != Integer.MIN_VALUE) {
                    int i13 = i12 + bVar.f8448a;
                    cVar.f8458g = i13;
                    int i14 = cVar.f8454c;
                    if (i14 < 0) {
                        cVar.f8458g = i13 + i14;
                    }
                    v2(uVar, cVar);
                }
                if (z6 && bVar.f8451d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i7 - cVar.f8454c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.u uVar, RecyclerView.z zVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        int iK2;
        int i11;
        View viewC;
        int iG;
        int i12;
        int i13 = -1;
        if (!(this.f8430D == null && this.f8427A == -1) && zVar.b() == 0) {
            k1(uVar);
            return;
        }
        d dVar = this.f8430D;
        if (dVar != null && dVar.a()) {
            this.f8427A = this.f8430D.f8465m;
        }
        T1();
        this.f8436t.f8452a = false;
        A2();
        View viewV = V();
        a aVar = this.f8431E;
        if (!aVar.f8447e || this.f8427A != -1 || this.f8430D != null) {
            aVar.e();
            a aVar2 = this.f8431E;
            aVar2.f8446d = this.f8440x ^ this.f8441y;
            H2(uVar, zVar, aVar2);
            this.f8431E.f8447e = true;
        } else if (viewV != null && (this.f8437u.g(viewV) >= this.f8437u.i() || this.f8437u.d(viewV) <= this.f8437u.m())) {
            this.f8431E.c(viewV, h0(viewV));
        }
        c cVar = this.f8436t;
        cVar.f8457f = cVar.f8462k >= 0 ? 1 : -1;
        int[] iArr = this.f8434H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(zVar, iArr);
        int iMax = Math.max(0, this.f8434H[0]) + this.f8437u.m();
        int iMax2 = Math.max(0, this.f8434H[1]) + this.f8437u.j();
        if (zVar.e() && (i11 = this.f8427A) != -1 && this.f8428B != Integer.MIN_VALUE && (viewC = C(i11)) != null) {
            if (this.f8440x) {
                i12 = this.f8437u.i() - this.f8437u.d(viewC);
                iG = this.f8428B;
            } else {
                iG = this.f8437u.g(viewC) - this.f8437u.m();
                i12 = this.f8428B;
            }
            int i14 = i12 - iG;
            if (i14 > 0) {
                iMax += i14;
            } else {
                iMax2 -= i14;
            }
        }
        a aVar3 = this.f8431E;
        if (!aVar3.f8446d ? !this.f8440x : this.f8440x) {
            i13 = 1;
        }
        u2(uVar, zVar, aVar3, i13);
        w(uVar);
        this.f8436t.f8464m = z2();
        this.f8436t.f8461j = zVar.e();
        this.f8436t.f8460i = 0;
        a aVar4 = this.f8431E;
        if (aVar4.f8446d) {
            M2(aVar4);
            c cVar2 = this.f8436t;
            cVar2.f8459h = iMax;
            U1(uVar, cVar2, zVar, false);
            c cVar3 = this.f8436t;
            i8 = cVar3.f8453b;
            int i15 = cVar3.f8455d;
            int i16 = cVar3.f8454c;
            if (i16 > 0) {
                iMax2 += i16;
            }
            K2(this.f8431E);
            c cVar4 = this.f8436t;
            cVar4.f8459h = iMax2;
            cVar4.f8455d += cVar4.f8456e;
            U1(uVar, cVar4, zVar, false);
            c cVar5 = this.f8436t;
            i7 = cVar5.f8453b;
            int i17 = cVar5.f8454c;
            if (i17 > 0) {
                L2(i15, i8);
                c cVar6 = this.f8436t;
                cVar6.f8459h = i17;
                U1(uVar, cVar6, zVar, false);
                i8 = this.f8436t.f8453b;
            }
        } else {
            K2(aVar4);
            c cVar7 = this.f8436t;
            cVar7.f8459h = iMax2;
            U1(uVar, cVar7, zVar, false);
            c cVar8 = this.f8436t;
            i7 = cVar8.f8453b;
            int i18 = cVar8.f8455d;
            int i19 = cVar8.f8454c;
            if (i19 > 0) {
                iMax += i19;
            }
            M2(this.f8431E);
            c cVar9 = this.f8436t;
            cVar9.f8459h = iMax;
            cVar9.f8455d += cVar9.f8456e;
            U1(uVar, cVar9, zVar, false);
            c cVar10 = this.f8436t;
            i8 = cVar10.f8453b;
            int i20 = cVar10.f8454c;
            if (i20 > 0) {
                J2(i18, i7);
                c cVar11 = this.f8436t;
                cVar11.f8459h = i20;
                U1(uVar, cVar11, zVar, false);
                i7 = this.f8436t.f8453b;
            }
        }
        if (J() > 0) {
            if (this.f8440x ^ this.f8441y) {
                int iK22 = k2(i7, uVar, zVar, true);
                i9 = i8 + iK22;
                i10 = i7 + iK22;
                iK2 = l2(i9, uVar, zVar, false);
            } else {
                int iL2 = l2(i8, uVar, zVar, true);
                i9 = i8 + iL2;
                i10 = i7 + iL2;
                iK2 = k2(i10, uVar, zVar, false);
            }
            i8 = i9 + iK2;
            i7 = i10 + iK2;
        }
        t2(uVar, zVar, i8, i7);
        if (zVar.e()) {
            this.f8431E.e();
        } else {
            this.f8437u.s();
        }
        this.f8438v = this.f8441y;
    }

    View X1(boolean z6, boolean z7) {
        int iJ;
        int iJ2;
        if (this.f8440x) {
            iJ = 0;
            iJ2 = J();
        } else {
            iJ = J() - 1;
            iJ2 = -1;
        }
        return e2(iJ, iJ2, z6, z7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.f8430D = null;
        this.f8427A = -1;
        this.f8428B = Integer.MIN_VALUE;
        this.f8431E.e();
    }

    View Y1(boolean z6, boolean z7) {
        int iJ;
        int iJ2;
        if (this.f8440x) {
            iJ = J() - 1;
            iJ2 = -1;
        } else {
            iJ = 0;
            iJ2 = J();
        }
        return e2(iJ, iJ2, z6, z7);
    }

    public int Z1() {
        View viewE2 = e2(0, J(), false, true);
        if (viewE2 == null) {
            return -1;
        }
        return h0(viewE2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF a(int i7) {
        if (J() == 0) {
            return null;
        }
        int i8 = (i7 < h0(I(0))) != this.f8440x ? -1 : 1;
        return this.f8435s == 0 ? new PointF(i8, 0.0f) : new PointF(0.0f, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.f8430D = (d) parcelable;
            t1();
        }
    }

    public int c2() {
        View viewE2 = e2(J() - 1, -1, false, true);
        if (viewE2 == null) {
            return -1;
        }
        return h0(viewE2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable d1() {
        if (this.f8430D != null) {
            return new d(this.f8430D);
        }
        d dVar = new d();
        if (J() > 0) {
            T1();
            boolean z6 = this.f8438v ^ this.f8440x;
            dVar.f8467o = z6;
            if (z6) {
                View viewM2 = m2();
                dVar.f8466n = this.f8437u.i() - this.f8437u.d(viewM2);
                dVar.f8465m = h0(viewM2);
            } else {
                View viewN2 = n2();
                dVar.f8465m = h0(viewN2);
                dVar.f8466n = this.f8437u.g(viewN2) - this.f8437u.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    View d2(int i7, int i8) {
        int i9;
        int i10;
        T1();
        if (i8 <= i7 && i8 >= i7) {
            return I(i7);
        }
        if (this.f8437u.g(I(i7)) < this.f8437u.m()) {
            i9 = 16644;
            i10 = 16388;
        } else {
            i9 = 4161;
            i10 = 4097;
        }
        return (this.f8435s == 0 ? this.f8596e : this.f8597f).a(i7, i8, i9, i10);
    }

    View e2(int i7, int i8, boolean z6, boolean z7) {
        T1();
        return (this.f8435s == 0 ? this.f8596e : this.f8597f).a(i7, i8, z6 ? 24579 : 320, z7 ? 320 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(String str) {
        if (this.f8430D == null) {
            super.g(str);
        }
    }

    View h2(RecyclerView.u uVar, RecyclerView.z zVar, int i7, int i8, int i9) {
        T1();
        int iM = this.f8437u.m();
        int i10 = this.f8437u.i();
        int i11 = i8 > i7 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i7 != i8) {
            View viewI = I(i7);
            int iH0 = h0(viewI);
            if (iH0 >= 0 && iH0 < i9) {
                if (((RecyclerView.p) viewI.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewI;
                    }
                } else {
                    if (this.f8437u.g(viewI) < i10 && this.f8437u.d(viewI) >= iM) {
                        return viewI;
                    }
                    if (view == null) {
                        view = viewI;
                    }
                }
            }
            i7 += i11;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.f8435s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l() {
        return this.f8435s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o(int i7, int i8, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        if (this.f8435s != 0) {
            i7 = i8;
        }
        if (J() == 0 || i7 == 0) {
            return;
        }
        T1();
        I2(i7 > 0 ? 1 : -1, Math.abs(i7), true, zVar);
        N1(zVar, this.f8436t, cVar);
    }

    protected int o2(RecyclerView.z zVar) {
        if (zVar.d()) {
            return this.f8437u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p(int i7, RecyclerView.o.c cVar) {
        boolean z6;
        int i8;
        d dVar = this.f8430D;
        if (dVar == null || !dVar.a()) {
            A2();
            z6 = this.f8440x;
            i8 = this.f8427A;
            if (i8 == -1) {
                i8 = z6 ? i7 - 1 : 0;
            }
        } else {
            d dVar2 = this.f8430D;
            z6 = dVar2.f8467o;
            i8 = dVar2.f8465m;
        }
        int i9 = z6 ? -1 : 1;
        for (int i10 = 0; i10 < this.f8433G && i8 >= 0 && i8 < i7; i10++) {
            cVar.a(i8, 0);
            i8 += i9;
        }
    }

    public int p2() {
        return this.f8435s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.z zVar) {
        return O1(zVar);
    }

    protected boolean q2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.z zVar) {
        return P1(zVar);
    }

    public boolean r2() {
        return this.f8442z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.z zVar) {
        return Q1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean s0() {
        return true;
    }

    void s2(RecyclerView.u uVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i7;
        int i8;
        int i9;
        int iE0;
        int iF;
        View viewD = cVar.d(uVar);
        if (viewD == null) {
            bVar.f8449b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) viewD.getLayoutParams();
        if (cVar.f8463l == null) {
            if (this.f8440x == (cVar.f8457f == -1)) {
                d(viewD);
            } else {
                e(viewD, 0);
            }
        } else {
            if (this.f8440x == (cVar.f8457f == -1)) {
                b(viewD);
            } else {
                c(viewD, 0);
            }
        }
        A0(viewD, 0, 0);
        bVar.f8448a = this.f8437u.e(viewD);
        if (this.f8435s == 1) {
            if (q2()) {
                iF = o0() - f0();
                iE0 = iF - this.f8437u.f(viewD);
            } else {
                iE0 = e0();
                iF = this.f8437u.f(viewD) + iE0;
            }
            int i10 = cVar.f8457f;
            int i11 = cVar.f8453b;
            if (i10 == -1) {
                i9 = i11;
                i8 = iF;
                i7 = i11 - bVar.f8448a;
            } else {
                i7 = i11;
                i8 = iF;
                i9 = bVar.f8448a + i11;
            }
        } else {
            int iG0 = g0();
            int iF2 = this.f8437u.f(viewD) + iG0;
            int i12 = cVar.f8457f;
            int i13 = cVar.f8453b;
            if (i12 == -1) {
                i8 = i13;
                i7 = iG0;
                i9 = iF2;
                iE0 = i13 - bVar.f8448a;
            } else {
                i7 = iG0;
                i8 = bVar.f8448a + i13;
                i9 = iF2;
                iE0 = i13;
            }
        }
        z0(viewD, iE0, i7, i8, i9);
        if (pVar.c() || pVar.b()) {
            bVar.f8450c = true;
        }
        bVar.f8451d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.z zVar) {
        return O1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.z zVar) {
        return P1(zVar);
    }

    void u2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar, int i7) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return Q1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i7, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f8435s == 1) {
            return 0;
        }
        return B2(i7, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void x1(int i7) {
        this.f8427A = i7;
        this.f8428B = Integer.MIN_VALUE;
        d dVar = this.f8430D;
        if (dVar != null) {
            dVar.b();
        }
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i7, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f8435s == 0) {
            return 0;
        }
        return B2(i7, uVar, zVar);
    }

    boolean z2() {
        return this.f8437u.k() == 0 && this.f8437u.h() == 0;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        this.f8435s = 1;
        this.f8439w = false;
        this.f8440x = false;
        this.f8441y = false;
        this.f8442z = true;
        this.f8427A = -1;
        this.f8428B = Integer.MIN_VALUE;
        this.f8430D = null;
        this.f8431E = new a();
        this.f8432F = new b();
        this.f8433G = 2;
        this.f8434H = new int[2];
        RecyclerView.o.d dVarI0 = RecyclerView.o.i0(context, attributeSet, i7, i8);
        C2(dVarI0.f8612a);
        D2(dVarI0.f8614c);
        E2(dVarI0.f8615d);
    }
}
