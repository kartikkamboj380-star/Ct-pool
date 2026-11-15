.class public Landroidx/work/impl/E;
.super Ll0/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/impl/E$a;
    }
.end annotation


# static fields
.field private static final k:Ljava/lang/String;

.field private static l:Landroidx/work/impl/E;

.field private static m:Landroidx/work/impl/E;

.field private static final n:Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroidx/work/a;

.field private c:Landroidx/work/impl/WorkDatabase;

.field private d:Ls0/b;

.field private e:Ljava/util/List;

.field private f:Landroidx/work/impl/r;

.field private g:Lr0/q;

.field private h:Z

.field private i:Landroid/content/BroadcastReceiver$PendingResult;

.field private final j:Lp0/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkManagerImpl"

    invoke-static {v0}, Ll0/i;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/impl/E;->k:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Landroidx/work/impl/E;->l:Landroidx/work/impl/E;

    sput-object v0, Landroidx/work/impl/E;->m:Landroidx/work/impl/E;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/work/impl/E;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Ls0/b;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Ll0/p;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/work/impl/E;-><init>(Landroid/content/Context;Landroidx/work/a;Ls0/b;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Ls0/b;Landroidx/work/impl/WorkDatabase;)V
    .locals 9

    .line 2
    invoke-direct {p0}, Ll0/t;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ll0/i$a;

    invoke-virtual {p2}, Landroidx/work/a;->j()I

    move-result v2

    invoke-direct {v1, v2}, Ll0/i$a;-><init>(I)V

    invoke-static {v1}, Ll0/i;->h(Ll0/i;)V

    new-instance v1, Lp0/n;

    invoke-direct {v1, v0, p3}, Lp0/n;-><init>(Landroid/content/Context;Ls0/b;)V

    iput-object v1, p0, Landroidx/work/impl/E;->j:Lp0/n;

    invoke-virtual {p0, v0, p2, v1}, Landroidx/work/impl/E;->l(Landroid/content/Context;Landroidx/work/a;Lp0/n;)Ljava/util/List;

    move-result-object v0

    new-instance v8, Landroidx/work/impl/r;

    move-object v2, v8

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, v0

    invoke-direct/range {v2 .. v7}, Landroidx/work/impl/r;-><init>(Landroid/content/Context;Landroidx/work/a;Ls0/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Landroidx/work/impl/E;->x(Landroid/content/Context;Landroidx/work/a;Ls0/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Landroidx/work/impl/r;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Ls0/b;Z)V
    .locals 2

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-interface {p3}, Ls0/b;->b()Ls0/a;

    move-result-object v1

    invoke-static {v0, v1, p4}, Landroidx/work/impl/WorkDatabase;->d(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Landroidx/work/impl/WorkDatabase;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/work/impl/E;-><init>(Landroid/content/Context;Landroidx/work/a;Ls0/b;Landroidx/work/impl/WorkDatabase;)V

    return-void
.end method

.method public static i(Landroid/content/Context;Landroidx/work/a;)V
    .locals 4

    .line 1
    sget-object v0, Landroidx/work/impl/E;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/work/impl/E;->l:Landroidx/work/impl/E;

    if-eqz v1, :cond_1

    sget-object v2, Landroidx/work/impl/E;->m:Landroidx/work/impl/E;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    if-nez v1, :cond_3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sget-object v1, Landroidx/work/impl/E;->m:Landroidx/work/impl/E;

    if-nez v1, :cond_2

    new-instance v1, Landroidx/work/impl/E;

    new-instance v2, Ls0/c;

    invoke-virtual {p1}, Landroidx/work/a;->m()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-direct {v2, v3}, Ls0/c;-><init>(Ljava/util/concurrent/Executor;)V

    invoke-direct {v1, p0, p1, v2}, Landroidx/work/impl/E;-><init>(Landroid/content/Context;Landroidx/work/a;Ls0/b;)V

    sput-object v1, Landroidx/work/impl/E;->m:Landroidx/work/impl/E;

    :cond_2
    sget-object p0, Landroidx/work/impl/E;->m:Landroidx/work/impl/E;

    sput-object p0, Landroidx/work/impl/E;->l:Landroidx/work/impl/E;

    :cond_3
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static p()Landroidx/work/impl/E;
    .locals 2

    .line 1
    sget-object v0, Landroidx/work/impl/E;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/work/impl/E;->l:Landroidx/work/impl/E;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    sget-object v1, Landroidx/work/impl/E;->m:Landroidx/work/impl/E;

    monitor-exit v0

    return-object v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static q(Landroid/content/Context;)Landroidx/work/impl/E;
    .locals 2

    .line 1
    sget-object v0, Landroidx/work/impl/E;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Landroidx/work/impl/E;->p()Landroidx/work/impl/E;

    move-result-object v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private x(Landroid/content/Context;Landroidx/work/a;Ls0/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Landroidx/work/impl/r;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Landroidx/work/impl/E;->a:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p2, p0, Landroidx/work/impl/E;->b:Landroidx/work/a;

    .line 8
    .line 9
    iput-object p3, p0, Landroidx/work/impl/E;->d:Ls0/b;

    .line 10
    .line 11
    iput-object p4, p0, Landroidx/work/impl/E;->c:Landroidx/work/impl/WorkDatabase;

    .line 12
    .line 13
    iput-object p5, p0, Landroidx/work/impl/E;->e:Ljava/util/List;

    .line 14
    .line 15
    iput-object p6, p0, Landroidx/work/impl/E;->f:Landroidx/work/impl/r;

    .line 16
    .line 17
    new-instance p2, Lr0/q;

    .line 18
    .line 19
    invoke-direct {p2, p4}, Lr0/q;-><init>(Landroidx/work/impl/WorkDatabase;)V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Landroidx/work/impl/E;->g:Lr0/q;

    .line 23
    .line 24
    const/4 p2, 0x0

    .line 25
    iput-boolean p2, p0, Landroidx/work/impl/E;->h:Z

    .line 26
    .line 27
    invoke-static {p1}, Landroidx/work/impl/E$a;->a(Landroid/content/Context;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-nez p2, :cond_0

    .line 32
    .line 33
    iget-object p2, p0, Landroidx/work/impl/E;->d:Ls0/b;

    .line 34
    .line 35
    new-instance p3, Landroidx/work/impl/utils/ForceStopRunnable;

    .line 36
    .line 37
    invoke-direct {p3, p1, p0}, Landroidx/work/impl/utils/ForceStopRunnable;-><init>(Landroid/content/Context;Landroidx/work/impl/E;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p2, p3}, Ls0/b;->c(Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "Cannot initialize WorkManager in direct boot mode"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1
.end method


# virtual methods
.method public A(Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 2

    .line 1
    sget-object v0, Landroidx/work/impl/E;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/work/impl/E;->i:Landroid/content/BroadcastReceiver$PendingResult;

    iget-boolean v1, p0, Landroidx/work/impl/E;->h:Z

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/work/impl/E;->i:Landroid/content/BroadcastReceiver$PendingResult;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public B(Landroidx/work/impl/v;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/work/impl/E;->C(Landroidx/work/impl/v;Landroidx/work/WorkerParameters$a;)V

    return-void
.end method

.method public C(Landroidx/work/impl/v;Landroidx/work/WorkerParameters$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/impl/E;->d:Ls0/b;

    new-instance v1, Lr0/u;

    invoke-direct {v1, p0, p1, p2}, Lr0/u;-><init>(Landroidx/work/impl/E;Landroidx/work/impl/v;Landroidx/work/WorkerParameters$a;)V

    invoke-interface {v0, v1}, Ls0/b;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method public D(Lq0/m;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/impl/E;->d:Ls0/b;

    .line 2
    .line 3
    new-instance v1, Lr0/v;

    .line 4
    .line 5
    new-instance v2, Landroidx/work/impl/v;

    .line 6
    .line 7
    invoke-direct {v2, p1}, Landroidx/work/impl/v;-><init>(Lq0/m;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-direct {v1, p0, v2, p1}, Lr0/v;-><init>(Landroidx/work/impl/E;Landroidx/work/impl/v;Z)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Ls0/b;->c(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public E(Landroidx/work/impl/v;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/impl/E;->d:Ls0/b;

    new-instance v1, Lr0/v;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lr0/v;-><init>(Landroidx/work/impl/E;Landroidx/work/impl/v;Z)V

    invoke-interface {v0, v1}, Ls0/b;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/lang/String;)Ll0/l;
    .locals 1

    .line 1
    invoke-static {p1, p0}, Lr0/b;->d(Ljava/lang/String;Landroidx/work/impl/E;)Lr0/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Landroidx/work/impl/E;->d:Ls0/b;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ls0/b;->c(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lr0/b;->e()Ll0/l;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public b(Ljava/lang/String;)Ll0/l;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, p0, v0}, Lr0/b;->c(Ljava/lang/String;Landroidx/work/impl/E;Z)Lr0/b;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    iget-object v0, p0, Landroidx/work/impl/E;->d:Ls0/b;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ls0/b;->c(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lr0/b;->e()Ll0/l;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public c(Ljava/util/List;)Ll0/l;
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroidx/work/impl/x;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Landroidx/work/impl/x;-><init>(Landroidx/work/impl/E;Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/work/impl/x;->a()Ll0/l;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string v0, "enqueue needs at least one WorkRequest."

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1
.end method

.method public e(Ljava/lang/String;Ll0/c;Ll0/n;)Ll0/l;
    .locals 1

    .line 1
    sget-object v0, Ll0/c;->o:Ll0/c;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0, p1, p3}, Landroidx/work/impl/I;->c(Landroidx/work/impl/E;Ljava/lang/String;Ll0/u;)Ll0/l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/work/impl/E;->m(Ljava/lang/String;Ll0/c;Ll0/n;)Landroidx/work/impl/x;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroidx/work/impl/x;->a()Ll0/l;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public f(Ljava/lang/String;Ll0/d;Ljava/util/List;)Ll0/l;
    .locals 1

    .line 1
    new-instance v0, Landroidx/work/impl/x;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Landroidx/work/impl/x;-><init>(Landroidx/work/impl/E;Ljava/lang/String;Ll0/d;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/work/impl/x;->a()Ll0/l;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public j()Ll0/l;
    .locals 2

    .line 1
    new-instance v0, Lr0/s;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lr0/s;-><init>(Landroidx/work/impl/E;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/work/impl/E;->d:Ls0/b;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Ls0/b;->c(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lr0/s;->a()Ll0/l;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public k(Ljava/util/UUID;)Ll0/l;
    .locals 1

    .line 1
    invoke-static {p1, p0}, Lr0/b;->b(Ljava/util/UUID;Landroidx/work/impl/E;)Lr0/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Landroidx/work/impl/E;->d:Ls0/b;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ls0/b;->c(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lr0/b;->e()Ll0/l;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public l(Landroid/content/Context;Landroidx/work/a;Lp0/n;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-static {p1, p0}, Landroidx/work/impl/u;->a(Landroid/content/Context;Landroidx/work/impl/E;)Landroidx/work/impl/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lm0/b;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2, p3, p0}, Lm0/b;-><init>(Landroid/content/Context;Landroidx/work/a;Lp0/n;Landroidx/work/impl/E;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    new-array p1, p1, [Landroidx/work/impl/t;

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    aput-object v0, p1, p2

    .line 15
    .line 16
    const/4 p2, 0x1

    .line 17
    aput-object v1, p1, p2

    .line 18
    .line 19
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public m(Ljava/lang/String;Ll0/c;Ll0/n;)Landroidx/work/impl/x;
    .locals 1

    .line 1
    sget-object v0, Ll0/c;->n:Ll0/c;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    sget-object p2, Ll0/d;->n:Ll0/d;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object p2, Ll0/d;->m:Ll0/d;

    .line 9
    .line 10
    :goto_0
    new-instance v0, Landroidx/work/impl/x;

    .line 11
    .line 12
    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-direct {v0, p0, p1, p2, p3}, Landroidx/work/impl/x;-><init>(Landroidx/work/impl/E;Ljava/lang/String;Ll0/d;Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public n()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/impl/E;->a:Landroid/content/Context;

    return-object v0
.end method

.method public o()Landroidx/work/a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/impl/E;->b:Landroidx/work/a;

    return-object v0
.end method

.method public r()Lr0/q;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/impl/E;->g:Lr0/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Landroidx/work/impl/r;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/impl/E;->f:Landroidx/work/impl/r;

    return-object v0
.end method

.method public t()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/impl/E;->e:Ljava/util/List;

    return-object v0
.end method

.method public u()Lp0/n;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/impl/E;->j:Lp0/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public v()Landroidx/work/impl/WorkDatabase;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/impl/E;->c:Landroidx/work/impl/WorkDatabase;

    return-object v0
.end method

.method public w()Ls0/b;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/work/impl/E;->d:Ls0/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public y()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/work/impl/E;->n:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Landroidx/work/impl/E;->h:Z

    iget-object v1, p0, Landroidx/work/impl/E;->i:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/work/impl/E;->i:Landroid/content/BroadcastReceiver$PendingResult;

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

.method public z()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/work/impl/E;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroidx/work/impl/background/systemjob/g;->a(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->j()Lq0/v;

    move-result-object v0

    invoke-interface {v0}, Lq0/v;->x()I

    invoke-virtual {p0}, Landroidx/work/impl/E;->o()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/work/impl/E;->v()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/work/impl/E;->t()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroidx/work/impl/u;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method
