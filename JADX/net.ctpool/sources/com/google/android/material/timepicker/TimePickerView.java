package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.H;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Chip f17302J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Chip f17303K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final ClockHandView f17304L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final ClockFaceView f17305M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final MaterialButtonToggleGroup f17306N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final View.OnClickListener f17307O;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.t(TimePickerView.this);
        }
    }

    class b implements MaterialButtonToggleGroup.d {
        b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i7, boolean z6) {
            TimePickerView.u(TimePickerView.this);
        }
    }

    class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.v(TimePickerView.this);
            return false;
        }
    }

    class d implements View.OnTouchListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ GestureDetector f17311m;

        d(GestureDetector gestureDetector) {
            this.f17311m = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f17311m.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface e {
    }

    interface f {
    }

    interface g {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ g t(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ f u(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ e v(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    private void w() {
        this.f17302J.setTag(A3.e.f185D, 12);
        this.f17303K.setTag(A3.e.f185D, 10);
        this.f17302J.setOnClickListener(this.f17307O);
        this.f17303K.setOnClickListener(this.f17307O);
        this.f17302J.setAccessibilityClassName("android.view.View");
        this.f17303K.setAccessibilityClassName("android.view.View");
    }

    private void x() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.f17302J.setOnTouchListener(dVar);
        this.f17303K.setOnTouchListener(dVar);
    }

    private void y() {
        if (this.f17306N.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.g(this);
            dVar.e(A3.e.f201g, H.B(this) == 0 ? 2 : 1);
            dVar.c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        if (view == this && i7 == 0) {
            y();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17307O = new a();
        LayoutInflater.from(context).inflate(A3.g.f231i, this);
        this.f17305M = (ClockFaceView) findViewById(A3.e.f202h);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(A3.e.f204j);
        this.f17306N = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new b());
        this.f17302J = (Chip) findViewById(A3.e.f207m);
        this.f17303K = (Chip) findViewById(A3.e.f205k);
        this.f17304L = (ClockHandView) findViewById(A3.e.f203i);
        x();
        w();
    }
}
