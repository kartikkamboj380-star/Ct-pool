.class public final Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager;
.super Lcom/facebook/react/uimanager/SimpleViewManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/SimpleViewManager<",
        "LH2/b;",
        ">;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "DebuggingOverlay"
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager$a;

.field public static final REACT_CLASS:Ljava/lang/String; = "DebuggingOverlay"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager;->Companion:Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    return-void
.end method


# virtual methods
.method public createViewInstance(Lcom/facebook/react/uimanager/e0;)LH2/b;
    .locals 1

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LH2/b;

    invoke-direct {v0, p1}, LH2/b;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)LH2/b;

    move-result-object p1

    return-object p1
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "DebuggingOverlay"

    return-object v0
.end method

.method public receiveCommand(LH2/b;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 20

    move-object/from16 v1, p1

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    .line 1
    const-string v3, "view"

    invoke-static {v1, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "commandId"

    invoke-static {v0, v3}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v4, -0x73c1883d

    const-string v5, "DebuggingOverlay"

    if-eq v3, v4, :cond_d

    const v4, 0x4f16f299    # 2.5324813E9f

    const-string v6, "height"

    const-string v7, "width"

    const-string v8, "y"

    const-string v9, "x"

    const/4 v11, 0x0

    if-eq v3, v4, :cond_7

    const v4, 0x5292bdcb

    if-eq v3, v4, :cond_1

    :cond_0
    :goto_0
    move-object v3, v5

    goto/16 :goto_b

    :cond_1
    const-string v3, "highlightElements"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    return-void

    :cond_3
    invoke-interface {v2, v11}, Lcom/facebook/react/bridge/ReadableArray;->getArray(I)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v4

    move v12, v11

    const/4 v0, 0x1

    :goto_1
    if-ge v12, v4, :cond_6

    invoke-interface {v2, v12}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v13

    :try_start_0
    invoke-interface {v13, v9}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v14

    double-to-float v14, v14

    invoke-interface {v13, v8}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v10
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    double-to-float v10, v10

    move-object v11, v8

    move-object/from16 v16, v9

    float-to-double v8, v14

    :try_start_1
    invoke-interface {v13, v7}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v17
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    add-double v8, v8, v17

    double-to-float v8, v8

    move-object/from16 p2, v2

    float-to-double v1, v10

    :try_start_2
    invoke-interface {v13, v6}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v17

    add-double v1, v1, v17

    double-to-float v1, v1

    new-instance v2, Landroid/graphics/RectF;

    invoke-static {v14}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v9

    invoke-static {v10}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v10

    invoke-static {v8}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v8

    invoke-static {v1}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v1

    invoke-direct {v2, v9, v10, v8, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object/from16 p2, v2

    goto :goto_2

    :catch_2
    move-exception v0

    move-object/from16 p2, v2

    move-object v11, v8

    move-object/from16 v16, v9

    :goto_2
    instance-of v1, v0, Lcom/facebook/react/bridge/NoSuchKeyException;

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    instance-of v1, v0, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;

    :goto_3
    if-eqz v1, :cond_5

    new-instance v0, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string v1, "Unexpected payload for highlighting elements: every element should have x, y, width, height fields"

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    invoke-static {v5, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_4
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object v8, v11

    move-object/from16 v9, v16

    const/4 v11, 0x0

    goto :goto_1

    :cond_5
    throw v0

    :cond_6
    if-eqz v0, :cond_f

    move-object/from16 v1, p1

    invoke-virtual {v1, v3}, LH2/b;->setHighlightedElementsRectangles(Ljava/util/List;)V

    goto/16 :goto_c

    :cond_7
    move-object v11, v8

    move-object/from16 v16, v9

    const-string v3, "highlightTraceUpdates"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez v2, :cond_8

    return-void

    :cond_8
    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lcom/facebook/react/bridge/ReadableArray;->getArray(I)Lcom/facebook/react/bridge/ReadableArray;

    move-result-object v2

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v8

    move v9, v3

    const/4 v0, 0x1

    :goto_5
    if-ge v9, v8, :cond_c

    invoke-interface {v2, v9}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v10

    const-string v12, "rectangle"

    invoke-interface {v10, v12}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v12

    if-nez v12, :cond_9

    new-instance v0, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string v2, "Unexpected payload for highlighting trace updates: rectangle field is null"

    invoke-direct {v0, v2}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    invoke-static {v5, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v11, v3

    goto/16 :goto_a

    :cond_9
    const-string v13, "id"

    invoke-interface {v10, v13}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v13

    const-string v14, "color"

    invoke-interface {v10, v14}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v10

    move-object/from16 p2, v4

    move-object/from16 v14, v16

    :try_start_3
    invoke-interface {v12, v14}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v3
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7

    double-to-float v3, v3

    move-object/from16 v16, v14

    :try_start_4
    invoke-interface {v12, v11}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v14
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_6

    double-to-float v14, v14

    move-object v15, v5

    float-to-double v4, v3

    :try_start_5
    invoke-interface {v12, v7}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v17
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    add-double v4, v4, v17

    double-to-float v4, v4

    move-object v5, v7

    move/from16 v17, v8

    float-to-double v7, v14

    :try_start_6
    invoke-interface {v12, v6}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v18

    add-double v7, v7, v18

    double-to-float v7, v7

    new-instance v8, Landroid/graphics/RectF;

    invoke-static {v3}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v3

    invoke-static {v14}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v12

    invoke-static {v4}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v4

    invoke-static {v7}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result v7

    invoke-direct {v8, v3, v12, v4, v7}, Landroid/graphics/RectF;-><init>(FFFF)V

    new-instance v3, LH2/c;

    invoke-direct {v3, v13, v8, v10}, LH2/c;-><init>(ILandroid/graphics/RectF;I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    move-object/from16 v4, p2

    :try_start_7
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    move-object v3, v15

    goto :goto_9

    :catch_3
    move-exception v0

    goto :goto_7

    :catch_4
    move-exception v0

    move-object/from16 v4, p2

    goto :goto_7

    :catch_5
    move-exception v0

    move-object/from16 v4, p2

    :goto_6
    move-object v5, v7

    move/from16 v17, v8

    goto :goto_7

    :catch_6
    move-exception v0

    move-object/from16 v4, p2

    move-object v15, v5

    goto :goto_6

    :catch_7
    move-exception v0

    move-object/from16 v4, p2

    move-object v15, v5

    move-object v5, v7

    move/from16 v17, v8

    move-object/from16 v16, v14

    :goto_7
    instance-of v3, v0, Lcom/facebook/react/bridge/NoSuchKeyException;

    if-eqz v3, :cond_a

    const/4 v3, 0x1

    goto :goto_8

    :cond_a
    instance-of v3, v0, Lcom/facebook/react/bridge/UnexpectedNativeTypeException;

    :goto_8
    if-eqz v3, :cond_b

    new-instance v0, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string v3, "Unexpected payload for highlighting trace updates: rectangle field should have x, y, width, height fields"

    invoke-direct {v0, v3}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    move-object v3, v15

    invoke-static {v3, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_9
    add-int/lit8 v9, v9, 0x1

    move-object v7, v5

    move/from16 v8, v17

    move-object v5, v3

    const/4 v3, 0x0

    goto/16 :goto_5

    :cond_b
    throw v0

    :cond_c
    move v11, v0

    :goto_a
    if-eqz v11, :cond_f

    invoke-virtual {v1, v4}, LH2/b;->setTraceUpdates(Ljava/util/List;)V

    goto :goto_c

    :cond_d
    move-object v3, v5

    const-string v2, "clearElementsHighlights"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    :goto_b
    new-instance v0, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    const-string v1, "Received unexpected command in DebuggingOverlayManager"

    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_c

    :cond_e
    invoke-virtual/range {p1 .. p1}, LH2/b;->b()V

    :cond_f
    :goto_c
    return-void
.end method

.method public bridge synthetic receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 2
    check-cast p1, LH2/b;

    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager;->receiveCommand(LH2/b;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method
