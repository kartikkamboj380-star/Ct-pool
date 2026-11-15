.class public abstract Lcom/facebook/react/uimanager/events/t;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Lcom/facebook/react/uimanager/events/q;)[Lcom/facebook/react/bridge/WritableMap;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/q;->c()Landroid/view/MotionEvent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    new-array v1, v1, [Lcom/facebook/react/bridge/WritableMap;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/q;->e()F

    move-result v3

    sub-float/2addr v2, v3

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/q;->f()F

    move-result v4

    sub-float/2addr v3, v4

    const/4 v4, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v5

    if-ge v4, v5, :cond_0

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v5

    invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v6

    invoke-static {v6}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v6

    float-to-double v6, v6

    const-string v8, "pageX"

    invoke-interface {v5, v8, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    invoke-static {v6}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v6

    float-to-double v6, v6

    const-string v8, "pageY"

    invoke-interface {v5, v8, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getX(I)F

    move-result v6

    sub-float/2addr v6, v2

    invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getY(I)F

    move-result v7

    sub-float/2addr v7, v3

    invoke-static {v6}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v6

    float-to-double v8, v6

    const-string v6, "locationX"

    invoke-interface {v5, v6, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    invoke-static {v7}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v6

    float-to-double v6, v6

    const-string v8, "locationY"

    invoke-interface {v5, v8, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v6, "targetSurface"

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getSurfaceId()I

    move-result v7

    invoke-interface {v5, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v6, "target"

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v7

    invoke-interface {v5, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getTimestampMs()J

    move-result-wide v6

    long-to-double v6, v6

    const-string v8, "timestamp"

    invoke-interface {v5, v8, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    invoke-virtual {v0, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v6

    int-to-double v6, v6

    const-string v8, "identifier"

    invoke-interface {v5, v8, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    aput-object v5, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private static varargs b(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v0

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    if-eqz v3, :cond_1

    if-eqz p0, :cond_0

    invoke-interface {v3}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v3

    :cond_0
    invoke-interface {v0, v3}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method static c(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;Lcom/facebook/react/uimanager/events/q;)V
    .locals 17

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TouchesHelper.sentTouchEventModern("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/q;->getEventName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v2}, LP2/a;->c(JLjava/lang/String;)V

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/q;->d()Lcom/facebook/react/uimanager/events/s;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/q;->c()Landroid/view/MotionEvent;

    move-result-object v5

    if-nez v5, :cond_0

    const-string v0, "TouchesHelper"

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v3, v4}, LP2/a;->g(J)V

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_0
    :try_start_1
    invoke-static/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/t;->a(Lcom/facebook/react/uimanager/events/q;)[Lcom/facebook/react/bridge/WritableMap;

    move-result-object v6

    sget-object v7, Lcom/facebook/react/uimanager/events/t$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v7, v2

    if-eq v2, v1, :cond_5

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-eq v2, v7, :cond_4

    const/4 v5, 0x3

    if-eq v2, v5, :cond_2

    const/4 v5, 0x4

    if-eq v2, v5, :cond_1

    move-object v2, v6

    move-object v6, v8

    goto :goto_2

    :cond_1
    new-array v2, v0, [Lcom/facebook/react/bridge/WritableMap;

    goto :goto_2

    :cond_2
    array-length v2, v6

    new-array v2, v2, [Lcom/facebook/react/bridge/WritableMap;

    move v5, v0

    :goto_0
    array-length v7, v6

    if-ge v5, v7, :cond_3

    aget-object v7, v6, v5

    invoke-interface {v7}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v7

    aput-object v7, v2, v5

    add-int/2addr v5, v1

    goto :goto_0

    :cond_3
    :goto_1
    move-object/from16 v16, v6

    move-object v6, v2

    move-object/from16 v2, v16

    goto :goto_2

    :cond_4
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    aget-object v5, v6, v2

    aput-object v8, v6, v2

    new-array v2, v1, [Lcom/facebook/react/bridge/WritableMap;

    aput-object v5, v2, v0

    goto :goto_1

    :cond_5
    invoke-virtual {v5}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    aget-object v2, v6, v2

    invoke-interface {v2}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    new-array v5, v1, [Lcom/facebook/react/bridge/WritableMap;

    aput-object v2, v5, v0

    move-object v2, v6

    move-object v6, v5

    :goto_2
    if-eqz v6, :cond_6

    array-length v5, v6

    :goto_3
    if-ge v0, v5, :cond_6

    aget-object v7, v6, v0

    invoke-interface {v7}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v14

    invoke-static {v1, v6}, Lcom/facebook/react/uimanager/events/t;->b(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;

    move-result-object v7

    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/events/t;->b(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;

    move-result-object v8

    const-string v9, "changedTouches"

    invoke-interface {v14, v9, v7}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    const-string v7, "touches"

    invoke-interface {v14, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putArray(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/d;->getSurfaceId()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/q;->getEventName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/q;->canCoalesce()Z

    move-result v12

    invoke-virtual/range {p1 .. p1}, Lcom/facebook/react/uimanager/events/q;->getEventCategory()I

    move-result v15

    const/4 v13, 0x0

    move-object/from16 v8, p0

    invoke-interface/range {v8 .. v15}, Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;->receiveEvent(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/2addr v0, v1

    goto :goto_3

    :cond_6
    invoke-static {v3, v4}, LP2/a;->g(J)V

    return-void

    :goto_4
    invoke-static {v3, v4}, LP2/a;->g(J)V

    throw v0
.end method

.method static d(Lcom/facebook/react/uimanager/events/RCTEventEmitter;Lcom/facebook/react/uimanager/events/q;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/q;->d()Lcom/facebook/react/uimanager/events/s;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/react/uimanager/events/t;->a(Lcom/facebook/react/uimanager/events/q;)[Lcom/facebook/react/bridge/WritableMap;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lcom/facebook/react/uimanager/events/t;->b(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/react/uimanager/events/q;->c()Landroid/view/MotionEvent;

    move-result-object p1

    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    move-result-object v3

    sget-object v4, Lcom/facebook/react/uimanager/events/s;->q:Lcom/facebook/react/uimanager/events/s;

    if-eq v0, v4, :cond_3

    sget-object v4, Lcom/facebook/react/uimanager/events/s;->r:Lcom/facebook/react/uimanager/events/s;

    if-ne v0, v4, :cond_0

    goto :goto_1

    :cond_0
    sget-object v2, Lcom/facebook/react/uimanager/events/s;->o:Lcom/facebook/react/uimanager/events/s;

    if-eq v0, v2, :cond_2

    sget-object v2, Lcom/facebook/react/uimanager/events/s;->p:Lcom/facebook/react/uimanager/events/s;

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown touch type: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result p1

    invoke-interface {v3, p1}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v4

    if-ge v2, v4, :cond_4

    invoke-interface {v3, v2}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    invoke-static {v0}, Lcom/facebook/react/uimanager/events/s;->h(Lcom/facebook/react/uimanager/events/s;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1, v1, v3}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveTouches(Ljava/lang/String;Lcom/facebook/react/bridge/WritableArray;Lcom/facebook/react/bridge/WritableArray;)V

    return-void
.end method
