package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC0522b;
import androidx.appcompat.view.menu.m;
import e.AbstractC1615g;

/* JADX INFO: loaded from: classes.dex */
class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g f5460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private DialogInterfaceC0522b f5461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    e f5462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private m.a f5463p;

    public h(g gVar) {
        this.f5460m = gVar;
    }

    public void a() {
        DialogInterfaceC0522b dialogInterfaceC0522b = this.f5461n;
        if (dialogInterfaceC0522b != null) {
            dialogInterfaceC0522b.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        g gVar = this.f5460m;
        DialogInterfaceC0522b.a aVar = new DialogInterfaceC0522b.a(gVar.u());
        e eVar = new e(aVar.b(), AbstractC1615g.f18872j);
        this.f5462o = eVar;
        eVar.h(this);
        this.f5460m.b(this.f5462o);
        aVar.c(this.f5462o.a(), this);
        View viewY = gVar.y();
        if (viewY != null) {
            aVar.d(viewY);
        } else {
            aVar.e(gVar.w()).m(gVar.x());
        }
        aVar.j(this);
        DialogInterfaceC0522b dialogInterfaceC0522bA = aVar.a();
        this.f5461n = dialogInterfaceC0522bA;
        dialogInterfaceC0522bA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f5461n.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f5461n.show();
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void c(g gVar, boolean z6) {
        if (z6 || gVar == this.f5460m) {
            a();
        }
        m.a aVar = this.f5463p;
        if (aVar != null) {
            aVar.c(gVar, z6);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean d(g gVar) {
        m.a aVar = this.f5463p;
        if (aVar != null) {
            return aVar.d(gVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i7) {
        this.f5460m.L((i) this.f5462o.a().getItem(i7), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f5462o.c(this.f5460m, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i7, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i7 == 82 || i7 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f5461n.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f5461n.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f5460m.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f5460m.performShortcut(i7, keyEvent, 0);
    }
}
