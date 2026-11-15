package com.facebook.react.modules.core;

import E2.b;
import X1.e;
import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.JavascriptException;
import i2.InterfaceC1741a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativeExceptionsManagerSpec.NAME)
public class ExceptionsManagerModule extends NativeExceptionsManagerSpec {
    private final e mDevSupportManager;

    public ExceptionsManagerModule(e eVar) {
        super(null);
        this.mDevSupportManager = eVar;
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void dismissRedbox() {
        if (this.mDevSupportManager.n()) {
            this.mDevSupportManager.o();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportException(ReadableMap readableMap) {
        String string = readableMap.hasKey("message") ? readableMap.getString("message") : "";
        ReadableArray array = readableMap.hasKey("stack") ? readableMap.getArray("stack") : Arguments.createArray();
        boolean z6 = readableMap.hasKey("isFatal") ? readableMap.getBoolean("isFatal") : false;
        String strA = E2.a.a(readableMap);
        if (z6) {
            throw new JavascriptException(b.a(string, array)).a(strA);
        }
        P0.a.j("ReactNative", b.a(string, array));
        if (strA != null) {
            P0.a.c("ReactNative", "extraData: %s", strA);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportFatalException(String str, ReadableArray readableArray, double d7) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", (int) d7);
        javaOnlyMap.putBoolean("isFatal", true);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportSoftException(String str, ReadableArray readableArray, double d7) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", (int) d7);
        javaOnlyMap.putBoolean("isFatal", false);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void updateExceptionMessage(String str, ReadableArray readableArray, double d7) {
        int i7 = (int) d7;
        if (this.mDevSupportManager.n()) {
            this.mDevSupportManager.F(str, readableArray, i7);
        }
    }
}
