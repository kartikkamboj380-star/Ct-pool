.class public Lu1/b;
.super Lcom/facebook/imagepipeline/producers/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu1/b$a;,
        Lu1/b$b;
    }
.end annotation


# static fields
.field private static final d:Lu1/b$a;


# instance fields
.field private final a:LT5/e$a;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:LT5/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lu1/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lu1/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lu1/b;->d:Lu1/b$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LT5/e$a;Ljava/util/concurrent/Executor;Z)V
    .locals 1

    .line 1
    const-string v0, "callFactory"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancellationExecutor"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/d;-><init>()V

    iput-object p1, p0, Lu1/b;->a:LT5/e$a;

    iput-object p2, p0, Lu1/b;->b:Ljava/util/concurrent/Executor;

    if-eqz p3, :cond_0

    new-instance p1, LT5/d$a;

    invoke-direct {p1}, LT5/d$a;-><init>()V

    invoke-virtual {p1}, LT5/d$a;->e()LT5/d$a;

    move-result-object p1

    invoke-virtual {p1}, LT5/d$a;->a()LT5/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lu1/b;->c:LT5/d;

    return-void
.end method

.method public synthetic constructor <init>(LT5/e$a;Ljava/util/concurrent/Executor;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lu1/b;-><init>(LT5/e$a;Ljava/util/concurrent/Executor;Z)V

    return-void
.end method

.method public constructor <init>(LT5/z;)V
    .locals 7

    .line 3
    const-string v0, "okHttpClient"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LT5/z;->q()LT5/p;

    move-result-object v0

    invoke-virtual {v0}, LT5/p;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    const-string v0, "okHttpClient.dispatcher().executorService()"

    invoke-static {v3, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lu1/b;-><init>(LT5/e$a;Ljava/util/concurrent/Executor;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static final synthetic f(Lu1/b;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Lu1/b;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lu1/b;LT5/e;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lu1/b;->l(LT5/e;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/X$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final l(LT5/e;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 0

    .line 1
    invoke-interface {p1}, LT5/e;->n0()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p3}, Lcom/facebook/imagepipeline/producers/X$a;->b()V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-interface {p3, p2}, Lcom/facebook/imagepipeline/producers/X$a;->a(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/facebook/imagepipeline/producers/C;I)V
    .locals 0

    .line 1
    check-cast p1, Lu1/b$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lu1/b;->m(Lu1/b$b;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic c(Lcom/facebook/imagepipeline/producers/C;I)Ljava/util/Map;
    .locals 0

    .line 1
    check-cast p1, Lu1/b$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lu1/b;->k(Lu1/b$b;I)Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic d(Lcom/facebook/imagepipeline/producers/C;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 0

    .line 1
    check-cast p1, Lu1/b$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lu1/b;->i(Lu1/b$b;Lcom/facebook/imagepipeline/producers/X$a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic e(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Lcom/facebook/imagepipeline/producers/C;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lu1/b;->h(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Lu1/b$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public h(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Lu1/b$b;
    .locals 1

    .line 1
    const-string v0, "consumer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lu1/b$b;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lu1/b$b;-><init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public i(Lu1/b$b;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 3

    .line 1
    const-string v0, "fetchState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iput-wide v0, p1, Lu1/b$b;->f:J

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->g()Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "fetchState.uri"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :try_start_0
    new-instance v1, LT5/B$a;

    .line 27
    .line 28
    invoke-direct {v1}, LT5/B$a;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v1, v0}, LT5/B$a;->m(Ljava/lang/String;)LT5/B$a;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, LT5/B$a;->d()LT5/B$a;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lu1/b;->c:LT5/d;

    .line 44
    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    const-string v2, "requestBuilder"

    .line 48
    .line 49
    invoke-static {v0, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, LT5/B$a;->c(LT5/d;)LT5/B$a;

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_0
    move-exception p1

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v1}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, LJ1/b;->b()Lx1/a;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    const-string v2, "Range"

    .line 73
    .line 74
    invoke-virtual {v1}, Lx1/a;->d()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v0, v2, v1}, LT5/B$a;->a(Ljava/lang/String;Ljava/lang/String;)LT5/B$a;

    .line 79
    .line 80
    .line 81
    :cond_1
    invoke-virtual {v0}, LT5/B$a;->b()LT5/B;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v1, "requestBuilder.build()"

    .line 86
    .line 87
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1, p2, v0}, Lu1/b;->j(Lu1/b$b;Lcom/facebook/imagepipeline/producers/X$a;LT5/B;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :goto_1
    invoke-interface {p2, p1}, Lcom/facebook/imagepipeline/producers/X$a;->a(Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    :goto_2
    return-void
.end method

.method protected j(Lu1/b$b;Lcom/facebook/imagepipeline/producers/X$a;LT5/B;)V
    .locals 2

    .line 1
    const-string v0, "fetchState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "request"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lu1/b;->a:LT5/e$a;

    .line 17
    .line 18
    invoke-interface {v0, p3}, LT5/e$a;->a(LT5/B;)LT5/e;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lu1/b$c;

    .line 27
    .line 28
    invoke-direct {v1, p3, p0}, Lu1/b$c;-><init>(LT5/e;Lu1/b;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Lcom/facebook/imagepipeline/producers/e0;->e(Lcom/facebook/imagepipeline/producers/f0;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lu1/b$d;

    .line 35
    .line 36
    invoke-direct {v0, p1, p0, p2}, Lu1/b$d;-><init>(Lu1/b$b;Lu1/b;Lcom/facebook/imagepipeline/producers/X$a;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p3, v0}, LT5/e;->S0(LT5/f;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public k(Lu1/b$b;I)Ljava/util/Map;
    .locals 6

    .line 1
    const-string v0, "fetchState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p1, Lu1/b$b;->g:J

    .line 7
    .line 8
    iget-wide v2, p1, Lu1/b$b;->f:J

    .line 9
    .line 10
    sub-long/2addr v0, v2

    .line 11
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "queue_time"

    .line 16
    .line 17
    invoke-static {v1, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-wide v1, p1, Lu1/b$b;->h:J

    .line 22
    .line 23
    iget-wide v3, p1, Lu1/b$b;->g:J

    .line 24
    .line 25
    sub-long/2addr v1, v3

    .line 26
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "fetch_time"

    .line 31
    .line 32
    invoke-static {v2, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-wide v2, p1, Lu1/b$b;->h:J

    .line 37
    .line 38
    iget-wide v4, p1, Lu1/b$b;->f:J

    .line 39
    .line 40
    sub-long/2addr v2, v4

    .line 41
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v2, "total_time"

    .line 46
    .line 47
    invoke-static {v2, p1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v2, "image_size"

    .line 52
    .line 53
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-static {v2, p2}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    filled-new-array {v0, v1, p1, p2}, [Li5/l;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1}, Lj5/F;->i([Li5/l;)Ljava/util/Map;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method

.method public m(Lu1/b$b;I)V
    .locals 2

    .line 1
    const-string p2, "fetchState"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iput-wide v0, p1, Lu1/b$b;->h:J

    .line 11
    .line 12
    return-void
.end method
