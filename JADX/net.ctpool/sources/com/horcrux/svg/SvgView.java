package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C0877h;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class SvgView extends com.facebook.react.views.view.i implements com.facebook.react.uimanager.M, com.facebook.react.uimanager.N {
    private String mAlign;
    private Bitmap mBitmap;
    private Canvas mCanvas;
    private Bitmap mCurrentBitmap;
    private final Map<String, C1562a> mDefinedBrushes;
    private final Map<String, VirtualView> mDefinedClipPaths;
    private final Map<String, VirtualView> mDefinedFilters;
    private final Map<String, VirtualView> mDefinedMarkers;
    private final Map<String, VirtualView> mDefinedMasks;
    private final Map<String, VirtualView> mDefinedTemplates;
    final Matrix mInvViewBoxMatrix;
    private boolean mInvertible;
    private int mMeetOrSlice;
    private float mMinX;
    private float mMinY;
    private final Paint mPaint;
    private boolean mRemovalTransitionStarted;
    private boolean mRendered;
    private boolean mResponsible;
    private final float mScale;
    int mTintColor;
    private float mVbHeight;
    private float mVbWidth;
    private SVGLength mbbHeight;
    private SVGLength mbbWidth;
    private Runnable toDataUrlTask;

    public enum Events {
        EVENT_DATA_URL("onDataURL");

        private final String mName;

        Events(String str) {
            this.mName = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mName;
        }
    }

    public SvgView(ReactContext reactContext) {
        super(reactContext);
        this.toDataUrlTask = null;
        this.mResponsible = false;
        this.mDefinedClipPaths = new HashMap();
        this.mDefinedTemplates = new HashMap();
        this.mDefinedMarkers = new HashMap();
        this.mDefinedMasks = new HashMap();
        this.mDefinedFilters = new HashMap();
        this.mDefinedBrushes = new HashMap();
        Paint paint = new Paint();
        this.mPaint = paint;
        this.mInvViewBoxMatrix = new Matrix();
        this.mInvertible = true;
        this.mRendered = false;
        this.mTintColor = 0;
        this.mScale = C0877h.c().density;
        paint.setFlags(385);
        paint.setTypeface(Typeface.DEFAULT);
        setWillNotDraw(false);
    }

    private void clearChildCache() {
        if (this.mRendered) {
            this.mRendered = false;
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).clearChildCache();
                }
            }
        }
    }

    private Bitmap drawOutput() {
        this.mRendered = true;
        float width = getWidth();
        float height = getHeight();
        if (Float.isNaN(width) || Float.isNaN(height) || width < 1.0f || height < 1.0f || Math.log10(width) + Math.log10(height) > 42.0d) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888);
        this.mCurrentBitmap = bitmapCreateBitmap;
        drawChildren(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private RectF getViewBox() {
        float f7 = this.mMinX;
        float f8 = this.mScale;
        float f9 = this.mMinY;
        return new RectF(f7 * f8, f9 * f8, (f7 + this.mVbWidth) * f8, (f9 + this.mVbHeight) * f8);
    }

    private int hitTest(float f7, float f8) {
        if (!this.mResponsible || !this.mInvertible) {
            return getId();
        }
        float[] fArr = {f7, f8};
        this.mInvViewBoxMatrix.mapPoints(fArr);
        int iHitTest = -1;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof VirtualView) {
                iHitTest = ((VirtualView) childAt).hitTest(fArr);
            } else if (childAt instanceof SvgView) {
                iHitTest = ((SvgView) childAt).hitTest(f7, f8);
            }
            if (iHitTest != -1) {
                break;
            }
        }
        return iHitTest == -1 ? getId() : iHitTest;
    }

    void defineBrush(C1562a c1562a, String str) {
        this.mDefinedBrushes.put(str, c1562a);
    }

    void defineClipPath(VirtualView virtualView, String str) {
        this.mDefinedClipPaths.put(str, virtualView);
    }

    void defineFilter(VirtualView virtualView, String str) {
        this.mDefinedFilters.put(str, virtualView);
    }

    void defineMarker(VirtualView virtualView, String str) {
        this.mDefinedMarkers.put(str, virtualView);
    }

    void defineMask(VirtualView virtualView, String str) {
        this.mDefinedMasks.put(str, virtualView);
    }

    void defineTemplate(VirtualView virtualView, String str) {
        this.mDefinedTemplates.put(str, virtualView);
    }

    synchronized void drawChildren(Canvas canvas) {
        try {
            this.mRendered = true;
            this.mCanvas = canvas;
            Matrix matrix = new Matrix();
            if (this.mAlign != null) {
                RectF viewBox = getViewBox();
                float width = canvas.getWidth();
                float height = canvas.getHeight();
                boolean z6 = getParent() instanceof VirtualView;
                if (z6) {
                    width = (float) F.a(this.mbbWidth, width, 0.0d, this.mScale, 12.0d);
                    height = (float) F.a(this.mbbHeight, height, 0.0d, this.mScale, 12.0d);
                }
                RectF rectF = new RectF(0.0f, 0.0f, width, height);
                if (z6) {
                    canvas.clipRect(rectF);
                }
                matrix = j0.a(viewBox, rectF, this.mAlign, this.mMeetOrSlice);
                this.mInvertible = matrix.invert(this.mInvViewBoxMatrix);
                canvas.concat(matrix);
            }
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt2 = getChildAt(i8);
                if (childAt2 instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt2;
                    int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, matrix);
                    virtualView.render(canvas, this.mPaint, 1.0f);
                    virtualView.restoreCanvas(canvas, iSaveAndSetupCanvas);
                    if (virtualView.isResponsible() && !this.mResponsible) {
                        this.mResponsible = true;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    void enableTouchEvents() {
        if (this.mResponsible) {
            return;
        }
        this.mResponsible = true;
    }

    Rect getCanvasBounds() {
        return this.mCanvas.getClipBounds();
    }

    float getCanvasHeight() {
        return this.mCanvas.getHeight();
    }

    float getCanvasWidth() {
        return this.mCanvas.getWidth();
    }

    Matrix getCtm() {
        return this.mCanvas.getMatrix();
    }

    public Bitmap getCurrentBitmap() {
        return this.mCurrentBitmap;
    }

    C1562a getDefinedBrush(String str) {
        return this.mDefinedBrushes.get(str);
    }

    VirtualView getDefinedClipPath(String str) {
        return this.mDefinedClipPaths.get(str);
    }

    VirtualView getDefinedFilter(String str) {
        return this.mDefinedFilters.get(str);
    }

    VirtualView getDefinedMarker(String str) {
        return this.mDefinedMarkers.get(str);
    }

    VirtualView getDefinedMask(String str) {
        return this.mDefinedMasks.get(str);
    }

    VirtualView getDefinedTemplate(String str) {
        return this.mDefinedTemplates.get(str);
    }

    @Override // com.facebook.react.uimanager.N
    public boolean interceptsTouchEvent(float f7, float f8) {
        return true;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            if (this.mRendered) {
                this.mRendered = false;
                ((VirtualView) parent).getSvgView().invalidate();
                return;
            }
            return;
        }
        if (this.mRemovalTransitionStarted) {
            return;
        }
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.mBitmap = null;
    }

    boolean isResponsible() {
        return this.mResponsible;
    }

    boolean notRendered() {
        return !this.mRendered;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.mBitmap = null;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (getParent() instanceof VirtualView) {
            return;
        }
        super.onDraw(canvas);
        if (this.mBitmap == null) {
            this.mBitmap = drawOutput();
        }
        if (this.mBitmap != null) {
            this.mPaint.reset();
            this.mPaint.setFlags(387);
            this.mPaint.setTypeface(Typeface.DEFAULT);
            canvas.drawBitmap(this.mBitmap, 0.0f, 0.0f, this.mPaint);
            Runnable runnable = this.toDataUrlTask;
            if (runnable != null) {
                runnable.run();
                this.toDataUrlTask = null;
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(getGlobalVisibleRect(new Rect()));
        accessibilityNodeInfo.setClassName(getClass().getCanonicalName());
    }

    @Override // com.facebook.react.views.view.i, android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        invalidate();
    }

    @Override // com.facebook.react.uimanager.M
    public int reactTagForTouch(float f7, float f8) {
        return hitTest(f7, f8);
    }

    public void setAlign(String str) {
        this.mAlign = str;
        invalidate();
        clearChildCache();
    }

    public void setBbHeight(Dynamic dynamic) {
        this.mbbHeight = SVGLength.b(dynamic);
        invalidate();
        clearChildCache();
    }

    public void setBbWidth(Dynamic dynamic) {
        this.mbbWidth = SVGLength.b(dynamic);
        invalidate();
        clearChildCache();
    }

    @Override // android.view.View
    public void setId(int i7) {
        super.setId(i7);
        SvgViewManager.setSvgView(i7, this);
    }

    public void setMeetOrSlice(int i7) {
        this.mMeetOrSlice = i7;
        invalidate();
        clearChildCache();
    }

    public void setMinX(float f7) {
        this.mMinX = f7;
        invalidate();
        clearChildCache();
    }

    public void setMinY(float f7) {
        this.mMinY = f7;
        invalidate();
        clearChildCache();
    }

    public void setTintColor(Integer num) {
        this.mTintColor = num != null ? num.intValue() : 0;
        invalidate();
        clearChildCache();
    }

    void setToDataUrlTask(Runnable runnable) {
        this.toDataUrlTask = runnable;
    }

    public void setVbHeight(float f7) {
        this.mVbHeight = f7;
        invalidate();
        clearChildCache();
    }

    public void setVbWidth(float f7) {
        this.mVbWidth = f7;
        invalidate();
        clearChildCache();
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        this.mRemovalTransitionStarted = true;
    }

    String toDataURL() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        clearChildCache();
        drawChildren(new Canvas(bitmapCreateBitmap));
        clearChildCache();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        bitmapCreateBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    String toDataURL(int i7, int i8) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
        clearChildCache();
        drawChildren(new Canvas(bitmapCreateBitmap));
        clearChildCache();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        bitmapCreateBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }
}
