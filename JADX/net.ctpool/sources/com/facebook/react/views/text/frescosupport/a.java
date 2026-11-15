package com.facebook.react.views.text.frescosupport;

import M2.n;
import android.content.Context;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import g1.AbstractC1687b;
import java.util.Locale;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
class a extends L2.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Uri f13049A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private ReadableMap f13050B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final AbstractC1687b f13051C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Object f13052D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private String f13054F;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private float f13053E = Float.NaN;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f13055G = Float.NaN;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f13056H = 0;

    public a(AbstractC1687b abstractC1687b, Object obj) {
        this.f13051C = abstractC1687b;
        this.f13052D = obj;
    }

    private static Uri B1(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace("-", "_"), "drawable", context.getPackageName()))).build();
    }

    public ReadableMap A1() {
        return this.f13050B;
    }

    public Uri C1() {
        return this.f13049A;
    }

    @InterfaceC2218a(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.f13050B = readableMap;
    }

    @Override // com.facebook.react.uimanager.C0895v
    public void setHeight(Dynamic dynamic) {
        float fAsDouble;
        if (dynamic.getType() == ReadableType.Number) {
            fAsDouble = (float) dynamic.asDouble();
        } else {
            P0.a.G("ReactNative", "Inline images must not have percentage based height");
            fAsDouble = Float.NaN;
        }
        this.f13055G = fAsDouble;
    }

    @InterfaceC2218a(name = "resizeMode")
    public void setResizeMode(String str) {
        this.f13054F = str;
    }

    @InterfaceC2218a(name = "src")
    public void setSource(ReadableArray readableArray) {
        Uri uriB1 = null;
        String string = (readableArray == null || readableArray.size() == 0) ? null : readableArray.getMap(0).getString("uri");
        if (string != null) {
            try {
                Uri uri = Uri.parse(string);
                if (uri.getScheme() != null) {
                    uriB1 = uri;
                }
            } catch (Exception unused) {
            }
            if (uriB1 == null) {
                uriB1 = B1(G(), string);
            }
        }
        if (uriB1 != this.f13049A) {
            y0();
        }
        this.f13049A = uriB1;
    }

    @InterfaceC2218a(customType = "Color", name = "tintColor")
    public void setTintColor(int i7) {
        this.f13056H = i7;
    }

    @Override // com.facebook.react.uimanager.C0895v
    public void setWidth(Dynamic dynamic) {
        float fAsDouble;
        if (dynamic.getType() == ReadableType.Number) {
            fAsDouble = (float) dynamic.asDouble();
        } else {
            P0.a.G("ReactNative", "Inline images must not have percentage based width");
            fAsDouble = Float.NaN;
        }
        this.f13053E = fAsDouble;
    }

    @Override // com.facebook.react.uimanager.V, com.facebook.react.uimanager.U
    public boolean u() {
        return true;
    }

    @Override // L2.a
    public n x1() {
        return new b(G().getResources(), (int) Math.ceil(this.f13055G), (int) Math.ceil(this.f13053E), this.f13056H, C1(), A1(), z1(), y1(), this.f13054F);
    }

    public Object y1() {
        return this.f13052D;
    }

    public AbstractC1687b z1() {
        return this.f13051C;
    }
}
