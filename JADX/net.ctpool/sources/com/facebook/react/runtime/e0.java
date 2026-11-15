package com.facebook.react.runtime;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import b2.InterfaceC0675a;
import c2.InterfaceC0711a;
import c2.InterfaceC0712b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.SurfaceHandlerBinding;
import java.util.concurrent.atomic.AtomicReference;
import u2.C2131f;

/* JADX INFO: loaded from: classes.dex */
public class e0 implements InterfaceC0711a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f12177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f12178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0712b f12179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f12180d;

    public e0(Context context, String str, Bundle bundle) {
        this(new SurfaceHandlerBinding(str), context);
        this.f12179c.b(bundle == null ? new WritableNativeMap() : (NativeMap) Arguments.fromBundle(bundle));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f12179c.e(View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE), 0, 0, g(context), p(context), k(context));
    }

    public static e0 f(Context context, String str, Bundle bundle) {
        e0 e0Var = new e0(context, str, bundle);
        e0Var.d(new f0(context, e0Var));
        return e0Var;
    }

    private static boolean g(Context context) {
        return com.facebook.react.modules.i18nmanager.a.f().d(context);
    }

    private static float k(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    private static boolean p(Context context) {
        return com.facebook.react.modules.i18nmanager.a.f().i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        f0 f0Var = (f0) a();
        if (f0Var != null) {
            f0Var.removeAllViews();
            f0Var.setId(-1);
        }
    }

    @Override // c2.InterfaceC0711a
    public ViewGroup a() {
        return (ViewGroup) this.f12177a.get();
    }

    public void c(ReactHostImpl reactHostImpl) {
        if (!com.facebook.jni.a.a(this.f12178b, null, reactHostImpl)) {
            throw new IllegalStateException("This surface is already attached to a host!");
        }
    }

    public void d(f0 f0Var) {
        if (!com.facebook.jni.a.a(this.f12177a, null, f0Var)) {
            throw new IllegalStateException("Trying to call ReactSurface.attachView(), but the view is already attached.");
        }
        this.f12180d = f0Var.getContext();
    }

    public void e() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.runtime.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12175m.r();
            }
        });
    }

    public Context h() {
        return this.f12180d;
    }

    com.facebook.react.uimanager.events.e i() {
        ReactHostImpl reactHostImpl = (ReactHostImpl) this.f12178b.get();
        if (reactHostImpl == null) {
            return null;
        }
        return reactHostImpl.k0();
    }

    public String j() {
        return this.f12179c.d();
    }

    ReactHostImpl l() {
        return (ReactHostImpl) this.f12178b.get();
    }

    InterfaceC0712b m() {
        return this.f12179c;
    }

    public int n() {
        return this.f12179c.getSurfaceId();
    }

    boolean o() {
        return this.f12178b.get() != null;
    }

    public boolean q() {
        return this.f12179c.isRunning();
    }

    synchronized void s(int i7, int i8, int i9, int i10) {
        this.f12179c.e(i7, i8, i9, i10, g(this.f12180d), p(this.f12180d), k(this.f12180d));
    }

    @Override // c2.InterfaceC0711a
    public InterfaceC0675a start() {
        IllegalStateException illegalStateException;
        if (this.f12177a.get() == null) {
            illegalStateException = new IllegalStateException("Trying to call ReactSurface.start(), but view is not created.");
        } else {
            ReactHostImpl reactHostImpl = (ReactHostImpl) this.f12178b.get();
            if (reactHostImpl != null) {
                return reactHostImpl.E1(this);
            }
            illegalStateException = new IllegalStateException("Trying to call ReactSurface.start(), but no ReactHost is attached.");
        }
        return C2131f.l(illegalStateException);
    }

    @Override // c2.InterfaceC0711a
    public InterfaceC0675a stop() {
        ReactHostImpl reactHostImpl = (ReactHostImpl) this.f12178b.get();
        return reactHostImpl == null ? C2131f.l(new IllegalStateException("Trying to call ReactSurface.stop(), but no ReactHost is attached.")) : reactHostImpl.G1(this);
    }

    e0(InterfaceC0712b interfaceC0712b, Context context) {
        this.f12177a = new AtomicReference(null);
        this.f12178b = new AtomicReference(null);
        this.f12179c = interfaceC0712b;
        this.f12180d = context;
    }
}
