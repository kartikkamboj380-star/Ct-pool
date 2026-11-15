package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class HexDumpUtils {
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static String dump(byte[] bArr, int i7, int i8, boolean z6) {
        int length;
        if (bArr == null || (length = bArr.length) == 0 || i7 < 0 || i8 <= 0 || i7 + i8 > length) {
            return null;
        }
        StringBuilder sb = new StringBuilder((z6 ? 75 : 57) * ((i8 + 15) / 16));
        int i9 = i8;
        int i10 = 0;
        int i11 = 0;
        while (i9 > 0) {
            if (i10 == 0) {
                sb.append(i8 < 65536 ? String.format("%04X:", Integer.valueOf(i7)) : String.format("%08X:", Integer.valueOf(i7)));
                i11 = i7;
            } else if (i10 == 8) {
                sb.append(" -");
            }
            sb.append(String.format(" %02X", Integer.valueOf(bArr[i7] & 255)));
            i9--;
            i10++;
            if (z6 && (i10 == 16 || i9 == 0)) {
                int i12 = 16 - i10;
                if (i12 > 0) {
                    for (int i13 = 0; i13 < i12; i13++) {
                        sb.append("   ");
                    }
                }
                if (i12 >= 8) {
                    sb.append("  ");
                }
                sb.append("  ");
                for (int i14 = 0; i14 < i10; i14++) {
                    char c7 = (char) bArr[i11 + i14];
                    if (c7 < ' ' || c7 > '~') {
                        c7 = '.';
                    }
                    sb.append(c7);
                }
            }
            if (i10 == 16 || i9 == 0) {
                sb.append('\n');
                i10 = 0;
            }
            i7++;
        }
        return sb.toString();
    }
}
