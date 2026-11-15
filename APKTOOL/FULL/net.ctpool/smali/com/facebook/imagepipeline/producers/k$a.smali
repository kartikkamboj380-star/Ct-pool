.class Lcom/facebook/imagepipeline/producers/k$a;
.super Lcom/facebook/imagepipeline/producers/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final c:Lcom/facebook/imagepipeline/producers/e0;

.field private final d:Lw1/x;

.field private final e:Lw1/j;

.field private final f:Lw1/j;

.field private final g:Lw1/k;

.field private final h:Lw1/d;

.field private final i:Lw1/d;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;Lw1/x;Lw1/j;Lw1/j;Lw1/k;Lw1/d;Lw1/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/producers/t;-><init>(Lcom/facebook/imagepipeline/producers/n;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/k$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/k$a;->d:Lw1/x;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/k$a;->e:Lw1/j;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/k$a;->f:Lw1/j;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/facebook/imagepipeline/producers/k$a;->g:Lw1/k;

    .line 13
    .line 14
    iput-object p7, p0, Lcom/facebook/imagepipeline/producers/k$a;->h:Lw1/d;

    .line 15
    .line 16
    iput-object p8, p0, Lcom/facebook/imagepipeline/producers/k$a;->i:Lw1/d;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p1, LS0/a;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/k$a;->q(LS0/a;I)V

    return-void
.end method

.method public q(LS0/a;I)V
    .locals 4

    .line 1
    :try_start_0
    invoke-static {}, LK1/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "BitmapProbeProducer#onNewResultImpl"

    .line 8
    .line 9
    invoke-static {v0}, LK1/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto/16 :goto_3

    .line 15
    .line 16
    :cond_0
    :goto_0
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->f(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_6

    .line 21
    .line 22
    if-eqz p1, :cond_6

    .line 23
    .line 24
    const/16 v0, 0x8

    .line 25
    .line 26
    invoke-static {p2, v0}, Lcom/facebook/imagepipeline/producers/c;->m(II)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 35
    .line 36
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/e0;->d()LJ1/b;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/k$a;->g:Lw1/k;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/k$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 43
    .line 44
    invoke-interface {v2}, Lcom/facebook/imagepipeline/producers/e0;->a()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v1, v0, v2}, Lw1/k;->c(LJ1/b;Ljava/lang/Object;)LI0/d;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/k$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 53
    .line 54
    const-string v3, "origin"

    .line 55
    .line 56
    invoke-interface {v2, v3}, Lo1/a;->n(Ljava/lang/String;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    const-string v3, "memory_bitmap"

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/k$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 73
    .line 74
    invoke-interface {v2}, Lcom/facebook/imagepipeline/producers/e0;->f()Ly1/m;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-interface {v2}, Ly1/m;->G()Ly1/n;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2}, Ly1/n;->B()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_2

    .line 87
    .line 88
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/k$a;->h:Lw1/d;

    .line 89
    .line 90
    invoke-virtual {v2, v1}, Lw1/d;->b(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_2

    .line 95
    .line 96
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/k$a;->d:Lw1/x;

    .line 97
    .line 98
    invoke-interface {v2, v1}, Lw1/x;->c(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/k$a;->h:Lw1/d;

    .line 102
    .line 103
    invoke-virtual {v2, v1}, Lw1/d;->a(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    :cond_2
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/k$a;->c:Lcom/facebook/imagepipeline/producers/e0;

    .line 107
    .line 108
    invoke-interface {v2}, Lcom/facebook/imagepipeline/producers/e0;->f()Ly1/m;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {v2}, Ly1/m;->G()Ly1/n;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v2}, Ly1/n;->z()Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_4

    .line 121
    .line 122
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/k$a;->i:Lw1/d;

    .line 123
    .line 124
    invoke-virtual {v2, v1}, Lw1/d;->b(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-nez v2, :cond_4

    .line 129
    .line 130
    invoke-virtual {v0}, LJ1/b;->c()LJ1/b$b;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    sget-object v2, LJ1/b$b;->m:LJ1/b$b;

    .line 135
    .line 136
    if-ne v0, v2, :cond_3

    .line 137
    .line 138
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k$a;->f:Lw1/j;

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k$a;->e:Lw1/j;

    .line 142
    .line 143
    :goto_1
    invoke-virtual {v0, v1}, Lw1/j;->f(LI0/d;)V

    .line 144
    .line 145
    .line 146
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/k$a;->i:Lw1/d;

    .line 147
    .line 148
    invoke-virtual {v0, v1}, Lw1/d;->a(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    :cond_4
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 156
    .line 157
    .line 158
    invoke-static {}, LK1/b;->d()Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_5

    .line 163
    .line 164
    invoke-static {}, LK1/b;->b()V

    .line 165
    .line 166
    .line 167
    :cond_5
    return-void

    .line 168
    :cond_6
    :goto_2
    :try_start_1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/t;->p()Lcom/facebook/imagepipeline/producers/n;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/n;->d(Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 173
    .line 174
    .line 175
    invoke-static {}, LK1/b;->d()Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-eqz p1, :cond_7

    .line 180
    .line 181
    invoke-static {}, LK1/b;->b()V

    .line 182
    .line 183
    .line 184
    :cond_7
    return-void

    .line 185
    :goto_3
    invoke-static {}, LK1/b;->d()Z

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    if-eqz p2, :cond_8

    .line 190
    .line 191
    invoke-static {}, LK1/b;->b()V

    .line 192
    .line 193
    .line 194
    :cond_8
    throw p1
.end method
