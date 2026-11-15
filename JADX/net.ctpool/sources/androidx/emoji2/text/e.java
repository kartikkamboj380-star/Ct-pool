package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f7846n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f7847o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static volatile e f7848p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f7850b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f7853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final g f7854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f7855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f7856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int[] f7857i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f7858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f7859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f7860l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d f7861m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f7849a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f7851c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f7852d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.h f7862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile m f7863c;

        /* JADX INFO: renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        class C0155a extends h {
            C0155a() {
            }

            @Override // androidx.emoji2.text.e.h
            public void a(Throwable th) {
                a.this.f7865a.m(th);
            }

            @Override // androidx.emoji2.text.e.h
            public void b(m mVar) {
                a.this.d(mVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        void a() {
            try {
                this.f7865a.f7854f.a(new C0155a());
            } catch (Throwable th) {
                this.f7865a.m(th);
            }
        }

        @Override // androidx.emoji2.text.e.b
        CharSequence b(CharSequence charSequence, int i7, int i8, int i9, boolean z6) {
            return this.f7862b.h(charSequence, i7, i8, i9, z6);
        }

        @Override // androidx.emoji2.text.e.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f7863c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f7865a.f7855g);
        }

        void d(m mVar) {
            if (mVar == null) {
                this.f7865a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f7863c = mVar;
            m mVar2 = this.f7863c;
            i iVar = new i();
            d dVar = this.f7865a.f7861m;
            e eVar = this.f7865a;
            this.f7862b = new androidx.emoji2.text.h(mVar2, iVar, dVar, eVar.f7856h, eVar.f7857i);
            this.f7865a.n();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e f7865a;

        b(e eVar) {
            this.f7865a = eVar;
        }

        abstract void a();

        abstract CharSequence b(CharSequence charSequence, int i7, int i8, int i9, boolean z6);

        abstract void c(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g f7866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f7867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f7868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int[] f7869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Set f7870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f7871f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7872g = -16711936;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f7873h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        d f7874i = new androidx.emoji2.text.d();

        protected c(g gVar) {
            androidx.core.util.f.g(gVar, "metadataLoader cannot be null.");
            this.f7866a = gVar;
        }

        protected final g a() {
            return this.f7866a;
        }

        public c b(int i7) {
            this.f7873h = i7;
            return this;
        }
    }

    public interface d {
        boolean a(CharSequence charSequence, int i7, int i8, int i9);
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public static abstract class AbstractC0156e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    private static class f implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final List f7875m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Throwable f7876n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f7877o;

        f(AbstractC0156e abstractC0156e, int i7) {
            this(Arrays.asList((AbstractC0156e) androidx.core.util.f.g(abstractC0156e, "initCallback cannot be null")), i7, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f7875m.size();
            int i7 = 0;
            if (this.f7877o != 1) {
                while (i7 < size) {
                    ((AbstractC0156e) this.f7875m.get(i7)).a(this.f7876n);
                    i7++;
                }
            } else {
                while (i7 < size) {
                    ((AbstractC0156e) this.f7875m.get(i7)).b();
                    i7++;
                }
            }
        }

        f(Collection collection, int i7) {
            this(collection, i7, null);
        }

        f(Collection collection, int i7, Throwable th) {
            androidx.core.util.f.g(collection, "initCallbacks cannot be null");
            this.f7875m = new ArrayList(collection);
            this.f7877o = i7;
            this.f7876n = th;
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(m mVar);
    }

    static class i {
        i() {
        }

        androidx.emoji2.text.i a(androidx.emoji2.text.g gVar) {
            return new o(gVar);
        }
    }

    private e(c cVar) {
        this.f7855g = cVar.f7867b;
        this.f7856h = cVar.f7868c;
        this.f7857i = cVar.f7869d;
        this.f7858j = cVar.f7871f;
        this.f7859k = cVar.f7872g;
        this.f7854f = cVar.f7866a;
        this.f7860l = cVar.f7873h;
        this.f7861m = cVar.f7874i;
        n.b bVar = new n.b();
        this.f7850b = bVar;
        Set set = cVar.f7870e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f7870e);
        }
        this.f7853e = new a(this);
        l();
    }

    public static e b() {
        e eVar;
        synchronized (f7846n) {
            eVar = f7848p;
            androidx.core.util.f.h(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i7, int i8, boolean z6) {
        return androidx.emoji2.text.h.c(inputConnection, editable, i7, i8, z6);
    }

    public static boolean f(Editable editable, int i7, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.d(editable, i7, keyEvent);
    }

    public static e g(c cVar) {
        e eVar = f7848p;
        if (eVar == null) {
            synchronized (f7846n) {
                try {
                    eVar = f7848p;
                    if (eVar == null) {
                        eVar = new e(cVar);
                        f7848p = eVar;
                    }
                } finally {
                }
            }
        }
        return eVar;
    }

    public static boolean h() {
        return f7848p != null;
    }

    private boolean j() {
        return d() == 1;
    }

    private void l() {
        this.f7849a.writeLock().lock();
        try {
            if (this.f7860l == 0) {
                this.f7851c = 0;
            }
            this.f7849a.writeLock().unlock();
            if (d() == 0) {
                this.f7853e.a();
            }
        } catch (Throwable th) {
            this.f7849a.writeLock().unlock();
            throw th;
        }
    }

    public int c() {
        return this.f7859k;
    }

    public int d() {
        this.f7849a.readLock().lock();
        try {
            return this.f7851c;
        } finally {
            this.f7849a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f7858j;
    }

    public void k() {
        androidx.core.util.f.h(this.f7860l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.f7849a.writeLock().lock();
        try {
            if (this.f7851c == 0) {
                return;
            }
            this.f7851c = 0;
            this.f7849a.writeLock().unlock();
            this.f7853e.a();
        } finally {
            this.f7849a.writeLock().unlock();
        }
    }

    void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f7849a.writeLock().lock();
        try {
            this.f7851c = 2;
            arrayList.addAll(this.f7850b);
            this.f7850b.clear();
            this.f7849a.writeLock().unlock();
            this.f7852d.post(new f(arrayList, this.f7851c, th));
        } catch (Throwable th2) {
            this.f7849a.writeLock().unlock();
            throw th2;
        }
    }

    void n() {
        ArrayList arrayList = new ArrayList();
        this.f7849a.writeLock().lock();
        try {
            this.f7851c = 1;
            arrayList.addAll(this.f7850b);
            this.f7850b.clear();
            this.f7849a.writeLock().unlock();
            this.f7852d.post(new f(arrayList, this.f7851c));
        } catch (Throwable th) {
            this.f7849a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i7, int i8) {
        return q(charSequence, i7, i8, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public CharSequence q(CharSequence charSequence, int i7, int i8, int i9) {
        return r(charSequence, i7, i8, i9, 0);
    }

    public CharSequence r(CharSequence charSequence, int i7, int i8, int i9, int i10) {
        boolean z6;
        androidx.core.util.f.h(j(), "Not initialized yet");
        androidx.core.util.f.d(i7, "start cannot be negative");
        androidx.core.util.f.d(i8, "end cannot be negative");
        androidx.core.util.f.d(i9, "maxEmojiCount cannot be negative");
        androidx.core.util.f.a(i7 <= i8, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.f.a(i7 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.f.a(i8 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i7 == i8) {
            return charSequence;
        }
        if (i10 != 1) {
            z6 = i10 != 2 ? this.f7855g : false;
        } else {
            z6 = true;
        }
        return this.f7853e.b(charSequence, i7, i8, i9, z6);
    }

    public void s(AbstractC0156e abstractC0156e) {
        androidx.core.util.f.g(abstractC0156e, "initCallback cannot be null");
        this.f7849a.writeLock().lock();
        try {
            if (this.f7851c == 1 || this.f7851c == 2) {
                this.f7852d.post(new f(abstractC0156e, this.f7851c));
            } else {
                this.f7850b.add(abstractC0156e);
            }
            this.f7849a.writeLock().unlock();
        } catch (Throwable th) {
            this.f7849a.writeLock().unlock();
            throw th;
        }
    }

    public void t(AbstractC0156e abstractC0156e) {
        androidx.core.util.f.g(abstractC0156e, "initCallback cannot be null");
        this.f7849a.writeLock().lock();
        try {
            this.f7850b.remove(abstractC0156e);
        } finally {
            this.f7849a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f7853e.c(editorInfo);
    }
}
