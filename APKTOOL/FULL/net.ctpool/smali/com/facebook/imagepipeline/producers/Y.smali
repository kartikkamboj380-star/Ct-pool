.class public Lcom/facebook/imagepipeline/producers/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/Y$c;
    }
.end annotation


# instance fields
.field private final a:Lw1/j;

.field private final b:Lw1/k;

.field private final c:LR0/i;

.field private final d:LR0/a;

.field private final e:Lcom/facebook/imagepipeline/producers/d0;


# direct methods
.method public constructor <init>(Lw1/j;Lw1/k;LR0/i;LR0/a;Lcom/facebook/imagepipeline/producers/d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/Y;->a:Lw1/j;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/Y;->b:Lw1/k;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/Y;->c:LR0/i;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/Y;->d:LR0/a;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/Y;->e:Lcom/facebook/imagepipeline/producers/d0;

    .line 13
    .line 14
    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/Y;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;LI0/d;LD1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/imagepipeline/producers/Y;->i(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;LI0/d;LD1/g;)V

    return-void
.end method

.method static bridge synthetic d(Lx0/f;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/imagepipeline/producers/Y;->g(Lx0/f;)Z

    move-result p0

    return p0
.end method

.method private static e(LJ1/b;)Landroid/net/Uri;
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ1/b;->u()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "fresco_partial"

    .line 10
    .line 11
    const-string v1, "true"

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method static f(Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;ZI)Ljava/util/Map;
    .locals 1

    .line 1
    const-string v0, "PartialDiskCacheProducer"

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

.method private static g(Lx0/f;)Z
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

.method private h(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;LI0/d;)Lx0/d;
    .locals 7

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    new-instance v6, Lcom/facebook/imagepipeline/producers/Y$a;

    .line 6
    .line 7
    move-object v0, v6

    .line 8
    move-object v1, p0

    .line 9
    move-object v3, p2

    .line 10
    move-object v4, p1

    .line 11
    move-object v5, p3

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/facebook/imagepipeline/producers/Y$a;-><init>(Lcom/facebook/imagepipeline/producers/Y;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Lcom/facebook/imagepipeline/producers/n;LI0/d;)V

    .line 13
    .line 14
    .line 15
    return-object v6
.end method

.method private i(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;LI0/d;LD1/g;)V
    .locals 10

    .line 1
    new-instance v9, Lcom/facebook/imagepipeline/producers/Y$c;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/Y;->a:Lw1/j;

    .line 4
    .line 5
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/Y;->c:LR0/i;

    .line 6
    .line 7
    iget-object v5, p0, Lcom/facebook/imagepipeline/producers/Y;->d:LR0/a;

    .line 8
    .line 9
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/16 v1, 0x20

    .line 14
    .line 15
    invoke-virtual {v0, v1}, LJ1/b;->x(I)Z

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    const/4 v8, 0x0

    .line 20
    move-object v0, v9

    .line 21
    move-object v1, p1

    .line 22
    move-object v3, p3

    .line 23
    move-object v6, p4

    .line 24
    invoke-direct/range {v0 .. v8}, Lcom/facebook/imagepipeline/producers/Y$c;-><init>(Lcom/facebook/imagepipeline/producers/n;Lw1/j;LI0/d;LR0/i;LR0/a;LD1/g;ZLcom/facebook/imagepipeline/producers/Z;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/Y;->e:Lcom/facebook/imagepipeline/producers/d0;

    .line 28
    .line 29
    invoke-interface {p1, v9, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private j(Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/Y$b;

    invoke-direct {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/Y$b;-><init>(Lcom/facebook/imagepipeline/producers/Y;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-interface {p2, v0}, Lcom/facebook/imagepipeline/producers/e0;->e(Lcom/facebook/imagepipeline/producers/f0;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 7

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v0

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v1, v2}, LJ1/b;->x(I)Z

    move-result v1

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v2

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, LJ1/b;->x(I)Z

    move-result v2

    if-nez v1, :cond_0

    if-nez v2, :cond_0

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/Y;->e:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void

    :cond_0
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v2

    const-string v3, "PartialDiskCacheProducer"

    invoke-interface {v2, p2, v3}, Lcom/facebook/imagepipeline/producers/g0;->e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/Y;->e(LJ1/b;)Landroid/net/Uri;

    move-result-object v4

    iget-object v5, p0, Lcom/facebook/imagepipeline/producers/Y;->b:Lw1/k;

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->a()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v0, v4, v6}, Lw1/k;->d(LJ1/b;Landroid/net/Uri;Ljava/lang/Object;)LI0/d;

    move-result-object v0

    const/4 v4, 0x0

    if-nez v1, :cond_1

    invoke-static {v2, p2, v4, v4}, Lcom/facebook/imagepipeline/producers/Y;->f(Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;ZI)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v2, p2, v3, v1}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/facebook/imagepipeline/producers/Y;->i(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;LI0/d;LD1/g;)V

    return-void

    :cond_1
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/Y;->a:Lw1/j;

    invoke-virtual {v2, v0, v1}, Lw1/j;->m(LI0/d;Ljava/util/concurrent/atomic/AtomicBoolean;)Lx0/f;

    move-result-object v2

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/imagepipeline/producers/Y;->h(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;LI0/d;)Lx0/d;

    move-result-object p1

    invoke-virtual {v2, p1}, Lx0/f;->e(Lx0/d;)Lx0/f;

    invoke-direct {p0, v1, p2}, Lcom/facebook/imagepipeline/producers/Y;->j(Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void
.end method
