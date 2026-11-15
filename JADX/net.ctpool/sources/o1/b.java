package o1;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import p1.b;
import w5.k;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f21456a = new b();

    private b() {
    }

    public static final b.a a(Map map, Map map2, Map map3, Map map4, Rect rect, String str, PointF pointF, Map map5, Object obj, boolean z6, Uri uri) {
        k.f(map, "componentAttribution");
        k.f(map2, "shortcutAttribution");
        b.a aVar = new b.a();
        if (rect != null) {
            aVar.f21536h = rect.width();
            aVar.f21537i = rect.height();
        }
        aVar.f21538j = str;
        if (pointF != null) {
            aVar.f21539k = Float.valueOf(pointF.x);
            aVar.f21540l = Float.valueOf(pointF.y);
        }
        aVar.f21534f = obj;
        aVar.f21541m = z6;
        aVar.f21535g = uri;
        aVar.f21531c = map3;
        aVar.f21532d = map5;
        aVar.f21530b = map2;
        aVar.f21529a = map;
        aVar.f21533e = map4;
        return aVar;
    }
}
