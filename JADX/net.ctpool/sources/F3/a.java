package F3;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Dialog f1073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f1074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f1075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f1076p;

    public a(Dialog dialog, Rect rect) {
        this.f1073m = dialog;
        this.f1074n = rect.left;
        this.f1075o = rect.top;
        this.f1076p = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f1074n + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f1075o + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i7 = this.f1076p;
            motionEventObtain.setLocation((-i7) - 1, (-i7) - 1);
        }
        view.performClick();
        return this.f1073m.onTouchEvent(motionEventObtain);
    }
}
