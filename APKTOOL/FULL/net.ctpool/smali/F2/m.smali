.class public LF2/m;
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
    .locals 6

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    const/high16 v1, -0x40800000    # -1.0f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v5, "sheetExpandsWhenScrolledToEdge"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v4, 0x1c

    goto/16 :goto_0

    :sswitch_1
    const-string v5, "nativeBackButtonDismissalEnabled"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v4, 0x1b

    goto/16 :goto_0

    :sswitch_2
    const-string v5, "statusBarAnimation"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v4, 0x1a

    goto/16 :goto_0

    :sswitch_3
    const-string v5, "sheetGrabberVisible"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v4, 0x19

    goto/16 :goto_0

    :sswitch_4
    const-string v5, "navigationBarTranslucent"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v4, 0x18

    goto/16 :goto_0

    :sswitch_5
    const-string v5, "customAnimationOnSwipe"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v4, 0x17

    goto/16 :goto_0

    :sswitch_6
    const-string v5, "swipeDirection"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v4, 0x16

    goto/16 :goto_0

    :sswitch_7
    const-string v5, "transitionDuration"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v4, 0x15

    goto/16 :goto_0

    :sswitch_8
    const-string v5, "sheetLargestUndimmedDetent"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v4, 0x14

    goto/16 :goto_0

    :sswitch_9
    const-string v5, "screenOrientation"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v4, 0x13

    goto/16 :goto_0

    :sswitch_a
    const-string v5, "gestureResponseDistance"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v4, 0x12

    goto/16 :goto_0

    :sswitch_b
    const-string v5, "fullScreenSwipeEnabled"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v4, 0x11

    goto/16 :goto_0

    :sswitch_c
    const-string v5, "statusBarHidden"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v4, 0x10

    goto/16 :goto_0

    :sswitch_d
    const-string v5, "preventNativeDismiss"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v4, 0xf

    goto/16 :goto_0

    :sswitch_e
    const-string v5, "replaceAnimation"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v4, 0xe

    goto/16 :goto_0

    :sswitch_f
    const-string v5, "sheetAllowedDetents"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v4, 0xd

    goto/16 :goto_0

    :sswitch_10
    const-string v5, "navigationBarColor"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v4, 0xc

    goto/16 :goto_0

    :sswitch_11
    const-string v5, "stackAnimation"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    goto/16 :goto_0

    :cond_11
    const/16 v4, 0xb

    goto/16 :goto_0

    :sswitch_12
    const-string v5, "fullScreenSwipeShadowEnabled"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    goto/16 :goto_0

    :cond_12
    const/16 v4, 0xa

    goto/16 :goto_0

    :sswitch_13
    const-string v5, "statusBarStyle"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    goto/16 :goto_0

    :cond_13
    const/16 v4, 0x9

    goto/16 :goto_0

    :sswitch_14
    const-string v5, "statusBarColor"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    goto/16 :goto_0

    :cond_14
    const/16 v4, 0x8

    goto/16 :goto_0

    :sswitch_15
    const-string v5, "activityState"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_15

    goto :goto_0

    :cond_15
    const/4 v4, 0x7

    goto :goto_0

    :sswitch_16
    const-string v5, "stackPresentation"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    goto :goto_0

    :cond_16
    const/4 v4, 0x6

    goto :goto_0

    :sswitch_17
    const-string v5, "statusBarTranslucent"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_17

    goto :goto_0

    :cond_17
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_18
    const-string v5, "navigationBarHidden"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_18

    goto :goto_0

    :cond_18
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_19
    const-string v5, "sheetCornerRadius"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_19

    goto :goto_0

    :cond_19
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_1a
    const-string v5, "hideKeyboardOnSwipe"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1a

    goto :goto_0

    :cond_1a
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_1b
    const-string v5, "gestureEnabled"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1b

    goto :goto_0

    :cond_1b
    move v4, v0

    goto :goto_0

    :sswitch_1c
    const-string v5, "homeIndicatorHidden"

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1c

    goto :goto_0

    :cond_1c
    move v4, v3

    :goto_0
    packed-switch v4, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/f;->b(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_15

    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_1d

    goto :goto_1

    :cond_1d
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_1
    invoke-interface {p2, p1, v3}, LF2/n;->setSheetExpandsWhenScrolledToEdge(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_1e

    goto :goto_2

    :cond_1e
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_2
    invoke-interface {p2, p1, v3}, LF2/n;->setNativeBackButtonDismissalEnabled(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_1f

    goto :goto_3

    :cond_1f
    move-object v2, p3

    check-cast v2, Ljava/lang/String;

    :goto_3
    invoke-interface {p2, p1, v2}, LF2/n;->setStatusBarAnimation(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_20

    goto :goto_4

    :cond_20
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_4
    invoke-interface {p2, p1, v3}, LF2/n;->setSheetGrabberVisible(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_21

    goto :goto_5

    :cond_21
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_5
    invoke-interface {p2, p1, v3}, LF2/n;->setNavigationBarTranslucent(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_22

    goto :goto_6

    :cond_22
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_6
    invoke-interface {p2, p1, v3}, LF2/n;->setCustomAnimationOnSwipe(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, LF2/n;->setSwipeDirection(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_23

    const/16 p3, 0x15e

    goto :goto_7

    :cond_23
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result p3

    :goto_7
    invoke-interface {p2, p1, p3}, LF2/n;->setTransitionDuration(Landroid/view/View;I)V

    goto/16 :goto_15

    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, LF2/n;->setSheetLargestUndimmedDetent(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_24

    goto :goto_8

    :cond_24
    move-object v2, p3

    check-cast v2, Ljava/lang/String;

    :goto_8
    invoke-interface {p2, p1, v2}, LF2/n;->setScreenOrientation(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    invoke-interface {p2, p1, p3}, LF2/n;->setGestureResponseDistance(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    goto/16 :goto_15

    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_25

    goto :goto_9

    :cond_25
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_9
    invoke-interface {p2, p1, v3}, LF2/n;->setFullScreenSwipeEnabled(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_26

    goto :goto_a

    :cond_26
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_a
    invoke-interface {p2, p1, v3}, LF2/n;->setStatusBarHidden(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_d
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_27

    goto :goto_b

    :cond_27
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_b
    invoke-interface {p2, p1, v3}, LF2/n;->setPreventNativeDismiss(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, LF2/n;->setReplaceAnimation(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, LF2/n;->setSheetAllowedDetents(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/n;->setNavigationBarColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_15

    :pswitch_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, LF2/n;->setStackAnimation(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_28

    goto :goto_c

    :cond_28
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_c
    invoke-interface {p2, p1, v3}, LF2/n;->setFullScreenSwipeShadowEnabled(Landroid/view/View;Z)V

    goto/16 :goto_15

    :pswitch_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_29

    goto :goto_d

    :cond_29
    move-object v2, p3

    check-cast v2, Ljava/lang/String;

    :goto_d
    invoke-interface {p2, p1, v2}, LF2/n;->setStatusBarStyle(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p3, v0}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p1, p3}, LF2/n;->setStatusBarColor(Landroid/view/View;Ljava/lang/Integer;)V

    goto/16 :goto_15

    :pswitch_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_2a

    goto :goto_e

    :cond_2a
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v1

    :goto_e
    invoke-interface {p2, p1, v1}, LF2/n;->setActivityState(Landroid/view/View;F)V

    goto/16 :goto_15

    :pswitch_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    check-cast p3, Ljava/lang/String;

    invoke-interface {p2, p1, p3}, LF2/n;->setStackPresentation(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_15

    :pswitch_17
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_2b

    goto :goto_f

    :cond_2b
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_f
    invoke-interface {p2, p1, v3}, LF2/n;->setStatusBarTranslucent(Landroid/view/View;Z)V

    goto :goto_15

    :pswitch_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_2c

    goto :goto_10

    :cond_2c
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_10
    invoke-interface {p2, p1, v3}, LF2/n;->setNavigationBarHidden(Landroid/view/View;Z)V

    goto :goto_15

    :pswitch_19
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_2d

    goto :goto_11

    :cond_2d
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result v1

    :goto_11
    invoke-interface {p2, p1, v1}, LF2/n;->setSheetCornerRadius(Landroid/view/View;F)V

    goto :goto_15

    :pswitch_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_2e

    goto :goto_12

    :cond_2e
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_12
    invoke-interface {p2, p1, v3}, LF2/n;->setHideKeyboardOnSwipe(Landroid/view/View;Z)V

    goto :goto_15

    :pswitch_1b
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_2f

    goto :goto_13

    :cond_2f
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_13
    invoke-interface {p2, p1, v0}, LF2/n;->setGestureEnabled(Landroid/view/View;Z)V

    goto :goto_15

    :pswitch_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/n;

    if-nez p3, :cond_30

    goto :goto_14

    :cond_30
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_14
    invoke-interface {p2, p1, v3}, LF2/n;->setHomeIndicatorHidden(Landroid/view/View;Z)V

    :goto_15
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x737a3646 -> :sswitch_1c
        -0x6e7b0e48 -> :sswitch_1b
        -0x675c3aee -> :sswitch_1a
        -0x506a6dba -> :sswitch_19
        -0x4ecd6817 -> :sswitch_18
        -0x44e94228 -> :sswitch_17
        -0x4496763e -> :sswitch_16
        -0x3e6b8d3e -> :sswitch_15
        -0x3a0986de -> :sswitch_14
        -0x39259890 -> :sswitch_13
        -0x38c1d7de -> :sswitch_12
        -0x226f2e24 -> :sswitch_11
        -0x1b948ebc -> :sswitch_10
        -0x1056680e -> :sswitch_f
        -0xf53acd0 -> :sswitch_e
        -0x9ea6485 -> :sswitch_d
        0x1088bcb -> :sswitch_c
        0x7befa22 -> :sswitch_b
        0xb3022bf -> :sswitch_a
        0xd90a1c4 -> :sswitch_9
        0xe6b0c52 -> :sswitch_8
        0x1955fa09 -> :sswitch_7
        0x40806965 -> :sswitch_6
        0x42362208 -> :sswitch_5
        0x4285947a -> :sswitch_4
        0x50f08f6e -> :sswitch_3
        0x52b16dc3 -> :sswitch_2
        0x670fd7dc -> :sswitch_1
        0x7d048c58 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
