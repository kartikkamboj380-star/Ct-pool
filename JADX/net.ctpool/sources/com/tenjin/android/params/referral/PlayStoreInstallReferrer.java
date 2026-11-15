package com.tenjin.android.params.referral;

import android.content.Context;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.tenjin.android.utils.Reflection;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes.dex */
public class PlayStoreInstallReferrer implements InvocationHandler {
    private static final String REFERRER_LOG_TAG = "Tenjin";
    private static final int referrerRetryLimit = 3;
    public PlayStoreAttributionCallback callback;
    private final Context context;
    private Object googleInstallReferrerClient;
    private int referrerRetryCount = 0;
    private final Object installReferrerLock = new Object();
    private boolean installReferrerReceived = false;

    static class GooglePlayInstallReferrerResponse {
        public static final int DEVELOPER_ERROR = 3;
        public static final int DISCONNECTED = -1;
        public static final int FEATURE_NOT_SUPPORTED = 2;
        public static final int OK = 0;
        public static final int SERVICE_UNAVAILABLE = 1;

        GooglePlayInstallReferrerResponse() {
        }
    }

    public interface PlayStoreAttributionCallback {
        void onComplete(String str, long j7, long j8);

        void onFail();
    }

    public PlayStoreInstallReferrer(Context context) {
        this.context = context.getApplicationContext();
    }

    private void closeInstallReferrerClient() {
        Object obj = this.googleInstallReferrerClient;
        if (obj == null) {
            return;
        }
        try {
            Reflection.runInstanceMethod(obj, "endConnection", null, new Object[0]);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        this.googleInstallReferrerClient = null;
    }

    private Object createInstallReferrerClient(Context context) {
        try {
            return Reflection.runInstanceMethod(Reflection.runStaticMethod("com.android.installreferrer.api.InstallReferrerClient", "newBuilder", new Class[]{Context.class}, context), "build", null, new Object[0]);
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }

    private Object createProxyInstallReferrerStateListener(Class cls) {
        try {
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this);
        } catch (IllegalArgumentException | NullPointerException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    private Object getInstallReferrerDetails() {
        Object obj = this.googleInstallReferrerClient;
        if (obj == null) {
            return null;
        }
        try {
            return Reflection.runInstanceMethod(obj, "getInstallReferrer", null, new Object[0]);
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }

    private Class getInstallReferrerStateListenerClass() {
        return InstallReferrerStateListener.class;
    }

    private InstallReferrerDetails getReferralData(Object obj) {
        if (obj == null) {
            return null;
        }
        return new InstallReferrerDetails((String) Reflection.runInstanceMethod(obj, "getInstallReferrer", null, new Object[0]), ((Long) Reflection.runInstanceMethod(obj, "getInstallBeginTimestampSeconds", null, new Object[0])).longValue(), ((Long) Reflection.runInstanceMethod(obj, "getReferrerClickTimestampSeconds", null, new Object[0])).longValue());
    }

    private void handleGooglePlayReferrerClientResponse(int i7) {
        Log.d(REFERRER_LOG_TAG, "installReferrer client response: " + i7);
        if (i7 == -1) {
            retryGoogleInstallClientConnection();
            return;
        }
        if (i7 == 0) {
            tryExtractReferralDetails();
            return;
        }
        if (i7 != 1 && i7 != 2 && i7 != 3) {
            closeInstallReferrerClient();
            return;
        }
        PlayStoreAttributionCallback playStoreAttributionCallback = this.callback;
        if (playStoreAttributionCallback != null) {
            playStoreAttributionCallback.onFail();
        }
    }

    private void retryGoogleInstallClientConnection() {
        synchronized (this.installReferrerLock) {
            try {
                if (this.installReferrerReceived) {
                    return;
                }
                int i7 = this.referrerRetryCount + 1;
                this.referrerRetryCount = i7;
                if (i7 > 3) {
                    return;
                }
                try {
                    Thread.sleep(1000L);
                    startConnection();
                } catch (InterruptedException e7) {
                    e7.printStackTrace();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean startGoogleInstallReferrerConnection(Class cls, Object obj) {
        try {
            Reflection.runInstanceMethod(this.googleInstallReferrerClient, "startConnection", new Class[]{cls}, obj);
            return true;
        } catch (Exception e7) {
            e7.printStackTrace();
            return false;
        }
    }

    private void tryExtractReferralDetails() {
        try {
            InstallReferrerDetails referralData = getReferralData(getInstallReferrerDetails());
            Log.d(REFERRER_LOG_TAG, "installReferrer: " + referralData.url);
            Log.d(REFERRER_LOG_TAG, "clickTime: " + referralData.clickTimestamp);
            Log.d(REFERRER_LOG_TAG, "installBeginTime: " + referralData.installTimestamp);
            PlayStoreAttributionCallback playStoreAttributionCallback = this.callback;
            if (playStoreAttributionCallback != null) {
                playStoreAttributionCallback.onComplete(referralData.url, referralData.clickTimestamp, referralData.installTimestamp);
            }
            synchronized (this.installReferrerLock) {
                this.installReferrerReceived = true;
            }
            closeInstallReferrerClient();
        } catch (Exception unused) {
            retryGoogleInstallClientConnection();
        }
    }

    public boolean getInstallReferrer(PlayStoreAttributionCallback playStoreAttributionCallback) {
        if (playStoreAttributionCallback == null) {
            Log.e(REFERRER_LOG_TAG, "getInstallReferrer callback is null");
            return false;
        }
        this.callback = playStoreAttributionCallback;
        return startConnection();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        String name;
        String str;
        if (method == null || (name = method.getName()) == null) {
            return null;
        }
        if (objArr == null) {
            objArr = new Object[0];
        }
        if (name.equals("onInstallReferrerSetupFinished")) {
            if (objArr.length != 1) {
                str = "InstallReferrer onInstallReferrerSetupFinished responseCode no result";
            } else {
                Object obj2 = objArr[0];
                if (obj2 instanceof Integer) {
                    handleGooglePlayReferrerClientResponse(((Integer) obj2).intValue());
                } else {
                    str = "InstallReferrer onInstallReferrerSetupFinished responseCode not int";
                }
            }
            Log.d(REFERRER_LOG_TAG, str);
            return null;
        }
        if (name.equals("onInstallReferrerServiceDisconnected")) {
            Log.d(REFERRER_LOG_TAG, "InstallReferrer onInstallReferrerServiceDisconnected");
        }
        return null;
    }

    public boolean startConnection() {
        Log.d(REFERRER_LOG_TAG, "Attempting to retrieve Play Store referral info, attempt " + this.referrerRetryCount + 1);
        synchronized (this.installReferrerLock) {
            try {
                closeInstallReferrerClient();
                if (this.installReferrerReceived) {
                    return false;
                }
                Context context = this.context;
                if (context == null) {
                    return false;
                }
                Object objCreateInstallReferrerClient = createInstallReferrerClient(context);
                this.googleInstallReferrerClient = objCreateInstallReferrerClient;
                if (objCreateInstallReferrerClient == null) {
                    return false;
                }
                Class installReferrerStateListenerClass = getInstallReferrerStateListenerClass();
                if (installReferrerStateListenerClass == null) {
                    return false;
                }
                Object objCreateProxyInstallReferrerStateListener = createProxyInstallReferrerStateListener(installReferrerStateListenerClass);
                if (objCreateProxyInstallReferrerStateListener == null) {
                    return false;
                }
                return startGoogleInstallReferrerConnection(installReferrerStateListenerClass, objCreateProxyInstallReferrerStateListener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
