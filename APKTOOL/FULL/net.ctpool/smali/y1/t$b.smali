.class final Ly1/t$b;
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
    iput-object p1, p0, Ly1/t$b;->m:Ly1/t;

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
    .locals 3

    .line 1
    sget-object v0, LK1/b;->a:LK1/b;

    .line 2
    .line 3
    iget-object v0, p0, Ly1/t$b;->m:Ly1/t;

    .line 4
    .line 5
    invoke-static {}, LK1/b;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, "producerFactory.newLocalContentUriFetchProducer()"

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Ly1/t;->c(Ly1/t;)Ly1/s;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ly1/s;->r()Lcom/facebook/imagepipeline/producers/I;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Ly1/t;->h(Ly1/t;Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0}, Ly1/t;->c(Ly1/t;)Ly1/s;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v0}, Ly1/t;->d(Ly1/t;)Lcom/facebook/imagepipeline/producers/p0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v2, v1, v0}, Ly1/s;->b(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string v1, "ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init"

    .line 42
    .line 43
    invoke-static {v1}, LK1/b;->a(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :try_start_0
    invoke-static {v0}, Ly1/t;->c(Ly1/t;)Ly1/s;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Ly1/s;->r()Lcom/facebook/imagepipeline/producers/I;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, Ly1/t;->h(Ly1/t;Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v0}, Ly1/t;->c(Ly1/t;)Ly1/s;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v0}, Ly1/t;->d(Ly1/t;)Lcom/facebook/imagepipeline/producers/p0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v2, v1, v0}, Ly1/s;->b(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 70
    .line 71
    .line 72
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    invoke-static {}, LK1/b;->b()V

    .line 74
    .line 75
    .line 76
    :goto_0
    return-object v0

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    invoke-static {}, LK1/b;->b()V

    .line 79
    .line 80
    .line 81
    throw v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly1/t$b;->a()Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
