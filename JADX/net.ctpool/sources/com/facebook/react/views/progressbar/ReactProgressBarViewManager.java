package com.facebook.react.views.progressbar;

import F2.C0351c;
import F2.InterfaceC0352d;
import android.R;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.G;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import i2.InterfaceC1741a;
import java.util.WeakHashMap;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ReactProgressBarViewManager.REACT_CLASS)
public class ReactProgressBarViewManager extends BaseViewManager<a, b> implements InterfaceC0352d {
    static final String DEFAULT_STYLE = "Normal";
    static final String PROP_ANIMATING = "animating";
    static final String PROP_ATTR = "typeAttr";
    static final String PROP_INDETERMINATE = "indeterminate";
    static final String PROP_PROGRESS = "progress";
    static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    private static Object sProgressBarCtorLock = new Object();
    private final WeakHashMap<Integer, Pair<Integer, Integer>> mMeasuredStyles = new WeakHashMap<>();
    private final A0 mDelegate = new C0351c(this);

    public static ProgressBar createProgressBar(Context context, int i7) {
        ProgressBar progressBar;
        synchronized (sProgressBarCtorLock) {
            progressBar = new ProgressBar(context, null, i7);
        }
        return progressBar;
    }

    static int getStyleFromString(String str) {
        String str2;
        if (str == null) {
            str2 = "ProgressBar needs to have a style, null received";
        } else {
            if (str.equals("Horizontal")) {
                return R.attr.progressBarStyleHorizontal;
            }
            if (str.equals("Small")) {
                return R.attr.progressBarStyleSmall;
            }
            if (str.equals("Large")) {
                return R.attr.progressBarStyleLarge;
            }
            if (str.equals("Inverse")) {
                return R.attr.progressBarStyleInverse;
            }
            if (str.equals("SmallInverse")) {
                return R.attr.progressBarStyleSmallInverse;
            }
            if (str.equals("LargeInverse")) {
                return R.attr.progressBarStyleLargeInverse;
            }
            if (str.equals(DEFAULT_STYLE)) {
                return R.attr.progressBarStyle;
            }
            str2 = "Unknown ProgressBar style: " + str;
        }
        P0.a.G("ReactNative", str2);
        return R.attr.progressBarStyle;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected A0 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<b> getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f7, p pVar, float f8, p pVar2, float[] fArr) {
        int styleFromString = getStyleFromString(readableMap2.getString(PROP_STYLE));
        Integer numValueOf = Integer.valueOf(styleFromString);
        Pair<Integer, Integer> pairCreate = this.mMeasuredStyles.get(numValueOf);
        if (pairCreate == null) {
            ProgressBar progressBarCreateProgressBar = createProgressBar(context, styleFromString);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            progressBarCreateProgressBar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            pairCreate = Pair.create(Integer.valueOf(progressBarCreateProgressBar.getMeasuredWidth()), Integer.valueOf(progressBarCreateProgressBar.getMeasuredHeight()));
            this.mMeasuredStyles.put(numValueOf, pairCreate);
        }
        return q.a(G.b(((Integer) pairCreate.first).intValue()), G.b(((Integer) pairCreate.second).intValue()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createShadowNodeInstance() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(C0872e0 c0872e0) {
        return new a(c0872e0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a aVar) {
        aVar.a();
    }

    @Override // F2.InterfaceC0352d
    @InterfaceC2218a(name = PROP_ANIMATING)
    public void setAnimating(a aVar, boolean z6) {
        aVar.b(z6);
    }

    @Override // F2.InterfaceC0352d
    @InterfaceC2218a(customType = "Color", name = "color")
    public void setColor(a aVar, Integer num) {
        aVar.d(num);
    }

    @Override // F2.InterfaceC0352d
    @InterfaceC2218a(name = PROP_INDETERMINATE)
    public void setIndeterminate(a aVar, boolean z6) {
        aVar.e(z6);
    }

    @Override // F2.InterfaceC0352d
    @InterfaceC2218a(name = PROP_PROGRESS)
    public void setProgress(a aVar, double d7) {
        aVar.f(d7);
    }

    @Override // F2.InterfaceC0352d
    @InterfaceC2218a(name = PROP_STYLE)
    public void setStyleAttr(a aVar, String str) {
        aVar.g(str);
    }

    @Override // F2.InterfaceC0352d
    public void setTestID(a aVar, String str) {
        super.setTestId(aVar, str);
    }

    @Override // F2.InterfaceC0352d
    @InterfaceC2218a(name = PROP_ATTR)
    public void setTypeAttr(a aVar, String str) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(a aVar, Object obj) {
    }
}
