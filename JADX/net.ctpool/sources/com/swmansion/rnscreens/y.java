package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import kotlin.enums.EnumEntries;
import p5.AbstractC1978a;

/* JADX INFO: loaded from: classes.dex */
public final class y extends com.facebook.react.views.view.i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f18553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f18554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private a f18555o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f18556m = new a("LEFT", 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f18557n = new a("CENTER", 1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f18558o = new a("RIGHT", 2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f18559p = new a("BACK", 3);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f18560q = new a("SEARCH_BAR", 4);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ a[] f18561r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f18562s;

        static {
            a[] aVarArrE = e();
            f18561r = aVarArrE;
            f18562s = AbstractC1978a.a(aVarArrE);
        }

        private a(String str, int i7) {
        }

        private static final /* synthetic */ a[] e() {
            return new a[]{f18556m, f18557n, f18558o, f18559p, f18560q};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f18561r.clone();
        }
    }

    public y(ReactContext reactContext) {
        super(reactContext);
        this.f18555o = a.f18558o;
    }

    public final x getConfig() {
        ViewParent parent = getParent();
        C1591d c1591d = parent instanceof C1591d ? (C1591d) parent : null;
        if (c1591d != null) {
            return c1591d.getConfig();
        }
        return null;
    }

    public final a getType() {
        return this.f18555o;
    }

    @Override // com.facebook.react.views.view.i, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
    }

    @Override // com.facebook.react.views.view.i, android.view.View
    protected void onMeasure(int i7, int i8) {
        if (View.MeasureSpec.getMode(i7) == 1073741824 && View.MeasureSpec.getMode(i8) == 1073741824) {
            this.f18553m = View.MeasureSpec.getSize(i7);
            this.f18554n = View.MeasureSpec.getSize(i8);
            Object parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f18553m, this.f18554n);
    }

    public final void setType(a aVar) {
        w5.k.f(aVar, "<set-?>");
        this.f18555o = aVar;
    }
}
