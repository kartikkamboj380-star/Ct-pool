package O2;

import com.facebook.soloader.m;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f2463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2464b;

    public a(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException();
        }
        this.f2463a = new String[i7];
        this.f2464b = 0;
    }

    public synchronized boolean a(String str) {
        for (String str2 : this.f2463a) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb = new StringBuilder("Recording new base apk path: ");
        sb.append(str);
        sb.append("\n");
        b(sb);
        m.g("SoLoader", sb.toString());
        String[] strArr = this.f2463a;
        int i7 = this.f2464b;
        strArr[i7 % strArr.length] = str;
        this.f2464b = i7 + 1;
        return true;
    }

    public synchronized void b(StringBuilder sb) {
        try {
            sb.append("Previously recorded ");
            sb.append(this.f2464b);
            sb.append(" base apk paths.");
            if (this.f2464b > 0) {
                sb.append(" Most recent ones:");
            }
            int i7 = 0;
            while (true) {
                String[] strArr = this.f2463a;
                if (i7 < strArr.length) {
                    int i8 = (this.f2464b - i7) - 1;
                    if (i8 >= 0) {
                        String str = strArr[i8 % strArr.length];
                        sb.append("\n");
                        sb.append(str);
                        sb.append(" (");
                        sb.append(new File(str).exists() ? "exists" : "does not exist");
                        sb.append(")");
                    }
                    i7++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int c() {
        return this.f2464b;
    }
}
