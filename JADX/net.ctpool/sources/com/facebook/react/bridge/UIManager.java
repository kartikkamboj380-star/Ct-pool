package com.facebook.react.bridge;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface UIManager extends PerformanceCounter {
    @Deprecated
    <T extends View> int addRootView(T t6, WritableMap writableMap);

    void addUIManagerEventListener(UIManagerListener uIManagerListener);

    void dispatchCommand(int i7, int i8, ReadableArray readableArray);

    void dispatchCommand(int i7, String str, ReadableArray readableArray);

    <T> T getEventDispatcher();

    void initialize();

    void invalidate();

    void receiveEvent(int i7, int i8, String str, WritableMap writableMap);

    @Deprecated
    void receiveEvent(int i7, String str, WritableMap writableMap);

    void removeUIManagerEventListener(UIManagerListener uIManagerListener);

    @Deprecated
    String resolveCustomDirectEventName(String str);

    View resolveView(int i7);

    void sendAccessibilityEvent(int i7, int i8);

    <T extends View> int startSurface(T t6, String str, WritableMap writableMap, int i7, int i8);

    void stopSurface(int i7);

    void synchronouslyUpdateViewOnUIThread(int i7, ReadableMap readableMap);

    void updateRootLayoutSpecs(int i7, int i8, int i9, int i10, int i11);
}
