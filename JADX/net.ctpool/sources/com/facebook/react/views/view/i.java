package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.inputmethodservice.ExtractEditText;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.Animation;
import androidx.appcompat.app.y;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.A;
import com.facebook.react.uimanager.C0864a0;
import com.facebook.react.uimanager.C0892s;
import com.facebook.react.uimanager.C0897x;
import com.facebook.react.uimanager.H;
import com.facebook.react.uimanager.K;
import com.facebook.react.uimanager.L;
import com.facebook.react.uimanager.P;
import com.facebook.react.uimanager.Q;
import com.facebook.react.uimanager.Y;
import com.facebook.react.uimanager.Z;
import com.facebook.react.uimanager.z0;
import com.google.android.gms.common.ConnectionResult;
import e2.C1619a;
import w2.InterfaceC2185b;
import w2.InterfaceC2186c;
import w2.InterfaceC2187d;
import y2.C2239a;

/* JADX INFO: loaded from: classes.dex */
public class i extends ViewGroup implements InterfaceC2187d, K, Q, InterfaceC2186c, Y, P {
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static final int DEFAULT_BACKGROUND_COLOR = 0;
    private static final ViewGroup.LayoutParams sDefaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    private static final Rect sHelperRect = new Rect();
    private View[] mAllChildren;
    private int mAllChildrenCount;
    private float mBackfaceOpacity;
    private String mBackfaceVisibility;
    private A2.a mCSSBackgroundDrawable;
    private a mChildrenLayoutChangeListener;
    private Rect mClippingRect;
    private z0 mDrawingOrderHelper;
    private Rect mHitSlopRect;
    private boolean mNeedsOffscreenAlphaCompositing;
    private InterfaceC2185b mOnInterceptTouchEventListener;
    private String mOverflow;
    private final Rect mOverflowInset;
    private Path mPath;
    private H mPointerEvents;
    private boolean mRemoveClippedSubviews;

    private static final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final i f13260m;

