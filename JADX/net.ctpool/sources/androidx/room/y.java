package androidx.room;

import android.content.Context;
import android.util.Log;
import b0.C0673a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Z.h, g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f9069m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f9070n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final File f9071o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Callable f9072p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f9073q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Z.h f9074r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private f f9075s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f9076t;

    public y(Context context, String str, File file, Callable callable, int i7, Z.h hVar) {
        w5.k.f(context, "context");
        w5.k.f(hVar, "delegate");
        this.f9069m = context;
        this.f9070n = str;
        this.f9071o = file;
        this.f9072p = callable;
        this.f9073q = i7;
        this.f9074r = hVar;
    }

    private final void b(File file, boolean z6) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        String str;
        if (this.f9070n != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.f9069m.getAssets().open(this.f9070n));
            str = "newChannel(context.assets.open(copyFromAssetPath))";
        } else if (this.f9071o != null) {
            readableByteChannelNewChannel = new FileInputStream(this.f9071o).getChannel();
            str = "FileInputStream(copyFromFile).channel";
        } else {
            Callable callable = this.f9072p;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel((InputStream) callable.call());
                str = "newChannel(inputStream)";
            } catch (Exception e7) {
                throw new IOException("inputStreamCallable exception on call", e7);
            }
        }
        w5.k.e(readableByteChannelNewChannel, str);
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f9069m.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(fileCreateTempFile).getChannel();
        w5.k.e(channel, "output");
        X.c.a(readableByteChannelNewChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        w5.k.e(fileCreateTempFile, "intermediateFile");
        d(fileCreateTempFile, z6);
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final void d(File file, boolean z6) {
        f fVar = this.f9075s;
        if (fVar == null) {
            w5.k.t("databaseConfiguration");
            fVar = null;
        }
        fVar.getClass();
    }

    private final void f(boolean z6) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        File databasePath = this.f9069m.getDatabasePath(databaseName);
        f fVar = this.f9075s;
        f fVar2 = null;
        if (fVar == null) {
            w5.k.t("databaseConfiguration");
            fVar = null;
        }
        C0673a c0673a = new C0673a(databaseName, this.f9069m.getFilesDir(), fVar.f8964s);
        try {
            C0673a.c(c0673a, false, 1, null);
            if (!databasePath.exists()) {
                try {
                    w5.k.e(databasePath, "databaseFile");
                    b(databasePath, z6);
                    c0673a.d();
                    return;
                } catch (IOException e7) {
                    throw new RuntimeException("Unable to copy database file.", e7);
                }
            }
            try {
                w5.k.e(databasePath, "databaseFile");
                int iC = X.b.c(databasePath);
                if (iC == this.f9073q) {
                    c0673a.d();
                    return;
                }
                f fVar3 = this.f9075s;
                if (fVar3 == null) {
                    w5.k.t("databaseConfiguration");
                } else {
                    fVar2 = fVar3;
                }
                if (fVar2.a(iC, this.f9073q)) {
                    c0673a.d();
                    return;
                }
                if (this.f9069m.deleteDatabase(databaseName)) {
                    try {
                        b(databasePath, z6);
                    } catch (IOException e8) {
                        Log.w("ROOM", "Unable to copy database file.", e8);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                c0673a.d();
                return;
            } catch (IOException e9) {
                Log.w("ROOM", "Unable to read database version.", e9);
                c0673a.d();
                return;
            }
        } catch (Throwable th) {
            c0673a.d();
            throw th;
        }
        c0673a.d();
        throw th;
    }

    @Override // androidx.room.g
    public Z.h a() {
        return this.f9074r;
    }

    @Override // Z.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        a().close();
        this.f9076t = false;
    }

    public final void e(f fVar) {
        w5.k.f(fVar, "databaseConfiguration");
        this.f9075s = fVar;
    }

    @Override // Z.h
    public String getDatabaseName() {
        return a().getDatabaseName();
    }

    @Override // Z.h
    public Z.g l0() {
        if (!this.f9076t) {
            f(true);
            this.f9076t = true;
        }
        return a().l0();
    }

    @Override // Z.h
    public void setWriteAheadLoggingEnabled(boolean z6) {
        a().setWriteAheadLoggingEnabled(z6);
    }
}
