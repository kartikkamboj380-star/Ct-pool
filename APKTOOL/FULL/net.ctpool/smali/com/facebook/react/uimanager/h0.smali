.class public abstract Lcom/facebook/react/uimanager/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/uimanager/h0$a;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/h0$a;-><init>()V

    sput-object v0, Lcom/facebook/react/uimanager/h0;->a:Ljava/lang/ThreadLocal;

    return-void
.end method

.method private static a(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D
    .locals 3

    .line 1
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v0

    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "rad"

    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x3

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string p1, "deg"

    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    add-int/lit8 p1, p1, -0x3

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    move v2, v0

    :cond_1
    :goto_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    float-to-double p0, p0

    goto :goto_1

    :cond_2
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide p0

    :goto_1
    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/z;->l(D)D

    move-result-wide p0

    :goto_2
    return-wide p0
.end method

.method private static b(FFLcom/facebook/react/bridge/ReadableArray;Z)[F
    .locals 10

    .line 1
    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x1

    if-eqz p2, :cond_6

    const/4 v4, 0x0

    cmpl-float v5, p1, v4

    if-nez v5, :cond_0

    cmpl-float v5, p0, v4

    if-nez v5, :cond_0

    goto/16 :goto_3

    :cond_0
    const/high16 v5, 0x40000000    # 2.0f

    div-float v6, p0, v5

    div-float v5, p1, v5

    new-array v7, v2, [F

    aput v6, v7, v1

    aput v5, v7, v3

    aput v4, v7, v0

    move v4, v1

    :goto_0
    invoke-interface {p2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v8

    if-ge v4, v8, :cond_5

    if-ge v4, v2, :cond_5

    sget-object v8, Lcom/facebook/react/uimanager/h0$b;->a:[I

    invoke-interface {p2, v4}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v8, v8, v9

    if-eq v8, v3, :cond_3

    if-eq v8, v0, :cond_1

    goto :goto_2

    :cond_1
    if-eqz p3, :cond_4

    invoke-interface {p2, v4}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "%"

    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v9

    sub-int/2addr v9, v3

    invoke-virtual {v8, v1, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v8

    if-nez v4, :cond_2

    move v9, p0

    goto :goto_1

    :cond_2
    move v9, p1

    :goto_1
    mul-float/2addr v9, v8

    const/high16 v8, 0x42c80000    # 100.0f

    div-float/2addr v9, v8

    aput v9, v7, v4

    goto :goto_2

    :cond_3
    invoke-interface {p2, v4}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v8

    double-to-float v8, v8

    aput v8, v7, v4

    :cond_4
    :goto_2
    add-int/2addr v4, v3

    goto :goto_0

    :cond_5
    neg-float p0, v6

    aget p1, v7, v1

    add-float/2addr p0, p1

    neg-float p1, v5

    aget p2, v7, v3

    add-float/2addr p1, p2

    aget p2, v7, v0

    new-array p3, v2, [F

    aput p0, p3, v1

    aput p1, p3, v3

    aput p2, p3, v0

    return-object p3

    :cond_6
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method private static c(Ljava/lang/String;D)D
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "%"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    mul-double/2addr v0, p1

    const-wide/high16 p0, 0x4059000000000000L    # 100.0

    div-double/2addr v0, p0

    return-wide v0

    :cond_0
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p0

    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Invalid translate value: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "ReactNative"

    invoke-static {p1, p0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 p0, 0x0

    return-wide p0
.end method

.method public static d(Lcom/facebook/react/bridge/ReadableArray;[D)V
    .locals 6

    .line 1
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lcom/facebook/react/uimanager/h0;->e(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;Z)V

    return-void
.end method

.method public static e(Lcom/facebook/react/bridge/ReadableArray;[DFFLcom/facebook/react/bridge/ReadableArray;Z)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    sget-object v4, Lcom/facebook/react/uimanager/h0;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [D

    invoke-static/range {p1 .. p1}, Lcom/facebook/react/uimanager/z;->r([D)V

    invoke-static/range {p2 .. p5}, Lcom/facebook/react/uimanager/h0;->b(FFLcom/facebook/react/bridge/ReadableArray;Z)[F

    move-result-object v12

    const/4 v13, 0x2

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eqz v12, :cond_0

    invoke-static {v4}, Lcom/facebook/react/uimanager/z;->r([D)V

    aget v5, v12, v15

    float-to-double v6, v5

    aget v5, v12, v14

    float-to-double v8, v5

    aget v5, v12, v13

    float-to-double v10, v5

    move-object v5, v4

    invoke-static/range {v5 .. v11}, Lcom/facebook/react/uimanager/z;->j([DDDD)V

    invoke-static {v1, v1, v4}, Lcom/facebook/react/uimanager/z;->p([D[D[D)V

    :cond_0
    invoke-interface/range {p0 .. p0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v5

    const/16 v10, 0x10

    if-ne v5, v10, :cond_2

    invoke-interface {v0, v15}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v5

    sget-object v6, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    if-ne v5, v6, :cond_2

    invoke-static {v4}, Lcom/facebook/react/uimanager/z;->r([D)V

    move v2, v15

    :goto_0
    invoke-interface/range {p0 .. p0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-interface {v0, v2}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v5

    aput-wide v5, v4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v1, v1, v4}, Lcom/facebook/react/uimanager/z;->p([D[D[D)V

    goto/16 :goto_e

    :cond_2
    invoke-interface/range {p0 .. p0}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v11

    move v8, v15

    :goto_1
    if-ge v8, v11, :cond_17

    invoke-interface {v0, v8}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v5

    invoke-interface {v5}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    move-result-object v6

    invoke-interface {v6}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4}, Lcom/facebook/react/uimanager/z;->r([D)V

    const-string v7, "matrix"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v5

    move v6, v15

    :goto_2
    if-ge v6, v10, :cond_3

    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v16

    aput-wide v16, v4, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_3
    :goto_3
    move/from16 v19, v8

    move v13, v10

    move v14, v11

    goto/16 :goto_d

    :cond_4
    const-string v7, "perspective"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    invoke-static {v4, v5, v6}, Lcom/facebook/react/uimanager/z;->a([DD)V

    goto :goto_3

    :cond_5
    const-string v7, "rotateX"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-static {v5, v6}, Lcom/facebook/react/uimanager/h0;->a(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v5

    invoke-static {v4, v5, v6}, Lcom/facebook/react/uimanager/z;->b([DD)V

    goto :goto_3

    :cond_6
    const-string v7, "rotateY"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-static {v5, v6}, Lcom/facebook/react/uimanager/h0;->a(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v5

    invoke-static {v4, v5, v6}, Lcom/facebook/react/uimanager/z;->c([DD)V

    goto :goto_3

    :cond_7
    const-string v7, "rotate"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    const-string v7, "rotateZ"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    :cond_8
    move/from16 v19, v8

    move v13, v10

    move v14, v11

    goto/16 :goto_c

    :cond_9
    const-string v7, "scale"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    invoke-static {v4, v5, v6}, Lcom/facebook/react/uimanager/z;->e([DD)V

    :goto_4
    invoke-static {v4, v5, v6}, Lcom/facebook/react/uimanager/z;->f([DD)V

    goto :goto_3

    :cond_a
    const-string v7, "scaleX"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    invoke-static {v4, v5, v6}, Lcom/facebook/react/uimanager/z;->e([DD)V

    goto :goto_3

    :cond_b
    const-string v7, "scaleY"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    goto :goto_4

    :cond_c
    const-string v7, "translate"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    move/from16 v16, v11

    if-eqz v7, :cond_10

    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getArray(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v5

    invoke-interface {v5, v15}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v6

    sget-object v7, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    if-ne v6, v7, :cond_d

    if-eqz p5, :cond_d

    invoke-interface {v5, v15}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    float-to-double v10, v2

    invoke-static {v6, v10, v11}, Lcom/facebook/react/uimanager/h0;->c(Ljava/lang/String;D)D

    move-result-wide v9

    goto :goto_5

    :cond_d
    invoke-interface {v5, v15}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v9

    :goto_5
    invoke-interface {v5, v14}, Lcom/facebook/react/bridge/ReadableArray;->getType(I)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v6

    if-ne v6, v7, :cond_e

    if-eqz p5, :cond_e

    invoke-interface {v5, v14}, Lcom/facebook/react/bridge/ReadableArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    float-to-double v13, v3

    invoke-static {v6, v13, v14}, Lcom/facebook/react/uimanager/h0;->c(Ljava/lang/String;D)D

    move-result-wide v6

    move-wide v13, v6

    goto :goto_6

    :cond_e
    move v6, v14

    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v13

    :goto_6
    invoke-interface {v5}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v6

    const/4 v7, 0x2

    if-le v6, v7, :cond_f

    invoke-interface {v5, v7}, Lcom/facebook/react/bridge/ReadableArray;->getDouble(I)D

    move-result-wide v5

    move-wide/from16 v17, v5

    goto :goto_7

    :cond_f
    const-wide/16 v17, 0x0

    :goto_7
    move-object v5, v4

    move-wide v6, v9

    move/from16 v19, v8

    move-wide v8, v13

    move/from16 v14, v16

    const/16 v13, 0x10

    move-wide/from16 v10, v17

    invoke-static/range {v5 .. v11}, Lcom/facebook/react/uimanager/z;->j([DDDD)V

    goto/16 :goto_d

    :cond_10
    move/from16 v19, v8

    move/from16 v14, v16

    const/16 v13, 0x10

    const-string v7, "translateX"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v7

    sget-object v8, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    if-ne v7, v8, :cond_11

    if-eqz p5, :cond_11

    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    float-to-double v6, v2

    invoke-static {v5, v6, v7}, Lcom/facebook/react/uimanager/h0;->c(Ljava/lang/String;D)D

    move-result-wide v5

    :goto_8
    const-wide/16 v7, 0x0

    goto :goto_9

    :cond_11
    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    goto :goto_8

    :goto_9
    invoke-static {v4, v5, v6, v7, v8}, Lcom/facebook/react/uimanager/z;->i([DDD)V

    goto :goto_d

    :cond_12
    const-string v7, "translateY"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    move-result-object v7

    sget-object v8, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    if-ne v7, v8, :cond_13

    if-eqz p5, :cond_13

    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    float-to-double v6, v3

    invoke-static {v5, v6, v7}, Lcom/facebook/react/uimanager/h0;->c(Ljava/lang/String;D)D

    move-result-wide v5

    :goto_a
    const-wide/16 v7, 0x0

    goto :goto_b

    :cond_13
    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    goto :goto_a

    :goto_b
    invoke-static {v4, v7, v8, v5, v6}, Lcom/facebook/react/uimanager/z;->i([DDD)V

    goto :goto_d

    :cond_14
    const-string v7, "skewX"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-static {v5, v6}, Lcom/facebook/react/uimanager/h0;->a(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v5

    invoke-static {v4, v5, v6}, Lcom/facebook/react/uimanager/z;->g([DD)V

    goto :goto_d

    :cond_15
    const-string v7, "skewY"

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-static {v5, v6}, Lcom/facebook/react/uimanager/h0;->a(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v5

    invoke-static {v4, v5, v6}, Lcom/facebook/react/uimanager/z;->h([DD)V

    goto :goto_d

    :cond_16
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Unsupported transform type: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "ReactNative"

    invoke-static {v6, v5}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_d

    :goto_c
    invoke-static {v5, v6}, Lcom/facebook/react/uimanager/h0;->a(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)D

    move-result-wide v5

    invoke-static {v4, v5, v6}, Lcom/facebook/react/uimanager/z;->d([DD)V

    :goto_d
    invoke-static {v1, v1, v4}, Lcom/facebook/react/uimanager/z;->p([D[D[D)V

    add-int/lit8 v8, v19, 0x1

    move v10, v13

    move v11, v14

    const/4 v13, 0x2

    const/4 v14, 0x1

    goto/16 :goto_1

    :cond_17
    :goto_e
    if-eqz v12, :cond_18

    invoke-static {v4}, Lcom/facebook/react/uimanager/z;->r([D)V

    aget v0, v12, v15

    neg-float v0, v0

    float-to-double v6, v0

    const/4 v0, 0x1

    aget v0, v12, v0

    neg-float v0, v0

    float-to-double v8, v0

    const/4 v0, 0x2

    aget v0, v12, v0

    neg-float v0, v0

    float-to-double v10, v0

    move-object v5, v4

    invoke-static/range {v5 .. v11}, Lcom/facebook/react/uimanager/z;->j([DDDD)V

    invoke-static {v1, v1, v4}, Lcom/facebook/react/uimanager/z;->p([D[D[D)V

    :cond_18
    return-void
.end method
