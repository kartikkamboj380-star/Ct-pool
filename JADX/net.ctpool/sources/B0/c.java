package B0;

import A0.f;
import A0.g;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e;
import i5.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v5.l;
import w5.i;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"SetJavaScriptEnabled"})
public final class c extends DialogInterfaceOnCancelListenerC0635e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f662o = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g.a f663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f664n;

    public static final class a {
        private a() {
        }

        public final c a(g.a aVar) {
            k.f(aVar, "authenticationAttempt");
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putParcelable("authenticationAttempt", aVar);
            cVar.setArguments(bundle);
            return cVar;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* synthetic */ class b extends i implements l {
        b(Object obj) {
            super(1, obj, c.class, "onCallback", "onCallback(Lcom/RNAppleAuthentication/SignInWithAppleResult;)V", 0);
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            l((f) obj);
            return u.f19985a;
        }

        public final void l(f fVar) {
            k.f(fVar, "p0");
            ((c) this.f22718n).x(fVar);
        }
    }

    private final WebView w() {
        View view = getView();
        if (view instanceof WebView) {
            return (WebView) view;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(f fVar) {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        l lVar = this.f664n;
        if (lVar == null) {
            return;
        }
        lVar.i(fVar);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        k.f(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        x(f.a.f49a);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        g.a aVar = arguments != null ? (g.a) arguments.getParcelable("authenticationAttempt") : null;
        k.c(aVar);
        this.f663m = aVar;
        setStyle(0, A0.c.f47a);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k.f(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        WebView webView = new WebView(requireContext());
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        g.a aVar = this.f663m;
        g.a aVar2 = null;
        if (aVar == null) {
            k.t("authenticationAttempt");
            aVar = null;
        }
        webView.addJavascriptInterface(new A0.b(aVar.c(), new b(this)), "FormInterceptorInterface");
        g.a aVar3 = this.f663m;
        if (aVar3 == null) {
            k.t("authenticationAttempt");
            aVar3 = null;
        }
        webView.setWebViewClient(new B0.b(aVar3, A0.b.f43c.a()));
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("webView");
            if (bundle2 != null) {
                webView.restoreState(bundle2);
            }
        } else {
            g.a aVar4 = this.f663m;
            if (aVar4 == null) {
                k.t("authenticationAttempt");
            } else {
                aVar2 = aVar4;
            }
            webView.loadUrl(aVar2.a());
        }
        return webView;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        k.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = new Bundle();
        WebView webViewW = w();
        if (webViewW != null) {
            webViewW.saveState(bundle2);
        }
        u uVar = u.f19985a;
        bundle.putBundle("webView", bundle2);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0635e, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    public final void v(l lVar) {
        k.f(lVar, "callback");
        this.f664n = lVar;
    }
}
