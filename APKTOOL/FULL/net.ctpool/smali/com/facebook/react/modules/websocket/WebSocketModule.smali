.class public final Lcom/facebook/react/modules/websocket/WebSocketModule;
.super Lcom/facebook/fbreact/specs/NativeWebSocketModuleSpec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/websocket/WebSocketModule$b;
    }
.end annotation

.annotation runtime Li2/a;
    name = "WebSocketModule"
.end annotation


# static fields
.field private static customClientBuilder:Lcom/facebook/react/modules/network/c;


# instance fields
.field private final mContentHandlers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/facebook/react/modules/websocket/WebSocketModule$b;",
            ">;"
        }
    .end annotation
.end field

.field private mCookieHandler:Lcom/facebook/react/modules/network/e;

.field private final mWebSocketConnections:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "LT5/H;",
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
    .locals 1

    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeWebSocketModuleSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mWebSocketConnections:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mContentHandlers:Ljava/util/Map;

    new-instance v0, Lcom/facebook/react/modules/network/e;

    invoke-direct {v0, p1}, Lcom/facebook/react/modules/network/e;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    iput-object v0, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mCookieHandler:Lcom/facebook/react/modules/network/e;

    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/react/modules/websocket/WebSocketModule;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mContentHandlers:Ljava/util/Map;

    return-object p0
.end method

.method private static applyCustomBuilder(LT5/z$a;)V
    .locals 0

    .line 1
    return-void
.end method

