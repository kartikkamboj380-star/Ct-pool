package com.facebook.react.views.scroll;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;
import com.facebook.react.views.scroll.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class g extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f12975k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f12976l = g.class.getSimpleName();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final androidx.core.util.e f12977m = new androidx.core.util.e(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f12978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f12979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f12980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f12981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f12984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private h f12986i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f12987j;

    public static final class a {
        private a() {
        }

        public final g a(int i7, int i8, h hVar, float f7, float f8, float f9, float f10, int i9, int i10, int i11, int i12, boolean z6) {
            g gVar = (g) g.f12977m.b();
            if (gVar == null) {
                gVar = new g(null);
            }
            gVar.c(i7, i8, hVar, f7, f8, f9, f10, i9, i10, i11, i12, z6);
            return gVar;
        }

        public final g b(int i7, h hVar, float f7, float f8, float f9, float f10, int i8, int i9, int i10, int i11) {
            return a(-1, i7, hVar, f7, f8, f9, f10, i8, i9, i10, i11, false);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(int i7, int i8, h hVar, float f7, float f8, float f9, float f10, int i9, int i10, int i11, int i12, boolean z6) {
        super.init(i7, i8);
        this.f12986i = hVar;
        this.f12978a = f7;
        this.f12979b = f8;
        this.f12980c = f9;
        this.f12981d = f10;
        this.f12982e = i9;
        this.f12983f = i10;
        this.f12984g = i11;
        this.f12985h = i12;
        this.f12987j = z6;
    }

    public static final g d(int i7, int i8, h hVar, float f7, float f8, float f9, float f10, int i9, int i10, int i11, int i12, boolean z6) {
        return f12975k.a(i7, i8, hVar, f7, f8, f9, f10, i9, i10, i11, i12, z6);
    }

    public static final g e(int i7, h hVar, float f7, float f8, float f9, float f10, int i8, int i9, int i10, int i11) {
        return f12975k.b(i7, hVar, f7, f8, f9, f10, i8, i9, i10, i11);
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return this.f12986i == h.f12991p;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected boolean experimental_isSynchronous() {
        return this.f12987j;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("top", 0.0d);
        writableMapCreateMap.putDouble("bottom", 0.0d);
        writableMapCreateMap.putDouble("left", 0.0d);
        writableMapCreateMap.putDouble("right", 0.0d);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("x", G.b(this.f12978a));
        writableMapCreateMap2.putDouble("y", G.b(this.f12979b));
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.putDouble("width", G.b(this.f12982e));
        writableMapCreateMap3.putDouble("height", G.b(this.f12983f));
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        writableMapCreateMap4.putDouble("width", G.b(this.f12984g));
        writableMapCreateMap4.putDouble("height", G.b(this.f12985h));
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        writableMapCreateMap5.putDouble("x", this.f12980c);
        writableMapCreateMap5.putDouble("y", this.f12981d);
        WritableMap writableMapCreateMap6 = Arguments.createMap();
        writableMapCreateMap6.putMap("contentInset", writableMapCreateMap);
        writableMapCreateMap6.putMap("contentOffset", writableMapCreateMap2);
        writableMapCreateMap6.putMap("contentSize", writableMapCreateMap3);
        writableMapCreateMap6.putMap("layoutMeasurement", writableMapCreateMap4);
        writableMapCreateMap6.putMap("velocity", writableMapCreateMap5);
        writableMapCreateMap6.putInt("target", getViewTag());
        writableMapCreateMap6.putBoolean("responderIgnoreScroll", true);
        k.c(writableMapCreateMap6);
        return writableMapCreateMap6;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        h.a aVar = h.f12988m;
        Object objC = O1.a.c(this.f12986i);
        k.e(objC, "assertNotNull(...)");
        return aVar.a((h) objC);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        try {
            f12977m.a(this);
        } catch (IllegalStateException e7) {
            ReactSoftExceptionLogger.logSoftException(f12976l, e7);
        }
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
