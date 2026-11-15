package X;

import F5.g;
import androidx.room.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f4259e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f4261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f4262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f4263d;

    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0097a f4264h = new C0097a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f4266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f4267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f4268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f4269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f4270f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f4271g;

        /* JADX INFO: renamed from: X.e$a$a, reason: collision with other inner class name */
        public static final class C0097a {
            private C0097a() {
            }

            private final boolean a(String str) {
                if (str.length() == 0) {
                    return false;
                }
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i7 < str.length()) {
                    char cCharAt = str.charAt(i7);
                    int i10 = i9 + 1;
                    if (i9 == 0 && cCharAt != '(') {
                        return false;
                    }
                    if (cCharAt == '(') {
                        i8++;
                    } else if (cCharAt == ')' && i8 - 1 == 0 && i9 != str.length() - 1) {
                        return false;
                    }
                    i7++;
                    i9 = i10;
                }
                return i8 == 0;
            }

            public final boolean b(String str, String str2) {
                k.f(str, "current");
                if (k.b(str, str2)) {
                    return true;
                }
                if (!a(str)) {
                    return false;
                }
                String strSubstring = str.substring(1, str.length() - 1);
                k.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return k.b(g.C0(strSubstring).toString(), str2);
            }

            public /* synthetic */ C0097a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a(String str, String str2, boolean z6, int i7, String str3, int i8) {
            k.f(str, "name");
            k.f(str2, "type");
            this.f4265a = str;
            this.f4266b = str2;
            this.f4267c = z6;
            this.f4268d = i7;
            this.f4269e = str3;
            this.f4270f = i8;
            this.f4271g = a(str2);
        }

        private final int a(String str) {
            if (str == null) {
                return 5;
            }
            Locale locale = Locale.US;
            k.e(locale, "US");
            String upperCase = str.toUpperCase(locale);
            k.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (g.G(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (g.G(upperCase, "CHAR", false, 2, null) || g.G(upperCase, "CLOB", false, 2, null) || g.G(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (g.G(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (g.G(upperCase, "REAL", false, 2, null) || g.G(upperCase, "FLOA", false, 2, null) || g.G(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a) || this.f4268d != ((a) obj).f4268d) {
                return false;
            }
            a aVar = (a) obj;
            if (!k.b(this.f4265a, aVar.f4265a) || this.f4267c != aVar.f4267c) {
                return false;
            }
            if (this.f4270f == 1 && aVar.f4270f == 2 && (str3 = this.f4269e) != null && !f4264h.b(str3, aVar.f4269e)) {
                return false;
            }
            if (this.f4270f == 2 && aVar.f4270f == 1 && (str2 = aVar.f4269e) != null && !f4264h.b(str2, this.f4269e)) {
                return false;
            }
            int i7 = this.f4270f;
            return (i7 == 0 || i7 != aVar.f4270f || ((str = this.f4269e) == null ? aVar.f4269e == null : f4264h.b(str, aVar.f4269e))) && this.f4271g == aVar.f4271g;
        }

        public int hashCode() {
            return (((((this.f4265a.hashCode() * 31) + this.f4271g) * 31) + (this.f4267c ? 1231 : 1237)) * 31) + this.f4268d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.f4265a);
            sb.append("', type='");
            sb.append(this.f4266b);
            sb.append("', affinity='");
            sb.append(this.f4271g);
            sb.append("', notNull=");
            sb.append(this.f4267c);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f4268d);
            sb.append(", defaultValue='");
            String str = this.f4269e;
            if (str == null) {
                str = "undefined";
            }
            sb.append(str);
            sb.append("'}");
            return sb.toString();
        }
    }

    public static final class b {
        private b() {
        }

        public final e a(Z.g gVar, String str) {
            k.f(gVar, "database");
            k.f(str, "tableName");
            return f.f(gVar, str);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f4273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f4274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f4275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f4276e;

        public c(String str, String str2, String str3, List list, List list2) {
            k.f(str, "referenceTable");
            k.f(str2, "onDelete");
            k.f(str3, "onUpdate");
            k.f(list, "columnNames");
            k.f(list2, "referenceColumnNames");
            this.f4272a = str;
            this.f4273b = str2;
            this.f4274c = str3;
            this.f4275d = list;
            this.f4276e = list2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (k.b(this.f4272a, cVar.f4272a) && k.b(this.f4273b, cVar.f4273b) && k.b(this.f4274c, cVar.f4274c) && k.b(this.f4275d, cVar.f4275d)) {
                return k.b(this.f4276e, cVar.f4276e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f4272a.hashCode() * 31) + this.f4273b.hashCode()) * 31) + this.f4274c.hashCode()) * 31) + this.f4275d.hashCode()) * 31) + this.f4276e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f4272a + "', onDelete='" + this.f4273b + " +', onUpdate='" + this.f4274c + "', columnNames=" + this.f4275d + ", referenceColumnNames=" + this.f4276e + '}';
        }
    }

    public static final class d implements Comparable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f4277m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f4278n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final String f4279o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final String f4280p;

        public d(int i7, int i8, String str, String str2) {
            k.f(str, "from");
            k.f(str2, "to");
            this.f4277m = i7;
            this.f4278n = i8;
            this.f4279o = str;
            this.f4280p = str2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            k.f(dVar, "other");
            int i7 = this.f4277m - dVar.f4277m;
            return i7 == 0 ? this.f4278n - dVar.f4278n : i7;
        }

        public final String h() {
            return this.f4279o;
        }

        public final int j() {
            return this.f4277m;
        }

        public final String k() {
            return this.f4280p;
        }
    }

    /* JADX INFO: renamed from: X.e$e, reason: collision with other inner class name */
    public static final class C0098e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f4281e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f4283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f4284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f4285d;

        /* JADX INFO: renamed from: X.e$e$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public C0098e(String str, boolean z6, List list, List list2) {
            k.f(str, "name");
            k.f(list, "columns");
            k.f(list2, "orders");
            this.f4282a = str;
            this.f4283b = z6;
            this.f4284c = list;
            this.f4285d = list2;
            List arrayList = list2;
            if (arrayList.isEmpty()) {
                int size = list.size();
                arrayList = new ArrayList(size);
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.add(l.ASC.name());
                }
            }
            this.f4285d = (List) arrayList;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0098e)) {
                return false;
            }
            C0098e c0098e = (C0098e) obj;
            if (this.f4283b == c0098e.f4283b && k.b(this.f4284c, c0098e.f4284c) && k.b(this.f4285d, c0098e.f4285d)) {
                return g.B(this.f4282a, "index_", false, 2, null) ? g.B(c0098e.f4282a, "index_", false, 2, null) : k.b(this.f4282a, c0098e.f4282a);
            }
            return false;
        }

        public int hashCode() {
            return ((((((g.B(this.f4282a, "index_", false, 2, null) ? -1184239155 : this.f4282a.hashCode()) * 31) + (this.f4283b ? 1 : 0)) * 31) + this.f4284c.hashCode()) * 31) + this.f4285d.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f4282a + "', unique=" + this.f4283b + ", columns=" + this.f4284c + ", orders=" + this.f4285d + "'}";
        }
    }

    public e(String str, Map map, Set set, Set set2) {
        k.f(str, "name");
        k.f(map, "columns");
        k.f(set, "foreignKeys");
        this.f4260a = str;
        this.f4261b = map;
        this.f4262c = set;
        this.f4263d = set2;
    }

    public static final e a(Z.g gVar, String str) {
        return f4259e.a(gVar, str);
    }

    public boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!k.b(this.f4260a, eVar.f4260a) || !k.b(this.f4261b, eVar.f4261b) || !k.b(this.f4262c, eVar.f4262c)) {
            return false;
        }
        Set set2 = this.f4263d;
        if (set2 == null || (set = eVar.f4263d) == null) {
            return true;
        }
        return k.b(set2, set);
    }

    public int hashCode() {
        return (((this.f4260a.hashCode() * 31) + this.f4261b.hashCode()) * 31) + this.f4262c.hashCode();
    }

    public String toString() {
        return "TableInfo{name='" + this.f4260a + "', columns=" + this.f4261b + ", foreignKeys=" + this.f4262c + ", indices=" + this.f4263d + '}';
    }
}
