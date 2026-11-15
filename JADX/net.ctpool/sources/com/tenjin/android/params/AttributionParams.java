package com.tenjin.android.params;

import android.content.Context;
import android.util.Log;
import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.params.base.AParamProvider;
import com.tenjin.android.params.referral.HuaweiInstallReferrer;
import com.tenjin.android.params.referral.PlayStoreInstallReferrer;
import com.tenjin.android.store.DataStore;
import com.tenjin.android.utils.StoreAttribution;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public class AttributionParams extends AParamProvider {
    private static final int REFERRAL_THREADS_NUMBER = 2;
    private static final String TAG = "AttributionParams";
    private final Context context;
    private final DataStore dataStore;
    private StoreAttribution huaweiAttribution;
    private StoreAttribution playStoreAttribution;

    public AttributionParams(Context context, DataStore dataStore) {
        this.context = context;
        this.dataStore = dataStore;
    }

    private Boolean alreadyRetrievedReferral() {
        return Boolean.valueOf(this.dataStore.contains(TenjinConsts.GOOGLE_INSTALL_REFERRAL_KEY) || this.dataStore.contains(TenjinConsts.HUAWEI_INSTALL_REFERRAL_KEY));
    }

    private Thread getHuaweiReferralData(final CountDownLatch countDownLatch) {
        return new Thread(new Runnable() { // from class: com.tenjin.android.params.AttributionParams.1
            @Override // java.lang.Runnable
            public void run() {
                Log.d(AttributionParams.TAG, "Request Huawei App Gallery install referrer");
                if (new HuaweiInstallReferrer(AttributionParams.this.context).getInstallReferrer(new HuaweiInstallReferrer.HuaweiAttributionCallback() { // from class: com.tenjin.android.params.AttributionParams.1.1
                    @Override // com.tenjin.android.params.referral.HuaweiInstallReferrer.HuaweiAttributionCallback
                    public void onComplete(String str, long j7, long j8) {
                        Log.d(AttributionParams.TAG, "Retrieved referral from Huawei App Gallery - " + str);
                        AttributionParams.this.huaweiAttributionCallback(str, j7, j8);
                        countDownLatch.countDown();
                    }

                    @Override // com.tenjin.android.params.referral.HuaweiInstallReferrer.HuaweiAttributionCallback
                    public void onFail() {
                        countDownLatch.countDown();
                    }
                })) {
                    return;
                }
                countDownLatch.countDown();
            }
        });
    }

    private Thread getReferralData(final CountDownLatch countDownLatch) {
        return new Thread(new Runnable() { // from class: com.tenjin.android.params.AttributionParams.2
            @Override // java.lang.Runnable
            public void run() {
                Log.d(AttributionParams.TAG, "Request PlayStore install referrer");
                if (new PlayStoreInstallReferrer(AttributionParams.this.context).getInstallReferrer(new PlayStoreInstallReferrer.PlayStoreAttributionCallback() { // from class: com.tenjin.android.params.AttributionParams.2.1
                    @Override // com.tenjin.android.params.referral.PlayStoreInstallReferrer.PlayStoreAttributionCallback
                    public void onComplete(String str, long j7, long j8) {
                        Log.d(AttributionParams.TAG, "Retrieved referral from Play Store - " + str);
                        AttributionParams.this.playStoreAttributionCallback(str, j7, j8);
                        countDownLatch.countDown();
                    }

                    @Override // com.tenjin.android.params.referral.PlayStoreInstallReferrer.PlayStoreAttributionCallback
                    public void onFail() {
                        Log.d(AttributionParams.TAG, "No play store referral");
                        countDownLatch.countDown();
                    }
                })) {
                    return;
                }
                countDownLatch.countDown();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void huaweiAttributionCallback(String str, long j7, long j8) {
        StoreAttribution storeAttribution = new StoreAttribution(StoreAttribution.Store.Huawei, str, Long.valueOf(j7), Long.valueOf(j8));
        this.huaweiAttribution = storeAttribution;
        storeAttribution.save(this.dataStore);
    }

    private void loadReferralData() {
        this.playStoreAttribution = StoreAttribution.load(this.dataStore, StoreAttribution.Store.PlayStore);
        this.huaweiAttribution = StoreAttribution.load(this.dataStore, StoreAttribution.Store.Huawei);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void playStoreAttributionCallback(String str, long j7, long j8) {
        StoreAttribution storeAttribution = new StoreAttribution(StoreAttribution.Store.PlayStore, str, Long.valueOf(j7), Long.valueOf(j8));
        this.playStoreAttribution = storeAttribution;
        storeAttribution.save(this.dataStore);
    }

    @Override // com.tenjin.android.params.base.ParamProvider
    public Map<String, String> apply(Map<String, String> map) {
        if (hasReferralBeenApplied()) {
            return map;
        }
        StoreAttribution storeAttribution = this.playStoreAttribution;
        if (storeAttribution != null) {
            storeAttribution.apply(map);
        }
        StoreAttribution storeAttribution2 = this.huaweiAttribution;
        if (storeAttribution2 != null) {
            storeAttribution2.apply(map);
        }
        return map;
    }

    public void getAttribution() {
        if (alreadyRetrievedReferral().booleanValue()) {
            loadReferralData();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Thread referralData = getReferralData(countDownLatch);
        referralData.start();
        Thread huaweiReferralData = getHuaweiReferralData(countDownLatch);
        huaweiReferralData.start();
        try {
            referralData.join();
            huaweiReferralData.join();
            countDownLatch.await();
        } catch (Exception e7) {
            Log.e(TAG, "Error retrieving referral data from play store, " + e7.getMessage());
        }
    }

    public boolean hasReferralBeenApplied() {
        return this.dataStore.getBoolean(TenjinConsts.REFERRAL_SENT_KEY, false);
    }
}
