package X5;

import java.util.Arrays;
import java.util.logging.Logger;
import w5.k;
import w5.y;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final String b(long j7) {
        StringBuilder sb;
        long j8;
        long j9;
        long j10;
        if (j7 > -999500000) {
            if (j7 > -999500) {
                if (j7 <= 0) {
                    sb = new StringBuilder();
                    j10 = j7 - ((long) 500);
                } else if (j7 < 999500) {
                    sb = new StringBuilder();
                    j10 = j7 + ((long) 500);
                } else if (j7 < 999500000) {
                    sb = new StringBuilder();
                    j9 = j7 + ((long) 500000);
                } else {
                    sb = new StringBuilder();
                    j8 = j7 + ((long) 500000000);
                }
                sb.append(j10 / ((long) 1000));
                sb.append(" µs");
                String string = sb.toString();
                y yVar = y.f22743a;
                String str = String.format("%6s", Arrays.copyOf(new Object[]{string}, 1));
                k.e(str, "java.lang.String.format(format, *args)");
                return str;
            }
            sb = new StringBuilder();
            j9 = j7 - ((long) 500000);
            sb.append(j9 / ((long) 1000000));
            sb.append(" ms");
            String string2 = sb.toString();
            y yVar2 = y.f22743a;
            String str2 = String.format("%6s", Arrays.copyOf(new Object[]{string2}, 1));
            k.e(str2, "java.lang.String.format(format, *args)");
            return str2;
        }
        sb = new StringBuilder();
        j8 = j7 - ((long) 500000000);
        sb.append(j8 / ((long) 1000000000));
        sb.append(" s ");
        String string22 = sb.toString();
        y yVar22 = y.f22743a;
        String str22 = String.format("%6s", Arrays.copyOf(new Object[]{string22}, 1));
        k.e(str22, "java.lang.String.format(format, *args)");
        return str22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar, d dVar, String str) {
        Logger loggerA = e.f4369j.a();
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.f());
        sb.append(' ');
        y yVar = y.f22743a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        k.e(str2, "java.lang.String.format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(aVar.b());
        loggerA.fine(sb.toString());
    }
}
