package p0;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.InterfaceC2034b;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f21524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1960c f21525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f21526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f21527d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Context context, InterfaceC2034b interfaceC2034b) {
        this(context, interfaceC2034b, null, null, null, null, 60, null);
        w5.k.f(context, "context");
        w5.k.f(interfaceC2034b, "taskExecutor");
    }

    public final h a() {
        return this.f21524a;
    }

    public final C1960c b() {
        return this.f21525b;
    }

    public final h c() {
        return this.f21526c;
    }

    public final h d() {
        return this.f21527d;
    }

    public n(Context context, InterfaceC2034b interfaceC2034b, h hVar, C1960c c1960c, h hVar2, h hVar3) {
        w5.k.f(context, "context");
        w5.k.f(interfaceC2034b, "taskExecutor");
        w5.k.f(hVar, "batteryChargingTracker");
        w5.k.f(c1960c, "batteryNotLowTracker");
        w5.k.f(hVar2, "networkStateTracker");
        w5.k.f(hVar3, "storageNotLowTracker");
        this.f21524a = hVar;
        this.f21525b = c1960c;
        this.f21526c = hVar2;
        this.f21527d = hVar3;
    }

    public /* synthetic */ n(Context context, InterfaceC2034b interfaceC2034b, h hVar, C1960c c1960c, h hVar2, h hVar3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        h c1958a;
        C1960c c1960c2;
        h hVarA;
        h lVar;
        if ((i7 & 4) != 0) {
            Context applicationContext = context.getApplicationContext();
            w5.k.e(applicationContext, "context.applicationContext");
            c1958a = new C1958a(applicationContext, interfaceC2034b);
        } else {
            c1958a = hVar;
        }
        if ((i7 & 8) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            w5.k.e(applicationContext2, "context.applicationContext");
            c1960c2 = new C1960c(applicationContext2, interfaceC2034b);
        } else {
            c1960c2 = c1960c;
        }
        if ((i7 & 16) != 0) {
            Context applicationContext3 = context.getApplicationContext();
            w5.k.e(applicationContext3, "context.applicationContext");
            hVarA = k.a(applicationContext3, interfaceC2034b);
        } else {
            hVarA = hVar2;
        }
        if ((i7 & 32) != 0) {
            Context applicationContext4 = context.getApplicationContext();
            w5.k.e(applicationContext4, "context.applicationContext");
            lVar = new l(applicationContext4, interfaceC2034b);
        } else {
            lVar = hVar3;
        }
        this(context, interfaceC2034b, c1958a, c1960c2, hVarA, lVar);
    }
}