        private a(i iVar) {
            this.f13260m = iVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            if (this.f13260m.getRemoveClippedSubviews()) {
                this.f13260m.p(view);
            }
        }
    }

    public i(Context context) {
        super(context);
        this.mOverflowInset = new Rect();
        l();
    }

    private void e(View view, int i7) {
        View[] viewArr = (View[]) O1.a.c(this.mAllChildren);
        int i8 = this.mAllChildrenCount;
        int length = viewArr.length;
        if (i7 == i8) {
            if (length == i8) {
                View[] viewArr2 = new View[length + ARRAY_CAPACITY_INCREMENT];
                this.mAllChildren = viewArr2;
                System.arraycopy(viewArr, 0, viewArr2, 0, length);
                viewArr = this.mAllChildren;
            }
            int i9 = this.mAllChildrenCount;
            this.mAllChildrenCount = i9 + 1;
            viewArr[i9] = view;
            return;
        }
        if (i7 >= i8) {
            throw new IndexOutOfBoundsException("index=" + i7 + " count=" + i8);
        }
        if (length == i8) {
            View[] viewArr3 = new View[length + ARRAY_CAPACITY_INCREMENT];
            this.mAllChildren = viewArr3;
            System.arraycopy(viewArr, 0, viewArr3, 0, i7);
            System.arraycopy(viewArr, i7, this.mAllChildren, i7 + 1, i8 - i7);
            viewArr = this.mAllChildren;
        } else {
            System.arraycopy(viewArr, i7, viewArr, i7 + 1, i8 - i7);
        }
        viewArr[i7] = view;
        this.mAllChildrenCount++;
    }

    private boolean f() {
        return getId() != -1 && C2239a.a(getId()) == 2;
    }

    private void g(Canvas canvas) {
        float f7;
        boolean z6;
        float f8;
        float f9;
        float f10;
        String str = this.mOverflow;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "hidden":
                case "scroll":
                    float width = getWidth();
                    float height = getHeight();
                    A2.a aVar = this.mCSSBackgroundDrawable;
                    float f11 = 0.0f;
                    if (aVar != null) {
                        RectF rectFI = aVar.i();
                        float f12 = rectFI.top;
                        if (f12 > 0.0f || rectFI.left > 0.0f || rectFI.bottom > 0.0f || rectFI.right > 0.0f) {
                            f8 = rectFI.left + 0.0f;
                            f9 = f12 + 0.0f;
                            width -= rectFI.right;
                            height -= rectFI.bottom;
                        } else {
                            f9 = 0.0f;
                            f8 = 0.0f;
                        }
                        C2.c cVarH = this.mCSSBackgroundDrawable.h();
                        if (cVarH.e()) {
                            if (this.mPath == null) {
                                this.mPath = new Path();
                            }
                            this.mPath.rewind();
                            f10 = f9;
                            this.mPath.addRoundRect(new RectF(f8, f9, width, height), new float[]{Math.max(cVarH.c() - rectFI.left, 0.0f), Math.max(cVarH.c() - rectFI.top, 0.0f), Math.max(cVarH.d() - rectFI.right, 0.0f), Math.max(cVarH.d() - rectFI.top, 0.0f), Math.max(cVarH.b() - rectFI.right, 0.0f), Math.max(cVarH.b() - rectFI.bottom, 0.0f), Math.max(cVarH.a() - rectFI.left, 0.0f), Math.max(cVarH.a() - rectFI.bottom, 0.0f)}, Path.Direction.CW);
                            canvas.clipPath(this.mPath);
                            f11 = f8;
                            z6 = true;
                            width = width;
                            height = height;
                        } else {
                            f10 = f9;
                            f11 = f8;
                            z6 = false;
                        }
                        f7 = f10;
                    } else {
                        f7 = 0.0f;
                        z6 = false;
                    }
                    if (!z6) {
                        canvas.clipRect(new RectF(f11, f7, width, height));
                        break;
                    }
                    break;
                case "visible":
                    Path path = this.mPath;
                    if (path != null) {
                        path.rewind();
                        break;
                    }
                    break;
            }
        }
    }

    private z0 getDrawingOrderHelper() {
        if (this.mDrawingOrderHelper == null) {
            this.mDrawingOrderHelper = new z0(this);
        }
        return this.mDrawingOrderHelper;
    }

    private void h(View view) {
        boolean zD;
        UiThreadUtil.assertOnUiThread();
        if (f()) {
            zD = false;
        } else {
            getDrawingOrderHelper().b(view);
            zD = getDrawingOrderHelper().d();
        }
        setChildrenDrawingOrderEnabled(zD);
    }

    private void i(View view) {
        boolean zD;
        UiThreadUtil.assertOnUiThread();
        if (f()) {
            zD = false;
        } else {
            if (indexOfChild(view) == -1) {
                return;
            }
            getDrawingOrderHelper().c(view);
            zD = getDrawingOrderHelper().d();
        }
        setChildrenDrawingOrderEnabled(zD);
    }

    private void j(int i7, int i8) {
        int i9 = i8 + i7;
        while (i7 < i9) {
            if (i7 < getChildCount()) {
                i(getChildAt(i7));
            }
            i7++;
        }
    }

    private int k(View view) {
        int i7 = this.mAllChildrenCount;
        View[] viewArr = (View[]) O1.a.c(this.mAllChildren);
        for (int i8 = 0; i8 < i7; i8++) {
            if (viewArr[i8] == view) {
                return i8;
            }
        }
        return -1;
    }

    private void l() {
        setClipChildren(false);
        this.mRemoveClippedSubviews = false;
        this.mAllChildren = null;
        this.mAllChildrenCount = 0;
        this.mClippingRect = null;
        this.mHitSlopRect = null;
        this.mOverflow = null;
        this.mPointerEvents = H.f12293q;
        this.mChildrenLayoutChangeListener = null;
        this.mCSSBackgroundDrawable = null;
        this.mOnInterceptTouchEventListener = null;
        this.mNeedsOffscreenAlphaCompositing = false;
        this.mDrawingOrderHelper = null;
        this.mPath = null;
        this.mBackfaceOpacity = 1.0f;
        this.mBackfaceVisibility = "visible";
    }

    private void m(int i7) {
        View[] viewArr = (View[]) O1.a.c(this.mAllChildren);
        int i8 = this.mAllChildrenCount;
        if (i7 == i8 - 1) {
            int i9 = i8 - 1;
            this.mAllChildrenCount = i9;
            viewArr[i9] = null;
        } else {
            if (i7 < 0 || i7 >= i8) {
                throw new IndexOutOfBoundsException();
            }
            System.arraycopy(viewArr, i7 + 1, viewArr, i7, (i8 - i7) - 1);
            int i10 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i10;
            viewArr[i10] = null;
        }
    }

    private void n(Rect rect) {
        O1.a.c(this.mAllChildren);
        int i7 = 0;
        for (int i8 = 0; i8 < this.mAllChildrenCount; i8++) {
            o(rect, i8, i7);
            if (this.mAllChildren[i8].getParent() == null) {
                i7++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void o(Rect rect, int i7, int i8) {
        UiThreadUtil.assertOnUiThread();
        ExtractEditText extractEditText = ((View[]) O1.a.c(this.mAllChildren))[i7];
        Rect rect2 = sHelperRect;
        rect2.set(extractEditText.getLeft(), extractEditText.getTop(), extractEditText.getRight(), extractEditText.getBottom());
        boolean zIntersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = extractEditText.getAnimation();
        boolean z6 = (animation == null || animation.hasEnded()) ? false : true;
        if (!zIntersects && extractEditText.getParent() != null && !z6) {
            removeViewsInLayout(i7 - i8, 1);
        } else if (zIntersects && extractEditText.getParent() == null) {
            addViewInLayout(extractEditText, i7 - i8, sDefaultLayoutParam, true);
            invalidate();
        } else if (!zIntersects) {
            return;
        }
        if (extractEditText instanceof K) {
            K k7 = (K) extractEditText;
            if (k7.getRemoveClippedSubviews()) {
                k7.updateClippingRect();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(View view) {
        if (!this.mRemoveClippedSubviews || getParent() == null) {
            return;
        }
        O1.a.c(this.mClippingRect);
        O1.a.c(this.mAllChildren);
        Rect rect = sHelperRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (this.mClippingRect.intersects(rect.left, rect.top, rect.right, rect.bottom) != (view.getParent() != null)) {
            int i7 = 0;
            for (int i8 = 0; i8 < this.mAllChildrenCount; i8++) {
                View view2 = this.mAllChildren[i8];
                if (view2 == view) {
                    o(this.mClippingRect, i8, i7);
                    return;
                } else {
                    if (view2.getParent() == null) {
                        i7++;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        h(view);
        super.addView(view, i7, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z6) {
        h(view);
        return super.addViewInLayout(view, i7, layoutParams, z6);
    }

    void addViewWithSubviewClippingEnabled(View view, int i7) {
        addViewWithSubviewClippingEnabled(view, i7, sDefaultLayoutParam);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            g(canvas);
            super.dispatchDraw(canvas);
        } catch (NullPointerException | StackOverflowError e7) {
            Z zA = C0864a0.a(this);
            if (zA != null) {
                zA.b(e7);
            } else {
                if (!(getContext() instanceof ReactContext)) {
                    throw e7;
                }
                ((ReactContext) getContext()).handleException(new C0892s("StackOverflowException", this, e7));
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (H.j(this.mPointerEvents)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(ConnectionResult.API_DISABLED)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e7) {
            P0.a.k("ReactNative", "NullPointerException when executing dispatchProvideStructure", e7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z6) {
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j7) {
        boolean z6 = view.getElevation() > 0.0f;
        if (z6) {
            c.a(canvas, true);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j7);
        if (z6) {
            c.a(canvas, false);
        }
        return zDrawChild;
    }

    int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    public int getBackgroundColor() {
        if (getBackground() == null) {
            return 0;
        }
        y.a(getBackground());
        throw null;
    }

    View getChildAtWithSubviewClippingEnabled(int i7) {
        if (i7 < 0 || i7 >= this.mAllChildrenCount) {
            return null;
        }
        return ((View[]) O1.a.c(this.mAllChildren))[i7];
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i7, int i8) {
        UiThreadUtil.assertOnUiThread();
        return !f() ? getDrawingOrderHelper().a(i7, i8) : i8;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.K
    public void getClippingRect(Rect rect) {
        rect.set(this.mClippingRect);
    }

    @Override // w2.InterfaceC2186c
    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    A2.a getOrCreateReactViewBackground() {
        if (this.mCSSBackgroundDrawable == null) {
            this.mCSSBackgroundDrawable = new A2.a(getContext());
            Drawable background = getBackground();
            updateBackgroundDrawable(null);
            if (background == null) {
                updateBackgroundDrawable(this.mCSSBackgroundDrawable);
            } else {
                updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mCSSBackgroundDrawable, background}));
            }
            if (!C1619a.d()) {
                this.mCSSBackgroundDrawable.x(com.facebook.react.modules.i18nmanager.a.f().i(getContext()) ? 1 : 0);
            }
        }
        return this.mCSSBackgroundDrawable;
    }

    @Override // com.facebook.react.uimanager.O
    public String getOverflow() {
        return this.mOverflow;
    }

    @Override // com.facebook.react.uimanager.P
    public Rect getOverflowInset() {
        return this.mOverflowInset;
    }

    @Override // com.facebook.react.uimanager.Q
    public H getPointerEvents() {
        return this.mPointerEvents;
    }

    @Override // com.facebook.react.uimanager.K
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // com.facebook.react.uimanager.Y
    public int getZIndexMappedChildIndex(int i7) {
        UiThreadUtil.assertOnUiThread();
        return (f() || !getDrawingOrderHelper().d()) ? i7 : getDrawingOrderHelper().a(getChildCount(), i7);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        InterfaceC2185b interfaceC2185b = this.mOnInterceptTouchEventListener;
        if ((interfaceC2185b == null || !interfaceC2185b.a(this, motionEvent)) && H.j(this.mPointerEvents)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        A.a(i7, i8);
        setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i8));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return H.h(this.mPointerEvents);
    }

    void recycleView() {
        l();
        this.mOverflowInset.setEmpty();
        sHelperRect.setEmpty();
        removeAllViews();
        updateBackgroundDrawable(null);
        resetPointerEvents();
    }

    void removeAllViewsWithSubviewClippingEnabled() {
        O1.a.a(this.mRemoveClippedSubviews);
        O1.a.c(this.mAllChildren);
        for (int i7 = 0; i7 < this.mAllChildrenCount; i7++) {
            this.mAllChildren[i7].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        i(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i7) {
        i(getChildAt(i7));
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        i(view);
        super.removeViewInLayout(view);
    }

    void removeViewWithSubviewClippingEnabled(View view) {
        UiThreadUtil.assertOnUiThread();
        O1.a.a(this.mRemoveClippedSubviews);
        O1.a.c(this.mClippingRect);
        O1.a.c(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int iK = k(view);
        if (this.mAllChildren[iK].getParent() != null) {
            int i7 = 0;
            for (int i8 = 0; i8 < iK; i8++) {
                if (this.mAllChildren[i8].getParent() == null) {
                    i7++;
                }
            }
            removeViewsInLayout(iK - i7, 1);
        }
        m(iK);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i7, int i8) {
        j(i7, i8);
        super.removeViews(i7, i8);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i7, int i8) {
        j(i7, i8);
        super.removeViewsInLayout(i7, i8);
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    void resetPointerEvents() {
        this.mPointerEvents = H.f12293q;
    }

    public void setBackfaceVisibility(String str) {
        this.mBackfaceVisibility = str;
        setBackfaceVisibilityDependantOpacity();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setBackfaceVisibilityDependantOpacity() {
        float f7;
        if (this.mBackfaceVisibility.equals("visible")) {
            f7 = this.mBackfaceOpacity;
        } else {
            float rotationX = getRotationX();
            float rotationY = getRotationY();
            if (rotationX < -90.0f || rotationX >= 90.0f || rotationY < -90.0f || rotationY >= 90.0f) {
                f7 = 0.0f;
            }
        }
        setAlpha(f7);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException("This method is not supported for ReactViewGroup instances");
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        if (i7 == 0 && this.mCSSBackgroundDrawable == null) {
            return;
        }
        getOrCreateReactViewBackground().w(i7);
    }

    public void setBorderColor(int i7, float f7, float f8) {
        getOrCreateReactViewBackground().r(i7, f7, f8);
    }

    public void setBorderRadius(float f7) {
        getOrCreateReactViewBackground().y(f7);
    }

    public void setBorderStyle(String str) {
        getOrCreateReactViewBackground().u(str);
    }

    public void setBorderWidth(int i7, float f7) {
        getOrCreateReactViewBackground().v(i7, f7);
    }

    public void setHitSlopRect(Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z6) {
        this.mNeedsOffscreenAlphaCompositing = z6;
    }

    @Override // w2.InterfaceC2187d
    public void setOnInterceptTouchEventListener(InterfaceC2185b interfaceC2185b) {
        this.mOnInterceptTouchEventListener = interfaceC2185b;
    }

    public void setOpacityIfPossible(float f7) {
        this.mBackfaceOpacity = f7;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        this.mOverflow = str;
        invalidate();
    }

    @Override // com.facebook.react.uimanager.P
    public void setOverflowInset(int i7, int i8, int i9, int i10) {
        this.mOverflowInset.set(i7, i8, i9, i10);
    }

    void setPointerEvents(H h7) {
        this.mPointerEvents = h7;
    }

    public void setRemoveClippedSubviews(boolean z6) {
        if (z6 == this.mRemoveClippedSubviews) {
            return;
        }
        this.mRemoveClippedSubviews = z6;
        if (z6) {
            Rect rect = new Rect();
            this.mClippingRect = rect;
            L.a(this, rect);
            int childCount = getChildCount();
            this.mAllChildrenCount = childCount;
            this.mAllChildren = new View[Math.max(ARRAY_CAPACITY_INCREMENT, childCount)];
            this.mChildrenLayoutChangeListener = new a();
            for (int i7 = 0; i7 < this.mAllChildrenCount; i7++) {
                View childAt = getChildAt(i7);
                this.mAllChildren[i7] = childAt;
                childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            updateClippingRect();
            return;
        }
        O1.a.c(this.mClippingRect);
        O1.a.c(this.mAllChildren);
        O1.a.c(this.mChildrenLayoutChangeListener);
        for (int i8 = 0; i8 < this.mAllChildrenCount; i8++) {
            this.mAllChildren[i8].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        getDrawingRect(this.mClippingRect);
        n(this.mClippingRect);
        this.mAllChildren = null;
        this.mClippingRect = null;
        this.mAllChildrenCount = 0;
        this.mChildrenLayoutChangeListener = null;
    }

    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        updateBackgroundDrawable(null);
        if (this.mCSSBackgroundDrawable != null && drawable != null) {
            updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mCSSBackgroundDrawable, drawable}));
        } else if (drawable != null) {
            updateBackgroundDrawable(drawable);
        }
    }

    void updateBackgroundDrawable(Drawable drawable) {
        super.setBackground(drawable);
    }

    @Override // com.facebook.react.uimanager.K
    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            O1.a.c(this.mClippingRect);
            O1.a.c(this.mAllChildren);
            L.a(this, this.mClippingRect);
            n(this.mClippingRect);
        }
    }

    @Override // com.facebook.react.uimanager.Y
    public void updateDrawingOrder() {
        if (f()) {
            return;
        }
        getDrawingOrderHelper().e();
        setChildrenDrawingOrderEnabled(getDrawingOrderHelper().d());
        invalidate();
    }

    void addViewWithSubviewClippingEnabled(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        O1.a.a(this.mRemoveClippedSubviews);
        O1.a.c(this.mClippingRect);
        O1.a.c(this.mAllChildren);
        e(view, i7);
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            if (this.mAllChildren[i9].getParent() == null) {
                i8++;
            }
        }
        o(this.mClippingRect, i7, i8);
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
    }

    public void setBorderRadius(float f7, int i7) {
        getOrCreateReactViewBackground().z(f7, i7);
    }

    public void setBorderRadius(C2.a aVar, C0897x c0897x) {
        getOrCreateReactViewBackground().t(aVar, c0897x);
    }
}
