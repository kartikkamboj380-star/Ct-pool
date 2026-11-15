.class Lcom/facebook/react/devsupport/L$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/Inspector$RemoteConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/L;->g(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/react/devsupport/L;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/L;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/devsupport/L$a;->b:Lcom/facebook/react/devsupport/L;

    iput-object p2, p0, Lcom/facebook/react/devsupport/L$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDisconnect()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/L$a;->b:Lcom/facebook/react/devsupport/L;

    invoke-static {v0}, Lcom/facebook/react/devsupport/L;->a(Lcom/facebook/react/devsupport/L;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/devsupport/L$a;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/react/devsupport/L$a;->b:Lcom/facebook/react/devsupport/L;

    const-string v1, "disconnect"

    iget-object v2, p0, Lcom/facebook/react/devsupport/L$a;->a:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/facebook/react/devsupport/L;->b(Lcom/facebook/react/devsupport/L;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/facebook/react/devsupport/L;->c(Lcom/facebook/react/devsupport/L;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "InspectorPackagerConnection"

    const-string v2, "Couldn\'t send event to packager"

    invoke-static {v1, v2, v0}, LP0/a;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public onMessage(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/facebook/react/devsupport/L$a;->b:Lcom/facebook/react/devsupport/L;

    iget-object v1, p0, Lcom/facebook/react/devsupport/L$a;->a:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/facebook/react/devsupport/L;->d(Lcom/facebook/react/devsupport/L;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "InspectorPackagerConnection"

    const-string v1, "Couldn\'t send event to packager"

    invoke-static {v0, v1, p1}, LP0/a;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
