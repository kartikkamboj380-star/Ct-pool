package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
final class T extends S {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f13852m;

    T(Object obj) {
        this.f13852m = obj;
    }

    @Override // com.google.android.gms.internal.auth.S
    public final Object a() {
        return this.f13852m;
    }

    @Override // com.google.android.gms.internal.auth.S
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof T) {
            return this.f13852m.equals(((T) obj).f13852m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13852m.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f13852m.toString() + ")";
    }
}
