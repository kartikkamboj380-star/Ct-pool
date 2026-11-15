package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: renamed from: com.facebook.react.views.textinput.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0902b extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f13179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f13180b;

    public C0902b(int i7, int i8, float f7, float f8) {
        super(i7, i8);
        this.f13179a = f7;
        this.f13180b = f8;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble("width", this.f13179a);
        writableMapCreateMap2.putDouble("height", this.f13180b);
        writableMapCreateMap.putMap("contentSize", writableMapCreateMap2);
        writableMapCreateMap.putInt("target", getViewTag());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topContentSizeChange";
    }
}
