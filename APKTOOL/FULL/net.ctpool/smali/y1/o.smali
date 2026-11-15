.class public Ly1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final t:Ljava/lang/Class;

.field private static u:Ly1/o;

.field private static v:Ly1/k;

.field private static w:Z


# instance fields
.field private final a:Lcom/facebook/imagepipeline/producers/p0;

.field private final b:Ly1/m;

.field private final c:Ly1/a;

.field private d:Lw1/n;

.field private e:Lw1/u;

.field private f:Lw1/n;

.field private g:Lw1/u;

.field private h:Lw1/j;

.field private i:LJ0/n;

.field private j:LB1/c;

.field private k:LL1/d;

.field private l:Ly1/s;

.field private m:Ly1/t;

.field private n:Lw1/j;

.field private o:LJ0/n;

.field private p:Ljava/util/Map;

.field private q:LO0/g;

.field private r:Lv1/b;

.field private s:LH1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Ly1/o;

    .line 2
    .line 3
    sput-object v0, Ly1/o;->t:Ljava/lang/Class;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Ly1/m;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LK1/b;->d()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "ImagePipelineConfig()"

    .line 11
    .line 12
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {p1}, LO0/l;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ly1/m;

    .line 20
    .line 21
    iput-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 22
    .line 23
    invoke-interface {v0}, Ly1/m;->G()Ly1/n;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ly1/n;->D()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    new-instance v0, Lcom/facebook/imagepipeline/producers/B;

    .line 34
    .line 35
    invoke-interface {p1}, Ly1/m;->I()Ly1/g;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, Ly1/g;->b()Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/producers/B;-><init>(Ljava/util/concurrent/Executor;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    new-instance v0, Lcom/facebook/imagepipeline/producers/q0;

    .line 48
    .line 49
    invoke-interface {p1}, Ly1/m;->I()Ly1/g;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Ly1/g;->b()Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/producers/q0;-><init>(Ljava/util/concurrent/Executor;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    iput-object v0, p0, Ly1/o;->a:Lcom/facebook/imagepipeline/producers/p0;

    .line 61
    .line 62
    new-instance v0, Ly1/a;

    .line 63
    .line 64
    invoke-interface {p1}, Ly1/m;->f()LA1/a;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {v0, p1}, Ly1/a;-><init>(LA1/a;)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Ly1/o;->c:Ly1/a;

    .line 72
    .line 73
    invoke-static {}, LK1/b;->d()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    invoke-static {}, LK1/b;->b()V

    .line 80
    .line 81
    .line 82
    :cond_2
    return-void
.end method

.method private a()Ly1/k;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v16, Ly1/k;

    .line 4
    .line 5
    invoke-direct/range {p0 .. p0}, Ly1/o;->t()Ly1/t;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 10
    .line 11
    invoke-interface {v1}, Ly1/m;->k()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 16
    .line 17
    invoke-interface {v1}, Ly1/m;->c()Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 22
    .line 23
    invoke-interface {v1}, Ly1/m;->v()LO0/o;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual/range {p0 .. p0}, Ly1/o;->e()Lw1/u;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual/range {p0 .. p0}, Ly1/o;->j()Lw1/u;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-virtual/range {p0 .. p0}, Ly1/o;->o()Lw1/j;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-direct/range {p0 .. p0}, Ly1/o;->u()Lw1/j;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 44
    .line 45
    invoke-interface {v1}, Ly1/m;->m()Lw1/k;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    iget-object v11, v0, Ly1/o;->a:Lcom/facebook/imagepipeline/producers/p0;

    .line 50
    .line 51
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 52
    .line 53
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Ly1/n;->s()LO0/o;

    .line 58
    .line 59
    .line 60
    move-result-object v12

    .line 61
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 62
    .line 63
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ly1/n;->F()LO0/o;

    .line 68
    .line 69
    .line 70
    move-result-object v13

    .line 71
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 72
    .line 73
    invoke-interface {v1}, Ly1/m;->D()LK0/a;

    .line 74
    .line 75
    .line 76
    const/4 v14, 0x0

    .line 77
    iget-object v15, v0, Ly1/o;->b:Ly1/m;

    .line 78
    .line 79
    move-object/from16 v1, v16

    .line 80
    .line 81
    invoke-direct/range {v1 .. v15}, Ly1/k;-><init>(Ly1/t;Ljava/util/Set;Ljava/util/Set;LO0/o;Lw1/x;Lw1/x;Lw1/j;Lw1/j;Lw1/k;Lcom/facebook/imagepipeline/producers/p0;LO0/o;LO0/o;LK0/a;Ly1/m;)V

    .line 82
    .line 83
    .line 84
    return-object v16
.end method

.method private c()Lt1/a;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ly1/o;->q()Lv1/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 6
    .line 7
    invoke-interface {v1}, Ly1/m;->I()Ly1/g;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Ly1/o;->d()Lw1/n;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, Ly1/o;->b:Ly1/m;

    .line 16
    .line 17
    invoke-interface {v3}, Ly1/m;->G()Ly1/n;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Ly1/n;->i()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    iget-object v4, p0, Ly1/o;->b:Ly1/m;

    .line 26
    .line 27
    invoke-interface {v4}, Ly1/m;->G()Ly1/n;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Ly1/n;->u()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    iget-object v5, p0, Ly1/o;->b:Ly1/m;

    .line 36
    .line 37
    invoke-interface {v5}, Ly1/m;->G()Ly1/n;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v5}, Ly1/n;->c()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    iget-object v6, p0, Ly1/o;->b:Ly1/m;

    .line 46
    .line 47
    invoke-interface {v6}, Ly1/m;->w()LM0/d;

    .line 48
    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    invoke-static/range {v0 .. v6}, Lt1/b;->a(Lv1/b;Ly1/g;Lw1/n;ZZILjava/util/concurrent/ExecutorService;)Lt1/a;

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    return-object v0
.end method

.method private g()LO0/g;
    .locals 12

    .line 1
    iget-object v0, p0, Ly1/o;->q:LO0/g;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ly1/o;->h()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/util/Map$Entry;

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/String;

    .line 39
    .line 40
    new-instance v11, Lw1/j;

    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    move-object v5, v2

    .line 47
    check-cast v5, LJ0/n;

    .line 48
    .line 49
    iget-object v2, p0, Ly1/o;->b:Ly1/m;

    .line 50
    .line 51
    invoke-interface {v2}, Ly1/m;->b()LG1/F;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v4, p0, Ly1/o;->b:Ly1/m;

    .line 56
    .line 57
    invoke-interface {v4}, Ly1/m;->d()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-virtual {v2, v4}, LG1/F;->g(I)LR0/i;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    iget-object v2, p0, Ly1/o;->b:Ly1/m;

    .line 66
    .line 67
    invoke-interface {v2}, Ly1/m;->b()LG1/F;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, LG1/F;->h()LR0/l;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    iget-object v2, p0, Ly1/o;->b:Ly1/m;

    .line 76
    .line 77
    invoke-interface {v2}, Ly1/m;->I()Ly1/g;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-interface {v2}, Ly1/g;->e()Ljava/util/concurrent/Executor;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    iget-object v2, p0, Ly1/o;->b:Ly1/m;

    .line 86
    .line 87
    invoke-interface {v2}, Ly1/m;->I()Ly1/g;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-interface {v2}, Ly1/g;->d()Ljava/util/concurrent/Executor;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    iget-object v2, p0, Ly1/o;->b:Ly1/m;

    .line 96
    .line 97
    invoke-interface {v2}, Ly1/m;->t()Lw1/t;

    .line 98
    .line 99
    .line 100
    move-result-object v10

    .line 101
    move-object v4, v11

    .line 102
    invoke-direct/range {v4 .. v10}, Lw1/j;-><init>(LJ0/n;LR0/i;LR0/l;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lw1/t;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v3, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    invoke-static {v0}, LO0/g;->a(Ljava/util/Map;)LO0/g;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, Ly1/o;->q:LO0/g;

    .line 114
    .line 115
    :cond_1
    iget-object v0, p0, Ly1/o;->q:LO0/g;

    .line 116
    .line 117
    return-object v0
.end method

.method private h()Ljava/util/Map;
    .locals 5

    .line 1
    iget-object v0, p0, Ly1/o;->p:Ljava/util/Map;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ly1/o;->p:Ljava/util/Map;

    .line 11
    .line 12
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 13
    .line 14
    invoke-interface {v0}, Ly1/m;->r()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 21
    .line 22
    invoke-interface {v0}, Ly1/m;->r()Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/util/Map$Entry;

    .line 45
    .line 46
    iget-object v2, p0, Ly1/o;->p:Ljava/util/Map;

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v4, p0, Ly1/o;->b:Ly1/m;

    .line 55
    .line 56
    invoke-interface {v4}, Ly1/m;->e()Ly1/h;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, LJ0/g;

    .line 65
    .line 66
    invoke-interface {v4, v1}, Ly1/h;->a(LJ0/g;)LJ0/n;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    iget-object v0, p0, Ly1/o;->p:Ljava/util/Map;

    .line 75
    .line 76
    return-object v0
.end method

.method private k()LB1/c;
    .locals 3

    .line 1
    iget-object v0, p0, Ly1/o;->j:LB1/c;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 6
    .line 7
    invoke-interface {v0}, Ly1/m;->F()LB1/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 14
    .line 15
    invoke-interface {v0}, Ly1/m;->F()LB1/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    iput-object v0, p0, Ly1/o;->j:LB1/c;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-direct {p0}, Ly1/o;->c()Lt1/a;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 26
    .line 27
    invoke-interface {v0}, Ly1/m;->A()LB1/d;

    .line 28
    .line 29
    .line 30
    new-instance v0, LB1/b;

    .line 31
    .line 32
    invoke-virtual {p0}, Ly1/o;->r()LH1/f;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-direct {v0, v2, v2, v1}, LB1/b;-><init>(LB1/c;LB1/c;LH1/f;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    :goto_1
    iget-object v0, p0, Ly1/o;->j:LB1/c;

    .line 42
    .line 43
    return-object v0
.end method

.method private m()LL1/d;
    .locals 8

    .line 1
    iget-object v0, p0, Ly1/o;->k:LL1/d;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 6
    .line 7
    invoke-interface {v0}, Ly1/m;->y()LL1/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 14
    .line 15
    invoke-interface {v0}, Ly1/m;->x()Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 22
    .line 23
    invoke-interface {v0}, Ly1/m;->G()Ly1/n;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ly1/n;->G()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    new-instance v0, LL1/h;

    .line 34
    .line 35
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 36
    .line 37
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ly1/n;->l()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-direct {v0, v1}, LL1/h;-><init>(I)V

    .line 46
    .line 47
    .line 48
    :goto_0
    iput-object v0, p0, Ly1/o;->k:LL1/d;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    new-instance v0, LL1/f;

    .line 52
    .line 53
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 54
    .line 55
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ly1/n;->l()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 64
    .line 65
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Ly1/n;->w()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 74
    .line 75
    invoke-interface {v1}, Ly1/m;->y()LL1/d;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 80
    .line 81
    invoke-interface {v1}, Ly1/m;->x()Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 86
    .line 87
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v1}, Ly1/n;->C()Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    move-object v2, v0

    .line 96
    invoke-direct/range {v2 .. v7}, LL1/f;-><init>(IZLL1/d;Ljava/lang/Integer;Z)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    :goto_1
    iget-object v0, p0, Ly1/o;->k:LL1/d;

    .line 101
    .line 102
    return-object v0
.end method

.method public static n()Ly1/o;
    .locals 2

    .line 1
    sget-object v0, Ly1/o;->u:Ly1/o;

    .line 2
    .line 3
    const-string v1, "ImagePipelineFactory was not initialized!"

    .line 4
    .line 5
    invoke-static {v0, v1}, LO0/l;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ly1/o;

    .line 10
    .line 11
    return-object v0
.end method

.method private s()Ly1/s;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ly1/o;->l:Ly1/s;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 8
    .line 9
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ly1/n;->o()Ly1/n$d;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 18
    .line 19
    invoke-interface {v1}, Ly1/m;->a()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 24
    .line 25
    invoke-interface {v1}, Ly1/m;->b()LG1/F;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, LG1/F;->i()LR0/a;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-direct/range {p0 .. p0}, Ly1/o;->k()LB1/c;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 38
    .line 39
    invoke-interface {v1}, Ly1/m;->q()LB1/e;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 44
    .line 45
    invoke-interface {v1}, Ly1/m;->C()Ly1/e;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 50
    .line 51
    invoke-interface {v1}, Ly1/m;->n()Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 56
    .line 57
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Ly1/n;->y()Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 66
    .line 67
    invoke-interface {v1}, Ly1/m;->I()Ly1/g;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 72
    .line 73
    invoke-interface {v1}, Ly1/m;->b()LG1/F;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v11, v0, Ly1/o;->b:Ly1/m;

    .line 78
    .line 79
    invoke-interface {v11}, Ly1/m;->d()I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    invoke-virtual {v1, v11}, LG1/F;->g(I)LR0/i;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 88
    .line 89
    invoke-interface {v1}, Ly1/m;->b()LG1/F;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, LG1/F;->h()LR0/l;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    invoke-virtual/range {p0 .. p0}, Ly1/o;->e()Lw1/u;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    invoke-virtual/range {p0 .. p0}, Ly1/o;->j()Lw1/u;

    .line 102
    .line 103
    .line 104
    move-result-object v14

    .line 105
    invoke-virtual/range {p0 .. p0}, Ly1/o;->o()Lw1/j;

    .line 106
    .line 107
    .line 108
    move-result-object v15

    .line 109
    invoke-direct/range {p0 .. p0}, Ly1/o;->u()Lw1/j;

    .line 110
    .line 111
    .line 112
    move-result-object v16

    .line 113
    invoke-direct/range {p0 .. p0}, Ly1/o;->g()LO0/g;

    .line 114
    .line 115
    .line 116
    move-result-object v17

    .line 117
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 118
    .line 119
    invoke-interface {v1}, Ly1/m;->m()Lw1/k;

    .line 120
    .line 121
    .line 122
    move-result-object v18

    .line 123
    invoke-virtual/range {p0 .. p0}, Ly1/o;->q()Lv1/b;

    .line 124
    .line 125
    .line 126
    move-result-object v19

    .line 127
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 128
    .line 129
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v1}, Ly1/n;->f()I

    .line 134
    .line 135
    .line 136
    move-result v20

    .line 137
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 138
    .line 139
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1}, Ly1/n;->e()I

    .line 144
    .line 145
    .line 146
    move-result v21

    .line 147
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 148
    .line 149
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, Ly1/n;->d()Z

    .line 154
    .line 155
    .line 156
    move-result v22

    .line 157
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 158
    .line 159
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v1}, Ly1/n;->l()I

    .line 164
    .line 165
    .line 166
    move-result v23

    .line 167
    invoke-virtual/range {p0 .. p0}, Ly1/o;->f()Ly1/a;

    .line 168
    .line 169
    .line 170
    move-result-object v24

    .line 171
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 172
    .line 173
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1}, Ly1/n;->k()Z

    .line 178
    .line 179
    .line 180
    move-result v25

    .line 181
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 182
    .line 183
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-virtual {v1}, Ly1/n;->t()I

    .line 188
    .line 189
    .line 190
    move-result v26

    .line 191
    invoke-interface/range {v2 .. v26}, Ly1/n$d;->a(Landroid/content/Context;LR0/a;LB1/c;LB1/e;Ly1/e;ZZLy1/g;LR0/i;LR0/l;Lw1/x;Lw1/x;Lw1/j;Lw1/j;Ljava/util/Map;Lw1/k;Lv1/b;IIZILy1/a;ZI)Ly1/s;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    iput-object v1, v0, Ly1/o;->l:Ly1/s;

    .line 196
    .line 197
    :cond_0
    iget-object v1, v0, Ly1/o;->l:Ly1/s;

    .line 198
    .line 199
    return-object v1
