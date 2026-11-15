package z0;

import android.content.ComponentName;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes.dex */
public class u extends o {
    public u(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // z0.n
    protected String b() {
        return null;
    }

    @Override // z0.n
    protected String h() {
        return "com.whatsapp.w4b";
    }

    @Override // z0.n
    protected String i() {
        return "market://details?id=com.whatsapp.w4b";
    }

    @Override // z0.o, z0.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        if (readableMap.hasKey("whatsAppNumber")) {
            try {
                f().setComponent(new ComponentName("com.whatsapp.w4b", "com.whatsapp.Conversation"));
                m();
                Thread.sleep(10L);
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        f().setComponent(null);
        m();
    }
}
