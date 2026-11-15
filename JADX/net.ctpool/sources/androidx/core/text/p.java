package androidx.core.text;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f7246a = new e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f7247b = new e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f7248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f7249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f7250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f7251f;

    private static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final a f7252b = new a(true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f7253a;

        private a(boolean z6) {
            this.f7253a = z6;
        }

        @Override // androidx.core.text.p.c
        public int a(CharSequence charSequence, int i7, int i8) {
            int i9 = i8 + i7;
            boolean z6 = false;
            while (i7 < i9) {
                int iA = p.a(Character.getDirectionality(charSequence.charAt(i7)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i7++;
                        z6 = z6;
                    } else if (!this.f7253a) {
                        return 1;
                    }
                } else if (this.f7253a) {
                    return 0;
                }
                z6 = true;
                i7++;
                z6 = z6;
            }
            if (z6) {
                return this.f7253a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f7254a = new b();

        private b() {
        }

        @Override // androidx.core.text.p.c
        public int a(CharSequence charSequence, int i7, int i8) {
            int i9 = i8 + i7;
            int iB = 2;
            while (i7 < i9 && iB == 2) {
                iB = p.b(Character.getDirectionality(charSequence.charAt(i7)));
                i7++;
            }
            return iB;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i7, int i8);
    }

    private static abstract class d implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f7255a;

        d(c cVar) {
            this.f7255a = cVar;
        }

        private boolean c(CharSequence charSequence, int i7, int i8) {
            int iA = this.f7255a.a(charSequence, i7, i8);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }

        @Override // androidx.core.text.o
        public boolean a(CharSequence charSequence, int i7, int i8) {
            if (charSequence == null || i7 < 0 || i8 < 0 || charSequence.length() - i8 < i7) {
                throw new IllegalArgumentException();
            }
            return this.f7255a == null ? b() : c(charSequence, i7, i8);
        }

        protected abstract boolean b();
    }

    private static class e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f7256b;

        e(c cVar, boolean z6) {
            super(cVar);
            this.f7256b = z6;
        }

        @Override // androidx.core.text.p.d
        protected boolean b() {
            return this.f7256b;
        }
    }

    private static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f7257b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.p.d
        protected boolean b() {
            return q.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f7254a;
        f7248c = new e(bVar, false);
        f7249d = new e(bVar, true);
        f7250e = new e(a.f7252b, false);
        f7251f = f.f7257b;
    }

    static int a(int i7) {
        if (i7 != 0) {
            return (i7 == 1 || i7 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i7) {
        if (i7 != 0) {
            if (i7 == 1 || i7 == 2) {
                return 0;
            }
            switch (i7) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
