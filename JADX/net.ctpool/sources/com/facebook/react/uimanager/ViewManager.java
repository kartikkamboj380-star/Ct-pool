package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.U;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import w2.C2184a;
import w2.InterfaceC2187d;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewManager<T extends View, C extends U> extends BaseJavaModule {
    private static final String NAME = "ViewManager";
    private HashMap<Integer, Stack<T>> mRecyclableViews;

    public ViewManager() {
        super(null);
        this.mRecyclableViews = null;
    }

    private Stack<T> getRecyclableViewStack(int i7) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map == null) {
            return null;
        }
        if (!map.containsKey(Integer.valueOf(i7))) {
            this.mRecyclableViews.put(Integer.valueOf(i7), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i7));
    }

    protected void addEventEmitters(C0872e0 c0872e0, T t6) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public T createView(int i7, C0872e0 c0872e0, W w6, InterfaceC0870d0 interfaceC0870d0, C2184a c2184a) {
        T t6 = (T) createViewInstance(i7, c0872e0, w6, interfaceC0870d0);
        if (t6 instanceof InterfaceC2187d) {
            ((InterfaceC2187d) t6).setOnInterceptTouchEventListener(c2184a);
        }
        return t6;
    }

    protected T createViewInstance(int i7, C0872e0 c0872e0, W w6, InterfaceC0870d0 interfaceC0870d0) {
        Object objUpdateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(c0872e0.c());
        T t6 = (recyclableViewStack == null || recyclableViewStack.empty()) ? (T) createViewInstance(c0872e0) : (T) recycleView(c0872e0, recyclableViewStack.pop());
        t6.setId(i7);
        addEventEmitters(c0872e0, t6);
        if (w6 != null) {
            updateProperties(t6, w6);
        }
        if (interfaceC0870d0 != null && (objUpdateState = updateState(t6, w6, interfaceC0870d0)) != null) {
            updateExtraData(t6, objUpdateState);
        }
        return t6;
    }

    protected abstract T createViewInstance(C0872e0 c0872e0);

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    protected A0 getDelegate() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return C0.e(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f7, com.facebook.yoga.p pVar, float f8, com.facebook.yoga.p pVar2, float[] fArr) {
        return 0L;
    }

    protected void onAfterUpdateTransaction(T t6) {
    }

    public void onDropViewInstance(T t6) {
        Context context = t6.getContext();
        if (context == null) {
            P0.a.j(NAME, "onDropViewInstance: view [" + t6.getId() + "] has a null context");
            return;
        }
        if (context instanceof C0872e0) {
            C0872e0 c0872e0 = (C0872e0) context;
            Stack<T> recyclableViewStack = getRecyclableViewStack(c0872e0.c());
            if (recyclableViewStack != null) {
                recyclableViewStack.push(prepareToRecycleView(c0872e0, t6));
                return;
            }
            return;
        }
        P0.a.j(NAME, "onDropViewInstance: view [" + t6.getId() + "] has a context that is not a ThemedReactContext: " + context);
    }

    public void onSurfaceStopped(int i7) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map != null) {
            map.remove(Integer.valueOf(i7));
        }
    }

    protected T prepareToRecycleView(C0872e0 c0872e0, T t6) {
        return t6;
    }

    @Deprecated
    public void receiveCommand(T t6, int i7, ReadableArray readableArray) {
    }

    protected T recycleView(C0872e0 c0872e0, T t6) {
        return t6;
    }

    public void setPadding(T t6, int i7, int i8, int i9, int i10) {
    }

    protected void setupViewRecycling() {
        if (ReactFeatureFlags.enableViewRecycling) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public abstract void updateExtraData(T t6, Object obj);

    public void updateProperties(T t6, W w6) {
        A0 delegate = getDelegate();
        if (delegate != null) {
            C0.h(delegate, t6, w6);
        } else {
            C0.g(this, t6, w6);
        }
        onAfterUpdateTransaction(t6);
    }

    public Object updateState(T t6, W w6, InterfaceC0870d0 interfaceC0870d0) {
        return null;
    }

    public ViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRecyclableViews = null;
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return (C) createShadowNodeInstance();
    }

    public long measure(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, com.facebook.react.common.mapbuffer.a aVar3, float f7, com.facebook.yoga.p pVar, float f8, com.facebook.yoga.p pVar2, float[] fArr) {
        return 0L;
    }

    public void receiveCommand(T t6, String str, ReadableArray readableArray) {
        A0 delegate = getDelegate();
        if (delegate != null) {
            delegate.a(t6, str, readableArray);
        }
    }
}
