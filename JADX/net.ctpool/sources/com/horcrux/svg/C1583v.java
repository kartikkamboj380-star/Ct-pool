package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.horcrux.svg.events.SvgLoadEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import z1.AbstractC2255b;

/* JADX INFO: renamed from: com.horcrux.svg.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1583v extends RenderableView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private SVGLength f18102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SVGLength f18103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SVGLength f18104o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private SVGLength f18105p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f18106q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f18107r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f18108s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f18109t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f18110u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AtomicBoolean f18111v;

    /* JADX INFO: renamed from: com.horcrux.svg.v$a */
    class a extends AbstractC2255b {
        a() {
        }

        @Override // Y0.b
        public void e(Y0.c cVar) {
            C1583v.this.f18111v.set(false);
            P0.a.J("ReactNative", cVar.c(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
        }

        @Override // z1.AbstractC2255b
        public void g(Bitmap bitmap) {
            C1583v c1583v = C1583v.this;
            com.facebook.react.uimanager.events.e eVarC = AbstractC0884k0.c(c1583v.mContext, c1583v.getId());
            int iF = AbstractC0884k0.f(C1583v.this);
            int id = C1583v.this.getId();
            C1583v c1583v2 = C1583v.this;
            eVarC.c(new SvgLoadEvent(iF, id, c1583v2.mContext, c1583v2.f18106q, bitmap.getWidth(), bitmap.getHeight()));
            C1583v.this.f18111v.set(false);
            SvgView svgView = C1583v.this.getSvgView();
            if (svgView != null) {
                svgView.invalidate();
            }
        }
    }

    public C1583v(ReactContext reactContext) {
        super(reactContext);
        this.f18111v = new AtomicBoolean(false);
    }

    private void A(y1.k kVar, J1.b bVar, Canvas canvas, Paint paint, float f7) {
        Y0.c cVarK = kVar.k(bVar, this.mContext);
        try {
            try {
                S0.a aVar = (S0.a) cVarK.g();
                try {
                    if (aVar == null) {
                        return;
                    }
                    try {
                        D1.d dVar = (D1.d) aVar.j();
                        if (dVar instanceof D1.c) {
                            Bitmap bitmapZ0 = ((D1.c) dVar).z0();
                            if (bitmapZ0 == null) {
                                return;
                            }
                            s(canvas, paint, bitmapZ0, f7);
                        }
                    } catch (Exception e7) {
                        throw new IllegalStateException(e7);
                    }
                } finally {
                    S0.a.g(aVar);
                }
            } catch (Exception e8) {
                throw new IllegalStateException(e8);
            }
        } finally {
            cVarK.close();
        }
    }

    private void s(Canvas canvas, Paint paint, Bitmap bitmap, float f7) {
        if (this.f18107r == 0 || this.f18108s == 0) {
            this.f18107r = bitmap.getWidth();
            this.f18108s = bitmap.getHeight();
        }
        RectF rectFT = t();
        RectF rectF = new RectF(0.0f, 0.0f, this.f18107r, this.f18108s);
        j0.a(rectF, rectFT, this.f18109t, this.f18110u).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f7 * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    private RectF t() {
        double dRelativeOnWidth = relativeOnWidth(this.f18102m);
        double dRelativeOnHeight = relativeOnHeight(this.f18103n);
        double dRelativeOnWidth2 = relativeOnWidth(this.f18104o);
        double dRelativeOnHeight2 = relativeOnHeight(this.f18105p);
        if (dRelativeOnWidth2 == 0.0d) {
            dRelativeOnWidth2 = this.f18107r * this.mScale;
        }
        if (dRelativeOnHeight2 == 0.0d) {
            dRelativeOnHeight2 = this.f18108s * this.mScale;
        }
        return new RectF((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) (dRelativeOnWidth + dRelativeOnWidth2), (float) (dRelativeOnHeight + dRelativeOnHeight2));
    }

    private void u(y1.k kVar, J1.b bVar) {
        this.f18111v.set(true);
        kVar.g(bVar, this.mContext).e(new a(), M0.f.g());
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f7) {
        if (this.f18111v.get()) {
            return;
        }
        y1.k kVarA = c1.c.a();
        J1.b bVarA = J1.b.a(new J2.a(this.mContext, this.f18106q).f());
        if (kVarA.p(bVarA)) {
            A(kVarA, bVarA, canvas, paint, f7 * this.mOpacity);
        } else {
            u(kVarA, bVarA);
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        ((VirtualView) this).mPath = path;
        path.addRect(t(), Path.Direction.CW);
        return ((VirtualView) this).mPath;
    }

    public void setAlign(String str) {
        this.f18109t = str;
        invalidate();
    }

    public void setMeetOrSlice(int i7) {
        this.f18110u = i7;
        invalidate();
    }

    public void v(Dynamic dynamic) {
        this.f18105p = SVGLength.b(dynamic);
        invalidate();
    }

    public void w(ReadableMap readableMap) {
        int i7;
        if (readableMap != null) {
            String string = readableMap.getString("uri");
            this.f18106q = string;
            if (string == null || string.isEmpty()) {
                return;
            }
            if (readableMap.hasKey("width") && readableMap.hasKey("height")) {
                this.f18107r = readableMap.getInt("width");
                i7 = readableMap.getInt("height");
            } else {
                i7 = 0;
                this.f18107r = 0;
            }
            this.f18108s = i7;
            if (Uri.parse(this.f18106q).getScheme() == null) {
                J2.c.d().g(this.mContext, this.f18106q);
            }
        }
    }

    public void x(Dynamic dynamic) {
        this.f18104o = SVGLength.b(dynamic);
        invalidate();
    }

    public void y(Dynamic dynamic) {
        this.f18102m = SVGLength.b(dynamic);
        invalidate();
    }

    public void z(Dynamic dynamic) {
        this.f18103n = SVGLength.b(dynamic);
        invalidate();
    }
}
