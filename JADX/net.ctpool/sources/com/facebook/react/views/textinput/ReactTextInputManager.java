package com.facebook.react.views.textinput;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.C0895v;
import com.facebook.react.uimanager.InterfaceC0870d0;
import com.facebook.react.uimanager.W;
import com.google.android.gms.common.Scopes;
import i2.InterfaceC1741a;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import x2.InterfaceC2218a;
import x2.InterfaceC2219b;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = ReactTextInputManager.REACT_CLASS)
public class ReactTextInputManager extends BaseViewManager<C0910j, C0895v> {
    private static final int AUTOCAPITALIZE_FLAGS = 28672;
    private static final int BLUR_TEXT_INPUT = 2;
    private static final int FOCUS_TEXT_INPUT = 1;
    private static final int IME_ACTION_ID = 1648;
    private static final int INPUT_TYPE_KEYBOARD_DECIMAL_PAD = 8194;
    private static final int INPUT_TYPE_KEYBOARD_NUMBERED = 12290;
    private static final int INPUT_TYPE_KEYBOARD_NUMBER_PAD = 2;
    private static final String KEYBOARD_TYPE_DECIMAL_PAD = "decimal-pad";
    private static final String KEYBOARD_TYPE_EMAIL_ADDRESS = "email-address";
    private static final String KEYBOARD_TYPE_NUMBER_PAD = "number-pad";
    private static final String KEYBOARD_TYPE_NUMERIC = "numeric";
    private static final String KEYBOARD_TYPE_PHONE_PAD = "phone-pad";
    private static final String KEYBOARD_TYPE_URI = "url";
    private static final String KEYBOARD_TYPE_VISIBLE_PASSWORD = "visible-password";
    private static final int PASSWORD_VISIBILITY_FLAG = 16;
    public static final String REACT_CLASS = "AndroidTextInput";
    private static final int SET_MOST_RECENT_EVENT_COUNT = 3;
    private static final int SET_TEXT_AND_SELECTION = 4;
    public static final String TAG = "ReactTextInputManager";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private static final int UNSET = -1;
    protected com.facebook.react.views.text.n mReactTextViewManagerCallback;
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final Map<String, String> REACT_PROPS_AUTOFILL_HINTS_MAP = new a();
    private static final InputFilter[] EMPTY_FILTERS = new InputFilter[0];
    private static final String[] DRAWABLE_HANDLE_RESOURCES = {"mTextSelectHandleLeftRes", "mTextSelectHandleRightRes", "mTextSelectHandleRes"};
    private static final String[] DRAWABLE_HANDLE_FIELDS = {"mSelectHandleLeft", "mSelectHandleRight", "mSelectHandleCenter"};

    class a extends HashMap {
        a() {
            put("birthdate-day", "birthDateDay");
            put("birthdate-full", "birthDateFull");
            put("birthdate-month", "birthDateMonth");
            put("birthdate-year", "birthDateYear");
            put("cc-csc", "creditCardSecurityCode");
            put("cc-exp", "creditCardExpirationDate");
            put("cc-exp-day", "creditCardExpirationDay");
            put("cc-exp-month", "creditCardExpirationMonth");
            put("cc-exp-year", "creditCardExpirationYear");
            put("cc-number", "creditCardNumber");
            put(Scopes.EMAIL, "emailAddress");
            put("gender", "gender");
            put("name", "personName");
            put("name-family", "personFamilyName");
            put("name-given", "personGivenName");
            put("name-middle", "personMiddleName");
            put("name-middle-initial", "personMiddleInitial");
            put("name-prefix", "personNamePrefix");
            put("name-suffix", "personNameSuffix");
            put("password", "password");
            put("password-new", "newPassword");
            put("postal-address", "postalAddress");
            put("postal-address-country", "addressCountry");
            put("postal-address-extended", "extendedAddress");
            put("postal-address-extended-postal-code", "extendedPostalCode");
            put("postal-address-locality", "addressLocality");
            put("postal-address-region", "addressRegion");
            put("postal-code", "postalCode");
            put("street-address", "streetAddress");
            put("sms-otp", "smsOTPCode");
            put("tel", "phoneNumber");
            put("tel-country-code", "phoneCountryCode");
            put("tel-national", "phoneNational");
            put("tel-device", "phoneNumberDevice");
            put("username", "username");
            put("username-new", "newUsername");
        }
    }

    private static class b implements InterfaceC0901a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0910j f13159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.facebook.react.uimanager.events.e f13160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f13161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f13162d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f13163e = 0;

