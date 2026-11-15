.class public Lcom/facebook/imagepipeline/producers/h;
.super Lcom/facebook/imagepipeline/producers/U;
.source "SourceFile"


# instance fields
.field private final f:Lw1/k;


# direct methods
.method public constructor <init>(Lw1/k;Lcom/facebook/imagepipeline/producers/d0;)V
    .locals 2

    .line 1
    const-string v0, "BitmapMemoryCacheKeyMultiplexProducer"

    .line 2
    .line 3
    const-string v1, "multiplex_bmp_cnt"

    .line 4
    .line 5
    invoke-direct {p0, p2, v0, v1}, Lcom/facebook/imagepipeline/producers/U;-><init>(Lcom/facebook/imagepipeline/producers/d0;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/h;->f:Lw1/k;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic g(Ljava/io/Closeable;)Ljava/io/Closeable;
    .locals 0

    .line 1
    check-cast p1, LS0/a;

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/h;->l(LS0/a;)LS0/a;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic j(Lcom/facebook/imagepipeline/producers/e0;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/h;->m(Lcom/facebook/imagepipeline/producers/e0;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public l(LS0/a;)LS0/a;
    .locals 0

    .line 1
    invoke-static {p1}, LS0/a;->e(LS0/a;)LS0/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected m(Lcom/facebook/imagepipeline/producers/e0;)Landroid/util/Pair;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/h;->f:Lw1/k;

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v1

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lw1/k;->a(LJ1/b;Ljava/lang/Object;)LI0/d;

    move-result-object v0

    invoke-interface {p1}, Lcom/facebook/imagepipeline/producers/e0;->U()LJ1/b$c;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method
