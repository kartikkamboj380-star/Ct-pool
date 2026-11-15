package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CharSequence f6912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IconCompat f6913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f6914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f6915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f6916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f6917f;

    static class a {
        static W a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.a(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        static Person b(W w6) {
            return new Person.Builder().setName(w6.c()).setIcon(w6.a() != null ? w6.a().s() : null).setUri(w6.d()).setKey(w6.b()).setBot(w6.e()).setImportant(w6.f()).build();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        CharSequence f6918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        IconCompat f6919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f6920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f6921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f6922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f6923f;

        public W a() {
            return new W(this);
        }

        public b b(boolean z6) {
            this.f6922e = z6;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.f6919b = iconCompat;
            return this;
        }

        public b d(boolean z6) {
            this.f6923f = z6;
            return this;
        }

        public b e(String str) {
            this.f6921d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.f6918a = charSequence;
            return this;
        }

        public b g(String str) {
            this.f6920c = str;
            return this;
        }
    }

    W(b bVar) {
        this.f6912a = bVar.f6918a;
        this.f6913b = bVar.f6919b;
        this.f6914c = bVar.f6920c;
        this.f6915d = bVar.f6921d;
        this.f6916e = bVar.f6922e;
        this.f6917f = bVar.f6923f;
    }

    public IconCompat a() {
        return this.f6913b;
    }

    public String b() {
        return this.f6915d;
    }

    public CharSequence c() {
        return this.f6912a;
    }

    public String d() {
        return this.f6914c;
    }

    public boolean e() {
        return this.f6916e;
    }

    public boolean f() {
        return this.f6917f;
    }

    public String g() {
        String str = this.f6914c;
        if (str != null) {
            return str;
        }
        if (this.f6912a == null) {
            return "";
        }
        return "name:" + ((Object) this.f6912a);
    }

    public Person h() {
        return a.b(this);
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f6912a);
        IconCompat iconCompat = this.f6913b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.r() : null);
        bundle.putString("uri", this.f6914c);
        bundle.putString("key", this.f6915d);
        bundle.putBoolean("isBot", this.f6916e);
        bundle.putBoolean("isImportant", this.f6917f);
        return bundle;
    }
}
