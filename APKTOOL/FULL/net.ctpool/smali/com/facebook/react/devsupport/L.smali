.class public Lcom/facebook/react/devsupport/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/devsupport/K;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/L$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/facebook/react/devsupport/L$b;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/facebook/react/devsupport/L$b;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/devsupport/L$b;-><init>(Lcom/facebook/react/devsupport/L;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/facebook/react/devsupport/L;->a:Lcom/facebook/react/devsupport/L$b;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/devsupport/L;->b:Ljava/util/Map;

    iput-object p2, p0, Lcom/facebook/react/devsupport/L;->c:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/react/devsupport/L;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/L;->b:Ljava/util/Map;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/facebook/react/devsupport/L;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/L;->k(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method static bridge synthetic c(Lcom/facebook/react/devsupport/L;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/devsupport/L;->l(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method static bridge synthetic d(Lcom/facebook/react/devsupport/L;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/devsupport/L;->m(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private f()Lorg/json/JSONArray;
    .locals 6

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Inspector;->getPages()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/bridge/Inspector$Page;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v2}, Lcom/facebook/react/bridge/Inspector$Page;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "id"

    invoke-virtual {v3, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "title"

    invoke-virtual {v2}, Lcom/facebook/react/bridge/Inspector$Page;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "app"

    iget-object v5, p0, Lcom/facebook/react/devsupport/L;->c:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "vm"

    invoke-virtual {v2}, Lcom/facebook/react/bridge/Inspector$Page;->getVM()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private g(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    const-string v0, "pageId"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/react/devsupport/L;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/bridge/Inspector$LocalConnection;

    if-nez v0, :cond_0

    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    new-instance v1, Lcom/facebook/react/devsupport/L$a;

    invoke-direct {v1, p0, p1}, Lcom/facebook/react/devsupport/L$a;-><init>(Lcom/facebook/react/devsupport/L;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/Inspector;->connect(ILcom/facebook/react/bridge/Inspector$RemoteConnection;)Lcom/facebook/react/bridge/Inspector$LocalConnection;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/devsupport/L;->b:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to open page: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "InspectorPackagerConnection"

    invoke-static {v2, v1, v0}, LP0/a;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v0, "disconnect"

    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/L;->k(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/facebook/react/devsupport/L;->l(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Already connected: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private h(Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    const-string v0, "pageId"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/react/devsupport/L;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/Inspector$LocalConnection;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/bridge/Inspector$LocalConnection;->disconnect()V

    return-void
.end method

.method private j(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    const-string v0, "pageId"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "wrappedEvent"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/facebook/react/devsupport/L;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/bridge/Inspector$LocalConnection;

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "PageID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is disconnected. Dropping event: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "InspectorPackagerConnection"

    invoke-static {v0, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v1, p1}, Lcom/facebook/react/bridge/Inspector$LocalConnection;->sendMessage(Ljava/lang/String;)V

    return-void
.end method

.method private k(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "pageId"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method private l(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "event"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "payload"

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p0, Lcom/facebook/react/devsupport/L;->a:Lcom/facebook/react/devsupport/L$b;

    invoke-virtual {p1, v0}, Lcom/facebook/react/devsupport/L$b;->m(Lorg/json/JSONObject;)V

    return-void
.end method

.method private m(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "pageId"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "wrappedEvent"

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/devsupport/L;->l(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public closeQuietly()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/L;->a:Lcom/facebook/react/devsupport/L$b;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/L$b;->i()V

    return-void
.end method

.method public connect()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/L;->a:Lcom/facebook/react/devsupport/L$b;

    invoke-virtual {v0}, Lcom/facebook/react/devsupport/L$b;->k()V

    return-void
.end method

.method e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/L;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/bridge/Inspector$LocalConnection;

    invoke-virtual {v1}, Lcom/facebook/react/bridge/Inspector$LocalConnection;->disconnect()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/L;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method i(Lorg/json/JSONObject;)V
    .locals 5

    .line 1
    const-string v0, "getPages"

    const-string v1, "event"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    const-string v2, "payload"

    const/4 v3, -0x1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_1
    const-string v4, "wrappedEvent"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_2
    const-string v4, "connect"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_3
    const-string v4, "disconnect"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown event: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-direct {p0}, Lcom/facebook/react/devsupport/L;->f()Lorg/json/JSONArray;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/facebook/react/devsupport/L;->l(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/L;->j(Lorg/json/JSONObject;)V

    goto :goto_1

    :pswitch_2
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/L;->g(Lorg/json/JSONObject;)V

    goto :goto_1

    :pswitch_3
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/react/devsupport/L;->h(Lorg/json/JSONObject;)V

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1f9d589c -> :sswitch_3
        0x38b478ea -> :sswitch_2
        0x4f310915 -> :sswitch_1
        0x74f5960e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public sendEventToAllConnections(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/devsupport/L;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/bridge/Inspector$LocalConnection;

    invoke-virtual {v1, p1}, Lcom/facebook/react/bridge/Inspector$LocalConnection;->sendMessage(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method
