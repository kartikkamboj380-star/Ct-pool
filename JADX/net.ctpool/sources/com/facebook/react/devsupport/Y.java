package com.facebook.react.devsupport;

import X1.e;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.facebook.react.AbstractC0830m;
import com.facebook.react.AbstractC0831n;
import com.facebook.react.AbstractC0833p;
import com.facebook.react.bridge.UiThreadUtil;

/* JADX INFO: loaded from: classes.dex */
class Y implements X1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.core.util.h f11563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Dialog f11564b;

    public Y(androidx.core.util.h hVar) {
        this.f11563a = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        Dialog dialog = this.f11564b;
        if (dialog != null) {
            dialog.dismiss();
            this.f11564b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(String str, final e.a aVar) {
        Dialog dialog = this.f11564b;
        if (dialog != null) {
            dialog.dismiss();
        }
        Context context = (Context) this.f11563a.get();
        if (context == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(AbstractC0833p.f12000c, (ViewGroup) null);
        Dialog dialog2 = new Dialog(context);
        this.f11564b = dialog2;
        dialog2.setContentView(viewInflate);
        this.f11564b.setCancelable(false);
        ((TextView) O1.a.c((TextView) viewInflate.findViewById(AbstractC0831n.f11985o))).setText(str);
        ((View) O1.a.c(viewInflate.findViewById(AbstractC0831n.f11988r))).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aVar.a();
            }
        });
        Window window = this.f11564b.getWindow();
        if (window != null) {
            window.setGravity(48);
            window.setBackgroundDrawableResource(AbstractC0830m.f11792a);
        }
        this.f11564b.show();
    }

    @Override // X1.h
    public void g() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.W
            @Override // java.lang.Runnable
            public final void run() {
                this.f11561m.d();
            }
        });
    }

    @Override // X1.h
    public void i(final String str, final e.a aVar) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.V
            @Override // java.lang.Runnable
            public final void run() {
                this.f11558m.f(str, aVar);
            }
        });
    }
}
