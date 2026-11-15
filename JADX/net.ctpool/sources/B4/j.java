package B4;

/* JADX INFO: loaded from: classes.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f768m;

        a(int i7) {
            this.f768m = i7;
        }

        public int h() {
            return this.f768m;
        }
    }

    a b(String str);
}
