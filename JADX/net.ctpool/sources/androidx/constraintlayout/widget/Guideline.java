package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i7) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f6323a = i7;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i7) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f6325b = i7;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f7) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f6327c = f7;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
