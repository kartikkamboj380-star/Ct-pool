package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import e.AbstractC1609a;
import g.AbstractC1665a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class P extends ListView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Rect f5726m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5727n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5728o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5729p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f5730q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5731r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d f5732s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f5733t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f5734u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f5735v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private androidx.core.view.O f5736w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private androidx.core.widget.f f5737x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    f f5738y;

    static class a {
        static void a(View view, float f7, float f8) {
            view.drawableHotspotChanged(f7, f8);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Method f5739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f5740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Method f5741c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f5742d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f5739a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f5740b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f5741c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f5742d = true;
            } catch (NoSuchMethodException e7) {
                e7.printStackTrace();
            }
        }

        static boolean a() {
            return f5742d;
        }

        static void b(P p6, int i7, View view) {
            try {
                f5739a.invoke(p6, Integer.valueOf(i7), view, Boolean.FALSE, -1, -1);
                f5740b.invoke(p6, Integer.valueOf(i7));
                f5741c.invoke(p6, Integer.valueOf(i7));
            } catch (IllegalAccessException | InvocationTargetException e7) {
                e7.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z6) {
            absListView.setSelectedChildViewEnabled(z6);
        }
    }

    private static class d extends AbstractC1665a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f5743n;

        d(Drawable drawable) {
            super(drawable);
            this.f5743n = true;
        }

        void b(boolean z6) {
            this.f5743n = z6;
        }

        @Override // g.AbstractC1665a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f5743n) {
                super.draw(canvas);
            }
        }

        @Override // g.AbstractC1665a, android.graphics.drawable.Drawable
        public void setHotspot(float f7, float f8) {
            if (this.f5743n) {
                super.setHotspot(f7, f8);
            }
        }

        @Override // g.AbstractC1665a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i7, int i8, int i9, int i10) {
            if (this.f5743n) {
                super.setHotspotBounds(i7, i8, i9, i10);
            }
        }

        @Override // g.AbstractC1665a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f5743n) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // g.AbstractC1665a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z6, boolean z7) {
            if (this.f5743n) {
                return super.setVisible(z6, z7);
            }
            return false;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Field f5744a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e7) {
                e7.printStackTrace();
            }
            f5744a = declaredField;
        }

        static boolean a(AbsListView absListView) {
            Field field = f5744a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z6) {
            Field field = f5744a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z6));
                } catch (IllegalAccessException e7) {
                    e7.printStackTrace();
                }
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void a() {
            P p6 = P.this;
            p6.f5738y = null;
            p6.removeCallbacks(this);
        }

        public void b() {
            P.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            P p6 = P.this;
            p6.f5738y = null;
            p6.drawableStateChanged();
        }
    }

    P(Context context, boolean z6) {
        super(context, null, AbstractC1609a.f18751x);
        this.f5726m = new Rect();
        this.f5727n = 0;
        this.f5728o = 0;
        this.f5729p = 0;
        this.f5730q = 0;
        this.f5734u = z6;
        setCacheColorHint(0);
    }

    private void a() {
        this.f5735v = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f5731r - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        androidx.core.view.O o6 = this.f5736w;
        if (o6 != null) {
            o6.c();
            this.f5736w = null;
        }
    }

    private void b(View view, int i7) {
        performItemClick(view, i7, getItemIdAtPosition(i7));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f5726m.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f5726m);
        selector.draw(canvas);
    }

    private void f(int i7, View view) {
        Rect rect = this.f5726m;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f5727n;
        rect.top -= this.f5728o;
        rect.right += this.f5729p;
        rect.bottom += this.f5730q;
        boolean zK = k();
        if (view.isEnabled() != zK) {
            l(!zK);
            if (i7 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i7, View view) {
        Drawable selector = getSelector();
        boolean z6 = (selector == null || i7 == -1) ? false : true;
        if (z6) {
            selector.setVisible(false, false);
        }
        f(i7, view);
        if (z6) {
            Rect rect = this.f5726m;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.e(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i7, View view, float f7, float f8) {
        g(i7, view);
        Drawable selector = getSelector();
        if (selector == null || i7 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.e(selector, f7, f8);
    }

    private void i(View view, int i7, float f7, float f8) {
        View childAt;
        this.f5735v = true;
        a.a(this, f7, f8);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i8 = this.f5731r;
        if (i8 != -1 && (childAt = getChildAt(i8 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f5731r = i7;
        a.a(view, f7 - view.getLeft(), f8 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i7, view, f7, f8);
        j(false);
        refreshDrawableState();
    }

    private void j(boolean z6) {
        d dVar = this.f5732s;
        if (dVar != null) {
            dVar.b(z6);
        }
    }

    private boolean k() {
        return androidx.core.os.a.c() ? c.a(this) : e.a(this);
    }

    private void l(boolean z6) {
        if (androidx.core.os.a.c()) {
            c.b(this, z6);
        } else {
            e.b(this, z6);
        }
    }

    private boolean m() {
        return this.f5735v;
    }

    private void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i7, int i8, int i9, int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        View view = null;
        while (i12 < count) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i7, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i10) {
                return (i11 < 0 || i12 <= i11 || i14 <= 0 || measuredHeight == i10) ? i10 : i14;
            }
            if (i11 >= 0 && i12 >= i11) {
                i14 = measuredHeight;
            }
            i12++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f5738y != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(MotionEvent motionEvent, int i7) {
        boolean z6;
        boolean z7;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z6 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z6 = true;
                    z7 = false;
                } else {
                    z7 = false;
                    z6 = false;
                }
                if (z6 || z7) {
                    a();
                }
                if (z6) {
                    androidx.core.widget.f fVar = this.f5737x;
                    if (fVar != null) {
                        fVar.m(false);
                    }
                } else {
                    if (this.f5737x == null) {
                        this.f5737x = new androidx.core.widget.f(this);
                    }
                    this.f5737x.m(true);
                    this.f5737x.onTouch(this, motionEvent);
                }
                return z6;
            }
            z6 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i7);
        if (iFindPointerIndex >= 0) {
            int x6 = (int) motionEvent.getX(iFindPointerIndex);
            int y6 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x6, y6);
            if (iPointToPosition == -1) {
                z7 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                i(childAt, iPointToPosition, x6, y6);
                if (actionMasked == 1) {
                    b(childAt, iPointToPosition);
                }
                z6 = true;
                z7 = false;
            }
        }
        if (z6) {
            a();
        }
        if (z6) {
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f5734u || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f5734u || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f5734u || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f5734u && this.f5733t) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f5738y = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f5738y == null) {
            f fVar = new f();
            this.f5738y = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i7 < 30 || !b.a()) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, iPointToPosition, childAt);
                    }
                }
                n();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f5731r = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f5738y;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z6) {
        this.f5733t = z6;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f5732s = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f5727n = rect.left;
        this.f5728o = rect.top;
        this.f5729p = rect.right;
        this.f5730q = rect.bottom;
    }
}
