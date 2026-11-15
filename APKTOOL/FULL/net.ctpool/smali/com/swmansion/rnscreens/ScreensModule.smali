.class public final Lcom/swmansion/rnscreens/ScreensModule;
.super Lcom/swmansion/rnscreens/NativeScreensModuleSpec;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/ScreensModule$a;
    }
.end annotation

.annotation runtime Li2/a;
    name = "RNSModule"
.end annotation


# static fields
.field public static final Companion:Lcom/swmansion/rnscreens/ScreensModule$a;

.field public static final NAME:Ljava/lang/String; = "RNSModule"


# instance fields
.field private final isActiveTransition:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private proxy:Lcom/swmansion/rnscreens/h;

.field private final reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private topScreenId:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/swmansion/rnscreens/ScreensModule$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/ScreensModule$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/ScreensModule;->Companion:Lcom/swmansion/rnscreens/ScreensModule$a;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 3

    const-string v0, "[RNScreens]"

    const-string v1, "reactContext"

    invoke-static {p1, v1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/NativeScreensModuleSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/ScreensModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    const/4 p1, -0x1

    iput p1, p0, Lcom/swmansion/rnscreens/ScreensModule;->topScreenId:I

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/ScreensModule;->isActiveTransition:Ljava/util/concurrent/atomic/AtomicBoolean;

    :try_start_0
    const-string p1, "rnscreens"

    invoke-static {p1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->getReactApplicationContext()Lcom/facebook/react/bridge/ReactApplicationContext;

    move-result-object p1

    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getJavaScriptContextHolder()Lcom/facebook/react/bridge/JavaScriptContextHolder;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/react/bridge/JavaScriptContextHolder;->get()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Lcom/swmansion/rnscreens/ScreensModule;->nativeInstall(J)V

    goto :goto_0

    :cond_0
    const-string p1, "Could not install JSI bindings."

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "Could not load RNScreens module."

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method private final finishTransition(Ljava/lang/Integer;Z)V
    .locals 2
    .annotation build LR1/a;
    .end annotation

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/swmansion/rnscreens/ScreensModule;->isActiveTransition:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_4

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/swmansion/rnscreens/ScreensModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/k0;->i(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/UIManager;->resolveView(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    instance-of v0, p1, Lcom/swmansion/rnscreens/t;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/swmansion/rnscreens/t;

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/n;->h()V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/n;->q()V

    :goto_1
    iget-object p1, p0, Lcom/swmansion/rnscreens/ScreensModule;->isActiveTransition:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_3
    const/4 p1, -0x1

    iput p1, p0, Lcom/swmansion/rnscreens/ScreensModule;->topScreenId:I

    return-void

    :cond_4
    :goto_2
    const-string p1, "[RNScreens]"

    const-string p2, "Unable to call `finishTransition` method before transition start."

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final native nativeInstall(J)V
.end method

.method private final startTransition(Ljava/lang/Integer;)[I
    .locals 7
    .annotation build LR1/a;
    .end annotation

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget-object v0, p0, Lcom/swmansion/rnscreens/ScreensModule;->isActiveTransition:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iput v1, p0, Lcom/swmansion/rnscreens/ScreensModule;->topScreenId:I

    const/4 v0, 0x2

    new-array v2, v0, [I

    const/4 v3, 0x0

    aput v1, v2, v3

    const/4 v4, 0x1

    aput v1, v2, v4

    iget-object v1, p0, Lcom/swmansion/rnscreens/ScreensModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v1, v5}, Lcom/facebook/react/uimanager/k0;->i(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-interface {v1, p1}, Lcom/facebook/react/bridge/UIManager;->resolveView(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    instance-of v1, p1, Lcom/swmansion/rnscreens/t;

    if-eqz v1, :cond_2

    check-cast p1, Lcom/swmansion/rnscreens/t;

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/t;->getFragments()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-le v5, v4, :cond_2

    iget-object v6, p0, Lcom/swmansion/rnscreens/ScreensModule;->isActiveTransition:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v6, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/n;->e()V

    add-int/lit8 p1, v5, -0x1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/swmansion/rnscreens/v;

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    iput p1, p0, Lcom/swmansion/rnscreens/ScreensModule;->topScreenId:I

    aput p1, v2, v3

    sub-int/2addr v5, v0

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/swmansion/rnscreens/v;

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->g()Lcom/swmansion/rnscreens/l;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    aput p1, v2, v4

    :cond_2
    return-object v2

    :cond_3
    :goto_1
    filled-new-array {v1, v1}, [I

    move-result-object p1

    return-object p1
.end method

.method private final updateTransition(D)V
    .locals 9
    .annotation build LR1/a;
    .end annotation

    invoke-static {}, Lcom/facebook/react/bridge/UiThreadUtil;->assertOnUiThread()V

    iget v0, p0, Lcom/swmansion/rnscreens/ScreensModule;->topScreenId:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    double-to-float v5, p1

    sget-object p1, Lcom/swmansion/rnscreens/q;->t:Lcom/swmansion/rnscreens/q$a;

    invoke-virtual {p1, v5}, Lcom/swmansion/rnscreens/q$a;->a(F)S

    move-result v8

    iget-object p1, p0, Lcom/swmansion/rnscreens/ScreensModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    iget p2, p0, Lcom/swmansion/rnscreens/ScreensModule;->topScreenId:I

    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p2, Lc5/h;

    iget-object v0, p0, Lcom/swmansion/rnscreens/ScreensModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {v0}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result v3

    iget v4, p0, Lcom/swmansion/rnscreens/ScreensModule;->topScreenId:I

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v2, p2

    invoke-direct/range {v2 .. v8}, Lc5/h;-><init>(IIFZZS)V

    invoke-interface {p1, p2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNSModule"

    return-object v0
.end method

.method public initialize()V
    .locals 0

    invoke-super {p0}, Lcom/facebook/react/bridge/BaseJavaModule;->initialize()V

    return-void
.end method
