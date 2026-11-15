.class public final Lcom/reactnativecommunity/webview/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativecommunity/webview/j$a;
    }
.end annotation


# static fields
.field public static final A:Lcom/reactnativecommunity/webview/j$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Lcom/reactnativecommunity/webview/g;

.field private c:Z

.field private d:Z

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Z

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;

.field private final l:Ljava/lang/String;

.field private final m:Ljava/lang/String;

.field private final n:Ljava/lang/String;

.field private final o:Ljava/lang/String;

.field private final p:I

.field private final q:I

.field private final r:I

.field private final s:I

.field private final t:I

.field private final u:I

.field private final v:I

.field private final w:I

.field private final x:I

.field private final y:I

.field private final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativecommunity/webview/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativecommunity/webview/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativecommunity/webview/j;->A:Lcom/reactnativecommunity/webview/j$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "RNCWebViewManagerImpl"

    iput-object v0, p0, Lcom/reactnativecommunity/webview/j;->a:Ljava/lang/String;

    new-instance v0, Lcom/reactnativecommunity/webview/i;

    invoke-direct {v0}, Lcom/reactnativecommunity/webview/i;-><init>()V

    iput-object v0, p0, Lcom/reactnativecommunity/webview/j;->b:Lcom/reactnativecommunity/webview/g;

    const-string v0, "UTF-8"

    iput-object v0, p0, Lcom/reactnativecommunity/webview/j;->j:Ljava/lang/String;

    const-string v0, "text/html"

    iput-object v0, p0, Lcom/reactnativecommunity/webview/j;->k:Ljava/lang/String;

    const-string v0, "POST"

    iput-object v0, p0, Lcom/reactnativecommunity/webview/j;->l:Ljava/lang/String;

    const-string v0, "about:blank"

    iput-object v0, p0, Lcom/reactnativecommunity/webview/j;->m:Ljava/lang/String;

    const-string v0, "Downloading"

    iput-object v0, p0, Lcom/reactnativecommunity/webview/j;->n:Ljava/lang/String;

    const-string v0, "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files."

    iput-object v0, p0, Lcom/reactnativecommunity/webview/j;->o:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, p0, Lcom/reactnativecommunity/webview/j;->p:I

    const/4 v0, 0x2

    iput v0, p0, Lcom/reactnativecommunity/webview/j;->q:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/reactnativecommunity/webview/j;->r:I

    const/4 v0, 0x4

    iput v0, p0, Lcom/reactnativecommunity/webview/j;->s:I

    const/4 v0, 0x5

    iput v0, p0, Lcom/reactnativecommunity/webview/j;->t:I

    const/4 v0, 0x6

    iput v0, p0, Lcom/reactnativecommunity/webview/j;->u:I

    const/4 v0, 0x7

    iput v0, p0, Lcom/reactnativecommunity/webview/j;->v:I

    const/16 v0, 0x8

    iput v0, p0, Lcom/reactnativecommunity/webview/j;->w:I

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/reactnativecommunity/webview/j;->x:I

    const/16 v0, 0x3e9

    iput v0, p0, Lcom/reactnativecommunity/webview/j;->y:I

    const/16 v0, 0x3ea

    iput v0, p0, Lcom/reactnativecommunity/webview/j;->z:I

    return-void
.end method

