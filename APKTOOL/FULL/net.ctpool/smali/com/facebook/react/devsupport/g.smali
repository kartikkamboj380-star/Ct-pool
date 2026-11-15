.class public Lcom/facebook/react/devsupport/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/g$h;,
        Lcom/facebook/react/devsupport/g$g;
    }
.end annotation


# instance fields
.field private final a:Ln2/a;

.field private final b:Lt2/d;

.field private final c:LT5/z;

.field private final d:Lcom/facebook/react/devsupport/a;

.field private final e:Lcom/facebook/react/devsupport/U;

.field private final f:Landroid/content/Context;

.field private final g:Ljava/lang/String;

.field private h:Lt2/b;

.field private i:Lcom/facebook/react/devsupport/K;


# direct methods
.method public constructor <init>(Ln2/a;Landroid/content/Context;Lt2/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/devsupport/g;->a:Ln2/a;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/facebook/react/devsupport/g;->b:Lt2/d;

    .line 7
    .line 8
    new-instance p1, LT5/z$a;

    .line 9
    .line 10
    invoke-direct {p1}, LT5/z$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 14
    .line 15
    const-wide/16 v0, 0x1388

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1, p3}, LT5/z$a;->e(JLjava/util/concurrent/TimeUnit;)LT5/z$a;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-wide/16 v0, 0x0

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1, p3}, LT5/z$a;->M(JLjava/util/concurrent/TimeUnit;)LT5/z$a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, v0, v1, p3}, LT5/z$a;->N(JLjava/util/concurrent/TimeUnit;)LT5/z$a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, LT5/z$a;->b()LT5/z;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lcom/facebook/react/devsupport/g;->c:LT5/z;

    .line 36
    .line 37
    new-instance p3, Lcom/facebook/react/devsupport/a;

    .line 38
    .line 39
    invoke-direct {p3, p1}, Lcom/facebook/react/devsupport/a;-><init>(LT5/z;)V

    .line 40
    .line 41
    .line 42
    iput-object p3, p0, Lcom/facebook/react/devsupport/g;->d:Lcom/facebook/react/devsupport/a;

    .line 43
    .line 44
    new-instance p3, Lcom/facebook/react/devsupport/U;

    .line 45
    .line 46
    invoke-direct {p3, p1}, Lcom/facebook/react/devsupport/U;-><init>(LT5/z;)V

    .line 47
    .line 48
    .line 49
    iput-object p3, p0, Lcom/facebook/react/devsupport/g;->e:Lcom/facebook/react/devsupport/U;

    .line 50
    .line 51
    iput-object p2, p0, Lcom/facebook/react/devsupport/g;->f:Landroid/content/Context;

    .line 52
    .line 53
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, Lcom/facebook/react/devsupport/g;->g:Ljava/lang/String;

    .line 58
    .line 59
    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/react/devsupport/g;)Lcom/facebook/react/devsupport/K;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/g;->i:Lcom/facebook/react/devsupport/K;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/facebook/react/devsupport/g;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/g;->g:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/facebook/react/devsupport/g;)Lt2/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/g;->h:Lt2/b;

    return-object p0
.end method

.method static bridge synthetic d(Lcom/facebook/react/devsupport/g;)Lt2/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/g;->b:Lt2/d;

    return-object p0
.end method

