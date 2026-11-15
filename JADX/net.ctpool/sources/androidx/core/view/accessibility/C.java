package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.F;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u.AbstractC2078c;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7339d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f7340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7341b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7342c = -1;

    public static class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final a f7343A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final a f7344B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final a f7345C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final a f7346D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final a f7347E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final a f7348F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final a f7349G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final a f7350H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final a f7351I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final a f7352J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final a f7353K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final a f7354L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final a f7355M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final a f7356N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final a f7357O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final a f7358P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public static final a f7359Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public static final a f7360R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public static final a f7361S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public static final a f7362T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public static final a f7363U;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f7364e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f7365f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f7366g = new a(4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f7367h = new a(8, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f7368i = new a(16, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f7369j = new a(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f7370k = new a(64, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f7371l = new a(128, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f7372m = new a(256, (CharSequence) null, F.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f7373n = new a(512, (CharSequence) null, F.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f7374o = new a(1024, (CharSequence) null, F.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f7375p = new a(2048, (CharSequence) null, F.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f7376q = new a(4096, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f7377r = new a(8192, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f7378s = new a(16384, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f7379t = new a(32768, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f7380u = new a(65536, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f7381v = new a(131072, (CharSequence) null, F.g.class);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f7382w = new a(262144, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f7383x = new a(524288, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f7384y = new a(1048576, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f7385z = new a(2097152, (CharSequence) null, F.h.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f7386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class f7388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final F f7389d;

        static {
            int i7 = Build.VERSION.SDK_INT;
            f7343A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f7344B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, F.e.class);
            f7345C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f7346D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f7347E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f7348F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f7349G = new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f7350H = new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f7351I = new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f7352J = new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f7353K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f7354L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, F.f.class);
            f7355M = new a(i7 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, F.d.class);
            f7356N = new a(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f7357O = new a(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f7358P = new a(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f7359Q = new a(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f7360R = new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f7361S = new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f7362T = new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f7363U = new a(i7 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        }

        public a(int i7, CharSequence charSequence) {
            this(null, i7, charSequence, null, null);
        }

        public a a(CharSequence charSequence, F f7) {
            return new a(null, this.f7387b, charSequence, f7, this.f7388c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f7386a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f7386a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f7389d == null) {
                return false;
            }
            Class cls = this.f7388c;
            if (cls != null) {
                try {
                    androidx.appcompat.app.y.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e7) {
                    Class cls2 = this.f7388c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e7);
                }
            }
            return this.f7389d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f7386a;
            Object obj3 = ((a) obj).f7386a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f7386a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i7, CharSequence charSequence, F f7) {
            this(null, i7, charSequence, f7, null);
        }

        private a(int i7, CharSequence charSequence, Class cls) {
            this(null, i7, charSequence, null, cls);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        a(Object obj, int i7, CharSequence charSequence, F f7, Class cls) {
            this.f7387b = i7;
            this.f7389d = f7;
            this.f7386a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i7, charSequence) : obj;
            this.f7388c = cls;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f7390a;

        b(Object obj) {
            this.f7390a = obj;
        }

        public static b a(int i7, int i8, boolean z6) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i7, i8, z6));
        }

        public static b b(int i7, int i8, boolean z6, int i9) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i7, i8, z6, i9));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f7391a;

        c(Object obj) {
            this.f7391a = obj;
        }

        public static c a(int i7, int i8, int i9, int i10, boolean z6) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, i8, i9, i10, z6));
        }

        public static c b(int i7, int i8, int i9, int i10, boolean z6, boolean z7) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, i8, i9, i10, z6, z7));
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f7392a;

        d(Object obj) {
            this.f7392a = obj;
        }

        public static d d(int i7, float f7, float f8, float f9) {
            return new d(AccessibilityNodeInfo.RangeInfo.obtain(i7, f7, f8, f9));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f7392a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f7392a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f7392a).getMin();
        }
    }

    private C(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f7340a = accessibilityNodeInfo;
    }

    private boolean D() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int E(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i7)).get())) {
                    return sparseArray.keyAt(i7);
                }
            }
        }
        int i8 = f7339d;
        f7339d = i8 + 1;
        return i8;
    }

    public static C N0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C(accessibilityNodeInfo);
    }

    public static C T() {
        return N0(AccessibilityNodeInfo.obtain());
    }

    public static C U(View view) {
        return N0(AccessibilityNodeInfo.obtain(view));
    }

    public static C V(C c7) {
        return N0(AccessibilityNodeInfo.obtain(c7.f7340a));
    }

    private void Z(View view) {
        SparseArray sparseArrayY = y(view);
        if (sparseArrayY != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < sparseArrayY.size(); i7++) {
                if (((WeakReference) sparseArrayY.valueAt(i7)).get() == null) {
                    arrayList.add(Integer.valueOf(i7));
                }
            }
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                sparseArrayY.remove(((Integer) arrayList.get(i8)).intValue());
            }
        }
    }

    private void b0(int i7, boolean z6) {
        Bundle bundleT = t();
        if (bundleT != null) {
            int i8 = bundleT.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i7);
            if (!z6) {
                i7 = 0;
            }
            bundleT.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i7 | i8);
        }
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i7) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i7));
    }

    private void g() {
        this.f7340a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f7340a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f7340a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f7340a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List h(String str) {
        ArrayList<Integer> integerArrayList = this.f7340a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f7340a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private static String j(int i7) {
        if (i7 == 1) {
            return "ACTION_FOCUS";
        }
        if (i7 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i7) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i7) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i7) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i7) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean l(int i7) {
        Bundle bundleT = t();
        return bundleT != null && (bundleT.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i7) == i7;
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray v(View view) {
        SparseArray sparseArrayY = y(view);
        if (sparseArrayY != null) {
            return sparseArrayY;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(AbstractC2078c.f22350I, sparseArray);
        return sparseArray;
    }

    private SparseArray y(View view) {
        return (SparseArray) view.getTag(AbstractC2078c.f22350I);
    }

    public CharSequence A() {
        if (!D()) {
            return this.f7340a.getText();
        }
        List listH = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listH2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listH3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listH4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f7340a.getText(), 0, this.f7340a.getText().length()));
        for (int i7 = 0; i7 < listH.size(); i7++) {
            spannableString.setSpan(new C0576a(((Integer) listH4.get(i7)).intValue(), this, t().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listH.get(i7)).intValue(), ((Integer) listH2.get(i7)).intValue(), ((Integer) listH3.get(i7)).intValue());
        }
        return spannableString;
    }

    public void A0(boolean z6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7340a.setScreenReaderFocusable(z6);
        } else {
            b0(1, z6);
        }
    }

    public String B() {
        return androidx.core.os.a.c() ? this.f7340a.getUniqueId() : this.f7340a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void B0(boolean z6) {
        this.f7340a.setScrollable(z6);
    }

    public String C() {
        return this.f7340a.getViewIdResourceName();
    }

    public void C0(boolean z6) {
        this.f7340a.setSelected(z6);
    }

    public void D0(boolean z6) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7340a.setShowingHintText(z6);
        } else {
            b0(4, z6);
        }
    }

    public void E0(View view) {
        this.f7342c = -1;
        this.f7340a.setSource(view);
    }

    public boolean F() {
        return this.f7340a.isAccessibilityFocused();
    }

    public void F0(View view, int i7) {
        this.f7342c = i7;
        this.f7340a.setSource(view, i7);
    }

    public boolean G() {
        return this.f7340a.isCheckable();
    }

    public void G0(CharSequence charSequence) {
        if (androidx.core.os.a.b()) {
            this.f7340a.setStateDescription(charSequence);
        } else {
            this.f7340a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean H() {
        return this.f7340a.isChecked();
    }

    public void H0(CharSequence charSequence) {
        this.f7340a.setText(charSequence);
    }

    public boolean I() {
        return this.f7340a.isClickable();
    }

    public void I0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7340a.setTooltipText(charSequence);
        } else {
            this.f7340a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public boolean J() {
        return this.f7340a.isEnabled();
    }

    public void J0(View view) {
        this.f7340a.setTraversalAfter(view);
    }

    public boolean K() {
        return this.f7340a.isFocusable();
    }

    public void K0(String str) {
        this.f7340a.setViewIdResourceName(str);
    }

    public boolean L() {
        return this.f7340a.isFocused();
    }

    public void L0(boolean z6) {
        this.f7340a.setVisibleToUser(z6);
    }

    public boolean M() {
        return this.f7340a.isLongClickable();
    }

    public AccessibilityNodeInfo M0() {
        return this.f7340a;
    }

    public boolean N() {
        return this.f7340a.isPassword();
    }

    public boolean O() {
        return Build.VERSION.SDK_INT >= 28 ? this.f7340a.isScreenReaderFocusable() : l(1);
    }

    public boolean P() {
        return this.f7340a.isScrollable();
    }

    public boolean Q() {
        return this.f7340a.isSelected();
    }

    public boolean R() {
        return Build.VERSION.SDK_INT >= 26 ? this.f7340a.isShowingHintText() : l(4);
    }

    public boolean S() {
        return this.f7340a.isVisibleToUser();
    }

    public boolean W(int i7, Bundle bundle) {
        return this.f7340a.performAction(i7, bundle);
    }

    public void X() {
        this.f7340a.recycle();
    }

    public boolean Y(a aVar) {
        return this.f7340a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f7386a);
    }

    public void a(int i7) {
        this.f7340a.addAction(i7);
    }

    public void a0(boolean z6) {
        this.f7340a.setAccessibilityFocused(z6);
    }

    public void b(a aVar) {
        this.f7340a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f7386a);
    }

    public void c(View view) {
        this.f7340a.addChild(view);
    }

    public void c0(Rect rect) {
        this.f7340a.setBoundsInParent(rect);
    }

    public void d(View view, int i7) {
        this.f7340a.addChild(view, i7);
    }

    public void d0(Rect rect) {
        this.f7340a.setBoundsInScreen(rect);
    }

    public void e0(boolean z6) {
        this.f7340a.setCheckable(z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C)) {
            return false;
        }
        C c7 = (C) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7340a;
        if (accessibilityNodeInfo == null) {
            if (c7.f7340a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c7.f7340a)) {
            return false;
        }
        return this.f7342c == c7.f7342c && this.f7341b == c7.f7341b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            Z(view);
            ClickableSpan[] clickableSpanArrQ = q(charSequence);
            if (clickableSpanArrQ == null || clickableSpanArrQ.length <= 0) {
                return;
            }
            t().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", AbstractC2078c.f22361a);
            SparseArray sparseArrayV = v(view);
            for (int i7 = 0; i7 < clickableSpanArrQ.length; i7++) {
                int iE = E(clickableSpanArrQ[i7], sparseArrayV);
                sparseArrayV.put(iE, new WeakReference(clickableSpanArrQ[i7]));
                e(clickableSpanArrQ[i7], (Spanned) charSequence, iE);
            }
        }
    }

    public void f0(boolean z6) {
        this.f7340a.setChecked(z6);
    }

    public void g0(CharSequence charSequence) {
        this.f7340a.setClassName(charSequence);
    }

    public void h0(boolean z6) {
        this.f7340a.setClickable(z6);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7340a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f7340a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(new a(actionList.get(i7)));
        }
        return arrayList;
    }

    public void i0(Object obj) {
        this.f7340a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f7390a);
    }

    public void j0(Object obj) {
        this.f7340a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f7391a);
    }

    public int k() {
        return this.f7340a.getActions();
    }

    public void k0(CharSequence charSequence) {
        this.f7340a.setContentDescription(charSequence);
    }

    public void l0(boolean z6) {
        this.f7340a.setEnabled(z6);
    }

    public void m(Rect rect) {
        this.f7340a.getBoundsInParent(rect);
    }

    public void m0(CharSequence charSequence) {
        this.f7340a.setError(charSequence);
    }

    public void n(Rect rect) {
        this.f7340a.getBoundsInScreen(rect);
    }

    public void n0(boolean z6) {
        this.f7340a.setFocusable(z6);
    }

    public int o() {
        return this.f7340a.getChildCount();
    }

    public void o0(boolean z6) {
        this.f7340a.setFocused(z6);
    }

    public CharSequence p() {
        return this.f7340a.getClassName();
    }

    public void p0(boolean z6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7340a.setHeading(z6);
        } else {
            b0(2, z6);
        }
    }

    public void q0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7340a.setHintText(charSequence);
        } else {
            this.f7340a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public b r() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f7340a.getCollectionInfo();
        if (collectionInfo != null) {
            return new b(collectionInfo);
        }
        return null;
    }

    public void r0(View view) {
        this.f7340a.setLabelFor(view);
    }

    public CharSequence s() {
        return this.f7340a.getContentDescription();
    }

    public void s0(View view) {
        this.f7340a.setLabeledBy(view);
    }

    public Bundle t() {
        return this.f7340a.getExtras();
    }

    public void t0(int i7) {
        this.f7340a.setMaxTextLength(i7);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb.append("; boundsInParent: " + rect);
        n(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(w());
        sb.append("; className: ");
        sb.append(p());
        sb.append("; text: ");
        sb.append(A());
        sb.append("; contentDescription: ");
        sb.append(s());
        sb.append("; viewId: ");
        sb.append(C());
        sb.append("; uniqueId: ");
        sb.append(B());
        sb.append("; checkable: ");
        sb.append(G());
        sb.append("; checked: ");
        sb.append(H());
        sb.append("; focusable: ");
        sb.append(K());
        sb.append("; focused: ");
        sb.append(L());
        sb.append("; selected: ");
        sb.append(Q());
        sb.append("; clickable: ");
        sb.append(I());
        sb.append("; longClickable: ");
        sb.append(M());
        sb.append("; enabled: ");
        sb.append(J());
        sb.append("; password: ");
        sb.append(N());
        sb.append("; scrollable: " + P());
        sb.append("; [");
        List listI = i();
        for (int i7 = 0; i7 < listI.size(); i7++) {
            a aVar = (a) listI.get(i7);
            String strJ = j(aVar.b());
            if (strJ.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strJ = aVar.c().toString();
            }
            sb.append(strJ);
            if (i7 != listI.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence u() {
        return Build.VERSION.SDK_INT >= 26 ? this.f7340a.getHintText() : this.f7340a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    public void u0(CharSequence charSequence) {
        this.f7340a.setPackageName(charSequence);
    }

    public void v0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7340a.setPaneTitle(charSequence);
        } else {
            this.f7340a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public CharSequence w() {
        return this.f7340a.getPackageName();
    }

    public void w0(View view) {
        this.f7341b = -1;
        this.f7340a.setParent(view);
    }

    public d x() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f7340a.getRangeInfo();
        if (rangeInfo != null) {
            return new d(rangeInfo);
        }
        return null;
    }

    public void x0(View view, int i7) {
        this.f7341b = i7;
        this.f7340a.setParent(view, i7);
    }

    public void y0(d dVar) {
        this.f7340a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f7392a);
    }

    public CharSequence z() {
        return androidx.core.os.a.b() ? this.f7340a.getStateDescription() : this.f7340a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void z0(CharSequence charSequence) {
        this.f7340a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }
}
