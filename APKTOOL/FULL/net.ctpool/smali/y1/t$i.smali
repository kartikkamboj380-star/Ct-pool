.class final Ly1/t$i;
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
    iput-object p1, p0, Ly1/t$i;->m:Ly1/t;

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
    .locals 5

    .line 1
    iget-object v0, p0, Ly1/t$i;->m:Ly1/t;

    .line 2
    .line 3
    invoke-static {v0}, Ly1/t;->c(Ly1/t;)Ly1/s;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ly1/s;->r()Lcom/facebook/imagepipeline/producers/I;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "producerFactory.newLocalContentUriFetchProducer()"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ly1/t$i;->m:Ly1/t;

    .line 17
    .line 18
    invoke-static {v1}, Ly1/t;->c(Ly1/t;)Ly1/s;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ly1/s;->s()Lcom/facebook/imagepipeline/producers/J;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "producerFactory.newLocal\u2026iThumbnailFetchProducer()"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Ly1/t$i;->m:Ly1/t;

    .line 32
    .line 33
    invoke-static {v2}, Ly1/t;->c(Ly1/t;)Ly1/s;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ly1/s;->t()Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const-string v3, "producerFactory.newLocalExifThumbnailProducer()"

    .line 42
    .line 43
    invoke-static {v2, v3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v3, 0x2

    .line 47
    new-array v3, v3, [Lcom/facebook/imagepipeline/producers/u0;

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    aput-object v1, v3, v4

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    aput-object v2, v3, v1

    .line 54
    .line 55
    iget-object v1, p0, Ly1/t$i;->m:Ly1/t;

    .line 56
    .line 57
    invoke-static {v1, v0, v3}, Ly1/t;->g(Ly1/t;Lcom/facebook/imagepipeline/producers/d0;[Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/d0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly1/t$i;->a()Lcom/facebook/imagepipeline/producers/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
