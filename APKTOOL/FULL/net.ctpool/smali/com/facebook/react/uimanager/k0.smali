.class public abstract Lcom/facebook/react/uimanager/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "com.facebook.react.uimanager.k0"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Landroid/content/Context;)[F
    .locals 5

    .line 1
    new-instance v0, Landroid/widget/EditText;

    invoke-direct {v0, p0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Landroidx/core/view/H;->G(Landroid/view/View;)I

    move-result p0

    int-to-float p0, p0

    invoke-static {p0}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result p0

    invoke-static {v0}, Landroidx/core/view/H;->F(Landroid/view/View;)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    int-to-float v2, v2

    invoke-static {v2}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    int-to-float v0, v0

    invoke-static {v0}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v0

    const/4 v3, 0x4

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput p0, v3, v4

    const/4 p0, 0x1

    aput v1, v3, p0

    const/4 p0, 0x2

    aput v2, v3, p0

    const/4 p0, 0x3

    aput v0, v3, p0

    return-object v3
.end method

.method public static b(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContext;->isBridgeless()Z

    move-result v0

    if-eqz v0, :cond_1

    instance-of p1, p0, Lcom/facebook/react/uimanager/e0;

    if-eqz p1, :cond_0

    check-cast p0, Lcom/facebook/react/uimanager/e0;

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/e0;->b()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p0

    :cond_0
    check-cast p0, Lcom/facebook/react/uimanager/events/j;

    invoke-interface {p0}, Lcom/facebook/react/uimanager/events/j;->getEventDispatcher()Lcom/facebook/react/uimanager/events/e;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/facebook/react/uimanager/k0;->h(Lcom/facebook/react/bridge/ReactContext;IZ)Lcom/facebook/react/bridge/UIManager;

    move-result-object p0

    if-nez p0, :cond_2

    sget-object p0, Lcom/facebook/react/uimanager/k0;->a:Ljava/lang/String;

    new-instance v0, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to find UIManager for UIManagerType "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0

    :cond_2
    invoke-interface {p0}, Lcom/facebook/react/bridge/UIManager;->getEventDispatcher()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/uimanager/events/e;

    if-nez p0, :cond_3

    sget-object v0, Lcom/facebook/react/uimanager/k0;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot get EventDispatcher for UIManagerType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-object p0
.end method

.method public static c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;
    .locals 4

    .line 1
    invoke-static {p1}, Ly2/a;->a(I)I

    move-result v0

    invoke-static {p0, v0}, Lcom/facebook/react/uimanager/k0;->b(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object v0, Lcom/facebook/react/uimanager/k0;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot get EventDispatcher for reactTag "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-object p0
.end method

.method public static d(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    instance-of v0, p0, Lcom/facebook/react/bridge/ReactContext;

    if-nez v0, :cond_0

    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    :cond_0
    check-cast p0, Lcom/facebook/react/bridge/ReactContext;

    return-object p0
.end method

.method public static e(Landroid/content/Context;)I
    .locals 1

    .line 1
    instance-of v0, p0, Lcom/facebook/react/uimanager/e0;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/facebook/react/uimanager/e0;

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/e0;->c()I

    move-result p0

    return p0

    :cond_0
    const/4 p0, -0x1

    return p0
.end method

.method public static f(Landroid/view/View;)I
    .locals 5

    .line 1
    instance-of v0, p0, Lcom/facebook/react/uimanager/S;

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    check-cast p0, Lcom/facebook/react/uimanager/S;

    invoke-interface {p0}, Lcom/facebook/react/uimanager/S;->getUIManagerType()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    invoke-interface {p0}, Lcom/facebook/react/uimanager/S;->getRootViewTag()I

    move-result v1

    :cond_0
    return v1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0}, Ly2/a;->a(I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    instance-of v2, p0, Lcom/facebook/react/uimanager/e0;

    if-nez v2, :cond_3

    instance-of v2, p0, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_3

    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    :cond_3
    invoke-static {p0}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result p0

    if-ne p0, v1, :cond_4

    sget-object v1, Lcom/facebook/react/uimanager/k0;->a:Ljava/lang/String;

    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Fabric View ["

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "] does not have SurfaceId associated with it"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v2}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return p0
.end method

.method public static g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lcom/facebook/react/uimanager/k0;->h(Lcom/facebook/react/bridge/ReactContext;IZ)Lcom/facebook/react/bridge/UIManager;

    move-result-object p0

    return-object p0
.end method

.method private static h(Lcom/facebook/react/bridge/ReactContext;IZ)Lcom/facebook/react/bridge/UIManager;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContext;->isBridgeless()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContext;->getFabricUIManager()Lcom/facebook/react/bridge/UIManager;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Lcom/facebook/react/uimanager/k0;->a:Ljava/lang/String;

    new-instance p1, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string p2, "Cannot get UIManager because the instance hasn\'t been initialized yet."

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {p0, p1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1

    :cond_0
    return-object p0

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContext;->hasCatalystInstance()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object p0, Lcom/facebook/react/uimanager/k0;->a:Ljava/lang/String;

    new-instance p1, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string p2, "Cannot get UIManager because the context doesn\'t contain a CatalystInstance."

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/facebook/react/uimanager/k0;->a:Ljava/lang/String;

    new-instance v2, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string v3, "Cannot get UIManager because the context doesn\'t contain an active CatalystInstance."

    invoke-direct {v2, v3}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p2, :cond_3

    return-object v1

    :cond_3
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContext;->getCatalystInstance()Lcom/facebook/react/bridge/CatalystInstance;

    move-result-object p2

    const/4 v0, 0x2

    const-class v1, Lcom/facebook/react/uimanager/UIManagerModule;

    if-ne p1, v0, :cond_4

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContext;->getFabricUIManager()Lcom/facebook/react/bridge/UIManager;

    move-result-object p0

    goto :goto_1

    :cond_4
    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/CatalystInstance;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/bridge/UIManager;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-object p0

    :catch_0
    sget-object p0, Lcom/facebook/react/uimanager/k0;->a:Ljava/lang/String;

    new-instance v0, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot get UIManager for UIManagerType: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/CatalystInstance;->getNativeModule(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;

    move-result-object p0

    check-cast p0, Lcom/facebook/react/bridge/UIManager;

    return-object p0
.end method

.method public static i(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;
    .locals 0

    .line 1
    invoke-static {p1}, Ly2/a;->a(I)I

    move-result p1

    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/k0;->g(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    move-result-object p0

    return-object p0
.end method
