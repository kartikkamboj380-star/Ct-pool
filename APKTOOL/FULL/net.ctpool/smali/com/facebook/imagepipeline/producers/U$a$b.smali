.class Lcom/facebook/imagepipeline/producers/U$a$b;
.super Lcom/facebook/imagepipeline/producers/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/U$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic b:Lcom/facebook/imagepipeline/producers/U$a;


# direct methods
.method private constructor <init>(Lcom/facebook/imagepipeline/producers/U$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/U$a$b;->b:Lcom/facebook/imagepipeline/producers/U$a;

    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/c;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/imagepipeline/producers/U$a;Lcom/facebook/imagepipeline/producers/V;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/U$a$b;-><init>(Lcom/facebook/imagepipeline/producers/U$a;)V

    return-void
.end method


# virtual methods
.method protected g()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, LK1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MultiplexProducer#onCancellation"

    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a$b;->b:Lcom/facebook/imagepipeline/producers/U$a;

    invoke-virtual {v0, p0}, Lcom/facebook/imagepipeline/producers/U$a;->m(Lcom/facebook/imagepipeline/producers/U$a$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LK1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LK1/b;->b()V

    :cond_1
    return-void

    :goto_1
    invoke-static {}, LK1/b;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, LK1/b;->b()V

    :cond_2
    throw v0
.end method

.method protected h(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, LK1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MultiplexProducer#onFailure"

    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a$b;->b:Lcom/facebook/imagepipeline/producers/U$a;

    invoke-virtual {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/U$a;->n(Lcom/facebook/imagepipeline/producers/U$a$b;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LK1/b;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LK1/b;->b()V

    :cond_1
    return-void

    :goto_1
    invoke-static {}, LK1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LK1/b;->b()V

    :cond_2
    throw p1
.end method

.method protected bridge synthetic i(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, Ljava/io/Closeable;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/U$a$b;->p(Ljava/io/Closeable;I)V

    return-void
.end method

.method protected j(F)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, LK1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MultiplexProducer#onProgressUpdate"

    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a$b;->b:Lcom/facebook/imagepipeline/producers/U$a;

    invoke-virtual {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/U$a;->p(Lcom/facebook/imagepipeline/producers/U$a$b;F)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LK1/b;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LK1/b;->b()V

    :cond_1
    return-void

    :goto_1
    invoke-static {}, LK1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LK1/b;->b()V

    :cond_2
    throw p1
.end method

.method protected p(Ljava/io/Closeable;I)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, LK1/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "MultiplexProducer#onNewResult"

    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/U$a$b;->b:Lcom/facebook/imagepipeline/producers/U$a;

    invoke-virtual {v0, p0, p1, p2}, Lcom/facebook/imagepipeline/producers/U$a;->o(Lcom/facebook/imagepipeline/producers/U$a$b;Ljava/io/Closeable;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LK1/b;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LK1/b;->b()V

    :cond_1
    return-void

    :goto_1
    invoke-static {}, LK1/b;->d()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, LK1/b;->b()V

    :cond_2
    throw p1
.end method
