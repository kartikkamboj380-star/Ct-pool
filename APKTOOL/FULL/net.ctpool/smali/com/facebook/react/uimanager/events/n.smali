.class public Lcom/facebook/react/uimanager/events/n;
.super Lcom/facebook/react/uimanager/events/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/events/n$b;
    }
.end annotation


# static fields
.field private static final g:Ljava/lang/String; = "n"

.field private static final h:Landroidx/core/util/e;


# instance fields
.field private a:Landroid/view/MotionEvent;

.field private b:Ljava/lang/String;

.field private c:S

.field private d:Ljava/util/List;

.field private e:Lcom/facebook/react/uimanager/events/n$b;

.field private f:Lcom/facebook/react/uimanager/events/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/core/util/e;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Landroidx/core/util/e;-><init>(I)V

    sput-object v0, Lcom/facebook/react/uimanager/events/n;->h:Landroidx/core/util/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/d;-><init>()V

    const/4 v0, -0x1

    iput-short v0, p0, Lcom/facebook/react/uimanager/events/n;->c:S

    return-void
.end method

.method static bridge synthetic a(Lcom/facebook/react/uimanager/events/n;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/n;->b:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic b(Lcom/facebook/react/uimanager/events/n;)Lcom/facebook/react/uimanager/events/n$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/n;->e:Lcom/facebook/react/uimanager/events/n$b;

    return-object p0
.end method

.method private c(Lcom/facebook/react/bridge/WritableMap;I)V
    .locals 4

    .line 1
    and-int/lit16 v0, p2, 0x1000

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "ctrlKey"

    invoke-interface {p1, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const-string v3, "shiftKey"

    invoke-interface {p1, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    const-string v3, "altKey"

    invoke-interface {p1, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    const/high16 v0, 0x10000

    and-int/2addr p2, v0

    if-eqz p2, :cond_3

    move v1, v2

    :cond_3
    const-string p2, "metaKey"

    invoke-interface {p1, p2, v1}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method private d()Ljava/util/List;
    .locals 6

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/facebook/react/uimanager/events/n;->a:Landroid/view/MotionEvent;

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    iget-object v3, p0, Lcom/facebook/react/uimanager/events/n;->b:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    const/4 v4, -0x1

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v5, "topPointerOut"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v4, 0x8

    goto/16 :goto_0

    :sswitch_1
    const-string v5, "topPointerCancel"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x7

    goto :goto_0

    :sswitch_2
    const-string v5, "topClick"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x6

    goto :goto_0

    :sswitch_3
    const-string v5, "topPointerUp"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_4
    const-string v5, "topPointerOver"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_0

    :cond_4
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_5
    const-string v5, "topPointerMove"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_0

    :cond_5
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_6
    const-string v5, "topPointerDown"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_0

    :cond_6
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_7
    const-string v5, "topPointerLeave"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_0

    :cond_7
    move v4, v0

    goto :goto_0

    :sswitch_8
    const-string v5, "topPointerEnter"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_0

    :cond_8
    move v4, v1

    :goto_0
    packed-switch v4, :pswitch_data_0

    const/4 v0, 0x0

    goto :goto_1

    :pswitch_0
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/n;->f()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :pswitch_1
    invoke-direct {p0, v2}, Lcom/facebook/react/uimanager/events/n;->e(I)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    new-array v0, v0, [Lcom/facebook/react/bridge/WritableMap;

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_1
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6a7c0b70 -> :sswitch_8
        -0x6a1dc391 -> :sswitch_7
        -0x4dc26016 -> :sswitch_6
        -0x4dbe48e7 -> :sswitch_5
        -0x4dbd47e4 -> :sswitch_4
        -0x3f7b441d -> :sswitch_3
        -0x3b225ecd -> :sswitch_2
        0x16d6f7c2 -> :sswitch_1
        0x5012ab06 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private e(I)Lcom/facebook/react/bridge/WritableMap;
    .locals 14

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/uimanager/events/n;->a:Landroid/view/MotionEvent;

    invoke-virtual {v1, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    const-string v2, "pointerId"

    int-to-double v3, v1

    invoke-interface {v0, v2, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget-object v2, p0, Lcom/facebook/react/uimanager/events/n;->a:Landroid/view/MotionEvent;

    invoke-virtual {v2, p1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v2

    invoke-static {v2}, Lcom/facebook/react/uimanager/events/o;->e(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "pointerType"

    invoke-interface {v0, v3, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/n;->h()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/facebook/react/uimanager/events/n;->e:Lcom/facebook/react/uimanager/events/n$b;

    invoke-virtual {v3, v1}, Lcom/facebook/react/uimanager/events/n$b;->l(I)Z

    move-result v3

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/facebook/react/uimanager/events/n;->e:Lcom/facebook/react/uimanager/events/n$b;

    invoke-static {v3}, Lcom/facebook/react/uimanager/events/n$b;->a(Lcom/facebook/react/uimanager/events/n$b;)I

    move-result v3

    if-ne v1, v3, :cond_1

    :cond_0
    move v3, v4

    goto :goto_0

    :cond_1
    move v3, v5

    :goto_0
    const-string v6, "isPrimary"

    invoke-interface {v0, v6, v3}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    iget-object v3, p0, Lcom/facebook/react/uimanager/events/n;->e:Lcom/facebook/react/uimanager/events/n$b;

    invoke-virtual {v3}, Lcom/facebook/react/uimanager/events/n$b;->c()Ljava/util/Map;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    aget v6, v3, v5

    invoke-static {v6}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v6

    float-to-double v6, v6

    aget v3, v3, v4

    invoke-static {v3}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v3

    float-to-double v8, v3

    const-string v3, "clientX"

    invoke-interface {v0, v3, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v3, "clientY"

    invoke-interface {v0, v3, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget-object v3, p0, Lcom/facebook/react/uimanager/events/n;->e:Lcom/facebook/react/uimanager/events/n$b;

    invoke-virtual {v3}, Lcom/facebook/react/uimanager/events/n$b;->j()Ljava/util/Map;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v3, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [F

    aget v10, v3, v5

    invoke-static {v10}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v10

    float-to-double v10, v10

    aget v3, v3, v4

    invoke-static {v3}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v3

    float-to-double v12, v3

    const-string v3, "screenX"

    invoke-interface {v0, v3, v10, v11}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v3, "screenY"

    invoke-interface {v0, v3, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v3, "x"

    invoke-interface {v0, v3, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v3, "y"

    invoke-interface {v0, v3, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v3, "pageX"

    invoke-interface {v0, v3, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v3, "pageY"

    invoke-interface {v0, v3, v8, v9}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget-object v3, p0, Lcom/facebook/react/uimanager/events/n;->e:Lcom/facebook/react/uimanager/events/n$b;

    invoke-virtual {v3}, Lcom/facebook/react/uimanager/events/n$b;->h()Ljava/util/Map;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [F

    aget v3, v1, v5

    invoke-static {v3}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v3

    float-to-double v6, v3

    const-string v3, "offsetX"

    invoke-interface {v0, v3, v6, v7}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    aget v1, v1, v4

    invoke-static {v1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v1

    float-to-double v3, v1

    const-string v1, "offsetY"

    invoke-interface {v0, v1, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v1, "target"

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v3

    invoke-interface {v0, v1, v3}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getTimestampMs()J

    move-result-wide v3

    long-to-double v3, v3

    const-string v1, "timestamp"

    invoke-interface {v0, v1, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v1, "detail"

    invoke-interface {v0, v1, v5}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v1, "tiltX"

    const-wide/16 v3, 0x0

    invoke-interface {v0, v1, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v1, "tiltY"

    invoke-interface {v0, v1, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string v1, "twist"

    invoke-interface {v0, v1, v5}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    const-string v1, "mouse"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v5, "height"

    const-string v6, "width"

    if-nez v1, :cond_3

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/n;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lcom/facebook/react/uimanager/events/n;->a:Landroid/view/MotionEvent;

    invoke-virtual {v1, p1}, Landroid/view/MotionEvent;->getTouchMajor(I)F

    move-result p1

    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result p1

    float-to-double v7, p1

    :goto_1
    invoke-interface {v0, v6, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    invoke-interface {v0, v5, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    goto :goto_3

    :cond_3
    :goto_2
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    goto :goto_1

    :goto_3
    iget-object p1, p0, Lcom/facebook/react/uimanager/events/n;->a:Landroid/view/MotionEvent;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result p1

    iget-object v1, p0, Lcom/facebook/react/uimanager/events/n;->e:Lcom/facebook/react/uimanager/events/n$b;

    invoke-virtual {v1}, Lcom/facebook/react/uimanager/events/n$b;->g()I

    move-result v1

    invoke-static {v2, v1, p1}, Lcom/facebook/react/uimanager/events/o;->a(Ljava/lang/String;II)I

    move-result v1

    const-string v5, "button"

    invoke-interface {v0, v5, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/facebook/react/uimanager/events/n;->b:Ljava/lang/String;

    invoke-static {v1, v2, p1}, Lcom/facebook/react/uimanager/events/o;->b(Ljava/lang/String;Ljava/lang/String;I)I

    move-result p1

    const-string v1, "buttons"

    invoke-interface {v0, v1, p1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/n;->h()Z

    move-result p1

    if-eqz p1, :cond_4

    move-wide v1, v3

    goto :goto_4

    :cond_4
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result p1

    iget-object v1, p0, Lcom/facebook/react/uimanager/events/n;->b:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/facebook/react/uimanager/events/o;->d(ILjava/lang/String;)D

    move-result-wide v1

    :goto_4
    const-string p1, "pressure"

    invoke-interface {v0, p1, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    const-string p1, "tangentialPressure"

    invoke-interface {v0, p1, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    iget-object p1, p0, Lcom/facebook/react/uimanager/events/n;->a:Landroid/view/MotionEvent;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getMetaState()I

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/facebook/react/uimanager/events/n;->c(Lcom/facebook/react/bridge/WritableMap;I)V

    return-object v0
.end method

.method private f()Ljava/util/List;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/facebook/react/uimanager/events/n;->a:Landroid/view/MotionEvent;

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-direct {p0, v1}, Lcom/facebook/react/uimanager/events/n;->e(I)Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private g(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;S)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Lcom/facebook/react/uimanager/events/n$b;->k()I

    move-result v0

    invoke-virtual {p4}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v1

    invoke-super {p0, v0, p2, v1, v2}, Lcom/facebook/react/uimanager/events/d;->init(IIJ)V

    iput-object p1, p0, Lcom/facebook/react/uimanager/events/n;->b:Ljava/lang/String;

    invoke-static {p4}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/uimanager/events/n;->a:Landroid/view/MotionEvent;

    iput-short p5, p0, Lcom/facebook/react/uimanager/events/n;->c:S

    iput-object p3, p0, Lcom/facebook/react/uimanager/events/n;->e:Lcom/facebook/react/uimanager/events/n$b;

    return-void
.end method

.method private h()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n;->b:Ljava/lang/String;

    const-string v1, "topClick"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static i(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/n;
    .locals 7

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/events/n;->h:Landroidx/core/util/e;

    invoke-virtual {v0}, Landroidx/core/util/e;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/events/n;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/react/uimanager/events/n;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/events/n;-><init>()V

    :cond_0
    invoke-static {p3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    move-object v5, p3

    check-cast v5, Landroid/view/MotionEvent;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lcom/facebook/react/uimanager/events/n;->g(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;S)V

    return-object v0
.end method

.method public static j(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;S)Lcom/facebook/react/uimanager/events/n;
    .locals 7

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/events/n;->h:Landroidx/core/util/e;

    invoke-virtual {v0}, Landroidx/core/util/e;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/events/n;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/react/uimanager/events/n;

    invoke-direct {v0}, Lcom/facebook/react/uimanager/events/n;-><init>()V

    :cond_0
    invoke-static {p3}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    move-object v5, p3

    check-cast v5, Landroid/view/MotionEvent;

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/facebook/react/uimanager/events/n;->g(Ljava/lang/String;ILcom/facebook/react/uimanager/events/n$b;Landroid/view/MotionEvent;S)V

    return-object v0
.end method


# virtual methods
.method public dispatch(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .locals 5

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n;->a:Landroid/view/MotionEvent;

    if-nez v0, :cond_0

    sget-object p1, Lcom/facebook/react/uimanager/events/n;->g:Ljava/lang/String;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n;->d:Ljava/util/List;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/n;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/n;->d:Ljava/util/List;

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n;->d:Ljava/util/List;

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/react/bridge/WritableMap;

    if-eqz v1, :cond_4

    invoke-interface {v2}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v2

    :cond_4
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v3

    iget-object v4, p0, Lcom/facebook/react/uimanager/events/n;->b:Ljava/lang/String;

    invoke-interface {p1, v3, v4, v2}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    goto :goto_1

    :cond_5
    return-void
.end method

.method public dispatchModern(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V
    .locals 13

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n;->a:Landroid/view/MotionEvent;

    if-nez v0, :cond_0

    sget-object p1, Lcom/facebook/react/uimanager/events/n;->g:Ljava/lang/String;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n;->d:Ljava/util/List;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/n;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/n;->d:Ljava/util/List;

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n;->d:Ljava/util/List;

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-le v0, v2, :cond_3

    move v0, v2

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    iget-object v3, p0, Lcom/facebook/react/uimanager/events/n;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/react/bridge/WritableMap;

    if-eqz v0, :cond_4

    invoke-interface {v4}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    move-result-object v4

    :cond_4
    move-object v11, v4

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getSurfaceId()I

    move-result v6

    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getViewTag()I

    move-result v7

    iget-object v8, p0, Lcom/facebook/react/uimanager/events/n;->b:Ljava/lang/String;

    iget-short v10, p0, Lcom/facebook/react/uimanager/events/n;->c:S

    const/4 v4, -0x1

    if-eq v10, v4, :cond_5

    move v9, v2

    goto :goto_2

    :cond_5
    move v9, v1

    :goto_2
    invoke-static {v8}, Lcom/facebook/react/uimanager/events/o;->c(Ljava/lang/String;)I

    move-result v12

    move-object v5, p1

    invoke-interface/range {v5 .. v12}, Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;->receiveEvent(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V

    goto :goto_1

    :cond_6
    return-void
.end method

.method public getCoalescingKey()S
    .locals 1

    iget-short v0, p0, Lcom/facebook/react/uimanager/events/n;->c:S

    return v0
.end method

.method public getEventAnimationDriverMatchSpec()Lcom/facebook/react/uimanager/events/d$b;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n;->f:Lcom/facebook/react/uimanager/events/d$b;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/react/uimanager/events/n$a;

    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/events/n$a;-><init>(Lcom/facebook/react/uimanager/events/n;)V

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/n;->f:Lcom/facebook/react/uimanager/events/d$b;

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n;->f:Lcom/facebook/react/uimanager/events/d$b;

    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/uimanager/events/n;->b:Ljava/lang/String;

    return-object v0
.end method

.method public onDispose()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/n;->d:Ljava/util/List;

    iget-object v1, p0, Lcom/facebook/react/uimanager/events/n;->a:Landroid/view/MotionEvent;

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/n;->a:Landroid/view/MotionEvent;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    :cond_0
    :try_start_0
    sget-object v0, Lcom/facebook/react/uimanager/events/n;->h:Landroidx/core/util/e;

    invoke-virtual {v0, p0}, Landroidx/core/util/e;->a(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/facebook/react/uimanager/events/n;->g:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
