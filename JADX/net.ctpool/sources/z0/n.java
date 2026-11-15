package z0;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import y0.C2236e;
import y0.C2237f;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ReactApplicationContext f23235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Intent f23236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f23237c = "Share";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected C2236e f23238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ReadableMap f23239e;

    public n(ReactApplicationContext reactApplicationContext) {
        this.f23235a = reactApplicationContext;
        n(new Intent("android.intent.action.SEND"));
        f().setType("text/plain");
    }

    private ComponentName[] c(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        Intent intent = new Intent(f().getAction());
        intent.setType(f().getType());
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> listQueryIntentActivities = this.f23235a.getPackageManager().queryIntentActivities(intent, 0);
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            String string = readableArray.getString(i7);
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                if (resolveInfo.activityInfo.packageName.equals(string)) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
                }
            }
        }
        return (ComponentName[]) arrayList.toArray(new ComponentName[0]);
    }

    public static boolean j(String str, ReadableMap readableMap) {
        return (readableMap == null || !readableMap.hasKey(str) || readableMap.isNull(str)) ? false : true;
    }

    public static boolean k(String str, Context context) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    protected static String o(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("URLEncoder.encode() failed for " + str);
        }
    }

    protected String a() {
        return null;
    }

    protected abstract String b();

    protected C2236e d(ReadableMap readableMap) {
        String string = j("filename", readableMap) ? readableMap.getString("filename") : null;
        Boolean boolValueOf = Boolean.FALSE;
        if (j("useInternalStorage", readableMap)) {
            boolValueOf = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool = boolValueOf;
        return j("type", readableMap) ? new C2236e(readableMap.getString(ImagesContract.URL), readableMap.getString("type"), string, bool, this.f23235a) : new C2236e(readableMap.getString(ImagesContract.URL), string, bool, this.f23235a);
    }

    protected C2237f e(ReadableMap readableMap) {
        ArrayList arrayList = new ArrayList();
        if (j("filenames", readableMap)) {
            ReadableArray array = readableMap.getArray("filenames");
            for (int i7 = 0; i7 < array.size(); i7++) {
                arrayList.add(array.getString(i7));
            }
        }
        Boolean boolValueOf = Boolean.FALSE;
        if (j("useInternalStorage", readableMap)) {
            boolValueOf = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
        }
        Boolean bool = boolValueOf;
        return j("type", readableMap) ? new C2237f(readableMap.getArray("urls"), arrayList, readableMap.getString("type"), bool, this.f23235a) : new C2237f(readableMap.getArray("urls"), arrayList, bool, this.f23235a);
    }

    protected Intent f() {
        return this.f23236b;
    }

    protected Intent[] g(Intent intent, Uri uri) {
        List<ResolveInfo> listQueryIntentActivities = this.f23235a.getPackageManager().queryIntentActivities(intent, 0);
        Intent[] intentArr = new Intent[listQueryIntentActivities.size()];
        for (int i7 = 0; i7 < listQueryIntentActivities.size(); i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(i7);
            String str = resolveInfo.activityInfo.packageName;
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(str, resolveInfo.activityInfo.name));
            intent2.setAction("android.intent.action.VIEW");
            intent2.setDataAndType(uri, intent.getType());
            intent2.addFlags(1);
            intentArr[i7] = new Intent(intent2);
        }
        return intentArr;
    }

    protected abstract String h();

    protected abstract String i();

    public void l(ReadableMap readableMap) {
        Intent intentF;
        String string;
        Intent intentF2;
        StringBuilder sb;
        String string2;
        this.f23239e = readableMap;
        if (j("isNewTask", readableMap) && readableMap.getBoolean("isNewTask")) {
            f().addFlags(268468224);
        }
        if (j("subject", readableMap)) {
            f().putExtra("android.intent.extra.SUBJECT", readableMap.getString("subject"));
        }
        if (j(Scopes.EMAIL, readableMap)) {
            f().putExtra("android.intent.extra.EMAIL", new String[]{readableMap.getString(Scopes.EMAIL)});
        }
        if (j("title", readableMap)) {
            this.f23237c = readableMap.getString("title");
        }
        String string3 = j("message", readableMap) ? readableMap.getString("message") : "";
        String string4 = j("social", readableMap) ? readableMap.getString("social") : "";
        if (string4.equals("sms")) {
            String string5 = readableMap.getString("recipient");
            if (!string5.isEmpty()) {
                f().putExtra("address", string5);
            }
        }
        if (string4.equals("whatsapp") && readableMap.hasKey("whatsAppNumber")) {
            f().putExtra("jid", readableMap.getString("whatsAppNumber") + "@s.whatsapp.net");
        }
        if (string4.equals("whatsappbusiness") && readableMap.hasKey("whatsAppNumber")) {
            f().putExtra("jid", readableMap.getString("whatsAppNumber") + "@s.whatsapp.net");
        }
        if (!j("urls", readableMap)) {
            if (j(ImagesContract.URL, readableMap)) {
                C2236e c2236eD = d(readableMap);
                this.f23238d = c2236eD;
                if (!c2236eD.f()) {
                    if (TextUtils.isEmpty(string3)) {
                        intentF = f();
                        string = readableMap.getString(ImagesContract.URL);
                        intentF.putExtra("android.intent.extra.TEXT", string);
                        return;
                    }
                    intentF2 = f();
                    sb = new StringBuilder();
                    sb.append(string3);
                    sb.append(" ");
                    string2 = readableMap.getString(ImagesContract.URL);
                    sb.append(string2);
                    intentF2.putExtra("android.intent.extra.TEXT", sb.toString());
                    return;
                }
                Uri uriD = this.f23238d.d();
                ClipData clipDataNewUri = ClipData.newUri(this.f23235a.getContentResolver(), "File", uriD);
                f().setType(this.f23238d.c());
                f().setClipData(clipDataNewUri);
                f().putExtra("android.intent.extra.STREAM", uriD);
                f().addFlags(1);
                if (TextUtils.isEmpty(string3)) {
                    return;
                }
            } else if (TextUtils.isEmpty(string3)) {
                return;
            }
            f().putExtra("android.intent.extra.TEXT", string3);
        }
        C2237f c2237fE = e(readableMap);
        if (!c2237fE.f()) {
            if (TextUtils.isEmpty(string3)) {
                intentF = f();
                string = readableMap.getArray("urls").getString(0);
                intentF.putExtra("android.intent.extra.TEXT", string);
                return;
            }
            intentF2 = f();
            sb = new StringBuilder();
            sb.append(string3);
            sb.append(" ");
            string2 = readableMap.getArray("urls").getString(0);
            sb.append(string2);
            intentF2.putExtra("android.intent.extra.TEXT", sb.toString());
            return;
        }
        ArrayList arrayListD = c2237fE.d();
        ClipData clipData = new ClipData(new ClipDescription("Files", new String[]{c2237fE.c()}), new ClipData.Item((Uri) arrayListD.get(0)));
        for (int i7 = 1; i7 < arrayListD.size(); i7++) {
            clipData.addItem(new ClipData.Item((Uri) arrayListD.get(i7)));
        }
        f().setClipData(clipData);
        f().setAction("android.intent.action.SEND_MULTIPLE");
        f().setType(c2237fE.c());
        f().putParcelableArrayListExtra("android.intent.extra.STREAM", arrayListD);
        f().addFlags(1);
        if (TextUtils.isEmpty(string3)) {
            return;
        }
        f().putExtra("android.intent.extra.TEXT", string3);
    }

    protected void m() {
        Intent intentCreateChooser;
        IntentSender intentSenderC;
        Activity currentActivity = this.f23235a.getCurrentActivity();
        if (currentActivity == null) {
            q.a("Something went wrong");
            return;
        }
        if (q.d()) {
            intentSenderC = q.c(this.f23235a);
            intentCreateChooser = Intent.createChooser(f(), this.f23237c, intentSenderC);
        } else {
            intentCreateChooser = Intent.createChooser(f(), this.f23237c);
            intentSenderC = null;
        }
        intentCreateChooser.addFlags(1073741824);
        if (j("showAppsToView", this.f23239e) && j(ImagesContract.URL, this.f23239e)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setType(this.f23238d.c());
            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", g(intent, this.f23238d.d()));
        }
        if (j("excludedActivityTypes", this.f23239e)) {
            intentCreateChooser.putExtra("android.intent.extra.EXCLUDE_COMPONENTS", c(this.f23239e.getArray("excludedActivityTypes")));
        }
        currentActivity.startActivityForResult(intentCreateChooser, 16845);
        if (intentSenderC == null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("success", true);
            writableMapCreateMap.putString("message", "OK");
            q.b(writableMapCreateMap);
        }
    }

    protected void n(Intent intent) {
        this.f23236b = intent;
    }
}
