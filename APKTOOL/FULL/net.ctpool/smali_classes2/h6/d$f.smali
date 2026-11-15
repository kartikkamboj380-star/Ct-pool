.class public final Lh6/d$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT5/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh6/d;->p(LT5/z;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh6/d;

.field final synthetic b:LT5/B;


# direct methods
.method constructor <init>(Lh6/d;LT5/B;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh6/d$f;->a:Lh6/d;

    .line 2
    .line 3
    iput-object p2, p0, Lh6/d$f;->b:LT5/B;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LT5/e;LT5/D;)V
    .locals 4

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "response"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, LT5/D;->g()LY5/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :try_start_0
    iget-object v0, p0, Lh6/d$f;->a:Lh6/d;

    .line 16
    .line 17
    invoke-virtual {v0, p2, p1}, Lh6/d;->n(LT5/D;LY5/c;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lw5/k;->c(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, LY5/c;->m()Lh6/d$d;

    .line 24
    .line 25
    .line 26
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 27
    sget-object v0, Lh6/e;->g:Lh6/e$a;

    .line 28
    .line 29
    invoke-virtual {p2}, LT5/D;->w()LT5/t;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Lh6/e$a;->a(LT5/t;)Lh6/e;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, p0, Lh6/d$f;->a:Lh6/d;

    .line 38
    .line 39
    invoke-static {v1, v0}, Lh6/d;->l(Lh6/d;Lh6/e;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Lh6/d$f;->a:Lh6/d;

    .line 43
    .line 44
    invoke-static {v1, v0}, Lh6/d;->k(Lh6/d;Lh6/e;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    iget-object v0, p0, Lh6/d$f;->a:Lh6/d;

    .line 51
    .line 52
    monitor-enter v0

    .line 53
    :try_start_1
    iget-object v1, p0, Lh6/d$f;->a:Lh6/d;

    .line 54
    .line 55
    invoke-static {v1}, Lh6/d;->i(Lh6/d;)Ljava/util/ArrayDeque;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lh6/d$f;->a:Lh6/d;

    .line 63
    .line 64
    const-string v2, "unexpected Sec-WebSocket-Extensions in response header"

    .line 65
    .line 66
    const/16 v3, 0x3f2

    .line 67
    .line 68
    invoke-virtual {v1, v3, v2}, Lh6/d;->f(ILjava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    monitor-exit v0

    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    monitor-exit v0

    .line 75
    throw p1

    .line 76
    :cond_0
    :goto_0
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    sget-object v1, LU5/c;->i:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, " WebSocket "

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lh6/d$f;->b:LT5/B;

    .line 92
    .line 93
    invoke-virtual {v1}, LT5/B;->l()LT5/u;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v1}, LT5/u;->n()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iget-object v1, p0, Lh6/d$f;->a:Lh6/d;

    .line 109
    .line 110
    invoke-virtual {v1, v0, p1}, Lh6/d;->s(Ljava/lang/String;Lh6/d$d;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lh6/d$f;->a:Lh6/d;

    .line 114
    .line 115
    invoke-virtual {p1}, Lh6/d;->r()LT5/I;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iget-object v0, p0, Lh6/d$f;->a:Lh6/d;

    .line 120
    .line 121
    invoke-virtual {p1, v0, p2}, LT5/I;->f(LT5/H;LT5/D;)V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lh6/d$f;->a:Lh6/d;

    .line 125
    .line 126
    invoke-virtual {p1}, Lh6/d;->u()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :catch_0
    move-exception p1

    .line 131
    iget-object p2, p0, Lh6/d$f;->a:Lh6/d;

    .line 132
    .line 133
    const/4 v0, 0x0

    .line 134
    invoke-virtual {p2, p1, v0}, Lh6/d;->q(Ljava/lang/Exception;LT5/D;)V

    .line 135
    .line 136
    .line 137
    :goto_1
    return-void

    .line 138
    :catch_1
    move-exception v0

    .line 139
    if-eqz p1, :cond_1

    .line 140
    .line 141
    invoke-virtual {p1}, LY5/c;->u()V

    .line 142
    .line 143
    .line 144
    :cond_1
    iget-object p1, p0, Lh6/d$f;->a:Lh6/d;

    .line 145
    .line 146
    invoke-virtual {p1, v0, p2}, Lh6/d;->q(Ljava/lang/Exception;LT5/D;)V

    .line 147
    .line 148
    .line 149
    invoke-static {p2}, LU5/c;->j(Ljava/io/Closeable;)V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public b(LT5/e;Ljava/io/IOException;)V
    .locals 1

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "e"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lh6/d$f;->a:Lh6/d;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, p2, v0}, Lh6/d;->q(Ljava/lang/Exception;LT5/D;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
