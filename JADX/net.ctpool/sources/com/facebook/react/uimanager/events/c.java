package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.G;

/* JADX INFO: loaded from: classes.dex */
public class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f12498b;

    public c(int i7, int i8, int i9) {
        this(-1, i7, i8, i9);
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("width", G.b(this.f12497a));
        writableMapCreateMap.putDouble("height", G.b(this.f12498b));
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topContentSizeChange";
    }

    public c(int i7, int i8, int i9, int i10) {
        super(i7, i8);
        this.f12497a = i9;
        this.f12498b = i10;
    }
}
