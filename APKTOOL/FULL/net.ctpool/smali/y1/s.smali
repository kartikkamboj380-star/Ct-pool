.class public Ly1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Landroid/content/ContentResolver;

.field protected b:Landroid/content/res/Resources;

.field protected c:Landroid/content/res/AssetManager;

.field protected final d:LR0/a;

.field protected final e:LB1/c;

.field protected final f:LB1/e;

.field protected final g:Ly1/e;

.field protected final h:Z

.field protected final i:Z

.field protected final j:Ly1/g;

.field protected final k:LR0/i;

.field protected final l:Lw1/j;

.field protected final m:Lw1/j;

.field protected final n:Lw1/x;

.field protected final o:Lw1/x;

.field protected final p:Lw1/k;

.field protected final q:Lw1/d;

.field protected final r:Lw1/d;

.field protected final s:Lv1/b;

.field protected final t:I

.field protected final u:I

.field protected v:Z

.field protected final w:Ly1/a;

.field protected final x:I

.field protected final y:Z

.field protected final z:Ljava/util/Map;


# direct methods
.method public constructor <init>(Landroid/content/Context;LR0/a;LB1/c;LB1/e;Ly1/e;ZZLy1/g;LR0/i;Lw1/x;Lw1/x;Lw1/j;Lw1/j;Ljava/util/Map;Lw1/k;Lv1/b;IIZILy1/a;ZI)V
    .locals 3

    move-object v0, p0

    move/from16 v1, p23

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    iput-object v2, v0, Ly1/s;->a:Landroid/content/ContentResolver;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iput-object v2, v0, Ly1/s;->b:Landroid/content/res/Resources;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    iput-object v2, v0, Ly1/s;->c:Landroid/content/res/AssetManager;

    move-object v2, p2

    iput-object v2, v0, Ly1/s;->d:LR0/a;

    move-object v2, p3

    iput-object v2, v0, Ly1/s;->e:LB1/c;

    move-object v2, p4

    iput-object v2, v0, Ly1/s;->f:LB1/e;

    move-object v2, p5

    iput-object v2, v0, Ly1/s;->g:Ly1/e;

    move v2, p6

    iput-boolean v2, v0, Ly1/s;->h:Z

    move v2, p7

    iput-boolean v2, v0, Ly1/s;->i:Z

    move-object v2, p8

    iput-object v2, v0, Ly1/s;->j:Ly1/g;

    move-object v2, p9

    iput-object v2, v0, Ly1/s;->k:LR0/i;

    move-object v2, p10

    iput-object v2, v0, Ly1/s;->o:Lw1/x;

    move-object v2, p11

    iput-object v2, v0, Ly1/s;->n:Lw1/x;

    move-object v2, p12

    iput-object v2, v0, Ly1/s;->l:Lw1/j;

    move-object/from16 v2, p13

    iput-object v2, v0, Ly1/s;->m:Lw1/j;

    move-object/from16 v2, p14

    iput-object v2, v0, Ly1/s;->z:Ljava/util/Map;

    move-object/from16 v2, p15

    iput-object v2, v0, Ly1/s;->p:Lw1/k;

    move-object/from16 v2, p16

    iput-object v2, v0, Ly1/s;->s:Lv1/b;

    new-instance v2, Lw1/d;

    invoke-direct {v2, v1}, Lw1/d;-><init>(I)V

    iput-object v2, v0, Ly1/s;->q:Lw1/d;

    new-instance v2, Lw1/d;

    invoke-direct {v2, v1}, Lw1/d;-><init>(I)V

    iput-object v2, v0, Ly1/s;->r:Lw1/d;

    move/from16 v1, p17

    iput v1, v0, Ly1/s;->t:I

    move/from16 v1, p18

    iput v1, v0, Ly1/s;->u:I

    move/from16 v1, p19

    iput-boolean v1, v0, Ly1/s;->v:Z

    move/from16 v1, p20

    iput v1, v0, Ly1/s;->x:I

    move-object/from16 v1, p21

    iput-object v1, v0, Ly1/s;->w:Ly1/a;

    move/from16 v1, p22

    iput-boolean v1, v0, Ly1/s;->y:Z

    return-void
