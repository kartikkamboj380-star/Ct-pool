package com.facebook.react.modules.sound;

import android.media.AudioManager;
import com.facebook.fbreact.specs.NativeSoundManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import i2.InterfaceC1741a;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativeSoundManagerSpec.NAME)
public final class SoundManagerModule extends NativeSoundManagerSpec {
    public SoundManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeSoundManagerSpec
    public void playTouchSound() {
        Object systemService = getReactApplicationContext().getSystemService("audio");
        k.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        ((AudioManager) systemService).playSoundEffect(0);
    }
}
