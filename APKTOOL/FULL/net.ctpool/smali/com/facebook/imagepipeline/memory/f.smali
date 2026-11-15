.class public final Lcom/facebook/imagepipeline/memory/f;
.super LR0/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/memory/f$a;
    }
.end annotation


# instance fields
.field private final m:Lcom/facebook/imagepipeline/memory/e;

.field private n:LS0/a;

.field private o:I


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/memory/e;I)V
    .locals 1

    .line 1
    const-string v0, "pool"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LR0/k;-><init>()V

    if-lez p2, :cond_0

    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/f;->m:Lcom/facebook/imagepipeline/memory/e;

    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/imagepipeline/memory/f;->o:I

    invoke-virtual {p1, p2}, Lcom/facebook/imagepipeline/memory/a;->get(I)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p1}, LS0/a;->W(Ljava/lang/Object;LS0/g;)LS0/a;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/f;->n:LS0/a;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Check failed."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Lcom/facebook/imagepipeline/memory/e;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Lcom/facebook/imagepipeline/memory/e;->B()I

    move-result p2

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/imagepipeline/memory/f;-><init>(Lcom/facebook/imagepipeline/memory/e;I)V

    return-void
.end method

.method private final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/f;->n:LS0/a;

    invoke-static {v0}, LS0/a;->B(LS0/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/imagepipeline/memory/f$a;

    invoke-direct {v0}, Lcom/facebook/imagepipeline/memory/f$a;-><init>()V

    throw v0
.end method


# virtual methods
.method public bridge synthetic a()LR0/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/memory/f;->e()LG1/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/f;->n:LS0/a;

    invoke-static {v0}, LS0/a;->g(LS0/a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/imagepipeline/memory/f;->n:LS0/a;

    const/4 v0, -0x1

    iput v0, p0, Lcom/facebook/imagepipeline/memory/f;->o:I

    invoke-super {p0}, LR0/k;->close()V

    return-void
.end method

.method public final d(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/memory/f;->b()V

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/f;->n:LS0/a;

    const-string v1, "Required value was null."

    if-eqz v0, :cond_2

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LS0/a;->j()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG1/w;

    invoke-interface {v0}, LG1/w;->n()I

    move-result v0

    if-gt p1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/f;->m:Lcom/facebook/imagepipeline/memory/e;

    invoke-virtual {v0, p1}, Lcom/facebook/imagepipeline/memory/a;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.pool[newLength]"

    invoke-static {p1, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LG1/w;

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/f;->n:LS0/a;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LS0/a;->j()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG1/w;

    iget v1, p0, Lcom/facebook/imagepipeline/memory/f;->o:I

    const/4 v2, 0x0

    invoke-interface {v0, v2, p1, v2, v1}, LG1/w;->w(ILG1/w;II)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/f;->n:LS0/a;

    invoke-static {v0}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, LS0/a;->close()V

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/f;->m:Lcom/facebook/imagepipeline/memory/e;

    invoke-static {p1, v0}, LS0/a;->W(Ljava/lang/Object;LS0/g;)LS0/a;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/imagepipeline/memory/f;->n:LS0/a;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e()LG1/y;
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/facebook/imagepipeline/memory/f;->b()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LG1/y;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/imagepipeline/memory/f;->n:LS0/a;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget v2, p0, Lcom/facebook/imagepipeline/memory/f;->o:I

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, LG1/y;-><init>(LS0/a;I)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v1, "Required value was null."

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/facebook/imagepipeline/memory/f;->o:I

    return v0
.end method

.method public write(I)V
    .locals 2

    .line 1
    int-to-byte p1, p1

    const/4 v0, 0x1

    new-array v0, v0, [B

    const/4 v1, 0x0

    aput-byte p1, v0, v1

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public write([BII)V
    .locals 3

    .line 2
    const-string v0, "buffer"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p2, :cond_1

    if-ltz p3, :cond_1

    add-int v0, p2, p3

    array-length v1, p1

    if-gt v0, v1, :cond_1

    invoke-direct {p0}, Lcom/facebook/imagepipeline/memory/f;->b()V

    iget v0, p0, Lcom/facebook/imagepipeline/memory/f;->o:I

    add-int/2addr v0, p3

    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/memory/f;->d(I)V

    iget-object v0, p0, Lcom/facebook/imagepipeline/memory/f;->n:LS0/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LS0/a;->j()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LG1/w;

    iget v1, p0, Lcom/facebook/imagepipeline/memory/f;->o:I

    invoke-interface {v0, v1, p1, p2, p3}, LG1/w;->z(I[BII)I

    iget p1, p0, Lcom/facebook/imagepipeline/memory/f;->o:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/facebook/imagepipeline/memory/f;->o:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    array-length p1, p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "length="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; regionStart="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; regionLength="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
