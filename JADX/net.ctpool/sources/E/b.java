package E;

import android.content.Context;
import java.io.File;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final File a(Context context, String str) {
        k.f(context, "<this>");
        k.f(str, "name");
        return B.a.a(context, k.m(str, ".preferences_pb"));
    }
}
