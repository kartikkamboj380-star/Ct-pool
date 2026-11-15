.class public Lcom/facebook/imagepipeline/producers/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Landroid/content/ContentResolver;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/S;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/S;->b:Landroid/content/ContentResolver;

    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/S;)Landroid/content/ContentResolver;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/S;->b:Landroid/content/ContentResolver;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/facebook/imagepipeline/producers/S;LJ1/b;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/S;->e(LJ1/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private e(LJ1/b;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, LJ1/b;->u()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/S;->b:Landroid/content/ContentResolver;

    .line 6
    .line 7
    invoke-static {v0, p1}, LW0/f;->e(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 11

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v6

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v8

    const-string v0, "local"

    const-string v1, "thumbnail_bitmap"

    invoke-interface {p2, v0, v1}, Lcom/facebook/imagepipeline/producers/e0;->g(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v9, Landroid/os/CancellationSignal;

    invoke-direct {v9}, Landroid/os/CancellationSignal;-><init>()V

    new-instance v10, Lcom/facebook/imagepipeline/producers/S$a;

    const-string v5, "LocalThumbnailBitmapSdk29Producer"

    move-object v0, v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, v6

    move-object v4, p2

    move-object v7, p2

    invoke-direct/range {v0 .. v9}, Lcom/facebook/imagepipeline/producers/S$a;-><init>(Lcom/facebook/imagepipeline/producers/S;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;LJ1/b;Landroid/os/CancellationSignal;)V

    new-instance p1, Lcom/facebook/imagepipeline/producers/S$b;

    invoke-direct {p1, p0, v10}, Lcom/facebook/imagepipeline/producers/S$b;-><init>(Lcom/facebook/imagepipeline/producers/S;Lcom/facebook/imagepipeline/producers/m0;)V

    invoke-interface {p2, p1}, Lcom/facebook/imagepipeline/producers/e0;->e(Lcom/facebook/imagepipeline/producers/f0;)V

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/S;->a:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v10}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
