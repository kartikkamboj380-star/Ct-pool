package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import h2.C1708c;
import i2.InterfaceC1741a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativeHeadlessJsTaskSupportSpec.NAME)
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskFinished(double d7) {
        int i7 = (int) d7;
        C1708c c1708cF = C1708c.f(getReactApplicationContext());
        if (c1708cF.h(i7)) {
            c1708cF.i(i7);
        } else {
            P0.a.E(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i7));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskRetry(double d7, Promise promise) {
        Boolean boolValueOf;
        int i7 = (int) d7;
        C1708c c1708cF = C1708c.f(getReactApplicationContext());
        if (c1708cF.h(i7)) {
            boolValueOf = Boolean.valueOf(c1708cF.l(i7));
        } else {
            P0.a.E(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i7));
            boolValueOf = Boolean.FALSE;
        }
        promise.resolve(boolValueOf);
    }
}
