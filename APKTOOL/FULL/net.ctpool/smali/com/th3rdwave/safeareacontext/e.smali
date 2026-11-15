.class public final Lcom/th3rdwave/safeareacontext/e;
.super Lcom/facebook/react/Y;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/Y;-><init>()V

    return-void
.end method

.method public static synthetic e(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/th3rdwave/safeareacontext/e;->f(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ljava/util/Map;)Ljava/util/Map;
    .locals 1

    .line 1
    const-string v0, "$reactModuleInfoMap"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public createViewManagers(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;
    .locals 3

    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;

    invoke-direct {p1}, Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;-><init>()V

    new-instance v0, Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;

    invoke-direct {v0}, Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;-><init>()V

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/facebook/react/uimanager/ViewManager;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object v0, v1, p1

    invoke-static {v1}, Lj5/n;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getModule(Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactContext"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "RNCSafeAreaContext"

    invoke-static {p1, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/th3rdwave/safeareacontext/SafeAreaContextModule;

    invoke-direct {p1, p2}, Lcom/th3rdwave/safeareacontext/SafeAreaContextModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public getReactModuleInfoProvider()Lj2/a;
    .locals 13

    .line 1
    const-class v0, Lcom/th3rdwave/safeareacontext/SafeAreaContextModule;

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
    if-nez v2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-interface {v2}, Li2/a;->name()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    new-instance v12, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 31
    .line 32
    invoke-interface {v2}, Li2/a;->name()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    const-string v0, "getName(...)"

    .line 41
    .line 42
    invoke-static {v6, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v2}, Li2/a;->needsEagerInit()Z

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    invoke-interface {v2}, Li2/a;->hasConstants()Z

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    invoke-interface {v2}, Li2/a;->isCxxModule()Z

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    const/4 v11, 0x0

    .line 58
    const/4 v7, 0x1

    .line 59
    move-object v4, v12

    .line 60
    invoke-direct/range {v4 .. v11}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZZ)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v1, v3, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :goto_0
    new-instance v0, Lcom/th3rdwave/safeareacontext/d;

    .line 67
    .line 68
    invoke-direct {v0, v1}, Lcom/th3rdwave/safeareacontext/d;-><init>(Ljava/util/Map;)V

    .line 69
    .line 70
    .line 71
    return-object v0
.end method
