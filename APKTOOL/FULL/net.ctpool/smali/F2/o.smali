.class public LF2/o;
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
    .locals 5

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v4, "topInsetEnabled"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v3, 0x1a

    goto/16 :goto_0

    :sswitch_1
    const-string v4, "largeTitle"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v3, 0x19

    goto/16 :goto_0

    :sswitch_2
    const-string v4, "largeTitleHideShadow"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v3, 0x18

    goto/16 :goto_0

    :sswitch_3
    const-string v4, "titleFontSize"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v3, 0x17

    goto/16 :goto_0

    :sswitch_4
    const-string v4, "backTitle"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v3, 0x16

    goto/16 :goto_0

    :sswitch_5
    const-string v4, "backgroundColor"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v3, 0x15

    goto/16 :goto_0

    :sswitch_6
    const-string v4, "hideBackButton"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v3, 0x14

    goto/16 :goto_0

    :sswitch_7
    const-string v4, "largeTitleFontWeight"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v3, 0x13

    goto/16 :goto_0

    :sswitch_8
    const-string v4, "hideShadow"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v3, 0x12

    goto/16 :goto_0

    :sswitch_9
    const-string v4, "backTitleFontFamily"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v3, 0x11

    goto/16 :goto_0

    :sswitch_a
    const-string v4, "backTitleFontSize"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v3, 0x10

    goto/16 :goto_0

    :sswitch_b
    const-string v4, "title"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v3, 0xf

    goto/16 :goto_0

    :sswitch_c
    const-string v4, "color"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v3, 0xe

    goto/16 :goto_0

    :sswitch_d
    const-string v4, "largeTitleFontFamily"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v3, 0xd

    goto/16 :goto_0

    :sswitch_e
    const-string v4, "backButtonInCustomView"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v3, 0xc

    goto/16 :goto_0

    :sswitch_f
    const-string v4, "largeTitleBackgroundColor"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v3, 0xb

    goto/16 :goto_0

    :sswitch_10
    const-string v4, "direction"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v3, 0xa

    goto/16 :goto_0

    :sswitch_11
    const-string v4, "backTitleVisible"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v3, 0x9

    goto/16 :goto_0

    :sswitch_12
    const-string v4, "backButtonDisplayMode"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_13
    const-string v4, "largeTitleFontSize"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    goto :goto_0

    :cond_13
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_14
    const-string v4, "hidden"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    goto :goto_0

    :cond_14
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_15
    const-string v4, "titleFontWeight"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_15

    goto :goto_0

    :cond_15
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_16
    const-string v4, "disableBackButtonMenu"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    goto :goto_0

    :cond_16
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_17
    const-string v4, "titleFontFamily"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_17

    goto :goto_0

    :cond_17
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_18
    const-string v4, "largeTitleColor"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_18

    goto :goto_0

    :cond_18
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_19
    const-string v4, "titleColor"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    goto :goto_0

    :cond_19
    move v3, v0

    goto :goto_0

    :sswitch_1a
    const-string v4, "translucent"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1a

    goto :goto_0

    :cond_1a
    move v3, v2

    :goto_0
    packed-switch v3, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/f;->b(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_15

    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_1b

    goto :goto_1

    :cond_1b
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_1
    invoke-interface {p2, p1, v2}, LF2/p;->setTopInsetEnabled(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_1c

    goto :goto_2

    :cond_1c
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_2
    invoke-interface {p2, p1, v2}, LF2/p;->setLargeTitle(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_1d

    goto :goto_3

    :cond_1d
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_3
    invoke-interface {p2, p1, v2}, LF2/p;->setLargeTitleHideShadow(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_1e

    goto :goto_4

    :cond_1e
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v2

    :goto_4
    invoke-interface {p2, p1, v2}, LF2/p;->setTitleFontSize(Landroid/view/View;I)V

    goto/16 :goto_15

    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_1f

    goto :goto_5

    :cond_1f
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_5
    invoke-interface {p2, p1, v1}, LF2/p;->setBackTitle(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/p;->setBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_15

    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_20

    goto :goto_6

    :cond_20
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_6
    invoke-interface {p2, p1, v2}, LF2/p;->setHideBackButton(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_21

    goto :goto_7

    :cond_21
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_7
    invoke-interface {p2, p1, v1}, LF2/p;->setLargeTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_22

    goto :goto_8

    :cond_22
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_8
    invoke-interface {p2, p1, v2}, LF2/p;->setHideShadow(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_23

    goto :goto_9

    :cond_23
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_9
    invoke-interface {p2, p1, v1}, LF2/p;->setBackTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_24

    goto :goto_a

    :cond_24
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v2

    :goto_a
    invoke-interface {p2, p1, v2}, LF2/p;->setBackTitleFontSize(Landroid/view/View;I)V

    goto/16 :goto_15

    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_25

    goto :goto_b

    :cond_25
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_b
    invoke-interface {p2, p1, v1}, LF2/p;->setTitle(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/p;->setColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_15

    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_26

    goto :goto_c

    :cond_26
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_c
    invoke-interface {p2, p1, v1}, LF2/p;->setLargeTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_27

    goto :goto_d

    :cond_27
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_d
    invoke-interface {p2, p1, v2}, LF2/p;->setBackButtonInCustomView(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/p;->setLargeTitleBackgroundColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_15

    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, LF2/p;->setDirection(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_28

    goto :goto_e

    :cond_28
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_e
    invoke-interface {p2, p1, v0}, LF2/p;->setBackTitleVisible(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, LF2/p;->setBackButtonDisplayMode(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_29

    goto :goto_f

    :cond_29
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v2

    :goto_f
    invoke-interface {p2, p1, v2}, LF2/p;->setLargeTitleFontSize(Landroid/view/View;I)V

    goto/16 :goto_15

    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_2a

    goto :goto_10

    :cond_2a
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_10
    invoke-interface {p2, p1, v2}, LF2/p;->setHidden(Landroid/view/View;Z)V

    goto :goto_15

    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_2b

    goto :goto_11

    :cond_2b
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_11
    invoke-interface {p2, p1, v1}, LF2/p;->setTitleFontWeight(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_15

    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_2c

    goto :goto_12

    :cond_2c
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_12
    invoke-interface {p2, p1, v2}, LF2/p;->setDisableBackButtonMenu(Landroid/view/View;Z)V

    goto :goto_15

    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_2d

    goto :goto_13

    :cond_2d
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_13
    invoke-interface {p2, p1, v1}, LF2/p;->setTitleFontFamily(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_15

    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/p;->setLargeTitleColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto :goto_15

    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/p;->setTitleColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto :goto_15

    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/p;

    if-nez p3, :cond_2e

    goto :goto_14

    :cond_2e
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :goto_14
    invoke-interface {p2, p1, v2}, LF2/p;->setTranslucent(Landroid/view/View;Z)V

    :goto_15
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6ca400a7 -> :sswitch_1a
        -0x6b402c15 -> :sswitch_19
        -0x69c7227a -> :sswitch_18
        -0x663e72f5 -> :sswitch_17
        -0x59a25300 -> :sswitch_16
        -0x49058be1 -> :sswitch_15
        -0x48916256 -> :sswitch_14
        -0x413de413 -> :sswitch_13
        -0x41273734 -> :sswitch_12
        -0x3f5e367f -> :sswitch_11
        -0x395ff881 -> :sswitch_10
        -0x17336ac8 -> :sswitch_f
        -0x85931ac -> :sswitch_e
        0x54c50 -> :sswitch_d
        0x5a72f63 -> :sswitch_c
        0x6942258 -> :sswitch_b
        0xaf5e9c1 -> :sswitch_a
        0xe7cf524 -> :sswitch_9
        0x143bc902 -> :sswitch_8
        0x1d3e3364 -> :sswitch_7
        0x3dea1ddb -> :sswitch_6
        0x4cb7f6d5 -> :sswitch_5
        0x4ef525b1 -> :sswitch_4
        0x5a7d4f68 -> :sswitch_3
        0x5d4078bf -> :sswitch_2
        0x78fc43dd -> :sswitch_1
        0x7d247559 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
