.class public final LN3/k$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN3/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:LN3/d;

.field private b:LN3/d;

.field private c:LN3/d;

.field private d:LN3/d;

.field private e:LN3/c;

.field private f:LN3/c;

.field private g:LN3/c;

.field private h:LN3/c;

.field private i:LN3/f;

.field private j:LN3/f;

.field private k:LN3/f;

.field private l:LN3/f;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LN3/h;->b()LN3/d;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->a:LN3/d;

    invoke-static {}, LN3/h;->b()LN3/d;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->b:LN3/d;

    invoke-static {}, LN3/h;->b()LN3/d;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->c:LN3/d;

    invoke-static {}, LN3/h;->b()LN3/d;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->d:LN3/d;

    new-instance v0, LN3/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN3/a;-><init>(F)V

    iput-object v0, p0, LN3/k$b;->e:LN3/c;

    new-instance v0, LN3/a;

    invoke-direct {v0, v1}, LN3/a;-><init>(F)V

    iput-object v0, p0, LN3/k$b;->f:LN3/c;

    new-instance v0, LN3/a;

    invoke-direct {v0, v1}, LN3/a;-><init>(F)V

    iput-object v0, p0, LN3/k$b;->g:LN3/c;

    new-instance v0, LN3/a;

    invoke-direct {v0, v1}, LN3/a;-><init>(F)V

    iput-object v0, p0, LN3/k$b;->h:LN3/c;

    invoke-static {}, LN3/h;->c()LN3/f;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->i:LN3/f;

    invoke-static {}, LN3/h;->c()LN3/f;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->j:LN3/f;

    invoke-static {}, LN3/h;->c()LN3/f;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->k:LN3/f;

    invoke-static {}, LN3/h;->c()LN3/f;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->l:LN3/f;

    return-void
.end method

