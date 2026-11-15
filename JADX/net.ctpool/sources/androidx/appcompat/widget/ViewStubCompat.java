package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f5944m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f5945n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private WeakReference f5946o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LayoutInflater f5947p;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f5944m == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f5947p;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f5944m, viewGroup, false);
        int i7 = this.f5945n;
        if (i7 != -1) {
            viewInflate.setId(i7);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f5946o = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f5945n;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f5947p;
    }

    public int getLayoutResource() {
        return this.f5944m;
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i7) {
        this.f5945n = i7;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f5947p = layoutInflater;
    }

    public void setLayoutResource(int i7) {
        this.f5944m = i7;
    }

    public void setOnInflateListener(a aVar) {
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        WeakReference weakReference = this.f5946o;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i7);
            return;
        }
        super.setVisibility(i7);
        if (i7 == 0 || i7 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f5944m = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f18975O3, i7, 0);
        this.f5945n = typedArrayObtainStyledAttributes.getResourceId(e.j.f18990R3, -1);
        this.f5944m = typedArrayObtainStyledAttributes.getResourceId(e.j.f18985Q3, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(e.j.f18980P3, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
