package e5;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Window;

/* JADX INFO: renamed from: e5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogC1633d extends Dialog {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f19218m;

    /* JADX INFO: renamed from: e5.d$a */
    class a implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Runnable f19219m;

        a(Runnable runnable) {
            this.f19219m = runnable;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            this.f19219m.run();
        }
    }

    /* JADX INFO: renamed from: e5.d$b */
    class b implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f19221a;

        b(Runnable runnable) {
            this.f19221a = runnable;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.f19221a.run();
        }
    }

    public DialogC1633d(Activity activity, int i7, boolean z6) {
        super(activity, i7);
        this.f19218m = z6;
        setOwnerActivity(activity);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    public void a(Runnable runnable) {
        if (!isShowing()) {
            runnable.run();
            return;
        }
        setOnDismissListener(new a(runnable));
        try {
            super.dismiss();
        } catch (Exception unused) {
            runnable.run();
        }
    }

    public void b(Runnable runnable) {
        if (isShowing()) {
            runnable.run();
            return;
        }
        setOnShowListener(new b(runnable));
        try {
            super.show();
        } catch (Exception unused) {
            runnable.run();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (isShowing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null) {
            ownerActivity.moveTaskToBack(true);
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            window.setWindowAnimations(this.f19218m ? AbstractC1632c.f19216a : AbstractC1632c.f19217b);
            if (com.zoontek.rnbootsplash.b.o()) {
                window.setBackgroundDrawableResource(AbstractC1631b.f19215a);
            }
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Dialog
    public void show() {
        if (isShowing()) {
            return;
        }
        try {
            super.show();
        } catch (Exception unused) {
        }
    }
}
