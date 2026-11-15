package S1;

import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c extends RuntimeException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f2925m;

    public c(String str) {
        super(str);
        this.f2925m = str;
    }

    public static c a(String str, String str2, String str3, Throwable th) {
        return new c(str2 + "\n\nTry the following to fix the issue:\n• Ensure that Metro is running\n• Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n• Ensure Airplane Mode is disabled\n• If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT>' to forward requests from your device\n• If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n".replace("<PORT>", String.valueOf(Uri.parse(str).getPort())) + str3, th);
    }

    public static c b(String str, String str2, Throwable th) {
        return a(str, str2, "", th);
    }

    public static c c(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            return new c(jSONObject.getString("message"), d(jSONObject.getString("filename")), jSONObject.getInt("lineNumber"), jSONObject.getInt("column"));
        } catch (JSONException e7) {
            P0.a.H("ReactNative", "Could not parse DebugServerException from: " + str2, e7);
            return null;
        }
    }

    private static String d(String str) {
        return str.split("/")[r1.length - 1];
    }

    private c(String str, String str2, int i7, int i8) {
        super(str + "\n  at " + str2 + ":" + i7 + ":" + i8);
        this.f2925m = str;
    }

    public c(String str, Throwable th) {
        super(str, th);
        this.f2925m = str;
    }
}
