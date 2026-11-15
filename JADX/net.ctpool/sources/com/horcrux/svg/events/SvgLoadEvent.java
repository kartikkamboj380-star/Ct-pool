package com.horcrux.svg.events;

import J2.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.d;

/* JADX INFO: loaded from: classes.dex */
public class SvgLoadEvent extends d {
    public static final String EVENT_NAME = "topLoad";
    private final float height;
    private final String uri;
    private final float width;

    public SvgLoadEvent(int i7, int i8, ReactContext reactContext, String str, float f7, float f8) {
        super(i7, i8);
        this.uri = new a(reactContext, str).d();
        this.width = f7;
        this.height = f8;
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), getEventData());
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("width", this.width);
        writableMapCreateMap.putDouble("height", this.height);
        writableMapCreateMap.putString("uri", this.uri);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putMap("source", writableMapCreateMap);
        return writableMapCreateMap2;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return EVENT_NAME;
    }
}
