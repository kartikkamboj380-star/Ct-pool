package R4;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements R4.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f2843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f2844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f2845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f2846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f2847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f2848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f2849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ b[] f2850t;

    enum a extends b {
        a(String str, int i7) {
            super(str, i7, null);
        }

        @Override // R4.c
        public String e(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f2843m = aVar;
        b bVar = new b("UPPER_CAMEL_CASE", 1) { // from class: R4.b.b
            {
                a aVar2 = null;
            }

            @Override // R4.c
            public String e(Field field) {
                return b.j(field.getName());
            }
        };
        f2844n = bVar;
        b bVar2 = new b("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: R4.b.c
            {
                a aVar2 = null;
            }

            @Override // R4.c
            public String e(Field field) {
                return b.j(b.h(field.getName(), ' '));
            }
        };
        f2845o = bVar2;
        b bVar3 = new b("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: R4.b.d
            {
                a aVar2 = null;
            }

            @Override // R4.c
            public String e(Field field) {
                return b.h(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f2846p = bVar3;
        b bVar4 = new b("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: R4.b.e
            {
                a aVar2 = null;
            }

            @Override // R4.c
            public String e(Field field) {
                return b.h(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f2847q = bVar4;
        b bVar5 = new b("LOWER_CASE_WITH_DASHES", 5) { // from class: R4.b.f
            {
                a aVar2 = null;
            }

            @Override // R4.c
            public String e(Field field) {
                return b.h(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        f2848r = bVar5;
        b bVar6 = new b("LOWER_CASE_WITH_DOTS", 6) { // from class: R4.b.g
            {
                a aVar2 = null;
            }

            @Override // R4.c
            public String e(Field field) {
                return b.h(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        f2849s = bVar6;
        f2850t = new b[]{aVar, bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
    }

    private b(String str, int i7) {
    }

    static String h(String str, char c7) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c7);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    static String j(String str) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i7 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i7) + upperCase + str.substring(i7 + 1);
            }
        }
        return str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f2850t.clone();
    }

    /* synthetic */ b(String str, int i7, a aVar) {
        this(str, i7);
    }
}
