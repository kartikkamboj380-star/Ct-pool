package com.tenjin.android.params.platform;

/* JADX INFO: loaded from: classes.dex */
public interface IDataSource {
    String getStoredAdvertisingId();

    Boolean getStoredLimitAdTracking();

    void setAdvertisingIdInfo(String str, Boolean bool);
}
