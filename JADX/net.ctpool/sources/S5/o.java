package S5;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import app.notifee.core.Logger;
import java.util.HashMap;
import java.util.Map;
import z1.AbstractC2255b;
import z3.AbstractC2272l;
import z3.C2273m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Map f2965a;

    public class a extends AbstractC2255b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2273m f2966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f2967b;

        public a(C2273m c2273m, String str) {
            this.f2966a = c2273m;
            this.f2967b = str;
        }

        @Override // Y0.b
        public void e(Y0.c cVar) {
            Logger.e("ResourceUtils", "Failed to load an image: " + this.f2967b, cVar.c());
            this.f2966a.c(null);
        }

        @Override // z1.AbstractC2255b
        public void g(Bitmap bitmap) {
            this.f2966a.c(bitmap);
        }
    }

    public static int a(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String strReplace = str.toLowerCase().replace("-", "_");
        String str3 = strReplace + "_" + str2;
        synchronized (o.class) {
            try {
                if (b().containsKey(str3)) {
                    return ((Integer) b().get(str3)).intValue();
                }
                Context context = e.f2956a;
                int identifier = context.getResources().getIdentifier(strReplace, str2, context.getPackageName());
                b().put(str3, Integer.valueOf(identifier));
                return identifier;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Map b() {
        if (f2965a == null) {
            synchronized (o.class) {
                try {
                    if (f2965a == null) {
                        f2965a = new HashMap();
                    }
                } finally {
                }
            }
        }
        return f2965a;
    }

    public static AbstractC2272l c(String str) {
        Uri uriD;
        String string;
        C2273m c2273m = new C2273m();
        AbstractC2272l abstractC2272lA = c2273m.a();
        if (str.contains("/")) {
            try {
                Uri uriD2 = Uri.parse(str);
                if (uriD2.getScheme() == null) {
                    uriD2 = d(str);
                }
                uriD = uriD2;
            } catch (Exception unused) {
                uriD = d(str);
            }
        } else {
            int iA = a(str, "mipmap");
            if (iA == 0) {
                iA = a(str, "drawable");
            }
            if (iA == 0) {
                string = null;
            } else {
                string = (iA > 0 ? new Uri.Builder().scheme("res").path(String.valueOf(iA)).build() : Uri.EMPTY).toString();
            }
            if (string == null) {
                c2273m.c(null);
                return abstractC2272lA;
            }
            try {
                uriD = Uri.parse(string);
                if (uriD.getScheme() == null) {
                    uriD = d(string);
                }
            } catch (Exception unused2) {
                uriD = d(string);
            }
        }
        J1.b bVarA = J1.c.w(uriD).a();
        if (!c1.c.c()) {
            Logger.w("ResourceUtils", "Fresco initializing natively by Notifee");
            c1.c.d(e.f2956a);
        }
        c1.c.a().g(bVarA, e.f2956a).e(new a(c2273m, str), M0.a.a());
        return abstractC2272lA;
    }

    public static Uri d(String str) {
        int iA = a(str, "drawable");
        return iA > 0 ? new Uri.Builder().scheme("res").path(String.valueOf(iA)).build() : Uri.EMPTY;
    }

    public static Uri e(String str) {
        Context context = e.f2956a;
        if (str == null) {
            return null;
        }
        if (str.contains("://")) {
            return Uri.parse(str);
        }
        if (str.equalsIgnoreCase("default")) {
            return RingtoneManager.getDefaultUri(2);
        }
        int iA = a(str, "raw");
        if (iA == 0 && str.contains(".")) {
            iA = a(str.substring(0, str.lastIndexOf(46)), "raw");
        }
        if (iA == 0) {
            return null;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
    }
}
