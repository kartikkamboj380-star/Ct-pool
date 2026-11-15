package A4;

import b4.AbstractC0683D;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f653b;

    public a(Class cls, Object obj) {
        this.f652a = (Class) AbstractC0683D.b(cls);
        this.f653b = AbstractC0683D.b(obj);
    }

    public Object a() {
        return this.f653b;
    }

    public Class b() {
        return this.f652a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f652a, this.f653b);
    }
}
