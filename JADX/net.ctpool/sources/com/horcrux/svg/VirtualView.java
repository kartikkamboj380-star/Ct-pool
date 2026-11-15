package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.C0877h;
import com.horcrux.svg.SVGLength;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public abstract class VirtualView extends com.facebook.react.views.view.i {
    private static final int CLIP_RULE_EVENODD = 0;
    static final int CLIP_RULE_NONZERO = 1;
    private static final double M_SQRT1_2l = 0.7071067811865476d;
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private double canvasDiagonal;
    private float canvasHeight;
    private float canvasWidth;
    ArrayList<A> elements;
    private double fontSize;
    private C1580s glyphContext;
    RectF mBox;
    Matrix mCTM;
    boolean mCTMInvertible;
    private Path mCachedClipPath;
    private RectF mClientRect;
    RectF mClipBounds;
    private String mClipPath;
    Region mClipRegion;
    Path mClipRegionPath;
    int mClipRule;
    final ReactContext mContext;
    String mDisplay;
    RectF mFillBounds;
    Path mFillPath;
    Matrix mInvCTM;
    Matrix mInvMatrix;
    final Matrix mInvTransform;
    boolean mInvertible;
    RectF mMarkerBounds;
    String mMarkerEnd;
    String mMarkerMid;
    Path mMarkerPath;
    Region mMarkerRegion;
    String mMarkerStart;
    String mMask;
    Matrix mMatrix;
    String mName;
    float mOpacity;
    Path mPath;
    com.facebook.react.uimanager.H mPointerEvents;
    Region mRegion;
    private boolean mResponsible;
    final float mScale;
    RectF mStrokeBounds;
    Path mStrokePath;
    Region mStrokeRegion;
    private C1582u mTextRoot;
    Matrix mTransform;
    boolean mTransformInvertible;
    private SvgView svgView;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17871a;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            f17871a = iArr;
            try {
                iArr[SVGLength.UnitType.EMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17871a[SVGLength.UnitType.EXS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17871a[SVGLength.UnitType.CM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17871a[SVGLength.UnitType.MM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17871a[SVGLength.UnitType.IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17871a[SVGLength.UnitType.PT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17871a[SVGLength.UnitType.PC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    VirtualView(ReactContext reactContext) {
        super(reactContext);
        this.mOpacity = 1.0f;
        this.mCTM = new Matrix();
        this.mMatrix = new Matrix();
        this.mTransform = new Matrix();
        this.mInvCTM = new Matrix();
        this.mInvMatrix = new Matrix();
        this.mInvTransform = new Matrix();
        this.mInvertible = true;
        this.mCTMInvertible = true;
        this.mTransformInvertible = true;
        this.fontSize = -1.0d;
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.mContext = reactContext;
        this.mScale = C0877h.c().density;
    }

    private void clearParentCache() {
        VirtualView virtualView = this;
        while (true) {
            ViewParent parent = virtualView.getParent();
            if (!(parent instanceof VirtualView)) {
                return;
            }
            virtualView = (VirtualView) parent;
            if (virtualView.mPath == null) {
                return;
            } else {
                virtualView.clearCache();
            }
        }
    }

    private double fromRelativeFast(SVGLength sVGLength) {
        double fontSizeFromContext;
        switch (a.f17871a[sVGLength.f17819b.ordinal()]) {
            case 1:
                fontSizeFromContext = getFontSizeFromContext();
                break;
            case 2:
                fontSizeFromContext = getFontSizeFromContext() / 2.0d;
                break;
            case 3:
                fontSizeFromContext = 35.43307d;
                break;
            case 4:
                fontSizeFromContext = 3.543307d;
                break;
            case 5:
                fontSizeFromContext = 90.0d;
                break;
            case 6:
                fontSizeFromContext = 1.25d;
                break;
            case 7:
                fontSizeFromContext = 15.0d;
                break;
            default:
                fontSizeFromContext = 1.0d;
                break;
        }
        return sVGLength.f17818a * fontSizeFromContext * ((double) this.mScale);
    }

    private double getCanvasDiagonal() {
        double d7 = this.canvasDiagonal;
        if (d7 != -1.0d) {
            return d7;
        }
        double dSqrt = Math.sqrt(Math.pow(getCanvasWidth(), 2.0d) + Math.pow(getCanvasHeight(), 2.0d)) * M_SQRT1_2l;
        this.canvasDiagonal = dSqrt;
        return dSqrt;
    }

    private float getCanvasHeight() {
        float f7 = this.canvasHeight;
        if (f7 != -1.0f) {
            return f7;
        }
        C1582u textRoot = getTextRoot();
        this.canvasHeight = textRoot == null ? getSvgView().getCanvasBounds().height() : textRoot.s().d();
        return this.canvasHeight;
    }

    private float getCanvasWidth() {
        float f7 = this.canvasWidth;
        if (f7 != -1.0f) {
            return f7;
        }
        C1582u textRoot = getTextRoot();
        this.canvasWidth = textRoot == null ? getSvgView().getCanvasBounds().width() : textRoot.s().g();
        return this.canvasWidth;
    }

    private double getFontSizeFromContext() {
        double d7 = this.fontSize;
        if (d7 != -1.0d) {
            return d7;
        }
        C1582u textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.glyphContext == null) {
            this.glyphContext = textRoot.s();
        }
        double dC = this.glyphContext.c();
        this.fontSize = dC;
        return dC;
    }

    void clearCache() {
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.fontSize = -1.0d;
        this.mStrokeRegion = null;
        this.mMarkerRegion = null;
        this.mRegion = null;
        this.mPath = null;
    }

    void clearChildCache() {
        clearCache();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).clearChildCache();
            }
        }
    }

    void clip(Canvas canvas, Paint paint) {
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
    }

    abstract void draw(Canvas canvas, Paint paint, float f7);

    RectF getClientRect() {
        return this.mClientRect;
    }

    Path getClipPath() {
        return this.mCachedClipPath;
    }

    C1582u getParentTextRoot() {
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((VirtualView) parent).getTextRoot();
        }
        return null;
    }

    abstract Path getPath(Canvas canvas, Paint paint);

    SvgView getSvgView() {
        SvgView svgView;
        SvgView svgView2 = this.svgView;
        if (svgView2 != null) {
            return svgView2;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof SvgView) {
            svgView = (SvgView) parent;
        } else {
            if (!(parent instanceof VirtualView)) {
                P0.a.j("ReactNative", "RNSVG: " + getClass().getName() + " should be descendant of a SvgView.");
                return this.svgView;
            }
            svgView = ((VirtualView) parent).getSvgView();
        }
        this.svgView = svgView;
        return this.svgView;
    }

    C1582u getTextRoot() {
        if (this.mTextRoot == null) {
            VirtualView virtualView = this;
            while (true) {
                if (virtualView == null) {
                    break;
                }
                if (virtualView instanceof C1582u) {
                    C1582u c1582u = (C1582u) virtualView;
                    if (c1582u.s() != null) {
                        this.mTextRoot = c1582u;
                        break;
                    }
                }
                ViewParent parent = virtualView.getParent();
                virtualView = !(parent instanceof VirtualView) ? null : (VirtualView) parent;
            }
        }
        return this.mTextRoot;
    }

    abstract int hitTest(float[] fArr);

    @Override // android.view.View
    public void invalidate() {
        if ((this instanceof RenderableView) && this.mPath == null) {
            return;
        }
        clearCache();
        clearParentCache();
        super.invalidate();
    }

    boolean isResponsible() {
        return this.mResponsible;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.mClientRect != null) {
            SvgView svgView = getSvgView();
            int[] iArr = new int[2];
            getSvgView().getLocationOnScreen(iArr);
            Rect rect = new Rect();
            boolean z6 = false;
            rect.left = iArr[0] + ((int) Math.floor(this.mClientRect.left));
            rect.top = iArr[1] + ((int) Math.floor(this.mClientRect.top));
            rect.right = rect.left + ((int) Math.ceil(this.mClientRect.width()));
            rect.bottom = rect.top + ((int) Math.ceil(this.mClientRect.height()));
            Rect rect2 = new Rect();
            if (svgView.getGlobalVisibleRect(rect2) && rect.intersect(rect2)) {
                z6 = true;
            }
            String canonicalName = getClass().getCanonicalName();
            accessibilityNodeInfo.setBoundsInScreen(rect);
            accessibilityNodeInfo.setClassName(canonicalName);
            accessibilityNodeInfo.setVisibleToUser(z6);
        }
    }

    @Override // com.facebook.react.views.view.i, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        if (this.mClientRect == null) {
            return;
        }
        if (!(this instanceof C1582u)) {
            int iFloor = (int) Math.floor(r1.left);
            int iFloor2 = (int) Math.floor(this.mClientRect.top);
            int iCeil = (int) Math.ceil(this.mClientRect.right);
            int iCeil2 = (int) Math.ceil(this.mClientRect.bottom);
            setLeft(iFloor);
            setTop(iFloor2);
            setRight(iCeil);
            setBottom(iCeil2);
        }
        setMeasuredDimension((int) Math.ceil(this.mClientRect.width()), (int) Math.ceil(this.mClientRect.height()));
    }

    @Override // com.facebook.react.views.view.i, android.view.View
    protected void onMeasure(int i7, int i8) {
        setMeasuredDimension(this.mClientRect != null ? (int) Math.ceil(r0.width()) : View.getDefaultSize(getSuggestedMinimumWidth(), i7), this.mClientRect != null ? (int) Math.ceil(r0.height()) : View.getDefaultSize(getSuggestedMinimumHeight(), i8));
    }

    double relativeOn(SVGLength sVGLength, float f7) {
        SVGLength.UnitType unitType = sVGLength.f17819b;
        return unitType == SVGLength.UnitType.NUMBER ? sVGLength.f17818a * ((double) this.mScale) : unitType == SVGLength.UnitType.PERCENTAGE ? (sVGLength.f17818a / 100.0d) * ((double) f7) : fromRelativeFast(sVGLength);
    }

    double relativeOnFraction(SVGLength sVGLength, float f7) {
        double d7;
        SVGLength.UnitType unitType = sVGLength.f17819b;
        if (unitType == SVGLength.UnitType.NUMBER) {
            d7 = sVGLength.f17818a;
        } else {
            if (unitType != SVGLength.UnitType.PERCENTAGE) {
                return fromRelativeFast(sVGLength);
            }
            d7 = sVGLength.f17818a / 100.0d;
        }
        return d7 * ((double) f7);
    }

    double relativeOnHeight(SVGLength sVGLength) {
        return relativeOn(sVGLength, getCanvasHeight());
    }

    double relativeOnOther(SVGLength sVGLength) {
        return relativeOn(sVGLength, (float) getCanvasDiagonal());
    }

    double relativeOnWidth(SVGLength sVGLength) {
        return relativeOn(sVGLength, getCanvasWidth());
    }

    void render(Canvas canvas, Paint paint, float f7) {
        draw(canvas, paint, f7);
    }

    void restoreCanvas(Canvas canvas, int i7) {
        canvas.restoreToCount(i7);
    }

    int saveAndSetupCanvas(Canvas canvas, Matrix matrix) {
        int iSave = canvas.save();
        this.mCTM.setConcat(this.mMatrix, this.mTransform);
        canvas.concat(this.mCTM);
        this.mCTM.preConcat(matrix);
        this.mCTMInvertible = this.mCTM.invert(this.mInvCTM);
        return iSave;
    }

    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
    }

    void setClientRect(RectF rectF) {
        RectF rectF2 = this.mClientRect;
        if (rectF2 == null || !rectF2.equals(rectF)) {
            this.mClientRect = rectF;
            if (rectF == null) {
                return;
            }
            int iCeil = (int) Math.ceil(rectF.width());
            int iCeil2 = (int) Math.ceil(this.mClientRect.height());
            int iFloor = (int) Math.floor(this.mClientRect.left);
            int iFloor2 = (int) Math.floor(this.mClientRect.top);
            int iCeil3 = (int) Math.ceil(this.mClientRect.right);
            int iCeil4 = (int) Math.ceil(this.mClientRect.bottom);
            setMeasuredDimension(iCeil, iCeil2);
            if (!(this instanceof C1582u)) {
                setLeft(iFloor);
                setTop(iFloor2);
                setRight(iCeil3);
                setBottom(iCeil4);
            }
            com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c(this.mContext, getId());
            if (eVarC != null) {
                eVarC.c(com.facebook.react.uimanager.F.b(getId(), iFloor, iFloor2, iCeil, iCeil2));
            }
        }
    }

    public void setClipPath(String str) {
        this.mCachedClipPath = null;
        this.mClipPath = str;
        invalidate();
    }

    public void setClipRule(int i7) {
        this.mClipRule = i7;
        invalidate();
    }

    public void setDisplay(String str) {
        this.mDisplay = str;
        invalidate();
    }

    public void setMarkerEnd(String str) {
        this.mMarkerEnd = str;
        invalidate();
    }

    public void setMarkerMid(String str) {
        this.mMarkerMid = str;
        invalidate();
    }

    public void setMarkerStart(String str) {
        this.mMarkerStart = str;
        invalidate();
    }

    public void setMask(String str) {
        this.mMask = str;
        invalidate();
    }

    public void setMatrix(Dynamic dynamic) {
        setMatrix((dynamic.isNull() || !dynamic.getType().equals(ReadableType.Array)) ? null : dynamic.asArray());
    }

    public void setName(String str) {
        this.mName = str;
        invalidate();
    }

    public void setOpacity(float f7) {
        this.mOpacity = f7;
        invalidate();
    }

    void setPointerEvents(com.facebook.react.uimanager.H h7) {
        this.mPointerEvents = h7;
    }

    public void setResponsible(boolean z6) {
        this.mResponsible = z6;
        invalidate();
    }

    Path getClipPath(Canvas canvas, Paint paint) {
        if (this.mClipPath != null) {
            C1564c c1564c = (C1564c) getSvgView().getDefinedClipPath(this.mClipPath);
            if (c1564c != null) {
                Path path = this.mClipRule == 0 ? c1564c.getPath(canvas, paint) : c1564c.t(canvas, paint, Region.Op.UNION);
                path.transform(c1564c.mMatrix);
                path.transform(c1564c.mTransform);
                int i7 = this.mClipRule;
                if (i7 == 0) {
                    path.setFillType(Path.FillType.EVEN_ODD);
                } else if (i7 != 1) {
                    P0.a.G("ReactNative", "RNSVG: clipRule: " + this.mClipRule + " unrecognized");
                }
                this.mCachedClipPath = path;
            } else {
                P0.a.G("ReactNative", "RNSVG: Undefined clipPath: " + this.mClipPath);
            }
        }
        return getClipPath();
    }

    public void setMatrix(ReadableArray readableArray) {
        boolean zInvert;
        if (readableArray != null) {
            float[] fArr = sRawMatrix;
            int iC = F.c(readableArray, fArr, this.mScale);
            if (iC != 6) {
                if (iC != -1) {
                    P0.a.G("ReactNative", "RNSVG: Transform matrices must be of size 6");
                }
                super.invalidate();
                clearParentCache();
            }
            if (this.mMatrix == null) {
                this.mMatrix = new Matrix();
                this.mInvMatrix = new Matrix();
            }
            this.mMatrix.setValues(fArr);
            zInvert = this.mMatrix.invert(this.mInvMatrix);
        } else {
            this.mMatrix.reset();
            this.mInvMatrix.reset();
            zInvert = true;
        }
        this.mInvertible = zInvert;
        super.invalidate();
        clearParentCache();
    }
}
