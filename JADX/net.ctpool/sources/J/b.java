package J;

import android.text.Editable;
import androidx.emoji2.text.n;

/* JADX INFO: loaded from: classes.dex */
final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f1536a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f1537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f1538c;

    private b() {
        try {
            f1538c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f1537b == null) {
            synchronized (f1536a) {
                try {
                    if (f1537b == null) {
                        f1537b = new b();
                    }
                } finally {
                }
            }
        }
        return f1537b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f1538c;
        return cls != null ? n.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
