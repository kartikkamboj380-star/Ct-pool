.class public Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/u0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer$Api24Utils;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:LR0/i;

.field private final c:Landroid/content/ContentResolver;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;LR0/i;Landroid/content/ContentResolver;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;->b:LR0/i;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;->c:Landroid/content/ContentResolver;

    .line 9
    .line 10
    return-void
.end method

.method static bridge synthetic c(Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;)LR0/i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;->b:LR0/i;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;LR0/h;Landroid/media/ExifInterface;)LD1/g;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;->e(LR0/h;Landroid/media/ExifInterface;)LD1/g;

    move-result-object p0

    return-object p0
.end method

.method private e(LR0/h;Landroid/media/ExifInterface;)LD1/g;
    .locals 3

    .line 1
    new-instance v0, LR0/j;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LR0/j;-><init>(LR0/h;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, LN1/b;->b(Ljava/io/InputStream;)Landroid/util/Pair;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;->h(Landroid/media/ExifInterface;)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v1, -0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v2, v1

    .line 27
    :goto_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    :cond_1
    invoke-static {p1}, LS0/a;->J(Ljava/io/Closeable;)LS0/a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :try_start_0
    new-instance v0, LD1/g;

    .line 42
    .line 43
    invoke-direct {v0, p1}, LD1/g;-><init>(LS0/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, LS0/a;->g(LS0/a;)V

    .line 47
    .line 48
    .line 49
    sget-object p1, Ls1/b;->b:Ls1/c;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, LD1/g;->b1(Ls1/c;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p2}, LD1/g;->f1(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v2}, LD1/g;->j1(I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, LD1/g;->S0(I)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :catchall_0
    move-exception p2

    .line 65
    invoke-static {p1}, LS0/a;->g(LS0/a;)V

    .line 66
    .line 67
    .line 68
    throw p2
.end method

.method private h(Landroid/media/ExifInterface;)I
    .locals 1

    .line 1
    const-string v0, "Orientation"

    invoke-virtual {p1, v0}, Landroid/media/ExifInterface;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, LN1/g;->a(I)I

    move-result p1

    return p1
.end method


# virtual methods
.method public a(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 8

    .line 1
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    move-result-object v3

    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    move-result-object v6

    const-string v0, "local"

    const-string v1, "exif"

    invoke-interface {p2, v0, v1}, Lcom/facebook/imagepipeline/producers/e0;->g(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v7, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer$a;

    const-string v5, "LocalExifThumbnailProducer"

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer$a;-><init>(Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;LJ1/b;)V

    new-instance p1, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer$b;

    invoke-direct {p1, p0, v7}, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer$b;-><init>(Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;Lcom/facebook/imagepipeline/producers/m0;)V

    invoke-interface {p2, p1}, Lcom/facebook/imagepipeline/producers/e0;->e(Lcom/facebook/imagepipeline/producers/f0;)V

    iget-object p1, p0, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;->a:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lx1/f;)Z
    .locals 1

    .line 1
    const/16 v0, 0x200

    .line 2
    .line 3
    invoke-static {v0, v0, p1}, Lcom/facebook/imagepipeline/producers/v0;->b(IILx1/f;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method f(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->canRead()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method g(Landroid/net/Uri;)Landroid/media/ExifInterface;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;->c:Landroid/content/ContentResolver;

    invoke-static {v0, p1}, LW0/f;->e(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;->f(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance p1, Landroid/media/ExifInterface;

    invoke-direct {p1, v0}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;->c:Landroid/content/ContentResolver;

    invoke-static {v0, p1}, LW0/f;->a(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/content/res/AssetFileDescriptor;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v0, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer$Api24Utils;

    invoke-direct {v0, p0, v1}, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer$Api24Utils;-><init>(Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;Lcom/facebook/imagepipeline/producers/K;)V

    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer$Api24Utils;->a(Ljava/io/FileDescriptor;)Landroid/media/ExifInterface;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/StackOverflowError; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-class p1, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;

    const-string v0, "StackOverflowError in ExifInterface constructor"

    invoke-static {p1, v0}, LP0/a;->f(Ljava/lang/Class;Ljava/lang/String;)V

    :catch_1
    :cond_2
    return-object v1
.end method
