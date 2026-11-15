.class public Lcom/facebook/react/uimanager/events/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/events/e;
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/events/f$c;,
        Lcom/facebook/react/uimanager/events/f$d;
    }
.end annotation


# static fields
.field private static final C:Ljava/util/Comparator;


# instance fields
.field private A:S

.field private volatile B:Z

.field private final m:Ljava/lang/Object;

.field private final n:Ljava/lang/Object;

.field private final o:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final p:Landroid/util/LongSparseArray;

.field private final q:Ljava/util/Map;

.field private final r:Lcom/facebook/react/uimanager/events/f$c;

.field private final s:Ljava/util/ArrayList;

.field private final t:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final u:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final v:Lcom/facebook/react/uimanager/events/f$d;

.field private final w:Ljava/util/concurrent/atomic/AtomicInteger;

.field private x:[Lcom/facebook/react/uimanager/events/d;

.field private y:I

.field private volatile z:Lcom/facebook/react/uimanager/events/ReactEventEmitter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/uimanager/events/f$a;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/events/f$a;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/events/f;->C:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/f;->m:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/f;->n:Ljava/lang/Object;

    new-instance v0, Landroid/util/LongSparseArray;

    invoke-direct {v0}, Landroid/util/LongSparseArray;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/f;->p:Landroid/util/LongSparseArray;

    invoke-static {}, LS1/f;->b()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/f;->q:Ljava/util/Map;

    new-instance v0, Lcom/facebook/react/uimanager/events/f$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/react/uimanager/events/f$c;-><init>(Lcom/facebook/react/uimanager/events/f;Lcom/facebook/react/uimanager/events/g;)V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/f;->r:Lcom/facebook/react/uimanager/events/f$c;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/f;->s:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/f;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/f;->u:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, Lcom/facebook/react/uimanager/events/f$d;

    invoke-direct {v0, p0, v1}, Lcom/facebook/react/uimanager/events/f$d;-><init>(Lcom/facebook/react/uimanager/events/f;Lcom/facebook/react/uimanager/events/h;)V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/f;->v:Lcom/facebook/react/uimanager/events/f$d;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/f;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    const/16 v0, 0x10

    new-array v0, v0, [Lcom/facebook/react/uimanager/events/d;

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/f;->x:[Lcom/facebook/react/uimanager/events/d;

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/react/uimanager/events/f;->y:I

    iput-short v0, p0, Lcom/facebook/react/uimanager/events/f;->A:S

    iput-boolean v0, p0, Lcom/facebook/react/uimanager/events/f;->B:Z

    iput-object p1, p0, Lcom/facebook/react/uimanager/events/f;->o:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    new-instance v0, Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/f;->z:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    return-void
.end method

.method private A()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->x:[Lcom/facebook/react/uimanager/events/d;

    iget v1, p0, Lcom/facebook/react/uimanager/events/f;->y:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    iput v3, p0, Lcom/facebook/react/uimanager/events/f;->y:I

    return-void
.end method

.method private B(ILjava/lang/String;S)J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->q:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Short;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Short;->shortValue()S

    move-result p2

    goto :goto_0

    :cond_0
    iget-short v0, p0, Lcom/facebook/react/uimanager/events/f;->A:S

    add-int/lit8 v1, v0, 0x1

    int-to-short v1, v1

    iput-short v1, p0, Lcom/facebook/react/uimanager/events/f;->A:S

    iget-object v1, p0, Lcom/facebook/react/uimanager/events/f;->q:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v2

    invoke-interface {v1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move p2, v0

    :goto_0
    invoke-static {p1, p2, p3}, Lcom/facebook/react/uimanager/events/f;->C(ISS)J

    move-result-wide p1

    return-wide p1
.end method

.method private static C(ISS)J
    .locals 5

    .line 1
    int-to-long v0, p0

    int-to-long p0, p1

    const-wide/32 v2, 0xffff

    and-long/2addr p0, v2

    const/16 v4, 0x20

    shl-long/2addr p0, v4

    or-long/2addr p0, v0

    int-to-long v0, p2

    and-long/2addr v0, v2

    const/16 p2, 0x30

    shl-long/2addr v0, p2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method private D()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->z:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->v:Lcom/facebook/react/uimanager/events/f$d;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/f$d;->b()V

    :cond_0
    return-void
.end method

.method private E()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/events/f;->n:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    :goto_0
    :try_start_1
    iget-object v3, p0, Lcom/facebook/react/uimanager/events/f;->s:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_5

    iget-object v3, p0, Lcom/facebook/react/uimanager/events/f;->s:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/react/uimanager/events/d;

    invoke-virtual {v3}, Lcom/facebook/react/uimanager/events/d;->canCoalesce()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-direct {p0, v3}, Lcom/facebook/react/uimanager/events/f;->z(Lcom/facebook/react/uimanager/events/d;)V

    goto :goto_2

    :catchall_0
    move-exception v2

    goto :goto_3

    :cond_0
    invoke-virtual {v3}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v4

    invoke-virtual {v3}, Lcom/facebook/react/uimanager/events/d;->getEventName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/facebook/react/uimanager/events/d;->getCoalescingKey()S

    move-result v6

    invoke-direct {p0, v4, v5, v6}, Lcom/facebook/react/uimanager/events/f;->B(ILjava/lang/String;S)J

    move-result-wide v4

    iget-object v6, p0, Lcom/facebook/react/uimanager/events/f;->p:Landroid/util/LongSparseArray;

    invoke-virtual {v6, v4, v5}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    const/4 v7, 0x0

    if-nez v6, :cond_1

    iget-object v6, p0, Lcom/facebook/react/uimanager/events/f;->p:Landroid/util/LongSparseArray;

    iget v8, p0, Lcom/facebook/react/uimanager/events/f;->y:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v4, v5, v8}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v8, p0, Lcom/facebook/react/uimanager/events/f;->x:[Lcom/facebook/react/uimanager/events/d;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v9

    aget-object v8, v8, v9

    invoke-virtual {v3, v8}, Lcom/facebook/react/uimanager/events/d;->coalesce(Lcom/facebook/react/uimanager/events/d;)Lcom/facebook/react/uimanager/events/d;

    move-result-object v9

    if-eq v9, v8, :cond_2

    iget-object v3, p0, Lcom/facebook/react/uimanager/events/f;->p:Landroid/util/LongSparseArray;

    iget v10, p0, Lcom/facebook/react/uimanager/events/f;->y:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v3, v4, v5, v10}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    iget-object v3, p0, Lcom/facebook/react/uimanager/events/f;->x:[Lcom/facebook/react/uimanager/events/d;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v4

    aput-object v7, v3, v4

    move-object v7, v8

    move-object v3, v9

    goto :goto_1

    :cond_2
    move-object v11, v7

    move-object v7, v3

    move-object v3, v11

    :goto_1
    if-eqz v3, :cond_3

    invoke-direct {p0, v3}, Lcom/facebook/react/uimanager/events/f;->z(Lcom/facebook/react/uimanager/events/d;)V

    :cond_3
    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lcom/facebook/react/uimanager/events/d;->dispose()V

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v1, p0, Lcom/facebook/react/uimanager/events/f;->s:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_1
    move-exception v1

    goto :goto_4

    :goto_3
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v2

    :goto_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v1
.end method

.method private F()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->v:Lcom/facebook/react/uimanager/events/f$d;

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/f$d;->d()V

    return-void
.end method

.method static bridge synthetic j(Lcom/facebook/react/uimanager/events/f;)Lcom/facebook/react/uimanager/events/f$d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/f;->v:Lcom/facebook/react/uimanager/events/f$d;

    return-object p0
.end method

.method static bridge synthetic k(Lcom/facebook/react/uimanager/events/f;)Lcom/facebook/react/uimanager/events/f$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/f;->r:Lcom/facebook/react/uimanager/events/f$c;

    return-object p0
.end method

.method static bridge synthetic l(Lcom/facebook/react/uimanager/events/f;)Landroid/util/LongSparseArray;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/f;->p:Landroid/util/LongSparseArray;

    return-object p0
.end method

.method static bridge synthetic m(Lcom/facebook/react/uimanager/events/f;)[Lcom/facebook/react/uimanager/events/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/f;->x:[Lcom/facebook/react/uimanager/events/d;

    return-object p0
.end method

.method static bridge synthetic n(Lcom/facebook/react/uimanager/events/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/f;->n:Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic o(Lcom/facebook/react/uimanager/events/f;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/facebook/react/uimanager/events/f;->y:I

    return p0
.end method

.method static bridge synthetic p(Lcom/facebook/react/uimanager/events/f;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/uimanager/events/f;->B:Z

    return p0
.end method

.method static bridge synthetic q(Lcom/facebook/react/uimanager/events/f;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/f;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method static bridge synthetic r(Lcom/facebook/react/uimanager/events/f;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/f;->u:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object p0
.end method

.method static bridge synthetic s(Lcom/facebook/react/uimanager/events/f;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/f;->o:Lcom/facebook/react/bridge/ReactApplicationContext;

    return-object p0
.end method

.method static bridge synthetic t(Lcom/facebook/react/uimanager/events/f;)Lcom/facebook/react/uimanager/events/ReactEventEmitter;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/f;->z:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    return-object p0
.end method

.method static bridge synthetic u(Lcom/facebook/react/uimanager/events/f;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/uimanager/events/f;->B:Z

    return-void
.end method

.method static bridge synthetic v(Lcom/facebook/react/uimanager/events/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/f;->A()V

    return-void
.end method

.method static bridge synthetic w(Lcom/facebook/react/uimanager/events/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/f;->E()V

    return-void
.end method

.method static bridge synthetic x(Lcom/facebook/react/uimanager/events/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/f;->F()V

    return-void
.end method

.method static bridge synthetic y()Ljava/util/Comparator;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/events/f;->C:Ljava/util/Comparator;

    return-object v0
.end method

.method private z(Lcom/facebook/react/uimanager/events/d;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/f;->y:I

    iget-object v1, p0, Lcom/facebook/react/uimanager/events/f;->x:[Lcom/facebook/react/uimanager/events/d;

    array-length v2, v1

    if-ne v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/react/uimanager/events/d;

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/f;->x:[Lcom/facebook/react/uimanager/events/d;

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->x:[Lcom/facebook/react/uimanager/events/d;

    iget v1, p0, Lcom/facebook/react/uimanager/events/f;->y:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/facebook/react/uimanager/events/f;->y:I

    aput-object p1, v0, v1

    return-void
.end method


# virtual methods
.method public a(ILcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->z:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->register(ILcom/facebook/react/uimanager/events/RCTEventEmitter;)V

    return-void
.end method

.method public b(Lcom/facebook/react/uimanager/events/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public c(Lcom/facebook/react/uimanager/events/d;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->isInitialized()Z

    move-result v0

    const-string v1, "Dispatched event hasn\'t been initialized"

    invoke-static {v0, v1}, LO1/a;->b(ZLjava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->t:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/uimanager/events/i;

    invoke-interface {v1, p1}, Lcom/facebook/react/uimanager/events/i;->a(Lcom/facebook/react/uimanager/events/d;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/facebook/react/uimanager/events/f;->s:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getEventName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/d;->getUniqueID()I

    move-result p1

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, v1, p1}, LP2/a;->j(JLjava/lang/String;I)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/f;->D()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public d()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/f;->D()V

    return-void
.end method

.method public e(Lcom/facebook/react/uimanager/events/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->u:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public f(Lcom/facebook/react/uimanager/events/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->u:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g()V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/events/f$b;

    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/events/f$b;-><init>(Lcom/facebook/react/uimanager/events/f;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public h(ILcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->z:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->register(ILcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V

    return-void
.end method

.method public i(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/f;->z:Lcom/facebook/react/uimanager/events/ReactEventEmitter;

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/events/ReactEventEmitter;->unregister(I)V

    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/f;->F()V

    return-void
.end method

.method public onHostPause()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/f;->F()V

    return-void
.end method

.method public onHostResume()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/f;->D()V

    return-void
.end method
