package com.facebook.react.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.image.f;
import i2.InterfaceC1741a;
import i5.u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p2.C1962a;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = "ImageLoader")
public final class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    public static final a Companion = new a(null);
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private k _imagePipeline;
    private final Object callerContext;
    private f callerContextFactory;
    private final Object enqueuedRequestMonitor;
    private final SparseArray<Y0.c> enqueuedRequests;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b extends Y0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f11901a;

        b(Promise promise) {
            this.f11901a = promise;
        }

        @Override // Y0.b
        protected void e(Y0.c cVar) {
            w5.k.f(cVar, "dataSource");
            this.f11901a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cVar.c());
        }

        @Override // Y0.b
        protected void f(Y0.c cVar) {
            w5.k.f(cVar, "dataSource");
            if (cVar.b()) {
                S0.a aVar = (S0.a) cVar.g();
                try {
                    if (aVar == null) {
                        this.f11901a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, "Failed to get the size of the image");
                        return;
                    }
                    try {
                        Object objJ = aVar.j();
                        w5.k.e(objJ, "get(...)");
                        D1.d dVar = (D1.d) objJ;
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        w5.k.e(writableMapCreateMap, "createMap(...)");
                        writableMapCreateMap.putInt("width", dVar.getWidth());
                        writableMapCreateMap.putInt("height", dVar.getHeight());
                        this.f11901a.resolve(writableMapCreateMap);
                    } catch (Exception e7) {
                        this.f11901a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e7);
                    }
                } finally {
                    S0.a.g(aVar);
                }
            }
        }
    }

    public static final class c extends Y0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f11902a;

        c(Promise promise) {
            this.f11902a = promise;
        }

        @Override // Y0.b
        protected void e(Y0.c cVar) {
            w5.k.f(cVar, "dataSource");
            this.f11902a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cVar.c());
        }

        @Override // Y0.b
        protected void f(Y0.c cVar) {
            w5.k.f(cVar, "dataSource");
            if (cVar.b()) {
                S0.a aVar = (S0.a) cVar.g();
                try {
                    if (aVar == null) {
                        this.f11902a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, "Failed to get the size of the image");
                        return;
                    }
                    try {
                        Object objJ = aVar.j();
                        w5.k.e(objJ, "get(...)");
                        D1.d dVar = (D1.d) objJ;
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        w5.k.e(writableMapCreateMap, "createMap(...)");
                        writableMapCreateMap.putInt("width", dVar.getWidth());
                        writableMapCreateMap.putInt("height", dVar.getHeight());
                        this.f11902a.resolve(writableMapCreateMap);
                    } catch (Exception e7) {
                        this.f11902a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e7);
                    }
                } finally {
                    S0.a.g(aVar);
                }
            }
        }
    }

    public static final class d extends Y0.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f11905c;

        d(int i7, Promise promise) {
            this.f11904b = i7;
            this.f11905c = promise;
        }

        @Override // Y0.b
        protected void e(Y0.c cVar) {
            w5.k.f(cVar, "dataSource");
            try {
                ImageLoaderModule.this.removeRequest(this.f11904b);
                this.f11905c.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, cVar.c());
            } finally {
                cVar.close();
            }
        }

        @Override // Y0.b
        protected void f(Y0.c cVar) {
            w5.k.f(cVar, "dataSource");
            if (cVar.b()) {
                try {
                    try {
                        ImageLoaderModule.this.removeRequest(this.f11904b);
                        this.f11905c.resolve(Boolean.TRUE);
                    } catch (Exception e7) {
                        this.f11905c.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, e7);
                    }
                } finally {
                    cVar.close();
                }
            }
        }
    }

    public static final class e extends GuardedAsyncTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ReadableArray f11907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f11908c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ReadableArray readableArray, Promise promise, ReactApplicationContext reactApplicationContext) {
            super(reactApplicationContext);
            this.f11907b = readableArray;
            this.f11908c = promise;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void doInBackgroundGuarded(Void... voidArr) {
            String str;
            w5.k.f(voidArr, "params");
            WritableMap writableMapCreateMap = Arguments.createMap();
            w5.k.e(writableMapCreateMap, "createMap(...)");
            k imagePipeline = ImageLoaderModule.this.getImagePipeline();
            int size = this.f11907b.size();
            for (int i7 = 0; i7 < size; i7++) {
                String string = this.f11907b.getString(i7);
                if (string.length() > 0) {
                    Uri uri = Uri.parse(string);
                    if (imagePipeline.q(uri)) {
                        str = "memory";
                    } else if (imagePipeline.s(uri)) {
                        str = "disk";
                    }
                    writableMapCreateMap.putString(string, str);
                }
            }
            this.f11908c.resolve(writableMapCreateMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        w5.k.f(reactApplicationContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = this;
    }

    private final Object getCallerContext() {
        return this.callerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k getImagePipeline() {
        k kVar = this._imagePipeline;
        if (kVar != null) {
            return kVar;
        }
        k kVarA = c1.c.a();
        w5.k.e(kVarA, "getImagePipeline(...)");
        return kVarA;
    }

    private final void registerRequest(int i7, Y0.c cVar) {
        synchronized (this.enqueuedRequestMonitor) {
            this.enqueuedRequests.put(i7, cVar);
            u uVar = u.f19985a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y0.c removeRequest(int i7) {
        Y0.c cVar;
        synchronized (this.enqueuedRequestMonitor) {
            cVar = this.enqueuedRequests.get(i7);
            this.enqueuedRequests.remove(i7);
        }
        return cVar;
    }

    private final void setImagePipeline(k kVar) {
        this._imagePipeline = kVar;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double d7) {
        Y0.c cVarRemoveRequest = removeRequest((int) d7);
        if (cVarRemoveRequest != null) {
            cVarRemoveRequest.close();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String str, Promise promise) {
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (str == null || str.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        w5.k.e(reactApplicationContext, "getReactApplicationContext(...)");
        J1.b bVarA = J1.c.w(new J2.a(reactApplicationContext, str, 0.0d, 0.0d, 12, null).f()).a();
        w5.k.e(bVarA, "build(...)");
        getImagePipeline().g(bVarA, getCallerContext()).e(new b(promise), M0.a.a());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String str, ReadableMap readableMap, Promise promise) {
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (str == null || str.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        w5.k.e(reactApplicationContext, "getReactApplicationContext(...)");
        J1.c cVarW = J1.c.w(new J2.a(reactApplicationContext, str, 0.0d, 0.0d, 12, null).f());
        w5.k.e(cVarW, "newBuilderWithSource(...)");
        C1962a c1962aZ = C1962a.z(cVarW, readableMap);
        w5.k.e(c1962aZ, "fromBuilderWithHeaders(...)");
        getImagePipeline().g(c1962aZ, getCallerContext()).e(new c(promise), M0.a.a());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.enqueuedRequestMonitor) {
            try {
                int size = this.enqueuedRequests.size();
                for (int i7 = 0; i7 < size; i7++) {
                    Y0.c cVarValueAt = this.enqueuedRequests.valueAt(i7);
                    w5.k.e(cVarValueAt, "valueAt(...)");
                    cVarValueAt.close();
                }
                this.enqueuedRequests.clear();
                u uVar = u.f19985a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String str, double d7, Promise promise) {
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        int i7 = (int) d7;
        if (str == null || str.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        J1.b bVarA = J1.c.w(Uri.parse(str)).a();
        w5.k.e(bVarA, "build(...)");
        Y0.c cVarW = getImagePipeline().w(bVarA, getCallerContext());
        d dVar = new d(i7, promise);
        registerRequest(i7, cVarW);
        cVarW.e(dVar, M0.a.a());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(ReadableArray readableArray, Promise promise) {
        w5.k.f(readableArray, "uris");
        w5.k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        new e(readableArray, promise, getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        w5.k.f(reactApplicationContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, k kVar, f fVar) {
        super(reactApplicationContext);
        w5.k.f(reactApplicationContext, "reactContext");
        w5.k.f(kVar, "imagePipeline");
        w5.k.f(fVar, "callerContextFactory");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        setImagePipeline(kVar);
        this.callerContext = null;
    }
}
