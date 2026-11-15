package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import u.AbstractC2077b;

/* JADX INFO: renamed from: androidx.core.app.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0559k {

    /* JADX INFO: renamed from: androidx.core.app.k$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f6966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f6967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Y[] f6968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Y[] f6969d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f6970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f6971f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f6972g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f6973h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f6974i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f6975j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f6976k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f6977l;

        /* JADX INFO: renamed from: androidx.core.app.k$a$a, reason: collision with other inner class name */
        public static final class C0132a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final IconCompat f6978a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CharSequence f6979b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final PendingIntent f6980c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f6981d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final Bundle f6982e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private ArrayList f6983f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f6984g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private boolean f6985h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private boolean f6986i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private boolean f6987j;

            public C0132a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void c() {
                if (this.f6986i && this.f6980c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public C0132a a(Y y6) {
                if (this.f6983f == null) {
                    this.f6983f = new ArrayList();
                }
                if (y6 != null) {
                    this.f6983f.add(y6);
                }
                return this;
            }

            public a b() {
                c();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<Y> arrayList3 = this.f6983f;
                if (arrayList3 != null) {
                    for (Y y6 : arrayList3) {
                        if (y6.k()) {
                            arrayList.add(y6);
                        } else {
                            arrayList2.add(y6);
                        }
                    }
                }
                return new a(this.f6978a, this.f6979b, this.f6980c, this.f6982e, arrayList2.isEmpty() ? null : (Y[]) arrayList2.toArray(new Y[arrayList2.size()]), arrayList.isEmpty() ? null : (Y[]) arrayList.toArray(new Y[arrayList.size()]), this.f6981d, this.f6984g, this.f6985h, this.f6986i, this.f6987j);
            }

            public C0132a d(boolean z6) {
                this.f6981d = z6;
                return this;
            }

            private C0132a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, Y[] yArr, boolean z6, int i7, boolean z7, boolean z8, boolean z9) {
                this.f6981d = true;
                this.f6985h = true;
                this.f6978a = iconCompat;
                this.f6979b = e.f(charSequence);
                this.f6980c = pendingIntent;
                this.f6982e = bundle;
                this.f6983f = yArr == null ? null : new ArrayList(Arrays.asList(yArr));
                this.f6981d = z6;
                this.f6984g = i7;
                this.f6985h = z7;
                this.f6986i = z8;
                this.f6987j = z9;
            }
        }

        public a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i7 != 0 ? IconCompat.i(null, "", i7) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f6976k;
        }

        public boolean b() {
            return this.f6970e;
        }

        public Bundle c() {
            return this.f6966a;
        }

        public IconCompat d() {
            int i7;
            if (this.f6967b == null && (i7 = this.f6974i) != 0) {
                this.f6967b = IconCompat.i(null, "", i7);
            }
            return this.f6967b;
        }

        public Y[] e() {
            return this.f6968c;
        }

        public int f() {
            return this.f6972g;
        }

        public boolean g() {
            return this.f6971f;
        }

        public CharSequence h() {
            return this.f6975j;
        }

        public boolean i() {
            return this.f6977l;
        }

        public boolean j() {
            return this.f6973h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, Y[] yArr, Y[] yArr2, boolean z6, int i7, boolean z7, boolean z8, boolean z9) {
            this.f6971f = true;
            this.f6967b = iconCompat;
            if (iconCompat != null && iconCompat.m() == 2) {
                this.f6974i = iconCompat.k();
            }
            this.f6975j = e.f(charSequence);
            this.f6976k = pendingIntent;
            this.f6966a = bundle == null ? new Bundle() : bundle;
            this.f6968c = yArr;
            this.f6969d = yArr2;
            this.f6970e = z6;
            this.f6972g = i7;
            this.f6971f = z7;
            this.f6973h = z8;
            this.f6977l = z9;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.k$b */
    public static class b extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private IconCompat f6988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private IconCompat f6989f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f6990g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f6991h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f6992i;

        /* JADX INFO: renamed from: androidx.core.app.k$b$a */
        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.k$b$b, reason: collision with other inner class name */
        private static class C0133b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.k$b$c */
        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z6) {
                bigPictureStyle.showBigPictureWhenCollapsed(z6);
            }
        }

        @Override // androidx.core.app.AbstractC0559k.h
        public void b(InterfaceC0558j interfaceC0558j) {
            int i7 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(interfaceC0558j.a()).setBigContentTitle(this.f7055b);
            IconCompat iconCompat = this.f6988e;
            if (iconCompat != null) {
                if (i7 >= 31) {
                    c.a(bigContentTitle, this.f6988e.t(interfaceC0558j instanceof G ? ((G) interfaceC0558j).f() : null));
                } else if (iconCompat.m() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f6988e.j());
                }
            }
            if (this.f6990g) {
                if (this.f6989f == null) {
                    a.a(bigContentTitle, null);
                } else {
                    C0133b.a(bigContentTitle, this.f6989f.t(interfaceC0558j instanceof G ? ((G) interfaceC0558j).f() : null));
                }
            }
            if (this.f7057d) {
                a.b(bigContentTitle, this.f7056c);
            }
            if (i7 >= 31) {
                c.c(bigContentTitle, this.f6992i);
                c.b(bigContentTitle, this.f6991h);
            }
        }

        @Override // androidx.core.app.AbstractC0559k.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f6989f = bitmap == null ? null : IconCompat.f(bitmap);
            this.f6990g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f6988e = bitmap == null ? null : IconCompat.f(bitmap);
            return this;
        }

        public b j(CharSequence charSequence) {
            this.f7055b = e.f(charSequence);
            return this;
        }

        public b k(CharSequence charSequence) {
            this.f7056c = e.f(charSequence);
            this.f7057d = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.k$c */
    public static class c extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f6993e;

        @Override // androidx.core.app.AbstractC0559k.h
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.AbstractC0559k.h
        public void b(InterfaceC0558j interfaceC0558j) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(interfaceC0558j.a()).setBigContentTitle(this.f7055b).bigText(this.f6993e);
            if (this.f7057d) {
                bigTextStyleBigText.setSummaryText(this.f7056c);
            }
        }

        @Override // androidx.core.app.AbstractC0559k.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f6993e = e.f(charSequence);
            return this;
        }

        public c i(CharSequence charSequence) {
            this.f7055b = e.f(charSequence);
            return this;
        }

        public c j(CharSequence charSequence) {
            this.f7056c = e.f(charSequence);
            this.f7057d = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.k$d */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.k$e */
    public static class e {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        boolean f6994A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        boolean f6995B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        boolean f6996C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        String f6997D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        Bundle f6998E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        int f6999F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f7000G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        Notification f7001H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        RemoteViews f7002I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        RemoteViews f7003J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        RemoteViews f7004K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        String f7005L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        int f7006M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        String f7007N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        long f7008O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        int f7009P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        int f7010Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        boolean f7011R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        Notification f7012S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        boolean f7013T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        Icon f7014U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public ArrayList f7015V;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f7016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f7017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f7018c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f7019d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f7020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f7021f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        PendingIntent f7022g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f7023h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        RemoteViews f7024i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Bitmap f7025j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        CharSequence f7026k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f7027l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f7028m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f7029n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f7030o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f7031p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        h f7032q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f7033r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence f7034s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        CharSequence[] f7035t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f7036u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f7037v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f7038w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f7039x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f7040y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        String f7041z;

        public e(Context context) {
            this(context, null);
        }

        protected static CharSequence f(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap g(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f7016a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC2077b.f22341b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC2077b.f22340a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
        }

        private void u(int i7, boolean z6) {
            Notification notification;
            int i8;
            if (z6) {
                notification = this.f7012S;
                i8 = i7 | notification.flags;
            } else {
                notification = this.f7012S;
                i8 = (~i7) & notification.flags;
            }
            notification.flags = i8;
        }

        public e A(int i7, int i8, int i9) {
            Notification notification = this.f7012S;
            notification.ledARGB = i7;
            notification.ledOnMS = i8;
            notification.ledOffMS = i9;
            notification.flags = ((i8 == 0 || i9 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e B(boolean z6) {
            this.f6994A = z6;
            return this;
        }

        public e C(int i7) {
            this.f7027l = i7;
            return this;
        }

        public e D(boolean z6) {
            u(2, z6);
            return this;
        }

        public e E(boolean z6) {
            u(8, z6);
            return this;
        }

        public e F(int i7) {
            this.f7028m = i7;
            return this;
        }

        public e G(int i7, int i8, boolean z6) {
            this.f7036u = i7;
            this.f7037v = i8;
            this.f7038w = z6;
            return this;
        }

        public e H(CharSequence[] charSequenceArr) {
            this.f7035t = charSequenceArr;
            return this;
        }

        public e I(String str) {
            this.f7007N = str;
            return this;
        }

        public e J(boolean z6) {
            this.f7029n = z6;
            return this;
        }

        public e K(int i7) {
            this.f7012S.icon = i7;
            return this;
        }

        public e L(int i7, int i8) {
            Notification notification = this.f7012S;
            notification.icon = i7;
            notification.iconLevel = i8;
            return this;
        }

        public e M(String str) {
            this.f7041z = str;
            return this;
        }

        public e N(Uri uri) {
            Notification notification = this.f7012S;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        public e O(h hVar) {
            if (this.f7032q != hVar) {
                this.f7032q = hVar;
                if (hVar != null) {
                    hVar.g(this);
                }
            }
            return this;
        }

        public e P(CharSequence charSequence) {
            this.f7033r = f(charSequence);
            return this;
        }

        public e Q(CharSequence charSequence) {
            this.f7012S.tickerText = f(charSequence);
            return this;
        }

        public e R(long j7) {
            this.f7008O = j7;
            return this;
        }

        public e S(boolean z6) {
            this.f7030o = z6;
            return this;
        }

        public e T(long[] jArr) {
            this.f7012S.vibrate = jArr;
            return this;
        }

        public e U(int i7) {
            this.f7000G = i7;
            return this;
        }

        public e V(long j7) {
            this.f7012S.when = j7;
            return this;
        }

        public e a(int i7, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f7017b.add(new a(i7, charSequence, pendingIntent));
            return this;
        }

        public e b(a aVar) {
            if (aVar != null) {
                this.f7017b.add(aVar);
            }
            return this;
        }

        public e c(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f6998E;
                if (bundle2 == null) {
                    this.f6998E = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        public Notification d() {
            return new G(this).c();
        }

        public Bundle e() {
            if (this.f6998E == null) {
                this.f6998E = new Bundle();
            }
            return this.f6998E;
        }

        public e h(boolean z6) {
            u(16, z6);
            return this;
        }

        public e i(int i7) {
            this.f7006M = i7;
            return this;
        }

        public e j(String str) {
            this.f6997D = str;
            return this;
        }

        public e k(String str) {
            this.f7005L = str;
            return this;
        }

        public e l(boolean z6) {
            this.f7031p = z6;
            e().putBoolean("android.chronometerCountDown", z6);
            return this;
        }

        public e m(int i7) {
            this.f6999F = i7;
            return this;
        }

        public e n(boolean z6) {
            this.f6995B = z6;
            this.f6996C = true;
            return this;
        }

        public e o(PendingIntent pendingIntent) {
            this.f7022g = pendingIntent;
            return this;
        }

        public e p(CharSequence charSequence) {
            this.f7021f = f(charSequence);
            return this;
        }

        public e q(CharSequence charSequence) {
            this.f7020e = f(charSequence);
            return this;
        }

        public e r(int i7) {
            Notification notification = this.f7012S;
            notification.defaults = i7;
            if ((i7 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e s(PendingIntent pendingIntent) {
            this.f7012S.deleteIntent = pendingIntent;
            return this;
        }

        public e t(Bundle bundle) {
            this.f6998E = bundle;
            return this;
        }

        public e v(PendingIntent pendingIntent, boolean z6) {
            this.f7023h = pendingIntent;
            u(128, z6);
            return this;
        }

        public e w(String str) {
            this.f7039x = str;
            return this;
        }

        public e x(int i7) {
            this.f7009P = i7;
            return this;
        }

        public e y(boolean z6) {
            this.f7040y = z6;
            return this;
        }

        public e z(Bitmap bitmap) {
            this.f7025j = g(bitmap);
            return this;
        }

        public e(Context context, String str) {
            this.f7017b = new ArrayList();
            this.f7018c = new ArrayList();
            this.f7019d = new ArrayList();
            this.f7029n = true;
            this.f6994A = false;
            this.f6999F = 0;
            this.f7000G = 0;
            this.f7006M = 0;
            this.f7009P = 0;
            this.f7010Q = 0;
            Notification notification = new Notification();
            this.f7012S = notification;
            this.f7016a = context;
            this.f7005L = str;
            notification.when = System.currentTimeMillis();
            this.f7012S.audioStreamType = -1;
            this.f7028m = 0;
            this.f7015V = new ArrayList();
            this.f7011R = true;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.k$f */
    public static class f extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ArrayList f7042e = new ArrayList();

        @Override // androidx.core.app.AbstractC0559k.h
        public void b(InterfaceC0558j interfaceC0558j) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(interfaceC0558j.a()).setBigContentTitle(this.f7055b);
            if (this.f7057d) {
                bigContentTitle.setSummaryText(this.f7056c);
            }
            Iterator it = this.f7042e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine((CharSequence) it.next());
            }
        }

        @Override // androidx.core.app.AbstractC0559k.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public f h(CharSequence charSequence) {
            if (charSequence != null) {
                this.f7042e.add(e.f(charSequence));
            }
            return this;
        }

        public f i(CharSequence charSequence) {
            this.f7055b = e.f(charSequence);
            return this;
        }

        public f j(CharSequence charSequence) {
            this.f7056c = e.f(charSequence);
            this.f7057d = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.k$g */
    public static class g extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f7043e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f7044f = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private W f7045g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f7046h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Boolean f7047i;

        /* JADX INFO: renamed from: androidx.core.app.k$g$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CharSequence f7048a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f7049b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final W f7050c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Bundle f7051d = new Bundle();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f7052e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Uri f7053f;

            public a(CharSequence charSequence, long j7, W w6) {
                this.f7048a = charSequence;
                this.f7049b = j7;
                this.f7050c = w6;
            }

            static Bundle[] a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    bundleArr[i7] = ((a) list.get(i7)).h();
                }
                return bundleArr;
            }

            private Bundle h() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f7048a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f7049b);
                W w6 = this.f7050c;
                if (w6 != null) {
                    bundle.putCharSequence("sender", w6.c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f7050c.h());
                    } else {
                        bundle.putBundle("person", this.f7050c.i());
                    }
                }
                String str = this.f7052e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f7053f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f7051d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.f7052e;
            }

            public Uri c() {
                return this.f7053f;
            }

            public W d() {
                return this.f7050c;
            }

            public CharSequence e() {
                return this.f7048a;
            }

            public long f() {
                return this.f7049b;
            }

            Notification.MessagingStyle.Message g() {
                Notification.MessagingStyle.Message message;
                W wD = d();
                if (Build.VERSION.SDK_INT >= 28) {
                    AbstractC0565q.a();
                    message = AbstractC0564p.a(e(), f(), wD != null ? wD.h() : null);
                } else {
                    message = new Notification.MessagingStyle.Message(e(), f(), wD != null ? wD.c() : null);
                }
                if (b() != null) {
                    message.setData(b(), c());
                }
                return message;
            }
        }

        public g(W w6) {
            if (TextUtils.isEmpty(w6.c())) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.f7045g = w6;
        }

        @Override // androidx.core.app.AbstractC0559k.h
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f7045g.c());
            bundle.putBundle("android.messagingStyleUser", this.f7045g.i());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f7046h);
            if (this.f7046h != null && this.f7047i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f7046h);
            }
            if (!this.f7043e.isEmpty()) {
                bundle.putParcelableArray("android.messages", a.a(this.f7043e));
            }
            if (!this.f7044f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", a.a(this.f7044f));
            }
            Boolean bool = this.f7047i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.AbstractC0559k.h
        public void b(InterfaceC0558j interfaceC0558j) {
            Notification.MessagingStyle messagingStyle;
            l(j());
            if (Build.VERSION.SDK_INT >= 28) {
                AbstractC0561m.a();
                messagingStyle = AbstractC0560l.a(this.f7045g.h());
            } else {
                messagingStyle = new Notification.MessagingStyle(this.f7045g.c());
            }
            Iterator it = this.f7043e.iterator();
            while (it.hasNext()) {
                messagingStyle.addMessage(((a) it.next()).g());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it2 = this.f7044f.iterator();
                while (it2.hasNext()) {
                    messagingStyle.addHistoricMessage(((a) it2.next()).g());
                }
            }
            if (this.f7047i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setConversationTitle(this.f7046h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setGroupConversation(this.f7047i.booleanValue());
            }
            messagingStyle.setBuilder(interfaceC0558j.a());
        }

        @Override // androidx.core.app.AbstractC0559k.h
        protected String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public g h(a aVar) {
            if (aVar != null) {
                this.f7043e.add(aVar);
                if (this.f7043e.size() > 25) {
                    this.f7043e.remove(0);
                }
            }
            return this;
        }

        public g i(CharSequence charSequence, long j7, W w6) {
            h(new a(charSequence, j7, w6));
            return this;
        }

        public boolean j() {
            e eVar = this.f7054a;
            if (eVar != null && eVar.f7016a.getApplicationInfo().targetSdkVersion < 28 && this.f7047i == null) {
                return this.f7046h != null;
            }
            Boolean bool = this.f7047i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public g k(CharSequence charSequence) {
            this.f7046h = charSequence;
            return this;
        }

        public g l(boolean z6) {
            this.f7047i = Boolean.valueOf(z6);
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.k$h */
    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected e f7054a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f7055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f7056c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f7057d = false;

        public void a(Bundle bundle) {
            if (this.f7057d) {
                bundle.putCharSequence("android.summaryText", this.f7056c);
            }
            CharSequence charSequence = this.f7055b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(InterfaceC0558j interfaceC0558j);

        protected abstract String c();

        public RemoteViews d(InterfaceC0558j interfaceC0558j) {
            return null;
        }

        public RemoteViews e(InterfaceC0558j interfaceC0558j) {
            return null;
        }

        public RemoteViews f(InterfaceC0558j interfaceC0558j) {
            return null;
        }

        public void g(e eVar) {
            if (this.f7054a != eVar) {
                this.f7054a = eVar;
                if (eVar != null) {
                    eVar.O(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }
}
