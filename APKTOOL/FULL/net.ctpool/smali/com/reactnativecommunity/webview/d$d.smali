.class public Lcom/reactnativecommunity/webview/d$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativecommunity/webview/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "d"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field b:Lcom/reactnativecommunity/webview/d;

.field c:Ljava/lang/String;

.field final synthetic d:Lcom/reactnativecommunity/webview/d;


# direct methods
.method constructor <init>(Lcom/reactnativecommunity/webview/d;Lcom/reactnativecommunity/webview/d;)V
    .locals 0

    iput-object p1, p0, Lcom/reactnativecommunity/webview/d$d;->d:Lcom/reactnativecommunity/webview/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "RNCWebViewBridge"

    iput-object p1, p0, Lcom/reactnativecommunity/webview/d$d;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/reactnativecommunity/webview/d$d;->b:Lcom/reactnativecommunity/webview/d;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/reactnativecommunity/webview/d$d;->c:Ljava/lang/String;

    return-void
.end method

.method public injectedObjectJson()Ljava/lang/String;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public postMessage(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d$d;->b:Lcom/reactnativecommunity/webview/d;

    invoke-virtual {v0}, Lcom/reactnativecommunity/webview/d;->getMessagingEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d$d;->b:Lcom/reactnativecommunity/webview/d;

    invoke-virtual {v0, p1}, Lcom/reactnativecommunity/webview/d;->i(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/reactnativecommunity/webview/d$d;->a:Ljava/lang/String;

    const-string v0, "ReactNativeWebView.postMessage method was called but messaging is disabled. Pass an onMessage handler to the WebView."

    invoke-static {p1, v0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
