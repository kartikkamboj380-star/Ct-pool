.class public Lk1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final t:Lj1/p$b;

.field public static final u:Lj1/p$b;


# instance fields
.field private a:Landroid/content/res/Resources;

.field private b:I

.field private c:F

.field private d:Landroid/graphics/drawable/Drawable;

.field private e:Lj1/p$b;

.field private f:Landroid/graphics/drawable/Drawable;

.field private g:Lj1/p$b;

.field private h:Landroid/graphics/drawable/Drawable;

.field private i:Lj1/p$b;

.field private j:Landroid/graphics/drawable/Drawable;

.field private k:Lj1/p$b;

.field private l:Lj1/p$b;

.field private m:Landroid/graphics/Matrix;

.field private n:Landroid/graphics/PointF;

.field private o:Landroid/graphics/ColorFilter;

.field private p:Landroid/graphics/drawable/Drawable;

.field private q:Ljava/util/List;

.field private r:Landroid/graphics/drawable/Drawable;

.field private s:Lk1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lj1/p$b;->h:Lj1/p$b;

    .line 2
    .line 3
    sput-object v0, Lk1/b;->t:Lj1/p$b;

    .line 4
    .line 5
    sget-object v0, Lj1/p$b;->i:Lj1/p$b;

    .line 6
    .line 7
    sput-object v0, Lk1/b;->u:Lj1/p$b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk1/b;->a:Landroid/content/res/Resources;

    .line 5
    .line 6
    invoke-direct {p0}, Lk1/b;->s()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private s()V
    .locals 2

    .line 1
    const/16 v0, 0x12c

    .line 2
    .line 3
    iput v0, p0, Lk1/b;->b:I

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lk1/b;->c:F

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lk1/b;->d:Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    sget-object v1, Lk1/b;->t:Lj1/p$b;

    .line 12
    .line 13
    iput-object v1, p0, Lk1/b;->e:Lj1/p$b;

    .line 14
    .line 15
    iput-object v0, p0, Lk1/b;->f:Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    iput-object v1, p0, Lk1/b;->g:Lj1/p$b;

    .line 18
    .line 19
    iput-object v0, p0, Lk1/b;->h:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    iput-object v1, p0, Lk1/b;->i:Lj1/p$b;

    .line 22
    .line 23
    iput-object v0, p0, Lk1/b;->j:Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    iput-object v1, p0, Lk1/b;->k:Lj1/p$b;

    .line 26
    .line 27
    sget-object v1, Lk1/b;->u:Lj1/p$b;

    .line 28
    .line 29
    iput-object v1, p0, Lk1/b;->l:Lj1/p$b;

    .line 30
    .line 31
    iput-object v0, p0, Lk1/b;->m:Landroid/graphics/Matrix;

    .line 32
    .line 33
    iput-object v0, p0, Lk1/b;->n:Landroid/graphics/PointF;

    .line 34
    .line 35
    iput-object v0, p0, Lk1/b;->o:Landroid/graphics/ColorFilter;

    .line 36
    .line 37
    iput-object v0, p0, Lk1/b;->p:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    iput-object v0, p0, Lk1/b;->q:Ljava/util/List;

    .line 40
    .line 41
    iput-object v0, p0, Lk1/b;->r:Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    iput-object v0, p0, Lk1/b;->s:Lk1/d;

    .line 44
    .line 45
    return-void
.end method

.method public static t(Landroid/content/res/Resources;)Lk1/b;
    .locals 1

    .line 1
    new-instance v0, Lk1/b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lk1/b;-><init>(Landroid/content/res/Resources;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private v()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk1/b;->q:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    invoke-static {v1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lk1/a;
    .locals 1

    .line 1
    invoke-direct {p0}, Lk1/b;->v()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lk1/a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lk1/a;-><init>(Lk1/b;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public b()Landroid/graphics/ColorFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->o:Landroid/graphics/ColorFilter;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Landroid/graphics/PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->n:Landroid/graphics/PointF;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Lj1/p$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->l:Lj1/p$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->p:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lk1/b;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public g()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->h:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()Lj1/p$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->i:Lj1/p$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->q:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->d:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()Lj1/p$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->e:Lj1/p$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->r:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public m()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->j:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()Lj1/p$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->k:Lj1/p$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public o()Landroid/content/res/Resources;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->a:Landroid/content/res/Resources;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->f:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public q()Lj1/p$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->g:Lj1/p$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()Lk1/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lk1/b;->s:Lk1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public u(Lk1/d;)Lk1/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lk1/b;->s:Lk1/d;

    .line 2
    .line 3
    return-object p0
.end method
