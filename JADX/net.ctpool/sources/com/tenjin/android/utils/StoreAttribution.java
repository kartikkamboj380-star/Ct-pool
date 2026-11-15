package com.tenjin.android.utils;

import android.util.Log;
import com.tenjin.android.config.TenjinConsts;
import com.tenjin.android.store.DataStore;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class StoreAttribution {
    private static final String TAG = "StoreAttribution";
    private final Long clickTimestamp;
    private String encodedValue = null;
    private final Long installTimestamp;
    private final String referrer;
    private final Store store;

    /* JADX INFO: renamed from: com.tenjin.android.utils.StoreAttribution$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tenjin$android$utils$StoreAttribution$Field;
        static final /* synthetic */ int[] $SwitchMap$com$tenjin$android$utils$StoreAttribution$Store;

        static {
            int[] iArr = new int[Field.values().length];
            $SwitchMap$com$tenjin$android$utils$StoreAttribution$Field = iArr;
            try {
                iArr[Field.Referrer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tenjin$android$utils$StoreAttribution$Field[Field.InstallTimestamp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tenjin$android$utils$StoreAttribution$Field[Field.ClickTimestamp.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Store.values().length];
            $SwitchMap$com$tenjin$android$utils$StoreAttribution$Store = iArr2;
            try {
                iArr2[Store.PlayStore.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tenjin$android$utils$StoreAttribution$Store[Store.Huawei.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum Field {
        Referrer,
        ClickTimestamp,
        InstallTimestamp
    }

    public enum Store {
        PlayStore,
        Huawei
    }

    public StoreAttribution(Store store, String str, Long l7, Long l8) {
        this.store = store;
        this.referrer = str;
        this.clickTimestamp = l7;
        this.installTimestamp = l8;
        encodeReferrerValue();
    }

    private static String dataStoreKey(Store store) {
        return dataStoreKey(store, Field.Referrer);
    }

    private void encodeReferrerValue() {
        if (TenjinUtils.isNullOrEmpty(this.referrer).booleanValue()) {
            return;
        }
        try {
            if (Charset.isSupported("UTF-8")) {
                this.encodedValue = URLEncoder.encode(this.referrer, "UTF-8");
            }
        } catch (UnsupportedEncodingException e7) {
            Log.e(TAG, "Error UTF-8 encoding " + fieldName() + " data " + this.referrer + ", " + e7.getMessage());
        }
    }

    private String fieldName() {
        return fieldName(Field.Referrer);
    }

    public static StoreAttribution load(DataStore dataStore, Store store) {
        if (!dataStore.contains(dataStoreKey(store))) {
            return null;
        }
        String string = dataStore.getString(dataStoreKey(store), "");
        Long lValueOf = Long.valueOf(dataStore.getString(dataStoreKey(store, Field.ClickTimestamp), "0"));
        Long lValueOf2 = Long.valueOf(dataStore.getString(dataStoreKey(store, Field.InstallTimestamp), "0"));
        Log.d(TAG, "Retrieved " + store + " referral from storage - " + string);
        return new StoreAttribution(store, string, lValueOf, lValueOf2);
    }

    public void apply(Map<String, String> map) {
        if (this.encodedValue == null) {
            return;
        }
        map.put(fieldName(), this.encodedValue);
        if (this.clickTimestamp != null) {
            map.put(fieldName(Field.ClickTimestamp), String.valueOf(this.clickTimestamp));
        }
        if (this.installTimestamp != null) {
            map.put(fieldName(Field.InstallTimestamp), String.valueOf(this.installTimestamp));
        }
    }

    public void save(DataStore dataStore) {
        if (TenjinUtils.isNullOrEmpty(this.referrer).booleanValue()) {
            return;
        }
        dataStore.putString(dataStoreKey(this.store), this.referrer);
        dataStore.putString(dataStoreKey(this.store, Field.ClickTimestamp), Long.toString(this.clickTimestamp.longValue()));
        dataStore.putString(dataStoreKey(this.store, Field.InstallTimestamp), Long.toString(this.installTimestamp.longValue()));
    }

    private static String dataStoreKey(Store store, Field field) {
        int i7 = AnonymousClass1.$SwitchMap$com$tenjin$android$utils$StoreAttribution$Store[store.ordinal()];
        String str = TenjinConsts.GOOGLE_INSTALL_REFERRAL_KEY;
        if (i7 != 1 && i7 == 2) {
            str = TenjinConsts.HUAWEI_INSTALL_REFERRAL_KEY;
        }
        int i8 = AnonymousClass1.$SwitchMap$com$tenjin$android$utils$StoreAttribution$Field[field.ordinal()];
        String str2 = "";
        if (i8 != 1) {
            if (i8 == 2) {
                str2 = TenjinConsts.INSTALL_INSTALL_TS_SUFFIX;
            } else if (i8 == 3) {
                str2 = TenjinConsts.INSTALL_CLICK_TS_SUFFIX;
            }
        }
        return str + str2;
    }

    private String fieldName(Field field) {
        StringBuilder sb;
        String str;
        int i7 = AnonymousClass1.$SwitchMap$com$tenjin$android$utils$StoreAttribution$Store[this.store.ordinal()];
        String str2 = TenjinConsts.REFERRER_PARAM;
        if (i7 != 1 && i7 == 2) {
            str2 = TenjinConsts.REFERRER_PARAM_HUAWEI;
        }
        int i8 = AnonymousClass1.$SwitchMap$com$tenjin$android$utils$StoreAttribution$Field[field.ordinal()];
        if (i8 == 2) {
            sb = new StringBuilder();
            sb.append(str2);
            str = TenjinConsts.REFERRER_PARAM_INSTALL_SUFFIX;
        } else {
            if (i8 != 3) {
                return str2;
            }
            sb = new StringBuilder();
            sb.append(str2);
            str = TenjinConsts.REFERRER_PARAM_CLICK_SUFFIX;
        }
        sb.append(str);
        return sb.toString();
    }
}
