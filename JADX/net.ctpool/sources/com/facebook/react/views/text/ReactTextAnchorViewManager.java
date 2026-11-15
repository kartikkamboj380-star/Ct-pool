package com.facebook.react.views.text;

import android.text.TextUtils;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.G;
import com.facebook.react.views.text.c;
import com.google.android.gms.common.api.Api;
import x2.InterfaceC2218a;
import x2.InterfaceC2219b;

/* JADX INFO: loaded from: classes.dex */
public abstract class ReactTextAnchorViewManager<T extends View, C extends c> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final String TAG = "ReactTextAnchorViewManager";

    @InterfaceC2218a(name = "accessible")
    public void setAccessible(m mVar, boolean z6) {
        mVar.setFocusable(z6);
    }

    @InterfaceC2218a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(m mVar, boolean z6) {
        mVar.setAdjustFontSizeToFit(z6);
    }

    @InterfaceC2218a(name = "android_hyphenationFrequency")
    public void setAndroidHyphenationFrequency(m mVar, String str) {
        int i7;
        if (str != null && !str.equals("none")) {
            if (str.equals("full")) {
                i7 = 2;
            } else if (str.equals("normal")) {
                i7 = 1;
            } else {
                P0.a.G("ReactNative", "Invalid android_hyphenationFrequency: " + str);
            }
            mVar.setHyphenationFrequency(i7);
            return;
        }
        mVar.setHyphenationFrequency(0);
    }

    @InterfaceC2219b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(m mVar, int i7, Integer num) {
        mVar.v(SPACING_TYPES[i7], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @InterfaceC2219b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(m mVar, int i7, float f7) {
        if (!com.facebook.yoga.g.a(f7)) {
            f7 = G.d(f7);
        }
        if (i7 == 0) {
            mVar.setBorderRadius(f7);
        } else {
            mVar.w(f7, i7 - 1);
        }
    }

    @InterfaceC2218a(name = "borderStyle")
    public void setBorderStyle(m mVar, String str) {
        mVar.setBorderStyle(str);
    }

    @InterfaceC2219b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(m mVar, int i7, float f7) {
        if (!com.facebook.yoga.g.a(f7)) {
            f7 = G.d(f7);
        }
        mVar.x(SPACING_TYPES[i7], f7);
    }

    @InterfaceC2218a(name = "dataDetectorType")
    public void setDataDetectorType(m mVar, String str) {
        int i7;
        if (str != null) {
            switch (str) {
                case "phoneNumber":
                    i7 = 4;
                    break;
                case "all":
                    i7 = 15;
                    break;
                case "link":
                    mVar.setLinkifyMask(1);
                    return;
                case "email":
                    mVar.setLinkifyMask(2);
                    return;
            }
            mVar.setLinkifyMask(i7);
            return;
        }
        mVar.setLinkifyMask(0);
    }

    @InterfaceC2218a(defaultBoolean = false, name = "disabled")
    public void setDisabled(m mVar, boolean z6) {
        mVar.setEnabled(!z6);
    }

    @InterfaceC2218a(name = "ellipsizeMode")
    public void setEllipsizeMode(m mVar, String str) {
        TextUtils.TruncateAt truncateAt;
        if (str == null || str.equals("tail")) {
            truncateAt = TextUtils.TruncateAt.END;
        } else if (str.equals("head")) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (str.equals("middle")) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else if (str.equals("clip")) {
            truncateAt = null;
        } else {
            P0.a.G("ReactNative", "Invalid ellipsizeMode: " + str);
            truncateAt = TextUtils.TruncateAt.END;
        }
        mVar.setEllipsizeLocation(truncateAt);
    }

    @InterfaceC2218a(name = "fontSize")
    public void setFontSize(m mVar, float f7) {
        mVar.setFontSize(f7);
    }

    @InterfaceC2218a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(m mVar, boolean z6) {
        mVar.setIncludeFontPadding(z6);
    }

    @InterfaceC2218a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(m mVar, float f7) {
        mVar.setLetterSpacing(f7);
    }

    @InterfaceC2218a(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(m mVar, boolean z6) {
        mVar.setNotifyOnInlineViewLayout(z6);
    }

    @InterfaceC2218a(defaultInt = Api.BaseClientBuilder.API_PRIORITY_OTHER, name = "numberOfLines")
    public void setNumberOfLines(m mVar, int i7) {
        mVar.setNumberOfLines(i7);
    }

    @InterfaceC2218a(name = "selectable")
    public void setSelectable(m mVar, boolean z6) {
        mVar.setTextIsSelectable(z6);
    }

    @InterfaceC2218a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(m mVar, Integer num) {
        mVar.setHighlightColor(num == null ? a.c(mVar.getContext()) : num.intValue());
    }

    @InterfaceC2218a(name = "textAlignVertical")
    public void setTextAlignVertical(m mVar, String str) {
        int i7;
        if (str != null && !"auto".equals(str)) {
            if ("top".equals(str)) {
                i7 = 48;
            } else if ("bottom".equals(str)) {
                i7 = 80;
            } else if ("center".equals(str)) {
                i7 = 16;
            } else {
                P0.a.G("ReactNative", "Invalid textAlignVertical: " + str);
            }
            mVar.setGravityVertical(i7);
            return;
        }
        mVar.setGravityVertical(0);
    }
}
