package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
class q extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13233a;

    q(int i7, int i8, String str) {
        super(i7, i8);
        this.f13233a = str;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("key", this.f13233a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topKeyPress";
    }

    q(int i7, String str) {
        this(-1, i7, str);
    }
}
