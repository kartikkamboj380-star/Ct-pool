package z0;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public class l extends o {
    public l(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // z0.n
    protected String b() {
        return "https://pinterest.com/pin/create/button/?url={url}&media=$media&description={message}";
    }

    @Override // z0.n
    protected String h() {
        return "com.pinterest";
    }

    @Override // z0.n
    protected String i() {
        return "market://details?id=com.pinterest";
    }

    @Override // z0.o, z0.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
