package f5;

import android.icu.number.NumberFormatter;
import android.icu.util.MeasureUnit;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: renamed from: f5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1662i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f19307a = Arrays.asList("BS", "BZ", "KY", "PR", "PW", "US");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f19308b = Arrays.asList("LR", "MM", "US");

    private static String a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            str = str + "-" + str2;
        }
        return str + "-" + str3;
    }

    public static String b() {
        return "gregorian";
    }

    public static String c(ReactApplicationContext reactApplicationContext) {
        String strI = i();
        if (!TextUtils.isEmpty(strI)) {
            return strI;
        }
        String strD = d(l(reactApplicationContext));
        return TextUtils.isEmpty(strD) ? "US" : strD;
    }

    private static String d(Locale locale) {
        try {
            String country = locale.getCountry();
            return country.equals("419") ? "UN" : TextUtils.isEmpty(country) ? "" : country.toUpperCase();
        } catch (Exception unused) {
            return "";
        }
    }

    public static WritableArray e(ReactApplicationContext reactApplicationContext) {
        List listM = m(reactApplicationContext);
        ArrayList arrayList = new ArrayList();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            String strF = f((Locale) it.next());
            if (!TextUtils.isEmpty(strF) && !arrayList.contains(strF)) {
                arrayList.add(strF);
                writableArrayCreateArray.pushString(strF);
            }
        }
        if (writableArrayCreateArray.size() == 0) {
            writableArrayCreateArray.pushString("USD");
        }
        return writableArrayCreateArray;
    }

    private static String f(Locale locale) {
        try {
            Currency currency = Currency.getInstance(locale);
            return currency == null ? "" : currency.getCurrencyCode();
        } catch (Exception unused) {
            return "";
        }
    }

    private static String g(Locale locale) {
        String language;
        language = locale.getLanguage();
        language.hashCode();
        switch (language) {
            case "in":
                return "id";
            case "iw":
                return "he";
            case "ji":
                return "yi";
            default:
                return language;
        }
    }

    public static WritableArray h(ReactApplicationContext reactApplicationContext) {
        List<Locale> listM = m(reactApplicationContext);
        ArrayList arrayList = new ArrayList();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        String strC = c(reactApplicationContext);
        for (Locale locale : listM) {
            String strG = g(locale);
            String strK = k(locale);
            String strD = d(locale);
            if (TextUtils.isEmpty(strD)) {
                strD = strC;
            }
            String strA = a(strG, strK, strD);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("languageCode", strG);
            writableMapCreateMap.putString("countryCode", strD);
            writableMapCreateMap.putString("languageTag", strA);
            writableMapCreateMap.putBoolean("isRTL", TextUtils.getLayoutDirectionFromLocale(locale) == 1);
            if (!TextUtils.isEmpty(strK)) {
                writableMapCreateMap.putString("scriptCode", strK);
            }
            if (!arrayList.contains(strA)) {
                arrayList.add(strA);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
        }
        return writableArrayCreateArray;
    }

    private static String i() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object objInvoke = cls.getMethod("get", String.class).invoke(cls, "ro.miui.region");
            Objects.requireNonNull(objInvoke);
            return (String) objInvoke;
        } catch (Exception unused) {
            return "";
        }
    }

    public static WritableMap j(ReactApplicationContext reactApplicationContext) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(l(reactApplicationContext));
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("decimalSeparator", String.valueOf(decimalFormatSymbols.getDecimalSeparator()));
        writableMapCreateMap.putString("groupingSeparator", String.valueOf(decimalFormatSymbols.getGroupingSeparator()));
        return writableMapCreateMap;
    }

    private static String k(Locale locale) {
        String script = locale.getScript();
        return TextUtils.isEmpty(script) ? "" : script;
    }

    private static Locale l(ReactApplicationContext reactApplicationContext) {
        return reactApplicationContext.getResources().getConfiguration().getLocales().get(0);
    }

    private static List m(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        reactApplicationContext.getResources().getConfiguration();
        androidx.core.os.i iVarD = androidx.core.os.i.d();
        for (int i7 = 0; i7 < iVarD.g(); i7++) {
            arrayList.add(iVarD.c(i7));
        }
        return arrayList;
    }

    public static String n(ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 33) {
            return AbstractC1656c.a(AbstractC1656c.a(NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(l(reactApplicationContext)).format(1L).getOutputUnit().getIdentifier().startsWith("fahrenhe") ? "fahrenheit" : "celsius";
        }
        return f19307a.contains(c(reactApplicationContext)) ? "fahrenheit" : "celsius";
    }

    public static String o() {
        return TimeZone.getDefault().getID();
    }

    public static boolean p(ReactApplicationContext reactApplicationContext) {
        return DateFormat.is24HourFormat(reactApplicationContext);
    }

    public static boolean q(ReactApplicationContext reactApplicationContext) {
        return Settings.Global.getInt(reactApplicationContext.getContentResolver(), "auto_time", 0) != 0;
    }

    public static boolean r(ReactApplicationContext reactApplicationContext) {
        return Settings.Global.getInt(reactApplicationContext.getContentResolver(), "auto_time_zone", 0) != 0;
    }

    public static boolean s(ReactApplicationContext reactApplicationContext) {
        return !f19308b.contains(c(reactApplicationContext));
    }
}
