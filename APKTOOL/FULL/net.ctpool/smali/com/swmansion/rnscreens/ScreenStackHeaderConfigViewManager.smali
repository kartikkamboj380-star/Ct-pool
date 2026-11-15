.class public final Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"

# interfaces
.implements LF2/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/swmansion/rnscreens/x;",
        ">;",
        "LF2/p;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "RNSScreenStackHeaderConfig"
.end annotation


# static fields
.field public static final Companion:Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "RNSScreenStackHeaderConfig"


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

    new-instance v0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->Companion:Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    new-instance v0, LF2/o;

    invoke-direct {v0, p0}, LF2/o;-><init>(Lcom/facebook/react/uimanager/g;)V

    iput-object v0, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->delegate:Lcom/facebook/react/uimanager/A0;

    return-void
.end method

.method private final logNotAvailable(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " prop is not available on Android"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "[RNScreens]"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public bridge synthetic addView(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2, p3}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->addView(Lcom/swmansion/rnscreens/x;Landroid/view/View;I)V

    return-void
.end method

.method public bridge synthetic addView(Landroid/view/ViewGroup;Landroid/view/View;I)V
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2, p3}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->addView(Lcom/swmansion/rnscreens/x;Landroid/view/View;I)V

    return-void
.end method

.method public addView(Lcom/swmansion/rnscreens/x;Landroid/view/View;I)V
    .locals 1

    .line 3
    const-string v0, "parent"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "child"

    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcom/swmansion/rnscreens/y;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/swmansion/rnscreens/y;

    invoke-virtual {p1, p2, p3}, Lcom/swmansion/rnscreens/x;->b(Lcom/swmansion/rnscreens/y;I)V

    return-void

    :cond_0
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationCausedNativeException;

    const-string p2, "Config children should be of type RNSScreenStackHeaderSubview"

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationCausedNativeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/swmansion/rnscreens/x;

    move-result-object p1

    return-object p1
.end method

