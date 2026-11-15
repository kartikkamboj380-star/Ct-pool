.class public final Lcom/facebook/react/views/scroll/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/scroll/f$a;,
        Lcom/facebook/react/views/scroll/f$b;,
        Lcom/facebook/react/views/scroll/f$c;,
        Lcom/facebook/react/views/scroll/f$d;,
        Lcom/facebook/react/views/scroll/f$e;,
        Lcom/facebook/react/views/scroll/f$f;,
        Lcom/facebook/react/views/scroll/f$g;
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/react/views/scroll/f;

.field private static final b:Ljava/lang/String;

.field private static final c:Z

.field private static final d:Ljava/util/Set;

.field private static e:I

.field private static f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/react/views/scroll/f;

    invoke-direct {v0}, Lcom/facebook/react/views/scroll/f;-><init>()V

    sput-object v0, Lcom/facebook/react/views/scroll/f;->a:Lcom/facebook/react/views/scroll/f;

    const-class v0, Lcom/facebook/react/views/scroll/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/views/scroll/f;->b:Ljava/lang/String;

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/views/scroll/f;->d:Ljava/util/Set;

    const/16 v0, 0xfa

    sput v0, Lcom/facebook/react/views/scroll/f;->e:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "scrollView"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lcom/facebook/react/views/scroll/f;->d:Ljava/util/Set;

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final b(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/f;->a:Lcom/facebook/react/views/scroll/f;

    sget-object v1, Lcom/facebook/react/views/scroll/h;->n:Lcom/facebook/react/views/scroll/h;

    invoke-direct {v0, p0, v1}, Lcom/facebook/react/views/scroll/f;->d(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/h;)V

    return-void
.end method

.method public static final c(Landroid/view/ViewGroup;FF)V
    .locals 8

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/f;->a:Lcom/facebook/react/views/scroll/f;

    sget-object v2, Lcom/facebook/react/views/scroll/h;->o:Lcom/facebook/react/views/scroll/h;

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move v3, p1

    move v4, p2

    invoke-static/range {v0 .. v7}, Lcom/facebook/react/views/scroll/f;->f(Lcom/facebook/react/views/scroll/f;Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/h;FFZILjava/lang/Object;)V

    return-void
.end method

.method private final d(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/h;)V
    .locals 8

    .line 1
    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v7}, Lcom/facebook/react/views/scroll/f;->f(Lcom/facebook/react/views/scroll/f;Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/h;FFZILjava/lang/Object;)V

    return-void
.end method

