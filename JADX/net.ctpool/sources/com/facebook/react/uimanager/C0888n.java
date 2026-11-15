package com.facebook.react.uimanager;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.react.uimanager.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0888n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0888n f12619a = new C0888n();

    private C0888n() {
    }

    private final ColorMatrix b(float f7) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(f7, f7, f7, 1.0f);
        return colorMatrix;
    }

    private final RenderEffect d(ColorMatrix colorMatrix, RenderEffect renderEffect) {
        RenderEffect renderEffectCreateColorFilterEffect = renderEffect == null ? RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix)) : RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffect);
        w5.k.c(renderEffectCreateColorFilterEffect);
        return renderEffectCreateColorFilterEffect;
    }

    private final ColorMatrix e(float f7) {
        float f8 = 255 * ((-(f7 / 2.0f)) + 0.5f);
        return new ColorMatrix(new float[]{f7, 0.0f, 0.0f, 0.0f, f8, 0.0f, f7, 0.0f, 0.0f, f8, 0.0f, 0.0f, f7, 0.0f, f8, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix g(float f7) {
        float f8 = 1 - f7;
        float f9 = 0.7152f - (f8 * 0.7152f);
        float f10 = 0.0722f - (f8 * 0.0722f);
        float f11 = 0.2126f - (f8 * 0.2126f);
        return new ColorMatrix(new float[]{(0.7874f * f8) + 0.2126f, f9, f10, 0.0f, 0.0f, f11, (0.2848f * f8) + 0.7152f, f10, 0.0f, 0.0f, f11, f9, (f8 * 0.9278f) + 0.0722f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix i(float f7) {
        double radians = Math.toRadians(f7);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f8 = 0.715f - (fCos * 0.715f);
        float f9 = fSin * 0.715f;
        float f10 = 0.072f - (fCos * 0.072f);
        float f11 = 0.213f - (fCos * 0.213f);
        return new ColorMatrix(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f8 - f9, (fSin * 0.928f) + f10, 0.0f, 0.0f, (0.143f * fSin) + f11, (0.285f * fCos) + 0.715f + (0.14f * fSin), f10 - (0.283f * fSin), 0.0f, 0.0f, f11 - (0.787f * fSin), f8 + f9, (fCos * 0.928f) + 0.072f + (fSin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix k(float f7) {
        float f8 = 1 - (2 * f7);
        float f9 = f7 * 255;
        return new ColorMatrix(new float[]{f8, 0.0f, 0.0f, 0.0f, f9, 0.0f, f8, 0.0f, 0.0f, f9, 0.0f, 0.0f, f8, 0.0f, f9, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix o(float f7) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(f7);
        return colorMatrix;
    }

    private final ColorMatrix q(float f7) {
        float f8 = 1 - f7;
        return new ColorMatrix(new float[]{(0.607f * f8) + 0.393f, 0.769f - (f8 * 0.769f), 0.189f - (f8 * 0.189f), 0.0f, 0.0f, 0.349f - (f8 * 0.349f), (0.314f * f8) + 0.686f, 0.168f - (f8 * 0.168f), 0.0f, 0.0f, 0.272f - (f8 * 0.272f), 0.534f - (f8 * 0.534f), (f8 * 0.869f) + 0.131f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static final boolean s(ReadableArray readableArray) {
        if (readableArray == null) {
            return false;
        }
        int size = readableArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (w5.k.b(readableArray.getMap(i7).getEntryIterator().next().getKey(), "blur")) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ColorMatrixColorFilter t(ReadableArray readableArray) {
        ColorMatrix colorMatrixO;
        if (readableArray == null) {
            return null;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        int size = readableArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            Map.Entry<String, Object> next = readableArray.getMap(i7).getEntryIterator().next();
            String key = next.getKey();
            Object value = next.getValue();
            w5.k.d(value, "null cannot be cast to non-null type kotlin.Double");
            float fDoubleValue = (float) ((Double) value).doubleValue();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixO = f12619a.o(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixO);
                    break;
                    break;
                case -1267206133:
                    if (!key.equals("opacity")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixO = f12619a.m(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixO);
                    break;
                    break;
                case -1183703082:
                    if (!key.equals("invert")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixO = f12619a.k(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixO);
                    break;
                    break;
                case -905411385:
                    if (!key.equals("grayscale")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixO = f12619a.g(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixO);
                    break;
                    break;
                case -566947070:
                    if (!key.equals("contrast")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixO = f12619a.e(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixO);
                    break;
                    break;
                case 109324790:
                    if (!key.equals("sepia")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixO = f12619a.q(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixO);
                    break;
                    break;
                case 648162385:
                    if (!key.equals("brightness")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixO = f12619a.b(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixO);
                    break;
                    break;
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixO = f12619a.i(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixO);
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid color matrix filter: " + key);
            }
        }
        return new ColorMatrixColorFilter(colorMatrix);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final RenderEffect u(ReadableArray readableArray) {
        RenderEffect renderEffectP = null;
        if (readableArray == null) {
            return null;
        }
        int size = readableArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            Map.Entry<String, Object> next = readableArray.getMap(i7).getEntryIterator().next();
            String key = next.getKey();
            Object value = next.getValue();
            w5.k.d(value, "null cannot be cast to non-null type kotlin.Double");
            float fDoubleValue = (float) ((Double) value).doubleValue();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    renderEffectP = f12619a.p(fDoubleValue, renderEffectP);
                    break;
                    break;
                case -1267206133:
                    if (!key.equals("opacity")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    renderEffectP = f12619a.n(fDoubleValue, renderEffectP);
                    break;
                    break;
                case -1183703082:
                    if (!key.equals("invert")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    renderEffectP = f12619a.l(fDoubleValue, renderEffectP);
                    break;
                    break;
                case -905411385:
                    if (!key.equals("grayscale")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    renderEffectP = f12619a.h(fDoubleValue, renderEffectP);
                    break;
                    break;
                case -566947070:
                    if (!key.equals("contrast")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    renderEffectP = f12619a.f(fDoubleValue, renderEffectP);
                    break;
                    break;
                case 3027047:
                    if (!key.equals("blur")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    renderEffectP = f12619a.a(fDoubleValue, renderEffectP);
                    break;
                    break;
                case 109324790:
                    if (!key.equals("sepia")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    renderEffectP = f12619a.r(fDoubleValue, renderEffectP);
                    break;
                    break;
                case 648162385:
                    if (!key.equals("brightness")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    renderEffectP = f12619a.c(fDoubleValue, renderEffectP);
                    break;
                    break;
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    renderEffectP = f12619a.j(fDoubleValue, renderEffectP);
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid filter name: " + key);
            }
        }
        return renderEffectP;
    }

    public final RenderEffect a(float f7, RenderEffect renderEffect) {
        if (f7 <= 0.5d) {
            return null;
        }
        float fD = (G.d(f7) - 0.5f) / 0.57735f;
        return renderEffect == null ? RenderEffect.createBlurEffect(fD, fD, Shader.TileMode.DECAL) : RenderEffect.createBlurEffect(fD, fD, renderEffect, Shader.TileMode.DECAL);
    }

    public final RenderEffect c(float f7, RenderEffect renderEffect) {
        return d(b(f7), renderEffect);
    }

    public final RenderEffect f(float f7, RenderEffect renderEffect) {
        return d(e(f7), renderEffect);
    }

    public final RenderEffect h(float f7, RenderEffect renderEffect) {
        return d(g(f7), renderEffect);
    }

    public final RenderEffect j(float f7, RenderEffect renderEffect) {
        return d(i(f7), renderEffect);
    }

    public final RenderEffect l(float f7, RenderEffect renderEffect) {
        return d(k(f7), renderEffect);
    }

    public final ColorMatrix m(float f7) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(1.0f, 1.0f, 1.0f, f7);
        return colorMatrix;
    }

    public final RenderEffect n(float f7, RenderEffect renderEffect) {
        return d(m(f7), renderEffect);
    }

    public final RenderEffect p(float f7, RenderEffect renderEffect) {
        return d(o(f7), renderEffect);
    }

    public final RenderEffect r(float f7, RenderEffect renderEffect) {
        return d(q(f7), renderEffect);
    }
}
