package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import e.AbstractC1609a;
import e.AbstractC1612d;
import e.AbstractC1614f;
import e.AbstractC1615g;
import e.AbstractC1616h;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import y.AbstractC2229a;
import z.AbstractC2252a;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends T implements androidx.appcompat.view.c {

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    static final o f5757B0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private TextWatcher f5758A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final SearchAutoComplete f5759B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final View f5760C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final View f5761D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final View f5762E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    final ImageView f5763F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    final ImageView f5764G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    final ImageView f5765H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final ImageView f5766I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final View f5767J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private q f5768K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private Rect f5769L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Rect f5770M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int[] f5771N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int[] f5772O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final ImageView f5773P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final Drawable f5774Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final int f5775R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final int f5776S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final Intent f5777T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final Intent f5778U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final CharSequence f5779V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private m f5780W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private l f5781a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    View.OnFocusChangeListener f5782b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private View.OnClickListener f5783c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f5784d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f5785e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    AbstractC2229a f5786f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f5787g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private CharSequence f5788h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f5789i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f5790j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f5791k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f5792l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private CharSequence f5793m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private CharSequence f5794n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f5795o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f5796p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    SearchableInfo f5797q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private Bundle f5798r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private final Runnable f5799s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private Runnable f5800t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final WeakHashMap f5801u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final View.OnClickListener f5802v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    View.OnKeyListener f5803w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f5804x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f5805y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f5806z0;

    public static class SearchAutoComplete extends C0527d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f5807q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private SearchView f5808r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f5809s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Runnable f5810t;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC1609a.f18740m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i7 = configuration.screenWidthDp;
            int i8 = configuration.screenHeightDp;
            if (i7 >= 960 && i8 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i7 < 600) {
                return (i7 < 640 || i8 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f5757B0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f5809s) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f5809s = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f5807q <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0527d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f5809s) {
                removeCallbacks(this.f5810t);
                post(this.f5810t);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z6, int i7, Rect rect) {
            super.onFocusChanged(z6, i7, rect);
            this.f5808r.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
            if (i7 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f5808r.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i7, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z6) {
            super.onWindowFocusChanged(z6);
            if (z6 && this.f5808r.hasFocus() && getVisibility() == 0) {
                this.f5809s = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z6) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z6) {
                this.f5809s = false;
                removeCallbacks(this.f5810t);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f5809s = true;
                    return;
                }
                this.f5809s = false;
                removeCallbacks(this.f5810t);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f5808r = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i7) {
            super.setThreshold(i7);
            this.f5807q = i7;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
            this.f5810t = new a();
            this.f5807q = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2229a abstractC2229a = SearchView.this.f5786f0;
            if (abstractC2229a instanceof b0) {
                abstractC2229a.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z6) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f5782b0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z6);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f5763F) {
                searchView.V();
                return;
            }
            if (view == searchView.f5765H) {
                searchView.R();
                return;
            }
            if (view == searchView.f5764G) {
                searchView.W();
            } else if (view == searchView.f5766I) {
                searchView.a0();
            } else if (view == searchView.f5759B) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i7, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f5797q0 == null) {
                return false;
            }
            if (searchView.f5759B.isPopupShowing() && SearchView.this.f5759B.getListSelection() != -1) {
                return SearchView.this.X(view, i7, keyEvent);
            }
            if (SearchView.this.f5759B.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i7 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.f5759B.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
            SearchView.this.S(i7, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i7, long j7) {
            SearchView.this.T(i7);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i7) {
            searchAutoComplete.setInputMethodMode(i7);
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
    }

    private static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f5822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f5823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f5824c;

        o() {
            this.f5822a = null;
            this.f5823b = null;
            this.f5824c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f5822a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f5823b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f5824c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f5823b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f5822a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f5824c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class p extends AbstractC2252a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f5825o;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i7) {
                return new p[i7];
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5825o = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f5825o + "}";
        }

        @Override // z.AbstractC2252a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeValue(Boolean.valueOf(this.f5825o));
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }
    }

    private static class q extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f5826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f5827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f5828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f5829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f5830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f5831f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f5830e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f5827b = new Rect();
            this.f5829d = new Rect();
            this.f5828c = new Rect();
            a(rect, rect2);
            this.f5826a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f5827b.set(rect);
            this.f5829d.set(rect);
            Rect rect3 = this.f5829d;
            int i7 = this.f5830e;
            rect3.inset(-i7, -i7);
            this.f5828c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z6;
            float width;
            int height;
            boolean z7;
            int x6 = (int) motionEvent.getX();
            int y6 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z8 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z7 = this.f5831f;
                    if (z7 && !this.f5829d.contains(x6, y6)) {
                        z8 = z7;
                        z6 = false;
                    }
                } else {
                    if (action == 3) {
                        z7 = this.f5831f;
                        this.f5831f = false;
                    }
                    z6 = true;
                    z8 = false;
                }
                z8 = z7;
                z6 = true;
            } else if (this.f5827b.contains(x6, y6)) {
                this.f5831f = true;
                z6 = true;
            } else {
                z6 = true;
                z8 = false;
            }
            if (!z8) {
                return false;
            }
            if (!z6 || this.f5828c.contains(x6, y6)) {
                Rect rect = this.f5828c;
                width = x6 - rect.left;
                height = y6 - rect.top;
            } else {
                width = this.f5826a.getWidth() / 2;
                height = this.f5826a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.f5826a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f5757B0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i7, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f5794n0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f5798r0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i7 != 0) {
            intent.putExtra("action_key", i7);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f5797q0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i7, String str) {
        int position;
        String strO;
        try {
            String strO2 = b0.o(cursor, "suggest_intent_action");
            if (strO2 == null) {
                strO2 = this.f5797q0.getSuggestIntentAction();
            }
            if (strO2 == null) {
                strO2 = "android.intent.action.SEARCH";
            }
            String str2 = strO2;
            String strO3 = b0.o(cursor, "suggest_intent_data");
            if (strO3 == null) {
                strO3 = this.f5797q0.getSuggestIntentData();
            }
            if (strO3 != null && (strO = b0.o(cursor, "suggest_intent_data_id")) != null) {
                strO3 = strO3 + "/" + Uri.encode(strO);
            }
            return C(str2, strO3 == null ? null : Uri.parse(strO3), b0.o(cursor, "suggest_intent_extra_data"), b0.o(cursor, "suggest_intent_query"), i7, str);
        } catch (RuntimeException e7) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e7);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5798r0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.f5759B.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.f5771N);
        getLocationInWindow(this.f5772O);
        int[] iArr = this.f5771N;
        int i7 = iArr[1];
        int[] iArr2 = this.f5772O;
        int i8 = i7 - iArr2[1];
        int i9 = iArr[0] - iArr2[0];
        rect.set(i9, i8, view.getWidth() + i9, view.getHeight() + i8);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.f5784d0 || this.f5774Q == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f5759B.getTextSize()) * 1.25d);
        this.f5774Q.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f5774Q), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.f5797q0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f5797q0.getVoiceSearchLaunchWebSearch() ? this.f5777T : this.f5797q0.getVoiceSearchLaunchRecognizer() ? this.f5778U : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.f5787g0 || this.f5792l0) && !L();
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e7) {
            Log.e("SearchView", "Failed launch activity: " + intent, e7);
        }
    }

    private boolean Q(int i7, int i8, String str) {
        Cursor cursorB = this.f5786f0.b();
        if (cursorB == null || !cursorB.moveToPosition(i7)) {
            return false;
        }
        O(D(cursorB, i8, str));
        return true;
    }

    private void b0() {
        post(this.f5799s0);
    }

    private void c0(int i7) {
        CharSequence charSequenceC;
        Editable text = this.f5759B.getText();
        Cursor cursorB = this.f5786f0.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i7) || (charSequenceC = this.f5786f0.c(cursorB)) == null) {
            setQuery(text);
        } else {
            setQuery(charSequenceC);
        }
    }

    private void e0() {
        boolean z6 = true;
        boolean z7 = !TextUtils.isEmpty(this.f5759B.getText());
        if (!z7 && (!this.f5784d0 || this.f5795o0)) {
            z6 = false;
        }
        this.f5765H.setVisibility(z6 ? 0 : 8);
        Drawable drawable = this.f5765H.getDrawable();
        if (drawable != null) {
            drawable.setState(z7 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f5759B;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(AbstractC1612d.f18767e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(AbstractC1612d.f18768f);
    }

    private void h0() {
        this.f5759B.setThreshold(this.f5797q0.getSuggestThreshold());
        this.f5759B.setImeOptions(this.f5797q0.getImeOptions());
        int inputType = this.f5797q0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f5797q0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f5759B.setInputType(inputType);
        AbstractC2229a abstractC2229a = this.f5786f0;
        if (abstractC2229a != null) {
            abstractC2229a.a(null);
        }
        if (this.f5797q0.getSuggestAuthority() != null) {
            b0 b0Var = new b0(getContext(), this, this.f5797q0, this.f5801u0);
            this.f5786f0 = b0Var;
            this.f5759B.setAdapter(b0Var);
            ((b0) this.f5786f0).x(this.f5789i0 ? 2 : 1);
        }
    }

    private void i0() {
        this.f5762E.setVisibility((N() && (this.f5764G.getVisibility() == 0 || this.f5766I.getVisibility() == 0)) ? 0 : 8);
    }

    private void j0(boolean z6) {
        this.f5764G.setVisibility((this.f5787g0 && N() && hasFocus() && (z6 || !this.f5792l0)) ? 0 : 8);
    }

    private void k0(boolean z6) {
        this.f5785e0 = z6;
        int i7 = 8;
        int i8 = z6 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f5759B.getText());
        this.f5763F.setVisibility(i8);
        j0(!zIsEmpty);
        this.f5760C.setVisibility(z6 ? 8 : 0);
        if (this.f5773P.getDrawable() != null && !this.f5784d0) {
            i7 = 0;
        }
        this.f5773P.setVisibility(i7);
        e0();
        l0(zIsEmpty);
        i0();
    }

    private void l0(boolean z6) {
        int i7 = 8;
        if (this.f5792l0 && !L() && z6) {
            this.f5764G.setVisibility(8);
            i7 = 0;
        }
        this.f5766I.setVisibility(i7);
    }

    private void setQuery(CharSequence charSequence) {
        this.f5759B.setText(charSequence);
        this.f5759B.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void B() {
        if (this.f5767J.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f5761D.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = r0.b(this);
            int dimensionPixelSize = this.f5784d0 ? resources.getDimensionPixelSize(AbstractC1612d.f18765c) + resources.getDimensionPixelSize(AbstractC1612d.f18766d) : 0;
            this.f5759B.getDropDownBackground().getPadding(rect);
            int i7 = rect.left;
            this.f5759B.setDropDownHorizontalOffset(zB ? -i7 : paddingLeft - (i7 + dimensionPixelSize));
            this.f5759B.setDropDownWidth((((this.f5767J.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f5759B);
            return;
        }
        o oVar = f5757B0;
        oVar.b(this.f5759B);
        oVar.a(this.f5759B);
    }

    public boolean L() {
        return this.f5785e0;
    }

    void P(int i7, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i7, str));
    }

    void R() {
        if (!TextUtils.isEmpty(this.f5759B.getText())) {
            this.f5759B.setText("");
            this.f5759B.requestFocus();
            this.f5759B.setImeVisibility(true);
        } else if (this.f5784d0) {
            l lVar = this.f5781a0;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                k0(true);
            }
        }
    }

    boolean S(int i7, int i8, String str) {
        Q(i7, 0, null);
        this.f5759B.setImeVisibility(false);
        G();
        return true;
    }

    boolean T(int i7) {
        c0(i7);
        return true;
    }

    protected void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.f5759B.requestFocus();
        this.f5759B.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f5783c0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.f5759B.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f5780W;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.f5797q0 != null) {
                P(0, null, text.toString());
            }
            this.f5759B.setImeVisibility(false);
            G();
        }
    }

    boolean X(View view, int i7, KeyEvent keyEvent) {
        if (this.f5797q0 != null && this.f5786f0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i7 == 66 || i7 == 84 || i7 == 61) {
                return S(this.f5759B.getListSelection(), 0, null);
            }
            if (i7 == 21 || i7 == 22) {
                this.f5759B.setSelection(i7 == 21 ? 0 : this.f5759B.length());
                this.f5759B.setListSelection(0);
                this.f5759B.clearListSelection();
                this.f5759B.b();
                return true;
            }
            if (i7 == 19) {
                this.f5759B.getListSelection();
                return false;
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.f5759B.getText();
        this.f5794n0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        j0(!zIsEmpty);
        l0(zIsEmpty);
        e0();
        i0();
        if (this.f5780W != null && !TextUtils.equals(charSequence, this.f5793m0)) {
            this.f5780W.a(charSequence.toString());
        }
        this.f5793m0 = charSequence.toString();
    }

    void Z() {
        k0(L());
        b0();
        if (this.f5759B.hasFocus()) {
            H();
        }
    }

    void a0() {
        Intent intentE;
        SearchableInfo searchableInfo = this.f5797q0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                intentE = F(this.f5777T, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                intentE = E(this.f5778U, searchableInfo);
            }
            getContext().startActivity(intentE);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // androidx.appcompat.view.c
    public void c() {
        if (this.f5795o0) {
            return;
        }
        this.f5795o0 = true;
        int imeOptions = this.f5759B.getImeOptions();
        this.f5796p0 = imeOptions;
        this.f5759B.setImeOptions(imeOptions | 33554432);
        this.f5759B.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f5790j0 = true;
        super.clearFocus();
        this.f5759B.clearFocus();
        this.f5759B.setImeVisibility(false);
        this.f5790j0 = false;
    }

    public void d0(CharSequence charSequence, boolean z6) {
        this.f5759B.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f5759B;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f5794n0 = charSequence;
        }
        if (!z6 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    @Override // androidx.appcompat.view.c
    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f5759B.setImeOptions(this.f5796p0);
        this.f5795o0 = false;
    }

    void f0() {
        int[] iArr = this.f5759B.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f5761D.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f5762E.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f5759B.getImeOptions();
    }

    public int getInputType() {
        return this.f5759B.getInputType();
    }

    public int getMaxWidth() {
        return this.f5791k0;
    }

    public CharSequence getQuery() {
        return this.f5759B.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f5788h0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f5797q0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f5779V : getContext().getText(this.f5797q0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f5776S;
    }

    int getSuggestionRowLayout() {
        return this.f5775R;
    }

    public AbstractC2229a getSuggestionsAdapter() {
        return this.f5786f0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f5799s0);
        post(this.f5800t0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.T, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        super.onLayout(z6, i7, i8, i9, i10);
        if (z6) {
            I(this.f5759B, this.f5769L);
            Rect rect = this.f5770M;
            Rect rect2 = this.f5769L;
            rect.set(rect2.left, 0, rect2.right, i10 - i8);
            q qVar = this.f5768K;
            if (qVar != null) {
                qVar.a(this.f5770M, this.f5769L);
                return;
            }
            q qVar2 = new q(this.f5770M, this.f5769L, this.f5759B);
            this.f5768K = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    @Override // androidx.appcompat.widget.T, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i7, int i8) {
        int preferredWidth;
        int mode;
        if (L()) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode2 = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size = this.f5791k0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            } else if (mode2 == 1073741824 && (preferredWidth = this.f5791k0) > 0) {
            }
            mode = View.MeasureSpec.getMode(i8);
            int size2 = View.MeasureSpec.getSize(i8);
            if (mode != Integer.MIN_VALUE) {
                size2 = Math.min(getPreferredHeight(), size2);
            } else if (mode == 0) {
                size2 = getPreferredHeight();
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        preferredWidth = this.f5791k0;
        if (preferredWidth <= 0) {
            preferredWidth = getPreferredWidth();
        }
        size = Math.min(preferredWidth, size);
        mode = View.MeasureSpec.getMode(i8);
        int size22 = View.MeasureSpec.getSize(i8);
        if (mode != Integer.MIN_VALUE) {
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size22, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        k0(pVar.f5825o);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f5825o = L();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i7, Rect rect) {
        if (this.f5790j0 || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i7, rect);
        }
        boolean zRequestFocus = this.f5759B.requestFocus(i7, rect);
        if (zRequestFocus) {
            k0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f5798r0 = bundle;
    }

    public void setIconified(boolean z6) {
        if (z6) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z6) {
        if (this.f5784d0 == z6) {
            return;
        }
        this.f5784d0 = z6;
        k0(z6);
        g0();
    }

    public void setImeOptions(int i7) {
        this.f5759B.setImeOptions(i7);
    }

    public void setInputType(int i7) {
        this.f5759B.setInputType(i7);
    }

    public void setMaxWidth(int i7) {
        this.f5791k0 = i7;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f5781a0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f5782b0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f5780W = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f5783c0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f5788h0 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z6) {
        this.f5789i0 = z6;
        AbstractC2229a abstractC2229a = this.f5786f0;
        if (abstractC2229a instanceof b0) {
            ((b0) abstractC2229a).x(z6 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f5797q0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean zK = K();
        this.f5792l0 = zK;
        if (zK) {
            this.f5759B.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z6) {
        this.f5787g0 = z6;
        k0(L());
    }

    public void setSuggestionsAdapter(AbstractC2229a abstractC2229a) {
        this.f5786f0 = abstractC2229a;
        this.f5759B.setAdapter(abstractC2229a);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1609a.f18721F);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f5769L = new Rect();
        this.f5770M = new Rect();
        this.f5771N = new int[2];
        this.f5772O = new int[2];
        this.f5799s0 = new b();
        this.f5800t0 = new c();
        this.f5801u0 = new WeakHashMap();
        f fVar = new f();
        this.f5802v0 = fVar;
        this.f5803w0 = new g();
        h hVar = new h();
        this.f5804x0 = hVar;
        i iVar = new i();
        this.f5805y0 = iVar;
        j jVar = new j();
        this.f5806z0 = jVar;
        this.f5758A0 = new a();
        h0 h0VarV = h0.v(context, attributeSet, e.j.f19051f2, i7, 0);
        androidx.core.view.H.n0(this, context, e.j.f19051f2, attributeSet, h0VarV.r(), i7, 0);
        LayoutInflater.from(context).inflate(h0VarV.n(e.j.f19101p2, AbstractC1615g.f18880r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(AbstractC1614f.f18824D);
        this.f5759B = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f5760C = findViewById(AbstractC1614f.f18862z);
        View viewFindViewById = findViewById(AbstractC1614f.f18823C);
        this.f5761D = viewFindViewById;
        View viewFindViewById2 = findViewById(AbstractC1614f.f18830J);
        this.f5762E = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(AbstractC1614f.f18860x);
        this.f5763F = imageView;
        ImageView imageView2 = (ImageView) findViewById(AbstractC1614f.f18821A);
        this.f5764G = imageView2;
        ImageView imageView3 = (ImageView) findViewById(AbstractC1614f.f18861y);
        this.f5765H = imageView3;
        ImageView imageView4 = (ImageView) findViewById(AbstractC1614f.f18825E);
        this.f5766I = imageView4;
        ImageView imageView5 = (ImageView) findViewById(AbstractC1614f.f18822B);
        this.f5773P = imageView5;
        androidx.core.view.H.t0(viewFindViewById, h0VarV.g(e.j.f19106q2));
        androidx.core.view.H.t0(viewFindViewById2, h0VarV.g(e.j.f19126u2));
        imageView.setImageDrawable(h0VarV.g(e.j.f19121t2));
        imageView2.setImageDrawable(h0VarV.g(e.j.f19091n2));
        imageView3.setImageDrawable(h0VarV.g(e.j.f19076k2));
        imageView4.setImageDrawable(h0VarV.g(e.j.f19136w2));
        imageView5.setImageDrawable(h0VarV.g(e.j.f19121t2));
        this.f5774Q = h0VarV.g(e.j.f19116s2);
        l0.a(imageView, getResources().getString(AbstractC1616h.f18896n));
        this.f5775R = h0VarV.n(e.j.f19131v2, AbstractC1615g.f18879q);
        this.f5776S = h0VarV.n(e.j.f19081l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f5758A0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f5803w0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(h0VarV.a(e.j.f19096o2, true));
        int iF = h0VarV.f(e.j.f19061h2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.f5779V = h0VarV.p(e.j.f19086m2);
        this.f5788h0 = h0VarV.p(e.j.f19111r2);
        int iK = h0VarV.k(e.j.f19071j2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = h0VarV.k(e.j.f19066i2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(h0VarV.a(e.j.f19056g2, true));
        h0VarV.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f5777T = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f5778U = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f5767J = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.f5784d0);
        g0();
    }
}
