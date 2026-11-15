package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.H;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;

/* JADX INFO: loaded from: classes.dex */
class m extends RecyclerView.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f16876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h.l f16877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f16878e;

    class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f16879m;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f16879m = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
            if (this.f16879m.getAdapter().l(i7)) {
                m.this.f16877d.a(this.f16879m.getAdapter().getItem(i7).longValue());
            }
        }
    }

    public static class b extends RecyclerView.C {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final TextView f16881t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final MaterialCalendarGridView f16882u;

        b(LinearLayout linearLayout, boolean z6) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(A3.e.f213s);
            this.f16881t = textView;
            H.q0(textView, true);
            this.f16882u = (MaterialCalendarGridView) linearLayout.findViewById(A3.e.f209o);
            if (z6) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    m(Context context, d dVar, com.google.android.material.datepicker.a aVar, h.l lVar) {
        k kVarI = aVar.i();
        k kVarF = aVar.f();
        k kVarH = aVar.h();
        if (kVarI.compareTo(kVarH) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (kVarH.compareTo(kVarF) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f16878e = (l.f16871q * h.F(context)) + (i.D(context) ? h.F(context) : 0);
        this.f16876c = aVar;
        this.f16877d = lVar;
        r(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f16876c.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long d(int i7) {
        return this.f16876c.i().s(i7).r();
    }

    k u(int i7) {
        return this.f16876c.i().s(i7);
    }

    CharSequence v(int i7) {
        return u(i7).q();
    }

    int w(k kVar) {
        return this.f16876c.i().t(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void i(b bVar, int i7) {
        k kVarS = this.f16876c.i().s(i7);
        bVar.f16881t.setText(kVarS.q());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f16882u.findViewById(A3.e.f209o);
        if (materialCalendarGridView.getAdapter() == null || !kVarS.equals(materialCalendarGridView.getAdapter().f16872m)) {
            l lVar = new l(kVarS, null, this.f16876c);
            materialCalendarGridView.setNumColumns(kVarS.f16867p);
            materialCalendarGridView.setAdapter((ListAdapter) lVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().k(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public b k(ViewGroup viewGroup, int i7) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(A3.g.f236n, viewGroup, false);
        if (!i.D(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f16878e));
        return new b(linearLayout, true);
    }
}