.method static bridge synthetic b(Lcom/facebook/react/modules/websocket/WebSocketModule;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mWebSocketConnections:Ljava/util/Map;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/facebook/react/modules/websocket/WebSocketModule;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/modules/websocket/WebSocketModule;->notifyWebSocketFailed(ILjava/lang/String;)V

    return-void
.end method

.method static bridge synthetic d(Lcom/facebook/react/modules/websocket/WebSocketModule;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/modules/websocket/WebSocketModule;->sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method

.method private getCookie(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/net/URI;

    invoke-static {p1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->getDefaultOrigin(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mCookieHandler:Lcom/facebook/react/modules/network/e;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v1, v0, v2}, Lcom/facebook/react/modules/network/e;->get(Ljava/net/URI;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "Cookie"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1

    :catch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to get cookie from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static getDefaultOrigin(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    :try_start_0
    const-string v0, ""

    new-instance v1, Ljava/net/URI;

    invoke-direct {v1, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v4, 0xedc

    const/4 v5, 0x1

    const/4 v6, 0x2

    const-string v7, "http"

    const/4 v8, 0x3

    const-string v9, "https"

    const/4 v10, -0x1

    if-eq v3, v4, :cond_3

    const v4, 0x1cd17

    if-eq v3, v4, :cond_2

    const v4, 0x310888    # 4.503E-39f

    if-eq v3, v4, :cond_1

    const v4, 0x5f008eb

    if-eq v3, v4, :cond_0

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v8

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v6

    goto :goto_1

    :cond_2
    const-string v3, "wss"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x0

    goto :goto_1

    :cond_3
    const-string v3, "ws"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v5

    goto :goto_1

    :cond_4
    :goto_0
    move v2, v10

    :goto_1
    if-eqz v2, :cond_7

    if-eq v2, v5, :cond_6

    if-eq v2, v6, :cond_5

    if-eq v2, v8, :cond_5

    goto :goto_3

    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :goto_3
    invoke-virtual {v1}, Ljava/net/URI;->getPort()I

    move-result v2

    if-eq v2, v10, :cond_8

    const-string v2, "%s://%s:%s"

    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Ljava/net/URI;->getPort()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v3, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_4

    :cond_8
    const-string v2, "%s://%s"

    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catch Ljava/net/URISyntaxException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_4
    return-object p0

    :catch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to set "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " as default origin header"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private notifyWebSocketFailed(ILjava/lang/String;)V
    .locals 2

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const-string v1, "id"

    invoke-interface {v0, v1, p1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string p1, "message"

    invoke-interface {v0, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "websocketFailed"

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/modules/websocket/WebSocketModule;->sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method

.method private sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/bridge/ReactContext;->emitDeviceEvent(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static setCustomClientBuilder(Lcom/facebook/react/modules/network/c;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public addListener(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public close(DLjava/lang/String;D)V
    .locals 1

    double-to-int p4, p4

    iget-object p5, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mWebSocketConnections:Ljava/util/Map;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, LT5/H;

    if-nez p5, :cond_0

    return-void

    :cond_0
    double-to-int p1, p1

    :try_start_0
    invoke-interface {p5, p1, p3}, LT5/H;->f(ILjava/lang/String;)Z

    iget-object p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mWebSocketConnections:Ljava/util/Map;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mContentHandlers:Ljava/util/Map;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Could not close WebSocket connection for id "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "ReactNative"

    invoke-static {p3, p2, p1}, LP0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public connect(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;D)V
    .locals 9

    double-to-int p4, p4

    new-instance p5, LT5/z$a;

    invoke-direct {p5}, LT5/z$a;-><init>()V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xa

    invoke-virtual {p5, v1, v2, v0}, LT5/z$a;->e(JLjava/util/concurrent/TimeUnit;)LT5/z$a;

    move-result-object p5

    invoke-virtual {p5, v1, v2, v0}, LT5/z$a;->N(JLjava/util/concurrent/TimeUnit;)LT5/z$a;

    move-result-object p5

    const-wide/16 v0, 0x0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p5, v0, v1, v2}, LT5/z$a;->M(JLjava/util/concurrent/TimeUnit;)LT5/z$a;

    move-result-object p5

    invoke-static {p5}, Lcom/facebook/react/modules/websocket/WebSocketModule;->applyCustomBuilder(LT5/z$a;)V

    invoke-virtual {p5}, LT5/z$a;->b()LT5/z;

    move-result-object p5

    new-instance v0, LT5/B$a;

    invoke-direct {v0}, LT5/B$a;-><init>()V

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, LT5/B$a;->k(Ljava/lang/Object;)LT5/B$a;

    move-result-object v0

    invoke-virtual {v0, p1}, LT5/B$a;->m(Ljava/lang/String;)LT5/B$a;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "Cookie"

    invoke-virtual {v0, v2, v1}, LT5/B$a;->a(Ljava/lang/String;Ljava/lang/String;)LT5/B$a;

    :cond_0
    const-string v1, "origin"

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p3, :cond_3

    const-string v4, "headers"

    invoke-interface {p3, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p3, v4}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v5

    sget-object v6, Lcom/facebook/react/bridge/ReadableType;->Map:Lcom/facebook/react/bridge/ReadableType;

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p3, v4}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p3

    invoke-interface {p3}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    move-result-object v4

    move v5, v2

    :goto_0
    invoke-interface {v4}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->hasNextKey()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    invoke-interface {p3, v6}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v6, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v5, v3

    :cond_1
    invoke-interface {p3, v6}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, LT5/B$a;->a(Ljava/lang/String;Ljava/lang/String;)LT5/B$a;

    goto :goto_0

    :cond_2
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Ignoring: requested "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", value not a string"

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "ReactNative"

    invoke-static {v7, v6}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move v5, v2

    :cond_4
    if-nez v5, :cond_5

    invoke-static {p1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->getDefaultOrigin(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, LT5/B$a;->a(Ljava/lang/String;Ljava/lang/String;)LT5/B$a;

    :cond_5
    if-eqz p2, :cond_8

    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result p1

    if-lez p1, :cond_8

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, ""

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_1
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v1

    if-ge v2, v1, :cond_7

    invoke-interface {p2, v2}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_6

    const-string v4, ","

    invoke-virtual {v1, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_6

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    if-lez p2, :cond_8

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    sub-int/2addr p2, v3

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {p1, p2, v1, p3}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "Sec-WebSocket-Protocol"

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, LT5/B$a;->a(Ljava/lang/String;Ljava/lang/String;)LT5/B$a;

    :cond_8
    invoke-virtual {v0}, LT5/B$a;->b()LT5/B;

    move-result-object p1

    new-instance p2, Lcom/facebook/react/modules/websocket/WebSocketModule$a;

    invoke-direct {p2, p0, p4}, Lcom/facebook/react/modules/websocket/WebSocketModule$a;-><init>(Lcom/facebook/react/modules/websocket/WebSocketModule;I)V

    invoke-virtual {p5, p1, p2}, LT5/z;->C(LT5/B;LT5/I;)LT5/H;

    invoke-virtual {p5}, LT5/z;->q()LT5/p;

    move-result-object p1

    invoke-virtual {p1}, LT5/p;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method public invalidate()V
    .locals 4

    iget-object v0, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mWebSocketConnections:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LT5/H;

    const/16 v2, 0x3e9

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, LT5/H;->f(ILjava/lang/String;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mWebSocketConnections:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mContentHandlers:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public ping(D)V
    .locals 3

    double-to-int p1, p1

    iget-object p2, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mWebSocketConnections:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LT5/H;

    if-nez p2, :cond_0

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p2

    const-string v0, "id"

    invoke-interface {p2, v0, p1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v1, "message"

    const-string v2, "client is null"

    invoke-interface {p2, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "websocketFailed"

    invoke-direct {p0, v1, p2}, Lcom/facebook/react/modules/websocket/WebSocketModule;->sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p2

    invoke-interface {p2, v0, p1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v0, "code"

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v0, "reason"

    invoke-interface {p2, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "websocketClosed"

    invoke-direct {p0, v0, p2}, Lcom/facebook/react/modules/websocket/WebSocketModule;->sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    iget-object p2, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mWebSocketConnections:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mContentHandlers:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    :try_start_0
    sget-object v0, Li6/i;->p:Li6/i;

    invoke-interface {p2, v0}, LT5/H;->c(Li6/i;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/modules/websocket/WebSocketModule;->notifyWebSocketFailed(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public removeListeners(D)V
    .locals 0

    return-void
.end method

.method public send(Ljava/lang/String;D)V
    .locals 2

    double-to-int p2, p2

    iget-object p3, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mWebSocketConnections:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LT5/H;

    if-nez p3, :cond_0

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    const-string p3, "id"

    invoke-interface {p1, p3, p2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v0, "message"

    const-string v1, "client is null"

    invoke-interface {p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "websocketFailed"

    invoke-direct {p0, v0, p1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p1, p3, p2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string p3, "code"

    const/4 v0, 0x0

    invoke-interface {p1, p3, v0}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string p3, "reason"

    invoke-interface {p1, p3, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "websocketClosed"

    invoke-direct {p0, p3, p1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    iget-object p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mWebSocketConnections:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mContentHandlers:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    :try_start_0
    invoke-interface {p3, p1}, LT5/H;->b(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->notifyWebSocketFailed(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public sendBinary(Li6/i;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mWebSocketConnections:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT5/H;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    const-string v0, "id"

    invoke-interface {p1, v0, p2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v1, "message"

    const-string v2, "client is null"

    invoke-interface {p1, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "websocketFailed"

    invoke-direct {p0, v1, p1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p1, v0, p2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v0, "code"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v0, "reason"

    invoke-interface {p1, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "websocketClosed"

    invoke-direct {p0, v0, p1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    iget-object p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mWebSocketConnections:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mContentHandlers:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    :try_start_0
    invoke-interface {v0, p1}, LT5/H;->c(Li6/i;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->notifyWebSocketFailed(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public sendBinary(Ljava/lang/String;D)V
    .locals 2

    .line 2
    double-to-int p2, p2

    iget-object p3, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mWebSocketConnections:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LT5/H;

    if-nez p3, :cond_0

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    const-string p3, "id"

    invoke-interface {p1, p3, p2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v0, "message"

    const-string v1, "client is null"

    invoke-interface {p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "websocketFailed"

    invoke-direct {p0, v0, p1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object p1

    invoke-interface {p1, p3, p2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string p3, "code"

    const/4 v0, 0x0

    invoke-interface {p1, p3, v0}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string p3, "reason"

    invoke-interface {p1, p3, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "websocketClosed"

    invoke-direct {p0, p3, p1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->sendEvent(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    iget-object p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mWebSocketConnections:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mContentHandlers:Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    :try_start_0
    invoke-static {p1}, Li6/i;->j(Ljava/lang/String;)Li6/i;

    move-result-object p1

    invoke-interface {p3, p1}, LT5/H;->c(Li6/i;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p2, p1}, Lcom/facebook/react/modules/websocket/WebSocketModule;->notifyWebSocketFailed(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public setContentHandler(ILcom/facebook/react/modules/websocket/WebSocketModule$b;)V
    .locals 1

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mContentHandlers:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/facebook/react/modules/websocket/WebSocketModule;->mContentHandlers:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method
