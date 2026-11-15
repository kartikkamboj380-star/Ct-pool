package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.view.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0584d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f7402a;

    /* JADX INFO: renamed from: androidx.core.view.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f7403a;

        public a(ClipData clipData, int i7) {
            this.f7403a = Build.VERSION.SDK_INT >= 31 ? new b(clipData, i7) : new C0148d(clipData, i7);
        }

        public C0584d a() {
            return this.f7403a.a();
        }

        public a b(Bundle bundle) {
            this.f7403a.setExtras(bundle);
            return this;
        }

        public a c(int i7) {
            this.f7403a.c(i7);
            return this;
        }

        public a d(Uri uri) {
            this.f7403a.b(uri);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$b */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f7404a;

        b(ClipData clipData, int i7) {
            this.f7404a = AbstractC0587g.a(clipData, i7);
        }

        @Override // androidx.core.view.C0584d.c
        public C0584d a() {
            return new C0584d(new e(this.f7404a.build()));
        }

        @Override // androidx.core.view.C0584d.c
        public void b(Uri uri) {
            this.f7404a.setLinkUri(uri);
        }

        @Override // androidx.core.view.C0584d.c
        public void c(int i7) {
            this.f7404a.setFlags(i7);
        }

        @Override // androidx.core.view.C0584d.c
        public void setExtras(Bundle bundle) {
            this.f7404a.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$c */
    private interface c {
        C0584d a();

        void b(Uri uri);

        void c(int i7);

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: androidx.core.view.d$d, reason: collision with other inner class name */
    private static final class C0148d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ClipData f7405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Uri f7408d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f7409e;

        C0148d(ClipData clipData, int i7) {
            this.f7405a = clipData;
            this.f7406b = i7;
        }

        @Override // androidx.core.view.C0584d.c
        public C0584d a() {
            return new C0584d(new g(this));
        }

        @Override // androidx.core.view.C0584d.c
        public void b(Uri uri) {
            this.f7408d = uri;
        }

        @Override // androidx.core.view.C0584d.c
        public void c(int i7) {
            this.f7407c = i7;
        }

        @Override // androidx.core.view.C0584d.c
        public void setExtras(Bundle bundle) {
            this.f7409e = bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$e */
    private static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo f7410a;

        e(ContentInfo contentInfo) {
            this.f7410a = AbstractC0583c.a(androidx.core.util.f.f(contentInfo));
        }

        @Override // androidx.core.view.C0584d.f
        public ClipData a() {
            return this.f7410a.getClip();
        }

        @Override // androidx.core.view.C0584d.f
        public int b() {
            return this.f7410a.getFlags();
        }

        @Override // androidx.core.view.C0584d.f
        public ContentInfo c() {
            return this.f7410a;
        }

        @Override // androidx.core.view.C0584d.f
        public int d() {
            return this.f7410a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f7410a + "}";
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.d$f */
    private interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* JADX INFO: renamed from: androidx.core.view.d$g */
    private static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClipData f7411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f7414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f7415e;

        g(C0148d c0148d) {
            this.f7411a = (ClipData) androidx.core.util.f.f(c0148d.f7405a);
            this.f7412b = androidx.core.util.f.b(c0148d.f7406b, 0, 5, "source");
            this.f7413c = androidx.core.util.f.e(c0148d.f7407c, 1);
            this.f7414d = c0148d.f7408d;
            this.f7415e = c0148d.f7409e;
        }

        @Override // androidx.core.view.C0584d.f
        public ClipData a() {
            return this.f7411a;
        }

        @Override // androidx.core.view.C0584d.f
        public int b() {
            return this.f7413c;
        }

        @Override // androidx.core.view.C0584d.f
        public ContentInfo c() {
            return null;
        }

        @Override // androidx.core.view.C0584d.f
        public int d() {
            return this.f7412b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f7411a.getDescription());
            sb.append(", source=");
            sb.append(C0584d.e(this.f7412b));
            sb.append(", flags=");
            sb.append(C0584d.a(this.f7413c));
            if (this.f7414d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f7414d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f7415e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    C0584d(f fVar) {
        this.f7402a = fVar;
    }

    static String a(int i7) {
        return (i7 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i7);
    }

    static String e(int i7) {
        return i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? String.valueOf(i7) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C0584d g(ContentInfo contentInfo) {
        return new C0584d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f7402a.a();
    }

    public int c() {
        return this.f7402a.b();
    }

    public int d() {
        return this.f7402a.d();
    }

    public ContentInfo f() {
        ContentInfo contentInfoC = this.f7402a.c();
        Objects.requireNonNull(contentInfoC);
        return AbstractC0583c.a(contentInfoC);
    }

    public String toString() {
        return this.f7402a.toString();
    }
}
