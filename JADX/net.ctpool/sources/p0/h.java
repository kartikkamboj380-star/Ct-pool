package p0;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import i5.u;
import j5.AbstractC1809n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import n0.InterfaceC1891a;
import s0.InterfaceC2034b;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2034b f21513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f21514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f21515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f21516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f21517e;

    protected h(Context context, InterfaceC2034b interfaceC2034b) {
        w5.k.f(context, "context");
        w5.k.f(interfaceC2034b, "taskExecutor");
        this.f21513a = interfaceC2034b;
        Context applicationContext = context.getApplicationContext();
        w5.k.e(applicationContext, "context.applicationContext");
        this.f21514b = applicationContext;
        this.f21515c = new Object();
        this.f21516d = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List list, h hVar) {
        w5.k.f(list, "$listenersList");
        w5.k.f(hVar, "this$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC1891a) it.next()).a(hVar.f21517e);
        }
    }

    public final void c(InterfaceC1891a interfaceC1891a) {
        w5.k.f(interfaceC1891a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f21515c) {
            try {
                if (this.f21516d.add(interfaceC1891a)) {
                    if (this.f21516d.size() == 1) {
                        this.f21517e = e();
                        l0.i.e().a(i.f21518a, getClass().getSimpleName() + ": initial state = " + this.f21517e);
                        h();
                    }
                    interfaceC1891a.a(this.f21517e);
                }
                u uVar = u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected final Context d() {
        return this.f21514b;
    }

    public abstract Object e();

    public final void f(InterfaceC1891a interfaceC1891a) {
        w5.k.f(interfaceC1891a, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this.f21515c) {
            try {
                if (this.f21516d.remove(interfaceC1891a) && this.f21516d.isEmpty()) {
                    i();
                }
                u uVar = u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.f21515c) {
            Object obj2 = this.f21517e;
            if (obj2 == null || !w5.k.b(obj2, obj)) {
                this.f21517e = obj;
                final List listB0 = AbstractC1809n.b0(this.f21516d);
                this.f21513a.a().execute(new Runnable() { // from class: p0.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b(listB0, this);
                    }
                });
                u uVar = u.f19985a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
