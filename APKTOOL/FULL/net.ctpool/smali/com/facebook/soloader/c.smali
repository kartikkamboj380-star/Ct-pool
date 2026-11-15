.class public Lcom/facebook/soloader/c;
.super Lcom/facebook/soloader/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/soloader/c$a;
    }
.end annotation


# instance fields
.field private final h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;I)V
    .locals 1

    const-string v0, "^lib/([^/]+)/([^/]+\\.so)$"

    invoke-direct {p0, p1, p3, p2, v0}, Lcom/facebook/soloader/k;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V

    iput p4, p0, Lcom/facebook/soloader/c;->h:I

    return-void
.end method

.method static synthetic u(Lcom/facebook/soloader/c;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/facebook/soloader/c;->h:I

    return p0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "BackupSoSource"

    return-object v0
.end method

.method protected m()[B
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/k;->f:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v0

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    const/4 v2, 0x2

    :try_start_0
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeByte(B)V

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lcom/facebook/soloader/C;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/soloader/SysUtil;->g(Landroid/content/Context;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/facebook/soloader/c;->h:I

    const/4 v3, 0x1

    and-int/2addr v0, v3

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeByte(B)V

    invoke-virtual {v1}, Landroid/os/Parcel;->marshall()[B

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/facebook/soloader/C;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeByte(B)V

    invoke-virtual {v1}, Landroid/os/Parcel;->marshall()[B

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    return-object v0

    :cond_1
    :try_start_2
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeByte(B)V

    invoke-virtual {v1}, Landroid/os/Parcel;->marshall()[B

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    return-object v0

    :cond_2
    :try_start_3
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeByte(B)V

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    invoke-virtual {v1}, Landroid/os/Parcel;->marshall()[B

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    return-object v0

    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    throw v0
.end method

.method protected o(Z)Lcom/facebook/soloader/C$e;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/soloader/c$a;

    invoke-direct {v0, p0, p0, p1}, Lcom/facebook/soloader/c$a;-><init>(Lcom/facebook/soloader/c;Lcom/facebook/soloader/k;Z)V

    return-object v0
.end method

.method public v()Z
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/soloader/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p0, v1}, Lcom/facebook/soloader/c$a;-><init>(Lcom/facebook/soloader/c;Lcom/facebook/soloader/k;Z)V

    :try_start_0
    invoke-virtual {v0}, Lcom/facebook/soloader/k$b;->e()[Lcom/facebook/soloader/k$a;

    move-result-object v2

    array-length v2, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    invoke-virtual {v0}, Lcom/facebook/soloader/k$b;->close()V

    return v1

    :catchall_0
    move-exception v1

    :try_start_1
    invoke-virtual {v0}, Lcom/facebook/soloader/k$b;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
.end method