.method static bridge synthetic e(Lcom/facebook/react/devsupport/g;Lcom/facebook/react/devsupport/K;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/g;->i:Lcom/facebook/react/devsupport/K;

    return-void
.end method

.method static bridge synthetic f(Lcom/facebook/react/devsupport/g;Lt2/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/g;->h:Lt2/b;

    return-void
.end method

.method static bridge synthetic g(Lcom/facebook/react/devsupport/g;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/g;->s()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private j(Ljava/lang/String;Lcom/facebook/react/devsupport/g$g;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/g;->b:Lt2/d;

    invoke-virtual {v0}, Lt2/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/react/devsupport/g;->k(Ljava/lang/String;Lcom/facebook/react/devsupport/g$g;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private k(Ljava/lang/String;Lcom/facebook/react/devsupport/g$g;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/devsupport/g;->l(Ljava/lang/String;Lcom/facebook/react/devsupport/g$g;Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private l(Ljava/lang/String;Lcom/facebook/react/devsupport/g$g;Ljava/lang/String;ZZ)Ljava/lang/String;
    .locals 12

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/devsupport/g;->p()Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p2}, Lcom/facebook/react/devsupport/g$g;->h()Ljava/lang/String;

    move-result-object v5

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-direct {p0}, Lcom/facebook/react/devsupport/g;->t()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    move-object v0, p0

    iget-object v9, v0, Lcom/facebook/react/devsupport/g;->g:Ljava/lang/String;

    const-string v3, "false"

    const-string v4, "true"

    if-eqz p4, :cond_0

    move-object v10, v4

    goto :goto_0

    :cond_0
    move-object v10, v3

    :goto_0
    if-eqz p5, :cond_1

    move-object v11, v4

    goto :goto_1

    :cond_1
    move-object v11, v3

    :goto_1
    move-object v3, p3

    move-object v4, p1

    filled-new-array/range {v3 .. v11}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "http://%s/%s.%s?platform=android&dev=%s&lazy=%s&minify=%s&app=%s&modulesOnly=%s&runModule=%s"

    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/facebook/react/devsupport/InspectorFlags;->getFuseboxEnabled()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "&excludeSource=true&sourcePaths=url-server"

    goto :goto_2

    :cond_2
    const-string v2, ""

    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method private m()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget-object v1, p0, Lcom/facebook/react/devsupport/g;->b:Lt2/d;

    invoke-virtual {v1}, Lt2/d;->a()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "http://%s/launch-js-devtools"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private p()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/g;->a:Ln2/a;

    invoke-interface {v0}, Ln2/a;->h()Z

    move-result v0

    return v0
.end method

.method private r()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/g;->g:Ljava/lang/String;

    iget-object v1, p0, Lcom/facebook/react/devsupport/g;->f:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "android_id"

    invoke-static {v1, v2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {}, Lcom/facebook/react/devsupport/InspectorFlags;->getFuseboxEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "fusebox"

    goto :goto_0

    :cond_0
    const-string v3, "legacy"

    :goto_0
    filled-new-array {v0, v1, v3}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "android-%s-%s-%s"

    invoke-static {v2, v1, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/react/devsupport/g;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private s()Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget-object v1, p0, Lcom/facebook/react/devsupport/g;->b:Lt2/d;

    invoke-virtual {v1}, Lt2/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lq2/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/react/devsupport/g;->g:Ljava/lang/String;

    invoke-static {v3}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0}, Lcom/facebook/react/devsupport/g;->r()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "http://%s/inspector/device?name=%s&app=%s&device=%s"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private t()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/g;->a:Ln2/a;

    invoke-interface {v0}, Ln2/a;->d()Z

    move-result v0

    return v0
.end method

.method private static u(Ljava/lang/String;)Ljava/lang/String;
    .locals 22

    .line 1
    :try_start_0
    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    :try_start_1
    const-string v1, "UTF-8"

    move-object/from16 v2, p0

    invoke-virtual {v2, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v1, 0x0

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    const/4 v1, 0x1

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    const/4 v1, 0x2

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    const/4 v1, 0x3

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v5

    const/4 v1, 0x4

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    const/4 v1, 0x5

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v7

    const/4 v1, 0x6

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v8

    const/4 v1, 0x7

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v9

    const/16 v1, 0x8

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v10

    const/16 v1, 0x9

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v11

    const/16 v1, 0xa

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v12

    const/16 v1, 0xb

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v13

    const/16 v1, 0xc

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v14

    const/16 v1, 0xd

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v15

    const/16 v1, 0xe

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v16

    const/16 v1, 0xf

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v17

    const/16 v1, 0x10

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v18

    const/16 v1, 0x11

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v19

    const/16 v1, 0x12

    aget-byte v1, v0, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v20

    const/16 v1, 0x13

    aget-byte v0, v0, v1

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v21

    filled-new-array/range {v2 .. v21}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "This environment doesn\'t support UTF-8 encoding"

    invoke-direct {v1, v2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/AssertionError;

    const-string v2, "Could not get standard SHA-256 algorithm"

    invoke-direct {v1, v2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public A(Ljava/lang/String;Lcom/facebook/react/devsupport/g$h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/g;->h:Lt2/b;

    if-eqz v0, :cond_0

    const-string p1, "ReactNative"

    const-string p2, "Packager connection already open, nooping."

    invoke-static {p1, p2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/g$a;

    invoke-direct {v0, p0, p2, p1}, Lcom/facebook/react/devsupport/g$a;-><init>(Lcom/facebook/react/devsupport/g;Lcom/facebook/react/devsupport/g$h;Ljava/lang/String;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Void;

    invoke-virtual {v0, p1, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public h()V
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/g$d;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/g$d;-><init>(Lcom/facebook/react/devsupport/g;)V

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public i()V
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/react/devsupport/g$b;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/g$b;-><init>(Lcom/facebook/react/devsupport/g;)V

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public n()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/g;->i:Lcom/facebook/react/devsupport/K;

    if-eqz v0, :cond_0

    const-string v1, "{ \"id\":1,\"method\":\"Debugger.disable\" }"

    invoke-interface {v0, v1}, Lcom/facebook/react/devsupport/K;->sendEventToAllConnections(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public o(LX1/b;Ljava/io/File;Ljava/lang/String;Lcom/facebook/react/devsupport/a$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/g;->d:Lcom/facebook/react/devsupport/a;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/facebook/react/devsupport/a;->e(LX1/b;Ljava/io/File;Ljava/lang/String;Lcom/facebook/react/devsupport/a$c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public q(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/devsupport/g$g;->n:Lcom/facebook/react/devsupport/g$g;

    iget-object v1, p0, Lcom/facebook/react/devsupport/g;->b:Lt2/d;

    invoke-virtual {v1}, Lt2/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/react/devsupport/g;->k(Ljava/lang/String;Lcom/facebook/react/devsupport/g$g;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public v(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/devsupport/g$g;->n:Lcom/facebook/react/devsupport/g$g;

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/devsupport/g;->j(Ljava/lang/String;Lcom/facebook/react/devsupport/g$g;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public w(LX1/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/g;->b:Lt2/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt2/d;->a()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "ReactNative"

    .line 10
    .line 11
    const-string v1, "No packager host configured."

    .line 12
    .line 13
    invoke-static {v0, v1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-interface {p1, v0}, LX1/g;->a(Z)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v1, p0, Lcom/facebook/react/devsupport/g;->e:Lcom/facebook/react/devsupport/U;

    .line 22
    .line 23
    invoke-virtual {v1, v0, p1}, Lcom/facebook/react/devsupport/U;->b(Ljava/lang/String;LX1/g;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    return-void
.end method

.method public x()V
    .locals 2

    .line 1
    new-instance v0, LT5/B$a;

    invoke-direct {v0}, LT5/B$a;-><init>()V

    invoke-direct {p0}, Lcom/facebook/react/devsupport/g;->m()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LT5/B$a;->m(Ljava/lang/String;)LT5/B$a;

    move-result-object v0

    invoke-virtual {v0}, LT5/B$a;->b()LT5/B;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/devsupport/g;->c:LT5/z;

    invoke-virtual {v1, v0}, LT5/z;->a(LT5/B;)LT5/e;

    move-result-object v0

    new-instance v1, Lcom/facebook/react/devsupport/g$e;

    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/g$e;-><init>(Lcom/facebook/react/devsupport/g;)V

    invoke-interface {v0, v1}, LT5/e;->S0(LT5/f;)V

    return-void
.end method

.method public y(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    iget-object v1, p0, Lcom/facebook/react/devsupport/g;->b:Lt2/d;

    invoke-virtual {v1}, Lt2/d;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/react/devsupport/g;->g:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0}, Lcom/facebook/react/devsupport/g;->r()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "http://%s/open-debugger?appId=%s&device=%s"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LT5/B$a;

    invoke-direct {v1}, LT5/B$a;-><init>()V

    invoke-virtual {v1, v0}, LT5/B$a;->m(Ljava/lang/String;)LT5/B$a;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, ""

    invoke-static {v1, v2}, LT5/C;->d(LT5/x;Ljava/lang/String;)LT5/C;

    move-result-object v1

    const-string v2, "POST"

    invoke-virtual {v0, v2, v1}, LT5/B$a;->g(Ljava/lang/String;LT5/C;)LT5/B$a;

    move-result-object v0

    invoke-virtual {v0}, LT5/B$a;->b()LT5/B;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/devsupport/g;->c:LT5/z;

    invoke-virtual {v1, v0}, LT5/z;->a(LT5/B;)LT5/e;

    move-result-object v0

    new-instance v1, Lcom/facebook/react/devsupport/g$f;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/react/devsupport/g$f;-><init>(Lcom/facebook/react/devsupport/g;Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;)V

    invoke-interface {v0, v1}, LT5/e;->S0(LT5/f;)V

    return-void
.end method

.method public z()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/g;->i:Lcom/facebook/react/devsupport/K;

    if-eqz v0, :cond_0

    const-string v0, "ReactNative"

    const-string v1, "Inspector connection already open, nooping."

    invoke-static {v0, v1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/g$c;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/g$c;-><init>(Lcom/facebook/react/devsupport/g;)V

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
