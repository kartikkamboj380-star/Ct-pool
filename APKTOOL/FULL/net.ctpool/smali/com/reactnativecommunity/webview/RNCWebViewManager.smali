.class public Lcom/reactnativecommunity/webview/RNCWebViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/reactnativecommunity/webview/o;",
        ">;"
    }
.end annotation


# instance fields
.field private final mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    new-instance v0, Lcom/reactnativecommunity/webview/j;

    invoke-direct {v0}, Lcom/reactnativecommunity/webview/j;-><init>()V

    iput-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    return-void
.end method


# virtual methods
.method protected bridge synthetic addEventEmitters(Lcom/facebook/react/uimanager/e0;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/reactnativecommunity/webview/o;

    invoke-virtual {p0, p1, p2}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->addEventEmitters(Lcom/facebook/react/uimanager/e0;Lcom/reactnativecommunity/webview/o;)V

    return-void
.end method

.method protected addEventEmitters(Lcom/facebook/react/uimanager/e0;Lcom/reactnativecommunity/webview/o;)V
    .locals 0

    .line 2
    invoke-virtual {p2}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    new-instance p2, Lcom/reactnativecommunity/webview/f;

    invoke-direct {p2}, Lcom/reactnativecommunity/webview/f;-><init>()V

    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/d;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    return-void
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/reactnativecommunity/webview/o;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/reactnativecommunity/webview/o;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1}, Lcom/reactnativecommunity/webview/j;->d(Lcom/facebook/react/uimanager/e0;)Lcom/reactnativecommunity/webview/o;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/e0;Lcom/reactnativecommunity/webview/d;)Lcom/reactnativecommunity/webview/o;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->e(Lcom/facebook/react/uimanager/e0;Lcom/reactnativecommunity/webview/d;)Lcom/reactnativecommunity/webview/o;

    move-result-object p1

    return-object p1
.end method

