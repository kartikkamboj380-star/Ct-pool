.class Lcom/facebook/react/modules/fresco/a;
.super Lu1/b;
.source "SourceFile"


# instance fields
.field private final e:LT5/z;

.field private final f:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(LT5/z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lu1/b;-><init>(LT5/z;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/modules/fresco/a;->e:LT5/z;

    .line 5
    .line 6
    invoke-virtual {p1}, LT5/z;->q()LT5/p;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, LT5/p;->c()Ljava/util/concurrent/ExecutorService;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/facebook/react/modules/fresco/a;->f:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    return-void
.end method

.method private n(Lcom/facebook/react/bridge/ReadableMap;)Ljava/util/Map;
    .locals 4

    .line 1
    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, Lcom/facebook/react/bridge/ReadableMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    :goto_0
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->hasNextKey()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableMapKeySetIterator;->nextKey()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public bridge synthetic d(Lcom/facebook/imagepipeline/producers/C;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 0

    .line 1
    check-cast p1, Lu1/b$b;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/modules/fresco/a;->i(Lu1/b$b;Lcom/facebook/imagepipeline/producers/X$a;)V

    return-void
.end method

.method public i(Lu1/b$b;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p1, Lu1/b$b;->f:J

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->g()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    instance-of v1, v1, Lp2/a;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Lp2/a;

    .line 32
    .line 33
    invoke-virtual {v1}, Lp2/a;->A()Lcom/facebook/react/bridge/ReadableMap;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-direct {p0, v1}, Lcom/facebook/react/modules/fresco/a;->n(Lcom/facebook/react/bridge/ReadableMap;)Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v1, 0x0

    .line 43
    :goto_0
    if-nez v1, :cond_1

    .line 44
    .line 45
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :cond_1
    new-instance v2, LT5/B$a;

    .line 50
    .line 51
    invoke-direct {v2}, LT5/B$a;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v3, LT5/d$a;

    .line 55
    .line 56
    invoke-direct {v3}, LT5/d$a;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v3}, LT5/d$a;->e()LT5/d$a;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v3}, LT5/d$a;->a()LT5/d;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v2, v3}, LT5/B$a;->c(LT5/d;)LT5/B$a;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v2, v0}, LT5/B$a;->m(Ljava/lang/String;)LT5/B$a;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v1}, LT5/t;->k(Ljava/util/Map;)LT5/t;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0, v1}, LT5/B$a;->f(LT5/t;)LT5/B$a;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, LT5/B$a;->d()LT5/B$a;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, LT5/B$a;->b()LT5/B;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p0, p1, p2, v0}, Lu1/b;->j(Lu1/b$b;Lcom/facebook/imagepipeline/producers/X$a;LT5/B;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method
