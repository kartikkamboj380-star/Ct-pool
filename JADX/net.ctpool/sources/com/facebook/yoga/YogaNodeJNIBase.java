package com.facebook.yoga;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Q2.a
public abstract class YogaNodeJNIBase extends r implements Cloneable {

    @Q2.a
    private float[] arr;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private YogaNodeJNIBase f13352m;

    @Q2.a
    private int mLayoutDirection;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f13353n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private o f13354o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f13355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected long f13356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Object f13357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f13358s;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13359a;

        static {
            int[] iArr = new int[j.values().length];
            f13359a = iArr;
            try {
                iArr[j.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13359a[j.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13359a[j.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13359a[j.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13359a[j.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13359a[j.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    private void p0(r rVar) {
        q0();
    }

    @Q2.a
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i7) {
        List list = this.f13353n;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i7);
        this.f13353n.add(i7, yogaNodeJNIBase);
        yogaNodeJNIBase.f13352m = this;
        return yogaNodeJNIBase.f13356q;
    }

    private static YogaValue s0(long j7) {
        return new YogaValue(Float.intBitsToFloat((int) j7), (int) (j7 >> 32));
    }

    @Override // com.facebook.yoga.r
    public void A(j jVar, float f7) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f13356q, jVar.j(), f7);
    }

    @Override // com.facebook.yoga.r
    public void B(Object obj) {
        this.f13357r = obj;
    }

    @Override // com.facebook.yoga.r
    public void C(h hVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f13356q, hVar.j());
    }

    @Override // com.facebook.yoga.r
    public void D(i iVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f13356q, iVar.h());
    }

    @Override // com.facebook.yoga.r
    public void E(float f7) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public void F(float f7) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public void G() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f13356q);
    }

