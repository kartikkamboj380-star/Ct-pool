package com.facebook.react.modules.vibration;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import com.facebook.fbreact.specs.NativeVibrationSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import i2.InterfaceC1741a;
import s2.AbstractC2044d;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"MissingPermission"})
@InterfaceC1741a(name = NativeVibrationSpec.NAME)
public final class VibrationModule extends NativeVibrationSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibrationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "reactContext");
    }

    private final Vibrator getVibrator() {
        if (Build.VERSION.SDK_INT < 31) {
            return (Vibrator) getReactApplicationContext().getSystemService("vibrator");
        }
        VibratorManager vibratorManagerA = AbstractC2044d.a(getReactApplicationContext().getSystemService("vibrator_manager"));
        if (vibratorManagerA != null) {
            return vibratorManagerA.getDefaultVibrator();
        }
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void cancel() {
        Vibrator vibrator = getVibrator();
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void vibrate(double d7) {
        int i7 = (int) d7;
        Vibrator vibrator = getVibrator();
        if (vibrator == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createOneShot(i7, -1));
        } else {
            vibrator.vibrate(i7);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void vibrateByPattern(ReadableArray readableArray, double d7) {
        k.f(readableArray, "pattern");
        int i7 = (int) d7;
        Vibrator vibrator = getVibrator();
        if (vibrator == null) {
            return;
        }
        long[] jArr = new long[readableArray.size()];
        int size = readableArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            jArr[i8] = readableArray.getInt(i8);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(VibrationEffect.createWaveform(jArr, i7));
        } else {
            vibrator.vibrate(jArr, i7);
        }
    }
}
