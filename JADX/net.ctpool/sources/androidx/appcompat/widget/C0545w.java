package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import e.AbstractC1609a;

/* JADX INFO: renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0545w extends RatingBar {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0543u f6228m;

    public C0545w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18720E);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        Bitmap bitmapB = this.f6228m.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i7, 0), getMeasuredHeight());
        }
    }

    public C0545w(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        d0.a(this, getContext());
        C0543u c0543u = new C0543u(this);
        this.f6228m = c0543u;
        c0543u.c(attributeSet, i7);
    }
}
