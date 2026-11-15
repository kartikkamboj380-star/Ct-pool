package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C0527d;
import androidx.appcompat.widget.U;

/* JADX INFO: loaded from: classes.dex */
public class i extends C0527d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final U f17240q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AccessibilityManager f17241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f17242s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f17243t;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
            i iVar = i.this;
            i.this.f(i7 < 0 ? iVar.f17240q.v() : iVar.getAdapter().getItem(i7));
            AdapterView.OnItemClickListener onItemClickListener = i.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i7 < 0) {
                    view = i.this.f17240q.y();
                    i7 = i.this.f17240q.x();
                    j7 = i.this.f17240q.w();
                }
                onItemClickListener.onItemClick(i.this.f17240q.j(), view, i7, j7);
            }
            i.this.f17240q.dismiss();
        }
    }

    public i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A3.a.f102b);
    }

    private TextInputLayout d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutD = d();
        int i7 = 0;
        if (adapter == null || textInputLayoutD == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f17240q.x()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutD);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableH = this.f17240q.h();
        if (drawableH != null) {
            drawableH.getPadding(this.f17242s);
            Rect rect = this.f17242s;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutD.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutD = d();
        return (textInputLayoutD == null || !textInputLayoutD.O()) ? super.getHint() : textInputLayoutD.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutD = d();
        if (textInputLayoutD != null && textInputLayoutD.O() && super.getHint() == null && com.google.android.material.internal.g.a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), e()), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t6) {
        super.setAdapter(t6);
        this.f17240q.p(getAdapter());
    }

    public void setSimpleItems(int i7) {
        setSimpleItems(getResources().getStringArray(i7));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f17241r;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f17240q.b();
        }
    }

    public i(Context context, AttributeSet attributeSet, int i7) {
        super(O3.a.c(context, attributeSet, i7, 0), attributeSet, i7);
        this.f17242s = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayH = com.google.android.material.internal.l.h(context2, attributeSet, A3.j.f499f2, i7, A3.i.f258b, new int[0]);
        if (typedArrayH.hasValue(A3.j.f507g2) && typedArrayH.getInt(A3.j.f507g2, 0) == 0) {
            setKeyListener(null);
        }
        this.f17243t = typedArrayH.getResourceId(A3.j.f515h2, A3.g.f232j);
        this.f17241r = (AccessibilityManager) context2.getSystemService("accessibility");
        U u6 = new U(context2);
        this.f17240q = u6;
        u6.J(true);
        u6.D(this);
        u6.I(2);
        u6.p(getAdapter());
        u6.L(new a());
        if (typedArrayH.hasValue(A3.j.f523i2)) {
            setSimpleItems(typedArrayH.getResourceId(A3.j.f523i2, 0));
        }
        typedArrayH.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f17243t, strArr));
    }
}
