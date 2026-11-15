package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: renamed from: androidx.core.view.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0602w {
    public static boolean a(MotionEvent motionEvent, int i7) {
        return (motionEvent.getSource() & i7) == i7;
    }
}
