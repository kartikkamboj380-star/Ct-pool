package K2;

import android.content.Context;
import com.facebook.react.views.view.i;
import e2.C1619a;

/* JADX INFO: loaded from: classes.dex */
public class c extends i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1849m;

    public c(Context context) {
        super(context);
        this.f1849m = com.facebook.react.modules.i18nmanager.a.f().i(context) ? 1 : 0;
    }

    @Override // android.view.View, android.view.ViewParent
    public int getLayoutDirection() {
        return C1619a.d() ? super.getLayoutDirection() : this.f1849m;
    }

    @Override // com.facebook.react.views.view.i, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        if (getLayoutDirection() == 1) {
            setLeft(0);
            setTop(i8);
            setRight(i9 - i7);
            setBottom(i10);
        }
    }

    @Override // com.facebook.react.views.view.i
    public void setRemoveClippedSubviews(boolean z6) {
        if (getLayoutDirection() == 1) {
            super.setRemoveClippedSubviews(false);
        } else {
            super.setRemoveClippedSubviews(z6);
        }
    }
}
