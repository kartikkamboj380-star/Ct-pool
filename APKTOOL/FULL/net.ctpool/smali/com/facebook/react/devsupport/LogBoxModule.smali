.class public final Lcom/facebook/react/devsupport/LogBoxModule;
.super Lcom/facebook/fbreact/specs/NativeLogBoxSpec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/LogBoxModule$a;
    }
.end annotation

.annotation runtime Li2/a;
    name = "LogBox"
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/devsupport/LogBoxModule$a;

.field public static final NAME:Ljava/lang/String; = "LogBox"


# instance fields
.field private final devSupportManager:LX1/e;

.field private final surfaceDelegate:LS1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/devsupport/LogBoxModule$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/devsupport/LogBoxModule$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/devsupport/LogBoxModule;->Companion:Lcom/facebook/react/devsupport/LogBoxModule$a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;LX1/e;)V
    .locals 1

    .line 1
    const-string v0, "devSupportManager"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/fbreact/specs/NativeLogBoxSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/facebook/react/devsupport/LogBoxModule;->devSupportManager:LX1/e;

    .line 10
    .line 11
    const-string p1, "LogBox"

    .line 12
    .line 13
    invoke-interface {p2, p1}, LX1/e;->c(Ljava/lang/String;)LS1/i;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    new-instance p1, Lcom/facebook/react/devsupport/N;

    .line 20
    .line 21
    invoke-direct {p1, p2}, Lcom/facebook/react/devsupport/N;-><init>(LX1/e;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iput-object p1, p0, Lcom/facebook/react/devsupport/LogBoxModule;->surfaceDelegate:LS1/i;

    .line 25
    .line 26
    new-instance p1, Lcom/facebook/react/devsupport/P;

    .line 27
    .line 28
    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/P;-><init>(Lcom/facebook/react/devsupport/LogBoxModule;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method private static final _init_$lambda$0(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/facebook/react/devsupport/LogBoxModule;->surfaceDelegate:LS1/i;

    const-string v0, "LogBox"

    invoke-interface {p0, v0}, LS1/i;->f(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/LogBoxModule;->invalidate$lambda$3(Lcom/facebook/react/devsupport/LogBoxModule;)V

    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/LogBoxModule;->show$lambda$1(Lcom/facebook/react/devsupport/LogBoxModule;)V

    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/LogBoxModule;->hide$lambda$2(Lcom/facebook/react/devsupport/LogBoxModule;)V

    return-void
.end method

.method public static synthetic d(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/LogBoxModule;->_init_$lambda$0(Lcom/facebook/react/devsupport/LogBoxModule;)V

    return-void
.end method

.method private static final hide$lambda$2(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/facebook/react/devsupport/LogBoxModule;->surfaceDelegate:LS1/i;

    invoke-interface {p0}, LS1/i;->c()V

    return-void
.end method

.method private static final invalidate$lambda$3(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/facebook/react/devsupport/LogBoxModule;->surfaceDelegate:LS1/i;

    invoke-interface {p0}, LS1/i;->e()V

    return-void
.end method

.method private static final show$lambda$1(Lcom/facebook/react/devsupport/LogBoxModule;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/facebook/react/devsupport/LogBoxModule;->surfaceDelegate:LS1/i;

    invoke-interface {p0}, LS1/i;->b()V

    return-void
.end method


# virtual methods
.method public hide()V
    .locals 1

    new-instance v0, Lcom/facebook/react/devsupport/O;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/O;-><init>(Lcom/facebook/react/devsupport/LogBoxModule;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public invalidate()V
    .locals 1

    new-instance v0, Lcom/facebook/react/devsupport/Q;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/Q;-><init>(Lcom/facebook/react/devsupport/LogBoxModule;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public show()V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/devsupport/LogBoxModule;->surfaceDelegate:LS1/i;

    invoke-interface {v0}, LS1/i;->d()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/facebook/react/devsupport/S;

    invoke-direct {v0, p0}, Lcom/facebook/react/devsupport/S;-><init>(Lcom/facebook/react/devsupport/LogBoxModule;)V

    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    return-void
.end method
