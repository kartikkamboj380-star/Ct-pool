package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
class J extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13152b;

    public J(int i7, int i8, int i9, int i10) {
        super(i7, i8);
        this.f13151a = i9;
        this.f13152b = i10;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putInt("end", this.f13152b);
        writableMapCreateMap2.putInt("start", this.f13151a);
        writableMapCreateMap.putMap("selection", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topSelectionChange";
    }
}
