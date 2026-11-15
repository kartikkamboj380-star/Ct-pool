.class public final Ly1/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly1/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private A:LJ0/g;

.field private B:Ly1/h;

.field private C:I

.field private final D:Ly1/n$a;

.field private E:Z

.field private F:LA1/a;

.field private G:Lw1/x;

.field private H:Lw1/x;

.field private I:Lw1/a;

.field private J:Ljava/util/Map;

.field private a:Landroid/graphics/Bitmap$Config;

.field private b:LO0/o;

.field private c:Lw1/x$a;

.field private d:Lw1/x$a;

.field private e:Lw1/k;

.field private final f:Landroid/content/Context;

.field private g:Ly1/e;

.field private h:LO0/o;

.field private i:Ly1/g;

.field private j:Lw1/t;

.field private k:LB1/c;

.field private l:LO0/o;

.field private m:LL1/d;

.field private n:Ljava/lang/Integer;

.field private o:LO0/o;

.field private p:LJ0/g;

.field private q:LR0/d;

.field private r:Ljava/lang/Integer;

.field private s:Lcom/facebook/imagepipeline/producers/X;

.field private t:Lv1/b;

.field private u:LG1/F;

.field private v:LB1/e;

.field private w:Ljava/util/Set;

.field private x:Ljava/util/Set;

.field private y:Ljava/util/Set;

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    sget-object v0, Ly1/e;->n:Ly1/e;

    .line 10
    .line 11
    iput-object v0, p0, Ly1/l$a;->g:Ly1/e;

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Ly1/l$a;->z:Z

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    iput v1, p0, Ly1/l$a;->C:I

    .line 18
    .line 19
    new-instance v1, Ly1/n$a;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Ly1/n$a;-><init>(Ly1/l$a;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Ly1/l$a;->D:Ly1/n$a;

    .line 25
    .line 26
    iput-boolean v0, p0, Ly1/l$a;->E:Z

    .line 27
    .line 28
    new-instance v0, LA1/b;

    .line 29
    .line 30
    invoke-direct {v0}, LA1/b;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Ly1/l$a;->F:LA1/a;

    .line 34
    .line 35
    iput-object p1, p0, Ly1/l$a;->f:Landroid/content/Context;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final A()LL1/d;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->m:LL1/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->n:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()LJ0/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->p:LJ0/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->r:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()LR0/d;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->q:LR0/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Lcom/facebook/imagepipeline/producers/X;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->s:Lcom/facebook/imagepipeline/producers/X;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()Lv1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->t:Lv1/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H()LG1/F;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->u:LG1/F;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I()LB1/e;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->v:LB1/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->x:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public final K()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->w:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly1/l$a;->z:Z

    .line 2
    .line 3
    return v0
.end method

.method public final M()LM0/d;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final N()LJ0/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->A:LJ0/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O()LO0/o;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->o:LO0/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P(Z)Ly1/l$a;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Ly1/e;->m:Ly1/e;

    .line 4
    .line 5
    :goto_0
    invoke-virtual {p0, p1}, Ly1/l$a;->Q(Ly1/e;)Ly1/l$a;

    .line 6
    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    sget-object p1, Ly1/e;->n:Ly1/e;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :goto_1
    return-object p0
.end method

.method public final Q(Ly1/e;)Ly1/l$a;
    .locals 1

    .line 1
    const-string v0, "downsampleMode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ly1/l$a;->g:Ly1/e;

    .line 7
    .line 8
    return-object p0
.end method

.method public final R(Lcom/facebook/imagepipeline/producers/X;)Ly1/l$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ly1/l$a;->s:Lcom/facebook/imagepipeline/producers/X;

    .line 2
    .line 3
    return-object p0
.end method

.method public final S(Ljava/util/Set;)Ly1/l$a;
    .locals 0

    .line 1
    iput-object p1, p0, Ly1/l$a;->w:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public final a()Ly1/l;
    .locals 2

    .line 1
    new-instance v0, Ly1/l;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ly1/l;-><init>(Ly1/l$a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public final b()Landroid/graphics/Bitmap$Config;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->a:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lw1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->G:Lw1/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lw1/n$b;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final e()Lw1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->I:Lw1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()LO0/o;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->b:LO0/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lw1/x$a;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->c:Lw1/x$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lw1/k;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->e:Lw1/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()LK0/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final j()LA1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->F:LA1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->f:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->y:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ly1/l$a;->E:Z

    .line 2
    .line 3
    return v0
.end method

.method public final n()Ly1/e;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->g:Ly1/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->J:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()LO0/o;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->l:LO0/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Lw1/x;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->H:Lw1/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()LO0/o;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->h:LO0/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Lw1/x$a;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->d:Lw1/x$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Ly1/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->i:Ly1/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Ly1/n$a;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->D:Ly1/n$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Ly1/h;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->B:Ly1/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()I
    .locals 1

    .line 1
    iget v0, p0, Ly1/l$a;->C:I

    .line 2
    .line 3
    return v0
.end method

.method public final x()Lw1/t;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->j:Lw1/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()LB1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/l$a;->k:LB1/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()LB1/d;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method
