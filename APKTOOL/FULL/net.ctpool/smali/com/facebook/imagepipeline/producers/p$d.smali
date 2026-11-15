.class abstract Lcom/facebook/imagepipeline/producers/p$d;
.super Lcom/facebook/imagepipeline/producers/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "d"
.end annotation


# instance fields
.field private final c:Lcom/facebook/imagepipeline/producers/e0;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/facebook/imagepipeline/producers/g0;

.field private final f:Lx1/c;

.field private g:Z

.field private final h:Lcom/facebook/imagepipeline/producers/G;

.field private i:I

.field final synthetic j:Lcom/facebook/imagepipeline/producers/p;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/p;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;ZI)V
    .locals 1

    const-string v0, "consumer"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "producerContext"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/p$d;->j:Lcom/facebook/imagepipeline/producers/p;

    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/t;-><init>(Lcom/facebook/imagepipeline/producers/n;)V

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    const-string p2, "ProgressiveDecoder"

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/p$d;->d:Ljava/lang/String;

    invoke-interface {p3}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object p2

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/p$d;->e:Lcom/facebook/imagepipeline/producers/g0;

    invoke-interface {p3}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object p2

    invoke-virtual {p2}, LJ1/b;->g()Lx1/c;

    move-result-object p2

    const-string v0, "producerContext.imageRequest.imageDecodeOptions"

    invoke-static {p2, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/p$d;->f:Lx1/c;

    new-instance v0, Lcom/facebook/imagepipeline/producers/q;

    invoke-direct {v0, p0, p1, p5}, Lcom/facebook/imagepipeline/producers/q;-><init>(Lcom/facebook/imagepipeline/producers/p$d;Lcom/facebook/imagepipeline/producers/p;I)V

    new-instance p5, Lcom/facebook/imagepipeline/producers/G;

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/p;->f()Ljava/util/concurrent/Executor;

    move-result-object p1

    iget p2, p2, Lx1/c;->a:I

    invoke-direct {p5, p1, v0, p2}, Lcom/facebook/imagepipeline/producers/G;-><init>(Ljava/util/concurrent/Executor;Lcom/facebook/imagepipeline/producers/G$d;I)V

    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/p$d;->h:Lcom/facebook/imagepipeline/producers/G;

    new-instance p1, Lcom/facebook/imagepipeline/producers/p$d$a;

    invoke-direct {p1, p0, p4}, Lcom/facebook/imagepipeline/producers/p$d$a;-><init>(Lcom/facebook/imagepipeline/producers/p$d;Z)V

    invoke-interface {p3, p1}, Lcom/facebook/imagepipeline/producers/e0;->e(Lcom/facebook/imagepipeline/producers/f0;)V

    return-void
.end method

.method private final A()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/imagepipeline/producers/p$d;->E(Z)V

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/n;->b()V

    return-void
.end method

.method private final B(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/imagepipeline/producers/p$d;->E(Z)V

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/imagepipeline/producers/n;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method private final C(LD1/d;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$d;->j:Lcom/facebook/imagepipeline/producers/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/producers/p;->c()Ly1/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Ly1/a;->b(Ljava/io/Closeable;)LS0/a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :try_start_0
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-direct {p0, v0}, Lcom/facebook/imagepipeline/producers/p$d;->E(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, LS0/a;->g(LS0/a;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p2

    .line 30
    invoke-static {p1}, LS0/a;->g(LS0/a;)V

    .line 31
    .line 32
    .line 33
    throw p2
.end method

.method private final D(LD1/g;ILD1/l;)LD1/d;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$d;->j:Lcom/facebook/imagepipeline/producers/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/producers/p;->h()Ljava/lang/Runnable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$d;->j:Lcom/facebook/imagepipeline/producers/p;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/producers/p;->i()LO0/o;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, LO0/o;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "recoverFromDecoderOOM.get()"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    check-cast v0, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v0, 0x0

    .line 35
    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/p$d;->j:Lcom/facebook/imagepipeline/producers/p;

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/facebook/imagepipeline/producers/p;->g()LB1/c;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/p$d;->f:Lx1/c;

    .line 42
    .line 43
    invoke-interface {v1, p1, p2, p3, v2}, LB1/c;->a(LD1/g;ILD1/l;Lx1/c;)LD1/d;

    .line 44
    .line 45
    .line 46
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    goto :goto_1

    .line 48
    :catch_0
    move-exception v1

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$d;->j:Lcom/facebook/imagepipeline/producers/p;

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/producers/p;->h()Ljava/lang/Runnable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 63
    .line 64
    .line 65
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$d;->j:Lcom/facebook/imagepipeline/producers/p;

    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/producers/p;->g()LB1/c;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/p$d;->f:Lx1/c;

    .line 72
    .line 73
    invoke-interface {v0, p1, p2, p3, v1}, LB1/c;->a(LD1/g;ILD1/l;Lx1/c;)LD1/d;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :goto_1
    return-object p1

    .line 78
    :cond_2
    throw v1
.end method

.method private final E(Z)V
    .locals 1

    .line 1
    monitor-enter p0

    if-eqz p1, :cond_1

    :try_start_0
    iget-boolean p1, p0, Lcom/facebook/imagepipeline/producers/p$d;->g:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    move-result-object p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-interface {p1, v0}, Lcom/facebook/imagepipeline/producers/n;->c(F)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/imagepipeline/producers/p$d;->g:Z

    sget-object p1, Li5/u;->a:Li5/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/p$d;->h:Lcom/facebook/imagepipeline/producers/G;

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/G;->c()V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_1
    :goto_0
    monitor-exit p0

    return-void
.end method

.method private final F(LD1/g;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, LD1/g;->n()Ls1/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ls1/b;->b:Ls1/c;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$d;->f:Lx1/c;

    .line 11
    .line 12
    iget-object v0, v0, Lx1/c;->h:Landroid/graphics/Bitmap$Config;

    .line 13
    .line 14
    invoke-static {v0}, LN1/b;->e(Landroid/graphics/Bitmap$Config;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/high16 v1, 0x6400000

    .line 19
    .line 20
    invoke-static {p1, v0, v1}, LL1/a;->c(LD1/g;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p1, v0}, LD1/g;->h1(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private final H(LD1/g;LD1/d;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 2
    .line 3
    invoke-virtual {p1}, LD1/g;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "encoded_width"

    .line 12
    .line 13
    invoke-interface {v0, v2, v1}, Lo1/a;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 17
    .line 18
    invoke-virtual {p1}, LD1/g;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "encoded_height"

    .line 27
    .line 28
    invoke-interface {v0, v2, v1}, Lo1/a;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 32
    .line 33
    invoke-virtual {p1}, LD1/g;->B()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v2, "encoded_size"

    .line 42
    .line 43
    invoke-interface {v0, v2, v1}, Lo1/a;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 47
    .line 48
    const-string v1, "image_color_space"

    .line 49
    .line 50
    invoke-virtual {p1}, LD1/g;->j()Landroid/graphics/ColorSpace;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {v0, v1, p1}, Lo1/a;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    instance-of p1, p2, LD1/c;

    .line 58
    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    move-object p1, p2

    .line 62
    check-cast p1, LD1/c;

    .line 63
    .line 64
    invoke-interface {p1}, LD1/c;->z0()Landroid/graphics/Bitmap;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 73
    .line 74
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v1, "bitmap_config"

    .line 79
    .line 80
    invoke-interface {v0, v1, p1}, Lo1/a;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    if-eqz p2, :cond_1

    .line 84
    .line 85
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 86
    .line 87
    invoke-interface {p1}, Lo1/a;->getExtras()Ljava/util/Map;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-interface {p2, p1}, Lo1/a;->j(Ljava/util/Map;)V

    .line 92
    .line 93
    .line 94
    :cond_1
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 95
    .line 96
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    const-string p3, "last_scan_num"

    .line 101
    .line 102
    invoke-interface {p1, p3, p2}, Lo1/a;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public static synthetic q(Lcom/facebook/imagepipeline/producers/p$d;Lcom/facebook/imagepipeline/producers/p;ILD1/g;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/facebook/imagepipeline/producers/p$d;->r(Lcom/facebook/imagepipeline/producers/p$d;Lcom/facebook/imagepipeline/producers/p;ILD1/g;I)V

    return-void
.end method

.method private static final r(Lcom/facebook/imagepipeline/producers/p$d;Lcom/facebook/imagepipeline/producers/p;ILD1/g;I)V
    .locals 4

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$1"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p3, :cond_5

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 20
    .line 21
    invoke-virtual {p3}, LD1/g;->n()Ls1/c;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ls1/c;->a()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "image_format"

    .line 30
    .line 31
    invoke-interface {v1, v3, v2}, Lo1/a;->w(Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, LJ1/b;->u()Landroid/net/Uri;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v1, 0x0

    .line 46
    :goto_0
    invoke-virtual {p3, v1}, LD1/g;->i1(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/16 v1, 0x10

    .line 50
    .line 51
    invoke-static {p4, v1}, Lcom/facebook/imagepipeline/producers/c;->n(II)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/p;->e()Ly1/e;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    sget-object v3, Ly1/e;->m:Ly1/e;

    .line 60
    .line 61
    if-eq v2, v3, :cond_1

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/p;->e()Ly1/e;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    sget-object v3, Ly1/e;->n:Ly1/e;

    .line 68
    .line 69
    if-ne v2, v3, :cond_3

    .line 70
    .line 71
    if-nez v1, :cond_3

    .line 72
    .line 73
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/p;->d()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-nez p1, :cond_2

    .line 78
    .line 79
    invoke-virtual {v0}, LJ1/b;->u()Landroid/net/Uri;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, LW0/f;->n(Landroid/net/Uri;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_3

    .line 88
    .line 89
    :cond_2
    invoke-virtual {v0}, LJ1/b;->s()Lx1/g;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const-string v1, "request.rotationOptions"

    .line 94
    .line 95
    invoke-static {p1, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, LJ1/b;->q()Lx1/f;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {p1, v0, p3, p2}, LL1/a;->b(Lx1/g;Lx1/f;LD1/g;I)I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-virtual {p3, p1}, LD1/g;->h1(I)V

    .line 107
    .line 108
    .line 109
    :cond_3
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 110
    .line 111
    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->f()Ly1/m;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-interface {p1}, Ly1/m;->G()Ly1/n;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1}, Ly1/n;->h()Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-eqz p1, :cond_4

    .line 124
    .line 125
    invoke-direct {p0, p3}, Lcom/facebook/imagepipeline/producers/p$d;->F(LD1/g;)V

    .line 126
    .line 127
    .line 128
    :cond_4
    iget p1, p0, Lcom/facebook/imagepipeline/producers/p$d;->i:I

    .line 129
    .line 130
    invoke-direct {p0, p3, p4, p1}, Lcom/facebook/imagepipeline/producers/p$d;->v(LD1/g;II)V

    .line 131
    .line 132
    .line 133
    :cond_5
    return-void
.end method

.method public static final synthetic s(Lcom/facebook/imagepipeline/producers/p$d;)Lcom/facebook/imagepipeline/producers/G;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/p$d;->h:Lcom/facebook/imagepipeline/producers/G;

    return-object p0
.end method

.method public static final synthetic t(Lcom/facebook/imagepipeline/producers/p$d;)Lcom/facebook/imagepipeline/producers/e0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    return-object p0
.end method

.method public static final synthetic u(Lcom/facebook/imagepipeline/producers/p$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/p$d;->A()V

    return-void
.end method

.method private final v(LD1/g;II)V
    .locals 18

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    move/from16 v0, p2

    .line 1
    const-string v1, "quality"

    invoke-virtual/range {p1 .. p1}, LD1/g;->n()Ls1/c;

    move-result-object v2

    sget-object v3, Ls1/b;->b:Ls1/c;

    if-eq v2, v3, :cond_0

    invoke-static/range {p2 .. p2}, Lcom/facebook/imagepipeline/producers/c;->f(I)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    iget-boolean v2, v11, Lcom/facebook/imagepipeline/producers/p$d;->g:Z

    if-nez v2, :cond_1

    invoke-static/range {p1 .. p1}, LD1/g;->j0(LD1/g;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    move-object v2, v11

    goto/16 :goto_b

    :cond_2
    invoke-virtual/range {p1 .. p1}, LD1/g;->n()Ls1/c;

    move-result-object v2

    sget-object v3, Ls1/b;->d:Ls1/c;

    invoke-static {v2, v3}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    const-string v13, "DecodeProducer"

    if-eqz v2, :cond_3

    sget-object v2, Lcom/facebook/imagepipeline/producers/p;->m:Lcom/facebook/imagepipeline/producers/p$a;

    iget-object v4, v11, Lcom/facebook/imagepipeline/producers/p$d;->f:Lx1/c;

    invoke-static {v2, v12, v4}, Lcom/facebook/imagepipeline/producers/p$a;->a(Lcom/facebook/imagepipeline/producers/p$a;LD1/g;Lx1/c;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual/range {p1 .. p1}, LD1/g;->getWidth()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, LD1/g;->getHeight()I

    move-result v2

    iget-object v4, v11, Lcom/facebook/imagepipeline/producers/p$d;->f:Lx1/c;

    iget-object v4, v4, Lx1/c;->h:Landroid/graphics/Bitmap$Config;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Image is too big to attempt decoding: w = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", h = "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", pixel config = "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", max bitmap size = 104857600"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    iget-object v1, v11, Lcom/facebook/imagepipeline/producers/p$d;->e:Lcom/facebook/imagepipeline/producers/g0;

    iget-object v2, v11, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    invoke-interface {v1, v2, v13, v0, v3}, Lcom/facebook/imagepipeline/producers/g0;->k(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    invoke-direct {v11, v0}, Lcom/facebook/imagepipeline/producers/p$d;->B(Ljava/lang/Throwable;)V

    return-void

    :cond_3
    invoke-virtual/range {p1 .. p1}, LD1/g;->n()Ls1/c;

    move-result-object v2

    const-string v4, "unknown"

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ls1/c;->a()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    move-object v7, v2

    goto :goto_1

    :cond_5
    :goto_0
    move-object v7, v4

    :goto_1
    invoke-virtual/range {p1 .. p1}, LD1/g;->getWidth()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, LD1/g;->getHeight()I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "x"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, LD1/g;->z()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-static/range {p2 .. p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v9, 0x8

    invoke-static {v0, v9}, Lcom/facebook/imagepipeline/producers/c;->n(II)Z

    move-result v9

    if-nez v9, :cond_6

    const/4 v9, 0x1

    goto :goto_2

    :cond_6
    const/4 v9, 0x0

    :goto_2
    const/4 v14, 0x4

    invoke-static {v0, v14}, Lcom/facebook/imagepipeline/producers/c;->n(II)Z

    move-result v14

    iget-object v15, v11, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    invoke-interface {v15}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v15

    invoke-virtual {v15}, LJ1/b;->q()Lx1/f;

    move-result-object v15

    if-eqz v15, :cond_7

    iget v4, v15, Lx1/f;->a:I

    iget v15, v15, Lx1/f;->b:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v15, v2

    goto :goto_3

    :cond_7
    move-object v15, v4

    :goto_3
    :try_start_0
    iget-object v2, v11, Lcom/facebook/imagepipeline/producers/p$d;->h:Lcom/facebook/imagepipeline/producers/G;

    invoke-virtual {v2}, Lcom/facebook/imagepipeline/producers/G;->f()J

    move-result-wide v3

    iget-object v2, v11, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    invoke-interface {v2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v2

    invoke-virtual {v2}, LJ1/b;->u()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v5, "producerContext.imageRequest.sourceUri.toString()"

    invoke-static {v2, v5}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v9, :cond_9

    if-eqz v14, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual/range {p0 .. p1}, Lcom/facebook/imagepipeline/producers/p$d;->x(LD1/g;)I

    move-result v5

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object v2, v11

    goto/16 :goto_a

    :cond_9
    :goto_4
    invoke-virtual/range {p1 .. p1}, LD1/g;->B()I

    move-result v5

    :goto_5
    if-nez v9, :cond_b

    if-eqz v14, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/imagepipeline/producers/p$d;->z()LD1/l;

    move-result-object v9

    goto :goto_7

    :cond_b
    :goto_6
    sget-object v9, LD1/k;->d:LD1/l;

    :goto_7
    iget-object v14, v11, Lcom/facebook/imagepipeline/producers/p$d;->e:Lcom/facebook/imagepipeline/producers/g0;

    move-object/from16 v17, v2

    iget-object v2, v11, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    invoke-interface {v14, v2, v13}, Lcom/facebook/imagepipeline/producers/g0;->e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v9, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v12, v5, v9}, Lcom/facebook/imagepipeline/producers/p$d;->D(LD1/g;ILD1/l;)LD1/d;

    move-result-object v14
    :try_end_1
    .catch LB1/a; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual/range {p1 .. p1}, LD1/g;->z()I

    move-result v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v2, 0x1

    if-eq v1, v2, :cond_c

    or-int/lit8 v0, v0, 0x10

    :cond_c
    move-object/from16 v1, p0

    move-object v2, v14

    move-object v5, v9

    move-object v9, v15

    :try_start_3
    invoke-direct/range {v1 .. v10}, Lcom/facebook/imagepipeline/producers/p$d;->w(LD1/d;JLD1/l;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, v11, Lcom/facebook/imagepipeline/producers/p$d;->e:Lcom/facebook/imagepipeline/producers/g0;

    iget-object v3, v11, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    invoke-interface {v2, v3, v13, v1}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    move/from16 v1, p3

    invoke-direct {v11, v12, v14, v1}, Lcom/facebook/imagepipeline/producers/p$d;->H(LD1/g;LD1/d;I)V

    invoke-direct {v11, v14, v0}, Lcom/facebook/imagepipeline/producers/p$d;->C(LD1/d;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static/range {p1 .. p1}, LD1/g;->d(LD1/g;)V

    return-void

    :catch_0
    move-exception v0

    move-object/from16 v16, v13

    move-object v2, v14

    goto :goto_9

    :catch_1
    move-exception v0

    move-object/from16 v16, v13

    :goto_8
    const/4 v2, 0x0

    goto :goto_9

    :catch_2
    move-exception v0

    :try_start_4
    invoke-virtual {v0}, LB1/a;->a()LD1/g;

    move-result-object v2

    iget-object v5, v11, Lcom/facebook/imagepipeline/producers/p$d;->d:Ljava/lang/String;

    const-string v14, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v12
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object/from16 v16, v13

    const/16 v13, 0xa

    :try_start_5
    invoke-virtual {v2, v13}, LD1/g;->l(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2}, LD1/g;->B()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v11, v17

    filled-new-array {v12, v11, v13, v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5, v14, v2}, LP0/a;->I(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    move-object/from16 v2, p0

    goto :goto_a

    :catch_3
    move-exception v0

    goto :goto_8

    :goto_9
    :try_start_6
    invoke-static {v9, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    move-object v5, v9

    move-object v9, v15

    invoke-direct/range {v1 .. v10}, Lcom/facebook/imagepipeline/producers/p$d;->w(LD1/d;JLD1/l;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-object/from16 v2, p0

    :try_start_7
    iget-object v3, v2, Lcom/facebook/imagepipeline/producers/p$d;->e:Lcom/facebook/imagepipeline/producers/g0;

    iget-object v4, v2, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    move-object/from16 v5, v16

    invoke-interface {v3, v4, v5, v0, v1}, Lcom/facebook/imagepipeline/producers/g0;->k(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    invoke-direct {v2, v0}, Lcom/facebook/imagepipeline/producers/p$d;->B(Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    invoke-static/range {p1 .. p1}, LD1/g;->d(LD1/g;)V

    return-void

    :catchall_2
    move-exception v0

    :goto_a
    invoke-static/range {p1 .. p1}, LD1/g;->d(LD1/g;)V

    throw v0

    :goto_b
    return-void
.end method

.method private final w(LD1/d;JLD1/l;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    move-object/from16 v3, p7

    .line 8
    .line 9
    move-object/from16 v4, p8

    .line 10
    .line 11
    move-object/from16 v5, p9

    .line 12
    .line 13
    iget-object v6, v0, Lcom/facebook/imagepipeline/producers/p$d;->e:Lcom/facebook/imagepipeline/producers/g0;

    .line 14
    .line 15
    iget-object v7, v0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 16
    .line 17
    const-string v8, "DecodeProducer"

    .line 18
    .line 19
    invoke-interface {v6, v7, v8}, Lcom/facebook/imagepipeline/producers/g0;->g(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    const/4 v7, 0x0

    .line 24
    if-nez v6, :cond_0

    .line 25
    .line 26
    return-object v7

    .line 27
    :cond_0
    invoke-static/range {p2 .. p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-interface/range {p4 .. p4}, LD1/l;->b()Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    invoke-static {v8}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-static/range {p5 .. p5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    const-string v10, "non_fatal_decode_error"

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    invoke-interface/range {p1 .. p1}, LD1/h;->getExtras()Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object v11

    .line 51
    if-eqz v11, :cond_1

    .line 52
    .line 53
    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    if-eqz v11, :cond_1

    .line 58
    .line 59
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    :cond_1
    instance-of v11, v1, LD1/e;

    .line 64
    .line 65
    const-string v12, "sampleSize"

    .line 66
    .line 67
    const-string v13, "requestedImageSize"

    .line 68
    .line 69
    const-string v14, "imageFormat"

    .line 70
    .line 71
    const-string v15, "encodedImageSize"

    .line 72
    .line 73
    const-string v0, "isFinal"

    .line 74
    .line 75
    move-object/from16 p2, v10

    .line 76
    .line 77
    const-string v10, "hasGoodQuality"

    .line 78
    .line 79
    move-object/from16 p3, v7

    .line 80
    .line 81
    const-string v7, "queueTime"

    .line 82
    .line 83
    if-eqz v11, :cond_3

    .line 84
    .line 85
    check-cast v1, LD1/e;

    .line 86
    .line 87
    invoke-interface {v1}, LD1/c;->z0()Landroid/graphics/Bitmap;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const-string v11, "image.underlyingBitmap"

    .line 92
    .line 93
    invoke-static {v1, v11}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    move-object/from16 p1, v1

    .line 105
    .line 106
    new-instance v1, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v11, "x"

    .line 115
    .line 116
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    new-instance v5, Ljava/util/HashMap;

    .line 127
    .line 128
    const/16 v11, 0x8

    .line 129
    .line 130
    invoke-direct {v5, v11}, Ljava/util/HashMap;-><init>(I)V

    .line 131
    .line 132
    .line 133
    const-string v11, "bitmapSize"

    .line 134
    .line 135
    invoke-interface {v5, v11, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    invoke-interface {v5, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    invoke-interface {v5, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    invoke-interface {v5, v15, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    invoke-interface {v5, v14, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    invoke-interface {v5, v13, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-object/from16 v1, p9

    .line 157
    .line 158
    invoke-interface {v5, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Bitmap;->getByteCount()I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    new-instance v1, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    const-string v1, "byteCount"

    .line 178
    .line 179
    invoke-interface {v5, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    if-eqz p3, :cond_2

    .line 183
    .line 184
    move-object/from16 v11, p2

    .line 185
    .line 186
    move-object/from16 v0, p3

    .line 187
    .line 188
    invoke-interface {v5, v11, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    :cond_2
    invoke-static {v5}, LO0/g;->a(Ljava/util/Map;)LO0/g;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    goto :goto_0

    .line 196
    :cond_3
    move-object v1, v5

    .line 197
    move-object/from16 v5, p3

    .line 198
    .line 199
    new-instance v11, Ljava/util/HashMap;

    .line 200
    .line 201
    const/4 v5, 0x7

    .line 202
    invoke-direct {v11, v5}, Ljava/util/HashMap;-><init>(I)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v11, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    invoke-interface {v11, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    invoke-interface {v11, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    invoke-interface {v11, v15, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    invoke-interface {v11, v14, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    invoke-interface {v11, v13, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    invoke-interface {v11, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    if-eqz p3, :cond_4

    .line 227
    .line 228
    move-object/from16 v0, p2

    .line 229
    .line 230
    move-object/from16 v7, p3

    .line 231
    .line 232
    invoke-interface {v11, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    :cond_4
    invoke-static {v11}, LO0/g;->a(Ljava/util/Map;)LO0/g;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    :goto_0
    return-object v0
.end method


# virtual methods
.method public G(LD1/g;I)V
    .locals 6

    .line 1
    invoke-static {}, LK1/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    const-string v2, "Encoded image is not valid."

    .line 7
    .line 8
    const-string v3, "Encoded image is null."

    .line 9
    .line 10
    const-string v4, "cached_value_found"

    .line 11
    .line 12
    if-nez v0, :cond_5

    .line 13
    .line 14
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 23
    .line 24
    invoke-interface {v2, v4}, Lo1/a;->n(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-static {v2, v4}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 35
    .line 36
    invoke-interface {v4}, Lcom/facebook/imagepipeline/producers/e0;->f()Ly1/m;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-interface {v4}, Ly1/m;->G()Ly1/n;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4}, Ly1/n;->g()Z

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-eqz v4, :cond_0

    .line 49
    .line 50
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 51
    .line 52
    invoke-interface {v4}, Lcom/facebook/imagepipeline/producers/e0;->U()LJ1/b$c;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    sget-object v5, LJ1/b$c;->n:LJ1/b$c;

    .line 57
    .line 58
    if-eq v4, v5, :cond_0

    .line 59
    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    :cond_0
    new-instance p1, LW0/a;

    .line 63
    .line 64
    invoke-direct {p1, v3}, LW0/a;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/p$d;->B(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    invoke-virtual {p1}, LD1/g;->h0()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-nez v3, :cond_2

    .line 76
    .line 77
    new-instance p1, LW0/a;

    .line 78
    .line 79
    invoke-direct {p1, v2}, LW0/a;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/p$d;->J(LD1/g;I)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_3

    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    invoke-static {p2, v1}, Lcom/facebook/imagepipeline/producers/c;->n(II)Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez v0, :cond_4

    .line 95
    .line 96
    if-nez p1, :cond_4

    .line 97
    .line 98
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 99
    .line 100
    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->J()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_c

    .line 105
    .line 106
    :cond_4
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/p$d;->h:Lcom/facebook/imagepipeline/producers/G;

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/G;->h()Z

    .line 109
    .line 110
    .line 111
    goto/16 :goto_2

    .line 112
    .line 113
    :cond_5
    const-string v0, "DecodeProducer#onNewResultImpl"

    .line 114
    .line 115
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :try_start_0
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    if-nez p1, :cond_7

    .line 125
    .line 126
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 127
    .line 128
    invoke-interface {v2, v4}, Lo1/a;->n(Ljava/lang/String;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-static {v2, v4}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 139
    .line 140
    invoke-interface {v4}, Lcom/facebook/imagepipeline/producers/e0;->f()Ly1/m;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-interface {v4}, Ly1/m;->G()Ly1/n;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v4}, Ly1/n;->g()Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_6

    .line 153
    .line 154
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 155
    .line 156
    invoke-interface {v4}, Lcom/facebook/imagepipeline/producers/e0;->U()LJ1/b$c;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    sget-object v5, LJ1/b$c;->n:LJ1/b$c;

    .line 161
    .line 162
    if-eq v4, v5, :cond_6

    .line 163
    .line 164
    if-eqz v2, :cond_8

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :catchall_0
    move-exception p1

    .line 168
    goto :goto_3

    .line 169
    :cond_6
    :goto_1
    new-instance p1, LW0/a;

    .line 170
    .line 171
    invoke-direct {p1, v3}, LW0/a;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/p$d;->B(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    .line 176
    .line 177
    invoke-static {}, LK1/b;->b()V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_7
    :try_start_1
    invoke-virtual {p1}, LD1/g;->h0()Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-nez v3, :cond_8

    .line 186
    .line 187
    new-instance p1, LW0/a;

    .line 188
    .line 189
    invoke-direct {p1, v2}, LW0/a;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/p$d;->B(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 193
    .line 194
    .line 195
    invoke-static {}, LK1/b;->b()V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_8
    :try_start_2
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/p$d;->J(LD1/g;I)Z

    .line 200
    .line 201
    .line 202
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 203
    if-nez p1, :cond_9

    .line 204
    .line 205
    invoke-static {}, LK1/b;->b()V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_9
    :try_start_3
    invoke-static {p2, v1}, Lcom/facebook/imagepipeline/producers/c;->n(II)Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-nez v0, :cond_a

    .line 214
    .line 215
    if-nez p1, :cond_a

    .line 216
    .line 217
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/p$d;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 218
    .line 219
    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->J()Z

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    if-eqz p1, :cond_b

    .line 224
    .line 225
    :cond_a
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/p$d;->h:Lcom/facebook/imagepipeline/producers/G;

    .line 226
    .line 227
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/G;->h()Z

    .line 228
    .line 229
    .line 230
    :cond_b
    sget-object p1, Li5/u;->a:Li5/u;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 231
    .line 232
    invoke-static {}, LK1/b;->b()V

    .line 233
    .line 234
    .line 235
    :cond_c
    :goto_2
    return-void

    .line 236
    :goto_3
    invoke-static {}, LK1/b;->b()V

    .line 237
    .line 238
    .line 239
    throw p1
.end method

.method protected final I(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/imagepipeline/producers/p$d;->i:I

    return-void
.end method

.method protected J(LD1/g;I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p$d;->h:Lcom/facebook/imagepipeline/producers/G;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/G;->k(LD1/g;I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public g()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/p$d;->A()V

    return-void
.end method

.method public h(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "t"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/p$d;->B(Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic i(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, LD1/g;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/p$d;->G(LD1/g;I)V

    return-void
.end method

.method protected j(F)V
    .locals 1

    .line 1
    const v0, 0x3f7d70a4    # 0.99f

    mul-float/2addr p1, v0

    invoke-super {p0, p1}, Lcom/facebook/imagepipeline/producers/t;->j(F)V

    return-void
.end method

.method protected abstract x(LD1/g;)I
.end method

.method protected final y()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/imagepipeline/producers/p$d;->i:I

    return v0
.end method

.method protected abstract z()LD1/l;
.end method
