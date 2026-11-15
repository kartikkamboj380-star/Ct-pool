.class Lcom/facebook/imagepipeline/producers/A$a;
.super Lcom/facebook/imagepipeline/producers/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final c:Lcom/facebook/imagepipeline/producers/e0;

.field private final d:Lw1/j;

.field private final e:Lw1/j;

.field private final f:Lw1/k;

.field private final g:Lw1/d;

.field private final h:Lw1/d;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;Lw1/j;Lw1/j;Lw1/k;Lw1/d;Lw1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/t;-><init>(Lcom/facebook/imagepipeline/producers/n;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/A$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/A$a;->d:Lw1/j;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/A$a;->e:Lw1/j;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/A$a;->f:Lw1/k;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/facebook/imagepipeline/producers/A$a;->g:Lw1/d;

    .line 13
    .line 14
    iput-object p7, p0, Lcom/facebook/imagepipeline/producers/A$a;->h:Lw1/d;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, LD1/g;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/A$a;->q(LD1/g;I)V

    return-void
.end method

.method public q(LD1/g;I)V
    .locals 5

    .line 1
    const-string v0, "origin"

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, LK1/b;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-string v1, "EncodedProbeProducer#onNewResultImpl"

    .line 10
    .line 11
    invoke-static {v1}, LK1/b;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto/16 :goto_5

    .line 17
    .line 18
    :cond_0
    :goto_0
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->f(I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_6

    .line 23
    .line 24
    if-eqz p1, :cond_6

    .line 25
    .line 26
    const/16 v1, 0xa

    .line 27
    .line 28
    invoke-static {p2, v1}, Lcom/facebook/imagepipeline/producers/c;->m(II)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_6

    .line 33
    .line 34
    invoke-virtual {p1}, LD1/g;->n()Ls1/c;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    sget-object v2, Ls1/c;->d:Ls1/c;

    .line 39
    .line 40
    if-ne v1, v2, :cond_1

    .line 41
    .line 42
    goto :goto_4

    .line 43
    :cond_1
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/A$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 44
    .line 45
    invoke-interface {v1}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/A$a;->f:Lw1/k;

    .line 50
    .line 51
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/A$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 52
    .line 53
    invoke-interface {v3}, Lcom/facebook/imagepipeline/producers/e0;->a()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-interface {v2, v1, v3}, Lw1/k;->c(LJ1/b;Ljava/lang/Object;)LI0/d;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/A$a;->g:Lw1/d;

    .line 62
    .line 63
    invoke-virtual {v3, v2}, Lw1/d;->a(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    const-string v3, "memory_encoded"

    .line 67
    .line 68
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/A$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 69
    .line 70
    invoke-interface {v4, v0}, Lo1/a;->n(Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_3

    .line 79
    .line 80
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/A$a;->h:Lw1/d;

    .line 81
    .line 82
    invoke-virtual {v0, v2}, Lw1/d;->b(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_4

    .line 87
    .line 88
    invoke-virtual {v1}, LJ1/b;->c()LJ1/b$b;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    sget-object v1, LJ1/b$b;->m:LJ1/b$b;

    .line 93
    .line 94
    if-ne v0, v1, :cond_2

    .line 95
    .line 96
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/A$a;->e:Lw1/j;

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/A$a;->d:Lw1/j;

    .line 100
    .line 101
    :goto_1
    invoke-virtual {v0, v2}, Lw1/j;->f(LI0/d;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/A$a;->h:Lw1/d;

    .line 105
    .line 106
    :goto_2
    invoke-virtual {v0, v2}, Lw1/d;->a(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_3
    const-string v1, "disk"

    .line 111
    .line 112
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/A$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 113
    .line 114
    invoke-interface {v3, v0}, Lo1/a;->n(Ljava/lang/String;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_4

    .line 123
    .line 124
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/A$a;->h:Lw1/d;

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    :goto_3
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    .line 133
    .line 134
    invoke-static {}, LK1/b;->d()Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_5

    .line 139
    .line 140
    invoke-static {}, LK1/b;->b()V

    .line 141
    .line 142
    .line 143
    :cond_5
    return-void

    .line 144
    :cond_6
    :goto_4
    :try_start_1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 149
    .line 150
    .line 151
    invoke-static {}, LK1/b;->d()Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_7

    .line 156
    .line 157
    invoke-static {}, LK1/b;->b()V

    .line 158
    .line 159
    .line 160
    :cond_7
    return-void

    .line 161
    :goto_5
    invoke-static {}, LK1/b;->d()Z

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    if-eqz p2, :cond_8

    .line 166
    .line 167
    invoke-static {}, LK1/b;->b()V

    .line 168
    .line 169
    .line 170
    :cond_8
    throw p1
.end method