        public b(C0910j c0910j) {
            this.f13159a = c0910j;
            ReactContext reactContextD = AbstractC0884k0.d(c0910j);
            this.f13160b = ReactTextInputManager.getEventDispatcher(reactContextD, c0910j);
            this.f13161c = AbstractC0884k0.e(reactContextD);
        }

        @Override // com.facebook.react.views.textinput.InterfaceC0901a
        public void a() {
            if (this.f13160b == null) {
                return;
            }
            int width = this.f13159a.getWidth();
            int height = this.f13159a.getHeight();
            if (this.f13159a.getLayout() != null) {
                width = this.f13159a.getCompoundPaddingLeft() + this.f13159a.getLayout().getWidth() + this.f13159a.getCompoundPaddingRight();
                height = this.f13159a.getCompoundPaddingTop() + this.f13159a.getLayout().getHeight() + this.f13159a.getCompoundPaddingBottom();
            }
            if (width == this.f13162d && height == this.f13163e) {
                return;
            }
            this.f13163e = height;
            this.f13162d = width;
            this.f13160b.c(new C0902b(this.f13161c, this.f13159a.getId(), com.facebook.react.uimanager.G.b(width), com.facebook.react.uimanager.G.b(height)));
        }
    }

    private static class c implements M {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0910j f13164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.facebook.react.uimanager.events.e f13165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f13166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f13167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f13168e;

        public c(C0910j c0910j) {
            this.f13164a = c0910j;
            ReactContext reactContextD = AbstractC0884k0.d(c0910j);
            this.f13165b = ReactTextInputManager.getEventDispatcher(reactContextD, c0910j);
            this.f13166c = AbstractC0884k0.e(reactContextD);
        }

        @Override // com.facebook.react.views.textinput.M
        public void a(int i7, int i8, int i9, int i10) {
            if (this.f13167d == i7 && this.f13168e == i8) {
                return;
            }
            this.f13165b.c(com.facebook.react.views.scroll.g.d(this.f13166c, this.f13164a.getId(), com.facebook.react.views.scroll.h.f12991p, i7, i8, 0.0f, 0.0f, 0, 0, this.f13164a.getWidth(), this.f13164a.getHeight(), false));
            this.f13167d = i7;
            this.f13168e = i8;
        }
    }

    private static class d implements N {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0910j f13169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.facebook.react.uimanager.events.e f13170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f13171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f13172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f13173e;

        public d(C0910j c0910j) {
            this.f13169a = c0910j;
            ReactContext reactContextD = AbstractC0884k0.d(c0910j);
            this.f13170b = ReactTextInputManager.getEventDispatcher(reactContextD, c0910j);
            this.f13171c = AbstractC0884k0.e(reactContextD);
        }

        @Override // com.facebook.react.views.textinput.N
        public void a(int i7, int i8) {
            int iMin = Math.min(i7, i8);
            int iMax = Math.max(i7, i8);
            if (this.f13172d == iMin && this.f13173e == iMax) {
                return;
            }
            this.f13170b.c(new J(this.f13171c, this.f13169a.getId(), iMin, iMax));
            this.f13172d = iMin;
            this.f13173e = iMax;
        }
    }

    private final class e implements TextWatcher {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final C0910j f13174m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final com.facebook.react.uimanager.events.e f13175n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f13176o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f13177p = null;

        public e(ReactContext reactContext, C0910j c0910j) {
            this.f13175n = ReactTextInputManager.getEventDispatcher(reactContext, c0910j);
            this.f13174m = c0910j;
            this.f13176o = AbstractC0884k0.e(reactContext);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            this.f13177p = charSequence.toString();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            if (this.f13174m.f13211W) {
                return;
            }
            if (i9 == 0 && i8 == 0) {
                return;
            }
            O1.a.c(this.f13177p);
            String strSubstring = charSequence.toString().substring(i7, i7 + i9);
            String strSubstring2 = this.f13177p.substring(i7, i7 + i8);
            if (i9 == i8 && strSubstring.equals(strSubstring2)) {
                return;
            }
            InterfaceC0870d0 stateWrapper = this.f13174m.getStateWrapper();
            if (stateWrapper != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("mostRecentEventCount", this.f13174m.y());
                writableNativeMap.putInt("opaqueCacheId", this.f13174m.getId());
                stateWrapper.a(writableNativeMap);
            }
            this.f13175n.c(new C0913m(this.f13176o, this.f13174m.getId(), charSequence.toString(), this.f13174m.y()));
        }
    }

    private static void checkPasswordType(C0910j c0910j) {
        if ((c0910j.getStagedInputType() & INPUT_TYPE_KEYBOARD_NUMBERED) == 0 || (c0910j.getStagedInputType() & 128) == 0) {
            return;
        }
        updateStagedInputTypeFlag(c0910j, 128, 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.facebook.react.uimanager.events.e getEventDispatcher(ReactContext reactContext, C0910j c0910j) {
        return AbstractC0884k0.c(reactContext, c0910j.getId());
    }

    private com.facebook.react.views.text.i getReactTextUpdate(String str, int i7) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) com.facebook.react.views.text.t.h(str, com.facebook.react.views.text.t.UNSET));
        return new com.facebook.react.views.text.i(spannableStringBuilder, i7, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addEventEmitters$0(C0872e0 c0872e0, C0910j c0910j, View view, boolean z6) {
        com.facebook.react.uimanager.events.d oVar;
        int iC = c0872e0.c();
        com.facebook.react.uimanager.events.e eventDispatcher = getEventDispatcher(c0872e0, c0910j);
        if (z6) {
            oVar = new p(iC, c0910j.getId());
        } else {
            eventDispatcher.c(new C0914n(iC, c0910j.getId()));
            oVar = new o(iC, c0910j.getId(), c0910j.getText().toString());
        }
        eventDispatcher.c(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$addEventEmitters$1(C0910j c0910j, C0872e0 c0872e0, TextView textView, int i7, KeyEvent keyEvent) {
        if ((i7 & 255) == 0 && i7 != 0) {
            return true;
        }
        boolean z6 = c0910j.z();
        boolean zX = c0910j.X();
        boolean zW = c0910j.W();
        if (zX) {
            getEventDispatcher(c0872e0, c0910j).c(new L(c0872e0.c(), c0910j.getId(), c0910j.getText().toString()));
        }
        if (zW) {
            c0910j.clearFocus();
        }
        return zW || zX || !z6 || i7 == 5 || i7 == 7;
    }

    private void setAutofillHints(C0910j c0910j, String... strArr) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        c0910j.setAutofillHints(strArr);
    }

    private void setImportantForAutofill(C0910j c0910j, int i7) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        c0910j.setImportantForAutofill(i7);
    }

    private static boolean shouldHideCursorForEmailTextInput() {
        return Build.VERSION.SDK_INT == 29 && Build.MANUFACTURER.toLowerCase(Locale.ROOT).contains("xiaomi");
    }

    private static void updateStagedInputTypeFlag(C0910j c0910j, int i7, int i8) {
        c0910j.setStagedInputType(((~i7) & c0910j.getStagedInputType()) | i8);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return S1.f.e("focusTextInput", 1, "blurTextInput", 2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(S1.f.a().b("topSubmitEditing", S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onSubmitEditing", "captured", "onSubmitEditingCapture"))).b("topEndEditing", S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onEndEditing", "captured", "onEndEditingCapture"))).b("topFocus", S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onFocus", "captured", "onFocusCapture"))).b("topBlur", S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onBlur", "captured", "onBlurCapture"))).b("topKeyPress", S1.f.d("phasedRegistrationNames", S1.f.e("bubbled", "onKeyPress", "captured", "onKeyPressCapture"))).a());
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(S1.f.a().b(com.facebook.react.views.scroll.h.h(com.facebook.react.views.scroll.h.f12991p), S1.f.d("registrationName", "onScroll")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return S1.f.d("AutoCapitalizationType", S1.f.g("none", 0, "characters", 4096, "words", 8192, "sentences", 16384));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends C0895v> getShadowNodeClass() {
        return K.class;
    }

    @InterfaceC2218a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(C0910j c0910j, boolean z6) {
        c0910j.setAllowFontScaling(z6);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    @InterfaceC2218a(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAutoCapitalize(C0910j c0910j, Dynamic dynamic) {
        int iAsInt = 0;
        if (dynamic.getType() == ReadableType.Number) {
            iAsInt = dynamic.asInt();
        } else if (dynamic.getType() == ReadableType.String) {
            String strAsString = dynamic.asString();
            strAsString.hashCode();
            byte b7 = -1;
            switch (strAsString.hashCode()) {
                case 3387192:
                    if (strAsString.equals("none")) {
                        b7 = 0;
                    }
                    break;
                case 113318569:
                    if (strAsString.equals("words")) {
                        b7 = 1;
                    }
                    break;
                case 490141296:
                    if (strAsString.equals("sentences")) {
                        b7 = 2;
                    }
                    break;
                case 1245424234:
                    if (strAsString.equals("characters")) {
                        b7 = 3;
                    }
                    break;
            }
            switch (b7) {
                case 0:
                    break;
                case 1:
                    iAsInt = 8192;
                    break;
                case 2:
                default:
                    iAsInt = 16384;
                    break;
                case 3:
                    iAsInt = 4096;
                    break;
            }
        }
        updateStagedInputTypeFlag(c0910j, AUTOCAPITALIZE_FLAGS, iAsInt);
    }

    @InterfaceC2218a(name = "autoCorrect")
    public void setAutoCorrect(C0910j c0910j, Boolean bool) {
        updateStagedInputTypeFlag(c0910j, 557056, bool != null ? bool.booleanValue() ? 32768 : 524288 : 0);
    }

    @InterfaceC2218a(defaultBoolean = false, name = "autoFocus")
    public void setAutoFocus(C0910j c0910j, boolean z6) {
        c0910j.setAutoFocus(z6);
    }

    @InterfaceC2219b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(C0910j c0910j, int i7, Integer num) {
        c0910j.S(SPACING_TYPES[i7], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @InterfaceC2219b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(C0910j c0910j, int i7, float f7) {
        if (!com.facebook.yoga.g.a(f7)) {
            f7 = com.facebook.react.uimanager.G.d(f7);
        }
        if (i7 == 0) {
            c0910j.setBorderRadius(f7);
        } else {
            c0910j.T(f7, i7 - 1);
        }
    }

    @InterfaceC2218a(name = "borderStyle")
    public void setBorderStyle(C0910j c0910j, String str) {
        c0910j.setBorderStyle(str);
    }

    @InterfaceC2219b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(C0910j c0910j, int i7, float f7) {
        if (!com.facebook.yoga.g.a(f7)) {
            f7 = com.facebook.react.uimanager.G.d(f7);
        }
        c0910j.U(SPACING_TYPES[i7], f7);
    }

    @InterfaceC2218a(defaultBoolean = false, name = "caretHidden")
    public void setCaretHidden(C0910j c0910j, boolean z6) {
        if (c0910j.getStagedInputType() == 32 && shouldHideCursorForEmailTextInput()) {
            return;
        }
        c0910j.setCursorVisible(!z6);
    }

    @InterfaceC2218a(customType = "Color", name = "color")
    public void setColor(C0910j c0910j, Integer num) {
        if (num != null) {
            c0910j.setTextColor(num.intValue());
            return;
        }
        ColorStateList colorStateListB = com.facebook.react.views.text.a.b(c0910j.getContext());
        if (colorStateListB != null) {
            c0910j.setTextColor(colorStateListB);
            return;
        }
        Context context = c0910j.getContext();
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("Could not get default text color from View Context: ");
        sb.append(context != null ? context.getClass().getCanonicalName() : "null");
        ReactSoftExceptionLogger.logSoftException(str, new IllegalStateException(sb.toString()));
    }

    @InterfaceC2218a(defaultBoolean = false, name = "contextMenuHidden")
    public void setContextMenuHidden(C0910j c0910j, boolean z6) {
        c0910j.setContextMenuHidden(z6);
    }

    @InterfaceC2218a(customType = "Color", name = "cursorColor")
    public void setCursorColor(C0910j c0910j, Integer num) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            Drawable textCursorDrawable = c0910j.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                if (num != null) {
                    x.a();
                    textCursorDrawable.setColorFilter(w.a(num.intValue(), BlendMode.SRC_IN));
                } else {
                    textCursorDrawable.clearColorFilter();
                }
                c0910j.setTextCursorDrawable(textCursorDrawable);
                return;
            }
            return;
        }
        if (i7 == 28) {
            return;
        }
        try {
            Field declaredField = c0910j.getClass().getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i8 = declaredField.getInt(c0910j);
            if (i8 == 0) {
                return;
            }
            Drawable drawableMutate = androidx.core.content.b.e(c0910j.getContext(), i8).mutate();
            if (num != null) {
                drawableMutate.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(c0910j);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            declaredField3.set(obj, new Drawable[]{drawableMutate, drawableMutate});
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
    }

    @InterfaceC2218a(defaultBoolean = false, name = "disableFullscreenUI")
    public void setDisableFullscreenUI(C0910j c0910j, boolean z6) {
        c0910j.setDisableFullscreenUI(z6);
    }

    @InterfaceC2218a(defaultBoolean = true, name = "editable")
    public void setEditable(C0910j c0910j, boolean z6) {
        c0910j.setEnabled(z6);
    }

    @InterfaceC2218a(name = "fontFamily")
    public void setFontFamily(C0910j c0910j, String str) {
        c0910j.setFontFamily(str);
    }

    @InterfaceC2218a(defaultFloat = 14.0f, name = "fontSize")
    public void setFontSize(C0910j c0910j, float f7) {
        c0910j.setFontSize(f7);
    }

    @InterfaceC2218a(name = "fontStyle")
    public void setFontStyle(C0910j c0910j, String str) {
        c0910j.setFontStyle(str);
    }

    @InterfaceC2218a(name = "fontVariant")
    public void setFontVariant(C0910j c0910j, ReadableArray readableArray) {
        c0910j.setFontFeatureSettings(com.facebook.react.views.text.o.c(readableArray));
    }

    @InterfaceC2218a(name = "fontWeight")
    public void setFontWeight(C0910j c0910j, String str) {
        c0910j.setFontWeight(str);
    }

    @InterfaceC2218a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(C0910j c0910j, boolean z6) {
        c0910j.setIncludeFontPadding(z6);
    }

    @InterfaceC2218a(name = "inlineImageLeft")
    public void setInlineImageLeft(C0910j c0910j, String str) {
        c0910j.setCompoundDrawablesWithIntrinsicBounds(J2.c.d().f(c0910j.getContext(), str), 0, 0, 0);
    }

    @InterfaceC2218a(name = "inlineImagePadding")
    public void setInlineImagePadding(C0910j c0910j, int i7) {
        c0910j.setCompoundDrawablePadding(i7);
    }

    @InterfaceC2218a(name = "keyboardType")
    public void setKeyboardType(C0910j c0910j, String str) {
        int i7;
        if (KEYBOARD_TYPE_NUMERIC.equalsIgnoreCase(str)) {
            i7 = INPUT_TYPE_KEYBOARD_NUMBERED;
        } else if (KEYBOARD_TYPE_NUMBER_PAD.equalsIgnoreCase(str)) {
            i7 = 2;
        } else if (KEYBOARD_TYPE_DECIMAL_PAD.equalsIgnoreCase(str)) {
            i7 = INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
        } else if (KEYBOARD_TYPE_EMAIL_ADDRESS.equalsIgnoreCase(str)) {
            if (shouldHideCursorForEmailTextInput()) {
                c0910j.setCursorVisible(false);
            }
            i7 = 33;
        } else {
            i7 = KEYBOARD_TYPE_PHONE_PAD.equalsIgnoreCase(str) ? 3 : KEYBOARD_TYPE_VISIBLE_PASSWORD.equalsIgnoreCase(str) ? 144 : "url".equalsIgnoreCase(str) ? 16 : 1;
        }
        updateStagedInputTypeFlag(c0910j, 15, i7);
        checkPasswordType(c0910j);
    }

    @InterfaceC2218a(defaultFloat = 0.0f, name = "letterSpacing")
    public void setLetterSpacing(C0910j c0910j, float f7) {
        c0910j.setLetterSpacingPt(f7);
    }

    @InterfaceC2218a(defaultFloat = 0.0f, name = "lineHeight")
    public void setLineHeight(C0910j c0910j, int i7) {
        c0910j.setLineHeight(i7);
    }

    @InterfaceC2218a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(C0910j c0910j, float f7) {
        c0910j.setMaxFontSizeMultiplier(f7);
    }

    @InterfaceC2218a(name = "maxLength")
    public void setMaxLength(C0910j c0910j, Integer num) {
        InputFilter[] filters = c0910j.getFilters();
        InputFilter[] inputFilterArr = EMPTY_FILTERS;
        if (num == null) {
            if (filters.length > 0) {
                LinkedList linkedList = new LinkedList();
                for (InputFilter inputFilter : filters) {
                    if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                        linkedList.add(inputFilter);
                    }
                }
                if (!linkedList.isEmpty()) {
                    inputFilterArr = (InputFilter[]) linkedList.toArray(new InputFilter[linkedList.size()]);
                }
            }
        } else if (filters.length > 0) {
            boolean z6 = false;
            for (int i7 = 0; i7 < filters.length; i7++) {
                if (filters[i7] instanceof InputFilter.LengthFilter) {
                    filters[i7] = new InputFilter.LengthFilter(num.intValue());
                    z6 = true;
                }
            }
            if (!z6) {
                InputFilter[] inputFilterArr2 = new InputFilter[filters.length + 1];
                System.arraycopy(filters, 0, inputFilterArr2, 0, filters.length);
                filters[filters.length] = new InputFilter.LengthFilter(num.intValue());
                filters = inputFilterArr2;
            }
            inputFilterArr = filters;
        } else {
            inputFilterArr = new InputFilter[]{new InputFilter.LengthFilter(num.intValue())};
        }
        c0910j.setFilters(inputFilterArr);
    }

    @InterfaceC2218a(defaultBoolean = false, name = "multiline")
    public void setMultiline(C0910j c0910j, boolean z6) {
        updateStagedInputTypeFlag(c0910j, z6 ? 0 : 131072, z6 ? 131072 : 0);
    }

    @InterfaceC2218a(defaultInt = 1, name = "numberOfLines")
    public void setNumLines(C0910j c0910j, int i7) {
        c0910j.setLines(i7);
    }

    @InterfaceC2218a(defaultBoolean = false, name = "onContentSizeChange")
    public void setOnContentSizeChange(C0910j c0910j, boolean z6) {
        c0910j.setContentSizeWatcher(z6 ? new b(c0910j) : null);
    }

    @InterfaceC2218a(defaultBoolean = false, name = "onKeyPress")
    public void setOnKeyPress(C0910j c0910j, boolean z6) {
        c0910j.setOnKeyPress(z6);
    }

    @InterfaceC2218a(defaultBoolean = false, name = "onScroll")
    public void setOnScroll(C0910j c0910j, boolean z6) {
        c0910j.setScrollWatcher(z6 ? new c(c0910j) : null);
    }

    @InterfaceC2218a(defaultBoolean = false, name = "onSelectionChange")
    public void setOnSelectionChange(C0910j c0910j, boolean z6) {
        c0910j.setSelectionWatcher(z6 ? new d(c0910j) : null);
    }

    @InterfaceC2218a(name = "overflow")
    public void setOverflow(C0910j c0910j, String str) {
        c0910j.setOverflow(str);
    }

    @InterfaceC2218a(name = "placeholder")
    public void setPlaceholder(C0910j c0910j, String str) {
        c0910j.setPlaceholder(str);
    }

    @InterfaceC2218a(customType = "Color", name = "placeholderTextColor")
    public void setPlaceholderTextColor(C0910j c0910j, Integer num) {
        if (num == null) {
            c0910j.setHintTextColor(com.facebook.react.views.text.a.d(c0910j.getContext()));
        } else {
            c0910j.setHintTextColor(num.intValue());
        }
    }

    @InterfaceC2218a(name = "returnKeyLabel")
    public void setReturnKeyLabel(C0910j c0910j, String str) {
        c0910j.setImeActionLabel(str, IME_ACTION_ID);
    }

    @InterfaceC2218a(name = "returnKeyType")
    public void setReturnKeyType(C0910j c0910j, String str) {
        c0910j.setReturnKeyType(str);
    }

    @InterfaceC2218a(defaultBoolean = false, name = "secureTextEntry")
    public void setSecureTextEntry(C0910j c0910j, boolean z6) {
        updateStagedInputTypeFlag(c0910j, 144, z6 ? 128 : 0);
        checkPasswordType(c0910j);
    }

    @InterfaceC2218a(defaultBoolean = false, name = "selectTextOnFocus")
    public void setSelectTextOnFocus(C0910j c0910j, boolean z6) {
        c0910j.setSelectAllOnFocus(z6);
    }

    @InterfaceC2218a(customType = "Color", name = "selectionColor")
    public void setSelectionColor(C0910j c0910j, Integer num) {
        c0910j.setHighlightColor(num == null ? com.facebook.react.views.text.a.c(c0910j.getContext()) : num.intValue());
    }

    @InterfaceC2218a(customType = "Color", name = "selectionHandleColor")
    public void setSelectionHandleColor(C0910j c0910j, Integer num) {
        int i7;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            Drawable drawableMutate = c0910j.getTextSelectHandle().mutate();
            Drawable drawableMutate2 = c0910j.getTextSelectHandleLeft().mutate();
            Drawable drawableMutate3 = c0910j.getTextSelectHandleRight().mutate();
            if (num != null) {
                x.a();
                BlendModeColorFilter blendModeColorFilterA = w.a(num.intValue(), BlendMode.SRC_IN);
                drawableMutate.setColorFilter(blendModeColorFilterA);
                drawableMutate2.setColorFilter(blendModeColorFilterA);
                drawableMutate3.setColorFilter(blendModeColorFilterA);
            } else {
                drawableMutate.clearColorFilter();
                drawableMutate2.clearColorFilter();
                drawableMutate3.clearColorFilter();
            }
            c0910j.setTextSelectHandle(drawableMutate);
            c0910j.setTextSelectHandleLeft(drawableMutate2);
            c0910j.setTextSelectHandleRight(drawableMutate3);
            return;
        }
        if (i8 == 28) {
            return;
        }
        int i9 = 0;
        while (true) {
            String[] strArr = DRAWABLE_HANDLE_RESOURCES;
            if (i9 >= strArr.length) {
                return;
            }
            try {
                Field declaredField = c0910j.getClass().getDeclaredField(strArr[i9]);
                declaredField.setAccessible(true);
                i7 = declaredField.getInt(c0910j);
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            if (i7 == 0) {
                return;
            }
            Drawable drawableMutate4 = androidx.core.content.b.e(c0910j.getContext(), i7).mutate();
            if (num != null) {
                drawableMutate4.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawableMutate4.clearColorFilter();
            }
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(c0910j);
            Field declaredField3 = obj.getClass().getDeclaredField(DRAWABLE_HANDLE_FIELDS[i9]);
            declaredField3.setAccessible(true);
            declaredField3.set(obj, drawableMutate4);
            i9++;
        }
    }

    @InterfaceC2218a(name = "submitBehavior")
    public void setSubmitBehavior(C0910j c0910j, String str) {
        c0910j.setSubmitBehavior(str);
    }

    @InterfaceC2218a(name = "textAlign")
    public void setTextAlign(C0910j c0910j, String str) {
        if (!"justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                c0910j.setJustificationMode(0);
            }
            if (str != null && !"auto".equals(str)) {
                if (!"left".equals(str)) {
                    if ("right".equals(str)) {
                        c0910j.setGravityHorizontal(5);
                        return;
                    } else {
                        if ("center".equals(str)) {
                            c0910j.setGravityHorizontal(1);
                            return;
                        }
                        P0.a.G("ReactNative", "Invalid textAlign: " + str);
                    }
                }
            }
            c0910j.setGravityHorizontal(0);
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            c0910j.setJustificationMode(1);
        }
        c0910j.setGravityHorizontal(3);
    }

    @InterfaceC2218a(name = "textAlignVertical")
    public void setTextAlignVertical(C0910j c0910j, String str) {
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
            c0910j.setGravityVertical(i7);
            return;
        }
        c0910j.setGravityVertical(0);
    }

    @InterfaceC2218a(name = "autoComplete")
    public void setTextContentType(C0910j c0910j, String str) {
        if (str != null && !"off".equals(str)) {
            Map<String, String> map = REACT_PROPS_AUTOFILL_HINTS_MAP;
            if (map.containsKey(str)) {
                setAutofillHints(c0910j, map.get(str));
                return;
            }
            P0.a.G("ReactNative", "Invalid autoComplete: " + str);
        }
        setImportantForAutofill(c0910j, 2);
    }

    @InterfaceC2218a(name = "textDecorationLine")
    public void setTextDecorationLine(C0910j c0910j, String str) {
        int paintFlags;
        c0910j.setPaintFlags(c0910j.getPaintFlags() & (-25));
        for (String str2 : str.split(" ")) {
            if (str2.equals("underline")) {
                paintFlags = c0910j.getPaintFlags() | 8;
            } else if (str2.equals("line-through")) {
                paintFlags = c0910j.getPaintFlags() | 16;
            }
            c0910j.setPaintFlags(paintFlags);
        }
    }

    @InterfaceC2218a(customType = "Color", name = "underlineColorAndroid")
    public void setUnderlineColor(C0910j c0910j, Integer num) {
        Drawable background = c0910j.getBackground();
        if (background == null) {
            return;
        }
        if (background.getConstantState() != null) {
            try {
                background = background.mutate();
            } catch (NullPointerException e7) {
                P0.a.k(TAG, "NullPointerException when setting underlineColorAndroid for TextInput", e7);
            }
        }
        if (num == null) {
            background.clearColorFilter();
        } else {
            background.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @InterfaceC2218a(defaultBoolean = true, name = "showSoftInputOnFocus")
    public void showKeyboardOnFocus(C0910j c0910j, boolean z6) {
        c0910j.setShowSoftInputOnFocus(z6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final C0872e0 c0872e0, final C0910j c0910j) {
        c0910j.setEventDispatcher(getEventDispatcher(c0872e0, c0910j));
        c0910j.addTextChangedListener(new e(c0872e0, c0910j));
        c0910j.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.facebook.react.views.textinput.H
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z6) {
                ReactTextInputManager.lambda$addEventEmitters$0(c0872e0, c0910j, view, z6);
            }
        });
        c0910j.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.facebook.react.views.textinput.I
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
                return ReactTextInputManager.lambda$addEventEmitters$1(c0910j, c0872e0, textView, i7, keyEvent);
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.text.c createShadowNodeInstance() {
        return new K();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C0910j createViewInstance(C0872e0 c0872e0) {
        C0910j c0910j = new C0910j(c0872e0);
        c0910j.setInputType(c0910j.getInputType() & (-131073));
        c0910j.setReturnKeyType("done");
        c0910j.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return c0910j;
    }

    public Object getReactTextUpdate(C0910j c0910j, W w6, com.facebook.react.common.mapbuffer.a aVar) {
        if (aVar.getCount() == 0) {
            return null;
        }
        com.facebook.react.common.mapbuffer.a aVarD0 = aVar.D0(0);
        return com.facebook.react.views.text.i.a(com.facebook.react.views.text.s.f(c0910j.getContext(), aVarD0, null), aVar.getInt(3), com.facebook.react.views.text.q.g(w6, com.facebook.react.views.text.s.i(aVarD0), c0910j.getGravityHorizontal()), com.facebook.react.views.text.q.h(aVar.D0(1).getString(2)), com.facebook.react.views.text.q.d(w6, Build.VERSION.SDK_INT >= 26 ? c0910j.getJustificationMode() : 0));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C0910j c0910j) {
        super.onAfterUpdateTransaction(c0910j);
        c0910j.N();
        c0910j.w();
    }

    @InterfaceC2218a(name = "importantForAutofill")
    public void setImportantForAutofill(C0910j c0910j, String str) {
        setImportantForAutofill(c0910j, "no".equals(str) ? 2 : "noExcludeDescendants".equals(str) ? 8 : "yes".equals(str) ? 1 : "yesExcludeDescendants".equals(str) ? 4 : 0);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(C0910j c0910j, int i7, int i8, int i9, int i10) {
        c0910j.setPadding(i7, i8, i9, i10);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(C0910j c0910j, Object obj) {
        if (obj instanceof com.facebook.react.views.text.i) {
            com.facebook.react.views.text.i iVar = (com.facebook.react.views.text.i) obj;
            int iF = (int) iVar.f();
            int iH = (int) iVar.h();
            int iG = (int) iVar.g();
            int iE = (int) iVar.e();
            int length = -1;
            if (iF != -1 || iH != -1 || iG != -1 || iE != -1) {
                if (iF == -1) {
                    iF = c0910j.getPaddingLeft();
                }
                if (iH == -1) {
                    iH = c0910j.getPaddingTop();
                }
                if (iG == -1) {
                    iG = c0910j.getPaddingRight();
                }
                if (iE == -1) {
                    iE = c0910j.getPaddingBottom();
                }
                c0910j.setPadding(iF, iH, iG, iE);
            }
            if (iVar.b()) {
                M2.n.g(iVar.i(), c0910j);
            }
            if (c0910j.getSelectionStart() == c0910j.getSelectionEnd()) {
                length = iVar.i().length() - ((c0910j.getText() != null ? c0910j.getText().length() : 0) - c0910j.getSelectionStart());
            }
            c0910j.M(iVar);
            c0910j.J(iVar.c(), length, length);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(C0910j c0910j, W w6, InterfaceC0870d0 interfaceC0870d0) {
        if (c0910j.getStateWrapper() == null) {
            c0910j.setPadding(0, 0, 0, 0);
        }
        c0910j.setStateWrapper(interfaceC0870d0);
        ReadableMapBuffer readableMapBufferC = interfaceC0870d0.c();
        if (readableMapBufferC != null) {
            return getReactTextUpdate(c0910j, w6, readableMapBufferC);
        }
        return null;
    }

    public com.facebook.react.views.text.c createShadowNodeInstance(com.facebook.react.views.text.n nVar) {
        return new K(nVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C0910j c0910j, int i7, ReadableArray readableArray) {
        String str;
        if (i7 == 1) {
            str = "focus";
        } else if (i7 == 2) {
            str = "blur";
        } else if (i7 != 4) {
            return;
        } else {
            str = "setTextAndSelection";
        }
        receiveCommand(c0910j, str, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C0910j c0910j, String str, ReadableArray readableArray) {
        str.hashCode();
        switch (str) {
            case "blurTextInput":
            case "blur":
                c0910j.v();
                break;
            case "focus":
            case "focusTextInput":
                c0910j.P();
                break;
            case "setTextAndSelection":
                int i7 = readableArray.getInt(0);
                if (i7 != -1) {
                    int i8 = readableArray.getInt(2);
                    int i9 = readableArray.getInt(3);
                    if (i9 == -1) {
                        i9 = i8;
                    }
                    if (!readableArray.isNull(1)) {
                        c0910j.L(getReactTextUpdate(readableArray.getString(1), i7));
                    }
                    c0910j.J(i7, i8, i9);
                    break;
                }
                break;
        }
    }
}