.method public constructor <init>(LN3/k;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LN3/h;->b()LN3/d;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->a:LN3/d;

    invoke-static {}, LN3/h;->b()LN3/d;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->b:LN3/d;

    invoke-static {}, LN3/h;->b()LN3/d;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->c:LN3/d;

    invoke-static {}, LN3/h;->b()LN3/d;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->d:LN3/d;

    new-instance v0, LN3/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN3/a;-><init>(F)V

    iput-object v0, p0, LN3/k$b;->e:LN3/c;

    new-instance v0, LN3/a;

    invoke-direct {v0, v1}, LN3/a;-><init>(F)V

    iput-object v0, p0, LN3/k$b;->f:LN3/c;

    new-instance v0, LN3/a;

    invoke-direct {v0, v1}, LN3/a;-><init>(F)V

    iput-object v0, p0, LN3/k$b;->g:LN3/c;

    new-instance v0, LN3/a;

    invoke-direct {v0, v1}, LN3/a;-><init>(F)V

    iput-object v0, p0, LN3/k$b;->h:LN3/c;

    invoke-static {}, LN3/h;->c()LN3/f;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->i:LN3/f;

    invoke-static {}, LN3/h;->c()LN3/f;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->j:LN3/f;

    invoke-static {}, LN3/h;->c()LN3/f;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->k:LN3/f;

    invoke-static {}, LN3/h;->c()LN3/f;

    move-result-object v0

    iput-object v0, p0, LN3/k$b;->l:LN3/f;

    iget-object v0, p1, LN3/k;->a:LN3/d;

    iput-object v0, p0, LN3/k$b;->a:LN3/d;

    iget-object v0, p1, LN3/k;->b:LN3/d;

    iput-object v0, p0, LN3/k$b;->b:LN3/d;

    iget-object v0, p1, LN3/k;->c:LN3/d;

    iput-object v0, p0, LN3/k$b;->c:LN3/d;

    iget-object v0, p1, LN3/k;->d:LN3/d;

    iput-object v0, p0, LN3/k$b;->d:LN3/d;

    iget-object v0, p1, LN3/k;->e:LN3/c;

    iput-object v0, p0, LN3/k$b;->e:LN3/c;

    iget-object v0, p1, LN3/k;->f:LN3/c;

    iput-object v0, p0, LN3/k$b;->f:LN3/c;

    iget-object v0, p1, LN3/k;->g:LN3/c;

    iput-object v0, p0, LN3/k$b;->g:LN3/c;

    iget-object v0, p1, LN3/k;->h:LN3/c;

    iput-object v0, p0, LN3/k$b;->h:LN3/c;

    iget-object v0, p1, LN3/k;->i:LN3/f;

    iput-object v0, p0, LN3/k$b;->i:LN3/f;

    iget-object v0, p1, LN3/k;->j:LN3/f;

    iput-object v0, p0, LN3/k$b;->j:LN3/f;

    iget-object v0, p1, LN3/k;->k:LN3/f;

    iput-object v0, p0, LN3/k$b;->k:LN3/f;

    iget-object p1, p1, LN3/k;->l:LN3/f;

    iput-object p1, p0, LN3/k$b;->l:LN3/f;

    return-void
.end method

.method static synthetic a(LN3/k$b;)LN3/d;
    .locals 0

    .line 1
    iget-object p0, p0, LN3/k$b;->a:LN3/d;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(LN3/k$b;)LN3/f;
    .locals 0

    .line 1
    iget-object p0, p0, LN3/k$b;->j:LN3/f;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic c(LN3/k$b;)LN3/f;
    .locals 0

    .line 1
    iget-object p0, p0, LN3/k$b;->k:LN3/f;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic d(LN3/k$b;)LN3/f;
    .locals 0

    .line 1
    iget-object p0, p0, LN3/k$b;->l:LN3/f;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic e(LN3/k$b;)LN3/d;
    .locals 0

    .line 1
    iget-object p0, p0, LN3/k$b;->b:LN3/d;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic f(LN3/k$b;)LN3/d;
    .locals 0

    .line 1
    iget-object p0, p0, LN3/k$b;->c:LN3/d;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic g(LN3/k$b;)LN3/d;
    .locals 0

    .line 1
    iget-object p0, p0, LN3/k$b;->d:LN3/d;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic h(LN3/k$b;)LN3/c;
    .locals 0

    .line 1
    iget-object p0, p0, LN3/k$b;->e:LN3/c;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic i(LN3/k$b;)LN3/c;
    .locals 0

    .line 1
    iget-object p0, p0, LN3/k$b;->f:LN3/c;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic j(LN3/k$b;)LN3/c;
    .locals 0

    .line 1
    iget-object p0, p0, LN3/k$b;->g:LN3/c;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic k(LN3/k$b;)LN3/c;
    .locals 0

    .line 1
    iget-object p0, p0, LN3/k$b;->h:LN3/c;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic l(LN3/k$b;)LN3/f;
    .locals 0

    .line 1
    iget-object p0, p0, LN3/k$b;->i:LN3/f;

    .line 2
    .line 3
    return-object p0
.end method

.method private static n(LN3/d;)F
    .locals 1

    .line 1
    instance-of v0, p0, LN3/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LN3/j;

    .line 6
    .line 7
    iget p0, p0, LN3/j;->a:F

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    instance-of v0, p0, LN3/e;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast p0, LN3/e;

    .line 15
    .line 16
    iget p0, p0, LN3/e;->a:F

    .line 17
    .line 18
    return p0

    .line 19
    :cond_1
    const/high16 p0, -0x40800000    # -1.0f

    .line 20
    .line 21
    return p0
.end method


# virtual methods
.method public A(F)LN3/k$b;
    .locals 1

    .line 1
    new-instance v0, LN3/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LN3/a;-><init>(F)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, LN3/k$b;->e:LN3/c;

    .line 7
    .line 8
    return-object p0
.end method

.method public B(LN3/c;)LN3/k$b;
    .locals 0

    .line 1
    iput-object p1, p0, LN3/k$b;->e:LN3/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public C(ILN3/c;)LN3/k$b;
    .locals 0

    .line 1
    invoke-static {p1}, LN3/h;->a(I)LN3/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LN3/k$b;->D(LN3/d;)LN3/k$b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1, p2}, LN3/k$b;->F(LN3/c;)LN3/k$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public D(LN3/d;)LN3/k$b;
    .locals 1

    .line 1
    iput-object p1, p0, LN3/k$b;->b:LN3/d;

    .line 2
    .line 3
    invoke-static {p1}, LN3/k$b;->n(LN3/d;)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/high16 v0, -0x40800000    # -1.0f

    .line 8
    .line 9
    cmpl-float v0, p1, v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, LN3/k$b;->E(F)LN3/k$b;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object p0
