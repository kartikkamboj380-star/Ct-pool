package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.g;
import androidx.emoji2.text.e;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class j extends e.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f7903j = new a();

    public static class a {
        public Typeface a(Context context, g.b bVar) {
            return androidx.core.provider.g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, androidx.core.provider.e eVar) {
            return androidx.core.provider.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements e.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f7904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.core.provider.e f7905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f7906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f7907d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handler f7908e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f7909f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f7910g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e.h f7911h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ContentObserver f7912i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f7913j;

        b(Context context, androidx.core.provider.e eVar, a aVar) {
            androidx.core.util.f.g(context, "Context cannot be null");
            androidx.core.util.f.g(eVar, "FontRequest cannot be null");
            this.f7904a = context.getApplicationContext();
            this.f7905b = eVar;
            this.f7906c = aVar;
        }

        private void b() {
            synchronized (this.f7907d) {
                try {
                    this.f7911h = null;
                    ContentObserver contentObserver = this.f7912i;
                    if (contentObserver != null) {
                        this.f7906c.c(this.f7904a, contentObserver);
                        this.f7912i = null;
                    }
                    Handler handler = this.f7908e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f7913j);
                    }
                    this.f7908e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f7910g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f7909f = null;
                    this.f7910g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private g.b e() {
            try {
                g.a aVarB = this.f7906c.b(this.f7904a, this.f7905b);
                if (aVarB.c() == 0) {
                    g.b[] bVarArrB = aVarB.b();
                    if (bVarArrB == null || bVarArrB.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrB[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.c() + ")");
            } catch (PackageManager.NameNotFoundException e7) {
                throw new RuntimeException("provider not found", e7);
            }
        }

        @Override // androidx.emoji2.text.e.g
        public void a(e.h hVar) {
            androidx.core.util.f.g(hVar, "LoaderCallback cannot be null");
            synchronized (this.f7907d) {
                this.f7911h = hVar;
            }
            d();
        }

        void c() {
            synchronized (this.f7907d) {
                try {
                    if (this.f7911h == null) {
                        return;
                    }
                    try {
                        g.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f7907d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            androidx.core.os.o.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f7906c.a(this.f7904a, bVarE);
                            ByteBuffer byteBufferF = androidx.core.graphics.k.f(this.f7904a, null, bVarE.d());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            m mVarB = m.b(typefaceA, byteBufferF);
                            androidx.core.os.o.b();
                            synchronized (this.f7907d) {
                                try {
                                    e.h hVar = this.f7911h;
                                    if (hVar != null) {
                                        hVar.b(mVarB);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            androidx.core.os.o.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f7907d) {
                            try {
                                e.h hVar2 = this.f7911h;
                                if (hVar2 != null) {
                                    hVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.f7907d) {
                try {
                    if (this.f7911h == null) {
                        return;
                    }
                    if (this.f7909f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("emojiCompat");
                        this.f7910g = threadPoolExecutorB;
                        this.f7909f = threadPoolExecutorB;
                    }
                    this.f7909f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7914m.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f7907d) {
                this.f7909f = executor;
            }
        }
    }

    public j(Context context, androidx.core.provider.e eVar) {
        super(new b(context, eVar, f7903j));
    }

    public j c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
