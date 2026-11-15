package G0;

import P3.AbstractC0451c;
import P3.C0449a;
import P3.InterfaceC0450b;
import android.app.Activity;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.PromiseImpl;
import com.facebook.react.bridge.ReactApplicationContext;
import i5.u;
import j5.AbstractC1803h;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import w5.k;
import w5.l;
import z3.AbstractC2272l;
import z3.InterfaceC2267g;
import z3.InterfaceC2268h;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0450b f1144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicReference f1145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f1146c;

    static final class a extends l implements v5.l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Promise f1148n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Promise promise) {
            super(1);
            this.f1148n = promise;
        }

        public final void a(C0449a c0449a) {
            int iB = c0449a.b();
            boolean z6 = iB == 2 || iB == 3;
            if (z6) {
                d.this.f1145b.set(c0449a);
            }
            this.f1148n.resolve(Boolean.valueOf(z6));
        }

        @Override // v5.l
        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((C0449a) obj);
            return u.f19985a;
        }
    }

    public d(ReactApplicationContext reactApplicationContext) {
        k.f(reactApplicationContext, "context");
        InterfaceC0450b interfaceC0450bA = AbstractC0451c.a(reactApplicationContext);
        k.e(interfaceC0450bA, "create(...)");
        this.f1144a = interfaceC0450bA;
        this.f1145b = new AtomicReference();
        this.f1146c = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(d dVar, Activity activity, Object[] objArr) {
        k.f(dVar, "this$0");
        k.f(activity, "$activity");
        k.f(objArr, "args");
        if (k.b(AbstractC1803h.r(objArr), Boolean.TRUE)) {
            try {
                dVar.k(activity);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(v5.l lVar, Object obj) {
        k.f(lVar, "$tmp0");
        lVar.i(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Promise promise, Exception exc) {
        k.f(promise, "$promise");
        k.f(exc, "it");
        promise.reject(exc);
    }

    private final boolean k(Activity activity) {
        C0449a c0449a = (C0449a) this.f1145b.getAndSet(null);
        if (c0449a == null) {
            return false;
        }
        return this.f1144a.a(c0449a, 1, activity, 101);
    }

    public final void e(final Activity activity, int i7, int i8) {
        k.f(activity, "activity");
        if (i7 == 101 && i8 == 0 && this.f1146c.get()) {
            g(new PromiseImpl(new Callback() { // from class: G0.a
                @Override // com.facebook.react.bridge.Callback
                public final void invoke(Object[] objArr) {
                    d.f(this.f1140a, activity, objArr);
                }
            }, null));
        }
    }

    public final void g(final Promise promise) {
        k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        this.f1145b.set(null);
        AbstractC2272l abstractC2272lB = this.f1144a.b();
        k.e(abstractC2272lB, "getAppUpdateInfo(...)");
        final a aVar = new a(promise);
        abstractC2272lB.g(new InterfaceC2268h() { // from class: G0.b
            @Override // z3.InterfaceC2268h
            public final void b(Object obj) {
                d.h(aVar, obj);
            }
        });
        abstractC2272lB.e(new InterfaceC2267g() { // from class: G0.c
            @Override // z3.InterfaceC2267g
            public final void c(Exception exc) {
                d.i(promise, exc);
            }
        });
    }

    public final boolean j(boolean z6, Activity activity) {
        k.f(activity, "activity");
        this.f1146c.set(z6);
        return k(activity);
    }
}
