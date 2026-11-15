package E2;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1031a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f1032b = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    private b() {
    }

    public static final String a(String str, ReadableArray readableArray) {
        k.f(str, "message");
        k.f(readableArray, "stack");
        StringBuilder sb = new StringBuilder(str);
        sb.append(", stack:\n");
        int size = readableArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ReadableMap map = readableArray.getMap(i7);
            sb.append(map.getString("methodName"));
            sb.append("@");
            sb.append(f1031a.b(map));
            sb.append((map.hasKey("lineNumber") && !map.isNull("lineNumber") && map.getType("lineNumber") == ReadableType.Number) ? map.getInt("lineNumber") : -1);
            if (map.hasKey("column") && !map.isNull("column") && map.getType("column") == ReadableType.Number) {
                sb.append(":");
                sb.append(map.getInt("column"));
            }
            sb.append("\n");
        }
        String string = sb.toString();
        k.e(string, "toString(...)");
        return string;
    }

    private final String b(ReadableMap readableMap) {
        String string;
        if (!readableMap.hasKey("file") || readableMap.isNull("file") || readableMap.getType("file") != ReadableType.String || (string = readableMap.getString("file")) == null) {
            return "";
        }
        Matcher matcher = f1032b.matcher(string);
        if (!matcher.find()) {
            return "";
        }
        return matcher.group(1) + ":";
    }
}
