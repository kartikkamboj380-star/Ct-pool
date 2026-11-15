package z0;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public class p extends o {
    public p(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // z0.n
    protected String a() {
        return "com.snap.mushroom.MainActivity";
    }

    @Override // z0.n
    protected String b() {
        return null;
    }

    @Override // z0.n
    protected String h() {
        return "com.snapchat.android";
    }

    @Override // z0.n
    protected String i() {
        return "market://details?id=com.snapchat.android";
    }

    @Override // z0.o, z0.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
