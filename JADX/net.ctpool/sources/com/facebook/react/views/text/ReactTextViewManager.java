package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build;
import android.text.Spannable;
import com.facebook.react.AbstractC0831n;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.I;
import com.facebook.react.uimanager.InterfaceC0870d0;
import com.facebook.react.uimanager.W;
import i2.InterfaceC1741a;
import java.util.HashMap;
import java.util.Map;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ReactTextViewManager.REACT_CLASS)
public class ReactTextViewManager extends ReactTextAnchorViewManager<m, h> implements com.facebook.react.uimanager.r {
    public static final String REACT_CLASS = "RCTText";
    private static final String TAG = "ReactTextViewManager";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    protected n mReactTextViewManagerCallback;

    public ReactTextViewManager() {
        this(null);
    }

    private Object getReactTextUpdate(m mVar, W w6, com.facebook.react.common.mapbuffer.a aVar) {
        com.facebook.react.common.mapbuffer.a aVarD0 = aVar.D0(0);
        com.facebook.react.common.mapbuffer.a aVarD02 = aVar.D0(1);
        Spannable spannableF = s.f(mVar.getContext(), aVarD0, null);
        mVar.setSpanned(spannableF);
        try {
            mVar.setMinimumFontSize((float) aVarD02.getDouble(6));
            return new i(spannableF, -1, false, s.h(aVarD0, spannableF, mVar.getGravityHorizontal()), q.h(aVarD02.getString(2)), q.d(w6, Build.VERSION.SDK_INT >= 26 ? mVar.getJustificationMode() : 0));
        } catch (IllegalArgumentException e7) {
            P0.a.l(TAG, "Paragraph Attributes: %s", aVarD02 != null ? aVarD02.toString() : "<empty>");
            throw e7;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(S1.f.e("topTextLayout", S1.f.d("registrationName", "onTextLayout"), "topInlineViewLayout", S1.f.d("registrationName", "onInlineViewLayout")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<h> getShadowNodeClass() {
        return h.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, com.facebook.react.common.mapbuffer.a aVar, com.facebook.react.common.mapbuffer.a aVar2, com.facebook.react.common.mapbuffer.a aVar3, float f7, com.facebook.yoga.p pVar, float f8, com.facebook.yoga.p pVar2, float[] fArr) {
        return s.k(context, aVar, aVar2, f7, pVar, f8, pVar2, null, fArr);
    }

    @Override // com.facebook.react.uimanager.r
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @InterfaceC2218a(name = "overflow")
    public void setOverflow(m mVar, String str) {
        mVar.setOverflow(str);
    }

    public ReactTextViewManager(n nVar) {
        setupViewRecycling();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createShadowNodeInstance() {
        return new h(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public m createViewInstance(C0872e0 c0872e0) {
        return new m(c0872e0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(m mVar) {
        super.onAfterUpdateTransaction(mVar);
        mVar.y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public m prepareToRecycleView(C0872e0 c0872e0, m mVar) {
        super.prepareToRecycleView(c0872e0, mVar);
        mVar.u();
        setSelectionColor(mVar, null);
        return mVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(m mVar, int i7, int i8, int i9, int i10) {
        mVar.setPadding(i7, i8, i9, i10);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(m mVar, Object obj) {
        i iVar = (i) obj;
        Spannable spannableI = iVar.i();
        if (iVar.b()) {
            M2.n.g(spannableI, mVar);
        }
        mVar.setText(iVar);
        M2.f[] fVarArr = (M2.f[]) spannableI.getSpans(0, iVar.i().length(), M2.f.class);
        if (fVarArr.length > 0) {
            mVar.setTag(AbstractC0831n.f11976f, new I.d(fVarArr, spannableI));
            I.i0(mVar, mVar.isFocusable(), mVar.getImportantForAccessibility());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(m mVar, W w6, InterfaceC0870d0 interfaceC0870d0) {
        ReadableMapBuffer readableMapBufferC = interfaceC0870d0.c();
        if (readableMapBufferC != null) {
            return getReactTextUpdate(mVar, w6, readableMapBufferC);
        }
        return null;
    }

    public h createShadowNodeInstance(n nVar) {
        return new h(nVar);
    }
}
