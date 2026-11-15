.class public final Lcom/facebook/react/views/modal/ReactModalHostManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"

# interfaces
.implements LF2/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/modal/ReactModalHostManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/facebook/react/views/modal/f;",
        ">;",
        "LF2/j;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "RCTModalHostView"
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/views/modal/ReactModalHostManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RCTModalHostView"


# instance fields
.field private final delegate:Lcom/facebook/react/uimanager/A0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/react/uimanager/A0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/views/modal/ReactModalHostManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/views/modal/ReactModalHostManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/views/modal/ReactModalHostManager;->Companion:Lcom/facebook/react/views/modal/ReactModalHostManager$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    new-instance v0, LF2/i;

    invoke-direct {v0, p0}, LF2/i;-><init>(Lcom/facebook/react/uimanager/g;)V

    iput-object v0, p0, Lcom/facebook/react/views/modal/ReactModalHostManager;->delegate:Lcom/facebook/react/uimanager/A0;

    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/uimanager/events/e;Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/modal/f;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/views/modal/ReactModalHostManager;->addEventEmitters$lambda$1(Lcom/facebook/react/uimanager/events/e;Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/modal/f;Landroid/content/DialogInterface;)V

    return-void
.end method

.method private static final addEventEmitters$lambda$0(Lcom/facebook/react/uimanager/events/e;Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/modal/f;Landroid/content/DialogInterface;)V
    .locals 0

    const-string p3, "$reactContext"

    invoke-static {p1, p3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$view"

    invoke-static {p2, p3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lcom/facebook/react/views/modal/g;

    invoke-static {p1}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result p1

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    invoke-direct {p3, p1, p2}, Lcom/facebook/react/views/modal/g;-><init>(II)V

    invoke-interface {p0, p3}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method private static final addEventEmitters$lambda$1(Lcom/facebook/react/uimanager/events/e;Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/modal/f;Landroid/content/DialogInterface;)V
    .locals 0

    const-string p3, "$reactContext"

    invoke-static {p1, p3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "$view"

    invoke-static {p2, p3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lcom/facebook/react/views/modal/h;

    invoke-static {p1}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result p1

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p2

    invoke-direct {p3, p1, p2}, Lcom/facebook/react/views/modal/h;-><init>(II)V

    invoke-interface {p0, p3}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/uimanager/events/e;Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/modal/f;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/views/modal/ReactModalHostManager;->addEventEmitters$lambda$0(Lcom/facebook/react/uimanager/events/e;Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/modal/f;Landroid/content/DialogInterface;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic addEventEmitters(Lcom/facebook/react/uimanager/e0;Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/facebook/react/views/modal/f;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/modal/ReactModalHostManager;->addEventEmitters(Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/modal/f;)V

    return-void
.end method

.method protected addEventEmitters(Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/modal/f;)V
    .locals 2

    .line 2
    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/facebook/react/views/modal/c;

    invoke-direct {v1, v0, p1, p2}, Lcom/facebook/react/views/modal/c;-><init>(Lcom/facebook/react/uimanager/events/e;Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/modal/f;)V

    invoke-virtual {p2, v1}, Lcom/facebook/react/views/modal/f;->setOnRequestCloseListener(Lcom/facebook/react/views/modal/f$c;)V

    new-instance v1, Lcom/facebook/react/views/modal/d;

    invoke-direct {v1, v0, p1, p2}, Lcom/facebook/react/views/modal/d;-><init>(Lcom/facebook/react/uimanager/events/e;Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/modal/f;)V

    invoke-virtual {p2, v1}, Lcom/facebook/react/views/modal/f;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    invoke-virtual {p2, v0}, Lcom/facebook/react/views/modal/f;->setEventDispatcher(Lcom/facebook/react/uimanager/events/e;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic createShadowNodeInstance()Lcom/facebook/react/uimanager/U;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/facebook/react/views/modal/ReactModalHostManager;->createShadowNodeInstance()Lcom/facebook/react/uimanager/v;

    move-result-object v0

    return-object v0
.end method

.method public createShadowNodeInstance()Lcom/facebook/react/uimanager/v;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/views/modal/b;

    invoke-direct {v0}, Lcom/facebook/react/views/modal/b;-><init>()V

    return-object v0
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/modal/ReactModalHostManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/modal/f;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/modal/f;
    .locals 1

    .line 2
    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/facebook/react/views/modal/f;

    invoke-direct {v0, p1}, Lcom/facebook/react/views/modal/f;-><init>(Lcom/facebook/react/uimanager/e0;)V

    return-object v0
.end method

.method public getDelegate()Lcom/facebook/react/uimanager/A0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/A0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/views/modal/ReactModalHostManager;->delegate:Lcom/facebook/react/uimanager/A0;

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/facebook/react/uimanager/BaseViewManager;->getExportedCustomDirectEventTypeConstants()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_0
    invoke-static {}, LS1/f;->a()LS1/f$a;

    move-result-object v1

    const-string v2, "onRequestClose"

    const-string v3, "registrationName"

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    const-string v4, "topRequestClose"

    invoke-virtual {v1, v4, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v1

    const-string v2, "onShow"

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    const-string v4, "topShow"

    invoke-virtual {v1, v4, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v1

    const-string v2, "onDismiss"

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    const-string v4, "topDismiss"

    invoke-virtual {v1, v4, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v1

    const-string v2, "onOrientationChange"

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    const-string v3, "topOrientationChange"

    invoke-virtual {v1, v3, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v1

    invoke-virtual {v1}, LS1/f$a;->a()Ljava/util/Map;

    move-result-object v1

    const-string v2, "build(...)"

    invoke-static {v1, v2}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RCTModalHostView"

    return-object v0
.end method

.method public getShadowNodeClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "+",
            "Lcom/facebook/react/uimanager/v;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/facebook/react/views/modal/b;

    return-object v0
.end method

.method public bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/modal/f;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/modal/ReactModalHostManager;->onAfterUpdateTransaction(Lcom/facebook/react/views/modal/f;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lcom/facebook/react/views/modal/f;)V
    .locals 1

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    invoke-virtual {p1}, Lcom/facebook/react/views/modal/f;->c()V

    return-void
.end method

.method public bridge synthetic onDropViewInstance(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/modal/f;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/modal/ReactModalHostManager;->onDropViewInstance(Lcom/facebook/react/views/modal/f;)V

    return-void
.end method

.method public onDropViewInstance(Lcom/facebook/react/views/modal/f;)V
    .locals 1

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/ViewManager;->onDropViewInstance(Landroid/view/View;)V

    invoke-virtual {p1}, Lcom/facebook/react/views/modal/f;->b()V

    return-void
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/q;->removeAllViews(Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic setAnimated(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/modal/f;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/modal/ReactModalHostManager;->setAnimated(Lcom/facebook/react/views/modal/f;Z)V

    return-void
.end method

.method public setAnimated(Lcom/facebook/react/views/modal/f;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "animated"
    .end annotation

    .line 2
    const-string p2, "view"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setAnimationType(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/modal/f;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/modal/ReactModalHostManager;->setAnimationType(Lcom/facebook/react/views/modal/f;Ljava/lang/String;)V

    return-void
.end method

.method public setAnimationType(Lcom/facebook/react/views/modal/f;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "animationType"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/modal/f;->setAnimationType(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setHardwareAccelerated(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/modal/f;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/modal/ReactModalHostManager;->setHardwareAccelerated(Lcom/facebook/react/views/modal/f;Z)V

    return-void
.end method

.method public setHardwareAccelerated(Lcom/facebook/react/views/modal/f;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "hardwareAccelerated"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/modal/f;->setHardwareAccelerated(Z)V

    return-void
.end method

.method public bridge synthetic setIdentifier(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/modal/f;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/modal/ReactModalHostManager;->setIdentifier(Lcom/facebook/react/views/modal/f;I)V

    return-void
.end method

.method public setIdentifier(Lcom/facebook/react/views/modal/f;I)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "identifier"
    .end annotation

    .line 2
    const-string p2, "view"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setPresentationStyle(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/modal/f;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/modal/ReactModalHostManager;->setPresentationStyle(Lcom/facebook/react/views/modal/f;Ljava/lang/String;)V

    return-void
.end method

.method public setPresentationStyle(Lcom/facebook/react/views/modal/f;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "presentationStyle"
    .end annotation

    .line 2
    const-string p2, "view"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setStatusBarTranslucent(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/modal/f;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/modal/ReactModalHostManager;->setStatusBarTranslucent(Lcom/facebook/react/views/modal/f;Z)V

    return-void
.end method

.method public setStatusBarTranslucent(Lcom/facebook/react/views/modal/f;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "statusBarTranslucent"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/modal/f;->setStatusBarTranslucent(Z)V

    return-void
.end method

.method public bridge synthetic setSupportedOrientations(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/modal/f;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/modal/ReactModalHostManager;->setSupportedOrientations(Lcom/facebook/react/views/modal/f;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setSupportedOrientations(Lcom/facebook/react/views/modal/f;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "supportedOrientations"
    .end annotation

    .line 2
    const-string p2, "view"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTransparent(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/modal/f;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/modal/ReactModalHostManager;->setTransparent(Lcom/facebook/react/views/modal/f;Z)V

    return-void
.end method

.method public setTransparent(Lcom/facebook/react/views/modal/f;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "transparent"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/modal/f;->setTransparent(Z)V

    return-void
.end method

.method public bridge synthetic setVisible(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/modal/f;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/modal/ReactModalHostManager;->setVisible(Lcom/facebook/react/views/modal/f;Z)V

    return-void
.end method

.method public setVisible(Lcom/facebook/react/views/modal/f;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "visible"
    .end annotation

    .line 2
    const-string p2, "view"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic updateState(Landroid/view/View;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/modal/f;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/modal/ReactModalHostManager;->updateState(Lcom/facebook/react/views/modal/f;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updateState(Lcom/facebook/react/views/modal/f;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;
    .locals 1

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "props"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "stateWrapper"

    invoke-static {p3, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Lcom/facebook/react/views/modal/f;->setStateWrapper(Lcom/facebook/react/uimanager/d0;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string p3, "getContext(...)"

    invoke-static {p2, p3}, Lw5/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/facebook/react/views/modal/a;->a(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object p2

    iget p3, p2, Landroid/graphics/Point;->x:I

    iget p2, p2, Landroid/graphics/Point;->y:I

    invoke-virtual {p1, p3, p2}, Lcom/facebook/react/views/modal/f;->e(II)V

    const/4 p1, 0x0

    return-object p1
.end method
