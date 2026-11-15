.class public Lcom/facebook/react/views/view/ReactViewManager;
.super Lcom/facebook/react/views/view/ReactClippingViewManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/views/view/ReactClippingViewManager<",
        "Lcom/facebook/react/views/view/i;",
        ">;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "RCTView"
.end annotation


# static fields
.field private static final CMD_HOTSPOT_UPDATE:I = 0x1

.field private static final CMD_SET_PRESSED:I = 0x2

.field private static final HOTSPOT_UPDATE_KEY:Ljava/lang/String; = "hotspotUpdate"

.field public static final REACT_CLASS:Ljava/lang/String; = "RCTView"

.field private static final SPACING_TYPES:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/facebook/react/views/view/ReactViewManager;->SPACING_TYPES:[I

    return-void

    :array_0
    .array-data 4
        0x8
        0x0
        0x2
        0x1
        0x3
        0x4
        0x5
        0x9
        0xa
        0xb
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/views/view/ReactClippingViewManager;-><init>()V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/ViewManager;->setupViewRecycling()V

    return-void
.end method

.method private handleHotspotUpdate(Lcom/facebook/react/views/view/i;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 3

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result v0

    const/4 v1, 0x1

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result p2

    invoke-virtual {p1, v0, p2}, Landroid/view/View;->drawableHotspotChanged(FF)V

    return-void

    :cond_0
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    const-string p2, "Illegal number of arguments for \'updateHotspot\' command"

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private handleSetPressed(Lcom/facebook/react/views/view/i;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 2

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/ReadableArray;->getBoolean(I)Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setPressed(Z)V

    return-void

    :cond_0
    new-instance p1, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    const-string p2, "Illegal number of arguments for \'setPressed\' command"

    invoke-direct {p1, p2}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/view/ReactViewManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/view/i;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/view/i;
    .locals 1

    .line 2
    new-instance v0, Lcom/facebook/react/views/view/i;

    invoke-direct {v0, p1}, Lcom/facebook/react/views/view/i;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public getCommandsMap()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "hotspotUpdate"

    const-string v3, "setPressed"

    invoke-static {v2, v0, v3, v1}, LS1/f;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RCTView"

    return-object v0
.end method

.method public nextFocusDown(Lcom/facebook/react/views/view/i;I)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultInt = -0x1
        name = "nextFocusDown"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/view/View;->setNextFocusDownId(I)V

    return-void
.end method

.method public nextFocusForward(Lcom/facebook/react/views/view/i;I)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultInt = -0x1
        name = "nextFocusForward"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/view/View;->setNextFocusForwardId(I)V

    return-void
.end method

.method public nextFocusLeft(Lcom/facebook/react/views/view/i;I)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultInt = -0x1
        name = "nextFocusLeft"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/view/View;->setNextFocusLeftId(I)V

    return-void
.end method

.method public nextFocusRight(Lcom/facebook/react/views/view/i;I)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultInt = -0x1
        name = "nextFocusRight"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/view/View;->setNextFocusRightId(I)V

    return-void
.end method

.method public nextFocusUp(Lcom/facebook/react/views/view/i;I)V
    .locals 0
    .annotation runtime Lx2/a;
        defaultInt = -0x1
        name = "nextFocusUp"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/view/View;->setNextFocusUpId(I)V

    return-void
.end method

.method protected bridge synthetic prepareToRecycleView(Lcom/facebook/react/uimanager/e0;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 1
    check-cast p2, Lcom/facebook/react/views/view/i;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/view/ReactViewManager;->prepareToRecycleView(Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/view/i;)Lcom/facebook/react/views/view/i;

    move-result-object p1

    return-object p1
.end method

.method protected prepareToRecycleView(Lcom/facebook/react/uimanager/e0;Lcom/facebook/react/views/view/i;)Lcom/facebook/react/views/view/i;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/BaseViewManager;->prepareToRecycleView(Lcom/facebook/react/uimanager/e0;Landroid/view/View;)Landroid/view/View;

    invoke-virtual {p2}, Lcom/facebook/react/views/view/i;->recycleView()V

    return-object p2
.end method

.method public bridge synthetic receiveCommand(Landroid/view/View;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/view/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/view/ReactViewManager;->receiveCommand(Lcom/facebook/react/views/view/i;ILcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public bridge synthetic receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/facebook/react/views/view/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/view/ReactViewManager;->receiveCommand(Lcom/facebook/react/views/view/i;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public receiveCommand(Lcom/facebook/react/views/view/i;ILcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p3}, Lcom/facebook/react/views/view/ReactViewManager;->handleSetPressed(Lcom/facebook/react/views/view/i;Lcom/facebook/react/bridge/ReadableArray;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1, p3}, Lcom/facebook/react/views/view/ReactViewManager;->handleHotspotUpdate(Lcom/facebook/react/views/view/i;Lcom/facebook/react/bridge/ReadableArray;)V

    :goto_0
    return-void
.end method

.method public receiveCommand(Lcom/facebook/react/views/view/i;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    const-string v0, "setPressed"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "hotspotUpdate"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p3}, Lcom/facebook/react/views/view/ReactViewManager;->handleHotspotUpdate(Lcom/facebook/react/views/view/i;Lcom/facebook/react/bridge/ReadableArray;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1, p3}, Lcom/facebook/react/views/view/ReactViewManager;->handleSetPressed(Lcom/facebook/react/views/view/i;Lcom/facebook/react/bridge/ReadableArray;)V

    :goto_0
    return-void
.end method

.method public setAccessible(Lcom/facebook/react/views/view/i;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "accessible"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    return-void
.end method

.method public setBackfaceVisibility(Lcom/facebook/react/views/view/i;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "backfaceVisibility"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/view/i;->setBackfaceVisibility(Ljava/lang/String;)V

    return-void
.end method

.method public setBorderColor(Lcom/facebook/react/views/view/i;ILjava/lang/Integer;)V
    .locals 3
    .annotation runtime Lx2/b;
        customType = "Color"
        names = {
            "borderColor",
            "borderLeftColor",
            "borderRightColor",
            "borderTopColor",
            "borderBottomColor",
            "borderStartColor",
            "borderEndColor",
            "borderBlockColor",
            "borderBlockEndColor",
            "borderBlockStartColor"
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
    sget-object p3, Lcom/facebook/react/views/view/ReactViewManager;->SPACING_TYPES:[I

    aget p2, p3, p2

    invoke-virtual {p1, p2, v1, v0}, Lcom/facebook/react/views/view/i;->setBorderColor(IFF)V

    return-void
.end method

.method public setBorderRadius(Lcom/facebook/react/views/view/i;IF)V
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/react/views/view/ReactViewManager;->setBorderRadius(Lcom/facebook/react/views/view/i;ILcom/facebook/react/bridge/Dynamic;)V

    return-void
.end method

.method public setBorderRadius(Lcom/facebook/react/views/view/i;ILcom/facebook/react/bridge/Dynamic;)V
    .locals 2
    .annotation runtime Lx2/b;
        names = {
            "borderRadius",
            "borderTopLeftRadius",
            "borderTopRightRadius",
            "borderBottomRightRadius",
            "borderBottomLeftRadius",
            "borderTopStartRadius",
            "borderTopEndRadius",
            "borderBottomStartRadius",
            "borderBottomEndRadius",
            "borderEndEndRadius",
            "borderEndStartRadius",
            "borderStartEndRadius",
            "borderStartStartRadius"
        }
    .end annotation

    .line 2
    invoke-static {p3}, Lcom/facebook/react/uimanager/x;->c(Lcom/facebook/react/bridge/Dynamic;)Lcom/facebook/react/uimanager/x;

    move-result-object p3

    invoke-static {p1}, Ly2/a;->c(Landroid/view/View;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lcom/facebook/react/uimanager/x;->a()Lcom/facebook/react/uimanager/y;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/uimanager/y;->n:Lcom/facebook/react/uimanager/y;

    if-ne v0, v1, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {}, LC2/a;->values()[LC2/a;

    move-result-object v0

    aget-object p2, v0, p2

    invoke-virtual {p1, p2, p3}, Lcom/facebook/react/views/view/i;->setBorderRadius(LC2/a;Lcom/facebook/react/uimanager/x;)V

    return-void
.end method

.method public setBorderStyle(Lcom/facebook/react/views/view/i;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "borderStyle"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/view/i;->setBorderStyle(Ljava/lang/String;)V

    return-void
.end method

.method public setBorderWidth(Lcom/facebook/react/views/view/i;IF)V
    .locals 1
    .annotation runtime Lx2/b;
        defaultFloat = NaNf
        names = {
            "borderWidth",
            "borderLeftWidth",
            "borderRightWidth",
            "borderTopWidth",
            "borderBottomWidth",
            "borderStartWidth",
            "borderEndWidth"
        }
    .end annotation

    invoke-static {p3}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-gez v0, :cond_0

    const/high16 p3, 0x7fc00000    # Float.NaN

    :cond_0
    invoke-static {p3}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p3}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p3

    :cond_1
    sget-object v0, Lcom/facebook/react/views/view/ReactViewManager;->SPACING_TYPES:[I

    aget p2, v0, p2

    invoke-virtual {p1, p2, p3}, Lcom/facebook/react/views/view/i;->setBorderWidth(IF)V

    return-void
.end method

.method public setCollapsable(Lcom/facebook/react/views/view/i;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "collapsable"
    .end annotation

    return-void
.end method

.method public setCollapsableChildren(Lcom/facebook/react/views/view/i;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "collapsableChildren"
    .end annotation

    return-void
.end method

.method public setFocusable(Lcom/facebook/react/views/view/i;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "focusable"
    .end annotation

    if-eqz p2, :cond_0

    new-instance p2, Lcom/facebook/react/views/view/ReactViewManager$a;

    invoke-direct {p2, p0, p1}, Lcom/facebook/react/views/view/ReactViewManager$a;-><init>(Lcom/facebook/react/views/view/ReactViewManager;Lcom/facebook/react/views/view/i;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setClickable(Z)V

    :goto_0
    return-void
.end method

.method public setHitSlop(Lcom/facebook/react/views/view/i;Lcom/facebook/react/bridge/Dynamic;)V
    .locals 7
    .annotation runtime Lx2/a;
        name = "hitSlop"
    .end annotation

    sget-object v0, Lcom/facebook/react/views/view/ReactViewManager$b;->a:[I

    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid type for \'hitSlop\' value "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "ReactNative"

    invoke-static {v0, p2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/view/i;->setHitSlopRect(Landroid/graphics/Rect;)V

    goto :goto_4

    :cond_1
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asDouble()D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result p2

    float-to-int p2, p2

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p2, p2, p2, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    :goto_0
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/view/i;->setHitSlopRect(Landroid/graphics/Rect;)V

    goto :goto_4

    :cond_2
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asMap()Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p2

    new-instance v0, Landroid/graphics/Rect;

    const-string v1, "left"

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-interface {p2, v1}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result v1

    float-to-int v1, v1

    goto :goto_1

    :cond_3
    move v1, v3

    :goto_1
    const-string v2, "top"

    invoke-interface {p2, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {p2, v2}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result v2

    float-to-int v2, v2

    goto :goto_2

    :cond_4
    move v2, v3

    :goto_2
    const-string v4, "right"

    invoke-interface {p2, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p2, v4}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result v4

    float-to-int v4, v4

    goto :goto_3

    :cond_5
    move v4, v3

    :goto_3
    const-string v5, "bottom"

    invoke-interface {p2, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {p2, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result p2

    float-to-int v3, p2

    :cond_6
    invoke-direct {v0, v1, v2, v4, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_0

    :goto_4
    return-void
.end method

.method public setNativeBackground(Lcom/facebook/react/views/view/i;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "nativeBackgroundAndroid"
    .end annotation

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/facebook/react/views/view/f;->a(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/view/i;->setTranslucentBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setNativeForeground(Lcom/facebook/react/views/view/i;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "nativeForegroundAndroid"
    .end annotation

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/facebook/react/views/view/f;->a(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setNeedsOffscreenAlphaCompositing(Lcom/facebook/react/views/view/i;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "needsOffscreenAlphaCompositing"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/view/i;->setNeedsOffscreenAlphaCompositing(Z)V

    return-void
.end method

.method public bridge synthetic setOpacity(Landroid/view/View;F)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/view/i;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/view/ReactViewManager;->setOpacity(Lcom/facebook/react/views/view/i;F)V

    return-void
.end method

.method public setOpacity(Lcom/facebook/react/views/view/i;F)V
    .locals 0

    .line 2
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/view/i;->setOpacityIfPossible(F)V

    return-void
.end method

.method public setOverflow(Lcom/facebook/react/views/view/i;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "overflow"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/view/i;->setOverflow(Ljava/lang/String;)V

    return-void
.end method

.method public setPointerEvents(Lcom/facebook/react/views/view/i;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "pointerEvents"
    .end annotation

    invoke-static {p2}, Lcom/facebook/react/uimanager/H;->k(Ljava/lang/String;)Lcom/facebook/react/uimanager/H;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/view/i;->setPointerEvents(Lcom/facebook/react/uimanager/H;)V

    return-void
.end method

.method public setTVPreferredFocus(Lcom/facebook/react/views/view/i;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "hasTVPreferredFocus"
    .end annotation

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    :cond_0
    return-void
.end method

.method protected bridge synthetic setTransformProperty(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/view/i;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/view/ReactViewManager;->setTransformProperty(Lcom/facebook/react/views/view/i;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method protected setTransformProperty(Lcom/facebook/react/views/view/i;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 2
    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setTransformProperty(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;)V

    invoke-virtual {p1}, Lcom/facebook/react/views/view/i;->setBackfaceVisibilityDependantOpacity()V

    return-void
.end method