.end method

.method private t()Ly1/t;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ly1/o;->b:Ly1/m;

    .line 4
    .line 5
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Ly1/n;->v()Z

    .line 10
    .line 11
    .line 12
    move-result v10

    .line 13
    iget-object v1, v0, Ly1/o;->m:Ly1/t;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v1, Ly1/t;

    .line 18
    .line 19
    iget-object v2, v0, Ly1/o;->b:Ly1/m;

    .line 20
    .line 21
    invoke-interface {v2}, Ly1/m;->a()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-direct/range {p0 .. p0}, Ly1/o;->s()Ly1/s;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v2, v0, Ly1/o;->b:Ly1/m;

    .line 38
    .line 39
    invoke-interface {v2}, Ly1/m;->h()Lcom/facebook/imagepipeline/producers/X;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    iget-object v2, v0, Ly1/o;->b:Ly1/m;

    .line 44
    .line 45
    invoke-interface {v2}, Ly1/m;->n()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    iget-object v2, v0, Ly1/o;->b:Ly1/m;

    .line 50
    .line 51
    invoke-interface {v2}, Ly1/m;->G()Ly1/n;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ly1/n;->I()Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    iget-object v8, v0, Ly1/o;->a:Lcom/facebook/imagepipeline/producers/p0;

    .line 60
    .line 61
    iget-object v2, v0, Ly1/o;->b:Ly1/m;

    .line 62
    .line 63
    invoke-interface {v2}, Ly1/m;->C()Ly1/e;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    iget-object v2, v0, Ly1/o;->b:Ly1/m;

    .line 68
    .line 69
    invoke-interface {v2}, Ly1/m;->G()Ly1/n;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Ly1/n;->H()Z

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    iget-object v2, v0, Ly1/o;->b:Ly1/m;

    .line 78
    .line 79
    invoke-interface {v2}, Ly1/m;->B()Z

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    invoke-direct/range {p0 .. p0}, Ly1/o;->m()LL1/d;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    iget-object v2, v0, Ly1/o;->b:Ly1/m;

    .line 88
    .line 89
    invoke-interface {v2}, Ly1/m;->G()Ly1/n;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v2}, Ly1/n;->B()Z

    .line 94
    .line 95
    .line 96
    move-result v14

    .line 97
    iget-object v2, v0, Ly1/o;->b:Ly1/m;

    .line 98
    .line 99
    invoke-interface {v2}, Ly1/m;->G()Ly1/n;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2}, Ly1/n;->z()Z

    .line 104
    .line 105
    .line 106
    move-result v15

    .line 107
    iget-object v2, v0, Ly1/o;->b:Ly1/m;

    .line 108
    .line 109
    invoke-interface {v2}, Ly1/m;->G()Ly1/n;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v2}, Ly1/n;->a()Z

    .line 114
    .line 115
    .line 116
    move-result v16

    .line 117
    iget-object v2, v0, Ly1/o;->b:Ly1/m;

    .line 118
    .line 119
    invoke-interface {v2}, Ly1/m;->p()Ljava/util/Set;

    .line 120
    .line 121
    .line 122
    move-result-object v17

    .line 123
    move-object v2, v1

    .line 124
    invoke-direct/range {v2 .. v17}, Ly1/t;-><init>(Landroid/content/ContentResolver;Ly1/s;Lcom/facebook/imagepipeline/producers/X;ZZLcom/facebook/imagepipeline/producers/p0;Ly1/e;ZZZLL1/d;ZZZLjava/util/Set;)V

    .line 125
    .line 126
    .line 127
    iput-object v1, v0, Ly1/o;->m:Ly1/t;

    .line 128
    .line 129
    :cond_0
    iget-object v1, v0, Ly1/o;->m:Ly1/t;

    .line 130
    .line 131
    return-object v1
