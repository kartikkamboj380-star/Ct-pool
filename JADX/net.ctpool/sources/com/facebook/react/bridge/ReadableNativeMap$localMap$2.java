package com.facebook.react.bridge;

import com.facebook.react.bridge.ReadableNativeMap;
import java.util.HashMap;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes.dex */
final class ReadableNativeMap$localMap$2 extends w5.l implements InterfaceC2171a {
    final /* synthetic */ ReadableNativeMap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReadableNativeMap$localMap$2(ReadableNativeMap readableNativeMap) {
        super(0);
        this.this$0 = readableNativeMap;
    }

    @Override // v5.InterfaceC2171a
    public final HashMap<String, Object> invoke() {
        int length = this.this$0.getKeys().length;
        HashMap<String, Object> map = new HashMap<>(length);
        Object[] objArrImportValues = this.this$0.importValues();
        ReadableNativeMap.Companion unused = ReadableNativeMap.Companion;
        ReadableNativeMap.jniPassCounter++;
        for (int i7 = 0; i7 < length; i7++) {
            map.put(this.this$0.getKeys()[i7], objArrImportValues[i7]);
        }
        return map;
    }
}
