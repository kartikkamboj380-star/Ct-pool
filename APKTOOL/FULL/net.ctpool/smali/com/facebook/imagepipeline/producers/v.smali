.class public Lcom/facebook/imagepipeline/producers/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# instance fields
.field private final a:Lw1/j;

.field private final b:Lw1/j;

.field private final c:Lw1/k;

.field private final d:Lcom/facebook/imagepipeline/producers/d0;

.field private final e:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lw1/j;Lw1/j;Ljava/util/Map;Lw1/k;Lcom/facebook/imagepipeline/producers/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/v;->a:Lw1/j;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/v;->b:Lw1/j;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/v;->e:Ljava/util/Map;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/v;->c:Lw1/k;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/v;->d:Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/v;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/v;->d:Lcom/facebook/imagepipeline/producers/d0;

    return-object p0
.end method

.method static bridge synthetic d(Lx0/f;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/imagepipeline/producers/v;->f(Lx0/f;)Z

    move-result p0

    return p0
.end method

.method static e(Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;ZI)Ljava/util/Map;
    .locals 1

    .line 1
    const-string v0, "DiskCacheProducer"

    invoke-interface {p0, p1, v0}, Lcom/facebook/imagepipeline/producers/g0;->g(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string p0, "cached_value_found"

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_1

    const-string p2, "encodedImageSize"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p3

    invoke-static {p0, p1, p2, p3}, LO0/g;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0, p1}, LO0/g;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static f(Lx0/f;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx0/f;->l()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lx0/f;->n()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lx0/f;->i()Ljava/lang/Exception;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    instance-of p0, p0, Ljava/util/concurrent/CancellationException;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    :goto_1
    return p0
.end method

.method private g(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->U()LJ1/b$c;

    move-result-object v0

    invoke-virtual {v0}, LJ1/b$c;->h()I

    move-result v0

    sget-object v1, LJ1/b$c;->o:LJ1/b$c;

    invoke-virtual {v1}, LJ1/b$c;->h()I

    move-result v1

    if-lt v0, v1, :cond_0

    const-string v0, "disk"

    const-string v1, "nil-result_read"

    invoke-interface {p2, v0, v1}, Lcom/facebook/imagepipeline/producers/e0;->g(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/v;->d:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void
.end method

.method private h(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Lx0/d;
    .locals 2

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/facebook/imagepipeline/producers/v$a;

    .line 6
    .line 7
    invoke-direct {v1, p0, v0, p2, p1}, Lcom/facebook/imagepipeline/producers/v$a;-><init>(Lcom/facebook/imagepipeline/producers/v;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Lcom/facebook/imagepipeline/producers/n;)V

    .line 8
    .line 9
    .line 10
    return-object v1
.end method

.method private i(Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/v$b;

    invoke-direct {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/v$b;-><init>(Lcom/facebook/imagepipeline/producers/v;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-interface {p2, v0}, Lcom/facebook/imagepipeline/producers/e0;->e(Lcom/facebook/imagepipeline/producers/f0;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 6

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v0

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, LJ1/b;->x(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/v;->g(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void

    :cond_0
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v1

    const-string v2, "DiskCacheProducer"

    invoke-interface {v1, p2, v2}, Lcom/facebook/imagepipeline/producers/g0;->e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/v;->c:Lw1/k;

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v0, v3}, Lw1/k;->c(LJ1/b;Ljava/lang/Object;)LI0/d;

    move-result-object v1

    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/v;->b:Lw1/j;

    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/v;->a:Lw1/j;

    iget-object v5, p0, Lcom/facebook/imagepipeline/producers/v;->e:Ljava/util/Map;

    invoke-static {v0, v3, v4, v5}, Lcom/facebook/imagepipeline/producers/u;->a(LJ1/b;Lw1/j;Lw1/j;Ljava/util/Map;)Lw1/j;

    move-result-object v3

    if-nez v3, :cond_1

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v1

    new-instance v3, Lcom/facebook/imagepipeline/producers/u$a;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Got no disk cache for CacheChoice: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, LJ1/b;->c()LJ1/b$b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/facebook/imagepipeline/producers/u$a;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-interface {v1, p2, v2, v3, v0}, Lcom/facebook/imagepipeline/producers/g0;->k(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    invoke-direct {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/v;->g(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void

    :cond_1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    invoke-virtual {v3, v1, v0}, Lw1/j;->m(LI0/d;Ljava/util/concurrent/atomic/AtomicBoolean;)Lx0/f;

    move-result-object v1

    invoke-direct {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/v;->h(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Lx0/d;

    move-result-object p1

    invoke-virtual {v1, p1}, Lx0/f;->e(Lx0/d;)Lx0/f;

    invoke-direct {p0, v0, p2}, Lcom/facebook/imagepipeline/producers/v;->i(Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void
.end method
