package com.facebook.react.views.text.frescosupport;

import J1.c;
import M2.n;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.G;
import com.facebook.react.views.image.d;
import g1.AbstractC1687b;
import j1.p;
import k1.C1815a;
import k1.C1816b;
import n1.C1895b;
import p2.C1962a;

/* JADX INFO: loaded from: classes.dex */
class b extends n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f13057n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AbstractC1687b f13058o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final C1895b f13059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object f13060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f13061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f13062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Uri f13063t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f13064u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ReadableMap f13065v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f13066w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private TextView f13067x;

    public b(Resources resources, int i7, int i8, int i9, Uri uri, ReadableMap readableMap, AbstractC1687b abstractC1687b, Object obj, String str) {
        this.f13059p = new C1895b(C1816b.t(resources).a());
        this.f13058o = abstractC1687b;
        this.f13060q = obj;
        this.f13062s = i9;
        this.f13063t = uri == null ? Uri.EMPTY : uri;
        this.f13065v = readableMap;
        this.f13064u = (int) G.d(i8);
        this.f13061r = (int) G.d(i7);
        this.f13066w = str;
    }

    private p.b i(String str) {
        return d.c(str);
    }

    @Override // M2.n
    public Drawable a() {
        return this.f13057n;
    }

    @Override // M2.n
    public int b() {
        return this.f13061r;
    }

    @Override // M2.n
    public void c() {
        this.f13059p.k();
    }

    @Override // M2.n
    public void d() {
        this.f13059p.l();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f7, int i9, int i10, int i11, Paint paint) {
        if (this.f13057n == null) {
            C1962a c1962aZ = C1962a.z(c.w(this.f13063t), this.f13065v);
            ((C1815a) this.f13059p.h()).v(i(this.f13066w));
            this.f13059p.p(this.f13058o.x().D(this.f13059p.g()).z(this.f13060q).B(c1962aZ).a());
            this.f13058o.x();
            Drawable drawableI = this.f13059p.i();
            this.f13057n = drawableI;
            drawableI.setBounds(0, 0, this.f13064u, this.f13061r);
            int i12 = this.f13062s;
            if (i12 != 0) {
                this.f13057n.setColorFilter(i12, PorterDuff.Mode.SRC_IN);
            }
            this.f13057n.setCallback(this.f13067x);
        }
        canvas.save();
        canvas.translate(f7, ((i10 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.f13057n.getBounds().bottom - this.f13057n.getBounds().top) / 2));
        this.f13057n.draw(canvas);
        canvas.restore();
    }

    @Override // M2.n
    public void e() {
        this.f13059p.k();
    }

    @Override // M2.n
    public void f() {
        this.f13059p.l();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i9 = -this.f13061r;
            fontMetricsInt.ascent = i9;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i9;
            fontMetricsInt.bottom = 0;
        }
        return this.f13064u;
    }

    @Override // M2.n
    public void h(TextView textView) {
        this.f13067x = textView;
    }
}
