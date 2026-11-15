.class Lcom/facebook/imagepipeline/memory/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/memory/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:I


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    if-lt v0, p1, :cond_0

    iget v1, p0, Lcom/facebook/imagepipeline/memory/a$a;->a:I

    if-lez v1, :cond_0

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lcom/facebook/imagepipeline/memory/a$a;->a:I

    sub-int/2addr v0, p1

    iput v0, p0, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v0, p0, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, p0, Lcom/facebook/imagepipeline/memory/a$a;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p1, v0, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "com.facebook.imagepipeline.memory.BasePool.Counter"

    const-string v1, "Unexpected decrement of %d. Current numBytes = %d, count = %d"

    invoke-static {v0, v1, p1}, LP0/a;->M(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public b(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/imagepipeline/memory/a$a;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/facebook/imagepipeline/memory/a$a;->a:I

    iget v0, p0, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/facebook/imagepipeline/memory/a$a;->b:I

    return-void
.end method
