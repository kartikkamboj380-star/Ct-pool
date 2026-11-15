package D2;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.y;
import com.facebook.react.AbstractC0831n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f1000a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f1001b = new HashMap();

    public static View a(View view, String str) {
        String strB = b(view);
        if (strB != null && strB.equals(str)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View viewA = a(viewGroup.getChildAt(i7), str);
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }

    private static String b(View view) {
        Object tag = view.getTag(AbstractC0831n.f11970B);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static void c(View view) {
        String strB = b(view);
        if (strB == null) {
            return;
        }
        Iterator it = f1000a.iterator();
        if (it.hasNext()) {
            y.a(it.next());
            throw null;
        }
        for (Map.Entry entry : f1001b.entrySet()) {
            Set set = (Set) entry.getValue();
            if (set != null && set.contains(strB)) {
                y.a(entry.getKey());
                throw null;
            }
        }
    }
}
