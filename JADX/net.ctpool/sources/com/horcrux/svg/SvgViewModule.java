package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import i2.InterfaceC1741a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "RNSVGSvgViewModule")
class SvgViewModule extends NativeSvgViewModuleSpec {
    public static final String NAME = "RNSVGSvgViewModule";

    class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f17849m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ ReadableMap f17850n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Callback f17851o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f17852p;

        /* JADX INFO: renamed from: com.horcrux.svg.SvgViewModule$a$a, reason: collision with other inner class name */
        class RunnableC0238a implements Runnable {

            /* JADX INFO: renamed from: com.horcrux.svg.SvgViewModule$a$a$a, reason: collision with other inner class name */
            class RunnableC0239a implements Runnable {
                RunnableC0239a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    SvgViewModule.toDataURL(aVar.f17849m, aVar.f17850n, aVar.f17851o, aVar.f17852p + 1);
                }
            }

            RunnableC0238a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(a.this.f17849m);
                if (svgViewByTag == null) {
                    return;
                }
                svgViewByTag.setToDataUrlTask(new RunnableC0239a());
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                SvgViewModule.toDataURL(aVar.f17849m, aVar.f17850n, aVar.f17851o, aVar.f17852p + 1);
            }
        }

        a(int i7, ReadableMap readableMap, Callback callback, int i8) {
            this.f17849m = i7;
            this.f17850n = readableMap;
            this.f17851o = callback;
            this.f17852p = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.f17849m);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.f17849m, new RunnableC0238a());
                return;
            }
            if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new b());
                return;
            }
            ReadableMap readableMap = this.f17850n;
            if (readableMap != null) {
                this.f17851o.invoke(svgViewByTag.toDataURL(readableMap.getInt("width"), this.f17850n.getInt("height")));
            } else {
                this.f17851o.invoke(svgViewByTag.toDataURL());
            }
        }
    }

    SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toDataURL(int i7, ReadableMap readableMap, Callback callback, int i8) {
        UiThreadUtil.runOnUiThread(new a(i7, readableMap, callback, i8));
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGSvgViewModule";
    }

    @Override // com.horcrux.svg.NativeSvgViewModuleSpec
    @ReactMethod
    public void toDataURL(Double d7, ReadableMap readableMap, Callback callback) {
        toDataURL(d7.intValue(), readableMap, callback, 0);
    }
}
