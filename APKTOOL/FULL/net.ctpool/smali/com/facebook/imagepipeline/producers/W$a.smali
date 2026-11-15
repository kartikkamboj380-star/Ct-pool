.class Lcom/facebook/imagepipeline/producers/W$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/X$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/W;->a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/imagepipeline/producers/C;

.field final synthetic b:Lcom/facebook/imagepipeline/producers/W;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/W;Lcom/facebook/imagepipeline/producers/C;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/W$a;->b:Lcom/facebook/imagepipeline/producers/W;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/W$a;->a:Lcom/facebook/imagepipeline/producers/C;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/W$a;->b:Lcom/facebook/imagepipeline/producers/W;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/W$a;->a:Lcom/facebook/imagepipeline/producers/C;

    invoke-static {v0, v1, p1}, Lcom/facebook/imagepipeline/producers/W;->d(Lcom/facebook/imagepipeline/producers/W;Lcom/facebook/imagepipeline/producers/C;Ljava/lang/Throwable;)V

    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/W$a;->b:Lcom/facebook/imagepipeline/producers/W;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/W$a;->a:Lcom/facebook/imagepipeline/producers/C;

    invoke-static {v0, v1}, Lcom/facebook/imagepipeline/producers/W;->c(Lcom/facebook/imagepipeline/producers/W;Lcom/facebook/imagepipeline/producers/C;)V

    return-void
.end method

.method public c(Ljava/io/InputStream;I)V
    .locals 2

    .line 1
    invoke-static {}, LK1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "NetworkFetcher->onResponse"

    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/W$a;->b:Lcom/facebook/imagepipeline/producers/W;

    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/W$a;->a:Lcom/facebook/imagepipeline/producers/C;

    invoke-virtual {v0, v1, p1, p2}, Lcom/facebook/imagepipeline/producers/W;->m(Lcom/facebook/imagepipeline/producers/C;Ljava/io/InputStream;I)V

    invoke-static {}, LK1/b;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LK1/b;->b()V

    :cond_1
    return-void
.end method
