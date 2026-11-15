.class public Lu2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu2/f$i;
    }
.end annotation


# static fields
.field public static final i:Ljava/util/concurrent/Executor;

.field public static final j:Ljava/util/concurrent/Executor;

.field private static k:Lu2/f;

.field private static l:Lu2/f;

.field private static m:Lu2/f;

.field private static n:Lu2/f;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Z

.field private c:Z

.field private d:Ljava/lang/Object;

.field private e:Ljava/lang/Exception;

.field private f:Z

.field private g:Lu2/h;

.field private h:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lu2/d;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    sput-object v0, Lu2/f;->i:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    sget-object v0, Lu2/d;->a:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    sput-object v0, Lu2/f;->j:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    new-instance v0, Lu2/f;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Lu2/f;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lu2/f;->k:Lu2/f;

    .line 16
    .line 17
    new-instance v0, Lu2/f;

    .line 18
    .line 19
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-direct {v0, v1}, Lu2/f;-><init>(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lu2/f;->l:Lu2/f;

    .line 25
    .line 26
    new-instance v0, Lu2/f;

    .line 27
    .line 28
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-direct {v0, v1}, Lu2/f;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lu2/f;->m:Lu2/f;

    .line 34
    .line 35
    new-instance v0, Lu2/f;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, v1}, Lu2/f;-><init>(Z)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lu2/f;->n:Lu2/f;

    .line 42
    .line 43
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lu2/f;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lu2/f;->h:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lu2/f;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lu2/f;->h:Ljava/util/List;

    invoke-virtual {p0, p1}, Lu2/f;->z(Ljava/lang/Object;)Z

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lu2/f;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lu2/f;->h:Ljava/util/List;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lu2/f;->x()Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lu2/f;->z(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method static bridge synthetic a(Lu2/g;Lu2/a;Lu2/f;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lu2/f;->f(Lu2/g;Lu2/a;Lu2/f;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method static bridge synthetic b(Lu2/g;Lu2/a;Lu2/f;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lu2/f;->g(Lu2/g;Lu2/a;Lu2/f;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static c(Ljava/util/concurrent/Callable;)Lu2/f;
    .locals 1

    .line 1
    sget-object v0, Lu2/f;->i:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lu2/f;->d(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static d(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lu2/f;
    .locals 2

    .line 1
    new-instance v0, Lu2/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lu2/g;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v1, Lu2/f$b;

    .line 7
    .line 8
    invoke-direct {v1, v0, p0}, Lu2/f$b;-><init>(Lu2/g;Ljava/util/concurrent/Callable;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception p0

    .line 16
    new-instance p1, Lu2/b;

    .line 17
    .line 18
    invoke-direct {p1, p0}, Lu2/b;-><init>(Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lu2/g;->c(Ljava/lang/Exception;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {v0}, Lu2/g;->a()Lu2/f;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static e()Lu2/f;
    .locals 1

    .line 1
    sget-object v0, Lu2/f;->n:Lu2/f;

    .line 2
    .line 3
    return-object v0
.end method

.method private static f(Lu2/g;Lu2/a;Lu2/f;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lu2/f$h;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p0}, Lu2/f$h;-><init>(Lu2/a;Lu2/f;Lu2/g;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception p1

    .line 11
    new-instance p2, Lu2/b;

    .line 12
    .line 13
    invoke-direct {p2, p1}, Lu2/b;-><init>(Ljava/lang/Exception;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lu2/g;->c(Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
.end method

.method private static g(Lu2/g;Lu2/a;Lu2/f;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lu2/f$g;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p0}, Lu2/f$g;-><init>(Lu2/a;Lu2/f;Lu2/g;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p3, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catch_0
    move-exception p1

    .line 11
    new-instance p2, Lu2/b;

    .line 12
    .line 13
    invoke-direct {p2, p1}, Lu2/b;-><init>(Ljava/lang/Exception;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lu2/g;->c(Ljava/lang/Exception;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
.end method

.method public static l(Ljava/lang/Exception;)Lu2/f;
    .locals 1

    .line 1
    new-instance v0, Lu2/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lu2/g;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lu2/g;->c(Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lu2/g;->a()Lu2/f;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static m(Ljava/lang/Object;)Lu2/f;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lu2/f;->k:Lu2/f;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    check-cast p0, Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    sget-object p0, Lu2/f;->l:Lu2/f;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object p0, Lu2/f;->m:Lu2/f;

    .line 22
    .line 23
    :goto_0
    return-object p0

    .line 24
    :cond_2
    new-instance v0, Lu2/g;

    .line 25
    .line 26
    invoke-direct {v0}, Lu2/g;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lu2/g;->d(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lu2/g;->a()Lu2/f;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static p()Lu2/f$i;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method private w()V
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lu2/f;->h:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Lu2/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    :try_start_1
    invoke-interface {v2, p0}, Lu2/a;->a(Lu2/f;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    goto :goto_1

    .line 28
    :catch_0
    move-exception v1

    .line 29
    :try_start_2
    new-instance v2, Ljava/lang/RuntimeException;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    throw v2

    .line 35
    :catch_1
    move-exception v1

    .line 36
    throw v1

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 38
    iput-object v1, p0, Lu2/f;->h:Ljava/util/List;

    .line 39
    .line 40
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    throw v1
.end method


# virtual methods
.method public h(Lu2/a;)Lu2/f;
    .locals 1

    .line 1
    sget-object v0, Lu2/f;->i:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lu2/f;->i(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public i(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;
    .locals 5

    .line 1
    new-instance v0, Lu2/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lu2/g;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lu2/f;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    invoke-virtual {p0}, Lu2/f;->r()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    iget-object v3, p0, Lu2/f;->h:Ljava/util/List;

    .line 16
    .line 17
    new-instance v4, Lu2/f$c;

    .line 18
    .line 19
    invoke-direct {v4, p0, v0, p1, p2}, Lu2/f$c;-><init>(Lu2/f;Lu2/g;Lu2/a;Ljava/util/concurrent/Executor;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-static {v0, p1, p0, p2}, Lu2/f;->g(Lu2/g;Lu2/a;Lu2/f;Ljava/util/concurrent/Executor;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v0}, Lu2/g;->a()Lu2/f;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw p1
.end method

.method public j(Lu2/a;)Lu2/f;
    .locals 1

    .line 1
    sget-object v0, Lu2/f;->i:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;
    .locals 5

    .line 1
    new-instance v0, Lu2/g;

    .line 2
    .line 3
    invoke-direct {v0}, Lu2/g;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lu2/f;->a:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v1

    .line 9
    :try_start_0
    invoke-virtual {p0}, Lu2/f;->r()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    iget-object v3, p0, Lu2/f;->h:Ljava/util/List;

    .line 16
    .line 17
    new-instance v4, Lu2/f$d;

    .line 18
    .line 19
    invoke-direct {v4, p0, v0, p1, p2}, Lu2/f$d;-><init>(Lu2/f;Lu2/g;Lu2/a;Ljava/util/concurrent/Executor;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-static {v0, p1, p0, p2}, Lu2/f;->f(Lu2/g;Lu2/a;Lu2/f;Ljava/util/concurrent/Executor;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v0}, Lu2/g;->a()Lu2/f;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw p1
.end method

.method public n()Ljava/lang/Exception;
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lu2/f;->e:Ljava/lang/Exception;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, p0, Lu2/f;->f:Z

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    iget-object v1, p0, Lu2/f;->e:Ljava/lang/Exception;

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    return-object v1

    .line 18
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v1
.end method

.method public o()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lu2/f;->d:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public q()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lu2/f;->c:Z

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public r()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lu2/f;->b:Z

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public s()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Lu2/f;->n()Ljava/lang/Exception;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    monitor-exit v0

    .line 14
    return v1

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw v1
.end method

.method public t()Lu2/f;
    .locals 1

    .line 1
    new-instance v0, Lu2/f$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lu2/f$a;-><init>(Lu2/f;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lu2/f;->j(Lu2/a;)Lu2/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public u(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;
    .locals 1

    .line 1
    new-instance v0, Lu2/f$e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lu2/f$e;-><init>(Lu2/f;Lu2/a;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p2}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public v(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;
    .locals 1

    .line 1
    new-instance v0, Lu2/f$f;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lu2/f$f;-><init>(Lu2/f;Lu2/a;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0, p2}, Lu2/f;->k(Lu2/a;Ljava/util/concurrent/Executor;)Lu2/f;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method x()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lu2/f;->b:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Lu2/f;->b:Z

    .line 15
    .line 16
    iput-boolean v1, p0, Lu2/f;->c:Z

    .line 17
    .line 18
    iget-object v2, p0, Lu2/f;->a:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lu2/f;->w()V

    .line 24
    .line 25
    .line 26
    monitor-exit v0

    .line 27
    return v1

    .line 28
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw v1
.end method

.method y(Ljava/lang/Exception;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lu2/f;->b:Z

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return v2

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Lu2/f;->b:Z

    .line 15
    .line 16
    iput-object p1, p0, Lu2/f;->e:Ljava/lang/Exception;

    .line 17
    .line 18
    iput-boolean v2, p0, Lu2/f;->f:Z

    .line 19
    .line 20
    iget-object p1, p0, Lu2/f;->a:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lu2/f;->w()V

    .line 26
    .line 27
    .line 28
    iget-boolean p1, p0, Lu2/f;->f:Z

    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    invoke-static {}, Lu2/f;->p()Lu2/f$i;

    .line 33
    .line 34
    .line 35
    :cond_1
    monitor-exit v0

    .line 36
    return v1

    .line 37
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw p1
.end method

.method z(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/f;->a:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lu2/f;->b:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Lu2/f;->b:Z

    .line 15
    .line 16
    iput-object p1, p0, Lu2/f;->d:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p1, p0, Lu2/f;->a:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lu2/f;->w()V

    .line 24
    .line 25
    .line 26
    monitor-exit v0

    .line 27
    return v1

    .line 28
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p1
.end method
