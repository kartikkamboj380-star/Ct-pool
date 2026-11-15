package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class s extends RecyclerView.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f16889c;

    public static class a extends RecyclerView.C {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final TextView f16890t;

        a(TextView textView) {
            super(textView);
            this.f16890t = textView;
        }
    }

    s(h hVar) {
        this.f16889c = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f16889c.B().j();
    }

    int t(int i7) {
        return i7 - this.f16889c.B().i().f16866o;
    }

    int u(int i7) {
        return this.f16889c.B().i().f16866o + i7;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void i(a aVar, int i7) {
        int iU = u(i7);
        String string = aVar.f16890t.getContext().getString(A3.h.f251k);
        aVar.f16890t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iU)));
        aVar.f16890t.setContentDescription(String.format(string, Integer.valueOf(iU)));
        c cVarC = this.f16889c.C();
        if (r.g().get(1) == iU) {
            b bVar = cVarC.f16789f;
        } else {
            b bVar2 = cVarC.f16787d;
        }
        this.f16889c.E();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public a k(ViewGroup viewGroup, int i7) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(A3.g.f238p, viewGroup, false));
    }
}
