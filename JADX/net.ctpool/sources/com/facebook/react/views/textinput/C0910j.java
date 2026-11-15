package com.facebook.react.views.textinput;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.C0535l;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.uimanager.AbstractC0884k0;
import com.facebook.react.uimanager.InterfaceC0870d0;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.react.views.textinput.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0910j extends C0535l {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final KeyListener f13188c0 = QwertyKeyListener.getInstanceForFullKeyboard();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f13189A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected boolean f13190B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private String f13191C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f13192D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private String f13193E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private N f13194F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private InterfaceC0901a f13195G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private M f13196H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private c f13197I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f13198J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f13199K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private com.facebook.react.views.text.r f13200L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f13201M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private String f13202N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f13203O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f13204P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f13205Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f13206R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f13207S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private String f13208T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final com.facebook.react.views.view.g f13209U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private InterfaceC0870d0 f13210V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    protected boolean f13211W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected boolean f13212a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private com.facebook.react.uimanager.events.e f13213b0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InputMethodManager f13214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f13215t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f13216u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f13217v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f13218w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected int f13219x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ArrayList f13220y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private d f13221z;

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$a */
    class a extends com.facebook.react.uimanager.I {
        a(View view, boolean z6, int i7) {
            super(view, z6, i7);
        }

        @Override // com.facebook.react.uimanager.I, androidx.core.view.C0574a
        public boolean j(View view, int i7, Bundle bundle) {
            if (i7 != 16) {
                return super.j(view, i7, bundle);
            }
            int length = C0910j.this.getText().length();
            if (length > 0) {
                C0910j.this.setSelection(length);
            }
            return C0910j.this.Q();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$b */
    class b implements ActionMode.Callback {
        b() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            if (C0910j.this.f13206R) {
                return false;
            }
            menu.removeItem(R.id.pasteAsPlainText);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$c */
    private static class c implements KeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f13224a = 0;

        public void a(int i7) {
            this.f13224a = i7;
        }

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable editable, int i7) {
            C0910j.f13188c0.clearMetaKeyState(view, editable, i7);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.f13224a;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable editable, int i7, KeyEvent keyEvent) {
            return C0910j.f13188c0.onKeyDown(view, editable, i7, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return C0910j.f13188c0.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable editable, int i7, KeyEvent keyEvent) {
            return C0910j.f13188c0.onKeyUp(view, editable, i7, keyEvent);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.textinput.j$d */
    private class d implements TextWatcher {
        private d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C0910j c0910j = C0910j.this;
            if (c0910j.f13216u || c0910j.f13220y == null) {
                return;
            }
            Iterator it = C0910j.this.f13220y.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            C0910j c0910j = C0910j.this;
            if (c0910j.f13216u || c0910j.f13220y == null) {
                return;
            }
            Iterator it = C0910j.this.f13220y.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i7, i8, i9);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            C0910j c0910j = C0910j.this;
            if (!c0910j.f13216u && c0910j.f13220y != null) {
                Iterator it = C0910j.this.f13220y.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i7, i8, i9);
                }
            }
            C0910j.this.b0();
            C0910j.this.O();
        }
    }

    public C0910j(Context context) {
        super(context);
        this.f13215t = C0910j.class.getSimpleName();
        this.f13191C = null;
        this.f13198J = false;
        this.f13199K = false;
        this.f13201M = false;
        this.f13202N = null;
        this.f13203O = -1;
        this.f13204P = -1;
        this.f13205Q = false;
        this.f13206R = false;
        this.f13207S = false;
        this.f13208T = null;
        this.f13210V = null;
        this.f13211W = false;
        this.f13212a0 = false;
        setFocusableInTouchMode(false);
        this.f13209U = new com.facebook.react.views.view.g(this);
        this.f13214s = (InputMethodManager) O1.a.c(context.getSystemService("input_method"));
        this.f13217v = getGravity() & 8388615;
        this.f13218w = getGravity() & 112;
        this.f13219x = 0;
        this.f13216u = false;
        this.f13192D = false;
        this.f13220y = null;
        this.f13221z = null;
        this.f13189A = getInputType();
        if (this.f13197I == null) {
            this.f13197I = new c();
        }
        this.f13196H = null;
        this.f13200L = new com.facebook.react.views.text.r();
        s();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && i7 <= 27) {
            setLayerType(1, null);
        }
        androidx.core.view.H.p0(this, new a(this, isFocusable(), getImportantForAccessibility()));
        b bVar = new b();
        setCustomSelectionActionModeCallback(bVar);
        setCustomInsertionActionModeCallback(bVar);
    }

    private boolean A() {
        return (getInputType() & 144) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean B(M2.d dVar) {
        return dVar.getSize() == this.f13200L.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean C(M2.e eVar) {
        return eVar.getBackgroundColor() == this.f13209U.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean D(M2.g gVar) {
        return gVar.getForegroundColor() == getCurrentTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean E(M2.i iVar) {
        return (getPaintFlags() & 16) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean F(M2.k kVar) {
        return (getPaintFlags() & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean G(M2.a aVar) {
        return aVar.b() == this.f13200L.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean H(M2.c cVar) {
        return cVar.c() == this.f13204P && Objects.equals(cVar.a(), this.f13202N) && cVar.d() == this.f13203O && Objects.equals(cVar.b(), getFontFeatureSettings());
    }

    private void I(SpannableStringBuilder spannableStringBuilder) {
        for (Object obj : getText().getSpans(0, length(), Object.class)) {
            int spanFlags = getText().getSpanFlags(obj);
            boolean z6 = (spanFlags & 33) == 33;
            if (obj instanceof M2.h) {
                getText().removeSpan(obj);
            }
            if (z6) {
                int spanStart = getText().getSpanStart(obj);
                int spanEnd = getText().getSpanEnd(obj);
                getText().removeSpan(obj);
                if (R(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        InterfaceC0901a interfaceC0901a = this.f13195G;
        if (interfaceC0901a != null) {
            interfaceC0901a.a();
        }
        V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Q() {
        setFocusableInTouchMode(true);
        boolean zRequestFocus = super.requestFocus(130, null);
        if (getShowSoftInputOnFocus()) {
            Y();
        }
        return zRequestFocus;
    }

    private static boolean R(Editable editable, SpannableStringBuilder spannableStringBuilder, int i7, int i8) {
        if (i7 > spannableStringBuilder.length() || i8 > spannableStringBuilder.length()) {
            return false;
        }
        while (i7 < i8) {
            if (editable.charAt(i7) != spannableStringBuilder.charAt(i7)) {
                return false;
            }
            i7++;
        }
        return true;
    }

    private void V() {
        ReactContext reactContextD = AbstractC0884k0.d(this);
        if (this.f13210V != null || reactContextD.isBridgeless()) {
            return;
        }
        r rVar = new r(this);
        UIManagerModule uIManagerModule = (UIManagerModule) reactContextD.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), rVar);
        }
    }

    private void Z(SpannableStringBuilder spannableStringBuilder, Class cls, androidx.core.util.g gVar) {
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls)) {
            if (gVar.a(obj)) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
    }

    private void a0(SpannableStringBuilder spannableStringBuilder) {
        Z(spannableStringBuilder, M2.d.class, new androidx.core.util.g() { // from class: com.facebook.react.views.textinput.c
            @Override // androidx.core.util.g
            public final boolean a(Object obj) {
                return this.f13181a.B((M2.d) obj);
            }
        });
        Z(spannableStringBuilder, M2.e.class, new androidx.core.util.g() { // from class: com.facebook.react.views.textinput.d
            @Override // androidx.core.util.g
            public final boolean a(Object obj) {
                return this.f13182a.C((M2.e) obj);
            }
        });
        Z(spannableStringBuilder, M2.g.class, new androidx.core.util.g() { // from class: com.facebook.react.views.textinput.e
            @Override // androidx.core.util.g
            public final boolean a(Object obj) {
                return this.f13183a.D((M2.g) obj);
            }
        });
        Z(spannableStringBuilder, M2.i.class, new androidx.core.util.g() { // from class: com.facebook.react.views.textinput.f
            @Override // androidx.core.util.g
            public final boolean a(Object obj) {
                return this.f13184a.E((M2.i) obj);
            }
        });
        Z(spannableStringBuilder, M2.k.class, new androidx.core.util.g() { // from class: com.facebook.react.views.textinput.g
            @Override // androidx.core.util.g
            public final boolean a(Object obj) {
                return this.f13185a.F((M2.k) obj);
            }
        });
        Z(spannableStringBuilder, M2.a.class, new androidx.core.util.g() { // from class: com.facebook.react.views.textinput.h
            @Override // androidx.core.util.g
            public final boolean a(Object obj) {
                return this.f13186a.G((M2.a) obj);
            }
        });
        Z(spannableStringBuilder, M2.c.class, new androidx.core.util.g() { // from class: com.facebook.react.views.textinput.i
            @Override // androidx.core.util.g
            public final boolean a(Object obj) {
                return this.f13187a.H((M2.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        if (this.f13210V == null || getId() == -1) {
            return;
        }
        Editable text = getText();
        boolean z6 = text != null && text.length() > 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z6) {
            try {
                spannableStringBuilder.append(text.subSequence(0, text.length()));
            } catch (IndexOutOfBoundsException e7) {
                ReactSoftExceptionLogger.logSoftException(this.f13215t, e7);
            }
        }
        if (!z6) {
            spannableStringBuilder.append((getHint() == null || getHint().length() <= 0) ? "I" : getHint());
        }
        r(spannableStringBuilder);
        com.facebook.react.views.text.s.l(getId(), spannableStringBuilder);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c0() {
        int i7 = 5;
        String str = this.f13193E;
        if (str != null) {
            str.hashCode();
            byte b7 = -1;
            switch (str.hashCode()) {
                case -1273775369:
                    if (str.equals("previous")) {
                        b7 = 0;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        b7 = 1;
                    }
                    break;
                case 3304:
                    if (str.equals("go")) {
                        b7 = 2;
                    }
                    break;
                case 3089282:
                    if (str.equals("done")) {
                        b7 = 3;
                    }
                    break;
                case 3377907:
                    if (str.equals("next")) {
                        b7 = 4;
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        b7 = 5;
                    }
                    break;
                case 3526536:
                    if (str.equals("send")) {
                        b7 = 6;
                    }
                    break;
            }
            switch (b7) {
                case 0:
                    i7 = 7;
                    break;
                case 1:
                    i7 = 3;
                    break;
                case 2:
                    i7 = 2;
                    break;
                case 3:
                default:
                    i7 = 6;
                    break;
                case 4:
                    break;
                case 5:
                    i7 = 1;
                    break;
                case 6:
                    i7 = 4;
                    break;
            }
        }
        if (this.f13192D) {
            i7 |= 33554432;
        }
        setImeOptions(i7);
    }

    private d getTextWatcherDelegator() {
        if (this.f13221z == null) {
            this.f13221z = new d();
        }
        return this.f13221z;
    }

    private void r(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.setSpan(new M2.d(this.f13200L.c()), 0, spannableStringBuilder.length(), 16711698);
        spannableStringBuilder.setSpan(new M2.g(getCurrentTextColor()), 0, spannableStringBuilder.length(), 16711698);
        int iB = this.f13209U.b();
        if (iB != 0) {
            spannableStringBuilder.setSpan(new M2.e(iB), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 16) != 0) {
            spannableStringBuilder.setSpan(new M2.i(), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 8) != 0) {
            spannableStringBuilder.setSpan(new M2.k(), 0, spannableStringBuilder.length(), 16711698);
        }
        float fD = this.f13200L.d();
        if (!Float.isNaN(fD)) {
            spannableStringBuilder.setSpan(new M2.a(fD), 0, spannableStringBuilder.length(), 16711698);
        }
        if (this.f13204P != -1 || this.f13203O != -1 || this.f13202N != null || getFontFeatureSettings() != null) {
            spannableStringBuilder.setSpan(new M2.c(this.f13204P, this.f13203O, getFontFeatureSettings(), this.f13202N, getContext().getAssets()), 0, spannableStringBuilder.length(), 16711698);
        }
        float fE = this.f13200L.e();
        if (Float.isNaN(fE)) {
            return;
        }
        spannableStringBuilder.setSpan(new M2.b(fE), 0, spannableStringBuilder.length(), 16711698);
    }

    private int u(int i7) {
        return Math.max(0, Math.min(i7, getText() == null ? 0 : getText().length()));
    }

    public void J(int i7, int i8, int i9) {
        if (!t(i7) || i8 == -1 || i9 == -1) {
            return;
        }
        setSelection(u(i8), u(i9));
    }

    public void K(com.facebook.react.views.text.i iVar) {
        if (!(A() && TextUtils.equals(getText(), iVar.i())) && t(iVar.c())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(iVar.i());
            I(spannableStringBuilder);
            a0(spannableStringBuilder);
            this.f13190B = iVar.b();
            this.f13211W = true;
            if (iVar.i().length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.f13211W = false;
            if (getBreakStrategy() != iVar.k()) {
                setBreakStrategy(iVar.k());
            }
            b0();
        }
    }

    public void L(com.facebook.react.views.text.i iVar) {
        this.f13216u = true;
        K(iVar);
        this.f13216u = false;
    }

    public void M(com.facebook.react.views.text.i iVar) {
        this.f13212a0 = true;
        K(iVar);
        this.f13212a0 = false;
    }

    public void N() {
        if (this.f13201M) {
            this.f13201M = false;
            setTypeface(com.facebook.react.views.text.o.a(getTypeface(), this.f13204P, this.f13203O, this.f13202N, getContext().getAssets()));
            setPaintFlags((this.f13204P == -1 && this.f13203O == -1 && this.f13202N == null && getFontFeatureSettings() == null) ? getPaintFlags() & (-129) : getPaintFlags() | 128);
        }
    }

    public void P() {
        Q();
    }

    public void S(int i7, float f7, float f8) {
        this.f13209U.f(i7, f7, f8);
    }

    public void T(float f7, int i7) {
        this.f13209U.h(f7, i7);
    }

    public void U(int i7, float f7) {
        this.f13209U.j(i7, f7);
    }

    public boolean W() {
        String submitBehavior = getSubmitBehavior();
        return submitBehavior == null ? !z() : submitBehavior.equals("blurAndSubmit");
    }

    public boolean X() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior == null) {
            if (z()) {
                return false;
            }
        } else if (!submitBehavior.equals("submit") && !submitBehavior.equals("blurAndSubmit")) {
            return false;
        }
        return true;
    }

    protected boolean Y() {
        return this.f13214s.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.f13220y == null) {
            this.f13220y = new ArrayList();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.f13220y.add(textWatcher);
    }

    @Override // android.view.View
    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        x();
    }

    protected void finalize() {
        com.facebook.react.views.text.s.e(getId());
    }

    public boolean getDisableFullscreenUI() {
        return this.f13192D;
    }

    int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public String getReturnKeyType() {
        return this.f13193E;
    }

    int getStagedInputType() {
        return this.f13189A;
    }

    public InterfaceC0870d0 getStateWrapper() {
        return this.f13210V;
    }

    public String getSubmitBehavior() {
        return this.f13191C;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f13190B) {
            Editable text = getText();
            for (M2.n nVar : (M2.n[]) text.getSpans(0, text.length(), M2.n.class)) {
                if (nVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        super.setTextIsSelectable(true);
        if (this.f13190B) {
            Editable text = getText();
            for (M2.n nVar : (M2.n[]) text.getSpans(0, text.length(), M2.n.class)) {
                nVar.c();
            }
        }
        if (this.f13205Q && !this.f13207S) {
            Q();
        }
        this.f13207S = true;
    }

    @Override // androidx.appcompat.widget.C0535l, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext reactContextD = AbstractC0884k0.d(this);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && this.f13199K) {
            inputConnectionOnCreateInputConnection = new C0912l(inputConnectionOnCreateInputConnection, reactContextD, this, this.f13213b0);
        }
        if (z() && (W() || X())) {
            editorInfo.imeOptions &= -1073741825;
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f13190B) {
            Editable text = getText();
            for (M2.n nVar : (M2.n[]) text.getSpans(0, text.length(), M2.n.class)) {
                nVar.d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        this.f13209U.d(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f13190B) {
            Editable text = getText();
            for (M2.n nVar : (M2.n[]) text.getSpans(0, text.length(), M2.n.class)) {
                nVar.e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z6, int i7, Rect rect) {
        N n7;
        super.onFocusChanged(z6, i7, rect);
        if (!z6 || (n7 = this.f13194F) == null) {
            return;
        }
        n7.a(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (i7 != 66 || z()) {
            return super.onKeyUp(i7, keyEvent);
        }
        x();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        O();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
        M m7 = this.f13196H;
        if (m7 != null) {
            m7.a(i7, i8, i9, i10);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i7, int i8) {
        super.onSelectionChanged(i7, i8);
        if (this.f13194F == null || !hasFocus()) {
            return;
        }
        this.f13194F.a(i7, i8);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f13190B) {
            Editable text = getText();
            for (M2.n nVar : (M2.n[]) text.getSpans(0, text.length(), M2.n.class)) {
                nVar.f();
            }
        }
    }

    @Override // androidx.appcompat.widget.C0535l, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i7) {
        if (i7 == 16908322) {
            i7 = R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f13198J = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.f13198J) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f13198J = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList arrayList = this.f13220y;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.f13220y.isEmpty()) {
                this.f13220y = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i7, Rect rect) {
        return isFocused();
    }

    protected void s() {
        setTextSize(0, this.f13200L.c());
        float fD = this.f13200L.d();
        if (Float.isNaN(fD)) {
            return;
        }
        setLetterSpacing(fD);
    }

    public void setAllowFontScaling(boolean z6) {
        if (this.f13200L.b() != z6) {
            this.f13200L.m(z6);
            s();
        }
    }

    public void setAutoFocus(boolean z6) {
        this.f13205Q = z6;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        this.f13209U.e(i7);
    }

    public void setBorderRadius(float f7) {
        this.f13209U.g(f7);
    }

    public void setBorderStyle(String str) {
        this.f13209U.i(str);
    }

    public void setContentSizeWatcher(InterfaceC0901a interfaceC0901a) {
        this.f13195G = interfaceC0901a;
    }

    public void setContextMenuHidden(boolean z6) {
        this.f13206R = z6;
    }

    public void setDisableFullscreenUI(boolean z6) {
        this.f13192D = z6;
        c0();
    }

    void setEventDispatcher(com.facebook.react.uimanager.events.e eVar) {
        this.f13213b0 = eVar;
    }

    public void setFontFamily(String str) {
        this.f13202N = str;
        this.f13201M = true;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(String str) {
        if (Objects.equals(str, getFontFeatureSettings())) {
            return;
        }
        super.setFontFeatureSettings(str);
        this.f13201M = true;
    }

    public void setFontSize(float f7) {
        this.f13200L.n(f7);
        s();
    }

    public void setFontStyle(String str) {
        int iB = com.facebook.react.views.text.o.b(str);
        if (iB != this.f13204P) {
            this.f13204P = iB;
            this.f13201M = true;
        }
    }

    public void setFontWeight(String str) {
        int iD = com.facebook.react.views.text.o.d(str);
        if (iD != this.f13203O) {
            this.f13203O = iD;
            this.f13201M = true;
        }
    }

    void setGravityHorizontal(int i7) {
        if (i7 == 0) {
            i7 = this.f13217v;
        }
        setGravity(i7 | (getGravity() & (-8388616)));
    }

    void setGravityVertical(int i7) {
        if (i7 == 0) {
            i7 = this.f13218w;
        }
        setGravity(i7 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i7) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i7);
        this.f13189A = i7;
        super.setTypeface(typeface);
        if (z()) {
            setSingleLine(false);
        }
        if (this.f13197I == null) {
            this.f13197I = new c();
        }
        this.f13197I.a(i7);
        setKeyListener(this.f13197I);
    }

    public void setLetterSpacingPt(float f7) {
        this.f13200L.p(f7);
        s();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i7) {
        this.f13200L.q(i7);
    }

    public void setMaxFontSizeMultiplier(float f7) {
        if (f7 != this.f13200L.k()) {
            this.f13200L.r(f7);
            s();
        }
    }

    public void setOnKeyPress(boolean z6) {
        this.f13199K = z6;
    }

    public void setOverflow(String str) {
        this.f13209U.k(str);
    }

    public void setPlaceholder(String str) {
        if (Objects.equals(str, this.f13208T)) {
            return;
        }
        this.f13208T = str;
        setHint(str);
    }

    public void setReturnKeyType(String str) {
        this.f13193E = str;
        c0();
    }

    public void setScrollWatcher(M m7) {
        this.f13196H = m7;
    }

    @Override // android.widget.EditText
    public void setSelection(int i7, int i8) {
        super.setSelection(i7, i8);
    }

    public void setSelectionWatcher(N n7) {
        this.f13194F = n7;
    }

    void setStagedInputType(int i7) {
        this.f13189A = i7;
    }

    public void setStateWrapper(InterfaceC0870d0 interfaceC0870d0) {
        this.f13210V = interfaceC0870d0;
    }

    public void setSubmitBehavior(String str) {
        this.f13191C = str;
    }

    public boolean t(int i7) {
        return i7 >= this.f13219x;
    }

    void v() {
        clearFocus();
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f13190B) {
            Editable text = getText();
            for (M2.n nVar : (M2.n[]) text.getSpans(0, text.length(), M2.n.class)) {
                if (nVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    void w() {
        if (getInputType() != this.f13189A) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.f13189A);
            setSelection(selectionStart, selectionEnd);
        }
    }

    protected void x() {
        this.f13214s.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public int y() {
        int i7 = this.f13219x + 1;
        this.f13219x = i7;
        return i7;
    }

    boolean z() {
        return (getInputType() & 131072) != 0;
    }
}
