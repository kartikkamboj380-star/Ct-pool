.class public abstract Lcom/facebook/react/uimanager/events/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/events/o$b;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/String;II)I
    .locals 1

    .line 1
    const-string v0, "touch"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    return v0

    :cond_0
    xor-int p0, p2, p1

    const/4 p1, -0x1

    if-nez p0, :cond_1

    return p1

    :cond_1
    const/4 p2, 0x1

    if-eq p0, p2, :cond_5

    const/4 v0, 0x2

    if-eq p0, v0, :cond_5

    const/4 v0, 0x4

    if-eq p0, v0, :cond_4

    const/16 p2, 0x8

    if-eq p0, p2, :cond_3

    const/16 p2, 0x10

    if-eq p0, p2, :cond_2

    return p1

    :cond_2
    return v0

    :cond_3
    const/4 p0, 0x3

    return p0

    :cond_4
    return p2

    :cond_5
    return v0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/uimanager/events/o;->g(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-string p0, "touch"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return p2
.end method

.method public static c(Ljava/lang/String;)I
    .locals 5

    .line 1
    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-nez p0, :cond_0

    return v2

    :cond_0
    const/4 v3, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v4, "topPointerOut"

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_1
    const-string v4, "topPointerCancel"

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_2
    const-string v4, "topPointerUp"

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_3
    const-string v4, "topPointerOver"

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    move v3, v0

    goto :goto_0

    :sswitch_4
    const-string v4, "topPointerMove"

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    move v3, v1

    goto :goto_0

    :sswitch_5
    const-string v4, "topPointerDown"

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    move v3, v2

    goto :goto_0

    :sswitch_6
    const-string v4, "topPointerLeave"

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_7
    const-string v4, "topPointerEnter"

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    return v2

    :pswitch_0
    return v1

    :pswitch_1
    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6a7c0b70 -> :sswitch_7
        -0x6a1dc391 -> :sswitch_6
        -0x4dc26016 -> :sswitch_5
        -0x4dbe48e7 -> :sswitch_4
        -0x4dbd47e4 -> :sswitch_3
        -0x3f7b441d -> :sswitch_2
        0x16d6f7c2 -> :sswitch_1
        0x5012ab06 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static d(ILjava/lang/String;)D
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/facebook/react/uimanager/events/o;->g(Ljava/lang/String;)Z

    move-result p1

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_0

    return-wide v0

    :cond_0
    if-eqz p0, :cond_1

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    :cond_1
    return-wide v0
.end method

.method public static e(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const-string p0, ""

    return-object p0

    :cond_0
    const-string p0, "mouse"

    return-object p0

    :cond_1
    const-string p0, "pen"

    return-object p0

    :cond_2
    const-string p0, "touch"

    return-object p0
.end method

.method public static f(Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    const/4 v2, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "topPointerOut"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_1
    const-string v3, "topPointerCancel"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_2
    const-string v3, "topPointerUp"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_3
    const-string v3, "topPointerOver"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_4
    const-string v3, "topPointerMove"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    move v2, v0

    goto :goto_0

    :sswitch_5
    const-string v3, "topPointerDown"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    move v2, v1

    :goto_0
    packed-switch v2, :pswitch_data_0

    return v1

    :pswitch_0
    return v0

    :sswitch_data_0
    .sparse-switch
        -0x4dc26016 -> :sswitch_5
        -0x4dbe48e7 -> :sswitch_4
        -0x4dbd47e4 -> :sswitch_3
        -0x3f7b441d -> :sswitch_2
        0x16d6f7c2 -> :sswitch_1
        0x5012ab06 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    const/4 v2, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "topPointerOut"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_1
    const-string v3, "topPointerUp"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    move v2, v0

    goto :goto_0

    :sswitch_2
    const-string v3, "topPointerLeave"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    packed-switch v2, :pswitch_data_0

    return v1

    :pswitch_0
    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6a1dc391 -> :sswitch_2
        -0x3f7b441d -> :sswitch_1
        0x5012ab06 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static h(Landroid/view/View;Lcom/facebook/react/uimanager/events/o$b;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    sget-object v1, Lcom/facebook/react/uimanager/events/o$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    sget v1, Lcom/facebook/react/n;->p:I

    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    const/4 v1, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    shl-int p1, v0, p1

    and-int/2addr p0, p1

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    return v0

    :cond_2
    return v1

    :pswitch_0
    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
