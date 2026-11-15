.class public LF2/k0;
.super Lcom/facebook/react/uimanager/f;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/f;-><init>(Lcom/facebook/react/uimanager/g;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v6, "borderStartColor"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v5, 0x30

    goto/16 :goto_0

    :sswitch_1
    const-string v6, "nextFocusRight"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v5, 0x2f

    goto/16 :goto_0

    :sswitch_2
    const-string v6, "meetOrSlice"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v5, 0x2e

    goto/16 :goto_0

    :sswitch_3
    const-string v6, "nativeBackgroundAndroid"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v5, 0x2d

    goto/16 :goto_0

    :sswitch_4
    const-string v6, "borderEndEndRadius"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v5, 0x2c

    goto/16 :goto_0

    :sswitch_5
    const-string v6, "needsOffscreenAlphaCompositing"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v5, 0x2b

    goto/16 :goto_0

    :sswitch_6
    const-string v6, "focusable"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v5, 0x2a

    goto/16 :goto_0

    :sswitch_7
    const-string v6, "borderRadius"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v5, 0x29

    goto/16 :goto_0

    :sswitch_8
    const-string v6, "tintColor"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v5, 0x28

    goto/16 :goto_0

    :sswitch_9
    const-string v6, "borderEndColor"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v5, 0x27

    goto/16 :goto_0

    :sswitch_a
    const-string v6, "hitSlop"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v5, 0x26

    goto/16 :goto_0

    :sswitch_b
    const-string v6, "borderEndStartRadius"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v5, 0x25

    goto/16 :goto_0

    :sswitch_c
    const-string v6, "borderBlockEndColor"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v5, 0x24

    goto/16 :goto_0

    :sswitch_d
    const-string v6, "borderStyle"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v5, 0x23

    goto/16 :goto_0

    :sswitch_e
    const-string v6, "borderColor"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v5, 0x22

    goto/16 :goto_0

    :sswitch_f
    const-string v6, "borderBlockColor"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v5, 0x21

    goto/16 :goto_0

    :sswitch_10
    const-string v6, "nextFocusUp"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v5, 0x20

    goto/16 :goto_0

    :sswitch_11
    const-string v6, "borderBottomRightRadius"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v5, 0x1f

    goto/16 :goto_0

    :sswitch_12
    const-string v6, "borderBottomLeftRadius"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v5, 0x1e

    goto/16 :goto_0

    :sswitch_13
    const-string v6, "nextFocusForward"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v5, 0x1d

    goto/16 :goto_0

    :sswitch_14
    const-string v6, "borderTopRightRadius"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v5, 0x1c

    goto/16 :goto_0

    :sswitch_15
    const-string v6, "borderBlockStartColor"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_15

    goto/16 :goto_0

    :cond_15
    const/16 v5, 0x1b

    goto/16 :goto_0

    :sswitch_16
    const-string v6, "vbWidth"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_16

    goto/16 :goto_0

    :cond_16
    const/16 v5, 0x1a

    goto/16 :goto_0

    :sswitch_17
    const-string v6, "color"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_17

    goto/16 :goto_0

    :cond_17
    const/16 v5, 0x19

    goto/16 :goto_0

    :sswitch_18
    const-string v6, "align"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_18

    goto/16 :goto_0

    :cond_18
    const/16 v5, 0x18

    goto/16 :goto_0

    :sswitch_19
    const-string v6, "minY"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_19

    goto/16 :goto_0

    :cond_19
    const/16 v5, 0x17

    goto/16 :goto_0

    :sswitch_1a
    const-string v6, "minX"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1a

    goto/16 :goto_0

    :cond_1a
    const/16 v5, 0x16

    goto/16 :goto_0

    :sswitch_1b
    const-string v6, "borderStartStartRadius"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1b

    goto/16 :goto_0

    :cond_1b
    const/16 v5, 0x15

    goto/16 :goto_0

    :sswitch_1c
    const-string v6, "nativeForegroundAndroid"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1c

    goto/16 :goto_0

    :cond_1c
    const/16 v5, 0x14

    goto/16 :goto_0

    :sswitch_1d
    const-string v6, "borderBottomEndRadius"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1d

    goto/16 :goto_0

    :cond_1d
    const/16 v5, 0x13

    goto/16 :goto_0

    :sswitch_1e
    const-string v6, "borderStartEndRadius"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1e

    goto/16 :goto_0

    :cond_1e
    const/16 v5, 0x12

    goto/16 :goto_0

    :sswitch_1f
    const-string v6, "borderLeftColor"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1f

    goto/16 :goto_0

    :cond_1f
    const/16 v5, 0x11

    goto/16 :goto_0

    :sswitch_20
    const-string v6, "removeClippedSubviews"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_20

    goto/16 :goto_0

    :cond_20
    const/16 v5, 0x10

    goto/16 :goto_0

    :sswitch_21
    const-string v6, "pointerEvents"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_21

    goto/16 :goto_0

    :cond_21
    const/16 v5, 0xf

    goto/16 :goto_0

    :sswitch_22
    const-string v6, "bbWidth"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_22

    goto/16 :goto_0

    :cond_22
    const/16 v5, 0xe

    goto/16 :goto_0

    :sswitch_23
    const-string v6, "borderTopEndRadius"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_23

    goto/16 :goto_0

    :cond_23
    const/16 v5, 0xd

    goto/16 :goto_0

    :sswitch_24
    const-string v6, "nextFocusLeft"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_24

    goto/16 :goto_0

    :cond_24
    const/16 v5, 0xc

    goto/16 :goto_0

    :sswitch_25
    const-string v6, "nextFocusDown"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_25

    goto/16 :goto_0

    :cond_25
    const/16 v5, 0xb

    goto/16 :goto_0

    :sswitch_26
    const-string v6, "hasTVPreferredFocus"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_26

    goto/16 :goto_0

    :cond_26
    const/16 v5, 0xa

    goto/16 :goto_0

    :sswitch_27
    const-string v6, "borderBottomStartRadius"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_27

    goto/16 :goto_0

    :cond_27
    const/16 v5, 0x9

    goto/16 :goto_0

    :sswitch_28
    const-string v6, "borderTopStartRadius"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_28

    goto/16 :goto_0

    :cond_28
    const/16 v5, 0x8

    goto/16 :goto_0

    :sswitch_29
    const-string v6, "accessible"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_29

    goto :goto_0

    :cond_29
    const/4 v5, 0x7

    goto :goto_0

    :sswitch_2a
    const-string v6, "borderTopLeftRadius"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2a

    goto :goto_0

    :cond_2a
    const/4 v5, 0x6

    goto :goto_0

    :sswitch_2b
    const-string v6, "borderBottomColor"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2b

    goto :goto_0

    :cond_2b
    const/4 v5, 0x5

    goto :goto_0

    :sswitch_2c
    const-string v6, "borderTopColor"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2c

    goto :goto_0

    :cond_2c
    const/4 v5, 0x4

    goto :goto_0

    :sswitch_2d
    const-string v6, "vbHeight"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2d

    goto :goto_0

    :cond_2d
    const/4 v5, 0x3

    goto :goto_0

    :sswitch_2e
    const-string v6, "backfaceVisibility"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2e

    goto :goto_0

    :cond_2e
    const/4 v5, 0x2

    goto :goto_0

    :sswitch_2f
    const-string v6, "borderRightColor"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2f

    goto :goto_0

    :cond_2f
    const/4 v5, 0x1

    goto :goto_0

    :sswitch_30
    const-string v6, "bbHeight"

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_30

    goto :goto_0

    :cond_30
    move v5, v4

    :goto_0
    packed-switch v5, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/f;->b(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_21

    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/l0;->setBorderStartColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_21

    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_31

    goto :goto_1

    :cond_31
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v4

    :goto_1
    invoke-interface {p2, p1, v4}, LF2/l0;->setNextFocusRight(Landroid/view/View;I)V

    goto/16 :goto_21

    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_32

    goto :goto_2

    :cond_32
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v4

    :goto_2
    invoke-interface {p2, p1, v4}, LF2/l0;->setMeetOrSlice(Landroid/view/View;I)V

    goto/16 :goto_21

    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2, p1, p3}, LF2/l0;->setNativeBackgroundAndroid(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_21

    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_33

    goto :goto_3

    :cond_33
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    :goto_3
    invoke-interface {p2, p1, v2, v3}, LF2/l0;->setBorderEndEndRadius(Landroid/view/View;D)V

    goto/16 :goto_21

    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_34

    goto :goto_4

    :cond_34
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    :goto_4
    invoke-interface {p2, p1, v4}, LF2/l0;->setNeedsOffscreenAlphaCompositing(Landroid/view/View;Z)V

    goto/16 :goto_21

    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_35

    goto :goto_5

    :cond_35
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    :goto_5
    invoke-interface {p2, p1, v4}, LF2/l0;->setFocusable(Landroid/view/View;Z)V

    goto/16 :goto_21

    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_36

    goto :goto_6

    :cond_36
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    :goto_6
    invoke-interface {p2, p1, v2, v3}, LF2/l0;->setBorderRadius(Landroid/view/View;D)V

    goto/16 :goto_21

    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/l0;->setTintColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_21

    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/l0;->setBorderEndColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_21

    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, p1, v0}, LF2/l0;->setHitSlop(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    goto/16 :goto_21

    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_37

    goto :goto_7

    :cond_37
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    :goto_7
    invoke-interface {p2, p1, v2, v3}, LF2/l0;->setBorderEndStartRadius(Landroid/view/View;D)V

    goto/16 :goto_21

    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/l0;->setBorderBlockEndColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_21

    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_38

    goto :goto_8

    :cond_38
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_8
    invoke-interface {p2, p1, v0}, LF2/l0;->setBorderStyle(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_21

    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/l0;->setBorderColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_21

    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/l0;->setBorderBlockColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_21

    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_39

    goto :goto_9

    :cond_39
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v4

    :goto_9
    invoke-interface {p2, p1, v4}, LF2/l0;->setNextFocusUp(Landroid/view/View;I)V

    goto/16 :goto_21

    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_3a

    goto :goto_a

    :cond_3a
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    :goto_a
    invoke-interface {p2, p1, v2, v3}, LF2/l0;->setBorderBottomRightRadius(Landroid/view/View;D)V

    goto/16 :goto_21

    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_3b

    goto :goto_b

    :cond_3b
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    :goto_b
    invoke-interface {p2, p1, v2, v3}, LF2/l0;->setBorderBottomLeftRadius(Landroid/view/View;D)V

    goto/16 :goto_21

    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_3c

    goto :goto_c

    :cond_3c
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v4

    :goto_c
    invoke-interface {p2, p1, v4}, LF2/l0;->setNextFocusForward(Landroid/view/View;I)V

    goto/16 :goto_21

    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_3d

    goto :goto_d

    :cond_3d
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    :goto_d
    invoke-interface {p2, p1, v2, v3}, LF2/l0;->setBorderTopRightRadius(Landroid/view/View;D)V

    goto/16 :goto_21

    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/l0;->setBorderBlockStartColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_21

    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_3e

    goto :goto_e

    :cond_3e
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v1

    :goto_e
    invoke-interface {p2, p1, v1}, LF2/l0;->setVbWidth(Landroid/view/View;F)V

    goto/16 :goto_21

    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/l0;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_21

    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_3f

    goto :goto_f

    :cond_3f
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_f
    invoke-interface {p2, p1, v0}, LF2/l0;->setAlign(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_21

    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_40

    goto :goto_10

    :cond_40
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v1

    :goto_10
    invoke-interface {p2, p1, v1}, LF2/l0;->setMinY(Landroid/view/View;F)V

    goto/16 :goto_21

    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_41

    goto :goto_11

    :cond_41
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v1

    :goto_11
    invoke-interface {p2, p1, v1}, LF2/l0;->setMinX(Landroid/view/View;F)V

    goto/16 :goto_21

    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_42

    goto :goto_12

    :cond_42
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    :goto_12
    invoke-interface {p2, p1, v2, v3}, LF2/l0;->setBorderStartStartRadius(Landroid/view/View;D)V

    goto/16 :goto_21

    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2, p1, p3}, LF2/l0;->setNativeForegroundAndroid(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_21

    :pswitch_1d
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_43

    goto :goto_13

    :cond_43
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v1

    :goto_13
    invoke-interface {p2, p1, v1}, LF2/l0;->setBorderBottomEndRadius(Landroid/view/View;F)V

    goto/16 :goto_21

    :pswitch_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_44

    goto :goto_14

    :cond_44
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    :goto_14
    invoke-interface {p2, p1, v2, v3}, LF2/l0;->setBorderStartEndRadius(Landroid/view/View;D)V

    goto/16 :goto_21

    :pswitch_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/l0;->setBorderLeftColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_21

    :pswitch_20
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_45

    goto :goto_15

    :cond_45
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    :goto_15
    invoke-interface {p2, p1, v4}, LF2/l0;->setRemoveClippedSubviews(Landroid/view/View;Z)V

    goto/16 :goto_21

    :pswitch_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_46

    goto :goto_16

    :cond_46
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_16
    invoke-interface {p2, p1, v0}, LF2/l0;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_21

    :pswitch_22
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, p1, v0}, LF2/l0;->setBbWidth(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    goto/16 :goto_21

    :pswitch_23
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_47

    goto :goto_17

    :cond_47
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v1

    :goto_17
    invoke-interface {p2, p1, v1}, LF2/l0;->setBorderTopEndRadius(Landroid/view/View;F)V

    goto/16 :goto_21

    :pswitch_24
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_48

    goto :goto_18

    :cond_48
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v4

    :goto_18
    invoke-interface {p2, p1, v4}, LF2/l0;->setNextFocusLeft(Landroid/view/View;I)V

    goto/16 :goto_21

    :pswitch_25
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_49

    goto :goto_19

    :cond_49
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v4

    :goto_19
    invoke-interface {p2, p1, v4}, LF2/l0;->setNextFocusDown(Landroid/view/View;I)V

    goto/16 :goto_21

    :pswitch_26
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_4a

    goto :goto_1a

    :cond_4a
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    :goto_1a
    invoke-interface {p2, p1, v4}, LF2/l0;->setHasTVPreferredFocus(Landroid/view/View;Z)V

    goto/16 :goto_21

    :pswitch_27
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_4b

    goto :goto_1b

    :cond_4b
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v1

    :goto_1b
    invoke-interface {p2, p1, v1}, LF2/l0;->setBorderBottomStartRadius(Landroid/view/View;F)V

    goto/16 :goto_21

    :pswitch_28
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_4c

    goto :goto_1c

    :cond_4c
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v1

    :goto_1c
    invoke-interface {p2, p1, v1}, LF2/l0;->setBorderTopStartRadius(Landroid/view/View;F)V

    goto/16 :goto_21

    :pswitch_29
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_4d

    goto :goto_1d

    :cond_4d
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    :goto_1d
    invoke-interface {p2, p1, v4}, LF2/l0;->setAccessible(Landroid/view/View;Z)V

    goto/16 :goto_21

    :pswitch_2a
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_4e

    goto :goto_1e

    :cond_4e
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    :goto_1e
    invoke-interface {p2, p1, v2, v3}, LF2/l0;->setBorderTopLeftRadius(Landroid/view/View;D)V

    goto :goto_21

    :pswitch_2b
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/l0;->setBorderBottomColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto :goto_21

    :pswitch_2c
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/l0;->setBorderTopColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto :goto_21

    :pswitch_2d
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_4f

    goto :goto_1f

    :cond_4f
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v1

    :goto_1f
    invoke-interface {p2, p1, v1}, LF2/l0;->setVbHeight(Landroid/view/View;F)V

    goto :goto_21

    :pswitch_2e
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    if-nez p3, :cond_50

    goto :goto_20

    :cond_50
    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    :goto_20
    invoke-interface {p2, p1, v0}, LF2/l0;->setBackfaceVisibility(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_21

    :pswitch_2f
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/l0;->setBorderRightColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto :goto_21

    :pswitch_30
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/l0;

    new-instance v0, Lcom/facebook/react/bridge/DynamicFromObject;

    invoke-direct {v0, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, p1, v0}, LF2/l0;->setBbHeight(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    :goto_21
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7b0ca679 -> :sswitch_30
        -0x7696880d -> :sswitch_2f
        -0x6532960a -> :sswitch_2e
        -0x5d75250d -> :sswitch_2d
        -0x57ab08a6 -> :sswitch_2c
        -0x4e0397d4 -> :sswitch_2b
        -0x4932ce1e -> :sswitch_2a
        -0x4408644a -> :sswitch_29
        -0x42e281b5 -> :sswitch_28
        -0x33b27663 -> :sswitch_27
        -0x2881956d -> :sswitch_26
        -0x25a40819 -> :sswitch_25
        -0x25a08cb4 -> :sswitch_24
        -0x1cd17a3c -> :sswitch_23
        -0x13a7269a -> :sswitch_22
        -0x117e564a -> :sswitch_21
        -0xf06d417 -> :sswitch_20
        -0xe70d730 -> :sswitch_1f
        -0xd4cc1a9 -> :sswitch_1e
        -0x8d2c26a -> :sswitch_1d
        -0x689bbab -> :sswitch_1c
        -0x1a9a1e2 -> :sswitch_1b
        0x332446 -> :sswitch_1a
        0x332447 -> :sswitch_19
        0x5899705 -> :sswitch_18
        0x5a72f63 -> :sswitch_17
        0xe557a7a -> :sswitch_16
        0x124be2c2 -> :sswitch_15
        0x13dfc885 -> :sswitch_14
        0x1e013d60 -> :sswitch_13
        0x22a57450 -> :sswitch_12
        0x230fd3d7 -> :sswitch_11
        0x2762ef20 -> :sswitch_10
        0x28ce5422 -> :sswitch_f
        0x2b158697 -> :sswitch_e
        0x2bf974e5 -> :sswitch_d
        0x2d7a3629 -> :sswitch_c
        0x3647e705 -> :sswitch_b
        0x373ef02d -> :sswitch_a
        0x48c2f394 -> :sswitch_9
        0x4f219128 -> :sswitch_8
        0x506afbde -> :sswitch_7
        0x6118be32 -> :sswitch_6
        0x636835e4 -> :sswitch_5
        0x676fd4fe -> :sswitch_4
        0x682c2a0a -> :sswitch_3
        0x71baeb28 -> :sswitch_2
        0x71e55777 -> :sswitch_1
        0x7e5af16d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
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
