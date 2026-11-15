package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.soloader.f;

/* JADX INFO: loaded from: classes.dex */
@f
public final class PreverificationHelper {
    @TargetApi(26)
    @f
    public final boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}
