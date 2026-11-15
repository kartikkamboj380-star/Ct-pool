.class public abstract Lcom/facebook/react/uimanager/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/A0;


# instance fields
.field protected final a:Lcom/facebook/react/uimanager/g;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/high16 v3, 0x7fc00000    # Float.NaN

    const/4 v4, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v5, "nativeID"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v4, 0x1e

    goto/16 :goto_0

    :sswitch_1
    const-string v5, "accessibilityCollectionItem"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v4, 0x1d

    goto/16 :goto_0

    :sswitch_2
    const-string v5, "accessibilityLabelledBy"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v4, 0x1c

    goto/16 :goto_0

    :sswitch_3
    const-string v5, "accessibilityCollection"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v4, 0x1b

    goto/16 :goto_0

    :sswitch_4
    const-string v5, "accessibilityActions"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v4, 0x1a

    goto/16 :goto_0

    :sswitch_5
    const-string v5, "borderRadius"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v4, 0x19

    goto/16 :goto_0

    :sswitch_6
    const-string v5, "backgroundColor"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v4, 0x18

    goto/16 :goto_0

    :sswitch_7
    const-string v5, "accessibilityState"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v4, 0x17

    goto/16 :goto_0

    :sswitch_8
    const-string v5, "accessibilityLabel"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v4, 0x16

    goto/16 :goto_0

    :sswitch_9
    const-string v5, "transform"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v4, 0x15

    goto/16 :goto_0

    :sswitch_a
    const-string v5, "importantForAccessibility"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v4, 0x14

    goto/16 :goto_0

    :sswitch_b
    const-string v5, "borderBottomRightRadius"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v4, 0x13

    goto/16 :goto_0

    :sswitch_c
    const-string v5, "borderBottomLeftRadius"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v4, 0x12

    goto/16 :goto_0

    :sswitch_d
    const-string v5, "borderTopRightRadius"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v4, 0x11

    goto/16 :goto_0

    :sswitch_e
    const-string v5, "accessibilityLiveRegion"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v4, 0x10

    goto/16 :goto_0

    :sswitch_f
    const-string v5, "role"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v4, 0xf

    goto/16 :goto_0

    :sswitch_10
    const-string v5, "elevation"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v4, 0xe

    goto/16 :goto_0

    :sswitch_11
    const-string v5, "rotation"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v4, 0xd

    goto/16 :goto_0

    :sswitch_12
    const-string v5, "renderToHardwareTextureAndroid"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v4, 0xc

    goto/16 :goto_0

    :sswitch_13
    const-string v5, "accessibilityRole"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v4, 0xb

    goto/16 :goto_0

    :sswitch_14
    const-string v5, "accessibilityHint"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v4, 0xa

    goto/16 :goto_0

    :sswitch_15
    const-string v5, "zIndex"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v4, 0x9

    goto/16 :goto_0

    :sswitch_16
    const-string v5, "transformOrigin"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v4, 0x8

    goto/16 :goto_0

    :sswitch_17
    const-string v5, "testID"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_17

    goto :goto_0

    :cond_17
    const/4 v4, 0x7

    goto :goto_0

    :sswitch_18
    const-string v5, "scaleY"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_18

    goto :goto_0

    :cond_18
    const/4 v4, 0x6

    goto :goto_0

    :sswitch_19
    const-string v5, "scaleX"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_19

    goto :goto_0

    :cond_19
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_1a
    const-string v5, "borderTopLeftRadius"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1a

    goto :goto_0

    :cond_1a
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_1b
    const-string v5, "opacity"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1b

    goto :goto_0

    :cond_1b
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_1c
    const-string v5, "shadowColor"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1c

    goto :goto_0

    :cond_1c
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_1d
    const-string v5, "translateY"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1d

    goto :goto_0

    :cond_1d
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_1e
    const-string v5, "translateX"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1e

    goto :goto_0

    :cond_1e
    move v4, v1

    :goto_0
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_11

    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setNativeId(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setAccessibilityCollectionItem(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_11

    :pswitch_2
    new-instance p2, Lcom/facebook/react/bridge/DynamicFromObject;

    invoke-direct {p2, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    iget-object p3, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    invoke-interface {p3, p1, p2}, Lcom/facebook/react/uimanager/g;->setAccessibilityLabelledBy(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    goto/16 :goto_11

    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setAccessibilityCollection(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_11

    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setAccessibilityActions(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    goto/16 :goto_11

    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_1f

    goto :goto_1

    :cond_1f
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v3

    :goto_1
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/uimanager/g;->setBorderRadius(Landroid/view/View;F)V

    goto/16 :goto_11

    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_20

    goto :goto_2

    :cond_20
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_2
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/uimanager/g;->setBackgroundColor(Landroid/view/View;I)V

    goto/16 :goto_11

    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setViewState(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_11

    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setAccessibilityLabel(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setTransform(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    goto/16 :goto_11

    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setImportantForAccessibility(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_21

    goto :goto_3

    :cond_21
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v3

    :goto_3
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/uimanager/g;->setBorderBottomRightRadius(Landroid/view/View;F)V

    goto/16 :goto_11

    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_22

    goto :goto_4

    :cond_22
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v3

    :goto_4
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/uimanager/g;->setBorderBottomLeftRadius(Landroid/view/View;F)V

    goto/16 :goto_11

    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_23

    goto :goto_5

    :cond_23
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v3

    :goto_5
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/uimanager/g;->setBorderTopRightRadius(Landroid/view/View;F)V

    goto/16 :goto_11

    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setAccessibilityLiveRegion(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setRole(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_24

    goto :goto_6

    :cond_24
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v2

    :goto_6
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/uimanager/g;->setElevation(Landroid/view/View;F)V

    goto/16 :goto_11

    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_25

    goto :goto_7

    :cond_25
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v2

    :goto_7
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/uimanager/g;->setRotation(Landroid/view/View;F)V

    goto/16 :goto_11

    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_26

    goto :goto_8

    :cond_26
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_8
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/uimanager/g;->setRenderToHardwareTexture(Landroid/view/View;Z)V

    goto/16 :goto_11

    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setAccessibilityRole(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setAccessibilityHint(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_27

    goto :goto_9

    :cond_27
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v2

    :goto_9
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/uimanager/g;->setZIndex(Landroid/view/View;F)V

    goto/16 :goto_11

    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setTransformOrigin(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    goto/16 :goto_11

    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setTestId(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_11

    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_28

    goto :goto_a

    :cond_28
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v0

    :goto_a
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/uimanager/g;->setScaleY(Landroid/view/View;F)V

    goto :goto_11

    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_29

    goto :goto_b

    :cond_29
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v0

    :goto_b
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/uimanager/g;->setScaleX(Landroid/view/View;F)V

    goto :goto_11

    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_2a

    goto :goto_c

    :cond_2a
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v3

    :goto_c
    invoke-interface {p2, p1, v3}, Lcom/facebook/react/uimanager/g;->setBorderTopLeftRadius(Landroid/view/View;F)V

    goto :goto_11

    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_2b

    goto :goto_d

    :cond_2b
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v0

    :goto_d
    invoke-interface {p2, p1, v0}, Lcom/facebook/react/uimanager/g;->setOpacity(Landroid/view/View;F)V

    goto :goto_11

    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_2c

    goto :goto_e

    :cond_2c
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_e
    invoke-interface {p2, p1, v1}, Lcom/facebook/react/uimanager/g;->setShadowColor(Landroid/view/View;I)V

    goto :goto_11

    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_2d

    goto :goto_f

    :cond_2d
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v2

    :goto_f
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/uimanager/g;->setTranslateY(Landroid/view/View;F)V

    goto :goto_11

    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_2e

    goto :goto_10

    :cond_2e
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v2

    :goto_10
    invoke-interface {p2, p1, v2}, Lcom/facebook/react/uimanager/g;->setTranslateX(Landroid/view/View;F)V

    :goto_11
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x66a2c736 -> :sswitch_1e
        -0x66a2c735 -> :sswitch_1d
        -0x5ec185dd -> :sswitch_1c
        -0x4b8807f5 -> :sswitch_1b
        -0x4932ce1e -> :sswitch_1a
        -0x3621dfb2 -> :sswitch_19
        -0x3621dfb1 -> :sswitch_18
        -0x34488ed3 -> :sswitch_17
        -0x2e963a4e -> :sswitch_16
        -0x2b988b88 -> :sswitch_15
        -0x60f430b -> :sswitch_14
        -0x60aa11c -> :sswitch_13
        -0x4d24f13 -> :sswitch_12
        -0x266f082 -> :sswitch_11
        -0x42d1a3 -> :sswitch_10
        0x358076 -> :sswitch_f
        0x22936ee -> :sswitch_e
        0x13dfc885 -> :sswitch_d
        0x22a57450 -> :sswitch_c
        0x230fd3d7 -> :sswitch_b
        0x2c861b47 -> :sswitch_a
        0x3ebe6b6c -> :sswitch_9
        0x445b6e46 -> :sswitch_8
        0x44c6b3e3 -> :sswitch_7
        0x4cb7f6d5 -> :sswitch_6
        0x506afbde -> :sswitch_5
        0x59bdabcf -> :sswitch_4
        0x6904828c -> :sswitch_3
        0x6f2de13c -> :sswitch_2
        0x76cb4bbf -> :sswitch_1
        0x79eeaf72 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
