package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.e;
import androidx.lifecycle.AbstractC0651h;
import androidx.lifecycle.InterfaceC0646c;
import androidx.lifecycle.ProcessLifecycleInitializer;
import c0.InterfaceC0707a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0707a {

    static class a extends e.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    static class b implements e.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f7838a;

        class a extends e.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.h f7839a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f7840b;

            a(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f7839a = hVar;
                this.f7840b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th) {
                try {
                    this.f7839a.a(th);
                } finally {
                    this.f7840b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.h
            public void b(m mVar) {
                try {
                    this.f7839a.b(mVar);
                } finally {
                    this.f7840b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f7838a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.g
        public void a(final e.h hVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7878m.d(hVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void d(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                j jVarA = androidx.emoji2.text.c.a(this.f7838a);
                if (jVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                jVarA.c(threadPoolExecutor);
                jVarA.a().a(new a(hVar, threadPoolExecutor));
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.core.os.o.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.h()) {
                    e.b().k();
                }
            } finally {
                androidx.core.os.o.b();
            }
        }
    }

    @Override // c0.InterfaceC0707a
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // c0.InterfaceC0707a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        e.g(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        final AbstractC0651h lifecycle = ((androidx.lifecycle.l) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new InterfaceC0646c() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC0648e
            public void f(androidx.lifecycle.l lVar) {
                EmojiCompatInitializer.this.e();
                lifecycle.c(this);
            }
        });
    }

    void e() {
        androidx.emoji2.text.b.d().postDelayed(new c(), 500L);
    }
}
