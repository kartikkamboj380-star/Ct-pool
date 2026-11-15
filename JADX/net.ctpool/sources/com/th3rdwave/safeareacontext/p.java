package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C0895v;
import com.facebook.react.uimanager.D;
import com.facebook.react.uimanager.G;
import com.facebook.react.uimanager.K0;
import x2.InterfaceC2219b;

/* JADX INFO: loaded from: classes.dex */
public final class p extends C0895v {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private n f18623A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final float[] f18624B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final float[] f18625C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f18626D;

    public p() {
        int[] iArr = K0.f12438c;
        this.f18624B = new float[iArr.length];
        this.f18625C = new float[iArr.length];
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f18624B[i7] = Float.NaN;
            this.f18625C[i7] = Float.NaN;
        }
    }

    private final float x1(l lVar, float f7, float f8) {
        return lVar == l.f18607m ? f8 : lVar == l.f18609o ? Math.max(f7, f8) : f7 + f8;
    }

    private final void y1(o oVar) {
        if (oVar == o.f18619m) {
            super.a1(1, this.f18624B[1]);
            super.a1(2, this.f18624B[1]);
            super.a1(3, this.f18624B[3]);
            super.a1(0, this.f18624B[0]);
        } else {
            super.V0(1, this.f18625C[1]);
            super.V0(2, this.f18625C[1]);
            super.V0(3, this.f18625C[3]);
            super.V0(0, this.f18625C[0]);
        }
        y0();
    }

    private final void z1() {
        n nVar = this.f18623A;
        if (nVar == null) {
            return;
        }
        o oVarC = nVar.c();
        o oVar = o.f18619m;
        float[] fArr = oVarC == oVar ? this.f18624B : this.f18625C;
        float f7 = fArr[8];
        if (Float.isNaN(f7)) {
            f7 = 0.0f;
        }
        float f8 = f7;
        float f9 = f8;
        float f10 = f9;
        float f11 = fArr[7];
        if (!Float.isNaN(f11)) {
            f7 = f11;
            f9 = f7;
        }
        float f12 = fArr[6];
        if (!Float.isNaN(f12)) {
            f8 = f12;
            f10 = f8;
        }
        float f13 = fArr[1];
        if (!Float.isNaN(f13)) {
            f7 = f13;
        }
        float f14 = fArr[2];
        if (!Float.isNaN(f14)) {
            f8 = f14;
        }
        float f15 = fArr[3];
        if (!Float.isNaN(f15)) {
            f9 = f15;
        }
        float f16 = fArr[0];
        if (!Float.isNaN(f16)) {
            f10 = f16;
        }
        float fD = G.d(f7);
        float fD2 = G.d(f8);
        float fD3 = G.d(f9);
        float fD4 = G.d(f10);
        m mVarA = nVar.a();
        a aVarB = nVar.b();
        if (nVar.c() == oVar) {
            super.a1(1, x1(mVarA.d(), aVarB.d(), fD));
            super.a1(2, x1(mVarA.c(), aVarB.c(), fD2));
            super.a1(3, x1(mVarA.a(), aVarB.a(), fD3));
            super.a1(0, x1(mVarA.b(), aVarB.b(), fD4));
            return;
        }
        super.V0(1, x1(mVarA.d(), aVarB.d(), fD));
        super.V0(2, x1(mVarA.c(), aVarB.c(), fD2));
        super.V0(3, x1(mVarA.a(), aVarB.a(), fD3));
        super.V0(0, x1(mVarA.b(), aVarB.b(), fD4));
    }

    @Override // com.facebook.react.uimanager.V, com.facebook.react.uimanager.U
    public void F(Object obj) {
        w5.k.f(obj, "data");
        if (obj instanceof n) {
            n nVar = this.f18623A;
            if (nVar != null && nVar.c() != ((n) obj).c()) {
                y1(nVar.c());
            }
            this.f18623A = (n) obj;
            this.f18626D = false;
            z1();
        }
    }

    @Override // com.facebook.react.uimanager.V, com.facebook.react.uimanager.U
    public void W(D d7) {
        w5.k.f(d7, "nativeViewHierarchyOptimizer");
        if (this.f18626D) {
            this.f18626D = false;
            z1();
        }
    }

    @Override // com.facebook.react.uimanager.C0895v
    @InterfaceC2219b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i7, Dynamic dynamic) {
        w5.k.f(dynamic, "margin");
        this.f18625C[K0.f12438c[i7]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setMargins(i7, dynamic);
        this.f18626D = true;
    }

    @Override // com.facebook.react.uimanager.C0895v
    @InterfaceC2219b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i7, Dynamic dynamic) {
        w5.k.f(dynamic, "padding");
        this.f18624B[K0.f12438c[i7]] = dynamic.getType() == ReadableType.Number ? (float) dynamic.asDouble() : Float.NaN;
        super.setPaddings(i7, dynamic);
        this.f18626D = true;
    }
}
