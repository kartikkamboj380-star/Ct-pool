package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import r.C2004a;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f6270u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f6271v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private C2004a f6272w;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m(r.e eVar, int i7, boolean z6) {
        this.f6271v = i7;
        if (z6) {
            int i8 = this.f6270u;
            if (i8 == 5) {
                this.f6271v = 1;
            } else if (i8 == 6) {
                this.f6271v = 0;
            }
        } else {
            int i9 = this.f6270u;
            if (i9 != 5) {
                if (i9 == 6) {
                }
            }
        }
        if (eVar instanceof C2004a) {
            ((C2004a) eVar).L0(this.f6271v);
        }
    }

    @Override // androidx.constraintlayout.widget.b
    protected void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        this.f6272w = new C2004a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f6666a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == g.f6708h1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == g.f6702g1) {
                    this.f6272w.K0(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == g.f6714i1) {
                    this.f6272w.M0(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f6392p = this.f6272w;
        k();
    }

    @Override // androidx.constraintlayout.widget.b
    public void f(r.e eVar, boolean z6) {
        m(eVar, this.f6270u, z6);
    }

    public int getMargin() {
        return this.f6272w.I0();
    }

    public int getType() {
        return this.f6270u;
    }

    public boolean l() {
        return this.f6272w.G0();
    }

    public void setAllowsGoneWidget(boolean z6) {
        this.f6272w.K0(z6);
    }

    public void setDpMargin(int i7) {
        this.f6272w.M0((int) ((i7 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i7) {
        this.f6272w.M0(i7);
    }

    public void setType(int i7) {
        this.f6270u = i7;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
