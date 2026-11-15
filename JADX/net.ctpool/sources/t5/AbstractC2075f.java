package t5;

import F5.g;
import java.io.File;
import w5.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: t5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2075f extends AbstractC2074e {
    public static String a(File file) {
        k.f(file, "<this>");
        String name = file.getName();
        k.e(name, "getName(...)");
        return g.A0(name, '.', "");
    }
}
