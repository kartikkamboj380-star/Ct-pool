package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
class k extends B {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f11308p = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double[] f11309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f11310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f11311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f11312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f11313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f11314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private B f11315n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Object f11316o;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11317a;

        static {
            int[] iArr = new int[b.values().length];
            f11317a = iArr;
            try {
                iArr[b.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11317a[b.Color.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11317a[b.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private enum b {
        Number,
        Color,
        String
    }

    public k(ReadableMap readableMap) {
        this.f11309h = p(readableMap.getArray("inputRange"));
        ReadableArray array = readableMap.getArray("outputRange");
        if ("color".equals(readableMap.getString("outputType"))) {
            this.f11311j = b.Color;
            this.f11310i = q(array);
        } else {
            if (array.getType(0) == ReadableType.String) {
                this.f11311j = b.String;
                this.f11310i = r(array);
                this.f11312k = array.getString(0);
                this.f11313l = readableMap.getString("extrapolateLeft");
                this.f11314m = readableMap.getString("extrapolateRight");
            }
            this.f11311j = b.Number;
            this.f11310i = p(array);
        }
        this.f11312k = null;
        this.f11313l = readableMap.getString("extrapolateLeft");
        this.f11314m = readableMap.getString("extrapolateRight");
    }

    private static int o(double d7, double[] dArr) {
        int i7 = 1;
        while (i7 < dArr.length - 1 && dArr[i7] < d7) {
            i7++;
        }
        return i7 - 1;
    }

    private static double[] p(ReadableArray readableArray) {
        int size = readableArray.size();
        double[] dArr = new double[size];
        for (int i7 = 0; i7 < size; i7++) {
            dArr[i7] = readableArray.getDouble(i7);
        }
        return dArr;
    }

    private static int[] q(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = readableArray.getInt(i7);
        }
        return iArr;
    }

    private static double[][] r(ReadableArray readableArray) {
        int size = readableArray.size();
        double[][] dArr = new double[size][];
        Matcher matcher = f11308p.matcher(readableArray.getString(0));
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            arrayList.add(Double.valueOf(Double.parseDouble(matcher.group())));
        }
        int size2 = arrayList.size();
        double[] dArr2 = new double[size2];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            dArr2[i7] = ((Double) arrayList.get(i7)).doubleValue();
        }
        dArr[0] = dArr2;
        for (int i8 = 1; i8 < size; i8++) {
            double[] dArr3 = new double[size2];
            Matcher matcher2 = f11308p.matcher(readableArray.getString(i8));
            for (int i9 = 0; matcher2.find() && i9 < size2; i9++) {
                dArr3[i9] = Double.parseDouble(matcher2.group());
            }
            dArr[i8] = dArr3;
        }
        return dArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static double s(double d7, double d8, double d9, double d10, double d11, String str, String str2) {
        double d12;
        if (d7 < d8) {
            str.hashCode();
            switch (str) {
                case "extend":
                    d12 = d7;
                    break;
                case "identity":
                    return d7;
                case "clamp":
                    d12 = d8;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("Invalid extrapolation type " + str + "for left extrapolation");
            }
        }
        if (d12 > d9) {
            str2.hashCode();
            switch (str2) {
                case "extend":
                    break;
                case "identity":
                    return d12;
                case "clamp":
                    d12 = d9;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("Invalid extrapolation type " + str2 + "for right extrapolation");
            }
        }
        return d10 == d11 ? d10 : d8 == d9 ? d7 <= d8 ? d10 : d11 : d10 + (((d11 - d10) * (d12 - d8)) / (d9 - d8));
    }

    static double t(double d7, double[] dArr, double[] dArr2, String str, String str2) {
        int iO = o(d7, dArr);
        int i7 = iO + 1;
        return s(d7, dArr[iO], dArr[i7], dArr2[iO], dArr2[i7], str, str2);
    }

    static int u(double d7, double[] dArr, int[] iArr) {
        int iO = o(d7, dArr);
        int i7 = iArr[iO];
        int i8 = iO + 1;
        int i9 = iArr[i8];
        if (i7 == i9) {
            return i7;
        }
        double d8 = dArr[iO];
        double d9 = dArr[i8];
        return d8 == d9 ? d7 <= d8 ? i7 : i9 : androidx.core.graphics.a.c(i7, i9, (float) ((d7 - d8) / (d9 - d8)));
    }

    static String v(String str, double d7, double[] dArr, double[][] dArr2, String str2, String str3) {
        int iO = o(d7, dArr);
        StringBuffer stringBuffer = new StringBuffer(str.length());
        Matcher matcher = f11308p.matcher(str);
        int i7 = 0;
        while (matcher.find()) {
            double[] dArr3 = dArr2[iO];
            if (i7 >= dArr3.length) {
                break;
            }
            int i8 = iO + 1;
            double dS = s(d7, dArr[iO], dArr[i8], dArr3[i7], dArr2[i8][i7], str2, str3);
            int i9 = (int) dS;
            matcher.appendReplacement(stringBuffer, ((double) i9) != dS ? Double.toString(dS) : Integer.toString(i9));
            i7++;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public void c(AbstractC0793b abstractC0793b) {
        if (this.f11315n != null) {
            throw new IllegalStateException("Parent already attached");
        }
        if (!(abstractC0793b instanceof B)) {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
        this.f11315n = (B) abstractC0793b;
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public void d(AbstractC0793b abstractC0793b) {
        if (abstractC0793b != this.f11315n) {
            throw new IllegalArgumentException("Invalid parent node provided");
        }
        this.f11315n = null;
    }

    @Override // com.facebook.react.animated.B, com.facebook.react.animated.AbstractC0793b
    public String e() {
        return "InterpolationAnimatedNode[" + this.f11274d + "] super: " + super.e();
    }

    @Override // com.facebook.react.animated.AbstractC0793b
    public void h() {
        Object objValueOf;
        B b7 = this.f11315n;
        if (b7 == null) {
            return;
        }
        double dL = b7.l();
        int i7 = a.f11317a[this.f11311j.ordinal()];
        if (i7 == 1) {
            this.f11169e = t(dL, this.f11309h, (double[]) this.f11310i, this.f11313l, this.f11314m);
            return;
        }
        if (i7 == 2) {
            objValueOf = Integer.valueOf(u(dL, this.f11309h, (int[]) this.f11310i));
        } else if (i7 != 3) {
            return;
        } else {
            objValueOf = v(this.f11312k, dL, this.f11309h, (double[][]) this.f11310i, this.f11313l, this.f11314m);
        }
        this.f11316o = objValueOf;
    }

    @Override // com.facebook.react.animated.B
    public Object k() {
        return this.f11316o;
    }
}
