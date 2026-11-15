package com.horcrux.svg;

import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.AbstractC0878h0;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.C0877h;
import com.facebook.react.uimanager.C0895v;
import com.facebook.react.uimanager.C0899z;
import com.facebook.react.uimanager.ViewGroupManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.horcrux.svg.VirtualView;
import java.lang.reflect.Array;
import java.util.Locale;
import x2.InterfaceC2218a;
import x2.InterfaceC2219b;

/* JADX INFO: loaded from: classes.dex */
class VirtualViewManager<V extends VirtualView> extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final double EPSILON = 1.0E-5d;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    protected final String mClassName;
    protected A0 mDelegate;
    protected final SVGClass svgClass;
    private static final c sMatrixDecompositionContext = new c();
    private static final double[] sTransformDecompositionArray = new double[16];
    private static final SparseArray<RenderableView> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    protected enum SVGClass {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGFilter,
        RNSVGFeColorMatrix,
        RNSVGFeGaussianBlur,
        RNSVGFeMerge,
        RNSVGFeOffset,
        RNSVGMarker,
        RNSVGForeignObject
    }

    class a implements ViewGroup.OnHierarchyChangeListener {
        a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view instanceof VirtualView) {
                VirtualViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17873a;

        static {
            int[] iArr = new int[SVGClass.values().length];
            f17873a = iArr;
            try {
                iArr[SVGClass.RNSVGGroup.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17873a[SVGClass.RNSVGPath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17873a[SVGClass.RNSVGCircle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17873a[SVGClass.RNSVGEllipse.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17873a[SVGClass.RNSVGLine.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17873a[SVGClass.RNSVGRect.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17873a[SVGClass.RNSVGText.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17873a[SVGClass.RNSVGTSpan.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17873a[SVGClass.RNSVGTextPath.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17873a[SVGClass.RNSVGImage.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17873a[SVGClass.RNSVGClipPath.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f17873a[SVGClass.RNSVGDefs.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f17873a[SVGClass.RNSVGUse.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f17873a[SVGClass.RNSVGSymbol.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f17873a[SVGClass.RNSVGLinearGradient.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f17873a[SVGClass.RNSVGRadialGradient.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f17873a[SVGClass.RNSVGPattern.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f17873a[SVGClass.RNSVGMask.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f17873a[SVGClass.RNSVGFilter.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f17873a[SVGClass.RNSVGFeColorMatrix.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f17873a[SVGClass.RNSVGFeGaussianBlur.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f17873a[SVGClass.RNSVGFeMerge.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f17873a[SVGClass.RNSVGFeOffset.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f17873a[SVGClass.RNSVGMarker.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f17873a[SVGClass.RNSVGForeignObject.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
        }
    }

    static class c extends C0899z.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final double[] f17874g = new double[4];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final double[] f17875h = new double[3];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final double[] f17876i = new double[3];

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final double[] f17877j = new double[3];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final double[] f17878k = new double[3];

        c() {
        }
    }

    static class d extends C0895v {
        d() {
        }

        @InterfaceC2219b(names = {"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "overflow", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
        public void ignoreLayoutProps(int i7, Dynamic dynamic) {
        }
    }

    protected VirtualViewManager(SVGClass sVGClass) {
        this.svgClass = sVGClass;
        this.mClassName = sVGClass.toString();
    }

    private static void decomposeMatrix() {
        c cVar = sMatrixDecompositionContext;
        double[] dArr = cVar.f17874g;
        double[] dArr2 = cVar.f17875h;
        double[] dArr3 = cVar.f17876i;
        double[] dArr4 = cVar.f17877j;
        double[] dArr5 = cVar.f17878k;
        if (isZero(sTransformDecompositionArray[15])) {
            return;
        }
        double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 4, 4);
        double[] dArr7 = new double[16];
        for (int i7 = 0; i7 < 4; i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                double[] dArr8 = sTransformDecompositionArray;
                int i9 = (i7 * 4) + i8;
                double d7 = dArr8[i9] / dArr8[15];
                dArr6[i7][i8] = d7;
                if (i8 == 3) {
                    d7 = 0.0d;
                }
                dArr7[i9] = d7;
            }
        }
        dArr7[15] = 1.0d;
        if (isZero(C0899z.m(dArr7))) {
            return;
        }
        if (isZero(dArr6[0][3]) && isZero(dArr6[1][3]) && isZero(dArr6[2][3])) {
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[0] = 0.0d;
            dArr[3] = 1.0d;
        } else {
            C0899z.q(new double[]{dArr6[0][3], dArr6[1][3], dArr6[2][3], dArr6[3][3]}, C0899z.t(C0899z.n(dArr7)), dArr);
        }
        System.arraycopy(dArr6[3], 0, dArr4, 0, 3);
        double[][] dArr9 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 3, 3);
        for (int i10 = 0; i10 < 3; i10++) {
            double[] dArr10 = dArr9[i10];
            double[] dArr11 = dArr6[i10];
            dArr10[0] = dArr11[0];
            dArr10[1] = dArr11[1];
            dArr10[2] = dArr11[2];
        }
        double dX = C0899z.x(dArr9[0]);
        dArr2[0] = dX;
        double[] dArrY = C0899z.y(dArr9[0], dX);
        dArr9[0] = dArrY;
        double dW = C0899z.w(dArrY, dArr9[1]);
        dArr3[0] = dW;
        double[] dArrU = C0899z.u(dArr9[1], dArr9[0], 1.0d, -dW);
        dArr9[1] = dArrU;
        double dW2 = C0899z.w(dArr9[0], dArrU);
        dArr3[0] = dW2;
        double[] dArrU2 = C0899z.u(dArr9[1], dArr9[0], 1.0d, -dW2);
        dArr9[1] = dArrU2;
        double dX2 = C0899z.x(dArrU2);
        dArr2[1] = dX2;
        dArr9[1] = C0899z.y(dArr9[1], dX2);
        dArr3[0] = dArr3[0] / dArr2[1];
        double dW3 = C0899z.w(dArr9[0], dArr9[2]);
        dArr3[1] = dW3;
        double[] dArrU3 = C0899z.u(dArr9[2], dArr9[0], 1.0d, -dW3);
        dArr9[2] = dArrU3;
        double dW4 = C0899z.w(dArr9[1], dArrU3);
        dArr3[2] = dW4;
        double[] dArrU4 = C0899z.u(dArr9[2], dArr9[1], 1.0d, -dW4);
        dArr9[2] = dArrU4;
        double dX3 = C0899z.x(dArrU4);
        dArr2[2] = dX3;
        double[] dArrY2 = C0899z.y(dArr9[2], dX3);
        dArr9[2] = dArrY2;
        double d8 = dArr3[1];
        double d9 = dArr2[2];
        dArr3[1] = d8 / d9;
        dArr3[2] = dArr3[2] / d9;
        if (C0899z.w(dArr9[0], C0899z.v(dArr9[1], dArrY2)) < 0.0d) {
            for (int i11 = 0; i11 < 3; i11++) {
                dArr2[i11] = dArr2[i11] * (-1.0d);
                double[] dArr12 = dArr9[i11];
                dArr12[0] = dArr12[0] * (-1.0d);
                dArr12[1] = dArr12[1] * (-1.0d);
                dArr12[2] = dArr12[2] * (-1.0d);
            }
        }
        double[] dArr13 = dArr9[2];
        dArr5[0] = C0899z.s((-Math.atan2(dArr13[1], dArr13[2])) * 57.29577951308232d);
        double[] dArr14 = dArr9[2];
        double d10 = -dArr14[0];
        double d11 = dArr14[1];
        double d12 = dArr14[2];
        dArr5[1] = C0899z.s((-Math.atan2(d10, Math.sqrt((d11 * d11) + (d12 * d12)))) * 57.29577951308232d);
        dArr5[2] = C0899z.s((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
    }

    static RenderableView getRenderableViewByTag(int i7) {
        return mTagToRenderableView.get(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateSvgView(V v6) {
        SvgView svgView = v6.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (v6 instanceof h0) {
            ((h0) v6).G().clearChildCache();
        }
    }

    private static boolean isZero(double d7) {
        return !Double.isNaN(d7) && Math.abs(d7) < EPSILON;
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    static void runWhenViewIsAvailable(int i7, Runnable runnable) {
        mTagToRunnable.put(i7, runnable);
    }

    static void setRenderableView(int i7, RenderableView renderableView) {
        mTagToRenderableView.put(i7, renderableView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i7);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i7);
        }
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        AbstractC0878h0.d(readableArray, sTransformDecompositionArray);
        decomposeMatrix();
        c cVar = sMatrixDecompositionContext;
        view.setTranslationX(com.facebook.react.uimanager.G.d((float) cVar.f17877j[0]));
        view.setTranslationY(com.facebook.react.uimanager.G.d((float) cVar.f17877j[1]));
        view.setRotation((float) cVar.f17878k[2]);
        view.setRotationX((float) cVar.f17878k[0]);
        view.setRotationY((float) cVar.f17878k[1]);
        view.setScaleX((float) cVar.f17875h[0]);
        view.setScaleY((float) cVar.f17875h[1]);
        double[] dArr = cVar.f17874g;
        if (dArr.length > 2) {
            float f7 = (float) dArr[2];
            if (f7 == 0.0f) {
                f7 = 7.8125E-4f;
            }
            float f8 = (-1.0f) / f7;
            float f9 = C0877h.c().density;
            view.setCameraDistance(f9 * f9 * f8 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public C0895v createShadowNodeInstance() {
        return new d();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected A0 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends C0895v> getShadowNodeClass() {
        return d.class;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.InterfaceC0891q
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @InterfaceC2218a(name = "clipPath")
    public void setClipPath(V v6, String str) {
        v6.setClipPath(str);
    }

    @InterfaceC2218a(name = "clipRule")
    public void setClipRule(V v6, int i7) {
        v6.setClipRule(i7);
    }

    @InterfaceC2218a(name = "display")
    public void setDisplay(V v6, String str) {
        v6.setDisplay(str);
    }

    @InterfaceC2218a(name = "markerEnd")
    public void setMarkerEnd(V v6, String str) {
        v6.setMarkerEnd(str);
    }

    @InterfaceC2218a(name = "markerMid")
    public void setMarkerMid(V v6, String str) {
        v6.setMarkerMid(str);
    }

    @InterfaceC2218a(name = "markerStart")
    public void setMarkerStart(V v6, String str) {
        v6.setMarkerStart(str);
    }

    @InterfaceC2218a(name = "mask")
    public void setMask(V v6, String str) {
        v6.setMask(str);
    }

    @InterfaceC2218a(name = "matrix")
    public void setMatrix(V v6, Dynamic dynamic) {
        v6.setMatrix(dynamic);
    }

    @InterfaceC2218a(name = "name")
    public void setName(V v6, String str) {
        v6.setName(str);
    }

    @InterfaceC2218a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(V v6, float f7) {
        v6.setOpacity(f7);
    }

    @InterfaceC2218a(name = "pointerEvents")
    public void setPointerEvents(V v6, String str) {
        v6.setPointerEvents(str == null ? com.facebook.react.uimanager.H.f12293q : com.facebook.react.uimanager.H.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
    }

    @InterfaceC2218a(name = "responsible")
    public void setResponsible(V v6, boolean z6) {
        v6.setResponsible(z6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(C0872e0 c0872e0, VirtualView virtualView) {
        super.addEventEmitters(c0872e0, virtualView);
        virtualView.setOnHierarchyChangeListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public VirtualView createViewInstance(C0872e0 c0872e0) {
        switch (b.f17873a[this.svgClass.ordinal()]) {
            case 1:
                return new C1582u(c0872e0);
            case 2:
                return new C(c0872e0);
            case 3:
                return new C1563b(c0872e0);
            case 4:
                return new C1568g(c0872e0);
            case 5:
                return new C1584w(c0872e0);
            case 6:
                return new J(c0872e0);
            case 7:
                return new h0(c0872e0);
            case 8:
                return new U(c0872e0);
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                return new V(c0872e0);
            case 10:
                return new C1583v(c0872e0);
            case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                return new C1564c(c0872e0);
            case 12:
                return new C1566e(c0872e0);
            case 13:
                return new i0(c0872e0);
            case 14:
                return new L(c0872e0);
            case 15:
                return new C1585x(c0872e0);
            case 16:
                return new I(c0872e0);
            case 17:
                return new D(c0872e0);
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                return new C1587z(c0872e0);
            case 19:
                return new C1577p(c0872e0);
            case 20:
                return new C1569h(c0872e0);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new C1570i(c0872e0);
            case 22:
                return new C1571j(c0872e0);
            case ConnectionResult.API_DISABLED /* 23 */:
                return new C1572k(c0872e0);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return new C1586y(c0872e0);
            case 25:
                return new C1579r(c0872e0);
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(VirtualView virtualView) {
        super.onAfterUpdateTransaction(virtualView);
        invalidateSvgView(virtualView);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(VirtualView virtualView) {
        super.onDropViewInstance(virtualView);
        mTagToRenderableView.remove(virtualView.getId());
    }

    public void setMatrix(V v6, ReadableArray readableArray) {
        v6.setMatrix(readableArray);
    }

    @InterfaceC2218a(name = "transform")
    public void setTransform(V v6, Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Array) {
            return;
        }
        setTransform((VirtualView) v6, dynamic.asArray());
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.InterfaceC0875g
    public void setTransform(VirtualView virtualView, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(virtualView);
        } else {
            setTransformProperty(virtualView, readableArray);
        }
        Matrix matrix = virtualView.getMatrix();
        virtualView.mTransform = matrix;
        virtualView.mTransformInvertible = matrix.invert(virtualView.mInvTransform);
    }
}
