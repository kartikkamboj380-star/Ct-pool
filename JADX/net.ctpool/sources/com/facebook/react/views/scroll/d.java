package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0574a;
import androidx.core.view.accessibility.C;
import com.facebook.react.AbstractC0831n;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.I;

/* JADX INFO: loaded from: classes.dex */
class d extends C0574a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12955d = d.class.getSimpleName();

    d() {
    }

    private void n(View view, AccessibilityEvent accessibilityEvent) {
        boolean zA;
        View childAt;
        ReadableMap readableMap;
        ReadableMap readableMap2 = (ReadableMap) view.getTag(AbstractC0831n.f11972b);
        if (readableMap2 == null) {
            return;
        }
        accessibilityEvent.setItemCount(readableMap2.getInt("itemCount"));
        if (!(view instanceof ViewGroup)) {
            return;
        }
        View childAt2 = ((ViewGroup) view).getChildAt(0);
        if (!(childAt2 instanceof ViewGroup)) {
            return;
        }
        Integer numValueOf = null;
        int i7 = 0;
        Integer numValueOf2 = null;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) childAt2;
            if (i7 >= viewGroup.getChildCount()) {
                return;
            }
            View childAt3 = viewGroup.getChildAt(i7);
            if (view instanceof c) {
                zA = ((c) view).x(childAt3);
            } else if (!(view instanceof b)) {
                return;
            } else {
                zA = ((b) view).A(childAt3);
            }
            ReadableMap readableMap3 = (ReadableMap) childAt3.getTag(AbstractC0831n.f11973c);
            if (!(childAt3 instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) childAt3;
            if (viewGroup2.getChildCount() > 0 && readableMap3 == null && (childAt = viewGroup2.getChildAt(0)) != null && (readableMap = (ReadableMap) childAt.getTag(AbstractC0831n.f11973c)) != null) {
                readableMap3 = readableMap;
            }
            if (zA && readableMap3 != null) {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(readableMap3.getInt("itemIndex"));
                }
                numValueOf2 = Integer.valueOf(readableMap3.getInt("itemIndex"));
            }
            if (numValueOf != null && numValueOf2 != null) {
                accessibilityEvent.setFromIndex(numValueOf.intValue());
                accessibilityEvent.setToIndex(numValueOf2.intValue());
            }
            i7++;
        }
    }

    private void o(View view, C c7) {
        boolean scrollEnabled;
        I.e eVarK = I.e.k(view);
        if (eVarK != null) {
            I.l0(c7, eVarK, view.getContext());
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(AbstractC0831n.f11972b);
        if (readableMap != null) {
            c7.i0(C.b.a(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
        }
        if (view instanceof c) {
            scrollEnabled = ((c) view).getScrollEnabled();
        } else if (!(view instanceof b)) {
            return;
        } else {
            scrollEnabled = ((b) view).getScrollEnabled();
        }
        c7.B0(scrollEnabled);
    }

    @Override // androidx.core.view.C0574a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if ((view instanceof c) || (view instanceof b)) {
            n(view, accessibilityEvent);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(this.f12955d, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: " + view.getClass().getSimpleName()));
    }

    @Override // androidx.core.view.C0574a
    public void g(View view, C c7) {
        super.g(view, c7);
        if ((view instanceof c) || (view instanceof b)) {
            o(view, c7);
            return;
        }
        ReactSoftExceptionLogger.logSoftException(this.f12955d, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: " + view.getClass().getSimpleName()));
    }
}
