package com.facebook.react.views.textinput;

import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.react.uimanager.C0872e0;
import com.facebook.react.uimanager.p0;
import x2.InterfaceC2218a;

/* JADX INFO: loaded from: classes.dex */
public class K extends com.facebook.react.views.text.c implements com.facebook.yoga.o {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f13153b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private EditText f13154c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private r f13155d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private String f13156e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private String f13157f0;

    public K() {
        this(null);
    }

    private void C1() {
        Y0(this);
    }

    @Override // com.facebook.react.uimanager.V, com.facebook.react.uimanager.U
    public void A(C0872e0 c0872e0) {
        super.A(c0872e0);
        EditText editTextZ1 = z1();
        K0(4, androidx.core.view.H.G(editTextZ1));
        K0(1, editTextZ1.getPaddingTop());
        K0(5, androidx.core.view.H.F(editTextZ1));
        K0(3, editTextZ1.getPaddingBottom());
        this.f13154c0 = editTextZ1;
        editTextZ1.setPadding(0, 0, 0, 0);
        this.f13154c0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // com.facebook.react.uimanager.V
    public void A0(p0 p0Var) {
        super.A0(p0Var);
        if (this.f13153b0 != -1) {
            p0Var.O(r(), new com.facebook.react.views.text.i(y1(this, B1(), false, null), this.f13153b0, this.f13044Z, l0(0), l0(1), l0(2), l0(3), this.f13027I, this.f13028J, this.f13030L));
        }
    }

    public String A1() {
        return this.f13157f0;
    }

    public String B1() {
        return this.f13156e0;
    }

    @Override // com.facebook.react.uimanager.V, com.facebook.react.uimanager.U
    public void F(Object obj) {
        O1.a.a(obj instanceof r);
        this.f13155d0 = (r) obj;
        i();
    }

    @Override // com.facebook.yoga.o
    public long V(com.facebook.yoga.r rVar, float f7, com.facebook.yoga.p pVar, float f8, com.facebook.yoga.p pVar2) {
        EditText editText = (EditText) O1.a.c(this.f13154c0);
        r rVar2 = this.f13155d0;
        if (rVar2 != null) {
            rVar2.a(editText);
        } else {
            editText.setTextSize(0, this.f13019A.c());
            int i7 = this.f13026H;
            if (i7 != -1) {
                editText.setLines(i7);
            }
            int breakStrategy = editText.getBreakStrategy();
            int i8 = this.f13028J;
            if (breakStrategy != i8) {
                editText.setBreakStrategy(i8);
            }
        }
        editText.setHint(A1());
        editText.measure(com.facebook.react.views.view.e.a(f7, pVar), com.facebook.react.views.view.e.a(f8, pVar2));
        return com.facebook.yoga.q.b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // com.facebook.react.uimanager.V
    public void a1(int i7, float f7) {
        super.a1(i7, f7);
        y0();
    }

    @InterfaceC2218a(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i7) {
        this.f13153b0 = i7;
    }

    @InterfaceC2218a(name = "placeholder")
    public void setPlaceholder(String str) {
        this.f13157f0 = str;
        y0();
    }

    @InterfaceC2218a(name = "text")
    public void setText(String str) {
        this.f13156e0 = str;
        y0();
    }

    @Override // com.facebook.react.views.text.c
    public void setTextBreakStrategy(String str) {
        int i7;
        if (str != null && !"simple".equals(str)) {
            if ("highQuality".equals(str)) {
                i7 = 1;
            } else if ("balanced".equals(str)) {
                i7 = 2;
            } else {
                P0.a.G("ReactNative", "Invalid textBreakStrategy: " + str);
            }
            this.f13028J = i7;
            return;
        }
        this.f13028J = 0;
    }

    @Override // com.facebook.react.uimanager.V
    public boolean v0() {
        return true;
    }

    @Override // com.facebook.react.uimanager.V
    public boolean w0() {
        return true;
    }

    protected EditText z1() {
        return new EditText(new androidx.appcompat.view.d(G(), com.facebook.react.r.f12046f));
    }

    public K(com.facebook.react.views.text.n nVar) {
        super(nVar);
        this.f13153b0 = -1;
        this.f13156e0 = null;
        this.f13157f0 = null;
        this.f13028J = 1;
        C1();
    }
}
