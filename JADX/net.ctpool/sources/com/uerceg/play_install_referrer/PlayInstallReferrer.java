package com.uerceg.play_install_referrer;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: loaded from: classes.dex */
public class PlayInstallReferrer extends ReactContextBaseJavaModule {

    class a implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InstallReferrerClient f18627a;

        a(InstallReferrerClient installReferrerClient) {
            this.f18627a = installReferrerClient;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i7) {
            WritableMap writableMapCreateMap;
            PlayInstallReferrer playInstallReferrer;
            ReactApplicationContext reactApplicationContext;
            if (i7 == -1) {
                writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("responseCode", "SERVICE_DISCONNECTED");
                writableMapCreateMap.putString("message", "SERVICE_DISCONNECTED");
                playInstallReferrer = PlayInstallReferrer.this;
                reactApplicationContext = playInstallReferrer.getReactApplicationContext();
            } else {
                if (i7 == 0) {
                    try {
                        ReferrerDetails installReferrer = this.f18627a.getInstallReferrer();
                        if (installReferrer != null) {
                            String installReferrer2 = installReferrer.getInstallReferrer();
                            long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                            long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                            long referrerClickTimestampServerSeconds = installReferrer.getReferrerClickTimestampServerSeconds();
                            long installBeginTimestampServerSeconds = installReferrer.getInstallBeginTimestampServerSeconds();
                            String installVersion = installReferrer.getInstallVersion();
                            boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                            WritableMap writableMapCreateMap2 = Arguments.createMap();
                            writableMapCreateMap2.putString("installReferrer", installReferrer2);
                            writableMapCreateMap2.putString("referrerClickTimestampSeconds", Long.toString(referrerClickTimestampSeconds));
                            writableMapCreateMap2.putString("installBeginTimestampSeconds", Long.toString(installBeginTimestampSeconds));
                            writableMapCreateMap2.putString("referrerClickTimestampServerSeconds", Long.toString(referrerClickTimestampServerSeconds));
                            writableMapCreateMap2.putString("installBeginTimestampServerSeconds", Long.toString(installBeginTimestampServerSeconds));
                            writableMapCreateMap2.putString("installVersion", installVersion);
                            writableMapCreateMap2.putString("googlePlayInstant", Boolean.toString(googlePlayInstantParam));
                            PlayInstallReferrer playInstallReferrer2 = PlayInstallReferrer.this;
                            playInstallReferrer2.sendEvent(playInstallReferrer2.getReactApplicationContext(), "play_install_referrer_value", writableMapCreateMap2);
                        } else {
                            WritableMap writableMapCreateMap3 = Arguments.createMap();
                            writableMapCreateMap3.putString("message", "Response from install referrer library was null");
                            PlayInstallReferrer playInstallReferrer3 = PlayInstallReferrer.this;
                            playInstallReferrer3.sendEvent(playInstallReferrer3.getReactApplicationContext(), "play_install_referrer_error", writableMapCreateMap3);
                        }
                        return;
                    } catch (RemoteException e7) {
                        WritableMap writableMapCreateMap4 = Arguments.createMap();
                        writableMapCreateMap4.putString("message", "Exception while reading install referrer info: " + e7.getMessage());
                        PlayInstallReferrer playInstallReferrer4 = PlayInstallReferrer.this;
                        playInstallReferrer4.sendEvent(playInstallReferrer4.getReactApplicationContext(), "play_install_referrer_error", writableMapCreateMap4);
                        return;
                    }
                }
                if (i7 == 1) {
                    writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("responseCode", "SERVICE_UNAVAILABLE");
                    writableMapCreateMap.putString("message", "SERVICE_UNAVAILABLE");
                    playInstallReferrer = PlayInstallReferrer.this;
                    reactApplicationContext = playInstallReferrer.getReactApplicationContext();
                } else if (i7 == 2) {
                    writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("responseCode", "FEATURE_NOT_SUPPORTED");
                    writableMapCreateMap.putString("message", "FEATURE_NOT_SUPPORTED");
                    playInstallReferrer = PlayInstallReferrer.this;
                    reactApplicationContext = playInstallReferrer.getReactApplicationContext();
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putString("responseCode", "DEVELOPER_ERROR");
                    writableMapCreateMap.putString("message", "DEVELOPER_ERROR");
                    playInstallReferrer = PlayInstallReferrer.this;
                    reactApplicationContext = playInstallReferrer.getReactApplicationContext();
                }
            }
            playInstallReferrer.sendEvent(reactApplicationContext, "play_install_referrer_error", writableMapCreateMap);
        }
    }

    public PlayInstallReferrer(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void getInstallReferrerInfo() {
        try {
            InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(getReactApplicationContext()).build();
            installReferrerClientBuild.startConnection(new a(installReferrerClientBuild));
        } catch (Throwable th) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("message", "Exception while starting connection with referrer client: " + th.getMessage());
            sendEvent(getReactApplicationContext(), "play_install_referrer_error", writableMapCreateMap);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PlayInstallReferrer";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }
}
