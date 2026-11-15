package com.facebook.react.uimanager.events;

/* JADX INFO: loaded from: classes.dex */
public class b implements e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final e f12496m = new b();

    private b() {
    }

    public static e j() {
        return f12496m;
    }

    @Override // com.facebook.react.uimanager.events.e
    public void a(int i7, RCTEventEmitter rCTEventEmitter) {
    }

    @Override // com.facebook.react.uimanager.events.e
    public void b(i iVar) {
    }

    @Override // com.facebook.react.uimanager.events.e
    public void c(d dVar) {
        P0.a.b(getClass().getSimpleName(), "Trying to emit event to JS, but the React instance isn't ready. Event: " + dVar.getEventName());
    }

    @Override // com.facebook.react.uimanager.events.e
    public void d() {
    }

    @Override // com.facebook.react.uimanager.events.e
    public void e(a aVar) {
    }

    @Override // com.facebook.react.uimanager.events.e
    public void f(a aVar) {
    }

    @Override // com.facebook.react.uimanager.events.e
    public void g() {
    }

    @Override // com.facebook.react.uimanager.events.e
    public void h(int i7, RCTModernEventEmitter rCTModernEventEmitter) {
    }

    @Override // com.facebook.react.uimanager.events.e
    public void i(int i7) {
    }
}