.method protected createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/swmansion/rnscreens/x;
    .locals 1

    .line 2
    const-string v0, "reactContext"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/swmansion/rnscreens/x;

    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/x;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public bridge synthetic getChildAt(Landroid/view/View;I)Landroid/view/View;
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->getChildAt(Lcom/swmansion/rnscreens/x;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getChildAt(Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->getChildAt(Lcom/swmansion/rnscreens/x;I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public getChildAt(Lcom/swmansion/rnscreens/x;I)Landroid/view/View;
    .locals 1

    .line 3
    const-string v0, "parent"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->e(I)Lcom/swmansion/rnscreens/y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getChildCount(Landroid/view/View;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->getChildCount(Lcom/swmansion/rnscreens/x;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic getChildCount(Landroid/view/ViewGroup;)I
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->getChildCount(Lcom/swmansion/rnscreens/x;)I

    move-result p1

    return p1
.end method

.method public getChildCount(Lcom/swmansion/rnscreens/x;)I
    .locals 1

    .line 3
    const-string v0, "parent"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/x;->getConfigSubviewsCount()I

    move-result p1

    return p1
.end method

.method protected getDelegate()Lcom/facebook/react/uimanager/A0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/facebook/react/uimanager/A0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->delegate:Lcom/facebook/react/uimanager/A0;

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "onAttached"

    const-string v1, "registrationName"

    invoke-static {v1, v0}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "onDetached"

    invoke-static {v1, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "topAttached"

    const-string v3, "topDetached"

    invoke-static {v2, v0, v3, v1}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RNSScreenStackHeaderConfig"

    return-object v0
.end method

.method public needsCustomLayoutForChildren()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->onAfterUpdateTransaction(Lcom/swmansion/rnscreens/x;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lcom/swmansion/rnscreens/x;)V
    .locals 1

    .line 2
    const-string v0, "parent"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/x;->i()V

    return-void
.end method

.method public bridge synthetic onDropViewInstance(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->onDropViewInstance(Lcom/swmansion/rnscreens/x;)V

    return-void
.end method

.method public onDropViewInstance(Lcom/swmansion/rnscreens/x;)V
    .locals 1

    .line 2
    const-string v0, "view"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/x;->d()V

    return-void
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->removeAllViews(Lcom/swmansion/rnscreens/x;)V

    return-void
.end method

.method public removeAllViews(Lcom/swmansion/rnscreens/x;)V
    .locals 1

    .line 2
    const-string v0, "parent"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/x;->j()V

    return-void
.end method

.method public bridge synthetic removeViewAt(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->removeViewAt(Lcom/swmansion/rnscreens/x;I)V

    return-void
.end method

.method public bridge synthetic removeViewAt(Landroid/view/ViewGroup;I)V
    .locals 0

    .line 2
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->removeViewAt(Lcom/swmansion/rnscreens/x;I)V

    return-void
.end method

.method public removeViewAt(Lcom/swmansion/rnscreens/x;I)V
    .locals 1

    .line 3
    const-string v0, "parent"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->k(I)V

    return-void
.end method

.method public bridge synthetic setBackButtonDisplayMode(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setBackButtonDisplayMode(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V

    return-void
.end method

.method public setBackButtonDisplayMode(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V
    .locals 0

    .line 2
    const-string p1, "backButtonDisplayMode"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setBackButtonInCustomView(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setBackButtonInCustomView(Lcom/swmansion/rnscreens/x;Z)V

    return-void
.end method

.method public setBackButtonInCustomView(Lcom/swmansion/rnscreens/x;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "backButtonInCustomView"
    .end annotation

    .line 2
    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->setBackButtonInCustomView(Z)V

    return-void
.end method

.method public bridge synthetic setBackTitle(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setBackTitle(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V

    return-void
.end method

.method public setBackTitle(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V
    .locals 0

    .line 2
    const-string p1, "backTitle"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setBackTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setBackTitleFontFamily(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V

    return-void
.end method

.method public setBackTitleFontFamily(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V
    .locals 0

    .line 2
    const-string p1, "backTitleFontFamily"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setBackTitleFontSize(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setBackTitleFontSize(Lcom/swmansion/rnscreens/x;I)V

    return-void
.end method

.method public setBackTitleFontSize(Lcom/swmansion/rnscreens/x;I)V
    .locals 0

    .line 2
    const-string p1, "backTitleFontSize"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setBackTitleVisible(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setBackTitleVisible(Lcom/swmansion/rnscreens/x;Z)V

    return-void
.end method

.method public setBackTitleVisible(Lcom/swmansion/rnscreens/x;Z)V
    .locals 0

    .line 2
    const-string p1, "backTitleVisible"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setBackgroundColor(Lcom/swmansion/rnscreens/x;Ljava/lang/Integer;)V

    return-void
.end method

.method public setBackgroundColor(Lcom/swmansion/rnscreens/x;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "backgroundColor"
    .end annotation

    .line 2
    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->setBackgroundColor(Ljava/lang/Integer;)V

    return-void
.end method

.method public bridge synthetic setColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setColor(Lcom/swmansion/rnscreens/x;Ljava/lang/Integer;)V

    return-void
.end method

.method public setColor(Lcom/swmansion/rnscreens/x;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "color"
    .end annotation

    .line 2
    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->setTintColor(I)V

    return-void
.end method

.method public bridge synthetic setDirection(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setDirection(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V

    return-void
.end method

.method public setDirection(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "direction"
    .end annotation

    .line 2
    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->setDirection(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setDisableBackButtonMenu(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setDisableBackButtonMenu(Lcom/swmansion/rnscreens/x;Z)V

    return-void
.end method

.method public setDisableBackButtonMenu(Lcom/swmansion/rnscreens/x;Z)V
    .locals 0

    .line 2
    const-string p1, "disableBackButtonMenu"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setHidden(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setHidden(Lcom/swmansion/rnscreens/x;Z)V

    return-void
.end method

.method public setHidden(Lcom/swmansion/rnscreens/x;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "hidden"
    .end annotation

    .line 2
    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->setHidden(Z)V

    return-void
.end method

.method public bridge synthetic setHideBackButton(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setHideBackButton(Lcom/swmansion/rnscreens/x;Z)V

    return-void
.end method

.method public setHideBackButton(Lcom/swmansion/rnscreens/x;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "hideBackButton"
    .end annotation

    .line 2
    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->setHideBackButton(Z)V

    return-void
.end method

.method public bridge synthetic setHideShadow(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setHideShadow(Lcom/swmansion/rnscreens/x;Z)V

    return-void
.end method

.method public setHideShadow(Lcom/swmansion/rnscreens/x;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "hideShadow"
    .end annotation

    .line 2
    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->setHideShadow(Z)V

    return-void
.end method

.method public bridge synthetic setLargeTitle(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setLargeTitle(Lcom/swmansion/rnscreens/x;Z)V

    return-void
.end method

.method public setLargeTitle(Lcom/swmansion/rnscreens/x;Z)V
    .locals 0

    .line 2
    const-string p1, "largeTitle"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setLargeTitleBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setLargeTitleBackgroundColor(Lcom/swmansion/rnscreens/x;Ljava/lang/Integer;)V

    return-void
.end method

.method public setLargeTitleBackgroundColor(Lcom/swmansion/rnscreens/x;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    const-string p1, "largeTitleBackgroundColor"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setLargeTitleColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setLargeTitleColor(Lcom/swmansion/rnscreens/x;Ljava/lang/Integer;)V

    return-void
.end method

.method public setLargeTitleColor(Lcom/swmansion/rnscreens/x;Ljava/lang/Integer;)V
    .locals 0

    .line 2
    const-string p1, "largeTitleColor"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setLargeTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setLargeTitleFontFamily(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V

    return-void
.end method

.method public setLargeTitleFontFamily(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V
    .locals 0

    .line 2
    const-string p1, "largeTitleFontFamily"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setLargeTitleFontSize(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setLargeTitleFontSize(Lcom/swmansion/rnscreens/x;I)V

    return-void
.end method

.method public setLargeTitleFontSize(Lcom/swmansion/rnscreens/x;I)V
    .locals 0

    .line 2
    const-string p1, "largeTitleFontSize"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setLargeTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setLargeTitleFontWeight(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V

    return-void
.end method

.method public setLargeTitleFontWeight(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V
    .locals 0

    .line 2
    const-string p1, "largeTitleFontWeight"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setLargeTitleHideShadow(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setLargeTitleHideShadow(Lcom/swmansion/rnscreens/x;Z)V

    return-void
.end method

.method public setLargeTitleHideShadow(Lcom/swmansion/rnscreens/x;Z)V
    .locals 0

    .line 2
    const-string p1, "largeTitleHideShadow"

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->logNotAvailable(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTitle(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setTitle(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V

    return-void
.end method

.method public setTitle(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "title"
    .end annotation

    .line 2
    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->setTitle(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTitleColor(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setTitleColor(Lcom/swmansion/rnscreens/x;Ljava/lang/Integer;)V

    return-void
.end method

.method public setTitleColor(Lcom/swmansion/rnscreens/x;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "titleColor"
    .end annotation

    .line 2
    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->setTitleColor(I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic setTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setTitleFontFamily(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V

    return-void
.end method

.method public setTitleFontFamily(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "titleFontFamily"
    .end annotation

    .line 2
    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->setTitleFontFamily(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTitleFontSize(Landroid/view/View;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setTitleFontSize(Lcom/swmansion/rnscreens/x;I)V

    return-void
.end method

.method public setTitleFontSize(Lcom/swmansion/rnscreens/x;I)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "titleFontSize"
    .end annotation

    .line 2
    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->setTitleFontSize(F)V

    return-void
.end method

.method public bridge synthetic setTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setTitleFontWeight(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V

    return-void
.end method

.method public setTitleFontWeight(Lcom/swmansion/rnscreens/x;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "titleFontWeight"
    .end annotation

    .line 2
    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->setTitleFontWeight(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setTopInsetEnabled(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setTopInsetEnabled(Lcom/swmansion/rnscreens/x;Z)V

    return-void
.end method

.method public setTopInsetEnabled(Lcom/swmansion/rnscreens/x;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "topInsetEnabled"
    .end annotation

    .line 2
    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->setTopInsetEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setTranslucent(Landroid/view/View;Z)V
    .locals 0

    .line 1
    check-cast p1, Lcom/swmansion/rnscreens/x;

    invoke-virtual {p0, p1, p2}, Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;->setTranslucent(Lcom/swmansion/rnscreens/x;Z)V

    return-void
.end method

.method public setTranslucent(Lcom/swmansion/rnscreens/x;Z)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "translucent"
    .end annotation

    .line 2
    const-string v0, "config"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/swmansion/rnscreens/x;->setTranslucent(Z)V

    return-void
.end method
