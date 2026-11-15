package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class g extends BaseAdapter {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f16793p;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Calendar f16794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f16795n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f16796o;

    static {
        f16793p = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar calendarI = r.i();
        this.f16794m = calendarI;
        this.f16795n = calendarI.getMaximum(7);
        this.f16796o = calendarI.getFirstDayOfWeek();
    }

    private int b(int i7) {
        int i8 = i7 + this.f16796o;
        int i9 = this.f16795n;
        return i8 > i9 ? i8 - i9 : i8;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i7) {
        if (i7 >= this.f16795n) {
            return null;
        }
        return Integer.valueOf(b(i7));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f16795n;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i7, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(A3.g.f234l, viewGroup, false);
        }
        this.f16794m.set(7, b(i7));
        textView.setText(this.f16794m.getDisplayName(7, f16793p, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(A3.h.f250j), this.f16794m.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
