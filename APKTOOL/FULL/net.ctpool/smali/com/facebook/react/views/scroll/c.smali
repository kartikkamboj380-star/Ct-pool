.class public Lcom/facebook/react/views/scroll/c;
.super Landroid/widget/ScrollView;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/uimanager/K;
.implements Landroid/view/ViewGroup$OnHierarchyChangeListener;
.implements Landroid/view/View$OnLayoutChangeListener;
.implements Lcom/facebook/react/uimanager/P;
.implements Lcom/facebook/react/views/scroll/f$c;
.implements Lcom/facebook/react/views/scroll/f$e;
.implements Lcom/facebook/react/views/scroll/f$a;
.implements Lcom/facebook/react/views/scroll/f$b;
.implements Lcom/facebook/react/views/scroll/f$d;


# static fields
.field private static a0:Ljava/lang/reflect/Field; = null

.field private static b0:Z = false


# instance fields
.field private A:Z

.field private B:Ljava/lang/String;

.field private C:Z

.field private D:Landroid/graphics/drawable/Drawable;

.field private E:I

.field private F:Z

.field private G:I

.field private H:Ljava/util/List;

.field private I:Z

.field private J:Z

.field private K:I

.field private L:Landroid/view/View;

.field private M:Lcom/facebook/react/views/view/g;

.field private N:Lcom/facebook/react/bridge/ReadableMap;

.field private O:I

.field private P:I

.field private Q:Lcom/facebook/react/uimanager/d0;

.field private final R:Lcom/facebook/react/views/scroll/f$g;

.field private final S:Landroid/animation/ValueAnimator;

.field private T:Lcom/facebook/react/uimanager/H;

.field private U:J

.field private V:I

.field private W:Lcom/facebook/react/views/scroll/a;

.field private final m:LK2/b;

.field private final n:Landroid/widget/OverScroller;

.field private final o:Lcom/facebook/react/views/scroll/i;

.field private final p:Landroid/graphics/Rect;

.field private final q:Landroid/graphics/Rect;

.field private r:Z

.field private s:Landroid/graphics/Rect;

.field private t:Ljava/lang/String;

.field private u:Z

.field private v:Z

