package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
final class i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f17012n = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f17013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextPaint f17014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17015c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f17017e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17024l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17016d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Layout.Alignment f17018f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f17019g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f17020h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f17021i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17022j = f17012n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17023k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f17025m = null;

    static class a extends Exception {
    }

    private i(CharSequence charSequence, TextPaint textPaint, int i7) {
        this.f17013a = charSequence;
        this.f17014b = textPaint;
        this.f17015c = i7;
        this.f17017e = charSequence.length();
    }

    public static i b(CharSequence charSequence, TextPaint textPaint, int i7) {
        return new i(charSequence, textPaint, i7);
    }

    public StaticLayout a() {
        if (this.f17013a == null) {
            this.f17013a = "";
        }
        int iMax = Math.max(0, this.f17015c);
        CharSequence charSequenceEllipsize = this.f17013a;
        if (this.f17019g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f17014b, iMax, this.f17025m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f17017e);
        this.f17017e = iMin;
        if (this.f17024l && this.f17019g == 1) {
            this.f17018f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f17016d, iMin, this.f17014b, iMax);
        builderObtain.setAlignment(this.f17018f);
        builderObtain.setIncludePad(this.f17023k);
        builderObtain.setTextDirection(this.f17024l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f17025m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f17019g);
        float f7 = this.f17020h;
        if (f7 != 0.0f || this.f17021i != 1.0f) {
            builderObtain.setLineSpacing(f7, this.f17021i);
        }
        if (this.f17019g > 1) {
            builderObtain.setHyphenationFrequency(this.f17022j);
        }
        return builderObtain.build();
    }

    public i c(Layout.Alignment alignment) {
        this.f17018f = alignment;
        return this;
    }

    public i d(TextUtils.TruncateAt truncateAt) {
        this.f17025m = truncateAt;
        return this;
    }

    public i e(int i7) {
        this.f17022j = i7;
        return this;
    }

    public i f(boolean z6) {
        this.f17023k = z6;
        return this;
    }

    public i g(boolean z6) {
        this.f17024l = z6;
        return this;
    }

    public i h(float f7, float f8) {
        this.f17020h = f7;
        this.f17021i = f8;
        return this;
    }

    public i i(int i7) {
        this.f17019g = i7;
        return this;
    }
}
