.class public Lcom/facebook/imagepipeline/producers/T;
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

    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/T;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/T;->b:Landroid/content/ContentResolver;

    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/T;)Landroid/content/ContentResolver;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/T;->b:Landroid/content/ContentResolver;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/facebook/imagepipeline/producers/T;LJ1/b;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/T;->i(LJ1/b;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic e(LJ1/b;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/imagepipeline/producers/T;->g(LJ1/b;)I

    move-result p0

    return p0
.end method

.method static bridge synthetic f(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/imagepipeline/producers/T;->h(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private static g(LJ1/b;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ1/b;->m()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x60

    .line 6
    .line 7
    if-gt v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, LJ1/b;->l()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-le p0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x3

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method private static h(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "r"

    invoke-virtual {p0, p1, v0}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object p0

    invoke-static {p0}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Landroid/media/MediaMetadataRetriever;

    invoke-direct {p1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;)V

    const-wide/16 v0, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(J)Landroid/graphics/Bitmap;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private i(LJ1/b;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, LJ1/b;->u()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/T;->b:Landroid/content/ContentResolver;

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
    .locals 10

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v6

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v8

    const-string v0, "local"

    const-string v1, "video"

    invoke-interface {p2, v0, v1}, Lcom/facebook/imagepipeline/producers/e0;->g(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v9, Lcom/facebook/imagepipeline/producers/T$a;

    const-string v5, "VideoThumbnailProducer"

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, v6

    move-object v4, p2

    move-object v7, p2

    invoke-direct/range {v0 .. v8}, Lcom/facebook/imagepipeline/producers/T$a;-><init>(Lcom/facebook/imagepipeline/producers/T;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;LJ1/b;)V

    new-instance p1, Lcom/facebook/imagepipeline/producers/T$b;

    invoke-direct {p1, p0, v9}, Lcom/facebook/imagepipeline/producers/T$b;-><init>(Lcom/facebook/imagepipeline/producers/T;Lcom/facebook/imagepipeline/producers/m0;)V

    invoke-interface {p2, p1}, Lcom/facebook/imagepipeline/producers/e0;->e(Lcom/facebook/imagepipeline/producers/f0;)V

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/T;->a:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
