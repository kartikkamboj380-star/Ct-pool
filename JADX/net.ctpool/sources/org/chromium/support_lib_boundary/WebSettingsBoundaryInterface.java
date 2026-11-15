package org.chromium.support_lib_boundary;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public interface WebSettingsBoundaryInterface {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }

    int getDisabledActionModeMenuItems();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getOffscreenPreRaster();

    boolean getSafeBrowsingEnabled();

    boolean getWillSuppressErrorPage();

    void setDisabledActionModeMenuItems(int i7);

    void setForceDark(int i7);

    void setForceDarkBehavior(int i7);

    void setOffscreenPreRaster(boolean z6);

    void setSafeBrowsingEnabled(boolean z6);

    void setWillSuppressErrorPage(boolean z6);
}
