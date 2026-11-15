.class public Lcom/facebook/soloader/a;
.super Lcom/facebook/soloader/A;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/soloader/s;


# instance fields
.field private final a:I

.field private b:Lcom/facebook/soloader/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/soloader/A;-><init>()V

    iput p2, p0, Lcom/facebook/soloader/a;->a:I

    new-instance v0, Lcom/facebook/soloader/e;

    invoke-static {p1}, Lcom/facebook/soloader/a;->f(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lcom/facebook/soloader/e;-><init>(Ljava/io/File;I)V

    iput-object v0, p0, Lcom/facebook/soloader/a;->b:Lcom/facebook/soloader/e;

    return-void
.end method

.method private static f(Landroid/content/Context;)Ljava/io/File;
    .locals 1

    .line 1
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroid/content/Context;)Lcom/facebook/soloader/A;
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/soloader/e;

    invoke-static {p1}, Lcom/facebook/soloader/a;->f(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    iget v1, p0, Lcom/facebook/soloader/a;->a:I

    or-int/lit8 v1, v1, 0x1

    invoke-direct {v0, p1, v1}, Lcom/facebook/soloader/e;-><init>(Ljava/io/File;I)V

    iput-object v0, p0, Lcom/facebook/soloader/a;->b:Lcom/facebook/soloader/e;

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ApplicationSoSource"

    return-object v0
.end method

.method public d(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/a;->b:Lcom/facebook/soloader/e;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/soloader/e;->d(Ljava/lang/String;ILandroid/os/StrictMode$ThreadPolicy;)I

    move-result p1

    return p1
.end method

.method protected e(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/a;->b:Lcom/facebook/soloader/e;

    invoke-virtual {v0, p1}, Lcom/facebook/soloader/A;->e(I)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/soloader/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/facebook/soloader/a;->b:Lcom/facebook/soloader/e;

    invoke-virtual {v1}, Lcom/facebook/soloader/e;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
