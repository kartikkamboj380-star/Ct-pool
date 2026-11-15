package z0;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.appstate.AppStateModule;
import y0.C2236e;

/* JADX INFO: loaded from: classes.dex */
public class i extends o {
    public i(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        n(new Intent("com.instagram.share.ADD_TO_STORY"));
    }

    private void q(ReadableMap readableMap) {
        String string;
        String string2;
        String str;
        if (!n.j("backgroundImage", readableMap) && !n.j("backgroundVideo", readableMap) && !n.j("stickerImage", readableMap)) {
            throw new IllegalArgumentException("Invalid background or sticker assets provided.");
        }
        Activity currentActivity = this.f23235a.getCurrentActivity();
        if (currentActivity == null) {
            q.a("Something went wrong");
            return;
        }
        this.f23236b.putExtra("source_application", readableMap.getString("appId"));
        this.f23236b.putExtra("bottom_background_color", "#906df4");
        this.f23236b.putExtra("top_background_color", "#837DF4");
        if (n.j("attributionURL", readableMap)) {
            this.f23236b.putExtra("content_url", readableMap.getString("attributionURL"));
        }
        if (n.j("backgroundTopColor", readableMap)) {
            this.f23236b.putExtra("top_background_color", readableMap.getString("backgroundTopColor"));
        }
        if (n.j("backgroundBottomColor", readableMap)) {
            this.f23236b.putExtra("bottom_background_color", readableMap.getString("backgroundBottomColor"));
        }
        Boolean boolValueOf = Boolean.FALSE;
        if (n.j("useInternalStorage", readableMap)) {
            boolValueOf = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        boolean z6 = n.j("backgroundImage", readableMap) || n.j("backgroundVideo", readableMap);
        if (z6) {
            if (n.j("backgroundImage", readableMap)) {
                string = readableMap.getString("backgroundImage");
            } else if (n.j("backgroundVideo", readableMap)) {
                string2 = readableMap.getString("backgroundVideo");
                str = "video/*";
                C2236e c2236e = new C2236e(string2, str, AppStateModule.APP_STATE_BACKGROUND, boolValueOf, this.f23235a);
                this.f23236b.setDataAndType(c2236e.d(), c2236e.c());
                this.f23236b.setFlags(1);
            } else {
                string = "";
            }
            str = "image/jpeg";
            string2 = string;
            C2236e c2236e2 = new C2236e(string2, str, AppStateModule.APP_STATE_BACKGROUND, boolValueOf, this.f23235a);
            this.f23236b.setDataAndType(c2236e2.d(), c2236e2.c());
            this.f23236b.setFlags(1);
        }
        if (n.j("stickerImage", readableMap)) {
            C2236e c2236e3 = new C2236e(readableMap.getString("stickerImage"), "image/png", "sticker", boolValueOf, this.f23235a);
            if (!z6) {
                this.f23236b.setType("image/*");
            }
            this.f23236b.putExtra("interactive_asset_uri", c2236e3.d());
            currentActivity.grantUriPermission("com.instagram.android", c2236e3.d(), 1);
        }
    }

    @Override // z0.n
    protected String b() {
        return null;
    }

    @Override // z0.n
    protected String h() {
        return "com.instagram.android";
    }

    @Override // z0.n
    protected String i() {
        return "https://play.google.com/store/apps/details?id=com.instagram.android";
    }

    @Override // z0.o, z0.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        q(readableMap);
        p(readableMap);
    }
}
