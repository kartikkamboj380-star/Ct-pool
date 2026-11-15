package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: renamed from: com.facebook.react.animated.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0792a extends B {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p f11269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f11270i;

    public C0792a(ReadableMap readableMap, p pVar) {
        this.f11269h = pVar;
        ReadableArray array = readableMap.getArray("input");
        this.f11270i = new int[array.size()];
        int i7 = 0;
        while (true) {
            int[] iArr = this.f11270i;
            if (i7 >= iArr.length) {
                return;
            }
            iArr[i7] = array.getInt(i7);
            i7++;
        }
    }

    @Override // com.facebook.react.animated.B, com.facebook.react.animated.AbstractC0793b
    public String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdditionAnimatedNode[");
        sb.append(this.f11274d);
        sb.append("]: input nodes: ");
        int[] iArr = this.f11270i;
        sb.append(iArr != null ? iArr.toString() : "null");
        sb.append(" - super: ");
        sb.append(super.e());
        return sb.toString();
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public void h() {
        this.f11169e = 0.0d;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f11270i;
            if (i7 >= iArr.length) {
                return;
            }
            AbstractC0793b abstractC0793bL = this.f11269h.l(iArr[i7]);
            if (abstractC0793bL == null || !(abstractC0793bL instanceof B)) {
                break;
            }
            this.f11169e += ((B) abstractC0793bL).l();
            i7++;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.Add node");
    }
}
