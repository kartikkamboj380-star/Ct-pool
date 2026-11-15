package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b[] f7205b;

        public a(int i7, b[] bVarArr) {
            this.f7204a = i7;
            this.f7205b = bVarArr;
        }

        static a a(int i7, b[] bVarArr) {
            return new a(i7, bVarArr);
        }

        public b[] b() {
            return this.f7205b;
        }

        public int c() {
            return this.f7204a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f7206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f7209d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f7210e;

        public b(Uri uri, int i7, int i8, boolean z6, int i9) {
            this.f7206a = (Uri) androidx.core.util.f.f(uri);
            this.f7207b = i7;
            this.f7208c = i8;
            this.f7209d = z6;
            this.f7210e = i9;
        }

        static b a(Uri uri, int i7, int i8, boolean z6, int i9) {
            return new b(uri, i7, i8, z6, i9);
        }

        public int b() {
            return this.f7210e;
        }

        public int c() {
            return this.f7207b;
        }

        public Uri d() {
            return this.f7206a;
        }

        public int e() {
            return this.f7208c;
        }

        public boolean f() {
            return this.f7209d;
        }
    }

    public static class c {
        public abstract void a(int i7);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return androidx.core.graphics.d.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i7, boolean z6, int i8, Handler handler, c cVar) {
        androidx.core.provider.a aVar = new androidx.core.provider.a(cVar, handler);
        return z6 ? f.e(context, eVar, aVar, i7, i8) : f.d(context, eVar, i7, null, aVar);
    }
}
