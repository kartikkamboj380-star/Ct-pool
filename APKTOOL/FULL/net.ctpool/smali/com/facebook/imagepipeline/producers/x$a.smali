.class Lcom/facebook/imagepipeline/producers/x$a;
.super Lcom/facebook/imagepipeline/producers/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final c:Lcom/facebook/imagepipeline/producers/e0;

.field private final d:Lw1/j;

.field private final e:Lw1/j;

.field private final f:Ljava/util/Map;

.field private final g:Lw1/k;


# direct methods
.method private constructor <init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;Lw1/j;Lw1/j;Ljava/util/Map;Lw1/k;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/t;-><init>(Lcom/facebook/imagepipeline/producers/n;)V

    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/x$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/x$a;->d:Lw1/j;

    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/x$a;->e:Lw1/j;

    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/x$a;->f:Ljava/util/Map;

    iput-object p6, p0, Lcom/facebook/imagepipeline/producers/x$a;->g:Lw1/k;

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;Lw1/j;Lw1/j;Ljava/util/Map;Lw1/k;Lcom/facebook/imagepipeline/producers/w;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p6}, Lcom/facebook/imagepipeline/producers/x$a;-><init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;Lw1/j;Lw1/j;Ljava/util/Map;Lw1/k;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, LD1/g;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/x$a;->q(LD1/g;I)V

    return-void
.end method

.method public q(LD1/g;I)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/x$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/x$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 8
    .line 9
    const-string v2, "DiskCacheWriteProducer"

    .line 10
    .line 11
    invoke-interface {v0, v1, v2}, Lcom/facebook/imagepipeline/producers/g0;->e(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->f(I)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    const/16 v0, 0xa

    .line 24
    .line 25
    invoke-static {p2, v0}, Lcom/facebook/imagepipeline/producers/c;->m(II)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1}, LD1/g;->n()Ls1/c;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sget-object v3, Ls1/c;->d:Ls1/c;

    .line 36
    .line 37
    if-ne v0, v3, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/x$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 41
    .line 42
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/x$a;->g:Lw1/k;

    .line 47
    .line 48
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/x$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 49
    .line 50
    invoke-interface {v4}, Lcom/facebook/imagepipeline/producers/e0;->a()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-interface {v3, v0, v4}, Lw1/k;->c(LJ1/b;Ljava/lang/Object;)LI0/d;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/x$a;->e:Lw1/j;

    .line 59
    .line 60
    iget-object v5, p0, Lcom/facebook/imagepipeline/producers/x$a;->d:Lw1/j;

    .line 61
    .line 62
    iget-object v6, p0, Lcom/facebook/imagepipeline/producers/x$a;->f:Ljava/util/Map;

    .line 63
    .line 64
    invoke-static {v0, v4, v5, v6}, Lcom/facebook/imagepipeline/producers/u;->a(LJ1/b;Lw1/j;Lw1/j;Ljava/util/Map;)Lw1/j;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    if-nez v4, :cond_1

    .line 69
    .line 70
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/x$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 71
    .line 72
    invoke-interface {v3}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/x$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 77
    .line 78
    new-instance v5, Lcom/facebook/imagepipeline/producers/u$a;

    .line 79
    .line 80
    new-instance v6, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    const-string v7, "Got no disk cache for CacheChoice: "

    .line 86
    .line 87
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, LJ1/b;->c()LJ1/b$b;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-direct {v5, v0}, Lcom/facebook/imagepipeline/producers/u$a;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v3, v4, v2, v5, v1}, Lcom/facebook/imagepipeline/producers/g0;->k(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V

    .line 117
    .line 118
    .line 119
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_1
    invoke-virtual {v4, v3, p1}, Lw1/j;->p(LI0/d;LD1/g;)V

    .line 128
    .line 129
    .line 130
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/x$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 131
    .line 132
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->B()Lcom/facebook/imagepipeline/producers/g0;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/x$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 137
    .line 138
    invoke-interface {v0, v3, v2, v1}, Lcom/facebook/imagepipeline/producers/g0;->j(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Ljava/util/Map;)V

    .line 139
    .line 140
    .line 141
    goto :goto_0
.end method
