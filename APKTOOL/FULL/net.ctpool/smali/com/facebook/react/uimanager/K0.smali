.class public final Lcom/facebook/react/uimanager/K0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/uimanager/K0;

.field public static final b:[I

.field public static final c:[I

.field public static final d:[I

.field private static final e:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 47

    new-instance v0, Lcom/facebook/react/uimanager/K0;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/K0;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/K0;->a:Lcom/facebook/react/uimanager/K0;

    const/4 v0, 0x4

    const/4 v1, 0x5

    const/4 v2, 0x1

    const/4 v3, 0x3

    const/4 v4, 0x7

    new-array v4, v4, [I

    fill-array-data v4, :array_0

    sput-object v4, Lcom/facebook/react/uimanager/K0;->b:[I

    const/16 v4, 0x9

    new-array v4, v4, [I

    fill-array-data v4, :array_1

    sput-object v4, Lcom/facebook/react/uimanager/K0;->c:[I

    filled-new-array {v0, v1, v2, v3}, [I

    move-result-object v0

    sput-object v0, Lcom/facebook/react/uimanager/K0;->d:[I

    new-instance v0, Ljava/util/HashSet;

    const-string v45, "paddingStart"

    const-string v46, "paddingEnd"

    const-string v1, "alignSelf"

    const-string v2, "alignItems"

    const-string v3, "collapsable"

    const-string v4, "flex"

    const-string v5, "flexBasis"

    const-string v6, "flexDirection"

    const-string v7, "flexGrow"

    const-string v8, "rowGap"

    const-string v9, "columnGap"

    const-string v10, "gap"

    const-string v11, "flexShrink"

    const-string v12, "flexWrap"

    const-string v13, "justifyContent"

    const-string v14, "alignContent"

    const-string v15, "display"

    const-string v16, "position"

    const-string v17, "right"

    const-string v18, "top"

    const-string v19, "bottom"

    const-string v20, "left"

    const-string v21, "start"

    const-string v22, "end"

    const-string v23, "width"

    const-string v24, "height"

    const-string v25, "minWidth"

    const-string v26, "maxWidth"

    const-string v27, "minHeight"

    const-string v28, "maxHeight"

    const-string v29, "margin"

    const-string v30, "marginVertical"

    const-string v31, "marginHorizontal"

    const-string v32, "marginLeft"

    const-string v33, "marginRight"

    const-string v34, "marginTop"

    const-string v35, "marginBottom"

    const-string v36, "marginStart"

    const-string v37, "marginEnd"

    const-string v38, "padding"

    const-string v39, "paddingVertical"

    const-string v40, "paddingHorizontal"

    const-string v41, "paddingLeft"

    const-string v42, "paddingRight"

    const-string v43, "paddingTop"

    const-string v44, "paddingBottom"

    filled-new-array/range {v1 .. v46}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/facebook/react/uimanager/K0;->e:Ljava/util/HashSet;

    return-void

    :array_0
    .array-data 4
        0x8
        0x4
        0x5
        0x1
        0x3
        0x0
        0x2
    .end array-data

    :array_1
    .array-data 4
        0x8
        0x7
        0x6
        0x4
        0x5
        0x1
        0x3
        0x0
        0x2
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Z
    .locals 7

    .line 1
    const-string v0, "map"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prop"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/react/uimanager/K0;->e:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, "pointerEvents"

    invoke-static {v0, p1}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "auto"

    invoke-static {p1, p0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "box-none"

    invoke-static {p1, p0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    return v1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const-wide/16 v3, 0x0

    const-string v5, "borderWidth"

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    const-string v0, "borderRadius"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string p1, "backgroundColor"

    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v0

    sget-object v6, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v0, v6, :cond_5

    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    sget-object p1, Lcom/facebook/react/bridge/ReadableType;->Null:Lcom/facebook/react/bridge/ReadableType;

    if-eq v0, p1, :cond_6

    return v2

    :cond_6
    invoke-interface {p0, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-interface {p0, v5}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    invoke-interface {p0, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide p0

    cmpg-double p0, p0, v3

    if-nez p0, :cond_7

    goto :goto_1

    :cond_7
    return v2

    :cond_8
    :goto_1
    return v1

    :sswitch_1
    const-string v0, "borderBlockEndColor"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_3

    :cond_9
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object p1

    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne p1, v3, :cond_a

    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_4

    :cond_a
    :goto_2
    move v1, v2

    goto/16 :goto_4

    :sswitch_2
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_3

    :cond_b
    invoke-interface {p0, v5}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_18

    invoke-interface {p0, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide p0

    cmpg-double p0, p0, v3

    if-nez p0, :cond_a

    goto/16 :goto_4

    :sswitch_3
    const-string v0, "borderBlockColor"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_3

    :cond_c
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object p1

    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne p1, v3, :cond_a

    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_4

    :sswitch_4
    const-string v0, "overflow"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto/16 :goto_3

    :cond_d
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_18

    const-string p1, "visible"

    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_a

    goto/16 :goto_4

    :sswitch_5
    const-string v0, "borderBlockStartColor"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto/16 :goto_3

    :cond_e
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object p1

    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne p1, v3, :cond_a

    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_4

    :sswitch_6
    const-string v0, "borderLeftWidth"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto/16 :goto_3

    :cond_f
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_18

    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide p0

    cmpg-double p0, p0, v3

    if-nez p0, :cond_a

    goto/16 :goto_4

    :sswitch_7
    const-string v0, "borderLeftColor"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto/16 :goto_3

    :cond_10
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object p1

    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne p1, v3, :cond_a

    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_4

    :sswitch_8
    const-string v0, "opacity"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto/16 :goto_3

    :cond_11
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_18

    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide p0

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    cmpg-double p0, p0, v3

    if-nez p0, :cond_a

    goto/16 :goto_4

    :sswitch_9
    const-string v0, "borderBottomWidth"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto/16 :goto_3

    :cond_12
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_18

    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide p0

    cmpg-double p0, p0, v3

    if-nez p0, :cond_a

    goto/16 :goto_4

    :sswitch_a
    const-string v0, "borderBottomColor"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    goto :goto_3

    :cond_13
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object p1

    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne p1, v3, :cond_a

    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_a

    goto :goto_4

    :sswitch_b
    const-string v0, "borderTopWidth"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    goto :goto_3

    :cond_14
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_18

    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide p0

    cmpg-double p0, p0, v3

    if-nez p0, :cond_a

    goto :goto_4

    :sswitch_c
    const-string v0, "borderTopColor"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    goto :goto_3

    :cond_15
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object p1

    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne p1, v3, :cond_a

    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_a

    goto :goto_4

    :sswitch_d
    const-string v0, "borderRightWidth"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    goto :goto_3

    :cond_16
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->isNull(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_18

    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide p0

    cmpg-double p0, p0, v3

    if-nez p0, :cond_a

    goto :goto_4

    :sswitch_e
    const-string v0, "borderRightColor"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    :goto_3
    goto/16 :goto_2

    :cond_17
    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object p1

    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne p1, v3, :cond_a

    invoke-interface {p0, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_a

    :cond_18
    :goto_4
    return v1

    :sswitch_data_0
    .sparse-switch
        -0x7696880d -> :sswitch_e
        -0x757f89aa -> :sswitch_d
        -0x57ab08a6 -> :sswitch_c
        -0x56940a43 -> :sswitch_b
        -0x4e0397d4 -> :sswitch_a
        -0x4cec9971 -> :sswitch_9
        -0x4b8807f5 -> :sswitch_8
        -0xe70d730 -> :sswitch_7
        -0xd59d8cd -> :sswitch_6
        0x124be2c2 -> :sswitch_5
        0x1f91b402 -> :sswitch_4
        0x28ce5422 -> :sswitch_3
        0x2c2c84fa -> :sswitch_2
        0x2d7a3629 -> :sswitch_1
        0x506afbde -> :sswitch_0
    .end sparse-switch
.end method
