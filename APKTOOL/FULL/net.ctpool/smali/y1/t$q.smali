.class final Ly1/t$q;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly1/t;-><init>(Landroid/content/ContentResolver;Ly1/s;Lcom/facebook/imagepipeline/producers/X;ZZLcom/facebook/imagepipeline/producers/p0;Ly1/e;ZZZLL1/d;ZZZLjava/util/Set;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic m:Ly1/t;


# direct methods
.method constructor <init>(Ly1/t;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly1/t$q;->m:Ly1/t;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a()Lcom/facebook/imagepipeline/producers/d0;
    .locals 2

    .line 1
    sget-object v0, LK1/b;->a:LK1/b;

    .line 2
    .line 3
    iget-object v0, p0, Ly1/t$q;->m:Ly1/t;

    .line 4
    .line 5
    invoke-static {}, LK1/b;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ly1/t;->n()Lcom/facebook/imagepipeline/producers/d0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ly1/t;->E(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string v1, "ProducerSequenceFactory#getNetworkFetchSequence:init"

    .line 21
    .line 22
    invoke-static {v1}, LK1/b;->a(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :try_start_0
    invoke-virtual {v0}, Ly1/t;->n()Lcom/facebook/imagepipeline/producers/d0;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ly1/t;->E(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 30
    .line 31
    .line 32
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    invoke-static {}, LK1/b;->b()V

    .line 34
    .line 35
    .line 36
    :goto_0
    return-object v0

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    invoke-static {}, LK1/b;->b()V

    .line 39
    .line 40
    .line 41
    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly1/t$q;->a()Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
