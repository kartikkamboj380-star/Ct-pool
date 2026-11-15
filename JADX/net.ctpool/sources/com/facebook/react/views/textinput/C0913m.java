package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: renamed from: com.facebook.react.views.textinput.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0913m extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13231b;

    public C0913m(int i7, int i8, String str, int i9) {
        super(i7, i8);
        this.f13230a = str;
        this.f13231b = i9;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("text", this.f13230a);
        writableMapCreateMap.putInt("eventCount", this.f13231b);
        writableMapCreateMap.putInt("target", getViewTag());
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topChange";
    }
}
