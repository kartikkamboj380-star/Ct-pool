.class Lcom/facebook/imagepipeline/memory/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field final c:Ljava/util/Queue;

.field private final d:Z

.field private e:I


# direct methods
.method public constructor <init>(IIIZ)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-lez p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    invoke-static {v2}, LO0/l;->i(Z)V

    if-ltz p2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    move v2, v0

    :goto_1
    invoke-static {v2}, LO0/l;->i(Z)V

    if-ltz p3, :cond_2

    move v0, v1

    :cond_2
    invoke-static {v0}, LO0/l;->i(Z)V

    iput p1, p0, Lcom/facebook/imagepipeline/memory/b;->a:I

    iput p2, p0, Lcom/facebook/imagepipeline/memory/b;->b:I

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/b;->c:Ljava/util/Queue;

    iput p3, p0, Lcom/facebook/imagepipeline/memory/b;->e:I

    iput-boolean p4, p0, Lcom/facebook/imagepipeline/memory/b;->d:Z

    return-void
.end method


# virtual methods
.method a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/b;->c:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/imagepipeline/memory/b;->e:I

    const/4 v1, 0x1

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LO0/l;->i(Z)V

    iget v0, p0, Lcom/facebook/imagepipeline/memory/b;->e:I

    sub-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/imagepipeline/memory/b;->e:I

    return-void
.end method

.method public c()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/facebook/imagepipeline/memory/b;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/facebook/imagepipeline/memory/b;->e:I

    :cond_0
    return-object v0
.end method

.method d()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/b;->c:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public e()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/imagepipeline/memory/b;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/imagepipeline/memory/b;->e:I

    return-void
.end method

.method public f()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/imagepipeline/memory/b;->e:I

    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/b;->d()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Lcom/facebook/imagepipeline/memory/b;->b:I

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/b;->c:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p0, Lcom/facebook/imagepipeline/memory/b;->d:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/facebook/imagepipeline/memory/b;->e:I

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, LO0/l;->i(Z)V

    iget v0, p0, Lcom/facebook/imagepipeline/memory/b;->e:I

    :goto_1
    sub-int/2addr v0, v1

    iput v0, p0, Lcom/facebook/imagepipeline/memory/b;->e:I

    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/memory/b;->a(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    iget v0, p0, Lcom/facebook/imagepipeline/memory/b;->e:I

    if-lez v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "Tried to release value %s from an empty bucket!"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "BUCKET"

    invoke-static {v1, v0, p1}, LP0/a;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_2
    return-void
.end method
