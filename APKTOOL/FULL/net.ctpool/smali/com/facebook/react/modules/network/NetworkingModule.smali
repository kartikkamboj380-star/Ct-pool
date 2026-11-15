.class public final Lcom/facebook/react/modules/network/NetworkingModule;
.super Lcom/facebook/fbreact/specs/NativeNetworkingAndroidSpec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/network/NetworkingModule$g;,
        Lcom/facebook/react/modules/network/NetworkingModule$e;,
        Lcom/facebook/react/modules/network/NetworkingModule$f;
    }
.end annotation

.annotation runtime Li2/a;
    name = "Networking"
.end annotation


# static fields
.field private static final CHUNK_TIMEOUT_NS:I = 0x5f5e100

.field private static final CONTENT_ENCODING_HEADER_NAME:Ljava/lang/String; = "content-encoding"

.field private static final CONTENT_TYPE_HEADER_NAME:Ljava/lang/String; = "content-type"

.field private static final MAX_CHUNK_SIZE_BETWEEN_FLUSHES:I = 0x2000

.field private static final REQUEST_BODY_KEY_BASE64:Ljava/lang/String; = "base64"

.field private static final REQUEST_BODY_KEY_FORMDATA:Ljava/lang/String; = "formData"

.field private static final REQUEST_BODY_KEY_STRING:Ljava/lang/String; = "string"

.field private static final REQUEST_BODY_KEY_URI:Ljava/lang/String; = "uri"

.field private static final TAG:Ljava/lang/String; = "Networking"

.field private static final USER_AGENT_HEADER_NAME:Ljava/lang/String; = "user-agent"

.field private static customClientBuilder:Lcom/facebook/react/modules/network/c;


# instance fields
.field private final mClient:LT5/z;

.field private final mCookieHandler:Lcom/facebook/react/modules/network/e;

.field private final mCookieJarContainer:Lcom/facebook/react/modules/network/a;

.field private final mDefaultUserAgent:Ljava/lang/String;

.field private final mRequestBodyHandlers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/modules/network/NetworkingModule$e;",
            ">;"
        }
    .end annotation
.end field

.field private final mRequestIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final mResponseHandlers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/modules/network/NetworkingModule$f;",
            ">;"
        }
    .end annotation
.end field

.field private mShuttingDown:Z

.field private final mUriHandlers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/facebook/react/modules/network/NetworkingModule$g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    invoke-static {p1}, Lcom/facebook/react/modules/network/h;->b(Landroid/content/Context;)LT5/z;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1, v0}, Lcom/facebook/react/modules/network/NetworkingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;LT5/z;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)V
    .locals 2

    .line 2
    invoke-static {p1}, Lcom/facebook/react/modules/network/h;->b(Landroid/content/Context;)LT5/z;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/facebook/react/modules/network/NetworkingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;LT5/z;Ljava/util/List;)V

    return-void
.end method

.method constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;LT5/z;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/facebook/react/modules/network/NetworkingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;LT5/z;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;LT5/z;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "Ljava/lang/String;",
            "LT5/z;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeNetworkingAndroidSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mRequestBodyHandlers:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mUriHandlers:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mResponseHandlers:Ljava/util/List;

    if-eqz p4, :cond_1

    invoke-virtual {p3}, LT5/z;->B()LT5/z$a;

    move-result-object p3

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p3}, LT5/z$a;->b()LT5/z;

    move-result-object p3

    goto :goto_0

    :cond_0
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iput-object p3, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mClient:LT5/z;

    new-instance p4, Lcom/facebook/react/modules/network/e;

    invoke-direct {p4, p1}, Lcom/facebook/react/modules/network/e;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    iput-object p4, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mCookieHandler:Lcom/facebook/react/modules/network/e;

    invoke-virtual {p3}, LT5/z;->p()LT5/n;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/modules/network/a;

    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mCookieJarContainer:Lcom/facebook/react/modules/network/a;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mShuttingDown:Z

    iput-object p2, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mDefaultUserAgent:Ljava/lang/String;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mRequestIds:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/bridge/ReactApplicationContext;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 5
    const/4 v0, 0x0

    invoke-static {p1}, Lcom/facebook/react/modules/network/h;->b(Landroid/content/Context;)LT5/z;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1, p2}, Lcom/facebook/react/modules/network/NetworkingModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;LT5/z;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/modules/network/NetworkingModule;Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;ILT5/v$a;)LT5/D;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/react/modules/network/NetworkingModule;->lambda$sendRequestInternal$0(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;ILT5/v$a;)LT5/D;

    move-result-object p0

    return-object p0
