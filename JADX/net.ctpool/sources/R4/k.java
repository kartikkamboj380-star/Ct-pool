package R4;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f2888m;

    public k(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f2888m = bool;
    }

    private static boolean s(k kVar) {
        Object obj = kVar.f2888m;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f2888m == null) {
            return kVar.f2888m == null;
        }
        if (s(this) && s(kVar)) {
            return p().longValue() == kVar.p().longValue();
        }
        Object obj2 = this.f2888m;
        if (!(obj2 instanceof Number) || !(kVar.f2888m instanceof Number)) {
            return obj2.equals(kVar.f2888m);
        }
        double dDoubleValue = p().doubleValue();
        double dDoubleValue2 = kVar.p().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f2888m == null) {
            return 31;
        }
        if (s(this)) {
            jDoubleToLongBits = p().longValue();
        } else {
            Object obj = this.f2888m;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(p().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public boolean o() {
        return r() ? ((Boolean) this.f2888m).booleanValue() : Boolean.parseBoolean(q());
    }

    public Number p() {
        Object obj = this.f2888m;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new T4.g((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public String q() {
        Object obj = this.f2888m;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (t()) {
            return p().toString();
        }
        if (r()) {
            return ((Boolean) this.f2888m).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f2888m.getClass());
    }

    public boolean r() {
        return this.f2888m instanceof Boolean;
    }

    public boolean t() {
        return this.f2888m instanceof Number;
    }

    public boolean u() {
        return this.f2888m instanceof String;
    }

    public k(Number number) {
        Objects.requireNonNull(number);
        this.f2888m = number;
    }

    public k(String str) {
        Objects.requireNonNull(str);
        this.f2888m = str;
    }
}