.end method

.method private u()Lw1/j;
    .locals 8

    .line 1
    iget-object v0, p0, Ly1/o;->n:Lw1/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lw1/j;

    .line 6
    .line 7
    invoke-virtual {p0}, Ly1/o;->v()LJ0/n;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 12
    .line 13
    invoke-interface {v1}, Ly1/m;->b()LG1/F;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v3, p0, Ly1/o;->b:Ly1/m;

    .line 18
    .line 19
    invoke-interface {v3}, Ly1/m;->d()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v1, v3}, LG1/F;->g(I)LR0/i;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 28
    .line 29
    invoke-interface {v1}, Ly1/m;->b()LG1/F;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, LG1/F;->h()LR0/l;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 38
    .line 39
    invoke-interface {v1}, Ly1/m;->I()Ly1/g;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v1}, Ly1/g;->e()Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 48
    .line 49
    invoke-interface {v1}, Ly1/m;->I()Ly1/g;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Ly1/g;->d()Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 58
    .line 59
    invoke-interface {v1}, Ly1/m;->t()Lw1/t;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    move-object v1, v0

    .line 64
    invoke-direct/range {v1 .. v7}, Lw1/j;-><init>(LJ0/n;LR0/i;LR0/l;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lw1/t;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Ly1/o;->n:Lw1/j;

    .line 68
    .line 69
    :cond_0
    iget-object v0, p0, Ly1/o;->n:Lw1/j;

    .line 70
    .line 71
    return-object v0
.end method

.method public static declared-synchronized w(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-class v0, Ly1/o;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, LK1/b;->d()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v1, "ImagePipelineFactory#initialize"

    .line 11
    .line 12
    invoke-static {v1}, LK1/b;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    invoke-static {p0}, Ly1/l;->L(Landroid/content/Context;)Ly1/l$a;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ly1/l$a;->a()Ly1/l;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Ly1/o;->x(Ly1/m;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, LK1/b;->d()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    invoke-static {}, LK1/b;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    :cond_1
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :goto_1
    monitor-exit v0

    .line 41
    throw p0
.end method

.method public static declared-synchronized x(Ly1/m;)V
    .locals 3

    .line 1
    const-class v0, Ly1/o;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ly1/o;->u:Ly1/o;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Ly1/o;->t:Ljava/lang/Class;

    .line 9
    .line 10
    const-string v2, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior."

    .line 11
    .line 12
    invoke-static {v1, v2}, LP0/a;->C(Ljava/lang/Class;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-boolean v1, Ly1/o;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    :try_start_1
    new-instance v1, Ly1/o;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Ly1/o;-><init>(Ly1/m;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Ly1/o;->u:Ly1/o;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :goto_0
    monitor-exit v0

    .line 33
    throw p0
.end method


# virtual methods
.method public b(Landroid/content/Context;)LC1/a;
    .locals 0

    .line 1
    invoke-direct {p0}, Ly1/o;->c()Lt1/a;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return-object p1
.end method

.method public d()Lw1/n;
    .locals 8

    .line 1
    iget-object v0, p0, Ly1/o;->d:Lw1/n;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 6
    .line 7
    invoke-interface {v0}, Ly1/m;->g()Lw1/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 12
    .line 13
    invoke-interface {v0}, Ly1/m;->E()LO0/o;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 18
    .line 19
    invoke-interface {v0}, Ly1/m;->z()LR0/d;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 24
    .line 25
    invoke-interface {v0}, Ly1/m;->o()Lw1/x$a;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 30
    .line 31
    invoke-interface {v0}, Ly1/m;->G()Ly1/n;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ly1/n;->q()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 40
    .line 41
    invoke-interface {v0}, Ly1/m;->G()Ly1/n;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ly1/n;->p()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 50
    .line 51
    invoke-interface {v0}, Ly1/m;->u()Lw1/n$b;

    .line 52
    .line 53
    .line 54
    const/4 v7, 0x0

    .line 55
    invoke-interface/range {v1 .. v7}, Lw1/a;->a(LO0/o;LR0/d;Lw1/x$a;ZZLw1/n$b;)Lw1/n;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Ly1/o;->d:Lw1/n;

    .line 60
    .line 61
    :cond_0
    iget-object v0, p0, Ly1/o;->d:Lw1/n;

    .line 62
    .line 63
    return-object v0
.end method

.method public e()Lw1/u;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/o;->e:Lw1/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ly1/o;->d()Lw1/n;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 10
    .line 11
    invoke-interface {v1}, Ly1/m;->t()Lw1/t;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, Lw1/v;->a(Lw1/x;Lw1/t;)Lw1/u;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Ly1/o;->e:Lw1/u;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Ly1/o;->e:Lw1/u;

    .line 22
    .line 23
    return-object v0
.end method

.method public f()Ly1/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/o;->c:Ly1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Lw1/n;
    .locals 3

    .line 1
    iget-object v0, p0, Ly1/o;->f:Lw1/n;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 6
    .line 7
    invoke-interface {v0}, Ly1/m;->H()LO0/o;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 12
    .line 13
    invoke-interface {v1}, Ly1/m;->z()LR0/d;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Ly1/o;->b:Ly1/m;

    .line 18
    .line 19
    invoke-interface {v2}, Ly1/m;->l()Lw1/x$a;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v0, v1, v2}, Lw1/r;->a(LO0/o;LR0/d;Lw1/x$a;)Lw1/n;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Ly1/o;->f:Lw1/n;

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Ly1/o;->f:Lw1/n;

    .line 30
    .line 31
    return-object v0
.end method

.method public j()Lw1/u;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/o;->g:Lw1/u;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 6
    .line 7
    invoke-interface {v0}, Ly1/m;->i()Lw1/x;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 14
    .line 15
    invoke-interface {v0}, Ly1/m;->i()Lw1/x;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Ly1/o;->i()Lw1/n;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 25
    .line 26
    invoke-interface {v1}, Ly1/m;->t()Lw1/t;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v0, v1}, Lw1/s;->a(Lw1/x;Lw1/t;)Lw1/u;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Ly1/o;->g:Lw1/u;

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Ly1/o;->g:Lw1/u;

    .line 37
    .line 38
    return-object v0
.end method

.method public l()Ly1/k;
    .locals 1

    .line 1
    sget-object v0, Ly1/o;->v:Ly1/k;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Ly1/o;->a()Ly1/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Ly1/o;->v:Ly1/k;

    .line 10
    .line 11
    :cond_0
    sget-object v0, Ly1/o;->v:Ly1/k;

    .line 12
    .line 13
    return-object v0
.end method

.method public o()Lw1/j;
    .locals 8

    .line 1
    iget-object v0, p0, Ly1/o;->h:Lw1/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lw1/j;

    .line 6
    .line 7
    invoke-virtual {p0}, Ly1/o;->p()LJ0/n;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 12
    .line 13
    invoke-interface {v1}, Ly1/m;->b()LG1/F;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v3, p0, Ly1/o;->b:Ly1/m;

    .line 18
    .line 19
    invoke-interface {v3}, Ly1/m;->d()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {v1, v3}, LG1/F;->g(I)LR0/i;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 28
    .line 29
    invoke-interface {v1}, Ly1/m;->b()LG1/F;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, LG1/F;->h()LR0/l;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 38
    .line 39
    invoke-interface {v1}, Ly1/m;->I()Ly1/g;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-interface {v1}, Ly1/g;->e()Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 48
    .line 49
    invoke-interface {v1}, Ly1/m;->I()Ly1/g;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-interface {v1}, Ly1/g;->d()Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 58
    .line 59
    invoke-interface {v1}, Ly1/m;->t()Lw1/t;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    move-object v1, v0

    .line 64
    invoke-direct/range {v1 .. v7}, Lw1/j;-><init>(LJ0/n;LR0/i;LR0/l;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lw1/t;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Ly1/o;->h:Lw1/j;

    .line 68
    .line 69
    :cond_0
    iget-object v0, p0, Ly1/o;->h:Lw1/j;

    .line 70
    .line 71
    return-object v0
.end method

.method public p()LJ0/n;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/o;->i:LJ0/n;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 6
    .line 7
    invoke-interface {v0}, Ly1/m;->j()LJ0/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 12
    .line 13
    invoke-interface {v1}, Ly1/m;->e()Ly1/h;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1, v0}, Ly1/h;->a(LJ0/g;)LJ0/n;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Ly1/o;->i:LJ0/n;

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Ly1/o;->i:LJ0/n;

    .line 24
    .line 25
    return-object v0
.end method

.method public q()Lv1/b;
    .locals 3

    .line 1
    iget-object v0, p0, Ly1/o;->r:Lv1/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 6
    .line 7
    invoke-interface {v0}, Ly1/m;->b()LG1/F;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Ly1/o;->r()LH1/f;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0}, Ly1/o;->f()Ly1/a;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v0, v1, v2}, Lv1/c;->a(LG1/F;LH1/f;Ly1/a;)Lv1/b;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Ly1/o;->r:Lv1/b;

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Ly1/o;->r:Lv1/b;

    .line 26
    .line 27
    return-object v0
.end method

.method public r()LH1/f;
    .locals 4

    .line 1
    iget-object v0, p0, Ly1/o;->s:LH1/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 6
    .line 7
    invoke-interface {v0}, Ly1/m;->b()LG1/F;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 12
    .line 13
    invoke-interface {v1}, Ly1/m;->G()Ly1/n;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ly1/n;->E()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, Ly1/o;->b:Ly1/m;

    .line 22
    .line 23
    invoke-interface {v2}, Ly1/m;->G()Ly1/n;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ly1/n;->r()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, p0, Ly1/o;->b:Ly1/m;

    .line 32
    .line 33
    invoke-interface {v3}, Ly1/m;->G()Ly1/n;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Ly1/n;->n()LH1/h;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v0, v1, v2, v3}, LH1/g;->a(LG1/F;ZZLH1/h;)LH1/f;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, Ly1/o;->s:LH1/f;

    .line 46
    .line 47
    :cond_0
    iget-object v0, p0, Ly1/o;->s:LH1/f;

    .line 48
    .line 49
    return-object v0
.end method

.method public v()LJ0/n;
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/o;->o:LJ0/n;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ly1/o;->b:Ly1/m;

    .line 6
    .line 7
    invoke-interface {v0}, Ly1/m;->s()LJ0/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Ly1/o;->b:Ly1/m;

    .line 12
    .line 13
    invoke-interface {v1}, Ly1/m;->e()Ly1/h;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v1, v0}, Ly1/h;->a(LJ0/g;)LJ0/n;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Ly1/o;->o:LJ0/n;

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Ly1/o;->o:LJ0/n;

    .line 24
    .line 25
    return-object v0
.end method
