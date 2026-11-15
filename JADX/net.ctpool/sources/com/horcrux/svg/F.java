package com.horcrux.svg;

import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.common.ConnectionResult;
import com.horcrux.svg.SVGLength;

/* JADX INFO: loaded from: classes.dex */
abstract class F {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17774a;

        static {
            int[] iArr = new int[SVGLength.UnitType.values().length];
            f17774a = iArr;
            try {
                iArr[SVGLength.UnitType.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17774a[SVGLength.UnitType.PX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17774a[SVGLength.UnitType.PERCENTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17774a[SVGLength.UnitType.EMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17774a[SVGLength.UnitType.EXS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17774a[SVGLength.UnitType.CM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17774a[SVGLength.UnitType.MM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17774a[SVGLength.UnitType.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17774a[SVGLength.UnitType.PT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17774a[SVGLength.UnitType.PC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17774a[SVGLength.UnitType.UNKNOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static double a(SVGLength sVGLength, double d7, double d8, double d9, double d10) {
        double d11;
        if (sVGLength == null) {
            return d8;
        }
        SVGLength.UnitType unitType = sVGLength.f17819b;
        double d12 = sVGLength.f17818a;
        switch (a.f17774a[unitType.ordinal()]) {
            case 1:
            case 2:
                d10 = 1.0d;
                d12 *= d10;
                d11 = d12 * d9;
                break;
            case 3:
                d11 = (d12 / 100.0d) * d7;
                break;
            case 4:
                d12 *= d10;
                d11 = d12 * d9;
                break;
            case 5:
                d10 /= 2.0d;
                d12 *= d10;
                d11 = d12 * d9;
                break;
            case 6:
                d10 = 35.43307d;
                d12 *= d10;
                d11 = d12 * d9;
                break;
            case 7:
                d10 = 3.543307d;
                d12 *= d10;
                d11 = d12 * d9;
                break;
            case 8:
                d10 = 90.0d;
                d12 *= d10;
                d11 = d12 * d9;
                break;
            case ConnectionResult.SERVICE_INVALID /* 9 */:
                d10 = 1.25d;
                d12 *= d10;
                d11 = d12 * d9;
                break;
            case 10:
                d10 = 15.0d;
                d12 *= d10;
                d11 = d12 * d9;
                break;
            default:
                d11 = d12 * d9;
                break;
        }
        return d11 + d8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static double b(String str, double d7, double d8, double d9) {
        double dDoubleValue;
        String strTrim = str.trim();
        int length = strTrim.length();
        int i7 = length - 1;
        if (length == 0 || strTrim.equals("normal")) {
            return 0.0d;
        }
        if (strTrim.codePointAt(i7) == 37) {
            return (Double.valueOf(strTrim.substring(0, i7)).doubleValue() / 100.0d) * d7;
        }
        int i8 = length - 2;
        if (i8 > 0) {
            String strSubstring = strTrim.substring(i8);
            strSubstring.hashCode();
            switch (strSubstring) {
                case "cm":
                    d9 = 35.43307d;
                    length = i8;
                    break;
                case "em":
                    length = i8;
                    break;
                case "in":
                    d9 = 90.0d;
                    length = i8;
                    break;
                case "mm":
                    d9 = 3.543307d;
                    length = i8;
                    break;
                case "pc":
                    d9 = 15.0d;
                    length = i8;
                    break;
                case "pt":
                    d9 = 1.25d;
                    length = i8;
                    break;
                case "px":
                    length = i8;
                    d9 = 1.0d;
                    break;
                default:
                    d9 = 1.0d;
                    break;
            }
            dDoubleValue = Double.valueOf(strTrim.substring(0, length)).doubleValue() * d9;
        } else {
            dDoubleValue = Double.valueOf(strTrim).doubleValue();
        }
        return dDoubleValue * d8;
    }

    static int c(ReadableArray readableArray, float[] fArr, float f7) {
        int size = readableArray.size();
        if (size != 6) {
            return size;
        }
        fArr[0] = (float) readableArray.getDouble(0);
        fArr[1] = (float) readableArray.getDouble(2);
        fArr[2] = ((float) readableArray.getDouble(4)) * f7;
        fArr[3] = (float) readableArray.getDouble(1);
        fArr[4] = (float) readableArray.getDouble(3);
        fArr[5] = ((float) readableArray.getDouble(5)) * f7;
        return 6;
    }
}
