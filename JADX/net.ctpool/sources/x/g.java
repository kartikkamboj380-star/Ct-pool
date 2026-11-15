package x;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f22748a;

    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InputContentInfo f22749a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f22749a = new InputContentInfo(uri, clipDescription, uri2);
        }

        @Override // x.g.c
        public Uri a() {
            return this.f22749a.getContentUri();
        }

        @Override // x.g.c
        public void b() {
            this.f22749a.requestPermission();
        }

        @Override // x.g.c
        public Uri c() {
            return this.f22749a.getLinkUri();
        }

        @Override // x.g.c
        public Object d() {
            return this.f22749a;
        }

        @Override // x.g.c
        public ClipDescription getDescription() {
            return this.f22749a.getDescription();
        }

        a(Object obj) {
            this.f22749a = (InputContentInfo) obj;
        }
    }

    private interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f22748a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public static g f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new g(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f22748a.a();
    }

    public ClipDescription b() {
        return this.f22748a.getDescription();
    }

    public Uri c() {
        return this.f22748a.c();
    }

    public void d() {
        this.f22748a.b();
    }

    public Object e() {
        return this.f22748a.d();
    }

    private g(c cVar) {
        this.f22748a = cVar;
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f22750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClipDescription f22751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f22752c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f22750a = uri;
            this.f22751b = clipDescription;
            this.f22752c = uri2;
        }

        @Override // x.g.c
        public Uri a() {
            return this.f22750a;
        }

        @Override // x.g.c
        public Uri c() {
            return this.f22752c;
        }

        @Override // x.g.c
        public Object d() {
            return null;
        }

        @Override // x.g.c
        public ClipDescription getDescription() {
            return this.f22751b;
        }

        @Override // x.g.c
        public void b() {
        }
    }
}
