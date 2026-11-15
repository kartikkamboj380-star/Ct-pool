package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.horcrux.svg.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1582u extends RenderableView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ReadableMap f18097m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C1580s f18098n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Bitmap f18099o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Canvas f18100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Paint f18101q;

    public C1582u(ReactContext reactContext) {
        super(reactContext);
        this.f18101q = new Paint(1);
    }

    private static Object x(Object obj) {
        obj.getClass();
        return obj;
    }

    void A(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Matrix matrix2 = this.mTransform;
        if (matrix2 != null) {
            matrix2.mapRect(rectF);
        }
        this.f18098n = new C1580s(this.mScale, rectF.width(), rectF.height());
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f7) {
        A(canvas);
        clip(canvas, paint);
        q(canvas, paint, f7);
        renderMarkers(canvas, paint, f7);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        ((VirtualView) this).mPath = new Path();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (!(childAt instanceof C1587z) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                ((VirtualView) this).mPath.addPath(virtualView.getPath(canvas, paint), virtualView.mMatrix);
            }
        }
        return ((VirtualView) this).mPath;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    int hitTest(float[] fArr) {
        int iReactTagForTouch;
        VirtualView virtualView;
        int iHitTest;
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int iRound = Math.round(fArr2[0]);
            int iRound2 = Math.round(fArr2[1]);
            Path clipPath = getClipPath();
            if (clipPath != null) {
                if (this.mClipRegionPath != clipPath) {
                    this.mClipRegionPath = clipPath;
                    RectF rectF = new RectF();
                    this.mClipBounds = rectF;
                    clipPath.computeBounds(rectF, true);
                    this.mClipRegion = getRegion(clipPath, this.mClipBounds);
                }
                if (!this.mClipRegion.contains(iRound, iRound2)) {
                    return -1;
                }
            }
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof VirtualView) {
                    if (!(childAt instanceof C1587z) && (iHitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                        return (virtualView.isResponsible() || iHitTest != childAt.getId()) ? iHitTest : getId();
                    }
                } else if ((childAt instanceof SvgView) && (iReactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                    return iReactTagForTouch;
                }
            }
        }
        return -1;
    }

    void q(Canvas canvas, Paint paint, float f7) {
        w();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        if (this.mOpacity != 1.0f) {
            Bitmap bitmap = this.f18099o;
            if (bitmap == null) {
                this.f18099o = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f18100p = new Canvas(this.f18099o);
            } else {
                bitmap.recycle();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f18099o = bitmapCreateBitmap;
                this.f18100p.setBitmap(bitmapCreateBitmap);
            }
            this.f18100p.save();
            this.f18100p.setMatrix(canvas.getMatrix());
        } else {
            this.f18100p = canvas;
        }
        this.elements = new ArrayList<>();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (!(childAt instanceof C1587z)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z6 = virtualView instanceof RenderableView;
                        if (z6) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(this.f18100p, this.mCTM);
                        virtualView.render(this.f18100p, paint, f7);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(this.f18100p, iSaveAndSetupCanvas);
                        if (z6) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                        ArrayList<A> arrayList = virtualView.elements;
                        if (arrayList != null) {
                            this.elements.addAll(arrayList);
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                }
            }
        }
        if (this.mOpacity != 1.0f) {
            this.f18100p.restore();
            int iSave = canvas.save();
            canvas.setMatrix(null);
            this.f18101q.setAlpha((int) (this.mOpacity * 255.0f));
            canvas.drawBitmap(this.f18099o, 0.0f, 0.0f, this.f18101q);
            canvas.restoreToCount(iSave);
        }
        setClientRect(rectF);
        v();
    }

    void r(Canvas canvas, Paint paint, float f7) {
        super.draw(canvas, paint, f7);
    }

    @Override // com.horcrux.svg.RenderableView
    void resetProperties() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    C1580s s() {
        return this.f18098n;
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    Path t(Canvas canvas, Paint paint, Region.Op op) {
        Path path = new Path();
        Path.Op opValueOf = Path.Op.valueOf(op.name());
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (!(childAt instanceof C1587z) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path pathT = virtualView instanceof C1582u ? ((C1582u) virtualView).t(canvas, paint, op) : virtualView.getPath(canvas, paint);
                pathT.transform(matrix);
                path.op(pathT, opValueOf);
            }
        }
        return path;
    }

    C1580s u() {
        return ((C1582u) x(getTextRoot())).s();
    }

    void v() {
        u().n();
    }

    void w() {
        u().o(this, this.f18097m);
    }

    public void y(Dynamic dynamic) {
        this.f18097m = dynamic.getType() == ReadableType.Map ? dynamic.asMap() : null;
        invalidate();
    }

    public void z(ReadableMap readableMap) {
        this.f18097m = readableMap;
        invalidate();
    }
}
