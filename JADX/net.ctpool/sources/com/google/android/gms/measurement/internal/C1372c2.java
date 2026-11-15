package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1372c2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Long f15934A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Long f15935B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f15936C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private String f15937D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f15938E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f15939F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f15940G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private String f15941H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private byte[] f15942I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f15943J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f15944K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f15945L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private long f15946M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f15947N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f15948O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private String f15949P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f15950Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private long f15951R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f15952S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S2 f15953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f15954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f15955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f15956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f15957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f15958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f15959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f15960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f15961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f15962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f15963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f15964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f15965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f15966n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f15967o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f15968p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f15969q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Boolean f15970r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f15971s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f15972t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f15973u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f15974v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f15975w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f15976x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f15977y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f15978z;

    C1372c2(S2 s22, String str) {
        Preconditions.checkNotNull(s22);
        Preconditions.checkNotEmpty(str);
        this.f15953a = s22;
        this.f15954b = str;
        s22.f().l();
    }

    public final boolean A() {
        this.f15953a.f().l();
        return this.f15967o;
    }

    public final void A0(long j7) {
        Preconditions.checkArgument(j7 >= 0);
        this.f15953a.f().l();
        this.f15950Q |= this.f15959g != j7;
        this.f15959g = j7;
    }

    public final boolean B() {
        this.f15953a.f().l();
        return this.f15950Q;
    }

    public final long B0() {
        this.f15953a.f().l();
        return this.f15940G;
    }

    public final boolean C() {
        this.f15953a.f().l();
        return this.f15974v;
    }

    public final void C0(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15960h != j7;
        this.f15960h = j7;
    }

    public final boolean D() {
        this.f15953a.f().l();
        return this.f15978z;
    }

    public final long D0() {
        this.f15953a.f().l();
        return this.f15961i;
    }

    public final byte[] E() {
        this.f15953a.f().l();
        return this.f15942I;
    }

    public final void E0(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15976x != j7;
        this.f15976x = j7;
    }

    public final int F() {
        this.f15953a.f().l();
        return this.f15939F;
    }

    public final long F0() {
        this.f15953a.f().l();
        return this.f15959g;
    }

    public final void G(int i7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15939F != i7;
        this.f15939F = i7;
    }

    public final void G0(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15975w != j7;
        this.f15975w = j7;
    }

    public final void H(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15963k != j7;
        this.f15963k = j7;
    }

    public final long H0() {
        this.f15953a.f().l();
        return this.f15960h;
    }

    public final void I(Long l7) {
        this.f15953a.f().l();
        this.f15950Q |= !Objects.equals(this.f15935B, l7);
        this.f15935B = l7;
    }

    public final long I0() {
        this.f15953a.f().l();
        return this.f15976x;
    }

    public final void J(String str) {
        this.f15953a.f().l();
        this.f15950Q |= !Objects.equals(this.f15955c, str);
        this.f15955c = str;
    }

    public final long J0() {
        this.f15953a.f().l();
        return this.f15975w;
    }

    public final void K(boolean z6) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15967o != z6;
        this.f15967o = z6;
    }

    public final Boolean K0() {
        this.f15953a.f().l();
        return this.f15970r;
    }

    public final int L() {
        this.f15953a.f().l();
        return this.f15938E;
    }

    public final Long L0() {
        this.f15953a.f().l();
        return this.f15934A;
    }

    public final void M(int i7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15938E != i7;
        this.f15938E = i7;
    }

    public final Long M0() {
        this.f15953a.f().l();
        return this.f15935B;
    }

    public final void N(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15936C != j7;
        this.f15936C = j7;
    }

    public final void O(String str) {
        this.f15953a.f().l();
        this.f15950Q |= !Objects.equals(this.f15964l, str);
        this.f15964l = str;
    }

    public final void P(boolean z6) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15974v != z6;
        this.f15974v = z6;
    }

    public final long Q() {
        this.f15953a.f().l();
        return 0L;
    }

    public final void R(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15951R != j7;
        this.f15951R = j7;
    }

    public final void S(String str) {
        this.f15953a.f().l();
        this.f15950Q |= !Objects.equals(this.f15962j, str);
        this.f15962j = str;
    }

    public final void T(boolean z6) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15978z != z6;
        this.f15978z = z6;
    }

    public final long U() {
        this.f15953a.f().l();
        return this.f15963k;
    }

    public final void V(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15946M != j7;
        this.f15946M = j7;
    }

    public final void W(String str) {
        this.f15953a.f().l();
        this.f15950Q |= !Objects.equals(this.f15958f, str);
        this.f15958f = str;
    }

    public final long X() {
        this.f15953a.f().l();
        return this.f15936C;
    }

    public final void Y(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15947N != j7;
        this.f15947N = j7;
    }

    public final void Z(String str) {
        this.f15953a.f().l();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f15950Q |= !Objects.equals(this.f15956d, str);
        this.f15956d = str;
    }

    public final int a() {
        this.f15953a.f().l();
        return this.f15977y;
    }

    public final long a0() {
        this.f15953a.f().l();
        return this.f15951R;
    }

    public final void b(int i7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15977y != i7;
        this.f15977y = i7;
    }

    public final void b0(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15945L != j7;
        this.f15945L = j7;
    }

    public final void c(long j7) {
        this.f15953a.f().l();
        long j8 = this.f15959g + j7;
        if (j8 > 2147483647L) {
            this.f15953a.d().J().b("Bundle index overflow. appId", C1449n2.t(this.f15954b));
            j8 = j7 - 1;
        }
        long j9 = this.f15940G + 1;
        if (j9 > 2147483647L) {
            this.f15953a.d().J().b("Delivery index overflow. appId", C1449n2.t(this.f15954b));
            j9 = 0;
        }
        this.f15950Q = true;
        this.f15959g = j8;
        this.f15940G = j9;
    }

    public final void c0(String str) {
        this.f15953a.f().l();
        this.f15950Q |= !Objects.equals(this.f15949P, str);
        this.f15949P = str;
    }

    public final void d(Boolean bool) {
        this.f15953a.f().l();
        this.f15950Q |= !Objects.equals(this.f15970r, bool);
        this.f15970r = bool;
    }

    public final long d0() {
        this.f15953a.f().l();
        return this.f15946M;
    }

    public final void e(Long l7) {
        this.f15953a.f().l();
        this.f15950Q |= !Objects.equals(this.f15934A, l7);
        this.f15934A = l7;
    }

    public final void e0(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15944K != j7;
        this.f15944K = j7;
    }

    public final void f(String str) {
        this.f15953a.f().l();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f15950Q |= !Objects.equals(this.f15969q, str);
        this.f15969q = str;
    }

    public final void f0(String str) {
        this.f15953a.f().l();
        this.f15950Q |= !Objects.equals(this.f15957e, str);
        this.f15957e = str;
    }

    public final void g(List list) {
        this.f15953a.f().l();
        if (Objects.equals(this.f15972t, list)) {
            return;
        }
        this.f15950Q = true;
        this.f15972t = list != null ? new ArrayList(list) : null;
    }

    public final long g0() {
        this.f15953a.f().l();
        return this.f15947N;
    }

    public final void h(boolean z6) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15968p != z6;
        this.f15968p = z6;
    }

    public final void h0(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15948O != j7;
        this.f15948O = j7;
    }

    public final void i(byte[] bArr) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15942I != bArr;
        this.f15942I = bArr;
    }

    public final void i0(String str) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15941H != str;
        this.f15941H = str;
    }

    public final String j() {
        this.f15953a.f().l();
        return this.f15969q;
    }

    public final long j0() {
        this.f15953a.f().l();
        return this.f15945L;
    }

    public final String k() {
        this.f15953a.f().l();
        String str = this.f15949P;
        c0(null);
        return str;
    }

    public final void k0(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15943J != j7;
        this.f15943J = j7;
    }

    public final String l() {
        this.f15953a.f().l();
        return this.f15954b;
    }

    public final void l0(String str) {
        this.f15953a.f().l();
        this.f15950Q |= !Objects.equals(this.f15973u, str);
        this.f15973u = str;
    }

    public final String m() {
        this.f15953a.f().l();
        return this.f15955c;
    }

    public final long m0() {
        this.f15953a.f().l();
        return this.f15944K;
    }

    public final String n() {
        this.f15953a.f().l();
        return this.f15964l;
    }

    public final void n0(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15966n != j7;
        this.f15966n = j7;
    }

    public final String o() {
        this.f15953a.f().l();
        return this.f15962j;
    }

    public final void o0(String str) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15937D != str;
        this.f15937D = str;
    }

    public final String p() {
        this.f15953a.f().l();
        return this.f15958f;
    }

    public final long p0() {
        this.f15953a.f().l();
        return this.f15948O;
    }

    public final String q() {
        this.f15953a.f().l();
        return this.f15956d;
    }

    public final void q0(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15971s != j7;
        this.f15971s = j7;
    }

    public final String r() {
        this.f15953a.f().l();
        return this.f15949P;
    }

    public final long r0() {
        this.f15953a.f().l();
        return this.f15943J;
    }

    public final String s() {
        this.f15953a.f().l();
        return this.f15957e;
    }

    public final void s0(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15952S != j7;
        this.f15952S = j7;
    }

    public final String t() {
        this.f15953a.f().l();
        return this.f15941H;
    }

    public final long t0() {
        this.f15953a.f().l();
        return this.f15966n;
    }

    public final String u() {
        this.f15953a.f().l();
        return this.f15973u;
    }

    public final void u0(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15965m != j7;
        this.f15965m = j7;
    }

    public final String v() {
        this.f15953a.f().l();
        return this.f15937D;
    }

    public final long v0() {
        this.f15953a.f().l();
        return this.f15971s;
    }

    public final List w() {
        this.f15953a.f().l();
        return this.f15972t;
    }

    public final void w0(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15940G != j7;
        this.f15940G = j7;
    }

    public final void x() {
        this.f15953a.f().l();
        this.f15950Q = false;
    }

    public final long x0() {
        this.f15953a.f().l();
        return this.f15952S;
    }

    public final void y() {
        this.f15953a.f().l();
        long j7 = this.f15959g + 1;
        if (j7 > 2147483647L) {
            this.f15953a.d().J().b("Bundle index overflow. appId", C1449n2.t(this.f15954b));
            j7 = 0;
        }
        this.f15950Q = true;
        this.f15959g = j7;
    }

    public final void y0(long j7) {
        this.f15953a.f().l();
        this.f15950Q |= this.f15961i != j7;
        this.f15961i = j7;
    }

    public final boolean z() {
        this.f15953a.f().l();
        return this.f15968p;
    }

    public final long z0() {
        this.f15953a.f().l();
        return this.f15965m;
    }
}
