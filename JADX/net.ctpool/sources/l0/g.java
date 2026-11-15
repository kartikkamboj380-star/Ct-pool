package l0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21039a = i.i("InputMerger");

    public static g a(String str) {
        try {
            return (g) Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e7) {
            i.e().d(f21039a, "Trouble instantiating + " + str, e7);
            return null;
        }
    }

    public abstract androidx.work.b b(List list);
}
