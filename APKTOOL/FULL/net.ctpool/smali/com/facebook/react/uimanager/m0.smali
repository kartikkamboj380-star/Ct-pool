.class abstract Lcom/facebook/react/uimanager/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static a()Ljava/util/Map;
    .locals 7

    .line 1
    invoke-static {}, LS1/f;->a()LS1/f$a;

    move-result-object v0

    const-string v1, "onChangeCapture"

    const-string v2, "bubbled"

    const-string v3, "onChange"

    const-string v4, "captured"

    invoke-static {v2, v3, v4, v1}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "phasedRegistrationNames"

    invoke-static {v3, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v5, "topChange"

    invoke-virtual {v0, v5, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    const-string v1, "onSelect"

    const-string v5, "onSelectCapture"

    invoke-static {v2, v1, v4, v5}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v3, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v5, "topSelect"

    invoke-virtual {v0, v5, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/uimanager/events/s;->o:Lcom/facebook/react/uimanager/events/s;

    invoke-static {v1}, Lcom/facebook/react/uimanager/events/s;->h(Lcom/facebook/react/uimanager/events/s;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "onTouchStart"

    const-string v6, "onTouchStartCapture"

    invoke-static {v2, v5, v4, v6}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    invoke-static {v3, v5}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v0, v1, v5}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/uimanager/events/s;->q:Lcom/facebook/react/uimanager/events/s;

    invoke-static {v1}, Lcom/facebook/react/uimanager/events/s;->h(Lcom/facebook/react/uimanager/events/s;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "onTouchMove"

    const-string v6, "onTouchMoveCapture"

    invoke-static {v2, v5, v4, v6}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    invoke-static {v3, v5}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v0, v1, v5}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/uimanager/events/s;->p:Lcom/facebook/react/uimanager/events/s;

    invoke-static {v1}, Lcom/facebook/react/uimanager/events/s;->h(Lcom/facebook/react/uimanager/events/s;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "onTouchEnd"

    const-string v6, "onTouchEndCapture"

    invoke-static {v2, v5, v4, v6}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    invoke-static {v3, v5}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v0, v1, v5}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/uimanager/events/s;->r:Lcom/facebook/react/uimanager/events/s;

    invoke-static {v1}, Lcom/facebook/react/uimanager/events/s;->h(Lcom/facebook/react/uimanager/events/s;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "onTouchCancel"

    const-string v6, "onTouchCancelCapture"

    invoke-static {v2, v5, v4, v6}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v3, v2}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    invoke-virtual {v0}, LS1/f$a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static b()Ljava/util/Map;
    .locals 10

    .line 1
    invoke-static {}, LS1/f;->b()Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v2, "ScaleAspectFit"

    const-string v4, "ScaleAspectFill"

    const-string v6, "ScaleAspectCenter"

    invoke-static/range {v2 .. v7}, LS1/f;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "ContentMode"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "UIView"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/facebook/react/uimanager/H;->n:Lcom/facebook/react/uimanager/H;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sget-object v1, Lcom/facebook/react/uimanager/H;->o:Lcom/facebook/react/uimanager/H;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    sget-object v1, Lcom/facebook/react/uimanager/H;->p:Lcom/facebook/react/uimanager/H;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    sget-object v1, Lcom/facebook/react/uimanager/H;->q:Lcom/facebook/react/uimanager/H;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const-string v2, "none"

    const-string v4, "boxNone"

    const-string v6, "boxOnly"

    const-string v8, "unspecified"

    invoke-static/range {v2 .. v9}, LS1/f;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "PointerEventsValues"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "StyleConstants"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v2, "typeWindowStateChanged"

    const-string v4, "typeViewFocused"

    const-string v6, "typeViewClicked"

    invoke-static/range {v2 .. v7}, LS1/f;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "AccessibilityEventTypes"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method static c()Ljava/util/Map;
    .locals 4

    .line 1
    invoke-static {}, LS1/f;->a()LS1/f$a;

    move-result-object v0

    const-string v1, "onContentSizeChange"

    const-string v2, "registrationName"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topContentSizeChange"

    invoke-virtual {v0, v3, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    const-string v1, "onLayout"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topLayout"

    invoke-virtual {v0, v3, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    const-string v1, "onLoadingError"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topLoadingError"

    invoke-virtual {v0, v3, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    const-string v1, "onLoadingFinish"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topLoadingFinish"

    invoke-virtual {v0, v3, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    const-string v1, "onLoadingStart"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topLoadingStart"

    invoke-virtual {v0, v3, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    const-string v1, "onSelectionChange"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topSelectionChange"

    invoke-virtual {v0, v3, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    const-string v1, "onMessage"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topMessage"

    invoke-virtual {v0, v3, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    const-string v1, "onScrollBeginDrag"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topScrollBeginDrag"

    invoke-virtual {v0, v3, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    const-string v1, "onScrollEndDrag"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topScrollEndDrag"

    invoke-virtual {v0, v3, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    const-string v1, "onScroll"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topScroll"

    invoke-virtual {v0, v3, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    const-string v1, "onMomentumScrollBegin"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "topMomentumScrollBegin"

    invoke-virtual {v0, v3, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    const-string v1, "onMomentumScrollEnd"

    invoke-static {v2, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "topMomentumScrollEnd"

    invoke-virtual {v0, v2, v1}, LS1/f$a;->b(Ljava/lang/Object;Ljava/lang/Object;)LS1/f$a;

    move-result-object v0

    invoke-virtual {v0}, LS1/f$a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
