.class Lcom/facebook/imagepipeline/producers/Y$c;
.super Lcom/facebook/imagepipeline/producers/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/Y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final c:Lw1/j;

.field private final d:LI0/d;

.field private final e:LR0/i;

.field private final f:LR0/a;

.field private final g:LD1/g;

.field private final h:Z


# direct methods
.method private constructor <init>(Lcom/facebook/imagepipeline/producers/n;Lw1/j;LI0/d;LR0/i;LR0/a;LD1/g;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/t;-><init>(Lcom/facebook/imagepipeline/producers/n;)V

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/Y$c;->c:Lw1/j;

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/Y$c;->d:LI0/d;

    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/Y$c;->e:LR0/i;

    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/Y$c;->f:LR0/a;

    iput-object p6, p0, Lcom/facebook/imagepipeline/producers/Y$c;->g:LD1/g;

    iput-boolean p7, p0, Lcom/facebook/imagepipeline/producers/Y$c;->h:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/imagepipeline/producers/n;Lw1/j;LI0/d;LR0/i;LR0/a;LD1/g;ZLcom/facebook/imagepipeline/producers/Z;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p7}, Lcom/facebook/imagepipeline/producers/Y$c;-><init>(Lcom/facebook/imagepipeline/producers/n;Lw1/j;LI0/d;LR0/i;LR0/a;LD1/g;Z)V

    return-void
.end method

.method private q(Ljava/io/InputStream;Ljava/io/OutputStream;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/Y$c;->f:LR0/a;

    const/16 v1, 0x4000

    invoke-interface {v0, v1}, LR0/f;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    move v2, p3

    :cond_0
    :goto_0
    if-lez v2, :cond_1

    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {p1, v0, v4, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    if-ltz v3, :cond_1

    if-lez v3, :cond_0

    invoke-virtual {p2, v0, v4, v3}, Ljava/io/OutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-int/2addr v2, v3

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/Y$c;->f:LR0/a;

    invoke-interface {p2, v0}, LR0/f;->a(Ljava/lang/Object;)V

    throw p1

    :cond_1
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/Y$c;->f:LR0/a;

    invoke-interface {p1, v0}, LR0/f;->a(Ljava/lang/Object;)V

    if-gtz v2, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/io/IOException;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    const/4 p3, 0x0

    const-string v0, "Failed to read %d bytes - finished %d short"

    invoke-static {p3, v0, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private r(LD1/g;LD1/g;)LR0/k;
    .locals 3

    .line 1
    invoke-virtual {p2}, LD1/g;->g()Lx1/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lx1/a;

    .line 10
    .line 11
    iget v0, v0, Lx1/a;->a:I

    .line 12
    .line 13
    invoke-virtual {p2}, LD1/g;->B()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/Y$c;->e:LR0/i;

    .line 19
    .line 20
    invoke-interface {v2, v1}, LR0/i;->e(I)LR0/k;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p1}, LD1/g;->w()Ljava/io/InputStream;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1, v1, v0}, Lcom/facebook/imagepipeline/producers/Y$c;->q(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, LD1/g;->w()Ljava/io/InputStream;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p2}, LD1/g;->B()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-direct {p0, p1, v1, p2}, Lcom/facebook/imagepipeline/producers/Y$c;->q(Ljava/io/InputStream;Ljava/io/OutputStream;I)V

    .line 40
    .line 41
    .line 42
    return-object v1
.end method

.method private t(LR0/k;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, LR0/k;->a()LR0/h;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, LS0/a;->J(Ljava/io/Closeable;)LS0/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    new-instance v1, LD1/g;

    .line 11
    .line 12
    invoke-direct {v1, p1}, LD1/g;-><init>(LS0/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    .line 14
    .line 15
    :try_start_1
    invoke-virtual {v1}, LD1/g;->n0()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v2, 0x1

    .line 23
    invoke-interface {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, LD1/g;->d(LD1/g;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, LS0/a;->g(LS0/a;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_0

    .line 35
    :catchall_1
    move-exception v1

    .line 36
    move-object v3, v1

    .line 37
    move-object v1, v0

    .line 38
    move-object v0, v3

    .line 39
    :goto_0
    invoke-static {v1}, LD1/g;->d(LD1/g;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, LS0/a;->g(LS0/a;)V

    .line 43
    .line 44
    .line 45
    throw v0
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, LD1/g;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/Y$c;->s(LD1/g;I)V

    return-void
.end method

.method public s(LD1/g;I)V
    .locals 2

    .line 1
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->f(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/Y$c;->g:LD1/g;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, LD1/g;->g()Lx1/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    :try_start_0
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/Y$c;->g:LD1/g;

    .line 21
    .line 22
    invoke-direct {p0, p2, p1}, Lcom/facebook/imagepipeline/producers/Y$c;->r(LD1/g;LD1/g;)LR0/k;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/Y$c;->t(LR0/k;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {p1}, LD1/g;->close()V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/Y$c;->g:LD1/g;

    .line 33
    .line 34
    invoke-virtual {p1}, LD1/g;->close()V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception p2

    .line 39
    goto :goto_2

    .line 40
    :catch_0
    move-exception p2

    .line 41
    :try_start_1
    const-string v0, "PartialDiskCacheProducer"

    .line 42
    .line 43
    const-string v1, "Error while merging image data"

    .line 44
    .line 45
    invoke-static {v0, v1, p2}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0, p2}, Lcom/facebook/imagepipeline/producers/n;->a(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :goto_1
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/Y$c;->c:Lw1/j;

    .line 57
    .line 58
    iget-object p2, p0, Lcom/facebook/imagepipeline/producers/Y$c;->d:LI0/d;

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Lw1/j;->s(LI0/d;)Lx0/f;

    .line 61
    .line 62
    .line 63
    goto :goto_3

    .line 64
    :goto_2
    invoke-virtual {p1}, LD1/g;->close()V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/Y$c;->g:LD1/g;

    .line 68
    .line 69
    invoke-virtual {p1}, LD1/g;->close()V

    .line 70
    .line 71
    .line 72
    throw p2

    .line 73
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/producers/Y$c;->h:Z

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    const/16 v0, 0x8

    .line 78
    .line 79
    invoke-static {p2, v0}, Lcom/facebook/imagepipeline/producers/c;->n(II)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->e(I)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    if-eqz p1, :cond_2

    .line 92
    .line 93
    invoke-virtual {p1}, LD1/g;->n()Ls1/c;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sget-object v1, Ls1/c;->d:Ls1/c;

    .line 98
    .line 99
    if-eq v0, v1, :cond_2

    .line 100
    .line 101
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/Y$c;->c:Lw1/j;

    .line 102
    .line 103
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/Y$c;->d:LI0/d;

    .line 104
    .line 105
    invoke-virtual {v0, v1, p1}, Lw1/j;->p(LI0/d;LD1/g;)V

    .line 106
    .line 107
    .line 108
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    .line 113
    .line 114
    .line 115
    :goto_3
    return-void
.end method
