package l0;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f21040a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile i f21041b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f21042c = 20;

    public static class a extends i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f21043d;

        public a(int i7) {
            super(i7);
            this.f21043d = i7;
        }

        @Override // l0.i
        public void a(String str, String str2) {
            if (this.f21043d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // l0.i
        public void b(String str, String str2, Throwable th) {
            if (this.f21043d <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // l0.i
        public void c(String str, String str2) {
            if (this.f21043d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // l0.i
        public void d(String str, String str2, Throwable th) {
            if (this.f21043d <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // l0.i
        public void f(String str, String str2) {
            if (this.f21043d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // l0.i
        public void g(String str, String str2, Throwable th) {
            if (this.f21043d <= 4) {
                Log.i(str, str2, th);
            }
        }

        @Override // l0.i
        public void j(String str, String str2) {
            if (this.f21043d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // l0.i
        public void k(String str, String str2) {
            if (this.f21043d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // l0.i
        public void l(String str, String str2, Throwable th) {
            if (this.f21043d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public i(int i7) {
    }

    public static i e() {
        i iVar;
        synchronized (f21040a) {
            try {
                if (f21041b == null) {
                    f21041b = new a(3);
                }
                iVar = f21041b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public static void h(i iVar) {
        synchronized (f21040a) {
            f21041b = iVar;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i7 = f21042c;
        if (length >= i7) {
            str = str.substring(0, i7);
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th);
}
