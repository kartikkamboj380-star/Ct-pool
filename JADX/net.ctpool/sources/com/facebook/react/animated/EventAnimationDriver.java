package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class EventAnimationDriver implements RCTModernEventEmitter {
    String mEventName;
    private List<String> mEventPath;
    B mValueNode;
    int mViewTag;

    public EventAnimationDriver(String str, int i7, List<String> list, B b7) {
        this.mEventName = str;
        this.mViewTag = i7;
        this.mEventPath = list;
        this.mValueNode = b7;
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i7, int i8, String str, WritableMap writableMap) {
        receiveEvent(i7, i8, str, false, 0, writableMap, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveTouches(com.facebook.react.uimanager.events.q qVar) {
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i7, int i8, String str, boolean z6, int i9, WritableMap writableMap, int i10) {
        B b7;
        double d7;
        ReadableMap map;
        ReadableArray array;
        ReadableMap map2;
        if (writableMap == null) {
            throw new IllegalArgumentException("Native animated events must have event data.");
        }
        int i11 = 0;
        ReadableArray array2 = null;
        ReadableMap readableMap = writableMap;
        while (i11 < this.mEventPath.size() - 1) {
            if (readableMap != null) {
                String str2 = this.mEventPath.get(i11);
                ReadableType type = readableMap.getType(str2);
                if (type == ReadableType.Map) {
                    map2 = readableMap.getMap(str2);
                    array = null;
                } else {
                    if (type != ReadableType.Array) {
                        throw new UnexpectedNativeTypeException("Unexpected type " + type + " for key '" + str2 + "'");
                    }
                    array = readableMap.getArray(str2);
                    map2 = null;
                }
                map = map2;
                array2 = array;
            } else {
                int i12 = Integer.parseInt(this.mEventPath.get(i11));
                ReadableType type2 = array2.getType(i12);
                if (type2 == ReadableType.Map) {
                    map = array2.getMap(i12);
                    array2 = null;
                } else {
                    if (type2 != ReadableType.Array) {
                        throw new UnexpectedNativeTypeException("Unexpected type " + type2 + " for index '" + i12 + "'");
                    }
                    array2 = array2.getArray(i12);
                    map = null;
                }
            }
            i11++;
            readableMap = map;
        }
        String str3 = this.mEventPath.get(r2.size() - 1);
        if (readableMap != null) {
            b7 = this.mValueNode;
            d7 = readableMap.getDouble(str3);
        } else {
            int i13 = Integer.parseInt(str3);
            b7 = this.mValueNode;
            d7 = array2.getDouble(i13);
        }
        b7.f11169e = d7;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i7, String str, WritableMap writableMap) {
        receiveEvent(-1, i7, str, writableMap);
    }
}
