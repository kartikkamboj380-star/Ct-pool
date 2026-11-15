.class public final Lcom/facebook/react/modules/devloading/DevLoadingModule;
.super Lcom/facebook/fbreact/specs/NativeDevLoadingViewSpec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/devloading/DevLoadingModule$a;
    }
.end annotation

.annotation runtime Li2/a;
    name = "DevLoadingView"
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/modules/devloading/DevLoadingModule$a;

.field public static final NAME:Ljava/lang/String; = "DevLoadingView"


# instance fields
.field private devLoadingViewManager:LX1/c;

.field private final jsExceptionHandler:Lcom/facebook/react/bridge/JSExceptionHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/modules/devloading/DevLoadingModule$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/modules/devloading/DevLoadingModule$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/modules/devloading/DevLoadingModule;->Companion:Lcom/facebook/react/modules/devloading/DevLoadingModule$a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeDevLoadingViewSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getJSExceptionHandler()Lcom/facebook/react/bridge/JSExceptionHandler;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/modules/devloading/DevLoadingModule;->jsExceptionHandler:Lcom/facebook/react/bridge/JSExceptionHandler;

    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/facebook/react/devsupport/B;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/facebook/react/devsupport/B;

    invoke-virtual {p1}, Lcom/facebook/react/devsupport/B;->j0()LX1/c;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/modules/devloading/DevLoadingModule;->devLoadingViewManager:LX1/c;

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/modules/devloading/DevLoadingModule;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/modules/devloading/DevLoadingModule;->showMessage$lambda$0(Lcom/facebook/react/modules/devloading/DevLoadingModule;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/modules/devloading/DevLoadingModule;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/modules/devloading/DevLoadingModule;->hide$lambda$1(Lcom/facebook/react/modules/devloading/DevLoadingModule;)V

    return-void
.end method

.method private static final hide$lambda$1(Lcom/facebook/react/modules/devloading/DevLoadingModule;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/facebook/react/modules/devloading/DevLoadingModule;->devLoadingViewManager:LX1/c;

    if-eqz p0, :cond_0

    invoke-interface {p0}, LX1/c;->c()V

    :cond_0
    return-void
.end method

.method private static final showMessage$lambda$0(Lcom/facebook/react/modules/devloading/DevLoadingModule;Ljava/lang/String;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$message"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/facebook/react/modules/devloading/DevLoadingModule;->devLoadingViewManager:LX1/c;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, LX1/c;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public hide()V
    .locals 1

    new-instance v0, Lo2/a;

    invoke-direct {v0, p0}, Lo2/a;-><init>(Lcom/facebook/react/modules/devloading/DevLoadingModule;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public showMessage(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 0

    const-string p2, "message"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lo2/b;

    invoke-direct {p2, p0, p1}, Lo2/b;-><init>(Lcom/facebook/react/modules/devloading/DevLoadingModule;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method