.method public getCommandsMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0}, Lcom/reactnativecommunity/webview/j;->g()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/facebook/react/uimanager/BaseViewManager;->getExportedCustomDirectEventTypeConstants()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, LS1/f;->b()Ljava/util/HashMap;

    move-result-object v0

    :cond_0
    const-string v1, "onLoadingStart"

    const-string v2, "registrationName"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topLoadingStart"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onLoadingFinish"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topLoadingFinish"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onLoadingError"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topLoadingError"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onMessage"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topMessage"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onLoadingProgress"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topLoadingProgress"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onShouldStartLoadWithRequest"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topShouldStartLoadWithRequest"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/facebook/react/views/scroll/h;->p:Lcom/facebook/react/views/scroll/h;

    invoke-static {v1}, Lcom/facebook/react/views/scroll/h;->h(Lcom/facebook/react/views/scroll/h;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "onScroll"

    invoke-static {v2, v3}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onHttpError"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topHttpError"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onRenderProcessGone"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topRenderProcessGone"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onCustomMenuSelection"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topCustomMenuSelection"

    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "onOpenWindow"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "topOpenWindow"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNCWebView"

    return-object v0
.end method

.method public bridge synthetic onDropViewInstance(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativecommunity/webview/o;

    invoke-virtual {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->onDropViewInstance(Lcom/reactnativecommunity/webview/o;)V

    return-void
.end method

.method public onDropViewInstance(Lcom/reactnativecommunity/webview/o;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1}, Lcom/reactnativecommunity/webview/j;->k(Lcom/reactnativecommunity/webview/o;)V

    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/ViewManager;->onDropViewInstance(Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/reactnativecommunity/webview/o;

    invoke-virtual {p0, p1, p2, p3}, Lcom/reactnativecommunity/webview/RNCWebViewManager;->receiveCommand(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public receiveCommand(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2, p3}, Lcom/reactnativecommunity/webview/j;->l(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/ViewManager;->receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/q;->removeAllViews(Landroid/view/View;)V

    return-void
.end method

.method public setAllowFileAccess(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "allowFileAccess"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->m(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setAllowFileAccessFromFileURLs(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "allowFileAccessFromFileURLs"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->n(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setAllowUniversalAccessFromFileURLs(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "allowUniversalAccessFromFileURLs"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->o(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setAllowsFullscreenVideo(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "allowsFullscreenVideo"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->p(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setAllowsProtectedMedia(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "allowsProtectedMedia"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->q(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setAndroidLayerType(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "androidLayerType"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->r(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V

    return-void
.end method

.method public setApplicationNameForUserAgent(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "applicationNameForUserAgent"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->s(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V

    return-void
.end method

.method public setBasicAuthCredential(Lcom/reactnativecommunity/webview/o;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "basicAuthCredential"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->t(Lcom/reactnativecommunity/webview/o;Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public setCacheEnabled(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "cacheEnabled"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->u(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setCacheMode(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "cacheMode"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->v(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V

    return-void
.end method

.method public setDomStorageEnabled(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "domStorageEnabled"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->w(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setDownloadingMessage(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "downloadingMessage"
    .end annotation

    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/j;->x(Ljava/lang/String;)V

    return-void
.end method

.method public setForceDarkOn(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "forceDarkOn"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->y(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setGeolocationEnabled(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "geolocationEnabled"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->z(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setHasOnOpenWindowEvent(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "hasOnOpenWindowEvent"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->A(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setHasOnScroll(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "hasOnScroll"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->B(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setIncognito(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "incognito"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->C(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setInjectedJavaScript(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "injectedJavaScript"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->D(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V

    return-void
.end method

.method public setInjectedJavaScriptBeforeContentLoaded(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "injectedJavaScriptBeforeContentLoaded"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->E(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V

    return-void
.end method

.method public setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->F(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setInjectedJavaScriptForMainFrameOnly(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "injectedJavaScriptForMainFrameOnly"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->G(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setInjectedJavaScriptObject(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "injectedJavaScriptObject"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->H(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V

    return-void
.end method

.method public setJavaScriptCanOpenWindowsAutomatically(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "javaScriptCanOpenWindowsAutomatically"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->I(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setJavaScriptEnabled(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "javaScriptEnabled"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->J(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setLackPermissionToDownloadMessage(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "lackPermissionToDownloadMessage"
    .end annotation

    iget-object p1, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/j;->K(Ljava/lang/String;)V

    return-void
.end method

.method public setMediaPlaybackRequiresUserAction(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "mediaPlaybackRequiresUserAction"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->L(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setMenuCustomItems(Lcom/reactnativecommunity/webview/o;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "menuItems"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->M(Lcom/reactnativecommunity/webview/o;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setMessagingEnabled(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "messagingEnabled"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->N(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setMessagingModuleName(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "messagingModuleName"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->O(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V

    return-void
.end method

.method public setMinimumFontSize(Lcom/reactnativecommunity/webview/o;I)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "minimumFontSize"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->P(Lcom/reactnativecommunity/webview/o;I)V

    return-void
.end method

.method public setMixedContentMode(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "mixedContentMode"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->Q(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V

    return-void
.end method

.method public setNestedScrollEnabled(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "nestedScrollEnabled"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->R(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setOverScrollMode(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "overScrollMode"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->S(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V

    return-void
.end method

.method public setSaveFormDataDisabled(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "saveFormDataDisabled"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->T(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setScalesPageToFit(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "scalesPageToFit"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->U(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setSetBuiltInZoomControls(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "setBuiltInZoomControls"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->V(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setSetDisplayZoomControls(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "setDisplayZoomControls"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->W(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setSetSupportMultipleWindows(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "setSupportMultipleWindows"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->X(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setShowsHorizontalScrollIndicator(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "showsHorizontalScrollIndicator"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->Y(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setShowsVerticalScrollIndicator(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "showsVerticalScrollIndicator"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->Z(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setSource(Lcom/reactnativecommunity/webview/o;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "source"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lcom/reactnativecommunity/webview/j;->a0(Lcom/reactnativecommunity/webview/o;Lcom/facebook/react/bridge/ReadableMap;Z)V

    return-void
.end method

.method public setTextZoom(Lcom/reactnativecommunity/webview/o;I)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "textZoom"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->b0(Lcom/reactnativecommunity/webview/o;I)V

    return-void
.end method

.method public setThirdPartyCookiesEnabled(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "thirdPartyCookiesEnabled"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->c0(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method

.method public setUserAgent(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "userAgent"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->d0(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V

    return-void
.end method

.method public setWebviewDebuggingEnabled(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "webviewDebuggingEnabled"
    .end annotation

    iget-object v0, p0, Lcom/reactnativecommunity/webview/RNCWebViewManager;->mRNCWebViewManagerImpl:Lcom/reactnativecommunity/webview/j;

    invoke-virtual {v0, p1, p2}, Lcom/reactnativecommunity/webview/j;->f0(Lcom/reactnativecommunity/webview/o;Z)V

    return-void
.end method
