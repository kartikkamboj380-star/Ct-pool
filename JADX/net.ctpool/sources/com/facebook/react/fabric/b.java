package com.facebook.react.fabric;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b implements ReactMarker.FabricMarkerListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f11716c = new l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f11717d = new l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f11718e = new l();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f11719f = new l();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l f11720g = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11721a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f11722b = new ArrayList();

    public interface a {
        void a(C0213b c0213b);
    }

    /* JADX INFO: renamed from: com.facebook.react.fabric.b$b, reason: collision with other inner class name */
    public static class C0213b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f11723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f11724b;

        private C0213b(int i7) {
            this.f11724b = new HashMap();
            this.f11723a = i7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(ReactMarkerConstants reactMarkerConstants, c cVar) {
            this.f11724b.put(reactMarkerConstants, cVar);
        }

        private long r(ReactMarkerConstants reactMarkerConstants) {
            c cVar = (c) this.f11724b.get(reactMarkerConstants);
            if (cVar != null) {
                return cVar.a();
            }
            return -1L;
        }

        public long c() {
            return d() - e();
        }

        public long d() {
            return r(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END);
        }

        public long e() {
            return r(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START);
        }

        public long f() {
            return g() - i();
        }

        public long g() {
            return r(ReactMarkerConstants.FABRIC_COMMIT_END);
        }

        public long h() {
            return this.f11723a;
        }

        public long i() {
            return r(ReactMarkerConstants.FABRIC_COMMIT_START);
        }

        public long j() {
            return k() - l();
        }

        public long k() {
            return r(ReactMarkerConstants.FABRIC_DIFF_END);
        }

        public long l() {
            return r(ReactMarkerConstants.FABRIC_DIFF_START);
        }

        public long m() {
            return r(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END);
        }

        public long n() {
            return r(ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START);
        }

        public long o() {
            return p() - q();
        }

        public long p() {
            return r(ReactMarkerConstants.FABRIC_LAYOUT_END);
        }

        public long q() {
            return r(ReactMarkerConstants.FABRIC_LAYOUT_START);
        }

        public long s() {
            return m() - n();
        }

        public String toString() {
            return "FabricCommitPoint{mCommitNumber=" + this.f11723a + ", mPoints=" + this.f11724b + '}';
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f11725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f11726b;

        public c(long j7, int i7) {
            this.f11725a = j7;
            this.f11726b = i7;
        }

        public long a() {
            return this.f11725a;
        }
    }

    private static boolean b(ReactMarkerConstants reactMarkerConstants) {
        return reactMarkerConstants == ReactMarkerConstants.FABRIC_COMMIT_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_COMMIT_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_FINISH_TRANSACTION_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_DIFF_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_DIFF_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_LAYOUT_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_LAYOUT_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_START || reactMarkerConstants == ReactMarkerConstants.FABRIC_UPDATE_UI_MAIN_THREAD_END || reactMarkerConstants == ReactMarkerConstants.FABRIC_LAYOUT_AFFECTED_NODES;
    }

    private void c(C0213b c0213b) {
        Iterator it = this.f11722b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(c0213b);
        }
    }

    public void a(a aVar) {
        this.f11722b.add(aVar);
    }

    public void d(a aVar) {
        this.f11722b.remove(aVar);
    }

    @Override // com.facebook.react.bridge.ReactMarker.FabricMarkerListener
    public void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i7, long j7) {
        logFabricMarker(reactMarkerConstants, str, i7, j7, 0);
    }

    @Override // com.facebook.react.bridge.ReactMarker.FabricMarkerListener
    public void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i7, long j7, int i8) {
        if (b(reactMarkerConstants)) {
            C0213b c0213b = (C0213b) this.f11721a.get(Integer.valueOf(i7));
            if (c0213b == null) {
                c0213b = new C0213b(i7);
                this.f11721a.put(Integer.valueOf(i7), c0213b);
            }
            c0213b.b(reactMarkerConstants, new c(j7, i8));
            if (reactMarkerConstants != ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END || j7 <= 0) {
                return;
            }
            c(c0213b);
            this.f11721a.remove(Integer.valueOf(i7));
        }
    }
}
