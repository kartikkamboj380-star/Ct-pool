.class public Lcom/facebook/imagepipeline/producers/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/b0$b;,
        Lcom/facebook/imagepipeline/producers/b0$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/imagepipeline/producers/d0;

.field private final b:Lv1/b;

.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/d0;Lv1/b;Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lcom/facebook/imagepipeline/producers/d0;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/b0;->a:Lcom/facebook/imagepipeline/producers/d0;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/b0;->b:Lv1/b;

    .line 13
    .line 14
    invoke-static {p3}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/b0;->c:Ljava/util/concurrent/Executor;

    .line 21
    .line 22
    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/b0;)Lv1/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/b0;->b:Lv1/b;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/facebook/imagepipeline/producers/b0;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/b0;->c:Ljava/util/concurrent/Executor;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 7

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v3

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v0

    invoke-virtual {v0}, LJ1/b;->k()LJ1/d;

    move-result-object v4

    invoke-static {v4}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lcom/facebook/imagepipeline/producers/b0$a;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/facebook/imagepipeline/producers/b0$a;-><init>(Lcom/facebook/imagepipeline/producers/b0;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;LJ1/d;Lcom/facebook/imagepipeline/producers/e0;)V

    new-instance p1, Lcom/facebook/imagepipeline/producers/b0$b;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v6, v0}, Lcom/facebook/imagepipeline/producers/b0$b;-><init>(Lcom/facebook/imagepipeline/producers/b0;Lcom/facebook/imagepipeline/producers/b0$a;Lcom/facebook/imagepipeline/producers/c0;)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/b0;->a:Lcom/facebook/imagepipeline/producers/d0;

    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/d0;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-void
.end method
