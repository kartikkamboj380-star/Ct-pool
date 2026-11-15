package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.U;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f8025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f8026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f8027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f8028p;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f8029a = new a();

        private a() {
        }

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            w5.k.f(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            w5.k.f(view, "v");
            w5.k.f(windowInsets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            w5.k.e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        w5.k.f(context, "context");
    }

    private final void a(View view) {
        if (this.f8026n.contains(view)) {
            this.f8025m.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        w5.k.f(view, "child");
        if (w.D0(view) != null) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        U uB0;
        w5.k.f(windowInsets, "insets");
        U uV = U.v(windowInsets);
        w5.k.e(uV, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f8027o;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f8029a;
            w5.k.c(onApplyWindowInsetsListener);
            uB0 = U.v(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            uB0 = androidx.core.view.H.b0(this, uV);
        }
        w5.k.e(uB0, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!uB0.o()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                androidx.core.view.H.g(getChildAt(i7), uB0);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        w5.k.f(canvas, "canvas");
        if (this.f8028p) {
            Iterator it = this.f8025m.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j7) {
        w5.k.f(canvas, "canvas");
        w5.k.f(view, "child");
        if (this.f8028p && (!this.f8025m.isEmpty()) && this.f8025m.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j7);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        w5.k.f(view, "view");
        this.f8026n.remove(view);
        if (this.f8025m.remove(view)) {
            this.f8028p = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) w.m0(this).j0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        w5.k.f(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                w5.k.e(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        w5.k.f(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i7) {
        View childAt = getChildAt(i7);
        w5.k.e(childAt, "view");
        a(childAt);
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        w5.k.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            w5.k.e(childAt, "view");
            a(childAt);
        }
        super.removeViews(i7, i8);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i7, int i8) {
        int i9 = i7 + i8;
        for (int i10 = i7; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            w5.k.e(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i7, i8);
    }

    public final void setDrawDisappearingViewsLast(boolean z6) {
        this.f8028p = z6;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        w5.k.f(onApplyWindowInsetsListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f8027o = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        w5.k.f(view, "view");
        if (view.getParent() == this) {
            this.f8026n.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i7) {
        String str;
        super(context, attributeSet, i7);
        w5.k.f(context, "context");
        this.f8025m = new ArrayList();
        this.f8026n = new ArrayList();
        this.f8028p = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = K.c.f1838e;
            w5.k.e(iArr, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(K.c.f1839f);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i8 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, w wVar) {
        String str;
        super(context, attributeSet);
        w5.k.f(context, "context");
        w5.k.f(attributeSet, "attrs");
        w5.k.f(wVar, "fm");
        this.f8025m = new ArrayList();
        this.f8026n = new ArrayList();
        this.f8028p = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = K.c.f1838e;
        w5.k.e(iArr, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(K.c.f1839f) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(K.c.f1840g);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentJ0 = wVar.j0(id);
        if (classAttribute != null && fragmentJ0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentA = wVar.u0().a(context.getClassLoader(), classAttribute);
            w5.k.e(fragmentA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentA.onInflate(context, attributeSet, (Bundle) null);
            wVar.p().s(true).d(this, fragmentA, string).j();
        }
        wVar.b1(this);
    }
}
