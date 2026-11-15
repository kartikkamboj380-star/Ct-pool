package com.facebook.yoga;

/* JADX INFO: loaded from: classes.dex */
public class YogaValue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final YogaValue f13360c = new YogaValue(Float.NaN, w.UNDEFINED);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final YogaValue f13361d = new YogaValue(0.0f, w.POINT);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final YogaValue f13362e = new YogaValue(Float.NaN, w.AUTO);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f13364b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13365a;

        static {
            int[] iArr = new int[w.values().length];
            f13365a = iArr;
            try {
                iArr[w.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13365a[w.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13365a[w.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13365a[w.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    YogaValue(float f7, int i7) {
        this(f7, w.h(i7));
    }

    public static YogaValue a(String str) {
        if (str == null) {
            return null;
        }
        return "undefined".equals(str) ? f13360c : "auto".equals(str) ? f13362e : str.endsWith("%") ? new YogaValue(Float.parseFloat(str.substring(0, str.length() - 1)), w.PERCENT) : new YogaValue(Float.parseFloat(str), w.POINT);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof YogaValue)) {
            return false;
        }
        YogaValue yogaValue = (YogaValue) obj;
        w wVar = this.f13364b;
        if (wVar == yogaValue.f13364b) {
            return wVar == w.UNDEFINED || wVar == w.AUTO || Float.compare(this.f13363a, yogaValue.f13363a) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f13363a) + this.f13364b.j();
    }

    public String toString() {
        int i7 = a.f13365a[this.f13364b.ordinal()];
        if (i7 == 1) {
            return "undefined";
        }
        if (i7 == 2) {
            return Float.toString(this.f13363a);
        }
        if (i7 != 3) {
            if (i7 == 4) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return this.f13363a + "%";
    }

    public YogaValue(float f7, w wVar) {
        this.f13363a = f7;
        this.f13364b = wVar;
    }
}
