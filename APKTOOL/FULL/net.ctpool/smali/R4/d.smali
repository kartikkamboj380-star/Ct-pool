.class public final LR4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR4/d$f;
    }
.end annotation


# static fields
.field static final A:LR4/c;

.field static final B:LR4/p;

.field static final C:LR4/p;

.field static final z:Ljava/lang/String;


# instance fields
.field private final a:Ljava/lang/ThreadLocal;

.field private final b:Ljava/util/concurrent/ConcurrentMap;

.field private final c:LT4/c;

.field private final d:LU4/e;

.field final e:Ljava/util/List;

.field final f:LT4/d;

.field final g:LR4/c;

.field final h:Ljava/util/Map;

.field final i:Z

.field final j:Z

.field final k:Z

.field final l:Z

.field final m:Z

.field final n:Z

.field final o:Z

.field final p:Z

.field final q:Ljava/lang/String;

.field final r:I

.field final s:I

.field final t:LR4/m;

.field final u:Ljava/util/List;

.field final v:Ljava/util/List;

.field final w:LR4/p;

.field final x:LR4/p;

.field final y:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LR4/b;->m:LR4/b;

    .line 2
    .line 3
    sput-object v0, LR4/d;->A:LR4/c;

    .line 4
    .line 5
    sget-object v0, LR4/o;->m:LR4/o;

    .line 6
    .line 7
    sput-object v0, LR4/d;->B:LR4/p;

    .line 8
    .line 9
    sget-object v0, LR4/o;->n:LR4/o;

    .line 10
    .line 11
    sput-object v0, LR4/d;->C:LR4/p;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 22

    move-object/from16 v0, p0

    .line 1
    sget-object v1, LT4/d;->s:LT4/d;

    sget-object v2, LR4/d;->A:LR4/c;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    sget-object v12, LR4/m;->m:LR4/m;

    sget-object v13, LR4/d;->z:Ljava/lang/String;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v16

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v17

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v18

    sget-object v19, LR4/d;->B:LR4/p;

    sget-object v20, LR4/d;->C:LR4/p;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v21

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v14, 0x2

    const/4 v15, 0x2

    invoke-direct/range {v0 .. v21}, LR4/d;-><init>(LT4/d;LR4/c;Ljava/util/Map;ZZZZZZZZLR4/m;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;LR4/p;LR4/p;Ljava/util/List;)V

    return-void
.end method

