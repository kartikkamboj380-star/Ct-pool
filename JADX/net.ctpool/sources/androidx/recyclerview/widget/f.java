package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f8845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f8846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f8847e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f8850h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f8851i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f8843a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f8848f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f8849g = 0;

    f() {
    }

    boolean a(RecyclerView.z zVar) {
        int i7 = this.f8845c;
        return i7 >= 0 && i7 < zVar.b();
    }

    View b(RecyclerView.u uVar) {
        View viewO = uVar.o(this.f8845c);
        this.f8845c += this.f8846d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f8844b + ", mCurrentPosition=" + this.f8845c + ", mItemDirection=" + this.f8846d + ", mLayoutDirection=" + this.f8847e + ", mStartLine=" + this.f8848f + ", mEndLine=" + this.f8849g + '}';
    }
}
