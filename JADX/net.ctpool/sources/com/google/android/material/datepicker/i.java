package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.y;
import androidx.core.view.C;
import androidx.core.view.H;
import androidx.core.view.U;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e;
import androidx.fragment.app.E;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import f.AbstractC1641a;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class i<S> extends DialogInterfaceOnCancelListenerC0635e {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    static final Object f16831H = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    static final Object f16832I = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    static final Object f16833J = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f16834A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private CharSequence f16835B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private TextView f16836C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private CheckableImageButton f16837D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private N3.g f16838E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private Button f16839F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f16840G;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final LinkedHashSet f16841m = new LinkedHashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final LinkedHashSet f16842n = new LinkedHashSet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final LinkedHashSet f16843o = new LinkedHashSet();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final LinkedHashSet f16844p = new LinkedHashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f16845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private o f16846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.google.android.material.datepicker.a f16847s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private h f16848t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f16849u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private CharSequence f16850v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f16851w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f16852x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f16853y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CharSequence f16854z;

    class a implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f16856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f16857c;

        a(int i7, View view, int i8) {
            this.f16855a = i7;
            this.f16856b = view;
            this.f16857c = i8;
        }

        @Override // androidx.core.view.C
        public U a(View view, U u6) {
            int i7 = u6.f(U.m.f()).f7121b;
            if (this.f16855a >= 0) {
                this.f16856b.getLayoutParams().height = this.f16855a + i7;
                View view2 = this.f16856b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f16856b;
            view3.setPadding(view3.getPaddingLeft(), this.f16857c + i7, this.f16856b.getPaddingRight(), this.f16856b.getPaddingBottom());
            return u6;
        }
    }

    class b extends n {
        b() {
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Button unused = i.this.f16839F;
            i.u(i.this);
            throw null;
        }
    }

    private static int A(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(A3.c.f172x);
        int i7 = k.k().f16867p;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(A3.c.f174z) * i7) + ((i7 - 1) * resources.getDimensionPixelOffset(A3.c.f135C));
    }

    private int B(Context context) {
        int i7 = this.f16845q;
        if (i7 != 0) {
            return i7;
        }
        y();
        throw null;
    }

    private void C(Context context) {
        this.f16837D.setTag(f16833J);
        this.f16837D.setImageDrawable(w(context));
        this.f16837D.setChecked(this.f16852x != 0);
        H.p0(this.f16837D, null);
        I(this.f16837D);
        this.f16837D.setOnClickListener(new c());
    }

    static boolean D(Context context) {
        return F(context, R.attr.windowFullscreen);
    }

    static boolean E(Context context) {
        return F(context, A3.a.f123w);
    }

    static boolean F(Context context, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(K3.b.c(context, A3.a.f120t, h.class.getCanonicalName()), new int[]{i7});
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z6;
    }

    private void G() {
        o oVarU;
        int iB = B(requireContext());
        y();
        this.f16848t = h.I(null, iB, this.f16847s);
        if (this.f16837D.isChecked()) {
            y();
            oVarU = j.u(null, iB, this.f16847s);
        } else {
            oVarU = this.f16848t;
        }
        this.f16846r = oVarU;
        H();
        E eP = getChildFragmentManager().p();
        eP.n(A3.e.f216v, this.f16846r);
        eP.i();
        this.f16846r.s(new b());
    }

    private void H() {
        String strZ = z();
        this.f16836C.setContentDescription(String.format(getString(A3.h.f249i), strZ));
        this.f16836C.setText(strZ);
    }

    private void I(CheckableImageButton checkableImageButton) {
        this.f16837D.setContentDescription(checkableImageButton.getContext().getString(this.f16837D.isChecked() ? A3.h.f252l : A3.h.f254n));
    }

    static /* synthetic */ d u(i iVar) {
        iVar.y();
        return null;
    }

    private static Drawable w(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC1641a.b(context, A3.d.f176b));
        stateListDrawable.addState(new int[0], AbstractC1641a.b(context, A3.d.f177c));
        return stateListDrawable;
    }

    private void x(Window window) {
        if (this.f16840G) {
            return;
        }
        View viewFindViewById = requireView().findViewById(A3.e.f200f);
        com.google.android.material.internal.d.a(window, true, com.google.android.material.internal.n.c(viewFindViewById), null);
        H.C0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f16840G = true;
    }

    private d y() {
        y.a(getArguments().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f16843o.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f16845q = bundle.getInt("OVERRIDE_THEME_RES_ID");
        y.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f16847s = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f16849u = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f16850v = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f16852x = bundle.getInt("INPUT_MODE_KEY");
        this.f16853y = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f16854z = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f16834A = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f16835B = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), B(requireContext()));
        Context context = dialog.getContext();
        this.f16851w = D(context);
        int iC = K3.b.c(context, A3.a.f112l, i.class.getCanonicalName());
        N3.g gVar = new N3.g(context, null, A3.a.f120t, A3.i.f271o);
        this.f16838E = gVar;
        gVar.L(context);
        this.f16838E.V(ColorStateList.valueOf(iC));
        this.f16838E.U(H.w(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewFindViewById;
        LinearLayout.LayoutParams layoutParams;
        View viewInflate = layoutInflater.inflate(this.f16851w ? A3.g.f240r : A3.g.f239q, viewGroup);
        Context context = viewInflate.getContext();
        if (this.f16851w) {
            viewFindViewById = viewInflate.findViewById(A3.e.f216v);
            layoutParams = new LinearLayout.LayoutParams(A(context), -2);
        } else {
            viewFindViewById = viewInflate.findViewById(A3.e.f217w);
            layoutParams = new LinearLayout.LayoutParams(A(context), -1);
        }
        viewFindViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) viewInflate.findViewById(A3.e.f220z);
        this.f16836C = textView;
        H.r0(textView, 1);
        this.f16837D = (CheckableImageButton) viewInflate.findViewById(A3.e.f182A);
        TextView textView2 = (TextView) viewInflate.findViewById(A3.e.f183B);
        CharSequence charSequence = this.f16850v;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f16849u);
        }
        C(context);
        this.f16839F = (Button) viewInflate.findViewById(A3.e.f197c);
        y();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f16844p.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f16845q);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a.b bVar = new a.b(this.f16847s);
        if (this.f16848t.D() != null) {
            bVar.b(this.f16848t.D().f16869r);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f16849u);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f16850v);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f16853y);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f16854z);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f16834A);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f16835B);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f16851w) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f16838E);
            x(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(A3.c.f134B);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f16838E, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new F3.a(requireDialog(), rect));
        }
        G();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e, androidx.fragment.app.Fragment
    public void onStop() {
        this.f16846r.t();
        super.onStop();
    }

    public String z() {
        y();
        getContext();
        throw null;
    }
}
