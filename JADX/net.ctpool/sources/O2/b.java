package O2;

import android.content.Context;
import com.facebook.soloader.A;
import com.facebook.soloader.m;
import com.facebook.soloader.r;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f2466b;

    public b(Context context, a aVar) {
        this.f2465a = context;
        this.f2466b = aVar;
    }

    @Override // O2.f
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, A[] aArr) {
        String str = this.f2465a.getApplicationInfo().sourceDir;
        if (new File(str).exists()) {
            m.g("soloader.recovery.CheckBaseApkExists", "Base apk exists: " + str);
            return false;
        }
        StringBuilder sb = new StringBuilder("Base apk does not exist: ");
        sb.append(str);
        sb.append(". ");
        this.f2466b.b(sb);
        throw new r(sb.toString(), unsatisfiedLinkError);
    }
}
