package com.facebook.react.bridge;

import com.facebook.react.bridge.ReadableNativeMap;
import v5.InterfaceC2171a;

/* JADX INFO: loaded from: classes.dex */
final class ReadableNativeMap$keys$2 extends w5.l implements InterfaceC2171a {
    final /* synthetic */ ReadableNativeMap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReadableNativeMap$keys$2(ReadableNativeMap readableNativeMap) {
        super(0);
        this.this$0 = readableNativeMap;
    }

    @Override // v5.InterfaceC2171a
    public final String[] invoke() {
        String[] strArrImportKeys = this.this$0.importKeys();
        ReadableNativeMap.Companion unused = ReadableNativeMap.Companion;
        ReadableNativeMap.jniPassCounter++;
        return strArrImportKeys;
    }
}
