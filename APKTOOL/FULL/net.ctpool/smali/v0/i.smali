.class public Lv0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static b:Lv0/i;


# instance fields
.field public a:LS5/p;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lapp/notifee/core/database/NotifeeCoreDatabase;->e(Landroid/content/Context;)Lapp/notifee/core/database/NotifeeCoreDatabase;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lapp/notifee/core/database/NotifeeCoreDatabase;->d()LS5/p;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lv0/i;->a:LS5/p;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic a(Lv0/i;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lv0/i;->v(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lv0/i;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0}, Lv0/i;->x()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lv0/i;Ljava/lang/String;)LS5/r;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lv0/i;->w(Ljava/lang/String;)LS5/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lv0/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lv0/i;->t()V

    return-void
.end method

.method public static synthetic e(Lv0/i;LS5/r;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lv0/i;->u(LS5/r;)V

    return-void
.end method

.method public static synthetic f(Lv0/i;LS5/r;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lv0/i;->r(LS5/r;)V

    return-void
.end method

.method public static synthetic g(Lv0/i;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lv0/i;->s(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic h(Lv0/i;Ljava/lang/Boolean;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lv0/i;->o(Ljava/lang/Boolean;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static i(Landroid/content/Context;)Lv0/i;
    .locals 2

    .line 1
    const-class v0, Lv0/i;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lv0/i;->b:Lv0/i;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lv0/i;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Lv0/i;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lv0/i;->b:Lv0/i;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    sget-object p0, Lv0/i;->b:Lv0/i;

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object p0

    .line 22
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw p0
.end method

.method private synthetic o(Ljava/lang/Boolean;)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/i;->a:LS5/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LS5/p;->h(Ljava/lang/Boolean;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method private synthetic r(LS5/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/i;->a:LS5/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LS5/p;->e(LS5/r;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic s(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/i;->a:LS5/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LS5/p;->b(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic t()V
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/i;->a:LS5/p;

    .line 2
    .line 3
    invoke-interface {v0}, LS5/p;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic u(LS5/r;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/i;->a:LS5/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LS5/p;->c(LS5/r;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic v(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/i;->a:LS5/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LS5/p;->g(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private synthetic w(Ljava/lang/String;)LS5/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/i;->a:LS5/p;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LS5/p;->f(Ljava/lang/String;)LS5/r;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method private synthetic x()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lv0/i;->a:LS5/p;

    .line 2
    .line 3
    invoke-interface {v0}, LS5/p;->a()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public j(Ljava/lang/Boolean;)Lz3/l;
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->b:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lv0/a;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lv0/a;-><init>(Lv0/i;Ljava/lang/Boolean;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public k()V
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->b:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lv0/h;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lv0/h;-><init>(Lv0/i;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public l(LS5/r;)V
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->b:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lv0/e;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lv0/e;-><init>(Lv0/i;LS5/r;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public m(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->b:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lv0/g;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lv0/g;-><init>(Lv0/i;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public n(Ljava/util/List;)V
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->b:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lv0/d;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lv0/d;-><init>(Lv0/i;Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public p()Lz3/l;
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->b:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lv0/b;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lv0/b;-><init>(Lv0/i;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public q(Ljava/lang/String;)Lz3/l;
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->b:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lv0/c;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lv0/c;-><init>(Lv0/i;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Lz3/o;->d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lz3/l;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public y(LS5/r;)V
    .locals 2

    .line 1
    sget-object v0, Lapp/notifee/core/database/NotifeeCoreDatabase;->b:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    new-instance v1, Lv0/f;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lv0/f;-><init>(Lv0/i;LS5/r;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
