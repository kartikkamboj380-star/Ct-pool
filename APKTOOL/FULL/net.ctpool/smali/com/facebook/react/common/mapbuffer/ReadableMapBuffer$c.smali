.class public final Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Lx5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private m:I

.field private final n:I

.field final synthetic o:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;


# direct methods
.method constructor <init>(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$c;->o:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->getCount()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$c;->n:I

    return-void
.end method


# virtual methods
.method public d()Lcom/facebook/react/common/mapbuffer/a$c;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;

    iget-object v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$c;->o:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    iget v2, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$c;->m:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$c;->m:I

    invoke-static {v1, v2}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;->f(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)I

    move-result v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$b;-><init>(Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;I)V

    return-object v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$c;->m:I

    iget v1, p0, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$c;->n:I

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer$c;->d()Lcom/facebook/react/common/mapbuffer/a$c;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