.method public static synthetic a(Lcom/reactnativecommunity/webview/d;Lcom/reactnativecommunity/webview/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/reactnativecommunity/webview/j;->f(Lcom/reactnativecommunity/webview/d;Lcom/reactnativecommunity/webview/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public static synthetic b(Landroid/webkit/WebView;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/reactnativecommunity/webview/j;->j(Landroid/webkit/WebView;)V

    return-void
.end method

.method private final e0(Lcom/reactnativecommunity/webview/o;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    iget-object v0, p0, Lcom/reactnativecommunity/webview/j;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    iget-object v0, p0, Lcom/reactnativecommunity/webview/j;->h:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/reactnativecommunity/webview/j;->i:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    iget-object v0, p0, Lcom/reactnativecommunity/webview/j;->i:Ljava/lang/String;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method private static final f(Lcom/reactnativecommunity/webview/d;Lcom/reactnativecommunity/webview/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 1

    .line 1
    const-string p6, "$webView"

    invoke-static {p0, p6}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p6, "this$0"

    invoke-static {p1, p6}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/reactnativecommunity/webview/d;->setIgnoreErrFailedForThisURL(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/d;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    const-class p6, Lcom/reactnativecommunity/webview/RNCWebViewModule;

    invoke-virtual {p0, p6}, Lcom/facebook/react/bridge/ReactContext;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p0

    check-cast p0, Lcom/reactnativecommunity/webview/RNCWebViewModule;

    if-nez p0, :cond_0

    return-void

    :cond_0
    :try_start_0
    new-instance p6, Landroid/app/DownloadManager$Request;

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p7

    invoke-direct {p6, p7}, Landroid/app/DownloadManager$Request;-><init>(Landroid/net/Uri;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-static {p2, p4, p5}, Lcom/reactnativecommunity/webview/p;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-static {}, Lcom/reactnativecommunity/webview/k;->a()LF5/f;

    move-result-object p5

    const-string p7, "_"

    invoke-virtual {p5, p4, p7}, LF5/f;->b(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    const-string p7, "Downloading "

    invoke-virtual {p5, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    :try_start_1
    new-instance p7, Ljava/net/URL;

    invoke-direct {p7, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {p7}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p7}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "://"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object p7

    invoke-virtual {p7, p2}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p7, "Cookie"

    invoke-virtual {p6, p7, p2}, Landroid/app/DownloadManager$Request;->addRequestHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;
    :try_end_1
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    iget-object p7, p1, Lcom/reactnativecommunity/webview/j;->a:Ljava/lang/String;

    const-string v0, "Error getting cookie for DownloadManager"

    invoke-static {p7, v0, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    const-string p2, "User-Agent"

    invoke-virtual {p6, p2, p3}, Landroid/app/DownloadManager$Request;->addRequestHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    invoke-virtual {p6, p4}, Landroid/app/DownloadManager$Request;->setTitle(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    invoke-virtual {p6, p5}, Landroid/app/DownloadManager$Request;->setDescription(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    invoke-virtual {p6}, Landroid/app/DownloadManager$Request;->allowScanningByMediaScanner()V

    const/4 p2, 0x1

    invoke-virtual {p6, p2}, Landroid/app/DownloadManager$Request;->setNotificationVisibility(I)Landroid/app/DownloadManager$Request;

    sget-object p2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-virtual {p6, p2, p4}, Landroid/app/DownloadManager$Request;->setDestinationInExternalPublicDir(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    invoke-virtual {p0, p6}, Lcom/reactnativecommunity/webview/RNCWebViewModule;->setDownloadRequest(Landroid/app/DownloadManager$Request;)V

    invoke-direct {p1}, Lcom/reactnativecommunity/webview/j;->h()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1}, Lcom/reactnativecommunity/webview/j;->i()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Lcom/reactnativecommunity/webview/RNCWebViewModule;->grantFileDownloaderPermissions(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-direct {p1}, Lcom/reactnativecommunity/webview/j;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/reactnativecommunity/webview/RNCWebViewModule;->downloadFile(Ljava/lang/String;)V

    :cond_1
    return-void

    :catch_1
    move-exception p0

    iget-object p1, p1, Lcom/reactnativecommunity/webview/j;->a:Ljava/lang/String;

    const-string p2, "Unsupported URI, aborting download"

    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method private final g0(Lcom/reactnativecommunity/webview/d;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/d;->getThemedReactContext()Lcom/facebook/react/uimanager/e0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/uimanager/e0;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    iget-boolean v1, p0, Lcom/reactnativecommunity/webview/j;->c:Z

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result v1

    new-instance v2, Lcom/reactnativecommunity/webview/j$c;

    invoke-direct {v2, p1, v0, v1}, Lcom/reactnativecommunity/webview/j$c;-><init>(Lcom/reactnativecommunity/webview/d;Landroid/app/Activity;I)V

    iget-boolean v0, p0, Lcom/reactnativecommunity/webview/j;->d:Z

    invoke-virtual {v2, v0}, Lcom/reactnativecommunity/webview/c;->f(Z)V

    iget-boolean v0, p0, Lcom/reactnativecommunity/webview/j;->g:Z

    invoke-virtual {v2, v0}, Lcom/reactnativecommunity/webview/c;->g(Z)V

    invoke-virtual {p1, v2}, Lcom/reactnativecommunity/webview/d;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/d;->getWebChromeClient()Landroid/webkit/WebChromeClient;

    move-result-object v0

    check-cast v0, Lcom/reactnativecommunity/webview/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/webkit/WebChromeClient;->onHideCustomView()V

    :cond_1
    new-instance v0, Lcom/reactnativecommunity/webview/j$b;

    invoke-direct {v0, p1}, Lcom/reactnativecommunity/webview/j$b;-><init>(Lcom/reactnativecommunity/webview/d;)V

    iget-boolean v1, p0, Lcom/reactnativecommunity/webview/j;->d:Z

    invoke-virtual {v0, v1}, Lcom/reactnativecommunity/webview/c;->f(Z)V

    iget-boolean v1, p0, Lcom/reactnativecommunity/webview/j;->g:Z

    invoke-virtual {v0, v1}, Lcom/reactnativecommunity/webview/c;->g(Z)V

    invoke-virtual {p1, v0}, Lcom/reactnativecommunity/webview/d;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    :goto_0
    return-void
.end method

.method private final h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativecommunity/webview/j;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/reactnativecommunity/webview/j;->n:Ljava/lang/String;

    :cond_0
    return-object v0
.end method

.method private final i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativecommunity/webview/j;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/reactnativecommunity/webview/j;->o:Ljava/lang/String;

    :cond_0
    return-object v0
.end method

.method private static final j(Landroid/webkit/WebView;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final A(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    iput-boolean p2, p0, Lcom/reactnativecommunity/webview/j;->g:Z

    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/j;->g0(Lcom/reactnativecommunity/webview/d;)V

    return-void
.end method

.method public final B(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/d;->setHasScrollEvent(Z)V

    return-void
.end method

.method public final C(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/webkit/CookieManager;->removeAllCookies(Landroid/webkit/ValueCallback;)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->clearHistory()V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->clearCache(Z)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->clearFormData()V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    return-void
.end method

.method public final D(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    iput-object p2, p1, Lcom/reactnativecommunity/webview/d;->m:Ljava/lang/String;

    return-void
.end method

.method public final E(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    iput-object p2, p1, Lcom/reactnativecommunity/webview/d;->n:Ljava/lang/String;

    return-void
.end method

.method public final F(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    iput-boolean p2, p1, Lcom/reactnativecommunity/webview/d;->q:Z

    return-void
.end method

.method public final G(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    iput-boolean p2, p1, Lcom/reactnativecommunity/webview/d;->p:Z

    return-void
.end method

.method public final H(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/d;->setInjectedJavaScriptObject(Ljava/lang/String;)V

    return-void
.end method

.method public final I(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    return-void
.end method

.method public final J(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    return-void
.end method

.method public final K(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/reactnativecommunity/webview/j;->f:Ljava/lang/String;

    return-void
.end method

.method public final L(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    return-void
.end method

.method public final M(Lcom/reactnativecommunity/webview/o;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/d;->setMenuCustomItems(Ljava/util/List;)V

    goto :goto_1

    :cond_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->toArrayList()Ljava/util/ArrayList;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.String>>"

    invoke-static {p2, v0}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public final N(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/d;->setMessagingEnabled(Z)V

    return-void
.end method

.method public final O(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    iput-object p2, p1, Lcom/reactnativecommunity/webview/d;->s:Ljava/lang/String;

    return-void
.end method

.method public final P(Lcom/reactnativecommunity/webview/o;I)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setMinimumFontSize(I)V

    return-void
.end method

.method public final Q(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    if-eqz p2, :cond_2

    const-string v0, "never"

    invoke-static {v0, p2}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "always"

    invoke-static {v0, p2}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    goto :goto_2

    :cond_1
    const-string v0, "compatibility"

    invoke-static {v0, p2}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    const/4 p2, 0x2

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    const/4 p2, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public final R(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    iput-boolean p2, p1, Lcom/reactnativecommunity/webview/d;->y:Z

    return-void
.end method

.method public final S(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x54506df1

    if-eq v1, v2, :cond_4

    const v2, 0x63dca8c

    if-eq v1, v2, :cond_2

    const v2, 0x38b73479

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "content"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const-string v1, "never"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x2

    goto :goto_0

    :cond_4
    const-string v1, "always"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    :cond_5
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setOverScrollMode(I)V

    return-void
.end method

.method public final T(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V

    return-void
.end method

.method public final U(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    return-void
.end method

.method public final V(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    return-void
.end method

.method public final W(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    return-void
.end method

.method public final X(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    return-void
.end method

.method public final Y(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    return-void
.end method

.method public final Z(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    return-void
.end method

.method public final a0(Lcom/reactnativecommunity/webview/o;Lcom/facebook/react/bridge/ReadableMap;Z)V
    .locals 8

    .line 1
    const-string v0, "getBytes(...)"

    const-string v1, "viewWrapper"

    invoke-static {p1, v1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object v2

    if-eqz p2, :cond_c

    const-string p1, "html"

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    const-string v3, ""

    if-eqz v1, :cond_1

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string p1, "baseUrl"

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    move-object v3, p1

    :cond_0
    invoke-static {v4}, Lw5/k;->c(Ljava/lang/Object;)V

    iget-object v5, p0, Lcom/reactnativecommunity/webview/j;->k:Ljava/lang/String;

    iget-object v6, p0, Lcom/reactnativecommunity/webview/j;->j:Ljava/lang/String;

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string p1, "uri"

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1, p1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    :cond_2
    const-string v1, "method"

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v4, p0, Lcom/reactnativecommunity/webview/j;->l:Ljava/lang/String;

    const/4 v5, 0x1

    invoke-static {v1, v4, v5}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_5

    const-string p3, "body"

    invoke-interface {p2, p3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2, p3}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :try_start_0
    invoke-static {p2}, Lw5/k;->c(Ljava/lang/Object;)V

    const-string p3, "UTF-8"

    invoke-static {p3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p3

    const-string v1, "forName(...)"

    invoke-static {p3, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p3

    invoke-static {p3, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {p2}, Lw5/k;->c(Ljava/lang/Object;)V

    sget-object p3, LF5/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p2, p3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p3

    invoke-static {p3, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    :goto_0
    if-nez p3, :cond_4

    const/4 p2, 0x0

    new-array p3, p2, [B

    :cond_4
    invoke-static {p1}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, p3}, Landroid/webkit/WebView;->postUrl(Ljava/lang/String;[B)V

    return-void

    :cond_5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "headers"

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_b

    const-string v4, "toLowerCase(...)"

    const-string v5, "ENGLISH"

    const-string v6, "user-agent"

    if-eqz p3, :cond_9

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object p2

    invoke-static {p2}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->toArrayList()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    const-string v1, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }"

    invoke-static {p3, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/util/HashMap;

    const-string v1, "name"

    invoke-virtual {p3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_6

    move-object v1, v3

    :cond_6
    const-string v7, "value"

    invoke-virtual {p3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_7

    move-object p3, v3

    :cond_7
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v7, v5}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v7}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-virtual {v1, p3}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_9
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    invoke-static {p2}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->hasNextKey()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p3}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v3, v5}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6, v3}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v3

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    goto :goto_2

    :cond_a
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_b
    invoke-static {p1}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_c
    iget-object p1, p0, Lcom/reactnativecommunity/webview/j;->m:Ljava/lang/String;

    invoke-virtual {v2, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method public final b0(Lcom/reactnativecommunity/webview/o;I)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    return-void
.end method

.method public final c(Lcom/facebook/react/uimanager/e0;)Lcom/reactnativecommunity/webview/d;
    .locals 1

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/reactnativecommunity/webview/d;

    invoke-direct {v0, p1}, Lcom/reactnativecommunity/webview/d;-><init>(Lcom/facebook/react/uimanager/e0;)V

    return-object v0
.end method

.method public final c0(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/webkit/CookieManager;->setAcceptThirdPartyCookies(Landroid/webkit/WebView;Z)V

    return-void
.end method

.method public final d(Lcom/facebook/react/uimanager/e0;)Lcom/reactnativecommunity/webview/o;
    .locals 1

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/reactnativecommunity/webview/j;->c(Lcom/facebook/react/uimanager/e0;)Lcom/reactnativecommunity/webview/d;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/reactnativecommunity/webview/j;->e(Lcom/facebook/react/uimanager/e0;Lcom/reactnativecommunity/webview/d;)Lcom/reactnativecommunity/webview/o;

    move-result-object p1

    return-object p1
.end method

.method public final d0(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/reactnativecommunity/webview/j;->h:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/j;->e0(Lcom/reactnativecommunity/webview/o;)V

    return-void
.end method

.method public final e(Lcom/facebook/react/uimanager/e0;Lcom/reactnativecommunity/webview/d;)Lcom/reactnativecommunity/webview/o;
    .locals 3

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webView"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/reactnativecommunity/webview/j;->g0(Lcom/reactnativecommunity/webview/d;)V

    invoke-virtual {p1, p2}, Lcom/facebook/react/uimanager/e0;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    iget-object v0, p0, Lcom/reactnativecommunity/webview/j;->b:Lcom/reactnativecommunity/webview/g;

    invoke-interface {v0, p2}, Lcom/reactnativecommunity/webview/g;->a(Landroid/webkit/WebView;)V

    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const-string v1, "getSettings(...)"

    invoke-static {v0, v1}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    invoke-virtual {v0, v2}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Lcom/reactnativecommunity/webview/h;

    invoke-direct {v0, p2, p0}, Lcom/reactnativecommunity/webview/h;-><init>(Lcom/reactnativecommunity/webview/d;Lcom/reactnativecommunity/webview/j;)V

    invoke-virtual {p2, v0}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    new-instance v0, Lcom/reactnativecommunity/webview/o;

    invoke-direct {v0, p1, p2}, Lcom/reactnativecommunity/webview/o;-><init>(Landroid/content/Context;Lcom/reactnativecommunity/webview/d;)V

    return-object v0
.end method

.method public final f0(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    return-void
.end method

.method public final g()Ljava/util/Map;
    .locals 3

    .line 1
    invoke-static {}, LS1/f;->a()LS1/f$a;

    move-result-object v0

    iget v1, p0, Lcom/reactnativecommunity/webview/j;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "goBack"

    invoke-virtual {v0, v2, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    iget v1, p0, Lcom/reactnativecommunity/webview/j;->q:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "goForward"

    invoke-virtual {v0, v2, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    iget v1, p0, Lcom/reactnativecommunity/webview/j;->r:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "reload"

    invoke-virtual {v0, v2, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    iget v1, p0, Lcom/reactnativecommunity/webview/j;->s:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "stopLoading"

    invoke-virtual {v0, v2, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    iget v1, p0, Lcom/reactnativecommunity/webview/j;->t:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "postMessage"

    invoke-virtual {v0, v2, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    iget v1, p0, Lcom/reactnativecommunity/webview/j;->u:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "injectJavaScript"

    invoke-virtual {v0, v2, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    iget v1, p0, Lcom/reactnativecommunity/webview/j;->v:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "loadUrl"

    invoke-virtual {v0, v2, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    iget v1, p0, Lcom/reactnativecommunity/webview/j;->w:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "requestFocus"

    invoke-virtual {v0, v2, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    iget v1, p0, Lcom/reactnativecommunity/webview/j;->x:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "clearFormData"

    invoke-virtual {v0, v2, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    iget v1, p0, Lcom/reactnativecommunity/webview/j;->y:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "clearCache"

    invoke-virtual {v0, v2, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    iget v1, p0, Lcom/reactnativecommunity/webview/j;->z:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "clearHistory"

    invoke-virtual {v0, v2, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    invoke-virtual {v0}, LS1/f$a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lcom/reactnativecommunity/webview/o;)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/d;->getThemedReactContext()Lcom/facebook/react/uimanager/e0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/e0;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/d;->c()V

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/reactnativecommunity/webview/d;->B:Landroid/webkit/WebChromeClient;

    return-void
.end method

.method public final l(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 2

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "commandId"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p3, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "injectJavaScript"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-interface {p3, v1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/d;->h(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "postMessage"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto/16 :goto_0

    :cond_1
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "data"

    invoke-interface {p3, v1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, v0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "(function () {var event;var data = "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ";try {event = new MessageEvent(\'message\', data);} catch (e) {event = document.createEvent(\'MessageEvent\');event.initMessageEvent(\'message\', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/d;->h(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :sswitch_2
    const-string p3, "requestFocus"

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    goto/16 :goto_0

    :sswitch_3
    const-string p3, "clearHistory"

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto/16 :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/webkit/WebView;->clearHistory()V

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "loadUrl"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_0

    :cond_4
    iget-object p2, p1, Lcom/reactnativecommunity/webview/d;->z:Lcom/reactnativecommunity/webview/d$c;

    invoke-virtual {p2, v1}, Lcom/reactnativecommunity/webview/d$c;->b(Z)V

    invoke-interface {p3, v1}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_5
    const-string p3, "clearFormData"

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Landroid/webkit/WebView;->clearFormData()V

    goto :goto_0

    :sswitch_6
    const-string p3, "goForward"

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_0

    :cond_6
    invoke-virtual {p1}, Landroid/webkit/WebView;->goForward()V

    goto :goto_0

    :sswitch_7
    const-string v0, "clearCache"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto :goto_0

    :cond_7
    invoke-interface {p3, v1}, Lcom/facebook/react/bridge/ReadableArray;->getBoolean(I)Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->clearCache(Z)V

    goto :goto_0

    :sswitch_8
    const-string p3, "reload"

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    goto :goto_0

    :cond_8
    invoke-virtual {p1}, Landroid/webkit/WebView;->reload()V

    goto :goto_0

    :sswitch_9
    const-string p3, "stopLoading"

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    goto :goto_0

    :cond_9
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    goto :goto_0

    :sswitch_a
    const-string p3, "goBack"

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    goto :goto_0

    :cond_a
    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4a012e11 -> :sswitch_a
        -0x38833526 -> :sswitch_9
        -0x37b57e67 -> :sswitch_8
        -0x2d410ecb -> :sswitch_7
        -0x12f8b743 -> :sswitch_6
        -0xfcc1405 -> :sswitch_5
        0x141096a9 -> :sswitch_4
        0x35d48587 -> :sswitch_3
        0x4c4bb389 -> :sswitch_2
        0x58d00b47 -> :sswitch_1
        0x7d7149fe -> :sswitch_0
    .end sparse-switch
.end method

.method public final m(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    return-void
.end method

.method public final n(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    return-void
.end method

.method public final o(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setAllowUniversalAccessFromFileURLs(Z)V

    return-void
.end method

.method public final p(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    iput-boolean p2, p0, Lcom/reactnativecommunity/webview/j;->c:Z

    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/j;->g0(Lcom/reactnativecommunity/webview/d;)V

    return-void
.end method

.method public final q(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 2

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    iput-boolean p2, p0, Lcom/reactnativecommunity/webview/j;->d:Z

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/d;->getWebChromeClient()Landroid/webkit/WebChromeClient;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/reactnativecommunity/webview/c;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/reactnativecommunity/webview/c;

    invoke-virtual {p1, p2}, Lcom/reactnativecommunity/webview/c;->f(Z)V

    :cond_0
    return-void
.end method

.method public final r(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    const-string v0, "hardware"

    invoke-static {p2, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x2

    goto :goto_0

    :cond_0
    const-string v0, "software"

    invoke-static {p2, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method

.method public final s(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lcom/reactnativecommunity/webview/j;->i:Ljava/lang/String;

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/j;->e0(Lcom/reactnativecommunity/webview/o;)V

    return-void
.end method

.method public final t(Lcom/reactnativecommunity/webview/o;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 3

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    const-string v0, "username"

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "password"

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v1, Lcom/reactnativecommunity/webview/a;

    invoke-direct {v1, v0, p2}, Lcom/reactnativecommunity/webview/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/reactnativecommunity/webview/d;->setBasicAuthCredential(Lcom/reactnativecommunity/webview/a;)V

    return-void
.end method

.method public final u(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    if-eqz p2, :cond_0

    const/4 p2, -0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    return-void
.end method

.method public final v(Lcom/reactnativecommunity/webview/o;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    const/4 v0, -0x1

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "LOAD_CACHE_ONLY"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    goto :goto_0

    :sswitch_1
    const-string v1, "LOAD_CACHE_ELSE_NETWORK"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "LOAD_DEFAULT"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    goto :goto_0

    :sswitch_3
    const-string v1, "LOAD_NO_CACHE"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    :cond_3
    :goto_0
    invoke-virtual {p1, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7abc5963 -> :sswitch_3
        -0x486d8038 -> :sswitch_2
        -0x34165142 -> :sswitch_1
        0x5c4e1362 -> :sswitch_0
    .end sparse-switch
.end method

.method public final w(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    return-void
.end method

.method public final x(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/reactnativecommunity/webview/j;->e:Ljava/lang/String;

    return-void
.end method

.method public final y(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 3

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-le v0, v1, :cond_2

    const-string v0, "FORCE_DARK"

    invoke-static {v0}, Lj0/c;->a(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-static {v2, v0}, Lj0/b;->b(Landroid/webkit/WebSettings;I)V

    :cond_1
    if-eqz p2, :cond_2

    const-string p2, "FORCE_DARK_STRATEGY"

    invoke-static {p2}, Lj0/c;->a(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-static {p1, v1}, Lj0/b;->c(Landroid/webkit/WebSettings;I)V

    :cond_2
    return-void
.end method

.method public final z(Lcom/reactnativecommunity/webview/o;Z)V
    .locals 1

    .line 1
    const-string v0, "viewWrapper"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/o;->getWebView()Lcom/reactnativecommunity/webview/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    return-void
.end method
