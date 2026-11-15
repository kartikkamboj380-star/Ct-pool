.class Lcom/facebook/imagepipeline/producers/D$b;
.super Lcom/facebook/imagepipeline/producers/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/D;->i(Lcom/facebook/imagepipeline/producers/D$c;Lcom/facebook/imagepipeline/producers/X$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/Future;

.field final synthetic b:Lcom/facebook/imagepipeline/producers/X$a;

.field final synthetic c:Lcom/facebook/imagepipeline/producers/D;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/D;Ljava/util/concurrent/Future;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/D$b;->c:Lcom/facebook/imagepipeline/producers/D;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/D$b;->a:Ljava/util/concurrent/Future;

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/D$b;->b:Lcom/facebook/imagepipeline/producers/X$a;

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/D$b;->a:Ljava/util/concurrent/Future;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/D$b;->b:Lcom/facebook/imagepipeline/producers/X$a;

    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/X$a;->b()V

    :cond_0
    return-void
.end method
