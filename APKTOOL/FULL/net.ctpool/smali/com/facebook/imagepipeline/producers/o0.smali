.class public final Lcom/facebook/imagepipeline/producers/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/o0$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/facebook/imagepipeline/producers/o0$a;


# instance fields
.field private final a:Lcom/facebook/imagepipeline/producers/d0;

.field private final b:Lcom/facebook/imagepipeline/producers/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/imagepipeline/producers/o0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/producers/o0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/imagepipeline/producers/o0;->c:Lcom/facebook/imagepipeline/producers/o0$a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/p0;)V
    .locals 1

    const-string v0, "inputProducer"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadHandoffProducerQueue"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/o0;->a:Lcom/facebook/imagepipeline/producers/d0;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/o0;->b:Lcom/facebook/imagepipeline/producers/p0;

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 5

    .line 1
    const-string v0, "consumer"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LK1/b;->d()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "BackgroundThreadHandoffProducer"

    if-nez v0, :cond_1

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v0

    sget-object v3, Lcom/facebook/imagepipeline/producers/o0;->c:Lcom/facebook/imagepipeline/producers/o0$a;

    invoke-static {v3, p2}, Lcom/facebook/imagepipeline/producers/o0$a;->b(Lcom/facebook/imagepipeline/producers/o0$a;Lcom/facebook/imagepipeline/producers/e0;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v0, p2, v2}, Lcom/facebook/imagepipeline/producers/g0;->e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    invoke-interface {v0, p2, v2, v1}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/o0;->a:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void

    :cond_0
    new-instance v1, Lcom/facebook/imagepipeline/producers/o0$c;

    invoke-direct {v1, p1, v0, p2, p0}, Lcom/facebook/imagepipeline/producers/o0$c;-><init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Lcom/facebook/imagepipeline/producers/o0;)V

    new-instance p1, Lcom/facebook/imagepipeline/producers/o0$b;

    invoke-direct {p1, v1, p0}, Lcom/facebook/imagepipeline/producers/o0$b;-><init>(Lcom/facebook/imagepipeline/producers/m0;Lcom/facebook/imagepipeline/producers/o0;)V

    invoke-interface {p2, p1}, Lcom/facebook/imagepipeline/producers/e0;->e(Lcom/facebook/imagepipeline/producers/f0;)V

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/o0;->b:Lcom/facebook/imagepipeline/producers/p0;

    invoke-static {v3, p2}, Lcom/facebook/imagepipeline/producers/o0$a;->a(Lcom/facebook/imagepipeline/producers/o0$a;Lcom/facebook/imagepipeline/producers/e0;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, LE1/a;->a(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/facebook/imagepipeline/producers/p0;->b(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    const-string v0, "ThreadHandoffProducer#produceResults"

    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    :try_start_0
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v0

    sget-object v3, Lcom/facebook/imagepipeline/producers/o0;->c:Lcom/facebook/imagepipeline/producers/o0$a;

    invoke-static {v3, p2}, Lcom/facebook/imagepipeline/producers/o0$a;->b(Lcom/facebook/imagepipeline/producers/o0$a;Lcom/facebook/imagepipeline/producers/e0;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0, p2, v2}, Lcom/facebook/imagepipeline/producers/g0;->e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    invoke-interface {v0, p2, v2, v1}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/o0;->a:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LK1/b;->b()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    :try_start_1
    new-instance v1, Lcom/facebook/imagepipeline/producers/o0$c;

    invoke-direct {v1, p1, v0, p2, p0}, Lcom/facebook/imagepipeline/producers/o0$c;-><init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Lcom/facebook/imagepipeline/producers/o0;)V

    new-instance p1, Lcom/facebook/imagepipeline/producers/o0$b;

    invoke-direct {p1, v1, p0}, Lcom/facebook/imagepipeline/producers/o0$b;-><init>(Lcom/facebook/imagepipeline/producers/m0;Lcom/facebook/imagepipeline/producers/o0;)V

    invoke-interface {p2, p1}, Lcom/facebook/imagepipeline/producers/e0;->e(Lcom/facebook/imagepipeline/producers/f0;)V

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/o0;->b:Lcom/facebook/imagepipeline/producers/p0;

    invoke-static {v3, p2}, Lcom/facebook/imagepipeline/producers/o0$a;->a(Lcom/facebook/imagepipeline/producers/o0$a;Lcom/facebook/imagepipeline/producers/e0;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, LE1/a;->a(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/facebook/imagepipeline/producers/p0;->b(Ljava/lang/Runnable;)V

    sget-object p1, Li5/u;->a:Li5/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {}, LK1/b;->b()V

    :goto_0
    return-void

    :goto_1
    invoke-static {}, LK1/b;->b()V

    throw p1
.end method

.method public final c()Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/o0;->a:Lcom/facebook/imagepipeline/producers/d0;

    return-object v0
.end method

.method public final d()Lcom/facebook/imagepipeline/producers/p0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/o0;->b:Lcom/facebook/imagepipeline/producers/p0;

    return-object v0
.end method
