package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class u extends AbstractC0793b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p f11365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f11366f;

    u(ReadableMap readableMap, p pVar) {
        ReadableMap map = readableMap.getMap("style");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
        this.f11366f = new HashMap();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            this.f11366f.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
        this.f11365e = pVar;
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("StyleAnimatedNode[");
        sb.append(this.f11274d);
        sb.append("] mPropMapping: ");
        Map map = this.f11366f;
        sb.append(map != null ? map.toString() : "null");
        return sb.toString();
    }

    public void i(JavaOnlyMap javaOnlyMap) {
        String str;
        int iIntValue;
        for (Map.Entry entry : this.f11366f.entrySet()) {
            AbstractC0793b abstractC0793bL = this.f11365e.l(((Integer) entry.getValue()).intValue());
            if (abstractC0793bL == null) {
                throw new IllegalArgumentException("Mapped style node does not exist");
            }
            if (abstractC0793bL instanceof y) {
                ((y) abstractC0793bL).i(javaOnlyMap);
            } else if (abstractC0793bL instanceof B) {
                B b7 = (B) abstractC0793bL;
                Object objK = b7.k();
                if (objK instanceof Integer) {
                    str = (String) entry.getKey();
                    iIntValue = ((Integer) objK).intValue();
                    javaOnlyMap.putInt(str, iIntValue);
                } else {
                    boolean z6 = objK instanceof String;
                    String str2 = (String) entry.getKey();
                    if (z6) {
                        javaOnlyMap.putString(str2, (String) objK);
                    } else {
                        javaOnlyMap.putDouble(str2, b7.l());
                    }
                }
            } else if (abstractC0793bL instanceof f) {
                str = (String) entry.getKey();
                iIntValue = ((f) abstractC0793bL).i();
                javaOnlyMap.putInt(str, iIntValue);
            } else {
                if (!(abstractC0793bL instanceof q)) {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + abstractC0793bL.getClass());
                }
                ((q) abstractC0793bL).i((String) entry.getKey(), javaOnlyMap);
            }
        }
    }
}