.end method

.method public static a(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/imagepipeline/producers/b;-><init>(Lcom/facebook/imagepipeline/producers/d0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static h(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/m;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/m;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/m;-><init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/d0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public A(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/a0;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/a0;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->o:Lw1/x;

    .line 4
    .line 5
    iget-object v2, p0, Ly1/s;->p:Lw1/k;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/a0;-><init>(Lw1/x;Lw1/k;Lcom/facebook/imagepipeline/producers/d0;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public B(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/b0;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/b0;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->s:Lv1/b;

    .line 4
    .line 5
    iget-object v2, p0, Ly1/s;->j:Ly1/g;

    .line 6
    .line 7
    invoke-interface {v2}, Ly1/g;->c()Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-direct {v0, p1, v1, v2}, Lcom/facebook/imagepipeline/producers/b0;-><init>(Lcom/facebook/imagepipeline/producers/d0;Lv1/b;Ljava/util/concurrent/Executor;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public C()Lcom/facebook/imagepipeline/producers/i0;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/i0;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->j:Ly1/g;

    .line 4
    .line 5
    invoke-interface {v1}, Ly1/g;->e()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Ly1/s;->k:LR0/i;

    .line 10
    .line 11
    iget-object v3, p0, Ly1/s;->a:Landroid/content/ContentResolver;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/i0;-><init>(Ljava/util/concurrent/Executor;LR0/i;Landroid/content/ContentResolver;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public D(Lcom/facebook/imagepipeline/producers/d0;ZLL1/d;)Lcom/facebook/imagepipeline/producers/k0;
    .locals 7

    .line 1
    new-instance v6, Lcom/facebook/imagepipeline/producers/k0;

    .line 2
    .line 3
    iget-object v0, p0, Ly1/s;->j:Ly1/g;

    .line 4
    .line 5
    invoke-interface {v0}, Ly1/g;->c()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Ly1/s;->k:LR0/i;

    .line 10
    .line 11
    move-object v0, v6

    .line 12
    move-object v3, p1

    .line 13
    move v4, p2

    .line 14
    move-object v5, p3

    .line 15
    invoke-direct/range {v0 .. v5}, Lcom/facebook/imagepipeline/producers/k0;-><init>(Ljava/util/concurrent/Executor;LR0/i;Lcom/facebook/imagepipeline/producers/d0;ZLL1/d;)V

    .line 16
    .line 17
    .line 18
    return-object v6
.end method

.method public E(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/n0;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/n0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/facebook/imagepipeline/producers/n0;-><init>(Lcom/facebook/imagepipeline/producers/d0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public F(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/r0;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/r0;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->j:Ly1/g;

    .line 4
    .line 5
    invoke-interface {v1}, Ly1/g;->b()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x5

    .line 10
    invoke-direct {v0, v2, v1, p1}, Lcom/facebook/imagepipeline/producers/r0;-><init>(ILjava/util/concurrent/Executor;Lcom/facebook/imagepipeline/producers/d0;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public G([Lcom/facebook/imagepipeline/producers/u0;)Lcom/facebook/imagepipeline/producers/t0;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/t0;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/facebook/imagepipeline/producers/t0;-><init>([Lcom/facebook/imagepipeline/producers/u0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public b(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/p0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/o0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/o0;-><init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/p0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public c(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/g;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/g;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->o:Lw1/x;

    .line 4
    .line 5
    iget-object v2, p0, Ly1/s;->p:Lw1/k;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/g;-><init>(Lw1/x;Lw1/k;Lcom/facebook/imagepipeline/producers/d0;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public d(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/h;
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/h;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->p:Lw1/k;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lcom/facebook/imagepipeline/producers/h;-><init>(Lw1/k;Lcom/facebook/imagepipeline/producers/d0;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public e(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/i;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/i;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->o:Lw1/x;

    .line 4
    .line 5
    iget-object v2, p0, Ly1/s;->p:Lw1/k;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/i;-><init>(Lw1/x;Lw1/k;Lcom/facebook/imagepipeline/producers/d0;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public f(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/j;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/j;

    .line 2
    .line 3
    iget v1, p0, Ly1/s;->t:I

    .line 4
    .line 5
    iget v2, p0, Ly1/s;->u:I

    .line 6
    .line 7
    iget-boolean v3, p0, Ly1/s;->v:Z

    .line 8
    .line 9
    invoke-direct {v0, p1, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/j;-><init>(Lcom/facebook/imagepipeline/producers/d0;IIZ)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public g(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/k;
    .locals 9

    .line 1
    new-instance v8, Lcom/facebook/imagepipeline/producers/k;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->n:Lw1/x;

    .line 4
    .line 5
    iget-object v2, p0, Ly1/s;->l:Lw1/j;

    .line 6
    .line 7
    iget-object v3, p0, Ly1/s;->m:Lw1/j;

    .line 8
    .line 9
    iget-object v4, p0, Ly1/s;->p:Lw1/k;

    .line 10
    .line 11
    iget-object v5, p0, Ly1/s;->q:Lw1/d;

    .line 12
    .line 13
    iget-object v6, p0, Ly1/s;->r:Lw1/d;

    .line 14
    .line 15
    move-object v0, v8

    .line 16
    move-object v7, p1

    .line 17
    invoke-direct/range {v0 .. v7}, Lcom/facebook/imagepipeline/producers/k;-><init>(Lw1/x;Lw1/j;Lw1/j;Lw1/k;Lw1/d;Lw1/d;Lcom/facebook/imagepipeline/producers/d0;)V

    .line 18
    .line 19
    .line 20
    return-object v8
.end method

.method public i()Lcom/facebook/imagepipeline/producers/o;
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/o;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->k:LR0/i;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/producers/o;-><init>(LR0/i;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public j(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/p;
    .locals 14

    .line 1
    new-instance v13, Lcom/facebook/imagepipeline/producers/p;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->d:LR0/a;

    .line 4
    .line 5
    iget-object v0, p0, Ly1/s;->j:Ly1/g;

    .line 6
    .line 7
    invoke-interface {v0}, Ly1/g;->a()Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Ly1/s;->e:LB1/c;

    .line 12
    .line 13
    iget-object v4, p0, Ly1/s;->f:LB1/e;

    .line 14
    .line 15
    iget-object v5, p0, Ly1/s;->g:Ly1/e;

    .line 16
    .line 17
    iget-boolean v6, p0, Ly1/s;->h:Z

    .line 18
    .line 19
    iget-boolean v7, p0, Ly1/s;->i:Z

    .line 20
    .line 21
    iget v9, p0, Ly1/s;->x:I

    .line 22
    .line 23
    iget-object v10, p0, Ly1/s;->w:Ly1/a;

    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    sget-object v12, LO0/p;->b:LO0/o;

    .line 27
    .line 28
    move-object v0, v13

    .line 29
    move-object v8, p1

    .line 30
    invoke-direct/range {v0 .. v12}, Lcom/facebook/imagepipeline/producers/p;-><init>(LR0/a;Ljava/util/concurrent/Executor;LB1/c;LB1/e;Ly1/e;ZZLcom/facebook/imagepipeline/producers/d0;ILy1/a;Ljava/lang/Runnable;LO0/o;)V

    .line 31
    .line 32
    .line 33
    return-object v13
.end method

.method public k(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/s;
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/s;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->j:Ly1/g;

    .line 4
    .line 5
    invoke-interface {v1}, Ly1/g;->g()Ljava/util/concurrent/ScheduledExecutorService;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, p1, v1}, Lcom/facebook/imagepipeline/producers/s;-><init>(Lcom/facebook/imagepipeline/producers/d0;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public l(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/v;
    .locals 7

    .line 1
    new-instance v6, Lcom/facebook/imagepipeline/producers/v;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->l:Lw1/j;

    .line 4
    .line 5
    iget-object v2, p0, Ly1/s;->m:Lw1/j;

    .line 6
    .line 7
    iget-object v3, p0, Ly1/s;->z:Ljava/util/Map;

    .line 8
    .line 9
    iget-object v4, p0, Ly1/s;->p:Lw1/k;

    .line 10
    .line 11
    move-object v0, v6

    .line 12
    move-object v5, p1

    .line 13
    invoke-direct/range {v0 .. v5}, Lcom/facebook/imagepipeline/producers/v;-><init>(Lw1/j;Lw1/j;Ljava/util/Map;Lw1/k;Lcom/facebook/imagepipeline/producers/d0;)V

    .line 14
    .line 15
    .line 16
    return-object v6
.end method

.method public m(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/x;
    .locals 7

    .line 1
    new-instance v6, Lcom/facebook/imagepipeline/producers/x;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->l:Lw1/j;

    .line 4
    .line 5
    iget-object v2, p0, Ly1/s;->m:Lw1/j;

    .line 6
    .line 7
    iget-object v3, p0, Ly1/s;->z:Ljava/util/Map;

    .line 8
    .line 9
    iget-object v4, p0, Ly1/s;->p:Lw1/k;

    .line 10
    .line 11
    move-object v0, v6

    .line 12
    move-object v5, p1

    .line 13
    invoke-direct/range {v0 .. v5}, Lcom/facebook/imagepipeline/producers/x;-><init>(Lw1/j;Lw1/j;Ljava/util/Map;Lw1/k;Lcom/facebook/imagepipeline/producers/d0;)V

    .line 14
    .line 15
    .line 16
    return-object v6
.end method

.method public n(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/y;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/y;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->p:Lw1/k;

    .line 4
    .line 5
    iget-boolean v2, p0, Ly1/s;->y:Z

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/y;-><init>(Lw1/k;ZLcom/facebook/imagepipeline/producers/d0;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public o(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/z;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->n:Lw1/x;

    .line 4
    .line 5
    iget-object v2, p0, Ly1/s;->p:Lw1/k;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/z;-><init>(Lw1/x;Lw1/k;Lcom/facebook/imagepipeline/producers/d0;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public p(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/A;
    .locals 8

    .line 1
    new-instance v7, Lcom/facebook/imagepipeline/producers/A;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->l:Lw1/j;

    .line 4
    .line 5
    iget-object v2, p0, Ly1/s;->m:Lw1/j;

    .line 6
    .line 7
    iget-object v3, p0, Ly1/s;->p:Lw1/k;

    .line 8
    .line 9
    iget-object v4, p0, Ly1/s;->q:Lw1/d;

    .line 10
    .line 11
    iget-object v5, p0, Ly1/s;->r:Lw1/d;

    .line 12
    .line 13
    move-object v0, v7

    .line 14
    move-object v6, p1

    .line 15
    invoke-direct/range {v0 .. v6}, Lcom/facebook/imagepipeline/producers/A;-><init>(Lw1/j;Lw1/j;Lw1/k;Lw1/d;Lw1/d;Lcom/facebook/imagepipeline/producers/d0;)V

    .line 16
    .line 17
    .line 18
    return-object v7
.end method

.method public q()Lcom/facebook/imagepipeline/producers/H;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/H;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->j:Ly1/g;

    .line 4
    .line 5
    invoke-interface {v1}, Ly1/g;->e()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Ly1/s;->k:LR0/i;

    .line 10
    .line 11
    iget-object v3, p0, Ly1/s;->c:Landroid/content/res/AssetManager;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/H;-><init>(Ljava/util/concurrent/Executor;LR0/i;Landroid/content/res/AssetManager;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public r()Lcom/facebook/imagepipeline/producers/I;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/I;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->j:Ly1/g;

    .line 4
    .line 5
    invoke-interface {v1}, Ly1/g;->e()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Ly1/s;->k:LR0/i;

    .line 10
    .line 11
    iget-object v3, p0, Ly1/s;->a:Landroid/content/ContentResolver;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/I;-><init>(Ljava/util/concurrent/Executor;LR0/i;Landroid/content/ContentResolver;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public s()Lcom/facebook/imagepipeline/producers/J;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/J;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->j:Ly1/g;

    .line 4
    .line 5
    invoke-interface {v1}, Ly1/g;->e()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Ly1/s;->k:LR0/i;

    .line 10
    .line 11
    iget-object v3, p0, Ly1/s;->a:Landroid/content/ContentResolver;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/J;-><init>(Ljava/util/concurrent/Executor;LR0/i;Landroid/content/ContentResolver;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public t()Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->j:Ly1/g;

    .line 4
    .line 5
    invoke-interface {v1}, Ly1/g;->f()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Ly1/s;->k:LR0/i;

    .line 10
    .line 11
    iget-object v3, p0, Ly1/s;->a:Landroid/content/ContentResolver;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/LocalExifThumbnailProducer;-><init>(Ljava/util/concurrent/Executor;LR0/i;Landroid/content/ContentResolver;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public u()Lcom/facebook/imagepipeline/producers/M;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/M;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->j:Ly1/g;

    .line 4
    .line 5
    invoke-interface {v1}, Ly1/g;->e()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Ly1/s;->k:LR0/i;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/M;-><init>(Ljava/util/concurrent/Executor;LR0/i;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public v()Lcom/facebook/imagepipeline/producers/N;
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/N;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->j:Ly1/g;

    .line 4
    .line 5
    invoke-interface {v1}, Ly1/g;->e()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Ly1/s;->k:LR0/i;

    .line 10
    .line 11
    iget-object v3, p0, Ly1/s;->b:Landroid/content/res/Resources;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/producers/N;-><init>(Ljava/util/concurrent/Executor;LR0/i;Landroid/content/res/Resources;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public w()Lcom/facebook/imagepipeline/producers/S;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/S;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->j:Ly1/g;

    .line 4
    .line 5
    invoke-interface {v1}, Ly1/g;->c()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Ly1/s;->a:Landroid/content/ContentResolver;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/S;-><init>(Ljava/util/concurrent/Executor;Landroid/content/ContentResolver;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public x()Lcom/facebook/imagepipeline/producers/T;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/T;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->j:Ly1/g;

    .line 4
    .line 5
    invoke-interface {v1}, Ly1/g;->e()Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Ly1/s;->a:Landroid/content/ContentResolver;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/T;-><init>(Ljava/util/concurrent/Executor;Landroid/content/ContentResolver;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public y(Lcom/facebook/imagepipeline/producers/X;)Lcom/facebook/imagepipeline/producers/d0;
    .locals 3

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/W;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->k:LR0/i;

    .line 4
    .line 5
    iget-object v2, p0, Ly1/s;->d:LR0/a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lcom/facebook/imagepipeline/producers/W;-><init>(LR0/i;LR0/a;Lcom/facebook/imagepipeline/producers/X;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public z(Lcom/facebook/imagepipeline/producers/d0;)Lcom/facebook/imagepipeline/producers/Y;
    .locals 7

    .line 1
    new-instance v6, Lcom/facebook/imagepipeline/producers/Y;

    .line 2
    .line 3
    iget-object v1, p0, Ly1/s;->l:Lw1/j;

    .line 4
    .line 5
    iget-object v2, p0, Ly1/s;->p:Lw1/k;

    .line 6
    .line 7
    iget-object v3, p0, Ly1/s;->k:LR0/i;

    .line 8
    .line 9
    iget-object v4, p0, Ly1/s;->d:LR0/a;

    .line 10
    .line 11
    move-object v0, v6

    .line 12
    move-object v5, p1

    .line 13
    invoke-direct/range {v0 .. v5}, Lcom/facebook/imagepipeline/producers/Y;-><init>(Lw1/j;Lw1/k;LR0/i;LR0/a;Lcom/facebook/imagepipeline/producers/d0;)V

    .line 14
    .line 15
    .line 16
    return-object v6
.end method
