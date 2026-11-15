package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class G implements Iterable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ CharSequence f14083m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ I f14084n;

    G(I i7, CharSequence charSequence) {
        this.f14084n = i7;
        this.f14083m = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f14084n.h(this.f14083m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                CharSequence charSequenceA = B.a(it.next(), ", ");
                while (true) {
                    sb.append(charSequenceA);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) ", ");
                    charSequenceA = B.a(it.next(), ", ");
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }
}
