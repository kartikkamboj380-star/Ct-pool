package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import e.AbstractC1609a;

/* JADX INFO: renamed from: androidx.appcompat.widget.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0524a extends ViewGroup {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final C0123a f5973m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final Context f5974n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected ActionMenuView f5975o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected C0526c f5976p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected int f5977q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected androidx.core.view.O f5978r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f5979s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f5980t;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0123a implements androidx.core.view.P {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f5981a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5982b;

        protected C0123a() {
        }

        @Override // androidx.core.view.P
        public void a(View view) {
            this.f5981a = true;
        }

        @Override // androidx.core.view.P
        public void b(View view) {
            if (this.f5981a) {
                return;
            }
            AbstractC0524a abstractC0524a = AbstractC0524a.this;
            abstractC0524a.f5978r = null;
            AbstractC0524a.super.setVisibility(this.f5982b);
        }

        @Override // androidx.core.view.P
        public void c(View view) {
            AbstractC0524a.super.setVisibility(0);
            this.f5981a = false;
        }

        public C0123a d(androidx.core.view.O o6, int i7) {
            AbstractC0524a.this.f5978r = o6;
            this.f5982b = i7;
            return this;
        }
    }

    AbstractC0524a(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f5973m = new C0123a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC1609a.f18728a, typedValue, true) || typedValue.resourceId == 0) {
            this.f5974n = context;
        } else {
            this.f5974n = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i7, int i8, boolean z6) {
        return z6 ? i7 - i8 : i7 + i8;
    }

    protected int c(View view, int i7, int i8, int i9) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i8);
        return Math.max(0, (i7 - view.getMeasuredWidth()) - i9);
    }

    protected int e(View view, int i7, int i8, int i9, boolean z6) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i8 + ((i9 - measuredHeight) / 2);
        if (z6) {
            view.layout(i7 - measuredWidth, i10, i7, measuredHeight + i10);
        } else {
            view.layout(i7, i10, i7 + measuredWidth, measuredHeight + i10);
        }
        return z6 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.O f(int i7, long j7) {
        androidx.core.view.O oB;
        androidx.core.view.O o6 = this.f5978r;
        if (o6 != null) {
            o6.c();
        }
        if (i7 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            oB = androidx.core.view.H.e(this).b(1.0f);
        } else {
            oB = androidx.core.view.H.e(this).b(0.0f);
        }
        oB.f(j7);
        oB.h(this.f5973m.d(oB, i7));
        return oB;
    }

    public int getAnimatedVisibility() {
        return this.f5978r != null ? this.f5973m.f5982b : getVisibility();
    }

    public int getContentHeight() {
        return this.f5977q;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, e.j.f19023a, AbstractC1609a.f18730c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(e.j.f19068j, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0526c c0526c = this.f5976p;
        if (c0526c != null) {
            c0526c.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f5980t = false;
        }
        if (!this.f5980t) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f5980t = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f5980t = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5979s = false;
        }
        if (!this.f5979s) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f5979s = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f5979s = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i7);

    @Override // android.view.View
    public void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            androidx.core.view.O o6 = this.f5978r;
            if (o6 != null) {
                o6.c();
            }
            super.setVisibility(i7);
        }
    }
}
