package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.h0;
import androidx.core.view.H;
import e.AbstractC1609a;
import e.AbstractC1614f;
import e.AbstractC1615g;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f5329A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private LayoutInflater f5330B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f5331C;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private i f5332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView f5333n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private RadioButton f5334o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f5335p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CheckBox f5336q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f5337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ImageView f5338s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView f5339t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private LinearLayout f5340u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f5341v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f5342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Context f5343x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f5344y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f5345z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18716A);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i7) {
        LinearLayout linearLayout = this.f5340u;
        if (linearLayout != null) {
            linearLayout.addView(view, i7);
        } else {
            addView(view, i7);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(AbstractC1615g.f18870h, (ViewGroup) this, false);
        this.f5336q = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(AbstractC1615g.f18871i, (ViewGroup) this, false);
        this.f5333n = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(AbstractC1615g.f18873k, (ViewGroup) this, false);
        this.f5334o = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f5330B == null) {
            this.f5330B = LayoutInflater.from(getContext());
        }
        return this.f5330B;
    }

    private void setSubMenuArrowVisible(boolean z6) {
        ImageView imageView = this.f5338s;
        if (imageView != null) {
            imageView.setVisibility(z6 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f5339t;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5339t.getLayoutParams();
        rect.top += this.f5339t.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i7) {
        this.f5332m = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f5332m;
    }

    public void h(boolean z6, char c7) {
        int i7 = (z6 && this.f5332m.A()) ? 0 : 8;
        if (i7 == 0) {
            this.f5337r.setText(this.f5332m.h());
        }
        if (this.f5337r.getVisibility() != i7) {
            this.f5337r.setVisibility(i7);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        H.t0(this, this.f5341v);
        TextView textView = (TextView) findViewById(AbstractC1614f.f18833M);
        this.f5335p = textView;
        int i7 = this.f5342w;
        if (i7 != -1) {
            textView.setTextAppearance(this.f5343x, i7);
        }
        this.f5337r = (TextView) findViewById(AbstractC1614f.f18826F);
        ImageView imageView = (ImageView) findViewById(AbstractC1614f.f18829I);
        this.f5338s = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f5345z);
        }
        this.f5339t = (ImageView) findViewById(AbstractC1614f.f18854r);
        this.f5340u = (LinearLayout) findViewById(AbstractC1614f.f18848l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        if (this.f5333n != null && this.f5344y) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f5333n.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i7, i8);
    }

    public void setCheckable(boolean z6) {
        CompoundButton compoundButton;
        View view;
        if (!z6 && this.f5334o == null && this.f5336q == null) {
            return;
        }
        if (this.f5332m.m()) {
            if (this.f5334o == null) {
                g();
            }
            compoundButton = this.f5334o;
            view = this.f5336q;
        } else {
            if (this.f5336q == null) {
                c();
            }
            compoundButton = this.f5336q;
            view = this.f5334o;
        }
        if (z6) {
            compoundButton.setChecked(this.f5332m.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f5336q;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f5334o;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z6) {
        CompoundButton compoundButton;
        if (this.f5332m.m()) {
            if (this.f5334o == null) {
                g();
            }
            compoundButton = this.f5334o;
        } else {
            if (this.f5336q == null) {
                c();
            }
            compoundButton = this.f5336q;
        }
        compoundButton.setChecked(z6);
    }

    public void setForceShowIcon(boolean z6) {
        this.f5331C = z6;
        this.f5344y = z6;
    }

    public void setGroupDividerEnabled(boolean z6) {
        ImageView imageView = this.f5339t;
        if (imageView != null) {
            imageView.setVisibility((this.f5329A || !z6) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z6 = this.f5332m.z() || this.f5331C;
        if (z6 || this.f5344y) {
            ImageView imageView = this.f5333n;
            if (imageView == null && drawable == null && !this.f5344y) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f5344y) {
                this.f5333n.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f5333n;
            if (!z6) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f5333n.getVisibility() != 0) {
                this.f5333n.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i7;
        TextView textView;
        if (charSequence != null) {
            this.f5335p.setText(charSequence);
            if (this.f5335p.getVisibility() == 0) {
                return;
            }
            textView = this.f5335p;
            i7 = 0;
        } else {
            i7 = 8;
            if (this.f5335p.getVisibility() == 8) {
                return;
            } else {
                textView = this.f5335p;
            }
        }
        textView.setVisibility(i7);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        h0 h0VarV = h0.v(getContext(), attributeSet, e.j.f18997T1, i7, 0);
        this.f5341v = h0VarV.g(e.j.f19005V1);
        this.f5342w = h0VarV.n(e.j.f19001U1, -1);
        this.f5344y = h0VarV.a(e.j.f19009W1, false);
        this.f5343x = context;
        this.f5345z = h0VarV.g(e.j.f19013X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC1609a.f18751x, 0);
        this.f5329A = typedArrayObtainStyledAttributes.hasValue(0);
        h0VarV.w();
        typedArrayObtainStyledAttributes.recycle();
    }
}
