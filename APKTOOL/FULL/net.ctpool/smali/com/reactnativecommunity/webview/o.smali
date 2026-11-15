.class public final Lcom/reactnativecommunity/webview/o;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/reactnativecommunity/webview/o$a;
    }
.end annotation


# static fields
.field public static final n:Lcom/reactnativecommunity/webview/o$a;


# instance fields
.field private final m:Lcom/reactnativecommunity/webview/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/reactnativecommunity/webview/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/reactnativecommunity/webview/o$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/reactnativecommunity/webview/o;->n:Lcom/reactnativecommunity/webview/o$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/reactnativecommunity/webview/d;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webView"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type com.reactnativecommunity.webview.RNCWebView"

    invoke-static {p1, p2}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/reactnativecommunity/webview/d;

    iput-object p1, p0, Lcom/reactnativecommunity/webview/o;->m:Lcom/reactnativecommunity/webview/d;

    return-void
.end method

.method public static final a(Landroid/webkit/WebView;)I
    .locals 1

    .line 1
    sget-object v0, Lcom/reactnativecommunity/webview/o;->n:Lcom/reactnativecommunity/webview/o$a;

    invoke-virtual {v0, p0}, Lcom/reactnativecommunity/webview/o$a;->a(Landroid/webkit/WebView;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final getWebView()Lcom/reactnativecommunity/webview/d;
    .locals 1

    iget-object v0, p0, Lcom/reactnativecommunity/webview/o;->m:Lcom/reactnativecommunity/webview/d;

    return-object v0
.end method
