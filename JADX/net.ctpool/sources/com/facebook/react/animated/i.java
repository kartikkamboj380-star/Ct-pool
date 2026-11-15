package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
class i extends B {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p f11299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f11300i;

    public i(ReadableMap readableMap, p pVar) {
        this.f11299h = pVar;
        ReadableArray array = readableMap.getArray("input");
        this.f11300i = new int[array.size()];
        int i7 = 0;
        while (true) {
            int[] iArr = this.f11300i;
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
        sb.append("DivisionAnimatedNode[");
        sb.append(this.f11274d);
        sb.append("]: input nodes: ");
        int[] iArr = this.f11300i;
        sb.append(iArr != null ? iArr.toString() : "null");
        sb.append(" - super: ");
        sb.append(super.e());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        throw new com.facebook.react.bridge.JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.divide node with Animated ID " + r5.f11274d);
     */
    @Override // com.facebook.react.animated.AbstractC0793b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h() {
        int i7 = 0;
        while (true) {
            int[] iArr = this.f11300i;
            if (i7 >= iArr.length) {
                return;
            }
            AbstractC0793b abstractC0793bL = this.f11299h.l(iArr[i7]);
            if (abstractC0793bL == null || !(abstractC0793bL instanceof B)) {
                break;
            }
            double dL = ((B) abstractC0793bL).l();
            if (i7 == 0) {
                this.f11169e = dL;
            } else {
                if (dL == 0.0d) {
                    throw new JSApplicationCausedNativeException("Detected a division by zero in Animated.divide node with Animated ID " + this.f11274d);
                }
                this.f11169e /= dL;
            }
            i7++;
        }
    }
}
