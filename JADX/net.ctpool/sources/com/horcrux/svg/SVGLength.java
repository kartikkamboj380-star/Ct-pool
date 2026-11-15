package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class SVGLength {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f17818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final UnitType f17819b;

    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17820a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f17820a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17820a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17820a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private SVGLength() {
        this.f17818a = 0.0d;
        this.f17819b = UnitType.UNKNOWN;
    }

    static ArrayList a(Dynamic dynamic) {
        int i7 = a.f17820a[dynamic.getType().ordinal()];
        if (i7 == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        }
        int i8 = 0;
        if (i7 == 2) {
            String[] strArrSplit = dynamic.asString().trim().replaceAll(",", " ").split(" ");
            ArrayList arrayList2 = new ArrayList(strArrSplit.length);
            int length = strArrSplit.length;
            while (i8 < length) {
                arrayList2.add(new SVGLength(strArrSplit[i8]));
                i8++;
            }
            return arrayList2;
        }
        if (i7 != 3) {
            return null;
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        int size = readableArrayAsArray.size();
        ArrayList arrayList3 = new ArrayList(size);
        while (i8 < size) {
            arrayList3.add(b(readableArrayAsArray.getDynamic(i8)));
            i8++;
        }
        return arrayList3;
    }

    static SVGLength b(Dynamic dynamic) {
        int i7 = a.f17820a[dynamic.getType().ordinal()];
        return i7 != 1 ? i7 != 2 ? new SVGLength() : new SVGLength(dynamic.asString()) : new SVGLength(dynamic.asDouble());
    }

    static String c(Dynamic dynamic) {
        int i7 = a.f17820a[dynamic.getType().ordinal()];
        if (i7 == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i7 != 2) {
            return null;
        }
        return dynamic.asString();
    }

    SVGLength(double d7) {
        this.f17818a = d7;
        this.f17819b = UnitType.NUMBER;
    }

    SVGLength(String str) {
        double dDoubleValue;
        UnitType unitType;
        String strTrim = str.trim();
        int length = strTrim.length();
        int i7 = length - 1;
        if (length == 0 || strTrim.equals("normal")) {
            this.f17819b = UnitType.UNKNOWN;
            dDoubleValue = 0.0d;
        } else {
            if (strTrim.codePointAt(i7) == 37) {
                this.f17819b = UnitType.PERCENTAGE;
                strTrim = strTrim.substring(0, i7);
            } else {
                int i8 = length - 2;
                if (i8 > 0) {
                    String strSubstring = strTrim.substring(i8);
                    strSubstring.hashCode();
                    switch (strSubstring) {
                        case "cm":
                            unitType = UnitType.CM;
                            this.f17819b = unitType;
                            length = i8;
                            break;
                        case "em":
                            unitType = UnitType.EMS;
                            this.f17819b = unitType;
                            length = i8;
                            break;
                        case "ex":
                            unitType = UnitType.EXS;
                            this.f17819b = unitType;
                            length = i8;
                            break;
                        case "in":
                            unitType = UnitType.IN;
                            this.f17819b = unitType;
                            length = i8;
                            break;
                        case "mm":
                            unitType = UnitType.MM;
                            this.f17819b = unitType;
                            length = i8;
                            break;
                        case "pc":
                            unitType = UnitType.PC;
                            this.f17819b = unitType;
                            length = i8;
                            break;
                        case "pt":
                            unitType = UnitType.PT;
                            this.f17819b = unitType;
                            length = i8;
                            break;
                        case "px":
                            unitType = UnitType.NUMBER;
                            this.f17819b = unitType;
                            length = i8;
                            break;
                        default:
                            this.f17819b = UnitType.NUMBER;
                            break;
                    }
                    strTrim = strTrim.substring(0, length);
                } else {
                    this.f17819b = UnitType.NUMBER;
                }
            }
            dDoubleValue = Double.valueOf(strTrim).doubleValue();
        }
        this.f17818a = dDoubleValue;
    }
}
