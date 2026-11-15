package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
class o extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f13232a;

    public o(int i7, int i8, String str) {
        super(i7, i8);
        this.f13232a = str;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putString("text", this.f13232a);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topEndEditing";
    }
}
