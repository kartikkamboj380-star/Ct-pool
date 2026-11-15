package com.tenjin.android.utils;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.tenjin.android.utils.threading.IThreading;
import com.tenjin.android.utils.threading.TenjinHandlerThread;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class TenjinUtils {
    private static IThreading async;
    public static long startTime;

    public static <T> T[] concat(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static long getDelayForRetry(int i7) {
        return Math.round(Math.random() * Math.min(3600.0d, Math.pow(i7, 2.0d)));
    }

    public static String getHMACSignature(Map<String, String> map, String str) {
        String str2 = ((((("" + map.get("bundle_id") + ".") + map.get("platform") + ".") + map.get("session_id") + ".") + map.get("tenjin_id") + ".") + map.get("sdk_version") + ".") + map.get("sent_at");
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str.getBytes(), "HmacSHA256"));
            return Base64.encodeToString(mac.doFinal(str2.getBytes()), 0);
        } catch (InvalidKeyException | NoSuchAlgorithmException e7) {
            e7.printStackTrace();
            return "";
        }
    }

    public static Boolean isNullOrEmpty(String str) {
        return Boolean.valueOf(str == null || str.length() == 0);
    }

    public static String join(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < strArr.length; i7++) {
            sb.append(strArr[i7]);
            if (i7 != strArr.length - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static void runAsync(Runnable runnable) {
        if (async == null) {
            TenjinHandlerThread tenjinHandlerThread = new TenjinHandlerThread("TenjinSDKThread");
            tenjinHandlerThread.start();
            async = tenjinHandlerThread;
        }
        async.post(runnable);
    }

    public static void runOnMainThread(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }
}
