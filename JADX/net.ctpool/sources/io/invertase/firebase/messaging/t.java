package io.invertase.firebase.messaging;

import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.V;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class t implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20141a = ",";

    private List d(String str) {
        return new ArrayList(Arrays.asList(str.split(",")));
    }

    private String e(String str, String str2) {
        return str2.replace(str + ",", "");
    }

    @Override // io.invertase.firebase.messaging.r
    public WritableMap a(String str) {
        String strC = g5.o.b().c(str, null);
        if (strC != null) {
            try {
                WritableMap writableMapB = a.b(new JSONObject(strC));
                writableMapB.putString("to", str);
                return writableMapB;
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
        }
        return null;
    }

    @Override // io.invertase.firebase.messaging.r
    public void b(String str) {
        g5.o oVarB = g5.o.b();
        oVarB.d(str);
        String strC = oVarB.c("all_notification_ids", "");
        if (strC.isEmpty()) {
            return;
        }
        oVarB.e("all_notification_ids", e(str, strC));
    }

    @Override // io.invertase.firebase.messaging.r
    public void c(V v6) {
        try {
            String string = a.d(q.i(v6)).toString();
            g5.o oVarB = g5.o.b();
            oVarB.e(v6.B0(), string);
            String strE = oVarB.c("all_notification_ids", "") + v6.B0() + ",";
            List listD = d(strE);
            if (listD.size() > 100) {
                String str = (String) listD.get(0);
                oVarB.d(str);
                strE = e(str, strE);
            }
            oVarB.e("all_notification_ids", strE);
        } catch (JSONException e7) {
            e7.printStackTrace();
        }
    }
}
