package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1342v1 {
    static String a(S s6) {
        String str;
        StringBuilder sb = new StringBuilder(s6.h());
        for (int i7 = 0; i7 < s6.h(); i7++) {
            int iC = s6.c(i7);
            if (iC == 34) {
                str = "\\\"";
            } else if (iC == 39) {
                str = "\\'";
            } else if (iC != 92) {
                switch (iC) {
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
                        if (iC < 32 || iC > 126) {
                            sb.append('\\');
                            sb.append((char) (((iC >>> 6) & 3) + 48));
                            sb.append((char) (((iC >>> 3) & 7) + 48));
                            iC = (iC & 7) + 48;
                        }
                        sb.append((char) iC);
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
