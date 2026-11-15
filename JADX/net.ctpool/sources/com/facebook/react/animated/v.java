package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
class v extends B {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p f11367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f11368i;

    public v(ReadableMap readableMap, p pVar) {
        this.f11367h = pVar;
        ReadableArray array = readableMap.getArray("input");
        this.f11368i = new int[array.size()];
        int i7 = 0;
        while (true) {
            int[] iArr = this.f11368i;
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
        sb.append("SubtractionAnimatedNode[");
        sb.append(this.f11274d);
        sb.append("]: input nodes: ");
        int[] iArr = this.f11368i;
        sb.append(iArr != null ? iArr.toString() : "null");
        sb.append(" - super: ");
        sb.append(super.e());
        return sb.toString();
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public void h() {
        int i7 = 0;
        while (true) {
            int[] iArr = this.f11368i;
            if (i7 >= iArr.length) {
                return;
            }
            AbstractC0793b abstractC0793bL = this.f11367h.l(iArr[i7]);
            if (abstractC0793bL == null || !(abstractC0793bL instanceof B)) {
                break;
            }
            double dL = ((B) abstractC0793bL).l();
            if (i7 == 0) {
                this.f11169e = dL;
            } else {
                this.f11169e -= dL;
            }
            i7++;
        }
        throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.subtract node");
    }
}
