package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class l extends BaseAdapter {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final int f16871q = r.i().getMaximum(4);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final k f16872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Collection f16873n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    c f16874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final a f16875p;

    l(k kVar, d dVar, a aVar) {
        this.f16872m = kVar;
        this.f16875p = aVar;
        this.f16873n = dVar.o();
    }

    private void e(Context context) {
        if (this.f16874o == null) {
            this.f16874o = new c(context);
        }
    }

    private boolean f(long j7) {
        throw null;
    }

    private void i(TextView textView, long j7) {
        b bVar;
        if (textView == null) {
            return;
        }
        if (this.f16875p.e().n(j7)) {
            textView.setEnabled(true);
            bVar = f(j7) ? this.f16874o.f16785b : r.g().getTimeInMillis() == j7 ? this.f16874o.f16786c : this.f16874o.f16784a;
        } else {
            textView.setEnabled(false);
            bVar = this.f16874o.f16790g;
        }
        bVar.b(textView);
    }

    private void j(MaterialCalendarGridView materialCalendarGridView, long j7) {
        if (k.j(j7).equals(this.f16872m)) {
            i((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.f16872m.p(j7)) - materialCalendarGridView.getFirstVisiblePosition()), j7);
        }
    }

    int a(int i7) {
        return b() + (i7 - 1);
    }

    int b() {
        return this.f16872m.l();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i7) {
        if (i7 < this.f16872m.l() || i7 > g()) {
            return null;
        }
        return Long.valueOf(this.f16872m.m(h(i7)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextView getView(int i7, View view, ViewGroup viewGroup) {
        e(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(A3.g.f233k, viewGroup, false);
        }
        int iB = i7 - b();
        if (iB >= 0) {
            k kVar = this.f16872m;
            if (iB >= kVar.f16868q) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                int i8 = iB + 1;
                textView.setTag(kVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i8)));
                long jM = this.f16872m.m(i8);
                textView.setContentDescription(this.f16872m.f16866o == k.k().f16866o ? e.a(jM) : e.d(jM));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        }
        Long item = getItem(i7);
        if (item == null) {
            return textView;
        }
        i(textView, item.longValue());
        return textView;
    }

    int g() {
        return (this.f16872m.l() + this.f16872m.f16868q) - 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f16872m.f16868q + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        return i7 / this.f16872m.f16867p;
    }

    int h(int i7) {
        return (i7 - this.f16872m.l()) + 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public void k(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f16873n.iterator();
        while (it.hasNext()) {
            j(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    boolean l(int i7) {
        return i7 >= b() && i7 <= g();
    }
}
