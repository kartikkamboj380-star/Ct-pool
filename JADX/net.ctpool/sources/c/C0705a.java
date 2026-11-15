package c;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: c.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0705a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f9959a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f9960b;

    public void a(InterfaceC0706b interfaceC0706b) {
        if (this.f9960b != null) {
            interfaceC0706b.a(this.f9960b);
        }
        this.f9959a.add(interfaceC0706b);
    }

    public void b() {
        this.f9960b = null;
    }

    public void c(Context context) {
        this.f9960b = context;
        Iterator it = this.f9959a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0706b) it.next()).a(context);
        }
    }
}
