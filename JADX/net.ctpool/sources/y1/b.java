package y1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f22903f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f22904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f22905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f22906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f22907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f22908e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b(int i7) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new r(10, "FrescoIoBoundExecutor", true));
        w5.k.e(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …oIoBoundExecutor\", true))");
        this.f22904a = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i7, new r(10, "FrescoDecodeExecutor", true));
        w5.k.e(executorServiceNewFixedThreadPool2, "newFixedThreadPool(\n    …coDecodeExecutor\", true))");
        this.f22905b = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i7, new r(10, "FrescoBackgroundExecutor", true));
        w5.k.e(executorServiceNewFixedThreadPool3, "newFixedThreadPool(\n    …ckgroundExecutor\", true))");
        this.f22906c = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new r(10, "FrescoLightWeightBackgroundExecutor", true));
        w5.k.e(executorServiceNewFixedThreadPool4, "newFixedThreadPool(\n    …ckgroundExecutor\", true))");
        this.f22907d = executorServiceNewFixedThreadPool4;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(i7, new r(10, "FrescoBackgroundExecutor", true));
        w5.k.e(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(\n…ckgroundExecutor\", true))");
        this.f22908e = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // y1.g
    public Executor a() {
        return this.f22905b;
    }

    @Override // y1.g
    public Executor b() {
        return this.f22907d;
    }

    @Override // y1.g
    public Executor c() {
        return this.f22906c;
    }

    @Override // y1.g
    public Executor d() {
        return this.f22904a;
    }

    @Override // y1.g
    public Executor e() {
        return this.f22904a;
    }

    @Override // y1.g
    public Executor f() {
        return this.f22904a;
    }

    @Override // y1.g
    public ScheduledExecutorService g() {
        return this.f22908e;
    }
}
