.class public abstract Lcom/facebook/react/views/text/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/graphics/Typeface;IILjava/lang/String;Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    new-instance v0, LT1/b$b;

    invoke-direct {v0, p1, p2}, LT1/b$b;-><init>(II)V

    if-nez p3, :cond_1

    if-nez p0, :cond_0

    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    :cond_0
    invoke-virtual {v0, p0}, LT1/b$b;->a(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {}, LT1/b;->b()LT1/b;

    move-result-object p0

    invoke-virtual {p0, p3, v0, p4}, LT1/b;->d(Ljava/lang/String;LT1/b$b;Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;)I
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    const-string v0, "italic"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x2

    return p0

    :cond_0
    const-string v0, "normal"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static c(Lcom/facebook/react/bridge/ReadableArray;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p0, :cond_24

    invoke-interface {p0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_4

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    move v3, v1

    :goto_0
    invoke-interface {p0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v4

    if-ge v3, v4, :cond_23

    invoke-interface {p0, v3}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_22

    const/4 v5, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v6, "stylistic-seventeen"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v5, 0x20

    goto/16 :goto_1

    :sswitch_1
    const-string v6, "stylistic-fourteen"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v5, 0x1f

    goto/16 :goto_1

    :sswitch_2
    const-string v6, "stylistic-nineteen"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v5, 0x1e

    goto/16 :goto_1

    :sswitch_3
    const-string v6, "common-ligatures"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v5, 0x1d

    goto/16 :goto_1

    :sswitch_4
    const-string v6, "small-caps"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v5, 0x1c

    goto/16 :goto_1

    :sswitch_5
    const-string v6, "no-discretionary-ligatures"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v5, 0x1b

    goto/16 :goto_1

    :sswitch_6
    const-string v6, "stylistic-twenty"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v5, 0x1a

    goto/16 :goto_1

    :sswitch_7
    const-string v6, "stylistic-twelve"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto/16 :goto_1

    :cond_8
    const/16 v5, 0x19

    goto/16 :goto_1

    :sswitch_8
    const-string v6, "stylistic-sixteen"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_1

    :cond_9
    const/16 v5, 0x18

    goto/16 :goto_1

    :sswitch_9
    const-string v6, "stylistic-two"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto/16 :goto_1

    :cond_a
    const/16 v5, 0x17

    goto/16 :goto_1

    :sswitch_a
    const-string v6, "stylistic-ten"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_1

    :cond_b
    const/16 v5, 0x16

    goto/16 :goto_1

    :sswitch_b
    const-string v6, "stylistic-six"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    goto/16 :goto_1

    :cond_c
    const/16 v5, 0x15

    goto/16 :goto_1

    :sswitch_c
    const-string v6, "stylistic-one"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    goto/16 :goto_1

    :cond_d
    const/16 v5, 0x14

    goto/16 :goto_1

    :sswitch_d
    const-string v6, "stylistic-nine"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    goto/16 :goto_1

    :cond_e
    const/16 v5, 0x13

    goto/16 :goto_1

    :sswitch_e
    const-string v6, "stylistic-four"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    goto/16 :goto_1

    :cond_f
    const/16 v5, 0x12

    goto/16 :goto_1

    :sswitch_f
    const-string v6, "stylistic-five"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    goto/16 :goto_1

    :cond_10
    const/16 v5, 0x11

    goto/16 :goto_1

    :sswitch_10
    const-string v6, "no-historical-ligatures"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    goto/16 :goto_1

    :cond_11
    const/16 v5, 0x10

    goto/16 :goto_1

    :sswitch_11
    const-string v6, "stylistic-eleven"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    goto/16 :goto_1

    :cond_12
    const/16 v5, 0xf

    goto/16 :goto_1

    :sswitch_12
    const-string v6, "stylistic-three"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    goto/16 :goto_1

    :cond_13
    const/16 v5, 0xe

    goto/16 :goto_1

    :sswitch_13
    const-string v6, "stylistic-seven"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    goto/16 :goto_1

    :cond_14
    const/16 v5, 0xd

    goto/16 :goto_1

    :sswitch_14
    const-string v6, "stylistic-eight"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_15

    goto/16 :goto_1

    :cond_15
    const/16 v5, 0xc

    goto/16 :goto_1

    :sswitch_15
    const-string v6, "no-common-ligatures"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    goto/16 :goto_1

    :cond_16
    const/16 v5, 0xb

    goto/16 :goto_1

    :sswitch_16
    const-string v6, "contextual"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_17

    goto/16 :goto_1

    :cond_17
    const/16 v5, 0xa

    goto/16 :goto_1

    :sswitch_17
    const-string v6, "no-contextual"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_18

    goto/16 :goto_1

    :cond_18
    const/16 v5, 0x9

    goto/16 :goto_1

    :sswitch_18
    const-string v6, "oldstyle-nums"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    goto/16 :goto_1

    :cond_19
    const/16 v5, 0x8

    goto/16 :goto_1

    :sswitch_19
    const-string v6, "discretionary-ligatures"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1a

    goto :goto_1

    :cond_1a
    const/4 v5, 0x7

    goto :goto_1

    :sswitch_1a
    const-string v6, "tabular-nums"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1b

    goto :goto_1

    :cond_1b
    const/4 v5, 0x6

    goto :goto_1

    :sswitch_1b
    const-string v6, "historical-ligatures"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1c

    goto :goto_1

    :cond_1c
    const/4 v5, 0x5

    goto :goto_1

    :sswitch_1c
    const-string v6, "lining-nums"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    goto :goto_1

    :cond_1d
    const/4 v5, 0x4

    goto :goto_1

    :sswitch_1d
    const-string v6, "proportional-nums"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    goto :goto_1

    :cond_1e
    const/4 v5, 0x3

    goto :goto_1

    :sswitch_1e
    const-string v6, "stylistic-eighteen"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1f

    goto :goto_1

    :cond_1f
    const/4 v5, 0x2

    goto :goto_1

    :sswitch_1f
    const-string v6, "stylistic-fifteen"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_20

    goto :goto_1

    :cond_20
    move v5, v0

    goto :goto_1

    :sswitch_20
    const-string v6, "stylistic-thirteen"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_21

    goto :goto_1

    :cond_21
    move v5, v1

    :goto_1
    packed-switch v5, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    const-string v4, "\'ss17\'"

    :goto_2
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :pswitch_1
    const-string v4, "\'ss14\'"

    goto :goto_2

    :pswitch_2
    const-string v4, "\'ss19\'"

    goto :goto_2

    :pswitch_3
    const-string v4, "\'liga\'"

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v4, "\'clig\'"

    goto :goto_2

    :pswitch_4
    const-string v4, "\'smcp\'"

    goto :goto_2

    :pswitch_5
    const-string v4, "\'dlig\' off"

    goto :goto_2

    :pswitch_6
    const-string v4, "\'ss20\'"

    goto :goto_2

    :pswitch_7
    const-string v4, "\'ss12\'"

    goto :goto_2

    :pswitch_8
    const-string v4, "\'ss16\'"

    goto :goto_2

    :pswitch_9
    const-string v4, "\'ss02\'"

    goto :goto_2

    :pswitch_a
    const-string v4, "\'ss10\'"

    goto :goto_2

    :pswitch_b
    const-string v4, "\'ss06\'"

    goto :goto_2

    :pswitch_c
    const-string v4, "\'ss01\'"

    goto :goto_2

    :pswitch_d
    const-string v4, "\'ss09\'"

    goto :goto_2

    :pswitch_e
    const-string v4, "\'ss04\'"

    goto :goto_2

    :pswitch_f
    const-string v4, "\'ss05\'"

    goto :goto_2

    :pswitch_10
    const-string v4, "\'hlig\' off"

    goto :goto_2

    :pswitch_11
    const-string v4, "\'ss11\'"

    goto :goto_2

    :pswitch_12
    const-string v4, "\'ss03\'"

    goto :goto_2

    :pswitch_13
    const-string v4, "\'ss07\'"

    goto :goto_2

    :pswitch_14
    const-string v4, "\'ss08\'"

    goto :goto_2

    :pswitch_15
    const-string v4, "\'liga\' off"

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v4, "\'clig\' off"

    goto :goto_2

    :pswitch_16
    const-string v4, "\'calt\'"

    goto :goto_2

    :pswitch_17
    const-string v4, "\'calt\' off"

    goto :goto_2

    :pswitch_18
    const-string v4, "\'onum\'"

    goto :goto_2

    :pswitch_19
    const-string v4, "\'dlig\'"

    goto :goto_2

    :pswitch_1a
    const-string v4, "\'tnum\'"

    goto :goto_2

    :pswitch_1b
    const-string v4, "\'hlig\'"

    goto :goto_2

    :pswitch_1c
    const-string v4, "\'lnum\'"

    goto :goto_2

    :pswitch_1d
    const-string v4, "\'pnum\'"

    goto :goto_2

    :pswitch_1e
    const-string v4, "\'ss18\'"

    goto :goto_2

    :pswitch_1f
    const-string v4, "\'ss15\'"

    goto :goto_2

    :pswitch_20
    const-string v4, "\'ss13\'"

    goto :goto_2

    :cond_22
    :goto_3
    add-int/2addr v3, v0

    goto/16 :goto_0

    :cond_23
    const-string p0, ", "

    invoke-static {p0, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_24
    :goto_4
    const/4 p0, 0x0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7634064c -> :sswitch_20
        -0x733f3500 -> :sswitch_1f
        -0x5b760864 -> :sswitch_1e
        -0x473fc7cb -> :sswitch_1d
        -0x3f4391b7 -> :sswitch_1c
        -0x35963f7b -> :sswitch_1b
        -0x2e038ca3 -> :sswitch_1a
        -0x28122b79 -> :sswitch_19
        -0x2751e650 -> :sswitch_18
        0xed8e6dd -> :sswitch_17
        0x1051fb51 -> :sswitch_16
        0x1147aaf2 -> :sswitch_15
        0x11ac52f2 -> :sswitch_14
        0x12700270 -> :sswitch_13
        0x127f6801 -> :sswitch_12
        0x24079c3e -> :sswitch_11
        0x3698ad11 -> :sswitch_10
        0x3a60dbef -> :sswitch_f
        0x3a60f263 -> :sswitch_e
        0x3a647def -> :sswitch_d
        0x3bb0ad89 -> :sswitch_c
        0x3bb0bc05 -> :sswitch_b
        0x3bb0bf40 -> :sswitch_a
        0x3bb0c16f -> :sswitch_9
        0x3d6f745f -> :sswitch_8
        0x3e3b2c96 -> :sswitch_7
        0x3e3b33ee -> :sswitch_6
        0x40870c7b -> :sswitch_5
        0x468813e7 -> :sswitch_4
        0x48f49866 -> :sswitch_3
        0x573c3149 -> :sswitch_2
        0x62414bbd -> :sswitch_1
        0x7cff8d4a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method public static d(Ljava/lang/String;)I
    .locals 2

    .line 1
    const/4 v0, -0x1

    if-eqz p0, :cond_b

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    :goto_0
    move p0, v0

    goto/16 :goto_1

    :sswitch_0
    const-string v1, "bold"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/16 p0, 0xa

    goto/16 :goto_1

    :sswitch_1
    const-string v1, "900"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/16 p0, 0x9

    goto/16 :goto_1

    :sswitch_2
    const-string v1, "800"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto :goto_0

    :cond_2
    const/16 p0, 0x8

    goto/16 :goto_1

    :sswitch_3
    const-string v1, "700"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto :goto_0

    :cond_3
    const/4 p0, 0x7

    goto :goto_1

    :sswitch_4
    const-string v1, "600"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 p0, 0x6

    goto :goto_1

    :sswitch_5
    const-string v1, "500"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 p0, 0x5

    goto :goto_1

    :sswitch_6
    const-string v1, "400"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    const/4 p0, 0x4

    goto :goto_1

    :sswitch_7
    const-string v1, "300"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    const/4 p0, 0x3

    goto :goto_1

    :sswitch_8
    const-string v1, "200"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_0

    :cond_8
    const/4 p0, 0x2

    goto :goto_1

    :sswitch_9
    const-string v1, "100"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_0

    :cond_9
    const/4 p0, 0x1

    goto :goto_1

    :sswitch_a
    const-string v1, "normal"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto :goto_0

    :cond_a
    const/4 p0, 0x0

    :goto_1
    packed-switch p0, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const/16 p0, 0x384

    return p0

    :pswitch_1
    const/16 p0, 0x320

    return p0

    :pswitch_2
    const/16 p0, 0x2bc

    return p0

    :pswitch_3
    const/16 p0, 0x258

    return p0

    :pswitch_4
    const/16 p0, 0x1f4

    return p0

    :pswitch_5
    const/16 p0, 0x12c

    return p0

    :pswitch_6
    const/16 p0, 0xc8

    return p0

    :pswitch_7
    const/16 p0, 0x64

    return p0

    :pswitch_8
    const/16 p0, 0x190

    return p0

    :cond_b
    :goto_2
    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3df94319 -> :sswitch_a
        0xbdf1 -> :sswitch_9
        0xc1b2 -> :sswitch_8
        0xc573 -> :sswitch_7
        0xc934 -> :sswitch_6
        0xccf5 -> :sswitch_5
        0xd0b6 -> :sswitch_4
        0xd477 -> :sswitch_3
        0xd838 -> :sswitch_2
        0xdbf9 -> :sswitch_1
        0x2e3a85 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_8
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
