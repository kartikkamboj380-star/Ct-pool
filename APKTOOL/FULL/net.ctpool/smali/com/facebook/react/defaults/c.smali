.class public abstract Lcom/facebook/react/defaults/c;
.super Lcom/facebook/react/L;
.source "SourceFile"


# direct methods
.method protected constructor <init>(Landroid/app/Application;)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/facebook/react/L;-><init>(Landroid/app/Application;)V

    return-void
.end method

.method public static synthetic w(Lcom/facebook/react/defaults/c;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/UIManager;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/defaults/c;->x(Lcom/facebook/react/defaults/c;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/UIManager;

    move-result-object p0

    return-object p0
.end method

.method private static final x(Lcom/facebook/react/defaults/c;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/UIManager;
    .locals 3

    .line 1
    const-string v0, "this$0"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactApplicationContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/react/fabric/ComponentFactory;

    invoke-direct {v0}, Lcom/facebook/react/fabric/ComponentFactory;-><init>()V

    sget-object v1, Lcom/facebook/react/defaults/DefaultComponentsRegistry;->a:Lcom/facebook/react/defaults/DefaultComponentsRegistry$a;

    invoke-virtual {v1, v0}, Lcom/facebook/react/defaults/DefaultComponentsRegistry$a;->register(Lcom/facebook/react/fabric/ComponentFactory;)Lcom/facebook/react/defaults/DefaultComponentsRegistry;

    invoke-virtual {p0}, Lcom/facebook/react/L;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/facebook/react/uimanager/G0;

    new-instance v2, Lcom/facebook/react/defaults/c$a;

    invoke-direct {v2, p0}, Lcom/facebook/react/defaults/c$a;-><init>(Lcom/facebook/react/defaults/c;)V

    invoke-direct {v1, v2}, Lcom/facebook/react/uimanager/G0;-><init>(Lcom/facebook/react/uimanager/H0;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/facebook/react/uimanager/G0;

    invoke-virtual {p0}, Lcom/facebook/react/L;->o()Lcom/facebook/react/H;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/facebook/react/H;->G(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/facebook/react/uimanager/G0;-><init>(Ljava/util/List;)V

    :goto_0
    new-instance p0, Lcom/facebook/react/fabric/h;

    sget-object v2, Lcom/facebook/react/fabric/ReactNativeConfig;->b:Lcom/facebook/react/fabric/ReactNativeConfig;

    invoke-direct {p0, v0, v2, v1}, Lcom/facebook/react/fabric/h;-><init>(Lcom/facebook/react/fabric/ComponentFactory;Lcom/facebook/react/fabric/ReactNativeConfig;Lcom/facebook/react/uimanager/G0;)V

    invoke-virtual {p0, p1}, Lcom/facebook/react/fabric/h;->createUIManager(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/UIManager;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A(Landroid/content/Context;)Lcom/facebook/react/y;
    .locals 10

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/L;->m()Ljava/util/List;

    move-result-object v2

    const-string v0, "getPackages(...)"

    invoke-static {v2, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/L;->j()Ljava/lang/String;

    move-result-object v3

    const-string v0, "getJSMainModuleName(...)"

    invoke-static {v3, v0}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/L;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "index"

    :cond_0
    move-object v4, v0

    invoke-virtual {p0}, Lcom/facebook/react/defaults/c;->y()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    move v5, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/facebook/react/L;->u()Z

    move-result v6

    const/16 v8, 0x40

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lcom/facebook/react/defaults/b;->c(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;ILjava/lang/Object;)Lcom/facebook/react/y;

    move-result-object p1

    return-object p1
.end method

.method protected h()Lcom/facebook/react/i;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/defaults/c;->y()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lcom/facebook/react/i;->n:Lcom/facebook/react/i;

    goto :goto_0

    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Lcom/facebook/react/i;->m:Lcom/facebook/react/i;

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_2
    new-instance v0, Li5/k;

    invoke-direct {v0}, Li5/k;-><init>()V

    throw v0
.end method

.method protected p()Lcom/facebook/react/T$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/defaults/c;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;

    invoke-direct {v0}, Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$a;-><init>()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected t()Lcom/facebook/react/bridge/UIManagerProvider;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/defaults/c;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LW1/b;

    invoke-direct {v0, p0}, LW1/b;-><init>(Lcom/facebook/react/defaults/c;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected abstract y()Ljava/lang/Boolean;
.end method

.method protected abstract z()Z
.end method
