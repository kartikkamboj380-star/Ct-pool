.class public Lcom/reactnativegooglesignin/m;
.super Lcom/facebook/react/Y;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/Y;-><init>()V

    return-void
.end method

.method public static synthetic e()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, Lcom/reactnativegooglesignin/m;->f()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private static synthetic f()Ljava/util/Map;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v9, Lcom/facebook/react/module/model/ReactModuleInfo;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-string v2, "RNGoogleSignin"

    const-string v3, "RNGoogleSignin"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZZ)V

    const-string v1, "RNGoogleSignin"

    invoke-interface {v0, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 2

    new-instance p1, Lcom/reactnativegooglesignin/RNGoogleSigninButtonViewManager;

    invoke-direct {p1}, Lcom/reactnativegooglesignin/RNGoogleSigninButtonViewManager;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/facebook/react/uimanager/ViewManager;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    const-string v0, "RNGoogleSignin"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/reactnativegooglesignin/RNGoogleSigninModule;

    invoke-direct {p1, p2}, Lcom/reactnativegooglesignin/RNGoogleSigninModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getReactModuleInfoProvider()Lj2/a;
    .locals 1

    .line 1
    new-instance v0, Lcom/reactnativegooglesignin/l;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/reactnativegooglesignin/l;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
