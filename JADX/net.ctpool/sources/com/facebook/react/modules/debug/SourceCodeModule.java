package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import i2.InterfaceC1741a;
import i5.q;
import j5.AbstractC1787F;
import java.util.Map;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1741a(name = NativeSourceCodeSpec.NAME)
public final class SourceCodeModule extends NativeSourceCodeSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceCodeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        k.f(reactApplicationContext, "reactContext");
    }

    @Override // com.facebook.fbreact.specs.NativeSourceCodeSpec
    protected Map<String, Object> getTypedExportedConstants() {
        return AbstractC1787F.e(q.a("scriptURL", O1.a.d(getReactApplicationContext().getSourceURL(), "No source URL loaded, have you initialised the instance?")));
    }
}
