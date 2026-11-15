.class public final Lcom/facebook/imagepipeline/producers/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/p$a;,
        Lcom/facebook/imagepipeline/producers/p$b;,
        Lcom/facebook/imagepipeline/producers/p$c;,
        Lcom/facebook/imagepipeline/producers/p$d;
    }
.end annotation


# static fields
.field public static final m:Lcom/facebook/imagepipeline/producers/p$a;


# instance fields
.field private final a:LR0/a;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:LB1/c;

.field private final d:LB1/e;

.field private final e:Ly1/e;

.field private final f:Z

.field private final g:Z

.field private final h:Lcom/facebook/imagepipeline/producers/d0;

.field private final i:I

.field private final j:Ly1/a;

.field private final k:Ljava/lang/Runnable;

.field private final l:LO0/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/imagepipeline/producers/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/producers/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/imagepipeline/producers/p;->m:Lcom/facebook/imagepipeline/producers/p$a;

    return-void
.end method

.method public constructor <init>(LR0/a;Ljava/util/concurrent/Executor;LB1/c;LB1/e;Ly1/e;ZZLcom/facebook/imagepipeline/producers/d0;ILy1/a;Ljava/lang/Runnable;LO0/o;)V
    .locals 1

    .line 1
    const-string v0, "byteArrayPool"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executor"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageDecoder"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "progressiveJpegConfig"

    invoke-static {p4, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "downsampleMode"

    invoke-static {p5, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputProducer"

    invoke-static {p8, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "closeableReferenceFactory"

    invoke-static {p10, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recoverFromDecoderOOM"

    invoke-static {p12, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/p;->a:LR0/a;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/p;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/p;->c:LB1/c;

    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/p;->d:LB1/e;

    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/p;->e:Ly1/e;

    iput-boolean p6, p0, Lcom/facebook/imagepipeline/producers/p;->f:Z

    iput-boolean p7, p0, Lcom/facebook/imagepipeline/producers/p;->g:Z

    iput-object p8, p0, Lcom/facebook/imagepipeline/producers/p;->h:Lcom/facebook/imagepipeline/producers/d0;

    iput p9, p0, Lcom/facebook/imagepipeline/producers/p;->i:I

    iput-object p10, p0, Lcom/facebook/imagepipeline/producers/p;->j:Ly1/a;

    iput-object p11, p0, Lcom/facebook/imagepipeline/producers/p;->k:Ljava/lang/Runnable;

    iput-object p12, p0, Lcom/facebook/imagepipeline/producers/p;->l:LO0/o;

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 10

    .line 1
    const-string v1, "consumer"

    invoke-static {p1, v1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "context"

    invoke-static {p2, v1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LK1/b;->d()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v1

    invoke-virtual {v1}, LJ1/b;->u()Landroid/net/Uri;

    move-result-object v2

    invoke-static {v2}, LW0/f;->n(Landroid/net/Uri;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, LJ1/b;->u()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, LJ1/c;->r(Landroid/net/Uri;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v7, Lcom/facebook/imagepipeline/producers/p$b;

    iget-boolean v5, p0, Lcom/facebook/imagepipeline/producers/p;->g:Z

    iget v6, p0, Lcom/facebook/imagepipeline/producers/p;->i:I

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lcom/facebook/imagepipeline/producers/p$b;-><init>(Lcom/facebook/imagepipeline/producers/p;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;ZI)V

    goto :goto_0

    :cond_0
    new-instance v5, LB1/f;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/p;->a:LR0/a;

    invoke-direct {v5, v1}, LB1/f;-><init>(LR0/a;)V

    new-instance v9, Lcom/facebook/imagepipeline/producers/p$c;

    iget-object v6, p0, Lcom/facebook/imagepipeline/producers/p;->d:LB1/e;

    iget-boolean v7, p0, Lcom/facebook/imagepipeline/producers/p;->g:Z

    iget v8, p0, Lcom/facebook/imagepipeline/producers/p;->i:I

    move-object v1, v9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v8}, Lcom/facebook/imagepipeline/producers/p$c;-><init>(Lcom/facebook/imagepipeline/producers/p;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;LB1/f;LB1/e;ZI)V

    move-object v7, v9

    :goto_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/p;->h:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {v1, v7, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    goto :goto_2

    :cond_1
    const-string v1, "DecodeProducer#produceResults"

    invoke-static {v1}, LK1/b;->a(Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v1

    invoke-virtual {v1}, LJ1/b;->u()Landroid/net/Uri;

    move-result-object v2

    invoke-static {v2}, LW0/f;->n(Landroid/net/Uri;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, LJ1/b;->u()Landroid/net/Uri;

    move-result-object v1

    invoke-static {v1}, LJ1/c;->r(Landroid/net/Uri;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v7, Lcom/facebook/imagepipeline/producers/p$b;

    iget-boolean v5, p0, Lcom/facebook/imagepipeline/producers/p;->g:Z

    iget v6, p0, Lcom/facebook/imagepipeline/producers/p;->i:I

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lcom/facebook/imagepipeline/producers/p$b;-><init>(Lcom/facebook/imagepipeline/producers/p;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;ZI)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    new-instance v5, LB1/f;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/p;->a:LR0/a;

    invoke-direct {v5, v1}, LB1/f;-><init>(LR0/a;)V

    new-instance v9, Lcom/facebook/imagepipeline/producers/p$c;

    iget-object v6, p0, Lcom/facebook/imagepipeline/producers/p;->d:LB1/e;

    iget-boolean v7, p0, Lcom/facebook/imagepipeline/producers/p;->g:Z

    iget v8, p0, Lcom/facebook/imagepipeline/producers/p;->i:I

    move-object v1, v9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v8}, Lcom/facebook/imagepipeline/producers/p$c;-><init>(Lcom/facebook/imagepipeline/producers/p;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;LB1/f;LB1/e;ZI)V

    move-object v7, v9

    :goto_1
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/p;->h:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {v1, v7, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    sget-object v0, Li5/u;->a:Li5/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LK1/b;->b()V

    :goto_2
    return-void

    :goto_3
    invoke-static {}, LK1/b;->b()V

    throw v0
.end method

.method public final c()Ly1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p;->j:Ly1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/producers/p;->f:Z

    return v0
.end method

.method public final e()Ly1/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p;->e:Ly1/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final g()LB1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p;->c:LB1/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/lang/Runnable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p;->k:Ljava/lang/Runnable;

    return-object v0
.end method

.method public final i()LO0/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p;->l:LO0/o;

    .line 2
    .line 3
    return-object v0
.end method
