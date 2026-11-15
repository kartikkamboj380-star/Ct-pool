.class public Lcom/facebook/react/views/scroll/b;
.super Landroid/widget/HorizontalScrollView;
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
.field private static b0:Z = false

.field private static c0:Ljava/lang/String; = "b"

.field private static d0:I = -0x80000000

.field private static e0:Ljava/lang/reflect/Field; = null

.field private static f0:Z = false


# instance fields
.field private A:Z

.field private B:Z

.field private C:Ljava/lang/String;

.field private D:Landroid/graphics/drawable/Drawable;

.field private E:I

.field private F:Z

.field private G:I

.field private H:Ljava/util/List;

.field private I:Z

.field private J:Z

.field private K:I

.field private L:Lcom/facebook/react/views/view/g;

.field private M:Z

.field private N:I

.field private O:I

.field private P:Lcom/facebook/react/uimanager/d0;

.field private final Q:Lcom/facebook/react/views/scroll/f$g;

.field private final R:Landroid/animation/ValueAnimator;

.field private S:Lcom/facebook/react/uimanager/H;

.field private T:J

.field private U:I

.field private V:Landroid/view/View;

.field private W:Lcom/facebook/react/views/scroll/a;

.field private final a0:Landroid/graphics/Rect;

.field private m:I

.field private final n:LK2/b;

.field private final o:Landroid/widget/OverScroller;

