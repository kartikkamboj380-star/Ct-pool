package n3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

/* JADX INFO: renamed from: n3.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1904E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f21361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21363c = 0;

    public C1904E(Context context) {
        this.f21361a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f21362b == 0) {
            try {
                packageInfo = Wrappers.packageManager(this.f21361a).getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e7) {
                Log.w("Metadata", "Failed to find package ".concat(e7.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f21362b = packageInfo.versionCode;
            }
        }
        return this.f21362b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x001d, B:14:0x0028, B:16:0x002f, B:18:0x0041, B:26:0x0062, B:21:0x0048, B:23:0x005b, B:29:0x0066, B:33:0x0075), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized int b() {
        int i7 = this.f21363c;
        if (i7 != 0) {
            return i7;
        }
        Context context = this.f21361a;
        PackageManager packageManager = context.getPackageManager();
        if (Wrappers.packageManager(context).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i8 = 1;
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                intent2.setPackage("com.google.android.gms");
                List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
                    Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                    if (true == PlatformVersion.isAtLeastO()) {
                        i8 = 2;
                    }
                    this.f21363c = i8;
                    return i8;
                }
                i8 = 2;
            }
        }
        this.f21363c = i8;
        return i8;
    }
}
