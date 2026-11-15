.class public abstract Landroidx/room/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/room/u$d;,
        Landroidx/room/u$a;,
        Landroidx/room/u$e;,
        Landroidx/room/u$b;,
        Landroidx/room/u$f;,
        Landroidx/room/u$c;
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/room/u$c;

.field public static final MAX_BIND_PARAMETER_CNT:I = 0x3e7


# instance fields
.field private allowMainThreadQueries:Z

.field private autoCloser:Landroidx/room/c;

.field private autoMigrationSpecs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "LW/a;",
            ">;",
            "LW/a;",
            ">;"
        }
    .end annotation
.end field

.field private final backingFieldMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private internalOpenHelper:LZ/h;

.field private internalQueryExecutor:Ljava/util/concurrent/Executor;

.field private internalTransactionExecutor:Ljava/util/concurrent/Executor;

.field private final invalidationTracker:Landroidx/room/o;

.field protected mCallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Landroidx/room/u$b;",
            ">;"
        }
    .end annotation
.end field

.field protected volatile mDatabase:LZ/g;

.field private final readWriteLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

.field private final suspendingTransactionId:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final typeConverters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private writeAheadLoggingEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/room/u$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/room/u$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/room/u;->Companion:Landroidx/room/u$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Landroidx/room/u;->createInvalidationTracker()Landroidx/room/o;

    move-result-object v0

    iput-object v0, p0, Landroidx/room/u;->invalidationTracker:Landroidx/room/o;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/room/u;->autoMigrationSpecs:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    iput-object v0, p0, Landroidx/room/u;->readWriteLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Landroidx/room/u;->suspendingTransactionId:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "synchronizedMap(mutableMapOf())"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Landroidx/room/u;->backingFieldMap:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/room/u;->typeConverters:Ljava/util/Map;

    return-void
.end method

.method private final a()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/room/u;->assertNotMainThread()V

    invoke-virtual {p0}, Landroidx/room/u;->getOpenHelper()LZ/h;

    move-result-object v0

    invoke-interface {v0}, LZ/h;->l0()LZ/g;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/room/u;->getInvalidationTracker()Landroidx/room/o;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/room/o;->v(LZ/g;)V

    invoke-interface {v0}, LZ/g;->N0()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, LZ/g;->f0()V

    goto :goto_0

    :cond_0
    invoke-interface {v0}, LZ/g;->q()V

    :goto_0
    return-void
.end method

.method public static final synthetic access$internalBeginTransaction(Landroidx/room/u;)V
    .locals 0

    invoke-direct {p0}, Landroidx/room/u;->a()V

    return-void
.end method

.method public static final synthetic access$internalEndTransaction(Landroidx/room/u;)V
    .locals 0

    invoke-direct {p0}, Landroidx/room/u;->b()V

    return-void
.end method

.method private final b()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/room/u;->getOpenHelper()LZ/h;

    move-result-object v0

    invoke-interface {v0}, LZ/h;->l0()LZ/g;

    move-result-object v0

    invoke-interface {v0}, LZ/g;->s0()V

    invoke-virtual {p0}, Landroidx/room/u;->inTransaction()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/room/u;->getInvalidationTracker()Landroidx/room/o;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/room/o;->m()V

    :cond_0
    return-void
.end method

