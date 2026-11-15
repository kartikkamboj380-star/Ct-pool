.class final Ly1/t$m;
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
    iput-object p1, p0, Ly1/t$m;->m:Ly1/t;

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
    iget-object v0, p0, Ly1/t$m;->m:Ly1/t;

    .line 2
    .line 3
    invoke-static {v0}, Ly1/t;->c(Ly1/t;)Ly1/s;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ly1/s;->v()Lcom/facebook/imagepipeline/producers/N;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "producerFactory.newLocalResourceFetchProducer()"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ly1/t$m;->m:Ly1/t;

    .line 17
    .line 18
    invoke-static {v1, v0}, Ly1/t;->f(Ly1/t;Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly1/t$m;->a()Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
