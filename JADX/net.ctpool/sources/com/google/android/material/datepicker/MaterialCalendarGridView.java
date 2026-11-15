package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.C0574a;
import androidx.core.view.H;
import androidx.core.view.accessibility.C;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Calendar f16763m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f16764n;

    class a extends C0574a {
        a() {
        }

        @Override // androidx.core.view.C0574a
        public void g(View view, C c7) {
            super.g(view, c7);
            c7.i0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i7, Rect rect) {
        int iB;
        if (i7 == 33) {
            iB = getAdapter().g();
        } else {
            if (i7 != 130) {
                super.onFocusChanged(true, i7, rect);
                return;
            }
            iB = getAdapter().b();
        }
        setSelection(iB);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l getAdapter() {
        return (l) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        l adapter = getAdapter();
        adapter.getClass();
        int iMax = Math.max(adapter.b(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.g(), getLastVisiblePosition());
        adapter.getItem(iMax);
        adapter.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z6, int i7, Rect rect) {
        if (z6) {
            a(i7, rect);
        } else {
            super.onFocusChanged(false, i7, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (!super.onKeyDown(i7, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i7) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i7, int i8) {
        if (!this.f16764n) {
            super.onMeasure(i7, i8);
            return;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i7) {
        if (i7 < getAdapter().b()) {
            i7 = getAdapter().b();
        }
        super.setSelection(i7);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f16763m = r.i();
        if (i.D(getContext())) {
            setNextFocusLeftId(A3.e.f195a);
            setNextFocusRightId(A3.e.f197c);
        }
        this.f16764n = i.E(getContext());
        H.p0(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof l)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), l.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
