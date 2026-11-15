package com.facebook.react.uimanager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
public class F extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final androidx.core.util.e f12277e = new androidx.core.util.e(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f12280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12281d;

    private F() {
    }

    public static F b(int i7, int i8, int i9, int i10, int i11) {
        return c(-1, i7, i8, i9, i10, i11);
    }

    public static F c(int i7, int i8, int i9, int i10, int i11, int i12) {
        F f7 = (F) f12277e.b();
        if (f7 == null) {
            f7 = new F();
        }
        f7.a(i7, i8, i9, i10, i11, i12);
        return f7;
    }

    protected void a(int i7, int i8, int i9, int i10, int i11, int i12) {
        super.init(i7, i8);
        this.f12278a = i9;
        this.f12279b = i10;
        this.f12280c = i11;
        this.f12281d = i12;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", G.b(this.f12278a));
        writableMapCreateMap.putDouble("y", G.b(this.f12279b));
        writableMapCreateMap.putDouble("width", G.b(this.f12280c));
        writableMapCreateMap.putDouble("height", G.b(this.f12281d));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("layout", writableMapCreateMap);
        writableMapCreateMap2.putInt("target", getViewTag());
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topLayout";
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        f12277e.a(this);
    }
}
