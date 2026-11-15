.class final Ly1/t$f;
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
    iput-object p1, p0, Ly1/t$f;->m:Ly1/t;

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
    .locals 4

    .line 1
    iget-object v0, p0, Ly1/t$f;->m:Ly1/t;

    .line 2
    .line 3
    invoke-static {v0}, Ly1/t;->c(Ly1/t;)Ly1/s;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ly1/s;->i()Lcom/facebook/imagepipeline/producers/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "producerFactory.newDataFetchProducer()"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Ly1/s;->a(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/b;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "newAddImageTransformMeta\u2026taProducer(inputProducer)"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Ly1/t$f;->m:Ly1/t;

    .line 26
    .line 27
    invoke-static {v1}, Ly1/t;->c(Ly1/t;)Ly1/s;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, Ly1/t$f;->m:Ly1/t;

    .line 32
    .line 33
    invoke-static {v2}, Ly1/t;->a(Ly1/t;)LL1/d;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-virtual {v1, v0, v3, v2}, Ly1/s;->D(Lcom/facebook/imagepipeline/producers/d0;ZLL1/d;)Lcom/facebook/imagepipeline/producers/k0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "producerFactory.newResiz\u2026, imageTranscoderFactory)"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Ly1/t$f;->m:Ly1/t;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ly1/t;->E(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly1/t$f;->a()Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
