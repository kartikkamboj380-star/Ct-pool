package Q0;

import O0.g;
import android.webkit.MimeTypeMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final MimeTypeMap f2742a = MimeTypeMap.getSingleton();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f2743b = g.of("image/heif", "heif", "image/heic", "heic");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f2744c = g.of("heif", "image/heif", "heic", "image/heic");

    public static String a(String str) {
        String str2 = (String) f2744c.get(str);
        return str2 != null ? str2 : f2742a.getMimeTypeFromExtension(str);
    }
}
