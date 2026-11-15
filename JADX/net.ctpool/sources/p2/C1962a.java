package p2;

import J1.c;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: renamed from: p2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1962a extends J1.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final ReadableMap f21608A;

    protected C1962a(c cVar, ReadableMap readableMap) {
        super(cVar);
        this.f21608A = readableMap;
    }

    public static C1962a z(c cVar, ReadableMap readableMap) {
        return new C1962a(cVar, readableMap);
    }

    public ReadableMap A() {
        return this.f21608A;
    }
}
