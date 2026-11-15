package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
abstract class w {
    private static androidx.core.os.i a(androidx.core.os.i iVar, androidx.core.os.i iVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i7 = 0;
        while (i7 < iVar.g() + iVar2.g()) {
            Locale localeC = i7 < iVar.g() ? iVar.c(i7) : iVar2.c(i7 - iVar.g());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i7++;
        }
        return androidx.core.os.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static androidx.core.os.i b(androidx.core.os.i iVar, androidx.core.os.i iVar2) {
        return (iVar == null || iVar.f()) ? androidx.core.os.i.e() : a(iVar, iVar2);
    }
}
