package com.tenjin.android.params.referral;

/* JADX INFO: loaded from: classes.dex */
public class MetaInstallReferrerInfo {
    private final long actualTimestamp;
    private final String installReferrer;
    private final boolean isClickThrough;

    public MetaInstallReferrerInfo(String str, long j7, boolean z6) {
        this.installReferrer = str;
        this.actualTimestamp = j7;
        this.isClickThrough = z6;
    }

    public long getActualTimestamp() {
        return this.actualTimestamp;
    }

    public String getInstallReferrer() {
        return this.installReferrer;
    }

    public boolean isClickThrough() {
        return this.isClickThrough;
    }
}