.end method

.method private declared-synchronized addRequest(I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mRequestIds:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private static applyCustomBuilder(LT5/z$a;)V
    .locals 0

    .line 1
    return-void
.end method

.method static bridge synthetic b(Lcom/facebook/react/modules/network/NetworkingModule;)LT5/z;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mClient:LT5/z;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/facebook/react/modules/network/NetworkingModule;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mResponseHandlers:Ljava/util/List;

    return-object p0
.end method

.method private declared-synchronized cancelAllRequests()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mRequestIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/facebook/react/modules/network/NetworkingModule;->cancelRequest(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mRequestIds:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method private cancelRequest(I)V
    .locals 2

    new-instance v0, Lcom/facebook/react/modules/network/NetworkingModule$d;

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lcom/facebook/react/modules/network/NetworkingModule$d;-><init>(Lcom/facebook/react/modules/network/NetworkingModule;Lcom/facebook/react/bridge/ReactContext;I)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Void;

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method private constructMultipartBody(Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;I)LT5/y$a;
    .locals 9

    .line 1
    new-instance v0, LT5/y$a;

    .line 2
    .line 3
    invoke-direct {v0}, LT5/y$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, LT5/x;->f(Ljava/lang/String;)LT5/x;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {v0, p2}, LT5/y$a;->d(LT5/x;)LT5/y$a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    if-ge v2, v1, :cond_6

    .line 23
    .line 24
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-string v4, "headers"

    .line 29
    .line 30
    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-direct {p0, v4, v5}, Lcom/facebook/react/modules/network/NetworkingModule;->extractHeaders(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;)LT5/t;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-nez v4, :cond_0

    .line 40
    .line 41
    const-string p1, "Missing or invalid header format for FormData part."

    .line 42
    .line 43
    :goto_1
    invoke-static {p2, p3, p1, v5}, Lcom/facebook/react/modules/network/o;->f(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    return-object v5

    .line 47
    :cond_0
    const-string v6, "content-type"

    .line 48
    .line 49
    invoke-virtual {v4, v6}, LT5/t;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    if-eqz v7, :cond_1

    .line 54
    .line 55
    invoke-static {v7}, LT5/x;->f(Ljava/lang/String;)LT5/x;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    invoke-virtual {v4}, LT5/t;->i()LT5/t$a;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v4, v6}, LT5/t$a;->h(Ljava/lang/String;)LT5/t$a;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4}, LT5/t$a;->e()LT5/t;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    goto :goto_2

    .line 72
    :cond_1
    move-object v7, v5

    .line 73
    :goto_2
    const-string v6, "string"

    .line 74
    .line 75
    invoke-interface {v3, v6}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_2

    .line 80
    .line 81
    invoke-interface {v3, v6}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-static {v7, v3}, LT5/C;->d(LT5/x;Ljava/lang/String;)LT5/C;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    :goto_3
    invoke-virtual {v0, v4, v3}, LT5/y$a;->a(LT5/t;LT5/C;)LT5/y$a;

    .line 90
    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_2
    const-string v6, "uri"

    .line 94
    .line 95
    invoke-interface {v3, v6}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_5

    .line 100
    .line 101
    if-nez v7, :cond_3

    .line 102
    .line 103
    const-string p1, "Binary FormData part needs a content-type header."

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    invoke-interface {v3, v6}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-static {v6, v3}, Lcom/facebook/react/modules/network/n;->h(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    if-nez v6, :cond_4

    .line 119
    .line 120
    new-instance p1, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    const-string v0, "Could not retrieve file for uri "

    .line 126
    .line 127
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    goto :goto_1

    .line 138
    :cond_4
    invoke-static {v7, v6}, Lcom/facebook/react/modules/network/n;->c(LT5/x;Ljava/io/InputStream;)LT5/C;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    goto :goto_3

    .line 143
    :cond_5
    const-string v3, "Unrecognized FormData part."

    .line 144
    .line 145
    invoke-static {p2, p3, v3, v5}, Lcom/facebook/react/modules/network/o;->f(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 149
    .line 150
    goto/16 :goto_0

    .line 151
    .line 152
    :cond_6
    return-object v0
.end method

.method static bridge synthetic d(Lcom/facebook/react/modules/network/NetworkingModule;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mShuttingDown:Z

    return p0
.end method

.method static bridge synthetic e(Lcom/facebook/react/modules/network/NetworkingModule;ILT5/E;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/modules/network/NetworkingModule;->readWithProgress(ILT5/E;)V

    return-void
.end method

.method private extractHeaders(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;)LT5/t;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    new-instance v1, LT5/t$a;

    .line 6
    .line 7
    invoke-direct {v1}, LT5/t$a;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v4, v2, :cond_4

    .line 17
    .line 18
    invoke-interface {p1, v4}, Lcom/facebook/react/bridge/ReadableArray;->getArray(I)Lcom/facebook/react/bridge/ReadableArray;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    if-eqz v5, :cond_3

    .line 23
    .line 24
    invoke-interface {v5}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const/4 v7, 0x2

    .line 29
    if-eq v6, v7, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-static {v6}, Lcom/facebook/react/modules/network/f;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    const/4 v7, 0x1

    .line 41
    invoke-interface {v5, v7}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    if-eqz v6, :cond_3

    .line 46
    .line 47
    if-nez v5, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-virtual {v1, v6, v5}, LT5/t$a;->d(Ljava/lang/String;Ljava/lang/String;)LT5/t$a;

    .line 51
    .line 52
    .line 53
    add-int/lit8 v4, v4, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    :goto_1
    return-object v0

    .line 57
    :cond_4
    const-string p1, "user-agent"

    .line 58
    .line 59
    invoke-virtual {v1, p1}, LT5/t$a;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-nez v0, :cond_5

    .line 64
    .line 65
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mDefaultUserAgent:Ljava/lang/String;

    .line 66
    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    invoke-virtual {v1, p1, v0}, LT5/t$a;->a(Ljava/lang/String;Ljava/lang/String;)LT5/t$a;

    .line 70
    .line 71
    .line 72
    :cond_5
    if-eqz p2, :cond_6

    .line 73
    .line 74
    const-string p1, "string"

    .line 75
    .line 76
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_6

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_6
    const-string p1, "content-encoding"

    .line 84
    .line 85
    invoke-virtual {v1, p1}, LT5/t$a;->h(Ljava/lang/String;)LT5/t$a;

    .line 86
    .line 87
    .line 88
    :goto_2
    invoke-virtual {v1}, LT5/t$a;->e()LT5/t;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1
.end method

.method static bridge synthetic f(Lcom/facebook/react/modules/network/NetworkingModule;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/modules/network/NetworkingModule;->removeRequest(I)V

    return-void
.end method

.method static bridge synthetic g(JJ)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/modules/network/NetworkingModule;->shouldDispatch(JJ)Z

    move-result p0

    return p0
.end method

.method static bridge synthetic h(LT5/t;)Lcom/facebook/react/bridge/WritableMap;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/modules/network/NetworkingModule;->translateHeaders(LT5/t;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p0

    return-object p0
.end method

.method private synthetic lambda$sendRequestInternal$0(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;ILT5/v$a;)LT5/D;
    .locals 3

    .line 1
    invoke-interface {p4}, LT5/v$a;->o()LT5/B;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p4, v0}, LT5/v$a;->a(LT5/B;)LT5/D;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    new-instance v0, Lcom/facebook/react/modules/network/k;

    .line 10
    .line 11
    invoke-virtual {p4}, LT5/D;->a()LT5/E;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Lcom/facebook/react/modules/network/NetworkingModule$a;

    .line 16
    .line 17
    invoke-direct {v2, p0, p1, p2, p3}, Lcom/facebook/react/modules/network/NetworkingModule$a;-><init>(Lcom/facebook/react/modules/network/NetworkingModule;Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, Lcom/facebook/react/modules/network/k;-><init>(LT5/E;Lcom/facebook/react/modules/network/i;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p4}, LT5/D;->U()LT5/D$a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, v0}, LT5/D$a;->b(LT5/E;)LT5/D$a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, LT5/D$a;->c()LT5/D;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method private readWithProgress(ILT5/E;)V
    .locals 15

    .line 1
    const-wide/16 v0, -0x1

    .line 2
    .line 3
    :try_start_0
    move-object/from16 v2, p2

    .line 4
    .line 5
    check-cast v2, Lcom/facebook/react/modules/network/k;

    .line 6
    .line 7
    invoke-virtual {v2}, Lcom/facebook/react/modules/network/k;->J()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    :try_start_1
    invoke-virtual {v2}, Lcom/facebook/react/modules/network/k;->e()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-wide v3, v0

    .line 17
    :catch_1
    :goto_0
    invoke-virtual/range {p2 .. p2}, LT5/E;->f()LT5/x;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-virtual/range {p2 .. p2}, LT5/E;->f()LT5/x;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 31
    .line 32
    invoke-virtual {v2, v5}, LT5/x;->c(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :goto_1
    new-instance v12, Lcom/facebook/react/modules/network/l;

    .line 37
    .line 38
    invoke-direct {v12, v2}, Lcom/facebook/react/modules/network/l;-><init>(Ljava/nio/charset/Charset;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual/range {p2 .. p2}, LT5/E;->a()Ljava/io/InputStream;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const/16 v5, 0x2000

    .line 46
    .line 47
    :try_start_2
    new-array v13, v5, [B

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 50
    .line 51
    .line 52
    move-result-object v14

    .line 53
    :goto_2
    invoke-virtual {v2, v13}, Ljava/io/InputStream;->read([B)I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    const/4 v6, -0x1

    .line 58
    if-eq v5, v6, :cond_1

    .line 59
    .line 60
    invoke-virtual {v12, v13, v5}, Lcom/facebook/react/modules/network/l;->a([BI)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    move-object v5, v14

    .line 65
    move/from16 v6, p1

    .line 66
    .line 67
    move-wide v8, v3

    .line 68
    move-wide v10, v0

    .line 69
    invoke-static/range {v5 .. v11}, Lcom/facebook/react/modules/network/o;->e(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;JJ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    goto :goto_3

    .line 75
    :cond_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :goto_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 80
    .line 81
    .line 82
    throw v0
.end method

.method private declared-synchronized removeRequest(I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mRequestIds:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static setCustomClientBuilder(Lcom/facebook/react/modules/network/c;)V
    .locals 0

    return-void
.end method

.method private static shouldDispatch(JJ)Z
    .locals 2

    const-wide/32 v0, 0x5f5e100

    add-long/2addr p2, v0

    cmp-long p0, p2, p0

    if-gez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static translateHeaders(LT5/t;)Lcom/facebook/react/bridge/WritableMap;
    .locals 5

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {p0}, LT5/t;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v1}, LT5/t;->h(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v4, ", "

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1}, LT5/t;->m(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    :goto_1
    invoke-virtual {v0, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_0
    invoke-virtual {p0, v1}, LT5/t;->m(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    goto :goto_1

    .line 60
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    invoke-static {v0}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method private wrapRequestBodyWithProgressEmitter(LT5/C;I)LT5/C;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lcom/facebook/react/modules/network/NetworkingModule$c;

    .line 10
    .line 11
    invoke-direct {v1, p0, v0, p2}, Lcom/facebook/react/modules/network/NetworkingModule$c;-><init>(Lcom/facebook/react/modules/network/NetworkingModule;Lcom/facebook/react/bridge/ReactApplicationContext;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v1}, Lcom/facebook/react/modules/network/n;->e(LT5/C;Lcom/facebook/react/modules/network/i;)Lcom/facebook/react/modules/network/j;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method


# virtual methods
.method public abortRequest(D)V
    .locals 0

    double-to-int p1, p1

    invoke-direct {p0, p1}, Lcom/facebook/react/modules/network/NetworkingModule;->cancelRequest(I)V

    invoke-direct {p0, p1}, Lcom/facebook/react/modules/network/NetworkingModule;->removeRequest(I)V

    return-void
.end method

.method public addListener(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public addRequestBodyHandler(Lcom/facebook/react/modules/network/NetworkingModule$e;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mRequestBodyHandlers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addResponseHandler(Lcom/facebook/react/modules/network/NetworkingModule$f;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mResponseHandlers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addUriHandler(Lcom/facebook/react/modules/network/NetworkingModule$g;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mUriHandlers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public clearCookies(Lcom/facebook/react/bridge/Callback;)V
    .locals 1
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mCookieHandler:Lcom/facebook/react/modules/network/e;

    invoke-virtual {v0, p1}, Lcom/facebook/react/modules/network/e;->d(Lcom/facebook/react/bridge/Callback;)V

    return-void
.end method

.method public initialize()V
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mCookieJarContainer:Lcom/facebook/react/modules/network/a;

    new-instance v1, LT5/w;

    iget-object v2, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mCookieHandler:Lcom/facebook/react/modules/network/e;

    invoke-direct {v1, v2}, LT5/w;-><init>(Ljava/net/CookieHandler;)V

    invoke-interface {v0, v1}, Lcom/facebook/react/modules/network/a;->c(LT5/n;)V

    return-void
.end method

.method public invalidate()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mShuttingDown:Z

    invoke-direct {p0}, Lcom/facebook/react/modules/network/NetworkingModule;->cancelAllRequests()V

    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mCookieHandler:Lcom/facebook/react/modules/network/e;

    invoke-virtual {v0}, Lcom/facebook/react/modules/network/e;->e()V

    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mCookieJarContainer:Lcom/facebook/react/modules/network/a;

    invoke-interface {v0}, Lcom/facebook/react/modules/network/a;->b()V

    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mRequestBodyHandlers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mResponseHandlers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mUriHandlers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public removeListeners(D)V
    .locals 0

    return-void
.end method

.method public removeRequestBodyHandler(Lcom/facebook/react/modules/network/NetworkingModule$e;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mRequestBodyHandlers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeResponseHandler(Lcom/facebook/react/modules/network/NetworkingModule$f;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mResponseHandlers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeUriHandler(Lcom/facebook/react/modules/network/NetworkingModule$g;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mUriHandlers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public sendRequest(Ljava/lang/String;Ljava/lang/String;DLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZDZ)V
    .locals 11

    move-wide v0, p3

    double-to-int v10, v0

    move-wide/from16 v0, p9

    double-to-int v8, v0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, v10

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move/from16 v7, p8

    move/from16 v9, p11

    :try_start_0
    invoke-virtual/range {v0 .. v9}, Lcom/facebook/react/modules/network/NetworkingModule;->sendRequestInternal(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to send url request: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v2, p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Networking"

    invoke-static {v2, v0, v1}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v10, v2, v1}, Lcom/facebook/react/modules/network/o;->f(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public sendRequestInternal(Ljava/lang/String;Ljava/lang/String;ILcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;ZIZ)V
    .locals 6

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContextIfActiveOrWarn()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v3

    :try_start_0
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mUriHandlers:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/modules/network/NetworkingModule$g;

    invoke-interface {v2, v0, p6}, Lcom/facebook/react/modules/network/NetworkingModule$g;->b(Landroid/net/Uri;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2, v0}, Lcom/facebook/react/modules/network/NetworkingModule$g;->a(Landroid/net/Uri;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-static {v3, p3, p1}, Lcom/facebook/react/modules/network/o;->a(Lcom/facebook/react/bridge/ReactApplicationContext;ILcom/facebook/react/bridge/WritableMap;)V

    invoke-static {v3, p3}, Lcom/facebook/react/modules/network/o;->g(Lcom/facebook/react/bridge/ReactApplicationContext;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    const/4 v0, 0x0

    :try_start_1
    new-instance v1, LT5/B$a;

    invoke-direct {v1}, LT5/B$a;-><init>()V

    invoke-virtual {v1, p2}, LT5/B$a;->m(Ljava/lang/String;)LT5/B$a;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-eqz p3, :cond_2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p2, v1}, LT5/B$a;->k(Ljava/lang/Object;)LT5/B$a;

    :cond_2
    iget-object v1, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mClient:LT5/z;

    invoke-virtual {v1}, LT5/z;->B()LT5/z$a;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/react/modules/network/NetworkingModule;->applyCustomBuilder(LT5/z$a;)V

    if-nez p9, :cond_3

    sget-object p9, LT5/n;->a:LT5/n;

    invoke-virtual {v1, p9}, LT5/z$a;->f(LT5/n;)LT5/z$a;

    :cond_3
    if-eqz p7, :cond_4

    new-instance p9, Lcom/facebook/react/modules/network/g;

    invoke-direct {p9, p0, p6, v3, p3}, Lcom/facebook/react/modules/network/g;-><init>(Lcom/facebook/react/modules/network/NetworkingModule;Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;I)V

    invoke-virtual {v1, p9}, LT5/z$a;->a(LT5/v;)LT5/z$a;

    :cond_4
    iget-object p9, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mClient:LT5/z;

    invoke-virtual {p9}, LT5/z;->h()I

    move-result p9

    if-eq p8, p9, :cond_5

    int-to-long p8, p8

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, p8, p9, v2}, LT5/z$a;->d(JLjava/util/concurrent/TimeUnit;)LT5/z$a;

    :cond_5
    invoke-virtual {v1}, LT5/z$a;->b()LT5/z;

    move-result-object p8

    invoke-direct {p0, p4, p5}, Lcom/facebook/react/modules/network/NetworkingModule;->extractHeaders(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;)LT5/t;

    move-result-object p4

    if-nez p4, :cond_6

    const-string p1, "Unrecognized headers format"

    invoke-static {v3, p3, p1, v0}, Lcom/facebook/react/modules/network/o;->f(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_6
    const-string p9, "content-type"

    invoke-virtual {p4, p9}, LT5/t;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p9

    const-string v1, "content-encoding"

    invoke-virtual {p4, v1}, LT5/t;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, p4}, LT5/B$a;->f(LT5/t;)LT5/B$a;

    if-eqz p5, :cond_8

    iget-object p4, p0, Lcom/facebook/react/modules/network/NetworkingModule;->mRequestBodyHandlers:Ljava/util/List;

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_7
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/modules/network/NetworkingModule$e;

    invoke-interface {v2, p5}, Lcom/facebook/react/modules/network/NetworkingModule$e;->a(Lcom/facebook/react/bridge/ReadableMap;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_0

    :cond_8
    move-object v2, v0

    :goto_0
    if-eqz p5, :cond_16

    sget-object p4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "get"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    invoke-virtual {p1, p4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p4

    const-string v4, "head"

    invoke-virtual {p4, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_9

    goto/16 :goto_2

    :cond_9
    if-eqz v2, :cond_a

    invoke-interface {v2, p5, p9}, Lcom/facebook/react/modules/network/NetworkingModule$e;->b(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)LT5/C;

    move-result-object p4

    goto/16 :goto_3

    :cond_a
    const-string p4, "string"

    invoke-interface {p5, p4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    const-string v4, "Payload is set but no content-type header specified"

    if-eqz v2, :cond_e

    if-nez p9, :cond_b

    invoke-static {v3, p3, v4, v0}, Lcom/facebook/react/modules/network/o;->f(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_b
    invoke-interface {p5, p4}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p9}, LT5/x;->f(Ljava/lang/String;)LT5/x;

    move-result-object p5

    invoke-static {v1}, Lcom/facebook/react/modules/network/n;->i(Ljava/lang/String;)Z

    move-result p9

    if-eqz p9, :cond_c

    invoke-static {p5, p4}, Lcom/facebook/react/modules/network/n;->d(LT5/x;Ljava/lang/String;)LT5/C;

    move-result-object p4

    if-nez p4, :cond_17

    const-string p1, "Failed to gzip request body"

    invoke-static {v3, p3, p1, v0}, Lcom/facebook/react/modules/network/o;->f(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_c
    sget-object p9, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    if-nez p5, :cond_d

    goto :goto_1

    :cond_d
    invoke-virtual {p5, p9}, LT5/x;->c(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object p9

    :goto_1
    invoke-virtual {p4, p9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p4

    invoke-static {p5, p4}, LT5/C;->e(LT5/x;[B)LT5/C;

    move-result-object p4

    goto/16 :goto_3

    :cond_e
    const-string p4, "base64"

    invoke-interface {p5, p4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    if-nez p9, :cond_f

    invoke-static {v3, p3, v4, v0}, Lcom/facebook/react/modules/network/o;->f(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_f
    invoke-interface {p5, p4}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p9}, LT5/x;->f(Ljava/lang/String;)LT5/x;

    move-result-object p5

    invoke-static {p4}, Li6/i;->j(Ljava/lang/String;)Li6/i;

    move-result-object p4

    invoke-static {p5, p4}, LT5/C;->c(LT5/x;Li6/i;)LT5/C;

    move-result-object p4

    goto :goto_3

    :cond_10
    const-string p4, "uri"

    invoke-interface {p5, p4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_13

    if-nez p9, :cond_11

    invoke-static {v3, p3, v4, v0}, Lcom/facebook/react/modules/network/o;->f(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_11
    invoke-interface {p5, p4}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p5

    invoke-static {p5, p4}, Lcom/facebook/react/modules/network/n;->h(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p5

    if-nez p5, :cond_12

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Could not retrieve file for uri "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p3, p1, v0}, Lcom/facebook/react/modules/network/o;->f(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_12
    invoke-static {p9}, LT5/x;->f(Ljava/lang/String;)LT5/x;

    move-result-object p4

    invoke-static {p4, p5}, Lcom/facebook/react/modules/network/n;->c(LT5/x;Ljava/io/InputStream;)LT5/C;

    move-result-object p4

    goto :goto_3

    :cond_13
    const-string p4, "formData"

    invoke-interface {p5, p4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    if-nez p9, :cond_14

    const-string p9, "multipart/form-data"

    :cond_14
    invoke-interface {p5, p4}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object p4

    invoke-direct {p0, p4, p9, p3}, Lcom/facebook/react/modules/network/NetworkingModule;->constructMultipartBody(Lcom/facebook/react/bridge/ReadableArray;Ljava/lang/String;I)LT5/y$a;

    move-result-object p4

    if-nez p4, :cond_15

    return-void

    :cond_15
    invoke-virtual {p4}, LT5/y$a;->c()LT5/y;

    move-result-object p4

    goto :goto_3

    :cond_16
    :goto_2
    invoke-static {p1}, Lcom/facebook/react/modules/network/n;->g(Ljava/lang/String;)LT5/C;

    move-result-object p4

    :cond_17
    :goto_3
    invoke-direct {p0, p4, p3}, Lcom/facebook/react/modules/network/NetworkingModule;->wrapRequestBodyWithProgressEmitter(LT5/C;I)LT5/C;

    move-result-object p4

    invoke-virtual {p2, p1, p4}, LT5/B$a;->g(Ljava/lang/String;LT5/C;)LT5/B$a;

    invoke-direct {p0, p3}, Lcom/facebook/react/modules/network/NetworkingModule;->addRequest(I)V

    invoke-virtual {p2}, LT5/B$a;->b()LT5/B;

    move-result-object p1

    invoke-virtual {p8, p1}, LT5/z;->a(LT5/B;)LT5/e;

    move-result-object p1

    new-instance p2, Lcom/facebook/react/modules/network/NetworkingModule$b;

    move-object v0, p2

    move-object v1, p0

    move v2, p3

    move-object v4, p6

    move v5, p7

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/modules/network/NetworkingModule$b;-><init>(Lcom/facebook/react/modules/network/NetworkingModule;ILcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;Z)V

    invoke-interface {p1, p2}, LT5/e;->S0(LT5/f;)V

    return-void

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p3, p1, v0}, Lcom/facebook/react/modules/network/o;->f(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {v3, p3, p2, p1}, Lcom/facebook/react/modules/network/o;->f(Lcom/facebook/react/bridge/ReactApplicationContext;ILjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
