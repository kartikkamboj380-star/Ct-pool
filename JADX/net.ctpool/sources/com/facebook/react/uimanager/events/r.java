package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseIntArray f12581a = new SparseIntArray();

    public void a(long j7) {
        this.f12581a.put((int) j7, 0);
    }

    public short b(long j7) {
        int i7 = this.f12581a.get((int) j7, -1);
        if (i7 != -1) {
            return (short) (i7 & 65535);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public boolean c(long j7) {
        return this.f12581a.get((int) j7, -1) != -1;
    }

    public void d(long j7) {
        int i7 = (int) j7;
        int i8 = this.f12581a.get(i7, -1);
        if (i8 == -1) {
            throw new RuntimeException("Tried to increment non-existent cookie");
        }
        this.f12581a.put(i7, i8 + 1);
    }

    public void e(long j7) {
        this.f12581a.delete((int) j7);
    }
}
