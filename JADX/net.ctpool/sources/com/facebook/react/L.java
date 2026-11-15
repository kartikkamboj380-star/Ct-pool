package com.facebook.react;

import android.app.Application;
import com.facebook.react.T;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f11124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H f11125b;

    class a implements S1.j {
        a() {
        }

        @Override // S1.j
        public S1.i c(String str) {
            return null;
        }
    }

    protected L(Application application) {
        this.f11124a = application;
    }

    protected H a() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        K kB = b();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return kB.b();
    }

    protected K b() {
        K kP = H.t().d(this.f11124a).n(j()).w(u()).h(f()).g(e()).t(r()).u(s()).m(i()).p(l());
        q();
        K kQ = kP.s(null).o(k()).v(t()).i(LifecycleState.f11399m).r(p()).l(h()).f(d()).q(n());
        Iterator it = m().iterator();
        while (it.hasNext()) {
            kQ.a((M) it.next());
        }
        String strG = g();
        if (strG != null) {
            kQ.j(strG);
        } else {
            kQ.e((String) O1.a.c(c()));
        }
        return kQ;
    }

    protected String c() {
        return "index.android.bundle";
    }

    protected d2.b d() {
        return null;
    }

    protected X1.c e() {
        return null;
    }

    protected com.facebook.react.devsupport.F f() {
        return null;
    }

    protected String g() {
        return null;
    }

    protected abstract EnumC0826i h();

    protected JSExceptionHandler i() {
        return null;
    }

    protected abstract String j();

    protected JavaScriptExecutorFactory k() {
        return null;
    }

    public boolean l() {
        return false;
    }

    protected abstract List m();

    protected X1.h n() {
        return null;
    }

    public H o() {
        if (this.f11125b == null) {
            ReactMarker.logMarker(ReactMarkerConstants.INIT_REACT_RUNTIME_START);
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
            this.f11125b = a();
            ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
        }
        return this.f11125b;
    }

    protected abstract T.a p();

    protected X1.i q() {
        return null;
    }

    public boolean r() {
        return true;
    }

    public S1.j s() {
        return new a();
    }

    protected abstract UIManagerProvider t();

    public abstract boolean u();

    public boolean v() {
        return this.f11125b != null;
    }
}
