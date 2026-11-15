.class public final Lcom/swmansion/rnscreens/k;
.super Lcom/facebook/react/Y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/k$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/swmansion/rnscreens/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/swmansion/rnscreens/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/k;->a:Lcom/swmansion/rnscreens/k$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/Y;-><init>()V

    return-void
.end method

.method public static synthetic e()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, Lcom/swmansion/rnscreens/k;->f()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private static final f()Ljava/util/Map;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v9, Lcom/facebook/react/module/model/ReactModuleInfo;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-string v2, "RNSModule"

    const-string v3, "RNSModule"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZZ)V

    const-string v1, "RNSModule"

    invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 8

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/swmansion/rnscreens/ScreenContainerViewManager;

    invoke-direct {p1}, Lcom/swmansion/rnscreens/ScreenContainerViewManager;-><init>()V

    new-instance v0, Lcom/swmansion/rnscreens/ScreenViewManager;

    invoke-direct {v0}, Lcom/swmansion/rnscreens/ScreenViewManager;-><init>()V

    new-instance v1, Lcom/swmansion/rnscreens/ModalScreenViewManager;

    invoke-direct {v1}, Lcom/swmansion/rnscreens/ModalScreenViewManager;-><init>()V

    new-instance v2, Lcom/swmansion/rnscreens/ScreenStackViewManager;

    invoke-direct {v2}, Lcom/swmansion/rnscreens/ScreenStackViewManager;-><init>()V

    new-instance v3, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;

    invoke-direct {v3}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;-><init>()V

    new-instance v4, Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;

    invoke-direct {v4}, Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;-><init>()V

    new-instance v5, Lcom/swmansion/rnscreens/SearchBarManager;

    invoke-direct {v5}, Lcom/swmansion/rnscreens/SearchBarManager;-><init>()V

    const/4 v6, 0x7

    new-array v6, v6, [Lcom/facebook/react/uimanager/ViewManager;

    const/4 v7, 0x0

    aput-object p1, v6, v7

    const/4 p1, 0x1

    aput-object v0, v6, p1

    const/4 p1, 0x2

    aput-object v1, v6, p1

    const/4 p1, 0x3

    aput-object v2, v6, p1

    const/4 p1, 0x4

    aput-object v3, v6, p1

    const/4 p1, 0x5

    aput-object v4, v6, p1

    const/4 p1, 0x6

    aput-object v5, v6, p1

    invoke-static {v6}, Lj5/n;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    const-string v0, "s"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactApplicationContext"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "RNSModule"

    invoke-static {p1, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/swmansion/rnscreens/ScreensModule;

    invoke-direct {p1, p2}, Lcom/swmansion/rnscreens/ScreensModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getReactModuleInfoProvider()Lj2/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/j;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/swmansion/rnscreens/j;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
