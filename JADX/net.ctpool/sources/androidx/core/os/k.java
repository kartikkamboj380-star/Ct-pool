package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f7167a;

    k(Object obj) {
        this.f7167a = (LocaleList) obj;
    }

    @Override // androidx.core.os.j
    public String a() {
        return this.f7167a.toLanguageTags();
    }

    @Override // androidx.core.os.j
    public Object b() {
        return this.f7167a;
    }

    public boolean equals(Object obj) {
        return this.f7167a.equals(((j) obj).b());
    }

    @Override // androidx.core.os.j
    public Locale get(int i7) {
        return this.f7167a.get(i7);
    }

    public int hashCode() {
        return this.f7167a.hashCode();
    }

    @Override // androidx.core.os.j
    public boolean isEmpty() {
        return this.f7167a.isEmpty();
    }

    @Override // androidx.core.os.j
    public int size() {
        return this.f7167a.size();
    }

    public String toString() {
        return this.f7167a.toString();
    }
}
