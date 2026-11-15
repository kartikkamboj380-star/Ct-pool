package com.facebook.react.views.switchview;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f13016b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f13017a;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(int i7, int i8, boolean z6) {
        super(i7, i8);
        this.f13017a = z6;
    }

    @Override // com.facebook.react.uimanager.events.d
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putBoolean("value", this.f13017a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topChange";
    }
}
