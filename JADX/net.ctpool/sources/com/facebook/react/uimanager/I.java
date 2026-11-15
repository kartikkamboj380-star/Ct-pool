package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.accessibility.C;
import com.facebook.react.AbstractC0831n;
import com.facebook.react.AbstractC0834q;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import y2.C2239a;

/* JADX INFO: loaded from: classes.dex */
public class I extends A.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f12296v = 1056964608;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f12297w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final HashMap f12298x;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f12299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final d f12300r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Handler f12301s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final HashMap f12302t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    View f12303u;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    }

    class b extends com.facebook.react.uimanager.events.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WritableMap f12305a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i7, int i8, WritableMap writableMap) {
            super(i7, i8);
            this.f12305a = writableMap;
        }

        @Override // com.facebook.react.uimanager.events.d
        protected WritableMap getEventData() {
            return this.f12305a;
        }

        @Override // com.facebook.react.uimanager.events.d
        public String getEventName() {
            return "topAccessibilityAction";
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f12308b;

        static {
            int[] iArr = new int[f.values().length];
            f12308b = iArr;
            try {
                iArr[f.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12308b[f.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12308b[f.CHECKBOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12308b[f.COMBOBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12308b[f.GRID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12308b[f.HEADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12308b[f.IMG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12308b[f.LINK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12308b[f.LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12308b[f.MENU.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12308b[f.MENUBAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12308b[f.MENUITEM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12308b[f.NONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12308b[f.PROGRESSBAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12308b[f.RADIO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12308b[f.RADIOGROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12308b[f.SCROLLBAR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f12308b[f.SEARCHBOX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f12308b[f.SLIDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f12308b[f.SPINBUTTON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f12308b[f.SUMMARY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f12308b[f.SWITCH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f12308b[f.TAB.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f12308b[f.TABLIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f12308b[f.TIMER.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f12308b[f.TOOLBAR.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr2 = new int[e.values().length];
            f12307a = iArr2;
            try {
                iArr2[e.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f12307a[e.DROPDOWNLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f12307a[e.TOGGLEBUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f12307a[e.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f12307a[e.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f12307a[e.IMAGEBUTTON.ordinal()] = 6;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f12307a[e.KEYBOARDKEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f12307a[e.TEXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f12307a[e.ADJUSTABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f12307a[e.CHECKBOX.ordinal()] = 10;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f12307a[e.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f12307a[e.SPINBUTTON.ordinal()] = 12;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f12307a[e.SWITCH.ordinal()] = 13;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f12307a[e.LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f12307a[e.GRID.ordinal()] = 15;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f12307a[e.SCROLLVIEW.ordinal()] = 16;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f12307a[e.HORIZONTALSCROLLVIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f12307a[e.PAGER.ordinal()] = 18;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f12307a[e.DRAWERLAYOUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f12307a[e.SLIDINGDRAWER.ordinal()] = 20;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f12307a[e.ICONMENU.ordinal()] = 21;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f12307a[e.VIEWGROUP.ordinal()] = 22;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f12307a[e.WEBVIEW.ordinal()] = 23;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f12307a[e.NONE.ordinal()] = 24;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f12307a[e.LINK.ordinal()] = 25;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f12307a[e.SUMMARY.ordinal()] = 26;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f12307a[e.HEADER.ordinal()] = 27;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f12307a[e.ALERT.ordinal()] = 28;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f12307a[e.COMBOBOX.ordinal()] = 29;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f12307a[e.MENU.ordinal()] = 30;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f12307a[e.MENUBAR.ordinal()] = 31;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f12307a[e.MENUITEM.ordinal()] = 32;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f12307a[e.PROGRESSBAR.ordinal()] = 33;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f12307a[e.RADIOGROUP.ordinal()] = 34;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f12307a[e.SCROLLBAR.ordinal()] = 35;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f12307a[e.TAB.ordinal()] = 36;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f12307a[e.TABLIST.ordinal()] = 37;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f12307a[e.TIMER.ordinal()] = 38;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f12307a[e.TOOLBAR.ordinal()] = 39;
            } catch (NoSuchFieldError unused65) {
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f12309a;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f12310a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f12311b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f12312c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f12313d;

            private a() {
            }
        }

        public d(ClickableSpan[] clickableSpanArr, Spannable spannable) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < clickableSpanArr.length; i7++) {
                ClickableSpan clickableSpan = clickableSpanArr[i7];
                int spanStart = spannable.getSpanStart(clickableSpan);
                int spanEnd = spannable.getSpanEnd(clickableSpan);
                if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= spannable.length() && spanEnd <= spannable.length()) {
                    a aVar = new a();
                    aVar.f12310a = spannable.subSequence(spanStart, spanEnd).toString();
                    aVar.f12311b = spanStart;
                    aVar.f12312c = spanEnd;
                    aVar.f12313d = (clickableSpanArr.length - 1) - i7;
                    arrayList.add(aVar);
                }
            }
            this.f12309a = arrayList;
        }

        public a a(int i7) {
            for (a aVar : this.f12309a) {
                if (aVar.f12313d == i7) {
                    return aVar;
                }
            }
            return null;
        }

        public a b(int i7, int i8) {
            for (a aVar : this.f12309a) {
                if (aVar.f12311b == i7 && aVar.f12312c == i8) {
                    return aVar;
                }
            }
            return null;
        }

        public int c() {
            return this.f12309a.size();
        }
    }

    public enum e {
        NONE,
        BUTTON,
        DROPDOWNLIST,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        GRID,
        PAGER,
        SCROLLVIEW,
        HORIZONTALSCROLLVIEW,
        VIEWGROUP,
        WEBVIEW,
        DRAWERLAYOUT,
        SLIDINGDRAWER,
        ICONMENU,
        TOOLBAR;

        public static e h(f fVar) {
            switch (c.f12308b[fVar.ordinal()]) {
                case 1:
                    return ALERT;
                case 2:
                    return BUTTON;
                case 3:
                    return CHECKBOX;
                case 4:
                    return COMBOBOX;
                case 5:
                    return GRID;
                case 6:
                    return HEADER;
                case 7:
                    return IMAGE;
                case 8:
                    return LINK;
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    return LIST;
                case 10:
                    return MENU;
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    return MENUBAR;
                case 12:
                    return MENUITEM;
                case 13:
                    return NONE;
                case 14:
                    return PROGRESSBAR;
                case 15:
                    return RADIO;
                case 16:
                    return RADIOGROUP;
                case 17:
                    return SCROLLBAR;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    return SEARCH;
                case 19:
                    return ADJUSTABLE;
                case 20:
                    return SPINBUTTON;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    return SUMMARY;
                case 22:
                    return SWITCH;
                case ConnectionResult.API_DISABLED /* 23 */:
                    return TAB;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    return TABLIST;
                case 25:
                    return TIMER;
                case 26:
                    return TOOLBAR;
                default:
                    return null;
            }
        }

        public static e j(String str) {
            if (str == null) {
                return NONE;
            }
            for (e eVar : values()) {
                if (eVar.name().equalsIgnoreCase(str)) {
                    return eVar;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static e k(View view) {
            f fVar = (f) view.getTag(AbstractC0831n.f11994x);
            return fVar != null ? h(fVar) : (e) view.getTag(AbstractC0831n.f11977g);
        }

        public static String l(e eVar) {
            switch (c.f12307a[eVar.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.Spinner";
                case 3:
                    return "android.widget.ToggleButton";
                case 4:
                    return "android.widget.EditText";
                case 5:
                    return "android.widget.ImageView";
                case 6:
                    return "android.widget.ImageButton";
                case 7:
                    return "android.inputmethodservice.Keyboard$Key";
                case 8:
                    return "android.widget.TextView";
                case ConnectionResult.SERVICE_INVALID /* 9 */:
                    return "android.widget.SeekBar";
                case 10:
                    return "android.widget.CheckBox";
                case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                    return "android.widget.RadioButton";
                case 12:
                    return "android.widget.SpinButton";
                case 13:
                    return "android.widget.Switch";
                case 14:
                    return "android.widget.AbsListView";
                case 15:
                    return "android.widget.GridView";
                case 16:
                    return "android.widget.ScrollView";
                case 17:
                    return "android.widget.HorizontalScrollView";
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    return "androidx.viewpager.widget.ViewPager";
                case 19:
                    return "androidx.drawerlayout.widget.DrawerLayout";
                case 20:
                    return "android.widget.SlidingDrawer";
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    return "com.android.internal.view.menu.IconMenuView";
                case 22:
                    return "android.view.ViewGroup";
                case ConnectionResult.API_DISABLED /* 23 */:
                    return "android.webkit.WebView";
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + eVar);
            }
        }
    }

    public enum f {
        ALERT,
        ALERTDIALOG,
        APPLICATION,
        ARTICLE,
        BANNER,
        BUTTON,
        CELL,
        CHECKBOX,
        COLUMNHEADER,
        COMBOBOX,
        COMPLEMENTARY,
        CONTENTINFO,
        DEFINITION,
        DIALOG,
        DIRECTORY,
        DOCUMENT,
        FEED,
        FIGURE,
        FORM,
        GRID,
        GROUP,
        HEADING,
        IMG,
        LINK,
        LIST,
        LISTITEM,
        LOG,
        MAIN,
        MARQUEE,
        MATH,
        MENU,
        MENUBAR,
        MENUITEM,
        METER,
        NAVIGATION,
        NONE,
        NOTE,
        OPTION,
        PRESENTATION,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        REGION,
        ROW,
        ROWGROUP,
        ROWHEADER,
        SCROLLBAR,
        SEARCHBOX,
        SEPARATOR,
        SLIDER,
        SPINBUTTON,
        STATUS,
        SUMMARY,
        SWITCH,
        TAB,
        TABLE,
        TABLIST,
        TABPANEL,
        TERM,
        TIMER,
        TOOLBAR,
        TOOLTIP,
        TREE,
        TREEGRID,
        TREEITEM;

        public static f h(String str) {
            for (f fVar : values()) {
                if (fVar.name().equalsIgnoreCase(str)) {
                    return fVar;
                }
            }
            return null;
        }
    }

    static {
        HashMap map = new HashMap();
        f12298x = map;
        map.put("activate", Integer.valueOf(C.a.f7368i.b()));
        map.put("longpress", Integer.valueOf(C.a.f7369j.b()));
        map.put("increment", Integer.valueOf(C.a.f7376q.b()));
        map.put("decrement", Integer.valueOf(C.a.f7377r.b()));
        map.put("expand", Integer.valueOf(C.a.f7382w.b()));
        map.put("collapse", Integer.valueOf(C.a.f7383x.b()));
    }

    public I(View view, boolean z6, int i7) {
        super(view);
        this.f12299q = view;
        this.f12302t = new HashMap();
        this.f12301s = new a();
        view.setFocusable(z6);
        androidx.core.view.H.z0(view, i7);
        this.f12300r = (d) view.getTag(AbstractC0831n.f11976f);
    }

    public static androidx.core.view.accessibility.C W(View view) {
        if (view == null) {
            return null;
        }
        androidx.core.view.accessibility.C cT = androidx.core.view.accessibility.C.T();
        try {
            androidx.core.view.H.c0(view, cT);
            return cT;
        } catch (NullPointerException unused) {
            if (cT != null) {
                cT.X();
            }
            return null;
        }
    }

    private Rect X(d.a aVar) {
        View view = this.f12299q;
        if (!(view instanceof TextView)) {
            return new Rect(0, 0, this.f12299q.getWidth(), this.f12299q.getHeight());
        }
        TextView textView = (TextView) view;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return new Rect(0, 0, textView.getWidth(), textView.getHeight());
        }
        double d7 = aVar.f12311b;
        double d8 = aVar.f12312c;
        int i7 = (int) d7;
        int lineForOffset = layout.getLineForOffset(i7);
        if (d7 > layout.getLineEnd(lineForOffset)) {
            return null;
        }
        Rect rect = new Rect();
        double primaryHorizontal = layout.getPrimaryHorizontal(i7);
        new Paint().setTextSize(((AbsoluteSizeSpan) Y(aVar.f12311b, aVar.f12312c, AbsoluteSizeSpan.class)) != null ? r7.getSize() : textView.getTextSize());
        int iCeil = (int) Math.ceil(r4.measureText(aVar.f12310a));
        boolean z6 = lineForOffset != layout.getLineForOffset((int) d8);
        layout.getLineBounds(lineForOffset, rect);
        int scrollY = textView.getScrollY() + textView.getTotalPaddingTop();
        rect.top += scrollY;
        rect.bottom += scrollY;
        rect.left = (int) (((double) rect.left) + ((primaryHorizontal + ((double) textView.getTotalPaddingLeft())) - ((double) textView.getScrollX())));
        if (z6) {
            return new Rect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int i8 = rect.left;
        return new Rect(i8, rect.top, iCeil + i8, rect.bottom);
    }

    public static CharSequence Z(View view, androidx.core.view.accessibility.C c7) {
        androidx.core.view.accessibility.C cW = c7 == null ? W(view) : androidx.core.view.accessibility.C.V(c7);
        if (cW == null) {
            return null;
        }
        try {
            CharSequence charSequenceS = cW.s();
            CharSequence charSequenceA = cW.A();
            boolean z6 = !TextUtils.isEmpty(charSequenceA);
            boolean z7 = view instanceof EditText;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(charSequenceS) && (!z7 || !z6)) {
                sb.append(charSequenceS);
                return sb;
            }
            if (z6) {
                sb.append(charSequenceA);
                return sb;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                androidx.core.view.accessibility.C cT = androidx.core.view.accessibility.C.T();
                androidx.core.view.H.c0(childAt, cT);
                if (g0(cT, childAt) && !e0(cT, childAt)) {
                    CharSequence charSequenceZ = Z(childAt, null);
                    if (!TextUtils.isEmpty(charSequenceZ)) {
                        sb2.append(((Object) charSequenceZ) + ", ");
                    }
                }
                cT.X();
            }
            return h0(sb2);
        } finally {
            cW.X();
        }
    }

    public static boolean a0(androidx.core.view.accessibility.C c7, View view) {
        if (c7 != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt != null) {
                    androidx.core.view.accessibility.C cT = androidx.core.view.accessibility.C.T();
                    try {
                        androidx.core.view.H.c0(childAt, cT);
                        if (cT.S() && !e0(cT, childAt) && g0(cT, childAt)) {
                            cT.X();
                            return true;
                        }
                        cT.X();
                    } catch (Throwable th) {
                        if (cT != null) {
                            cT.X();
                        }
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    private static boolean b0(androidx.core.view.accessibility.C c7) {
        return c7 != null && (!TextUtils.isEmpty(c7.z()) || c7.G() || d0(c7));
    }

    public static boolean c0(androidx.core.view.accessibility.C c7) {
        return (c7 == null || c7.r() != null || (TextUtils.isEmpty(c7.A()) && TextUtils.isEmpty(c7.s()) && TextUtils.isEmpty(c7.u()))) ? false : true;
    }

    public static boolean d0(androidx.core.view.accessibility.C c7) {
        C.d dVarX;
        if (c7 == null || (dVarX = c7.x()) == null) {
            return false;
        }
        float fB = dVarX.b();
        float fC = dVarX.c();
        float fA = dVarX.a();
        return fB - fC > 0.0f && fA >= fC && fA <= fB;
    }

    public static boolean e0(androidx.core.view.accessibility.C c7, View view) {
        if (c7 == null || view == null || !c7.S()) {
            return false;
        }
        return c7.O() || f0(c7);
    }

    public static boolean f0(androidx.core.view.accessibility.C c7) {
        if (c7 == null) {
            return false;
        }
        if (c7.I() || c7.M() || c7.K()) {
            return true;
        }
        List listI = c7.i();
        return listI.contains(16) || listI.contains(32) || listI.contains(1);
    }

    public static boolean g0(androidx.core.view.accessibility.C c7, View view) {
        int iZ;
        if (c7 == null || view == null || (iZ = androidx.core.view.H.z(view)) == 4) {
            return false;
        }
        if (iZ != 2 || c7.o() > 0) {
            return c0(c7) || b0(c7) || c7.G() || a0(c7, view);
        }
        return false;
    }

    private static String h0(StringBuilder sb) {
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - f12297w, length);
        }
        return sb.toString();
    }

    public static void i0(View view, boolean z6, int i7) {
        androidx.core.view.H.p0(view, new I(view, z6, i7));
    }

    private void j0(View view) {
        if (this.f12301s.hasMessages(1, view)) {
            this.f12301s.removeMessages(1, view);
        }
        this.f12301s.sendMessageDelayed(this.f12301s.obtainMessage(1, view), 200L);
    }

    public static void k0(View view, boolean z6, int i7) {
        if (androidx.core.view.H.N(view)) {
            return;
        }
        if (view.getTag(AbstractC0831n.f11977g) == null && view.getTag(AbstractC0831n.f11978h) == null && view.getTag(AbstractC0831n.f11971a) == null && view.getTag(AbstractC0831n.f11987q) == null && view.getTag(AbstractC0831n.f11973c) == null && view.getTag(AbstractC0831n.f11976f) == null && view.getTag(AbstractC0831n.f11994x) == null) {
            return;
        }
        androidx.core.view.H.p0(view, new I(view, z6, i7));
    }

    public static void l0(androidx.core.view.accessibility.C c7, e eVar, Context context) {
        int i7;
        if (eVar == null) {
            eVar = e.NONE;
        }
        c7.g0(e.l(eVar));
        if (eVar.equals(e.LINK)) {
            i7 = AbstractC0834q.f12036v;
        } else {
            if (!eVar.equals(e.IMAGE)) {
                if (eVar.equals(e.IMAGEBUTTON)) {
                    c7.z0(context.getString(AbstractC0834q.f12035u));
                } else if (!eVar.equals(e.BUTTON)) {
                    if (eVar.equals(e.TOGGLEBUTTON)) {
                        c7.h0(true);
                        c7.e0(true);
                        return;
                    }
                    if (eVar.equals(e.SUMMARY)) {
                        i7 = AbstractC0834q.f12011H;
                    } else {
                        if (eVar.equals(e.HEADER)) {
                            c7.p0(true);
                            return;
                        }
                        if (eVar.equals(e.ALERT)) {
                            i7 = AbstractC0834q.f12015a;
                        } else if (eVar.equals(e.COMBOBOX)) {
                            i7 = AbstractC0834q.f12033s;
                        } else if (eVar.equals(e.MENU)) {
                            i7 = AbstractC0834q.f12037w;
                        } else if (eVar.equals(e.MENUBAR)) {
                            i7 = AbstractC0834q.f12038x;
                        } else if (eVar.equals(e.MENUITEM)) {
                            i7 = AbstractC0834q.f12039y;
                        } else if (eVar.equals(e.PROGRESSBAR)) {
                            i7 = AbstractC0834q.f12040z;
                        } else if (eVar.equals(e.RADIOGROUP)) {
                            i7 = AbstractC0834q.f12004A;
                        } else if (eVar.equals(e.SCROLLBAR)) {
                            i7 = AbstractC0834q.f12006C;
                        } else if (eVar.equals(e.SPINBUTTON)) {
                            i7 = AbstractC0834q.f12007D;
                        } else if (eVar.equals(e.TAB)) {
                            i7 = AbstractC0834q.f12005B;
                        } else if (eVar.equals(e.TABLIST)) {
                            i7 = AbstractC0834q.f12012I;
                        } else if (eVar.equals(e.TIMER)) {
                            i7 = AbstractC0834q.f12013J;
                        } else if (!eVar.equals(e.TOOLBAR)) {
                            return;
                        } else {
                            i7 = AbstractC0834q.f12014K;
                        }
                    }
                }
                c7.h0(true);
                return;
            }
            i7 = AbstractC0834q.f12034t;
        }
        c7.z0(context.getString(i7));
    }

    private static void m0(androidx.core.view.accessibility.C c7, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(strNextKey);
            if (strNextKey.equals("selected") && dynamic.getType() == ReadableType.Boolean) {
                c7.C0(dynamic.asBoolean());
            } else if (strNextKey.equals("disabled") && dynamic.getType() == ReadableType.Boolean) {
                c7.l0(!dynamic.asBoolean());
            } else if (strNextKey.equals("checked") && dynamic.getType() == ReadableType.Boolean) {
                boolean zAsBoolean = dynamic.asBoolean();
                c7.e0(true);
                c7.f0(zAsBoolean);
            }
        }
    }

    @Override // A.a
    protected int B(float f7, float f8) {
        Layout layout;
        d dVar = this.f12300r;
        if (dVar == null || dVar.c() == 0) {
            return Integer.MIN_VALUE;
        }
        View view = this.f12299q;
        if (!(view instanceof TextView)) {
            return Integer.MIN_VALUE;
        }
        TextView textView = (TextView) view;
        if (!(textView.getText() instanceof Spanned) || (layout = textView.getLayout()) == null) {
            return Integer.MIN_VALUE;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((f8 - textView.getTotalPaddingTop()) + textView.getScrollY())), (f7 - textView.getTotalPaddingLeft()) + textView.getScrollX());
        ClickableSpan clickableSpan = (ClickableSpan) Y(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpan == null) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) textView.getText();
        d.a aVarB = this.f12300r.b(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
        if (aVarB != null) {
            return aVarB.f12313d;
        }
        return Integer.MIN_VALUE;
    }

    @Override // A.a
    protected void C(List list) {
        if (this.f12300r == null) {
            return;
        }
        for (int i7 = 0; i7 < this.f12300r.c(); i7++) {
            list.add(Integer.valueOf(i7));
        }
    }

    @Override // A.a
    protected boolean J(int i7, int i8, Bundle bundle) {
        return false;
    }

    @Override // A.a
    protected void N(int i7, androidx.core.view.accessibility.C c7) {
        d dVar = this.f12300r;
        if (dVar == null) {
            c7.k0("");
            c7.c0(new Rect(0, 0, 1, 1));
            return;
        }
        d.a aVarA = dVar.a(i7);
        if (aVarA == null) {
            c7.k0("");
            c7.c0(new Rect(0, 0, 1, 1));
            return;
        }
        Rect rectX = X(aVarA);
        if (rectX == null) {
            c7.k0("");
            c7.c0(new Rect(0, 0, 1, 1));
            return;
        }
        c7.k0(aVarA.f12310a);
        c7.a(16);
        c7.c0(rectX);
        c7.z0(this.f12299q.getResources().getString(AbstractC0834q.f12036v));
        c7.g0(e.l(e.BUTTON));
    }

    protected Object Y(int i7, int i8, Class cls) {
        View view = this.f12299q;
        if (!(view instanceof TextView) || !(((TextView) view).getText() instanceof Spanned)) {
            return null;
        }
        Object[] spans = ((Spanned) ((TextView) this.f12299q).getText()).getSpans(i7, i8, cls);
        if (spans.length > 0) {
            return spans[0];
        }
        return null;
    }

    @Override // A.a, androidx.core.view.C0574a
    public androidx.core.view.accessibility.D b(View view) {
        if (this.f12300r != null) {
            return super.b(view);
        }
        return null;
    }

    @Override // A.a, androidx.core.view.C0574a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(AbstractC0831n.f11980j);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int iAsInt = dynamic.asInt();
                    int iAsInt2 = dynamic2.asInt();
                    int iAsInt3 = dynamic3.asInt();
                    if (iAsInt3 <= iAsInt || iAsInt2 < iAsInt || iAsInt3 < iAsInt2) {
                        return;
                    }
                    accessibilityEvent.setItemCount(iAsInt3 - iAsInt);
                    accessibilityEvent.setCurrentItemIndex(iAsInt2);
                }
            }
        }
    }

    @Override // A.a, androidx.core.view.C0574a
    public void g(View view, androidx.core.view.accessibility.C c7) {
        super.g(view, c7);
        if (view.getTag(AbstractC0831n.f11979i) != null) {
            c7.a(((Boolean) view.getTag(AbstractC0831n.f11979i)).booleanValue() ? 524288 : 262144);
        }
        e eVarK = e.k(view);
        String str = (String) view.getTag(AbstractC0831n.f11974d);
        if (eVarK != null) {
            l0(c7, eVarK, view.getContext());
        }
        if (str != null) {
            c7.I0(str);
        }
        Object tag = view.getTag(AbstractC0831n.f11984n);
        if (tag != null) {
            View viewA = D2.a.a(view.getRootView(), (String) tag);
            this.f12303u = viewA;
            if (viewA != null) {
                c7.s0(viewA);
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(AbstractC0831n.f11978h);
        if (readableMap != null) {
            m0(c7, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(AbstractC0831n.f11971a);
        ReadableMap readableMap2 = (ReadableMap) view.getTag(AbstractC0831n.f11973c);
        if (readableMap2 != null) {
            c7.j0(C.c.a(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading")));
        }
        boolean z6 = true;
        if (readableArray != null) {
            for (int i7 = 0; i7 < readableArray.size(); i7++) {
                ReadableMap map = readableArray.getMap(i7);
                if (!map.hasKey("name")) {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
                int iIntValue = f12296v;
                String string = map.hasKey("label") ? map.getString("label") : null;
                HashMap map2 = f12298x;
                if (map2.containsKey(map.getString("name"))) {
                    iIntValue = ((Integer) map2.get(map.getString("name"))).intValue();
                } else {
                    f12296v++;
                }
                this.f12302t.put(Integer.valueOf(iIntValue), map.getString("name"));
                c7.b(new C.a(iIntValue, string));
            }
        }
        ReadableMap readableMap3 = (ReadableMap) view.getTag(AbstractC0831n.f11980j);
        if (readableMap3 != null && readableMap3.hasKey("min") && readableMap3.hasKey("now") && readableMap3.hasKey("max")) {
            Dynamic dynamic = readableMap3.getDynamic("min");
            Dynamic dynamic2 = readableMap3.getDynamic("now");
            Dynamic dynamic3 = readableMap3.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int iAsInt = dynamic.asInt();
                    int iAsInt2 = dynamic2.asInt();
                    int iAsInt3 = dynamic3.asInt();
                    if (iAsInt3 > iAsInt && iAsInt2 >= iAsInt && iAsInt3 >= iAsInt2) {
                        c7.y0(C.d.d(0, iAsInt, iAsInt3, iAsInt2));
                    }
                }
            }
        }
        String str2 = (String) view.getTag(AbstractC0831n.f11987q);
        if (str2 != null) {
            c7.K0(str2);
        }
        boolean z7 = TextUtils.isEmpty(c7.s()) && TextUtils.isEmpty(c7.A());
        if (readableArray == null && readableMap == null && tag == null && eVarK == null) {
            z6 = false;
        }
        if (z7 && z6) {
            c7.k0(Z(view, c7));
        }
    }

    @Override // androidx.core.view.C0574a
    public boolean j(View view, int i7, Bundle bundle) {
        if (i7 == 524288) {
            view.setTag(AbstractC0831n.f11979i, Boolean.FALSE);
        }
        if (i7 == 262144) {
            view.setTag(AbstractC0831n.f11979i, Boolean.TRUE);
        }
        if (!this.f12302t.containsKey(Integer.valueOf(i7))) {
            return super.j(view, i7, bundle);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("actionName", (String) this.f12302t.get(Integer.valueOf(i7)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveReactInstance()) {
            int id = view.getId();
            int iE = AbstractC0884k0.e(reactContext);
            UIManager uIManagerG = AbstractC0884k0.g(reactContext, C2239a.a(id));
            if (uIManagerG != null) {
                ((com.facebook.react.uimanager.events.e) uIManagerG.getEventDispatcher()).c(new b(iE, id, writableMapCreateMap));
            }
        } else {
            ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        e eVar = (e) view.getTag(AbstractC0831n.f11977g);
        ReadableMap readableMap = (ReadableMap) view.getTag(AbstractC0831n.f11980j);
        if (eVar != e.ADJUSTABLE) {
            return true;
        }
        if (i7 != C.a.f7376q.b() && i7 != C.a.f7377r.b()) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            j0(view);
        }
        return super.j(view, i7, bundle);
    }
}
