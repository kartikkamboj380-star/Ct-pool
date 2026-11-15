.class public Lcom/facebook/soloader/c$a;
.super Lcom/facebook/soloader/k$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/soloader/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "a"
.end annotation


# instance fields
.field private final q:Z

.field private final r:Ljava/io/File;

.field private final s:I

.field final synthetic t:Lcom/facebook/soloader/c;


# direct methods
.method constructor <init>(Lcom/facebook/soloader/c;Lcom/facebook/soloader/k;Z)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/soloader/c$a;->t:Lcom/facebook/soloader/c;

    invoke-direct {p0, p1, p2}, Lcom/facebook/soloader/k$b;-><init>(Lcom/facebook/soloader/k;Lcom/facebook/soloader/C;)V

    iput-boolean p3, p0, Lcom/facebook/soloader/c$a;->q:Z

    new-instance p2, Ljava/io/File;

    iget-object p3, p1, Lcom/facebook/soloader/C;->d:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p3

    iget-object p3, p3, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    invoke-direct {p2, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/facebook/soloader/c$a;->r:Ljava/io/File;

    invoke-static {p1}, Lcom/facebook/soloader/c;->u(Lcom/facebook/soloader/c;)I

    move-result p1

    iput p1, p0, Lcom/facebook/soloader/c$a;->s:I

    return-void
.end method


# virtual methods
.method protected f()[Lcom/facebook/soloader/k$a;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/k$b;->m:[Lcom/facebook/soloader/k$a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/soloader/k$b;->e()[Lcom/facebook/soloader/k$a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/soloader/k$b;->m:[Lcom/facebook/soloader/k$a;

    iget-boolean v1, p0, Lcom/facebook/soloader/c$a;->q:Z

    const-string v2, "BackupSoSource"

    if-eqz v1, :cond_1

    const-string v0, "Unconditonally extracting all DSOs from zip"

    invoke-static {v2, v0}, Lcom/facebook/soloader/m;->g(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/soloader/k$b;->m:[Lcom/facebook/soloader/k$a;

    return-object v0

    :cond_1
    iget v1, p0, Lcom/facebook/soloader/c$a;->s:I

    and-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_2

    const-string v0, "Self-extraction preferred (PREFER_ANDROID_LIBS_DRIECTORY not set)"

    invoke-static {v2, v0}, Lcom/facebook/soloader/m;->g(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/soloader/k$b;->m:[Lcom/facebook/soloader/k$a;

    return-object v0

    :cond_2
    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_4

    aget-object v4, v0, v3

    iget-object v5, v4, Lcom/facebook/soloader/k$a;->o:Ljava/util/zip/ZipEntry;

    iget-object v4, v4, Lcom/facebook/soloader/C$c;->m:Ljava/lang/String;

    invoke-virtual {p0, v5, v4}, Lcom/facebook/soloader/c$a;->g(Ljava/util/zip/ZipEntry;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v0, p0, Lcom/facebook/soloader/k$b;->m:[Lcom/facebook/soloader/k$a;

    return-object v0

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    new-array v0, v2, [Lcom/facebook/soloader/k$a;

    iput-object v0, p0, Lcom/facebook/soloader/k$b;->m:[Lcom/facebook/soloader/k$a;

    return-object v0
.end method

.method g(Ljava/util/zip/ZipEntry;Ljava/lang/String;)Z
    .locals 11

    .line 1
    const-string v0, ": "

    const-string v1, "Not allowing consideration of "

    const-string v2, "BackupSoSource"

    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/io/File;

    iget-object v5, p0, Lcom/facebook/soloader/c$a;->r:Ljava/io/File;

    invoke-direct {v4, v5, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v5, 0x0

    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/facebook/soloader/c$a;->r:Ljava/io/File;

    invoke-virtual {v7}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " not in lib dir."

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/facebook/soloader/m;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v5

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v6

    const/4 v7, 0x1

    const-string v8, "Allowing consideration of "

    if-nez v6, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " not in system lib dir"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {v2, p1}, Lcom/facebook/soloader/m;->g(Ljava/lang/String;Ljava/lang/String;)V

    return v7

    :cond_1
    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v9

    invoke-virtual {p1}, Ljava/util/zip/ZipEntry;->getSize()J

    move-result-wide p1

    cmp-long v0, v9, p1

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ": sysdir file length is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", but the file is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " bytes long in the APK"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": deferring to libdir"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-static {v2, p1}, Lcom/facebook/soloader/m;->g(Ljava/lang/String;Ljava/lang/String;)V

    return v5

    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ", IOException when constructing path: "

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1
.end method
