package z0;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.appstate.AppStateModule;
import y0.C2236e;

/* JADX INFO: loaded from: classes.dex */
public class e extends o {
    public e(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        n(new Intent("com.facebook.stories.ADD_TO_STORY"));
    }

    private void q(ReadableMap readableMap) {
        if (!n.j("appId", readableMap)) {
            throw new IllegalArgumentException("appId was not provided.");
        }
        if (!n.j("backgroundImage", readableMap) && !n.j("backgroundVideo", readableMap) && !n.j("stickerImage", readableMap)) {
            throw new IllegalArgumentException("Invalid background or sticker assets provided.");
        }
        Activity currentActivity = this.f23235a.getCurrentActivity();
        if (currentActivity == null) {
            q.a("Something went wrong");
            return;
        }
        this.f23236b.putExtra("com.facebook.platform.extra.APPLICATION_ID", readableMap.getString("appId"));
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
            C2236e c2236e = new C2236e(n.j("backgroundImage", readableMap) ? readableMap.getString("backgroundImage") : n.j("backgroundVideo", readableMap) ? readableMap.getString("backgroundVideo") : "", "image/jpeg", AppStateModule.APP_STATE_BACKGROUND, boolValueOf, this.f23235a);
            this.f23236b.setDataAndType(c2236e.d(), c2236e.c());
            this.f23236b.setFlags(1);
        }
        if (n.j("stickerImage", readableMap)) {
            C2236e c2236e2 = new C2236e(readableMap.getString("stickerImage"), "image/png", "sticker", boolValueOf, this.f23235a);
            if (!z6) {
                this.f23236b.setType("image/*");
            }
            this.f23236b.putExtra("interactive_asset_uri", c2236e2.d());
            currentActivity.grantUriPermission("com.facebook.katana", c2236e2.d(), 1);
        }
    }

    @Override // z0.n
    protected String b() {
        return null;
    }

    @Override // z0.n
    protected String h() {
        return "com.facebook.katana";
    }

    @Override // z0.n
    protected String i() {
        return "market://details?id=com.facebook.katana";
    }

    @Override // z0.o, z0.n
    public void l(ReadableMap readableMap) {
        super.l(readableMap);
        q(readableMap);
        p(readableMap);
    }
}
