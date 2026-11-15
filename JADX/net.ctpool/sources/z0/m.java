package z0;

import android.provider.Telephony;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public class m extends o {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ReactApplicationContext f23234h;

    public m(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f23234h = reactApplicationContext;
    }

    @Override // z0.n
    protected String b() {
        return null;
    }

    @Override // z0.n
    protected String h() {
        return Telephony.Sms.getDefaultSmsPackage(this.f23234h);
    }

    @Override // z0.n
    protected String i() {
        return "market://details?id=com.android.mms";
    }

    @Override // z0.o, z0.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        m();
    }
}
