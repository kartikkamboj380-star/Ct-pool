package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import c2.InterfaceC0711a;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.devsupport.f0;
import m2.InterfaceC1871b;

/* JADX INFO: renamed from: com.facebook.react.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0916x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f13262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private X f13263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f13264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f13265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.facebook.react.devsupport.I f13266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private L f13267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC0917y f13268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC0711a f13269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f13270i;

    public C0916x(Activity activity, InterfaceC0917y interfaceC0917y, String str, Bundle bundle) {
        this.f13270i = ReactFeatureFlags.enableFabricRenderer;
        this.f13262a = activity;
        this.f13264c = str;
        this.f13265d = bundle;
        this.f13266e = new com.facebook.react.devsupport.I();
        this.f13268g = interfaceC0917y;
    }

    private X1.e b() {
        InterfaceC0917y interfaceC0917y;
        if (ReactFeatureFlags.enableBridgelessArchitecture && (interfaceC0917y = this.f13268g) != null && interfaceC0917y.f() != null) {
            return this.f13268g.f();
        }
        if (!d().v() || d().o() == null) {
            return null;
        }
        return d().o().D();
    }

    private L d() {
        return this.f13267f;
    }

    protected X a() {
        X x6 = new X(this.f13262a);
        x6.setIsFabric(f());
        return x6;
    }

    public H c() {
        return d().o();
    }

    public X e() {
        return ReactFeatureFlags.enableBridgelessArchitecture ? (X) this.f13269h.a() : this.f13263b;
    }

    protected boolean f() {
        return this.f13270i;
    }

    public void g(String str) {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            if (this.f13269h == null) {
                InterfaceC0711a interfaceC0711aA = this.f13268g.a(this.f13262a, str, this.f13265d);
                this.f13269h = interfaceC0711aA;
                this.f13262a.setContentView(interfaceC0711aA.a());
            }
            this.f13269h.start();
            return;
        }
        if (this.f13263b != null) {
            throw new IllegalStateException("Cannot loadApp while app is already running.");
        }
        X xA = a();
        this.f13263b = xA;
        xA.u(d().o(), str, this.f13265d);
    }

    public void h(int i7, int i8, Intent intent, boolean z6) {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f13268g.onActivityResult(this.f13262a, i7, i8, intent);
        } else if (d().v() && z6) {
            d().o().X(this.f13262a, i7, i8, intent);
        }
    }

    public boolean i() {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f13268g.g();
            return true;
        }
        if (!d().v()) {
            return false;
        }
        d().o().Y();
        return true;
    }

    public void j(Configuration configuration) {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f13268g.c((Context) O1.a.c(this.f13262a));
        } else if (d().v()) {
            c().Z((Context) O1.a.c(this.f13262a), configuration);
        }
    }

    public void k() {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            InterfaceC0711a interfaceC0711a = this.f13269h;
            if (interfaceC0711a != null) {
                interfaceC0711a.stop();
                this.f13269h = null;
            }
            this.f13268g.e(this.f13262a);
            return;
        }
        X x6 = this.f13263b;
        if (x6 != null) {
            x6.v();
            this.f13263b = null;
        }
        if (d().v()) {
            d().o().b0(this.f13262a);
        }
    }

    public void l() {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f13268g.d(this.f13262a);
        } else if (d().v()) {
            d().o().d0(this.f13262a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void m() {
        Activity activity = this.f13262a;
        if (!(activity instanceof InterfaceC1871b)) {
            throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
        }
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f13268g.b(activity, (InterfaceC1871b) activity);
        } else if (d().v()) {
            H hO = d().o();
            Activity activity2 = this.f13262a;
            hO.f0(activity2, (InterfaceC1871b) activity2);
        }
    }

    public boolean n(int i7, KeyEvent keyEvent) {
        InterfaceC0917y interfaceC0917y;
        if (i7 != 90) {
            return false;
        }
        if ((!ReactFeatureFlags.enableBridgelessArchitecture || (interfaceC0917y = this.f13268g) == null || interfaceC0917y.f() == null) && !(d().v() && d().u())) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean o(int i7) {
        InterfaceC0917y interfaceC0917y;
        if (i7 != 90) {
            return false;
        }
        if (!ReactFeatureFlags.enableBridgelessArchitecture || (interfaceC0917y = this.f13268g) == null) {
            if (!d().v() || !d().u()) {
                return false;
            }
            d().o().s0();
            return true;
        }
        X1.e eVarF = interfaceC0917y.f();
        if (eVarF == null || (eVarF instanceof f0)) {
            return false;
        }
        eVarF.C();
        return true;
    }

    public boolean p(Intent intent) {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f13268g.onNewIntent(intent);
            return true;
        }
        if (!d().v()) {
            return false;
        }
        d().o().h0(intent);
        return true;
    }

    public void q(boolean z6) {
        if (ReactFeatureFlags.enableBridgelessArchitecture) {
            this.f13268g.onWindowFocusChange(z6);
        } else if (d().v()) {
            d().o().i0(z6);
        }
    }

    public boolean r(int i7, KeyEvent keyEvent) {
        X1.e eVarB = b();
        if (eVarB != null && !(eVarB instanceof f0)) {
            if (i7 == 82) {
                eVarB.C();
                return true;
            }
            if (((com.facebook.react.devsupport.I) O1.a.c(this.f13266e)).b(i7, this.f13262a.getCurrentFocus())) {
                eVarB.q();
                return true;
            }
        }
        return false;
    }

    public C0916x(Activity activity, L l7, String str, Bundle bundle, boolean z6) {
        boolean z7 = ReactFeatureFlags.useTurboModules;
        this.f13270i = z6;
        this.f13262a = activity;
        this.f13264c = str;
        this.f13265d = bundle;
        this.f13266e = new com.facebook.react.devsupport.I();
        this.f13267f = l7;
    }
}
