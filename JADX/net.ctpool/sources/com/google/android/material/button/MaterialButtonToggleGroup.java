package com.google.android.material.button;

import A3.i;
import A3.j;
import N3.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C0574a;
import androidx.core.view.H;
import androidx.core.view.accessibility.C;
import androidx.core.view.r;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.l;
import com.google.android.material.internal.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f16620w = "MaterialButtonToggleGroup";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f16621x = i.f270n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f16622m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e f16623n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final LinkedHashSet f16624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Comparator f16625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Integer[] f16626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f16627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f16628s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f16629t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f16630u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Set f16631v;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends C0574a {
        b() {
        }

        @Override // androidx.core.view.C0574a
        public void g(View view, C c7) {
            super.g(view, c7);
            c7.j0(C.c.b(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final N3.c f16634e = new N3.a(0.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        N3.c f16635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        N3.c f16636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        N3.c f16637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        N3.c f16638d;

        c(N3.c cVar, N3.c cVar2, N3.c cVar3, N3.c cVar4) {
            this.f16635a = cVar;
            this.f16636b = cVar3;
            this.f16637c = cVar4;
            this.f16638d = cVar2;
        }

        public static c a(c cVar) {
            N3.c cVar2 = f16634e;
            return new c(cVar2, cVar.f16638d, cVar2, cVar.f16637c);
        }

        public static c b(c cVar, View view) {
            return n.e(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            N3.c cVar2 = cVar.f16635a;
            N3.c cVar3 = cVar.f16638d;
            N3.c cVar4 = f16634e;
            return new c(cVar2, cVar3, cVar4, cVar4);
        }

        public static c d(c cVar) {
            N3.c cVar2 = f16634e;
            return new c(cVar2, cVar2, cVar.f16636b, cVar.f16637c);
        }

        public static c e(c cVar, View view) {
            return n.e(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            N3.c cVar2 = cVar.f16635a;
            N3.c cVar3 = f16634e;
            return new c(cVar2, cVar3, cVar.f16636b, cVar3);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i7, boolean z6);
    }

    private class e implements MaterialButton.a {
        private e() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z6) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, A3.a.f119s);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i7 = firstVisibleChildIndex + 1; i7 < getChildCount(); i7++) {
            MaterialButton materialButtonH = h(i7);
            int iMin = Math.min(materialButtonH.getStrokeWidth(), h(i7 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonH);
            if (getOrientation() == 0) {
                r.c(layoutParamsD, 0);
                r.d(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                r.d(layoutParamsD, 0);
            }
            materialButtonH.setLayoutParams(layoutParamsD);
        }
        n(firstVisibleChildIndex);
    }

    private LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void e(int i7, boolean z6) {
        if (i7 == -1) {
            Log.e(f16620w, "Button ID is not valid: " + i7);
            return;
        }
        HashSet hashSet = new HashSet(this.f16631v);
        if (z6 && !hashSet.contains(Integer.valueOf(i7))) {
            if (this.f16628s && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i7));
        } else {
            if (z6 || !hashSet.contains(Integer.valueOf(i7))) {
                return;
            }
            if (!this.f16629t || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i7));
            }
        }
        q(hashSet);
    }

    private void g(int i7, boolean z6) {
        Iterator it = this.f16624o.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i7, z6);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (k(i7)) {
                return i7;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if ((getChildAt(i8) instanceof MaterialButton) && k(i8)) {
                i7++;
            }
        }
        return i7;
    }

    private MaterialButton h(int i7) {
        return (MaterialButton) getChildAt(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (getChildAt(i8) == view) {
                return i7;
            }
            if ((getChildAt(i8) instanceof MaterialButton) && k(i8)) {
                i7++;
            }
        }
        return -1;
    }

    private c j(int i7, int i8, int i9) {
        c cVar = (c) this.f16622m.get(i7);
        if (i8 == i9) {
            return cVar;
        }
        boolean z6 = getOrientation() == 0;
        if (i7 == i8) {
            return z6 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i7 == i9) {
            return z6 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    private boolean k(int i7) {
        return getChildAt(i7).getVisibility() != 8;
    }

    private void n(int i7) {
        if (getChildCount() == 0 || i7 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i7).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            r.c(layoutParams, 0);
            r.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void o(int i7, boolean z6) {
        View viewFindViewById = findViewById(i7);
        if (viewFindViewById instanceof MaterialButton) {
            this.f16627r = true;
            ((MaterialButton) viewFindViewById).setChecked(z6);
            this.f16627r = false;
        }
    }

    private static void p(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f16635a).t(cVar.f16638d).F(cVar.f16636b).x(cVar.f16637c);
        }
    }

    private void q(Set set) {
        Set set2 = this.f16631v;
        this.f16631v = new HashSet(set);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            int id = h(i7).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void r() {
        TreeMap treeMap = new TreeMap(this.f16625p);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            treeMap.put(h(i7), Integer.valueOf(i7));
        }
        this.f16626q = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(H.k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f16623n);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f16620w, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i7, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f16622m.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        H.p0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f16624o.add(dVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public void f() {
        q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f16628s || this.f16631v.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f16631v.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            int id = h(i7).getId();
            if (this.f16631v.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i7, int i8) {
        Integer[] numArr = this.f16626q;
        if (numArr != null && i8 < numArr.length) {
            return numArr[i8].intValue();
        }
        Log.w(f16620w, "Child order wasn't updated");
        return i8;
    }

    public boolean l() {
        return this.f16628s;
    }

    void m(MaterialButton materialButton, boolean z6) {
        if (this.f16627r) {
            return;
        }
        e(materialButton.getId(), z6);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i7 = this.f16630u;
        if (i7 != -1) {
            q(Collections.singleton(Integer.valueOf(i7)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C.N0(accessibilityNodeInfo).i0(C.b.b(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        s();
        c();
        super.onMeasure(i7, i8);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f16622m.remove(iIndexOfChild);
        }
        s();
        c();
    }

    void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i7 = 0; i7 < childCount; i7++) {
            MaterialButton materialButtonH = h(i7);
            if (materialButtonH.getVisibility() != 8) {
                k.b bVarV = materialButtonH.getShapeAppearanceModel().v();
                p(bVarV, j(i7, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonH.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    public void setSelectionRequired(boolean z6) {
        this.f16629t = z6;
    }

    public void setSingleSelection(int i7) {
        setSingleSelection(getResources().getBoolean(i7));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f16621x;
        super(O3.a.c(context, attributeSet, i7, i8), attributeSet, i7);
        this.f16622m = new ArrayList();
        this.f16623n = new e(this, null);
        this.f16624o = new LinkedHashSet();
        this.f16625p = new a();
        this.f16627r = false;
        this.f16631v = new HashSet();
        TypedArray typedArrayH = l.h(getContext(), attributeSet, j.f298D2, i7, i8, new int[0]);
        setSingleSelection(typedArrayH.getBoolean(j.f319G2, false));
        this.f16630u = typedArrayH.getResourceId(j.f305E2, -1);
        this.f16629t = typedArrayH.getBoolean(j.f312F2, false);
        setChildrenDrawingOrderEnabled(true);
        typedArrayH.recycle();
        H.z0(this, 1);
    }

    public void setSingleSelection(boolean z6) {
        if (this.f16628s != z6) {
            this.f16628s = z6;
            f();
        }
    }
}
