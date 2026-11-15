package androidx.work.impl;

import android.content.Context;
import j5.AbstractC1787F;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f9263a = new A();

    private A() {
    }

    private final File c(Context context) {
        return new File(C0661a.f9343a.a(context), "androidx.work.workdb");
    }

    public static final void d(Context context) {
        StringBuilder sb;
        w5.k.f(context, "context");
        A a7 = f9263a;
        if (a7.b(context).exists()) {
            l0.i.e().a(B.f9264a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : a7.e(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        l0.i.e().k(B.f9264a, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        sb = new StringBuilder();
                        sb.append("Migrated ");
                        sb.append(file);
                        sb.append("to ");
                        sb.append(file2);
                    } else {
                        sb = new StringBuilder();
                        sb.append("Renaming ");
                        sb.append(file);
                        sb.append(" to ");
                        sb.append(file2);
                        sb.append(" failed");
                    }
                    l0.i.e().a(B.f9264a, sb.toString());
                }
            }
        }
    }

    public final File a(Context context) {
        w5.k.f(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        w5.k.f(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        w5.k.e(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map e(Context context) {
        w5.k.f(context, "context");
        File fileB = b(context);
        File fileA = a(context);
        String[] strArr = B.f9265b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5.g.c(AbstractC1787F.d(strArr.length), 16));
        for (String str : strArr) {
            i5.l lVarA = i5.q.a(new File(fileB.getPath() + str), new File(fileA.getPath() + str));
            linkedHashMap.put(lVarA.c(), lVarA.d());
        }
        return AbstractC1787F.l(linkedHashMap, i5.q.a(fileB, fileA));
    }
}
