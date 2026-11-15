package com.tenjin.android.utils;

import android.content.Context;
import android.util.Log;
import com.tenjin.android.params.AttributionParams;
import com.tenjin.android.params.platform.PlatformParams;
import com.tenjin.android.store.DataStore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class TenjinStartup {
    private final AttributionParams attribution;
    public StartupCallback callback;
    private final Context context;
    private final AtomicBoolean startupComplete = new AtomicBoolean(false);

    private class PlatformParameterWrapper {
        private PlatformParams params;

        private PlatformParameterWrapper() {
        }

        public PlatformParams getParams() {
            return this.params;
        }

        public void setParams(PlatformParams platformParams) {
            this.params = platformParams;
        }
    }

    public interface StartupCallback {
        void onStartupComplete(AttributionParams attributionParams, PlatformParams platformParams);
    }

    public TenjinStartup(Context context, DataStore dataStore) {
        this.context = context;
        this.attribution = new AttributionParams(context, dataStore);
    }

    public AtomicBoolean completed() {
        return this.startupComplete;
    }

    public void doStartup() {
        final PlatformParameterWrapper platformParameterWrapper = new PlatformParameterWrapper();
        Thread thread = new Thread() { // from class: com.tenjin.android.utils.TenjinStartup.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Log.d("TenjinStartup", "Starting attribution retrieval");
                TenjinStartup.this.attribution.getAttribution();
                Log.d("TenjinStartup", "Completed attribution retrieval");
            }
        };
        Thread thread2 = new Thread() { // from class: com.tenjin.android.utils.TenjinStartup.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Log.d("TenjinStartup", "Starting advertising id retrieval");
                try {
                    platformParameterWrapper.setParams(PlatformParams.getParamsForPlatform(TenjinStartup.this.context));
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                Log.d("TenjinStartup", "Completed advertising id retrieval");
            }
        };
        try {
            thread2.start();
            thread.start();
            thread2.join();
            thread.join();
        } catch (Exception e7) {
            Log.d("TenjinStartup", "Error on retrieving ad id + referral " + e7.getLocalizedMessage());
        }
        Log.d("TenjinStartup", "Set complete");
        this.startupComplete.set(true);
        StartupCallback startupCallback = this.callback;
        if (startupCallback != null) {
            startupCallback.onStartupComplete(this.attribution, platformParameterWrapper.getParams());
        }
    }
}
