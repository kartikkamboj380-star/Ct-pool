.class public Lcom/facebook/react/views/scroll/ReactScrollViewManager;
.super Lcom/facebook/react/uimanager/ViewGroupManager;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/views/scroll/e$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/ViewGroupManager<",
        "Lcom/facebook/react/views/scroll/c;",
        ">;",
        "Lcom/facebook/react/views/scroll/e$a;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "RCTScrollView"
.end annotation


# static fields
.field public static final REACT_CLASS:Ljava/lang/String; = "RCTScrollView"

.field private static final SPACING_TYPES:[I


# instance fields
.field private mFpsListener:LK2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x3

    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x2

    filled-new-array {v2, v3, v4, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/facebook/react/views/scroll/ReactScrollViewManager;->SPACING_TYPES:[I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;-><init>(LK2/a;)V

    return-void
.end method

.method public constructor <init>(LK2/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/uimanager/ViewGroupManager;-><init>()V

    return-void
.end method

.method public static createExportedCustomDirectEventTypeConstants()Ljava/util/Map;
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

    invoke-static {}, LS1/f;->a()LS1/f$a;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/views/scroll/h;->p:Lcom/facebook/react/views/scroll/h;

    invoke-static {v1}, Lcom/facebook/react/views/scroll/h;->h(Lcom/facebook/react/views/scroll/h;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onScroll"

    const-string v3, "registrationName"

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/views/scroll/h;->n:Lcom/facebook/react/views/scroll/h;

    invoke-static {v1}, Lcom/facebook/react/views/scroll/h;->h(Lcom/facebook/react/views/scroll/h;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onScrollBeginDrag"

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/views/scroll/h;->o:Lcom/facebook/react/views/scroll/h;

    invoke-static {v1}, Lcom/facebook/react/views/scroll/h;->h(Lcom/facebook/react/views/scroll/h;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onScrollEndDrag"

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/views/scroll/h;->q:Lcom/facebook/react/views/scroll/h;

    invoke-static {v1}, Lcom/facebook/react/views/scroll/h;->h(Lcom/facebook/react/views/scroll/h;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onMomentumScrollBegin"

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/views/scroll/h;->r:Lcom/facebook/react/views/scroll/h;

    invoke-static {v1}, Lcom/facebook/react/views/scroll/h;->h(Lcom/facebook/react/views/scroll/h;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "onMomentumScrollEnd"

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    invoke-virtual {v0}, LS1/f$a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/scroll/c;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/scroll/c;
    .locals 2

    .line 2
    new-instance v0, Lcom/facebook/react/views/scroll/c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/react/views/scroll/c;-><init>(Landroid/content/Context;LK2/a;)V

    return-object v0
.end method

.method public flashScrollIndicators(Lcom/facebook/react/views/scroll/c;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->p()V

    return-void
.end method

.method public bridge synthetic flashScrollIndicators(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/facebook/react/views/scroll/c;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;->flashScrollIndicators(Lcom/facebook/react/views/scroll/c;)V

    return-void
.end method

.method public getCommandsMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/facebook/react/views/scroll/e;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 2
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

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :cond_0
    invoke-static {}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;->createExportedCustomDirectEventTypeConstants()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RCTScrollView"

    return-object v0
.end method

.method public bridge synthetic receiveCommand(Landroid/view/View;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/scroll/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;->receiveCommand(Lcom/facebook/react/views/scroll/c;ILcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public bridge synthetic receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/facebook/react/views/scroll/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;->receiveCommand(Lcom/facebook/react/views/scroll/c;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public receiveCommand(Lcom/facebook/react/views/scroll/c;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/views/scroll/e;->b(Lcom/facebook/react/views/scroll/e$a;Ljava/lang/Object;ILcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public receiveCommand(Lcom/facebook/react/views/scroll/c;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 4
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/views/scroll/e;->c(Lcom/facebook/react/views/scroll/e$a;Ljava/lang/Object;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public bridge synthetic removeAllViews(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/q;->removeAllViews(Landroid/view/View;)V

    return-void
.end method

.method public scrollTo(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/e$b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->k()V

    iget-boolean v0, p2, Lcom/facebook/react/views/scroll/e$b;->c:Z

    if-eqz v0, :cond_0

    iget v0, p2, Lcom/facebook/react/views/scroll/e$b;->a:I

    iget p2, p2, Lcom/facebook/react/views/scroll/e$b;->b:I

    invoke-virtual {p1, v0, p2}, Lcom/facebook/react/views/scroll/c;->c(II)V

    goto :goto_0

    :cond_0
    iget v0, p2, Lcom/facebook/react/views/scroll/e$b;->a:I

    iget p2, p2, Lcom/facebook/react/views/scroll/e$b;->b:I

    invoke-virtual {p1, v0, p2}, Lcom/facebook/react/views/scroll/c;->scrollTo(II)V

    :goto_0
    return-void
.end method

.method public bridge synthetic scrollTo(Ljava/lang/Object;Lcom/facebook/react/views/scroll/e$b;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/facebook/react/views/scroll/c;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;->scrollTo(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/e$b;)V

    return-void
.end method

.method public scrollToEnd(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/e$c;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/c;->k()V

    iget-boolean p2, p2, Lcom/facebook/react/views/scroll/e$c;->a:Z

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result p2

    invoke-virtual {p1, p2, v0}, Lcom/facebook/react/views/scroll/c;->c(II)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result p2

    invoke-virtual {p1, p2, v0}, Lcom/facebook/react/views/scroll/c;->scrollTo(II)V

    :goto_0
    return-void

    :cond_1
    new-instance p1, Lcom/facebook/react/bridge/RetryableMountingLayerException;

    const-string p2, "scrollToEnd called on ScrollView without child"

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/RetryableMountingLayerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic scrollToEnd(Ljava/lang/Object;Lcom/facebook/react/views/scroll/e$c;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/facebook/react/views/scroll/c;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;->scrollToEnd(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/views/scroll/e$c;)V

    return-void
.end method

.method public setBorderColor(Lcom/facebook/react/views/scroll/c;ILjava/lang/Integer;)V
    .locals 3
    .annotation runtime Lx2/b;
        customType = "Color"
        names = {
            "borderColor",
            "borderLeftColor",
            "borderRightColor",
            "borderTopColor",
            "borderBottomColor"
        }
    .end annotation

    const/high16 v0, 0x7fc00000    # Float.NaN

    if-nez p3, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const v2, 0xffffff

    and-int/2addr v1, v2

    int-to-float v1, v1

    :goto_0
    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    ushr-int/lit8 p3, p3, 0x18

    int-to-float v0, p3

    :goto_1
    sget-object p3, Lcom/facebook/react/views/scroll/ReactScrollViewManager;->SPACING_TYPES:[I

    aget p2, p3, p2

    invoke-virtual {p1, p2, v1, v0}, Lcom/facebook/react/views/scroll/c;->C(IFF)V

    return-void
.end method

.method public setBorderRadius(Lcom/facebook/react/views/scroll/c;IF)V
    .locals 1
    .annotation runtime Lx2/b;
        defaultFloat = NaNf
        names = {
            "borderRadius",
            "borderTopLeftRadius",
            "borderTopRightRadius",
            "borderBottomRightRadius",
            "borderBottomLeftRadius"
        }
    .end annotation

    invoke-static {p3}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p3

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p1, p3}, Lcom/facebook/react/views/scroll/c;->setBorderRadius(F)V

    goto :goto_0

    :cond_1
    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p3, p2}, Lcom/facebook/react/views/scroll/c;->D(FI)V

    :goto_0
    return-void
.end method

.method public setBorderStyle(Lcom/facebook/react/views/scroll/c;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "borderStyle"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setBorderStyle(Ljava/lang/String;)V

    return-void
.end method

.method public setBorderWidth(Lcom/facebook/react/views/scroll/c;IF)V
    .locals 1
    .annotation runtime Lx2/b;
        defaultFloat = NaNf
        names = {
            "borderWidth",
            "borderLeftWidth",
            "borderRightWidth",
            "borderTopWidth",
            "borderBottomWidth"
        }
    .end annotation

    invoke-static {p3}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p3

    :cond_0
    sget-object v0, Lcom/facebook/react/views/scroll/ReactScrollViewManager;->SPACING_TYPES:[I

    aget p2, v0, p2

    invoke-virtual {p1, p2, p3}, Lcom/facebook/react/views/scroll/c;->E(IF)V

    return-void
.end method

.method public setBottomFillColor(Lcom/facebook/react/views/scroll/c;I)V
    .locals 0
    .annotation runtime Lx2/a;
        customType = "Color"
        defaultInt = 0x0
        name = "endFillColor"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setEndFillColor(I)V

    return-void
.end method

.method public setContentOffset(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0
    .annotation runtime Lx2/a;
        customType = "Point"
        name = "contentOffset"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setContentOffset(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public setDecelerationRate(Lcom/facebook/react/views/scroll/c;F)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "decelerationRate"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setDecelerationRate(F)V

    return-void
.end method

.method public setDisableIntervalMomentum(Lcom/facebook/react/views/scroll/c;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "disableIntervalMomentum"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setDisableIntervalMomentum(Z)V

    return-void
.end method

.method public setEnableSyncOnScroll(Lcom/facebook/react/views/scroll/c;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "enableSyncOnScroll"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setEnableSyncOnScroll(Z)V

    return-void
.end method

.method public setFadingEdgeLength(Lcom/facebook/react/views/scroll/c;I)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "fadingEdgeLength"
    .end annotation

    if-lez p2, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVerticalFadingEdgeEnabled(Z)V

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setFadingEdgeLength(I)V

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVerticalFadingEdgeEnabled(Z)V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setHorizontal(Lcom/facebook/react/views/scroll/c;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "horizontal"
    .end annotation

    return-void
.end method

.method public setIsInvertedVirtualizedList(Lcom/facebook/react/views/scroll/c;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "isInvertedVirtualizedList"
    .end annotation

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVerticalScrollbarPosition(I)V

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setMaintainVisibleContentPosition(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "maintainVisibleContentPosition"
    .end annotation

    if-eqz p2, :cond_0

    invoke-static {p2}, Lcom/facebook/react/views/scroll/a$b;->a(Lcom/facebook/react/bridge/ReadableMap;)Lcom/facebook/react/views/scroll/a$b;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setMaintainVisibleContentPosition(Lcom/facebook/react/views/scroll/a$b;)V

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setNestedScrollEnabled(Lcom/facebook/react/views/scroll/c;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "nestedScrollEnabled"
    .end annotation

    invoke-static {p1, p2}, Landroidx/core/view/H;->B0(Landroid/view/View;Z)V

    return-void
.end method

.method public setOverScrollMode(Lcom/facebook/react/views/scroll/c;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "overScrollMode"
    .end annotation

    invoke-static {p2}, Lcom/facebook/react/views/scroll/f;->l(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setOverScrollMode(I)V

    return-void
.end method

.method public setOverflow(Lcom/facebook/react/views/scroll/c;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "overflow"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setOverflow(Ljava/lang/String;)V

    return-void
.end method

.method public setPagingEnabled(Lcom/facebook/react/views/scroll/c;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "pagingEnabled"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setPagingEnabled(Z)V

    return-void
.end method

.method public setPersistentScrollbar(Lcom/facebook/react/views/scroll/c;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "persistentScrollbar"
    .end annotation

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setScrollbarFadingEnabled(Z)V

    return-void
.end method

.method public setPointerEvents(Lcom/facebook/react/views/scroll/c;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "pointerEvents"
    .end annotation

    invoke-static {p2}, Lcom/facebook/react/uimanager/H;->k(Ljava/lang/String;)Lcom/facebook/react/uimanager/H;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setPointerEvents(Lcom/facebook/react/uimanager/H;)V

    return-void
.end method

.method public setRemoveClippedSubviews(Lcom/facebook/react/views/scroll/c;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "removeClippedSubviews"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setRemoveClippedSubviews(Z)V

    return-void
.end method

.method public setScrollEnabled(Lcom/facebook/react/views/scroll/c;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultBoolean = true
        name = "scrollEnabled"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setScrollEnabled(Z)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    return-void
.end method

.method public setScrollEventThrottle(Lcom/facebook/react/views/scroll/c;I)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "scrollEventThrottle"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setScrollEventThrottle(I)V

    return-void
.end method

.method public setScrollPerfTag(Lcom/facebook/react/views/scroll/c;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "scrollPerfTag"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setScrollPerfTag(Ljava/lang/String;)V

    return-void
.end method

.method public setSendMomentumEvents(Lcom/facebook/react/views/scroll/c;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "sendMomentumEvents"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setSendMomentumEvents(Z)V

    return-void
.end method

.method public setShowsVerticalScrollIndicator(Lcom/facebook/react/views/scroll/c;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "showsVerticalScrollIndicator"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    return-void
.end method

.method public setSnapToAlignment(Lcom/facebook/react/views/scroll/c;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "snapToAlignment"
    .end annotation

    invoke-static {p2}, Lcom/facebook/react/views/scroll/f;->m(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setSnapToAlignment(I)V

    return-void
.end method

.method public setSnapToEnd(Lcom/facebook/react/views/scroll/c;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "snapToEnd"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setSnapToEnd(Z)V

    return-void
.end method

.method public setSnapToInterval(Lcom/facebook/react/views/scroll/c;F)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "snapToInterval"
    .end annotation

    invoke-static {}, Lcom/facebook/react/uimanager/G;->a()F

    move-result v0

    mul-float/2addr p2, v0

    float-to-int p2, p2

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setSnapInterval(I)V

    return-void
.end method

.method public setSnapToOffsets(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 7
    .annotation runtime Lx2/a;
        name = "snapToOffsets"
    .end annotation

    if-eqz p2, :cond_2

    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/facebook/react/uimanager/G;->a()F

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-interface {p2, v2}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v3

    float-to-double v5, v0

    mul-double/2addr v3, v5

    double-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v1}, Lcom/facebook/react/views/scroll/c;->setSnapOffsets(Ljava/util/List;)V

    return-void

    :cond_2
    :goto_1
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setSnapOffsets(Ljava/util/List;)V

    return-void
.end method

.method public setSnapToStart(Lcom/facebook/react/views/scroll/c;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "snapToStart"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/c;->setSnapToStart(Z)V

    return-void
.end method

.method public bridge synthetic updateState(Landroid/view/View;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/scroll/c;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/scroll/ReactScrollViewManager;->updateState(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public updateState(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/uimanager/W;Lcom/facebook/react/uimanager/d0;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p1, p3}, Lcom/facebook/react/views/scroll/c;->setStateWrapper(Lcom/facebook/react/uimanager/d0;)V

    const/4 p1, 0x0

    return-object p1
.end method
