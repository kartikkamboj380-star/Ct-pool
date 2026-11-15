.class public Lcom/google/firebase/crashlytics/ndk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/nio/charset/Charset;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/firebase/crashlytics/ndk/e;

.field private final c:Ln4/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/crashlytics/ndk/a;->d:Ljava/nio/charset/Charset;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/firebase/crashlytics/ndk/e;Ln4/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/firebase/crashlytics/ndk/a;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/firebase/crashlytics/ndk/a;->b:Lcom/google/firebase/crashlytics/ndk/e;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/firebase/crashlytics/ndk/a;->c:Ln4/g;

    .line 9
    .line 10
    return-void
.end method

.method private static a(Landroid/app/ApplicationExitInfo;)Lk4/F$a;
    .locals 3

    .line 1
    invoke-static {}, Lk4/F$a;->a()Lk4/F$a$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lh4/U;->a(Landroid/app/ApplicationExitInfo;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0, v1}, Lk4/F$a$b;->c(I)Lk4/F$a$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p0}, Lh4/V;->a(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lk4/F$a$b;->e(Ljava/lang/String;)Lk4/F$a$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {p0}, Lr0/g;->a(Landroid/app/ApplicationExitInfo;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Lk4/F$a$b;->g(I)Lk4/F$a$b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p0}, Lr0/h;->a(Landroid/app/ApplicationExitInfo;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    invoke-virtual {v0, v1, v2}, Lk4/F$a$b;->i(J)Lk4/F$a$b;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {p0}, Lh4/W;->a(Landroid/app/ApplicationExitInfo;)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {v0, v1}, Lk4/F$a$b;->d(I)Lk4/F$a$b;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {p0}, Lh4/X;->a(Landroid/app/ApplicationExitInfo;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    invoke-virtual {v0, v1, v2}, Lk4/F$a$b;->f(J)Lk4/F$a$b;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {p0}, Lh4/Y;->a(Landroid/app/ApplicationExitInfo;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v1

    .line 57
    invoke-virtual {v0, v1, v2}, Lk4/F$a$b;->h(J)Lk4/F$a$b;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {p0}, Lcom/google/firebase/crashlytics/ndk/a;->i(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v0, p0}, Lk4/F$a$b;->j(Ljava/lang/String;)Lk4/F$a$b;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0}, Lk4/F$a$b;->a()Lk4/F$a;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public static b(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x2000

    new-array v1, v1, [B

    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    invoke-static {p0}, Lcom/google/firebase/crashlytics/ndk/a;->r([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private c(Ljava/lang/String;)Lk4/F$a;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/ndk/a;->f(Ljava/lang/String;)Lk4/F$a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    return-object p1
.end method

.method private e(Ljava/lang/String;Ljava/io/File;)Lcom/google/firebase/crashlytics/ndk/f$c;
    .locals 1

    .line 1
    const-string v0, ".dmp"

    invoke-static {p2, v0}, Lcom/google/firebase/crashlytics/ndk/a;->h(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    invoke-direct {p0, p1}, Lcom/google/firebase/crashlytics/ndk/a;->c(Ljava/lang/String;)Lk4/F$a;

    move-result-object p1

    new-instance v0, Lcom/google/firebase/crashlytics/ndk/f$c;

    invoke-direct {v0, p2, p1}, Lcom/google/firebase/crashlytics/ndk/f$c;-><init>(Ljava/io/File;Lk4/F$a;)V

    return-object v0
.end method

.method private f(Ljava/lang/String;)Lk4/F$a;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/firebase/crashlytics/ndk/a;->a:Landroid/content/Context;

    .line 2
    .line 3
    const-string v1, "activity"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/app/ActivityManager;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {v0, v1, v2, v2}, Lr0/e;->a(Landroid/app/ActivityManager;Ljava/lang/String;II)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lcom/google/firebase/crashlytics/ndk/a;->c:Ln4/g;

    .line 18
    .line 19
    const-string v2, "start-time"

    .line 20
    .line 21
    invoke-virtual {v1, p1, v2}, Ln4/g;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 33
    .line 34
    .line 35
    move-result-wide v1

    .line 36
    :goto_0
    invoke-direct {p0, v1, v2, v0}, Lcom/google/firebase/crashlytics/ndk/a;->g(JLjava/util/List;)Lk4/F$a;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method

.method private g(JLjava/util/List;)Lk4/F$a;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, Lr0/f;->a(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, Lr0/g;->a(Landroid/app/ApplicationExitInfo;)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x5

    .line 29
    if-ne v2, v3, :cond_0

    .line 30
    .line 31
    invoke-static {v1}, Lr0/h;->a(Landroid/app/ApplicationExitInfo;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    cmp-long v2, v2, p1

    .line 36
    .line 37
    if-gez v2, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    const/4 p1, 0x0

    .line 53
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, Lr0/f;->a(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lcom/google/firebase/crashlytics/ndk/a;->a(Landroid/app/ApplicationExitInfo;)Lk4/F$a;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_1
    return-object p1
.end method

.method private static h(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private static i(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p0}, Lh4/S;->a(Landroid/app/ApplicationExitInfo;)Ljava/io/InputStream;

    move-result-object p0

    invoke-static {p0}, Lcom/google/firebase/crashlytics/ndk/a;->b(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-static {}, Le4/g;->f()Le4/g;

    move-result-object p0

    const-string v0, "Failed to get input stream from ApplicationExitInfo"

    invoke-virtual {p0, v0}, Le4/g;->k(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static o(Ln4/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ln4/g;->k(Ljava/lang/String;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance p1, Ljava/io/File;

    .line 6
    .line 7
    invoke-direct {p1, p0, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1, p2}, Lcom/google/firebase/crashlytics/ndk/a;->q(Ljava/io/File;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static q(Ljava/io/File;Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "Failed to close "

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/io/BufferedWriter;

    new-instance v3, Ljava/io/OutputStreamWriter;

    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    sget-object v5, Lcom/google/firebase/crashlytics/ndk/a;->d:Ljava/nio/charset/Charset;

    invoke-direct {v3, v4, v5}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Lh4/j;->f(Ljava/io/Closeable;Ljava/lang/String;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    move-object v1, v2

    goto :goto_0

    :catch_0
    move-object v1, v2

    goto :goto_1

    :catchall_1
    move-exception p1

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lh4/j;->f(Ljava/io/Closeable;Ljava/lang/String;)V

    throw p1

    :catch_1
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lh4/j;->f(Ljava/io/Closeable;Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method private static r([B)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    new-instance v1, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v1, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v1, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->finish()V

    invoke-static {}, Lr4/b;->a()Ljava/util/Base64$Encoder;

    move-result-object p0

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    invoke-static {p0, v2}, Lr4/c;->a(Ljava/util/Base64$Encoder;[B)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_1

    :catchall_1
    move-exception p0

    :try_start_3
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v1

    :try_start_4
    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    :try_start_5
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0
.end method


# virtual methods
.method public d(Ljava/lang/String;)Lcom/google/firebase/crashlytics/ndk/f;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/firebase/crashlytics/ndk/a;->c:Ln4/g;

    invoke-virtual {v0, p1}, Ln4/g;->k(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    const-string v2, "pending"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {}, Le4/g;->f()Le4/g;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Minidump directory: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Le4/g;->i(Ljava/lang/String;)V

    const-string v2, ".dmp"

    invoke-static {v1, v2}, Lcom/google/firebase/crashlytics/ndk/a;->h(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-static {}, Le4/g;->f()Le4/g;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Minidump file "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "exists"

    goto :goto_0

    :cond_0
    const-string v2, "does not exist"

    :goto_0
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Le4/g;->i(Ljava/lang/String;)V

    new-instance v2, Lcom/google/firebase/crashlytics/ndk/f$b;

    invoke-direct {v2}, Lcom/google/firebase/crashlytics/ndk/f$b;-><init>()V

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-direct {p0, p1, v1}, Lcom/google/firebase/crashlytics/ndk/a;->e(Ljava/lang/String;Ljava/io/File;)Lcom/google/firebase/crashlytics/ndk/f$c;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/firebase/crashlytics/ndk/f$b;->l(Lcom/google/firebase/crashlytics/ndk/f$c;)Lcom/google/firebase/crashlytics/ndk/f$b;

    move-result-object p1

    const-string v1, ".device_info"

    invoke-static {v0, v1}, Lcom/google/firebase/crashlytics/ndk/a;->h(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/firebase/crashlytics/ndk/f$b;->k(Ljava/io/File;)Lcom/google/firebase/crashlytics/ndk/f$b;

    move-result-object p1

    new-instance v1, Ljava/io/File;

    const-string v3, "session.json"

    invoke-direct {v1, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/google/firebase/crashlytics/ndk/f$b;->n(Ljava/io/File;)Lcom/google/firebase/crashlytics/ndk/f$b;

    move-result-object p1

    new-instance v1, Ljava/io/File;

    const-string v3, "app.json"

    invoke-direct {v1, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/google/firebase/crashlytics/ndk/f$b;->h(Ljava/io/File;)Lcom/google/firebase/crashlytics/ndk/f$b;

    move-result-object p1

    new-instance v1, Ljava/io/File;

    const-string v3, "device.json"

    invoke-direct {v1, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/google/firebase/crashlytics/ndk/f$b;->j(Ljava/io/File;)Lcom/google/firebase/crashlytics/ndk/f$b;

    move-result-object p1

    new-instance v1, Ljava/io/File;

    const-string v3, "os.json"

    invoke-direct {v1, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/google/firebase/crashlytics/ndk/f$b;->m(Ljava/io/File;)Lcom/google/firebase/crashlytics/ndk/f$b;

    :cond_1
    invoke-virtual {v2}, Lcom/google/firebase/crashlytics/ndk/f$b;->i()Lcom/google/firebase/crashlytics/ndk/f;

    move-result-object p1

    return-object p1
.end method

.method public j(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/firebase/crashlytics/ndk/a;->d(Ljava/lang/String;)Lcom/google/firebase/crashlytics/ndk/f;

    move-result-object p1

    iget-object p1, p1, Lcom/google/firebase/crashlytics/ndk/f;->a:Lcom/google/firebase/crashlytics/ndk/f$c;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/firebase/crashlytics/ndk/f$c;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;JLk4/G;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/firebase/crashlytics/ndk/a;->c:Ln4/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ln4/g;->k(Ljava/lang/String;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/google/firebase/crashlytics/ndk/a;->b:Lcom/google/firebase/crashlytics/ndk/e;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/google/firebase/crashlytics/ndk/a;->a:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v1, v0, v2}, Lcom/google/firebase/crashlytics/ndk/e;->a(Ljava/lang/String;Landroid/content/res/AssetManager;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/firebase/crashlytics/ndk/a;->l(Ljava/lang/String;Ljava/lang/String;J)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p5}, Lk4/G;->a()Lk4/G$a;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/crashlytics/ndk/a;->m(Ljava/lang/String;Lk4/G$a;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p5}, Lk4/G;->d()Lk4/G$c;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/crashlytics/ndk/a;->p(Ljava/lang/String;Lk4/G$c;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p5}, Lk4/G;->c()Lk4/G$b;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/crashlytics/ndk/a;->n(Ljava/lang/String;Lk4/G$b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    return p1

    .line 53
    :catch_0
    move-exception p1

    .line 54
    invoke-static {}, Le4/g;->f()Le4/g;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    const-string p3, "Error initializing Crashlytics NDK"

    .line 59
    .line 60
    invoke-virtual {p2, p3, p1}, Le4/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    const/4 p1, 0x0

    .line 64
    return p1
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3, p4}, Lcom/google/firebase/crashlytics/ndk/h;->b(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lcom/google/firebase/crashlytics/ndk/a;->c:Ln4/g;

    const-string p4, "session.json"

    invoke-static {p3, p1, p2, p4}, Lcom/google/firebase/crashlytics/ndk/a;->o(Ln4/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public m(Ljava/lang/String;Lk4/G$a;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Lk4/G$a;->a()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Lk4/G$a;->f()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p2}, Lk4/G$a;->g()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p2}, Lk4/G$a;->e()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p2}, Lk4/G$a;->c()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    invoke-virtual {p2}, Lk4/G$a;->d()Le4/f;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v5}, Le4/f;->d()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {p2}, Lk4/G$a;->d()Le4/f;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-virtual {p2}, Le4/f;->e()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-static/range {v0 .. v6}, Lcom/google/firebase/crashlytics/ndk/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget-object v0, p0, Lcom/google/firebase/crashlytics/ndk/a;->c:Ln4/g;

    .line 42
    .line 43
    const-string v1, "app.json"

    .line 44
    .line 45
    invoke-static {v0, p1, p2, v1}, Lcom/google/firebase/crashlytics/ndk/a;->o(Ln4/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public n(Ljava/lang/String;Lk4/G$b;)V
    .locals 11

    .line 1
    invoke-virtual {p2}, Lk4/G$b;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Lk4/G$b;->g()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p2}, Lk4/G$b;->b()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p2}, Lk4/G$b;->j()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    invoke-virtual {p2}, Lk4/G$b;->d()J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    invoke-virtual {p2}, Lk4/G$b;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    invoke-virtual {p2}, Lk4/G$b;->i()I

    .line 26
    .line 27
    .line 28
    move-result v8

    .line 29
    invoke-virtual {p2}, Lk4/G$b;->f()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    invoke-virtual {p2}, Lk4/G$b;->h()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    invoke-static/range {v0 .. v10}, Lcom/google/firebase/crashlytics/ndk/h;->d(ILjava/lang/String;IJJZILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget-object v0, p0, Lcom/google/firebase/crashlytics/ndk/a;->c:Ln4/g;

    .line 42
    .line 43
    const-string v1, "device.json"

    .line 44
    .line 45
    invoke-static {v0, p1, p2, v1}, Lcom/google/firebase/crashlytics/ndk/a;->o(Ln4/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public p(Ljava/lang/String;Lk4/G$c;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lk4/G$c;->d()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Lk4/G$c;->c()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p2}, Lk4/G$c;->b()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-static {v0, v1, p2}, Lcom/google/firebase/crashlytics/ndk/h;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iget-object v0, p0, Lcom/google/firebase/crashlytics/ndk/a;->c:Ln4/g;

    .line 18
    .line 19
    const-string v1, "os.json"

    .line 20
    .line 21
    invoke-static {v0, p1, p2, v1}, Lcom/google/firebase/crashlytics/ndk/a;->o(Ln4/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
