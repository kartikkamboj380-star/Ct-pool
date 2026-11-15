package V3;

/* JADX INFO: renamed from: V3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0479g {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            String strValueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(strValueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            return;
        }
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(strValueOf2);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }

    static int b(int i7, String str) {
        if (i7 >= 0) {
            return i7;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i7);
        throw new IllegalArgumentException(sb.toString());
    }

    static void c(boolean z6) {
        U3.h.o(z6, "no calls to next() since the last call to remove()");
    }
}
