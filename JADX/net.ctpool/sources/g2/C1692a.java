package g2;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.jscexecutor.JSCExecutor;
import w5.k;

/* JADX INFO: renamed from: g2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1692a implements JavaScriptExecutorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19529b;

    public C1692a(String str, String str2) {
        k.f(str, "appName");
        k.f(str2, "deviceName");
        this.f19528a = str;
        this.f19529b = str2;
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.f19528a);
        writableNativeMap.putString("DeviceIdentity", this.f19529b);
        return new JSCExecutor(writableNativeMap);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        throw new UnsupportedOperationException("Starting sampling profiler not supported on " + this);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        k.f(str, "filename");
        throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + this);
    }

    public String toString() {
        return "JSIExecutor+JSCRuntime";
    }
}
