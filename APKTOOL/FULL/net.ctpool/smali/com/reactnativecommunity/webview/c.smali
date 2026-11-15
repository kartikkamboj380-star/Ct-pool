.class public abstract Lcom/reactnativecommunity/webview/c;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# static fields
.field protected static final z:Landroid/widget/FrameLayout$LayoutParams;


# instance fields
.field protected m:Lcom/reactnativecommunity/webview/d;

.field protected n:Landroid/view/View;

.field protected o:Landroid/webkit/WebChromeClient$CustomViewCallback;

.field protected p:Landroid/webkit/PermissionRequest;

.field protected q:Ljava/util/List;

.field protected r:Landroid/webkit/GeolocationPermissions$Callback;

.field protected s:Ljava/lang/String;

.field protected t:Z

.field protected u:Ljava/util/List;

.field protected v:Lcom/reactnativecommunity/webview/d$c;

.field protected w:Z

.field protected x:Z

.field private y:Lm2/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/16 v2, 0x11

    invoke-direct {v0, v1, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    sput-object v0, Lcom/reactnativecommunity/webview/c;->z:Landroid/widget/FrameLayout$LayoutParams;

    return-void
.end method

.method public constructor <init>(Lcom/reactnativecommunity/webview/d;)V
    .locals 2

    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/reactnativecommunity/webview/c;->t:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/reactnativecommunity/webview/c;->u:Ljava/util/List;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/reactnativecommunity/webview/c;->v:Lcom/reactnativecommunity/webview/d$c;

    iput-boolean v0, p0, Lcom/reactnativecommunity/webview/c;->w:Z

    iput-boolean v0, p0, Lcom/reactnativecommunity/webview/c;->x:Z

    new-instance v0, Lcom/reactnativecommunity/webview/b;

    invoke-direct {v0, p0}, Lcom/reactnativecommunity/webview/b;-><init>(Lcom/reactnativecommunity/webview/c;)V

    iput-object v0, p0, Lcom/reactnativecommunity/webview/c;->y:Lm2/h;

    iput-object p1, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    return-void
.end method

.method public static synthetic a(Lcom/reactnativecommunity/webview/c;I[Ljava/lang/String;[I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/reactnativecommunity/webview/c;->d(I[Ljava/lang/String;[I)Z

    move-result p0

    return p0
.end method

.method private b()Lm2/g;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/reactnativecommunity/webview/d;->getThemedReactContext()Lcom/facebook/react/uimanager/e0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/e0;->getCurrentActivity()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    instance-of v1, v0, Lm2/g;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, Lm2/g;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v1, "Tried to use permissions API but the host Activity doesn\'t implement PermissionAwareActivity."

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v1, "Tried to use permissions API while not attached to an Activity."

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method private synthetic d(I[Ljava/lang/String;[I)Z
    .locals 8

    .line 1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/reactnativecommunity/webview/c;->t:Z

    move v0, p1

    move v1, v0

    :goto_0
    array-length v2, p2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ge v0, v2, :cond_9

    aget-object v2, p2, v0

    aget v5, p3, v0

    if-nez v5, :cond_0

    move v5, v4

    goto :goto_1

    :cond_0
    move v5, p1

    :goto_1
    const-string v6, "android.permission.ACCESS_FINE_LOCATION"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, p0, Lcom/reactnativecommunity/webview/c;->r:Landroid/webkit/GeolocationPermissions$Callback;

    if-eqz v6, :cond_2

    iget-object v7, p0, Lcom/reactnativecommunity/webview/c;->s:Ljava/lang/String;

    if-eqz v7, :cond_2

    if-eqz v5, :cond_1

    invoke-interface {v6, v7, v4, p1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    goto :goto_2

    :cond_1
    invoke-interface {v6, v7, p1, p1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    :goto_2
    iput-object v3, p0, Lcom/reactnativecommunity/webview/c;->r:Landroid/webkit/GeolocationPermissions$Callback;

    iput-object v3, p0, Lcom/reactnativecommunity/webview/c;->s:Ljava/lang/String;

    :cond_2
    const-string v3, "android.permission.RECORD_AUDIO"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz v5, :cond_3

    iget-object v1, p0, Lcom/reactnativecommunity/webview/c;->q:Ljava/util/List;

    if-eqz v1, :cond_3

    const-string v3, "android.webkit.resource.AUDIO_CAPTURE"

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    move v1, v4

    :cond_4
    const-string v3, "android.permission.CAMERA"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    if-eqz v5, :cond_5

    iget-object v1, p0, Lcom/reactnativecommunity/webview/c;->q:Ljava/util/List;

    if-eqz v1, :cond_5

    const-string v3, "android.webkit.resource.VIDEO_CAPTURE"

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    move v1, v4

    :cond_6
    const-string v3, "android.webkit.resource.PROTECTED_MEDIA_ID"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    if-eqz v5, :cond_7

    iget-object v1, p0, Lcom/reactnativecommunity/webview/c;->q:Ljava/util/List;

    if-eqz v1, :cond_7

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    move v1, v4

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_9
    if-eqz v1, :cond_a

    iget-object p2, p0, Lcom/reactnativecommunity/webview/c;->p:Landroid/webkit/PermissionRequest;

    if-eqz p2, :cond_a

    iget-object p3, p0, Lcom/reactnativecommunity/webview/c;->q:Ljava/util/List;

    if-eqz p3, :cond_a

    new-array v0, p1, [Ljava/lang/String;

    invoke-interface {p3, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/String;

    invoke-virtual {p2, p3}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    iput-object v3, p0, Lcom/reactnativecommunity/webview/c;->p:Landroid/webkit/PermissionRequest;

    iput-object v3, p0, Lcom/reactnativecommunity/webview/c;->q:Ljava/util/List;

    :cond_a
    iget-object p2, p0, Lcom/reactnativecommunity/webview/c;->u:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_b

    iget-object p2, p0, Lcom/reactnativecommunity/webview/c;->u:Ljava/util/List;

    invoke-direct {p0, p2}, Lcom/reactnativecommunity/webview/c;->e(Ljava/util/List;)V

    return p1

    :cond_b
    return v4
.end method

.method private declared-synchronized e(Ljava/util/List;)V
    .locals 3

    .line 1
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/reactnativecommunity/webview/c;->t:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/reactnativecommunity/webview/c;->u:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-direct {p0}, Lcom/reactnativecommunity/webview/c;->b()Lm2/g;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/reactnativecommunity/webview/c;->t:Z

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    iget-object v1, p0, Lcom/reactnativecommunity/webview/c;->y:Lm2/h;

    const/4 v2, 0x3

    invoke-interface {v0, p1, v2, v1}, Lm2/g;->p([Ljava/lang/String;ILm2/h;)V

    iget-object p1, p0, Lcom/reactnativecommunity/webview/c;->u:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    monitor-exit p0

    throw p1
.end method


# virtual methods
.method protected c()Landroid/view/ViewGroup;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    invoke-virtual {v0}, Lcom/reactnativecommunity/webview/d;->getThemedReactContext()Lcom/facebook/react/uimanager/e0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/e0;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method public f(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/reactnativecommunity/webview/c;->w:Z

    return-void
.end method

.method public g(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/reactnativecommunity/webview/c;->x:Z

    return-void
.end method

.method public h(Lcom/reactnativecommunity/webview/d$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/reactnativecommunity/webview/c;->v:Lcom/reactnativecommunity/webview/d$c;

    return-void
.end method

.method public onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 0

    new-instance p2, Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iget-boolean p3, p0, Lcom/reactnativecommunity/webview/c;->x:Z

    if-eqz p3, :cond_0

    new-instance p3, Lcom/reactnativecommunity/webview/c$a;

    invoke-direct {p3, p0, p1}, Lcom/reactnativecommunity/webview/c$a;-><init>(Lcom/reactnativecommunity/webview/c;Landroid/webkit/WebView;)V

    invoke-virtual {p2, p3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    :cond_0
    iget-object p1, p4, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Landroid/webkit/WebView$WebViewTransport;

    invoke-virtual {p1, p2}, Landroid/webkit/WebView$WebViewTransport;->setWebView(Landroid/webkit/WebView;)V

    invoke-virtual {p4}, Landroid/os/Message;->sendToTarget()V

    const/4 p1, 0x1

    return p1
.end method

.method public onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 2

    iget-object v0, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    invoke-virtual {v0}, Lcom/reactnativecommunity/webview/d;->getThemedReactContext()Lcom/facebook/react/uimanager/e0;

    move-result-object v0

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v0, v1}, Landroidx/core/content/b;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    iput-object p2, p0, Lcom/reactnativecommunity/webview/c;->r:Landroid/webkit/GeolocationPermissions$Callback;

    iput-object p1, p0, Lcom/reactnativecommunity/webview/c;->s:Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/c;->e(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-interface {p2, p1, v0, v1}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    :goto_0
    return-void
.end method

.method public onHostDestroy()V
    .locals 0

    return-void
.end method

.method public onHostPause()V
    .locals 0

    return-void
.end method

.method public onHostResume()V
    .locals 2

    iget-object v0, p0, Lcom/reactnativecommunity/webview/c;->n:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    const/16 v1, 0x1f06

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/reactnativecommunity/webview/c;->n:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_0
    return-void
.end method

.method public onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/reactnativecommunity/webview/c;->q:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x0

    if-ge v4, v2, :cond_6

    aget-object v6, v1, v4

    const-string v7, "android.webkit.resource.AUDIO_CAPTURE"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v5, "android.permission.RECORD_AUDIO"

    goto :goto_1

    :cond_0
    const-string v7, "android.webkit.resource.VIDEO_CAPTURE"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const-string v5, "android.permission.CAMERA"

    goto :goto_1

    :cond_1
    const-string v7, "android.webkit.resource.PROTECTED_MEDIA_ID"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    iget-boolean v8, p0, Lcom/reactnativecommunity/webview/c;->w:Z

    if-eqz v8, :cond_2

    iget-object v7, p0, Lcom/reactnativecommunity/webview/c;->q:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move-object v5, v7

    :cond_3
    :goto_1
    if-eqz v5, :cond_5

    iget-object v7, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    invoke-virtual {v7}, Lcom/reactnativecommunity/webview/d;->getThemedReactContext()Lcom/facebook/react/uimanager/e0;

    move-result-object v7

    invoke-static {v7, v5}, Landroidx/core/content/b;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_4

    iget-object v5, p0, Lcom/reactnativecommunity/webview/c;->q:Ljava/util/List;

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v0, p0, Lcom/reactnativecommunity/webview/c;->q:Ljava/util/List;

    new-array v1, v3, [Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    iput-object v5, p0, Lcom/reactnativecommunity/webview/c;->q:Ljava/util/List;

    return-void

    :cond_7
    iput-object p1, p0, Lcom/reactnativecommunity/webview/c;->p:Landroid/webkit/PermissionRequest;

    invoke-direct {p0, v0}, Lcom/reactnativecommunity/webview/c;->e(Ljava/util/List;)V

    return-void
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 6

    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/reactnativecommunity/webview/c;->v:Lcom/reactnativecommunity/webview/d$c;

    invoke-virtual {v1}, Lcom/reactnativecommunity/webview/d$c;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lcom/reactnativecommunity/webview/o;->a(Landroid/webkit/WebView;)I

    move-result v1

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    const-string v3, "target"

    int-to-double v4, v1

    invoke-interface {v2, v3, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v3, "title"

    invoke-virtual {p1}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "url"

    invoke-interface {v2, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "canGoBack"

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    move-result v3

    invoke-interface {v2, v0, v3}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "canGoForward"

    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoForward()Z

    move-result p1

    invoke-interface {v2, v0, p1}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    int-to-float p1, p2

    const/high16 p2, 0x42c80000    # 100.0f

    div-float/2addr p1, p2

    float-to-double p1, p1

    const-string v0, "progress"

    invoke-interface {v2, v0, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget-object p1, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/d;->getThemedReactContext()Lcom/facebook/react/uimanager/e0;

    move-result-object p1

    invoke-static {p1, v1}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object p1

    new-instance p2, La5/e;

    invoke-direct {p2, v1, v2}, La5/e;-><init>(ILcom/facebook/react/bridge/WritableMap;)V

    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 3

    invoke-virtual {p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->getAcceptTypes()[Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    invoke-virtual {v0}, Lcom/reactnativecommunity/webview/d;->getThemedReactContext()Lcom/facebook/react/uimanager/e0;

    move-result-object v0

    const-class v2, Lcom/reactnativecommunity/webview/RNCWebViewModule;

    invoke-virtual {v0, v2}, Lcom/facebook/react/uimanager/e0;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object v0

    check-cast v0, Lcom/reactnativecommunity/webview/RNCWebViewModule;

    invoke-virtual {p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->isCaptureEnabled()Z

    move-result p3

    invoke-virtual {v0, p2, p1, v1, p3}, Lcom/reactnativecommunity/webview/RNCWebViewModule;->startPhotoPickerIntent(Landroid/webkit/ValueCallback;[Ljava/lang/String;ZZ)Z

    move-result p1

    return p1
.end method
