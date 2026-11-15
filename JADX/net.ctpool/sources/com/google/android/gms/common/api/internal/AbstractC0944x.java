package com.google.android.gms.common.api.internal;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0944x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zabf f13655a;

    protected AbstractC0944x(zabf zabfVar) {
        this.f13655a = zabfVar;
    }

    protected abstract void a();

    public final void b(zabi zabiVar) {
        zabiVar.zai.lock();
        try {
            if (zabiVar.zan == this.f13655a) {
                a();
            }
        } finally {
            zabiVar.zai.unlock();
        }
    }
}
