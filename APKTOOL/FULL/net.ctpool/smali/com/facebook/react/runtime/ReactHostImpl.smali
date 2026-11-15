.class public Lcom/facebook/react/runtime/ReactHostImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/runtime/ReactHostImpl$d;,
        Lcom/facebook/react/runtime/ReactHostImpl$e;
    }
.end annotation


# static fields
.field private static final C:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field private A:Lu2/f;

.field private B:Lu2/f;

.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/react/runtime/g;

.field private final c:Lcom/facebook/react/fabric/ComponentFactory;

.field private final d:LX1/e;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Ljava/util/concurrent/Executor;

.field private final g:Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;

.field private final h:Ljava/util/Set;

.field private final i:Lcom/facebook/react/j;

.field private final j:Z

.field private final k:Z

.field private final l:Ljava/util/Collection;

.field private final m:Lcom/facebook/react/runtime/a;

.field private n:Lcom/facebook/react/runtime/ReactInstance;

.field private final o:Lcom/facebook/react/runtime/a;

.field private final p:Ljava/util/concurrent/atomic/AtomicReference;

.field private final q:Ljava/util/concurrent/atomic/AtomicReference;

.field private final r:Lcom/facebook/react/runtime/d;

.field private final s:Lcom/facebook/react/runtime/c0;

.field private final t:I

.field private u:Lcom/facebook/react/i;

.field private v:Lcom/facebook/react/bridge/MemoryPressureListener;

.field private w:Lm2/b;

.field private final x:Ljava/util/Set;

.field private y:Lcom/facebook/react/runtime/ReactHostInspectorTarget;

.field private z:Lu2/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/facebook/react/runtime/ReactHostImpl;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/react/runtime/g;Lcom/facebook/react/fabric/ComponentFactory;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZ)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->h:Ljava/util/Set;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->l:Ljava/util/Collection;

    new-instance v0, Lcom/facebook/react/runtime/a;

    const/4 v1, 0x0

    invoke-static {v1}, Lu2/f;->m(Ljava/lang/Object;)Lu2/f;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/facebook/react/runtime/a;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->m:Lcom/facebook/react/runtime/a;

    new-instance v0, Lcom/facebook/react/runtime/a;

    invoke-direct {v0}, Lcom/facebook/react/runtime/a;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->o:Lcom/facebook/react/runtime/a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->p:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->q:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Lcom/facebook/react/runtime/d;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lcom/facebook/react/runtime/d;-><init>(Z)V

    iput-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->r:Lcom/facebook/react/runtime/d;

    new-instance v2, Lcom/facebook/react/runtime/c0;

    invoke-direct {v2, v0}, Lcom/facebook/react/runtime/c0;-><init>(Lcom/facebook/react/runtime/d;)V

    iput-object v2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->s:Lcom/facebook/react/runtime/c0;

    sget-object v0, Lcom/facebook/react/runtime/ReactHostImpl;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    iput v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->t:I

    iput-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->u:Lcom/facebook/react/i;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->x:Ljava/util/Set;

    iput-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->z:Lu2/f;

    iput-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->A:Lu2/f;

    iput-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->B:Lu2/f;

    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->b:Lcom/facebook/react/runtime/g;

    iput-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->c:Lcom/facebook/react/fabric/ComponentFactory;

    iput-object p4, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    iput-object p5, p0, Lcom/facebook/react/runtime/ReactHostImpl;->f:Ljava/util/concurrent/Executor;

    new-instance p3, Lcom/facebook/react/runtime/j;

    invoke-direct {p3, p0}, Lcom/facebook/react/runtime/j;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    iput-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->g:Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;

    new-instance p3, Lcom/facebook/react/j;

    invoke-direct {p3, p1}, Lcom/facebook/react/j;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->i:Lcom/facebook/react/j;

    iput-boolean p6, p0, Lcom/facebook/react/runtime/ReactHostImpl;->j:Z

    iput-boolean p7, p0, Lcom/facebook/react/runtime/ReactHostImpl;->k:Z

    if-eqz p7, :cond_0

    new-instance p3, Lcom/facebook/react/runtime/b;

    invoke-interface {p2}, Lcom/facebook/react/runtime/g;->g()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p0, p1, p2}, Lcom/facebook/react/runtime/b;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Landroid/content/Context;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->d:LX1/e;

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/facebook/react/devsupport/f0;

    invoke-direct {p1}, Lcom/facebook/react/devsupport/f0;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->d:LX1/e;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/react/runtime/g;Lcom/facebook/react/fabric/ComponentFactory;ZZ)V
    .locals 8

    .line 2
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    sget-object v5, Lu2/f;->j:Ljava/util/concurrent/Executor;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/facebook/react/runtime/ReactHostImpl;-><init>(Landroid/content/Context;Lcom/facebook/react/runtime/g;Lcom/facebook/react/fabric/ComponentFactory;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZ)V

    return-void
.end method

