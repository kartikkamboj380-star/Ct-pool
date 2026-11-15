package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import r.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends View {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int[] f6389m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f6390n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected Context f6391o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected h f6392p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f6393q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected String f6394r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View[] f6395s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private HashMap f6396t;

    public b(Context context) {
        super(context);
        this.f6389m = new int[32];
        this.f6393q = false;
        this.f6395s = null;
        this.f6396t = new HashMap();
        this.f6391o = context;
        e(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f6391o == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iD = d(strTrim);
        if (iD != 0) {
            this.f6396t.put(Integer.valueOf(iD), strTrim);
            b(iD);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void b(int i7) {
        if (i7 == getId()) {
            return;
        }
        int i8 = this.f6390n + 1;
        int[] iArr = this.f6389m;
        if (i8 > iArr.length) {
            this.f6389m = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f6389m;
        int i9 = this.f6390n;
        iArr2[i9] = i7;
        this.f6390n = i9 + 1;
    }

    private int c(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f6391o.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int d(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iC = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objF = constraintLayout.f(0, str);
            if (objF instanceof Integer) {
                iC = ((Integer) objF).intValue();
            }
        }
        if (iC == 0 && constraintLayout != null) {
            iC = c(constraintLayout, str);
        }
        if (iC == 0) {
            try {
                iC = f.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iC == 0 ? this.f6391o.getResources().getIdentifier(str, "id", this.f6391o.getPackageName()) : iC;
    }

    protected void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f6666a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == g.f6726k1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f6394r = string;
                    setIds(string);
                }
            }
        }
    }

    public abstract void f(r.e eVar, boolean z6);

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f6389m, this.f6390n);
    }

    public void h(ConstraintLayout constraintLayout) {
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
        String str;
        int iC;
        if (isInEditMode()) {
            setIds(this.f6394r);
        }
        h hVar = this.f6392p;
        if (hVar == null) {
            return;
        }
        hVar.b();
        for (int i7 = 0; i7 < this.f6390n; i7++) {
            int i8 = this.f6389m[i7];
            View viewH = constraintLayout.h(i8);
            if (viewH == null && (iC = c(constraintLayout, (str = (String) this.f6396t.get(Integer.valueOf(i8))))) != 0) {
                this.f6389m[i7] = iC;
                this.f6396t.put(Integer.valueOf(iC), str);
                viewH = constraintLayout.h(iC);
            }
            if (viewH != null) {
                this.f6392p.c(constraintLayout.i(viewH));
            }
        }
        this.f6392p.a(constraintLayout.f6284o);
    }

    public void k() {
        if (this.f6392p == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f6350n0 = (r.e) this.f6392p;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f6394r;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        if (this.f6393q) {
            super.onMeasure(i7, i8);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f6394r = str;
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f6390n = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i7);
            if (iIndexOf == -1) {
                a(str.substring(i7));
                return;
            } else {
                a(str.substring(i7, iIndexOf));
                i7 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f6394r = null;
        this.f6390n = 0;
        for (int i7 : iArr) {
            b(i7);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6389m = new int[32];
        this.f6393q = false;
        this.f6395s = null;
        this.f6396t = new HashMap();
        this.f6391o = context;
        e(attributeSet);
    }
}
