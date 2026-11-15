.class public LF2/z;
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
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, -0x1

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v3, "responsible"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0xb

    goto/16 :goto_0

    :sswitch_1
    const-string v3, "display"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0xa

    goto/16 :goto_0

    :sswitch_2
    const-string v3, "clipRule"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_3
    const-string v3, "clipPath"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_4
    const-string v3, "markerStart"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_5
    const-string v3, "name"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_6
    const-string v3, "mask"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_7
    const-string v3, "pointerEvents"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_0

    :cond_7
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_8
    const-string v3, "markerMid"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_0

    :cond_8
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_9
    const-string v3, "markerEnd"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_0

    :cond_9
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_a
    const-string v3, "matrix"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_0

    :cond_a
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_b
    const-string v3, "opacity"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_0

    :cond_b
    move v2, v0

    :goto_0
    packed-switch v2, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/f;->b(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/A;

    if-nez p3, :cond_c

    goto :goto_1

    :cond_c
    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_1
    invoke-interface {p2, p1, v0}, LF2/A;->setResponsible(Landroid/view/View;Z)V

    goto/16 :goto_c

    :pswitch_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/A;

    if-nez p3, :cond_d

    goto :goto_2

    :cond_d
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_2
    invoke-interface {p2, p1, v1}, LF2/A;->setDisplay(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_c

    :pswitch_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/A;

    if-nez p3, :cond_e

    goto :goto_3

    :cond_e
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->intValue()I

    move-result v0

    :goto_3
    invoke-interface {p2, p1, v0}, LF2/A;->setClipRule(Landroid/view/View;I)V

    goto/16 :goto_c

    :pswitch_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/A;

    if-nez p3, :cond_f

    goto :goto_4

    :cond_f
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_4
    invoke-interface {p2, p1, v1}, LF2/A;->setClipPath(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_c

    :pswitch_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/A;

    if-nez p3, :cond_10

    goto :goto_5

    :cond_10
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_5
    invoke-interface {p2, p1, v1}, LF2/A;->setMarkerStart(Landroid/view/View;Ljava/lang/String;)V

    goto/16 :goto_c

    :pswitch_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/A;

    if-nez p3, :cond_11

    goto :goto_6

    :cond_11
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_6
    invoke-interface {p2, p1, v1}, LF2/A;->setName(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_c

    :pswitch_6
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/A;

    if-nez p3, :cond_12

    goto :goto_7

    :cond_12
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_7
    invoke-interface {p2, p1, v1}, LF2/A;->setMask(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_c

    :pswitch_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/A;

    if-nez p3, :cond_13

    goto :goto_8

    :cond_13
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_8
    invoke-interface {p2, p1, v1}, LF2/A;->setPointerEvents(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_c

    :pswitch_8
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/A;

    if-nez p3, :cond_14

    goto :goto_9

    :cond_14
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_9
    invoke-interface {p2, p1, v1}, LF2/A;->setMarkerMid(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_c

    :pswitch_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/A;

    if-nez p3, :cond_15

    goto :goto_a

    :cond_15
    move-object v1, p3

    check-cast v1, Ljava/lang/String;

    :goto_a
    invoke-interface {p2, p1, v1}, LF2/A;->setMarkerEnd(Landroid/view/View;Ljava/lang/String;)V

    goto :goto_c

    :pswitch_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    check-cast p2, LF2/A;

    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    invoke-interface {p2, p1, p3}, LF2/A;->setMatrix(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    goto :goto_c

    :pswitch_b
    iget-object p2, p0, Lcom/facebook/react/uimanager/f;->a:Lcom/facebook/react/uimanager/g;

    if-nez p3, :cond_16

    const/high16 p3, 0x3f800000    # 1.0f

    goto :goto_b

    :cond_16
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Double;->floatValue()F

    move-result p3

    :goto_b
    invoke-interface {p2, p1, p3}, Lcom/facebook/react/uimanager/g;->setOpacity(Landroid/view/View;F)V

    :goto_c
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4b8807f5 -> :sswitch_b
        -0x4072683f -> :sswitch_a
        -0x37a9a5bf -> :sswitch_9
        -0x37a98852 -> :sswitch_8
        -0x117e564a -> :sswitch_7
        0x3306ec -> :sswitch_6
        0x337a8b -> :sswitch_5
        0xcf0d448 -> :sswitch_4
        0x36b25395 -> :sswitch_3
        0x36b3866c -> :sswitch_2
        0x63a518c2 -> :sswitch_1
        0x6e2146f6 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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
