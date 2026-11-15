package com.facebook.react.bridge;

import java.util.Map;
import x5.InterfaceC2227a;

/* JADX INFO: loaded from: classes.dex */
public final class ReadableNativeMap$entryIterator$1$1$next$1 implements Map.Entry<String, Object>, InterfaceC2227a {
    final /* synthetic */ int $index;
    final /* synthetic */ String[] $iteratorKeys;
    final /* synthetic */ Object[] $iteratorValues;

    ReadableNativeMap$entryIterator$1$1$next$1(String[] strArr, int i7, Object[] objArr) {
        this.$iteratorKeys = strArr;
        this.$index = i7;
        this.$iteratorValues = objArr;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.$iteratorValues[this.$index];
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        w5.k.f(obj, "newValue");
        throw new UnsupportedOperationException("Can't set a value while iterating over a ReadableNativeMap");
    }

    @Override // java.util.Map.Entry
    public String getKey() {
        return this.$iteratorKeys[this.$index];
    }
}