    @Override // com.facebook.yoga.r
    public void H(float f7) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public void I(l lVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f13356q, lVar.h());
    }

    @Override // com.facebook.yoga.r
    public void J(float f7) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public void K(float f7) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public void L(m mVar, float f7) {
        YogaNative.jni_YGNodeStyleSetGapJNI(this.f13356q, mVar.h(), f7);
    }

    @Override // com.facebook.yoga.r
    public void M(m mVar, float f7) {
        YogaNative.jni_YGNodeStyleSetGapPercentJNI(this.f13356q, mVar.h(), f7);
    }

    @Override // com.facebook.yoga.r
    public void N(float f7) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public void O() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f13356q);
    }

    @Override // com.facebook.yoga.r
    public void P(float f7) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public void Q(n nVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f13356q, nVar.h());
    }

    @Override // com.facebook.yoga.r
    public void R(j jVar, float f7) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f13356q, jVar.j(), f7);
    }

    @Override // com.facebook.yoga.r
    public void S(j jVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f13356q, jVar.j());
    }

    @Override // com.facebook.yoga.r
    public void T(j jVar, float f7) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f13356q, jVar.j(), f7);
    }

    @Override // com.facebook.yoga.r
    public void U(float f7) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public void V(float f7) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public void W(float f7) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public void X(float f7) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public void Y(o oVar) {
        this.f13354o = oVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f13356q, oVar != null);
    }

    @Override // com.facebook.yoga.r
    public void Z(float f7) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public void a(r rVar, int i7) {
        if (rVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) rVar;
            if (yogaNodeJNIBase.f13352m != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.f13353n == null) {
                this.f13353n = new ArrayList(4);
            }
            this.f13353n.add(i7, yogaNodeJNIBase);
            yogaNodeJNIBase.f13352m = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.f13356q, yogaNodeJNIBase.f13356q, i7);
        }
    }

    @Override // com.facebook.yoga.r
    public void b(float f7, float f8) {
        p0(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i7);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f13353n;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.p0(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i8 = 0; i8 < yogaNodeJNIBaseArr.length; i8++) {
            jArr[i8] = yogaNodeJNIBaseArr[i8].f13356q;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f13356q, f7, f8, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.r
    public void b0(float f7) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f13356q, f7);
    }

    @Q2.a
    public final float baseline(float f7, float f8) {
        return this.f13355p.a(this, f7, f8);
    }

    @Override // com.facebook.yoga.r
    public void c() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f13356q);
    }

    @Override // com.facebook.yoga.r
    public void c0(float f7) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public YogaValue d() {
        return s0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f13356q));
    }

    @Override // com.facebook.yoga.r
    public void d0(float f7) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public h e() {
        float[] fArr = this.arr;
        return h.h(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.r
    public void e0(u uVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f13356q, uVar.h());
    }

    @Override // com.facebook.yoga.r
    public void f0(j jVar, float f7) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f13356q, jVar.j(), f7);
    }

    @Override // com.facebook.yoga.r
    public float g() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void g0(j jVar, float f7) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f13356q, jVar.j(), f7);
    }

    @Override // com.facebook.yoga.r
    public float h(j jVar) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        float f7 = fArr[0];
        if ((((int) f7) & 2) != 2) {
            return 0.0f;
        }
        int i7 = (((int) f7) & 1) != 1 ? 4 : 0;
        int i8 = 10 - i7;
        switch (a.f13359a[jVar.ordinal()]) {
            case 1:
                return this.arr[i8];
            case 2:
                return this.arr[11 - i7];
            case 3:
                return this.arr[12 - i7];
            case 4:
                return this.arr[13 - i7];
            case 5:
                return e() == h.RTL ? this.arr[12 - i7] : this.arr[i8];
            case 6:
                return e() == h.RTL ? this.arr[i8] : this.arr[12 - i7];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.r
    public void h0(j jVar, float f7) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f13356q, jVar.j(), f7);
    }

    @Override // com.facebook.yoga.r
    public float i() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void i0(j jVar, float f7) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f13356q, jVar.j(), f7);
    }

    @Override // com.facebook.yoga.r
    public float j() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void j0(v vVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f13356q, vVar.h());
    }

    @Override // com.facebook.yoga.r
    public float k() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void k0(float f7) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public YogaValue l() {
        return s0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f13356q));
    }

    @Override // com.facebook.yoga.r
    public void l0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f13356q);
    }

    @Override // com.facebook.yoga.r
    public boolean m() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.f13358s;
    }

    @Override // com.facebook.yoga.r
    public void m0(float f7) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f13356q, f7);
    }

    @Q2.a
    public final long measure(float f7, int i7, float f8, int i8) {
        if (q()) {
            return this.f13354o.V(this, f7, p.h(i7), f8, p.h(i8));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.r
    public void o0(x xVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f13356q, xVar.h());
    }

    @Override // com.facebook.yoga.r
    public boolean p() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f13356q);
    }

    @Override // com.facebook.yoga.r
    public boolean q() {
        return this.f13354o != null;
    }

    public Object q0() {
        return this.f13357r;
    }

    @Override // com.facebook.yoga.r
    public void r() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f13358s = false;
    }

    @Override // com.facebook.yoga.r
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase s(int i7) {
        List list = this.f13353n;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) list.remove(i7);
        yogaNodeJNIBase.f13352m = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.f13356q, yogaNodeJNIBase.f13356q);
        return yogaNodeJNIBase;
    }

    @Override // com.facebook.yoga.r
    public void t() {
        this.f13354o = null;
        this.f13355p = null;
        this.f13357r = null;
        this.arr = null;
        this.f13358s = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f13356q);
    }

    @Override // com.facebook.yoga.r
    public void u(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f13356q, aVar.h());
    }

    @Override // com.facebook.yoga.r
    public void v(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f13356q, aVar.h());
    }

    @Override // com.facebook.yoga.r
    public void x(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f13356q, aVar.h());
    }

    @Override // com.facebook.yoga.r
    public void y(float f7) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f13356q, f7);
    }

    @Override // com.facebook.yoga.r
    public void z(b bVar) {
        this.f13355p = bVar;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f13356q, bVar != null);
    }

    private YogaNodeJNIBase(long j7) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f13358s = true;
        if (j7 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f13356q = j7;
    }

    YogaNodeJNIBase(c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((e) cVar).f13377a));
    }
}
