.class public final Lcom/swmansion/rnscreens/l;
.super Lcom/swmansion/rnscreens/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/l$a;,
        Lcom/swmansion/rnscreens/l$b;,
        Lcom/swmansion/rnscreens/l$c;,
        Lcom/swmansion/rnscreens/l$d;,
        Lcom/swmansion/rnscreens/l$e;
    }
.end annotation


# instance fields
.field private A:Ljava/lang/Integer;

.field private B:Ljava/lang/Integer;

.field private C:Ljava/lang/Boolean;

.field private D:Ljava/lang/Boolean;

.field private E:Z

.field private m:Lcom/swmansion/rnscreens/r;

.field private n:Lcom/swmansion/rnscreens/n;

.field private o:Lcom/swmansion/rnscreens/l$a;

.field private p:Z

.field private q:Lcom/swmansion/rnscreens/l$d;

.field private r:Lcom/swmansion/rnscreens/l$b;

.field private s:Lcom/swmansion/rnscreens/l$c;

.field private t:Z

.field private u:Ljava/lang/Integer;

.field private v:Ljava/lang/Boolean;

.field private w:Z

.field private x:Ljava/lang/String;

.field private y:Ljava/lang/Boolean;

.field private z:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/e;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    sget-object p1, Lcom/swmansion/rnscreens/l$d;->m:Lcom/swmansion/rnscreens/l$d;

    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->q:Lcom/swmansion/rnscreens/l$d;

    sget-object p1, Lcom/swmansion/rnscreens/l$b;->n:Lcom/swmansion/rnscreens/l$b;

    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->r:Lcom/swmansion/rnscreens/l$b;

    sget-object p1, Lcom/swmansion/rnscreens/l$c;->m:Lcom/swmansion/rnscreens/l$c;

    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->s:Lcom/swmansion/rnscreens/l$c;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/l;->t:Z

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Landroid/view/WindowManager$LayoutParams;-><init>(I)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/l;->E:Z

    return-void
.end method