.method constructor <init>(LT4/d;LR4/c;Ljava/util/Map;ZZZZZZZZLR4/m;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;LR4/p;LR4/p;Ljava/util/List;)V
    .locals 13

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p3

    move/from16 v3, p5

    move/from16 v4, p10

    move/from16 v5, p11

    move-object/from16 v6, p21

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v7, Ljava/lang/ThreadLocal;

    invoke-direct {v7}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v7, v0, LR4/d;->a:Ljava/lang/ThreadLocal;

    new-instance v7, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v7}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v7, v0, LR4/d;->b:Ljava/util/concurrent/ConcurrentMap;

    iput-object v1, v0, LR4/d;->f:LT4/d;

    move-object v7, p2

    iput-object v7, v0, LR4/d;->g:LR4/c;

    iput-object v2, v0, LR4/d;->h:Ljava/util/Map;

    new-instance v8, LT4/c;

    invoke-direct {v8, v2, v5, v6}, LT4/c;-><init>(Ljava/util/Map;ZLjava/util/List;)V

    iput-object v8, v0, LR4/d;->c:LT4/c;

    move/from16 v2, p4

    iput-boolean v2, v0, LR4/d;->i:Z

    iput-boolean v3, v0, LR4/d;->j:Z

    move/from16 v2, p6

    iput-boolean v2, v0, LR4/d;->k:Z

    move/from16 v2, p7

    iput-boolean v2, v0, LR4/d;->l:Z

    move/from16 v2, p8

    iput-boolean v2, v0, LR4/d;->m:Z

    move/from16 v2, p9

    iput-boolean v2, v0, LR4/d;->n:Z

    iput-boolean v4, v0, LR4/d;->o:Z

    iput-boolean v5, v0, LR4/d;->p:Z

    move-object/from16 v2, p12

    iput-object v2, v0, LR4/d;->t:LR4/m;

    move-object/from16 v5, p13

    iput-object v5, v0, LR4/d;->q:Ljava/lang/String;

    move/from16 v5, p14

    iput v5, v0, LR4/d;->r:I

    move/from16 v5, p15

    iput v5, v0, LR4/d;->s:I

    move-object/from16 v5, p16

    iput-object v5, v0, LR4/d;->u:Ljava/util/List;

    move-object/from16 v5, p17

    iput-object v5, v0, LR4/d;->v:Ljava/util/List;

    move-object/from16 v5, p19

    iput-object v5, v0, LR4/d;->w:LR4/p;

    move-object/from16 v9, p20

    iput-object v9, v0, LR4/d;->x:LR4/p;

    iput-object v6, v0, LR4/d;->y:Ljava/util/List;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    sget-object v11, LU4/m;->W:LR4/r;

    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static/range {p19 .. p19}, LU4/i;->e(LR4/p;)LR4/r;

    move-result-object v5

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v10, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v5, p18

    invoke-interface {v10, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    sget-object v5, LU4/m;->C:LR4/r;

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, LU4/m;->m:LR4/r;

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, LU4/m;->g:LR4/r;

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, LU4/m;->i:LR4/r;

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, LU4/m;->k:LR4/r;

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static/range {p12 .. p12}, LR4/d;->n(LR4/m;)LR4/q;

    move-result-object v2

    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v11, Ljava/lang/Long;

    invoke-static {v5, v11, v2}, LU4/m;->b(Ljava/lang/Class;Ljava/lang/Class;LR4/q;)LR4/r;

    move-result-object v5

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v11, Ljava/lang/Double;

    invoke-direct {p0, v4}, LR4/d;->e(Z)LR4/q;

    move-result-object v12

    invoke-static {v5, v11, v12}, LU4/m;->b(Ljava/lang/Class;Ljava/lang/Class;LR4/q;)LR4/r;

    move-result-object v5

    invoke-interface {v10, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v11, Ljava/lang/Float;

    invoke-direct {p0, v4}, LR4/d;->f(Z)LR4/q;

    move-result-object v4

    invoke-static {v5, v11, v4}, LU4/m;->b(Ljava/lang/Class;Ljava/lang/Class;LR4/q;)LR4/r;

    move-result-object v4

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static/range {p20 .. p20}, LU4/h;->e(LR4/p;)LR4/r;

    move-result-object v4

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v4, LU4/m;->o:LR4/r;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v4, LU4/m;->q:LR4/r;

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v4, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v2}, LR4/d;->b(LR4/q;)LR4/q;

    move-result-object v5

    invoke-static {v4, v5}, LU4/m;->a(Ljava/lang/Class;LR4/q;)LR4/r;

    move-result-object v4

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v4, Ljava/util/concurrent/atomic/AtomicLongArray;

    invoke-static {v2}, LR4/d;->c(LR4/q;)LR4/q;

    move-result-object v2

    invoke-static {v4, v2}, LU4/m;->a(Ljava/lang/Class;LR4/q;)LR4/r;

    move-result-object v2

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LU4/m;->s:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LU4/m;->x:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LU4/m;->E:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LU4/m;->G:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v2, Ljava/math/BigDecimal;

    sget-object v4, LU4/m;->z:LR4/q;

    invoke-static {v2, v4}, LU4/m;->a(Ljava/lang/Class;LR4/q;)LR4/r;

    move-result-object v2

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v2, Ljava/math/BigInteger;

    sget-object v4, LU4/m;->A:LR4/q;

    invoke-static {v2, v4}, LU4/m;->a(Ljava/lang/Class;LR4/q;)LR4/r;

    move-result-object v2

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-class v2, LT4/g;

    sget-object v4, LU4/m;->B:LR4/q;

    invoke-static {v2, v4}, LU4/m;->a(Ljava/lang/Class;LR4/q;)LR4/r;

    move-result-object v2

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LU4/m;->I:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LU4/m;->K:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LU4/m;->O:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LU4/m;->Q:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LU4/m;->U:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LU4/m;->M:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LU4/m;->d:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LU4/c;->b:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LU4/m;->S:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-boolean v2, LX4/d;->a:Z

    if-eqz v2, :cond_0

    sget-object v2, LX4/d;->e:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LX4/d;->d:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LX4/d;->f:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object v2, LU4/a;->c:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, LU4/m;->b:LR4/r;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, LU4/b;

    invoke-direct {v2, v8}, LU4/b;-><init>(LT4/c;)V

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, LU4/g;

    invoke-direct {v2, v8, v3}, LU4/g;-><init>(LT4/c;Z)V

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, LU4/e;

    invoke-direct {v2, v8}, LU4/e;-><init>(LT4/c;)V

    iput-object v2, v0, LR4/d;->d:LU4/e;

    invoke-interface {v10, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v3, LU4/m;->X:LR4/r;

    invoke-interface {v10, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, LU4/j;

    move-object/from16 p3, v3

    move-object/from16 p4, v8

    move-object/from16 p5, p2

    move-object/from16 p6, p1

    move-object/from16 p7, v2

    move-object/from16 p8, p21

    invoke-direct/range {p3 .. p8}, LU4/j;-><init>(LT4/c;LR4/c;LT4/d;LU4/e;Ljava/util/List;)V

    invoke-interface {v10, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v10}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, LR4/d;->e:Ljava/util/List;

    return-void
.end method

.method private static a(Ljava/lang/Object;LY4/a;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, LY4/a;->R0()LY4/b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, LY4/b;->v:LY4/b;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    new-instance p0, LR4/l;

    .line 13
    .line 14
    const-string p1, "JSON document was not fully consumed."

    .line 15
    .line 16
    invoke-direct {p0, p1}, LR4/l;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
    :try_end_0
    .catch LY4/d; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    :catch_0
    move-exception p0

    .line 21
    goto :goto_0

    .line 22
    :catch_1
    move-exception p0

    .line 23
    goto :goto_1

    .line 24
    :goto_0
    new-instance p1, LR4/g;

    .line 25
    .line 26
    invoke-direct {p1, p0}, LR4/g;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :goto_1
    new-instance p1, LR4/l;

    .line 31
    .line 32
    invoke-direct {p1, p0}, LR4/l;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    :goto_2
    return-void
.end method

.method private static b(LR4/q;)LR4/q;
    .locals 1

    .line 1
    new-instance v0, LR4/d$d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LR4/d$d;-><init>(LR4/q;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LR4/q;->a()LR4/q;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static c(LR4/q;)LR4/q;
    .locals 1

    .line 1
    new-instance v0, LR4/d$e;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LR4/d$e;-><init>(LR4/q;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LR4/q;->a()LR4/q;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method static d(D)V
    .locals 2

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method

.method private e(Z)LR4/q;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LU4/m;->v:LR4/q;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance p1, LR4/d$a;

    .line 7
    .line 8
    invoke-direct {p1, p0}, LR4/d$a;-><init>(LR4/d;)V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method

.method private f(Z)LR4/q;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LU4/m;->u:LR4/q;

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    new-instance p1, LR4/d$b;

    .line 7
    .line 8
    invoke-direct {p1, p0}, LR4/d$b;-><init>(LR4/d;)V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method

.method private static n(LR4/m;)LR4/q;
    .locals 1

    .line 1
    sget-object v0, LR4/m;->m:LR4/m;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    sget-object p0, LU4/m;->t:LR4/q;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance p0, LR4/d$c;

    .line 9
    .line 10
    invoke-direct {p0}, LR4/d$c;-><init>()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public g(LY4/a;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, LY4/a;->z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, v1}, LY4/a;->i1(Z)V

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p1}, LY4/a;->R0()LY4/b;

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, p2}, LR4/d;->k(Lcom/google/gson/reflect/TypeToken;)LR4/q;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {p2, p1}, LR4/q;->b(LY4/a;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    invoke-virtual {p1, v0}, LY4/a;->i1(Z)V

    .line 22
    .line 23
    .line 24
    return-object p2

    .line 25
    :catchall_0
    move-exception p2

    .line 26
    goto :goto_4

    .line 27
    :catch_0
    move-exception p2

    .line 28
    goto :goto_0

    .line 29
    :catch_1
    move-exception p2

    .line 30
    goto :goto_1

    .line 31
    :catch_2
    move-exception p2

    .line 32
    goto :goto_2

    .line 33
    :catch_3
    move-exception p2

    .line 34
    goto :goto_3

    .line 35
    :goto_0
    :try_start_1
    new-instance v1, Ljava/lang/AssertionError;

    .line 36
    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v3, "AssertionError (GSON 2.10.1): "

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-direct {v1, v2, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    throw v1

    .line 62
    :goto_1
    new-instance v1, LR4/l;

    .line 63
    .line 64
    invoke-direct {v1, p2}, LR4/l;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    throw v1

    .line 68
    :goto_2
    new-instance v1, LR4/l;

    .line 69
    .line 70
    invoke-direct {v1, p2}, LR4/l;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    :goto_3
    if-eqz v1, :cond_0

    .line 75
    .line 76
    invoke-virtual {p1, v0}, LY4/a;->i1(Z)V

    .line 77
    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    return-object p1

    .line 81
    :cond_0
    :try_start_2
    new-instance v1, LR4/l;

    .line 82
    .line 83
    invoke-direct {v1, p2}, LR4/l;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    :goto_4
    invoke-virtual {p1, v0}, LY4/a;->i1(Z)V

    .line 88
    .line 89
    .line 90
    throw p2
.end method

.method public h(Ljava/io/Reader;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LR4/d;->o(Ljava/io/Reader;)LY4/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, LR4/d;->g(LY4/a;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p2, p1}, LR4/d;->a(Ljava/lang/Object;LY4/a;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public i(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance v0, Ljava/io/StringReader;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, p2}, LR4/d;->h(Ljava/io/Reader;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public j(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p1, p2}, LR4/d;->i(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public k(Lcom/google/gson/reflect/TypeToken;)LR4/q;
    .locals 6

    .line 1
    const-string v0, "type must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR4/d;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LR4/q;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    iget-object v0, p0, LR4/d;->a:Ljava/lang/ThreadLocal;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/util/Map;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    new-instance v0, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, LR4/d;->a:Ljava/lang/ThreadLocal;

    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, LR4/q;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_2
    const/4 v1, 0x0

    .line 49
    :goto_0
    :try_start_0
    new-instance v2, LR4/d$f;

    .line 50
    .line 51
    invoke-direct {v2}, LR4/d$f;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    iget-object v3, p0, LR4/d;->e:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    const/4 v4, 0x0

    .line 64
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_4

    .line 69
    .line 70
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, LR4/r;

    .line 75
    .line 76
    invoke-interface {v4, p0, p1}, LR4/r;->a(LR4/d;Lcom/google/gson/reflect/TypeToken;)LR4/q;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    if-eqz v4, :cond_3

    .line 81
    .line 82
    invoke-virtual {v2, v4}, LR4/d$f;->g(LR4/q;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v0, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_0
    move-exception p1

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    .line 92
    .line 93
    iget-object v2, p0, LR4/d;->a:Ljava/lang/ThreadLocal;

    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->remove()V

    .line 96
    .line 97
    .line 98
    :cond_5
    if-eqz v4, :cond_7

    .line 99
    .line 100
    if-eqz v1, :cond_6

    .line 101
    .line 102
    iget-object p1, p0, LR4/d;->b:Ljava/util/concurrent/ConcurrentMap;

    .line 103
    .line 104
    invoke-interface {p1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 105
    .line 106
    .line 107
    :cond_6
    return-object v4

    .line 108
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 109
    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 113
    .line 114
    .line 115
    const-string v2, "GSON (2.10.1) cannot handle "

    .line 116
    .line 117
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :goto_2
    if-eqz v1, :cond_8

    .line 132
    .line 133
    iget-object v0, p0, LR4/d;->a:Ljava/lang/ThreadLocal;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 136
    .line 137
    .line 138
    :cond_8
    throw p1
.end method

.method public l(Ljava/lang/Class;)LR4/q;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LR4/d;->k(Lcom/google/gson/reflect/TypeToken;)LR4/q;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public m(LR4/r;Lcom/google/gson/reflect/TypeToken;)LR4/q;
    .locals 3

    .line 1
    iget-object v0, p0, LR4/d;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, LR4/d;->d:LU4/e;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, LR4/d;->e:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, LR4/r;

    .line 29
    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    if-ne v2, p1, :cond_1

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-interface {v2, p0, p2}, LR4/r;->a(LR4/d;Lcom/google/gson/reflect/TypeToken;)LR4/q;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v1, "GSON cannot serialize "

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method public o(Ljava/io/Reader;)LY4/a;
    .locals 1

    .line 1
    new-instance v0, LY4/a;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LY4/a;-><init>(Ljava/io/Reader;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, LR4/d;->n:Z

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LY4/a;->i1(Z)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public p(Ljava/io/Writer;)LY4/c;
    .locals 1

    .line 1
    iget-boolean v0, p0, LR4/d;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, ")]}\'\n"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    new-instance v0, LY4/c;

    .line 11
    .line 12
    invoke-direct {v0, p1}, LY4/c;-><init>(Ljava/io/Writer;)V

    .line 13
    .line 14
    .line 15
    iget-boolean p1, p0, LR4/d;->m:Z

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const-string p1, "  "

    .line 20
    .line 21
    invoke-virtual {v0, p1}, LY4/c;->n0(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-boolean p1, p0, LR4/d;->l:Z

    .line 25
    .line 26
    invoke-virtual {v0, p1}, LY4/c;->j0(Z)V

    .line 27
    .line 28
    .line 29
    iget-boolean p1, p0, LR4/d;->n:Z

    .line 30
    .line 31
    invoke-virtual {v0, p1}, LY4/c;->B0(Z)V

    .line 32
    .line 33
    .line 34
    iget-boolean p1, p0, LR4/d;->i:Z

    .line 35
    .line 36
    invoke-virtual {v0, p1}, LY4/c;->D0(Z)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method

.method public q(LR4/f;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, LR4/d;->u(LR4/f;Ljava/lang/Appendable;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public r(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LR4/h;->m:LR4/h;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, LR4/d;->q(LR4/f;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, p1, v0}, LR4/d;->s(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public s(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, v0}, LR4/d;->w(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public t(LR4/f;LY4/c;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, LY4/c;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p2, v1}, LY4/c;->B0(Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, LY4/c;->n()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-boolean v2, p0, LR4/d;->l:Z

    .line 14
    .line 15
    invoke-virtual {p2, v2}, LY4/c;->j0(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, LY4/c;->l()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    iget-boolean v3, p0, LR4/d;->i:Z

    .line 23
    .line 24
    invoke-virtual {p2, v3}, LY4/c;->D0(Z)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    invoke-static {p1, p2}, LT4/m;->a(LR4/f;LY4/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v0}, LY4/c;->B0(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, v1}, LY4/c;->j0(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v2}, LY4/c;->D0(Z)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception p1

    .line 43
    :try_start_1
    new-instance v3, Ljava/lang/AssertionError;

    .line 44
    .line 45
    new-instance v4, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v5, "AssertionError (GSON 2.10.1): "

    .line 51
    .line 52
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-direct {v3, v4, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    throw v3

    .line 70
    :catch_1
    move-exception p1

    .line 71
    new-instance v3, LR4/g;

    .line 72
    .line 73
    invoke-direct {v3, p1}, LR4/g;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    :goto_0
    invoke-virtual {p2, v0}, LY4/c;->B0(Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v1}, LY4/c;->j0(Z)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2, v2}, LY4/c;->D0(Z)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "{serializeNulls:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-boolean v1, p0, LR4/d;->i:Z

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ",factories:"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, LR4/d;->e:Ljava/util/List;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ",instanceCreators:"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, LR4/d;->c:LT4/c;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, "}"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method

.method public u(LR4/f;Ljava/lang/Appendable;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p2}, LT4/m;->b(Ljava/lang/Appendable;)Ljava/io/Writer;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p2}, LR4/d;->p(Ljava/io/Writer;)LY4/c;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p0, p1, p2}, LR4/d;->t(LR4/f;LY4/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p1

    .line 14
    new-instance p2, LR4/g;

    .line 15
    .line 16
    invoke-direct {p2, p1}, LR4/g;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    throw p2
.end method

.method public v(Ljava/lang/Object;Ljava/lang/reflect/Type;LY4/c;)V
    .locals 5

    .line 1
    invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p2}, LR4/d;->k(Lcom/google/gson/reflect/TypeToken;)LR4/q;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p3}, LY4/c;->o()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-virtual {p3, v1}, LY4/c;->B0(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p3}, LY4/c;->n()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-boolean v2, p0, LR4/d;->l:Z

    .line 22
    .line 23
    invoke-virtual {p3, v2}, LY4/c;->j0(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p3}, LY4/c;->l()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget-boolean v3, p0, LR4/d;->i:Z

    .line 31
    .line 32
    invoke-virtual {p3, v3}, LY4/c;->D0(Z)V

    .line 33
    .line 34
    .line 35
    :try_start_0
    invoke-virtual {p2, p3, p1}, LR4/q;->d(LY4/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3, v0}, LY4/c;->B0(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p3, v1}, LY4/c;->j0(Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p3, v2}, LY4/c;->D0(Z)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception p1

    .line 51
    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    .line 52
    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v4, "AssertionError (GSON 2.10.1): "

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-direct {p2, v3, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw p2

    .line 78
    :catch_1
    move-exception p1

    .line 79
    new-instance p2, LR4/g;

    .line 80
    .line 81
    invoke-direct {p2, p1}, LR4/g;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    :goto_0
    invoke-virtual {p3, v0}, LY4/c;->B0(Z)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3, v1}, LY4/c;->j0(Z)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p3, v2}, LY4/c;->D0(Z)V

    .line 92
    .line 93
    .line 94
    throw p1
.end method

.method public w(Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Appendable;)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p3}, LT4/m;->b(Ljava/lang/Appendable;)Ljava/io/Writer;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-virtual {p0, p3}, LR4/d;->p(Ljava/io/Writer;)LY4/c;

    .line 6
    .line 7
    .line 8
    move-result-object p3

    .line 9
    invoke-virtual {p0, p1, p2, p3}, LR4/d;->v(Ljava/lang/Object;Ljava/lang/reflect/Type;LY4/c;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception p1

    .line 14
    new-instance p2, LR4/g;

    .line 15
    .line 16
    invoke-direct {p2, p1}, LR4/g;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    throw p2
.end method
