package androidx.work.impl;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: androidx.work.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0661a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0661a f9343a = new C0661a();

    private C0661a() {
    }

    public final File a(Context context) {
        w5.k.f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        w5.k.e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
