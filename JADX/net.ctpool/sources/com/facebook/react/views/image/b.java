package com.facebook.react.views.image;

import app.notifee.core.event.LogEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.horcrux.svg.events.SvgLoadEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f12767h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f12772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f12773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f12774g;

    public static final class a {
        private a() {
        }

        public final b a(int i7, int i8, Throwable th) {
            k.f(th, "throwable");
            return new b(i7, i8, 1, th.getMessage(), null, 0, 0, 0, 0, null);
        }

        public final b b(int i7, int i8) {
            return new b(i7, i8, 3, null, null, 0, 0, 0, 0, 504, null);
        }

        public final b c(int i7, int i8, String str, int i9, int i10) {
            return new b(i7, i8, 2, null, str, i9, i10, 0, 0, null);
        }

        public final b d(int i7, int i8) {
            return new b(i7, i8, 4, null, null, 0, 0, 0, 0, 504, null);
        }

        public final b e(int i7, int i8, String str, int i9, int i10) {
            return new b(i7, i8, 5, null, str, 0, 0, i9, i10, null);
        }

        public final String f(int i7) {
            if (i7 == 1) {
                return "topError";
            }
            if (i7 == 2) {
                return SvgLoadEvent.EVENT_NAME;
            }
            if (i7 == 3) {
                return "topLoadEnd";
            }
            if (i7 == 4) {
                return "topLoadStart";
            }
            if (i7 == 5) {
                return "topProgress";
            }
            throw new IllegalStateException(("Invalid image event: " + i7).toString());
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private b(int i7, int i8, int i9, String str, String str2, int i10, int i11, int i12, int i13) {
        super(i7, i8);
        this.f12768a = i9;
        this.f12769b = str;
        this.f12770c = str2;
        this.f12771d = i10;
        this.f12772e = i11;
        this.f12773f = i12;
        this.f12774g = i13;
    }

    public static final b a(int i7, int i8, Throwable th) {
        return f12767h.a(i7, i8, th);
    }

    private final WritableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("uri", this.f12770c);
        writableMapCreateMap.putDouble("width", this.f12771d);
        writableMapCreateMap.putDouble("height", this.f12772e);
        k.e(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    public static final b c(int i7, int i8) {
        return f12767h.b(i7, i8);
    }

    public static final b d(int i7, int i8, String str, int i9, int i10) {
        return f12767h.c(i7, i8, str, i9, i10);
    }

    public static final b e(int i7, int i8) {
        return f12767h.d(i7, i8);
    }

    public static final b f(int i7, int i8, String str, int i9, int i10) {
        return f12767h.e(i7, i8, str, i9, i10);
    }

    public static final String g(int i7) {
        return f12767h.f(i7);
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) this.f12768a;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        int i7 = this.f12768a;
        if (i7 == 1) {
            writableMapCreateMap.putString(LogEvent.LEVEL_ERROR, this.f12769b);
        } else if (i7 == 2) {
            writableMapCreateMap.putMap("source", b());
        } else if (i7 == 5) {
            writableMapCreateMap.putInt("loaded", this.f12773f);
            writableMapCreateMap.putInt("total", this.f12774g);
            writableMapCreateMap.putDouble("progress", ((double) this.f12773f) / ((double) this.f12774g));
        }
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return f12767h.f(this.f12768a);
    }

    /* synthetic */ b(int i7, int i8, int i9, String str, String str2, int i10, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, i8, i9, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? 0 : i10, (i14 & 64) != 0 ? 0 : i11, (i14 & 128) != 0 ? 0 : i12, (i14 & 256) != 0 ? 0 : i13);
    }

    public /* synthetic */ b(int i7, int i8, int i9, String str, String str2, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, i8, i9, str, str2, i10, i11, i12, i13);
    }
}
