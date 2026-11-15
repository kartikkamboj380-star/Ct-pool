.class public abstract Lcom/facebook/imagepipeline/memory/e;
.super Lcom/facebook/imagepipeline/memory/a;
.source "SourceFile"


# instance fields
.field private final k:[I


# direct methods
.method constructor <init>(LR0/d;LG1/G;LG1/H;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/memory/a;-><init>(LR0/d;LG1/G;LG1/H;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p2, LG1/G;->c:Landroid/util/SparseIntArray;

    .line 5
    .line 6
    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Landroid/util/SparseIntArray;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/util/SparseIntArray;->size()I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    new-array p2, p2, [I

    .line 17
    .line 18
    iput-object p2, p0, Lcom/facebook/imagepipeline/memory/e;->k:[I

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    :goto_0
    iget-object p3, p0, Lcom/facebook/imagepipeline/memory/e;->k:[I

    .line 22
    .line 23
    array-length v0, p3

    .line 24
    if-ge p2, v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    aput v0, p3, p2

    .line 31
    .line 32
    add-int/lit8 p2, p2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/a;->r()V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method protected A(LG1/w;)I
    .locals 0

    .line 1
    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, LG1/w;->n()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method B()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/e;->k:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method protected C(LG1/w;)Z
    .locals 0

    .line 1
    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, LG1/w;->isClosed()Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    xor-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    return p1
.end method

.method protected bridge synthetic j(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LG1/w;

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/e;->z(LG1/w;)V

    return-void
.end method

.method protected m(I)I
    .locals 4

    .line 1
    if-lez p1, :cond_2

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/e;->k:[I

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget v3, v0, v2

    if-lt v3, p1, :cond_0

    return v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return p1

    :cond_2
    new-instance v0, Lcom/facebook/imagepipeline/memory/a$b;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/facebook/imagepipeline/memory/a$b;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method protected bridge synthetic n(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LG1/w;

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/e;->A(LG1/w;)I

    move-result p1

    return p1
.end method

.method protected o(I)I
    .locals 0

    .line 1
    return p1
.end method

.method protected bridge synthetic t(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, LG1/w;

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/e;->C(LG1/w;)Z

    move-result p1

    return p1
.end method

.method protected z(LG1/w;)V
    .locals 0

    .line 1
    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, LG1/w;->close()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
