.class Lcom/reactnativecommunity/webview/d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativecommunity/webview/d$a;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/MenuItem;

.field final synthetic b:Lcom/facebook/react/bridge/WritableMap;

.field final synthetic c:Landroid/view/ActionMode;

.field final synthetic d:Lcom/reactnativecommunity/webview/d$a;


# direct methods
.method constructor <init>(Lcom/reactnativecommunity/webview/d$a;Landroid/view/MenuItem;Lcom/facebook/react/bridge/WritableMap;Landroid/view/ActionMode;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativecommunity/webview/d$a$a;->d:Lcom/reactnativecommunity/webview/d$a;

    iput-object p2, p0, Lcom/reactnativecommunity/webview/d$a$a;->a:Landroid/view/MenuItem;

    iput-object p3, p0, Lcom/reactnativecommunity/webview/d$a$a;->b:Lcom/facebook/react/bridge/WritableMap;

    iput-object p4, p0, Lcom/reactnativecommunity/webview/d$a$a;->c:Landroid/view/ActionMode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/reactnativecommunity/webview/d$a$a;->d:Lcom/reactnativecommunity/webview/d$a;

    iget-object v0, v0, Lcom/reactnativecommunity/webview/d$a;->b:Lcom/reactnativecommunity/webview/d;

    iget-object v0, v0, Lcom/reactnativecommunity/webview/d;->A:Ljava/util/List;

    iget-object v1, p0, Lcom/reactnativecommunity/webview/d$a$a;->a:Landroid/view/MenuItem;

    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Lcom/reactnativecommunity/webview/d$a$a;->b:Lcom/facebook/react/bridge/WritableMap;

    const-string v2, "label"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/reactnativecommunity/webview/d$a$a;->b:Lcom/facebook/react/bridge/WritableMap;

    const-string v2, "key"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "selection"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, ""

    :goto_0
    iget-object v0, p0, Lcom/reactnativecommunity/webview/d$a$a;->b:Lcom/facebook/react/bridge/WritableMap;

    const-string v1, "selectedText"

    invoke-interface {v0, v1, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/reactnativecommunity/webview/d$a$a;->d:Lcom/reactnativecommunity/webview/d$a;

    iget-object p1, p1, Lcom/reactnativecommunity/webview/d$a;->b:Lcom/reactnativecommunity/webview/d;

    new-instance v0, La5/a;

    iget-object v1, p0, Lcom/reactnativecommunity/webview/d$a$a;->d:Lcom/reactnativecommunity/webview/d$a;

    iget-object v1, v1, Lcom/reactnativecommunity/webview/d$a;->b:Lcom/reactnativecommunity/webview/d;

    invoke-static {v1}, Lcom/reactnativecommunity/webview/o;->a(Landroid/webkit/WebView;)I

    move-result v1

    iget-object v2, p0, Lcom/reactnativecommunity/webview/d$a$a;->b:Lcom/facebook/react/bridge/WritableMap;

    invoke-direct {v0, v1, v2}, La5/a;-><init>(ILcom/facebook/react/bridge/WritableMap;)V

    invoke-virtual {p1, p1, v0}, Lcom/reactnativecommunity/webview/d;->g(Landroid/webkit/WebView;Lcom/facebook/react/uimanager/events/d;)V

    iget-object p1, p0, Lcom/reactnativecommunity/webview/d$a$a;->c:Landroid/view/ActionMode;

    invoke-virtual {p1}, Landroid/view/ActionMode;->finish()V

    return-void
.end method

.method public bridge synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/reactnativecommunity/webview/d$a$a;->a(Ljava/lang/String;)V

    return-void
.end method
