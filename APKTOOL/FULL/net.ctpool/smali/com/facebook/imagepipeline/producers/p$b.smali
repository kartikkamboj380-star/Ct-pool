.class final Lcom/facebook/imagepipeline/producers/p$b;
.super Lcom/facebook/imagepipeline/producers/p$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic k:Lcom/facebook/imagepipeline/producers/p;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/p;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;ZI)V
    .locals 1

    const-string v0, "consumer"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "producerContext"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/p$b;->k:Lcom/facebook/imagepipeline/producers/p;

    invoke-direct/range {p0 .. p5}, Lcom/facebook/imagepipeline/producers/p$d;-><init>(Lcom/facebook/imagepipeline/producers/p;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;ZI)V

    return-void
.end method


# virtual methods
.method protected declared-synchronized J(LD1/g;I)Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->f(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-super {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/p$d;->J(LD1/g;I)Z

    .line 11
    .line 12
    .line 13
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    :goto_0
    monitor-exit p0

    .line 15
    return p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit p0

    .line 18
    throw p1
.end method

.method protected x(LD1/g;)I
    .locals 1

    .line 1
    const-string v0, "encodedImage"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LD1/g;->B()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method protected z()LD1/l;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, v0, v0}, LD1/k;->d(IZZ)LD1/l;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const-string v1, "of(0, false, false)"

    .line 7
    .line 8
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
