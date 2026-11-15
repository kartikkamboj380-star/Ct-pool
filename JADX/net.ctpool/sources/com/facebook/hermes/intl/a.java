package com.facebook.hermes.intl;

/* JADX INFO: loaded from: classes.dex */
public interface a {

    /* JADX INFO: renamed from: com.facebook.hermes.intl.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0199a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f10516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f10517c;

        static {
            int[] iArr = new int[b.values().length];
            f10517c = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10517c[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10517c[b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.values().length];
            f10516b = iArr2;
            try {
                iArr2[d.SORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10516b[d.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[c.values().length];
            f10515a = iArr3;
            try {
                iArr3[c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10515a[c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10515a[c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10515a[c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10515a[c.LOCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public enum b {
        UPPER,
        LOWER,
        FALSE;

        @Override // java.lang.Enum
        public String toString() {
            int i7 = C0199a.f10517c[ordinal()];
            if (i7 == 1) {
                return "upper";
            }
            if (i7 == 2) {
                return "lower";
            }
            if (i7 == 3) {
                return "false";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum c {
        BASE,
        ACCENT,
        CASE,
        VARIANT,
        LOCALE;

        @Override // java.lang.Enum
        public String toString() {
            int i7 = C0199a.f10515a[ordinal()];
            if (i7 == 1) {
                return "base";
            }
            if (i7 == 2) {
                return "accent";
            }
            if (i7 == 3) {
                return "case";
            }
            if (i7 == 4) {
                return "variant";
            }
            if (i7 == 5) {
                return "";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum d {
        SORT,
        SEARCH;

        @Override // java.lang.Enum
        public String toString() {
            int i7 = C0199a.f10516b[ordinal()];
            if (i7 == 1) {
                return "sort";
            }
            if (i7 == 2) {
                return "search";
            }
            throw new IllegalArgumentException();
        }
    }

    int a(String str, String str2);

    c b();

    a c(q1.b bVar);

    a d(b bVar);

    a e(boolean z6);

    a f(c cVar);

    a g(boolean z6);
}
