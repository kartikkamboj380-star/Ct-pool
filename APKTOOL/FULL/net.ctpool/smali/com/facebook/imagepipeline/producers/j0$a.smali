.class final Lcom/facebook/imagepipeline/producers/j0$a;
.super Lcom/facebook/imagepipeline/producers/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field final synthetic c:Lcom/facebook/imagepipeline/producers/j0;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/j0;Lcom/facebook/imagepipeline/producers/n;)V
    .locals 1

    const-string v0, "consumer"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/j0$a;->c:Lcom/facebook/imagepipeline/producers/j0;

    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/t;-><init>(Lcom/facebook/imagepipeline/producers/n;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, LD1/g;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/j0$a;->q(LD1/g;I)V

    return-void
.end method

.method protected q(LD1/g;I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1}, LD1/g;->j0(LD1/g;)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, LD1/g;->f()LS0/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-interface {p1, v0, p2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, LS0/a;->g(LS0/a;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :goto_1
    invoke-static {v0}, LS0/a;->g(LS0/a;)V

    .line 29
    .line 30
    .line 31
    throw p1
.end method
