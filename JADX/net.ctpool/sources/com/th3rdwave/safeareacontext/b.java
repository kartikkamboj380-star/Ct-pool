package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f18587c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.th3rdwave.safeareacontext.a f18588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f18589b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i7, int i8, com.th3rdwave.safeareacontext.a aVar, c cVar) {
        super(i8);
        w5.k.f(aVar, "mInsets");
        w5.k.f(cVar, "mFrame");
        this.f18588a = aVar;
        this.f18589b = cVar;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        w5.k.f(rCTEventEmitter, "rctEventEmitter");
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putMap("insets", q.b(this.f18588a));
        writableMapCreateMap.putMap("frame", q.d(this.f18589b));
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), writableMapCreateMap);
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topInsetsChange";
    }
}
