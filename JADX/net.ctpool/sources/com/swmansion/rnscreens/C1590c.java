package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.Api;

/* JADX INFO: renamed from: com.swmansion.rnscreens.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1590c extends SearchView {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private SearchView.l f18382C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private View.OnClickListener f18383D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private androidx.activity.h f18384E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private final C1593f f18385F0;

    /* JADX INFO: renamed from: com.swmansion.rnscreens.c$a */
    public static final class a extends androidx.activity.h {
        a() {
            super(true);
        }

        @Override // androidx.activity.h
        public void b() {
            C1590c.this.setIconified(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1590c(Context context, Fragment fragment) {
        super(context);
        w5.k.f(context, "context");
        w5.k.f(fragment, "fragment");
        a aVar = new a();
        this.f18384E0 = aVar;
        this.f18385F0 = new C1593f(fragment, aVar);
        super.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1590c.o0(this.f18380m, view);
            }
        });
        super.setOnCloseListener(new SearchView.l() { // from class: com.swmansion.rnscreens.b
            @Override // androidx.appcompat.widget.SearchView.l
            public final boolean a() {
                return C1590c.p0(this.f18381a);
            }
        });
        setMaxWidth(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(C1590c c1590c, View view) {
        w5.k.f(c1590c, "this$0");
        View.OnClickListener onClickListener = c1590c.f18383D0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        c1590c.f18385F0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p0(C1590c c1590c) {
        w5.k.f(c1590c, "this$0");
        SearchView.l lVar = c1590c.f18382C0;
        boolean zA = lVar != null ? lVar.a() : false;
        c1590c.f18385F0.c();
        return zA;
    }

    public final boolean getOverrideBackAction() {
        return this.f18385F0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (L()) {
            return;
        }
        this.f18385F0.b();
    }

    @Override // androidx.appcompat.widget.SearchView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18385F0.c();
    }

    public final void q0() {
        d0("", false);
    }

    public final void r0() {
        setIconified(false);
        requestFocusFromTouch();
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnCloseListener(SearchView.l lVar) {
        this.f18382C0 = lVar;
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f18383D0 = onClickListener;
    }

    public final void setOverrideBackAction(boolean z6) {
        this.f18385F0.d(z6);
    }

    public final void setText(String str) {
        w5.k.f(str, "text");
        d0(str, false);
    }
}
