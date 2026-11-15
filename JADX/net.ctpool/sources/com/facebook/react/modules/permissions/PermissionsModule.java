package com.facebook.react.modules.permissions;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import i2.InterfaceC1741a;
import java.util.ArrayList;
import m2.InterfaceC1876g;
import m2.InterfaceC1877h;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativePermissionsAndroidSpec.NAME)
public class PermissionsModule extends NativePermissionsAndroidSpec implements InterfaceC1877h {
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    private final String DENIED;
    private final String GRANTED;
    private final String NEVER_ASK_AGAIN;
    private final SparseArray<Callback> mCallbacks;
    private int mRequestCode;

    class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f11950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11951b;

        a(Promise promise, String str) {
            this.f11950a = promise;
            this.f11951b = str;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            Promise promise;
            String str;
            int[] iArr = (int[]) objArr[0];
            if (iArr.length > 0 && iArr[0] == 0) {
                promise = this.f11950a;
                str = "granted";
            } else if (((InterfaceC1876g) objArr[1]).shouldShowRequestPermissionRationale(this.f11951b)) {
                promise = this.f11950a;
                str = "denied";
            } else {
                promise = this.f11950a;
                str = "never_ask_again";
            }
            promise.resolve(str);
        }
    }

    class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f11953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WritableMap f11954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Promise f11955c;

        b(ArrayList arrayList, WritableMap writableMap, Promise promise) {
            this.f11953a = arrayList;
            this.f11954b = writableMap;
            this.f11955c = promise;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            WritableMap writableMap;
            String str;
            int[] iArr = (int[]) objArr[0];
            InterfaceC1876g interfaceC1876g = (InterfaceC1876g) objArr[1];
            for (int i7 = 0; i7 < this.f11953a.size(); i7++) {
                String str2 = (String) this.f11953a.get(i7);
                if (iArr.length > 0 && iArr[i7] == 0) {
                    writableMap = this.f11954b;
                    str = "granted";
                } else if (interfaceC1876g.shouldShowRequestPermissionRationale(str2)) {
                    writableMap = this.f11954b;
                    str = "denied";
                } else {
                    writableMap = this.f11954b;
                    str = "never_ask_again";
                }
                writableMap.putString(str2, str);
            }
            this.f11955c.resolve(this.f11954b);
        }
    }

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRequestCode = 0;
        this.GRANTED = "granted";
        this.DENIED = "denied";
        this.NEVER_ASK_AGAIN = "never_ask_again";
        this.mCallbacks = new SparseArray<>();
    }

    private InterfaceC1876g getPermissionAwareActivity() {
        ComponentCallbacks2 currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof InterfaceC1876g) {
            return (InterfaceC1876g) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void checkPermission(String str, Promise promise) {
        promise.resolve(Boolean.valueOf(getReactApplicationContext().getBaseContext().checkSelfPermission(str) == 0));
    }

    @Override // m2.InterfaceC1877h
    public boolean onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        try {
            Callback callback = this.mCallbacks.get(i7);
            if (callback != null) {
                callback.invoke(iArr, getPermissionAwareActivity());
                this.mCallbacks.remove(i7);
            } else {
                P0.a.I("PermissionsModule", "Unable to find callback with requestCode %d", Integer.valueOf(i7));
            }
            return this.mCallbacks.size() == 0;
        } catch (IllegalStateException e7) {
            P0.a.m("PermissionsModule", e7, "Unexpected invocation of `onRequestPermissionsResult` with invalid current activity", new Object[0]);
            return false;
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestMultiplePermissions(ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i7 = 0;
        for (int i8 = 0; i8 < readableArray.size(); i8++) {
            String string = readableArray.getString(i8);
            if (baseContext.checkSelfPermission(string) == 0) {
                writableNativeMap.putString(string, "granted");
                i7++;
            } else {
                arrayList.add(string);
            }
        }
        if (readableArray.size() == i7) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            InterfaceC1876g permissionAwareActivity = getPermissionAwareActivity();
            this.mCallbacks.put(this.mRequestCode, new b(arrayList, writableNativeMap, promise));
            permissionAwareActivity.p((String[]) arrayList.toArray(new String[0]), this.mRequestCode, this);
            this.mRequestCode++;
        } catch (IllegalStateException e7) {
            promise.reject(ERROR_INVALID_ACTIVITY, e7);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestPermission(String str, Promise promise) {
        if (getReactApplicationContext().getBaseContext().checkSelfPermission(str) == 0) {
            promise.resolve("granted");
            return;
        }
        try {
            InterfaceC1876g permissionAwareActivity = getPermissionAwareActivity();
            this.mCallbacks.put(this.mRequestCode, new a(promise, str));
            permissionAwareActivity.p(new String[]{str}, this.mRequestCode, this);
            this.mRequestCode++;
        } catch (IllegalStateException e7) {
            promise.reject(ERROR_INVALID_ACTIVITY, e7);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void shouldShowRequestPermissionRationale(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e7) {
            promise.reject(ERROR_INVALID_ACTIVITY, e7);
        }
    }
}
