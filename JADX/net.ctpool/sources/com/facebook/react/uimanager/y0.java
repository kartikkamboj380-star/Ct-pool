package com.facebook.react.uimanager;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Comparator f12744c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12746b;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(y0 y0Var, y0 y0Var2) {
            return y0Var.f12746b - y0Var2.f12746b;
        }
    }

    public y0(int i7, int i8) {
        this.f12745a = i7;
        this.f12746b = i8;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f12746b == y0Var.f12746b && this.f12745a == y0Var.f12745a;
    }

    public String toString() {
        return "[" + this.f12745a + ", " + this.f12746b + "]";
    }
}
