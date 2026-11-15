.class public Lcom/swmansion/rnscreens/ScreenViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"

# interfaces
.implements LF2/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/ScreenViewManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/swmansion/rnscreens/l;",
        ">;",
        "LF2/n;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "RNSScreen"
.end annotation


# static fields
.field public static final Companion:Lcom/swmansion/rnscreens/ScreenViewManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RNSScreen"


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

    new-instance v0, Lcom/swmansion/rnscreens/ScreenViewManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/ScreenViewManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/ScreenViewManager;->Companion:Lcom/swmansion/rnscreens/ScreenViewManager$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    new-instance v0, LF2/m;

    invoke-direct {v0, p0}, LF2/m;-><init>(Lcom/facebook/react/uimanager/g;)V

    iput-object v0, p0, Lcom/swmansion/rnscreens/ScreenViewManager;->delegate:Lcom/facebook/react/uimanager/A0;

    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenViewManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/swmansion/rnscreens/l;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/swmansion/rnscreens/l;
    .locals 1

    .line 2
    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/swmansion/rnscreens/l;

    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/l;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    return-object v0
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/A0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/A0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/swmansion/rnscreens/ScreenViewManager;->delegate:Lcom/facebook/react/uimanager/A0;

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "onDismissed"

    const-string v1, "registrationName"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "topDismissed"

    invoke-static {v2, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v3

    const-string v0, "onWillAppear"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "topWillAppear"

    invoke-static {v2, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v4

    const-string v0, "onAppear"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "topAppear"

    invoke-static {v2, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v5

    const-string v0, "onWillDisappear"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "topWillDisappear"

    invoke-static {v2, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v6

    const-string v0, "onDisappear"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "topDisappear"

    invoke-static {v2, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v7

    const-string v0, "onHeaderHeightChange"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "topHeaderHeightChange"

    invoke-static {v2, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v8

    const-string v0, "onHeaderBackButtonClicked"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "topHeaderBackButtonClicked"

    invoke-static {v2, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v9

    const-string v0, "onTransitionProgress"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "topTransitionProgress"

    invoke-static {v1, v0}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v10

    filled-new-array/range {v3 .. v10}, [Li5/l;

    move-result-object v0

    invoke-static {v0}, Lj5/F;->j([Li5/l;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNSScreen"

    return-object v0
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/q;->removeAllViews(Landroid/view/View;)V

    return-void
.end method

.method public bridge synthetic setActivityState(Landroid/view/View;F)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setActivityState(Lcom/swmansion/rnscreens/l;F)V

    return-void
.end method

.method public setActivityState(Lcom/swmansion/rnscreens/l;F)V
    .locals 1

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    float-to-int p2, p2

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setActivityState(Lcom/swmansion/rnscreens/l;I)V

    return-void
.end method

.method public final setActivityState(Lcom/swmansion/rnscreens/l;I)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "activityState"
    .end annotation

    .line 3
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_3

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object p2, Lcom/swmansion/rnscreens/l$a;->o:Lcom/swmansion/rnscreens/l$a;

    :goto_0
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setActivityState(Lcom/swmansion/rnscreens/l$a;)V

    goto :goto_1

    :cond_2
    sget-object p2, Lcom/swmansion/rnscreens/l$a;->n:Lcom/swmansion/rnscreens/l$a;

    goto :goto_0

    :cond_3
    sget-object p2, Lcom/swmansion/rnscreens/l$a;->m:Lcom/swmansion/rnscreens/l$a;

    goto :goto_0

    :goto_1
    return-void
.end method

.method public bridge synthetic setCustomAnimationOnSwipe(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setCustomAnimationOnSwipe(Lcom/swmansion/rnscreens/l;Z)V

    return-void
.end method

.method public setCustomAnimationOnSwipe(Lcom/swmansion/rnscreens/l;Z)V
    .locals 0

    .line 2
    return-void
.end method

.method public bridge synthetic setFullScreenSwipeEnabled(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setFullScreenSwipeEnabled(Lcom/swmansion/rnscreens/l;Z)V

    return-void
.end method

.method public setFullScreenSwipeEnabled(Lcom/swmansion/rnscreens/l;Z)V
    .locals 0

    .line 2
    return-void
.end method

.method public bridge synthetic setFullScreenSwipeShadowEnabled(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setFullScreenSwipeShadowEnabled(Lcom/swmansion/rnscreens/l;Z)V

    return-void
.end method

.method public setFullScreenSwipeShadowEnabled(Lcom/swmansion/rnscreens/l;Z)V
    .locals 0

    .line 2
    return-void
.end method

.method public bridge synthetic setGestureEnabled(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setGestureEnabled(Lcom/swmansion/rnscreens/l;Z)V

    return-void
.end method

.method public setGestureEnabled(Lcom/swmansion/rnscreens/l;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        defaultBoolean = true
        name = "gestureEnabled"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setGestureEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setGestureResponseDistance(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setGestureResponseDistance(Lcom/swmansion/rnscreens/l;Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public setGestureResponseDistance(Lcom/swmansion/rnscreens/l;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    .line 2
    return-void
.end method

.method public bridge synthetic setHideKeyboardOnSwipe(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setHideKeyboardOnSwipe(Lcom/swmansion/rnscreens/l;Z)V

    return-void
.end method

.method public setHideKeyboardOnSwipe(Lcom/swmansion/rnscreens/l;Z)V
    .locals 0

    .line 2
    return-void
.end method

.method public bridge synthetic setHomeIndicatorHidden(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setHomeIndicatorHidden(Lcom/swmansion/rnscreens/l;Z)V

    return-void
.end method

.method public setHomeIndicatorHidden(Lcom/swmansion/rnscreens/l;Z)V
    .locals 0

    .line 2
    return-void
.end method

.method public bridge synthetic setNativeBackButtonDismissalEnabled(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setNativeBackButtonDismissalEnabled(Lcom/swmansion/rnscreens/l;Z)V

    return-void
.end method

.method public setNativeBackButtonDismissalEnabled(Lcom/swmansion/rnscreens/l;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "nativeBackButtonDismissalEnabled"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setNativeBackButtonDismissalEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setNavigationBarColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setNavigationBarColor(Lcom/swmansion/rnscreens/l;Ljava/lang/Integer;)V

    return-void
.end method

.method public setNavigationBarColor(Lcom/swmansion/rnscreens/l;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "navigationBarColor"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setNavigationBarColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setNavigationBarHidden(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setNavigationBarHidden(Lcom/swmansion/rnscreens/l;Z)V

    return-void
.end method

.method public setNavigationBarHidden(Lcom/swmansion/rnscreens/l;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "navigationBarHidden"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setNavigationBarHidden(Ljava/lang/Boolean;)V

    return-void
.end method

.method public bridge synthetic setNavigationBarTranslucent(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setNavigationBarTranslucent(Lcom/swmansion/rnscreens/l;Z)V

    return-void
.end method

.method public setNavigationBarTranslucent(Lcom/swmansion/rnscreens/l;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "navigationBarTranslucent"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setNavigationBarTranslucent(Ljava/lang/Boolean;)V

    return-void
.end method

.method public bridge synthetic setPreventNativeDismiss(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setPreventNativeDismiss(Lcom/swmansion/rnscreens/l;Z)V

    return-void
.end method

.method public setPreventNativeDismiss(Lcom/swmansion/rnscreens/l;Z)V
    .locals 0

    .line 2
    return-void
.end method

.method public bridge synthetic setReplaceAnimation(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setReplaceAnimation(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V

    return-void
.end method

.method public setReplaceAnimation(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "replaceAnimation"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "pop"

    invoke-static {p2, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    sget-object p2, Lcom/swmansion/rnscreens/l$b;->n:Lcom/swmansion/rnscreens/l$b;

    goto :goto_1

    :cond_1
    const-string v0, "push"

    invoke-static {p2, v0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p2, Lcom/swmansion/rnscreens/l$b;->m:Lcom/swmansion/rnscreens/l$b;

    :goto_1
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setReplaceAnimation(Lcom/swmansion/rnscreens/l$b;)V

    return-void

    :cond_2
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown replace animation type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic setScreenOrientation(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setScreenOrientation(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V

    return-void
.end method

.method public setScreenOrientation(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "screenOrientation"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setScreenOrientation(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setSheetAllowedDetents(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setSheetAllowedDetents(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V

    return-void
.end method

.method public setSheetAllowedDetents(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V
    .locals 0

    .line 2
    const-string p2, "view"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setSheetCornerRadius(Landroid/view/View;F)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setSheetCornerRadius(Lcom/swmansion/rnscreens/l;F)V

    return-void
.end method

.method public setSheetCornerRadius(Lcom/swmansion/rnscreens/l;F)V
    .locals 0

    .line 2
    return-void
.end method

.method public bridge synthetic setSheetExpandsWhenScrolledToEdge(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setSheetExpandsWhenScrolledToEdge(Lcom/swmansion/rnscreens/l;Z)V

    return-void
.end method

.method public setSheetExpandsWhenScrolledToEdge(Lcom/swmansion/rnscreens/l;Z)V
    .locals 0

    .line 2
    return-void
.end method

.method public bridge synthetic setSheetGrabberVisible(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setSheetGrabberVisible(Lcom/swmansion/rnscreens/l;Z)V

    return-void
.end method

.method public setSheetGrabberVisible(Lcom/swmansion/rnscreens/l;Z)V
    .locals 0

    .line 2
    return-void
.end method

.method public bridge synthetic setSheetLargestUndimmedDetent(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setSheetLargestUndimmedDetent(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V

    return-void
.end method

.method public setSheetLargestUndimmedDetent(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V
    .locals 0

    .line 2
    const-string p2, "view"

    invoke-static {p1, p2}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setStackAnimation(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setStackAnimation(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V

    return-void
.end method

.method public setStackAnimation(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "stackAnimation"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "slide_from_bottom"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/l$c;->p:Lcom/swmansion/rnscreens/l$c;

    goto/16 :goto_2

    :sswitch_1
    const-string v0, "default"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :sswitch_2
    const-string v0, "fade_from_bottom"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/l$c;->s:Lcom/swmansion/rnscreens/l$c;

    goto :goto_2

    :sswitch_3
    const-string v0, "none"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/l$c;->n:Lcom/swmansion/rnscreens/l$c;

    goto :goto_2

    :sswitch_4
    const-string v0, "flip"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :sswitch_5
    const-string v0, "fade"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/l$c;->o:Lcom/swmansion/rnscreens/l$c;

    goto :goto_2

    :sswitch_6
    const-string v0, "ios"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/l$c;->t:Lcom/swmansion/rnscreens/l$c;

    goto :goto_2

    :sswitch_7
    const-string v0, "slide_from_right"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/l$c;->q:Lcom/swmansion/rnscreens/l$c;

    goto :goto_2

    :sswitch_8
    const-string v0, "slide_from_left"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/l$c;->r:Lcom/swmansion/rnscreens/l$c;

    goto :goto_2

    :sswitch_9
    const-string v0, "simple_push"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown animation type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    sget-object p2, Lcom/swmansion/rnscreens/l$c;->m:Lcom/swmansion/rnscreens/l$c;

    :goto_2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setStackAnimation(Lcom/swmansion/rnscreens/l$c;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x54938a79 -> :sswitch_9
        -0x1974f592 -> :sswitch_8
        -0x14d35b6b -> :sswitch_7
        0x1980d -> :sswitch_6
        0x2fd67c -> :sswitch_5
        0x30006d -> :sswitch_4
        0x33af38 -> :sswitch_3
        0xadfc71d -> :sswitch_2
        0x5c13d641 -> :sswitch_1
        0x5f7506d2 -> :sswitch_0
    .end sparse-switch
.end method

.method public bridge synthetic setStackPresentation(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setStackPresentation(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V

    return-void
.end method

.method public setStackPresentation(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "stackPresentation"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    const-string v0, "formSheet"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :sswitch_1
    const-string v0, "fullScreenModal"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :sswitch_2
    const-string v0, "containedTransparentModal"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :sswitch_3
    const-string v0, "containedModal"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :sswitch_4
    const-string v0, "modal"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    sget-object p2, Lcom/swmansion/rnscreens/l$d;->n:Lcom/swmansion/rnscreens/l$d;

    goto :goto_2

    :sswitch_5
    const-string v0, "push"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/swmansion/rnscreens/l$d;->m:Lcom/swmansion/rnscreens/l$d;

    goto :goto_2

    :sswitch_6
    const-string v0, "transparentModal"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    sget-object p2, Lcom/swmansion/rnscreens/l$d;->o:Lcom/swmansion/rnscreens/l$d;

    :goto_2
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setStackPresentation(Lcom/swmansion/rnscreens/l$d;)V

    return-void

    :cond_0
    :goto_3
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown presentation type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_data_0
    .sparse-switch
        -0x48bcf85 -> :sswitch_6
        0x34af1a -> :sswitch_5
        0x633faad -> :sswitch_4
        0x1a1c8dfa -> :sswitch_3
        0x38f07b0e -> :sswitch_2
        0x45da5392 -> :sswitch_1
        0x6b2fbafb -> :sswitch_0
    .end sparse-switch
.end method

.method public bridge synthetic setStatusBarAnimation(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setStatusBarAnimation(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V

    return-void
.end method

.method public setStatusBarAnimation(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "statusBarAnimation"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    const-string v0, "none"

    invoke-static {v0, p2}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setStatusBarAnimated(Ljava/lang/Boolean;)V

    return-void
.end method

.method public bridge synthetic setStatusBarColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setStatusBarColor(Lcom/swmansion/rnscreens/l;Ljava/lang/Integer;)V

    return-void
.end method

.method public setStatusBarColor(Lcom/swmansion/rnscreens/l;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "statusBarColor"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setStatusBarColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setStatusBarHidden(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setStatusBarHidden(Lcom/swmansion/rnscreens/l;Z)V

    return-void
.end method

.method public setStatusBarHidden(Lcom/swmansion/rnscreens/l;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "statusBarHidden"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setStatusBarHidden(Ljava/lang/Boolean;)V

    return-void
.end method

.method public bridge synthetic setStatusBarStyle(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setStatusBarStyle(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V

    return-void
.end method

.method public setStatusBarStyle(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "statusBarStyle"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setStatusBarStyle(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setStatusBarTranslucent(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setStatusBarTranslucent(Lcom/swmansion/rnscreens/l;Z)V

    return-void
.end method

.method public setStatusBarTranslucent(Lcom/swmansion/rnscreens/l;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "statusBarTranslucent"
    .end annotation

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/l;->setStatusBarTranslucent(Ljava/lang/Boolean;)V

    return-void
.end method

.method public bridge synthetic setSwipeDirection(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setSwipeDirection(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V

    return-void
.end method

.method public setSwipeDirection(Lcom/swmansion/rnscreens/l;Ljava/lang/String;)V
    .locals 0

    .line 2
    return-void
.end method

.method public bridge synthetic setTransitionDuration(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenViewManager;->setTransitionDuration(Lcom/swmansion/rnscreens/l;I)V

    return-void
.end method

.method public setTransitionDuration(Lcom/swmansion/rnscreens/l;I)V
    .locals 0

    .line 2
    return-void
.end method

.method public bridge synthetic updateState(Landroid/view/View;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/l;

    invoke-virtual {p0, p1, p2, p3}, Lcom/swmansion/rnscreens/ScreenViewManager;->updateState(Lcom/swmansion/rnscreens/l;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updateState(Lcom/swmansion/rnscreens/l;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;
    .locals 1

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/ViewManager;->updateState(Landroid/view/View;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
