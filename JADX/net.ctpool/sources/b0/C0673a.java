package b0;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: renamed from: b0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0673a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0187a f9564e = new C0187a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f9565f = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f9566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f9567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lock f9568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FileChannel f9569d;

    /* JADX INFO: renamed from: b0.a$a, reason: collision with other inner class name */
    public static final class C0187a {
        private C0187a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String str) {
            Lock lock;
            synchronized (C0673a.f9565f) {
                try {
                    Map map = C0673a.f9565f;
                    Object reentrantLock = map.get(str);
                    if (reentrantLock == null) {
                        reentrantLock = new ReentrantLock();
                        map.put(str, reentrantLock);
                    }
                    lock = (Lock) reentrantLock;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lock;
        }

        public /* synthetic */ C0187a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C0673a(String str, File file, boolean z6) {
        File file2;
        k.f(str, "name");
        this.f9566a = z6;
        if (file != null) {
            file2 = new File(file, str + ".lck");
        } else {
            file2 = null;
        }
        this.f9567b = file2;
        this.f9568c = f9564e.b(str);
    }

    public static /* synthetic */ void c(C0673a c0673a, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z6 = c0673a.f9566a;
        }
        c0673a.b(z6);
    }

    public final void b(boolean z6) {
        this.f9568c.lock();
        if (z6) {
            try {
                File file = this.f9567b;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f9567b).getChannel();
                channel.lock();
                this.f9569d = channel;
            } catch (IOException e7) {
                this.f9569d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e7);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f9569d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f9568c.unlock();
    }
}
