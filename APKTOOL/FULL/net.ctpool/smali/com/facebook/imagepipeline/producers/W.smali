.class public Lcom/facebook/imagepipeline/producers/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# instance fields
.field protected final a:LR0/i;

.field private final b:LR0/a;

.field private final c:Lcom/facebook/imagepipeline/producers/X;


# direct methods
.method public constructor <init>(LR0/i;LR0/a;Lcom/facebook/imagepipeline/producers/X;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/W;->a:LR0/i;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/W;->b:LR0/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/W;->c:Lcom/facebook/imagepipeline/producers/X;

    .line 9
    .line 10
    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/W;Lcom/facebook/imagepipeline/producers/C;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/W;->k(Lcom/facebook/imagepipeline/producers/C;)V

    return-void
.end method

.method static bridge synthetic d(Lcom/facebook/imagepipeline/producers/W;Lcom/facebook/imagepipeline/producers/C;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/W;->l(Lcom/facebook/imagepipeline/producers/C;Ljava/lang/Throwable;)V

    return-void
.end method

.method protected static e(II)F
    .locals 2

    .line 1
    if-lez p1, :cond_0

    int-to-float p0, p0

    int-to-float p1, p1

    div-float/2addr p0, p1

    return p0

    :cond_0
    neg-int p0, p0

    int-to-double p0, p0

    const-wide v0, 0x40e86a0000000000L    # 50000.0

    div-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->exp(D)D

    move-result-wide p0

    double-to-float p0, p0

    const/high16 p1, 0x3f800000    # 1.0f

    sub-float/2addr p1, p0

    return p1
.end method

.method private f(Lcom/facebook/imagepipeline/producers/C;I)Ljava/util/Map;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->d()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    move-result-object v1

    const-string v2, "NetworkFetchProducer"

    invoke-interface {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/g0;->g(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/W;->c:Lcom/facebook/imagepipeline/producers/X;

    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/X;->c(Lcom/facebook/imagepipeline/producers/C;I)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method protected static j(LR0/k;ILx1/a;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR0/k;->a()LR0/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, LS0/a;->J(Ljava/io/Closeable;)LS0/a;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 p4, 0x0

    .line 10
    :try_start_0
    new-instance v0, LD1/g;

    .line 11
    .line 12
    invoke-direct {v0, p0}, LD1/g;-><init>(LS0/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    .line 15
    :try_start_1
    invoke-virtual {v0, p2}, LD1/g;->M0(Lx1/a;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, LD1/g;->n0()V

    .line 19
    .line 20
    .line 21
    invoke-interface {p3, v0, p1}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, LD1/g;->d(LD1/g;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0}, LS0/a;->g(LS0/a;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    move-object p4, v0

    .line 33
    goto :goto_0

    .line 34
    :catchall_1
    move-exception p1

    .line 35
    :goto_0
    invoke-static {p4}, LD1/g;->d(LD1/g;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0}, LS0/a;->g(LS0/a;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method private k(Lcom/facebook/imagepipeline/producers/C;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->d()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    move-result-object v1

    const-string v2, "NetworkFetchProducer"

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/g0;->d(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->a()Lcom/facebook/imagepipeline/producers/n;

    move-result-object p1

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/n;->b()V

    return-void
.end method

.method private l(Lcom/facebook/imagepipeline/producers/C;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->d()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, "NetworkFetchProducer"

    invoke-interface {v0, v1, v3, p2, v2}, Lcom/facebook/imagepipeline/producers/g0;->k(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->d()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v2}, Lcom/facebook/imagepipeline/producers/g0;->c(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Z)V

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    move-result-object v0

    const-string v1, "network"

    invoke-interface {v0, v1}, Lcom/facebook/imagepipeline/producers/e0;->z(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->a()Lcom/facebook/imagepipeline/producers/n;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/facebook/imagepipeline/producers/n;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method private n(Lcom/facebook/imagepipeline/producers/C;Lcom/facebook/imagepipeline/producers/e0;)Z
    .locals 1

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->f()Ly1/m;

    move-result-object p2

    invoke-interface {p2}, Ly1/m;->q()LB1/e;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    invoke-interface {p2}, LB1/e;->c()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    move-result-object p2

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->J()Z

    move-result p2

    if-nez p2, :cond_1

    return v0

    :cond_1
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/W;->c:Lcom/facebook/imagepipeline/producers/X;

    invoke-interface {p2, p1}, Lcom/facebook/imagepipeline/producers/X;->b(Lcom/facebook/imagepipeline/producers/C;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v0
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 2

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v0

    const-string v1, "NetworkFetchProducer"

    invoke-interface {v0, p2, v1}, Lcom/facebook/imagepipeline/producers/g0;->e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/W;->c:Lcom/facebook/imagepipeline/producers/X;

    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/X;->e(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Lcom/facebook/imagepipeline/producers/C;

    move-result-object p1

    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/W;->c:Lcom/facebook/imagepipeline/producers/X;

    new-instance v0, Lcom/facebook/imagepipeline/producers/W$a;

    invoke-direct {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/W$a;-><init>(Lcom/facebook/imagepipeline/producers/W;Lcom/facebook/imagepipeline/producers/C;)V

    invoke-interface {p2, p1, v0}, Lcom/facebook/imagepipeline/producers/X;->d(Lcom/facebook/imagepipeline/producers/C;Lcom/facebook/imagepipeline/producers/X$a;)V

    return-void
.end method

.method protected g()J
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method protected h(LR0/k;Lcom/facebook/imagepipeline/producers/C;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, LR0/k;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0, p2, v0}, Lcom/facebook/imagepipeline/producers/W;->f(Lcom/facebook/imagepipeline/producers/C;I)Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->d()Lcom/facebook/imagepipeline/producers/g0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "NetworkFetchProducer"

    .line 18
    .line 19
    invoke-interface {v1, v2, v3, v0}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-interface {v1, v0, v3, v2}, Lcom/facebook/imagepipeline/producers/g0;->c(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "network"

    .line 35
    .line 36
    invoke-interface {v0, v1}, Lcom/facebook/imagepipeline/producers/e0;->z(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->e()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    or-int/2addr v0, v2

    .line 44
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->f()Lx1/a;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->a()Lcom/facebook/imagepipeline/producers/n;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-static {p1, v0, v1, v2, p2}, Lcom/facebook/imagepipeline/producers/W;->j(LR0/k;ILx1/a;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method protected i(LR0/k;Lcom/facebook/imagepipeline/producers/C;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, p2, v0}, Lcom/facebook/imagepipeline/producers/W;->n(Lcom/facebook/imagepipeline/producers/C;Lcom/facebook/imagepipeline/producers/e0;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/W;->g()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->c()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    sub-long v2, v0, v2

    .line 20
    .line 21
    const-wide/16 v4, 0x64

    .line 22
    .line 23
    cmp-long v2, v2, v4

    .line 24
    .line 25
    if-ltz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {p2, v0, v1}, Lcom/facebook/imagepipeline/producers/C;->h(J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->d()Lcom/facebook/imagepipeline/producers/g0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "NetworkFetchProducer"

    .line 39
    .line 40
    const-string v3, "intermediate_result"

    .line 41
    .line 42
    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/g0;->a(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->e()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->f()Lx1/a;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->a()Lcom/facebook/imagepipeline/producers/n;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {p2}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-static {p1, v0, v1, v2, p2}, Lcom/facebook/imagepipeline/producers/W;->j(LR0/k;ILx1/a;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void
.end method

.method protected m(Lcom/facebook/imagepipeline/producers/C;Ljava/io/InputStream;I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/W;->a:LR0/i;

    if-lez p3, :cond_0

    invoke-interface {v0, p3}, LR0/i;->e(I)LR0/k;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, LR0/i;->a()LR0/k;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/W;->b:LR0/a;

    const/16 v2, 0x4000

    invoke-interface {v1, v2}, LR0/f;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    :cond_1
    :goto_1
    :try_start_0
    invoke-virtual {p2, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    if-ltz v2, :cond_2

    if-lez v2, :cond_1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    invoke-virtual {p0, v0, p1}, Lcom/facebook/imagepipeline/producers/W;->i(LR0/k;Lcom/facebook/imagepipeline/producers/C;)V

    invoke-virtual {v0}, LR0/k;->size()I

    move-result v2

    invoke-static {v2, p3}, Lcom/facebook/imagepipeline/producers/W;->e(II)F

    move-result v2

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->a()Lcom/facebook/imagepipeline/producers/n;

    move-result-object v3

    invoke-interface {v3, v2}, Lcom/facebook/imagepipeline/producers/n;->c(F)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/W;->c:Lcom/facebook/imagepipeline/producers/X;

    invoke-virtual {v0}, LR0/k;->size()I

    move-result p3

    invoke-interface {p2, p1, p3}, Lcom/facebook/imagepipeline/producers/X;->a(Lcom/facebook/imagepipeline/producers/C;I)V

    invoke-virtual {p0, v0, p1}, Lcom/facebook/imagepipeline/producers/W;->h(LR0/k;Lcom/facebook/imagepipeline/producers/C;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/W;->b:LR0/a;

    invoke-interface {p1, v1}, LR0/f;->a(Ljava/lang/Object;)V

    invoke-virtual {v0}, LR0/k;->close()V

    return-void

    :goto_2
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/W;->b:LR0/a;

    invoke-interface {p2, v1}, LR0/f;->a(Ljava/lang/Object;)V

    invoke-virtual {v0}, LR0/k;->close()V

    throw p1
.end method