.field private final p:Lcom/facebook/react/views/scroll/i;

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
    invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    sget p2, Lcom/facebook/react/views/scroll/b;->d0:I

    .line 5
    .line 6
    iput p2, p0, Lcom/facebook/react/views/scroll/b;->m:I

    .line 7
    .line 8
    new-instance p2, LK2/b;

    .line 9
    .line 10
    invoke-direct {p2}, LK2/b;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lcom/facebook/react/views/scroll/b;->n:LK2/b;

    .line 14
    .line 15
    new-instance p2, Lcom/facebook/react/views/scroll/i;

    .line 16
    .line 17
    invoke-direct {p2}, Lcom/facebook/react/views/scroll/i;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lcom/facebook/react/views/scroll/b;->p:Lcom/facebook/react/views/scroll/i;

    .line 21
    .line 22
    new-instance p2, Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, Lcom/facebook/react/views/scroll/b;->q:Landroid/graphics/Rect;

    .line 28
    .line 29
    const-string p2, "hidden"

    .line 30
    .line 31
    iput-object p2, p0, Lcom/facebook/react/views/scroll/b;->t:Ljava/lang/String;

    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    iput-boolean p2, p0, Lcom/facebook/react/views/scroll/b;->v:Z

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->y:Z

    .line 38
    .line 39
    iput-boolean p2, p0, Lcom/facebook/react/views/scroll/b;->z:Z

    .line 40
    .line 41
    iput-boolean p2, p0, Lcom/facebook/react/views/scroll/b;->A:Z

    .line 42
    .line 43
    iput p2, p0, Lcom/facebook/react/views/scroll/b;->E:I

    .line 44
    .line 45
    iput-boolean p2, p0, Lcom/facebook/react/views/scroll/b;->F:Z

    .line 46
    .line 47
    iput p2, p0, Lcom/facebook/react/views/scroll/b;->G:I

    .line 48
    .line 49
    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->I:Z

    .line 50
    .line 51
    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->J:Z

    .line 52
    .line 53
    iput p2, p0, Lcom/facebook/react/views/scroll/b;->K:I

    .line 54
    .line 55
    iput-boolean p2, p0, Lcom/facebook/react/views/scroll/b;->M:Z

    .line 56
    .line 57
    const/4 v0, -0x1

    .line 58
    iput v0, p0, Lcom/facebook/react/views/scroll/b;->N:I

    .line 59
    .line 60
    iput v0, p0, Lcom/facebook/react/views/scroll/b;->O:I

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    iput-object v0, p0, Lcom/facebook/react/views/scroll/b;->P:Lcom/facebook/react/uimanager/d0;

    .line 64
    .line 65
    const-string v0, "scrollX"

    .line 66
    .line 67
    filled-new-array {p2, p2}, [I

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lcom/facebook/react/views/scroll/b;->R:Landroid/animation/ValueAnimator;

    .line 76
    .line 77
    sget-object v0, Lcom/facebook/react/uimanager/H;->q:Lcom/facebook/react/uimanager/H;

    .line 78
    .line 79
    iput-object v0, p0, Lcom/facebook/react/views/scroll/b;->S:Lcom/facebook/react/uimanager/H;

    .line 80
    .line 81
    const-wide/16 v0, 0x0

    .line 82
    .line 83
    iput-wide v0, p0, Lcom/facebook/react/views/scroll/b;->T:J

    .line 84
    .line 85
    iput p2, p0, Lcom/facebook/react/views/scroll/b;->U:I

    .line 86
    .line 87
    new-instance v0, Landroid/graphics/Rect;

    .line 88
    .line 89
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, Lcom/facebook/react/views/scroll/b;->a0:Landroid/graphics/Rect;

    .line 93
    .line 94
    new-instance v0, Lcom/facebook/react/views/view/g;

    .line 95
    .line 96
    invoke-direct {v0, p0}, Lcom/facebook/react/views/view/g;-><init>(Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    iput-object v0, p0, Lcom/facebook/react/views/scroll/b;->L:Lcom/facebook/react/views/view/g;

    .line 100
    .line 101
    new-instance v0, Lcom/facebook/react/views/scroll/d;

    .line 102
    .line 103
    invoke-direct {v0}, Lcom/facebook/react/views/scroll/d;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v0}, Landroidx/core/view/H;->p0(Landroid/view/View;Landroidx/core/view/a;)V

    .line 107
    .line 108
    .line 109
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/b;->getOverScrollerFromParent()Landroid/widget/OverScroller;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    .line 114
    .line 115
    new-instance v0, Lcom/facebook/react/views/scroll/f$g;

    .line 116
    .line 117
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/a;->f()Lcom/facebook/react/modules/i18nmanager/a;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1, p1}, Lcom/facebook/react/modules/i18nmanager/a;->i(Landroid/content/Context;)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    invoke-direct {v0, p1}, Lcom/facebook/react/views/scroll/f$g;-><init>(I)V

    .line 126
    .line 127
    .line 128
    iput-object v0, p0, Lcom/facebook/react/views/scroll/b;->Q:Lcom/facebook/react/views/scroll/f$g;

    .line 129
    .line 130
    invoke-virtual {p0, p0}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, Lcom/facebook/react/views/scroll/b;->L:Lcom/facebook/react/views/view/g;

    .line 137
    .line 138
    const-string p2, "scroll"

    .line 139
    .line 140
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/view/g;->k(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method private B()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method private C(Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/b;->v(Landroid/view/View;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private D(I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->computeHorizontalScrollRange()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/b;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/react/views/scroll/b;->R:Landroid/animation/ValueAnimator;

    if-ne v2, v3, :cond_0

    invoke-static {p0, p1, v1, v0, v1}, Lcom/facebook/react/views/scroll/f;->n(Landroid/view/ViewGroup;IIII)Landroid/graphics/Point;

    move-result-object p1

    iget p1, p1, Landroid/graphics/Point;->x:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/b;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/react/views/scroll/f$g;->b()Landroid/graphics/Point;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Point;->x:I

    invoke-static {p0, v0, v1, p1}, Lcom/facebook/react/views/scroll/f;->k(Landroid/view/ViewGroup;III)I

    move-result v0

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/b;->t(I)I

    move-result p1

    add-int/2addr p1, v0

    :goto_0
    return p1
.end method

.method private E(II)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/b;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/b;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/widget/OverScroller;->forceFinished(Z)V

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalX()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getStartX()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v1

    mul-float/2addr v1, v0

    iget-object v2, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v4

    float-to-int v5, v1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v3, p1

    move v8, p2

    invoke-virtual/range {v2 .. v10}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    invoke-virtual {p2}, Landroid/widget/OverScroller;->getCurrX()I

    move-result p2

    sub-int/2addr p2, v0

    add-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/scroll/b;->scrollTo(II)V

    :cond_2
    :goto_0
    return-void
.end method

.method private F(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/b;->v(Landroid/view/View;)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->scrollBy(II)V

    :cond_0
    return-void
.end method

.method private J(II)V
    .locals 5

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/b;->b0:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/react/views/scroll/b;->c0:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "setPendingContentOffsets[%d] x %d y %d"

    invoke-static {v0, v4, v1, v2, v3}, LP0/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/b;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, -0x1

    iput p1, p0, Lcom/facebook/react/views/scroll/b;->N:I

    iput p1, p0, Lcom/facebook/react/views/scroll/b;->O:I

    goto :goto_0

    :cond_1
    iput p1, p0, Lcom/facebook/react/views/scroll/b;->N:I

    iput p2, p0, Lcom/facebook/react/views/scroll/b;->O:I

    :goto_0
    return-void
.end method

.method private K(I)V
    .locals 11

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/b;->b0:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/react/views/scroll/b;->c0:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "smoothScrollAndSnap[%d] velocity %d"

    invoke-static {v0, v3, v1, v2}, LP0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/b;->getSnapInterval()I

    move-result v0

    int-to-double v0, v0

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/b;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/react/views/scroll/f$g;->b()Landroid/graphics/Point;

    move-result-object v3

    iget v3, v3, Landroid/graphics/Point;->x:I

    invoke-static {p0, v2, v3, p1}, Lcom/facebook/react/views/scroll/f;->k(Landroid/view/ViewGroup;III)I

    move-result v2

    int-to-double v2, v2

    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/b;->D(I)I

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

    if-lez p1, :cond_1

    if-ne v9, v8, :cond_1

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_1
    if-gez p1, :cond_2

    if-ne v8, v9, :cond_2

    add-int/lit8 v8, v8, -0x1

    :cond_2
    :goto_0
    if-lez p1, :cond_3

    if-ge v6, v9, :cond_3

    if-le v4, v8, :cond_3

    move v6, v9

    goto :goto_1

    :cond_3
    if-gez p1, :cond_4

    if-le v6, v8, :cond_4

    if-ge v4, v9, :cond_4

    move v6, v8

    :cond_4
    :goto_1
    int-to-double v4, v6

    mul-double/2addr v4, v0

    cmpl-double p1, v4, v2

    if-eqz p1, :cond_5

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->r:Z

    double-to-int p1, v4

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/facebook/react/views/scroll/b;->c(II)V

    :cond_5
    return-void
.end method

.method private L(I)V
    .locals 4

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/b;->b0:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/react/views/scroll/b;->c0:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "smoothScrollToNextPage[%d] direction %d"

    invoke-static {v0, v3, v1, v2}, LP0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    div-int v2, v1, v0

    rem-int/2addr v1, v0

    if-eqz v1, :cond_1

    add-int/lit8 v2, v2, 0x1

    :cond_1
    const/16 v1, 0x11

    if-ne p1, v1, :cond_2

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    :goto_0
    const/4 p1, 0x0

    if-gez v2, :cond_3

    move v2, p1

    :cond_3
    mul-int/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    invoke-virtual {p0, v2, v0}, Lcom/facebook/react/views/scroll/b;->c(II)V

    invoke-direct {p0, p1, p1}, Lcom/facebook/react/views/scroll/b;->x(II)V

    return-void
.end method

.method static bridge synthetic d(Lcom/facebook/react/views/scroll/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/views/scroll/b;->r:Z

    return p0
.end method

.method static bridge synthetic e(Lcom/facebook/react/views/scroll/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/views/scroll/b;->v:Z

    return p0
.end method

.method static bridge synthetic f(Lcom/facebook/react/views/scroll/b;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/facebook/react/views/scroll/b;->B:Z

    return p0
.end method

.method static bridge synthetic g(Lcom/facebook/react/views/scroll/b;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->r:Z

    return-void
.end method

.method private getContentView()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private getOverScrollerFromParent()Landroid/widget/OverScroller;
    .locals 3

    sget-boolean v0, Lcom/facebook/react/views/scroll/b;->f0:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    sput-boolean v0, Lcom/facebook/react/views/scroll/b;->f0:Z

    :try_start_0
    const-class v1, Landroid/widget/HorizontalScrollView;

    const-string v2, "mScroller"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, Lcom/facebook/react/views/scroll/b;->e0:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lcom/facebook/react/views/scroll/b;->c0:Ljava/lang/String;

    const-string v1, "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :("

    invoke-static {v0, v1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    sget-object v0, Lcom/facebook/react/views/scroll/b;->e0:Ljava/lang/reflect/Field;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    :try_start_1
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Landroid/widget/OverScroller;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, Landroid/widget/OverScroller;

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_1

    :cond_1
    sget-object v0, Lcom/facebook/react/views/scroll/b;->c0:Ljava/lang/String;

    const-string v2, "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :("

    invoke-static {v0, v2}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :goto_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Failed to get mScroller from HorizontalScrollView!"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    :goto_2
    return-object v1
.end method

.method private getSnapInterval()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/scroll/b;->G:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    return v0
.end method

.method static bridge synthetic h(Lcom/facebook/react/views/scroll/b;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/scroll/b;->w:Ljava/lang/Runnable;

    return-void
.end method

.method static bridge synthetic i(Lcom/facebook/react/views/scroll/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/b;->n()V

    return-void
.end method

.method static bridge synthetic j(Lcom/facebook/react/views/scroll/b;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/b;->s(I)V

    return-void
.end method

.method private l(IIII)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/b;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object p3

    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/b;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object p3

    invoke-virtual {p3}, Landroid/animation/ValueAnimator;->end()V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p3

    sub-int/2addr p4, p3

    sub-int/2addr p2, p1

    sub-int p1, p2, p4

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p3

    invoke-virtual {p0, p1, p3}, Lcom/facebook/react/views/scroll/b;->scrollTo(II)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p3

    sub-int/2addr p2, p3

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/b;->E(II)V

    return-void
.end method

.method private m()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->w:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/views/scroll/b;->w:Ljava/lang/Runnable;

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/b;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    return-void
.end method

.method private n()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/b;->B()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/react/views/scroll/b;->C:Ljava/lang/String;

    invoke-static {v1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
.end method

.method private o()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/b;->B()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/facebook/react/views/scroll/b;->C:Ljava/lang/String;

    invoke-static {v1}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
.end method

.method private static p(Landroid/view/View;Landroid/view/MotionEvent;)Landroid/widget/HorizontalScrollView;
    .locals 1

    .line 1
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lcom/facebook/react/views/scroll/b;->q(Landroid/view/View;Landroid/view/MotionEvent;Z)Landroid/widget/HorizontalScrollView;

    move-result-object p0

    return-object p0
.end method

.method private static q(Landroid/view/View;Landroid/view/MotionEvent;Z)Landroid/widget/HorizontalScrollView;
    .locals 4

    .line 1
    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Rect;->contains(II)Z

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    if-nez p2, :cond_2

    instance-of p2, p0, Landroid/widget/HorizontalScrollView;

    if-eqz p2, :cond_2

    invoke-static {p0}, Landroidx/core/view/H;->U(Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_2

    instance-of p2, p0, Lcom/facebook/react/views/scroll/b;

    if-eqz p2, :cond_2

    move-object p2, p0

    check-cast p2, Lcom/facebook/react/views/scroll/b;

    iget-boolean p2, p2, Lcom/facebook/react/views/scroll/b;->y:Z

    if-eqz p2, :cond_2

    check-cast p0, Landroid/widget/HorizontalScrollView;

    return-object p0

    :cond_2
    instance-of p2, p0, Landroid/view/ViewGroup;

    if-eqz p2, :cond_4

    const/4 p2, 0x0

    move v1, p2

    :goto_0
    move-object v2, p0

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v1, v3, :cond_4

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, p1, p2}, Lcom/facebook/react/views/scroll/b;->q(Landroid/view/View;Landroid/view/MotionEvent;Z)Landroid/widget/HorizontalScrollView;

    move-result-object v2

    if-eqz v2, :cond_3

    return-object v2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method private s(I)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    sget-boolean v1, Lcom/facebook/react/views/scroll/b;->b0:Z

    if-eqz v1, :cond_0

    sget-object v1, Lcom/facebook/react/views/scroll/b;->c0:Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "smoothScrollAndSnap[%d] velocityX %d"

    invoke-static {v1, v4, v2, v3}, LP0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-gtz v1, :cond_1

    return-void

    :cond_1
    iget v1, v0, Lcom/facebook/react/views/scroll/b;->G:I

    if-nez v1, :cond_2

    iget-object v1, v0, Lcom/facebook/react/views/scroll/b;->H:Ljava/util/List;

    if-nez v1, :cond_2

    iget v1, v0, Lcom/facebook/react/views/scroll/b;->K:I

    if-nez v1, :cond_2

    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/views/scroll/b;->K(I)V

    return-void

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/facebook/react/views/scroll/b;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object v1

    iget-object v2, v0, Lcom/facebook/react/views/scroll/b;->R:Landroid/animation/ValueAnimator;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_3

    move v1, v3

    goto :goto_0

    :cond_3
    move v1, v4

    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->computeHorizontalScrollRange()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v5

    sub-int/2addr v2, v5

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-direct/range {p0 .. p1}, Lcom/facebook/react/views/scroll/b;->D(I)I

    move-result v5

    iget-boolean v6, v0, Lcom/facebook/react/views/scroll/b;->F:Z

    if-eqz v6, :cond_4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v5

    :cond_4
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v6

    invoke-static/range {p0 .. p0}, Landroidx/core/view/H;->G(Landroid/view/View;)I

    move-result v7

    sub-int/2addr v6, v7

    invoke-static/range {p0 .. p0}, Landroidx/core/view/H;->F(Landroid/view/View;)I

    move-result v7

    sub-int/2addr v6, v7

    invoke-static {}, Le2/a;->d()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v7

    goto :goto_1

    :cond_5
    iget-object v7, v0, Lcom/facebook/react/views/scroll/b;->Q:Lcom/facebook/react/views/scroll/f$g;

    invoke-virtual {v7}, Lcom/facebook/react/views/scroll/f$g;->d()I

    move-result v7

    :goto_1
    if-ne v7, v3, :cond_6

    sub-int v5, v2, v5

    move/from16 v8, p1

    neg-int v8, v8

    goto :goto_2

    :cond_6
    move/from16 v8, p1

    :goto_2
    iget-object v9, v0, Lcom/facebook/react/views/scroll/b;->H:Ljava/util/List;

    if-eqz v9, :cond_9

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_9

    iget-object v9, v0, Lcom/facebook/react/views/scroll/b;->H:Ljava/util/List;

    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v10, v0, Lcom/facebook/react/views/scroll/b;->H:Ljava/util/List;

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v11

    sub-int/2addr v11, v3

    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    move v13, v2

    move v11, v4

    move v12, v11

    :goto_3
    iget-object v14, v0, Lcom/facebook/react/views/scroll/b;->H:Ljava/util/List;

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v14

    if-ge v11, v14, :cond_f

    iget-object v14, v0, Lcom/facebook/react/views/scroll/b;->H:Ljava/util/List;

    invoke-interface {v14, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-gt v14, v5, :cond_7

    sub-int v15, v5, v14

    sub-int v3, v5, v12

    if-ge v15, v3, :cond_7

    move v12, v14

    :cond_7
    if-lt v14, v5, :cond_8

    sub-int v3, v14, v5

    sub-int v15, v13, v5

    if-ge v3, v15, :cond_8

    move v13, v14

    :cond_8
    add-int/lit8 v11, v11, 0x1

    const/4 v3, 0x1

    goto :goto_3

    :cond_9
    iget v3, v0, Lcom/facebook/react/views/scroll/b;->K:I

    if-eqz v3, :cond_e

    iget v9, v0, Lcom/facebook/react/views/scroll/b;->G:I

    if-lez v9, :cond_a

    int-to-double v10, v5

    int-to-double v12, v9

    div-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->floor(D)D

    move-result-wide v12

    iget v9, v0, Lcom/facebook/react/views/scroll/b;->G:I

    int-to-double v14, v9

    mul-double/2addr v12, v14

    double-to-int v12, v12

    invoke-direct {v0, v3, v12, v9, v6}, Lcom/facebook/react/views/scroll/b;->u(IIII)I

    move-result v3

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v12

    iget v3, v0, Lcom/facebook/react/views/scroll/b;->K:I

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    iget v11, v0, Lcom/facebook/react/views/scroll/b;->G:I

    int-to-double v13, v11

    mul-double/2addr v9, v13

    double-to-int v9, v9

    invoke-direct {v0, v3, v9, v11, v6}, Lcom/facebook/react/views/scroll/b;->u(IIII)I

    move-result v3

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v13

    move v10, v2

    move v9, v4

    goto/16 :goto_6

    :cond_a
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/views/scroll/b;->getContentView()Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    move v11, v2

    move v12, v11

    move v9, v4

    move v10, v9

    move v13, v10

    :goto_4
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v14

    if-ge v9, v14, :cond_d

    invoke-virtual {v3, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    iget v15, v0, Lcom/facebook/react/views/scroll/b;->K:I

    invoke-virtual {v14}, Landroid/view/View;->getLeft()I

    move-result v4

    invoke-virtual {v14}, Landroid/view/View;->getWidth()I

    move-result v14

    invoke-direct {v0, v15, v4, v14, v6}, Lcom/facebook/react/views/scroll/b;->u(IIII)I

    move-result v4

    if-gt v4, v5, :cond_b

    sub-int v14, v5, v4

    sub-int v15, v5, v10

    if-ge v14, v15, :cond_b

    move v10, v4

    :cond_b
    if-lt v4, v5, :cond_c

    sub-int v14, v4, v5

    sub-int v15, v12, v5

    if-ge v14, v15, :cond_c

    move v12, v4

    :cond_c
    invoke-static {v11, v4}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-static {v13, v4}, Ljava/lang/Math;->max(II)I

    move-result v13

    add-int/lit8 v9, v9, 0x1

    const/4 v4, 0x0

    goto :goto_4

    :cond_d
    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I

    move-result v13

    move v10, v2

    move v12, v3

    :goto_5
    const/4 v9, 0x0

    goto :goto_6

    :cond_e
    invoke-direct/range {p0 .. p0}, Lcom/facebook/react/views/scroll/b;->getSnapInterval()I

    move-result v3

    int-to-double v3, v3

    int-to-double v9, v5

    div-double/2addr v9, v3

    invoke-static {v9, v10}, Ljava/lang/Math;->floor(D)D

    move-result-wide v11

    mul-double/2addr v11, v3

    double-to-int v12, v11

    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    mul-double/2addr v9, v3

    double-to-int v3, v9

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v13

    move v10, v2

    goto :goto_5

    :cond_f
    :goto_6
    sub-int v3, v5, v12

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v4

    sub-int v11, v13, v5

    invoke-static {v11}, Ljava/lang/Math;->abs(I)I

    move-result v14

    if-ge v4, v14, :cond_10

    move v4, v12

    goto :goto_7

    :cond_10
    move v4, v13

    :goto_7
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v14

    const/4 v15, 0x1

    if-ne v7, v15, :cond_11

    sub-int v14, v2, v14

    :cond_11
    iget-boolean v15, v0, Lcom/facebook/react/views/scroll/b;->J:Z

    if-nez v15, :cond_13

    if-lt v5, v10, :cond_13

    if-lt v14, v10, :cond_12

    goto :goto_9

    :cond_12
    move v5, v10

    :goto_8
    const/4 v3, 0x0

    goto :goto_a

    :cond_13
    iget-boolean v10, v0, Lcom/facebook/react/views/scroll/b;->I:Z

    if-nez v10, :cond_15

    if-gt v5, v9, :cond_15

    if-gt v14, v9, :cond_14

    :goto_9
    goto :goto_8

    :cond_14
    move v5, v9

    goto :goto_8

    :cond_15
    const-wide/high16 v9, 0x4024000000000000L    # 10.0

    if-lez v8, :cond_17

    if-nez v1, :cond_16

    int-to-double v3, v11

    mul-double/2addr v3, v9

    double-to-int v3, v3

    add-int/2addr v8, v3

    :cond_16
    move v5, v13

    goto :goto_8

    :cond_17
    if-gez v8, :cond_19

    if-nez v1, :cond_18

    int-to-double v3, v3

    mul-double/2addr v3, v9

    double-to-int v3, v3

    sub-int/2addr v8, v3

    :cond_18
    move v5, v12

    goto :goto_8

    :cond_19
    move v5, v4

    goto :goto_8

    :goto_a
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v5, 0x1

    if-ne v7, v5, :cond_1a

    sub-int v4, v2, v4

    neg-int v8, v8

    :cond_1a
    move v15, v4

    if-nez v1, :cond_1f

    iget-object v9, v0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    if-nez v9, :cond_1b

    goto :goto_e

    :cond_1b
    iput-boolean v5, v0, Lcom/facebook/react/views/scroll/b;->r:Z

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v10

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v11

    if-eqz v8, :cond_1c

    move v12, v8

    goto :goto_b

    :cond_1c
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v1

    sub-int v1, v15, v1

    move v12, v1

    :goto_b
    if-eqz v15, :cond_1e

    if-ne v15, v2, :cond_1d

    goto :goto_c

    :cond_1d
    move/from16 v18, v3

    goto :goto_d

    :cond_1e
    :goto_c
    div-int/lit8 v4, v6, 0x2

    move/from16 v18, v4

    :goto_d
    const/16 v19, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move v14, v15

    invoke-virtual/range {v9 .. v19}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_f

    :cond_1f
    :goto_e
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    invoke-virtual {v0, v15, v1}, Lcom/facebook/react/views/scroll/b;->c(II)V

    :goto_f
    return-void
.end method

.method private u(IIII)I
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

    iget p3, p0, Lcom/facebook/react/views/scroll/b;->K:I

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

.method private v(Landroid/view/View;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->a0:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->a0:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object p1, p0, Lcom/facebook/react/views/scroll/b;->a0:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroid/widget/HorizontalScrollView;->computeScrollDeltaToGetChildRectOnScreen(Landroid/graphics/Rect;)I

    move-result p1

    return p1
.end method

.method private x(II)V
    .locals 5

    .line 1
    sget-boolean v0, Lcom/facebook/react/views/scroll/b;->b0:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/react/views/scroll/b;->c0:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "handlePostTouchScrolling[%d] velocityX %d velocityY %d"

    invoke-static {v0, v4, v1, v2, v3}, LP0/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->w:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->B:Z

    if-eqz v0, :cond_2

    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/scroll/f;->g(Landroid/view/ViewGroup;II)V

    :cond_2
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->r:Z

    new-instance p1, Lcom/facebook/react/views/scroll/b$a;

    invoke-direct {p1, p0}, Lcom/facebook/react/views/scroll/b$a;-><init>(Lcom/facebook/react/views/scroll/b;)V

    iput-object p1, p0, Lcom/facebook/react/views/scroll/b;->w:Ljava/lang/Runnable;

    const-wide/16 v0, 0x14

    invoke-static {p0, p1, v0, v1}, Landroidx/core/view/H;->i0(Landroid/view/View;Ljava/lang/Runnable;J)V

    return-void
.end method

.method private y()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/b;->getContentView()Landroid/view/View;

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

.method private z(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/b;->v(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/b;->a0:Landroid/graphics/Rect;

    invoke-virtual {p1, v1}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->a0:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public A(Landroid/view/View;)Z
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/b;->v(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/b;->a0:Landroid/graphics/Rect;

    invoke-virtual {p1, v1}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    if-eqz v0, :cond_0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->a0:Landroid/graphics/Rect;

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

.method public G(IFF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->L:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/react/views/view/g;->f(IFF)V

    return-void
.end method

.method public H(FI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->L:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/views/view/g;->h(FI)V

    return-void
.end method

.method public I(IF)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->L:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/views/view/g;->j(IF)V

    return-void
.end method

.method public a(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->R:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->R:Landroid/animation/ValueAnimator;

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

    iget-object p1, p0, Lcom/facebook/react/views/scroll/b;->R:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public addFocusables(Ljava/util/ArrayList;II)V
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->v:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->M:Z

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-super {p0, v0, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    invoke-direct {p0, p3}, Lcom/facebook/react/views/scroll/b;->C(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p3}, Lcom/facebook/react/views/scroll/b;->A(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p3}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    :cond_3
    return-void
.end method

.method public arrowScroll(I)Z
    .locals 5

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->v:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->M:Z

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v1

    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v3

    invoke-virtual {v3, p0, v1, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/b;->getContentView()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-ne v4, v3, :cond_1

    invoke-direct {p0, v1}, Lcom/facebook/react/views/scroll/b;->C(Landroid/view/View;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-direct {p0, v1}, Lcom/facebook/react/views/scroll/b;->z(Landroid/view/View;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/b;->L(I)V

    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/b;->L(I)V

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    iput-boolean v2, p0, Lcom/facebook/react/views/scroll/b;->M:Z

    goto :goto_1

    :cond_3
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->arrowScroll(I)Z

    move-result v0

    :goto_1
    return v0
.end method

.method public b(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/scroll/b;->scrollTo(II)V

    const p2, 0x7fffffff

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/b;->E(II)V

    return-void
.end method

.method public c(II)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/facebook/react/views/scroll/f;->p(Landroid/view/ViewGroup;II)V

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/b;->J(II)V

    return-void
.end method

.method public canScrollHorizontally(I)Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->y:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->S:Lcom/facebook/react/uimanager/H;

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

    iget v0, p0, Lcom/facebook/react/views/scroll/b;->E:I

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/b;->getContentView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/b;->D:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/b;->D:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v1, v0, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->D:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public executeKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    iget-boolean v1, p0, Lcom/facebook/react/views/scroll/b;->y:Z

    if-nez v1, :cond_1

    const/16 v1, 0x15

    if-eq v0, v1, :cond_0

    const/16 v1, 0x16

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->executeKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public fling(I)V
    .locals 11

    sget-boolean v0, Lcom/facebook/react/views/scroll/b;->b0:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/react/views/scroll/b;->c0:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "fling[%d] velocityX %d"

    invoke-static {v0, v3, v1, v2}, LP0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    int-to-float p1, p1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->n:LK2/b;

    invoke-virtual {v0}, LK2/b;->a()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v0

    mul-float/2addr p1, v0

    float-to-int p1, p1

    :cond_1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->v:Z

    if-eqz v0, :cond_2

    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/b;->s(I)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-static {p0}, Landroidx/core/view/H;->G(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p0}, Landroidx/core/view/H;->F(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    div-int/lit8 v9, v0, 0x2

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x7fffffff

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, v1

    move v1, v2

    move v2, v3

    move v3, p1

    invoke-virtual/range {v0 .. v10}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    invoke-static {p0}, Landroidx/core/view/H;->g0(Landroid/view/View;)V

    goto :goto_0

    :cond_3
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->fling(I)V

    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/react/views/scroll/b;->x(II)V

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

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->s:Landroid/graphics/Rect;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method public getFlingAnimator()Landroid/animation/ValueAnimator;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->R:Landroid/animation/ValueAnimator;

    return-object v0
.end method

.method public getLastScrollDispatchTime()J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/react/views/scroll/b;->T:J

    return-wide v0
.end method

.method public getOverflow()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->t:Ljava/lang/String;

    return-object v0
.end method

.method public getOverflowInset()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->q:Landroid/graphics/Rect;

    return-object v0
.end method

.method public getPointerEvents()Lcom/facebook/react/uimanager/H;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->S:Lcom/facebook/react/uimanager/H;

    return-object v0
.end method

.method public getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->Q:Lcom/facebook/react/views/scroll/f$g;

    return-object v0
.end method

.method public getRemoveClippedSubviews()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->x:Z

    return v0
.end method

.method public getScrollEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->y:Z

    return v0
.end method

.method public getScrollEventThrottle()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/scroll/b;->U:I

    return v0
.end method

.method public getStateWrapper()Lcom/facebook/react/uimanager/d0;
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->P:Lcom/facebook/react/uimanager/d0;

    return-object v0
.end method

.method public k()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    :cond_0
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->x:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/b;->updateClippingRect()V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->W:Lcom/facebook/react/views/scroll/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/a;->f()V

    :cond_1
    return-void
.end method

.method public onChildViewAdded(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, Lcom/facebook/react/views/scroll/b;->V:Landroid/view/View;

    invoke-virtual {p2, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method public onChildViewRemoved(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/facebook/react/views/scroll/b;->V:Landroid/view/View;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/views/scroll/b;->V:Landroid/view/View;

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->W:Lcom/facebook/react/views/scroll/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/a;->g()V

    :cond_0
    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->L:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->d(Landroid/graphics/Canvas;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->y:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0, p1}, Lcom/facebook/react/views/scroll/b;->p(Landroid/view/View;Landroid/view/MotionEvent;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->S:Lcom/facebook/react/uimanager/H;

    invoke-static {v0}, Lcom/facebook/react/uimanager/H;->j(Lcom/facebook/react/uimanager/H;)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    return v2

    :cond_2
    :try_start_0
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/b;->w(Landroid/view/MotionEvent;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    move-exception p1

    const-string v0, "ReactNative"

    const-string v2, "Error intercepting touch event."

    invoke-static {v0, v2, p1}, LP0/a;->H(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return v1
.end method

.method protected onLayout(ZIIII)V
    .locals 1

    sget-boolean p1, Lcom/facebook/react/views/scroll/b;->b0:Z

    if-eqz p1, :cond_0

    sget-object p1, Lcom/facebook/react/views/scroll/b;->c0:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p5

    filled-new-array {v0, p2, p3, p4, p5}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "onLayout[%d] l %d t %d r %d b %d"

    invoke-static {p1, p3, p2}, LP0/a;->t(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget p1, p0, Lcom/facebook/react/views/scroll/b;->m:I

    sget p2, Lcom/facebook/react/views/scroll/b;->d0:I

    if-eq p1, p2, :cond_2

    iget-object p2, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Landroid/widget/OverScroller;->getFinalX()I

    move-result p2

    if-eq p1, p2, :cond_2

    iget-object p1, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p1

    if-nez p1, :cond_2

    sget-boolean p1, Lcom/facebook/react/views/scroll/b;->b0:Z

    if-eqz p1, :cond_1

    sget-object p1, Lcom/facebook/react/views/scroll/b;->c0:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget p3, p0, Lcom/facebook/react/views/scroll/b;->m:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const-string p4, "onLayout[%d] scroll hack enabled: reset to previous scrollX position of %d"

    invoke-static {p1, p4, p2, p3}, LP0/a;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    iget p2, p0, Lcom/facebook/react/views/scroll/b;->m:I

    invoke-virtual {p1}, Landroid/widget/OverScroller;->getFinalY()I

    move-result p3

    const/4 p4, 0x0

    invoke-virtual {p1, p2, p3, p4, p4}, Landroid/widget/OverScroller;->startScroll(IIII)V

    iget-object p1, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/OverScroller;->forceFinished(Z)V

    sget p1, Lcom/facebook/react/views/scroll/b;->d0:I

    iput p1, p0, Lcom/facebook/react/views/scroll/b;->m:I

    :cond_2
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/b;->y()Z

    move-result p1

    if-eqz p1, :cond_5

    iget p1, p0, Lcom/facebook/react/views/scroll/b;->N:I

    const/4 p2, -0x1

    if-eq p1, p2, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p1

    :goto_0
    iget p3, p0, Lcom/facebook/react/views/scroll/b;->O:I

    if-eq p3, p2, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p3

    :goto_1
    invoke-virtual {p0, p1, p3}, Lcom/facebook/react/views/scroll/b;->scrollTo(II)V

    :cond_5
    invoke-static {p0}, Lcom/facebook/react/views/scroll/f;->a(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    iget-object p3, p0, Lcom/facebook/react/views/scroll/b;->V:Landroid/view/View;

    if-nez p3, :cond_0

    return-void

    :cond_0
    invoke-static {}, Le2/a;->d()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    move-result p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/facebook/react/views/scroll/b;->Q:Lcom/facebook/react/views/scroll/f$g;

    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/f$g;->d()I

    move-result p1

    :goto_0
    const/4 p3, 0x1

    if-ne p1, p3, :cond_2

    invoke-direct {p0, p2, p4, p6, p8}, Lcom/facebook/react/views/scroll/b;->l(IIII)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/facebook/react/views/scroll/b;->W:Lcom/facebook/react/views/scroll/a;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/a;->h()V

    :cond_3
    :goto_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 5

    invoke-static {p1, p2}, Lcom/facebook/react/uimanager/A;->a(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    sget-boolean v0, Lcom/facebook/react/views/scroll/b;->b0:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/react/views/scroll/b;->c0:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "onMeasure[%d] measured width: %d measured height: %d"

    invoke-static {v0, v4, v1, v2, v3}, LP0/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    if-eq v0, p2, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/widget/OverScroller;->getCurrX()I

    move-result p1

    iput p1, p0, Lcom/facebook/react/views/scroll/b;->m:I

    :cond_2
    return-void
.end method

.method protected onOverScrolled(IIZZ)V
    .locals 6

    sget-boolean v0, Lcom/facebook/react/views/scroll/b;->b0:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/react/views/scroll/b;->c0:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "onOverScrolled[%d] scrollX %d scrollY %d clampedX %b clampedY %b"

    invoke-static {v0, v2, v1}, LP0/a;->t(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    move-result v0

    iget-object v1, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getFinalX()I

    move-result v1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->computeHorizontalScrollRange()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-lt p1, v0, :cond_1

    iget-object p1, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V

    move p1, v0

    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/HorizontalScrollView;->onOverScrolled(IIZZ)V

    return-void
.end method

.method protected onScrollChanged(IIII)V
    .locals 6

    sget-boolean v0, Lcom/facebook/react/views/scroll/b;->b0:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/react/views/scroll/b;->c0:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v1, v2, v3, v4, v5}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "onScrollChanged[%d] x %d y %d oldx %d oldy %d"

    invoke-static {v0, v2, v1}, LP0/a;->t(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onScrollChanged(IIII)V

    const/4 p3, 0x1

    iput-boolean p3, p0, Lcom/facebook/react/views/scroll/b;->r:Z

    iget-object p4, p0, Lcom/facebook/react/views/scroll/b;->n:LK2/b;

    invoke-virtual {p4, p1, p2}, LK2/b;->c(II)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->x:Z

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/b;->updateClippingRect()V

    :cond_1
    iget-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->z:Z

    if-eqz p1, :cond_2

    return-void

    :cond_2
    iput-boolean p3, p0, Lcom/facebook/react/views/scroll/b;->z:Z

    iget-object p1, p0, Lcom/facebook/react/views/scroll/b;->n:LK2/b;

    invoke-virtual {p1}, LK2/b;->a()F

    move-result p1

    iget-object p2, p0, Lcom/facebook/react/views/scroll/b;->n:LK2/b;

    invoke-virtual {p2}, LK2/b;->b()F

    move-result p2

    iget-boolean p3, p0, Lcom/facebook/react/views/scroll/b;->A:Z

    invoke-static {p0, p1, p2, p3}, Lcom/facebook/react/views/scroll/f;->s(Landroid/view/ViewGroup;FFZ)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->z:Z

    :cond_3
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/HorizontalScrollView;->onSizeChanged(IIII)V

    iget-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->x:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/b;->updateClippingRect()V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->y:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->S:Lcom/facebook/react/uimanager/H;

    invoke-static {v0}, Lcom/facebook/react/uimanager/H;->h(Lcom/facebook/react/uimanager/H;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->p:Lcom/facebook/react/views/scroll/i;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/i;->a(Landroid/view/MotionEvent;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    iget-boolean v2, p0, Lcom/facebook/react/views/scroll/b;->u:Z

    if-eqz v2, :cond_2

    invoke-static {p0}, Lcom/facebook/react/views/scroll/f;->q(Landroid/view/ViewGroup;)V

    iget-object v2, p0, Lcom/facebook/react/views/scroll/b;->p:Lcom/facebook/react/views/scroll/i;

    invoke-virtual {v2}, Lcom/facebook/react/views/scroll/i;->b()F

    move-result v2

    iget-object v3, p0, Lcom/facebook/react/views/scroll/b;->p:Lcom/facebook/react/views/scroll/i;

    invoke-virtual {v3}, Lcom/facebook/react/views/scroll/i;->c()F

    move-result v3

    invoke-static {p0, v2, v3}, Lcom/facebook/react/views/scroll/f;->c(Landroid/view/ViewGroup;FF)V

    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/events/m;->a(Landroid/view/View;Landroid/view/MotionEvent;)V

    iput-boolean v1, p0, Lcom/facebook/react/views/scroll/b;->u:Z

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-direct {p0, v1, v2}, Lcom/facebook/react/views/scroll/b;->x(II)V

    :cond_2
    if-nez v0, :cond_3

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/b;->m()V

    :cond_3
    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public pageScroll(I)Z
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/HorizontalScrollView;->pageScroll(I)Z

    move-result p1

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->v:Z

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0}, Lcom/facebook/react/views/scroll/b;->x(II)V

    :cond_0
    return p1
.end method

.method public r()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    return-void
.end method

.method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    if-eqz p2, :cond_0

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->v:Z

    if-nez v0, :cond_0

    invoke-direct {p0, p2}, Lcom/facebook/react/views/scroll/b;->F(Landroid/view/View;)V

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/HorizontalScrollView;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public scrollTo(II)V
    .locals 5

    sget-boolean v0, Lcom/facebook/react/views/scroll/b;->b0:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/facebook/react/views/scroll/b;->c0:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "scrollTo[%d] x %d y %d"

    invoke-static {v0, v4, v1, v2, v3}, LP0/a;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/HorizontalScrollView;->scrollTo(II)V

    invoke-static {p0}, Lcom/facebook/react/views/scroll/f;->q(Landroid/view/ViewGroup;)V

    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/b;->J(II)V

    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->L:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->e(I)V

    return-void
.end method

.method public setBorderRadius(F)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->L:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->g(F)V

    return-void
.end method

.method public setBorderStyle(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->L:Lcom/facebook/react/views/view/g;

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->i(Ljava/lang/String;)V

    return-void
.end method

.method public setDecelerationRate(F)V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/b;->getReactScrollViewScrollState()Lcom/facebook/react/views/scroll/f$g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/f$g;->i(F)V

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->o:Landroid/widget/OverScroller;

    if-eqz v0, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/OverScroller;->setFriction(F)V

    :cond_0
    return-void
.end method

.method public setDisableIntervalMomentum(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->F:Z

    return-void
.end method

.method public setEnableSyncOnScroll(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->A:Z

    return-void
.end method

.method public setEndFillColor(I)V
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/scroll/b;->E:I

    if-eq p1, v0, :cond_0

    iput p1, p0, Lcom/facebook/react/views/scroll/b;->E:I

    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    iget v0, p0, Lcom/facebook/react/views/scroll/b;->E:I

    invoke-direct {p1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object p1, p0, Lcom/facebook/react/views/scroll/b;->D:Landroid/graphics/drawable/Drawable;

    :cond_0
    return-void
.end method

.method public setLastScrollDispatchTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/facebook/react/views/scroll/b;->T:J

    return-void
.end method

.method public setMaintainVisibleContentPosition(Lcom/facebook/react/views/scroll/a$b;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->W:Lcom/facebook/react/views/scroll/a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/facebook/react/views/scroll/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/facebook/react/views/scroll/a;-><init>(Landroid/view/ViewGroup;Z)V

    iput-object v0, p0, Lcom/facebook/react/views/scroll/b;->W:Lcom/facebook/react/views/scroll/a;

    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/a;->f()V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->W:Lcom/facebook/react/views/scroll/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/a;->g()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/views/scroll/b;->W:Lcom/facebook/react/views/scroll/a;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->W:Lcom/facebook/react/views/scroll/a;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/a;->e(Lcom/facebook/react/views/scroll/a$b;)V

    :cond_2
    return-void
.end method

.method public setOverflow(Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/facebook/react/views/scroll/b;->t:Ljava/lang/String;

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->L:Lcom/facebook/react/views/view/g;

    if-nez p1, :cond_0

    const-string p1, "scroll"

    :cond_0
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/view/g;->k(Ljava/lang/String;)V

    return-void
.end method

.method public setOverflowInset(IIII)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->q:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public setPagingEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->v:Z

    return-void
.end method

.method public setPointerEvents(Lcom/facebook/react/uimanager/H;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/scroll/b;->S:Lcom/facebook/react/uimanager/H;

    return-void
.end method

.method public setRemoveClippedSubviews(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->s:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/facebook/react/views/scroll/b;->s:Landroid/graphics/Rect;

    :cond_0
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->x:Z

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/b;->updateClippingRect()V

    return-void
.end method

.method public setScrollEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->y:Z

    return-void
.end method

.method public setScrollEventThrottle(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/react/views/scroll/b;->U:I

    return-void
.end method

.method public setScrollPerfTag(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/scroll/b;->C:Ljava/lang/String;

    return-void
.end method

.method public setSendMomentumEvents(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->B:Z

    return-void
.end method

.method public setSnapInterval(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/react/views/scroll/b;->G:I

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

    iput-object p1, p0, Lcom/facebook/react/views/scroll/b;->H:Ljava/util/List;

    return-void
.end method

.method public setSnapToAlignment(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/react/views/scroll/b;->K:I

    return-void
.end method

.method public setSnapToEnd(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->J:Z

    return-void
.end method

.method public setSnapToStart(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->I:Z

    return-void
.end method

.method public setStateWrapper(Lcom/facebook/react/uimanager/d0;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/scroll/b;->P:Lcom/facebook/react/uimanager/d0;

    return-void
.end method

.method public t(I)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->computeHorizontalScrollRange()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {p0, p1, v1, v0, v1}, Lcom/facebook/react/views/scroll/f;->n(Landroid/view/ViewGroup;IIII)Landroid/graphics/Point;

    move-result-object p1

    iget p1, p1, Landroid/graphics/Point;->x:I

    return p1
.end method

.method public updateClippingRect()V
    .locals 2

    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/b;->x:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->s:Landroid/graphics/Rect;

    invoke-static {v0}, LO1/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/facebook/react/views/scroll/b;->s:Landroid/graphics/Rect;

    invoke-static {p0, v0}, Lcom/facebook/react/uimanager/L;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/b;->getContentView()Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Lcom/facebook/react/uimanager/K;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/facebook/react/uimanager/K;

    invoke-interface {v0}, Lcom/facebook/react/uimanager/K;->updateClippingRect()V

    :cond_1
    return-void
.end method

.method protected w(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/uimanager/events/m;->b(Landroid/view/View;Landroid/view/MotionEvent;)V

    invoke-static {p0}, Lcom/facebook/react/views/scroll/f;->b(Landroid/view/ViewGroup;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/b;->u:Z

    invoke-direct {p0}, Lcom/facebook/react/views/scroll/b;->o()V

    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/b;->getFlingAnimator()Landroid/animation/ValueAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    return-void
.end method
