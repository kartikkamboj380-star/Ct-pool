package Z;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f4614a = new d();

    private d() {
    }

    public static final File a(Context context) {
        w5.k.f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        w5.k.e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