.method public static synthetic A(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->W0(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/facebook/react/runtime/ReactHostImpl;Lu2/f;)Lcom/facebook/react/runtime/ReactInstance;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->b1(Lu2/f;)Lcom/facebook/react/runtime/ReactInstance;

    move-result-object p0

    return-object p0
.end method

.method private B1(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->q:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static synthetic C(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->j1(Ljava/lang/String;Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/facebook/react/runtime/ReactHostImpl;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->c1()Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private D1(Ljava/lang/String;Lcom/facebook/react/runtime/ReactInstance;)V
    .locals 2

    .line 1
    const-string v0, "Restarting previously running React Native Surfaces"

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->h:Ljava/util/Set;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/runtime/e0;

    invoke-virtual {p2, v1}, Lcom/facebook/react/runtime/ReactInstance;->A(Lcom/facebook/react/runtime/e0;)V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public static synthetic E(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->e1(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private E0()Lu2/f;
    .locals 3

    .line 1
    const-string v0, "isMetroRunning()"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->t1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lu2/g;

    .line 7
    .line 8
    invoke-direct {v0}, Lu2/g;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->f()LX1/e;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Lcom/facebook/react/runtime/P;

    .line 16
    .line 17
    invoke-direct {v2, p0, v0}, Lcom/facebook/react/runtime/P;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Lu2/g;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, v2}, LX1/e;->u(LX1/g;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lu2/g;->a()Lu2/f;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public static synthetic F(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lcom/facebook/react/runtime/e0;Lcom/facebook/react/runtime/ReactInstance;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/runtime/ReactHostImpl;->p1(Ljava/lang/String;Lcom/facebook/react/runtime/e0;Lcom/facebook/react/runtime/ReactInstance;)V

    return-void
.end method

.method private F1(Ljava/lang/String;Lcom/facebook/react/runtime/ReactInstance;)V
    .locals 2

    .line 1
    const-string v0, "Stopping all React Native surfaces"

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->h:Ljava/util/Set;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->h:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/runtime/e0;

    invoke-virtual {p2, v1}, Lcom/facebook/react/runtime/ReactInstance;->B(Lcom/facebook/react/runtime/e0;)V

    invoke-virtual {v1}, Lcom/facebook/react/runtime/e0;->e()V

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public static synthetic G(Lcom/facebook/react/runtime/ReactHostImpl;IILu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/runtime/ReactHostImpl;->r1(IILu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic G0(Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;Lu2/f;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    const-string p2, "Execute: reactInstance is null. Dropping work."

    .line 7
    .line 8
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-interface {p2, p3}, Lcom/facebook/react/runtime/ReactHostImpl$d;->a(Lcom/facebook/react/runtime/ReactInstance;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static synthetic H(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;Ljava/lang/String;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/runtime/ReactHostImpl;->V0(Lcom/facebook/react/runtime/ReactHostImpl$e;Ljava/lang/String;Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic H0(Lu2/f;)Ljava/lang/Void;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lu2/f;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lu2/f;->n()Ljava/lang/Exception;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->B0(Ljava/lang/Exception;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return-object p1
.end method

.method private H1(Lcom/facebook/react/runtime/ReactInstance;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    invoke-static {}, Lcom/facebook/react/devsupport/InspectorFlags;->getFuseboxEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->y:Lcom/facebook/react/runtime/ReactHostInspectorTarget;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostInspectorTarget;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Host inspector target destroyed before instance was unregistered"

    invoke-static {v0, v1}, LO1/a;->b(ZLjava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Lcom/facebook/react/runtime/ReactInstance;->unregisterFromInspector()V

    :cond_2
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->s:Lcom/facebook/react/runtime/c0;

    invoke-virtual {p1}, Lcom/facebook/react/runtime/c0;->a()Lcom/facebook/react/common/LifecycleState;

    move-result-object p1

    sget-object v0, Lcom/facebook/react/common/LifecycleState;->m:Lcom/facebook/react/common/LifecycleState;

    if-ne p1, v0, :cond_3

    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->e0()V

    :cond_3
    return-void
.end method

.method public static synthetic I(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;Ljava/lang/String;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/runtime/ReactHostImpl;->S0(Lcom/facebook/react/runtime/ReactHostImpl$e;Ljava/lang/String;Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic I0(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;Lcom/facebook/react/runtime/ReactInstance;)V
    .locals 0

    .line 1
    invoke-virtual {p3, p0, p1, p2}, Lcom/facebook/react/runtime/ReactInstance;->callFunctionOnModule(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)V

    return-void
.end method

.method private I1()Lu2/f;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->J1(II)Lu2/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static synthetic J(Lcom/facebook/react/runtime/ReactHostImpl;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->n1(Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic J0(Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;Lu2/f;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    const-string p2, "Execute: reactInstance is null. Dropping work."

    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-interface {p2, p3}, Lcom/facebook/react/runtime/ReactHostImpl$d;->a(Lcom/facebook/react/runtime/ReactInstance;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 17
    .line 18
    return-object p1
.end method

.method private J1(II)Lu2/f;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->A:Lu2/f;

    .line 2
    .line 3
    const-string v1, "waitThenCallGetOrCreateReactInstanceTaskWithRetries"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string p1, "React Native is reloading. Return reload task."

    .line 8
    .line 9
    invoke-direct {p0, v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->A:Lu2/f;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->B:Lu2/f;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    if-ge p1, p2, :cond_1

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v2, "React Native is tearing down.Wait for teardown to finish, before trying again (try count = "

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v2, ")."

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {p0, v1, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->B:Lu2/f;

    .line 47
    .line 48
    new-instance v1, Lcom/facebook/react/runtime/u;

    .line 49
    .line 50
    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/react/runtime/u;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;II)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    invoke-virtual {v0, v1, p1}, Lu2/f;->v(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1

    .line 60
    :cond_1
    const-string p1, "React Native is tearing down. Not wait for teardown to finish: reached max retries."

    .line 61
    .line 62
    invoke-direct {p0, v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->w0()Lu2/f;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method

.method public static synthetic K(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Ljava/lang/Exception;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/runtime/ReactHostImpl;->N0(Ljava/lang/String;Ljava/lang/Exception;Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic K0(Ljava/lang/ref/WeakReference;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/runtime/ReactInstance;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Lcom/facebook/react/runtime/ReactInstance;->q(I)V

    :cond_0
    return-void
.end method

.method public static synthetic L(Lcom/facebook/react/runtime/ReactHostImpl;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->I1()Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic L0(Ljava/lang/ref/WeakReference;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/facebook/react/runtime/s;

    invoke-direct {v1, p1, p2}, Lcom/facebook/react/runtime/s;-><init>(Ljava/lang/ref/WeakReference;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic M(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->o1(Ljava/lang/String;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic M0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu2/f;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactInstance;
    .locals 4

    .line 1
    invoke-virtual {p4}, Lu2/f;->o()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/facebook/react/runtime/ReactInstance;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    .line 8
    .line 9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v3, "Stage: "

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p5

    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v3, " reason: "

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p4}, Lu2/f;->s()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const-string v3, ". "

    .line 51
    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    invoke-virtual {p4}, Lu2/f;->n()Ljava/lang/Exception;

    .line 55
    .line 56
    .line 57
    move-result-object p4

    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v2, "Fault reason: "

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p4

    .line 72
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p4

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p1, ": ReactInstance task faulted. "

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    :goto_0
    invoke-direct {p0, p3, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_0
    invoke-virtual {p4}, Lu2/f;->q()Z

    .line 116
    .line 117
    .line 118
    move-result p4

    .line 119
    if-eqz p4, :cond_1

    .line 120
    .line 121
    new-instance p4, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string p1, ": ReactInstance task cancelled. "

    .line 130
    .line 131
    :goto_1
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    goto :goto_0

    .line 148
    :cond_1
    if-nez v0, :cond_2

    .line 149
    .line 150
    new-instance p4, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string p1, ": ReactInstance task returned null. "

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_2
    if-eqz v1, :cond_3

    .line 162
    .line 163
    if-eq v0, v1, :cond_3

    .line 164
    .line 165
    new-instance p4, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string p1, ": Detected two different ReactInstances. Returning old. "

    .line 174
    .line 175
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {p4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-direct {p0, p3, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    :cond_3
    return-object v0
.end method

.method public static synthetic N()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/facebook/react/runtime/ReactHostImpl;->Z0()V

    return-void
.end method

.method private synthetic N0(Ljava/lang/String;Ljava/lang/Exception;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->s0(Ljava/lang/String;Ljava/lang/Exception;)Lu2/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public static synthetic O(Lcom/facebook/react/runtime/ReactHostImpl;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->Q0(Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic O0(Ljava/lang/String;Ljava/lang/Exception;)Lu2/f;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->A:Lu2/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "destroy()"

    .line 6
    .line 7
    const-string v1, "Reloading React Native. Waiting for reload to finish before destroying React Native."

    .line 8
    .line 9
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->A:Lu2/f;

    .line 13
    .line 14
    new-instance v1, Lcom/facebook/react/runtime/i;

    .line 15
    .line 16
    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/react/runtime/i;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    invoke-virtual {v0, v1, p1}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->s0(Ljava/lang/String;Ljava/lang/Exception;)Lu2/f;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method

.method public static synthetic P(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->h1(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic P0()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->w:Lm2/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lm2/b;->c()V

    :cond_0
    return-void
.end method

.method public static synthetic Q(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Ljava/lang/Exception;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->O0(Ljava/lang/String;Ljava/lang/Exception;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic Q0(Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lu2/f;->o()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->s1()Lu2/f;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->b:Lcom/facebook/react/runtime/g;

    .line 19
    .line 20
    invoke-interface {p1}, Lcom/facebook/react/runtime/g;->e()Lcom/facebook/react/bridge/JSBundleLoader;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lu2/f;->m(Ljava/lang/Object;)Lu2/f;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public static synthetic R(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->T0(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic R0()Lcom/facebook/react/bridge/JSBundleLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->b:Lcom/facebook/react/runtime/g;

    invoke-interface {v0}, Lcom/facebook/react/runtime/g;->e()Lcom/facebook/react/bridge/JSBundleLoader;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic S(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;Lu2/f;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/runtime/ReactHostImpl;->J0(Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;Lu2/f;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private synthetic S0(Lcom/facebook/react/runtime/ReactHostImpl$e;Ljava/lang/String;Lu2/f;)Lu2/f;
    .locals 3

    .line 1
    const-string v0, "Starting React Native destruction"

    .line 2
    .line 3
    const-string v1, "getOrCreateDestroyTask()"

    .line 4
    .line 5
    invoke-direct {p0, v1, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "1: Starting destroy"

    .line 9
    .line 10
    invoke-interface {p1, p3, v0}, Lcom/facebook/react/runtime/ReactHostImpl$e;->a(Lu2/f;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactInstance;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->H1(Lcom/facebook/react/runtime/ReactInstance;)V

    .line 15
    .line 16
    .line 17
    iget-boolean p3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->k:Z

    .line 18
    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    const-string p3, "DevSupportManager cleanup"

    .line 22
    .line 23
    invoke-direct {p0, v1, p3}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->d:LX1/e;

    .line 27
    .line 28
    invoke-interface {p3}, LX1/e;->m()V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->o:Lcom/facebook/react/runtime/a;

    .line 32
    .line 33
    invoke-virtual {p3}, Lcom/facebook/react/runtime/a;->b()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    check-cast p3, Lcom/facebook/react/bridge/ReactContext;

    .line 38
    .line 39
    if-nez p3, :cond_1

    .line 40
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v2, "ReactContext is null. Destroy reason: "

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-direct {p0, v1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    const-string p2, "Move ReactHost to onHostDestroy()"

    .line 62
    .line 63
    invoke-direct {p0, v1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object p2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->s:Lcom/facebook/react/runtime/c0;

    .line 67
    .line 68
    invoke-virtual {p2, p3}, Lcom/facebook/react/runtime/c0;->b(Lcom/facebook/react/bridge/ReactContext;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Lu2/f;->m(Ljava/lang/Object;)Lu2/f;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1
.end method

.method public static synthetic T(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->f1(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic T0(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 1

    .line 1
    const-string v0, "2: Stopping surfaces"

    .line 2
    .line 3
    invoke-interface {p1, p2, v0}, Lcom/facebook/react/runtime/ReactHostImpl$e;->a(Lu2/f;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactInstance;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const-string p1, "getOrCreateDestroyTask()"

    .line 10
    .line 11
    const-string v0, "Skipping surface shutdown: ReactInstance null"

    .line 12
    .line 13
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :cond_0
    const-string v0, "getOrCreateDestroyTask()"

    .line 18
    .line 19
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->F1(Ljava/lang/String;Lcom/facebook/react/runtime/ReactInstance;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->h:Ljava/util/Set;

    .line 23
    .line 24
    monitor-enter p1

    .line 25
    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->h:Ljava/util/Set;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 28
    .line 29
    .line 30
    monitor-exit p1

    .line 31
    return-object p2

    .line 32
    :catchall_0
    move-exception p2

    .line 33
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p2
.end method

.method static bridge synthetic U(Lcom/facebook/react/runtime/ReactHostImpl;)Lcom/facebook/react/runtime/ReactHostInspectorTarget;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->y:Lcom/facebook/react/runtime/ReactHostInspectorTarget;

    return-object p0
.end method

.method private synthetic U0(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 2

    .line 1
    const-string v0, "3: Executing Before Destroy Listeners"

    .line 2
    .line 3
    invoke-interface {p1, p2, v0}, Lcom/facebook/react/runtime/ReactHostImpl$e;->a(Lu2/f;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactInstance;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->x:Ljava/util/Set;

    .line 7
    .line 8
    monitor-enter p1

    .line 9
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->x:Ljava/util/Set;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lv5/a;

    .line 32
    .line 33
    invoke-interface {v0}, Lv5/a;->invoke()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-object p2

    .line 38
    :catchall_0
    move-exception p2

    .line 39
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw p2
.end method

.method static bridge synthetic V(Lcom/facebook/react/runtime/ReactHostImpl;)Lu2/f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->A:Lu2/f;

    return-object p0
.end method

.method private synthetic V0(Lcom/facebook/react/runtime/ReactHostImpl$e;Ljava/lang/String;Lu2/f;)Lu2/f;
    .locals 3

    .line 1
    const-string v0, "4: Destroying ReactContext"

    .line 2
    .line 3
    invoke-interface {p1, p3, v0}, Lcom/facebook/react/runtime/ReactHostImpl$e;->a(Lu2/f;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactInstance;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->o:Lcom/facebook/react/runtime/a;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/facebook/react/runtime/a;->b()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    .line 13
    .line 14
    const-string v0, "getOrCreateDestroyTask()"

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "ReactContext is null. Destroy reason: "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-direct {p0, v0, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    const-string p2, "Destroying MemoryPressureRouter"

    .line 39
    .line 40
    invoke-direct {p0, v0, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object p2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->i:Lcom/facebook/react/j;

    .line 44
    .line 45
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->a:Landroid/content/Context;

    .line 46
    .line 47
    invoke-virtual {p2, v1}, Lcom/facebook/react/j;->b(Landroid/content/Context;)V

    .line 48
    .line 49
    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    const-string p2, "Destroying ReactContext"

    .line 53
    .line 54
    invoke-direct {p0, v0, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->destroy()V

    .line 58
    .line 59
    .line 60
    :cond_1
    const/4 p1, 0x0

    .line 61
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->B1(Landroid/app/Activity;)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, LJ2/c;->d()LJ2/c;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, LJ2/c;->c()V

    .line 69
    .line 70
    .line 71
    return-object p3
.end method

.method static bridge synthetic W(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic W0(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 2

    .line 1
    const-string v0, "5: Destroying ReactInstance"

    .line 2
    .line 3
    invoke-interface {p1, p2, v0}, Lcom/facebook/react/runtime/ReactHostImpl$e;->a(Lu2/f;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactInstance;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "getOrCreateDestroyTask()"

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string p1, "Skipping ReactInstance.destroy(): ReactInstance null"

    .line 12
    .line 13
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v1, "Destroying ReactInstance"

    .line 18
    .line 19
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/facebook/react/runtime/ReactInstance;->i()V

    .line 23
    .line 24
    .line 25
    :goto_0
    const-string p1, "Resetting ReactContext ref "

    .line 26
    .line 27
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->o:Lcom/facebook/react/runtime/a;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/facebook/react/runtime/a;->d()V

    .line 33
    .line 34
    .line 35
    const-string p1, "Resetting ReactInstance task ref"

    .line 36
    .line 37
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->m:Lcom/facebook/react/runtime/a;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/facebook/react/runtime/a;->d()V

    .line 43
    .line 44
    .line 45
    const-string p1, "Resetting ReactInstance ptr"

    .line 46
    .line 47
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    .line 52
    .line 53
    const-string v1, "Resetting Preload task ref"

    .line 54
    .line 55
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->z:Lu2/f;

    .line 59
    .line 60
    const-string v1, "Resetting destroy task ref"

    .line 61
    .line 62
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->B:Lu2/f;

    .line 66
    .line 67
    return-object p2
.end method

.method private synthetic X0(Ljava/lang/String;Lu2/f;)Ljava/lang/Void;
    .locals 4

    .line 1
    invoke-virtual {p2}, Lu2/f;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "getOrCreateDestroyTask()"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Lu2/f;->n()Ljava/lang/Exception;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v3, "React destruction failed. ReactInstance task faulted. Fault reason: "

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ". Destroy reason: "

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p2}, Lu2/f;->n()Ljava/lang/Exception;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-direct {p0, v1, v0, v2}, Lcom/facebook/react/runtime/ReactHostImpl;->y1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-virtual {p2}, Lu2/f;->q()Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-eqz p2, :cond_1

    .line 54
    .line 55
    new-instance p2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v0, "React destruction failed. ReactInstance task cancelled. Destroy reason: "

    .line 61
    .line 62
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-direct {p0, v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    const/4 p1, 0x0

    .line 76
    return-object p1
.end method

.method private Y(Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;Ljava/util/concurrent/Executor;)Lu2/f;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "callAfterGetOrCreateReactInstance("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, ")"

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p3, :cond_0

    .line 24
    .line 25
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->j0()Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->v0()Lu2/f;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Lcom/facebook/react/runtime/V;

    .line 34
    .line 35
    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/react/runtime/V;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1, p3}, Lu2/f;->u(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance p2, Lcom/facebook/react/runtime/W;

    .line 43
    .line 44
    invoke-direct {p2, p0}, Lcom/facebook/react/runtime/W;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p2}, Lu2/f;->h(Lu2/a;)Lu2/f;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
.end method

.method private synthetic Y0()Lcom/facebook/react/runtime/c;
    .locals 2

    .line 1
    const-string v0, "getOrCreateReactContext()"

    const-string v1, "Creating BridgelessReactContext"

    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/react/runtime/c;

    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->a:Landroid/content/Context;

    invoke-direct {v0, v1, p0}, Lcom/facebook/react/runtime/c;-><init>(Landroid/content/Context;Lcom/facebook/react/runtime/ReactHostImpl;)V

    return-object v0
.end method

.method private static synthetic Z0()V
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->REACT_BRIDGELESS_LOADING_END:Lcom/facebook/react/bridge/ReactMarkerConstants;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;I)V

    return-void
.end method

.method private a0(Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;Ljava/util/concurrent/Executor;)Lu2/f;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "callWithExistingReactInstance("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, ")"

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p3, :cond_0

    .line 24
    .line 25
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->j0()Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->m:Lcom/facebook/react/runtime/a;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/facebook/react/runtime/a;->a()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lu2/f;

    .line 36
    .line 37
    new-instance v1, Lcom/facebook/react/runtime/k;

    .line 38
    .line 39
    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/react/runtime/k;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1, p3}, Lu2/f;->u(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
.end method

.method private synthetic a1(Lu2/f;)Lcom/facebook/react/runtime/ReactHostImpl$b;
    .locals 12

    .line 1
    invoke-virtual {p1}, Lu2/f;->o()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/facebook/react/bridge/JSBundleLoader;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->t0()Lcom/facebook/react/runtime/c;

    .line 8
    .line 9
    .line 10
    move-result-object v8

    .line 11
    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->f()LX1/e;

    .line 12
    .line 13
    .line 14
    move-result-object v9

    .line 15
    invoke-virtual {v8, v9}, Lcom/facebook/react/bridge/ReactContext;->setJSExceptionHandler(Lcom/facebook/react/bridge/JSExceptionHandler;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "Creating ReactInstance"

    .line 19
    .line 20
    const-string v10, "getOrCreateReactInstanceTask()"

    .line 21
    .line 22
    invoke-direct {p0, v10, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v11, Lcom/facebook/react/runtime/ReactInstance;

    .line 26
    .line 27
    iget-object v2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->b:Lcom/facebook/react/runtime/g;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->c:Lcom/facebook/react/fabric/ComponentFactory;

    .line 30
    .line 31
    iget-object v5, p0, Lcom/facebook/react/runtime/ReactHostImpl;->g:Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;

    .line 32
    .line 33
    iget-boolean v6, p0, Lcom/facebook/react/runtime/ReactHostImpl;->k:Z

    .line 34
    .line 35
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->u0()Lcom/facebook/react/runtime/ReactHostInspectorTarget;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    move-object v0, v11

    .line 40
    move-object v1, v8

    .line 41
    move-object v4, v9

    .line 42
    invoke-direct/range {v0 .. v7}, Lcom/facebook/react/runtime/ReactInstance;-><init>(Lcom/facebook/react/runtime/c;Lcom/facebook/react/runtime/g;Lcom/facebook/react/fabric/ComponentFactory;LX1/e;Lcom/facebook/react/bridge/queue/QueueThreadExceptionHandler;ZLcom/facebook/react/runtime/ReactHostInspectorTarget;)V

    .line 43
    .line 44
    .line 45
    iput-object v11, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    .line 46
    .line 47
    invoke-virtual {v11}, Lcom/facebook/react/runtime/ReactInstance;->s()V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, v11}, Lcom/facebook/react/runtime/ReactHostImpl;->b0(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/bridge/MemoryPressureListener;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->v:Lcom/facebook/react/bridge/MemoryPressureListener;

    .line 55
    .line 56
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->i:Lcom/facebook/react/j;

    .line 57
    .line 58
    invoke-virtual {v1, v0}, Lcom/facebook/react/j;->a(Lcom/facebook/react/bridge/MemoryPressureListener;)V

    .line 59
    .line 60
    .line 61
    const-string v0, "Loading JS Bundle"

    .line 62
    .line 63
    invoke-direct {p0, v10, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v11, p1}, Lcom/facebook/react/runtime/ReactInstance;->x(Lcom/facebook/react/bridge/JSBundleLoader;)V

    .line 67
    .line 68
    .line 69
    const-string p1, "Calling DevSupportManagerBase.onNewReactContextCreated(reactContext)"

    .line 70
    .line 71
    invoke-direct {p0, v10, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v9, v8}, LX1/e;->p(Lcom/facebook/react/bridge/ReactContext;)V

    .line 75
    .line 76
    .line 77
    new-instance p1, Lcom/facebook/react/runtime/J;

    .line 78
    .line 79
    invoke-direct {p1}, Lcom/facebook/react/runtime/J;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v8, p1}, Lcom/facebook/react/bridge/ReactContext;->runOnJSQueueThread(Ljava/lang/Runnable;)Z

    .line 83
    .line 84
    .line 85
    new-instance p1, Lcom/facebook/react/runtime/ReactHostImpl$b;

    .line 86
    .line 87
    invoke-direct {p1, p0, v11, v8}, Lcom/facebook/react/runtime/ReactHostImpl$b;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactInstance;Lcom/facebook/react/runtime/c;)V

    .line 88
    .line 89
    .line 90
    return-object p1
.end method

.method private b0(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/bridge/MemoryPressureListener;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lcom/facebook/react/runtime/N;

    invoke-direct {p1, p0, v0}, Lcom/facebook/react/runtime/N;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/ref/WeakReference;)V

    return-object p1
.end method

.method private synthetic b1(Lu2/f;)Lcom/facebook/react/runtime/ReactInstance;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lu2/f;->o()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/facebook/react/runtime/ReactHostImpl$b;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/facebook/react/runtime/ReactHostImpl$b;->a:Lcom/facebook/react/runtime/ReactInstance;

    .line 8
    .line 9
    invoke-virtual {p1}, Lu2/f;->o()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lcom/facebook/react/runtime/ReactHostImpl$b;

    .line 14
    .line 15
    iget-object v1, v1, Lcom/facebook/react/runtime/ReactHostImpl$b;->b:Lcom/facebook/react/bridge/ReactContext;

    .line 16
    .line 17
    invoke-virtual {p1}, Lu2/f;->o()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/facebook/react/runtime/ReactHostImpl$b;

    .line 22
    .line 23
    iget-boolean p1, p1, Lcom/facebook/react/runtime/ReactHostImpl$b;->c:Z

    .line 24
    .line 25
    iget-object v2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->s:Lcom/facebook/react/runtime/c0;

    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/facebook/react/runtime/c0;->a()Lcom/facebook/react/common/LifecycleState;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v3, Lcom/facebook/react/common/LifecycleState;->o:Lcom/facebook/react/common/LifecycleState;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    if-ne v2, v3, :cond_0

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v2, v4

    .line 39
    :goto_0
    if-eqz p1, :cond_1

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->s:Lcom/facebook/react/runtime/c0;

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->g0()Landroid/app/Activity;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/runtime/c0;->d(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->s:Lcom/facebook/react/runtime/c0;

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->g0()Landroid/app/Activity;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {p1, v1, v2}, Lcom/facebook/react/runtime/c0;->e(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V

    .line 60
    .line 61
    .line 62
    :goto_1
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->l:Ljava/util/Collection;

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    new-array p1, p1, [Lcom/facebook/react/z;

    .line 69
    .line 70
    iget-object v2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->l:Ljava/util/Collection;

    .line 71
    .line 72
    invoke-interface {v2, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, [Lcom/facebook/react/z;

    .line 77
    .line 78
    const-string v2, "getOrCreateReactInstanceTask()"

    .line 79
    .line 80
    const-string v3, "Executing ReactInstanceEventListeners"

    .line 81
    .line 82
    invoke-direct {p0, v2, v3}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    array-length v2, p1

    .line 86
    :goto_2
    if-ge v4, v2, :cond_3

    .line 87
    .line 88
    aget-object v3, p1, v4

    .line 89
    .line 90
    if-eqz v3, :cond_2

    .line 91
    .line 92
    invoke-interface {v3, v1}, Lcom/facebook/react/z;->a(Lcom/facebook/react/bridge/ReactContext;)V

    .line 93
    .line 94
    .line 95
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    return-object v0
.end method

.method private c0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactHostImpl$e;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/runtime/v;

    invoke-direct {v0, p0, p1, p3, p2}, Lcom/facebook/react/runtime/v;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private synthetic c1()Lu2/f;
    .locals 3

    .line 1
    const-string v0, "getOrCreateReactInstanceTask()"

    .line 2
    .line 3
    const-string v1, "Start"

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, Lcom/facebook/react/bridge/ReactMarkerConstants;->REACT_BRIDGELESS_LOADING_START:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactMarker;->logMarker(Lcom/facebook/react/bridge/ReactMarkerConstants;I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->n0()Lu2/f;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lcom/facebook/react/runtime/H;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lcom/facebook/react/runtime/H;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lu2/f;->u(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Lcom/facebook/react/runtime/I;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lcom/facebook/react/runtime/I;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->f:Ljava/util/concurrent/Executor;

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2}, Lu2/f;->u(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
.end method

.method private synthetic d1(Lcom/facebook/react/runtime/ReactHostImpl$e;Ljava/lang/String;Lu2/f;)Lu2/f;
    .locals 3

    .line 1
    const-string v0, "Starting React Native reload"

    .line 2
    .line 3
    const-string v1, "getOrCreateReloadTask()"

    .line 4
    .line 5
    invoke-direct {p0, v1, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "1: Starting reload"

    .line 9
    .line 10
    invoke-interface {p1, p3, v0}, Lcom/facebook/react/runtime/ReactHostImpl$e;->a(Lu2/f;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactInstance;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->H1(Lcom/facebook/react/runtime/ReactInstance;)V

    .line 15
    .line 16
    .line 17
    iget-object p3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->o:Lcom/facebook/react/runtime/a;

    .line 18
    .line 19
    invoke-virtual {p3}, Lcom/facebook/react/runtime/a;->b()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    check-cast p3, Lcom/facebook/react/bridge/ReactContext;

    .line 24
    .line 25
    if-nez p3, :cond_0

    .line 26
    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "ReactContext is null. Reload reason: "

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-direct {p0, v1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    if-eqz p3, :cond_1

    .line 48
    .line 49
    iget-object p2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->s:Lcom/facebook/react/runtime/c0;

    .line 50
    .line 51
    invoke-virtual {p2}, Lcom/facebook/react/runtime/c0;->a()Lcom/facebook/react/common/LifecycleState;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    sget-object v0, Lcom/facebook/react/common/LifecycleState;->o:Lcom/facebook/react/common/LifecycleState;

    .line 56
    .line 57
    if-ne p2, v0, :cond_1

    .line 58
    .line 59
    const-string p2, "Calling ReactContext.onHostPause()"

    .line 60
    .line 61
    invoke-direct {p0, v1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3}, Lcom/facebook/react/bridge/ReactContext;->onHostPause()V

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-static {p1}, Lu2/f;->m(Ljava/lang/Object;)Lu2/f;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1
.end method

.method private e0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->y:Lcom/facebook/react/runtime/ReactHostInspectorTarget;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactHostInspectorTarget;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->y:Lcom/facebook/react/runtime/ReactHostInspectorTarget;

    :cond_0
    return-void
.end method

.method private synthetic e1(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 1

    .line 1
    const-string v0, "2: Surface shutdown"

    .line 2
    .line 3
    invoke-interface {p1, p2, v0}, Lcom/facebook/react/runtime/ReactHostImpl$e;->a(Lu2/f;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactInstance;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "getOrCreateReloadTask()"

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string p1, "Skipping surface shutdown: ReactInstance null"

    .line 12
    .line 13
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :cond_0
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->F1(Ljava/lang/String;Lcom/facebook/react/runtime/ReactInstance;)V

    .line 18
    .line 19
    .line 20
    return-object p2
.end method

.method private synthetic f1(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 2

    .line 1
    const-string v0, "3: Executing Before Destroy Listeners"

    .line 2
    .line 3
    invoke-interface {p1, p2, v0}, Lcom/facebook/react/runtime/ReactHostImpl$e;->a(Lu2/f;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactInstance;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->x:Ljava/util/Set;

    .line 7
    .line 8
    monitor-enter p1

    .line 9
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->x:Ljava/util/Set;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lv5/a;

    .line 32
    .line 33
    invoke-interface {v0}, Lv5/a;->invoke()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-object p2

    .line 38
    :catchall_0
    move-exception p2

    .line 39
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw p2
.end method

.method private synthetic g1(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 2

    .line 1
    const-string v0, "4: Destroying ReactContext"

    .line 2
    .line 3
    invoke-interface {p1, p2, v0}, Lcom/facebook/react/runtime/ReactHostImpl$e;->a(Lu2/f;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactInstance;

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->v:Lcom/facebook/react/bridge/MemoryPressureListener;

    .line 7
    .line 8
    const-string v0, "getOrCreateReloadTask()"

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const-string p1, "Removing memory pressure listener"

    .line 13
    .line 14
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->i:Lcom/facebook/react/j;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->v:Lcom/facebook/react/bridge/MemoryPressureListener;

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Lcom/facebook/react/j;->d(Lcom/facebook/react/bridge/MemoryPressureListener;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->o:Lcom/facebook/react/runtime/a;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/facebook/react/runtime/a;->b()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    const-string v1, "Destroying ReactContext"

    .line 35
    .line 36
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->destroy()V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-boolean v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->k:Z

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    const-string v1, "Calling DevSupportManager.onReactInstanceDestroyed(reactContext)"

    .line 49
    .line 50
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->d:LX1/e;

    .line 54
    .line 55
    invoke-interface {v0, p1}, LX1/e;->D(Lcom/facebook/react/bridge/ReactContext;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    return-object p2
.end method

.method public static synthetic h(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->U0(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic h1(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 1

    .line 1
    const-string v0, "5: Destroying ReactInstance"

    .line 2
    .line 3
    invoke-interface {p1, p2, v0}, Lcom/facebook/react/runtime/ReactHostImpl$e;->a(Lu2/f;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactInstance;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string p2, "getOrCreateReloadTask()"

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string p1, "Skipping ReactInstance.destroy(): ReactInstance null"

    .line 12
    .line 13
    invoke-direct {p0, p2, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v0, "Destroying ReactInstance"

    .line 18
    .line 19
    invoke-direct {p0, p2, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/facebook/react/runtime/ReactInstance;->i()V

    .line 23
    .line 24
    .line 25
    :goto_0
    const-string p1, "Resetting ReactContext ref"

    .line 26
    .line 27
    invoke-direct {p0, p2, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->o:Lcom/facebook/react/runtime/a;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/facebook/react/runtime/a;->d()V

    .line 33
    .line 34
    .line 35
    const-string p1, "Resetting ReactInstance task ref"

    .line 36
    .line 37
    invoke-direct {p0, p2, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->m:Lcom/facebook/react/runtime/a;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/facebook/react/runtime/a;->d()V

    .line 43
    .line 44
    .line 45
    const-string p1, "Resetting ReactInstance ptr"

    .line 46
    .line 47
    invoke-direct {p0, p2, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    .line 52
    .line 53
    const-string v0, "Resetting preload task ref"

    .line 54
    .line 55
    invoke-direct {p0, p2, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->z:Lu2/f;

    .line 59
    .line 60
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->w0()Lu2/f;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1
.end method

.method public static synthetic i(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;Ljava/lang/String;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/runtime/ReactHostImpl;->d1(Lcom/facebook/react/runtime/ReactHostImpl$e;Ljava/lang/String;Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic i1(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 1

    .line 1
    const-string v0, "7: Restarting surfaces"

    .line 2
    .line 3
    invoke-interface {p1, p2, v0}, Lcom/facebook/react/runtime/ReactHostImpl$e;->a(Lu2/f;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactInstance;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "getOrCreateReloadTask()"

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string p1, "Skipping surface restart: ReactInstance null"

    .line 12
    .line 13
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :cond_0
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->D1(Ljava/lang/String;Lcom/facebook/react/runtime/ReactInstance;)V

    .line 18
    .line 19
    .line 20
    return-object p2
.end method

.method public static synthetic j(Lcom/facebook/react/runtime/ReactHostImpl;Lu2/f;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->H0(Lu2/f;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method private j0()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    invoke-static {}, Le2/a;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lu2/f;->i:Ljava/util/concurrent/Executor;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    :goto_0
    return-object v0
.end method

.method private synthetic j1(Ljava/lang/String;Lu2/f;)Lu2/f;
    .locals 4

    .line 1
    invoke-virtual {p2}, Lu2/f;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "getOrCreateReloadTask()"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Lu2/f;->n()Ljava/lang/Exception;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v3, "Error during reload. ReactInstance task faulted. Fault reason: "

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ". Reload reason: "

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p2}, Lu2/f;->n()Ljava/lang/Exception;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-direct {p0, v1, v0, v2}, Lcom/facebook/react/runtime/ReactHostImpl;->y1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-virtual {p2}, Lu2/f;->q()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    new-instance v0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string v2, "Error during reload. ReactInstance task cancelled. Reload reason: "

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-direct {p0, v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    const-string p1, "Resetting reload task ref"

    .line 76
    .line 77
    invoke-direct {p0, v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->A:Lu2/f;

    .line 82
    .line 83
    return-object p2
.end method

.method public static synthetic k(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;Lu2/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/runtime/ReactHostImpl;->G0(Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;Lu2/f;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic k1(Lu2/g;Z)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Async result = "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "isMetroRunning()"

    .line 19
    .line 20
    invoke-direct {p0, v1, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1, p2}, Lu2/g;->d(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static synthetic l(Lcom/facebook/react/runtime/ReactHostImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->P0()V

    return-void
.end method

.method private synthetic l1(Ljava/lang/String;ILjava/lang/String;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/runtime/ReactInstance;)V
    .locals 1

    .line 1
    const-string v0, "Execute"

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p5, p2, p3}, Lcom/facebook/react/runtime/ReactInstance;->z(ILjava/lang/String;)V

    invoke-static {p4}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/Callback;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic m(Lcom/facebook/react/runtime/ReactHostImpl;)Lcom/facebook/react/bridge/JSBundleLoader;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->R0()Lcom/facebook/react/bridge/JSBundleLoader;

    move-result-object p0

    return-object p0
.end method

.method private synthetic m1(Ljava/lang/String;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x0(Ljava/lang/String;)Lu2/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public static synthetic n(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;Lcom/facebook/react/runtime/ReactInstance;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/runtime/ReactHostImpl;->I0(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;Lcom/facebook/react/runtime/ReactInstance;)V

    return-void
.end method

.method private n0()Lu2/f;
    .locals 3

    .line 1
    const-string v0, "getJSBundleLoader()"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->t1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->k:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->j:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->E0()Lu2/f;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Lcom/facebook/react/runtime/K;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Lcom/facebook/react/runtime/K;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    .line 21
    .line 22
    .line 23
    iget-object v2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lu2/f;->v(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_0
    new-instance v0, Lcom/facebook/react/runtime/L;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Lcom/facebook/react/runtime/L;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lu2/f;->c(Ljava/util/concurrent/Callable;)Lu2/f;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method

.method private synthetic n1(Lu2/f;)Lu2/f;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lu2/f;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lu2/f;->n()Ljava/lang/Exception;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-boolean v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->k:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->d:LX1/e;

    .line 16
    .line 17
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/JSExceptionHandler;->handleException(Ljava/lang/Exception;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->b:Lcom/facebook/react/runtime/g;

    .line 21
    .line 22
    invoke-interface {v0, p1}, Lcom/facebook/react/runtime/g;->d(Ljava/lang/Exception;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "Reload failed"

    .line 26
    .line 27
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->s0(Ljava/lang/String;Ljava/lang/Exception;)Lu2/f;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :cond_1
    return-object p1
.end method

.method public static synthetic o(Ljava/lang/ref/WeakReference;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->K0(Ljava/lang/ref/WeakReference;I)V

    return-void
.end method

.method private synthetic o1(Ljava/lang/String;)Lu2/f;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->B:Lu2/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "reload()"

    .line 6
    .line 7
    const-string v1, "Waiting for destroy to finish, before reloading React Native."

    .line 8
    .line 9
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->B:Lu2/f;

    .line 13
    .line 14
    new-instance v1, Lcom/facebook/react/runtime/w;

    .line 15
    .line 16
    invoke-direct {v1, p0, p1}, Lcom/facebook/react/runtime/w;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 20
    .line 21
    invoke-virtual {v0, v1, p1}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    invoke-virtual {p1}, Lu2/f;->t()Lu2/f;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x0(Ljava/lang/String;)Lu2/f;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    goto :goto_0

    .line 35
    :goto_1
    new-instance v0, Lcom/facebook/react/runtime/x;

    .line 36
    .line 37
    invoke-direct {v0, p0}, Lcom/facebook/react/runtime/x;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    invoke-virtual {p1, v0, v1}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
.end method

.method public static synthetic p(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu2/f;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactInstance;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/facebook/react/runtime/ReactHostImpl;->M0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lu2/f;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactInstance;

    move-result-object p0

    return-object p0
.end method

.method private synthetic p1(Ljava/lang/String;Lcom/facebook/react/runtime/e0;Lcom/facebook/react/runtime/ReactInstance;)V
    .locals 1

    .line 1
    const-string v0, "Execute"

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Lcom/facebook/react/runtime/ReactInstance;->A(Lcom/facebook/react/runtime/e0;)V

    return-void
.end method

.method public static synthetic q(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->m1(Ljava/lang/String;Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic q1(Ljava/lang/String;Lcom/facebook/react/runtime/e0;Lcom/facebook/react/runtime/ReactInstance;)V
    .locals 1

    .line 1
    const-string v0, "Execute"

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Lcom/facebook/react/runtime/ReactInstance;->B(Lcom/facebook/react/runtime/e0;)V

    return-void
.end method

.method public static synthetic r(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->i1(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic r1(IILu2/f;)Lu2/f;
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->J1(II)Lu2/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public static synthetic s(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lcom/facebook/react/runtime/e0;Lcom/facebook/react/runtime/ReactInstance;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/runtime/ReactHostImpl;->q1(Ljava/lang/String;Lcom/facebook/react/runtime/e0;Lcom/facebook/react/runtime/ReactInstance;)V

    return-void
.end method

.method private s0(Ljava/lang/String;Ljava/lang/Exception;)Lu2/f;
    .locals 3

    .line 1
    const-string v0, "getOrCreateDestroyTask()"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->t1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->y1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    const-string p2, "Destroy"

    .line 10
    .line 11
    invoke-direct {p0, p2, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->c0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactHostImpl$e;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->B:Lu2/f;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->m:Lcom/facebook/react/runtime/a;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/facebook/react/runtime/a;->a()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lu2/f;

    .line 26
    .line 27
    new-instance v1, Lcom/facebook/react/runtime/n;

    .line 28
    .line 29
    invoke-direct {v1, p0, p2, p1}, Lcom/facebook/react/runtime/n;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->f:Ljava/util/concurrent/Executor;

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lcom/facebook/react/runtime/o;

    .line 39
    .line 40
    invoke-direct {v1, p0, p2}, Lcom/facebook/react/runtime/o;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    new-instance v1, Lcom/facebook/react/runtime/p;

    .line 50
    .line 51
    invoke-direct {v1, p0, p2}, Lcom/facebook/react/runtime/p;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;)V

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->f:Ljava/util/concurrent/Executor;

    .line 55
    .line 56
    invoke-virtual {v0, v1, v2}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, Lcom/facebook/react/runtime/q;

    .line 61
    .line 62
    invoke-direct {v1, p0, p2, p1}, Lcom/facebook/react/runtime/q;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->f:Ljava/util/concurrent/Executor;

    .line 66
    .line 67
    invoke-virtual {v0, v1, v2}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v1, Lcom/facebook/react/runtime/r;

    .line 72
    .line 73
    invoke-direct {v1, p0, p2}, Lcom/facebook/react/runtime/r;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;)V

    .line 74
    .line 75
    .line 76
    iget-object p2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 77
    .line 78
    invoke-virtual {v0, v1, p2}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    new-instance v0, Lcom/facebook/react/runtime/t;

    .line 83
    .line 84
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/runtime/t;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v0}, Lu2/f;->h(Lu2/a;)Lu2/f;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->B:Lu2/f;

    .line 92
    .line 93
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->B:Lu2/f;

    .line 94
    .line 95
    return-object p1
.end method

.method private s1()Lu2/f;
    .locals 4

    .line 1
    const-string v0, "loadJSBundleFromMetro()"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->t1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lu2/g;

    .line 7
    .line 8
    invoke-direct {v0}, Lu2/g;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->f()LX1/e;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/facebook/react/devsupport/B;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/facebook/react/devsupport/B;->k0()Lcom/facebook/react/devsupport/g;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v1}, Lcom/facebook/react/devsupport/B;->l0()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Lcom/facebook/react/devsupport/g;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v3, Lcom/facebook/react/runtime/ReactHostImpl$c;

    .line 36
    .line 37
    invoke-direct {v3, p0, v2, v1, v0}, Lcom/facebook/react/runtime/ReactHostImpl$c;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lcom/facebook/react/devsupport/B;Lu2/g;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2, v3}, Lcom/facebook/react/devsupport/B;->L0(Ljava/lang/String;LX1/a;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lu2/g;->a()Lu2/f;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method

.method private setPausedInDebuggerMessage(Ljava/lang/String;)V
    .locals 2
    .annotation build LR1/a;
    .end annotation

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->d:LX1/e;

    invoke-interface {p1}, LX1/e;->g()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->d:LX1/e;

    new-instance v1, Lcom/facebook/react/runtime/ReactHostImpl$a;

    invoke-direct {v1, p0}, Lcom/facebook/react/runtime/ReactHostImpl$a;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    invoke-interface {v0, p1, v1}, LX1/e;->i(Ljava/lang/String;LX1/e$a;)V

    :goto_0
    return-void
.end method

.method public static synthetic t(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;ILjava/lang/String;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/runtime/ReactInstance;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/facebook/react/runtime/ReactHostImpl;->l1(Ljava/lang/String;ILjava/lang/String;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/runtime/ReactInstance;)V

    return-void
.end method

.method private t0()Lcom/facebook/react/runtime/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->o:Lcom/facebook/react/runtime/a;

    new-instance v1, Lcom/facebook/react/runtime/M;

    invoke-direct {v1, p0}, Lcom/facebook/react/runtime/M;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    invoke-virtual {v0, v1}, Lcom/facebook/react/runtime/a;->c(Lcom/facebook/react/runtime/a$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/runtime/c;

    return-object v0
.end method

.method private t1(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->r:Lcom/facebook/react/runtime/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ReactHost{"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->t:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "}."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/d;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic u(Lcom/facebook/react/runtime/ReactHostImpl;Lu2/f;)Lcom/facebook/react/runtime/ReactHostImpl$b;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->a1(Lu2/f;)Lcom/facebook/react/runtime/ReactHostImpl$b;

    move-result-object p0

    return-object p0
.end method

.method private u0()Lcom/facebook/react/runtime/ReactHostInspectorTarget;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->y:Lcom/facebook/react/runtime/ReactHostInspectorTarget;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/react/devsupport/InspectorFlags;->getFuseboxEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/facebook/react/runtime/ReactHostInspectorTarget;

    invoke-direct {v0, p0}, Lcom/facebook/react/runtime/ReactHostInspectorTarget;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    iput-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->y:Lcom/facebook/react/runtime/ReactHostInspectorTarget;

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->y:Lcom/facebook/react/runtime/ReactHostInspectorTarget;

    return-object v0
.end method

.method private u1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->r:Lcom/facebook/react/runtime/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ReactHost{"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->t:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "}."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/d;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic v(Lcom/facebook/react/runtime/ReactHostImpl;Lu2/g;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->k1(Lu2/g;Z)V

    return-void
.end method

.method private v0()Lu2/f;
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/runtime/m;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/react/runtime/m;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lu2/f;->d(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lcom/facebook/react/runtime/U;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/facebook/react/runtime/U;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lu2/f;->j(Lu2/a;)Lu2/f;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method private v1(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->s:Lcom/facebook/react/runtime/c0;

    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/c0;->b(Lcom/facebook/react/bridge/ReactContext;)V

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->e0()V

    :cond_0
    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->B1(Landroid/app/Activity;)V

    return-void
.end method

.method public static synthetic w(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/ref/WeakReference;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->L0(Ljava/lang/ref/WeakReference;I)V

    return-void
.end method

.method private w0()Lu2/f;
    .locals 2

    .line 1
    const-string v0, "getOrCreateReactInstanceTask()"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->t1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->m:Lcom/facebook/react/runtime/a;

    .line 7
    .line 8
    new-instance v1, Lcom/facebook/react/runtime/G;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/facebook/react/runtime/G;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/facebook/react/runtime/a;->c(Lcom/facebook/react/runtime/a$a;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lu2/f;

    .line 18
    .line 19
    return-object v0
.end method

.method public static synthetic x(Lcom/facebook/react/runtime/ReactHostImpl;)Lcom/facebook/react/runtime/c;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->Y0()Lcom/facebook/react/runtime/c;

    move-result-object p0

    return-object p0
.end method

.method private x0(Ljava/lang/String;)Lu2/f;
    .locals 4

    .line 1
    const-string v0, "getOrCreateReloadTask()"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->t1(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v1, "Reload"

    .line 10
    .line 11
    invoke-direct {p0, v1, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->c0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/runtime/ReactHostImpl$e;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->A:Lu2/f;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->m:Lcom/facebook/react/runtime/a;

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/facebook/react/runtime/a;->a()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lu2/f;

    .line 26
    .line 27
    new-instance v2, Lcom/facebook/react/runtime/y;

    .line 28
    .line 29
    invoke-direct {v2, p0, v0, p1}, Lcom/facebook/react/runtime/y;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->f:Ljava/util/concurrent/Executor;

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Lcom/facebook/react/runtime/z;

    .line 39
    .line 40
    invoke-direct {v2, p0, v0}, Lcom/facebook/react/runtime/z;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;)V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    invoke-virtual {v1, v2, v3}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    new-instance v2, Lcom/facebook/react/runtime/A;

    .line 50
    .line 51
    invoke-direct {v2, p0, v0}, Lcom/facebook/react/runtime/A;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;)V

    .line 52
    .line 53
    .line 54
    iget-object v3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->f:Ljava/util/concurrent/Executor;

    .line 55
    .line 56
    invoke-virtual {v1, v2, v3}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v2, Lcom/facebook/react/runtime/B;

    .line 61
    .line 62
    invoke-direct {v2, p0, v0}, Lcom/facebook/react/runtime/B;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;)V

    .line 63
    .line 64
    .line 65
    iget-object v3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->f:Ljava/util/concurrent/Executor;

    .line 66
    .line 67
    invoke-virtual {v1, v2, v3}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    new-instance v2, Lcom/facebook/react/runtime/C;

    .line 72
    .line 73
    invoke-direct {v2, p0, v0}, Lcom/facebook/react/runtime/C;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;)V

    .line 74
    .line 75
    .line 76
    iget-object v3, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 77
    .line 78
    invoke-virtual {v1, v2, v3}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    new-instance v2, Lcom/facebook/react/runtime/E;

    .line 83
    .line 84
    invoke-direct {v2, p0, v0}, Lcom/facebook/react/runtime/E;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 88
    .line 89
    invoke-virtual {v1, v2, v0}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    new-instance v1, Lcom/facebook/react/runtime/F;

    .line 94
    .line 95
    invoke-direct {v1, p0, p1}, Lcom/facebook/react/runtime/F;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 99
    .line 100
    invoke-virtual {v0, v1, p1}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->A:Lu2/f;

    .line 105
    .line 106
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->A:Lu2/f;

    .line 107
    .line 108
    return-object p1
.end method

.method private x1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->y1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic y(Lcom/facebook/react/runtime/ReactHostImpl;Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->g1(Lcom/facebook/react/runtime/ReactHostImpl$e;Lu2/f;)Lu2/f;

    move-result-object p0

    return-object p0
.end method

.method private y1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "raiseSoftException("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ": "

    const-string v1, "ReactHost"

    if-eqz p3, :cond_0

    new-instance v2, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, p3}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v1, v2}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    new-instance p3, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    invoke-static {v1, p3}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic z(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lu2/f;)Ljava/lang/Void;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/runtime/ReactHostImpl;->X0(Ljava/lang/String;Lu2/f;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method A0()Lcom/facebook/react/fabric/FabricUIManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactInstance;->p()Lcom/facebook/react/fabric/FabricUIManager;

    move-result-object v0

    return-object v0
.end method

.method public A1(Ljava/lang/String;)Lb2/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/runtime/l;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/runtime/l;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lu2/f;->d(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, Lcom/facebook/react/runtime/U;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/facebook/react/runtime/U;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lu2/f;->j(Lu2/a;)Lu2/f;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method B0(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleHostException(message = \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->t1(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->k:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->d:LX1/e;

    invoke-interface {v1, p1}, Lcom/facebook/react/bridge/JSExceptionHandler;->handleException(Ljava/lang/Exception;)V

    :cond_0
    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->d0(Ljava/lang/String;Ljava/lang/Exception;)Lb2/a;

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->b:Lcom/facebook/react/runtime/g;

    invoke-interface {v0, p1}, Lcom/facebook/react/runtime/g;->d(Ljava/lang/Exception;)V

    return-void
.end method

.method C0(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/ReactInstance;->r(Ljava/lang/Class;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public C1(Lcom/facebook/react/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->u:Lcom/facebook/react/i;

    return-void
.end method

.method D0()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method E1(Lcom/facebook/react/runtime/e0;)Lb2/a;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "startSurface(surfaceId = "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->n()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ")"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "Schedule"

    .line 28
    .line 29
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->X(Lcom/facebook/react/runtime/e0;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lcom/facebook/react/runtime/Q;

    .line 36
    .line 37
    invoke-direct {v1, p0, v0, p1}, Lcom/facebook/react/runtime/Q;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lcom/facebook/react/runtime/e0;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    invoke-direct {p0, v0, v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->Y(Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
.end method

.method F0(Ljava/lang/String;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->h:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->h:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/runtime/e0;

    invoke-virtual {v2}, Lcom/facebook/react/runtime/e0;->j()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method G1(Lcom/facebook/react/runtime/e0;)Lb2/a;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "stopSurface(surfaceId = "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->n()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, ")"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "Schedule"

    .line 28
    .line 29
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->f0(Lcom/facebook/react/runtime/e0;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lcom/facebook/react/runtime/S;

    .line 36
    .line 37
    invoke-direct {v1, p0, v0, p1}, Lcom/facebook/react/runtime/S;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Lcom/facebook/react/runtime/e0;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    invoke-direct {p0, v0, v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->a0(Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lu2/f;->t()Lu2/f;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method X(Lcom/facebook/react/runtime/e0;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "attachSurface(surfaceId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->n()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->t1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->h:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->h:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method Z(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)Lu2/f;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "callFunctionOnModule(\""

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, "\", \""

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "\")"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Lcom/facebook/react/runtime/O;

    .line 32
    .line 33
    invoke-direct {v1, p1, p2, p3}, Lcom/facebook/react/runtime/O;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)V

    .line 34
    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    invoke-direct {p0, v0, v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->a0(Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lc2/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/runtime/e0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Lcom/facebook/react/runtime/e0;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/facebook/react/runtime/f0;

    .line 7
    .line 8
    invoke-direct {p2, p1, v0}, Lcom/facebook/react/runtime/f0;-><init>(Landroid/content/Context;Lcom/facebook/react/runtime/e0;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-virtual {p2, p1}, Lcom/facebook/react/X;->setShouldLogContentAppeared(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p2}, Lcom/facebook/react/runtime/e0;->d(Lcom/facebook/react/runtime/f0;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lcom/facebook/react/runtime/e0;->c(Lcom/facebook/react/runtime/ReactHostImpl;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public b(Landroid/app/Activity;Lm2/b;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lcom/facebook/react/runtime/ReactHostImpl;->w:Lm2/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->w1(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->h0()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    if-eqz v0, :cond_0

    const-class v1, Lcom/facebook/react/modules/appearance/AppearanceModule;

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/modules/appearance/AppearanceModule;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/facebook/react/modules/appearance/AppearanceModule;->onConfigurationChanged(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public d(Landroid/app/Activity;)V
    .locals 6

    .line 1
    const-string v0, "onHostPause(activity)"

    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->t1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->h0()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->g0()Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    if-nez p1, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    :goto_0
    if-ne p1, v1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Pausing an activity that is not the current activity, this is incorrect! Current activity: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " Paused activity: "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, LO1/a;->b(ZLjava/lang/String;)V

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->w:Lm2/b;

    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->s:Lcom/facebook/react/runtime/c0;

    invoke-virtual {p1, v0, v1}, Lcom/facebook/react/runtime/c0;->c(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V

    return-void
.end method

.method public d0(Ljava/lang/String;Ljava/lang/Exception;)Lb2/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/runtime/T;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/facebook/react/runtime/T;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->e:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lu2/f;->d(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance p2, Lcom/facebook/react/runtime/U;

    .line 13
    .line 14
    invoke-direct {p2}, Lcom/facebook/react/runtime/U;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p2}, Lu2/f;->j(Lu2/a;)Lu2/f;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public e(Landroid/app/Activity;)V
    .locals 1

    .line 1
    const-string v0, "onHostDestroy(activity)"

    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->t1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->g0()Landroid/app/Activity;

    move-result-object v0

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->h0()Lcom/facebook/react/bridge/ReactContext;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->v1(Lcom/facebook/react/bridge/ReactContext;)V

    :cond_0
    return-void
.end method

.method public f()LX1/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->d:LX1/e;

    .line 2
    .line 3
    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LX1/e;

    .line 8
    .line 9
    return-object v0
.end method

.method f0(Lcom/facebook/react/runtime/e0;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "detachSurface(surfaceId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/facebook/react/runtime/e0;->n()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->t1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->h:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/runtime/ReactHostImpl;->h:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public g()Z
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-class v2, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    invoke-virtual {v0, v2}, Lcom/facebook/react/runtime/ReactInstance;->l(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, Lcom/facebook/react/modules/core/DeviceEventManagerModule;->emitHardwareBackPressed()V

    const/4 v0, 0x1

    return v0
.end method

.method g0()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    return-object v0
.end method

.method public h0()Lcom/facebook/react/bridge/ReactContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->o:Lcom/facebook/react/runtime/a;

    invoke-virtual {v0}, Lcom/facebook/react/runtime/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    return-object v0
.end method

.method i0()Lm2/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/runtime/h;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/react/runtime/h;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method k0()Lcom/facebook/react/uimanager/events/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/react/uimanager/events/b;->j()Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactInstance;->j()Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    return-object v0
.end method

.method l0()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactInstance;->getJSCallInvokerHolder()Lcom/facebook/react/turbomodule/core/CallInvokerHolderImpl;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "getJSCallInvokerHolder()"

    const-string v1, "Tried to get JSCallInvokerHolder while instance is not ready"

    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method m0()Lcom/facebook/react/bridge/JavaScriptContextHolder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactInstance;->k()Lcom/facebook/react/bridge/JavaScriptContextHolder;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method o0()Landroid/app/Activity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->q:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onActivityResult(activity = \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\", requestCode = \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\", resultCode = \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\", data = \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->h0()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1, p2, p3, p4}, Lcom/facebook/react/bridge/ReactContext;->onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V

    goto :goto_0

    :cond_0
    const-string p1, "Tried to access onActivityResult while context is not ready"

    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onNewIntent(intent = \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->h0()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "android.intent.action.VIEW"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string v3, "android.nfc.action.NDEF_DISCOVERED"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-class v0, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    invoke-virtual {v1, v0}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/modules/core/DeviceEventManagerModule;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v2}, Lcom/facebook/react/modules/core/DeviceEventManagerModule;->emitNewIntentReceived(Landroid/net/Uri;)V

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->g0()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v1, v0, p1}, Lcom/facebook/react/bridge/ReactContext;->onNewIntent(Landroid/app/Activity;Landroid/content/Intent;)V

    goto :goto_0

    :cond_2
    const-string p1, "Tried to access onNewIntent while context is not ready"

    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onWindowFocusChange(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onWindowFocusChange(hasFocus = \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "\")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->h0()Lcom/facebook/react/bridge/ReactContext;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lcom/facebook/react/bridge/ReactContext;->onWindowFocusChange(Z)V

    goto :goto_0

    :cond_0
    const-string p1, "Tried to access onWindowFocusChange while context is not ready"

    invoke-direct {p0, v0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method p0(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;
    .locals 2

    .line 1
    const-class v0, Lcom/facebook/react/uimanager/UIManagerModule;

    if-ne p1, v0, :cond_0

    new-instance v0, Lcom/facebook/react/bridge/ReactNoCrashBridgeNotAllowedSoftException;

    const-string v1, "getNativeModule(UIManagerModule.class) cannot be called when the bridge is disabled"

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/ReactNoCrashBridgeNotAllowedSoftException;-><init>(Ljava/lang/String;)V

    const-string v1, "ReactHost"

    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftExceptionVerbose(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/ReactInstance;->l(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method q0(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/facebook/react/runtime/ReactInstance;->m(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method r0()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactInstance;->n()Ljava/util/Collection;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public w1(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const-string v0, "onHostResume(activity)"

    invoke-direct {p0, v0}, Lcom/facebook/react/runtime/ReactHostImpl;->t1(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->B1(Landroid/app/Activity;)V

    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->h0()Lcom/facebook/react/bridge/ReactContext;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->s:Lcom/facebook/react/runtime/c0;

    invoke-virtual {p0}, Lcom/facebook/react/runtime/ReactHostImpl;->g0()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/facebook/react/runtime/c0;->d(Lcom/facebook/react/bridge/ReactContext;Landroid/app/Activity;)V

    return-void
.end method

.method public y0()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactInstance;->o()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method z0()Lcom/facebook/react/bridge/RuntimeExecutor;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/ReactHostImpl;->n:Lcom/facebook/react/runtime/ReactInstance;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/runtime/ReactInstance;->getBufferedRuntimeExecutor()Lcom/facebook/react/bridge/RuntimeExecutor;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "getRuntimeExecutor()"

    const-string v1, "Tried to get runtime executor while instance is not ready"

    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->x1(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method z1(ILjava/lang/String;Lcom/facebook/react/bridge/Callback;)Lu2/f;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "registerSegment(segmentId = \""

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, "\", path = \""

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, "\")"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "Schedule"

    .line 32
    .line 33
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/runtime/ReactHostImpl;->u1(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lcom/facebook/react/runtime/D;

    .line 37
    .line 38
    move-object v2, v1

    .line 39
    move-object v3, p0

    .line 40
    move-object v4, v0

    .line 41
    move v5, p1

    .line 42
    move-object v6, p2

    .line 43
    move-object v7, p3

    .line 44
    invoke-direct/range {v2 .. v7}, Lcom/facebook/react/runtime/D;-><init>(Lcom/facebook/react/runtime/ReactHostImpl;Ljava/lang/String;ILjava/lang/String;Lcom/facebook/react/bridge/Callback;)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    invoke-direct {p0, v0, v1, p1}, Lcom/facebook/react/runtime/ReactHostImpl;->a0(Ljava/lang/String;Lcom/facebook/react/runtime/ReactHostImpl$d;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method
