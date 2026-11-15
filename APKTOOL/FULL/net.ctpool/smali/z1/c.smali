.class public Lz1/c;
.super Lz1/a;
.source "SourceFile"


# direct methods
.method private constructor <init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LF1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lz1/a;-><init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LF1/d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static H(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LF1/d;)LY0/c;
    .locals 1

    .line 1
    invoke-static {}, LK1/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "CloseableProducerToDataSourceAdapter#create"

    .line 8
    .line 9
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v0, Lz1/c;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1, p2}, Lz1/c;-><init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;LF1/d;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, LK1/b;->d()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-static {}, LK1/b;->b()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-object v0
.end method


# virtual methods
.method protected bridge synthetic F(Ljava/lang/Object;ILcom/facebook/imagepipeline/producers/e0;)V
    .locals 0

    .line 1
    check-cast p1, LS0/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lz1/c;->J(LS0/a;ILcom/facebook/imagepipeline/producers/e0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected G(LS0/a;)V
    .locals 0

    .line 1
    invoke-static {p1}, LS0/a;->g(LS0/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public I()LS0/a;
    .locals 1

    .line 1
    invoke-super {p0}, LY0/a;->g()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LS0/a;

    .line 6
    .line 7
    invoke-static {v0}, LS0/a;->e(LS0/a;)LS0/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method protected J(LS0/a;ILcom/facebook/imagepipeline/producers/e0;)V
    .locals 0

    .line 1
    invoke-static {p1}, LS0/a;->e(LS0/a;)LS0/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-super {p0, p1, p2, p3}, Lz1/a;->F(Ljava/lang/Object;ILcom/facebook/imagepipeline/producers/e0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public bridge synthetic g()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lz1/c;->I()LS0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected bridge synthetic h(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LS0/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lz1/c;->G(LS0/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
