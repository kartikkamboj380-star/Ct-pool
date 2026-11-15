package com.tenjin.android.params.referral;

/* JADX INFO: loaded from: classes.dex */
public class InstallReferrerDetails {
    long clickTimestamp;
    long installTimestamp;
    String url;

    public InstallReferrerDetails(String str, long j7, long j8) {
        this.url = str;
        this.installTimestamp = j7;
        this.clickTimestamp = j8;
    }
}
