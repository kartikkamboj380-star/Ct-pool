package com.google.android.material.chip;

import A3.i;
import A3.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.H;
import androidx.core.view.accessibility.C;
import com.google.android.material.internal.a;
import com.google.android.material.internal.l;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ChipGroup extends com.google.android.material.internal.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f16688w = i.f265i;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f16689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f16690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f16691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.google.android.material.internal.a f16692t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f16693u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final f f16694v;

    class a implements a.b {
        a() {
        }

        @Override // com.google.android.material.internal.a.b
        public void a(Set set) {
            if (ChipGroup.this.f16691s != null) {
                e eVar = ChipGroup.this.f16691s;
                ChipGroup chipGroup = ChipGroup.this;
                eVar.a(chipGroup, chipGroup.f16692t.j(ChipGroup.this));
            }
        }
    }

    class b implements e {
        b(d dVar) {
        }

        @Override // com.google.android.material.chip.ChipGroup.e
        public void a(ChipGroup chipGroup, List list) {
            if (ChipGroup.this.f16692t.l()) {
                ChipGroup.this.getCheckedChipId();
                throw null;
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(int i7, int i8) {
            super(i7, i8);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public interface d {
    }

    public interface e {
        void a(ChipGroup chipGroup, List list);
    }

    private class f implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f16697m;

        private f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(H.k());
                }
                ChipGroup.this.f16692t.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f16697m;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f16692t.n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f16697m;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ f(ChipGroup chipGroup, a aVar) {
            this();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A3.a.f105e);
    }

    private int getChipCount() {
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (getChildAt(i8) instanceof Chip) {
                i7++;
            }
        }
        return i7;
    }

    @Override // com.google.android.material.internal.e
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    int g(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (getChildAt(i8) instanceof Chip) {
                if (((Chip) getChildAt(i8)) == view) {
                    return i7;
                }
                i7++;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f16692t.k();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f16692t.j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f16689q;
    }

    public int getChipSpacingVertical() {
        return this.f16690r;
    }

    public boolean h() {
        return this.f16692t.l();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i7 = this.f16693u;
        if (i7 != -1) {
            this.f16692t.f(i7);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C.N0(accessibilityNodeInfo).i0(C.b.b(getRowCount(), c() ? getChipCount() : -1, false, h() ? 1 : 2));
    }

    public void setChipSpacing(int i7) {
        setChipSpacingHorizontal(i7);
        setChipSpacingVertical(i7);
    }

    public void setChipSpacingHorizontal(int i7) {
        if (this.f16689q != i7) {
            this.f16689q = i7;
            setItemSpacing(i7);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i7) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i7));
    }

    public void setChipSpacingResource(int i7) {
        setChipSpacing(getResources().getDimensionPixelOffset(i7));
    }

    public void setChipSpacingVertical(int i7) {
        if (this.f16690r != i7) {
            this.f16690r = i7;
            setLineSpacing(i7);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i7) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i7));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i7) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(e eVar) {
        this.f16691s = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f16694v.f16697m = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z6) {
        this.f16692t.p(z6);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i7) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i7) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i7) {
        setSingleLine(getResources().getBoolean(i7));
    }

    public void setSingleSelection(int i7) {
        setSingleSelection(getResources().getBoolean(i7));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f16688w;
        super(O3.a.c(context, attributeSet, i7, i8), attributeSet, i7);
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a();
        this.f16692t = aVar;
        f fVar = new f(this, null);
        this.f16694v = fVar;
        TypedArray typedArrayH = l.h(getContext(), attributeSet, j.f415U0, i7, i8, new int[0]);
        int dimensionPixelOffset = typedArrayH.getDimensionPixelOffset(j.f429W0, 0);
        setChipSpacingHorizontal(typedArrayH.getDimensionPixelOffset(j.f436X0, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayH.getDimensionPixelOffset(j.f443Y0, dimensionPixelOffset));
        setSingleLine(typedArrayH.getBoolean(j.f458a1, false));
        setSingleSelection(typedArrayH.getBoolean(j.f466b1, false));
        setSelectionRequired(typedArrayH.getBoolean(j.f450Z0, false));
        this.f16693u = typedArrayH.getResourceId(j.f422V0, -1);
        typedArrayH.recycle();
        aVar.o(new a());
        super.setOnHierarchyChangeListener(fVar);
        H.z0(this, 1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    @Override // com.google.android.material.internal.e
    public void setSingleLine(boolean z6) {
        super.setSingleLine(z6);
    }

    public void setSingleSelection(boolean z6) {
        this.f16692t.q(z6);
    }
}
