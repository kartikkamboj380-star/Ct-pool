package z0;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public class c extends o {
    public c(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // z0.n
    protected String b() {
        return "https://www.facebook.com/sharer/sharer.php?u={url}";
    }

    @Override // z0.n
    protected String h() {
        return "com.facebook.pages.app";
    }

    @Override // z0.n
    protected String i() {
        return null;
    }

    @Override // z0.o, z0.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
