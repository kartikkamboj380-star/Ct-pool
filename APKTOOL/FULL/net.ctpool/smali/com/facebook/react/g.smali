.class public Lcom/facebook/react/g;
.super Lcom/facebook/react/Y;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/Z;


# instance fields
.field private a:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/Y;-><init>()V

    return-void
.end method

.method public static synthetic e(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/g;->i(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/facebook/react/bridge/ModuleSpec;->viewManagerSpec(Ljavax/inject/Provider;)Lcom/facebook/react/bridge/ModuleSpec;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private g()Lj2/a;
    .locals 12

    .line 1
    const-class v0, Lcom/facebook/react/devsupport/JSCHeapCapture;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    aget-object v0, v0, v2

    .line 14
    .line 15
    const-class v2, Li2/a;

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Li2/a;

    .line 22
    .line 23
    invoke-interface {v2}, Li2/a;->name()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v11, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 28
    .line 29
    invoke-interface {v2}, Li2/a;->name()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-interface {v2}, Li2/a;->canOverrideExistingModule()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    invoke-interface {v2}, Li2/a;->needsEagerInit()Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    invoke-interface {v2}, Li2/a;->isCxxModule()Z

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    invoke-static {v0}, Lcom/facebook/react/module/model/ReactModuleInfo;->b(Ljava/lang/Class;)Z

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    move-object v4, v11

    .line 54
    invoke-direct/range {v4 .. v10}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZ)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v1, v3, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    new-instance v0, Lcom/facebook/react/f;

    .line 61
    .line 62
    invoke-direct {v0, v1}, Lcom/facebook/react/f;-><init>(Ljava/util/Map;)V

    .line 63
    .line 64
    .line 65
    return-object v0
.end method

.method private h()Ljava/util/Map;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/g;->a:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/facebook/react/e;

    invoke-direct {v1}, Lcom/facebook/react/e;-><init>()V

    const-string v2, "DebuggingOverlay"

    invoke-static {v0, v2, v1}, Lcom/facebook/react/g;->f(Ljava/util/Map;Ljava/lang/String;Ljavax/inject/Provider;)V

    iput-object v0, p0, Lcom/facebook/react/g;->a:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/g;->a:Ljava/util/Map;

    return-object v0
.end method

.method private static synthetic i(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    return-object p0
.end method


# virtual methods
.method public createViewManager(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/String;)Lcom/facebook/react/uimanager/ViewManager;
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/g;->h()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/ModuleSpec;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ModuleSpec;->getProvider()Ljavax/inject/Provider;

    move-result-object p1

    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/uimanager/ViewManager;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const-string v0, "JSCHeapCapture"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Lcom/facebook/react/devsupport/JSCHeapCapture;

    invoke-direct {p1, p2}, Lcom/facebook/react/devsupport/JSCHeapCapture;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    return-object p1
.end method

.method public getReactModuleInfoProvider()Lj2/a;
    .locals 3

    .line 1
    const-string v0, "No ReactModuleInfoProvider for DebugCorePackage$$ReactModuleInfoProvider"

    .line 2
    .line 3
    invoke-static {}, LS1/a;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/facebook/react/g;->g()Lj2/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    :try_start_0
    const-string v1, "com.facebook.react.DebugCorePackage$$ReactModuleInfoProvider"

    .line 15
    .line 16
    invoke-static {v1}, LS1/a;->b(Ljava/lang/String;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lj2/a;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    return-object v1

    .line 27
    :catch_0
    move-exception v1

    .line 28
    goto :goto_0

    .line 29
    :catch_1
    move-exception v1

    .line 30
    goto :goto_1

    .line 31
    :goto_0
    new-instance v2, Ljava/lang/RuntimeException;

    .line 32
    .line 33
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    throw v2

    .line 37
    :goto_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 38
    .line 39
    invoke-direct {v2, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    throw v2

    .line 43
    :catch_2
    invoke-direct {p0}, Lcom/facebook/react/g;->g()Lj2/a;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method

.method public getViewManagerNames(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/g;->h()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public getViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/facebook/react/g;->h()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p1
.end method
