package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC0522b;
import e.AbstractC1609a;
import e.AbstractC1615g;
import f.AbstractC1641a;

/* JADX INFO: loaded from: classes.dex */
public class A extends Spinner {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int[] f5547u = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C0528e f5548m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f5549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private S f5550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SpinnerAdapter f5551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f5552q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private j f5553r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f5554s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Rect f5555t;

    class a extends S {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ h f5556v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, h hVar) {
            super(view);
            this.f5556v = hVar;
        }

        @Override // androidx.appcompat.widget.S
        public androidx.appcompat.view.menu.p b() {
            return this.f5556v;
        }

        @Override // androidx.appcompat.widget.S
        public boolean c() {
            if (A.this.getInternalPopup().a()) {
                return true;
            }
            A.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!A.this.getInternalPopup().a()) {
                A.this.b();
            }
            ViewTreeObserver viewTreeObserver = A.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    private static final class c {
        static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    private static final class d {
        static int a(View view) {
            return view.getTextAlignment();
        }

        static int b(View view) {
            return view.getTextDirection();
        }

        static void c(View view, int i7) {
            view.setTextAlignment(i7);
        }

        static void d(View view, int i7) {
            view.setTextDirection(i7);
        }
    }

    private static final class e {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (androidx.core.util.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    class f implements j, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        DialogInterfaceC0522b f5559m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ListAdapter f5560n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private CharSequence f5561o;

        f() {
        }

        @Override // androidx.appcompat.widget.A.j
        public boolean a() {
            DialogInterfaceC0522b dialogInterfaceC0522b = this.f5559m;
            if (dialogInterfaceC0522b != null) {
                return dialogInterfaceC0522b.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.A.j
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.A.j
        public void dismiss() {
            DialogInterfaceC0522b dialogInterfaceC0522b = this.f5559m;
            if (dialogInterfaceC0522b != null) {
                dialogInterfaceC0522b.dismiss();
                this.f5559m = null;
            }
        }

        @Override // androidx.appcompat.widget.A.j
        public void e(int i7) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.j
        public CharSequence f() {
            return this.f5561o;
        }

        @Override // androidx.appcompat.widget.A.j
        public Drawable h() {
            return null;
        }

        @Override // androidx.appcompat.widget.A.j
        public void i(CharSequence charSequence) {
            this.f5561o = charSequence;
        }

        @Override // androidx.appcompat.widget.A.j
        public void k(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.j
        public void l(int i7) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.j
        public void m(int i7) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.A.j
        public void n(int i7, int i8) {
            if (this.f5560n == null) {
                return;
            }
            DialogInterfaceC0522b.a aVar = new DialogInterfaceC0522b.a(A.this.getPopupContext());
            CharSequence charSequence = this.f5561o;
            if (charSequence != null) {
                aVar.m(charSequence);
            }
            DialogInterfaceC0522b dialogInterfaceC0522bA = aVar.l(this.f5560n, A.this.getSelectedItemPosition(), this).a();
            this.f5559m = dialogInterfaceC0522bA;
            ListView listViewL = dialogInterfaceC0522bA.l();
            d.d(listViewL, i7);
            d.c(listViewL, i8);
            this.f5559m.show();
        }

        @Override // androidx.appcompat.widget.A.j
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i7) {
            A.this.setSelection(i7);
            if (A.this.getOnItemClickListener() != null) {
                A.this.performItemClick(null, i7, this.f5560n.getItemId(i7));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.A.j
        public void p(ListAdapter listAdapter) {
            this.f5560n = listAdapter;
        }
    }

    private static class g implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private SpinnerAdapter f5563m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private ListAdapter f5564n;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f5563m = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f5564n = (ListAdapter) spinnerAdapter;
            }
            if (theme == null || !(spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                return;
            }
            e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f5564n;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f5563m;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f5563m;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i7, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i7) {
            SpinnerAdapter spinnerAdapter = this.f5563m;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i7);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i7) {
            SpinnerAdapter spinnerAdapter = this.f5563m;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i7);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i7) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i7, View view, ViewGroup viewGroup) {
            return getDropDownView(i7, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f5563m;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i7) {
            ListAdapter listAdapter = this.f5564n;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i7);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f5563m;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f5563m;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class h extends U implements j {

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        private CharSequence f5565U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        ListAdapter f5566V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        private final Rect f5567W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private int f5568X;

        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ A f5570m;

            a(A a7) {
                this.f5570m = a7;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
                A.this.setSelection(i7);
                if (A.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    A.this.performItemClick(view, i7, hVar.f5566V.getItemId(i7));
                }
                h.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.U(A.this)) {
                    h.this.dismiss();
                } else {
                    h.this.S();
                    h.super.b();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f5573m;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f5573m = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = A.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f5573m);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
            this.f5567W = new Rect();
            D(A.this);
            J(true);
            O(0);
            L(new a(A.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void S() {
            int i7;
            int iMax;
            Drawable drawableH = h();
            if (drawableH != null) {
                drawableH.getPadding(A.this.f5555t);
                i7 = r0.b(A.this) ? A.this.f5555t.right : -A.this.f5555t.left;
            } else {
                Rect rect = A.this.f5555t;
                rect.right = 0;
                rect.left = 0;
                i7 = 0;
            }
            int paddingLeft = A.this.getPaddingLeft();
            int paddingRight = A.this.getPaddingRight();
            int width = A.this.getWidth();
            A a7 = A.this;
            int i8 = a7.f5554s;
            if (i8 == -2) {
                int iA = a7.a((SpinnerAdapter) this.f5566V, h());
                int i9 = A.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = A.this.f5555t;
                int i10 = (i9 - rect2.left) - rect2.right;
                if (iA > i10) {
                    iA = i10;
                }
                iMax = Math.max(iA, (width - paddingLeft) - paddingRight);
            } else {
                if (i8 != -1) {
                    F(i8);
                    e(!r0.b(A.this) ? i7 + (((width - paddingRight) - z()) - T()) : i7 + paddingLeft + T());
                }
                iMax = (width - paddingLeft) - paddingRight;
            }
            F(iMax);
            e(!r0.b(A.this) ? i7 + (((width - paddingRight) - z()) - T()) : i7 + paddingLeft + T());
        }

        public int T() {
            return this.f5568X;
        }

        boolean U(View view) {
            return androidx.core.view.H.S(view) && view.getGlobalVisibleRect(this.f5567W);
        }

        @Override // androidx.appcompat.widget.A.j
        public CharSequence f() {
            return this.f5565U;
        }

        @Override // androidx.appcompat.widget.A.j
        public void i(CharSequence charSequence) {
            this.f5565U = charSequence;
        }

        @Override // androidx.appcompat.widget.A.j
        public void m(int i7) {
            this.f5568X = i7;
        }

        @Override // androidx.appcompat.widget.A.j
        public void n(int i7, int i8) {
            ViewTreeObserver viewTreeObserver;
            boolean zA = a();
            S();
            I(2);
            super.b();
            ListView listViewJ = j();
            listViewJ.setChoiceMode(1);
            d.d(listViewJ, i7);
            d.c(listViewJ, i8);
            P(A.this.getSelectedItemPosition());
            if (zA || (viewTreeObserver = A.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.U, androidx.appcompat.widget.A.j
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.f5566V = listAdapter;
        }
    }

    static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f5575m;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i7) {
                return new i[i7];
            }
        }

        i(Parcel parcel) {
            super(parcel);
            this.f5575m = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeByte(this.f5575m ? (byte) 1 : (byte) 0);
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    interface j {
        boolean a();

        int c();

        void dismiss();

        void e(int i7);

        CharSequence f();

        Drawable h();

        void i(CharSequence charSequence);

        void k(Drawable drawable);

        void l(int i7);

        void m(int i7);

        void n(int i7, int i8);

        int o();

        void p(ListAdapter listAdapter);
    }

    public A(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18723H);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i7 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f5555t);
        Rect rect = this.f5555t;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f5553r.n(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0528e c0528e = this.f5548m;
        if (c0528e != null) {
            c0528e.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j jVar = this.f5553r;
        return jVar != null ? jVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j jVar = this.f5553r;
        return jVar != null ? jVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f5553r != null ? this.f5554s : super.getDropDownWidth();
    }

    final j getInternalPopup() {
        return this.f5553r;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j jVar = this.f5553r;
        return jVar != null ? jVar.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f5549n;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j jVar = this.f5553r;
        return jVar != null ? jVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0528e c0528e = this.f5548m;
        if (c0528e != null) {
            return c0528e.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0528e c0528e = this.f5548m;
        if (c0528e != null) {
            return c0528e.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f5553r;
        if (jVar == null || !jVar.a()) {
            return;
        }
        this.f5553r.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.f5553r == null || View.MeasureSpec.getMode(i7) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (!iVar.f5575m || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f5553r;
        iVar.f5575m = jVar != null && jVar.a();
        return iVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        S s6 = this.f5550o;
        if (s6 == null || !s6.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        j jVar = this.f5553r;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.a()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0528e c0528e = this.f5548m;
        if (c0528e != null) {
            c0528e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C0528e c0528e = this.f5548m;
        if (c0528e != null) {
            c0528e.g(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i7) {
        j jVar = this.f5553r;
        if (jVar == null) {
            super.setDropDownHorizontalOffset(i7);
        } else {
            jVar.m(i7);
            this.f5553r.e(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i7) {
        j jVar = this.f5553r;
        if (jVar != null) {
            jVar.l(i7);
        } else {
            super.setDropDownVerticalOffset(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i7) {
        if (this.f5553r != null) {
            this.f5554s = i7;
        } else {
            super.setDropDownWidth(i7);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f5553r;
        if (jVar != null) {
            jVar.k(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i7) {
        setPopupBackgroundDrawable(AbstractC1641a.b(getPopupContext(), i7));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f5553r;
        if (jVar != null) {
            jVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0528e c0528e = this.f5548m;
        if (c0528e != null) {
            c0528e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0528e c0528e = this.f5548m;
        if (c0528e != null) {
            c0528e.j(mode);
        }
    }

    public A(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f5552q) {
            this.f5551p = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f5553r != null) {
            Context context = this.f5549n;
            if (context == null) {
                context = getContext();
            }
            this.f5553r.p(new g(spinnerAdapter, context.getTheme()));
        }
    }

    public A(Context context, AttributeSet attributeSet, int i7, int i8) {
        this(context, attributeSet, i7, i8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.A] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public A(Context context, AttributeSet attributeSet, int i7, int i8, Resources.Theme theme) throws Throwable {
        androidx.appcompat.view.d dVar;
        ?? r11;
        ?? r22;
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrQ;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i7);
        this.f5555t = new Rect();
        d0.a(this, getContext());
        h0 h0VarV = h0.v(context, attributeSet, e.j.f19141x2, i7, 0);
        this.f5548m = new C0528e(this);
        try {
            if (theme != null) {
                dVar = new androidx.appcompat.view.d(context, theme);
            } else {
                int iN = h0VarV.n(e.j.f18914C2, 0);
                if (iN == 0) {
                    this.f5549n = context;
                    r11 = -1;
                    r22 = 0;
                    if (i8 == -1) {
                        try {
                            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5547u, i7, 0);
                            try {
                                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
                                r11 = typedArrayObtainStyledAttributes;
                                if (zHasValue) {
                                    i8 = typedArrayObtainStyledAttributes.getInt(0, 0);
                                    r11 = typedArrayObtainStyledAttributes;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                                r11 = typedArrayObtainStyledAttributes;
                                if (typedArrayObtainStyledAttributes != null) {
                                }
                                if (i8 == 0) {
                                }
                                charSequenceArrQ = h0VarV.q(e.j.f19146y2);
                                if (charSequenceArrQ != null) {
                                }
                                h0VarV.w();
                                this.f5552q = true;
                                spinnerAdapter = this.f5551p;
                                if (spinnerAdapter != null) {
                                }
                                this.f5548m.e(attributeSet, i7);
                                return;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            typedArrayObtainStyledAttributes = null;
                        } catch (Throwable th) {
                            th = th;
                            if (r22 != 0) {
                                r22.recycle();
                            }
                            throw th;
                        }
                        r11.recycle();
                    }
                    if (i8 == 0) {
                        f fVar = new f();
                        this.f5553r = fVar;
                        fVar.i(h0VarV.o(e.j.f18904A2));
                    } else if (i8 == 1) {
                        h hVar = new h(this.f5549n, attributeSet, i7);
                        h0 h0VarV2 = h0.v(this.f5549n, attributeSet, e.j.f19141x2, i7, 0);
                        this.f5554s = h0VarV2.m(e.j.f18909B2, -2);
                        hVar.k(h0VarV2.g(e.j.f19151z2));
                        hVar.i(h0VarV.o(e.j.f18904A2));
                        h0VarV2.w();
                        this.f5553r = hVar;
                        this.f5550o = new a(this, hVar);
                    }
                    charSequenceArrQ = h0VarV.q(e.j.f19146y2);
                    if (charSequenceArrQ != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                        arrayAdapter.setDropDownViewResource(AbstractC1615g.f18882t);
                        setAdapter(arrayAdapter);
                    }
                    h0VarV.w();
                    this.f5552q = true;
                    spinnerAdapter = this.f5551p;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f5551p = null;
                    }
                    this.f5548m.e(attributeSet, i7);
                    return;
                }
                dVar = new androidx.appcompat.view.d(context, iN);
            }
            if (i8 == -1) {
            }
            if (i8 == 0) {
            }
            charSequenceArrQ = h0VarV.q(e.j.f19146y2);
            if (charSequenceArrQ != null) {
            }
            h0VarV.w();
            this.f5552q = true;
            spinnerAdapter = this.f5551p;
            if (spinnerAdapter != null) {
            }
            this.f5548m.e(attributeSet, i7);
            return;
        } catch (Throwable th2) {
            th = th2;
            r22 = r11;
        }
        this.f5549n = dVar;
        r11 = -1;
        r22 = 0;
    }
}
