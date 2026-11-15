package com.facebook.react.views.text;

import T1.b;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static Typeface a(Typeface typeface, int i7, int i8, String str, AssetManager assetManager) {
        b.C0069b c0069b = new b.C0069b(i7, i8);
        if (str != null) {
            return T1.b.b().d(str, c0069b, assetManager);
        }
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return c0069b.a(typeface);
    }

    public static int b(String str) {
        if (str == null) {
            return -1;
        }
        if ("italic".equals(str)) {
            return 2;
        }
        return "normal".equals(str) ? 0 : -1;
    }

    public static String c(ReadableArray readableArray) {
        String str;
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < readableArray.size(); i7++) {
            String string = readableArray.getString(i7);
            if (string != null) {
                switch (string) {
                    case "stylistic-thirteen":
                        str = "'ss13'";
                        arrayList.add(str);
                        break;
                    case "stylistic-fifteen":
                        str = "'ss15'";
                        arrayList.add(str);
                        break;
                    case "stylistic-eighteen":
                        str = "'ss18'";
                        arrayList.add(str);
                        break;
                    case "proportional-nums":
                        str = "'pnum'";
                        arrayList.add(str);
                        break;
                    case "lining-nums":
                        str = "'lnum'";
                        arrayList.add(str);
                        break;
                    case "historical-ligatures":
                        str = "'hlig'";
                        arrayList.add(str);
                        break;
                    case "tabular-nums":
                        str = "'tnum'";
                        arrayList.add(str);
                        break;
                    case "discretionary-ligatures":
                        str = "'dlig'";
                        arrayList.add(str);
                        break;
                    case "oldstyle-nums":
                        str = "'onum'";
                        arrayList.add(str);
                        break;
                    case "no-contextual":
                        str = "'calt' off";
                        arrayList.add(str);
                        break;
                    case "contextual":
                        str = "'calt'";
                        arrayList.add(str);
                        break;
                    case "no-common-ligatures":
                        arrayList.add("'liga' off");
                        str = "'clig' off";
                        arrayList.add(str);
                        break;
                    case "stylistic-eight":
                        str = "'ss08'";
                        arrayList.add(str);
                        break;
                    case "stylistic-seven":
                        str = "'ss07'";
                        arrayList.add(str);
                        break;
                    case "stylistic-three":
                        str = "'ss03'";
                        arrayList.add(str);
                        break;
                    case "stylistic-eleven":
                        str = "'ss11'";
                        arrayList.add(str);
                        break;
                    case "no-historical-ligatures":
                        str = "'hlig' off";
                        arrayList.add(str);
                        break;
                    case "stylistic-five":
                        str = "'ss05'";
                        arrayList.add(str);
                        break;
                    case "stylistic-four":
                        str = "'ss04'";
                        arrayList.add(str);
                        break;
                    case "stylistic-nine":
                        str = "'ss09'";
                        arrayList.add(str);
                        break;
                    case "stylistic-one":
                        str = "'ss01'";
                        arrayList.add(str);
                        break;
                    case "stylistic-six":
                        str = "'ss06'";
                        arrayList.add(str);
                        break;
                    case "stylistic-ten":
                        str = "'ss10'";
                        arrayList.add(str);
                        break;
                    case "stylistic-two":
                        str = "'ss02'";
                        arrayList.add(str);
                        break;
                    case "stylistic-sixteen":
                        str = "'ss16'";
                        arrayList.add(str);
                        break;
                    case "stylistic-twelve":
                        str = "'ss12'";
                        arrayList.add(str);
                        break;
                    case "stylistic-twenty":
                        str = "'ss20'";
                        arrayList.add(str);
                        break;
                    case "no-discretionary-ligatures":
                        str = "'dlig' off";
                        arrayList.add(str);
                        break;
                    case "small-caps":
                        str = "'smcp'";
                        arrayList.add(str);
                        break;
                    case "common-ligatures":
                        arrayList.add("'liga'");
                        str = "'clig'";
                        arrayList.add(str);
                        break;
                    case "stylistic-nineteen":
                        str = "'ss19'";
                        arrayList.add(str);
                        break;
                    case "stylistic-fourteen":
                        str = "'ss14'";
                        arrayList.add(str);
                        break;
                    case "stylistic-seventeen":
                        str = "'ss17'";
                        arrayList.add(str);
                        break;
                }
            }
        }
        return TextUtils.join(", ", arrayList);
    }

    public static int d(String str) {
        if (str != null) {
            switch (str) {
                case "normal":
                case "400":
                    return 400;
                case "100":
                    return 100;
                case "200":
                    return 200;
                case "300":
                    return 300;
                case "500":
                    return 500;
                case "600":
                    return 600;
                case "700":
                case "bold":
                    return 700;
                case "800":
                    return 800;
                case "900":
                    return 900;
            }
        }
        return -1;
    }
}
