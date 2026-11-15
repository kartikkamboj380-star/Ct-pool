package h2;

import com.facebook.react.bridge.WritableMap;

/* JADX INFO: renamed from: h2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1706a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WritableMap f19585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f19586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f19588e;

    public C1706a(C1706a c1706a) {
        this.f19584a = c1706a.f19584a;
        this.f19585b = c1706a.f19585b.copy();
        this.f19586c = c1706a.f19586c;
        this.f19587d = c1706a.f19587d;
        e eVar = c1706a.f19588e;
        this.f19588e = eVar != null ? eVar.copy() : null;
    }

    WritableMap a() {
        return this.f19585b;
    }

    e b() {
        return this.f19588e;
    }

    String c() {
        return this.f19584a;
    }

    long d() {
        return this.f19586c;
    }

    boolean e() {
        return this.f19587d;
    }

    public C1706a(String str, WritableMap writableMap, long j7, boolean z6) {
        this(str, writableMap, j7, z6, f.f19604b);
    }

    public C1706a(String str, WritableMap writableMap, long j7, boolean z6, e eVar) {
        this.f19584a = str;
        this.f19585b = writableMap;
        this.f19586c = j7;
        this.f19587d = z6;
        this.f19588e = eVar;
    }
}
