package V3;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class a implements U3.c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f4149m = new C0093a("KEY", 0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f4150n = new b("VALUE", 1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ a[] f4151o = e();

        /* JADX INFO: renamed from: V3.z$a$a, reason: collision with other inner class name */
        enum C0093a extends a {
            C0093a(String str, int i7) {
                super(str, i7, null);
            }

            @Override // U3.c
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        enum b extends a {
            b(String str, int i7) {
                super(str, i7, null);
            }

            @Override // U3.c
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private a(String str, int i7) {
        }

        private static /* synthetic */ a[] e() {
            return new a[]{f4149m, f4150n};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f4151o.clone();
        }

        /* synthetic */ a(String str, int i7, y yVar) {
            this(str, i7);
        }
    }

    static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static U3.c b() {
        return a.f4149m;
    }

    static String c(Map map) {
        StringBuilder sbA = AbstractC0480h.a(map.size());
        sbA.append('{');
        boolean z6 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z6) {
                sbA.append(", ");
            }
            sbA.append(entry.getKey());
            sbA.append('=');
            sbA.append(entry.getValue());
            z6 = false;
        }
        sbA.append('}');
        return sbA.toString();
    }

    static U3.c d() {
        return a.f4150n;
    }
}
