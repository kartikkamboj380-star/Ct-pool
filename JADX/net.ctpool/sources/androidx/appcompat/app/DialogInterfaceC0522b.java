package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import e.AbstractC1609a;

/* JADX INFO: renamed from: androidx.appcompat.app.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceC0522b extends q implements DialogInterface {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final AlertController f5078q;

    /* JADX INFO: renamed from: androidx.appcompat.app.b$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.b f5079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f5080b;

        public a(Context context) {
            this(context, DialogInterfaceC0522b.m(context, 0));
        }

        public DialogInterfaceC0522b a() {
            DialogInterfaceC0522b dialogInterfaceC0522b = new DialogInterfaceC0522b(this.f5079a.f4993a, this.f5080b);
            this.f5079a.a(dialogInterfaceC0522b.f5078q);
            dialogInterfaceC0522b.setCancelable(this.f5079a.f5010r);
            if (this.f5079a.f5010r) {
                dialogInterfaceC0522b.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0522b.setOnCancelListener(this.f5079a.f5011s);
            dialogInterfaceC0522b.setOnDismissListener(this.f5079a.f5012t);
            DialogInterface.OnKeyListener onKeyListener = this.f5079a.f5013u;
            if (onKeyListener != null) {
                dialogInterfaceC0522b.setOnKeyListener(onKeyListener);
            }
            return dialogInterfaceC0522b;
        }

        public Context b() {
            return this.f5079a.f4993a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f5079a;
            bVar.f5015w = listAdapter;
            bVar.f5016x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f5079a.f4999g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f5079a.f4996d = drawable;
            return this;
        }

        public a f(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f5079a;
            bVar.f5014v = charSequenceArr;
            bVar.f5016x = onClickListener;
            return this;
        }

        public a g(CharSequence charSequence) {
            this.f5079a.f5000h = charSequence;
            return this;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f5079a;
            bVar.f5004l = charSequence;
            bVar.f5006n = onClickListener;
            return this;
        }

        public a i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f5079a;
            bVar.f5007o = charSequence;
            bVar.f5009q = onClickListener;
            return this;
        }

        public a j(DialogInterface.OnKeyListener onKeyListener) {
            this.f5079a.f5013u = onKeyListener;
            return this;
        }

        public a k(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f5079a;
            bVar.f5001i = charSequence;
            bVar.f5003k = onClickListener;
            return this;
        }

        public a l(ListAdapter listAdapter, int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f5079a;
            bVar.f5015w = listAdapter;
            bVar.f5016x = onClickListener;
            bVar.f4986I = i7;
            bVar.f4985H = true;
            return this;
        }

        public a m(CharSequence charSequence) {
            this.f5079a.f4998f = charSequence;
            return this;
        }

        public a(Context context, int i7) {
            this.f5079a = new AlertController.b(new ContextThemeWrapper(context, DialogInterfaceC0522b.m(context, i7)));
            this.f5080b = i7;
        }
    }

    protected DialogInterfaceC0522b(Context context, int i7) {
        super(context, m(context, i7));
        this.f5078q = new AlertController(getContext(), this, getWindow());
    }

    static int m(Context context, int i7) {
        if (((i7 >>> 24) & 255) >= 1) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC1609a.f18739l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView l() {
        return this.f5078q.d();
    }

    @Override // androidx.appcompat.app.q, androidx.activity.g, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5078q.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.f5078q.f(i7, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (this.f5078q.g(i7, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i7, keyEvent);
    }

    @Override // androidx.appcompat.app.q, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f5078q.p(charSequence);
    }
}
