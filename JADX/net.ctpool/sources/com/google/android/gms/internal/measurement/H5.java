package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
abstract class H5 {
    static String a(R3 r32) {
        String str;
        G5 g52 = new G5(r32);
        StringBuilder sb = new StringBuilder(g52.a());
        for (int i7 = 0; i7 < g52.a(); i7++) {
            int iD = g52.d(i7);
            if (iD == 34) {
                str = "\\\"";
            } else if (iD == 39) {
                str = "\\'";
            } else if (iD != 92) {
                switch (iD) {
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
                        if (iD < 32 || iD > 126) {
                            sb.append('\\');
                            sb.append((char) (((iD >>> 6) & 3) + 48));
                            sb.append((char) (((iD >>> 3) & 7) + 48));
                            iD = (iD & 7) + 48;
                        }
                        sb.append((char) iD);
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
}