.end method

.method public E(F)LN3/k$b;
    .locals 1

    .line 1
    new-instance v0, LN3/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LN3/a;-><init>(F)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, LN3/k$b;->f:LN3/c;

    .line 7
    .line 8
    return-object p0
.end method

.method public F(LN3/c;)LN3/k$b;
    .locals 0

    .line 1
    iput-object p1, p0, LN3/k$b;->f:LN3/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public m()LN3/k;
    .locals 2

    .line 1
    new-instance v0, LN3/k;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LN3/k;-><init>(LN3/k$b;LN3/k$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public o(F)LN3/k$b;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, LN3/k$b;->A(F)LN3/k$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LN3/k$b;->E(F)LN3/k$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, LN3/k$b;->w(F)LN3/k$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, LN3/k$b;->s(F)LN3/k$b;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public p(LN3/c;)LN3/k$b;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, LN3/k$b;->B(LN3/c;)LN3/k$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LN3/k$b;->F(LN3/c;)LN3/k$b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, LN3/k$b;->x(LN3/c;)LN3/k$b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, LN3/k$b;->t(LN3/c;)LN3/k$b;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public q(ILN3/c;)LN3/k$b;
    .locals 0

    .line 1
    invoke-static {p1}, LN3/h;->a(I)LN3/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LN3/k$b;->r(LN3/d;)LN3/k$b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1, p2}, LN3/k$b;->t(LN3/c;)LN3/k$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public r(LN3/d;)LN3/k$b;
    .locals 1

    .line 1
    iput-object p1, p0, LN3/k$b;->d:LN3/d;

    .line 2
    .line 3
    invoke-static {p1}, LN3/k$b;->n(LN3/d;)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/high16 v0, -0x40800000    # -1.0f

    .line 8
    .line 9
    cmpl-float v0, p1, v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, LN3/k$b;->s(F)LN3/k$b;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object p0
.end method

.method public s(F)LN3/k$b;
    .locals 1

    .line 1
    new-instance v0, LN3/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LN3/a;-><init>(F)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, LN3/k$b;->h:LN3/c;

    .line 7
    .line 8
    return-object p0
.end method

.method public t(LN3/c;)LN3/k$b;
    .locals 0

    .line 1
    iput-object p1, p0, LN3/k$b;->h:LN3/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public u(ILN3/c;)LN3/k$b;
    .locals 0

    .line 1
    invoke-static {p1}, LN3/h;->a(I)LN3/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LN3/k$b;->v(LN3/d;)LN3/k$b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1, p2}, LN3/k$b;->x(LN3/c;)LN3/k$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public v(LN3/d;)LN3/k$b;
    .locals 1

    .line 1
    iput-object p1, p0, LN3/k$b;->c:LN3/d;

    .line 2
    .line 3
    invoke-static {p1}, LN3/k$b;->n(LN3/d;)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/high16 v0, -0x40800000    # -1.0f

    .line 8
    .line 9
    cmpl-float v0, p1, v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, LN3/k$b;->w(F)LN3/k$b;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object p0
.end method

.method public w(F)LN3/k$b;
    .locals 1

    .line 1
    new-instance v0, LN3/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LN3/a;-><init>(F)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, LN3/k$b;->g:LN3/c;

    .line 7
    .line 8
    return-object p0
.end method

.method public x(LN3/c;)LN3/k$b;
    .locals 0

    .line 1
    iput-object p1, p0, LN3/k$b;->g:LN3/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public y(ILN3/c;)LN3/k$b;
    .locals 0

    .line 1
    invoke-static {p1}, LN3/h;->a(I)LN3/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LN3/k$b;->z(LN3/d;)LN3/k$b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1, p2}, LN3/k$b;->B(LN3/c;)LN3/k$b;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public z(LN3/d;)LN3/k$b;
    .locals 1

    .line 1
    iput-object p1, p0, LN3/k$b;->a:LN3/d;

    .line 2
    .line 3
    invoke-static {p1}, LN3/k$b;->n(LN3/d;)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/high16 v0, -0x40800000    # -1.0f

    .line 8
    .line 9
    cmpl-float v0, p1, v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, LN3/k$b;->A(F)LN3/k$b;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object p0
.end method
