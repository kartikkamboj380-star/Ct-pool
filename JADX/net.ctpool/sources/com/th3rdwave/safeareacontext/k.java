package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.InterfaceC0870d0;
import com.facebook.react.uimanager.UIManagerModule;
import i5.u;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import w5.s;

/* JADX INFO: loaded from: classes.dex */
public final class k extends com.facebook.react.views.view.i implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private o f18602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a f18603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m f18604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f18605p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private InterfaceC0870d0 f18606q;

    public k(Context context) {
        super(context);
        this.f18602m = o.f18619m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View s() {
        for (ViewParent parent = getParent(); parent != 0; parent = parent.getParent()) {
            if (parent instanceof f) {
                return (View) parent;
            }
        }
        return this;
    }

    private final boolean t() {
        a aVarE;
        View view = this.f18605p;
        if (view == null || (aVarE = h.e(view)) == null || w5.k.b(this.f18603n, aVarE)) {
            return false;
        }
        this.f18603n = aVarE;
        u();
        return true;
    }

    private final void u() {
        a aVar = this.f18603n;
        if (aVar != null) {
            m mVar = this.f18604o;
            if (mVar == null) {
                l lVar = l.f18608n;
                mVar = new m(lVar, lVar, lVar, lVar);
            }
            InterfaceC0870d0 stateWrapper = getStateWrapper();
            if (stateWrapper != null) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putMap("insets", q.b(aVar));
                stateWrapper.a(writableMapCreateMap);
                return;
            }
            n nVar = new n(aVar, this.f18602m, mVar);
            ReactContext reactContextA = r.a(this);
            final UIManagerModule uIManagerModule = (UIManagerModule) reactContextA.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), nVar);
                reactContextA.runOnNativeModulesQueueThread(new Runnable() { // from class: com.th3rdwave.safeareacontext.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.v(uIManagerModule);
                    }
                });
                w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(UIManagerModule uIManagerModule) {
        uIManagerModule.getUIImplementation().m(-1);
    }

    private final void w() {
        final s sVar = new s();
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        long jNanoTime = System.nanoTime();
        r.a(this).runOnNativeModulesQueueThread(new Runnable() { // from class: com.th3rdwave.safeareacontext.j
            @Override // java.lang.Runnable
            public final void run() {
                k.x(reentrantLock, sVar, conditionNewCondition);
            }
        });
        reentrantLock.lock();
        long jNanoTime2 = 0;
        while (!sVar.f22737m && jNanoTime2 < 500000000) {
            try {
                try {
                    conditionNewCondition.awaitNanos(500000000L);
                } catch (InterruptedException unused) {
                    sVar.f22737m = true;
                }
                jNanoTime2 += System.nanoTime() - jNanoTime;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        u uVar = u.f19985a;
        reentrantLock.unlock();
        if (jNanoTime2 >= 500000000) {
            Log.w("SafeAreaView", "Timed out waiting for layout.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(ReentrantLock reentrantLock, s sVar, Condition condition) {
        w5.k.f(reentrantLock, "$lock");
        w5.k.f(sVar, "$done");
        reentrantLock.lock();
        try {
            if (!sVar.f22737m) {
                sVar.f22737m = true;
                condition.signal();
            }
            u uVar = u.f19985a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final InterfaceC0870d0 getStateWrapper() {
        return this.f18606q;
    }

    @Override // com.facebook.react.views.view.i, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onAttachedToWindow();
        View viewS = s();
        this.f18605p = viewS;
        if (viewS != null && (viewTreeObserver = viewS.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(this);
        }
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        View view = this.f18605p;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.f18605p = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean zT = t();
        if (zT) {
            requestLayout();
        }
        return !zT;
    }

    public final void setEdges(m mVar) {
        w5.k.f(mVar, "edges");
        this.f18604o = mVar;
        u();
    }

    public final void setMode(o oVar) {
        w5.k.f(oVar, "mode");
        this.f18602m = oVar;
        u();
    }

    public final void setStateWrapper(InterfaceC0870d0 interfaceC0870d0) {
        this.f18606q = interfaceC0870d0;
    }
}
