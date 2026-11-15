package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.appcompat.app.y;
import androidx.core.view.C0574a;
import androidx.core.view.H;
import androidx.core.view.accessibility.C;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class h<S> extends o {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final Object f16797w = "MONTHS_VIEW_GROUP_TAG";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final Object f16798x = "NAVIGATION_PREV_TAG";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final Object f16799y = "NAVIGATION_NEXT_TAG";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final Object f16800z = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f16801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.google.android.material.datepicker.a f16802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.google.android.material.datepicker.k f16803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private k f16804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.google.android.material.datepicker.c f16805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RecyclerView f16806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private RecyclerView f16807t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View f16808u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f16809v;

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f16810m;

        a(int i7) {
            this.f16810m = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f16807t.o1(this.f16810m);
        }
    }

    class b extends C0574a {
        b() {
        }

        @Override // androidx.core.view.C0574a
        public void g(View view, C c7) {
            super.g(view, c7);
            c7.i0(null);
        }
    }

    class c extends p {

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f16813I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i7, boolean z6, int i8) {
            super(context, i7, z6);
            this.f16813I = i8;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void M1(RecyclerView.z zVar, int[] iArr) {
            if (this.f16813I == 0) {
                iArr[0] = h.this.f16807t.getWidth();
                iArr[1] = h.this.f16807t.getWidth();
            } else {
                iArr[0] = h.this.f16807t.getHeight();
                iArr[1] = h.this.f16807t.getHeight();
            }
        }
    }

    class d implements l {
        d() {
        }

        @Override // com.google.android.material.datepicker.h.l
        public void a(long j7) {
            if (h.this.f16802o.e().n(j7)) {
                h.w(h.this);
                throw null;
            }
        }
    }

    class e extends RecyclerView.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Calendar f16816a = r.i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Calendar f16817b = r.i();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if ((recyclerView.getAdapter() instanceof s) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                h.w(h.this);
                throw null;
            }
        }
    }

    class f extends C0574a {
        f() {
        }

        @Override // androidx.core.view.C0574a
        public void g(View view, C c7) {
            h hVar;
            int i7;
            super.g(view, c7);
            if (h.this.f16809v.getVisibility() == 0) {
                hVar = h.this;
                i7 = A3.h.f255o;
            } else {
                hVar = h.this;
                i7 = A3.h.f253m;
            }
            c7.q0(hVar.getString(i7));
        }
    }

    class g extends RecyclerView.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f16820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f16821b;

        g(m mVar, MaterialButton materialButton) {
            this.f16820a = mVar;
            this.f16821b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(RecyclerView recyclerView, int i7) {
            if (i7 == 0) {
                recyclerView.announceForAccessibility(this.f16821b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i7, int i8) {
            LinearLayoutManager linearLayoutManagerH = h.this.H();
            int iZ1 = i7 < 0 ? linearLayoutManagerH.Z1() : linearLayoutManagerH.c2();
            h.this.f16803p = this.f16820a.u(iZ1);
            this.f16821b.setText(this.f16820a.v(iZ1));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.h$h, reason: collision with other inner class name */
    class ViewOnClickListenerC0228h implements View.OnClickListener {
        ViewOnClickListenerC0228h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.M();
        }
    }

    class i implements View.OnClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ m f16824m;

        i(m mVar) {
            this.f16824m = mVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iZ1 = h.this.H().Z1() + 1;
            if (iZ1 < h.this.f16807t.getAdapter().c()) {
                h.this.K(this.f16824m.u(iZ1));
            }
        }
    }

    class j implements View.OnClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ m f16826m;

        j(m mVar) {
            this.f16826m = mVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iC2 = h.this.H().c2() - 1;
            if (iC2 >= 0) {
                h.this.K(this.f16826m.u(iC2));
            }
        }
    }

    enum k {
        DAY,
        YEAR
    }

    interface l {
        void a(long j7);
    }

    private RecyclerView.n A() {
        return new e();
    }

    static int F(Context context) {
        return context.getResources().getDimensionPixelSize(A3.c.f173y);
    }

    private static int G(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(A3.c.f138F) + resources.getDimensionPixelOffset(A3.c.f139G) + resources.getDimensionPixelOffset(A3.c.f137E);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(A3.c.f133A);
        int i7 = com.google.android.material.datepicker.l.f16871q;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(A3.c.f173y) * i7) + ((i7 - 1) * resources.getDimensionPixelOffset(A3.c.f136D)) + resources.getDimensionPixelOffset(A3.c.f171w);
    }

    public static h I(com.google.android.material.datepicker.d dVar, int i7, com.google.android.material.datepicker.a aVar) {
        h hVar = new h();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i7);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.h());
        hVar.setArguments(bundle);
        return hVar;
    }

    private void J(int i7) {
        this.f16807t.post(new a(i7));
    }

    static /* synthetic */ com.google.android.material.datepicker.d w(h hVar) {
        hVar.getClass();
        return null;
    }

    private void z(View view, m mVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(A3.e.f210p);
        materialButton.setTag(f16800z);
        H.p0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(A3.e.f212r);
        materialButton2.setTag(f16798x);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(A3.e.f211q);
        materialButton3.setTag(f16799y);
        this.f16808u = view.findViewById(A3.e.f219y);
        this.f16809v = view.findViewById(A3.e.f214t);
        L(k.DAY);
        materialButton.setText(this.f16803p.q());
        this.f16807t.k(new g(mVar, materialButton));
        materialButton.setOnClickListener(new ViewOnClickListenerC0228h());
        materialButton3.setOnClickListener(new i(mVar));
        materialButton2.setOnClickListener(new j(mVar));
    }

    com.google.android.material.datepicker.a B() {
        return this.f16802o;
    }

    com.google.android.material.datepicker.c C() {
        return this.f16805r;
    }

    com.google.android.material.datepicker.k D() {
        return this.f16803p;
    }

    public com.google.android.material.datepicker.d E() {
        return null;
    }

    LinearLayoutManager H() {
        return (LinearLayoutManager) this.f16807t.getLayoutManager();
    }

    void K(com.google.android.material.datepicker.k kVar) {
        RecyclerView recyclerView;
        int i7;
        m mVar = (m) this.f16807t.getAdapter();
        int iW = mVar.w(kVar);
        int iW2 = iW - mVar.w(this.f16803p);
        boolean z6 = Math.abs(iW2) > 3;
        boolean z7 = iW2 > 0;
        this.f16803p = kVar;
        if (!z6 || !z7) {
            if (z6) {
                recyclerView = this.f16807t;
                i7 = iW + 3;
            }
            J(iW);
        }
        recyclerView = this.f16807t;
        i7 = iW - 3;
        recyclerView.g1(i7);
        J(iW);
    }

    void L(k kVar) {
        this.f16804q = kVar;
        if (kVar == k.YEAR) {
            this.f16806s.getLayoutManager().x1(((s) this.f16806s.getAdapter()).t(this.f16803p.f16866o));
            this.f16808u.setVisibility(0);
            this.f16809v.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f16808u.setVisibility(8);
            this.f16809v.setVisibility(0);
            K(this.f16803p);
        }
    }

    void M() {
        k kVar = this.f16804q;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            L(k.DAY);
        } else if (kVar == k.DAY) {
            L(kVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f16801n = bundle.getInt("THEME_RES_ID_KEY");
        y.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f16802o = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f16803p = (com.google.android.material.datepicker.k) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7;
        int i8;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f16801n);
        this.f16805r = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.k kVarI = this.f16802o.i();
        if (com.google.android.material.datepicker.i.D(contextThemeWrapper)) {
            i7 = A3.g.f237o;
            i8 = 1;
        } else {
            i7 = A3.g.f235m;
            i8 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i7, viewGroup, false);
        viewInflate.setMinimumHeight(G(requireContext()));
        GridView gridView = (GridView) viewInflate.findViewById(A3.e.f215u);
        H.p0(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.g());
        gridView.setNumColumns(kVarI.f16867p);
        gridView.setEnabled(false);
        this.f16807t = (RecyclerView) viewInflate.findViewById(A3.e.f218x);
        this.f16807t.setLayoutManager(new c(getContext(), i8, false, i8));
        this.f16807t.setTag(f16797w);
        m mVar = new m(contextThemeWrapper, null, this.f16802o, new d());
        this.f16807t.setAdapter(mVar);
        int integer = contextThemeWrapper.getResources().getInteger(A3.f.f222b);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(A3.e.f219y);
        this.f16806s = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f16806s.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f16806s.setAdapter(new s(this));
            this.f16806s.h(A());
        }
        if (viewInflate.findViewById(A3.e.f210p) != null) {
            z(viewInflate, mVar);
        }
        if (!com.google.android.material.datepicker.i.D(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.f16807t);
        }
        this.f16807t.g1(mVar.w(this.f16803p));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f16801n);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f16802o);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f16803p);
    }

    @Override // com.google.android.material.datepicker.o
    public boolean s(n nVar) {
        return super.s(nVar);
    }
}