.method private final c(Ljava/lang/Class;LZ/h;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p2

    .line 8
    :cond_0
    instance-of v0, p2, Landroidx/room/g;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p2, Landroidx/room/g;

    .line 13
    .line 14
    invoke-interface {p2}, Landroidx/room/g;->a()LZ/h;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-direct {p0, p1, p2}, Landroidx/room/u;->c(Ljava/lang/Class;LZ/h;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    :goto_0
    return-object p1
.end method

.method protected static synthetic getMCallbacks$annotations()V
    .locals 0

    return-void
.end method

.method protected static synthetic getMDatabase$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isOpen$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic isOpenInternal$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic query$default(Landroidx/room/u;LZ/j;Landroid/os/CancellationSignal;ILjava/lang/Object;)Landroid/database/Cursor;
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/room/u;->query(LZ/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: query"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public assertNotMainThread()V
    .locals 2

    iget-boolean v0, p0, Landroidx/room/u;->allowMainThreadQueries:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/room/u;->isMainThread$room_runtime_release()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public assertNotSuspendingTransaction()V
    .locals 2

    invoke-virtual {p0}, Landroidx/room/u;->inTransaction()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/room/u;->suspendingTransactionId:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot access database on a different coroutine context inherited from a suspending transaction."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public beginTransaction()V
    .locals 2

    invoke-virtual {p0}, Landroidx/room/u;->assertNotMainThread()V

    iget-object v0, p0, Landroidx/room/u;->autoCloser:Landroidx/room/c;

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroidx/room/u;->a()V

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/room/u$g;

    invoke-direct {v1, p0}, Landroidx/room/u$g;-><init>(Landroidx/room/u;)V

    invoke-virtual {v0, v1}, Landroidx/room/c;->g(Lv5/l;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public abstract clearAllTables()V
.end method

.method public close()V
    .locals 2

    invoke-virtual {p0}, Landroidx/room/u;->isOpen()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/room/u;->readWriteLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$WriteLock;

    move-result-object v0

    const-string v1, "readWriteLock.writeLock()"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    invoke-virtual {p0}, Landroidx/room/u;->getInvalidationTracker()Landroidx/room/o;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/room/o;->s()V

    invoke-virtual {p0}, Landroidx/room/u;->getOpenHelper()LZ/h;

    move-result-object v1

    invoke-interface {v1}, LZ/h;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1

    :cond_0
    :goto_0
    return-void
.end method

.method public compileStatement(Ljava/lang/String;)LZ/k;
    .locals 1

    .line 1
    const-string v0, "sql"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/room/u;->assertNotMainThread()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/room/u;->getOpenHelper()LZ/h;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, LZ/h;->l0()LZ/g;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0, p1}, LZ/g;->E(Ljava/lang/String;)LZ/k;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method protected abstract createInvalidationTracker()Landroidx/room/o;
.end method

.method protected abstract createOpenHelper(Landroidx/room/f;)LZ/h;
.end method

.method public endTransaction()V
    .locals 2

    iget-object v0, p0, Landroidx/room/u;->autoCloser:Landroidx/room/c;

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroidx/room/u;->b()V

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/room/u$h;

    invoke-direct {v1, p0}, Landroidx/room/u$h;-><init>(Landroidx/room/u;)V

    invoke-virtual {v0, v1}, Landroidx/room/c;->g(Lv5/l;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method protected final getAutoMigrationSpecs()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "LW/a;",
            ">;",
            "LW/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/room/u;->autoMigrationSpecs:Ljava/util/Map;

    return-object v0
.end method

.method public getAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "LW/a;",
            ">;",
            "LW/a;",
            ">;)",
            "Ljava/util/List<",
            "LW/b;",
            ">;"
        }
    .end annotation

    const-string v0, "autoMigrationSpecs"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lj5/n;->i()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getBackingFieldMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/room/u;->backingFieldMap:Ljava/util/Map;

    return-object v0
.end method

.method public final getCloseLock$room_runtime_release()Ljava/util/concurrent/locks/Lock;
    .locals 2

    iget-object v0, p0, Landroidx/room/u;->readWriteLock:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->readLock()Ljava/util/concurrent/locks/ReentrantReadWriteLock$ReadLock;

    move-result-object v0

    const-string v1, "readWriteLock.readLock()"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public getInvalidationTracker()Landroidx/room/o;
    .locals 1

    iget-object v0, p0, Landroidx/room/u;->invalidationTracker:Landroidx/room/o;

    return-object v0
.end method

.method public getOpenHelper()LZ/h;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/u;->internalOpenHelper:LZ/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "internalOpenHelper"

    .line 6
    .line 7
    invoke-static {v0}, Lw5/k;->t(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    return-object v0
.end method

.method public getQueryExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Landroidx/room/u;->internalQueryExecutor:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    const-string v0, "internalQueryExecutor"

    invoke-static {v0}, Lw5/k;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public getRequiredAutoMigrationSpecs()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "LW/a;",
            ">;>;"
        }
    .end annotation

    invoke-static {}, Lj5/M;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected getRequiredTypeConverters()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;>;"
        }
    .end annotation

    invoke-static {}, Lj5/F;->g()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getSuspendingTransactionId()Ljava/lang/ThreadLocal;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/room/u;->suspendingTransactionId:Ljava/lang/ThreadLocal;

    return-object v0
.end method

.method public getTransactionExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Landroidx/room/u;->internalTransactionExecutor:Ljava/util/concurrent/Executor;

    if-nez v0, :cond_0

    const-string v0, "internalTransactionExecutor"

    invoke-static {v0}, Lw5/k;->t(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public getTypeConverter(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "klass"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/room/u;->typeConverters:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public inTransaction()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/room/u;->getOpenHelper()LZ/h;

    move-result-object v0

    invoke-interface {v0}, LZ/h;->l0()LZ/g;

    move-result-object v0

    invoke-interface {v0}, LZ/g;->I0()Z

    move-result v0

    return v0
.end method

.method public init(Landroidx/room/f;)V
    .locals 9

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroidx/room/u;->createOpenHelper(Landroidx/room/f;)LZ/h;

    move-result-object v0

    iput-object v0, p0, Landroidx/room/u;->internalOpenHelper:LZ/h;

    invoke-virtual {p0}, Landroidx/room/u;->getRequiredAutoMigrationSpecs()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, -0x1

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    iget-object v4, p1, Landroidx/room/f;->r:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/2addr v4, v3

    if-ltz v4, :cond_2

    :goto_1
    add-int/lit8 v5, v4, -0x1

    iget-object v6, p1, Landroidx/room/f;->r:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/BitSet;->set(I)V

    move v3, v4

    goto :goto_2

    :cond_0
    if-gez v5, :cond_1

    goto :goto_2

    :cond_1
    move v4, v5

    goto :goto_1

    :cond_2
    :goto_2
    if-ltz v3, :cond_3

    iget-object v4, p0, Landroidx/room/u;->autoMigrationSpecs:Ljava/util/Map;

    iget-object v5, p1, Landroidx/room/f;->r:Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "A required auto migration spec ("

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") is missing in the database configuration."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    iget-object v0, p1, Landroidx/room/f;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, v3

    if-ltz v0, :cond_7

    :goto_3
    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_6

    if-gez v2, :cond_5

    goto :goto_4

    :cond_5
    move v0, v2

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_4
    iget-object v0, p0, Landroidx/room/u;->autoMigrationSpecs:Ljava/util/Map;

    invoke-virtual {p0, v0}, Landroidx/room/u;->getAutoMigrations(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LW/b;

    iget-object v2, p1, Landroidx/room/f;->d:Landroidx/room/u$e;

    iget v4, v1, LW/b;->a:I

    iget v5, v1, LW/b;->b:I

    invoke-virtual {v2, v4, v5}, Landroidx/room/u$e;->c(II)Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p1, Landroidx/room/f;->d:Landroidx/room/u$e;

    filled-new-array {v1}, [LW/b;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/room/u$e;->b([LW/b;)V

    goto :goto_5

    :cond_9
    const-class v0, Landroidx/room/y;

    invoke-virtual {p0}, Landroidx/room/u;->getOpenHelper()LZ/h;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Landroidx/room/u;->c(Ljava/lang/Class;LZ/h;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/room/y;

    if-eqz v0, :cond_a

    invoke-virtual {v0, p1}, Landroidx/room/y;->e(Landroidx/room/f;)V

    :cond_a
    const-class v0, Landroidx/room/d;

    invoke-virtual {p0}, Landroidx/room/u;->getOpenHelper()LZ/h;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Landroidx/room/u;->c(Ljava/lang/Class;LZ/h;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/room/d;

    if-eqz v0, :cond_b

    iget-object v1, v0, Landroidx/room/d;->n:Landroidx/room/c;

    iput-object v1, p0, Landroidx/room/u;->autoCloser:Landroidx/room/c;

    invoke-virtual {p0}, Landroidx/room/u;->getInvalidationTracker()Landroidx/room/o;

    move-result-object v1

    iget-object v0, v0, Landroidx/room/d;->n:Landroidx/room/c;

    invoke-virtual {v1, v0}, Landroidx/room/o;->p(Landroidx/room/c;)V

    :cond_b
    iget-object v0, p1, Landroidx/room/f;->g:Landroidx/room/u$d;

    sget-object v1, Landroidx/room/u$d;->o:Landroidx/room/u$d;

    if-ne v0, v1, :cond_c

    const/4 v0, 0x1

    goto :goto_6

    :cond_c
    const/4 v0, 0x0

    :goto_6
    invoke-virtual {p0}, Landroidx/room/u;->getOpenHelper()LZ/h;

    move-result-object v1

    invoke-interface {v1, v0}, LZ/h;->setWriteAheadLoggingEnabled(Z)V

    iget-object v1, p1, Landroidx/room/f;->e:Ljava/util/List;

    iput-object v1, p0, Landroidx/room/u;->mCallbacks:Ljava/util/List;

    iget-object v1, p1, Landroidx/room/f;->h:Ljava/util/concurrent/Executor;

    iput-object v1, p0, Landroidx/room/u;->internalQueryExecutor:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/room/C;

    iget-object v2, p1, Landroidx/room/f;->i:Ljava/util/concurrent/Executor;

    invoke-direct {v1, v2}, Landroidx/room/C;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v1, p0, Landroidx/room/u;->internalTransactionExecutor:Ljava/util/concurrent/Executor;

    iget-boolean v1, p1, Landroidx/room/f;->f:Z

    iput-boolean v1, p0, Landroidx/room/u;->allowMainThreadQueries:Z

    iput-boolean v0, p0, Landroidx/room/u;->writeAheadLoggingEnabled:Z

    iget-object v0, p1, Landroidx/room/f;->j:Landroid/content/Intent;

    if-eqz v0, :cond_e

    iget-object v0, p1, Landroidx/room/f;->b:Ljava/lang/String;

    if-eqz v0, :cond_d

    invoke-virtual {p0}, Landroidx/room/u;->getInvalidationTracker()Landroidx/room/o;

    move-result-object v0

    iget-object v1, p1, Landroidx/room/f;->a:Landroid/content/Context;

    iget-object v2, p1, Landroidx/room/f;->b:Ljava/lang/String;

    iget-object v4, p1, Landroidx/room/f;->j:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2, v4}, Landroidx/room/o;->q(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V

    goto :goto_7

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required value was null."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    :goto_7
    invoke-virtual {p0}, Landroidx/room/u;->getRequiredTypeConverters()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Ljava/util/BitSet;

    invoke-direct {v1}, Ljava/util/BitSet;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Class;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Class;

    iget-object v6, p1, Landroidx/room/f;->q:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    add-int/2addr v6, v3

    if-ltz v6, :cond_12

    :goto_9
    add-int/lit8 v7, v6, -0x1

    iget-object v8, p1, Landroidx/room/f;->q:Ljava/util/List;

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-virtual {v1, v6}, Ljava/util/BitSet;->set(I)V

    goto :goto_b

    :cond_10
    if-gez v7, :cond_11

    goto :goto_a

    :cond_11
    move v6, v7

    goto :goto_9

    :cond_12
    :goto_a
    move v6, v3

    :goto_b
    if-ltz v6, :cond_13

    iget-object v7, p0, Landroidx/room/u;->typeConverters:Ljava/util/Map;

    iget-object v8, p1, Landroidx/room/f;->q:Ljava/util/List;

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v7, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_13
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "A required type converter ("

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ") for "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is missing in the database configuration."

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    iget-object v0, p1, Landroidx/room/f;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, v3

    if-ltz v0, :cond_17

    :goto_c
    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v3

    if-eqz v3, :cond_16

    if-gez v2, :cond_15

    goto :goto_d

    :cond_15
    move v0, v2

    goto :goto_c

    :cond_16
    iget-object p1, p1, Landroidx/room/f;->q:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected type converter "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    :goto_d
    return-void
.end method

.method protected internalInitInvalidationTracker(LZ/g;)V
    .locals 1

    .line 1
    const-string v0, "db"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/room/u;->getInvalidationTracker()Landroidx/room/o;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Landroidx/room/o;->j(LZ/g;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final isMainThread$room_runtime_release()Z
    .locals 2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isOpen()Z
    .locals 2

    iget-object v0, p0, Landroidx/room/u;->autoCloser:Landroidx/room/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/room/c;->l()Z

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Landroidx/room/u;->mDatabase:LZ/g;

    if-eqz v0, :cond_1

    invoke-interface {v0}, LZ/g;->isOpen()Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final isOpenInternal()Z
    .locals 3

    iget-object v0, p0, Landroidx/room/u;->mDatabase:LZ/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LZ/g;->isOpen()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    return v1
.end method

.method public final query(LZ/j;)Landroid/database/Cursor;
    .locals 2

    .line 1
    const-string v0, "query"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Landroidx/room/u;->query$default(Landroidx/room/u;LZ/j;Landroid/os/CancellationSignal;ILjava/lang/Object;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public query(LZ/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 1

    .line 2
    const-string v0, "query"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/room/u;->assertNotMainThread()V

    invoke-virtual {p0}, Landroidx/room/u;->assertNotSuspendingTransaction()V

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Landroidx/room/u;->getOpenHelper()LZ/h;

    move-result-object v0

    invoke-interface {v0}, LZ/h;->l0()LZ/g;

    move-result-object v0

    invoke-interface {v0, p1, p2}, LZ/g;->I(LZ/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/room/u;->getOpenHelper()LZ/h;

    move-result-object p2

    invoke-interface {p2}, LZ/h;->l0()LZ/g;

    move-result-object p2

    invoke-interface {p2, p1}, LZ/g;->Q(LZ/j;)Landroid/database/Cursor;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public query(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;
    .locals 2

    .line 3
    const-string v0, "query"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/room/u;->getOpenHelper()LZ/h;

    move-result-object v0

    invoke-interface {v0}, LZ/h;->l0()LZ/g;

    move-result-object v0

    new-instance v1, LZ/a;

    invoke-direct {v1, p1, p2}, LZ/a;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v0, v1}, LZ/g;->Q(LZ/j;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public runInTransaction(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TV;>;)TV;"
        }
    .end annotation

    .line 1
    const-string v0, "body"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/room/u;->beginTransaction()V

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroidx/room/u;->endTransaction()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Landroidx/room/u;->endTransaction()V

    throw p1
.end method

.method public runInTransaction(Ljava/lang/Runnable;)V
    .locals 1

    .line 2
    const-string v0, "body"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/room/u;->beginTransaction()V

    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    invoke-virtual {p0}, Landroidx/room/u;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroidx/room/u;->endTransaction()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Landroidx/room/u;->endTransaction()V

    throw p1
.end method

.method protected final setAutoMigrationSpecs(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "LW/a;",
            ">;",
            "LW/a;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/room/u;->autoMigrationSpecs:Ljava/util/Map;

    return-void
.end method

.method public setTransactionSuccessful()V
    .locals 1

    invoke-virtual {p0}, Landroidx/room/u;->getOpenHelper()LZ/h;

    move-result-object v0

    invoke-interface {v0}, LZ/h;->l0()LZ/g;

    move-result-object v0

    invoke-interface {v0}, LZ/g;->d0()V

    return-void
.end method
