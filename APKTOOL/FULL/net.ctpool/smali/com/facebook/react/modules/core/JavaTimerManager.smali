.class public Lcom/facebook/react/modules/core/JavaTimerManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;
.implements Lh2/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/core/JavaTimerManager$f;,
        Lcom/facebook/react/modules/core/JavaTimerManager$d;,
        Lcom/facebook/react/modules/core/JavaTimerManager$e;,
        Lcom/facebook/react/modules/core/JavaTimerManager$c;
    }
.end annotation


# instance fields
.field private A:Z

.field private B:Z

.field private final m:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final n:Lm2/c;

.field private final o:Lcom/facebook/react/modules/core/a;

.field private final p:LX1/e;

.field private final q:Ljava/lang/Object;

.field private final r:Ljava/lang/Object;

.field private final s:Ljava/util/PriorityQueue;

.field private final t:Landroid/util/SparseArray;

.field private final u:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final v:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final w:Lcom/facebook/react/modules/core/JavaTimerManager$f;

.field private final x:Lcom/facebook/react/modules/core/JavaTimerManager$d;

.field private y:Lcom/facebook/react/modules/core/JavaTimerManager$c;

.field private z:Z


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Lm2/c;Lcom/facebook/react/modules/core/a;LX1/e;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->q:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->r:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->u:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    new-instance v0, Lcom/facebook/react/modules/core/JavaTimerManager$f;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {v0, p0, v2}, Lcom/facebook/react/modules/core/JavaTimerManager$f;-><init>(Lcom/facebook/react/modules/core/JavaTimerManager;Lm2/f;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->w:Lcom/facebook/react/modules/core/JavaTimerManager$f;

    .line 41
    .line 42
    new-instance v0, Lcom/facebook/react/modules/core/JavaTimerManager$d;

    .line 43
    .line 44
    invoke-direct {v0, p0, v2}, Lcom/facebook/react/modules/core/JavaTimerManager$d;-><init>(Lcom/facebook/react/modules/core/JavaTimerManager;Lm2/d;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->x:Lcom/facebook/react/modules/core/JavaTimerManager$d;

    .line 48
    .line 49
    iput-boolean v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->z:Z

    .line 50
    .line 51
    iput-boolean v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->A:Z

    .line 52
    .line 53
    iput-boolean v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->B:Z

    .line 54
    .line 55
    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 56
    .line 57
    iput-object p2, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->n:Lm2/c;

    .line 58
    .line 59
    iput-object p3, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->o:Lcom/facebook/react/modules/core/a;

    .line 60
    .line 61
    iput-object p4, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->p:LX1/e;

    .line 62
    .line 63
    new-instance p2, Ljava/util/PriorityQueue;

    .line 64
    .line 65
    new-instance p3, Lcom/facebook/react/modules/core/JavaTimerManager$a;

    .line 66
    .line 67
    invoke-direct {p3, p0}, Lcom/facebook/react/modules/core/JavaTimerManager$a;-><init>(Lcom/facebook/react/modules/core/JavaTimerManager;)V

    .line 68
    .line 69
    .line 70
    const/16 p4, 0xb

    .line 71
    .line 72
    invoke-direct {p2, p4, p3}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->s:Ljava/util/PriorityQueue;

    .line 76
    .line 77
    new-instance p2, Landroid/util/SparseArray;

    .line 78
    .line 79
    invoke-direct {p2}, Landroid/util/SparseArray;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object p2, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->t:Landroid/util/SparseArray;

    .line 83
    .line 84
    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->u:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/JavaTimerManager$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->y:Lcom/facebook/react/modules/core/JavaTimerManager$c;

    return-object p0
.end method

.method static bridge synthetic f(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->r:Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/facebook/react/modules/core/JavaTimerManager;)Lm2/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->n:Lm2/c;

    return-object p0
.end method

.method static bridge synthetic h(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object p0
.end method

.method static bridge synthetic i(Lcom/facebook/react/modules/core/JavaTimerManager;)Lcom/facebook/react/modules/core/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->o:Lcom/facebook/react/modules/core/a;

    return-object p0
.end method

.method static bridge synthetic j(Lcom/facebook/react/modules/core/JavaTimerManager;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->B:Z

    return p0
.end method

.method static bridge synthetic k(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->q:Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic l(Lcom/facebook/react/modules/core/JavaTimerManager;)Landroid/util/SparseArray;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->t:Landroid/util/SparseArray;

    return-object p0
.end method

.method static bridge synthetic m(Lcom/facebook/react/modules/core/JavaTimerManager;)Ljava/util/PriorityQueue;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->s:Ljava/util/PriorityQueue;

    return-object p0
.end method

.method static bridge synthetic n(Lcom/facebook/react/modules/core/JavaTimerManager;Lcom/facebook/react/modules/core/JavaTimerManager$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->y:Lcom/facebook/react/modules/core/JavaTimerManager$c;

    return-void
.end method

.method static bridge synthetic o(Lcom/facebook/react/modules/core/JavaTimerManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->q()V

    return-void
.end method

.method static bridge synthetic p(Lcom/facebook/react/modules/core/JavaTimerManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->z()V

    return-void
.end method

.method private q()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->A:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->o:Lcom/facebook/react/modules/core/a;

    sget-object v1, Lcom/facebook/react/modules/core/a$b;->r:Lcom/facebook/react/modules/core/a$b;

    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->x:Lcom/facebook/react/modules/core/JavaTimerManager$d;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/a;->o(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->A:Z

    :cond_0
    return-void
.end method

.method private r()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {v0}, Lh2/c;->f(Lcom/facebook/react/bridge/ReactContext;)Lh2/c;

    move-result-object v0

    iget-boolean v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->z:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->u:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lh2/c;->g()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->o:Lcom/facebook/react/modules/core/a;

    sget-object v1, Lcom/facebook/react/modules/core/a$b;->q:Lcom/facebook/react/modules/core/a$b;

    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->w:Lcom/facebook/react/modules/core/JavaTimerManager$f;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/a;->o(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->z:Z

    :cond_0
    return-void
.end method

.method private static u(Lcom/facebook/react/modules/core/JavaTimerManager$e;J)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/facebook/react/modules/core/JavaTimerManager$e;->c(Lcom/facebook/react/modules/core/JavaTimerManager$e;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lcom/facebook/react/modules/core/JavaTimerManager$e;->b(Lcom/facebook/react/modules/core/JavaTimerManager$e;)I

    move-result p0

    int-to-long v0, p0

    cmp-long p0, v0, p1

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private v()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->u:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->r()V

    :cond_0
    return-void
.end method

.method private w()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->B:Z

    if-eqz v1, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->z()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private y()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->z:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->o:Lcom/facebook/react/modules/core/a;

    sget-object v1, Lcom/facebook/react/modules/core/a$b;->q:Lcom/facebook/react/modules/core/a$b;

    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->w:Lcom/facebook/react/modules/core/JavaTimerManager$f;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/a;->m(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->z:Z

    :cond_0
    return-void
.end method

.method private z()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->A:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->o:Lcom/facebook/react/modules/core/a;

    sget-object v1, Lcom/facebook/react/modules/core/a$b;->r:Lcom/facebook/react/modules/core/a$b;

    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->x:Lcom/facebook/react/modules/core/JavaTimerManager$d;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/a;->m(Lcom/facebook/react/modules/core/a$b;Landroid/view/Choreographer$FrameCallback;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->A:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {p1}, Lh2/c;->f(Lcom/facebook/react/bridge/ReactContext;)Lh2/c;

    move-result-object p1

    invoke-virtual {p1}, Lh2/c;->g()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->r()V

    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->v()V

    :cond_0
    return-void
.end method

.method public b(I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->y()V

    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->w()V

    :cond_0
    return-void
.end method

.method public createTimer(IJZ)V
    .locals 9
    .annotation build LR1/a;
    .end annotation

    invoke-static {}, LS1/k;->b()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    div-long/2addr v0, v2

    add-long v4, v0, p2

    new-instance v0, Lcom/facebook/react/modules/core/JavaTimerManager$e;

    long-to-int v6, p2

    const/4 v8, 0x0

    move-object v2, v0

    move v3, p1

    move v7, p4

    invoke-direct/range {v2 .. v8}, Lcom/facebook/react/modules/core/JavaTimerManager$e;-><init>(IJIZLm2/e;)V

    iget-object p2, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->q:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object p3, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->s:Ljava/util/PriorityQueue;

    invoke-virtual {p3, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    iget-object p3, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->t:Landroid/util/SparseArray;

    invoke-virtual {p3, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public deleteTimer(I)V
    .locals 3
    .annotation build LR1/a;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->q:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->t:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/modules/core/JavaTimerManager$e;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->t:Landroid/util/SparseArray;

    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->remove(I)V

    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->s:Ljava/util/PriorityQueue;

    invoke-virtual {p1, v1}, Ljava/util/PriorityQueue;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onHostDestroy()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->r()V

    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->v()V

    return-void
.end method

.method public onHostPause()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->u:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->r()V

    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->v()V

    return-void
.end method

.method public onHostResume()V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->u:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->y()V

    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->w()V

    return-void
.end method

.method public s(IIDZ)V
    .locals 6

    .line 1
    invoke-static {}, LS1/k;->a()J

    move-result-wide v0

    double-to-long p3, p3

    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->p:LX1/e;

    invoke-interface {v2}, LX1/e;->n()Z

    move-result v2

    if-eqz v2, :cond_0

    sub-long v2, p3, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    const-wide/32 v4, 0xea60

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    iget-object v2, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->n:Lm2/c;

    const-string v3, "Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine."

    invoke-interface {v2, v3}, Lm2/c;->emitTimeDriftWarning(Ljava/lang/String;)V

    :cond_0
    sub-long/2addr p3, v0

    int-to-long v0, p2

    add-long/2addr p3, v0

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p3, p4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p3

    if-nez p2, :cond_1

    if-nez p5, :cond_1

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    iget-object p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->n:Lm2/c;

    invoke-interface {p1, p2}, Lm2/c;->callTimers(Lcom/facebook/react/bridge/WritableArray;)V

    return-void

    :cond_1
    invoke-virtual {p0, p1, p3, p4, p5}, Lcom/facebook/react/modules/core/JavaTimerManager;->createTimer(IJZ)V

    return-void
.end method

.method public setSendIdleEvents(Z)V
    .locals 1
    .annotation build LR1/a;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-boolean p1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->B:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lcom/facebook/react/modules/core/JavaTimerManager$b;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/modules/core/JavaTimerManager$b;-><init>(Lcom/facebook/react/modules/core/JavaTimerManager;Z)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method t(J)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->q:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->s:Ljava/util/PriorityQueue;

    invoke-virtual {v1}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/modules/core/JavaTimerManager$e;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-static {v1, p1, p2}, Lcom/facebook/react/modules/core/JavaTimerManager;->u(Lcom/facebook/react/modules/core/JavaTimerManager$e;J)Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    monitor-exit v0

    return v3

    :cond_1
    iget-object v1, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->s:Ljava/util/PriorityQueue;

    invoke-virtual {v1}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/react/modules/core/JavaTimerManager$e;

    invoke-static {v4, p1, p2}, Lcom/facebook/react/modules/core/JavaTimerManager;->u(Lcom/facebook/react/modules/core/JavaTimerManager$e;J)Z

    move-result v4

    if-eqz v4, :cond_2

    monitor-exit v0

    return v3

    :cond_3
    monitor-exit v0

    return v2

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public x()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/core/JavaTimerManager;->m:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->r()V

    invoke-direct {p0}, Lcom/facebook/react/modules/core/JavaTimerManager;->q()V

    return-void
.end method
