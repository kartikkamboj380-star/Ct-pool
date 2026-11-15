package z0;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public class s extends o {
    public s(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // z0.n
    protected String b() {
        return "https://twitter.com/intent/tweet?text={message}&url={url}";
    }

    @Override // z0.n
    protected String h() {
        return "com.twitter.android";
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
