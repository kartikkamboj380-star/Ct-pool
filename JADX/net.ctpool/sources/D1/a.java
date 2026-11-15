package D1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Set f968o = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "modified_url", "image_color_space"));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map f969m = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i f970n;

    @Override // D1.d
    public boolean a1() {
        return false;
    }

    @Override // D1.h, o1.InterfaceC1940a
    public Map getExtras() {
        return this.f969m;
    }

    @Override // o1.InterfaceC1940a
    public void j(Map map) {
        if (map == null) {
            return;
        }
        for (String str : f968o) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f969m.put(str, obj);
            }
        }
    }

    @Override // D1.d
    public abstract l t0();

    @Override // o1.InterfaceC1940a
    public void w(String str, Object obj) {
        if (f968o.contains(str)) {
            this.f969m.put(str, obj);
        }
    }

    @Override // D1.d
    public i x0() {
        if (this.f970n == null) {
            this.f970n = new j(getWidth(), getHeight(), T0(), t0(), getExtras());
        }
        return this.f970n;
    }
}