.method private final e(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/h;FFZ)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    move-object v3, v0

    check-cast v3, Lcom/facebook/react/views/scroll/f$b;

    invoke-interface {v3}, Lcom/facebook/react/views/scroll/f$b;->getScrollEventThrottle()I

    move-result v4

    int-to-long v4, v4

    invoke-interface {v3}, Lcom/facebook/react/views/scroll/f$b;->getLastScrollDispatchTime()J

    move-result-wide v6

    sub-long v6, v1, v6

    const-wide/16 v8, 0x11

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    cmp-long v3, v4, v6

    if-ltz v3, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_1

    return-void

    :cond_1
    sget-object v4, Lcom/facebook/react/views/scroll/f;->d:Ljava/util/Set;

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    invoke-static {v4, v5}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/facebook/react/bridge/ReactContext;

    invoke-static {v4}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result v6

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getId()I

    move-result v5

    invoke-static {v4, v5}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object v4

    if-eqz v4, :cond_2

    sget-object v5, Lcom/facebook/react/views/scroll/g;->k:Lcom/facebook/react/views/scroll/g$a;

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getId()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getScrollX()I

    move-result v8

    int-to-float v9, v8

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getScrollY()I

    move-result v8

    int-to-float v10, v8

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v13

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getWidth()I

    move-result v15

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getHeight()I

    move-result v16

    move-object/from16 v8, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move/from16 v17, p5

    invoke-virtual/range {v5 .. v17}, Lcom/facebook/react/views/scroll/g$a;->a(IILcom/facebook/react/views/scroll/h;FFFFIIIIZ)Lcom/facebook/react/views/scroll/g;

    move-result-object v3

    invoke-interface {v4, v3}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    check-cast v0, Lcom/facebook/react/views/scroll/f$b;

    invoke-interface {v0, v1, v2}, Lcom/facebook/react/views/scroll/f$b;->setLastScrollDispatchTime(J)V

    :cond_2
    return-void

    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Landroidx/appcompat/app/y;->a(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0
.end method

.method static synthetic f(Lcom/facebook/react/views/scroll/f;Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/h;FFZILjava/lang/Object;)V
    .locals 6

    .line 1
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/views/scroll/f;->e(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/h;FFZ)V

    return-void
.end method

.method public static final g(Landroid/view/ViewGroup;II)V
    .locals 8

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/f;->a:Lcom/facebook/react/views/scroll/f;

    sget-object v2, Lcom/facebook/react/views/scroll/h;->q:Lcom/facebook/react/views/scroll/h;

    int-to-float v3, p1

    int-to-float v4, p2

    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lcom/facebook/react/views/scroll/f;->f(Lcom/facebook/react/views/scroll/f;Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/h;FFZILjava/lang/Object;)V

    return-void
.end method

.method public static final h(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/f;->a:Lcom/facebook/react/views/scroll/f;

    sget-object v1, Lcom/facebook/react/views/scroll/h;->r:Lcom/facebook/react/views/scroll/h;

    invoke-direct {v0, p0, v1}, Lcom/facebook/react/views/scroll/f;->d(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/h;)V

    return-void
.end method

.method public static final i(Landroid/view/ViewGroup;)V
    .locals 11

    .line 1
    move-object v0, p0

    check-cast v0, Lcom/facebook/react/views/scroll/f$c;

    invoke-interface {v0}, Lcom/facebook/react/views/scroll/f$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/f$g;->e()I

    move-result v1

    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/f$g;->c()Landroid/graphics/Point;

    move-result-object v2

    iget v3, v2, Landroid/graphics/Point;->x:I

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/f$g;->d()I

    move-result v0

    const/4 v4, 0x1

    if-ne v0, v4, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v0

    :cond_0
    sub-int/2addr v0, v3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    sub-int/2addr v0, v4

    neg-int v0, v0

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    sget-boolean v4, Lcom/facebook/react/views/scroll/f;->c:Z

    if-eqz v4, :cond_2

    sget-object v5, Lcom/facebook/react/views/scroll/f;->b:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const-string v6, "updateFabricScrollState[%d] scrollX %d scrollY %d fabricScrollX"

    invoke-static/range {v5 .. v10}, LP0/a;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    check-cast p0, Lcom/facebook/react/views/scroll/f$e;

    invoke-interface {p0}, Lcom/facebook/react/views/scroll/f$e;->getStateWrapper()Lcom/facebook/react/uimanager/d0;

    move-result-object p0

    if-eqz p0, :cond_3

    new-instance v0, Lcom/facebook/react/bridge/WritableNativeMap;

    invoke-direct {v0}, Lcom/facebook/react/bridge/WritableNativeMap;-><init>()V

    int-to-float v3, v3

    invoke-static {v3}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v3

    float-to-double v3, v3

    const-string v5, "contentOffsetLeft"

    invoke-interface {v0, v5, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    int-to-float v2, v2

    invoke-static {v2}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v2

    float-to-double v2, v2

    const-string v4, "contentOffsetTop"

    invoke-interface {v0, v4, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    int-to-float v1, v1

    invoke-static {v1}, Lcom/facebook/react/uimanager/G;->b(F)F

    move-result v1

    float-to-double v1, v1

    const-string v3, "scrollAwayPaddingTop"

    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    invoke-interface {p0, v0}, Lcom/facebook/react/uimanager/d0;->a(Lcom/facebook/react/bridge/WritableMap;)V

    :cond_3
    return-void
.end method

.method public static final j(Landroid/content/Context;)I
    .locals 1

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/f;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/react/views/scroll/f;->f:Z

    :try_start_0
    new-instance v0, Lcom/facebook/react/views/scroll/f$f;

    invoke-direct {v0, p0}, Lcom/facebook/react/views/scroll/f$f;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/f$f;->a()I

    move-result p0

    sput p0, Lcom/facebook/react/views/scroll/f;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    sget p0, Lcom/facebook/react/views/scroll/f;->e:I

    return p0
.end method

.method public static final k(Landroid/view/ViewGroup;III)I
    .locals 2

    .line 1
    check-cast p0, Lcom/facebook/react/views/scroll/f$c;

    invoke-interface {p0}, Lcom/facebook/react/views/scroll/f$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result v1

    div-int/2addr p3, v1

    goto :goto_0

    :cond_0
    move p3, v0

    :goto_0
    sub-int v1, p2, p1

    mul-int/2addr p3, v1

    if-lez p3, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/f$g;->g()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/f$g;->f()Z

    move-result p0

    if-eqz p0, :cond_3

    if-eqz v0, :cond_3

    :cond_2
    move p1, p2

    :cond_3
    return p1
.end method

.method public static final l(Ljava/lang/String;)I
    .locals 3

    .line 1
    const/4 v0, 0x1

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const v2, -0x54506df1

    if-eq v1, v2, :cond_3

    const v2, 0x2dddaf

    if-eq v1, v2, :cond_2

    const v2, 0x63dca8c

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "never"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    goto :goto_1

    :cond_2
    const-string v1, "auto"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_3
    const-string v1, "always"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "wrong overScrollMode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "ReactNative"

    invoke-static {v1, p0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :cond_6
    :goto_1
    return v0
.end method

.method public static final m(Ljava/lang/String;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "start"

    const/4 v2, 0x1

    invoke-static {v1, p0, v2}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    const-string v1, "center"

    invoke-static {v1, p0, v2}, LF5/g;->p(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v0, 0x2

    goto :goto_0

    :cond_2
    const-string v1, "end"

    invoke-static {v1, p0}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v0, 0x3

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "wrong snap alignment value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "ReactNative"

    invoke-static {v1, p0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return v0
.end method

.method public static final n(Landroid/view/ViewGroup;IIII)Landroid/graphics/Point;
    .locals 14

    .line 1
    move-object v0, p0

    move-object v1, v0

    check-cast v1, Lcom/facebook/react/views/scroll/f$c;

    invoke-interface {v1}, Lcom/facebook/react/views/scroll/f$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object v1

    new-instance v13, Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v13, v2}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/facebook/react/views/scroll/f$g;->a()F

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v3, v2

    invoke-virtual {v13, v3}, Landroid/widget/OverScroller;->setFriction(F)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-static {p0}, Landroidx/core/view/H;->G(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {p0}, Landroidx/core/view/H;->F(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v1}, Lcom/facebook/react/views/scroll/f$g;->b()Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v4

    iget v5, v1, Landroid/graphics/Point;->x:I

    move v6, p1

    invoke-static {p0, v4, v5, p1}, Lcom/facebook/react/views/scroll/f;->k(Landroid/view/ViewGroup;III)I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v5

    iget v1, v1, Landroid/graphics/Point;->y:I

    move/from16 v7, p2

    invoke-static {p0, v5, v1, v7}, Lcom/facebook/react/views/scroll/f;->k(Landroid/view/ViewGroup;III)I

    move-result v0

    div-int/lit8 v11, v2, 0x2

    div-int/lit8 v12, v3, 0x2

    const/4 v1, 0x0

    const/4 v9, 0x0

    move-object v2, v13

    move v3, v4

    move v4, v0

    move v5, p1

    move/from16 v6, p2

    move v7, v1

    move/from16 v8, p3

    move/from16 v10, p4

    invoke-virtual/range {v2 .. v12}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    new-instance v0, Landroid/graphics/Point;

    invoke-virtual {v13}, Landroid/widget/OverScroller;->getFinalX()I

    move-result v1

    invoke-virtual {v13}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    return-object v0
.end method

.method public static final p(Landroid/view/ViewGroup;II)V
    .locals 5

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/f;->c:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/react/views/scroll/f;->b:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "smoothScrollTo[%d] x %d y %d"

    invoke-static {v0, v4, v1, v2, v3}, LP0/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    move-object v0, p0

    check-cast v0, Lcom/facebook/react/views/scroll/f$a;

    invoke-interface {v0}, Lcom/facebook/react/views/scroll/f$a;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/Animator;->getListeners()Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/animation/Animator;->getListeners()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    sget-object v0, Lcom/facebook/react/views/scroll/f;->a:Lcom/facebook/react/views/scroll/f;

    invoke-virtual {v0, p0}, Lcom/facebook/react/views/scroll/f;->o(Landroid/view/ViewGroup;)V

    :cond_2
    move-object v0, p0

    check-cast v0, Lcom/facebook/react/views/scroll/f$c;

    invoke-interface {v0}, Lcom/facebook/react/views/scroll/f$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/views/scroll/f$g;->j(II)Lcom/facebook/react/views/scroll/f$g;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    if-eq v0, p1, :cond_3

    move-object v2, p0

    check-cast v2, Lcom/facebook/react/views/scroll/f$a;

    invoke-interface {v2, v0, p1}, Lcom/facebook/react/views/scroll/f$a;->a(II)V

    :cond_3
    if-eq v1, p2, :cond_4

    move-object v0, p0

    check-cast v0, Lcom/facebook/react/views/scroll/f$a;

    invoke-interface {v0, v1, p2}, Lcom/facebook/react/views/scroll/f$a;->a(II)V

    :cond_4
    sget-object v0, Lcom/facebook/react/views/scroll/f;->a:Lcom/facebook/react/views/scroll/f;

    invoke-virtual {v0, p0, p1, p2}, Lcom/facebook/react/views/scroll/f;->r(Landroid/view/ViewGroup;II)V

    return-void
.end method

.method public static final q(Landroid/view/ViewGroup;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/facebook/react/views/scroll/f;->a:Lcom/facebook/react/views/scroll/f;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    invoke-virtual {v0, p0, v1, v2}, Lcom/facebook/react/views/scroll/f;->r(Landroid/view/ViewGroup;II)V

    return-void
.end method

.method public static final s(Landroid/view/ViewGroup;FFZ)V
    .locals 6

    .line 1
    invoke-static {p0}, Lcom/facebook/react/views/scroll/f;->q(Landroid/view/ViewGroup;)V

    sget-object v0, Lcom/facebook/react/views/scroll/f;->a:Lcom/facebook/react/views/scroll/f;

    sget-object v2, Lcom/facebook/react/views/scroll/h;->p:Lcom/facebook/react/views/scroll/h;

    move-object v1, p0

    move v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/facebook/react/views/scroll/f;->e(Landroid/view/ViewGroup;Lcom/facebook/react/views/scroll/h;FFZ)V

    return-void
.end method


# virtual methods
.method public final o(Landroid/view/ViewGroup;)V
    .locals 2

    .line 1
    move-object v0, p1

    check-cast v0, Lcom/facebook/react/views/scroll/f$a;

    invoke-interface {v0}, Lcom/facebook/react/views/scroll/f$a;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object v0

    new-instance v1, Lcom/facebook/react/views/scroll/f$h;

    invoke-direct {v1, p1}, Lcom/facebook/react/views/scroll/f$h;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method public final r(Landroid/view/ViewGroup;II)V
    .locals 5

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/f;->c:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/react/views/scroll/f;->b:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "updateFabricScrollState[%d] scrollX %d scrollY %d"

    invoke-static {v0, v4, v1, v2, v3}, LP0/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0}, Ly2/a;->a(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    return-void

    :cond_1
    move-object v0, p1

    check-cast v0, Lcom/facebook/react/views/scroll/f$c;

    invoke-interface {v0}, Lcom/facebook/react/views/scroll/f$c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/f$g;->c()Landroid/graphics/Point;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Landroid/graphics/Point;->equals(II)Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    :cond_2
    invoke-virtual {v0, p2, p3}, Lcom/facebook/react/views/scroll/f$g;->l(II)Lcom/facebook/react/views/scroll/f$g;

    invoke-static {p1}, Lcom/facebook/react/views/scroll/f;->i(Landroid/view/ViewGroup;)V

    return-void
.end method
