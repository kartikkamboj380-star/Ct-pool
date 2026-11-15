.class public final Lu1/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu1/b;->j(Lu1/b$b;Lcom/facebook/imagepipeline/producers/X$a;LT5/B;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lu1/b$b;

.field final synthetic b:Lu1/b;

.field final synthetic c:Lcom/facebook/imagepipeline/producers/X$a;


# direct methods
.method constructor <init>(Lu1/b$b;Lu1/b;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/b$d;->a:Lu1/b$b;

    .line 2
    .line 3
    iput-object p2, p0, Lu1/b$d;->b:Lu1/b;

    .line 4
    .line 5
    iput-object p3, p0, Lu1/b$d;->c:Lcom/facebook/imagepipeline/producers/X$a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(LT5/e;LT5/D;)V
    .locals 8

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "response"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lu1/b$d;->a:Lu1/b$b;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    iput-wide v1, v0, Lu1/b$b;->g:J

    .line 18
    .line 19
    invoke-virtual {p2}, LT5/D;->a()LT5/E;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_4

    .line 25
    .line 26
    iget-object v2, p0, Lu1/b$d;->b:Lu1/b;

    .line 27
    .line 28
    iget-object v3, p0, Lu1/b$d;->c:Lcom/facebook/imagepipeline/producers/X$a;

    .line 29
    .line 30
    iget-object v4, p0, Lu1/b$d;->a:Lu1/b$b;

    .line 31
    .line 32
    :try_start_0
    invoke-virtual {p2}, LT5/D;->z()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-nez v5, :cond_0

    .line 37
    .line 38
    new-instance v4, Ljava/io/IOException;

    .line 39
    .line 40
    new-instance v5, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v6, "Unexpected HTTP code "

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2, p1, v4, v3}, Lu1/b;->g(Lu1/b;LT5/e;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/X$a;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    goto :goto_3

    .line 66
    :catch_0
    move-exception v4

    .line 67
    goto :goto_1

    .line 68
    :cond_0
    sget-object v5, Lx1/a;->c:Lx1/a$b;

    .line 69
    .line 70
    const-string v6, "Content-Range"

    .line 71
    .line 72
    invoke-virtual {p2, v6}, LT5/D;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v5, v6}, Lx1/a$b;->c(Ljava/lang/String;)Lx1/a;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    iget v6, v5, Lx1/a;->a:I

    .line 83
    .line 84
    if-nez v6, :cond_1

    .line 85
    .line 86
    iget v6, v5, Lx1/a;->b:I

    .line 87
    .line 88
    const v7, 0x7fffffff

    .line 89
    .line 90
    .line 91
    if-eq v6, v7, :cond_2

    .line 92
    .line 93
    :cond_1
    invoke-virtual {v4, v5}, Lcom/facebook/imagepipeline/producers/C;->j(Lx1/a;)V

    .line 94
    .line 95
    .line 96
    const/16 v5, 0x8

    .line 97
    .line 98
    invoke-virtual {v4, v5}, Lcom/facebook/imagepipeline/producers/C;->i(I)V

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-virtual {v0}, LT5/E;->e()J

    .line 102
    .line 103
    .line 104
    move-result-wide v4

    .line 105
    const-wide/16 v6, 0x0

    .line 106
    .line 107
    cmp-long v4, v4, v6

    .line 108
    .line 109
    if-gez v4, :cond_3

    .line 110
    .line 111
    const/4 v4, 0x0

    .line 112
    goto :goto_0

    .line 113
    :cond_3
    invoke-virtual {v0}, LT5/E;->e()J

    .line 114
    .line 115
    .line 116
    move-result-wide v4

    .line 117
    long-to-int v4, v4

    .line 118
    :goto_0
    invoke-virtual {v0}, LT5/E;->a()Ljava/io/InputStream;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-interface {v3, v5, v4}, Lcom/facebook/imagepipeline/producers/X$a;->c(Ljava/io/InputStream;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :goto_1
    :try_start_1
    invoke-static {v2, p1, v4, v3}, Lu1/b;->g(Lu1/b;LT5/e;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/X$a;)V

    .line 127
    .line 128
    .line 129
    :goto_2
    sget-object v2, Li5/u;->a:Li5/u;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    .line 131
    invoke-static {v0, v1}, Lt5/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    sget-object v1, Li5/u;->a:Li5/u;

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :goto_3
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 138
    :catchall_1
    move-exception p2

    .line 139
    invoke-static {v0, p1}, Lt5/a;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    throw p2

    .line 143
    :cond_4
    :goto_4
    if-nez v1, :cond_5

    .line 144
    .line 145
    iget-object v0, p0, Lu1/b$d;->b:Lu1/b;

    .line 146
    .line 147
    new-instance v1, Ljava/io/IOException;

    .line 148
    .line 149
    new-instance v2, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    const-string v3, "Response body null: "

    .line 155
    .line 156
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-direct {v1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    iget-object p2, p0, Lu1/b$d;->c:Lcom/facebook/imagepipeline/producers/X$a;

    .line 170
    .line 171
    invoke-static {v0, p1, v1, p2}, Lu1/b;->g(Lu1/b;LT5/e;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/X$a;)V

    .line 172
    .line 173
    .line 174
    :cond_5
    return-void
.end method

.method public b(LT5/e;Ljava/io/IOException;)V
    .locals 2

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "e"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lu1/b$d;->b:Lu1/b;

    .line 12
    .line 13
    iget-object v1, p0, Lu1/b$d;->c:Lcom/facebook/imagepipeline/producers/X$a;

    .line 14
    .line 15
    invoke-static {v0, p1, p2, v1}, Lu1/b;->g(Lu1/b;LT5/e;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/X$a;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
