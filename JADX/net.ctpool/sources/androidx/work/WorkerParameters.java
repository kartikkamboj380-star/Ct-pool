package androidx.work;

import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import l0.f;
import l0.o;
import l0.v;
import s0.InterfaceC2034b;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f9211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f9212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set f9213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f9214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Executor f9216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC2034b f9217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v f9218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private o f9219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private f f9220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f9221k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f9222a = Collections.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f9223b = Collections.emptyList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Network f9224c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i7, int i8, Executor executor, InterfaceC2034b interfaceC2034b, v vVar, o oVar, f fVar) {
        this.f9211a = uuid;
        this.f9212b = bVar;
        this.f9213c = new HashSet(collection);
        this.f9214d = aVar;
        this.f9215e = i7;
        this.f9221k = i8;
        this.f9216f = executor;
        this.f9217g = interfaceC2034b;
        this.f9218h = vVar;
        this.f9219i = oVar;
        this.f9220j = fVar;
    }

    public Executor a() {
        return this.f9216f;
    }

    public f b() {
        return this.f9220j;
    }

    public UUID c() {
        return this.f9211a;
    }

    public b d() {
        return this.f9212b;
    }

    public v e() {
        return this.f9218h;
    }
}
