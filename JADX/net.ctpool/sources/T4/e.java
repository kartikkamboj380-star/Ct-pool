package T4;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f3244a = a();

    private static int a() {
        return c(System.getProperty("java.version"));
    }

    private static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i7 = 0; i7 < str.length(); i7++) {
                char cCharAt = str.charAt(i7);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb.append(cCharAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    static int c(String str) {
        int iE = e(str);
        if (iE == -1) {
            iE = b(str);
        }
        if (iE == -1) {
            return 6;
        }
        return iE;
    }

    public static boolean d() {
        return f3244a >= 9;
    }

    private static int e(String str) {
        try {
            String[] strArrSplit = str.split("[._]");
            int i7 = Integer.parseInt(strArrSplit[0]);
            return (i7 != 1 || strArrSplit.length <= 1) ? i7 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
