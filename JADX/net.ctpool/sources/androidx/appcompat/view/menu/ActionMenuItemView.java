package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.S;
import androidx.appcompat.widget.l0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends D implements n.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f5314A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f5315B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f5316C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f5317D;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    i f5318t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CharSequence f5319u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f5320v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    g.b f5321w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private S f5322x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    b f5323y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f5324z;

    private class a extends S {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.S
        public p b() {
            b bVar = ActionMenuItemView.this.f5323y;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.S
        protected boolean c() {
            p pVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f5321w;
            return bVar != null && bVar.a(actionMenuItemView.f5318t) && (pVarB = b()) != null && pVarB.a();
        }
    }

    public static abstract class b {
        public abstract p a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean s() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        return i7 >= 480 || (i7 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void t() {
        boolean z6 = true;
        boolean z7 = !TextUtils.isEmpty(this.f5319u);
        if (this.f5320v != null && (!this.f5318t.B() || (!this.f5324z && !this.f5314A))) {
            z6 = false;
        }
        boolean z8 = z7 & z6;
        setText(z8 ? this.f5319u : null);
        CharSequence contentDescription = this.f5318t.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z8 ? null : this.f5318t.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f5318t.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            l0.a(this, z8 ? null : this.f5318t.getTitle());
        } else {
            l0.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return r();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return r() && this.f5318t.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i7) {
        this.f5318t = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.i(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f5322x == null) {
            this.f5322x = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f5318t;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f5321w;
        if (bVar != null) {
            bVar.a(this.f5318t);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5324z = s();
        t();
    }

    @Override // androidx.appcompat.widget.D, android.widget.TextView, android.view.View
    protected void onMeasure(int i7, int i8) {
        int i9;
        boolean zR = r();
        if (zR && (i9 = this.f5316C) >= 0) {
            super.setPadding(i9, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f5315B) : this.f5315B;
        if (mode != 1073741824 && this.f5315B > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i8);
        }
        if (zR || this.f5320v == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f5320v.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        S s6;
        if (this.f5318t.hasSubMenu() && (s6 = this.f5322x) != null && s6.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }

    public void setExpandedFormat(boolean z6) {
        if (this.f5314A != z6) {
            this.f5314A = z6;
            i iVar = this.f5318t;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f5320v = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f5317D;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        t();
    }

    public void setItemInvoker(g.b bVar) {
        this.f5321w = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i7, int i8, int i9, int i10) {
        this.f5316C = i7;
        super.setPadding(i7, i8, i9, i10);
    }

    public void setPopupCallback(b bVar) {
        this.f5323y = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f5319u = charSequence;
        t();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Resources resources = context.getResources();
        this.f5324z = s();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f19128v, i7, 0);
        this.f5315B = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.j.f19133w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f5317D = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f5316C = -1;
        setSaveEnabled(false);
    }
}
