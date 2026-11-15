package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes2.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    void setAllowContentAccess(boolean z6);

    void setAllowFileAccess(boolean z6);

    void setBlockNetworkLoads(boolean z6);

    void setCacheMode(int i7);
}
