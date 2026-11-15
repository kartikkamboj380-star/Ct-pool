.class Lcom/reactnativecommunity/webview/d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativecommunity/webview/d;->i(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:Landroid/webkit/WebView;

.field final synthetic n:Ljava/lang/String;

.field final synthetic o:Lcom/reactnativecommunity/webview/d;


# direct methods
.method constructor <init>(Lcom/reactnativecommunity/webview/d;Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativecommunity/webview/d$b;->o:Lcom/reactnativecommunity/webview/d;

    iput-object p2, p0, Lcom/reactnativecommunity/webview/d$b;->m:Landroid/webkit/WebView;

    iput-object p3, p0, Lcom/reactnativecommunity/webview/d$b;->n:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d$b;->o:Lcom/reactnativecommunity/webview/d;

    iget-object v0, v0, Lcom/reactnativecommunity/webview/d;->u:Lcom/reactnativecommunity/webview/f;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/reactnativecommunity/webview/d$b;->m:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/reactnativecommunity/webview/f;->a(Landroid/webkit/WebView;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const-string v1, "data"

    iget-object v2, p0, Lcom/reactnativecommunity/webview/d$b;->n:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/reactnativecommunity/webview/d$b;->o:Lcom/reactnativecommunity/webview/d;

    iget-object v2, v1, Lcom/reactnativecommunity/webview/d;->t:Lcom/reactnativecommunity/webview/RNCWebViewMessagingModule;

    if-eqz v2, :cond_1

    invoke-virtual {v1, v0}, Lcom/reactnativecommunity/webview/d;->e(Lcom/facebook/react/bridge/WritableMap;)V

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/reactnativecommunity/webview/d$b;->m:Landroid/webkit/WebView;

    new-instance v3, La5/g;

    iget-object v4, p0, Lcom/reactnativecommunity/webview/d$b;->m:Landroid/webkit/WebView;

    invoke-static {v4}, Lcom/reactnativecommunity/webview/o;->a(Landroid/webkit/WebView;)I

    move-result v4

    invoke-direct {v3, v4, v0}, La5/g;-><init>(ILcom/facebook/react/bridge/WritableMap;)V

    invoke-virtual {v1, v2, v3}, Lcom/reactnativecommunity/webview/d;->g(Landroid/webkit/WebView;Lcom/facebook/react/uimanager/events/d;)V

    :goto_0
    return-void
.end method