.field private w:Ljava/lang/Runnable;

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LK2/a;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, LK2/b;

    .line 5
    .line 6
    invoke-direct {p1}, LK2/b;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->m:LK2/b;

    .line 10
    .line 11
    new-instance p1, Lcom/facebook/react/views/scroll/i;

    .line 12
    .line 13
    invoke-direct {p1}, Lcom/facebook/react/views/scroll/i;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->o:Lcom/facebook/react/views/scroll/i;

    .line 17
    .line 18
    new-instance p1, Landroid/graphics/Rect;

    .line 19
    .line 20
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->p:Landroid/graphics/Rect;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->q:Landroid/graphics/Rect;

    .line 31
    .line 32
    const-string p1, "hidden"

    .line 33
    .line 34
    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->t:Ljava/lang/String;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->v:Z

    .line 38
    .line 39
    const/4 p2, 0x1

    .line 40
    iput-boolean p2, p0, Lcom/facebook/react/views/scroll/c;->y:Z

    .line 41
    .line 42
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->z:Z

    .line 43
    .line 44
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->C:Z

    .line 45
    .line 46
    iput p1, p0, Lcom/facebook/react/views/scroll/c;->E:I

    .line 47
    .line 48
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->F:Z

    .line 49
    .line 50
    iput p1, p0, Lcom/facebook/react/views/scroll/c;->G:I

    .line 51
    .line 52
    iput-boolean p2, p0, Lcom/facebook/react/views/scroll/c;->I:Z

    .line 53
    .line 54
    iput-boolean p2, p0, Lcom/facebook/react/views/scroll/c;->J:Z

    .line 55
    .line 56
    iput p1, p0, Lcom/facebook/react/views/scroll/c;->K:I

    .line 57
    .line 58
    const/4 p2, 0x0

    .line 59
    iput-object p2, p0, Lcom/facebook/react/views/scroll/c;->N:Lcom/facebook/react/bridge/ReadableMap;

    .line 60
    .line 61
    const/4 v0, -0x1

    .line 62
    iput v0, p0, Lcom/facebook/react/views/scroll/c;->O:I

    .line 63
    .line 64
    iput v0, p0, Lcom/facebook/react/views/scroll/c;->P:I

    .line 65
    .line 66
    iput-object p2, p0, Lcom/facebook/react/views/scroll/c;->Q:Lcom/facebook/react/uimanager/d0;

    .line 67
    .line 68
    new-instance v0, Lcom/facebook/react/views/scroll/f$g;

    .line 69
    .line 70
    invoke-direct {v0, p1}, Lcom/facebook/react/views/scroll/f$g;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, Lcom/facebook/react/views/scroll/c;->R:Lcom/facebook/react/views/scroll/f$g;

    .line 74
    .line 75
    const-string v0, "scrollY"

    .line 76
    .line 77
    filled-new-array {p1, p1}, [I

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, Lcom/facebook/react/views/scroll/c;->S:Landroid/animation/ValueAnimator;

    .line 86
    .line 87
    sget-object v0, Lcom/facebook/react/uimanager/H;->q:Lcom/facebook/react/uimanager/H;

    .line 88
    .line 89
    iput-object v0, p0, Lcom/facebook/react/views/scroll/c;->T:Lcom/facebook/react/uimanager/H;

    .line 90
    .line 91
    const-wide/16 v0, 0x0

    .line 92
    .line 93
    iput-wide v0, p0, Lcom/facebook/react/views/scroll/c;->U:J

    .line 94
    .line 95
    iput p1, p0, Lcom/facebook/react/views/scroll/c;->V:I

    .line 96
    .line 97
    iput-object p2, p0, Lcom/facebook/react/views/scroll/c;->W:Lcom/facebook/react/views/scroll/a;

    .line 98
    .line 99
    new-instance p2, Lcom/facebook/react/views/view/g;

    .line 100
    .line 101
    invoke-direct {p2, p0}, Lcom/facebook/react/views/view/g;-><init>(Landroid/view/View;)V

    .line 102
    .line 103
    .line 104
    iput-object p2, p0, Lcom/facebook/react/views/scroll/c;->M:Lcom/facebook/react/views/view/g;

    .line 105
    .line 106
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->getOverScrollerFromParent()Landroid/widget/OverScroller;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    iput-object p2, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    .line 111
    .line 112
    invoke-virtual {p0, p0}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 113
    .line 114
    .line 115
    const/high16 p2, 0x2000000

    .line 116
    .line 117
    invoke-virtual {p0, p2}, Landroid/view/View;->setScrollBarStyle(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Lcom/facebook/react/views/scroll/c;->M:Lcom/facebook/react/views/view/g;

    .line 124
    .line 125
    const-string p2, "scroll"

    .line 126
    .line 127
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/view/g;->k(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    new-instance p1, Lcom/facebook/react/views/scroll/d;

    .line 131
    .line 132
    invoke-direct {p1}, Lcom/facebook/react/views/scroll/d;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-static {p0, p1}, Landroidx/core/view/H;->p0(Landroid/view/View;Landroidx/core/view/a;)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method private A(I)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/c;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/c;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/OverScroller;->forceFinished(Z)V

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getStartY()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v1

    mul-float/2addr v1, v0

    iget-object v2, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v3

    float-to-int v6, v1

    const/4 v9, 0x0

    const v10, 0x7fffffff

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v4, p1

    invoke-virtual/range {v2 .. v10}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v2

    sub-int/2addr v2, v0

    add-int/2addr p1, v2

    invoke-virtual {p0, v1, p1}, Lcom/facebook/react/views/scroll/c;->scrollTo(II)V

    :cond_2
    :goto_0
    return-void
.end method

.method private B(Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {p0, v0}, Landroid/widget/ScrollView;->computeScrollDeltaToGetChildRectOnScreen(Landroid/graphics/Rect;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->scrollBy(II)V

    :cond_0
    return-void
.end method

.method private F(II)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, -0x1

    iput p1, p0, Lcom/facebook/react/views/scroll/c;->O:I

    iput p1, p0, Lcom/facebook/react/views/scroll/c;->P:I

    goto :goto_0

    :cond_0
    iput p1, p0, Lcom/facebook/react/views/scroll/c;->O:I

    iput p2, p0, Lcom/facebook/react/views/scroll/c;->P:I

    :goto_0
    return-void
.end method

.method private G(I)V
    .locals 11

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->getSnapInterval()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/react/views/scroll/f$g;->b()Landroid/graphics/Point;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Point;->y:I

    invoke-static {p0, v2, v3, p1}, Lcom/facebook/react/views/scroll/f;->k(Landroid/view/ViewGroup;III)I

    move-result v2

    int-to-double v2, v2

    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/c;->z(I)I

    move-result v4

    int-to-double v4, v4

    div-double v6, v2, v0

    invoke-static {v6, v7}, Ljava/lang/Math;->floor(D)D

    move-result-wide v8

    double-to-int v8, v8

    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    double-to-int v9, v9

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide v6

    long-to-int v6, v6

    div-double/2addr v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-int v4, v4

    if-lez p1, :cond_0

    if-ne v9, v8, :cond_0

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_0
    if-gez p1, :cond_1

    if-ne v8, v9, :cond_1

    add-int/lit8 v8, v8, -0x1

    :cond_1
    :goto_0
    if-lez p1, :cond_2

    if-ge v6, v9, :cond_2

    if-le v4, v8, :cond_2

    move v6, v9

    goto :goto_1

    :cond_2
    if-gez p1, :cond_3

    if-le v6, v8, :cond_3

    if-ge v4, v9, :cond_3

    move v6, v8

    :cond_3
    :goto_1
    int-to-double v4, v6

    mul-double/2addr v4, v0

    cmpl-double p1, v4, v2

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->r:Z

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p1

    double-to-int v0, v4

    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/views/scroll/c;->c(II)V

    :cond_4
    return-void
.end method

.method private H(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/f$g;->m(I)V

    invoke-static {p0}, Lcom/facebook/react/views/scroll/f;->i(Landroid/view/ViewGroup;)V

    return-void
.end method

.method static bridge synthetic d(Lcom/facebook/react/views/scroll/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/views/scroll/c;->r:Z

    return p0
.end method

.method static bridge synthetic e(Lcom/facebook/react/views/scroll/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/views/scroll/c;->v:Z

    return p0
.end method

.method static bridge synthetic f(Lcom/facebook/react/views/scroll/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/views/scroll/c;->A:Z

    return p0
.end method

.method static bridge synthetic g(Lcom/facebook/react/views/scroll/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->r:Z

    return-void
.end method

.method private getContentView()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private getMaxScrollY()I
    .locals 4

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->L:Landroid/view/View;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method private getOverScrollerFromParent()Landroid/widget/OverScroller;
    .locals 4

    sget-boolean v0, Lcom/facebook/react/views/scroll/c;->b0:Z

    const-string v1, "ReactNative"

    if-nez v0, :cond_0

    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/react/views/scroll/c;->b0:Z

    :try_start_0
    const-class v2, Landroid/widget/ScrollView;

    const-string v3, "mScroller"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    sput-object v2, Lcom/facebook/react/views/scroll/c;->a0:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :("

    invoke-static {v1, v0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    sget-object v0, Lcom/facebook/react/views/scroll/c;->a0:Ljava/lang/reflect/Field;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    :try_start_1
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Landroid/widget/OverScroller;

    if-eqz v3, :cond_1

    move-object v2, v0

    check-cast v2, Landroid/widget/OverScroller;

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_1

    :cond_1
    const-string v0, "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :("

    invoke-static {v1, v0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :goto_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Failed to get mScroller from ScrollView!"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    :goto_2
    return-object v2
.end method

.method private getSnapInterval()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/scroll/c;->G:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    return v0
.end method

.method static bridge synthetic h(Lcom/facebook/react/views/scroll/c;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->w:Ljava/lang/Runnable;

    return-void
.end method

.method static bridge synthetic i(Lcom/facebook/react/views/scroll/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->n()V

    return-void
.end method

.method static bridge synthetic j(Lcom/facebook/react/views/scroll/c;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/c;->q(I)V

    return-void
.end method

.method private l()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->w:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/views/scroll/c;->w:Ljava/lang/Runnable;

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/c;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    return-void
.end method

.method private m(I)I
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-eq v0, v1, :cond_0

    return p1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->m:LK2/b;

    invoke-virtual {v0}, LK2/b;->b()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-nez v1, :cond_1

    int-to-float v0, p1

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    :cond_1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    mul-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method private n()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->y()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/react/views/scroll/c;->B:Ljava/lang/String;

    invoke-static {v1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
.end method

.method private o()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->y()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/react/views/scroll/c;->B:Ljava/lang/String;

    invoke-static {v1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
.end method

.method private q(I)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-gtz v1, :cond_0

    return-void

    :cond_0
    iget v1, v0, Lcom/facebook/react/views/scroll/c;->G:I

    if-nez v1, :cond_1

    iget-object v1, v0, Lcom/facebook/react/views/scroll/c;->H:Ljava/util/List;

    if-nez v1, :cond_1

    iget v1, v0, Lcom/facebook/react/views/scroll/c;->K:I

    if-nez v1, :cond_1

    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/views/scroll/c;->G(I)V

    return-void

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/views/scroll/c;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object v1

    iget-object v2, v0, Lcom/facebook/react/views/scroll/c;->S:Landroid/animation/ValueAnimator;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_2

    move v1, v3

    goto :goto_0

    :cond_2
    move v1, v4

    :goto_0
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/views/scroll/c;->getMaxScrollY()I

    move-result v2

    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/views/scroll/c;->z(I)I

    move-result v5

    iget-boolean v6, v0, Lcom/facebook/react/views/scroll/c;->F:Z

    if-eqz v6, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v5

    :cond_3
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    sub-int/2addr v6, v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    sub-int/2addr v6, v7

    iget-object v7, v0, Lcom/facebook/react/views/scroll/c;->H:Ljava/util/List;

    const/4 v8, 0x2

    if-eqz v7, :cond_6

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v9, v0, Lcom/facebook/react/views/scroll/c;->H:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    sub-int/2addr v10, v3

    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    move v12, v2

    move v10, v4

    move v11, v10

    :goto_1
    iget-object v13, v0, Lcom/facebook/react/views/scroll/c;->H:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    if-ge v10, v13, :cond_f

    iget-object v13, v0, Lcom/facebook/react/views/scroll/c;->H:Ljava/util/List;

    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    if-gt v13, v5, :cond_4

    sub-int v14, v5, v13

    sub-int v15, v5, v11

    if-ge v14, v15, :cond_4

    move v11, v13

    :cond_4
    if-lt v13, v5, :cond_5

    sub-int v14, v13, v5

    sub-int v15, v12, v5

    if-ge v14, v15, :cond_5

    move v12, v13

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_6
    iget v7, v0, Lcom/facebook/react/views/scroll/c;->K:I

    if-eqz v7, :cond_e

    iget v9, v0, Lcom/facebook/react/views/scroll/c;->G:I

    if-lez v9, :cond_7

    int-to-double v10, v5

    int-to-double v12, v9

    div-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    move-result-wide v12

    iget v9, v0, Lcom/facebook/react/views/scroll/c;->G:I

    int-to-double v14, v9

    mul-double/2addr v12, v14

    double-to-int v12, v12

    invoke-direct {v0, v7, v12, v9, v6}, Lcom/facebook/react/views/scroll/c;->s(IIII)I

    move-result v7

    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    move-result v7

    iget v9, v0, Lcom/facebook/react/views/scroll/c;->K:I

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    iget v12, v0, Lcom/facebook/react/views/scroll/c;->G:I

    int-to-double v13, v12

    mul-double/2addr v10, v13

    double-to-int v10, v10

    invoke-direct {v0, v9, v10, v12, v6}, Lcom/facebook/react/views/scroll/c;->s(IIII)I

    move-result v9

    invoke-static {v9, v2}, Ljava/lang/Math;->min(II)I

    move-result v12

    move v9, v2

    move v11, v7

    :goto_2
    move v7, v4

    goto/16 :goto_6

    :cond_7
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/views/scroll/c;->getContentView()Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/view/ViewGroup;

    move v11, v2

    move v12, v11

    move v9, v4

    move v10, v9

    move v13, v10

    :goto_3
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v14

    if-ge v9, v14, :cond_d

    invoke-virtual {v7, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    iget v15, v0, Lcom/facebook/react/views/scroll/c;->K:I

    if-eq v15, v3, :cond_a

    if-eq v15, v8, :cond_9

    const/4 v3, 0x3

    if-ne v15, v3, :cond_8

    invoke-virtual {v14}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v14}, Landroid/view/View;->getHeight()I

    move-result v14

    sub-int v14, v6, v14

    :goto_4
    sub-int/2addr v3, v14

    goto :goto_5

    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid SnapToAlignment value: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/facebook/react/views/scroll/c;->K:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    invoke-virtual {v14}, Landroid/view/View;->getTop()I

    move-result v3

    invoke-virtual {v14}, Landroid/view/View;->getHeight()I

    move-result v14

    sub-int v14, v6, v14

    div-int/2addr v14, v8

    goto :goto_4

    :cond_a
    invoke-virtual {v14}, Landroid/view/View;->getTop()I

    move-result v3

    :goto_5
    if-gt v3, v5, :cond_b

    sub-int v14, v5, v3

    sub-int v15, v5, v10

    if-ge v14, v15, :cond_b

    move v10, v3

    :cond_b
    if-lt v3, v5, :cond_c

    sub-int v14, v3, v5

    sub-int v15, v12, v5

    if-ge v14, v15, :cond_c

    move v12, v3

    :cond_c
    invoke-static {v11, v3}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-static {v13, v3}, Ljava/lang/Math;->max(II)I

    move-result v13

    add-int/lit8 v9, v9, 0x1

    const/4 v3, 0x1

    goto :goto_3

    :cond_d
    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    move-result v12

    move v9, v2

    goto :goto_2

    :cond_e
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/views/scroll/c;->getSnapInterval()I

    move-result v3

    int-to-double v9, v3

    int-to-double v11, v5

    div-double/2addr v11, v9

    invoke-static {v11, v12}, Ljava/lang/Math;->floor(D)D

    move-result-wide v13

    mul-double/2addr v13, v9

    double-to-int v3, v13

    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v11

    mul-double/2addr v11, v9

    double-to-int v7, v11

    invoke-static {v7, v2}, Ljava/lang/Math;->min(II)I

    move-result v12

    move v9, v2

    move v11, v3

    goto/16 :goto_2

    :cond_f
    :goto_6
    sub-int v3, v5, v11

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v10

    sub-int v13, v12, v5

    invoke-static {v13}, Ljava/lang/Math;->abs(I)I

    move-result v14

    if-ge v10, v14, :cond_10

    move v10, v11

    goto :goto_7

    :cond_10
    move v10, v12

    :goto_7
    iget-boolean v14, v0, Lcom/facebook/react/views/scroll/c;->J:Z

    if-nez v14, :cond_12

    if-lt v5, v9, :cond_12

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    if-lt v3, v9, :cond_11

    goto :goto_8

    :cond_11
    move/from16 v3, p1

    move v5, v9

    goto :goto_b

    :cond_12
    iget-boolean v9, v0, Lcom/facebook/react/views/scroll/c;->I:Z

    if-nez v9, :cond_14

    if-gt v5, v7, :cond_14

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    if-gt v3, v7, :cond_13

    :goto_8
    move/from16 v3, p1

    goto :goto_b

    :cond_13
    move/from16 v3, p1

    move v5, v7

    goto :goto_b

    :cond_14
    const-wide/high16 v14, 0x4024000000000000L    # 10.0

    if-lez p1, :cond_16

    if-nez v1, :cond_15

    int-to-double v9, v13

    mul-double/2addr v9, v14

    double-to-int v3, v9

    add-int v3, p1, v3

    goto :goto_9

    :cond_15
    move/from16 v3, p1

    :goto_9
    move v5, v12

    goto :goto_b

    :cond_16
    if-gez p1, :cond_18

    if-nez v1, :cond_17

    int-to-double v9, v3

    mul-double/2addr v9, v14

    double-to-int v3, v9

    sub-int v3, p1, v3

    goto :goto_a

    :cond_17
    move/from16 v3, p1

    :goto_a
    move v5, v11

    goto :goto_b

    :cond_18
    move/from16 v3, p1

    move v5, v10

    :goto_b
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    move-result v5

    if-nez v1, :cond_1d

    iget-object v1, v0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    if-nez v1, :cond_19

    goto :goto_11

    :cond_19
    const/4 v7, 0x1

    iput-boolean v7, v0, Lcom/facebook/react/views/scroll/c;->r:Z

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v17

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v18

    if-eqz v3, :cond_1a

    :goto_c
    move/from16 v20, v3

    goto :goto_d

    :cond_1a
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    sub-int v3, v5, v3

    goto :goto_c

    :goto_d
    if-eqz v5, :cond_1c

    if-ne v5, v2, :cond_1b

    goto :goto_f

    :cond_1b
    :goto_e
    move/from16 v26, v4

    goto :goto_10

    :cond_1c
    :goto_f
    div-int/lit8 v4, v6, 0x2

    goto :goto_e

    :goto_10
    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    move-object/from16 v16, v1

    move/from16 v23, v5

    move/from16 v24, v5

    invoke-virtual/range {v16 .. v26}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_12

    :cond_1d
    :goto_11
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    invoke-virtual {v0, v1, v5}, Lcom/facebook/react/views/scroll/c;->c(II)V

    :goto_12
    return-void
.end method

.method private s(IIII)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sub-int/2addr p4, p3

    :goto_0
    sub-int/2addr p2, p4

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Invalid SnapToAlignment value: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p0, Lcom/facebook/react/views/scroll/c;->K:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sub-int/2addr p4, p3

    div-int/2addr p4, v0

    goto :goto_0

    :cond_2
    :goto_1
    return p2
.end method

.method private t(Landroid/view/View;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->p:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->p:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object p1, p0, Lcom/facebook/react/views/scroll/c;->p:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroid/widget/ScrollView;->computeScrollDeltaToGetChildRectOnScreen(Landroid/graphics/Rect;)I

    move-result p1

    return p1
.end method

.method private v(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->w:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/c;->A:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->o()V

    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/scroll/f;->g(Landroid/view/ViewGroup;II)V

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->r:Z

    new-instance p1, Lcom/facebook/react/views/scroll/c$a;

    invoke-direct {p1, p0}, Lcom/facebook/react/views/scroll/c$a;-><init>(Lcom/facebook/react/views/scroll/c;)V

    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->w:Ljava/lang/Runnable;

    const-wide/16 v0, 0x14

    invoke-static {p0, p1, v0, v1}, Landroidx/core/view/H;->i0(Landroid/view/View;Ljava/lang/Runnable;J)V

    return-void
.end method

.method private w()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->getContentView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private y()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method private z(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/c;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/c;->S:Landroid/animation/ValueAnimator;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->getMaxScrollY()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v1, v0}, Lcom/facebook/react/views/scroll/f;->n(Landroid/view/ViewGroup;IIII)Landroid/graphics/Point;

    move-result-object p1

    iget p1, p1, Landroid/graphics/Point;->y:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/react/views/scroll/f$g;->b()Landroid/graphics/Point;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-static {p0, v0, v1, p1}, Lcom/facebook/react/views/scroll/f;->k(Landroid/view/ViewGroup;III)I

    move-result v0

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/c;->r(I)I

    move-result p1

    add-int/2addr p1, v0

    :goto_0
    return p1
.end method


# virtual methods
.method public C(IFF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->M:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/views/view/g;->f(IFF)V

    return-void
.end method

.method public D(FI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->M:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/views/view/g;->h(FI)V

    return-void
.end method

.method public E(IF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->M:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/views/view/g;->j(IF)V

    return-void
.end method

.method public a(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->S:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->S:Landroid/animation/ValueAnimator;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/react/views/scroll/f;->j(Landroid/content/Context;)I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    move-result-object v0

    filled-new-array {p1, p2}, [I

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    iget-object p1, p0, Lcom/facebook/react/views/scroll/c;->S:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public b(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/scroll/c;->scrollTo(II)V

    invoke-direct {p0, p2}, Lcom/facebook/react/views/scroll/c;->A(I)V

    return-void
.end method

.method public c(II)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/scroll/f;->p(Landroid/view/ViewGroup;II)V

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/c;->F(II)V

    return-void
.end method

.method public dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->T:Lcom/facebook/react/uimanager/H;

    invoke-static {v0}, Lcom/facebook/react/uimanager/H;->j(Lcom/facebook/react/uimanager/H;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 5

    iget v0, p0, Lcom/facebook/react/views/scroll/c;->E:I

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->getContentView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/c;->D:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/c;->D:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v0, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->D:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public executeKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/facebook/react/views/scroll/c;->y:Z

    if-nez v1, :cond_1

    const/16 v1, 0x13

    if-eq v0, v1, :cond_0

    const/16 v1, 0x14

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->executeKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public fling(I)V
    .locals 11

    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/c;->m(I)I

    move-result p1

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/c;->v:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/c;->q(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    div-int/lit8 v10, v0, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x7fffffff

    const/4 v9, 0x0

    move-object v0, v1

    move v1, v2

    move v2, v3

    move v3, v4

    move v4, p1

    invoke-virtual/range {v0 .. v10}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    invoke-static {p0}, Landroidx/core/view/H;->g0(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->fling(I)V

    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lcom/facebook/react/views/scroll/c;->v(II)V

    return-void
.end method

.method public getChildVisibleRect(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Point;)Z
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->getChildVisibleRect(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    move-result p1

    return p1
.end method

.method public getClippingRect(Landroid/graphics/Rect;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->s:Landroid/graphics/Rect;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method public getFlingAnimator()Landroid/animation/ValueAnimator;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->S:Landroid/animation/ValueAnimator;

    return-object v0
.end method

.method public getLastScrollDispatchTime()J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/react/views/scroll/c;->U:J

    return-wide v0
.end method

.method public getOverflow()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->t:Ljava/lang/String;

    return-object v0
.end method

.method public getOverflowInset()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->q:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getPointerEvents()Lcom/facebook/react/uimanager/H;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->T:Lcom/facebook/react/uimanager/H;

    return-object v0
.end method

.method public getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->R:Lcom/facebook/react/views/scroll/f$g;

    return-object v0
.end method

.method public getRemoveClippedSubviews()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/c;->x:Z

    return v0
.end method

.method public getScrollEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/c;->y:Z

    return v0
.end method

.method public getScrollEventThrottle()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/scroll/c;->V:I

    return v0
.end method

.method public getStateWrapper()Lcom/facebook/react/uimanager/d0;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->Q:Lcom/facebook/react/uimanager/d0;

    return-object v0
.end method

.method public k()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    :cond_0
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/c;->x:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/c;->updateClippingRect()V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->W:Lcom/facebook/react/views/scroll/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/a;->f()V

    :cond_1
    return-void
.end method

.method public onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, Lcom/facebook/react/views/scroll/c;->L:Landroid/view/View;

    invoke-virtual {p2, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method public onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/facebook/react/views/scroll/c;->L:Landroid/view/View;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->L:Landroid/view/View;

    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/widget/ScrollView;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->W:Lcom/facebook/react/views/scroll/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/a;->g()V

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->M:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->d(Landroid/graphics/Canvas;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    sget v0, Lcom/facebook/react/n;->q:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setViewIdResourceName(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/c;->y:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->T:Lcom/facebook/react/uimanager/H;

    invoke-static {v0}, Lcom/facebook/react/uimanager/H;->j(Lcom/facebook/react/uimanager/H;)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    return v2

    :cond_1
    :try_start_0
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/c;->u(Landroid/view/MotionEvent;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    move-exception p1

    const-string v0, "ReactNative"

    const-string v2, "Error intercepting touch event."

    invoke-static {v0, v2, p1}, LP0/a;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return v1
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->w()Z

    move-result p1

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/facebook/react/views/scroll/c;->O:I

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p1

    :goto_0
    iget p3, p0, Lcom/facebook/react/views/scroll/c;->P:I

    if-eq p3, p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p3

    :goto_1
    invoke-virtual {p0, p1, p3}, Lcom/facebook/react/views/scroll/c;->scrollTo(II)V

    :cond_2
    invoke-static {p0}, Lcom/facebook/react/views/scroll/f;->a(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    iget-object p1, p0, Lcom/facebook/react/views/scroll/c;->L:Landroid/view/View;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/facebook/react/views/scroll/c;->W:Lcom/facebook/react/views/scroll/a;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/a;->h()V

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->w()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->getMaxScrollY()I

    move-result p2

    if-le p1, p2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/scroll/c;->scrollTo(II)V

    :cond_2
    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/A;->a(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method protected onOverScrolled(IIZZ)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/c;->L:Landroid/view/View;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalY()I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->getMaxScrollY()I

    move-result v0

    if-lt p2, v0, :cond_0

    iget-object p2, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    invoke-virtual {p2}, Landroid/widget/OverScroller;->abortAnimation()V

    move p2, v0

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onOverScrolled(IIZZ)V

    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onScrollChanged(IIII)V

    const/4 p3, 0x1

    iput-boolean p3, p0, Lcom/facebook/react/views/scroll/c;->r:Z

    iget-object p4, p0, Lcom/facebook/react/views/scroll/c;->m:LK2/b;

    invoke-virtual {p4, p1, p2}, LK2/b;->c(II)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->x:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/c;->updateClippingRect()V

    :cond_0
    iget-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->z:Z

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iput-boolean p3, p0, Lcom/facebook/react/views/scroll/c;->z:Z

    iget-object p1, p0, Lcom/facebook/react/views/scroll/c;->m:LK2/b;

    invoke-virtual {p1}, LK2/b;->a()F

    move-result p1

    iget-object p2, p0, Lcom/facebook/react/views/scroll/c;->m:LK2/b;

    invoke-virtual {p2}, LK2/b;->b()F

    move-result p2

    iget-boolean p3, p0, Lcom/facebook/react/views/scroll/c;->C:Z

    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/views/scroll/f;->s(Landroid/view/ViewGroup;FFZ)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->z:Z

    :cond_2
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/ScrollView;->onSizeChanged(IIII)V

    iget-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->x:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/c;->updateClippingRect()V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/c;->y:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->T:Lcom/facebook/react/uimanager/H;

    invoke-static {v0}, Lcom/facebook/react/uimanager/H;->h(Lcom/facebook/react/uimanager/H;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->o:Lcom/facebook/react/views/scroll/i;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/i;->a(Landroid/view/MotionEvent;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    iget-boolean v2, p0, Lcom/facebook/react/views/scroll/c;->u:Z

    if-eqz v2, :cond_2

    invoke-static {p0}, Lcom/facebook/react/views/scroll/f;->q(Landroid/view/ViewGroup;)V

    iget-object v2, p0, Lcom/facebook/react/views/scroll/c;->o:Lcom/facebook/react/views/scroll/i;

    invoke-virtual {v2}, Lcom/facebook/react/views/scroll/i;->b()F

    move-result v2

    iget-object v3, p0, Lcom/facebook/react/views/scroll/c;->o:Lcom/facebook/react/views/scroll/i;

    invoke-virtual {v3}, Lcom/facebook/react/views/scroll/i;->c()F

    move-result v3

    invoke-static {p0, v2, v3}, Lcom/facebook/react/views/scroll/f;->c(Landroid/view/ViewGroup;FF)V

    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/events/m;->a(Landroid/view/View;Landroid/view/MotionEvent;)V

    iput-boolean v1, p0, Lcom/facebook/react/views/scroll/c;->u:Z

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-direct {p0, v1, v2}, Lcom/facebook/react/views/scroll/c;->v(II)V

    :cond_2
    if-nez v0, :cond_3

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->l()V

    :cond_3
    invoke-super {p0, p1}, Landroid/widget/ScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public p()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    return-void
.end method

.method public r(I)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->getMaxScrollY()I

    move-result v1

    invoke-static {p0, v0, p1, v0, v1}, Lcom/facebook/react/views/scroll/f;->n(Landroid/view/ViewGroup;IIII)Landroid/graphics/Point;

    move-result-object p1

    iget p1, p1, Landroid/graphics/Point;->y:I

    return p1
.end method

.method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-direct {p0, p2}, Lcom/facebook/react/views/scroll/c;->B(Landroid/view/View;)V

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/ScrollView;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public scrollTo(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/widget/ScrollView;->scrollTo(II)V

    invoke-static {p0}, Lcom/facebook/react/views/scroll/f;->q(Landroid/view/ViewGroup;)V

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/c;->F(II)V

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->M:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->e(I)V

    return-void
.end method

.method public setBorderRadius(F)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->M:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->g(F)V

    return-void
.end method

.method public setBorderStyle(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->M:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->i(Ljava/lang/String;)V

    return-void
.end method

.method public setContentOffset(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 6

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->N:Lcom/facebook/react/bridge/ReadableMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_0
    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->N:Lcom/facebook/react/bridge/ReadableMap;

    if-eqz p1, :cond_3

    const-string v0, "x"

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    goto :goto_0

    :cond_1
    move-wide v0, v2

    :goto_0
    const-string v4, "y"

    invoke-interface {p1, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {p1, v4}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    :cond_2
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result p1

    float-to-int p1, p1

    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/G;->c(D)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/views/scroll/c;->scrollTo(II)V

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Lcom/facebook/react/views/scroll/c;->scrollTo(II)V

    :cond_4
    :goto_1
    return-void
.end method

.method public setDecelerationRate(F)V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/c;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/f$g;->i(F)V

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->n:Landroid/widget/OverScroller;

    if-eqz v0, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/OverScroller;->setFriction(F)V

    :cond_0
    return-void
.end method

.method public setDisableIntervalMomentum(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->F:Z

    return-void
.end method

.method public setEnableSyncOnScroll(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->C:Z

    return-void
.end method

.method public setEndFillColor(I)V
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/scroll/c;->E:I

    if-eq p1, v0, :cond_0

    iput p1, p0, Lcom/facebook/react/views/scroll/c;->E:I

    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    iget v0, p0, Lcom/facebook/react/views/scroll/c;->E:I

    invoke-direct {p1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->D:Landroid/graphics/drawable/Drawable;

    :cond_0
    return-void
.end method

.method public setLastScrollDispatchTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/facebook/react/views/scroll/c;->U:J

    return-void
.end method

.method public setMaintainVisibleContentPosition(Lcom/facebook/react/views/scroll/a$b;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->W:Lcom/facebook/react/views/scroll/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/react/views/scroll/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/react/views/scroll/a;-><init>(Landroid/view/ViewGroup;Z)V

    iput-object v0, p0, Lcom/facebook/react/views/scroll/c;->W:Lcom/facebook/react/views/scroll/a;

    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/a;->f()V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->W:Lcom/facebook/react/views/scroll/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/a;->g()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/views/scroll/c;->W:Lcom/facebook/react/views/scroll/a;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->W:Lcom/facebook/react/views/scroll/a;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/a;->e(Lcom/facebook/react/views/scroll/a$b;)V

    :cond_2
    return-void
.end method

.method public setOverflow(Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->t:Ljava/lang/String;

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->M:Lcom/facebook/react/views/view/g;

    if-nez p1, :cond_0

    const-string p1, "scroll"

    :cond_0
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->k(Ljava/lang/String;)V

    return-void
.end method

.method public setOverflowInset(IIII)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->q:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public setPagingEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->v:Z

    return-void
.end method

.method public setPointerEvents(Lcom/facebook/react/uimanager/H;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->T:Lcom/facebook/react/uimanager/H;

    return-void
.end method

.method public setRemoveClippedSubviews(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->s:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/views/scroll/c;->s:Landroid/graphics/Rect;

    :cond_0
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->x:Z

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/c;->updateClippingRect()V

    return-void
.end method

.method public setScrollAwayTopPaddingEnabledUnstable(I)V
    .locals 5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "React Native ScrollView should not have more than one child, it should have exactly 1 child; a content View"

    invoke-static {v2, v3}, LO1/a;->b(ZLjava/lang/String;)V

    if-lez v0, :cond_2

    move v2, v1

    :goto_1
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    int-to-float v4, p1

    invoke-virtual {v3, v4}, Landroid/view/View;->setTranslationY(F)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v1, v1, v1, p1}, Landroid/view/View;->setPadding(IIII)V

    :cond_2
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/c;->H(I)V

    iget-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->x:Z

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/c;->setRemoveClippedSubviews(Z)V

    return-void
.end method

.method public setScrollEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->y:Z

    return-void
.end method

.method public setScrollEventThrottle(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/react/views/scroll/c;->V:I

    return-void
.end method

.method public setScrollPerfTag(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->B:Ljava/lang/String;

    return-void
.end method

.method public setSendMomentumEvents(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->A:Z

    return-void
.end method

.method public setSnapInterval(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/react/views/scroll/c;->G:I

    return-void
.end method

.method public setSnapOffsets(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->H:Ljava/util/List;

    return-void
.end method

.method public setSnapToAlignment(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/react/views/scroll/c;->K:I

    return-void
.end method

.method public setSnapToEnd(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->J:Z

    return-void
.end method

.method public setSnapToStart(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->I:Z

    return-void
.end method

.method public setStateWrapper(Lcom/facebook/react/uimanager/d0;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/scroll/c;->Q:Lcom/facebook/react/uimanager/d0;

    return-void
.end method

.method protected u(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/events/m;->b(Landroid/view/View;Landroid/view/MotionEvent;)V

    invoke-static {p0}, Lcom/facebook/react/views/scroll/f;->b(Landroid/view/ViewGroup;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/c;->u:Z

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->o()V

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/c;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    return-void
.end method

.method public updateClippingRect()V
    .locals 2

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/c;->x:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->s:Landroid/graphics/Rect;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->s:Landroid/graphics/Rect;

    invoke-static {p0, v0}, Lcom/facebook/react/uimanager/L;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/c;->getContentView()Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Lcom/facebook/react/uimanager/K;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/facebook/react/uimanager/K;

    invoke-interface {v0}, Lcom/facebook/react/uimanager/K;->updateClippingRect()V

    :cond_1
    return-void
.end method

.method x(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/c;->t(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/c;->p:Landroid/graphics/Rect;

    invoke-virtual {p1, v1}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/c;->p:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
