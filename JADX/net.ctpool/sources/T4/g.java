package T4;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Number {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f3246m;

    public g(String str) {
        this.f3246m = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f3246m);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        String str = this.f3246m;
        String str2 = ((g) obj).f3246m;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f3246m);
    }

    public int hashCode() {
        return this.f3246m.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f3246m);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f3246m);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f3246m).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f3246m);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f3246m).longValue();
        }
    }

    public String toString() {
        return this.f3246m;
    }
}
