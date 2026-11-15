package z0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f23240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f23241g;

    public o(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f23240f = null;
        this.f23241g = null;
    }

    @Override // z0.n
    public void l(ReadableMap readableMap) {
        PrintStream printStream = System.out;
        printStream.println(h());
        if (h() != null || b() != null || i() != null) {
            if (n.k(h(), this.f23235a)) {
                printStream.println("INSTALLED");
                if (a() != null) {
                    f().setComponent(new ComponentName(h(), a()));
                } else {
                    f().setPackage(h());
                }
                super.l(readableMap);
                return;
            }
            printStream.println("NOT INSTALLED");
            n(new Intent(new Intent("android.intent.action.VIEW", Uri.parse(b() != null ? b().replace("{url}", n.o(readableMap.getString(ImagesContract.URL))).replace("{message}", n.o(readableMap.getString("message"))) : i() != null ? i() : ""))));
        }
        super.l(readableMap);
    }

    @Override // z0.n
    protected void m() {
        p(null);
    }

    protected void p(ReadableMap readableMap) {
        WritableMap writableMapCreateMap;
        String str;
        if (this.f23239e.hasKey("forceDialog") && this.f23239e.getBoolean("forceDialog")) {
            Activity currentActivity = this.f23235a.getCurrentActivity();
            if (currentActivity == null) {
                q.a("Something went wrong");
                return;
            }
            if (readableMap != null && !n.j("social", readableMap)) {
                throw new IllegalArgumentException("social is empty");
            }
            if (q.d()) {
                Intent intentCreateChooser = Intent.createChooser(f(), this.f23237c, q.c(this.f23235a));
                intentCreateChooser.addFlags(1073741824);
                currentActivity.startActivityForResult(intentCreateChooser, 16845);
                return;
            }
            Intent intentCreateChooser2 = Intent.createChooser(f(), this.f23237c);
            intentCreateChooser2.addFlags(1073741824);
            currentActivity.startActivityForResult(intentCreateChooser2, 16845);
            writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("success", true);
            str = "OK";
        } else {
            f().addFlags(268435456);
            this.f23235a.startActivity(f());
            writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("success", true);
            str = f().getPackage();
        }
        writableMapCreateMap.putString("message", str);
        q.b(writableMapCreateMap);
    }
}
