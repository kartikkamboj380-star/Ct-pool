package B;

import android.content.Context;
import java.io.File;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final File a(Context context, String str) {
        k.f(context, "<this>");
        k.f(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), k.m("datastore/", str));
    }
}
