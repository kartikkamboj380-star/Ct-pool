.class final Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/common/mapbuffer/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field final synthetic b:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;


# direct methods
.method public constructor <init>(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->b:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->a:I

    return-void
.end method

.method private final g(Lcom/facebook/react/common/mapbuffer/a$b;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->getType()Lcom/facebook/react/common/mapbuffer/a$b;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->getKey()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " for key: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " found "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " instead."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/common/mapbuffer/a$b;->r:Lcom/facebook/react/common/mapbuffer/a$b;

    invoke-direct {p0, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->g(Lcom/facebook/react/common/mapbuffer/a$b;)V

    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->b:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    iget v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->a:I

    add-int/lit8 v1, v1, 0x4

    invoke-static {v0, v1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->m(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()D
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/common/mapbuffer/a$b;->o:Lcom/facebook/react/common/mapbuffer/a$b;

    invoke-direct {p0, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->g(Lcom/facebook/react/common/mapbuffer/a$b;)V

    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->b:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    iget v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->a:I

    add-int/lit8 v1, v1, 0x4

    invoke-static {v0, v1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->i(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)D

    move-result-wide v0

    return-wide v0
.end method

.method public c()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/common/mapbuffer/a$b;->p:Lcom/facebook/react/common/mapbuffer/a$b;

    invoke-direct {p0, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->g(Lcom/facebook/react/common/mapbuffer/a$b;)V

    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->b:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    iget v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->a:I

    add-int/lit8 v1, v1, 0x4

    invoke-static {v0, v1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->o(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/common/mapbuffer/a$b;->n:Lcom/facebook/react/common/mapbuffer/a$b;

    invoke-direct {p0, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->g(Lcom/facebook/react/common/mapbuffer/a$b;)V

    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->b:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    iget v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->a:I

    add-int/lit8 v1, v1, 0x4

    invoke-static {v0, v1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->k(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)I

    move-result v0

    return v0
.end method

.method public e()Lcom/facebook/react/common/mapbuffer/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/common/mapbuffer/a$b;->q:Lcom/facebook/react/common/mapbuffer/a$b;

    invoke-direct {p0, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->g(Lcom/facebook/react/common/mapbuffer/a$b;)V

    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->b:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    iget v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->a:I

    add-int/lit8 v1, v1, 0x4

    invoke-static {v0, v1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->n(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    move-result-object v0

    return-object v0
.end method

.method public f()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/common/mapbuffer/a$b;->m:Lcom/facebook/react/common/mapbuffer/a$b;

    invoke-direct {p0, v0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->g(Lcom/facebook/react/common/mapbuffer/a$b;)V

    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->b:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    iget v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->a:I

    add-int/lit8 v1, v1, 0x4

    invoke-static {v0, v1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->h(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)Z

    move-result v0

    return v0
.end method

.method public getKey()I
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->b:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    iget v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->a:I

    invoke-static {v0, v1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->p(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)S

    move-result v0

    const v1, 0xffff

    and-int/2addr v0, v1

    return v0
.end method

.method public getType()Lcom/facebook/react/common/mapbuffer/a$b;
    .locals 3

    invoke-static {}, Lcom/facebook/react/common/mapbuffer/a$b;->values()[Lcom/facebook/react/common/mapbuffer/a$b;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->b:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    iget v2, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;->a:I

    add-int/lit8 v2, v2, 0x2

    invoke-static {v1, v2}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->p(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)S

    move-result v1

    const v2, 0xffff

    and-int/2addr v1, v2

    aget-object v0, v0, v1

    return-object v0
.end method
