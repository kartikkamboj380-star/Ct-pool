package androidx.datastore.preferences.protobuf;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
abstract class j0 {

    static class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC0612g f7653a;

        a(AbstractC0612g abstractC0612g) {
            this.f7653a = abstractC0612g;
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        public byte a(int i7) {
            return this.f7653a.f(i7);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        public int size() {
            return this.f7653a.size();
        }
    }

    private interface b {
        byte a(int i7);

        int size();
    }

    static String a(AbstractC0612g abstractC0612g) {
        return b(new a(abstractC0612g));
    }

    static String b(b bVar) {
        String str;
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i7 = 0; i7 < bVar.size(); i7++) {
            int iA = bVar.a(i7);
            if (iA == 34) {
                str = "\\\"";
            } else if (iA == 39) {
                str = "\\'";
            } else if (iA != 92) {
                switch (iA) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case ConnectionResult.SERVICE_INVALID /* 9 */:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case ConnectionResult.LICENSE_CHECK_FAILED /* 11 */:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iA < 32 || iA > 126) {
                            sb.append('\\');
                            sb.append((char) (((iA >>> 6) & 3) + 48));
                            sb.append((char) (((iA >>> 3) & 7) + 48));
                            iA = (iA & 7) + 48;
                        }
                        sb.append((char) iA);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    static String c(String str) {
        return a(AbstractC0612g.n(str));
    }
}
