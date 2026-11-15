package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import e.AbstractC1609a;

/* JADX INFO: renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0547y extends SeekBar {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0548z f6229m;

    public C0547y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18722G);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f6229m.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f6229m.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f6229m.g(canvas);
    }

    public C0547y(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        d0.a(this, getContext());
        C0548z c0548z = new C0548z(this);
        this.f6229m = c0548z;
        c0548z.c(attributeSet, i7);
    }
}
