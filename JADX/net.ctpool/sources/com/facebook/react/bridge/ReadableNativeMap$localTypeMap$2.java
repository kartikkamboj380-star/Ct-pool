package com.facebook.react.bridge;

import com.facebook.react.bridge.ReadableNativeMap;
import java.util.HashMap;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes.dex */
final class ReadableNativeMap$localTypeMap$2 extends w5.l implements InterfaceC2171a {
    final /* synthetic */ ReadableNativeMap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReadableNativeMap$localTypeMap$2(ReadableNativeMap readableNativeMap) {
        super(0);
        this.this$0 = readableNativeMap;
    }

    @Override // v5.InterfaceC2171a
    public final HashMap<String, ReadableType> invoke() {
        int length = this.this$0.getKeys().length;
        HashMap<String, ReadableType> map = new HashMap<>(length);
        Object[] objArrImportTypes = this.this$0.importTypes();
        ReadableNativeMap.Companion unused = ReadableNativeMap.Companion;
        ReadableNativeMap.jniPassCounter++;
        for (int i7 = 0; i7 < length; i7++) {
            String str = this.this$0.getKeys()[i7];
            Object obj = objArrImportTypes[i7];
            w5.k.d(obj, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableType");
            map.put(str, (ReadableType) obj);
        }
        return map;
    }
}