.method private final a()Li5/l;
    .locals 9

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x10102eb

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v0, v2}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v2, 0x0

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/l;->getHeaderConfig()Lcom/swmansion/rnscreens/x;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/x;->f()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-ne v1, v3, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/l;->getHeaderConfig()Lcom/swmansion/rnscreens/x;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/x;->g()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-ne v1, v3, :cond_2

    .line 67
    .line 68
    :cond_1
    :goto_0
    move-object v0, v2

    .line 69
    :cond_2
    const-wide/16 v3, 0x0

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    int-to-float v0, v0

    .line 78
    invoke-static {v0}, Lcom/facebook/react/uimanager/G;->b(F)F

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    float-to-double v0, v0

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    move-wide v0, v3

    .line 85
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    const-string v6, "dimen"

    .line 94
    .line 95
    const-string v7, "android"

    .line 96
    .line 97
    const-string v8, "status_bar_height"

    .line 98
    .line 99
    invoke-virtual {v5, v8, v6, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-lez v6, :cond_4

    .line 112
    .line 113
    iget-object v6, p0, Lcom/swmansion/rnscreens/l;->y:Ljava/lang/Boolean;

    .line 114
    .line 115
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-static {v6, v7}, Lw5/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-nez v6, :cond_4

    .line 122
    .line 123
    cmpl-double v6, v0, v3

    .line 124
    .line 125
    if-lez v6, :cond_4

    .line 126
    .line 127
    move-object v2, v5

    .line 128
    :cond_4
    if-eqz v2, :cond_5

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    int-to-float v2, v2

    .line 147
    invoke-static {v2}, Lcom/facebook/react/uimanager/G;->b(F)F

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    float-to-double v3, v2

    .line 152
    :cond_5
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    return-object v0
.end method

.method private final c(Landroid/view/ViewGroup;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v4, v3, Landroid/webkit/WebView;

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    return v5

    :cond_0
    instance-of v4, v3, Landroid/view/ViewGroup;

    if-eqz v4, :cond_1

    check-cast v3, Landroid/view/ViewGroup;

    invoke-direct {p0, v3}, Lcom/swmansion/rnscreens/l;->c(Landroid/view/ViewGroup;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v5

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method private final j(D)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    invoke-static {v0}, Lcom/facebook/react/uimanager/k0;->e(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-static {v0, v2}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v2, Lc5/d;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v3

    invoke-direct {v2, v1, v3, p1, p2}, Lc5/d;-><init>(IID)V

    invoke-interface {v0, v2}, Lcom/facebook/react/uimanager/events/e;->c(Lcom/facebook/react/uimanager/events/d;)V

    :cond_0
    return-void
.end method

.method private final l(Landroid/view/ViewGroup;)V
    .locals 5

    .line 1
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "CircleImageView"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_1

    :cond_0
    invoke-static {v2}, Lw5/k;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    :goto_1
    instance-of v3, v2, Lcom/swmansion/rnscreens/x;

    if-eqz v3, :cond_1

    move-object v3, v2

    check-cast v3, Lcom/swmansion/rnscreens/x;

    invoke-virtual {v3}, Lcom/swmansion/rnscreens/x;->getToolbar()Lcom/swmansion/rnscreens/d;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/swmansion/rnscreens/l;->l(Landroid/view/ViewGroup;)V

    :cond_1
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_2

    check-cast v2, Landroid/view/ViewGroup;

    invoke-direct {p0, v2}, Lcom/swmansion/rnscreens/l;->l(Landroid/view/ViewGroup;)V

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private final m(II)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    invoke-static {v0, v1}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getExceptionHandler()Lcom/facebook/react/bridge/JSExceptionHandler;

    move-result-object v7

    new-instance v1, Lcom/swmansion/rnscreens/l$f;

    move-object v2, v1

    move-object v3, v0

    move-object v4, p0

    move v5, p1

    move v6, p2

    invoke-direct/range {v2 .. v7}, Lcom/swmansion/rnscreens/l$f;-><init>(Lcom/facebook/react/bridge/ReactContext;Lcom/swmansion/rnscreens/l;IILcom/facebook/react/bridge/JSExceptionHandler;)V

    invoke-virtual {v0, v1}, Lcom/facebook/react/bridge/ReactContext;->runOnNativeModulesQueueThread(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final b(I)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    invoke-virtual {p0}, Lcom/swmansion/rnscreens/l;->getHeaderConfig()Lcom/swmansion/rnscreens/x;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/x;->getToolbar()Lcom/swmansion/rnscreens/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    :goto_1
    return-void
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/l;->w:Z

    return v0
.end method

.method protected dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final e()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->D:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final f()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->C:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final g()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->v:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getActivityState()Lcom/swmansion/rnscreens/l$a;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->o:Lcom/swmansion/rnscreens/l$a;

    return-object v0
.end method

.method public final getContainer()Lcom/swmansion/rnscreens/n;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->n:Lcom/swmansion/rnscreens/n;

    return-object v0
.end method

.method public final getFragment()Landroidx/fragment/app/Fragment;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->m:Lcom/swmansion/rnscreens/r;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/swmansion/rnscreens/g;->e()Landroidx/fragment/app/Fragment;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getFragmentWrapper()Lcom/swmansion/rnscreens/r;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->m:Lcom/swmansion/rnscreens/r;

    return-object v0
.end method

.method public final getHeaderConfig()Lcom/swmansion/rnscreens/x;
    .locals 4

    invoke-static {p0}, Landroidx/core/view/L;->a(Landroid/view/ViewGroup;)LE5/d;

    move-result-object v0

    invoke-interface {v0}, LE5/d;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/view/View;

    instance-of v3, v3, Lcom/swmansion/rnscreens/x;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    instance-of v0, v1, Lcom/swmansion/rnscreens/x;

    if-eqz v0, :cond_2

    move-object v2, v1

    check-cast v2, Lcom/swmansion/rnscreens/x;

    :cond_2
    return-object v2
.end method

.method public final getNativeBackButtonDismissalEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/l;->E:Z

    return v0
.end method

.method public final getNavigationBarColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->B:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getReplaceAnimation()Lcom/swmansion/rnscreens/l$b;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->r:Lcom/swmansion/rnscreens/l$b;

    return-object v0
.end method

.method public final getScreenOrientation()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->u:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getStackAnimation()Lcom/swmansion/rnscreens/l$c;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->s:Lcom/swmansion/rnscreens/l$c;

    return-object v0
.end method

.method public final getStackPresentation()Lcom/swmansion/rnscreens/l$d;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->q:Lcom/swmansion/rnscreens/l$d;

    return-object v0
.end method

.method public final getStatusBarColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->A:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getStatusBarStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->x:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->y:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final i()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->z:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final k()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/l;->w:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/swmansion/rnscreens/l;->w:Z

    invoke-direct {p0, p0}, Lcom/swmansion/rnscreens/l;->l(Landroid/view/ViewGroup;)V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 2

    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->n:Lcom/swmansion/rnscreens/n;

    instance-of v0, v0, Lcom/swmansion/rnscreens/t;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    invoke-direct {p0}, Lcom/swmansion/rnscreens/l;->a()Li5/l;

    move-result-object p1

    invoke-virtual {p1}, Li5/l;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p2

    invoke-virtual {p1}, Li5/l;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    add-double/2addr p2, v0

    invoke-direct {p0, p4, p5}, Lcom/swmansion/rnscreens/l;->m(II)V

    invoke-direct {p0, p2, p3}, Lcom/swmansion/rnscreens/l;->j(D)V

    :cond_0
    return-void
.end method

.method public final setActivityState(Lcom/swmansion/rnscreens/l$a;)V
    .locals 1

    const-string v0, "activityState"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/swmansion/rnscreens/l;->o:Lcom/swmansion/rnscreens/l$a;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->o:Lcom/swmansion/rnscreens/l$a;

    iget-object p1, p0, Lcom/swmansion/rnscreens/l;->n:Lcom/swmansion/rnscreens/n;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/swmansion/rnscreens/n;->o()V

    :cond_1
    return-void
.end method

.method public final setBeingRemoved(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/l;->w:Z

    return-void
.end method

.method public final setContainer(Lcom/swmansion/rnscreens/n;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->n:Lcom/swmansion/rnscreens/n;

    return-void
.end method

.method public final setFragmentWrapper(Lcom/swmansion/rnscreens/r;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->m:Lcom/swmansion/rnscreens/r;

    return-void
.end method

.method public final setGestureEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/l;->t:Z

    return-void
.end method

.method public setLayerType(ILandroid/graphics/Paint;)V
    .locals 0

    return-void
.end method

.method public final setNativeBackButtonDismissalEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/swmansion/rnscreens/l;->E:Z

    return-void
.end method

.method public final setNavigationBarColor(Ljava/lang/Integer;)V
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/C;->d()V

    :cond_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->B:Ljava/lang/Integer;

    iget-object p1, p0, Lcom/swmansion/rnscreens/l;->m:Lcom/swmansion/rnscreens/r;

    if-eqz p1, :cond_1

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lcom/swmansion/rnscreens/C;->p(Lcom/swmansion/rnscreens/l;Landroid/app/Activity;)V

    :cond_1
    return-void
.end method

.method public final setNavigationBarHidden(Ljava/lang/Boolean;)V
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/C;->d()V

    :cond_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->D:Ljava/lang/Boolean;

    iget-object p1, p0, Lcom/swmansion/rnscreens/l;->m:Lcom/swmansion/rnscreens/r;

    if-eqz p1, :cond_1

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lcom/swmansion/rnscreens/C;->q(Lcom/swmansion/rnscreens/l;Landroid/app/Activity;)V

    :cond_1
    return-void
.end method

.method public final setNavigationBarTranslucent(Ljava/lang/Boolean;)V
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/C;->d()V

    :cond_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->C:Ljava/lang/Boolean;

    iget-object p1, p0, Lcom/swmansion/rnscreens/l;->m:Lcom/swmansion/rnscreens/r;

    if-eqz p1, :cond_1

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lcom/swmansion/rnscreens/C;->r(Lcom/swmansion/rnscreens/l;Landroid/app/Activity;)V

    :cond_1
    return-void
.end method

.method public final setReplaceAnimation(Lcom/swmansion/rnscreens/l$b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->r:Lcom/swmansion/rnscreens/l$b;

    return-void
.end method

.method public final setScreenOrientation(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->u:Ljava/lang/Integer;

    return-void

    :cond_0
    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/C;->e()V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v1, "landscape_right"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_2

    :sswitch_1
    const-string v1, "landscape_left"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/16 p1, 0x8

    goto :goto_0

    :sswitch_2
    const-string v1, "portrait_up"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    goto :goto_0

    :sswitch_3
    const-string v1, "landscape"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    const/4 p1, 0x6

    goto :goto_0

    :sswitch_4
    const-string v1, "portrait"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    const/4 p1, 0x7

    goto :goto_0

    :sswitch_5
    const-string v1, "all"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    const/16 p1, 0xa

    goto :goto_0

    :sswitch_6
    const-string v1, "portrait_down"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    :goto_1
    const/4 p1, -0x1

    goto :goto_0

    :cond_7
    const/16 p1, 0x9

    goto :goto_0

    :goto_2
    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->u:Ljava/lang/Integer;

    iget-object p1, p0, Lcom/swmansion/rnscreens/l;->m:Lcom/swmansion/rnscreens/r;

    if-eqz p1, :cond_8

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lcom/swmansion/rnscreens/C;->s(Lcom/swmansion/rnscreens/l;Landroid/app/Activity;)V

    :cond_8
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x70f1d53a -> :sswitch_6
        0x179a1 -> :sswitch_5
        0x2b77bb9b -> :sswitch_4
        0x5545f2bb -> :sswitch_3
        0x62724dbf -> :sswitch_2
        0x6728e30b -> :sswitch_1
        0x7e49df98 -> :sswitch_0
    .end sparse-switch
.end method

.method public final setStackAnimation(Lcom/swmansion/rnscreens/l$c;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->s:Lcom/swmansion/rnscreens/l$c;

    return-void
.end method

.method public final setStackPresentation(Lcom/swmansion/rnscreens/l$d;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->q:Lcom/swmansion/rnscreens/l$d;

    return-void
.end method

.method public final setStatusBarAnimated(Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->v:Ljava/lang/Boolean;

    return-void
.end method

.method public final setStatusBarColor(Ljava/lang/Integer;)V
    .locals 2

    if-eqz p1, :cond_0

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/C;->f()V

    :cond_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->A:Ljava/lang/Integer;

    iget-object p1, p0, Lcom/swmansion/rnscreens/l;->m:Lcom/swmansion/rnscreens/r;

    if-eqz p1, :cond_1

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->d()Landroid/app/Activity;

    move-result-object v1

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->f()Lcom/facebook/react/bridge/ReactContext;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/swmansion/rnscreens/C;->l(Lcom/swmansion/rnscreens/l;Landroid/app/Activity;Lcom/facebook/react/bridge/ReactContext;)V

    :cond_1
    return-void
.end method

.method public final setStatusBarHidden(Ljava/lang/Boolean;)V
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/C;->f()V

    :cond_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->y:Ljava/lang/Boolean;

    iget-object p1, p0, Lcom/swmansion/rnscreens/l;->m:Lcom/swmansion/rnscreens/r;

    if-eqz p1, :cond_1

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->d()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lcom/swmansion/rnscreens/C;->n(Lcom/swmansion/rnscreens/l;Landroid/app/Activity;)V

    :cond_1
    return-void
.end method

.method public final setStatusBarStyle(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/C;->f()V

    :cond_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->x:Ljava/lang/String;

    iget-object p1, p0, Lcom/swmansion/rnscreens/l;->m:Lcom/swmansion/rnscreens/r;

    if-eqz p1, :cond_1

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->d()Landroid/app/Activity;

    move-result-object v1

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->f()Lcom/facebook/react/bridge/ReactContext;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/swmansion/rnscreens/C;->u(Lcom/swmansion/rnscreens/l;Landroid/app/Activity;Lcom/facebook/react/bridge/ReactContext;)V

    :cond_1
    return-void
.end method

.method public final setStatusBarTranslucent(Ljava/lang/Boolean;)V
    .locals 2

    if-eqz p1, :cond_0

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-virtual {v0}, Lcom/swmansion/rnscreens/C;->f()V

    :cond_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/l;->z:Ljava/lang/Boolean;

    iget-object p1, p0, Lcom/swmansion/rnscreens/l;->m:Lcom/swmansion/rnscreens/r;

    if-eqz p1, :cond_1

    sget-object v0, Lcom/swmansion/rnscreens/C;->a:Lcom/swmansion/rnscreens/C;

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->d()Landroid/app/Activity;

    move-result-object v1

    invoke-interface {p1}, Lcom/swmansion/rnscreens/r;->f()Lcom/facebook/react/bridge/ReactContext;

    move-result-object p1

    invoke-virtual {v0, p0, v1, p1}, Lcom/swmansion/rnscreens/C;->v(Lcom/swmansion/rnscreens/l;Landroid/app/Activity;Lcom/facebook/react/bridge/ReactContext;)V

    :cond_1
    return-void
.end method

.method public final setTransitioning(Z)V
    .locals 3

    iget-boolean v0, p0, Lcom/swmansion/rnscreens/l;->p:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/l;->p:Z

    invoke-direct {p0, p0}, Lcom/swmansion/rnscreens/l;->c(Landroid/view/ViewGroup;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getLayerType()I

    move-result v2

    if-eq v2, v1, :cond_1

    return-void

    :cond_1
    if-eqz p1, :cond_2

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    const/4 p1, 0x0

    invoke-super {p0, v1, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method
