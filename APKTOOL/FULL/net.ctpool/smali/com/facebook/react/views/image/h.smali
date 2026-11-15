.class public Lcom/facebook/react/views/image/h;
.super Ln1/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/image/h$b;
    }
.end annotation


# static fields
.field private static T:[F

.field private static final U:Landroid/graphics/Matrix;


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:F

.field private E:F

.field private F:[F

.field private G:Lj1/p$b;

.field private H:Landroid/graphics/Shader$TileMode;

.field private I:Z

.field private final J:Lg1/b;

.field private K:Lcom/facebook/react/views/image/h$b;

.field private L:LI1/a;

.field private M:Lcom/facebook/react/views/image/g;

.field private N:Lg1/d;

.field private O:Ljava/lang/Object;

.field private P:I

.field private Q:Z

.field private R:Lcom/facebook/react/bridge/ReadableMap;

.field private S:F

.field private t:Lcom/facebook/react/views/image/c;

.field private final u:Ljava/util/List;

.field private v:LJ2/a;

.field private w:LJ2/a;

.field private x:Landroid/graphics/drawable/Drawable;

.field private y:Landroid/graphics/drawable/Drawable;

.field private z:Lj1/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [F

    sput-object v0, Lcom/facebook/react/views/image/h;->T:[F

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sput-object v0, Lcom/facebook/react/views/image/h;->U:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lg1/b;Lcom/facebook/react/views/image/a;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/facebook/react/views/image/h;->k(Landroid/content/Context;)Lk1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-direct {p0, p1, p3}, Ln1/d;-><init>(Landroid/content/Context;Lk1/a;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Lcom/facebook/react/views/image/c;->m:Lcom/facebook/react/views/image/c;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->t:Lcom/facebook/react/views/image/c;

    .line 11
    .line 12
    new-instance p1, Ljava/util/LinkedList;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->u:Ljava/util/List;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput p1, p0, Lcom/facebook/react/views/image/h;->A:I

    .line 21
    .line 22
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 23
    .line 24
    iput p1, p0, Lcom/facebook/react/views/image/h;->E:F

    .line 25
    .line 26
    invoke-static {}, Lcom/facebook/react/views/image/d;->b()Lj1/p$b;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->G:Lj1/p$b;

    .line 31
    .line 32
    invoke-static {}, Lcom/facebook/react/views/image/d;->a()Landroid/graphics/Shader$TileMode;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->H:Landroid/graphics/Shader$TileMode;

    .line 37
    .line 38
    const/4 p1, -0x1

    .line 39
    iput p1, p0, Lcom/facebook/react/views/image/h;->P:I

    .line 40
    .line 41
    const/high16 p1, 0x3f800000    # 1.0f

    .line 42
    .line 43
    iput p1, p0, Lcom/facebook/react/views/image/h;->S:F

    .line 44
    .line 45
    iput-object p2, p0, Lcom/facebook/react/views/image/h;->J:Lg1/b;

    .line 46
    .line 47
    iput-object p4, p0, Lcom/facebook/react/views/image/h;->O:Ljava/lang/Object;

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    invoke-virtual {p0, p1}, Ln1/c;->setLegacyVisibilityHandlingEnabled(Z)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method static bridge synthetic g(Lcom/facebook/react/views/image/h;)LJ2/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/views/image/h;->v:LJ2/a;

    return-object p0
.end method

.method private getResizeOptions()Lx1/f;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    iget v1, p0, Lcom/facebook/react/views/image/h;->S:F

    .line 7
    .line 8
    mul-float/2addr v0, v1

    .line 9
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    int-to-float v1, v1

    .line 18
    iget v2, p0, Lcom/facebook/react/views/image/h;->S:F

    .line 19
    .line 20
    mul-float/2addr v1, v2

    .line 21
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lez v0, :cond_1

    .line 26
    .line 27
    if-gtz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v2, Lx1/f;

    .line 31
    .line 32
    invoke-direct {v2, v0, v1}, Lx1/f;-><init>(II)V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 37
    return-object v0
.end method

.method static bridge synthetic h(Lcom/facebook/react/views/image/h;)Lj1/p$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/views/image/h;->G:Lj1/p$b;

    return-object p0
.end method

.method static bridge synthetic i(Lcom/facebook/react/views/image/h;)Landroid/graphics/Shader$TileMode;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/views/image/h;->H:Landroid/graphics/Shader$TileMode;

    return-object p0
.end method

.method static bridge synthetic j()Landroid/graphics/Matrix;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/image/h;->U:Landroid/graphics/Matrix;

    return-object v0
.end method

.method private static k(Landroid/content/Context;)Lk1/a;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lk1/d;->a(F)Lk1/d;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Lk1/d;->q(Z)Lk1/d;

    .line 8
    .line 9
    .line 10
    new-instance v1, Lk1/b;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-direct {v1, p0}, Lk1/b;-><init>(Landroid/content/res/Resources;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lk1/b;->u(Lk1/d;)Lk1/b;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lk1/b;->a()Lk1/a;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method private l([F)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/facebook/react/views/image/h;->E:F

    invoke-static {v0}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/facebook/react/views/image/h;->E:F

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/facebook/react/views/image/h;->F:[F

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    aget v1, v1, v2

    invoke-static {v1}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/facebook/react/views/image/h;->F:[F

    aget v1, v1, v2

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    aput v1, p1, v2

    iget-object v1, p0, Lcom/facebook/react/views/image/h;->F:[F

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    aget v1, v1, v2

    invoke-static {v1}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/facebook/react/views/image/h;->F:[F

    aget v1, v1, v2

    goto :goto_2

    :cond_2
    move v1, v0

    :goto_2
    aput v1, p1, v2

    iget-object v1, p0, Lcom/facebook/react/views/image/h;->F:[F

    const/4 v2, 0x2

    if-eqz v1, :cond_3

    aget v1, v1, v2

    invoke-static {v1}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/facebook/react/views/image/h;->F:[F

    aget v1, v1, v2

    goto :goto_3

    :cond_3
    move v1, v0

    :goto_3
    aput v1, p1, v2

    iget-object v1, p0, Lcom/facebook/react/views/image/h;->F:[F

    const/4 v2, 0x3

    if-eqz v1, :cond_4

    aget v1, v1, v2

    invoke-static {v1}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v0, p0, Lcom/facebook/react/views/image/h;->F:[F

    aget v0, v0, v2

    :cond_4
    aput v0, p1, v2

    return-void
.end method

.method private m()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private n()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->H:Landroid/graphics/Shader$TileMode;

    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private q()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/views/image/h;->v:LJ2/a;

    iget-object v0, p0, Lcom/facebook/react/views/image/h;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/react/views/image/h;->u:Ljava/util/List;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, LJ2/a;->e(Landroid/content/Context;)LJ2/a;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/facebook/react/views/image/h;->u:Ljava/util/List;

    invoke-static {v0, v1, v2}, LJ2/b;->a(IILjava/util/List;)LJ2/b$a;

    move-result-object v0

    iget-object v1, v0, LJ2/b$a;->a:LJ2/a;

    iput-object v1, p0, Lcom/facebook/react/views/image/h;->v:LJ2/a;

    iget-object v0, v0, LJ2/b$a;->b:LJ2/a;

    iput-object v0, p0, Lcom/facebook/react/views/image/h;->w:LJ2/a;

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->u:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ2/a;

    iput-object v0, p0, Lcom/facebook/react/views/image/h;->v:LJ2/a;

    return-void
.end method

.method private r(LJ2/a;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->t:Lcom/facebook/react/views/image/c;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/react/views/image/c;->m:Lcom/facebook/react/views/image/c;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-ne v0, v1, :cond_2

    .line 8
    .line 9
    invoke-virtual {p1}, LJ2/a;->f()Landroid/net/Uri;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, LW0/f;->k(Landroid/net/Uri;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, LJ2/a;->f()Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1}, LW0/f;->l(Landroid/net/Uri;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v2, v3

    .line 31
    :cond_1
    :goto_0
    return v2

    .line 32
    :cond_2
    sget-object p1, Lcom/facebook/react/views/image/c;->n:Lcom/facebook/react/views/image/c;

    .line 33
    .line 34
    if-ne v0, p1, :cond_3

    .line 35
    .line 36
    return v2

    .line 37
    :cond_3
    return v3
.end method

.method private s(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public getImageSource()LJ2/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->v:LJ2/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o()V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/image/h;->I:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->m()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-gtz v0, :cond_2

    :cond_1
    return-void

    :cond_2
    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->q()V

    iget-object v0, p0, Lcom/facebook/react/views/image/h;->v:LJ2/a;

    if-nez v0, :cond_3

    return-void

    :cond_3
    invoke-direct {p0, v0}, Lcom/facebook/react/views/image/h;->r(LJ2/a;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-lez v1, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-gtz v1, :cond_5

    :cond_4
    return-void

    :cond_5
    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->n()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    if-lez v1, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    if-gtz v1, :cond_7

    :cond_6
    return-void

    :cond_7
    invoke-virtual {p0}, Ln1/c;->getHierarchy()Lm1/b;

    move-result-object v1

    check-cast v1, Lk1/a;

    iget-object v2, p0, Lcom/facebook/react/views/image/h;->G:Lj1/p$b;

    invoke-virtual {v1, v2}, Lk1/a;->v(Lj1/p$b;)V

    iget-object v2, p0, Lcom/facebook/react/views/image/h;->x:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_8

    iget-object v3, p0, Lcom/facebook/react/views/image/h;->G:Lj1/p$b;

    invoke-virtual {v1, v2, v3}, Lk1/a;->z(Landroid/graphics/drawable/Drawable;Lj1/p$b;)V

    :cond_8
    iget-object v2, p0, Lcom/facebook/react/views/image/h;->y:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_9

    sget-object v3, Lj1/p$b;->g:Lj1/p$b;

    invoke-virtual {v1, v2, v3}, Lk1/a;->z(Landroid/graphics/drawable/Drawable;Lj1/p$b;)V

    :cond_9
    sget-object v2, Lcom/facebook/react/views/image/h;->T:[F

    invoke-direct {p0, v2}, Lcom/facebook/react/views/image/h;->l([F)V

    invoke-virtual {v1}, Lk1/a;->q()Lk1/d;

    move-result-object v2

    sget-object v3, Lcom/facebook/react/views/image/h;->T:[F

    const/4 v4, 0x0

    aget v5, v3, v4

    const/4 v6, 0x1

    aget v7, v3, v6

    const/4 v8, 0x2

    aget v8, v3, v8

    const/4 v9, 0x3

    aget v3, v3, v9

    invoke-virtual {v2, v5, v7, v8, v3}, Lk1/d;->n(FFFF)Lk1/d;

    iget-object v3, p0, Lcom/facebook/react/views/image/h;->z:Lj1/k;

    if-eqz v3, :cond_a

    iget v5, p0, Lcom/facebook/react/views/image/h;->B:I

    iget v7, p0, Lcom/facebook/react/views/image/h;->D:F

    invoke-virtual {v3, v5, v7}, Lj1/k;->b(IF)V

    iget-object v3, p0, Lcom/facebook/react/views/image/h;->z:Lj1/k;

    invoke-virtual {v2}, Lk1/d;->d()[F

    move-result-object v5

    invoke-virtual {v3, v5}, Lj1/k;->t([F)V

    iget-object v3, p0, Lcom/facebook/react/views/image/h;->z:Lj1/k;

    invoke-virtual {v1, v3}, Lk1/a;->w(Landroid/graphics/drawable/Drawable;)V

    :cond_a
    iget v3, p0, Lcom/facebook/react/views/image/h;->B:I

    iget v5, p0, Lcom/facebook/react/views/image/h;->D:F

    invoke-virtual {v2, v3, v5}, Lk1/d;->m(IF)Lk1/d;

    iget v3, p0, Lcom/facebook/react/views/image/h;->C:I

    if-eqz v3, :cond_b

    invoke-virtual {v2, v3}, Lk1/d;->p(I)Lk1/d;

    goto :goto_0

    :cond_b
    sget-object v3, Lk1/d$a;->n:Lk1/d$a;

    invoke-virtual {v2, v3}, Lk1/d;->r(Lk1/d$a;)Lk1/d;

    :goto_0
    invoke-virtual {v1, v2}, Lk1/a;->C(Lk1/d;)V

    iget v2, p0, Lcom/facebook/react/views/image/h;->P:I

    if-ltz v2, :cond_c

    goto :goto_1

    :cond_c
    iget-object v2, p0, Lcom/facebook/react/views/image/h;->v:LJ2/a;

    invoke-virtual {v2}, LJ2/a;->g()Z

    move-result v2

    if-eqz v2, :cond_d

    move v2, v4

    goto :goto_1

    :cond_d
    const/16 v2, 0x12c

    :goto_1
    invoke-virtual {v1, v2}, Lk1/a;->y(I)V

    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    iget-object v3, p0, Lcom/facebook/react/views/image/h;->L:LI1/a;

    if-eqz v3, :cond_e

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_e
    iget-object v3, p0, Lcom/facebook/react/views/image/h;->K:Lcom/facebook/react/views/image/h$b;

    if-eqz v3, :cond_f

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_f
    invoke-static {v2}, Lcom/facebook/react/views/image/e;->c(Ljava/util/List;)LJ1/d;

    move-result-object v2

    if-eqz v0, :cond_10

    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->getResizeOptions()Lx1/f;

    move-result-object v0

    goto :goto_2

    :cond_10
    const/4 v0, 0x0

    :goto_2
    iget-object v3, p0, Lcom/facebook/react/views/image/h;->v:LJ2/a;

    invoke-virtual {v3}, LJ2/a;->f()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v3}, LJ1/c;->w(Landroid/net/Uri;)LJ1/c;

    move-result-object v3

    invoke-virtual {v3, v2}, LJ1/c;->H(LJ1/d;)LJ1/c;

    move-result-object v3

    invoke-virtual {v3, v0}, LJ1/c;->L(Lx1/f;)LJ1/c;

    move-result-object v3

    invoke-virtual {v3, v6}, LJ1/c;->x(Z)LJ1/c;

    move-result-object v3

    iget-boolean v5, p0, Lcom/facebook/react/views/image/h;->Q:Z

    invoke-virtual {v3, v5}, LJ1/c;->I(Z)LJ1/c;

    move-result-object v3

    iget-object v5, p0, Lcom/facebook/react/views/image/h;->R:Lcom/facebook/react/bridge/ReadableMap;

    invoke-static {v3, v5}, Lp2/a;->z(LJ1/c;Lcom/facebook/react/bridge/ReadableMap;)Lp2/a;

    move-result-object v3

    iget-object v5, p0, Lcom/facebook/react/views/image/h;->J:Lg1/b;

    invoke-virtual {v5}, Lg1/b;->x()Lg1/b;

    iget-object v5, p0, Lcom/facebook/react/views/image/h;->J:Lg1/b;

    invoke-virtual {v5, v6}, Lg1/b;->y(Z)Lg1/b;

    move-result-object v5

    iget-object v7, p0, Lcom/facebook/react/views/image/h;->O:Ljava/lang/Object;

    invoke-virtual {v5, v7}, Lg1/b;->z(Ljava/lang/Object;)Lg1/b;

    move-result-object v5

    invoke-virtual {p0}, Ln1/c;->getController()Lm1/a;

    move-result-object v7

    invoke-virtual {v5, v7}, Lg1/b;->D(Lm1/a;)Lg1/b;

    move-result-object v5

    invoke-virtual {v5, v3}, Lg1/b;->B(Ljava/lang/Object;)Lg1/b;

    iget-object v3, p0, Lcom/facebook/react/views/image/h;->w:LJ2/a;

    if-eqz v3, :cond_11

    invoke-virtual {v3}, LJ2/a;->f()Landroid/net/Uri;

    move-result-object v3

    invoke-static {v3}, LJ1/c;->w(Landroid/net/Uri;)LJ1/c;

    move-result-object v3

    invoke-virtual {v3, v2}, LJ1/c;->H(LJ1/d;)LJ1/c;

    move-result-object v2

    invoke-virtual {v2, v0}, LJ1/c;->L(Lx1/f;)LJ1/c;

    move-result-object v0

    invoke-virtual {v0, v6}, LJ1/c;->x(Z)LJ1/c;

    move-result-object v0

    iget-boolean v2, p0, Lcom/facebook/react/views/image/h;->Q:Z

    invoke-virtual {v0, v2}, LJ1/c;->I(Z)LJ1/c;

    move-result-object v0

    invoke-virtual {v0}, LJ1/c;->a()LJ1/b;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/react/views/image/h;->J:Lg1/b;

    invoke-virtual {v2, v0}, Lg1/b;->C(Ljava/lang/Object;)Lg1/b;

    :cond_11
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->M:Lcom/facebook/react/views/image/g;

    if-eqz v0, :cond_12

    iget-object v2, p0, Lcom/facebook/react/views/image/h;->N:Lg1/d;

    if-eqz v2, :cond_12

    new-instance v0, Lg1/f;

    invoke-direct {v0}, Lg1/f;-><init>()V

    iget-object v2, p0, Lcom/facebook/react/views/image/h;->M:Lcom/facebook/react/views/image/g;

    invoke-virtual {v0, v2}, Lg1/f;->b(Lg1/d;)V

    iget-object v2, p0, Lcom/facebook/react/views/image/h;->N:Lg1/d;

    invoke-virtual {v0, v2}, Lg1/f;->b(Lg1/d;)V

    :goto_3
    iget-object v2, p0, Lcom/facebook/react/views/image/h;->J:Lg1/b;

    invoke-virtual {v2, v0}, Lg1/b;->A(Lg1/d;)Lg1/b;

    goto :goto_4

    :cond_12
    iget-object v2, p0, Lcom/facebook/react/views/image/h;->N:Lg1/d;

    if-eqz v2, :cond_13

    iget-object v0, p0, Lcom/facebook/react/views/image/h;->J:Lg1/b;

    invoke-virtual {v0, v2}, Lg1/b;->A(Lg1/d;)Lg1/b;

    goto :goto_4

    :cond_13
    if-eqz v0, :cond_14

    goto :goto_3

    :cond_14
    :goto_4
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->M:Lcom/facebook/react/views/image/g;

    if-eqz v0, :cond_15

    invoke-virtual {v1, v0}, Lk1/a;->B(Landroid/graphics/drawable/Drawable;)V

    :cond_15
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->J:Lg1/b;

    invoke-virtual {v0}, Lg1/b;->a()Lg1/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Ln1/c;->setController(Lm1/a;)V

    iput-boolean v4, p0, Lcom/facebook/react/views/image/h;->I:Z

    iget-object v0, p0, Lcom/facebook/react/views/image/h;->J:Lg1/b;

    invoke-virtual {v0}, Lg1/b;->x()Lg1/b;

    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    if-lez p1, :cond_2

    if-lez p2, :cond_2

    iget-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->m()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->n()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    invoke-virtual {p0}, Lcom/facebook/react/views/image/h;->o()V

    :cond_2
    return-void
.end method

.method public p(FI)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->F:[F

    if-nez v0, :cond_0

    const/4 v0, 0x4

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/facebook/react/views/image/h;->F:[F

    const/high16 v1, 0x7fc00000    # Float.NaN

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->F:[F

    aget v0, v0, p2

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/o;->a(FF)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/facebook/react/views/image/h;->F:[F

    aput p1, v0, p2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    :cond_1
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/image/h;->A:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcom/facebook/react/views/image/h;->A:I

    new-instance v0, Lj1/k;

    invoke-direct {v0, p1}, Lj1/k;-><init>(I)V

    iput-object v0, p0, Lcom/facebook/react/views/image/h;->z:Lj1/k;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    :cond_0
    return-void
.end method

.method public setBlurRadius(F)V
    .locals 2

    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p1

    float-to-int p1, p1

    const/4 v0, 0x2

    div-int/2addr p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/views/image/h;->L:LI1/a;

    goto :goto_0

    :cond_0
    new-instance v1, LI1/a;

    invoke-direct {v1, v0, p1}, LI1/a;-><init>(II)V

    iput-object v1, p0, Lcom/facebook/react/views/image/h;->L:LI1/a;

    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    return-void
.end method

.method public setBorderColor(I)V
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/image/h;->B:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcom/facebook/react/views/image/h;->B:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    :cond_0
    return-void
.end method

.method public setBorderRadius(F)V
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/image/h;->E:F

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/o;->a(FF)Z

    move-result v0

    if-nez v0, :cond_0

    iput p1, p0, Lcom/facebook/react/views/image/h;->E:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    :cond_0
    return-void
.end method

.method public setBorderWidth(F)V
    .locals 1

    invoke-static {p1}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p1

    iget v0, p0, Lcom/facebook/react/views/image/h;->D:F

    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/o;->a(FF)Z

    move-result v0

    if-nez v0, :cond_0

    iput p1, p0, Lcom/facebook/react/views/image/h;->D:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    :cond_0
    return-void
.end method

.method public setControllerListener(Lg1/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->N:Lg1/d;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/facebook/react/views/image/h;->o()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setDefaultSource(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, LJ2/c;->d()LJ2/c;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, LJ2/c;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-object v0, p0, Lcom/facebook/react/views/image/h;->x:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/facebook/react/views/image/h;->x:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    :cond_0
    return-void
.end method

.method public setFadeDuration(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/react/views/image/h;->P:I

    return-void
.end method

.method public setHeaders(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/views/image/h;->R:Lcom/facebook/react/bridge/ReadableMap;

    return-void
.end method

.method public setLoadingIndicatorSource(Ljava/lang/String;)V
    .locals 2

    invoke-static {}, LJ2/c;->d()LJ2/c;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, LJ2/c;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lj1/b;

    const/16 v1, 0x3e8

    invoke-direct {v0, p1, v1}, Lj1/b;-><init>(Landroid/graphics/drawable/Drawable;I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object p1, p0, Lcom/facebook/react/views/image/h;->y:Landroid/graphics/drawable/Drawable;

    invoke-static {p1, v0}, LO0/j;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iput-object v0, p0, Lcom/facebook/react/views/image/h;->y:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    :cond_1
    return-void
.end method

.method public setOverlayColor(I)V
    .locals 1

    iget v0, p0, Lcom/facebook/react/views/image/h;->C:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lcom/facebook/react/views/image/h;->C:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    :cond_0
    return-void
.end method

.method public setProgressiveRenderingEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->Q:Z

    return-void
.end method

.method public setResizeMethod(Lcom/facebook/react/views/image/c;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/image/h;->t:Lcom/facebook/react/views/image/c;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lcom/facebook/react/views/image/h;->t:Lcom/facebook/react/views/image/c;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    :cond_0
    return-void
.end method

.method public setResizeMultiplier(F)V
    .locals 2

    iget v0, p0, Lcom/facebook/react/views/image/h;->S:F

    sub-float/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x38d1b717    # 1.0E-4f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iput p1, p0, Lcom/facebook/react/views/image/h;->S:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    :cond_0
    return-void
.end method

.method public setScaleType(Lj1/p$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/image/h;->G:Lj1/p$b;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/react/views/image/h;->G:Lj1/p$b;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setShouldNotifyLoadEvents(Z)V
    .locals 2

    iget-object v0, p0, Lcom/facebook/react/views/image/h;->M:Lcom/facebook/react/views/image/g;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    if-nez p1, :cond_2

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/views/image/h;->M:Lcom/facebook/react/views/image/g;

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Lcom/facebook/react/bridge/ReactContext;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-static {p1, v0}, Lcom/facebook/react/uimanager/k0;->c(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/e;

    move-result-object p1

    new-instance v0, Lcom/facebook/react/views/image/h$a;

    invoke-direct {v0, p0, p1}, Lcom/facebook/react/views/image/h$a;-><init>(Lcom/facebook/react/views/image/h;Lcom/facebook/react/uimanager/events/e;)V

    iput-object v0, p0, Lcom/facebook/react/views/image/h;->M:Lcom/facebook/react/views/image/g;

    :goto_1
    iput-boolean v1, p0, Lcom/facebook/react/views/image/h;->I:Z

    return-void
.end method

.method public setSource(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 13

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    const/4 v1, 0x1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    const/4 v3, 0x0

    const-string v4, "uri"

    if-ne v2, v1, :cond_2

    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p1

    new-instance v2, LJ2/a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-interface {p1, v4}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v5}, LJ2/a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v3, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v2}, LJ2/a;->f()Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1, v4}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/facebook/react/views/image/h;->s(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, LJ2/a;->e(Landroid/content/Context;)LJ2/a;

    move-result-object v2

    :cond_1
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    move-result v2

    if-ge v3, v2, :cond_5

    invoke-interface {p1, v3}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v2

    new-instance v12, LJ2/a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-interface {v2, v4}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v5, "width"

    invoke-interface {v2, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v8

    const-string v5, "height"

    invoke-interface {v2, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v10

    move-object v5, v12

    invoke-direct/range {v5 .. v11}, LJ2/a;-><init>(Landroid/content/Context;Ljava/lang/String;DD)V

    sget-object v5, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    invoke-virtual {v12}, LJ2/a;->f()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2, v4}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/facebook/react/views/image/h;->s(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, LJ2/a;->e(Landroid/content/Context;)LJ2/a;

    move-result-object v12

    :cond_3
    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, LJ2/a;->e(Landroid/content/Context;)LJ2/a;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_2
    iget-object p1, p0, Lcom/facebook/react/views/image/h;->u:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    return-void

    :cond_6
    iget-object p1, p0, Lcom/facebook/react/views/image/h;->u:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ2/a;

    iget-object v2, p0, Lcom/facebook/react/views/image/h;->u:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    iput-boolean v1, p0, Lcom/facebook/react/views/image/h;->I:Z

    return-void
.end method

.method public setTileMode(Landroid/graphics/Shader$TileMode;)V
    .locals 1

    iget-object v0, p0, Lcom/facebook/react/views/image/h;->H:Landroid/graphics/Shader$TileMode;

    if-eq v0, p1, :cond_1

    iput-object p1, p0, Lcom/facebook/react/views/image/h;->H:Landroid/graphics/Shader$TileMode;

    invoke-direct {p0}, Lcom/facebook/react/views/image/h;->n()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    new-instance p1, Lcom/facebook/react/views/image/h$b;

    invoke-direct {p1, p0, v0}, Lcom/facebook/react/views/image/h$b;-><init>(Lcom/facebook/react/views/image/h;Lcom/facebook/react/views/image/i;)V

    iput-object p1, p0, Lcom/facebook/react/views/image/h;->K:Lcom/facebook/react/views/image/h$b;

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lcom/facebook/react/views/image/h;->K:Lcom/facebook/react/views/image/h$b;

    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/facebook/react/views/image/h;->I:Z

    :cond_1
    return-void
.end method
