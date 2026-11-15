.class public final Lcom/reactnativecommunity/webview/j$c;
.super Lcom/reactnativecommunity/webview/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/reactnativecommunity/webview/j;->g0(Lcom/reactnativecommunity/webview/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic A:Landroid/app/Activity;

.field final synthetic B:I


# direct methods
.method constructor <init>(Lcom/reactnativecommunity/webview/d;Landroid/app/Activity;I)V
    .locals 0

    iput-object p2, p0, Lcom/reactnativecommunity/webview/j$c;->A:Landroid/app/Activity;

    iput p3, p0, Lcom/reactnativecommunity/webview/j$c;->B:I

    invoke-direct {p0, p1}, Lcom/reactnativecommunity/webview/c;-><init>(Lcom/reactnativecommunity/webview/d;)V

    return-void
.end method


# virtual methods
.method public getDefaultVideoPoster()Landroid/graphics/Bitmap;
    .locals 2

    const/16 v0, 0x32

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public onHideCustomView()V
    .locals 4

    iget-object v0, p0, Lcom/reactnativecommunity/webview/c;->n:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/c;->c()Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    iget-object v1, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    :goto_0
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    goto :goto_0

    :goto_1
    iget-object v1, p0, Lcom/reactnativecommunity/webview/j$c;->A:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/16 v2, 0x200

    invoke-virtual {v1, v2}, Landroid/view/Window;->clearFlags(I)V

    iget-object v1, p0, Lcom/reactnativecommunity/webview/c;->n:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v0, p0, Lcom/reactnativecommunity/webview/c;->o:Landroid/webkit/WebChromeClient$CustomViewCallback;

    invoke-interface {v0}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/reactnativecommunity/webview/c;->n:Landroid/view/View;

    iput-object v0, p0, Lcom/reactnativecommunity/webview/c;->o:Landroid/webkit/WebChromeClient$CustomViewCallback;

    iget-object v0, p0, Lcom/reactnativecommunity/webview/j$c;->A:Landroid/app/Activity;

    iget v1, p0, Lcom/reactnativecommunity/webview/j$c;->B:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    iget-object v0, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    invoke-virtual {v0}, Lcom/reactnativecommunity/webview/d;->getThemedReactContext()Lcom/facebook/react/uimanager/e0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/facebook/react/uimanager/e0;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    return-void
.end method

.method public onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/reactnativecommunity/webview/c;->n:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-interface {p2}, Landroid/webkit/WebChromeClient$CustomViewCallback;->onCustomViewHidden()V

    return-void

    :cond_0
    iput-object p1, p0, Lcom/reactnativecommunity/webview/c;->n:Landroid/view/View;

    iput-object p2, p0, Lcom/reactnativecommunity/webview/c;->o:Landroid/webkit/WebChromeClient$CustomViewCallback;

    iget-object p1, p0, Lcom/reactnativecommunity/webview/j$c;->A:Landroid/app/Activity;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    iget-object p1, p0, Lcom/reactnativecommunity/webview/c;->n:Landroid/view/View;

    const/16 p2, 0x1f06

    invoke-virtual {p1, p2}, Landroid/view/View;->setSystemUiVisibility(I)V

    iget-object p1, p0, Lcom/reactnativecommunity/webview/j$c;->A:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 p2, 0x200

    invoke-virtual {p1, p2, p2}, Landroid/view/Window;->setFlags(II)V

    iget-object p1, p0, Lcom/reactnativecommunity/webview/c;->n:Landroid/view/View;

    const/high16 p2, -0x1000000

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Lcom/reactnativecommunity/webview/c;->c()Landroid/view/ViewGroup;

    move-result-object p1

    iget-object p2, p0, Lcom/reactnativecommunity/webview/c;->n:Landroid/view/View;

    sget-object v0, Lcom/reactnativecommunity/webview/c;->z:Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p1, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    iget-object p2, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    invoke-virtual {p2}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p2

    const/16 v0, 0x8

    if-eq p1, p2, :cond_1

    iget-object p1, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lcom/reactnativecommunity/webview/c;->m:Lcom/reactnativecommunity/webview/d;

    invoke-virtual {p1}, Lcom/reactnativecommunity/webview/d;->getThemedReactContext()Lcom/facebook/react/uimanager/e0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/facebook/react/uimanager/e0;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    return-void
.end method
