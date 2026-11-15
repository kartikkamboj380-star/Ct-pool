package z0;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.internal.ImagesContract;
import y0.C2236e;

/* JADX INFO: loaded from: classes.dex */
public class h extends o {
    public h(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private String q(String str) {
        return str.split("/")[r2.length - 1];
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
        if (!n.j("type", readableMap)) {
            Log.e("RNShare", "No type provided");
            return;
        }
        String string = readableMap.getString("type");
        if (string.startsWith("text")) {
            s(this.f23237c);
            return;
        }
        if (!n.j(ImagesContract.URL, readableMap)) {
            Log.e("RNShare", "No url provided");
            return;
        }
        String string2 = readableMap.getString(ImagesContract.URL);
        if (string2.startsWith("instagram://")) {
            t(string2);
            return;
        }
        String strQ = q(string);
        r(string2, this.f23237c, Boolean.valueOf(string.startsWith("image")), strQ);
    }

    protected void r(String str, String str2, Boolean bool, String str3) {
        C2236e c2236e;
        Boolean boolValueOf = Boolean.valueOf(n.j("useInternalStorage", this.f23239e) && this.f23239e.getBoolean("useInternalStorage"));
        if (bool.booleanValue()) {
            c2236e = new C2236e(str, "image/" + str3, "image", boolValueOf, this.f23235a);
        } else {
            c2236e = new C2236e(str, "video/" + str3, "video", boolValueOf, this.f23235a);
        }
        Uri uriD = c2236e.d();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(bool.booleanValue() ? "image/*" : "video/*");
        intent.putExtra("android.intent.extra.STREAM", uriD);
        intent.setPackage("com.instagram.android");
        Intent intent2 = new Intent("com.instagram.share.ADD_TO_STORY");
        intent2.setDataAndType(uriD, str3);
        intent2.addFlags(1);
        intent2.setPackage("com.instagram.android");
        Intent intentCreateChooser = Intent.createChooser(intent, str2);
        intentCreateChooser.addFlags(268435456);
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
        this.f23235a.getCurrentActivity().grantUriPermission("com.instagram.android", uriD, 1);
        this.f23235a.startActivity(intentCreateChooser);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("success", true);
        writableMapCreateMap.putString("message", f().getPackage());
        q.b(writableMapCreateMap);
    }

    protected void s(String str) {
        f().setPackage("com.instagram.android");
        f().setType("text/plain");
        f().setAction("android.intent.action.SEND");
        super.m();
    }

    protected void t(String str) {
        Uri uri = Uri.parse(str);
        f().setAction("android.intent.action.VIEW");
        f().setData(uri);
        super.m();
    }
}
