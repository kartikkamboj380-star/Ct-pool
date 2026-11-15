package V3;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    static boolean a(A a7, Object obj) {
        if (obj == a7) {
            return true;
        }
        if (obj instanceof A) {
            return a7.asMap().equals(((A) obj).asMap());
        }
        return false;
    }
}
