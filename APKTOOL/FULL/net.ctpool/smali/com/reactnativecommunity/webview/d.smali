.class public Lcom/reactnativecommunity/webview/d;
.super Landroid/webkit/WebView;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativecommunity/webview/d$c;,
        Lcom/reactnativecommunity/webview/d$d;
    }
.end annotation


# instance fields
.field protected A:Ljava/util/List;

.field B:Landroid/webkit/WebChromeClient;

.field protected m:Ljava/lang/String;

.field protected n:Ljava/lang/String;

.field protected o:Lcom/reactnativecommunity/webview/d$d;

.field protected p:Z

.field protected q:Z

.field protected r:Z

.field protected s:Ljava/lang/String;

.field protected t:Lcom/reactnativecommunity/webview/RNCWebViewMessagingModule;

.field protected u:Lcom/reactnativecommunity/webview/f;

.field protected v:Z

.field private w:LK2/b;

.field protected x:Z

.field protected y:Z

.field protected z:Lcom/reactnativecommunity/webview/d$c;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/e0;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/reactnativecommunity/webview/d;->p:Z

    iput-boolean p1, p0, Lcom/reactnativecommunity/webview/d;->q:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/reactnativecommunity/webview/d;->r:Z

    iput-boolean p1, p0, Lcom/reactnativecommunity/webview/d;->v:Z

    iput-boolean p1, p0, Lcom/reactnativecommunity/webview/d;->x:Z

    iput-boolean p1, p0, Lcom/reactnativecommunity/webview/d;->y:Z

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/e0;

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/e0;->b()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    const-class v0, Lcom/reactnativecommunity/webview/RNCWebViewMessagingModule;

    invoke-virtual {p1, v0}, Lcom/facebook/react/bridge/ReactContext;->getJSModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/JavaScriptModule;

    move-result-object p1

    check-cast p1, Lcom/reactnativecommunity/webview/RNCWebViewMessagingModule;

    iput-object p1, p0, Lcom/reactnativecommunity/webview/d;->t:Lcom/reactnativecommunity/webview/RNCWebViewMessagingModule;

    new-instance p1, Lcom/reactnativecommunity/webview/d$c;

    invoke-direct {p1}, Lcom/reactnativecommunity/webview/d$c;-><init>()V

    iput-object p1, p0, Lcom/reactnativecommunity/webview/d;->z:Lcom/reactnativecommunity/webview/d$c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getJavaScriptEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d;->m:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(function() {\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/reactnativecommunity/webview/d;->m:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";\n})();"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/reactnativecommunity/webview/d;->h(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getJavaScriptEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d;->n:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(function() {\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/reactnativecommunity/webview/d;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";\n})();"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/reactnativecommunity/webview/d;->h(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected c()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/reactnativecommunity/webview/d;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/d;->destroy()V

    return-void
.end method

.method protected d(Lcom/reactnativecommunity/webview/d;)Lcom/reactnativecommunity/webview/d$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativecommunity/webview/d;->o:Lcom/reactnativecommunity/webview/d$d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/reactnativecommunity/webview/d$d;

    invoke-direct {v0, p0, p1}, Lcom/reactnativecommunity/webview/d$d;-><init>(Lcom/reactnativecommunity/webview/d;Lcom/reactnativecommunity/webview/d;)V

    iput-object v0, p0, Lcom/reactnativecommunity/webview/d;->o:Lcom/reactnativecommunity/webview/d$d;

    const-string p1, "ReactNativeWebView"

    invoke-virtual {p0, v0, p1}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/reactnativecommunity/webview/d;->o:Lcom/reactnativecommunity/webview/d$d;

    return-object p1
.end method

.method public destroy()V
    .locals 1

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d;->B:Landroid/webkit/WebChromeClient;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/webkit/WebChromeClient;->onHideCustomView()V

    :cond_0
    invoke-super {p0}, Landroid/webkit/WebView;->destroy()V

    return-void
.end method

.method protected e(Lcom/facebook/react/bridge/WritableMap;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    const-string v1, "nativeEvent"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/bridge/WritableNativeMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    const-string p1, "messagingModuleName"

    iget-object v1, p0, Lcom/reactnativecommunity/webview/d;->s:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/reactnativecommunity/webview/d;->t:Lcom/reactnativecommunity/webview/RNCWebViewMessagingModule;

    invoke-interface {p1, v0}, Lcom/reactnativecommunity/webview/RNCWebViewMessagingModule;->onMessage(Lcom/facebook/react/bridge/WritableMap;)V

    return-void
.end method

.method protected f(Lcom/facebook/react/bridge/WritableMap;)Z
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    const-string v1, "nativeEvent"

    invoke-virtual {v0, v1, p1}, Lcom/facebook/react/bridge/WritableNativeMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    const-string p1, "messagingModuleName"

    iget-object v1, p0, Lcom/reactnativecommunity/webview/d;->s:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lcom/facebook/react/bridge/WritableNativeMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/reactnativecommunity/webview/d;->t:Lcom/reactnativecommunity/webview/RNCWebViewMessagingModule;

    invoke-interface {p1, v0}, Lcom/reactnativecommunity/webview/RNCWebViewMessagingModule;->onShouldStartLoadWithRequest(Lcom/facebook/react/bridge/WritableMap;)V

    const/4 p1, 0x1

    return p1
.end method

.method protected g(Landroid/webkit/WebView;Lcom/facebook/react/uimanager/events/d;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/d;->getThemedReactContext()Lcom/facebook/react/uimanager/e0;

    move-result-object v0

    invoke-static {p1}, Lcom/reactnativecommunity/webview/o;->a(Landroid/webkit/WebView;)I

    move-result p1

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method public getMessagingEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/reactnativecommunity/webview/d;->r:Z

    return v0
.end method

.method public getRNCWebViewClient()Lcom/reactnativecommunity/webview/f;
    .locals 1

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d;->u:Lcom/reactnativecommunity/webview/f;

    return-object v0
.end method

.method public getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 1

    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/d;->getThemedReactContext()Lcom/facebook/react/uimanager/e0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/e0;->b()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object v0

    return-object v0
.end method

.method public getThemedReactContext()Lcom/facebook/react/uimanager/e0;
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/e0;

    return-object v0
.end method

.method public getWebChromeClient()Landroid/webkit/WebChromeClient;
    .locals 1

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d;->B:Landroid/webkit/WebChromeClient;

    return-object v0
.end method

.method protected h(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/d;->getThemedReactContext()Lcom/facebook/react/uimanager/e0;

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d;->u:Lcom/reactnativecommunity/webview/f;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/reactnativecommunity/webview/d$b;

    invoke-direct {v0, p0, p0, p1}, Lcom/reactnativecommunity/webview/d$b;-><init>(Lcom/reactnativecommunity/webview/d;Landroid/webkit/WebView;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    const-string v1, "data"

    invoke-interface {v0, v1, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/reactnativecommunity/webview/d;->t:Lcom/reactnativecommunity/webview/RNCWebViewMessagingModule;

    if-eqz p1, :cond_1

    invoke-virtual {p0, v0}, Lcom/reactnativecommunity/webview/d;->e(Lcom/facebook/react/bridge/WritableMap;)V

    goto :goto_0

    :cond_1
    new-instance p1, La5/g;

    invoke-static {p0}, Lcom/reactnativecommunity/webview/o;->a(Landroid/webkit/WebView;)I

    move-result v1

    invoke-direct {p1, v1, v0}, La5/g;-><init>(ILcom/facebook/react/bridge/WritableMap;)V

    invoke-virtual {p0, p0, p1}, Lcom/reactnativecommunity/webview/d;->g(Landroid/webkit/WebView;Lcom/facebook/react/uimanager/events/d;)V

    :goto_0
    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/d;->c()V

    return-void
.end method

.method public onHostPause()V
    .locals 0

    return-void
.end method

.method public onHostResume()V
    .locals 0

    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 10

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebView;->onScrollChanged(IIII)V

    iget-boolean p3, p0, Lcom/reactnativecommunity/webview/d;->x:Z

    if-nez p3, :cond_0

    return-void

    :cond_0
    iget-object p3, p0, Lcom/reactnativecommunity/webview/d;->w:LK2/b;

    if-nez p3, :cond_1

    new-instance p3, LK2/b;

    invoke-direct {p3}, LK2/b;-><init>()V

    iput-object p3, p0, Lcom/reactnativecommunity/webview/d;->w:LK2/b;

    :cond_1
    iget-object p3, p0, Lcom/reactnativecommunity/webview/d;->w:LK2/b;

    invoke-virtual {p3, p1, p2}, LK2/b;->c(II)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p0}, Lcom/reactnativecommunity/webview/o;->a(Landroid/webkit/WebView;)I

    move-result v0

    sget-object v1, Lcom/facebook/react/views/scroll/h;->p:Lcom/facebook/react/views/scroll/h;

    int-to-float v2, p1

    int-to-float v3, p2

    iget-object p1, p0, Lcom/reactnativecommunity/webview/d;->w:LK2/b;

    invoke-virtual {p1}, LK2/b;->a()F

    move-result v4

    iget-object p1, p0, Lcom/reactnativecommunity/webview/d;->w:LK2/b;

    invoke-virtual {p1}, LK2/b;->b()F

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->computeHorizontalScrollRange()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/View;->computeVerticalScrollRange()I

    move-result v7

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v8

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/facebook/react/views/scroll/g;->e(ILcom/facebook/react/views/scroll/h;FFFFIIII)Lcom/facebook/react/views/scroll/g;

    move-result-object p1

    invoke-virtual {p0, p0, p1}, Lcom/reactnativecommunity/webview/d;->g(Landroid/webkit/WebView;Lcom/facebook/react/uimanager/events/d;)V

    :cond_2
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebView;->onSizeChanged(IIII)V

    iget-boolean p3, p0, Lcom/reactnativecommunity/webview/d;->v:Z

    if-eqz p3, :cond_0

    new-instance p3, Lcom/facebook/react/uimanager/events/c;

    invoke-static {p0}, Lcom/reactnativecommunity/webview/o;->a(Landroid/webkit/WebView;)I

    move-result p4

    invoke-direct {p3, p4, p1, p2}, Lcom/facebook/react/uimanager/events/c;-><init>(III)V

    invoke-virtual {p0, p0, p3}, Lcom/reactnativecommunity/webview/d;->g(Landroid/webkit/WebView;Lcom/facebook/react/uimanager/events/d;)V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/reactnativecommunity/webview/d;->y:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    :cond_0
    invoke-super {p0, p1}, Landroid/webkit/WebView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setBasicAuthCredential(Lcom/reactnativecommunity/webview/a;)V
    .locals 1

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d;->u:Lcom/reactnativecommunity/webview/f;

    invoke-virtual {v0, p1}, Lcom/reactnativecommunity/webview/f;->c(Lcom/reactnativecommunity/webview/a;)V

    return-void
.end method

.method public setHasScrollEvent(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/reactnativecommunity/webview/d;->x:Z

    return-void
.end method

.method public setIgnoreErrFailedForThisURL(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d;->u:Lcom/reactnativecommunity/webview/f;

    invoke-virtual {v0, p1}, Lcom/reactnativecommunity/webview/f;->d(Ljava/lang/String;)V

    return-void
.end method

.method public setInjectedJavaScriptObject(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getJavaScriptEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p0}, Lcom/reactnativecommunity/webview/d;->d(Lcom/reactnativecommunity/webview/d;)Lcom/reactnativecommunity/webview/d$d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/reactnativecommunity/webview/d$d;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setMenuCustomItems(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/reactnativecommunity/webview/d;->A:Ljava/util/List;

    return-void
.end method

.method public setMessagingEnabled(Z)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "AddJavascriptInterface"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/reactnativecommunity/webview/d;->r:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/reactnativecommunity/webview/d;->r:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0, p0}, Lcom/reactnativecommunity/webview/d;->d(Lcom/reactnativecommunity/webview/d;)Lcom/reactnativecommunity/webview/d$d;

    :cond_1
    return-void
.end method

.method public setNestedScrollEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/reactnativecommunity/webview/d;->y:Z

    return-void
.end method

.method public setSendContentSizeChangeEvents(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/reactnativecommunity/webview/d;->v:Z

    return-void
.end method

.method public setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    .locals 1

    iput-object p1, p0, Lcom/reactnativecommunity/webview/d;->B:Landroid/webkit/WebChromeClient;

    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    instance-of v0, p1, Lcom/reactnativecommunity/webview/c;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/reactnativecommunity/webview/c;

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d;->z:Lcom/reactnativecommunity/webview/d$c;

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/c;->h(Lcom/reactnativecommunity/webview/d$c;)V

    :cond_0
    return-void
.end method

.method public setWebViewClient(Landroid/webkit/WebViewClient;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    instance-of v0, p1, Lcom/reactnativecommunity/webview/f;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/reactnativecommunity/webview/f;

    iput-object p1, p0, Lcom/reactnativecommunity/webview/d;->u:Lcom/reactnativecommunity/webview/f;

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d;->z:Lcom/reactnativecommunity/webview/d$c;

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/f;->e(Lcom/reactnativecommunity/webview/d$c;)V

    :cond_0
    return-void
.end method

.method public startActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 1

    iget-object v0, p0, Lcom/reactnativecommunity/webview/d;->A:Ljava/util/List;

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/view/View;->startActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lcom/reactnativecommunity/webview/d$a;

    invoke-direct {v0, p0, p1}, Lcom/reactnativecommunity/webview/d$a;-><init>(Lcom/reactnativecommunity/webview/d;Landroid/view/ActionMode$Callback;)V

    invoke-super {p0, v0, p2}, Landroid/view/View;->startActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method
